package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.C93829aXB;
import X.C94034aaU;
import X.InterfaceC65784Pro;
import X.X1D;
import android.os.Bundle;
import android.view.View;
import com.bytedance.effectcreatormobile.assetEditor.base.BindingBaseFragment;
import com.bytedance.effectcreatormobile.behaviour.base.BehaviourBaseFragment;
import com.bytedance.ies.effectcreator.swig.Asset;
import com.bytedance.ies.effectcreator.swig.Element;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ies.effectcreator.swig.UIAnnotationAssetTexture;
import com.bytedance.ies.effectcreator.swig.UIAnnotationBase;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;

/* loaded from: classes34.dex */
public class IDqS34S0300000_42 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(IDqS34S0300000_42 iDqS34S0300000_42) {
        ((BindingBaseFragment) iDqS34S0300000_42.l0).wl((View) iDqS34S0300000_42.l1, (Bundle) iDqS34S0300000_42.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS34S0300000_42 iDqS34S0300000_42) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(((BehaviourBaseFragment) iDqS34S0300000_42.l0).getClass().getName());
        LIZ.append("--doInit");
        C94034aaU.LIZ("BehaviourBaseFragment", X1D.LIZIZ(LIZ));
        ((BehaviourBaseFragment) iDqS34S0300000_42.l0).xl((View) iDqS34S0300000_42.l1, (Bundle) iDqS34S0300000_42.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS34S0300000_42 iDqS34S0300000_42) {
        UIAnnotationAssetTexture dynamicCast = UIAnnotationAssetTexture.dynamicCast((Element) iDqS34S0300000_42.l0);
        if (dynamicCast != null) {
            dynamicCast.updateValue(((Asset) iDqS34S0300000_42.l1).id());
        }
        C93829aXB LJI = CKEffectEditorContext.LJI();
        if (LJI != null) {
            LJI.LIZIZ();
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS34S0300000_42(BindingBaseFragment bindingBaseFragment, View view, Bundle bundle, int i) {
        super(0);
        this.$t = i;
        this.l0 = bindingBaseFragment;
        this.l1 = view;
        this.l2 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS34S0300000_42(BehaviourBaseFragment behaviourBaseFragment, View view, Bundle bundle, int i) {
        super(0);
        this.$t = i;
        this.l0 = behaviourBaseFragment;
        this.l1 = view;
        this.l2 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS34S0300000_42(UIAnnotationBase uIAnnotationBase, Asset asset, Feature feature, int i) {
        super(0);
        this.$t = i;
        this.l0 = uIAnnotationBase;
        this.l1 = asset;
        this.l2 = feature;
    }
}
