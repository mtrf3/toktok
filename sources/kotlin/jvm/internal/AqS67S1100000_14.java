package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C38891fp;
import X.C76800UCe;
import X.C82328WSu;
import X.C82329WSv;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;

/* loaded from: classes15.dex */
public class AqS67S1100000_14 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS67S1100000_14 aqS67S1100000_14, Object it) {
        o.LJIIIZ(it, "it");
        ((C82328WSu) aqS67S1100000_14.l1).handleLeaveSharedARSession(aqS67S1100000_14.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS67S1100000_14 aqS67S1100000_14, Object it) {
        o.LJIIIZ(it, "it");
        ((C82329WSv) aqS67S1100000_14.l1).handleLeaveSharedARSession(aqS67S1100000_14.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS67S1100000_14 aqS67S1100000_14, Object obj) {
        ComposerInfo it = (ComposerInfo) obj;
        o.LJIIIZ(it, "it");
        String str = it.nodePath;
        Integer key = (Integer) aqS67S1100000_14.l1;
        o.LJIIIIZZ(key, "key");
        String LJIJ = C38891fp.LJIJ(key.intValue(), str);
        String str2 = aqS67S1100000_14.s0;
        Integer key2 = (Integer) aqS67S1100000_14.l1;
        o.LJIIIIZZ(key2, "key");
        return Boolean.valueOf(o.LJ(C38891fp.LJIJ(key2.intValue(), str2), LJIJ));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS67S1100000_14(C82328WSu c82328WSu, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c82328WSu;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS67S1100000_14(C82329WSv c82329WSv, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c82329WSv;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS67S1100000_14(Integer num, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = num;
        this.s0 = str;
    }
}
