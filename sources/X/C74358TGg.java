package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import kotlin.jvm.internal.o;

/* renamed from: X.TGg, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C74358TGg extends TBS implements InterfaceC88471Ynr<EffectCategoryModel, Integer, C76800UCe> {
    public C74358TGg(TH3 th3) {
        super(2, th3, TH3.class, "onTabClicked", "onTabClicked(Lcom/ss/android/ugc/effectmanager/effect/model/EffectCategoryModel;I)V", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(EffectCategoryModel p1, Integer num) {
        int intValue = num.intValue();
        o.LJIIIZ(p1, "p1");
        TH3 th3 = (TH3) this.receiver;
        th3.getClass();
        th3.LJLL.LIZ.LJJJI(System.currentTimeMillis());
        th3.LJLIL.onNext(new OSZ<>(p1, Integer.valueOf(intValue)));
        th3.Hc(intValue);
        return C76800UCe.LIZ;
    }
}
