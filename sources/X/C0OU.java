package X;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.0OU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0OU {
    public static void LIZJ(XmlPullParser xmlPullParser) {
        int i = 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 2) {
                if (next != 3) {
                    continue;
                } else {
                    i--;
                }
            } else {
                i++;
            }
            if (i <= 0) {
                return;
            }
        }
    }

    public static C0OS LIZ(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        int i;
        boolean z;
        int i2;
        int i3;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                xmlPullParser.require(2, null, "font-family");
                if (xmlPullParser.getName().equals("font-family")) {
                    TypedArray obtainAttributes = resources.obtainAttributes(android.util.Xml.asAttributeSet(xmlPullParser), new int[]{R.attr.ae_, R.attr.aea, R.attr.aeb, R.attr.aec, R.attr.aed, R.attr.aee, R.attr.aef});
                    String LLLZLZ = C16880lQ.LLLZLZ(obtainAttributes, 0);
                    String LLLZLZ2 = C16880lQ.LLLZLZ(obtainAttributes, 4);
                    String LLLZLZ3 = C16880lQ.LLLZLZ(obtainAttributes, 5);
                    int resourceId = obtainAttributes.getResourceId(1, 0);
                    int integer = obtainAttributes.getInteger(2, 1);
                    int integer2 = obtainAttributes.getInteger(3, LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
                    String LLLZLZ4 = C16880lQ.LLLZLZ(obtainAttributes, 6);
                    obtainAttributes.recycle();
                    if (LLLZLZ != null && LLLZLZ2 != null && LLLZLZ3 != null) {
                        while (xmlPullParser.next() != 3) {
                            LIZJ(xmlPullParser);
                        }
                        return new C1IV(new C12120dk(LLLZLZ, LLLZLZ2, LLLZLZ3, LIZIZ(resources, resourceId)), integer, integer2, LLLZLZ4);
                    }
                    ArrayList arrayList = new ArrayList();
                    while (xmlPullParser.next() != 3) {
                        if (xmlPullParser.getEventType() == 2) {
                            if (xmlPullParser.getName().equals("font")) {
                                TypedArray obtainAttributes2 = resources.obtainAttributes(android.util.Xml.asAttributeSet(xmlPullParser), new int[]{android.R.attr.font, android.R.attr.fontWeight, android.R.attr.fontStyle, android.R.attr.ttcIndex, android.R.attr.fontVariationSettings, R.attr.ae8, R.attr.aeg, R.attr.aei, R.attr.aej, R.attr.bm7});
                                int i4 = 8;
                                if (!obtainAttributes2.hasValue(8)) {
                                    i4 = 1;
                                }
                                int i5 = obtainAttributes2.getInt(i4, LiveChatShowDelayForHotLiveSetting.DEFAULT);
                                if (obtainAttributes2.hasValue(6)) {
                                    i = 6;
                                } else {
                                    i = 2;
                                }
                                if (1 == obtainAttributes2.getInt(i, 0)) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                int i6 = 9;
                                if (!obtainAttributes2.hasValue(9)) {
                                    i6 = 3;
                                }
                                if (obtainAttributes2.hasValue(7)) {
                                    i2 = 7;
                                } else {
                                    i2 = 4;
                                }
                                String LLLZLZ5 = C16880lQ.LLLZLZ(obtainAttributes2, i2);
                                int i7 = obtainAttributes2.getInt(i6, 0);
                                if (obtainAttributes2.hasValue(5)) {
                                    i3 = 5;
                                } else {
                                    i3 = 0;
                                }
                                int resourceId2 = obtainAttributes2.getResourceId(i3, 0);
                                String LLLZLZ6 = C16880lQ.LLLZLZ(obtainAttributes2, i3);
                                obtainAttributes2.recycle();
                                while (xmlPullParser.next() != 3) {
                                    LIZJ(xmlPullParser);
                                }
                                arrayList.add(new C0OT(LLLZLZ6, i5, z, i7, resourceId2, LLLZLZ5));
                            } else {
                                LIZJ(xmlPullParser);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return new C1IU((C0OT[]) arrayList.toArray(new C0OT[0]));
                    }
                } else {
                    LIZJ(xmlPullParser);
                }
                return null;
            }
        } while (next != 1);
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> LIZIZ(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (C0OR.LIZ(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }
}
