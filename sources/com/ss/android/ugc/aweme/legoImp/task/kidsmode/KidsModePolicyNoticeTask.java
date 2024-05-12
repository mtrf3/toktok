package com.ss.android.ugc.aweme.legoImp.task.kidsmode;

import X.C0RN;
import X.C56662Kg;
import X.C58096Mr6;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.ss.android.ugc.aweme.kids.api.common.IKidsPolicyNoticeService;
import com.ss.android.ugc.aweme.kids.intergration.common.KidsPolicyNoticeServiceImp;
import java.util.List;

/* loaded from: classes7.dex */
public final class KidsModePolicyNoticeTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "KidsModePolicyNoticeTask";
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
        IKidsPolicyNoticeService iKidsPolicyNoticeService;
        C56662Kg.LIZ().LIZJ("method_init_fetch_policy_notice_duration_kids_mode", false);
        Object LIZ = C58096Mr6.LIZ(IKidsPolicyNoticeService.class, false);
        if (LIZ != null) {
            iKidsPolicyNoticeService = (IKidsPolicyNoticeService) LIZ;
        } else {
            if (C58096Mr6.M1 == null) {
                synchronized (IKidsPolicyNoticeService.class) {
                    if (C58096Mr6.M1 == null) {
                        C58096Mr6.M1 = new KidsPolicyNoticeServiceImp();
                    }
                }
            }
            iKidsPolicyNoticeService = C58096Mr6.M1;
        }
        iKidsPolicyNoticeService.LIZ();
        C56662Kg.LIZ().LJFF("method_init_fetch_policy_notice_duration_kids_mode", false);
    }
}
