package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3A1, reason: invalid class name */
/* loaded from: classes2.dex */
public class C3A1 implements InterfaceC62486Ofi {
    public static final /* synthetic */ int LJLJJL = 0;
    public final Aweme LJLIL;
    public final InterfaceC72642tA<C50420Jqa> LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;

    @Override // X.InterfaceC62486Ofi
    public final void LJ() {
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        return R.raw.icon_2pt_flag;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJI() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJIIJJI() {
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJIJ() {
        return R.raw.icon_flag_fill;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJJI() {
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final String LJJIFFI() {
        return "";
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJJII() {
        return R.string.q2_;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJIII(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJJIIJZLJL() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean enable() {
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final String key() {
        return "report";
    }

    public void LIZJ() {
        C50420Jqa c50420Jqa = new C50420Jqa(1, this.LJLIL);
        c50420Jqa.LJLLL = this.LJLJJI;
        c50420Jqa.LJLLLL = this.LJLJI;
        InterfaceC72642tA<C50420Jqa> interfaceC72642tA = this.LJLILLLLZI;
        if (interfaceC72642tA != null) {
            interfaceC72642tA.onInternalEvent(c50420Jqa);
        }
    }

    @Override // X.InterfaceC62486Ofi
    public final int LIZ() {
        return C62485Ofh.LIZIZ();
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC41317GJl LJIILIIL() {
        return EnumC41317GJl.ShareButton;
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC26273ASv LJIILLIIL() {
        return EnumC26273ASv.NORMAL;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIIZ(TextView textView) {
        C62485Ofh.LJ(this, textView);
    }

    @Override // X.InterfaceC62486Ofi
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        int LJJJIL = C79004UzY.LJJJIL(context, this.LJLIL);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("author_id", this.LJLIL.getAuthorUid());
        c188727au.LJIIIZ("enter_from", this.LJLJI);
        c188727au.LJIIIZ("group_id", C227768wm.LIZIZ(this.LJLIL));
        c188727au.LJIIIZ("log_pb", C3A5.LIZ.LIZIZ(C227768wm.LJIIZILJ(this.LJLIL)));
        c188727au.LJIIIZ("panel_source", this.LJLJJI);
        V0N.LJI(c188727au, this.LJLIL);
        C222578oP.LIZJ(c188727au, this.LJLIL, null, null, 14);
        FMX.LJIIL("report", c188727au.LIZ);
        if (C793339l.LIZ(this.LJLIL)) {
            if (C78996UzQ.LJJIIZI(this.LJLIL)) {
                C227738wj.LJIIIIZZ(context, this.LJLIL, this.LJLILLLLZI, null, null, null, null, null, 248);
                return;
            }
            if (LJJJIL == 0) {
                LIZJ();
                return;
            }
            Aweme aweme = this.LJLIL;
            if (aweme == null) {
                return;
            }
            ShareDependService.LIZ.getClass();
            ShareDependService LIZ = C44498HdG.LIZ();
            String str = this.LJLJI;
            LIZ.LJ(aweme, str, context, "", str, "", "", LJJJIL);
        }
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZJ(context, baseSharePackage, this);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIZILJ(ImageView imageView, View view, int i) {
        C62485Ofh.LIZLLL(imageView, view);
    }

    public C3A1(InterfaceC72642tA interfaceC72642tA, Aweme aweme, String enterFrom, String panelSource) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(panelSource, "panelSource");
        this.LJLIL = aweme;
        this.LJLILLLLZI = interfaceC72642tA;
        this.LJLJI = enterFrom;
        this.LJLJJI = panelSource;
    }
}
