package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ATG implements InterfaceC62486Ofi {
    public final ATM LJLIL;
    public final C62822Ol8 LJLILLLLZI;

    @Override // X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJ() {
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
    public final boolean LJJI() {
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final String LJJIFFI() {
        return "";
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJJII() {
        return R.string.jsz;
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
    public final int LJFF() {
        AT1 at1 = (AT1) this.LJLILLLLZI.getValue();
        if (at1 != null) {
            return at1.LIZ;
        }
        return this.LJLIL.LIZ.LJLIL;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJIJ() {
        AT1 at1 = (AT1) this.LJLILLLLZI.getValue();
        if (at1 != null) {
            return at1.LIZIZ;
        }
        return this.LJLIL.LIZ.LJLIL;
    }

    @Override // X.InterfaceC62486Ofi
    public final String key() {
        String str = this.LJLIL.LIZ.LJLJI;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LIZ() {
        return C62485Ofh.LIZIZ();
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC41317GJl LJIILIIL() {
        return EnumC41317GJl.LongPress;
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC26273ASv LJIILLIIL() {
        return EnumC26273ASv.NORMAL;
    }

    public ATG(ATM item) {
        o.LJIIIZ(item, "item");
        this.LJLIL = item;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1152));
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIIZ(TextView textView) {
        C62485Ofh.LJ(this, textView);
    }

    @Override // X.InterfaceC62486Ofi
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
        ASB asb = this.LJLIL.LIZIZ;
        if (asb instanceof ATT) {
            C62435Oet c62435Oet = ((ATT) asb).LJLJJI;
            LIZJ(c62435Oet.LJLIL, c62435Oet.LJLJLJ);
        } else {
            if (!(asb instanceof ATH)) {
                return;
            }
            C62435Oet c62435Oet2 = ((ATH) asb).LJLJJI;
            LIZJ(c62435Oet2.LJLIL, c62435Oet2.LJLJLJ);
        }
    }

    public static void LIZJ(Aweme aweme, SharePackage sharePackage) {
        String enterFrom = sharePackage.extras.getString("enter_from", "");
        String str = "long_press";
        if (!o.LJ(sharePackage.extras.getString("panel_source", ""), "long_press")) {
            str = "click_share_button";
        }
        C98273tP.LIZJ(enterFrom, aweme, str);
        o.LJIIIIZZ(enterFrom, "enterFrom");
        IFH.LIZLLL(enterFrom, str);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
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
