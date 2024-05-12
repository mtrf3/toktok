package X;

import com.google.gson.m;
import com.ss.android.ugc.aweme.settingsrequest.AbTestManagerApiImpl;
import com.ss.android.ugc.aweme.settingsrequest.api.IAbTestManagerApi;

/* renamed from: X.F7l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38457F7l implements IAbTestManagerApi {
    public static final C38457F7l LIZIZ = new C38457F7l();
    public final /* synthetic */ IAbTestManagerApi LIZ;

    @Override // com.ss.android.ugc.aweme.setting.IAbTestManager
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.setting.IAbTestManager
    public final void LIZIZ(m mVar) {
        this.LIZ.LIZIZ(mVar);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.IAbTestManagerApi
    public final boolean LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.setting.IAbTestManager
    public final void LIZLLL(boolean z) {
        this.LIZ.LIZLLL(true);
    }

    @Override // com.ss.android.ugc.aweme.setting.IAbTestManager
    public final void LJ(InterfaceC38454F7i interfaceC38454F7i) {
        this.LIZ.LJ(interfaceC38454F7i);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.IAbTestManagerApi
    public final boolean isContainsKeyWithLruEntries() {
        return this.LIZ.isContainsKeyWithLruEntries();
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.IAbTestManagerApi
    public final boolean isReplaceAwemeCache() {
        return this.LIZ.isReplaceAwemeCache();
    }

    public C38457F7l() {
        IAbTestManagerApi iAbTestManagerApi;
        Object LIZ = C58096Mr6.LIZ(IAbTestManagerApi.class, false);
        if (LIZ != null) {
            iAbTestManagerApi = (IAbTestManagerApi) LIZ;
        } else {
            if (C58096Mr6.D6 == null) {
                synchronized (IAbTestManagerApi.class) {
                    if (C58096Mr6.D6 == null) {
                        C58096Mr6.D6 = new AbTestManagerApiImpl();
                    }
                }
            }
            iAbTestManagerApi = C58096Mr6.D6;
        }
        this.LIZ = iAbTestManagerApi;
    }
}
