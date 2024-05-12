package X;

import Y.IDCListenerS370S0100000;
import Y.IDRunnableS85S0100000;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.1j3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40891j3 extends C1TQ {
    public final java.util.Map<Integer, View> LJLJLJ;

    @Override // X.C1TQ
    public final View LJFF(int i) {
        java.util.Map<Integer, View> map = this.LJLJLJ;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.C1TQ
    public int getLayoutId$livebroadcast_api_release() {
        return R.layout.cut;
    }

    @Override // X.C1TQ
    public int getMaxLinesInFoldedStatus$livebroadcast_api_release() {
        return 5;
    }

    @Override // X.C1TQ
    public final View LJI() {
        ViewGroup flow_layout = (ViewGroup) LJFF(R.id.dj8);
        o.LJIIIIZZ(flow_layout, "flow_layout");
        View LJIIIIZZ = C29306Beo.LJIIIIZZ(R.layout.d6t, flow_layout, false);
        ((TextView) LJIIIIZZ.findViewById(R.id.aml)).setTextColor(C259910h.LIZJ(R.attr.bns, LJIIIIZZ.findViewById(R.id.aml)));
        ((C47121t6) LJIIIIZZ.findViewById(R.id.aml)).LJJIJIL(R.style.a4a);
        ((LiveIconView) LJIIIIZZ.findViewById(R.id.amn)).setIconTint(-16777216);
        return LJIIIIZZ;
    }

    @Override // X.C1TQ
    public final void LJIIIZ() {
        LJFF(R.id.amo).postDelayed(new IDRunnableS85S0100000(this, 45), 200L);
        LJFF(R.id.amo).setOnFocusChangeListener(new IDCListenerS370S0100000(this, 1));
    }

    @Override // X.C1TQ
    public final void LJIIJJI() {
        ((TextView) LJFF(R.id.amr)).setText(C15380j0.LJIILL(R.string.mip, Integer.valueOf(((C05270Ip) LJFF(R.id.dj8)).getSize()), Long.valueOf(getMaxWordsCount$livebroadcast_api_release())));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40891j3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJLJ = C62850Ola.LJFF(context, "context");
    }
}
