package com.ss.android.ugc.aweme.notice.api;

import X.AnonymousClass030;
import X.EFM;
import X.EFN;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.LQS;
import android.content.Context;
import java.util.List;

/* loaded from: classes7.dex */
public final class NoticeCountFetchManager$coldStartCombineRequest$1 implements EFM {
    @Override // X.EEY
    public final String key() {
        return "NoticeCountFetchManager$coldStartCombineRequest$1";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "request_";
    }

    @Override // X.EEY
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.EEY
    public final /* synthetic */ int targetProcess() {
        return AnonymousClass030.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return AnonymousClass030.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EFM
    public final EFN type() {
        return EFN.NORMAL;
    }

    @Override // X.EFM
    public final void LIZJ(Context context, boolean z) {
        LQS.LIZ(1, false);
    }
}
