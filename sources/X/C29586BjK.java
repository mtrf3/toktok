package X;

import Y.AfS57S0100000_5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BjK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29586BjK extends ConstraintLayout {
    public DataChannel LJLIL;
    public final C73318Sq2 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;

    public final C47121t6 getCountDownContentView() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-countDownContentView>(...)");
        return (C47121t6) value;
    }

    public final TextView getCountDownTextView() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-countDownTextView>(...)");
        return (TextView) value;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29586BjK(Context ctx, AttributeSet attributeSet) {
        this(ctx, attributeSet, 0);
        o.LJIIIZ(ctx, "ctx");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29586BjK(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "ctx");
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        this.LJLILLLLZI = c73318Sq2;
        this.LJLJI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 54));
        this.LJLJJI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 53));
        o.LJII(ViewGroup.inflate(getContext(), R.layout.djy, this), "null cannot be cast to non-null type android.view.ViewGroup");
        c73318Sq2.LIZ(AbstractC73672Svk.LJJIJIL("ttlive_ic_live_float_window_msg_icon_go.png").LJJIJL(C29585BjJ.LJLIL).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS57S0100000_5(this, 29)));
    }
}
