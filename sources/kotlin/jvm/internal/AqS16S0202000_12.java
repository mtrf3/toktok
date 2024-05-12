package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.C26227ARb;
import X.C76800UCe;
import X.C78880UxY;
import X.InterfaceC88472Yns;
import X.UC0;
import android.content.Context;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public class AqS16S0202000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AqS16S0202000_12 aqS16S0202000_12, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJ(R.string.fyx, new AqS61S0201000_12((EffectTemplateCategoryFragment) aqS16S0202000_12.l0, (Effect) aqS16S0202000_12.l1, aqS16S0202000_12.i2, aqS16S0202000_12.i3, 12));
        actionGroup.LJIIIIZZ(R.string.fzb, null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS16S0202000_12 aqS16S0202000_12, Object it) {
        o.LJIIIZ(it, "it");
        EffectTemplateCategoryFragment effectTemplateCategoryFragment = (EffectTemplateCategoryFragment) aqS16S0202000_12.l0;
        Effect effect = (Effect) aqS16S0202000_12.l1;
        int i = aqS16S0202000_12.i2;
        int i2 = aqS16S0202000_12.i3;
        effectTemplateCategoryFragment.getClass();
        Context requireContext = effectTemplateCategoryFragment.requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        C26227ARb c26227ARb = new C26227ARb(requireContext);
        c26227ARb.LJII = false;
        c26227ARb.LJ(R.string.fz0);
        c26227ARb.LIZ(R.string.fyz);
        UC0.LIZJ(c26227ARb, new AqS16S0202000_12(effectTemplateCategoryFragment, effect, i, i2, 0));
        c26227ARb.LJI().LIZLLL();
        C78880UxY.LJJLIIIJL("show_mobile_effect_delete_popup", effectTemplateCategoryFragment.wl(effect));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS16S0202000_12(EffectTemplateCategoryFragment effectTemplateCategoryFragment, Effect effect, int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = effectTemplateCategoryFragment;
        this.l1 = effect;
        this.i2 = i;
        this.i3 = i2;
    }
}
