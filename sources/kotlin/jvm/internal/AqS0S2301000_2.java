package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C149705uA;
import X.C166866gk;
import X.C26045AKb;
import X.C76800UCe;
import X.C78688UuS;
import X.InterfaceC149745uE;
import X.InterfaceC65784Pro;
import com.ss.android.ugc.aweme.services.audio.OnSpeechToSongPrepareListener;
import com.ss.android.ugc.aweme.services.audio.StsError;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* loaded from: classes3.dex */
public class AqS0S2301000_2 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i5;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;
    public String s1;

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
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS0S2301000_2 aqS0S2301000_2) {
        ((C149705uA) aqS0S2301000_2.l2).LJJLIIIJLLLLLLLZ((C166866gk) aqS0S2301000_2.l3, (InterfaceC149745uE) aqS0S2301000_2.l4, aqS0S2301000_2.s0, aqS0S2301000_2.s1, aqS0S2301000_2.i5);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS0S2301000_2 aqS0S2301000_2) {
        C26045AKb c26045AKb = new C26045AKb(C78688UuS.LJIJJ((C149705uA) aqS0S2301000_2.l2));
        c26045AKb.LJIIIIZZ(R.string.rf3);
        c26045AKb.LJIIJ();
        ((C149705uA) aqS0S2301000_2.l2).LJJLIIIJLLLLLLLZ((C166866gk) aqS0S2301000_2.l3, (InterfaceC149745uE) aqS0S2301000_2.l4, aqS0S2301000_2.s0, aqS0S2301000_2.s1, aqS0S2301000_2.i5);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS0S2301000_2 aqS0S2301000_2) {
        ((C149705uA) aqS0S2301000_2.l2).LJJLIIIJLLLLLLLZ((C166866gk) aqS0S2301000_2.l3, (InterfaceC149745uE) aqS0S2301000_2.l4, aqS0S2301000_2.s0, aqS0S2301000_2.s1, aqS0S2301000_2.i5);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS0S2301000_2 aqS0S2301000_2) {
        ((C149705uA) aqS0S2301000_2.l2).LJJLIIIJLLLLLLLZ((C166866gk) aqS0S2301000_2.l3, (InterfaceC149745uE) aqS0S2301000_2.l4, aqS0S2301000_2.s0, aqS0S2301000_2.s1, aqS0S2301000_2.i5);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS0S2301000_2 aqS0S2301000_2) {
        ((C166866gk) aqS0S2301000_2.l2).LIZIZ();
        OnSpeechToSongPrepareListener onSpeechToSongPrepareListener = (OnSpeechToSongPrepareListener) aqS0S2301000_2.l3;
        String str = aqS0S2301000_2.s0;
        int i = aqS0S2301000_2.i5;
        String str2 = aqS0S2301000_2.s1;
        if (str2 == null) {
            str2 = "";
        }
        OnSpeechToSongPrepareListener.DefaultImpls.onFailed$default(onSpeechToSongPrepareListener, str, new StsError(i, str2, (Map) aqS0S2301000_2.l4), false, 4, null);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS0S2301000_2(C149705uA c149705uA, C166866gk c166866gk, InterfaceC149745uE interfaceC149745uE, String str, String str2, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l2 = c149705uA;
        this.l3 = c166866gk;
        this.l4 = interfaceC149745uE;
        this.s0 = str;
        this.s1 = str2;
        this.i5 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS0S2301000_2(C166866gk c166866gk, C166866gk c166866gk2, OnSpeechToSongPrepareListener onSpeechToSongPrepareListener, String str, int i, String str2, Map<String, String> map) {
        super(0);
        this.$t = map;
        this.l2 = c166866gk;
        this.l3 = c166866gk2;
        this.s0 = onSpeechToSongPrepareListener;
        this.i5 = str;
        this.s1 = i;
        this.l4 = str2;
    }
}
