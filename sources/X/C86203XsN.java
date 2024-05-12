package X;

import Y.IDCListenerS54S0200000_15;
import android.content.Context;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.mine.MineNavBarNicknameAssem;
import com.ss.android.ugc.aweme.setting.verification.VerificationResponse;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.XsN, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86203XsN extends C78915Uy7 {
    public final /* synthetic */ MineNavBarNicknameAssem LJLILLLLZI;
    public final /* synthetic */ User LJLJI;

    @Override // X.C78915Uy7
    public final void LJJII() {
    }

    @Override // X.C78915Uy7
    public final void LJJIII(VerificationResponse verificationResponse) {
        Resources resources;
        ActivityC45651qj LJIIIIZZ;
        Resources resources2;
        String str;
        String str2;
        Resources resources3;
        Resources resources4;
        Resources resources5;
        o.LJIIIZ(verificationResponse, "verificationResponse");
        if (verificationResponse.isEmpty()) {
            this.LJLILLLLZI.A3(this.LJLJI);
            return;
        }
        String str3 = null;
        if (verificationResponse.isCerting() || verificationResponse.isCertedAgain()) {
            ActivityC45651qj LJIIIIZZ2 = C55096Ljo.LJIIIIZZ(this.LJLILLLLZI);
            if (LJIIIIZZ2 == null) {
                return;
            }
            MineNavBarNicknameAssem mineNavBarNicknameAssem = this.LJLILLLLZI;
            C26045AKb c26045AKb = new C26045AKb(LJIIIIZZ2);
            Context context = mineNavBarNicknameAssem.getContext();
            if (context != null && (resources = context.getResources()) != null) {
                str3 = resources.getString(R.string.q58);
            }
            c26045AKb.LJIIIZ(str3);
            c26045AKb.LJIIJ();
            return;
        }
        if (verificationResponse.isCerted()) {
            if (C213948aU.LIZ()) {
                Context context2 = this.LJLILLLLZI.getContext();
                if (context2 != null && (resources5 = context2.getResources()) != null) {
                    str = resources5.getString(R.string.q55);
                } else {
                    str = null;
                }
                Context context3 = this.LJLILLLLZI.getContext();
                if (context3 != null && (resources4 = context3.getResources()) != null) {
                    str2 = resources4.getString(R.string.q54);
                } else {
                    str2 = null;
                }
                if (str != null && str2 != null) {
                    if (C55096Ljo.LJIIIIZZ(this.LJLILLLLZI) == null) {
                        ActivityC45651qj LJIIIIZZ3 = C55096Ljo.LJIIIIZZ(this.LJLILLLLZI);
                        if (LJIIIIZZ3 != null) {
                            MineNavBarNicknameAssem mineNavBarNicknameAssem2 = this.LJLILLLLZI;
                            C26045AKb c26045AKb2 = new C26045AKb(LJIIIIZZ3);
                            Context context4 = mineNavBarNicknameAssem2.getContext();
                            if (context4 != null && (resources3 = context4.getResources()) != null) {
                                str3 = resources3.getString(R.string.q58);
                            }
                            c26045AKb2.LJIIIZ(str3);
                            c26045AKb2.LJIIJ();
                            return;
                        }
                        return;
                    }
                    ActivityC45651qj LJIIIIZZ4 = C55096Ljo.LJIIIIZZ(this.LJLILLLLZI);
                    o.LJI(LJIIIIZZ4);
                    C62905OmT c62905OmT = new C62905OmT(LJIIIIZZ4);
                    c62905OmT.LIZJ = str2;
                    c62905OmT.LIZIZ = str;
                    c62905OmT.LJIIJJI(R.string.q57, new IDCListenerS54S0200000_15(this.LJLJI, this.LJLILLLLZI, 0), false);
                    c62905OmT.LJII(R.string.cg_, null);
                    new C62906OmU(c62905OmT).LIZLLL();
                    return;
                }
            }
            this.LJLILLLLZI.A3(this.LJLJI);
            return;
        }
        if (!verificationResponse.isUpdating() || (LJIIIIZZ = C55096Ljo.LJIIIIZZ(this.LJLILLLLZI)) == null) {
            return;
        }
        MineNavBarNicknameAssem mineNavBarNicknameAssem3 = this.LJLILLLLZI;
        C26045AKb c26045AKb3 = new C26045AKb(LJIIIIZZ);
        Context context5 = mineNavBarNicknameAssem3.getContext();
        if (context5 != null && (resources2 = context5.getResources()) != null) {
            str3 = resources2.getString(R.string.q59);
        }
        c26045AKb3.LJIIIZ(str3);
        c26045AKb3.LJIIJ();
    }

    public C86203XsN(User user, MineNavBarNicknameAssem mineNavBarNicknameAssem) {
        this.LJLILLLLZI = mineNavBarNicknameAssem;
        this.LJLJI = user;
    }
}
