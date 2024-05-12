package X;

import Y.ACListenerS25S0100000_5;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.CdQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31768CdQ extends ConstraintLayout {
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

    public final void LJJLJLI(int i) {
        C1Q4 c1q4 = null;
        if (i == 0) {
            C15490jB.LJFF(_$_findCachedViewById(R.id.c9n), "tiktok_live_game_demand_1", "ttlive_ic_live_game_speaker_2_slash_LTR.png", ImageView.ScaleType.CENTER_INSIDE, null);
            return;
        }
        LiveIconView liveIconView = (LiveIconView) _$_findCachedViewById(R.id.c9n);
        C1Q4 LIZLLL = C259910h.LIZLLL(R.attr.avc, getContext());
        if (LIZLLL != null) {
            LIZLLL.setTint(-1711276033);
            c1q4 = LIZLLL;
        }
        liveIconView.setIcon(c1q4);
    }

    public final void LJJLL(int i) {
        C1Q4 c1q4 = null;
        if (i == 0) {
            LiveIconView liveIconView = (LiveIconView) _$_findCachedViewById(R.id.gio);
            C1Q4 LIZLLL = C259910h.LIZLLL(R.attr.aul, getContext());
            if (LIZLLL != null) {
                LIZLLL.setTint(-1711276033);
                c1q4 = LIZLLL;
            }
            liveIconView.setIcon(c1q4);
            return;
        }
        LiveIconView liveIconView2 = (LiveIconView) _$_findCachedViewById(R.id.gio);
        C1Q4 LIZLLL2 = C259910h.LIZLLL(R.attr.auj, getContext());
        if (LIZLLL2 != null) {
            LIZLLL2.setTint(-1711276033);
            c1q4 = LIZLLL2;
        }
        liveIconView2.setIcon(c1q4);
    }

    public final void setCallBack(InterfaceC31772CdU interfaceC31772CdU) {
        this.LJLIL = interfaceC31772CdU;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C31768CdQ(Context ctx, AttributeSet attributeSet) {
        this(ctx, attributeSet, 0);
        o.LJIIIZ(ctx, "ctx");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31768CdQ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLILLLLZI = C62850Ola.LJFF(context, "ctx");
        o.LJII(ViewGroup.inflate(getContext(), R.layout.dk4, this), "null cannot be cast to non-null type android.view.ViewGroup");
        setBackgroundResource(R.drawable.cdy);
        C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.k81), ViewOnClickListenerC31771CdT.LJLIL);
        C16880lQ.LJJII((LiveIconView) _$_findCachedViewById(R.id.af2), new ACListenerS25S0100000_5(this, 37));
        C31778Cda c31778Cda = (C31778Cda) _$_findCachedViewById(R.id.gik);
        C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.s2;
        Integer LIZJ = c48459J0d.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_GAME_MIC.value");
        c31778Cda.setCurrentProgress(LIZJ.intValue());
        Integer LIZJ2 = c48459J0d.LIZJ();
        o.LJIIIIZZ(LIZJ2, "LIVE_GAME_MIC.value");
        LJJLL(LIZJ2.intValue());
        ((C31778Cda) _$_findCachedViewById(R.id.gik)).setSeekbarListener(new C31769CdR(this));
        C31778Cda c31778Cda2 = (C31778Cda) _$_findCachedViewById(R.id.c9m);
        C48459J0d<Integer> c48459J0d2 = InterfaceC30442Bx8.t2;
        Integer LIZJ3 = c48459J0d2.LIZJ();
        o.LJIIIIZZ(LIZJ3, "LIVE_GAME_BGM.value");
        c31778Cda2.setCurrentProgress(LIZJ3.intValue());
        Integer LIZJ4 = c48459J0d2.LIZJ();
        o.LJIIIIZZ(LIZJ4, "LIVE_GAME_BGM.value");
        LJJLJLI(LIZJ4.intValue());
        ((C31778Cda) _$_findCachedViewById(R.id.c9m)).setSeekbarListener(new C31770CdS(this));
        C29306Beo.LJJJJLL(-((int) C87277YNd.LJIIJ(6.5f)), _$_findCachedViewById(R.id.c9m));
        C29306Beo.LJJJJLL(-((int) C87277YNd.LJIIJ(6.5f)), _$_findCachedViewById(R.id.gik));
    }
}
