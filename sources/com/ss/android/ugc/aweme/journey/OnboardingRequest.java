package com.ss.android.ugc.aweme.journey;

import X.AbstractC39351FcR;
import X.AnonymousClass030;
import X.C221108m2;
import X.C38986FRu;
import X.C40736Fym;
import X.C40737Fyn;
import X.C5H3;
import X.EFM;
import X.EFN;
import X.EnumC221088m0;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class OnboardingRequest implements EFM {
    public static final C5H3<OnboardingRequest> LJLJJI = C221108m2.LIZ(EnumC221088m0.SYNCHRONIZED, C40737Fyn.LJLIL);
    public final AbstractC39351FcR LJLIL = C38986FRu.LIZ();
    public boolean LJLILLLLZI;
    public C40736Fym LJLJI;

    @Override // X.EEY
    public final String key() {
        return "OnboardingRequest";
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

    public final void LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLILLLLZI = true;
        this.LJLJI = new C40736Fym();
    }

    @Override // X.EFM
    public final void LIZJ(Context context, boolean z) {
        if (this.LJLIL.LIZJ() != 0 && !this.LJLIL.LIZ && !this.LJLILLLLZI) {
            LIZLLL(context);
        }
    }
}
