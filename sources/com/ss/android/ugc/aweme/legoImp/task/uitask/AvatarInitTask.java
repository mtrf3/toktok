package com.ss.android.ugc.aweme.legoImp.task.uitask;

import X.C0RN;
import X.C53517KzR;
import X.C53518KzS;
import X.C53582L1e;
import X.C53583L1f;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;
import java.util.List;

/* loaded from: classes10.dex */
public final class AvatarInitTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "AvatarInitTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        C53583L1f.LIZ(C53582L1e.LIZIZ.LIZIZ());
        C53583L1f.LIZ(LiveOuterService.LJJJLL().LJJIII());
        C53583L1f.LIZ(ProfileServiceImpl.LIZ().getAvatarProfileAdapter());
        C53583L1f.LIZ(IMService.createIIMServicebyMonsterPlugin(false).getAvatarActiveAdapter());
        C53583L1f.LIZ(C53517KzR.LIZIZ.LIZ());
        C53583L1f.LIZ(C53518KzS.LIZIZ.LIZ());
    }
}
