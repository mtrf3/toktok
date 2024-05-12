package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.effect.model.LiveGoalInfo;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.IDqS176S0200000;
import kotlin.jvm.internal.o;

/* renamed from: X.0Ky, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05880Ky extends FrameLayout {
    public final C41081jM LJLIL;
    public final C2A8 LJLILLLLZI;
    public long LJLJI;
    public C0U1 LJLJJI;
    public LiveEffect LJLJJL;
    public DataChannel LJLJJLL;
    public LiveGoalInfo LJLJL;
    public InterfaceC08210Tx LJLJLJ;
    public final java.util.Map<Integer, View> LJLJLLL;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLJLLL;
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

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Integer LIZJ = InterfaceC30442Bx8.j2.LIZJ();
        if (LIZJ == null || LIZJ.intValue() != 0) {
            return;
        }
        C15490jB.LJIJ(CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_demand_1"), "ttlive_live_goal_first_use_guide.webp");
        InterfaceC08210Tx interfaceC08210Tx = this.LJLJLJ;
        if (interfaceC08210Tx == null) {
            return;
        }
        interfaceC08210Tx.LIZ();
    }

    public final DataChannel getDataChannel() {
        return this.LJLJJLL;
    }

    public final InterfaceC08210Tx getListener() {
        return this.LJLJLJ;
    }

    public final LiveEffect getLiveEffect() {
        return this.LJLJJL;
    }

    public final LiveGoalInfo getLiveGoalInfo() {
        return this.LJLJL;
    }

    public final C0U1 getType() {
        return this.LJLJJI;
    }

    public final void LIZIZ(String str) {
        Integer num;
        C31691Mf.LIZ.LJIILIIL();
        C31691Mf.LIZ(this.LJLJJL);
        C12890ez.LIZ().setRenderCacheString("LiveGoal", str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setRenderCacheString: ");
        C31811Ce7.LJ(LIZ, str, LIZ, "LiveGoalEffect");
        C0U1 c0u1 = this.LJLJJI;
        if (c0u1 != null) {
            num = Integer.valueOf(c0u1.getValue());
        } else {
            num = null;
        }
        BZI LIZ2 = C31701Mg.LIZ(this.LJLJJLL, "livesdk_stream_goal_background_select");
        LIZ2.LJIJJ(C31701Mg.LIZIZ.giftId, "gift_id");
        LIZ2.LJIJJ(C31701Mg.LIZIZ.goalType, "goal_type");
        LIZ2.LJIJJ(num, "background_pos");
        LIZ2.LJJIIJZLJL();
        C31701Mg.LIZIZ.isAdjust = 0;
    }

    public final void setClickListener(C0U0 l) {
        o.LJIIIZ(l, "l");
        View item_view = LIZ(R.id.evj);
        o.LJIIIIZZ(item_view, "item_view");
        C29306Beo.LJJJLL(item_view, 500L, new IDqS172S0200000(this, l, 10));
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.LJLJJLL = dataChannel;
    }

    public final void setListener(InterfaceC08210Tx interfaceC08210Tx) {
        this.LJLJLJ = interfaceC08210Tx;
    }

    public final void setLiveEffect(LiveEffect liveEffect) {
        this.LJLJJL = liveEffect;
    }

    public final void setLiveGoalInfo(LiveGoalInfo liveGoalInfo) {
        this.LJLJL = liveGoalInfo;
    }

    public final void setPosition(int i) {
        C0U1 c0u1 = C0U1.NONE;
        if (i == c0u1.getValue()) {
            this.LJLJJI = c0u1;
            return;
        }
        C0U1 c0u12 = C0U1.FULL_SCREEN;
        if (i == c0u12.getValue()) {
            this.LJLJJI = c0u12;
            return;
        }
        C0U1 c0u13 = C0U1.HORIZONTAL;
        if (i == c0u13.getValue()) {
            this.LJLJJI = c0u13;
            return;
        }
        C0U1 c0u14 = C0U1.VERTICAL;
        if (i != c0u14.getValue()) {
            return;
        }
        this.LJLJJI = c0u14;
    }

    public final void setText(int i) {
        this.LJLILLLLZI.setText(i);
    }

    public final void setType(C0U1 c0u1) {
        this.LJLJJI = c0u1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05880Ky(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJLLL = C62850Ola.LJFF(context, "context");
        C12890ez.LIZ();
        this.LJLJI = C30725C4b.LIZ();
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.ddz, this, true);
        View findViewById = findViewById(R.id.eu5);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.item_icon)");
        this.LJLIL = (C41081jM) findViewById;
        View findViewById2 = findViewById(R.id.ev9);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.item_text)");
        this.LJLILLLLZI = (C2A8) findViewById2;
    }

    public final void LIZJ(final String str, int i, final String str2, final IDqS176S0200000 iDqS176S0200000) {
        BZI LIZ = C31701Mg.LIZ(this.LJLJJLL, "livesdk_stream_goal_background_sticker_confirm_show");
        LIZ.LJIJJ("popup", "type");
        LIZ.LJIJJ(str, "conflict_function");
        LIZ.LJJIIJZLJL();
        C47071t1 c47071t1 = new C47071t1(getContext());
        c47071t1.LJIILLIIL(R.string.mr6);
        c47071t1.LJFF(i);
        c47071t1.LJIIL(R.string.mqy, new C0K7() { // from class: X.1Ma
            @Override // X.C0K7
            public final void LJIILLIIL(LiveDialog liveDialog) {
                liveDialog.dismiss();
                C05880Ky.this.LIZIZ(str2);
                iDqS176S0200000.invoke();
                C31701Mg.LIZIZ(1, C05880Ky.this.getDataChannel(), str);
            }
        });
        c47071t1.LJIIIZ(R.string.mqx, new C0K7() { // from class: X.1Mb
            @Override // X.C0K7
            public final void LJIILLIIL(LiveDialog liveDialog) {
                liveDialog.dismiss();
                C31701Mg.LIZIZ(0, this.getDataChannel(), str);
            }
        });
        c47071t1.LJIILJJIL = false;
        c47071t1.LJIILL = false;
        LiveDialog LIZ2 = c47071t1.LIZ();
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ2, new Object[0], "void", new C65300Pk0(false, "()V", "-5416583257329723063")).LIZ) {
            return;
        }
        LIZ2.show();
    }
}
