package com.ss.android.ugc.aweme.share.downloadv2.protocol;

import X.AbstractC44957Hkf;
import X.C87753YcH;
import X.QXX;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.WaterMarkAbilityProtocol;
import com.ss.android.ugc.trill.download.DownloadServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public abstract class DefaultWaterMarkAbilityProtocol extends WaterMarkAbilityProtocol {
    public final QXX LJLIL;

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.WaterMarkAbilityProtocol
    public final void LIZ() {
        QXX qxx = this.LJLIL;
        if (qxx != null) {
            qxx.LJLJI();
        }
    }

    public DefaultWaterMarkAbilityProtocol(AbstractC44957Hkf abstractC44957Hkf) {
        super(abstractC44957Hkf);
        this.LJLIL = DownloadServiceImpl.LJ().LIZLLL(abstractC44957Hkf);
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.WaterMarkAbilityProtocol
    public final void LJIIIIZZ(C87753YcH c87753YcH) {
        QXX qxx = this.LJLIL;
        if (qxx != null) {
            qxx.LLLLLIL(c87753YcH);
        }
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.WaterMarkAbilityProtocol
    public final void LIZJ(String str, String str2) {
        QXX qxx = this.LJLIL;
        if (qxx != null) {
            qxx.LJLJJLL(str, str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.WaterMarkAbilityProtocol
    public final void LJ(long j, long j2, boolean z, String inputPath, String outputPath) {
        o.LJIIIZ(inputPath, "inputPath");
        o.LJIIIZ(outputPath, "outputPath");
        QXX qxx = this.LJLIL;
        if (qxx != null) {
            qxx.LLJJJJJIL(j, j2, z, inputPath, outputPath);
        }
    }
}
