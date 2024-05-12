package com.ss.android.ugc.aweme.request_combine.request.individual;

import X.AnonymousClass030;
import X.C36242EKg;
import X.EFM;
import X.EFN;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes7.dex */
public final class FetchComplianceSettingRequest implements EFM {
    public final EFN LJLIL;

    @Override // X.EEY
    public final String key() {
        return "FetchComplianceSettingRequest";
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
        return this.LJLIL;
    }

    public FetchComplianceSettingRequest(EFN requestType) {
        o.LJIIIZ(requestType, "requestType");
        this.LJLIL = requestType;
    }

    @Override // X.EFM
    public final void LIZJ(Context context, boolean z) {
        a.LJIIZILJ().LJIIIIZZ(new C36242EKg(), 0);
    }
}
