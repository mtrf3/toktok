package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C33778DNm;
import X.C33949DUb;
import X.E3F;
import X.EE1;
import X.EE4;
import X.EE8;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import Y.AObjectS22S0001000_6;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import java.util.List;
import java.util.Objects;

/* loaded from: classes7.dex */
public class ColdBootPreloadInstanceTask implements EE1, EE8 {
    public static final ColdBootPreloadInstanceTask LJLJJI = new ColdBootPreloadInstanceTask();
    public FeedRecommendFragment LJLIL;
    public Fragment LJLILLLLZI;
    public long LJLJI = 500;

    @Override // X.EE8
    public final boolean LJ() {
        return true;
    }

    @Override // X.EEY
    public final String key() {
        return "ColdBootPreloadInstanceTask";
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
    public final /* synthetic */ int targetProcess() {
        return C0RN.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EE1
    public final EFK type() {
        boolean z;
        if ((C33778DNm.LIZ() & 8) == 8) {
            z = true;
        } else {
            z = false;
        }
        EFK efk = (EFK) E3F.LIZJ("PreloadInstanceTask_idleOpt", new AObjectS22S0001000_6(2, 1), new AObjectS22S0001000_6(1, 10), z);
        Objects.requireNonNull(efk);
        return efk;
    }

    @Override // X.EEY
    public final boolean meetTrigger() {
        if (C33949DUb.LIZJ()) {
            return false;
        }
        return true;
    }

    @Override // X.EE8
    public final long LJII() {
        return this.LJLJI;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE8
    public final EE4 threadType() {
        return EE4.CPU;
    }

    @Override // X.EE8
    public final void LIZLLL(Long l) {
        this.LJLJI = l.longValue();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:15:0x005f
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:275)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:68)
        */
    @Override // X.EEY
    public final void run(android.content.Context r4) {
        /*
            r3 = this;
            X.Ol8 r0 = X.C34710Djm.LJIJI
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.booleanValue()
            X.Ol8 r0 = X.C35183DrP.LJ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L20
            com.ss.android.ugc.aweme.services.IExternalService r0 = com.ss.android.ugc.aweme.out.AVExternalServiceImpl.LIZ()
            r0.specialPlusService()
        L20:
            X.Ol8 r0 = X.C35183DrP.LJI
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L35
            com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment r0 = new com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment
            r0.<init>()
            r3.LJLIL = r0
        L35:
            X.Ol8 r0 = X.C35183DrP.LJII
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4d
            com.ss.android.ugc.aweme.service.IFollowFeedService r0 = com.ss.android.ugc.aweme.follow.service.FollowFeedServiceImpl.LJIILL()
            androidx.fragment.app.Fragment r0 = r0.LJ()
            r3.LJLILLLLZI = r0
        L4d:
            X.Ol8 r0 = X.C34710Djm.LJIIJJI
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L67
            boolean r0 = X.C38686FGg.LJ
            if (r0 == 0) goto L67
        L60:
            X.FcR r0 = X.C38986FRu.LIZ()     // Catch: java.lang.Throwable -> L67
            r0.LIZ()     // Catch: java.lang.Throwable -> L67
        L67:
            X.Ol8 r0 = X.C92F.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L77
        L76:
            return
        L77:
            java.util.concurrent.ExecutorService r2 = X.C38995FSd.LIZJ()
            Y.ARunnableS8S0000000_1 r1 = new Y.ARunnableS8S0000000_1
            r0 = 3
            r1.<init>(r0)
            r2.submit(r1)
            goto L76
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.legoImp.task.ColdBootPreloadInstanceTask.run(android.content.Context):void");
    }
}
