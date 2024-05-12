package X;

import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.settingsrequest.SettingsLegacyImpl;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi;
import com.ss.android.ugc.aweme.settingsrequest.model.PopupSetting;
import java.util.List;

/* renamed from: X.Yp4, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88546Yp4 implements ISettingsLegacyApi {
    public static final C88546Yp4 LIZIZ = new C88546Yp4();
    public final /* synthetic */ ISettingsLegacyApi LIZ;

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi
    public final List<InterfaceC37286EkE> LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi
    public final C100023wE LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi
    public final PopupSetting LIZJ(String str) {
        return this.LIZ.LIZJ(str);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi
    public final int LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi
    public final void LJ(WeakHandler weakHandler, int i, int i2) {
        this.LIZ.LJ(weakHandler, i, i2);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi
    public final EE1 getRegisterStorageTask() {
        return this.LIZ.getRegisterStorageTask();
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi
    public final void preloadPushSettingsManager() {
        this.LIZ.preloadPushSettingsManager();
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsLegacyApi
    public final boolean shouldUseRecyclerPartialUpdate() {
        return this.LIZ.shouldUseRecyclerPartialUpdate();
    }

    public C88546Yp4() {
        ISettingsLegacyApi iSettingsLegacyApi;
        Object LIZ = C58096Mr6.LIZ(ISettingsLegacyApi.class, false);
        if (LIZ != null) {
            iSettingsLegacyApi = (ISettingsLegacyApi) LIZ;
        } else {
            if (C58096Mr6.G6 == null) {
                synchronized (ISettingsLegacyApi.class) {
                    if (C58096Mr6.G6 == null) {
                        C58096Mr6.G6 = new SettingsLegacyImpl();
                    }
                }
            }
            iSettingsLegacyApi = C58096Mr6.G6;
        }
        this.LIZ = iSettingsLegacyApi;
    }
}
