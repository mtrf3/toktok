package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.OKo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61730OKo implements InterfaceC62486Ofi {
    public final Challenge LJLIL;

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
        return "report_hashtag";
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

    public C61730OKo(Challenge challenge) {
        this.LJLIL = challenge;
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
        String str;
        String str2;
        String str3;
        User author;
        User author2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        Uri.Builder appendQueryParameter = new Uri.Builder().appendQueryParameter("report_type", "hashtag");
        Challenge challenge = this.LJLIL;
        String str4 = null;
        if (challenge != null) {
            str = challenge.getCid();
        } else {
            str = null;
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("object_id", str);
        Challenge challenge2 = this.LJLIL;
        if (challenge2 != null && (author2 = challenge2.getAuthor()) != null) {
            str2 = author2.getUid();
        } else {
            str2 = null;
        }
        a.LJIILLIIL().LIZIZ(C78609UtB.LJJLIIIJ(context), appendQueryParameter2.appendQueryParameter("owner_id", str2));
        IReportService LJIILLIIL = a.LJIILLIIL();
        Challenge challenge3 = this.LJLIL;
        if (challenge3 != null) {
            str3 = challenge3.getCid();
        } else {
            str3 = null;
        }
        Challenge challenge4 = this.LJLIL;
        if (challenge4 != null && (author = challenge4.getAuthor()) != null) {
            str4 = author.getUid();
        }
        LJIILLIIL.LIZ("challenge_detail", "hashtag", "", str3, str4, "click_share_button");
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZJ(context, baseSharePackage, this);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIZILJ(ImageView imageView, View view, int i) {
        C62485Ofh.LIZLLL(imageView, view);
    }
}
