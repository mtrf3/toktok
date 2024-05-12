package X;

import Y.ACListenerS25S0100000_5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.CdV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31773CdV extends ConstraintLayout {
    public InterfaceC31772CdU LJLIL;
    public final java.util.Map<Integer, View> LJLILLLLZI;

    public final View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this.LJLILLLLZI;
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

    public final InterfaceC31772CdU getCallBack() {
        return this.LJLIL;
    }

    public final void setCallBack(InterfaceC31772CdU interfaceC31772CdU) {
        this.LJLIL = interfaceC31772CdU;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C31773CdV(Context ctx, AttributeSet attributeSet) {
        this(ctx, attributeSet, 0);
        o.LJIIIZ(ctx, "ctx");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31773CdV(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLILLLLZI = C62850Ola.LJFF(context, "ctx");
        o.LJII(ViewGroup.inflate(getContext(), R.layout.dk2, this), "null cannot be cast to non-null type android.view.ViewGroup");
        setBackgroundResource(R.drawable.cdy);
        C16880lQ.LJJII((LiveIconView) _$_findCachedViewById(R.id.af2), new ACListenerS25S0100000_5(this, 36));
        C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.hbg), ViewOnClickListenerC31775CdX.LJLIL);
        C31778Cda c31778Cda = (C31778Cda) _$_findCachedViewById(R.id.hbf);
        Integer LIZJ = InterfaceC30442Bx8.r2.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_GAME_OPACITY.value");
        c31778Cda.setCurrentProgress(LIZJ.intValue());
        C29306Beo.LJJJJLL(-((int) C87277YNd.LJIIJ(6.5f)), _$_findCachedViewById(R.id.hbf));
        ((C31778Cda) _$_findCachedViewById(R.id.hbf)).setSeekbarListener(new C31774CdW(this));
        ((TextView) _$_findCachedViewById(R.id.n_4)).setText("20%");
        ((TextView) _$_findCachedViewById(R.id.n_8)).setText("60%");
        ((TextView) _$_findCachedViewById(R.id.n_2)).setText("100%");
    }
}
