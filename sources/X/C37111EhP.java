package X;

import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.EhP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37111EhP {
    public static C40659FxX LIZ;

    public static String LIZ(XmlPullParser xmlPullParser, String str) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static void LIZIZ(XmlPullParser xmlPullParser) {
        int i = 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next != 3) {
                continue;
            } else {
                i--;
            }
            if (i == 0) {
                return;
            }
        }
    }
}
