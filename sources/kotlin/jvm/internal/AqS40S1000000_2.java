package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C130855Bp;
import X.C152205yC;
import X.C39579Fg7;
import X.C6EG;
import X.C6QQ;
import X.C76800UCe;
import X.H78;
import X.InterfaceC65784Pro;
import X.X1D;
import android.media.MediaMetadataRetriever;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.vesdk.VEUtils;
import java.io.File;

/* loaded from: classes3.dex */
public class AqS40S1000000_2 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS40S1000000_2 aqS40S1000000_2) {
        C6EG.LIZ.remove(aqS40S1000000_2.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS40S1000000_2 aqS40S1000000_2) {
        C6QQ.LIZ(new AqS40S1000000_2(aqS40S1000000_2.s0, 0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS40S1000000_2 aqS40S1000000_2) {
        if (C39579Fg7.LIZIZ(aqS40S1000000_2.s0)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("NLEFeedbackLog : ");
            LIZ.append("has useless nle data file, delete it ");
            H78.LJII(X1D.LIZIZ(LIZ));
            C39579Fg7.LJIL(aqS40S1000000_2.s0);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS40S1000000_2 aqS40S1000000_2) {
        C130855Bp c130855Bp;
        int i;
        int[] iArr = new int[10];
        int audioFileInfo = VEUtils.getAudioFileInfo(aqS40S1000000_2.s0, iArr);
        int i2 = 0;
        if (aqS40S1000000_2.s0.length() == 0 || !new File(aqS40S1000000_2.s0).exists()) {
            c130855Bp = new C130855Bp(0);
        } else if (audioFileInfo == 0 && (i = iArr[3]) > 0) {
            c130855Bp = new C130855Bp(i);
        } else {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(aqS40S1000000_2.s0);
                String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
                if (extractMetadata != null) {
                    i2 = CastIntegerProtector.parseInt(extractMetadata);
                }
            } catch (Exception unused) {
            }
            c130855Bp = new C130855Bp(i2);
        }
        C152205yC.LIZJ.put(aqS40S1000000_2.s0, c130855Bp);
        return c130855Bp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS40S1000000_2(String str, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
    }
}
