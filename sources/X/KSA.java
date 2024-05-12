package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KSA extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public final /* synthetic */ KSB LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KSA(KSB ksb) {
        super(1);
        this.LJLIL = ksb;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        int i;
        if (bool.booleanValue()) {
            KSB ksb = this.LJLIL;
            Context context = this.LJLIL.getContext();
            o.LJIIIIZZ(context, "this.context");
            Integer LJI = C79045V0n.LJI(R.attr.df, context);
            if (LJI != null) {
                i = LJI.intValue();
            } else {
                i = 0;
            }
            ksb.setForeground(new ColorDrawable(i));
        } else {
            this.LJLIL.setForeground(null);
        }
        return C76800UCe.LIZ;
    }
}
