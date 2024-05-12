package X;

import Y.ARunnableS41S0100000_5;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.lynx.ILiveLynxService;
import kotlin.jvm.internal.o;

/* renamed from: X.0yy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25280yy {
    public static void LIZ(InterfaceC25300z0 interfaceC25300z0, String str, ViewGroup viewGroup, OHZ ohz) {
        String str2;
        CO7 co7;
        VNS G1;
        C31239CNv c31239CNv = (C31239CNv) interfaceC25300z0;
        if (!o.LJ("lynx", "h5") && o.LJ("lynx", "lynx")) {
            str2 = "lynx";
        } else {
            str2 = "h5";
        }
        c31239CNv.LJ = str2;
        c31239CNv.LIZ = str;
        c31239CNv.LIZIZ = "";
        c31239CNv.LIZLLL = viewGroup;
        Context context = viewGroup.getContext();
        o.LJIIIIZZ(context, "rootContainer.context");
        c31239CNv.LIZJ = context;
        c31239CNv.LJIIIIZZ = ohz;
        if (c31239CNv.LIZ == null) {
            return;
        }
        if (o.LJ("lynx", c31239CNv.LJ) && c31239CNv.LJFF == null) {
            ILiveLynxService iLiveLynxService = (ILiveLynxService) CN1.LIZ(ILiveLynxService.class);
            if (iLiveLynxService != null) {
                Context context2 = c31239CNv.LIZJ;
                if (context2 != null) {
                    ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(context2);
                    o.LJI(LIZIZ);
                    co7 = iLiveLynxService.tq(LIZIZ, -1, c31239CNv.LIZ, new C31243CNz(c31239CNv), null);
                } else {
                    o.LJIJI("mContext");
                    throw null;
                }
            } else {
                co7 = null;
            }
            c31239CNv.LJFF = co7;
            if (co7 != null && (G1 = co7.G1()) != null) {
                G1.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            }
            CO7 co72 = c31239CNv.LJFF;
            if (co72 != null) {
                ViewGroup viewGroup2 = c31239CNv.LIZLLL;
                if (viewGroup2 != null) {
                    viewGroup2.removeAllViews();
                    ViewGroup viewGroup3 = c31239CNv.LIZLLL;
                    if (viewGroup3 != null) {
                        viewGroup3.addView(co72.re(), 0);
                        if (c31239CNv.LJII) {
                            ViewGroup viewGroup4 = c31239CNv.LIZLLL;
                            if (viewGroup4 != null) {
                                c31239CNv.LIZ(viewGroup4, C2N6.LJLIL);
                            } else {
                                o.LJIJI("mRootContainer");
                                throw null;
                            }
                        }
                    } else {
                        o.LJIJI("mRootContainer");
                        throw null;
                    }
                } else {
                    o.LJIJI("mRootContainer");
                    throw null;
                }
            }
        } else if (o.LJ("h5", c31239CNv.LJ) && c31239CNv.LJI == null) {
            c31239CNv.LIZIZ();
        }
        ViewGroup viewGroup5 = c31239CNv.LIZLLL;
        if (viewGroup5 != null) {
            viewGroup5.post(new ARunnableS41S0100000_5(c31239CNv, 282));
        } else {
            o.LJIJI("mRootContainer");
            throw null;
        }
    }
}
