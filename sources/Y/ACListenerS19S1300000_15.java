package Y;

import X.C32151Nz;
import X.C86326XuM;
import X.C86393XvR;
import X.InterfaceC86327XuN;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.MaskLayer;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.zhiliaoapp.musically.R;

/* loaded from: classes16.dex */
public class ACListenerS19S1300000_15 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS19S1300000_15 aCListenerS19S1300000_15, View view) {
        ((C86326XuM) aCListenerS19S1300000_15.l1).setClickWatchLive(true);
        ((C86326XuM) aCListenerS19S1300000_15.l1).setVisibility(8);
        InterfaceC86327XuN interfaceC86327XuN = ((C86326XuM) aCListenerS19S1300000_15.l1).LJLJLJ;
        if (interfaceC86327XuN != null) {
            interfaceC86327XuN.LIZIZ();
        }
        if (((MaskLayer) aCListenerS19S1300000_15.l2).isR2OrUnknownMask()) {
            C32151Nz.LJJIJL((LiveRoomStruct) aCListenerS19S1300000_15.l3, aCListenerS19S1300000_15.s0, "watch", "click");
        }
    }

    public static final void onClick$1(ACListenerS19S1300000_15 aCListenerS19S1300000_15, View view) {
        C86393XvR LJJIJIL;
        ((C86326XuM) aCListenerS19S1300000_15.l1).setClickSkip(true);
        InterfaceC86327XuN interfaceC86327XuN = ((C86326XuM) aCListenerS19S1300000_15.l1).LJLJLJ;
        if (interfaceC86327XuN != null) {
            interfaceC86327XuN.LIZ();
        }
        ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
        if (LJJJLL != null && (LJJIJIL = LJJJLL.LJJIJIL()) != null) {
            LJJIJIL.LJIILLIIL(((C86326XuM) aCListenerS19S1300000_15.l1).getContext().getString(R.string.mxa));
        }
        if (((MaskLayer) aCListenerS19S1300000_15.l2).isR2OrUnknownMask()) {
            C32151Nz.LJJIJL((LiveRoomStruct) aCListenerS19S1300000_15.l3, aCListenerS19S1300000_15.s0, "skip", "click");
        }
    }

    public ACListenerS19S1300000_15(C86326XuM c86326XuM, MaskLayer maskLayer, LiveRoomStruct liveRoomStruct, String str, int i) {
        this.$t = i;
        this.l1 = c86326XuM;
        this.l2 = maskLayer;
        this.l3 = liveRoomStruct;
        this.s0 = str;
    }
}
