package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.SparseArray;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.069, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass069 {
    public int LIZ;
    public final SparseArray<AnonymousClass067> LIZIZ = new SparseArray<>();

    public final int LIZ(int i) {
        int LIZ;
        float f = -1;
        if (-1 == i) {
            AnonymousClass067 valueAt = this.LIZIZ.valueAt(0);
            if (valueAt == null || -1 == (LIZ = valueAt.LIZ(f, f))) {
                return -1;
            }
            if (LIZ == -1) {
                return valueAt.LIZJ;
            }
            return ((AnonymousClass068) ListProtector.get(valueAt.LIZIZ, LIZ)).LJ;
        }
        AnonymousClass067 anonymousClass067 = this.LIZIZ.get(i);
        if (anonymousClass067 == null) {
            return -1;
        }
        int LIZ2 = anonymousClass067.LIZ(f, f);
        if (LIZ2 == -1) {
            return anonymousClass067.LIZJ;
        }
        return ((AnonymousClass068) ListProtector.get(anonymousClass067.LIZIZ, LIZ2)).LJ;
    }

    public AnonymousClass069(Context context, XmlPullParser xmlPullParser) {
        this.LIZ = -1;
        new SparseArray();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), new int[]{R.attr.a9o});
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.LIZ = obtainStyledAttributes.getResourceId(index, this.LIZ);
            }
        }
        obtainStyledAttributes.recycle();
        try {
            int eventType = xmlPullParser.getEventType();
            AnonymousClass067 anonymousClass067 = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    if (eventType != 2) {
                        if (eventType != 3) {
                            continue;
                        } else if ("StateSet".equals(xmlPullParser.getName())) {
                            return;
                        }
                    } else {
                        String name = xmlPullParser.getName();
                        switch (name.hashCode()) {
                            case 80204913:
                                if (name.equals("State")) {
                                    anonymousClass067 = new AnonymousClass067(context, xmlPullParser);
                                    this.LIZIZ.put(anonymousClass067.LIZ, anonymousClass067);
                                    break;
                                } else {
                                    break;
                                }
                            case 1301459538:
                                if (name.equals("LayoutDescription")) {
                                    break;
                                } else {
                                    break;
                                }
                            case 1382829617:
                                if (name.equals("StateSet")) {
                                    break;
                                } else {
                                    break;
                                }
                            case 1901439077:
                                if (name.equals("Variant")) {
                                    AnonymousClass068 anonymousClass068 = new AnonymousClass068(context, xmlPullParser);
                                    if (anonymousClass067 != null) {
                                        anonymousClass067.LIZIZ.add(anonymousClass068);
                                        break;
                                    } else {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                        }
                    }
                } else {
                    xmlPullParser.getName();
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e) {
            C16880lQ.LLLLIIL(e);
        } catch (XmlPullParserException e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }
}
