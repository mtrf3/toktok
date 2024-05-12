package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.offlinemode.IOfflineModeSwitchAbility;
import com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService;
import com.ss.android.ugc.aweme.offlinemode.service.OfflineModeServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.YAp, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86951YAp implements IOfflineModeService {
    public static final C86951YAp LIZIZ = new C86951YAp();
    public final /* synthetic */ IOfflineModeService LIZ;

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final EE1 LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final String LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final void LIZJ(Activity activity) {
        this.LIZ.LIZJ(activity);
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final void LIZLLL(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this.LIZ.LIZLLL(fragment);
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final boolean LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final IOfflineModeSwitchAbility LJFF(InterfaceC55235Lm3 vScope) {
        o.LJIIIZ(vScope, "vScope");
        return this.LIZ.LJFF(vScope);
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final void LJI() {
        this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final long LJII() {
        return this.LIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final void LJIIIIZZ(ActivityC45651qj activityC45651qj) {
        this.LIZ.LJIIIIZZ(activityC45651qj);
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final InterfaceC65350Pko<? extends UIContentAssem> LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final InterfaceC65350Pko<? extends C8W0> LJIIJ() {
        return this.LIZ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.service.IOfflineModeService
    public final String getSceneId() {
        return this.LIZ.getSceneId();
    }

    public C86951YAp() {
        IOfflineModeService iOfflineModeService;
        Object LIZ = C58096Mr6.LIZ(IOfflineModeService.class, false);
        if (LIZ != null) {
            iOfflineModeService = (IOfflineModeService) LIZ;
        } else {
            if (C58096Mr6.H3 == null) {
                synchronized (IOfflineModeService.class) {
                    if (C58096Mr6.H3 == null) {
                        C58096Mr6.H3 = new OfflineModeServiceImpl();
                    }
                }
            }
            iOfflineModeService = C58096Mr6.H3;
        }
        this.LIZ = iOfflineModeService;
    }
}
