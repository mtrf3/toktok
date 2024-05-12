package X;

import Y.IDCListenerS162S0100000_10;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Oj1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62691Oj1 implements InterfaceC62486Ofi, InterfaceC62698Oj8 {
    public final Aweme LJLIL;
    public final String LJLILLLLZI;
    public final C62692Oj2 LJLJI;

    @Override // X.InterfaceC62486Ofi
    public final void LJ() {
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        return R.drawable.c5a;
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
        return R.drawable.c5a;
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
        return R.string.q5p;
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
        return "restrict";
    }

    @Override // X.InterfaceC62486Ofi
    public final int LIZ() {
        return C62485Ofh.LIZIZ();
    }

    @Override // X.InterfaceC62698Oj8
    public final void LJJIJIIJIL() {
        Context LIZIZ = EF7.LIZIZ();
        KL2.LJ(LIZIZ, 0, LIZIZ.getString(R.string.q5s));
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

    @Override // X.InterfaceC62698Oj8
    public final void LJIILJJIL(Exception exc) {
        C1A7.LJIJJ(EF7.LIZIZ(), exc);
    }

    @Override // X.InterfaceC62486Ofi
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
    }

    public C62691Oj1(Aweme aweme, String eventType) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(eventType, "eventType");
        this.LJLIL = aweme;
        this.LJLILLLLZI = eventType;
        this.LJLJI = new C62692Oj2(new C62695Oj5(), this);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        if (!C17N.LJIIIZ(this, context, this.LJLIL, this.LJLILLLLZI)) {
            return;
        }
        C62905OmT c62905OmT = new C62905OmT(context);
        c62905OmT.LJ(R.string.q5o);
        c62905OmT.LJIIJ(R.string.q5n, new IDCListenerS162S0100000_10(this, 9));
        c62905OmT.LJII(R.string.cg_, DialogInterfaceOnClickListenerC62697Oj7.LJLIL);
        new C62906OmU(c62905OmT).LIZLLL();
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
