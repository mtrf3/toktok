package X;

import com.ss.android.ugc.aweme.launcher.service.account.IAccountApi;
import com.ss.android.ugc.aweme.launcher.serviceimpl.account.AccountImpl;
import java.util.Collection;

/* loaded from: classes7.dex */
public final class FX1 implements IAccountApi {
    public static final FX1 LIZIZ = new FX1();
    public final /* synthetic */ IAccountApi LIZ;

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final boolean LIZIZ(String str) {
        return this.LIZ.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final void LIZJ() {
        this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final void LIZLLL() {
        this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final J9O LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final String LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final void LJI(String str, String str2, String str3) {
        this.LIZ.LJI(str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final void LJII(Collection<String> collection) {
        this.LIZ.LJII(collection);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final void LJIIIIZZ(String str, boolean z) {
        this.LIZ.LJIIIIZZ(str, z);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final String getSessionId() {
        return this.LIZ.getSessionId();
    }

    public FX1() {
        IAccountApi iAccountApi;
        Object LIZ = C58096Mr6.LIZ(IAccountApi.class, false);
        if (LIZ != null) {
            iAccountApi = (IAccountApi) LIZ;
        } else {
            if (C58096Mr6.W1 == null) {
                synchronized (IAccountApi.class) {
                    if (C58096Mr6.W1 == null) {
                        C58096Mr6.W1 = new AccountImpl();
                    }
                }
            }
            iAccountApi = C58096Mr6.W1;
        }
        this.LIZ = iAccountApi;
    }
}
