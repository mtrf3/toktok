package com.ss.android.ugc.aweme.notification.lego;

import X.AnonymousClass030;
import X.C10K;
import X.C221018lt;
import X.EFM;
import X.EFN;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.EnumC55898Lwk;
import X.HG3;
import X.M4L;
import X.M4M;
import X.M4N;
import X.MS5;
import X.RBX;
import X.X1D;
import android.content.Context;
import com.ss.android.ugc.aweme.notification.perf.NoticePerfManager;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PreloadNoticeTask implements EFM {
    public static volatile String LJLJI = "";
    public final EnumC55898Lwk LJLIL;
    public final String LJLILLLLZI;

    @Override // X.EEY
    public final String key() {
        return "PreloadNoticeTask";
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
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return AnonymousClass030.LIZIZ(this);
    }

    @Override // X.EFM
    public final EFN type() {
        if (this.LJLIL == EnumC55898Lwk.BOOT_LAZY) {
            return EFN.IDLE;
        }
        return EFN.NORMAL;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    public PreloadNoticeTask(EnumC55898Lwk reason, String str) {
        o.LJIIIZ(reason, "reason");
        this.LJLIL = reason;
        this.LJLILLLLZI = str;
    }

    @Override // X.EFM
    public final void LIZJ(Context context, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("request ");
        LIZ.append(this.LJLIL);
        LIZ.append(", ");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", ");
        LIZ.append(((RBX) HG3.LJIILL()).getCurUserId());
        C221018lt.LIZ("PreloadNoticeTask", X1D.LIZIZ(LIZ));
        if (!o.LJ(this.LJLILLLLZI, ((RBX) HG3.LJIILL()).getCurUserId())) {
            return;
        }
        EnumC55898Lwk enumC55898Lwk = this.LJLIL;
        if (enumC55898Lwk == EnumC55898Lwk.BOOT) {
            MS5.LJI(M4L.LJLIL);
            return;
        }
        if (enumC55898Lwk != EnumC55898Lwk.BOOT_LAZY) {
            return;
        }
        long j = NoticePerfManager.LIZ().bootLazyPreloadDelayMs;
        if (j <= 0) {
            MS5.LJI(M4M.LJLIL);
        } else {
            C10K.LJII(j).LIZLLL(M4N.LIZ);
        }
    }
}
