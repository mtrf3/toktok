package X;

import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SKA extends AbstractC71915SKh {
    public final AbstractC71913SKf LIZIZ;

    @Override // X.SKZ
    public final Class<? extends SKZ> LJFF() {
        return SKA.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SKA(AbstractC71913SKf builder) {
        super(builder);
        o.LJIIIZ(builder, "builder");
        this.LIZIZ = builder;
    }

    @Override // X.AbstractC71915SKh
    public final void LJIIIIZZ(AI8 ai8) {
        AEO aeo;
        SK6 sk6;
        if (!(ai8.getAccessory() instanceof AEO)) {
            Context context = ai8.getContext();
            o.LJIIIIZZ(context, "tuxTextCell.context");
            ai8.setAccessory(new AEO(context));
        }
        AI9 accessory = ai8.getAccessory();
        Integer num = null;
        if ((accessory instanceof AEO) && (aeo = (AEO) accessory) != null) {
            AbstractC71913SKf abstractC71913SKf = this.LIZIZ;
            if ((abstractC71913SKf instanceof SK6) && (sk6 = (SK6) abstractC71913SKf) != null) {
                num = sk6.LJIILIIL;
            }
            aeo.LIZJ = num;
            if (num != null) {
                aeo.LIZIZ.setIconRes(num.intValue());
            }
            InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns = this.LIZIZ.LJIIIIZZ;
            if (interfaceC88472Yns != null) {
                C16880lQ.LJJJ(aeo.LIZIZ, new ACListenerS21S0100000_1(interfaceC88472Yns, (InterfaceC88472Yns<? super View, C76800UCe>) 173));
            }
        }
        ai8.setOnClickListener(new AqS178S0100000_12(this, 441));
    }
}
