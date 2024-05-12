package com.bytedance.ies.ugc.aweme.network.zstd;

import X.C0RN;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.bytedance.compression.zstd.Zstd;
import com.bytedance.ttnet.TTNetInit;
import java.util.List;

/* loaded from: classes12.dex */
public final class ZstdDownToTTNetInitTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "ZstdDownToTTNetInitTask";
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

    public static void LIZLLL() {
        long[] funAddressesBySymbols = Zstd.getFunAddressesBySymbols(new String[]{"ZSTD_createDCtx", "ZSTD_decompressStream", "ZSTD_freeDCtx", "ZSTD_isError", "ZSTD_createDDict", "ZSTD_DCtx_refDDict", "ZSTD_freeDDict", "ZSTD_DCtx_reset"});
        if (funAddressesBySymbols != null && funAddressesBySymbols.length == 8) {
            long j = funAddressesBySymbols[0];
            if (j != 0) {
                long j2 = funAddressesBySymbols[1];
                if (j2 != 0) {
                    long j3 = funAddressesBySymbols[2];
                    if (j3 != 0) {
                        long j4 = funAddressesBySymbols[3];
                        if (j4 != 0) {
                            long j5 = funAddressesBySymbols[4];
                            if (j5 != 0) {
                                long j6 = funAddressesBySymbols[5];
                                if (j6 != 0) {
                                    long j7 = funAddressesBySymbols[6];
                                    if (j7 != 0) {
                                        long j8 = funAddressesBySymbols[7];
                                        if (j8 != 0) {
                                            try {
                                                TTNetInit.setZstdFuncAddr(j, j2, j3, j4, j5, j6, j7, j8);
                                            } catch (Exception unused) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final void run(Context context) {
        LIZLLL();
    }
}
