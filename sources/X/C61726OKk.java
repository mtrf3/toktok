package X;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.OKk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61726OKk implements InterfaceC62486Ofi {
    public final InterfaceC59488NWi LJLIL;
    public final C38049EwX LJLILLLLZI;
    public final WebView LJLJI;

    @Override // X.InterfaceC62486Ofi
    public final void LJ() {
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        return R.raw.icon_2pt_arrow_clockwise;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJI() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJIIJJI() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJIJ() {
        return R.raw.icon_2pt_arrow_clockwise;
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
        return R.string.pyj;
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
        return "refresh";
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
        InterfaceC59488NWi interfaceC59488NWi = this.LJLIL;
        if (interfaceC59488NWi != null) {
            interfaceC59488NWi.refresh();
        } else {
            C38049EwX c38049EwX = this.LJLILLLLZI;
            if (c38049EwX != null) {
                WebView webView = c38049EwX.LIZ;
                if (webView != null) {
                    webView.reload();
                }
            } else {
                WebView webView2 = this.LJLJI;
                if (webView2 != null) {
                    webView2.reload();
                }
            }
        }
        Aweme o6 = AwemeService.LIZ().o6(sharePackage.extras.getString("aweme_id"));
        if (o6 == null) {
            return;
        }
        ShareDependService.LIZ.getClass();
        C44498HdG.LIZ().LJJIFFI(context, o6, sharePackage);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZJ(context, baseSharePackage, this);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIZILJ(ImageView imageView, View view, int i) {
        C62485Ofh.LIZLLL(imageView, view);
    }

    public C61726OKk(InterfaceC59488NWi interfaceC59488NWi, C38049EwX c38049EwX, WebView webView, int i) {
        interfaceC59488NWi = (i & 1) != 0 ? null : interfaceC59488NWi;
        c38049EwX = (i & 2) != 0 ? null : c38049EwX;
        webView = (i & 4) != 0 ? null : webView;
        this.LJLIL = interfaceC59488NWi;
        this.LJLILLLLZI = c38049EwX;
        this.LJLJI = webView;
    }
}
