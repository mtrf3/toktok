package X;

import Y.IDCListenerS163S0200000_5;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class BIS implements View.OnTouchListener {
    public final /* synthetic */ BIR LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ DataChannel LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ Room LJLJJL;
    public final /* synthetic */ C41071jL LJLJJLL;
    public final /* synthetic */ C41071jL LJLJL;
    public final /* synthetic */ ViewGroup LJLJLJ;

    public BIS(BIR bir, Context context, DataChannel dataChannel, String str, Room room, C41071jL c41071jL, C41071jL c41071jL2, ViewGroup viewGroup) {
        this.LJLIL = bir;
        this.LJLILLLLZI = context;
        this.LJLJI = dataChannel;
        this.LJLJJI = str;
        this.LJLJJL = room;
        this.LJLJJLL = c41071jL;
        this.LJLJL = c41071jL2;
        this.LJLJLJ = viewGroup;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Long l;
        int i;
        Long l2;
        int i2;
        User owner;
        User owner2;
        if (motionEvent.getAction() == 1) {
            BIR bir = this.LJLIL;
            if (bir.LIZLLL) {
                C47071t1 c47071t1 = new C47071t1(this.LJLILLLLZI);
                c47071t1.LJIILLIIL(R.string.o_5);
                c47071t1.LJFF(R.string.o_d);
                c47071t1.LJIIL(R.string.o_3, new BIU(this.LJLIL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJI, this.LJLJJL, this.LJLJJI));
                c47071t1.LJIIIZ(R.string.o_2, new BIX(this.LJLJJLL, this.LJLIL, this.LJLJJL, this.LJLJI, this.LJLJJI));
                c47071t1.LJIJ = new IDCListenerS163S0200000_5(this.LJLJJLL, this.LJLIL, 0);
                c47071t1.LJIILJJIL = false;
                LiveDialog LIZ = c47071t1.LIZ();
                if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ, new Object[0], "void", new C65300Pk0(false, "()V", "4549141940702445988")).LIZ) {
                    LIZ.show();
                }
                BIR bir2 = this.LJLIL;
                DataChannel dataChannel = this.LJLJI;
                String str = this.LJLJJI;
                Room room = this.LJLJJL;
                bir2.getClass();
                BZI LIZ2 = C28787BRn.LIZ("livesdk_sub_only_live_preview_allow_click");
                LIZ2.LJIILLIIL(dataChannel);
                LIZ2.LJIJJ(str, "click_position");
                if (room != null) {
                    l = Long.valueOf(room.getOwnerUserId());
                } else {
                    l = null;
                }
                LIZ2.LJIJJ(l, "anchor_id");
                if (room != null && (owner2 = room.getOwner()) != null && owner2.isAnchorHasSubQualification()) {
                    i = 1;
                } else {
                    i = 0;
                }
                LIZ2.LJIJJ(Integer.valueOf(i ^ 1), "is_opt_in");
                LIZ2.LJIJJ("close", "click_type");
                LIZ2.LJJIIJZLJL();
                BIR bir3 = this.LJLIL;
                DataChannel dataChannel2 = this.LJLJI;
                String str2 = this.LJLJJI;
                Room room2 = this.LJLJJL;
                bir3.getClass();
                BZI LIZ3 = C28787BRn.LIZ("livesdk_sub_only_preview_turn_off_popup_show");
                LIZ3.LJIILLIIL(dataChannel2);
                LIZ3.LJIJJ(str2, "show_entrance");
                LIZ3.LJIJJ(str2, "click_position");
                if (room2 != null) {
                    l2 = Long.valueOf(room2.getOwnerUserId());
                } else {
                    l2 = null;
                }
                LIZ3.LJIJJ(l2, "anchor_id");
                if (room2 != null && (owner = room2.getOwner()) != null && owner.isAnchorHasSubQualification()) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                UFE.LIZIZ(i2 ^ 1, LIZ3, "is_opt_in");
                this.LJLIL.LJIIJ(this.LJLJJLL, false, null);
            } else {
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = bir.LJ;
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                }
            }
        }
        return true;
    }
}
