package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import defpackage.i0;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.Hjo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44904Hjo extends AbstractC44912Hjw implements InterfaceC62486Ofi {
    public static final /* synthetic */ int LJLJL = 0;
    public final Activity LJLIL;
    public final Aweme LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final C44907Hjr LJLJJL;
    public SharePackage LJLJJLL;

    @Override // X.InterfaceC62486Ofi
    public final void LJ() {
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        return R.raw.icon_2pt_arrow_to_bottom;
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
        return R.raw.icon_arrow_down_to_line_bold;
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
        return R.string.j6f;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJIII(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJJIIJZLJL() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final String key() {
        return "now_save";
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean enable() {
        ACLCommonShare downloadGeneral;
        AwemeACLShare awemeACLShare = this.LJLILLLLZI.awemeACLShareInfo;
        if (awemeACLShare == null || (downloadGeneral = awemeACLShare.getDownloadGeneral()) == null || downloadGeneral.getShowType() != 2) {
            return false;
        }
        return true;
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
        SharePackage sharePackage2 = (SharePackage) sharePackage;
        this.LJLJJLL = sharePackage2;
        LIZJ(this.LJLIL, context, this.LJLILLLLZI, sharePackage2, this.LJLJJI, this.LJLJI, this.LJLJJL);
    }

    @Override // X.AbstractC44912Hjw
    public final void LJII(Context context, C44913Hjx downloadActionConfig) {
        ACLCommonShare aCLCommonShare;
        String str;
        String str2;
        String LIZIZ;
        Bundle bundle;
        String string;
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(downloadActionConfig, "downloadActionConfig");
        C42592Gnc c42592Gnc = new C42592Gnc(0);
        c42592Gnc.LIZIZ = false;
        AwemeACLShare awemeACLShare = this.LJLILLLLZI.awemeACLShareInfo;
        String str3 = null;
        if (awemeACLShare != null) {
            aCLCommonShare = awemeACLShare.getDownloadGeneral();
        } else {
            aCLCommonShare = null;
        }
        c42592Gnc.LIZ = aCLCommonShare;
        C42593Gnd LIZ = c42592Gnc.LIZ();
        Bundle bundle5 = new Bundle();
        SharePackage sharePackage = this.LJLJJLL;
        if (sharePackage != null && (bundle4 = sharePackage.extras) != null) {
            str3 = bundle4.getString("now_type");
        }
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        bundle5.putString("now_type", str3);
        SharePackage sharePackage2 = this.LJLJJLL;
        if (sharePackage2 == null || (bundle3 = sharePackage2.extras) == null || (str = bundle3.getString("download_method")) == null) {
            str = "";
        }
        bundle5.putString("download_method", str);
        C44896Hjg c44896Hjg = C44896Hjg.LIZ;
        C44896Hjg.LJIL = bundle5;
        SharePackage sharePackage3 = this.LJLJJLL;
        if (sharePackage3 == null || (bundle2 = sharePackage3.extras) == null || (str2 = bundle2.getString("download_method")) == null) {
            str2 = "";
        }
        C44938HkM.LJII = str2;
        Aweme aweme = this.LJLILLLLZI;
        o.LJIIIZ(aweme, "aweme");
        String LIZ2 = C197747pS.LIZ(aweme);
        StringBuilder LIZ3 = X1D.LIZ();
        String LIZIZ2 = b1.LIZIZ(LIZ2, LIZ3, ".png", LIZ3);
        String LJIJ = C66580QBc.LJIJ(context);
        LJIJ.toString();
        if (ujb.o.LJJJJ(LJIJ, "/", false)) {
            LIZIZ = i0.LJFF(LJIJ, LIZIZ2);
        } else {
            LIZIZ = C00F.LIZIZ(LJIJ, '/', LIZIZ2);
        }
        Aweme aweme2 = this.LJLILLLLZI;
        SharePackage sharePackage4 = this.LJLJJLL;
        if (sharePackage4 != null && (bundle = sharePackage4.extras) != null && (string = bundle.getString("enter_from")) != null) {
            str4 = string;
        }
        C193657ir.LIZJ(aweme2, str4, this.LJLJJI, "", C2S6.LIZ(context).getFromGroupId(), C2S6.LIZ(context).getNewsId(), bundle5, null, null, false);
        if (C39579Fg7.LIZIZ(LIZIZ)) {
            Aweme aweme3 = this.LJLILLLLZI;
            C44938HkM.LJFF = aweme3;
            C44896Hjg.LJI = aweme3;
            c44896Hjg.LJIILJJIL(LIZIZ, false, new C44910Hju(downloadActionConfig, this));
            return;
        }
        C44896Hjg.LJIIIIZZ(this.LJLJI, this.LJLJJI, new C44902Hjm(new WeakReference(this.LJLIL), this.LJLIL, Integer.valueOf(downloadActionConfig.LJ), downloadActionConfig), this.LJLILLLLZI, C77275UUl.LJ(0), LIZ, null, 128);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZJ(context, baseSharePackage, this);
    }

    public C44904Hjo(Activity activity, Aweme aweme, String enterFrom) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLIL = activity;
        this.LJLILLLLZI = aweme;
        this.LJLJI = enterFrom;
        this.LJLJJI = "click_download_icon";
        this.LJLJJL = new C44907Hjr(this);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIZILJ(ImageView imageView, View view, int i) {
        C62485Ofh.LIZLLL(imageView, view);
    }
}
