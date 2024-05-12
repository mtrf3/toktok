package X;

import android.R;
import android.content.Context;
import android.view.View;
import java.io.File;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.NtQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60788NtQ extends AbstractC60796NtY {
    public C73305Spp LJLILLLLZI;
    public Context LJLJI;

    @Override // X.AbstractC60796NtY, X.M2J
    public final void release() {
        this.LJLJI = null;
    }

    public final void LIZLLL() {
        if (this.LJLILLLLZI == null) {
            C39836FkG.LJII.getClass();
            this.LJLJI = C38262Ezy.LIZ().LIZIZ();
            C73305Spp c73305Spp = new C73305Spp(C38262Ezy.LIZ().LIZIZ(), null, 6);
            c73305Spp.setLayoutVariant(0);
            this.LJLILLLLZI = c73305Spp;
            FD5.LJII("hybrid_log_report", C51029K0z.LJJIIZI(new OSZ(WM7.SCENE_SERVICE, "status_view_not_initialized_by_spark")));
        }
    }

    @Override // X.InterfaceC60814Ntq
    public final View LJIJ() {
        LIZLLL();
        C73305Spp c73305Spp = this.LJLILLLLZI;
        if (c73305Spp != null) {
            c73305Spp.LJFF();
            C73305Spp c73305Spp2 = this.LJLILLLLZI;
            if (c73305Spp2 != null) {
                c73305Spp2.setVisibility(0);
                C73305Spp c73305Spp3 = this.LJLILLLLZI;
                if (c73305Spp3 != null) {
                    c73305Spp3.setBackgroundColor(C04330Ez.LIZIZ(c73305Spp3.getContext(), R.color.transparent));
                    C73305Spp c73305Spp4 = this.LJLILLLLZI;
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

    @Override // X.InterfaceC60814Ntq
    public final void LIZ(Context context) {
        this.LJLJI = context;
        C73305Spp c73305Spp = new C73305Spp(context, null, 6);
        c73305Spp.setLayoutVariant(0);
        this.LJLILLLLZI = c73305Spp;
    }

    @Override // X.InterfaceC60814Ntq
    public final View LJIJJLI(NV7 refresher) {
        o.LJIIIZ(refresher, "refresher");
        LIZLLL();
        C73305Spp c73305Spp = this.LJLILLLLZI;
        if (c73305Spp != null) {
            C73306Spq c73306Spq = new C73306Spq();
            C73312Spw.LJI(c73306Spq, new AqS160S0100000_10(refresher, 502));
            c73305Spp.setStatus(c73306Spq);
            C73305Spp c73305Spp2 = this.LJLILLLLZI;
            if (c73305Spp2 != null) {
                Context context = c73305Spp2.getContext();
                o.LJIIIIZZ(context, "statusView.context");
                c73305Spp2.setBackgroundColor(AnonymousClass636.LJIIIIZZ(com.zhiliaoapp.musically.R.attr.cl, context));
                C73305Spp c73305Spp3 = this.LJLILLLLZI;
                if (c73305Spp3 != null) {
                    c73305Spp3.setVisibility(0);
                    C73305Spp c73305Spp4 = this.LJLILLLLZI;
                    if (c73305Spp4 != null) {
                        c73305Spp4.setBackgroundColor(C04330Ez.LIZIZ(c73305Spp4.getContext(), com.zhiliaoapp.musically.R.color.ar));
                        C73305Spp c73305Spp5 = this.LJLILLLLZI;
                        if (c73305Spp5 != null) {
                            return c73305Spp5;
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
        o.LJIJI("statusView");
        throw null;
    }

    @Override // X.AbstractC60796NtY
    public final View LIZJ(File file, Boolean bool, Float f, Float f2, Long l) {
        Context context = this.LJLJI;
        if (context != null) {
            if (C60963NwF.LIZ(context)) {
                OJU oju = new OJU(context);
                oju.setScaleX(-1.0f);
                oju.setHasAnimation(o.LJ(bool, Boolean.TRUE));
                oju.setFromAlpha(f);
                oju.setToAlpha(f2);
                oju.setDuration(l);
                oju.LIZ(file);
                oju.setVisibility(0);
                return oju;
            }
            OJU oju2 = new OJU(context);
            oju2.setScaleX(1.0f);
            oju2.setHasAnimation(o.LJ(bool, Boolean.TRUE));
            oju2.setFromAlpha(f);
            oju2.setToAlpha(f2);
            oju2.setDuration(l);
            oju2.LIZ(file);
            oju2.setVisibility(0);
            return oju2;
        }
        return null;
    }
}
