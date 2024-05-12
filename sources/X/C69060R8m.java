package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.setpwd.VerifyPasswordFragment;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.R8m, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69060R8m<T> implements InterfaceC73518StG {
    public final /* synthetic */ InterfaceC69056R8i LIZ;
    public final /* synthetic */ Fragment LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ java.util.Map<String, String> LIZLLL;

    public C69060R8m(VerifyPasswordFragment verifyPasswordFragment, VerifyPasswordFragment verifyPasswordFragment2, String str, java.util.Map map) {
        this.LIZ = verifyPasswordFragment2;
        this.LIZIZ = verifyPasswordFragment;
        this.LIZJ = str;
        this.LIZLLL = map;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        C69058R8k c69058R8k = new C69058R8k(this.LIZ, c73516StE);
        this.LIZ.bi(c69058R8k);
        Context requireContext = this.LIZIZ.requireContext();
        o.LJIIIIZZ(requireContext, "fragment.requireContext()");
        String pwd = this.LIZJ;
        java.util.Map<String, String> map = this.LIZLLL;
        o.LJIIIZ(pwd, "pwd");
        C69061R8n c69061R8n = new C69061R8n(pwd);
        QQN qqn = new QQN();
        qqn.LIZ = C77412UZs.LJIJJLI("/passport/account/verify/");
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty("")) {
            hashMap.put("captcha", "");
        }
        String LIZIZ = C38354F3m.LIZIZ(pwd);
        o.LJIIIIZZ(LIZIZ, "encryptWithXor(queryObj.password)");
        hashMap.put("password", LIZIZ);
        hashMap.put("mix_mode", "1");
        if (map != null) {
            hashMap.putAll(map);
        }
        qqn.LIZLLL(hashMap);
        new C69059R8l(requireContext, qqn.LJFF(), c69061R8n, c69058R8k).LJIIIZ();
    }
}
