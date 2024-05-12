package X;

import android.view.View;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.NoX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60485NoX extends AbstractC60800Ntc {
    public final /* synthetic */ C60484NoW LJLIL;
    public final /* synthetic */ C73305Spp LJLILLLLZI;
    public final /* synthetic */ ActivityC45651qj LJLJI;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJL() {
        Object obj;
        View view;
        C60484NoW c60484NoW = this.LJLIL;
        EnumC40125Fov enumC40125Fov = EnumC40125Fov.LOAD_INIT;
        c60484NoW.LJLLI = enumC40125Fov;
        BottomSheetDialogFragment bottomSheetDialogFragment = c60484NoW.LJLJJLL;
        if (bottomSheetDialogFragment != null) {
            View view2 = bottomSheetDialogFragment.getView();
            View view3 = null;
            if (view2 != null) {
                obj = view2.getParent();
            } else {
                obj = null;
            }
            if (obj instanceof View) {
                view = (View) obj;
            } else {
                view = null;
            }
            C76732zl c76732zl = new C76732zl();
            C60479NoR c60479NoR = new C60479NoR(c76732zl);
            InterfaceC60761Nsz kitView = c60484NoW.getSparkView().getKitView();
            if (kitView != null) {
                view3 = kitView.LIZJ();
            }
            if (view3 instanceof WebView) {
                InterfaceC60761Nsz kitView2 = c60484NoW.getSparkView().getKitView();
                c60484NoW.LJLJJL = kitView2;
                if (kitView2 instanceof WebKitView) {
                    o.LJII(kitView2, "null cannot be cast to non-null type com.bytedance.lynx.hybrid.webkit.WebKitView");
                    ((WebKitView) kitView2).setWebScrollListener(new C60478NoQ(c60479NoR));
                    if (view != null) {
                        BottomSheetBehavior from = BottomSheetBehavior.from(view);
                        from.setBottomSheetCallback(new C60486NoY(c60484NoW, c76732zl, from, bottomSheetDialogFragment));
                    }
                }
            }
        }
        C60484NoW c60484NoW2 = this.LJLIL;
        SparkContext sparkContext = c60484NoW2.LJLJJI;
        if (sparkContext != null && c60484NoW2.LJLLL) {
            C27737Aub.LIZJ(sparkContext, enumC40125Fov.getStatus(), 0, null, c60484NoW2.LJLLILLLL, 124);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void onDestroy() {
        this.LJLIL.LJLJLLL.getAndSet(false);
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        C60484NoW c60484NoW = this.LJLIL;
        EnumC40125Fov enumC40125Fov = EnumC40125Fov.LOAD_FINISH;
        c60484NoW.LJLLI = enumC40125Fov;
        c60484NoW.LJLJL = false;
        this.LJLILLLLZI.setVisibility(8);
        C60484NoW c60484NoW2 = this.LJLIL;
        SparkContext sparkContext = c60484NoW2.LJLJJI;
        if (sparkContext != null && c60484NoW2.LJLLL) {
            C27737Aub.LIZJ(sparkContext, enumC40125Fov.getStatus(), 0, null, c60484NoW2.LJLLILLLL, 124);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJZ(EnumC39924Flg kitType) {
        o.LJIIIZ(kitType, "kitType");
        this.LJLIL.LJLJLLL.getAndSet(true);
        if (this.LJLIL.LJLJLJ.get()) {
            this.LJLIL.onResume();
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        C60484NoW c60484NoW = this.LJLIL;
        c60484NoW.LJLJL = true;
        EnumC40125Fov enumC40125Fov = EnumC40125Fov.LOAD_START;
        c60484NoW.LJLLI = enumC40125Fov;
        SparkContext sparkContext = c60484NoW.LJLJJI;
        if (sparkContext != null && c60484NoW.LJLLL) {
            C27737Aub.LIZJ(sparkContext, enumC40125Fov.getStatus(), 0, null, c60484NoW.LJLLILLLL, 124);
        }
    }

    public C60485NoX(C60484NoW c60484NoW, C73305Spp c73305Spp, ActivityC45651qj activityC45651qj) {
        this.LJLIL = c60484NoW;
        this.LJLILLLLZI = c73305Spp;
        this.LJLJI = activityC45651qj;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJIZL(InterfaceC60761Nsz view, String url, C60704Ns4 c60704Ns4) {
        int i;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        C60484NoW c60484NoW = this.LJLIL;
        SparkContext sparkContext = c60484NoW.LJLJJI;
        boolean z = false;
        if (sparkContext != null && c60484NoW.LJLLL) {
            int status = c60484NoW.LJLLI.getStatus();
            Integer num = c60704Ns4.LIZ;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            String str = c60704Ns4.LIZIZ;
            if (str == null) {
                str = "unknown";
            }
            C27737Aub.LIZJ(sparkContext, status, i, str, 0L, 132);
        }
        this.LJLIL.LJLJL = false;
        this.LJLILLLLZI.setVisibility(0);
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
        }
        if (z) {
            C73305Spp c73305Spp = this.LJLILLLLZI;
            C73306Spq c73306Spq = new C73306Spq();
            C73312Spw.LJIIJ(c73306Spq, new AqS160S0100000_10(this.LJLIL, 182));
            c73305Spp.setStatus(c73306Spq);
            C26045AKb c26045AKb = new C26045AKb(this.LJLJI);
            c26045AKb.LJIIIIZZ(R.string.r9l);
            c26045AKb.LJIIJ();
            return;
        }
        C73305Spp c73305Spp2 = this.LJLILLLLZI;
        C73306Spq c73306Spq2 = new C73306Spq();
        C73312Spw.LJI(c73306Spq2, new AqS160S0100000_10(this.LJLIL, 183));
        c73305Spp2.setStatus(c73306Spq2);
    }
}
