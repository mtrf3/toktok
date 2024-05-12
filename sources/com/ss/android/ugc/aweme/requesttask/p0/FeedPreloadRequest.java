package com.ss.android.ugc.aweme.requesttask.p0;

import X.AnonymousClass030;
import X.C39079FVj;
import X.C54919Lgx;
import X.C56662Kg;
import X.EFM;
import X.EFN;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import java.util.List;

/* loaded from: classes7.dex */
public final class FeedPreloadRequest implements EFM {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final int LJLJJLL;
    public final String LJLJL;

    public FeedPreloadRequest() {
        this(0, null, null, null, null, null, null, 127);
    }

    @Override // X.EEY
    public final String key() {
        return "FeedPreloadRequest";
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
        return EFN.P0;
    }

    @Override // X.EFM
    public final void LIZJ(Context context, boolean z) {
        C56662Kg.LIZ().LJFF("feed_boot_to_feed_request", true);
        if (!C56662Kg.LIZ().LJII("feed_request_to_network")) {
            C56662Kg.LIZ().LIZJ("feed_request_to_network", true);
        }
        if (C56662Kg.LIZ().LIZLLL) {
            C56662Kg.LIZ().LJFF("feed_lego_add_to_request", false);
            C56662Kg.LIZ().LIZJ("feed_request_to_feed_api", false);
        }
        C54919Lgx.LIZ.LJI(null);
        C39079FVj.LIZIZ.LIZ().LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, Integer.valueOf(this.LJLJJLL), this.LJLJL);
    }

    public FeedPreloadRequest(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2) {
        str = (i2 & 1) != 0 ? null : str;
        str2 = (i2 & 2) != 0 ? null : str2;
        str3 = (i2 & 4) != 0 ? null : str3;
        str4 = (i2 & 8) != 0 ? null : str4;
        str5 = (i2 & 16) != 0 ? null : str5;
        i = (i2 & 32) != 0 ? 0 : i;
        str6 = (i2 & 64) != 0 ? null : str6;
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = str4;
        this.LJLJJL = str5;
        this.LJLJJLL = i;
        this.LJLJL = str6;
    }
}
