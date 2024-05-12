package X;

import com.ss.android.ugc.aweme.setting.UpdateSettingServiceImpl;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.setting.services.IUpdateSettingService;
import kotlin.jvm.internal.o;

/* renamed from: X.Xo8, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85940Xo8 implements IUpdateSettingService {
    public static final C85940Xo8 LIZIZ = new C85940Xo8();
    public final /* synthetic */ IUpdateSettingService LIZ;

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final void LIZ(int i, String str) {
        this.LIZ.LIZ(i, str);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final int LIZIZ(String str) {
        return this.LIZ.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final void LIZJ(PushSettings settings) {
        o.LJIIIZ(settings, "settings");
        this.LIZ.LIZJ(settings);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final int LIZLLL(String itemId) {
        o.LJIIIZ(itemId, "itemId");
        return this.LIZ.LIZLLL(itemId);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final PushSettings LJ() {
        return this.LIZ.LJ();
    }

    public C85940Xo8() {
        IUpdateSettingService iUpdateSettingService;
        Object LIZ = C58096Mr6.LIZ(IUpdateSettingService.class, false);
        if (LIZ != null) {
            iUpdateSettingService = (IUpdateSettingService) LIZ;
        } else {
            if (C58096Mr6.t6 == null) {
                synchronized (IUpdateSettingService.class) {
                    if (C58096Mr6.t6 == null) {
                        C58096Mr6.t6 = new UpdateSettingServiceImpl();
                    }
                }
            }
            iUpdateSettingService = C58096Mr6.t6;
        }
        this.LIZ = iUpdateSettingService;
    }
}
