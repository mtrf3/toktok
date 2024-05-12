package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CombinedEmailSignupLoginFragment;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R9N<T> implements InterfaceC73518StG {
    public final /* synthetic */ InterfaceC69056R8i LIZ;
    public final /* synthetic */ Fragment LIZIZ;
    public final /* synthetic */ EnumC69116RAq LIZJ;
    public final /* synthetic */ EnumC69113RAn LIZLLL;
    public final /* synthetic */ String LJ;

    public R9N(CombinedEmailSignupLoginFragment combinedEmailSignupLoginFragment, EnumC69116RAq enumC69116RAq, EnumC69113RAn enumC69113RAn, CombinedEmailSignupLoginFragment combinedEmailSignupLoginFragment2, String str) {
        this.LIZ = combinedEmailSignupLoginFragment2;
        this.LIZIZ = combinedEmailSignupLoginFragment;
        this.LIZJ = enumC69116RAq;
        this.LIZLLL = enumC69113RAn;
        this.LJ = str;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        R9L r9l = new R9L(c73516StE, this.LIZJ, this.LIZLLL);
        this.LIZ.bi(r9l);
        Context context = this.LIZIZ.getContext();
        if (context != null) {
            String username = this.LJ;
            o.LJIIIZ(username, "username");
            C69078R9e c69078R9e = new C69078R9e(username);
            QQN qqn = new QQN();
            qqn.LIZ = C77412UZs.LJIJJLI("/passport/user/check_login_name_registered/");
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(c69078R9e.LJFF)) {
                String LIZIZ = C38354F3m.LIZIZ(c69078R9e.LJFF);
                o.LJIIIIZZ(LIZIZ, "encryptWithXor(queryObj.username)");
                hashMap.put("login_name", LIZIZ);
            }
            hashMap.put("mix_mode", "1");
            qqn.LIZLLL(hashMap);
            new R9M(context, qqn.LIZIZ(), c69078R9e, r9l).LJIIIZ();
        }
    }
}
