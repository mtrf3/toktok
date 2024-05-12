package com.ss.android.ugc.aweme.contact.helper;

import X.AnonymousClass030;
import X.C74352vv;
import X.C85913Yt;
import X.EFM;
import X.EFN;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.XKX;
import android.content.Context;
import java.util.List;

/* loaded from: classes2.dex */
public final class IMContactListRequest implements EFM {
    @Override // X.EEY
    public final String key() {
        return "IMContactListRequest";
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
        C85913Yt.LIZ.getClass();
        XKX.LIZLLL(C85913Yt.LIZIZ, null, null, new C74352vv(null), 3);
    }
}
