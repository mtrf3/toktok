package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.L4n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53669L4n extends AbstractC53666L4k<View> {
    public static final C53669L4n LIZJ = new C53669L4n();

    @Override // X.AbstractC53666L4k
    public final View LIZIZ(Context context, View view) {
        if (view == null) {
            return new L5Y(context, null, 0);
        }
        return view;
    }

    @Override // X.L52
    public final void LIZ(View view, Context context, C71799SFv avatarView, L69 rootView, L4W l4w) {
        C53478Kyo c53478Kyo;
        L5Y l5y;
        C53461KyX c53461KyX;
        o.LJIIIZ(avatarView, "avatarView");
        o.LJIIIZ(rootView, "rootView");
        AbstractC53462KyY LIZ = l4w.LIZJ.LIZ();
        L50 l50 = null;
        if ((LIZ instanceof C53461KyX) && (c53461KyX = (C53461KyX) LIZ) != null) {
            l50 = c53461KyX.LIZIZ;
        }
        if ((l50 instanceof C53478Kyo) && (c53478Kyo = (C53478Kyo) l50) != null && (view instanceof L5Y) && (l5y = (L5Y) view) != null) {
            ViewGroup.LayoutParams layoutParams = l5y.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 17;
                l5y.setLayoutParams(layoutParams2);
                l5y.setContainerView(rootView);
                InterfaceC88472Yns<C53489Kyz, C76800UCe> interfaceC88472Yns = c53478Kyo.LJFF;
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(new C53489Kyz(rootView, l5y, l5y, context));
                }
                l5y.setUIStyle(l4w);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }
}
