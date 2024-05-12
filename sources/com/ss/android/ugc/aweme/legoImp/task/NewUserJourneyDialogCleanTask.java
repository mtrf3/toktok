package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC63764P0u;
import X.LKE;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.List;

/* loaded from: classes10.dex */
public final class NewUserJourneyDialogCleanTask implements EE1, InterfaceC63764P0u {
    public final FeedCommonService LJLIL = CommonFeedServiceImpl.LJJIJLIJ();

    @Override // X.EEY
    public final String key() {
        return "NewUserJourneyDialogCleanTask";
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

    @Override // X.InterfaceC63764P0u
    public final void onAppBackground() {
        this.LJLIL.LJJIIJ();
    }

    @Override // X.InterfaceC63764P0u
    public final void onAppForeground() {
        this.LJLIL.LJIILL();
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
        CommonFeedServiceImpl.LJJIJLIJ().LJIIIIZZ();
        ActivityStack.addNonWeakAppBackGroundListener(this);
        LKE.LIZIZ.LIZ.LJIIIIZZ("NewUserJourneyDialogCleanTask");
    }
}
