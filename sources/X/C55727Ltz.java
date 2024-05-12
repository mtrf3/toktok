package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS97S0101000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Ltz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55727Ltz implements InterfaceC62486Ofi {
    public static final /* synthetic */ int LJLJJI = 0;
    public final Aweme LJLIL;
    public final String LJLILLLLZI;
    public int LJLJI;

    @Override // X.InterfaceC62486Ofi
    public final void LJ() {
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        return R.raw.icon_2pt_twinkle_star;
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
        return R.raw.icon_twinkle_star_fill;
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
        return R.string.r5w;
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
        return "share_to_story";
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

    public C55727Ltz(Aweme aweme, String enterFrom) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLIL = aweme;
        this.LJLILLLLZI = enterFrom;
        this.LJLJI = -1;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        Bundle bundle = sharePackage.extras;
        GZP LJII = C55723Ltv.LIZIZ.LJII();
        Aweme aweme = this.LJLIL;
        String string = bundle.getString("enter_from", "");
        o.LJIIIIZZ(string, "extras.getString(ShareKeys.ENTER_FROM, \"\")");
        LJII.LJFF(new C41831GbL(context, aweme, string, null, null, 24));
        LJII.LJIIJ("share_to_story_click", this.LJLIL, new AqS140S0200000_9(bundle, this, 57));
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZJ(context, baseSharePackage, this);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIZILJ(ImageView iconView, View view, int i) {
        o.LJIIIZ(iconView, "iconView");
        C55723Ltv.LIZIZ.LJII().LJIIJ("share_to_story_show", this.LJLIL, new AqS97S0101000_9(this, i, 5));
        this.LJLJI = i;
    }
}
