package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import defpackage.a1;
import defpackage.b0;
import defpackage.i0;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.V8q, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79256V8q {
    public static final HashMap LIZ(InputStream inputStream) {
        XmlPullParser newPullParser = android.util.Xml.newPullParser();
        newPullParser.setInput(inputStream, null);
        String[] strArr = new String[1];
        int eventType = newPullParser.getEventType();
        while (eventType != 2) {
            if (eventType != 3) {
                if (eventType != 4) {
                    eventType = newPullParser.next();
                    if (eventType == 1) {
                        throw new XmlPullParserException("Unexpected end of document");
                    }
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Unexpected text: ");
                    LIZ.append(newPullParser.getText());
                    throw new XmlPullParserException(X1D.LIZIZ(LIZ));
                }
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Unexpected end tag at: ");
                LIZ2.append(newPullParser.getName());
                throw new XmlPullParserException(X1D.LIZIZ(LIZ2));
            }
        }
        return (HashMap) LIZIZ(newPullParser, strArr);
    }

    public static final Object LIZIZ(XmlPullParser xmlPullParser, String[] strArr) {
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
                                    StringBuilder LIZ4 = X1D.LIZ();
                                    LIZ4.append("Expected item tag at: ");
                                    LIZ4.append(xmlPullParser.getName());
                                    throw new XmlPullParserException(X1D.LIZIZ(LIZ4));
                                }
                            } else if (eventType == 3) {
                                if (xmlPullParser.getName().equals("int-array")) {
                                    strArr[0] = attributeValue;
                                    return iArr;
                                }
                                if (xmlPullParser.getName().equals("item")) {
                                    i++;
                                } else {
                                    StringBuilder LIZIZ = C25620zW.LIZIZ("Expected ", "int-array", " end tag at: ");
                                    LIZIZ.append(xmlPullParser.getName());
                                    throw new XmlPullParserException(X1D.LIZIZ(LIZIZ));
                                }
                            }
                            eventType = xmlPullParser.next();
                        } while (eventType != 1);
                        throw new XmlPullParserException(a1.LJ("Document ended before ", "int-array", " end tag"));
                    } catch (NullPointerException unused3) {
                        throw new XmlPullParserException("Need num attribute in byte-array");
                    } catch (NumberFormatException unused4) {
                        throw new XmlPullParserException("Not a number in num attribute in byte-array");
                    }
                }
                if (name.equals("map")) {
                    xmlPullParser.next();
                    HashMap hashMap = new HashMap();
                    int eventType2 = xmlPullParser.getEventType();
                    do {
                        if (eventType2 == 2) {
                            Object LIZIZ2 = LIZIZ(xmlPullParser, strArr);
                            String str2 = strArr[0];
                            if (str2 != null) {
                                hashMap.put(str2, LIZIZ2);
                            } else {
                                StringBuilder LIZ5 = X1D.LIZ();
                                LIZ5.append("Map value without name attribute: ");
                                LIZ5.append(xmlPullParser.getName());
                                throw new XmlPullParserException(X1D.LIZIZ(LIZ5));
                            }
                        } else if (eventType2 == 3) {
                            if (xmlPullParser.getName().equals("map")) {
                                strArr[0] = attributeValue;
                                return hashMap;
                            }
                            StringBuilder LIZIZ3 = C25620zW.LIZIZ("Expected ", "map", " end tag at: ");
                            LIZIZ3.append(xmlPullParser.getName());
                            throw new XmlPullParserException(X1D.LIZIZ(LIZIZ3));
                        }
                        eventType2 = xmlPullParser.next();
                    } while (eventType2 != 1);
                    throw new XmlPullParserException(a1.LJ("Document ended before ", "map", " end tag"));
                }
                if (name.equals("list")) {
                    xmlPullParser.next();
                    ArrayList arrayList = new ArrayList();
                    int eventType3 = xmlPullParser.getEventType();
                    do {
                        if (eventType3 == 2) {
                            arrayList.add(LIZIZ(xmlPullParser, strArr));
                        } else if (eventType3 == 3) {
                            if (xmlPullParser.getName().equals("list")) {
                                strArr[0] = attributeValue;
                                return arrayList;
                            }
                            StringBuilder LIZIZ4 = C25620zW.LIZIZ("Expected ", "list", " end tag at: ");
                            LIZIZ4.append(xmlPullParser.getName());
                            throw new XmlPullParserException(X1D.LIZIZ(LIZIZ4));
                        }
                        eventType3 = xmlPullParser.next();
                    } while (eventType3 != 1);
                    throw new XmlPullParserException(a1.LJ("Document ended before ", "list", " end tag"));
                }
                if (name.equals("set")) {
                    xmlPullParser.next();
                    HashSet hashSet = new HashSet();
                    int eventType4 = xmlPullParser.getEventType();
                    do {
                        if (eventType4 == 2) {
                            hashSet.add(LIZIZ(xmlPullParser, strArr));
                        } else if (eventType4 == 3) {
                            if (xmlPullParser.getName().equals("set")) {
                                strArr[0] = attributeValue;
                                return hashSet;
                            }
                            StringBuilder LIZIZ5 = C25620zW.LIZIZ("Expected ", "set", " end tag at: ");
                            LIZIZ5.append(xmlPullParser.getName());
                            throw new XmlPullParserException(X1D.LIZIZ(LIZIZ5));
                        }
                        eventType4 = xmlPullParser.next();
                    } while (eventType4 != 1);
                    throw new XmlPullParserException(a1.LJ("Document ended before ", "set", " end tag"));
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
                    StringBuilder LIZIZ6 = C25620zW.LIZIZ("Unexpected end tag in <", name, ">: ");
                    LIZIZ6.append(xmlPullParser.getName());
                    throw new XmlPullParserException(X1D.LIZIZ(LIZIZ6));
                }
                if (next == 4) {
                    StringBuilder LIZIZ7 = C25620zW.LIZIZ("Unexpected text in <", name, ">: ");
                    LIZIZ7.append(xmlPullParser.getName());
                    throw new XmlPullParserException(X1D.LIZIZ(LIZIZ7));
                }
            } else {
                throw new XmlPullParserException(a1.LJ("Unexpected end of document in <", name, ">"));
            }
        } while (next != 2);
        StringBuilder LIZIZ8 = C25620zW.LIZIZ("Unexpected start tag in <", name, ">: ");
        LIZIZ8.append(xmlPullParser.getName());
        throw new XmlPullParserException(X1D.LIZIZ(LIZIZ8));
    }

    public static final void LIZJ(java.util.Map map, OutputStream outputStream) {
        YPI ypi = new YPI();
        ypi.setOutput(outputStream, "utf-8");
        ypi.startDocument(null, Boolean.TRUE);
        ypi.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        LIZLLL(map, null, ypi);
        ypi.flush();
    }

    public static final void LIZLLL(java.util.Map map, String str, YPI ypi) {
        if (map == null) {
            ypi.startTag(null, "null");
            ypi.endTag(null, "null");
            return;
        }
        ypi.startTag(null, "map");
        if (str != null) {
            ypi.attribute(null, "name", str);
        }
        for (Map.Entry entry : map.entrySet()) {
            LJ(entry.getValue(), (String) entry.getKey(), ypi);
        }
        ypi.endTag(null, "map");
    }

    public static final void LJ(Object obj, String str, YPI ypi) {
        int i;
        int i2;
        String str2;
        if (obj == null) {
            ypi.startTag(null, "null");
            if (str != null) {
                ypi.attribute(null, "name", str);
            }
            ypi.endTag(null, "null");
            return;
        }
        if (obj instanceof String) {
            ypi.startTag(null, "string");
            if (str != null) {
                ypi.attribute(null, "name", str);
            }
            ypi.text(obj.toString());
            ypi.endTag(null, "string");
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
            int i3 = 0;
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                ypi.startTag(null, "byte-array");
                if (str != null) {
                    ypi.attribute(null, "name", str);
                }
                int length = bArr.length;
                ypi.attribute(null, "num", Integer.toString(length));
                StringBuilder sb = new StringBuilder(bArr.length * 2);
                while (i3 < length) {
                    byte b = bArr[i3];
                    int i4 = b >> 4;
                    if (i4 >= 10) {
                        i = (i4 + 97) - 10;
                    } else {
                        i = i4 + 48;
                    }
                    sb.append(i);
                    int i5 = b & 255;
                    if (i5 >= 10) {
                        i2 = (i5 + 97) - 10;
                    } else {
                        i2 = i5 + 48;
                    }
                    sb.append(i2);
                    i3++;
                }
                ypi.text(sb.toString());
                ypi.endTag(null, "byte-array");
                return;
            }
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                ypi.startTag(null, "int-array");
                if (str != null) {
                    ypi.attribute(null, "name", str);
                }
                int length2 = iArr.length;
                ypi.attribute(null, "num", Integer.toString(length2));
                while (i3 < length2) {
                    ypi.startTag(null, "item");
                    ypi.attribute(null, "value", Integer.toString(iArr[i3]));
                    ypi.endTag(null, "item");
                    i3++;
                }
                ypi.endTag(null, "int-array");
                return;
            }
            if (obj instanceof java.util.Map) {
                LIZLLL((java.util.Map) obj, str, ypi);
                return;
            }
            if (obj instanceof List) {
                List list = (List) obj;
                ypi.startTag(null, "list");
                if (str != null) {
                    ypi.attribute(null, "name", str);
                }
                int size = list.size();
                while (i3 < size) {
                    LJ(ListProtector.get(list, i3), null, ypi);
                    i3++;
                }
                ypi.endTag(null, "list");
                return;
            }
            if (obj instanceof java.util.Set) {
                java.util.Set set = (java.util.Set) obj;
                ypi.startTag(null, "set");
                if (str != null) {
                    ypi.attribute(null, "name", str);
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    LJ(it.next(), null, ypi);
                }
                ypi.endTag(null, "set");
                return;
            }
            if (obj instanceof CharSequence) {
                ypi.startTag(null, "string");
                if (str != null) {
                    ypi.attribute(null, "name", str);
                }
                ypi.text(obj.toString());
                ypi.endTag(null, "string");
                return;
            }
            throw new RuntimeException(b0.LIZIZ("writeValueXml: unable to write value ", obj));
        }
        ypi.startTag(null, str2);
        if (str != null) {
            ypi.attribute(null, "name", str);
        }
        ypi.attribute(null, "value", obj.toString());
        ypi.endTag(null, str2);
    }
}
