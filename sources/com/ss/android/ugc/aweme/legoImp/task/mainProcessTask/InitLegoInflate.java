package com.ss.android.ugc.aweme.legoImp.task.mainProcessTask;

import X.C0RN;
import X.C36093EEn;
import X.C39068FUy;
import X.DOI;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.LEJ;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.CommonFeedLaunchServiceImpl;
import com.ss.android.ugc.aweme.homepage.experiment.HomepageExperimentServiceImpl;
import com.ss.android.ugc.aweme.homepage.ui.inflate.X2CFragmentMainPageIcon;
import com.ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class InitLegoInflate implements EE1 {
    public static final C39068FUy LJLIL = new C39068FUy();
    public static final AtomicBoolean LJLILLLLZI = new AtomicBoolean(false);

    @Override // X.EEY
    public final String key() {
        return "InitLegoInflate";
    }

    @Override // X.EEY
    public final boolean meetTrigger() {
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
        return EFK.MAIN;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (!DOI.LIZIZ()) {
            LJLIL.LIZ(context);
        }
        HomepageExperimentServiceImpl.LIZIZ().initLegoInflate();
        CommonFeedLaunchServiceImpl.LJ().LIZJ();
        NoticeServiceImpl.LJJJJJ().initLegoInflate();
        LEJ.LIZ().initLegoInflate();
        C36093EEn.LIZ.LIZ(X2CFragmentMainPageIcon.class, new X2CFragmentMainPageIcon());
    }
}
