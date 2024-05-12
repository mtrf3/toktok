package X;

import com.ss.android.ugc.aweme.setting.services.ISettingDependService;
import com.ss.android.ugc.aweme.setting.services.SettingDependServiceImpl;
import java.util.List;

/* renamed from: X.Ksf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53097Ksf implements ISettingDependService {
    public static final C53097Ksf LIZIZ = new C53097Ksf();
    public final /* synthetic */ ISettingDependService LIZ;

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingDependService
    public final List<String> LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingDependService
    public final List<String> LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ISettingDependService
    public final String LIZJ() {
        return this.LIZ.LIZJ();
    }

    public C53097Ksf() {
        ISettingDependService iSettingDependService;
        Object LIZ = C58096Mr6.LIZ(ISettingDependService.class, false);
        if (LIZ != null) {
            iSettingDependService = (ISettingDependService) LIZ;
        } else {
            if (C58096Mr6.z6 == null) {
                synchronized (ISettingDependService.class) {
                    if (C58096Mr6.z6 == null) {
                        C58096Mr6.z6 = new SettingDependServiceImpl();
                    }
                }
            }
            iSettingDependService = C58096Mr6.z6;
        }
        this.LIZ = iSettingDependService;
    }
}
