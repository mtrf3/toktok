package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.L4k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC53666L4k<VIEW extends View> implements L52 {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C53528Kzc.LJLIL);
    public final java.util.Set<L4T> LIZIZ = (java.util.Set) L4Q.LIZJ.getValue();

    public abstract View LIZIZ(Context context, View view);

    public static void LIZLLL(FrameLayout.LayoutParams layoutParams, L69 rootView, C53455KyR data) {
        Integer num;
        int i;
        o.LJIIIZ(rootView, "rootView");
        o.LJIIIZ(data, "data");
        C53447KyJ LJ = C78929UyL.LJ(rootView);
        InterfaceC88472Yns<C53447KyJ, Float> interfaceC88472Yns = data.LIZ;
        Integer num2 = null;
        if (interfaceC88472Yns != null) {
            num = Integer.valueOf((int) interfaceC88472Yns.invoke(LJ).floatValue());
        } else {
            num = null;
        }
        InterfaceC88472Yns<C53447KyJ, Float> interfaceC88472Yns2 = data.LIZIZ;
        if (interfaceC88472Yns2 != null) {
            num2 = Integer.valueOf((int) interfaceC88472Yns2.invoke(LJ).floatValue());
        }
        int i2 = -2;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -2;
        }
        layoutParams.width = i;
        if (num2 != null) {
            i2 = num2.intValue();
        }
        layoutParams.height = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(android.view.View r10, X.C71799SFv r11, X.L69 r12, X.InterfaceC53515KzP r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC53666L4k.LIZJ(android.view.View, X.SFv, X.L69, X.KzP, boolean):void");
    }
}
