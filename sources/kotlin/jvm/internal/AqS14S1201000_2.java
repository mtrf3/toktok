package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C133205Kq;
import X.C166866gk;
import X.C59722Wa;
import X.C5LN;
import X.C67672l9;
import X.C76800UCe;
import X.InterfaceC166046fQ;
import X.InterfaceC65784Pro;
import X.OSZ;
import com.bytedance.ies.nle.editor_jni.INLEResourceDownloadStatusListener;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.services.audio.OnSpeechToSongPrepareListener;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class AqS14S1201000_2 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
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
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS14S1201000_2 aqS14S1201000_2) {
        ((InterfaceC166046fQ) aqS14S1201000_2.l1).LIZJ(aqS14S1201000_2.s0, aqS14S1201000_2.i3, (C59722Wa) aqS14S1201000_2.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS14S1201000_2 aqS14S1201000_2) {
        ((InterfaceC166046fQ) aqS14S1201000_2.l1).LIZLLL(aqS14S1201000_2.i3, aqS14S1201000_2.s0, (List) aqS14S1201000_2.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS14S1201000_2 aqS14S1201000_2) {
        ((C5LN) aqS14S1201000_2.l1).LLIFFJFJJ((EffectModel) aqS14S1201000_2.l2, aqS14S1201000_2.s0, aqS14S1201000_2.i3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS14S1201000_2 aqS14S1201000_2) {
        Iterator it = ((CopyOnWriteArrayList) ((C133205Kq) aqS14S1201000_2.l1).LIZ.LJJ).iterator();
        while (it.hasNext()) {
            INLEResourceDownloadStatusListener iNLEResourceDownloadStatusListener = (INLEResourceDownloadStatusListener) it.next();
            if (iNLEResourceDownloadStatusListener != null) {
                iNLEResourceDownloadStatusListener.onFail((NLEResourceNode) aqS14S1201000_2.l2, aqS14S1201000_2.i3, aqS14S1201000_2.s0);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS14S1201000_2 aqS14S1201000_2) {
        OSZ osz = (OSZ) ((LinkedHashMap) C67672l9.LIZ).get(Integer.valueOf(aqS14S1201000_2.i3));
        if (osz != null) {
            ((C166866gk) aqS14S1201000_2.l1).LIZ(((Number) osz.getFirst()).intValue(), ((Number) osz.getSecond()).intValue(), 5000L, new AqS56S1100000_2((OnSpeechToSongPrepareListener) aqS14S1201000_2.l2, aqS14S1201000_2.s0, 9));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS14S1201000_2(int i, InterfaceC166046fQ interfaceC166046fQ, String str, List list, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = interfaceC166046fQ;
        this.s0 = str;
        this.i3 = i;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS14S1201000_2(int i, C166866gk c166866gk, OnSpeechToSongPrepareListener onSpeechToSongPrepareListener, String str, int i2) {
        super(0);
        this.$t = i2;
        this.i3 = i;
        this.l1 = c166866gk;
        this.l2 = onSpeechToSongPrepareListener;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS14S1201000_2(C133205Kq c133205Kq, NLEResourceNode nLEResourceNode, int i, String str, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = c133205Kq;
        this.l2 = nLEResourceNode;
        this.i3 = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS14S1201000_2(C5LN c5ln, EffectModel effectModel, String str, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = c5ln;
        this.l2 = effectModel;
        this.s0 = str;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS14S1201000_2(InterfaceC166046fQ interfaceC166046fQ, String str, int i, C59722Wa c59722Wa, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = interfaceC166046fQ;
        this.s0 = str;
        this.i3 = i;
        this.l2 = c59722Wa;
    }
}
