package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C43045Guv;
import X.C43661HBp;
import X.C43664HBs;
import X.C76800UCe;
import X.HD3;
import X.HD4;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* loaded from: classes8.dex */
public class AqS2S0300200_7 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j3;
    public long j4;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS2S0300200_7 aqS2S0300200_7, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ((HD4) aqS2S0300200_7.l0).LJ();
        C43664HBs.LIZ((ShortVideoContext) aqS2S0300200_7.l1, System.currentTimeMillis() - aqS2S0300200_7.j3, aqS2S0300200_7.j4, ((HD4) aqS2S0300200_7.l0).LIZIZ, null);
        ((InterfaceC88472Yns) aqS2S0300200_7.l2).invoke(Boolean.valueOf(booleanValue));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS2S0300200_7 aqS2S0300200_7, Object obj) {
        C43045Guv.LIZLLL(new C43661HBp((HD3) aqS2S0300200_7.l0, (ShortVideoContext) aqS2S0300200_7.l1, aqS2S0300200_7.j3, aqS2S0300200_7.j4, (InterfaceC88472Yns) aqS2S0300200_7.l2, ((Boolean) obj).booleanValue()), 0L);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0009: IPUT (r7 I:long), (r1 I:kotlin.jvm.internal.AqS2S0300200_7) (LINE:100663305) kotlin.jvm.internal.AqS2S0300200_7.j4 long, block:B:1:0x0000 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x000b: IPUT (r9 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AqS2S0300200_7) (LINE:100663307) kotlin.jvm.internal.AqS2S0300200_7.l2 java.lang.Object, block:B:1:0x0000 */
    public AqS2S0300200_7(HD3 hd3, HD3 hd32, ShortVideoContext shortVideoContext, long j, long j2, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        super(1);
        long j3;
        Object obj;
        this.$t = interfaceC88472Yns;
        this.l0 = hd3;
        this.l1 = hd32;
        this.j3 = shortVideoContext;
        this.j4 = j3;
        this.l2 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0009: IPUT (r7 I:long), (r1 I:kotlin.jvm.internal.AqS2S0300200_7) (LINE:100728841) kotlin.jvm.internal.AqS2S0300200_7.j4 long, block:B:1:0x0000 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x000b: IPUT (r9 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AqS2S0300200_7) (LINE:100728843) kotlin.jvm.internal.AqS2S0300200_7.l2 java.lang.Object, block:B:1:0x0000 */
    public AqS2S0300200_7(HD4 hd4, HD4 hd42, ShortVideoContext shortVideoContext, long j, long j2, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        super(1);
        long j3;
        Object obj;
        this.$t = interfaceC88472Yns;
        this.l0 = hd4;
        this.l1 = hd42;
        this.j3 = shortVideoContext;
        this.j4 = j3;
        this.l2 = obj;
    }
}
