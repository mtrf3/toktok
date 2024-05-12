package X;

import android.R;
import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.NjI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60160NjI extends AbstractC60796NtY {
    public final InterfaceC60159NjH LJLILLLLZI;
    public C73305Spp LJLJI;
    public Context LJLJJI;

    @Override // X.AbstractC60796NtY, X.M2J
    public final void release() {
        this.LJLJJI = null;
    }

    @Override // X.InterfaceC60814Ntq
    public final View LJIJ() {
        C73305Spp c73305Spp = this.LJLJI;
        if (c73305Spp != null) {
            c73305Spp.LJFF();
            C73305Spp c73305Spp2 = this.LJLJI;
            if (c73305Spp2 != null) {
                c73305Spp2.setVisibility(0);
                C73305Spp c73305Spp3 = this.LJLJI;
                if (c73305Spp3 != null) {
                    c73305Spp3.setBackgroundColor(C04330Ez.LIZIZ(c73305Spp3.getContext(), R.color.transparent));
                    C73305Spp c73305Spp4 = this.LJLJI;
                    if (c73305Spp4 != null) {
                        return c73305Spp4;
                    }
                    o.LJIJI("statusView");
                    throw null;
                }
                o.LJIJI("statusView");
                throw null;
            }
            o.LJIJI("statusView");
            throw null;
        }
        o.LJIJI("statusView");
        throw null;
    }

    public C60160NjI(C40087FoJ c40087FoJ) {
        this.LJLILLLLZI = c40087FoJ;
    }

    @Override // X.InterfaceC60814Ntq
    public final void LIZ(Context context) {
        this.LJLJJI = context;
        C73305Spp c73305Spp = new C73305Spp(context, null, 6);
        c73305Spp.setLayoutVariant(0);
        this.LJLJI = c73305Spp;
    }

    @Override // X.InterfaceC60814Ntq
    public final View LJIJJLI(NV7 refresher) {
        boolean z;
        String str;
        String string;
        Integer LJI;
        String str2;
        String string2;
        o.LJIIIZ(refresher, "refresher");
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        String str3 = "";
        if (z) {
            C73305Spp c73305Spp = this.LJLJI;
            if (c73305Spp != null) {
                C73306Spq c73306Spq = new C73306Spq();
                AqS160S0100000_10 aqS160S0100000_10 = new AqS160S0100000_10(this, 8);
                Context context = this.LJLJJI;
                if (context == null || (str2 = context.getString(com.zhiliaoapp.musically.R.string.pj)) == null) {
                    str2 = "";
                }
                c73306Spq.LJFF = str2;
                Context context2 = this.LJLJJI;
                if (context2 != null && (string2 = context2.getString(com.zhiliaoapp.musically.R.string.pi)) != null) {
                    str3 = string2;
                }
                c73306Spq.LJI = str3;
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = com.zhiliaoapp.musically.R.raw.icon_large_error_robot;
                c2068389v.LJ = Integer.valueOf(com.zhiliaoapp.musically.R.attr.gp);
                c73306Spq.LIZJ = 0;
                c73306Spq.LIZIZ = c2068389v;
                c73306Spq.LJII = new AqS176S0100000_10(aqS160S0100000_10, 11);
                c73305Spp.setStatus(c73306Spq);
            } else {
                o.LJIJI("statusView");
                throw null;
            }
        } else {
            C73305Spp c73305Spp2 = this.LJLJI;
            if (c73305Spp2 != null) {
                C73306Spq c73306Spq2 = new C73306Spq();
                AqS160S0100000_10 aqS160S0100000_102 = new AqS160S0100000_10(refresher, 9);
                Context context3 = this.LJLJJI;
                if (context3 == null || (str = context3.getString(com.zhiliaoapp.musically.R.string.ph)) == null) {
                    str = "";
                }
                c73306Spq2.LJFF = str;
                Context context4 = this.LJLJJI;
                if (context4 != null && (string = context4.getString(com.zhiliaoapp.musically.R.string.pg)) != null) {
                    str3 = string;
                }
                c73306Spq2.LJI = str3;
                C2068389v c2068389v2 = new C2068389v();
                c2068389v2.LIZ = com.zhiliaoapp.musically.R.raw.icon_large_wifi_slash;
                c2068389v2.LJ = Integer.valueOf(com.zhiliaoapp.musically.R.attr.gp);
                c73306Spq2.LIZJ = 0;
                c73306Spq2.LIZIZ = c2068389v2;
                c73306Spq2.LJII = new AqS176S0100000_10(aqS160S0100000_102, 10);
                c73305Spp2.setStatus(c73306Spq2);
            } else {
                o.LJIJI("statusView");
                throw null;
            }
        }
        Context context5 = this.LJLJJI;
        if (context5 != null && (LJI = C79045V0n.LJI(com.zhiliaoapp.musically.R.attr.cl, context5)) != null) {
            int intValue = LJI.intValue();
            C73305Spp c73305Spp3 = this.LJLJI;
            if (c73305Spp3 != null) {
                c73305Spp3.setBackgroundColor(intValue);
            } else {
                o.LJIJI("statusView");
                throw null;
            }
        }
        C73305Spp c73305Spp4 = this.LJLJI;
        if (c73305Spp4 != null) {
            c73305Spp4.setVisibility(0);
            C73305Spp c73305Spp5 = this.LJLJI;
            if (c73305Spp5 != null) {
                return c73305Spp5;
            }
            o.LJIJI("statusView");
            throw null;
        }
        o.LJIJI("statusView");
        throw null;
    }
}
