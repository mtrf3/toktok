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

/* renamed from: X.Oj4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62694Oj4 implements InterfaceC62486Ofi, InterfaceC62699Oj9 {
    public final Aweme LJLIL;
    public final String LJLILLLLZI;
    public final C62693Oj3 LJLJI;

    @Override // X.InterfaceC62486Ofi
    public final void LJ() {
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        return R.drawable.c5_;
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
        return R.drawable.c5_;
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
        return R.string.ca1;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJIII(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJJIIJZLJL() {
        return false;
    }

    @Override // X.InterfaceC62699Oj9
    public final void LJJIJ() {
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean enable() {
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final String key() {
        return "blacklist";
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

    @Override // X.InterfaceC62699Oj9
    public final void LJIL(Exception exc) {
        C1A7.LJIJJ(EF7.LIZIZ(), exc);
    }

    @Override // X.InterfaceC62486Ofi
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
    }

    public C62694Oj4(Aweme aweme, String eventType) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(eventType, "eventType");
        this.LJLIL = aweme;
        this.LJLILLLLZI = eventType;
        this.LJLJI = new C62693Oj3(new C62696Oj6(), this);
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
        String LIZ = C29822Bn8.LIZ(context, R.string.ca1, "context.resources.getString(R.string.blacklist)");
        String LIZ2 = C29822Bn8.LIZ(context, R.string.ca2, "context.resources.getStr…tring.blacklist_user_msg)");
        String LIZ3 = C29822Bn8.LIZ(context, R.string.ca1, "context.resources.getString(R.string.blacklist)");
        IDCListenerS162S0100000_10 iDCListenerS162S0100000_10 = new IDCListenerS162S0100000_10(this, 8);
        C62905OmT c62905OmT = new C62905OmT(context);
        c62905OmT.LIZIZ = LIZ;
        c62905OmT.LIZJ = LIZ2;
        c62905OmT.LJIIIIZZ = new C62907OmV(iDCListenerS162S0100000_10, LIZ3, false);
        c62905OmT.LJII(R.string.cg_, DialogInterfaceOnClickListenerC62700OjA.LJLIL);
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
