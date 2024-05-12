package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C58096Mr6;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.ss.android.ugc.aweme.api.IZeroRatingMainService;
import com.ss.android.ugc.aweme.zerorating.ZeroRatingMainServiceImpl;
import java.util.List;

/* loaded from: classes7.dex */
public final class ZeroRatingMainTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "ZeroRatingMainTask";
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
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final void run(Context context) {
        IZeroRatingMainService iZeroRatingMainService;
        Object LIZ = C58096Mr6.LIZ(IZeroRatingMainService.class, false);
        if (LIZ != null) {
            iZeroRatingMainService = (IZeroRatingMainService) LIZ;
        } else {
            if (C58096Mr6.o8 == null) {
                synchronized (IZeroRatingMainService.class) {
                    if (C58096Mr6.o8 == null) {
                        C58096Mr6.o8 = new ZeroRatingMainServiceImpl();
                    }
                }
            }
            iZeroRatingMainService = C58096Mr6.o8;
        }
        iZeroRatingMainService.LIZ();
    }
}
