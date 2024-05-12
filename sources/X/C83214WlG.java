package X;

import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.tools.beauty.impl.view.InternalBeautyPanel;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WlG, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83214WlG implements InterfaceC82228WOy {
    public final C83232WlY LIZ;
    public final InterfaceC83142Wk6 LIZIZ;
    public final C79146V4k LIZJ;

    public C83214WlG(InterfaceC83142Wk6 source, C79146V4k c79146V4k, AqS180S0100000_14 configBuilder) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(configBuilder, "configBuilder");
        this.LIZIZ = source;
        this.LIZJ = c79146V4k;
        C83232WlY c83232WlY = new C83232WlY();
        this.LIZ = c83232WlY;
        configBuilder.invoke(c83232WlY);
    }

    @Override // X.InterfaceC82228WOy
    public final InterfaceC82227WOx LIZ(Context context, ViewGroup viewGroup, InterfaceC83144Wk8 listener) {
        o.LJIIIZ(listener, "listener");
        C83245Wll c83245Wll = new C83245Wll(context, viewGroup, this.LIZIZ);
        c83245Wll.LIZIZ = this.LIZJ;
        C83232WlY c83232WlY = this.LIZ;
        c83232WlY.LIZLLL = false;
        c83245Wll.LIZ = listener;
        InternalBeautyPanel internalBeautyPanel = new InternalBeautyPanel(c83245Wll.LIZJ, c83245Wll.LIZLLL, c83245Wll.LJ, c83232WlY);
        internalBeautyPanel.setContainer(c83245Wll.LIZLLL);
        InterfaceC83144Wk8 interfaceC83144Wk8 = c83245Wll.LIZ;
        internalBeautyPanel.LJLLJ = interfaceC83144Wk8;
        C83216WlI c83216WlI = internalBeautyPanel.LJLJI;
        if (c83216WlI != null) {
            c83216WlI.LIZJ = interfaceC83144Wk8;
            C83203Wl5 c83203Wl5 = internalBeautyPanel.LJLJLLL;
            if (c83203Wl5 != null) {
                c83203Wl5.LIZIZ = interfaceC83144Wk8;
                C83195Wkx c83195Wkx = internalBeautyPanel.LJLJL;
                if (c83195Wkx != null) {
                    c83195Wkx.LIZIZ = interfaceC83144Wk8;
                    C83248Wlo c83248Wlo = internalBeautyPanel.LJLLI;
                    if (c83248Wlo != null) {
                        c83248Wlo.LIZIZ = interfaceC83144Wk8;
                        internalBeautyPanel.LJLLLL.LIZ = c83245Wll.LIZIZ;
                        return internalBeautyPanel;
                    }
                    o.LJIJI("enableViewBusiness");
                    throw null;
                }
                o.LJIJI("seekBarBusiness");
                throw null;
            }
            o.LJIJI("beautyResetBusiness");
            throw null;
        }
        o.LJIJI("listBusiness");
        throw null;
    }
}
