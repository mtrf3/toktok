package Y;

import X.C119494mX;
import X.C34B;
import X.C3WT;
import X.C76800UCe;
import X.C85703Xy;
import X.C97413s1;
import X.C98523to;
import X.EnumC96103pu;
import X.InterfaceC88473Ynt;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.model.AdDislikeReasonModel;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.MessageRequestViewModel;
import kotlin.jvm.internal.AqS91S0101000_1;

/* loaded from: classes2.dex */
public class ACListenerS20S0101000_1 implements View.OnClickListener {
    public final int $t;
    public int i1;
    public Object l0;

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
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS20S0101000_1 aCListenerS20S0101000_1, View view) {
        C34B.LIZIZ("StrangerChatRiskHint", "primary");
        C3WT c3wt = (C3WT) aCListenerS20S0101000_1.l0;
        C98523to c98523to = c3wt.LJLJI;
        if (c98523to != null) {
            c3wt.LIZLLL(c98523to, aCListenerS20S0101000_1.i1, EnumC96103pu.USER_SET_CONVERSATION_CATEGORY_PRIMARY);
        }
    }

    public static final void onClick$1(ACListenerS20S0101000_1 aCListenerS20S0101000_1, View view) {
        C34B.LIZIZ("StrangerChatRiskHint", "secondary");
        C3WT c3wt = (C3WT) aCListenerS20S0101000_1.l0;
        C98523to c98523to = c3wt.LJLJI;
        if (c98523to != null) {
            c3wt.LIZLLL(c98523to, aCListenerS20S0101000_1.i1, EnumC96103pu.USER_SET_CONVERSATION_CATEGORY_SECONDARY);
        }
    }

    public static final void onClick$2(ACListenerS20S0101000_1 aCListenerS20S0101000_1, View view) {
        C119494mX c119494mX = (C119494mX) aCListenerS20S0101000_1.l0;
        int i = c119494mX.LJLJI;
        c119494mX.LJLJI = aCListenerS20S0101000_1.i1;
        c119494mX.notifyItemChanged(i);
        C119494mX c119494mX2 = (C119494mX) aCListenerS20S0101000_1.l0;
        c119494mX2.notifyItemChanged(c119494mX2.LJLJI);
        ((C119494mX) aCListenerS20S0101000_1.l0).LJLILLLLZI.invoke(Integer.valueOf(aCListenerS20S0101000_1.i1));
    }

    public static final void onClick$3(ACListenerS20S0101000_1 aCListenerS20S0101000_1, View view) {
        C85703Xy c85703Xy = (C85703Xy) aCListenerS20S0101000_1.l0;
        InterfaceC88473Ynt<String, String, Integer, C76800UCe> interfaceC88473Ynt = c85703Xy.LJLILLLLZI;
        String toast = ((AdDislikeReasonModel) ListProtector.get(c85703Xy.LJLIL, aCListenerS20S0101000_1.i1)).getToast();
        String str = "";
        if (toast == null) {
            toast = "";
        }
        String key = ((AdDislikeReasonModel) ListProtector.get(((C85703Xy) aCListenerS20S0101000_1.l0).LJLIL, aCListenerS20S0101000_1.i1)).getKey();
        if (key != null) {
            str = key;
        }
        interfaceC88473Ynt.invoke(toast, str, Integer.valueOf(aCListenerS20S0101000_1.i1));
    }

    public static final void onClick$4(ACListenerS20S0101000_1 aCListenerS20S0101000_1, View view) {
        C97413s1 c97413s1 = (C97413s1) aCListenerS20S0101000_1.l0;
        int i = aCListenerS20S0101000_1.i1;
        MessageRequestViewModel messageRequestViewModel = c97413s1.LJLIL;
        messageRequestViewModel.getClass();
        messageRequestViewModel.withState(new AqS91S0101000_1(i, messageRequestViewModel, 10));
        ((C97413s1) aCListenerS20S0101000_1.l0).notifyItemChanged(aCListenerS20S0101000_1.i1);
    }

    public ACListenerS20S0101000_1(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
