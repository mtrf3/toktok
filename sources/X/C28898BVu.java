package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.toolbar.DismissToolbarPopEvent;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveToolbarMoreConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BVu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28898BVu implements InterfaceC28903BVz {
    public View LJLIL;
    public DataChannel LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 13));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 12));

    @Override // X.InterfaceC28903BVz
    public final void LIZJ(DataChannel dataChannel) {
    }

    @Override // X.InterfaceC28903BVz
    public final int LIZLLL() {
        return R.string.ng3;
    }

    @Override // X.InterfaceC28903BVz
    public final void onHide() {
    }

    @Override // X.InterfaceC28903BVz
    public final int LJ() {
        if (LiveToolbarMoreConfig.INSTANCE.enableInteractionPanelOptimizeByLine()) {
            return R.attr.at9;
        }
        return R.attr.asy;
    }

    @Override // X.InterfaceC28903BVz
    public final void onShow() {
        if (this.LJLJI) {
            return;
        }
        this.LJLJI = true;
        if (this.LJLJJI) {
            LJFF(0);
        } else {
            LJFF(BV1.LIZ);
        }
    }

    public final void LIZ(int i) {
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_qa_entrance_click");
        LIZ.LJIILLIIL(this.LJLILLLLZI);
        LIZ.LJIJJ(Integer.valueOf(Math.min(i, 1)), "has_red_dot");
        LIZ.LJIJJ(Integer.valueOf(i), "show_question_number");
        LIZ.LJIJJ("interaction_entrance", "request_page");
        LIZ.LJJIIJZLJL();
    }

    public final void LJFF(int i) {
        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_qa_entrance_show");
        LIZ.LJIILLIIL(this.LJLILLLLZI);
        LIZ.LJIJJ(Integer.valueOf(Math.min(i, 1)), "has_red_dot");
        LIZ.LJIJJ(Integer.valueOf(i), "show_question_number");
        LIZ.LJIJJ("interaction_entrance", "request_page");
        LIZ.LJJIIJZLJL();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Boolean, O] */
    @Override // X.InterfaceC28903BVz
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
        if (this.LJLJJI) {
            DataChannel dataChannel = this.LJLILLLLZI;
            if (dataChannel != null) {
                dataChannel.pv0(DismissToolbarPopEvent.class);
            }
            BV1.LJIIJ(this.LJLILLLLZI);
            LIZ(0);
            return;
        }
        C29306Beo.LJI((View) this.LJLJJL.getValue());
        DataChannel dataChannel2 = this.LJLILLLLZI;
        if (dataChannel2 != null) {
            ((C32537Cpp) dataChannel2.gv0(C28900BVw.class)).LIZ = Boolean.FALSE;
        }
        DataChannel dataChannel3 = this.LJLILLLLZI;
        if (dataChannel3 != null) {
            dataChannel3.pv0(DismissToolbarPopEvent.class);
        }
        BV1.LIZIZ(this.LJLILLLLZI, "interaction_feature");
        LIZ(BV1.LIZ);
    }

    @Override // X.InterfaceC28903BVz
    public final void LIZIZ(View view, DataChannel dataChannel) {
        boolean z;
        this.LJLIL = view;
        this.LJLILLLLZI = dataChannel;
        if (BV1.LJIIIIZZ(dataChannel) || BV1.LJI(dataChannel)) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJJI = z;
        if (z) {
            TextView textView = (TextView) view.findViewById(R.id.ldm);
            if (textView != null) {
                textView.setText(R.string.msp);
                return;
            }
            return;
        }
        int i = BV1.LIZ;
        if (i <= 0) {
            return;
        }
        C29306Beo.LJJLJLI((View) this.LJLJJL.getValue());
        TextView textView2 = (TextView) this.LJLJJLL.getValue();
        if (textView2 == null) {
            return;
        }
        textView2.setText(String.valueOf(i));
    }
}
