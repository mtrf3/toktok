package X;

import android.view.View;
import com.bytedance.effectcreatormobile.behaviour.view.preview.BehaviourPreviewFragment;
import kotlin.jvm.internal.IDqS175S0200000_42;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.aiU, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94530aiU extends AbstractC65781Prl implements InterfaceC88474Ynu<Integer, Integer, View, EnumC93441aQv, C76800UCe> {
    public final /* synthetic */ BehaviourPreviewFragment LJLIL;
    public final /* synthetic */ AbstractC94370afu LJLILLLLZI;
    public final /* synthetic */ C94526aiQ LJLJI;
    public final /* synthetic */ C93815aWx LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94530aiU(BehaviourPreviewFragment behaviourPreviewFragment, AbstractC94370afu abstractC94370afu, C94526aiQ c94526aiQ, C93815aWx c93815aWx) {
        super(4);
        this.LJLIL = behaviourPreviewFragment;
        this.LJLILLLLZI = abstractC94370afu;
        this.LJLJI = c94526aiQ;
        this.LJLJJI = c93815aWx;
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(Integer num, Integer num2, View view, EnumC93441aQv enumC93441aQv) {
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        View view2 = view;
        EnumC93441aQv elementType = enumC93441aQv;
        o.LJIIIZ(view2, "view");
        o.LJIIIZ(elementType, "elementType");
        int i = C93814aWw.LIZ[elementType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        C93747aVr.LIZIZ(view2, this.LJLIL.LJLJJI, new C94532aiW(intValue2, view2, this));
                    }
                } else {
                    C93729aVZ.LJ(view2, new C94531aiV(intValue, view2, this));
                }
            } else {
                C93747aVr.LIZIZ(view2, this.LJLIL.LJLJJI, new IDqS419S0100000_42(this, 6));
            }
        } else {
            C93747aVr.LIZIZ(view2, this.LJLIL.LJLJJI, new IDqS175S0200000_42(this, view2, 1));
        }
        view2.setSelected(false);
        return C76800UCe.LIZ;
    }
}
