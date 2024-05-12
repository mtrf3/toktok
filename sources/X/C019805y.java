package X;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.05y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C019805y {
    public final ConstraintLayout LIZ;
    public int LIZIZ = -1;
    public int LIZJ = -1;
    public final SparseArray<C019605w> LIZLLL = new SparseArray<>();
    public final SparseArray<AnonymousClass064> LJ = new SparseArray<>();

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if (r1 == (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) {
        /*
            r8 = this;
            X.064 r5 = new X.064
            r5.<init>()
            int r2 = r10.getAttributeCount()
            r1 = 0
        La:
            if (r1 >= r2) goto L56
            java.lang.String r0 = r10.getAttributeName(r1)
            java.lang.String r7 = "id"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L59
            java.lang.String r6 = r10.getAttributeValue(r1)
            java.lang.String r0 = "/"
            boolean r0 = r6.contains(r0)
            r4 = -1
            r3 = 1
            if (r0 == 0) goto L57
            r0 = 47
            int r0 = r6.indexOf(r0)
            int r0 = r0 + 1
            java.lang.String r2 = r6.substring(r0)
            android.content.res.Resources r1 = r9.getResources()
            java.lang.String r0 = r9.getPackageName()
            int r1 = r1.getIdentifier(r2, r7, r0)
            if (r1 != r4) goto L4e
        L40:
            int r0 = r6.length()
            if (r0 <= r3) goto L4e
            java.lang.String r0 = r6.substring(r3)
            int r1 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)
        L4e:
            r5.LJIIZILJ(r9, r10)
            android.util.SparseArray<X.064> r0 = r8.LJ
            r0.put(r1, r5)
        L56:
            return
        L57:
            r1 = -1
            goto L40
        L59:
            int r1 = r1 + 1
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C019805y.LIZ(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public C019805y(Context context, ConstraintLayout constraintLayout, int i) {
        this.LIZ = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            C019605w c019605w = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        String name = xml.getName();
                        switch (name.hashCode()) {
                            case -1349929691:
                                if (name.equals("ConstraintSet")) {
                                    LIZ(context, xml);
                                    break;
                                } else {
                                    break;
                                }
                            case 80204913:
                                if (name.equals("State")) {
                                    c019605w = new C019605w(context, xml);
                                    this.LIZLLL.put(c019605w.LIZ, c019605w);
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
                            case 1657696882:
                                if (name.equals("layoutDescription")) {
                                    break;
                                } else {
                                    break;
                                }
                            case 1901439077:
                                if (name.equals("Variant")) {
                                    C019705x c019705x = new C019705x(context, xml);
                                    if (c019605w != null) {
                                        c019605w.LIZIZ.add(c019705x);
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
                    xml.getName();
                }
            }
        } catch (IOException e) {
            C16880lQ.LLLLIIL(e);
        } catch (XmlPullParserException e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }

    public final void LIZIZ(float f, float f2, int i) {
        AnonymousClass064 anonymousClass064;
        C019605w c019605w;
        int LIZ;
        int i2 = this.LIZIZ;
        if (i2 == i) {
            if (i == -1) {
                c019605w = this.LIZLLL.valueAt(0);
            } else {
                c019605w = this.LIZLLL.get(i2);
            }
            int i3 = this.LIZJ;
            if ((i3 != -1 && ((C019705x) ListProtector.get(c019605w.LIZIZ, i3)).LIZ(f, f2)) || this.LIZJ == (LIZ = c019605w.LIZ(f, f2)) || LIZ == -1) {
                return;
            }
            AnonymousClass064 anonymousClass0642 = ((C019705x) ListProtector.get(c019605w.LIZIZ, LIZ)).LJFF;
            if (LIZ != -1) {
            }
            if (anonymousClass0642 == null) {
                return;
            }
            this.LIZJ = LIZ;
            anonymousClass0642.LIZIZ(this.LIZ);
            return;
        }
        this.LIZIZ = i;
        C019605w c019605w2 = this.LIZLLL.get(i);
        int LIZ2 = c019605w2.LIZ(f, f2);
        if (LIZ2 == -1) {
            anonymousClass064 = c019605w2.LIZLLL;
        } else {
            anonymousClass064 = ((C019705x) ListProtector.get(c019605w2.LIZIZ, LIZ2)).LJFF;
            if (LIZ2 != -1) {
            }
        }
        if (anonymousClass064 == null) {
            return;
        }
        this.LIZJ = LIZ2;
        anonymousClass064.LIZIZ(this.LIZ);
    }
}
