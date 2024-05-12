package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.Log, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55398Log implements InterfaceC62486Ofi {
    public static final /* synthetic */ int LJLJI = 0;
    public final Activity LJLIL;
    public final String LJLILLLLZI;

    @Override // X.InterfaceC62486Ofi
    public final void LJ() {
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        return R.raw.icon_personalization;
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
        return R.raw.icon_personalization_fill;
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
        return R.string.itu;
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
        return "following_feed_0_following";
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

    public C55398Log(ActivityC45651qj activity, String str) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
        this.LJLILLLLZI = str;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        ActivityC45651qj activityC45651qj;
        String str;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        IComplianceBusinessService LJFF = a.LJFF();
        Activity activity = this.LJLIL;
        if (activity instanceof ActivityC45651qj) {
            activityC45651qj = (ActivityC45651qj) activity;
        } else {
            activityC45651qj = null;
        }
        String str2 = this.LJLILLLLZI;
        String str3 = "homepage_friends";
        if (o.LJ(str2, "Following")) {
            str = "homepage_follow";
        } else if (o.LJ(str2, "FRIENDS_TAB")) {
            str = "homepage_friends";
        } else {
            str = "";
        }
        LJFF.LJJIJL(activityC45651qj, str, "manage_feeds_pop_up");
        OSZ[] oszArr = new OSZ[2];
        String str4 = this.LJLILLLLZI;
        if (o.LJ(str4, "Following")) {
            str3 = "homepage_follow";
        } else if (!o.LJ(str4, "FRIENDS_TAB")) {
            str3 = "";
        }
        int i = 0;
        oszArr[0] = new OSZ("enter_from", str3);
        if (C35971E9v.LIZ() && o.LJ(a.LJFF().LJFF().getValue(), Boolean.TRUE)) {
            i = 1;
        }
        oszArr[1] = new OSZ("is_non_personalized", String.valueOf(i));
        FMX.LJIIL("click_manage_feeds", C113554cx.LJJL(oszArr));
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
