package X;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.SDt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71745SDt implements InterfaceC64048PBs, O0Z {
    public static final byte[] LJLIL = {47, 115, 100, 99, 97, 114, 100};
    public static final byte[] LJLILLLLZI = {47, 65, 110, 100, 114, 111, 105, 100, 47, 100, 97, 116, 97};
    public static final byte[] LJLJI = {47, 115, 116, 111, 114, 97, 103, 101, 47, 101, 109, 117, 108, 97, 116, 101, 100};
    public static final byte[] LJLJJI = {47, 100, 97, 116, 97, 47, 100, 97, 116, 97};
    public static final byte[] LJLJJL = {47, 100, 97, 116, 97, 47, 117, 115, 101, 114};
    public static final byte[] LJLJJLL = {103, 101, 116, 86, 111, 108, 117, 109, 101, 80, 97, 116, 104, 115};

    @Override // X.O0Z
    public void onComplete() {
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004c A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(com.bytedance.tux.icon.TuxIconView r4, X.SE0 r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            r1 = 2131364676(0x7f0a0b44, float:1.8349196E38)
            java.lang.Object r3 = r4.getTag(r1)
            boolean r0 = r3 instanceof X.SE0
            r2 = 0
            if (r0 == 0) goto L1b
            X.SE0 r3 = (X.SE0) r3
        L13:
            if (r5 != 0) goto L1d
            r0 = 8
            r4.setVisibility(r0)
            return
        L1b:
            r3 = r2
            goto L13
        L1d:
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r5)
            if (r0 == 0) goto L24
            return
        L24:
            r4.setTag(r1, r5)
            if (r3 == 0) goto Lac
            int r1 = r5.LIZ
            int r0 = r3.LIZ
            if (r1 != r0) goto Lac
        L2f:
            android.graphics.drawable.Drawable r1 = r5.LIZIZ
            if (r1 == 0) goto L53
            if (r3 == 0) goto L51
            android.graphics.drawable.Drawable r0 = r3.LIZIZ
        L37:
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L53
            android.graphics.drawable.Drawable r0 = r5.LIZIZ
            r4.setImageDrawable(r0)
        L42:
            int r1 = r5.LJ
            if (r1 <= 0) goto L4c
            if (r3 == 0) goto L4d
            int r0 = r3.LJ
            if (r1 != r0) goto L4d
        L4c:
            return
        L4d:
            r4.setTintColorRes(r1)
            goto L4c
        L51:
            r0 = r2
            goto L37
        L53:
            X.89v r1 = r5.LIZJ
            if (r1 == 0) goto L69
            if (r3 == 0) goto L67
            X.89v r0 = r3.LIZJ
        L5b:
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L69
            X.89v r0 = r5.LIZJ
            r4.setTuxIcon(r0)
            goto L42
        L67:
            r0 = r2
            goto L5b
        L69:
            int r1 = r5.LIZLLL
            if (r1 <= 0) goto L73
            if (r3 == 0) goto La8
            int r0 = r3.LIZLLL
            if (r1 != r0) goto La8
        L73:
            java.lang.String r0 = r5.LJFF
            if (r0 == 0) goto L42
            int r0 = r0.length()
            if (r0 != 0) goto L7e
            goto L42
        L7e:
            java.lang.String r0 = r5.LJFF
            if (r3 == 0) goto L84
            java.lang.String r2 = r3.LJFF
        L84:
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r2)
            if (r0 != 0) goto L42
            java.lang.String r0 = r5.LJFF
            X.W5F r2 = X.C70759Rpr.LIZLLL(r0)
            android.content.Context r1 = r4.getContext()
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r0 = 2130968616(0x7f040028, float:1.754589E38)
            android.graphics.drawable.Drawable r0 = X.C79045V0n.LJIIIIZZ(r0, r1)
            r2.LJIILIIL = r0
            r2.LJJIIJZLJL = r4
            X.C16880lQ.LLJJJ(r2)
            goto L42
        La8:
            r4.setIconRes(r1)
            goto L42
        Lac:
            int r0 = r5.LIZ
            r4.setVisibility(r0)
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71745SDt.LIZIZ(com.bytedance.tux.icon.TuxIconView, X.SE0):void");
    }

    public static final void LIZJ(View view, SE2 se2) {
        int i;
        int i2;
        int i3;
        int i4;
        o.LJIIIZ(view, "<this>");
        if (se2 == null) {
            return;
        }
        Rect rect = new Rect(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
        Integer num = se2.LIZ;
        if (num != null) {
            i = num.intValue();
        } else {
            i = rect.left;
        }
        Integer num2 = se2.LIZIZ;
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = rect.top;
        }
        Integer num3 = se2.LIZJ;
        if (num3 != null) {
            i3 = num3.intValue();
        } else {
            i3 = rect.right;
        }
        Integer num4 = se2.LIZLLL;
        if (num4 != null) {
            i4 = num4.intValue();
        } else {
            i4 = rect.bottom;
        }
        Rect rect2 = new Rect(i, i2, i3, i4);
        if (!o.LJ(rect2, rect)) {
            view.setPadding(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public static final C214738bl LIZ(Fragment fragment, C65776Prg c65776Prg, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2) {
        o.LJIIIZ(fragment, "<this>");
        if (interfaceC65784Pro2 == null) {
            interfaceC65784Pro2 = new AqS153S0100000_3(fragment, 1715);
        }
        return new C214738bl(c65776Prg, interfaceC65784Pro, interfaceC65784Pro2);
    }
}
