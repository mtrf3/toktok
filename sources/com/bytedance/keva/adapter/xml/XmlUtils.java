package com.bytedance.keva.adapter.xml;

import X.C25620zW;
import X.X1D;
import android.util.Xml;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import defpackage.a1;
import defpackage.i0;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes14.dex */
public class XmlUtils {
    public static final void nextElement(XmlPullParser xmlPullParser) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                return;
            }
        } while (next != 1);
    }

    public static final int parseUnsignedIntAttribute(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        int length = charSequence2.length();
        int i = 0;
        int i2 = 16;
        if ('0' == charSequence2.charAt(0)) {
            if (length - 1 == 0) {
                return 0;
            }
            char charAt = charSequence2.charAt(1);
            if ('x' == charAt || 'X' == charAt) {
                i = 2;
            } else {
                i = 1;
                i2 = 8;
            }
        } else if ('#' == charSequence2.charAt(0)) {
            i = 1;
        } else {
            i2 = 10;
        }
        return (int) CastLongProtector.parseLong(charSequence2.substring(i), i2);
    }

    public static final ArrayList readListXml(InputStream inputStream) {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, null);
        return (ArrayList) readValueXml(newPullParser, new String[1]);
    }

    public static final HashMap readMapXml(InputStream inputStream) {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, null);
        return (HashMap) readValueXml(newPullParser, new String[1]);
    }

    public static final HashSet readSetXml(InputStream inputStream) {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, null);
        return (HashSet) readValueXml(newPullParser, new String[1]);
    }

    public static void skipCurrentTag(XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                if (next == 3 && xmlPullParser.getDepth() <= depth) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public static final void beginDocument(XmlPullParser xmlPullParser, String str) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals(str)) {
                    return;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Unexpected start tag: found ");
                LIZ.append(xmlPullParser.getName());
                LIZ.append(", expected ");
                LIZ.append(str);
                throw new XmlPullParserException(X1D.LIZIZ(LIZ));
            }
        } while (next != 1);
        throw new XmlPullParserException("No start tag found");
    }

    public static final boolean convertValueToBoolean(CharSequence charSequence, boolean z) {
        if (charSequence == null) {
            return z;
        }
        if (charSequence.equals("1") || charSequence.equals("true") || charSequence.equals("TRUE")) {
            return true;
        }
        return false;
    }

    public static final int convertValueToInt(CharSequence charSequence, int i) {
        int i2;
        int i3;
        if (charSequence == null) {
            return i;
        }
        String charSequence2 = charSequence.toString();
        int length = charSequence2.length();
        if ('-' == charSequence2.charAt(0)) {
            i2 = -1;
            i3 = 1;
        } else {
            i2 = 1;
            i3 = 0;
        }
        int i4 = 16;
        if ('0' == charSequence2.charAt(i3)) {
            if (i3 == length - 1) {
                return 0;
            }
            int i5 = i3 + 1;
            char charAt = charSequence2.charAt(i5);
            if ('x' == charAt || 'X' == charAt) {
                i3 += 2;
            } else {
                i3 = i5;
                i4 = 8;
            }
        } else if ('#' == charSequence2.charAt(i3)) {
            i3++;
        } else {
            i4 = 10;
        }
        return CastIntegerProtector.parseInt(charSequence2.substring(i3), i4) * i2;
    }

    public static final int convertValueToUnsignedInt(String str, int i) {
        if (str == null) {
            return i;
        }
        return parseUnsignedIntAttribute(str);
    }

    public static boolean nextElementWithin(XmlPullParser xmlPullParser, int i) {
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                if (next == 3) {
                    if (xmlPullParser.getDepth() == i) {
                        return false;
                    }
                } else if (next == 2 && xmlPullParser.getDepth() == i + 1) {
                    return true;
                }
            } else {
                return false;
            }
        }
    }

    public static final Object readThisValueXml(XmlPullParser xmlPullParser, String[] strArr) {
        int next;
        Object obj = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "name");
        String name = xmlPullParser.getName();
        if (!name.equals("null")) {
            if (name.equals("string")) {
                String str = "";
                while (true) {
                    int next2 = xmlPullParser.next();
                    if (next2 != 1) {
                        if (next2 == 3) {
                            if (xmlPullParser.getName().equals("string")) {
                                strArr[0] = attributeValue;
                                return str;
                            }
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Unexpected end tag in <string>: ");
                            LIZ.append(xmlPullParser.getName());
                            throw new XmlPullParserException(X1D.LIZIZ(LIZ));
                        }
                        if (next2 == 4) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(str);
                            LIZ2.append(xmlPullParser.getText());
                            str = X1D.LIZIZ(LIZ2);
                        } else if (next2 == 2) {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("Unexpected start tag in <string>: ");
                            LIZ3.append(xmlPullParser.getName());
                            throw new XmlPullParserException(X1D.LIZIZ(LIZ3));
                        }
                    } else {
                        throw new XmlPullParserException("Unexpected end of document in <string>");
                    }
                }
            } else if (name.equals("int")) {
                obj = Integer.valueOf(CastIntegerProtector.parseInt(xmlPullParser.getAttributeValue(null, "value")));
            } else if (name.equals("long")) {
                obj = CastLongProtector.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else if (name.equals("float")) {
                obj = CastFloatProtector.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else if (name.equals("double")) {
                obj = CastDoubleProtector.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else if (name.equals("boolean")) {
                obj = Boolean.valueOf(xmlPullParser.getAttributeValue(null, "value"));
            } else {
                if (name.equals("int-array")) {
                    xmlPullParser.next();
                    int[] readThisIntArrayXml = readThisIntArrayXml(xmlPullParser, "int-array", strArr);
                    strArr[0] = attributeValue;
                    return readThisIntArrayXml;
                }
                if (name.equals("map")) {
                    xmlPullParser.next();
                    HashMap readThisMapXml = readThisMapXml(xmlPullParser, "map", strArr);
                    strArr[0] = attributeValue;
                    return readThisMapXml;
                }
                if (name.equals("list")) {
                    xmlPullParser.next();
                    ArrayList readThisListXml = readThisListXml(xmlPullParser, "list", strArr);
                    strArr[0] = attributeValue;
                    return readThisListXml;
                }
                if (name.equals("set")) {
                    xmlPullParser.next();
                    HashSet readThisSetXml = readThisSetXml(xmlPullParser, "set", strArr);
                    strArr[0] = attributeValue;
                    return readThisSetXml;
                }
                throw new XmlPullParserException(i0.LJFF("Unknown tag: ", name));
            }
        }
        do {
            next = xmlPullParser.next();
            if (next != 1) {
                if (next == 3) {
                    if (xmlPullParser.getName().equals(name)) {
                        strArr[0] = attributeValue;
                        return obj;
                    }
                    StringBuilder LIZIZ = C25620zW.LIZIZ("Unexpected end tag in <", name, ">: ");
                    LIZIZ.append(xmlPullParser.getName());
                    throw new XmlPullParserException(X1D.LIZIZ(LIZIZ));
                }
                if (next == 4) {
                    StringBuilder LIZIZ2 = C25620zW.LIZIZ("Unexpected text in <", name, ">: ");
                    LIZIZ2.append(xmlPullParser.getName());
                    throw new XmlPullParserException(X1D.LIZIZ(LIZIZ2));
                }
            } else {
                throw new XmlPullParserException(a1.LJ("Unexpected end of document in <", name, ">"));
            }
        } while (next != 2);
        StringBuilder LIZIZ3 = C25620zW.LIZIZ("Unexpected start tag in <", name, ">: ");
        LIZIZ3.append(xmlPullParser.getName());
        throw new XmlPullParserException(X1D.LIZIZ(LIZIZ3));
    }

    public static final Object readValueXml(XmlPullParser xmlPullParser, String[] strArr) {
        int eventType = xmlPullParser.getEventType();
        while (eventType != 2) {
            if (eventType != 3) {
                if (eventType != 4) {
                    eventType = xmlPullParser.next();
                    if (eventType == 1) {
                        throw new XmlPullParserException("Unexpected end of document");
                    }
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Unexpected text: ");
                    LIZ.append(xmlPullParser.getText());
                    throw new XmlPullParserException(X1D.LIZIZ(LIZ));
                }
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Unexpected end tag at: ");
                LIZ2.append(xmlPullParser.getName());
                throw new XmlPullParserException(X1D.LIZIZ(LIZ2));
            }
        }
        return readThisValueXml(xmlPullParser, strArr);
    }

    public static final void writeListXml(List list, OutputStream outputStream) {
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(outputStream, "utf-8");
        newSerializer.startDocument(null, Boolean.TRUE);
        newSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        writeListXml(list, null, newSerializer);
        newSerializer.endDocument();
    }

    public static final void writeMapXml(Map map, OutputStream outputStream) {
        FastXmlSerializer fastXmlSerializer = new FastXmlSerializer();
        fastXmlSerializer.setOutput(outputStream, "utf-8");
        fastXmlSerializer.startDocument(null, Boolean.TRUE);
        fastXmlSerializer.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        writeMapXml(map, null, fastXmlSerializer);
        fastXmlSerializer.endDocument();
    }

    public static final int convertValueToList(CharSequence charSequence, String[] strArr, int i) {
        if (charSequence != null) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (charSequence.equals(strArr[i2])) {
                    return i2;
                }
            }
        }
        return i;
    }

    public static final int[] readThisIntArrayXml(XmlPullParser xmlPullParser, String str, String[] strArr) {
        try {
            int[] iArr = new int[CastIntegerProtector.parseInt(xmlPullParser.getAttributeValue(null, "num"))];
            int eventType = xmlPullParser.getEventType();
            int i = 0;
            do {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("item")) {
                        try {
                            iArr[i] = CastIntegerProtector.parseInt(xmlPullParser.getAttributeValue(null, "value"));
                        } catch (NullPointerException unused) {
                            throw new XmlPullParserException("Need value attribute in item");
                        } catch (NumberFormatException unused2) {
                            throw new XmlPullParserException("Not a number in value attribute in item");
                        }
                    } else {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Expected item tag at: ");
                        LIZ.append(xmlPullParser.getName());
                        throw new XmlPullParserException(X1D.LIZIZ(LIZ));
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return iArr;
                    }
                    if (xmlPullParser.getName().equals("item")) {
                        i++;
                    } else {
                        StringBuilder LIZIZ = C25620zW.LIZIZ("Expected ", str, " end tag at: ");
                        LIZIZ.append(xmlPullParser.getName());
                        throw new XmlPullParserException(X1D.LIZIZ(LIZIZ));
                    }
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException(a1.LJ("Document ended before ", str, " end tag"));
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in byte-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in byte-array");
        }
    }

    public static final ArrayList readThisListXml(XmlPullParser xmlPullParser, String str, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                arrayList.add(readThisValueXml(xmlPullParser, strArr));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return arrayList;
                }
                StringBuilder LIZIZ = C25620zW.LIZIZ("Expected ", str, " end tag at: ");
                LIZIZ.append(xmlPullParser.getName());
                throw new XmlPullParserException(X1D.LIZIZ(LIZIZ));
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException(a1.LJ("Document ended before ", str, " end tag"));
    }

    public static final HashMap readThisMapXml(XmlPullParser xmlPullParser, String str, String[] strArr) {
        HashMap hashMap = new HashMap();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                Object readThisValueXml = readThisValueXml(xmlPullParser, strArr);
                String str2 = strArr[0];
                if (str2 != null) {
                    hashMap.put(str2, readThisValueXml);
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Map value without name attribute: ");
                    LIZ.append(xmlPullParser.getName());
                    throw new XmlPullParserException(X1D.LIZIZ(LIZ));
                }
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return hashMap;
                }
                StringBuilder LIZIZ = C25620zW.LIZIZ("Expected ", str, " end tag at: ");
                LIZIZ.append(xmlPullParser.getName());
                throw new XmlPullParserException(X1D.LIZIZ(LIZIZ));
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException(a1.LJ("Document ended before ", str, " end tag"));
    }

    public static final HashSet readThisSetXml(XmlPullParser xmlPullParser, String str, String[] strArr) {
        HashSet hashSet = new HashSet();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                hashSet.add(readThisValueXml(xmlPullParser, strArr));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return hashSet;
                }
                StringBuilder LIZIZ = C25620zW.LIZIZ("Expected ", str, " end tag at: ");
                LIZIZ.append(xmlPullParser.getName());
                throw new XmlPullParserException(X1D.LIZIZ(LIZIZ));
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException(a1.LJ("Document ended before ", str, " end tag"));
    }

    public static final void writeByteArrayXml(byte[] bArr, String str, XmlSerializer xmlSerializer) {
        int i;
        int i2;
        if (bArr == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
            return;
        }
        xmlSerializer.startTag(null, "byte-array");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        xmlSerializer.attribute(null, "num", Integer.toString(bArr.length));
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i3 = b >> 4;
            if (i3 >= 10) {
                i = (i3 + 97) - 10;
            } else {
                i = i3 + 48;
            }
            sb.append(i);
            int i4 = b & 255;
            if (i4 >= 10) {
                i2 = (i4 + 97) - 10;
            } else {
                i2 = i4 + 48;
            }
            sb.append(i2);
        }
        xmlSerializer.text(sb.toString());
        xmlSerializer.endTag(null, "byte-array");
    }

    public static final void writeIntArrayXml(int[] iArr, String str, XmlSerializer xmlSerializer) {
        if (iArr == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
            return;
        }
        xmlSerializer.startTag(null, "int-array");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        xmlSerializer.attribute(null, "num", Integer.toString(iArr.length));
        for (int i : iArr) {
            xmlSerializer.startTag(null, "item");
            xmlSerializer.attribute(null, "value", Integer.toString(i));
            xmlSerializer.endTag(null, "item");
        }
        xmlSerializer.endTag(null, "int-array");
    }

    public static final void writeListXml(List list, String str, XmlSerializer xmlSerializer) {
        if (list == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
            return;
        }
        xmlSerializer.startTag(null, "list");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            writeValueXml(ListProtector.get(list, i), null, xmlSerializer);
        }
        xmlSerializer.endTag(null, "list");
    }

    public static final void writeMapXml(Map map, String str, XmlSerializer xmlSerializer) {
        if (map == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
            return;
        }
        xmlSerializer.startTag(null, "map");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        for (Map.Entry entry : map.entrySet()) {
            writeValueXml(entry.getValue(), (String) entry.getKey(), xmlSerializer);
        }
        xmlSerializer.endTag(null, "map");
    }

    public static final void writeSetXml(Set set, String str, XmlSerializer xmlSerializer) {
        if (set == null) {
            xmlSerializer.startTag(null, "null");
            xmlSerializer.endTag(null, "null");
            return;
        }
        xmlSerializer.startTag(null, "set");
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            writeValueXml(it.next(), null, xmlSerializer);
        }
        xmlSerializer.endTag(null, "set");
    }

    public static final void writeValueXml(Object obj, String str, XmlSerializer xmlSerializer) {
        String str2;
        if (obj == null) {
            xmlSerializer.startTag(null, "null");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.endTag(null, "null");
            return;
        }
        if (obj instanceof String) {
            xmlSerializer.startTag(null, "string");
            if (str != null) {
                xmlSerializer.attribute(null, "name", str);
            }
            xmlSerializer.text(obj.toString());
            xmlSerializer.endTag(null, "string");
            return;
        }
        if (obj instanceof Integer) {
            str2 = "int";
        } else if (obj instanceof Long) {
            str2 = "long";
        } else if (obj instanceof Float) {
            str2 = "float";
        } else if (obj instanceof Double) {
            str2 = "double";
        } else if (obj instanceof Boolean) {
            str2 = "boolean";
        } else {
            if (obj instanceof byte[]) {
                writeByteArrayXml((byte[]) obj, str, xmlSerializer);
                return;
            }
            if (obj instanceof int[]) {
                writeIntArrayXml((int[]) obj, str, xmlSerializer);
                return;
            }
            if (obj instanceof Map) {
                writeMapXml((Map) obj, str, xmlSerializer);
                return;
            }
            if (obj instanceof List) {
                writeListXml((List) obj, str, xmlSerializer);
                return;
            }
            if (obj instanceof Set) {
                writeSetXml((Set) obj, str, xmlSerializer);
                return;
            }
            if (obj instanceof CharSequence) {
                xmlSerializer.startTag(null, "string");
                if (str != null) {
                    xmlSerializer.attribute(null, "name", str);
                }
                xmlSerializer.text(obj.toString());
                xmlSerializer.endTag(null, "string");
                return;
            }
            StringBuilder LIZIZ = C25620zW.LIZIZ("writeValueXml: unable to write ", str, ", class ");
            LIZIZ.append(obj.getClass());
            LIZIZ.append(", value ");
            LIZIZ.append(obj);
            throw new RuntimeException(X1D.LIZIZ(LIZIZ));
        }
        xmlSerializer.startTag(null, str2);
        if (str != null) {
            xmlSerializer.attribute(null, "name", str);
        }
        xmlSerializer.attribute(null, "value", obj.toString());
        xmlSerializer.endTag(null, str2);
    }
}
