package X;

import Y.IDCListenerS54S0200000_15;
import android.content.Context;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.verification.VerificationResponse;
import com.ss.android.ugc.profile.platform.business.navbar.business.NavBarNicknameComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.XsO, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86204XsO extends C78915Uy7 {
    public final /* synthetic */ NavBarNicknameComponent LJLILLLLZI;
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
            this.LJLILLLLZI.C3(this.LJLJI);
            return;
        }
        String str3 = null;
        if (verificationResponse.isCerting() || verificationResponse.isCertedAgain()) {
            ActivityC45651qj LJIIIIZZ2 = C55096Ljo.LJIIIIZZ(this.LJLILLLLZI);
            if (LJIIIIZZ2 == null) {
                return;
            }
            NavBarNicknameComponent navBarNicknameComponent = this.LJLILLLLZI;
            C26045AKb c26045AKb = new C26045AKb(LJIIIIZZ2);
            Context context = navBarNicknameComponent.getContext();
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
                            NavBarNicknameComponent navBarNicknameComponent2 = this.LJLILLLLZI;
                            C26045AKb c26045AKb2 = new C26045AKb(LJIIIIZZ3);
                            Context context4 = navBarNicknameComponent2.getContext();
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
                    if (LJIIIIZZ4 == null) {
                        return;
                    }
                    C62905OmT c62905OmT = new C62905OmT(LJIIIIZZ4);
                    NavBarNicknameComponent navBarNicknameComponent3 = this.LJLILLLLZI;
                    User user = this.LJLJI;
                    c62905OmT.LIZJ = str2;
                    c62905OmT.LIZIZ = str;
                    c62905OmT.LJIIJJI(R.string.q57, new IDCListenerS54S0200000_15(user, navBarNicknameComponent3, 1), false);
                    c62905OmT.LJII(R.string.cg_, null);
                    new C62906OmU(c62905OmT).LIZLLL();
                    return;
                }
            }
            this.LJLILLLLZI.C3(this.LJLJI);
            return;
        }
        if (!verificationResponse.isUpdating() || (LJIIIIZZ = C55096Ljo.LJIIIIZZ(this.LJLILLLLZI)) == null) {
            return;
        }
        NavBarNicknameComponent navBarNicknameComponent4 = this.LJLILLLLZI;
        C26045AKb c26045AKb3 = new C26045AKb(LJIIIIZZ);
        Context context5 = navBarNicknameComponent4.getContext();
        if (context5 != null && (resources2 = context5.getResources()) != null) {
            str3 = resources2.getString(R.string.q59);
        }
        c26045AKb3.LJIIIZ(str3);
        c26045AKb3.LJIIJ();
    }

    public C86204XsO(User user, NavBarNicknameComponent navBarNicknameComponent) {
        this.LJLILLLLZI = navBarNicknameComponent;
        this.LJLJI = user;
    }
}
