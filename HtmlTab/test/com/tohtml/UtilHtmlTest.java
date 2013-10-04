package com.tohtml;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UtilHtmlTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCasGen() {
		UtilHtml uh = new UtilHtml();
		String arg[] = {"A", "B", "C"};
		String expectedHtmlTab = "<table><tr><td>A</td></tr><tr><td>B</td></tr><tr><td>C</td></tr></table>";
		assertEquals("cas général: toHtmlTab", expectedHtmlTab, uh.toHtmlTab(arg, arg.length));
	}
	
	@Test
	public void testTabVide(){
		UtilHtml uh = new UtilHtml();
		String arg[] = {};
		String expectedHtmlTab = "(vide)";
		assertEquals("toHtmlTab : tableau vide", expectedHtmlTab, uh.toHtmlTab(arg, 10));
	}
	
	@Test
	public void testTabUnElem(){
		UtilHtml uh = new UtilHtml();
		String arg[] = {"A"};
		String expectedHtmlTab = "<table><tr><td>A</td></tr></table>";
		assertEquals("toHtmlTab : une ligne", expectedHtmlTab, uh.toHtmlTab(arg, arg.length));
	}
	
	@Test
	public void testTabNmoins1Elem(){
		UtilHtml uh = new UtilHtml();
		String arg[] = {"A", "B", "C"};
		String expectedHtmlTab = "<table><tr><td>A</td></tr><tr><td>B</td></tr><tr><td>...</td></tr></table>";
		assertEquals("toHtmlTab : cas moins 1", expectedHtmlTab, uh.toHtmlTab(arg, arg.length-1));
	}
	
	@Test
	public void testTabPlusElemBis(){
		UtilHtml uh = new UtilHtml();
		String arg[] = {"A", "B", "C"};
		String expectedHtmlTab = "<table><tr><td>A</td></tr><tr><td>...</td></tr></table>";
		assertEquals("toHtmlTab : cas médian impair", expectedHtmlTab, uh.toHtmlTab(arg, arg.length/2));
	}
	
	@Test
	public void testTabMaxElem(){
		UtilHtml uh = new UtilHtml();
		String arg[] = {"A", "B", "C"};
		String expectedHtmlTab = "<table><tr><td>...</td></tr></table>";
		assertEquals("toHtmlTab : cas maxRows = 0", expectedHtmlTab, uh.toHtmlTab(arg, 0));
	}

}
