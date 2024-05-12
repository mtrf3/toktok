package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.MuteAudioAbilityProtocol;
import java.io.File;
import kotlin.jvm.internal.AqS166S0100000_16;
import kotlin.jvm.internal.o;

/* renamed from: X.YcR, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87763YcR extends AbstractC87761YcP {
    public final String LJII;
    public final C62822Ol8 LJIIIIZZ;
    public final MuteAudioAbilityProtocol LJIIIZ;

    @Override // X.AbstractC87761YcP
    public final String LJFF() {
        return "MuteAudioAbility";
    }

    @Override // X.AbstractC87761YcP
    public final void LJII() {
        DownloadMobProtocol<AbstractC45395Hrj> downloadMobProtocol = this.LJFF;
        if (downloadMobProtocol != null) {
            downloadMobProtocol.LJIIZILJ();
        }
        C10K<Integer> LIZJ = this.LJIIIZ.LIZJ(this.LJ, this.LJII);
        if (LIZJ == null) {
            C87754YcI.LIZ(this, this.LJII, -1, "Fail to get mute audio ");
            return;
        }
        try {
            LIZJ.LJIJI();
            Integer LJIIJJI = LIZJ.LJIIJJI();
            if (LJIIJJI != null && LJIIJJI.intValue() == 0) {
                String str = this.LJII;
                if (str == null || TextUtils.isEmpty(str) || !new File(str).exists()) {
                    C87754YcI.LIZ(this, this.LJII, -1, "mute audio out path file is not exists");
                    return;
                } else {
                    C87754YcI.LIZIZ(this, this.LJII);
                    return;
                }
            }
            YXU LJ = LJ();
            Integer LJIIJJI2 = LIZJ.LJIIJJI();
            o.LJIIIIZZ(LJIIJJI2, "muteAudioTask.result");
            LJ.LJLJLLL = LJIIJJI2.intValue();
            P8N.LIZIZ(this.LJII);
            String str2 = this.LJII;
            Integer LJIIJJI3 = LIZJ.LJIIJJI();
            o.LJIIIIZZ(LJIIJJI3, "muteAudioTask.result");
            int intValue = LJIIJJI3.intValue();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("muteAudioTask result: [");
            LIZ.append(LIZJ.LJIIJJI());
            LIZ.append(']');
            C87754YcI.LIZ(this, str2, intValue, X1D.LIZIZ(LIZ));
        } catch (InterruptedException e) {
            C87754YcI.LIZ(this, this.LJII, -1, e.toString());
        }
    }

    @Override // X.OBL
    public final void cancel() {
        LIZ(this.LJII);
    }

    public C87763YcR(AbstractC44957Hkf abstractC44957Hkf, MuteAudioAbilityProtocol muteAudioAbilityProtocol) {
        super(abstractC44957Hkf);
        this.LJIIIZ = muteAudioAbilityProtocol;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(abstractC44957Hkf.LIZIZ());
        LIZ.append(abstractC44957Hkf.LIZ);
        LIZ.append("_mute");
        LIZ.append(abstractC44957Hkf.LIZJ);
        this.LJII = X1D.LIZIZ(LIZ);
        this.LJIIIIZZ = C221108m2.LIZIZ(new AqS166S0100000_16(this, 3));
    }
}
