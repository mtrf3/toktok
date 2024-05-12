package com.bytedance.awemelobby;

import X.C48841JEv;
import X.C58096Mr6;
import X.C63402eG;
import X.C78613UtF;
import X.InterfaceC88472Yns;
import X.XKX;
import android.util.Base64;
import com.bytedance.lobby.ILobbyNonceGenerator;
import com.ss.android.ugc.aweme.account.interfaces.IAccountNonceUtil;
import com.ss.android.ugc.aweme.account.login.twostep.nonce.AccountNonceUtilImpl;
import java.security.SecureRandom;

/* loaded from: classes11.dex */
public final class LobbyNonceGenerator implements ILobbyNonceGenerator {
    public static ILobbyNonceGenerator LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(ILobbyNonceGenerator.class, false);
        if (LIZ != null) {
            return (ILobbyNonceGenerator) LIZ;
        }
        if (C58096Mr6.LIZJ == null) {
            synchronized (ILobbyNonceGenerator.class) {
                if (C58096Mr6.LIZJ == null) {
                    C58096Mr6.LIZJ = new LobbyNonceGenerator();
                }
            }
        }
        return C58096Mr6.LIZJ;
    }

    @Override // com.bytedance.lobby.ILobbyNonceGenerator
    public final void LIZ(InterfaceC88472Yns interfaceC88472Yns) {
        IAccountNonceUtil iAccountNonceUtil;
        Object LIZ = C58096Mr6.LIZ(IAccountNonceUtil.class, false);
        if (LIZ != null) {
            iAccountNonceUtil = (IAccountNonceUtil) LIZ;
        } else {
            if (C58096Mr6.LJLJI == null) {
                synchronized (IAccountNonceUtil.class) {
                    if (C58096Mr6.LJLJI == null) {
                        C58096Mr6.LJLJI = new AccountNonceUtilImpl();
                    }
                }
            }
            iAccountNonceUtil = C58096Mr6.LJLJI;
        }
        if (iAccountNonceUtil.LIZIZ()) {
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C63402eG(iAccountNonceUtil, "google", interfaceC88472Yns, null), 3);
            return;
        }
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        interfaceC88472Yns.invoke(Base64.encodeToString(bArr, 10));
    }
}
