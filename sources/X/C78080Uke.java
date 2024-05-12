package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Uke, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78080Uke {
    public static final /* synthetic */ int LIZ = 0;

    public static Drawable LIZ(List list) {
        LinkedList linkedList = new LinkedList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedList.addLast(Integer.valueOf(ColorProtector.parseColor((String) it.next())));
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, ORZ.LLJ(linkedList));
        gradientDrawable.setCornerRadius(C15380j0.LIZ(24.0f));
        return gradientDrawable;
    }

    public static Integer LIZLLL(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final Drawable LIZIZ(int i, Context context) {
        o.LJIIIZ(context, "context");
        if (i <= 499) {
            return context.getDrawable(R.drawable.cdp);
        }
        if (i <= 9999) {
            return context.getDrawable(R.drawable.cdq);
        }
        return context.getDrawable(R.drawable.cdo);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
    
        if (r0 <= 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long LIZJ(int r9, X.C78072UkW r10) {
        /*
            r0 = 70
            r2 = 2000(0x7d0, double:9.88E-321)
            r8 = 1
            r4 = 0
            if (r9 > r0) goto L82
            if (r10 != 0) goto Lb
        La:
            return r2
        Lb:
            boolean r5 = r10.LJIJ
            boolean r7 = r10.LJJJJJL
            if (r7 == 0) goto L7f
            int r6 = r10.LJIILIIL
        L13:
            boolean r1 = r10.LJJJJL
            boolean r0 = X.C78084Uki.LJFF()
            r3 = 2000(0x7d0, float:2.803E-42)
            if (r0 != 0) goto L35
        L1d:
            long r2 = (long) r3
            if (r5 == 0) goto La
            boolean r5 = r10.LJJJJJL
            boolean r1 = r10.LJJJJL
            boolean r0 = X.C78084Uki.LJFF()
            if (r0 == 0) goto L32
            com.bytedance.android.livesdk.livesetting.gift.GiftConfig r0 = X.C78084Uki.LIZJ(r5, r1)
            com.bytedance.android.livesdk.livesetting.gift.TrayStayAfterComboConfig r0 = r0._trayStayAfterComboConfig
            int r4 = r0._firstSendExtendsDuration
        L32:
            long r0 = (long) r4
            long r2 = r2 + r0
            goto La
        L35:
            com.bytedance.android.livesdk.livesetting.gift.GiftConfig r0 = X.C78084Uki.LIZJ(r7, r1)
            com.bytedance.android.livesdk.livesetting.gift.TrayStayAfterComboConfig r2 = r0._trayStayAfterComboConfig
            boolean r0 = X.C78084Uki.LJFF()
            if (r0 != 0) goto L45
            r0 = 2000(0x7d0, float:2.803E-42)
        L43:
            r3 = r0
            goto L1d
        L45:
            java.lang.String r1 = r2._stayType
            java.lang.String r0 = "fix"
            boolean r0 = ujb.o.LJJJJIZL(r1, r0, r8)
            if (r0 == 0) goto L54
            int r0 = r2._fixDuration
        L51:
            if (r0 > 0) goto L43
            goto L1d
        L54:
            java.util.List<java.lang.Integer> r2 = r2._dynamicDuration
            X.Uks r1 = X.C78084Uki.LIZIZ
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            java.lang.Object r0 = r1.invoke(r0)
            java.util.List r0 = (java.util.List) r0
            int r1 = X.C78084Uki.LIZ(r6, r0)
            if (r1 < 0) goto L79
            int r0 = X.C47261Igj.LJJI(r2)
            if (r1 > r0) goto L79
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r1)
        L72:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L51
        L79:
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L72
        L7f:
            int r6 = r10.LJIIL
            goto L13
        L82:
            r1 = 1751(0x6d7, float:2.454E-42)
            if (r9 >= r1) goto L89
            r0 = 3000(0xbb8, double:1.482E-320)
            return r0
        L89:
            r0 = 5201(0x1451, float:7.288E-42)
            if (r1 > r9) goto La4
            if (r9 >= r0) goto L92
            r0 = 4000(0xfa0, double:1.9763E-320)
            return r0
        L92:
            r0 = 17501(0x445d, float:2.4524E-41)
            if (r9 >= r0) goto L99
            r0 = 6000(0x1770, double:2.9644E-320)
            return r0
        L99:
            r0 = 300001(0x493e1, float:4.20391E-40)
            if (r9 >= r0) goto La1
            r0 = 7000(0x1b58, double:3.4585E-320)
            return r0
        La1:
            r0 = 8000(0x1f40, double:3.9525E-320)
            return r0
        La4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78080Uke.LIZJ(int, X.UkW):long");
    }
}
