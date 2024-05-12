package X;

import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.XiL, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85581XiL implements InterfaceC85998Xp4 {
    public final /* synthetic */ R6A LJLIL;
    public final /* synthetic */ SignupViewModel LJLILLLLZI;

    public C85581XiL(R6A r6a, SignupViewModel signupViewModel) {
        this.LJLIL = r6a;
        this.LJLILLLLZI = signupViewModel;
    }

    @Override // X.InterfaceC85998Xp4
    public final String LIZIZ(C17900n4 c17900n4) {
        Object obj;
        String str;
        R6A r6a = this.LJLIL;
        Object[] objArr = (Object[]) c17900n4.LIZJ;
        if (objArr != null && objArr.length != 0) {
            obj = objArr[0];
        } else {
            obj = null;
        }
        o.LJIIIIZZ(obj, "command.firstArg");
        String str2 = (String) obj;
        this.LJLILLLLZI.getClass();
        if (C62783OkV.LIZ()) {
            str = "signup_login";
        } else {
            str = "login";
        }
        r6a.LJJJLZIJ(false, str2, "click_login", str, this.LJLILLLLZI.kv0());
        return "";
    }
}
