package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C08630Vn;
import X.C142195i3;
import X.C142235i7;
import X.C165236e7;
import X.C38352F3k;
import X.C42599Gnj;
import X.C5M1;
import X.C6MP;
import X.C76732zl;
import X.C76800UCe;
import X.C82105WKf;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.X1D;
import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import java.util.List;

/* loaded from: classes3.dex */
public class AqS45S1200000_2 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public Object l2;
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
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS45S1200000_2 aqS45S1200000_2, Object obj) {
        C82105WKf setState = (C82105WKf) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C82105WKf.LIZ(setState, false, null, null, null, new C08630Vn(new C165236e7((C6MP) aqS45S1200000_2.l1, aqS45S1200000_2.s0, (OSZ) aqS45S1200000_2.l2)), null, null, 3967);
    }

    public static final Object invoke$1(AqS45S1200000_2 aqS45S1200000_2, Object obj) {
        C5M1 setState = (C5M1) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C5M1.LIZ(setState, null, false, null, null, false, null, false, null, 0, null, new C08630Vn(ListProtector.get((List) aqS45S1200000_2.l1, 0)), null, null, new C08630Vn(new OSZ(((EffectModel) aqS45S1200000_2.l2).key, aqS45S1200000_2.s0)), null, null, null, null, null, false, null, 2087935);
    }

    public static final Object invoke$2(AqS45S1200000_2 aqS45S1200000_2, Object obj) {
        int i;
        ((Boolean) obj).booleanValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append(System.currentTimeMillis());
        String LIZJ = C38352F3k.LIZJ(X1D.LIZIZ(LIZ));
        C76732zl c76732zl = (C76732zl) aqS45S1200000_2.l1;
        if (C42599Gnj.LIZJ((Context) aqS45S1200000_2.l2, C42599Gnj.LIZ(aqS45S1200000_2.s0), LIZJ) == null) {
            i = -1;
        } else {
            i = 1;
        }
        c76732zl.element = i;
        return Integer.valueOf(((C76732zl) aqS45S1200000_2.l1).element);
    }

    public static final Object invoke$3(AqS45S1200000_2 aqS45S1200000_2, Object obj) {
        List<EffectTemplate> effectList = (List) obj;
        o.LJIIIZ(effectList, "effectList");
        C142195i3 c142195i3 = (C142195i3) aqS45S1200000_2.l1;
        for (EffectTemplate effectTemplate : effectList) {
            FilterBean filterBean = new FilterBean();
            filterBean.setId(CastIntegerProtector.parseInt(effectTemplate.getEffectId()));
            filterBean.setFilterFolder(effectTemplate.getUnzipPath());
            filterBean.setFilterFilePath(effectTemplate.getUnzipPath());
            filterBean.setResId(effectTemplate.getResourceId());
            filterBean.setExtra(effectTemplate.getExtra());
            float LIZ = c142195i3.LIZ.LIZ(filterBean);
            float LIZ2 = c142195i3.LIZIZ.LIZ(filterBean);
            if (LIZ2 == c142195i3.LIZIZ.LIZLLL(filterBean) && LIZ2 != LIZ) {
                c142195i3.LIZIZ.LIZIZ(filterBean, LIZ);
            }
        }
        Keva keva = ((C142195i3) aqS45S1200000_2.l1).LIZLLL;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Edit_Filter_Data_2_Has_Migrated_");
        LIZ3.append(aqS45S1200000_2.s0);
        keva.storeBoolean(X1D.LIZIZ(LIZ3), true);
        C142235i7.LIZ(new AqS152S0100000_2((InterfaceC65784Pro) aqS45S1200000_2.l2, (InterfaceC65784Pro<C76800UCe>) 867));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS45S1200000_2(C76732zl c76732zl, String str, Context context, int i) {
        super(1);
        this.$t = i;
        this.l1 = c76732zl;
        this.s0 = str;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS45S1200000_2(C142195i3 c142195i3, String str, AqS152S0100000_2 aqS152S0100000_2, int i) {
        super(1);
        this.$t = i;
        this.l1 = c142195i3;
        this.s0 = str;
        this.l2 = aqS152S0100000_2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS45S1200000_2(C6MP c6mp, C6MP c6mp2, String str, OSZ<String, String> osz) {
        super(1);
        this.$t = osz;
        this.l1 = c6mp;
        this.s0 = c6mp2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS45S1200000_2(List list, List<? extends NLETrackSlot> list2, EffectModel effectModel, String str) {
        super(1);
        this.$t = str;
        this.l1 = list;
        this.l2 = list2;
        this.s0 = effectModel;
    }
}
