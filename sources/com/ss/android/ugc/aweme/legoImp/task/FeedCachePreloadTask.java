package com.ss.android.ugc.aweme.legoImp.task;

import X.C0RN;
import X.C36358EOs;
import X.EE1;
import X.EE4;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FMW;
import X.FW5;
import X.InterfaceC36076EDw;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.FeedApiService;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.List;
import kotlin.jvm.internal.AqS156S0100000_6;

/* loaded from: classes7.dex */
public final class FeedCachePreloadTask implements EE1, InterfaceC36076EDw {
    public final int LJLIL;
    public final int LJLILLLLZI;

    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "FeedCachePreloadTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ int priority() {
        return 1;
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
        if (this.LJLIL == 2) {
            return EFK.BOOT_FINISH;
        }
        return EFK.BACKGROUND;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.InterfaceC36076EDw
    public final EE4 threadType() {
        return EE4.IO;
    }

    public final FeedItemList LIZLLL(int i) {
        try {
            FeedItemList fetchFeedList = FeedApiService.LIZ().fetchFeedList(0, 0L, 0L, 6, null, null, i, 0, "", null, null, 0L, C36358EOs.LIZ, null, Boolean.FALSE, this.LJLILLLLZI, null);
            if (i == 4) {
                FW5.LJIIJJI(0, fetchFeedList.getRequestId(), fetchFeedList.getItems());
                return fetchFeedList;
            }
            return fetchFeedList;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // X.EEY
    public final void run(Context context) {
        FMW.LIZJ(new AqS156S0100000_6(this, 46));
    }

    public FeedCachePreloadTask(int i, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }
}
