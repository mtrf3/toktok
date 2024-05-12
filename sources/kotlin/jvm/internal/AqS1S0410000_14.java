package kotlin.jvm.internal;

import X.AbstractC42651GoZ;
import X.AbstractC65781Prl;
import X.AbstractC82618Wbe;
import X.C45316HqS;
import X.C45317HqT;
import X.C45848Hz2;
import X.C76800UCe;
import X.C78886Uxe;
import X.C82621Wbh;
import X.C82622Wbi;
import X.EnumC44267HYx;
import X.I23;
import X.I24;
import X.InterfaceC46204IBk;
import X.InterfaceC47196Ifg;
import X.InterfaceC74265TCr;
import X.InterfaceC74398THu;
import X.InterfaceC82400WVo;
import X.InterfaceC82403WVr;
import X.InterfaceC88472Yns;
import X.J8V;
import X.ORZ;
import X.TF1;
import X.TGD;
import X.TH7;
import X.W4L;
import X.WMH;
import X.WTM;
import android.os.Bundle;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.List;
import kotlin.jvm.internal.o;
import ud2.ApS180S0200000_12;
import ud2.ApS201S0100000_14;
import ud2.ApS43S0210000_7;
import ud2.ApS75S0000000_2;
import ud2.ApS77S0000000_12;
import ud2.ApS78S0000000_14;

