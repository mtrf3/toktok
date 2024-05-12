package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.ak4, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94628ak4 extends AbstractC65781Prl implements InterfaceC88472Yns<LinearLayout, C76800UCe> {
    public final /* synthetic */ C93696aV2 LJLIL;
    public final /* synthetic */ double LJLILLLLZI;
    public final /* synthetic */ double LJLJI;
    public final /* synthetic */ double LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94628ak4(C93696aV2 c93696aV2, double d, double d2, double d3) {
        super(1);
        this.LJLIL = c93696aV2;
        this.LJLILLLLZI = d;
        this.LJLJI = d2;
        this.LJLJJI = d3;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LinearLayout linearLayout) {
        LinearLayout receiver = linearLayout;
        o.LJIIIZ(receiver, "$receiver");
        this.LJLIL.LJLJJL = receiver;
        receiver.setOrientation(0);
        receiver.setGravity(17);
        TextView textView = new TextView(receiver.getContext());
        textView.setLayoutParams(C93902aYM.LIZJ(receiver, -2, -2, (int) C93742aVm.LIZ(13.5f), 0, null, null, null, null, null, null, 1016));
        new IDqS419S0100000_42(this, 62).invoke(textView);
        C93902aYM.LIZ(textView, receiver);
        C93696aV2 c93696aV2 = this.LJLIL;
        Context context = receiver.getContext();
        o.LJIIIIZZ(context, "context");
        c93696aV2.getClass();
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.duw, receiver, false);
        if (LLLLIILL != null) {
            LLLLIILL.setLayoutParams(C93902aYM.LIZJ(receiver, 0, -1, 0, 0, null, null, null, null, Float.valueOf(1.0f), null, 764));
            new IDqS419S0100000_42(this, 63).invoke(LLLLIILL);
            C93902aYM.LIZ(LLLLIILL, receiver);
            TextView textView2 = new TextView(receiver.getContext());
            textView2.setLayoutParams(C93902aYM.LIZJ(receiver, -2, -2, (int) C93742aVm.LIZ(13.5f), 0, null, null, null, null, null, null, 1016));
            new IDqS419S0100000_42(this, 64).invoke(textView2);
            C93902aYM.LIZ(textView2, receiver);
            return C76800UCe.LIZ;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.effectcreatormobile.behaviour.view.card.ActionExtraSeekBar");
    }
}
