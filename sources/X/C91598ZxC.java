package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.dsp.common.model.DspStruct;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.ZxC, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91598ZxC extends AbstractC65781Prl implements InterfaceC88472Yns<C47121IeT, C76800UCe> {
    public final /* synthetic */ DspStruct LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91598ZxC(DspStruct dspStruct, String str, long j) {
        super(1);
        this.LJLIL = dspStruct;
        this.LJLILLLLZI = str;
        this.LJLJI = j;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C47121IeT c47121IeT) {
        C47121IeT info = c47121IeT;
        o.LJIIIZ(info, "info");
        int i = info.LIZ;
        String str = "1";
        int i2 = 0;
        if (i != 2) {
            if (i != 3) {
                if (i == 5) {
                    C91432ZuW.LJLJLLL = false;
                }
            } else {
                C91432ZuW.LJLJLLL = false;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Preload failed associated with special mediaId(");
                LIZ.append(this.LJLIL.getMediaId());
                LIZ.append(')');
                X1D.LIZIZ(LIZ);
                if (!this.LJLIL.isAudio()) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                String str2 = this.LJLILLLLZI;
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLJI;
                C47789IpF c47789IpF = info.LIZJ;
                if (c47789IpF != null) {
                    i2 = c47789IpF.LIZ;
                }
                C91432ZuW.LIZ("track_reco", str, str2, elapsedRealtime, "failed", Integer.valueOf(i2), "preload_media", "");
            }
        } else {
            C91432ZuW.LJLJLLL = false;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("preload success, mediaId(");
            LIZ2.append(this.LJLIL.getMediaId());
            LIZ2.append(')');
            X1D.LIZIZ(LIZ2);
            if (!this.LJLIL.isAudio()) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            C91432ZuW.LIZ("track_reco", str, this.LJLILLLLZI, SystemClock.elapsedRealtime() - this.LJLJI, "success", null, "preload_media", "");
        }
        return C76800UCe.LIZ;
    }
}
