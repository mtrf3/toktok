package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AT0 implements InterfaceC62486Ofi {
    public final C26276ASy LJLIL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1154));

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
    public final int LIZ() {
        AT1 at1 = (AT1) this.LJLILLLLZI.getValue();
        if (at1 != null) {
            return at1.LIZJ;
        }
        return R.attr.gp;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        AS9 as9;
        AT1 at1 = (AT1) this.LJLILLLLZI.getValue();
        if (at1 != null) {
            return at1.LIZ;
        }
        C26276ASy c26276ASy = this.LJLIL;
        if (c26276ASy != null && (as9 = c26276ASy.LIZ) != null) {
            return as9.LJLIL;
        }
        return -1;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJIJ() {
        AS9 as9;
        AT1 at1 = (AT1) this.LJLILLLLZI.getValue();
        if (at1 != null) {
            return at1.LIZIZ;
        }
        C26276ASy c26276ASy = this.LJLIL;
        if (c26276ASy != null && (as9 = c26276ASy.LIZ) != null) {
            return as9.LJLIL;
        }
        return -1;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJJII() {
        AS9 as9;
        C26276ASy c26276ASy = this.LJLIL;
        if (c26276ASy != null && (as9 = c26276ASy.LIZ) != null) {
            return as9.LJLILLLLZI;
        }
        return -1;
    }

    @Override // X.InterfaceC62486Ofi
    public final String key() {
        AS9 as9;
        String str;
        C26276ASy c26276ASy = this.LJLIL;
        if (c26276ASy == null || (as9 = c26276ASy.LIZ) == null || (str = as9.LJLJI) == null) {
            return "";
        }
        return str;
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC41317GJl LJIILIIL() {
        return EnumC41317GJl.LongPress;
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC26273ASv LJIILLIIL() {
        return EnumC26273ASv.NORMAL;
    }

    public AT0(C26276ASy c26276ASy) {
        this.LJLIL = c26276ASy;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIIZ(TextView textView) {
        C62485Ofh.LJ(this, textView);
    }

    @Override // X.InterfaceC62486Ofi
    public final void onClick(View view) {
        ASG asg;
        o.LJIIIZ(view, "view");
        C26276ASy c26276ASy = this.LJLIL;
        if (c26276ASy != null && (asg = c26276ASy.LIZIZ) != null) {
            asg.LIZIZ(view);
        }
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
