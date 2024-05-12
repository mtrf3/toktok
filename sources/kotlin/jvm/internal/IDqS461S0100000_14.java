package kotlin.jvm.internal;

import X.AbstractC46244ICy;
import X.AbstractC65781Prl;
import X.C46193IAz;
import X.C5NP;
import X.C76800UCe;
import X.C80751Vmd;
import X.C82891Wg3;
import X.InterfaceC83727WtX;
import X.InterfaceC88475Ynv;
import X.V3N;
import X.X1D;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.filterparam.VEEffectFilterParam;

/* loaded from: classes15.dex */
public class IDqS461S0100000_14 extends AbstractC65781Prl implements InterfaceC88475Ynv {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88475Ynv
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4, obj5);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4, obj5);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4, obj5);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS461S0100000_14(C46193IAz c46193IAz, int i) {
        super(5);
        this.$t = i;
        this.l0 = c46193IAz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS461S0100000_14(C80751Vmd c80751Vmd, int i) {
        super(5);
        this.$t = i;
        this.l0 = c80751Vmd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS461S0100000_14(AqS157S0100000_7 aqS157S0100000_7, int i) {
        super(5);
        this.$t = i;
        this.l0 = aqS157S0100000_7;
    }

    public static final Object invoke$0(IDqS461S0100000_14 iDqS461S0100000_14, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String str;
        long longValue = ((Number) obj).longValue();
        long longValue2 = ((Number) obj2).longValue();
        String filPath = (String) obj3;
        Effect effect = (Effect) obj4;
        boolean booleanValue = ((Boolean) obj5).booleanValue();
        o.LJIIIZ(filPath, "filPath");
        if (effect != null) {
            ((AbstractC46244ICy) ((AqS157S0100000_7) iDqS461S0100000_14.l0).l0).LJZI().LJJJI(effect);
        }
        ((AbstractC46244ICy) ((AqS157S0100000_7) iDqS461S0100000_14.l0).l0).LJJZZIII(longValue2);
        ((AbstractC46244ICy) ((AqS157S0100000_7) iDqS461S0100000_14.l0).l0).LLF().ia();
        C5NP LIZLLL = C82891Wg3.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StickerCoreLogicComponent#IEffectController.switchEffect:effectId:");
        LIZ.append(longValue2);
        LIZ.append(":filPath:");
        LIZ.append(filPath);
        LIZLLL.i(X1D.LIZIZ(LIZ));
        InterfaceC83727WtX LLF = ((AbstractC46244ICy) ((AqS157S0100000_7) iDqS461S0100000_14.l0).l0).LLF();
        VEEffectFilterParam vEEffectFilterParam = new VEEffectFilterParam();
        vEEffectFilterParam.effectPath = filPath;
        vEEffectFilterParam.useLongId = true;
        vEEffectFilterParam.longStickerId = longValue2;
        vEEffectFilterParam.longRequestId = longValue;
        if (effect == null || (str = effect.getExtra()) == null) {
            str = "";
        }
        vEEffectFilterParam.stickerTag = str;
        vEEffectFilterParam.needReload = booleanValue;
        if (V3N.LJJI(effect)) {
            vEEffectFilterParam.effectFilterType = VEEffectFilterParam.EffectFilterType.MUSIC;
        }
        if (V3N.LJJIFFI(effect)) {
            vEEffectFilterParam.effectFilterType = VEEffectFilterParam.EffectFilterType.AUDIO_SPEED;
        }
        if (V3N.LJIL(effect)) {
            vEEffectFilterParam.multicamMode = true;
        }
        ((AbstractC46244ICy) ((AqS157S0100000_7) iDqS461S0100000_14.l0).l0).LJLZ().LJLLL.invoke(String.valueOf(longValue2), effect);
        return Integer.valueOf(LLF.fa(vEEffectFilterParam));
    }

    public static final Object invoke$1(IDqS461S0100000_14 iDqS461S0100000_14, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super/*android.widget.FrameLayout*/.onLayout(((Boolean) obj).booleanValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue(), ((Number) obj5).intValue());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS461S0100000_14 iDqS461S0100000_14, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String str;
        long longValue = ((Number) obj).longValue();
        long longValue2 = ((Number) obj2).longValue();
        String filPath = (String) obj3;
        Effect effect = (Effect) obj4;
        boolean booleanValue = ((Boolean) obj5).booleanValue();
        o.LJIIIZ(filPath, "filPath");
        if (effect != null) {
            ((C46193IAz) iDqS461S0100000_14.l0).LJZI().LJJJI(effect);
        }
        ((C46193IAz) iDqS461S0100000_14.l0).LJJZZIII(longValue2);
        String LLZ = ((C46193IAz) iDqS461S0100000_14.l0).LLZ(effect, filPath);
        InterfaceC83727WtX LLF = ((C46193IAz) iDqS461S0100000_14.l0).LLF();
        VEEffectFilterParam vEEffectFilterParam = new VEEffectFilterParam();
        vEEffectFilterParam.effectPath = LLZ;
        vEEffectFilterParam.useLongId = true;
        vEEffectFilterParam.longStickerId = longValue2;
        vEEffectFilterParam.longRequestId = longValue;
        if (effect == null || (str = effect.getExtra()) == null) {
            str = "";
        }
        vEEffectFilterParam.stickerTag = str;
        vEEffectFilterParam.needReload = booleanValue;
        if (V3N.LJJI(effect)) {
            vEEffectFilterParam.effectFilterType = VEEffectFilterParam.EffectFilterType.MUSIC;
        }
        if (V3N.LJJIFFI(effect)) {
            vEEffectFilterParam.effectFilterType = VEEffectFilterParam.EffectFilterType.AUDIO_SPEED;
        }
        if (V3N.LJIL(effect)) {
            vEEffectFilterParam.multicamMode = true;
        }
        return Integer.valueOf(LLF.fa(vEEffectFilterParam));
    }
}
