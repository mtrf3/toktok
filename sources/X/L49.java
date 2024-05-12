package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* loaded from: classes10.dex */
public final /* synthetic */ class L49 extends TBS implements InterfaceC88474Ynu<Effect, Integer, Integer, Integer, C76800UCe> {
    public L49(C81567Vzn c81567Vzn) {
        super(4, c81567Vzn, C81567Vzn.class, "changeDuetLayoutInfo", "changeDuetLayoutInfo(Lcom/ss/android/ugc/effectmanager/effect/model/Effect;III)V", 0);
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(Effect effect, Integer num, Integer num2, Integer num3) {
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        int intValue3 = num3.intValue();
        ((C81567Vzn) this.receiver).LLF(effect, intValue, intValue2, intValue3);
        return C76800UCe.LIZ;
    }
}
