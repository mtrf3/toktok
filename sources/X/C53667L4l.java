package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.L4l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53667L4l extends AbstractC53666L4k<View> {
    public static final C53667L4l LIZJ = new C53667L4l();

    @Override // X.AbstractC53666L4k
    public final View LIZIZ(Context context, View view) {
        if (view == null) {
            return new View(context);
        }
        return view;
    }

    @Override // X.L52
    public final void LIZ(View view, Context context, C71799SFv avatarView, L69 rootView, L4W l4w) {
        L50 l50;
        C53513KzN c53513KzN;
        View view2;
        ViewGroup viewGroup;
        C53513KzN c53513KzN2;
        View view3;
        ViewGroup viewGroup2;
        C53461KyX c53461KyX;
        C53461KyX c53461KyX2;
        o.LJIIIZ(avatarView, "avatarView");
        o.LJIIIZ(rootView, "rootView");
        AbstractC53462KyY LIZ = l4w.LIZJ.LIZ();
        L50 l502 = null;
        if ((LIZ instanceof C53461KyX) && (c53461KyX2 = (C53461KyX) LIZ) != null) {
            l50 = c53461KyX2.LIZIZ;
        } else {
            l50 = null;
        }
        if (!(l50 instanceof C53513KzN) || (c53513KzN = (C53513KzN) l50) == null) {
            return;
        }
        AbstractC53462KyY LIZ2 = l4w.LIZJ.LIZ();
        if ((LIZ2 instanceof C53461KyX) && (c53461KyX = (C53461KyX) LIZ2) != null) {
            l502 = c53461KyX.LIZIZ;
        }
        if ((l502 instanceof C53513KzN) && (c53513KzN2 = (C53513KzN) l502) != null) {
            if (c53513KzN2.LIZJ != null && (view instanceof FrameLayout) && (viewGroup2 = (ViewGroup) view) != null) {
                view3 = C78924UyG.LIZJ(viewGroup2);
            } else {
                view3 = view;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                C53667L4l c53667L4l = LIZJ;
                C53455KyR c53455KyR = c53513KzN2.LIZJ;
                if (c53455KyR == null) {
                    c53455KyR = c53513KzN2.LIZIZ;
                }
                c53667L4l.getClass();
                AbstractC53666L4k.LIZLLL(layoutParams2, rootView, c53455KyR);
                if (!o.LJ(view3, view)) {
                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                    if (layoutParams3 != null) {
                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                        AbstractC53666L4k.LIZLLL(layoutParams4, rootView, c53513KzN2.LIZIZ);
                        view3.setLayoutParams(layoutParams4);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    }
                }
                layoutParams2.gravity = c53513KzN2.LIZ.LIZIZ();
                view.setLayoutParams(layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
        if (c53513KzN.LIZJ != null && (view instanceof FrameLayout) && (viewGroup = (ViewGroup) view) != null) {
            view2 = C78924UyG.LIZJ(viewGroup);
        } else {
            view2 = view;
        }
        InterfaceC88472Yns<C53489Kyz, C76800UCe> interfaceC88472Yns = c53513KzN.LJI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(new C53489Kyz(rootView, view2, view, context));
        }
    }
}
