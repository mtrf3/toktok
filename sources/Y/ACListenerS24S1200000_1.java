package Y;

import X.AbstractC62625Ohx;
import X.C05040Hs;
import X.C1HQ;
import X.C251669uE;
import X.C3P6;
import X.C3P7;
import X.C3P8;
import X.C3PB;
import X.C3PD;
import X.C3PE;
import X.C3WX;
import X.C73022tm;
import X.C85323Wm;
import X.C90643h6;
import X.C98523to;
import X.C99033ud;
import X.InterfaceC62225ObV;
import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.ui.GroupShareChannelDelegate;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.viewmodel.GroupShareViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class ACListenerS24S1200000_1 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
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

    public static final void onClick$0(ACListenerS24S1200000_1 aCListenerS24S1200000_1, View view) {
        boolean LIZ;
        AbstractC62625Ohx abstractC62625Ohx;
        LIZ = C251669uE.LIZ(view, LinkMicRtcMixBitrateSetting.DEFAULT);
        if (!LIZ && (abstractC62625Ohx = (AbstractC62625Ohx) ((GroupShareChannelDelegate.ShareChannelCell) aCListenerS24S1200000_1.l1).LJLILLLLZI.getValue()) != null) {
            InterfaceC62225ObV interfaceC62225ObV = (InterfaceC62225ObV) aCListenerS24S1200000_1.l2;
            GroupShareChannelDelegate.ShareChannelCell shareChannelCell = (GroupShareChannelDelegate.ShareChannelCell) aCListenerS24S1200000_1.l1;
            String str = aCListenerS24S1200000_1.s0;
            Context context = shareChannelCell.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            interfaceC62225ObV.LJIIJ(abstractC62625Ohx, context, null);
            GroupShareViewModel groupShareViewModel = (GroupShareViewModel) shareChannelCell.LJLIL.getValue();
            if (groupShareViewModel != null) {
                groupShareViewModel.LJLJJL.postValue(Boolean.TRUE);
            }
            C85323Wm LIZJ = C05040Hs.LIZJ(str, "platform", "onEventV3");
            C1HQ c1hq = new C1HQ();
            c1hq.put("conversation_id", C90643h6.LIZLLL);
            c1hq.put("previous_page", C90643h6.LIZJ);
            c1hq.put("is_master", String.valueOf(C90643h6.LJ));
            c1hq.put("platform", str);
            LIZJ.LIZIZ("share_group_via", c1hq);
        }
    }

    public static final void onClick$1(ACListenerS24S1200000_1 aCListenerS24S1200000_1, View view) {
        String str;
        C3PB c3pb;
        C3PD c3pd = ((C3WX) aCListenerS24S1200000_1.l1).LJLJJLL;
        if (c3pd != null) {
            c3pd.LLLLIIIILLL();
        }
        C99033ud c99033ud = (C99033ud) aCListenerS24S1200000_1.l2;
        String str2 = null;
        if (c99033ud != null) {
            str = c99033ud.getConversationId();
        } else {
            str = null;
        }
        C99033ud c99033ud2 = (C99033ud) aCListenerS24S1200000_1.l2;
        if ((c99033ud2 instanceof C98523to) && c99033ud2 != null) {
            str2 = c99033ud2.getSingleChatFromUserId();
        }
        if (((C99033ud) aCListenerS24S1200000_1.l2) instanceof C98523to) {
            c3pb = C3PB.SINGLE;
        } else {
            c3pb = C3PB.GROUP;
        }
        C3P6 c3p6 = C3P7.Companion;
        String str3 = aCListenerS24S1200000_1.s0;
        c3p6.getClass();
        C3P8.LIZ(str, str2, c3pb, C3P6.LIZ(str3), C73022tm.LJFF(), new C3PE() { // from class: X.3PF
        });
    }

    public ACListenerS24S1200000_1(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
