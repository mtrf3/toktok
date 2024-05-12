package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.Ohe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62606Ohe implements InterfaceC62486Ofi {
    public final AbstractC62607Ohf LJLIL;
    public final C29930Bos LJLILLLLZI;

    @Override // X.InterfaceC62486Ofi
    public final void LJ() {
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
        return this.LJLIL.LIZLLL();
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJI() {
        return this.LJLIL.LIZ();
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJJII() {
        return this.LJLIL.LJFF();
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean enable() {
        return this.LJLIL.LIZIZ();
    }

    @Override // X.InterfaceC62486Ofi
    public final String key() {
        String LJ = this.LJLIL.LJ();
        o.LJIIIIZZ(LJ, "liveShareSheetAction.key()");
        return LJ;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LIZ() {
        return C62485Ofh.LIZIZ();
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJIJ() {
        return LJFF();
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

    public C62606Ohe(AbstractC62607Ohf abstractC62607Ohf, C29930Bos params) {
        o.LJIIIZ(params, "params");
        this.LJLIL = abstractC62607Ohf;
        this.LJLILLLLZI = params;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        this.LJLIL.LIZJ(context, this.LJLILLLLZI);
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
