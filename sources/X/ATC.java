package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ATC implements InterfaceC62486Ofi {
    public final ATJ LJLIL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 1155));

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
    public final int LJFF() {
        ATI ati;
        C2068389v c2068389v;
        AT1 at1 = (AT1) this.LJLILLLLZI.getValue();
        if (at1 != null) {
            return at1.LIZ;
        }
        ATJ atj = this.LJLIL;
        if (atj != null && (ati = atj.LIZ) != null && (c2068389v = ati.LJLIL) != null) {
            return c2068389v.LIZ;
        }
        return -1;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJIJ() {
        ATI ati;
        C2068389v c2068389v;
        AT1 at1 = (AT1) this.LJLILLLLZI.getValue();
        if (at1 != null) {
            return at1.LIZIZ;
        }
        ATJ atj = this.LJLIL;
        if (atj != null && (ati = atj.LIZ) != null && (c2068389v = ati.LJLIL) != null) {
            return c2068389v.LIZ;
        }
        return -1;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJJII() {
        ATI ati;
        ATJ atj = this.LJLIL;
        if (atj != null && (ati = atj.LIZ) != null) {
            return ati.LJLILLLLZI;
        }
        return -1;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean enable() {
        ATJ atj = this.LJLIL;
        if (atj != null) {
            return atj.LIZJ;
        }
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final String key() {
        ATI ati;
        String str;
        ATJ atj = this.LJLIL;
        if (atj == null || (ati = atj.LIZ) == null || (str = ati.LJLJJI) == null) {
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

    public ATC(ATJ atj) {
        this.LJLIL = atj;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIIZ(TextView textView) {
        C62485Ofh.LJ(this, textView);
    }

    @Override // X.InterfaceC62486Ofi
    public final void onClick(View view) {
        ASG asg;
        o.LJIIIZ(view, "view");
        ATJ atj = this.LJLIL;
        if (atj != null && (asg = atj.LIZIZ) != null) {
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
    public final void LJIIZILJ(ImageView iconView, View view, int i) {
        ASG asg;
        o.LJIIIZ(iconView, "iconView");
        C62485Ofh.LIZLLL(iconView, view);
        ATJ atj = this.LJLIL;
        if (atj != null && (asg = atj.LIZIZ) != null) {
            asg.LIZJ(iconView, view, i);
        }
    }
}
