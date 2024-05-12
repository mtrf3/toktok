package Y;

import X.BZI;
import X.C28703BOh;
import X.C28706BOk;
import X.C28787BRn;
import X.C29306Beo;
import X.C31684Cc4;
import X.C31692CcC;
import X.C41061jK;
import X.CN1;
import X.InterfaceC28707BOl;
import X.InterfaceC31687Cc7;
import X.InterfaceC31710CcU;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.chatroom.model.LatestBanRecordInfo;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.presenter.GameLinkGuestPresenter;
import com.bytedance.android.livesdkapi.depend.model.live.debug.Answer;
import com.bytedance.android.livesdkapi.depend.model.live.debug.Question;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashSet;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class ACListenerS29S0400000_5 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS29S0400000_5 aCListenerS29S0400000_5, View view) {
        String str;
        ((GameLinkGuestPresenter) aCListenerS29S0400000_5.l0).openSuspendDetailsPage((Context) aCListenerS29S0400000_5.l1, (LatestBanRecordInfo) aCListenerS29S0400000_5.l2);
        ((LiveDialog) aCListenerS29S0400000_5.l3).dismiss();
        BZI LIZ = C28787BRn.LIZ("livesdk_guest_linkmic_ban_details_click");
        LIZ.LJIIZILJ();
        LIZ.LIZJ("click");
        if (C29306Beo.LJIIJJI(DataChannelGlobal.LJLJJI)) {
            str = "anchor";
        } else {
            str = "guest";
        }
        LIZ.LJIJJ(str, "user_type");
        LIZ.LJJIIJZLJL();
    }

    public static final void onClick$1(ACListenerS29S0400000_5 aCListenerS29S0400000_5, View view) {
        InterfaceC31687Cc7 LIZ = ((IIconSlot) aCListenerS29S0400000_5.l0).LIZ();
        if (LIZ != null) {
            LIZ.LIZ(((C31692CcC) aCListenerS29S0400000_5.l3).LJLJJL.LJFF(), "during_live");
        } else {
            ((IIconSlot) aCListenerS29S0400000_5.l0).getScheme();
            if (!TextUtils.isEmpty(null)) {
                IHostAction iHostAction = (IHostAction) CN1.LIZ(IHostAction.class);
                ((IIconSlot) aCListenerS29S0400000_5.l0).getScheme();
                iHostAction.openLiveBrowser((String) null, ((IIconSlot.SlotViewModel) aCListenerS29S0400000_5.l1).LJLLI.getValue(), ((C31692CcC) aCListenerS29S0400000_5.l3).LJLILLLLZI);
            }
        }
        C31684Cc4.LJ((InterfaceC31710CcU) aCListenerS29S0400000_5.l2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$2(ACListenerS29S0400000_5 aCListenerS29S0400000_5, View view) {
        ((C41061jK) aCListenerS29S0400000_5.l0).setChecked(!((C41061jK) aCListenerS29S0400000_5.l0).isChecked());
        C28706BOk c28706BOk = (C28706BOk) aCListenerS29S0400000_5.l1;
        long questionId = ((Question) aCListenerS29S0400000_5.l2).getQuestionId();
        Object tag = view.getTag();
        o.LJII(tag, "null cannot be cast to non-null type kotlin.String");
        Answer answer = c28706BOk.LJLJI.LJLJJI.get(Long.valueOf(questionId));
        if (answer != null) {
            HashSet<String> answers = answer.getAnswers();
            if (answers != null) {
                answers.clear();
            }
        } else {
            answer = new Answer(questionId, new HashSet());
        }
        answer.getAnswers().add(tag);
        c28706BOk.LJLJI.LJLJJI.put(Long.valueOf(questionId), answer);
        InterfaceC28707BOl interfaceC28707BOl = c28706BOk.LJLJI.LJLJJL;
        if (interfaceC28707BOl != null) {
            interfaceC28707BOl.eg();
        }
        ((C28703BOh) aCListenerS29S0400000_5.l3).notifyDataSetChanged();
    }

    public ACListenerS29S0400000_5(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
