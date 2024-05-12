package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R92<T> implements InterfaceC73518StG {
    public final /* synthetic */ InterfaceC69056R8i LIZ;
    public final /* synthetic */ Fragment LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ String LJ;

    public R92(BaseUpdatePasswordFragment baseUpdatePasswordFragment, BaseUpdatePasswordFragment baseUpdatePasswordFragment2, String str, String str2, String str3) {
        this.LIZ = baseUpdatePasswordFragment2;
        this.LIZIZ = baseUpdatePasswordFragment;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        C69064R8q c69064R8q = new C69064R8q(this.LIZ, c73516StE);
        this.LIZ.bi(c69064R8q);
        Context context = this.LIZIZ.getContext();
        if (context != null) {
            String ticket = this.LIZJ;
            String pwd = this.LIZLLL;
            String str = this.LJ;
            o.LJIIIZ(ticket, "ticket");
            o.LJIIIZ(pwd, "pwd");
            R94 r94 = new R94(ticket, pwd, str);
            QQN qqn = new QQN();
            qqn.LIZ = C77412UZs.LJIJJLI("/passport/password/change/");
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty("")) {
                hashMap.put("captcha", "");
            }
            String LIZIZ = C38354F3m.LIZIZ(ticket);
            o.LJIIIIZZ(LIZIZ, "encryptWithXor(queryObj.mCode)");
            hashMap.put("ticket", LIZIZ);
            String LIZIZ2 = C38354F3m.LIZIZ(pwd);
            o.LJIIIIZZ(LIZIZ2, "encryptWithXor(queryObj.mPassword)");
            hashMap.put("password", LIZIZ2);
            hashMap.put("mix_mode", "1");
            if (str == null || str.length() == 0) {
                hashMap.put("rules_version", "v2");
            } else {
                hashMap.put("rule_strategies", str);
            }
            qqn.LIZLLL(hashMap);
            new R93(context, qqn.LJFF(), r94, c69064R8q).LJIIIZ();
        }
    }
}
