package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WR2 extends AbstractC65781Prl implements InterfaceC88472Yns<List<? extends Effect>, C76800UCe> {
    public final /* synthetic */ WR3 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WR2(WR3 wr3, String str, int i, int i2, AqS180S0100000_14 aqS180S0100000_14, AqS164S0100000_14 aqS164S0100000_14) {
        super(1);
        this.LJLIL = wr3;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = aqS180S0100000_14;
        this.LJLJJLL = aqS164S0100000_14;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(List<? extends Effect> list) {
        List<? extends Effect> effectList = list;
        o.LJIIIZ(effectList, "effectList");
        WR3 wr3 = this.LJLIL;
        int i = this.LJLJI;
        int i2 = this.LJLJJI;
        InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = this.LJLJJL;
        for (Effect effect : effectList) {
            FilterBean filterBean = new FilterBean();
            filterBean.setId(CastIntegerProtector.parseInt(effect.getEffectId()));
            filterBean.setFilterFolder(effect.getUnzipPath());
            filterBean.setFilterFilePath(effect.getUnzipPath());
            filterBean.setResId(effect.getResourceId());
            filterBean.setExtra(effect.getExtra());
            float LIZ = wr3.LIZ.LIZ(filterBean);
            float LIZ2 = wr3.LIZIZ.LIZ(filterBean);
            if (LIZ2 == wr3.LIZIZ.LIZLLL(filterBean) && LIZ2 != LIZ) {
                wr3.LIZIZ.LIZIZ(filterBean, LIZ);
            }
            if (i == CastIntegerProtector.parseInt(effect.getEffectId())) {
                if ((wr3.LIZJ instanceof WRF) && !(!o.LJ(((WRF) r1).LIZ.LIZ(1), ""))) {
                    ((WRF) wr3.LIZJ).LJI(1, effect.getResourceId());
                    C142235i7.LIZ(new AqS161S0200000_14(effect, interfaceC88472Yns, 15));
                }
            }
            if (i2 == CastIntegerProtector.parseInt(effect.getEffectId())) {
                InterfaceC82284WRc interfaceC82284WRc = wr3.LIZJ;
                if ((interfaceC82284WRc instanceof WRF) && !(true ^ o.LJ(((WRF) interfaceC82284WRc).LIZ.LIZ(0), ""))) {
                    ((WRF) wr3.LIZJ).LJI(0, effect.getResourceId());
                    C142235i7.LIZ(new AqS161S0200000_14(effect, interfaceC88472Yns, 16));
                }
            }
        }
        Keva keva = this.LJLIL.LJ;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Filter_Data_2_Has_Migrated_");
        LIZ3.append(this.LJLILLLLZI);
        keva.storeBoolean(X1D.LIZIZ(LIZ3), true);
        C142235i7.LIZ(new AqS160S0100000_10(this.LJLJJLL, (InterfaceC65784Pro<C76800UCe>) 364));
        return C76800UCe.LIZ;
    }
}
