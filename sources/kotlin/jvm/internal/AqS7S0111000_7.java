package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C40992G6y;
import X.C45290Hq2;
import X.C45296Hq8;
import X.InterfaceC88472Yns;
import android.content.Context;
import android.content.res.Resources;
import com.zhiliaoapp.musically.R;

/* loaded from: classes8.dex */
public class AqS7S0111000_7 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public Object l0;
    public boolean z1;

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

    public static final Object invoke$0(AqS7S0111000_7 aqS7S0111000_7, Object obj) {
        String LJLZ;
        Resources resources;
        C45296Hq8 setState = (C45296Hq8) obj;
        o.LJIIIZ(setState, "$this$setState");
        if (aqS7S0111000_7.z1) {
            Context sceneContext = ((C45290Hq2) aqS7S0111000_7.l0).LJLL.getSceneContext();
            if (sceneContext != null && (resources = sceneContext.getResources()) != null) {
                LJLZ = resources.getString(R.string.e1z);
            } else {
                LJLZ = null;
            }
        } else {
            LJLZ = ((C45290Hq2) aqS7S0111000_7.l0).LJLZ(aqS7S0111000_7.i2);
        }
        return C45296Hq8.LIZ(setState, null, LJLZ, null, false, false, 0, null, false, 253);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0087, code lost:
    
        if (r0 == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AqS7S0111000_7 r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS7S0111000_7.invoke$1(kotlin.jvm.internal.AqS7S0111000_7, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS7S0111000_7(boolean z, C40992G6y c40992G6y, int i, int i2) {
        super(1);
        this.$t = i2;
        this.z1 = z;
        this.l0 = c40992G6y;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS7S0111000_7(boolean z, C45290Hq2 c45290Hq2, int i, int i2) {
        super(1);
        this.$t = i2;
        this.z1 = z;
        this.l0 = c45290Hq2;
        this.i2 = i;
    }
}
