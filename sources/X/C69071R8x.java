package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.setpwd.BaseUpdatePasswordFragment;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.R8x, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69071R8x<T> implements InterfaceC73518StG {
    public final /* synthetic */ InterfaceC69056R8i LIZ;
    public final /* synthetic */ Fragment LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ String LJ;

    public C69071R8x(BaseUpdatePasswordFragment baseUpdatePasswordFragment, BaseUpdatePasswordFragment baseUpdatePasswordFragment2, String str, String str2, String str3) {
        this.LIZ = baseUpdatePasswordFragment2;
        this.LIZIZ = baseUpdatePasswordFragment;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        C69063R8p c69063R8p = new C69063R8p(this.LIZ, c73516StE);
        this.LIZ.bi(c69063R8p);
        Context context = this.LIZIZ.getContext();
        if (context != null) {
            String ticket = this.LIZJ;
            String pwd = this.LIZLLL;
            String str = this.LJ;
            o.LJIIIZ(ticket, "ticket");
            o.LJIIIZ(pwd, "pwd");
            C69072R8y c69072R8y = new C69072R8y(ticket, pwd, str);
            QQN qqn = new QQN();
            qqn.LIZ = "/passport/email/change_password/";
            HashMap hashMap = new HashMap();
            String LIZIZ = C38354F3m.LIZIZ(ticket);
            o.LJIIIIZZ(LIZIZ, "encryptWithXor(queryObj.ticket)");
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
            new C69070R8w(context, qqn.LJFF(), c69072R8y, c69063R8p).LJIIIZ();
        }
    }
}
