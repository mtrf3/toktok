package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C41942Gd8;
import X.C44946HkU;
import X.C46193IAz;
import X.C76800UCe;
import X.C83489Wph;
import X.IBP;
import X.IC2;
import X.IC4;
import X.InterfaceC88474Ynu;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;

/* loaded from: classes8.dex */
public class IDqS453S0100000_7 extends AbstractC65781Prl implements InterfaceC88474Ynu {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88474Ynu
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS453S0100000_7(C46193IAz c46193IAz, int i) {
        super(4);
        this.$t = i;
        this.l0 = c46193IAz;
    }

    public static final Object invoke$0(IDqS453S0100000_7 iDqS453S0100000_7, Object obj, Object obj2, Object obj3, Object obj4) {
        Effect effect = (Effect) obj;
        String key = (String) obj2;
        String path = (String) obj3;
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        o.LJIIIZ(key, "key");
        o.LJIIIZ(path, "path");
        if (DiyPropParser.LIZ(effect)) {
            if (booleanValue) {
                IBP.LIZ(effect, path, key, IC4.LIZIZ);
            } else {
                C44946HkU LJI = DiyPropParser.LJI(effect);
                if (LJI != null && LJI.LJLJI && key.length() == 0) {
                    IBP.LIZ(effect, path, key, IC4.LIZIZ);
                } else {
                    IBP.LIZ(effect, path, key, IC2.LIZIZ);
                }
            }
            ((C46193IAz) iDqS453S0100000_7.l0).LLJI = 1;
        } else {
            C83489Wph c83489Wph = new C83489Wph();
            if (C41942Gd8.LIZ() && effect != null) {
                c83489Wph.LIZIZ(effect.getSdkExtra());
            }
            ((C46193IAz) iDqS453S0100000_7.l0).LLJLIL(path, key, c83489Wph);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS453S0100000_7 iDqS453S0100000_7, Object obj, Object obj2, Object obj3, Object obj4) {
        ((C46193IAz) iDqS453S0100000_7.l0).LJLJJL.getAudioController().LIZ(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue());
        return C76800UCe.LIZ;
    }
}
