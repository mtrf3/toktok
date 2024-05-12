package X;

import android.view.View;
import com.bytedance.android.live.design.app.LiveDialog;
import com.zhiliaoapp.musically.R;
import webcast.data.multi_guest_play.ShowListUser;

/* renamed from: X.U2o, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class ViewOnClickListenerC76550U2o implements View.OnClickListener {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ C2A7 LJLILLLLZI;
    public final /* synthetic */ C76549U2n LJLJI;

    public ViewOnClickListenerC76550U2o(long j, C2A7 c2a7, C76549U2n c76549U2n) {
        this.LJLIL = j;
        this.LJLILLLLZI = c2a7;
        this.LJLJI = c76549U2n;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        ShowListUser showListUser;
        long j = this.LJLIL;
        java.util.Map LIZIZ = C76548U2m.LIZIZ();
        LIZIZ.put("guest_id", String.valueOf(j));
        C76548U2m.LJIIZILJ("livesdk_anchor_multiguest_liveshow_guest_replay_click", LIZIZ);
        C47071t1 c47071t1 = new C47071t1(this.LJLILLLLZI.getContext());
        Object[] objArr = new Object[1];
        C76553U2r c76553U2r = this.LJLJI.LJLJI;
        if (c76553U2r != null && (showListUser = c76553U2r.LJLIL) != null) {
            str = showListUser.nickname;
        } else {
            str = null;
        }
        objArr[0] = str;
        c47071t1.LIZJ = C15380j0.LJIILL(R.string.ncp, objArr);
        c47071t1.LJFF(R.string.ncn);
        c47071t1.LJIIL(R.string.nco, new C76551U2p(this.LJLJI, this.LJLIL));
        c47071t1.LJIIIZ(R.string.ndt, C76556U2u.LJLIL);
        LiveDialog LIZ = c47071t1.LIZ();
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "-120489281824818885")).LIZ) {
            return;
        }
        LIZ.show();
    }
}
