package Y;

import X.ActivityC45651qj;
import X.C28683BNn;
import X.C28871BUt;
import X.C28949BXt;
import X.C29338BfK;
import X.C29929Bor;
import X.C29930Bos;
import X.C29931Bot;
import X.C30196BtA;
import X.C30882CAc;
import X.C7N;
import X.CN1;
import X.OG9;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.broadcast.video.LiveBroadcastFragment;
import com.bytedance.android.livesdk.broadcast.voicechat.VoiceChatBroadcastFragment;
import com.bytedance.android.livesdkapi.host.IHostAction;

/* loaded from: classes6.dex */
public class ACListenerS44S1100000_5 implements View.OnClickListener {
    public final int $t;
    public Object l1;
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
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            case 8:
                onClick$8(this, view);
                return;
            default:
                return;
        }
    }

    public ACListenerS44S1100000_5(C30196BtA c30196BtA, int i) {
        this.$t = i;
        this.l1 = c30196BtA;
        this.s0 = null;
    }

    public static final void onClick$0(ACListenerS44S1100000_5 aCListenerS44S1100000_5, View view) {
        C7N.LJFF().Lu();
        Context context = ((LiveBroadcastFragment) aCListenerS44S1100000_5.l1).getContext();
        C28871BUt c28871BUt = new C28871BUt(aCListenerS44S1100000_5.s0);
        c28871BUt.LIZJ = true;
        C30882CAc.LJII(context, c28871BUt);
    }

    public static final void onClick$1(ACListenerS44S1100000_5 aCListenerS44S1100000_5, View view) {
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aCListenerS44S1100000_5.l1;
        String str = aCListenerS44S1100000_5.s0;
        if (str == null) {
            str = "";
        }
        C28949BXt.LIZLLL(activityC45651qj, str, null, null, false, 48);
    }

    public static final void onClick$2(ACListenerS44S1100000_5 aCListenerS44S1100000_5, View view) {
        ((IBrowserService) CN1.LIZ(IBrowserService.class)).Lu();
        Context context = ((C28683BNn) aCListenerS44S1100000_5.l1).getRootView().getContext();
        C28871BUt c28871BUt = new C28871BUt(aCListenerS44S1100000_5.s0);
        c28871BUt.LIZJ = true;
        C30882CAc.LJII(context, c28871BUt);
    }

    public static final void onClick$3(ACListenerS44S1100000_5 aCListenerS44S1100000_5, View view) {
        ((IBrowserService) CN1.LIZ(IBrowserService.class)).Lu();
        Context context = ((C28683BNn) aCListenerS44S1100000_5.l1).getRootView().getContext();
        C28871BUt c28871BUt = new C28871BUt(aCListenerS44S1100000_5.s0);
        c28871BUt.LIZJ = true;
        C30882CAc.LJII(context, c28871BUt);
    }

    public static final void onClick$4(ACListenerS44S1100000_5 aCListenerS44S1100000_5, View view) {
        C7N.LJFF().Lu();
        Context context = ((C30196BtA) aCListenerS44S1100000_5.l1).LJLIL;
        C28871BUt c28871BUt = new C28871BUt(aCListenerS44S1100000_5.s0);
        c28871BUt.LIZJ = true;
        C30882CAc.LJII(context, c28871BUt);
    }

    public static final void onClick$5(ACListenerS44S1100000_5 aCListenerS44S1100000_5, View view) {
        C7N.LJFF().Lu();
        Context context = ((VoiceChatBroadcastFragment) aCListenerS44S1100000_5.l1).getContext();
        C28871BUt c28871BUt = new C28871BUt(aCListenerS44S1100000_5.s0);
        c28871BUt.LIZJ = true;
        C30882CAc.LJII(context, c28871BUt);
    }

    public static final void onClick$6(ACListenerS44S1100000_5 aCListenerS44S1100000_5, View view) {
        Activity activity;
        C29931Bot c29931Bot = (C29931Bot) aCListenerS44S1100000_5.l1;
        String str = aCListenerS44S1100000_5.s0;
        if (str == null) {
            str = "";
        }
        c29931Bot.getClass();
        IHostAction iHostAction = (IHostAction) CN1.LIZ(IHostAction.class);
        if (iHostAction != null) {
            activity = iHostAction.getTopActivity();
        } else {
            activity = null;
        }
        C29929Bor LIZ = C29930Bos.LIZ();
        LIZ.LJIIJ = str;
        LIZ.LJJIJIL = ((IUserManageService) CN1.LIZ(IUserManageService.class)).Ab0();
        if (c29931Bot.LIZJ) {
            LIZ.LJJ = "live_links";
            LIZ.LJJIJIIJIL = c29931Bot.LIZLLL;
        }
        ((C29338BfK) ((IShareService) CN1.LIZ(IShareService.class)).un0()).LIZ(activity, LIZ.LIZLLL(), new OG9());
    }

    public static final void onClick$7(ACListenerS44S1100000_5 aCListenerS44S1100000_5, View view) {
        ((IBrowserService) CN1.LIZ(IBrowserService.class)).Lu();
        Context context = ((View) aCListenerS44S1100000_5.l1).getContext();
        C28871BUt c28871BUt = new C28871BUt(aCListenerS44S1100000_5.s0);
        c28871BUt.LIZJ = true;
        C30882CAc.LJII(context, c28871BUt);
    }

    public static final void onClick$8(ACListenerS44S1100000_5 aCListenerS44S1100000_5, View view) {
        ((IBrowserService) CN1.LIZ(IBrowserService.class)).Lu();
        Context context = ((View) aCListenerS44S1100000_5.l1).getContext();
        C28871BUt c28871BUt = new C28871BUt(aCListenerS44S1100000_5.s0);
        c28871BUt.LIZJ = true;
        C30882CAc.LJII(context, c28871BUt);
    }

    public ACListenerS44S1100000_5(LiveBroadcastFragment liveBroadcastFragment, int i) {
        this.$t = i;
        this.l1 = liveBroadcastFragment;
        this.s0 = null;
    }

    public ACListenerS44S1100000_5(VoiceChatBroadcastFragment voiceChatBroadcastFragment, int i) {
        this.$t = i;
        this.l1 = voiceChatBroadcastFragment;
        this.s0 = null;
    }

    public ACListenerS44S1100000_5(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