/* loaded from: classes15.dex */
public class AqS1S0410000_14 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

    public static final /* bridge */ /* synthetic */ Object invoke$0(AqS1S0410000_14 aqS1S0410000_14, Object obj) {
        aqS1S0410000_14.LIZ$0((EffectListResponse) obj);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88472Yns
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public final void LIZ$0(EffectListResponse response) {
        int i;
        o.LJIIIZ(response, "response");
        Effect effect = (Effect) ORZ.LJLLLL(response.getData());
        if (effect == null || C78886Uxe.LJJIJ(effect.getChildren())) {
            return;
        }
        if (!C78886Uxe.LJJIJ(response.getCollection())) {
            ((InterfaceC82400WVo) this.l0).LLLLL().LJJJJLL().LIZ().LJII(response.getCollection());
        }
        if (!C78886Uxe.LJJIJ(response.getBindEffects())) {
            ((InterfaceC82400WVo) this.l0).LLLLL().LJJJJLL().LIZ().LJIIL(response.getBindEffects());
        }
        InterfaceC46204IBk LLZL = ((InterfaceC82400WVo) this.l0).LLZL();
        if (this.z4) {
            i = 1;
        } else {
            i = -1;
        }
        LLZL.LIZJ(J8V.LJI(effect, i, EnumC44267HYx.MANUAL_SET, null, (Bundle) this.l2, (InterfaceC74398THu) this.l3, null, 0, false, null, 484));
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0783, code lost:
    
        if (X.L95.LIZIZ() != false) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0b73  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0ba7  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0c10  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0c46  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0c75  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0c80  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0c84  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0cb8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0cbc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x086f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x09a8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0a81  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0c7c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0abb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0aef  */
    /* JADX WARN: Type inference failed for: r10v30, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r10v33, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r10v34, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r10v35, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r10v36, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r10v37, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r10v38, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r10v39, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r10v47, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r19v26, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r19v31, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r19v32, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r19v33, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r20v10, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r20v11, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r20v12, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r20v13, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r20v14, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r20v15, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r20v16, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r20v17, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r20v18, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r20v19, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r20v21, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r20v22, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r20v23, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r20v24, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r20v25, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r20v26, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r20v28, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r20v29, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r20v31, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r20v35, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r20v36, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r20v37, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r20v38, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r20v39, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r20v40, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r21v10, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r21v11, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r21v12, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r21v13, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r21v14, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r21v15, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r21v16, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r21v17, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r21v18, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r21v21, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r21v22, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r21v23, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r21v24, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r21v25, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r21v26, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r21v28, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r21v29, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r21v31, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r21v35, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r21v37, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r21v38, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r21v39, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r21v40, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r21v41, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r21v42, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r21v9, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r23v20, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r23v9, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r24v10, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r24v11, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r24v12, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r24v13, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r24v14, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r24v15, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r24v16, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r24v17, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r24v18, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r24v19, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r24v20, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r24v21, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r24v22, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r24v23, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r24v24, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r24v25, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r24v26, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r24v28, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r24v29, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r24v31, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r24v34, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r24v35, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r24v36, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r24v37, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r24v38, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r24v39, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r24v9, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r27v3, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r27v4, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r29v1, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r29v10, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r29v11, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r29v12, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r29v13, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r29v14, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r29v15, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r29v2, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r29v3, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r29v4, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r29v5, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r29v6, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r29v7, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r29v8, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r29v9, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r30v1, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r30v10, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r30v11, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r30v12, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r30v13, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r30v14, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r30v15, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r30v2, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r30v3, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r30v4, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r30v5, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r30v6, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r30v7, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r30v8, types: [X.0Oq] */
    /* JADX WARN: Type inference failed for: r33v0, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r33v1, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r33v10, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r33v11, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r33v12, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r33v13, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r33v14, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r33v2, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r33v3, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r33v4, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r33v5, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r33v6, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r33v7, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r33v9, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r5v48, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r5v57, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r5v61, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r5v83, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r5v84, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r6v26, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r7v43, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r7v49, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r7v60, types: [X.0IB] */
    /* JADX WARN: Type inference failed for: r8v10, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r8v11, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r8v12, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r8v13, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r8v14, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r8v39, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r8v41, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r8v42, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r8v43, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r8v44, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r8v45, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r8v52, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r8v9, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r9v16, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r9v17, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r9v18, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r9v19, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r9v20, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r9v21, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r9v22, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r9v23, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r9v24, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r9v25, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r9v26, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r9v27, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r9v28, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r9v30, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r9v47, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r9v48, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r9v49, types: [com.bytedance.als.AlsLogicContainer] */
    /* JADX WARN: Type inference failed for: r9v50, types: [com.bytedance.als.AlsLogicContainer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AqS1S0410000_14 r34, java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 3575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS1S0410000_14.invoke$1(kotlin.jvm.internal.AqS1S0410000_14, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AqS1S0410000_14 aqS1S0410000_14, Object obj) {
        int LIZ;
        C82621Wbh data = (C82621Wbh) obj;
        o.LJIIIZ(data, "$this$data");
        data.LIZLLL(C45848Hz2.class, null, new ApS201S0100000_14((C45848Hz2) aqS1S0410000_14.l0, 32));
        data.LIZLLL(TGD.class, null, new ApS201S0100000_14((WMH) aqS1S0410000_14.l1, 36));
        data.LIZLLL(InterfaceC74265TCr.class, null, new ApS78S0000000_14(8));
        if (C45316HqS.LIZ() || (1 <= (LIZ = C45317HqT.LIZ()) && LIZ < 3)) {
            data.LIZLLL(TF1.class, null, new ApS77S0000000_12(3));
        }
        data.LIZLLL(TH7.class, null, new ApS180S0200000_12((I23) aqS1S0410000_14.l2, (WMH) aqS1S0410000_14.l1, 1));
        data.LIZLLL(InterfaceC47196Ifg.class, null, new ApS78S0000000_14(10));
        data.LIZLLL(WTM.class, null, new ApS78S0000000_14(4));
        data.LIZLLL(W4L.class, null, new ApS43S0210000_7(aqS1S0410000_14.z4, (AbstractC42651GoZ) aqS1S0410000_14.l3, (WMH) aqS1S0410000_14.l1, 0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS1S0410000_14 aqS1S0410000_14, Object obj) {
        int LIZ;
        C82621Wbh data = (C82621Wbh) obj;
        o.LJIIIZ(data, "$this$data");
        data.LIZLLL(C45848Hz2.class, null, new ApS201S0100000_14((C45848Hz2) aqS1S0410000_14.l0, 33));
        data.LIZLLL(TGD.class, null, new ApS201S0100000_14((WMH) aqS1S0410000_14.l1, 38));
        data.LIZLLL(InterfaceC74265TCr.class, null, new ApS78S0000000_14(9));
        if (C45316HqS.LIZ() || (1 <= (LIZ = C45317HqT.LIZ()) && LIZ < 3)) {
            data.LIZLLL(TF1.class, null, new ApS77S0000000_12(4));
        }
        data.LIZLLL(TH7.class, null, new ApS180S0200000_12((I24) aqS1S0410000_14.l2, (WMH) aqS1S0410000_14.l1, 2));
        data.LIZLLL(InterfaceC47196Ifg.class, null, new ApS78S0000000_14(11));
        data.LIZLLL(WTM.class, null, new ApS78S0000000_14(5));
        data.LIZLLL(W4L.class, null, new ApS43S0210000_7(aqS1S0410000_14.z4, (AbstractC42651GoZ) aqS1S0410000_14.l3, (WMH) aqS1S0410000_14.l1, 1));
        final boolean z = aqS1S0410000_14.z4;
        data.LIZLLL(Boolean.class, "isNowStoryCombine", new AbstractC82618Wbe<Boolean>() { // from class: X.5We
            @Override // X.AbstractC82618Wbe
            public final Boolean LIZIZ(C82622Wbi container) {
                o.LJIIIZ(container, "container");
                return Boolean.valueOf(z);
            }
        });
        data.LIZLLL(Boolean.class, "enableDelayRecordPage", new ApS75S0000000_2(6));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S0410000_14(C45848Hz2 c45848Hz2, WMH wmh, I23 i23, boolean z, AbstractC42651GoZ abstractC42651GoZ, int i) {
        super(1);
        this.$t = i;
        this.l0 = c45848Hz2;
        this.l1 = wmh;
        this.l2 = i23;
        this.z4 = z;
        this.l3 = abstractC42651GoZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S0410000_14(C45848Hz2 c45848Hz2, WMH wmh, I24 i24, boolean z, AbstractC42651GoZ abstractC42651GoZ, int i) {
        super(1);
        this.$t = i;
        this.l0 = c45848Hz2;
        this.l1 = wmh;
        this.l2 = i24;
        this.z4 = z;
        this.l3 = abstractC42651GoZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S0410000_14(WMH wmh, I23 i23, WMH wmh2, boolean z, C82622Wbi c82622Wbi, int i) {
        super(1);
        this.$t = i;
        this.l0 = wmh;
        this.l1 = i23;
        this.l2 = wmh2;
        this.z4 = z;
        this.l3 = c82622Wbi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S0410000_14(InterfaceC82400WVo interfaceC82400WVo, InterfaceC82403WVr interfaceC82403WVr, List list, boolean z, Bundle bundle, InterfaceC74398THu interfaceC74398THu, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC82400WVo;
        this.l1 = list;
        this.z4 = z;
        this.l2 = bundle;
        this.l3 = interfaceC74398THu;
    }
}
