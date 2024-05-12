package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.akT, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94653akT extends AbstractC65781Prl implements InterfaceC88472Yns<LinearLayout, C76800UCe> {
    public static final C94653akT LJLIL = new C94653akT();

    public C94653akT() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LinearLayout linearLayout) {
        LinearLayout receiver = linearLayout;
        o.LJIIIZ(receiver, "$receiver");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.mutate();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C93742aVm.LIZIZ(12));
        gradientDrawable.setColor(C04330Ez.LIZIZ(receiver.getContext(), R.color.adm));
        receiver.setBackground(gradientDrawable);
        receiver.setOrientation(0);
        Context context = receiver.getContext();
        o.LJIIIIZZ(context, "context");
        C94446ah8 c94446ah8 = new C94446ah8(context, null, 6, 0);
        c94446ah8.setLayoutParams(C93902aYM.LIZJ(receiver, 0, -1, C93742aVm.LIZIZ(12), C93742aVm.LIZIZ(8), null, null, null, null, null, null, 1008));
        C94651akR attrBlock = C94651akR.LJLIL;
        o.LJIIIZ(attrBlock, "attrBlock");
        attrBlock.invoke(c94446ah8);
        C93902aYM.LIZ(c94446ah8, receiver);
        AppCompatTextView appCompatTextView = new AppCompatTextView(receiver.getContext(), null);
        appCompatTextView.setLayoutParams(C93902aYM.LIZJ(receiver, -1, -1, C93742aVm.LIZIZ(5), 0, null, Integer.valueOf(C93742aVm.LIZIZ(12)), null, null, null, null, 984));
        C94652akS attrBlock2 = C94652akS.LJLIL;
        o.LJIIIZ(attrBlock2, "attrBlock");
        attrBlock2.invoke(appCompatTextView);
        C93902aYM.LIZ(appCompatTextView, receiver);
        return C76800UCe.LIZ;
    }
}
