package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C109544Rq;
import X.C111534Zh;
import X.C113554cx;
import X.C2068389v;
import X.C4T8;
import X.C63120Opw;
import X.C63219OrX;
import X.C76800UCe;
import X.C772831o;
import X.C7L2;
import X.C7L3;
import X.C80763Ey;
import X.C85323Wm;
import X.C87453bx;
import X.C97383ry;
import X.EnumC97443s4;
import X.InterfaceC88472Yns;
import X.InterfaceC99673vf;
import X.OSZ;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.videoselection.fragment.VideoSelectionContentFragment;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.MessageRequestViewModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class AqS91S0101000_1 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS91S0101000_1 aqS91S0101000_1, Object obj) {
        ViewGroup it = (ViewGroup) obj;
        o.LJIIIZ(it, "it");
        Context context = it.getContext();
        o.LJIIIIZZ(context, "it.context");
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setTuxIcon((C2068389v) aqS91S0101000_1.l0);
        int i = aqS91S0101000_1.i1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        it.addView(tuxIconView, layoutParams);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS91S0101000_1 aqS91S0101000_1, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        assemble.mv0((VideoSelectionContentFragment) aqS91S0101000_1.l0, new AqS26S0001000_1(aqS91S0101000_1.i1, 0));
        assemble.wv0((VideoSelectionContentFragment) aqS91S0101000_1.l0, C7L2.LJLIL);
        assemble.wv0((VideoSelectionContentFragment) aqS91S0101000_1.l0, C7L3.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS91S0101000_1 aqS91S0101000_1, Object obj) {
        String str;
        String str2;
        C4T8 state = (C4T8) obj;
        o.LJIIIZ(state, "state");
        C97383ry c97383ry = (C97383ry) ListProtector.get(state.LJLJJL, aqS91S0101000_1.i1);
        C97383ry L = C97383ry.L(c97383ry, !c97383ry.LJLIL);
        MessageRequestViewModel messageRequestViewModel = (MessageRequestViewModel) aqS91S0101000_1.l0;
        int i = aqS91S0101000_1.i1;
        messageRequestViewModel.getClass();
        messageRequestViewModel.withState(new AqS52S0201000_1(messageRequestViewModel, i, L, 6));
        Object type = ((MessageRequestViewModel) aqS91S0101000_1.l0).LJLJI.getValue();
        boolean z = L.LJLIL;
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(type, "type");
        o.LJIIIZ(onEventV3, "onEventV3");
        C63120Opw c63120Opw = c97383ry.LJLILLLLZI;
        OSZ[] oszArr = new OSZ[5];
        if (type == EnumC97443s4.FILTERED) {
            str = "filtered_message_request";
        } else {
            str = "non_filtered_message_request";
        }
        oszArr[0] = new OSZ("enter_from", str);
        oszArr[1] = new OSZ("unread_cnt", String.valueOf(c63120Opw.getUnreadCount()));
        oszArr[2] = new OSZ("conversation_id", c63120Opw.getConversationId());
        String LIZ = C80763Ey.LIZ(false);
        LIZ.toString();
        oszArr[3] = new OSZ("to_user_id", LIZ);
        if (z) {
            str2 = "select";
        } else {
            str2 = "unselect";
        }
        oszArr[4] = new OSZ("action", str2);
        onEventV3.LIZIZ("dm_multiselect_user", C113554cx.LJJL(oszArr));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS91S0101000_1 aqS91S0101000_1, Object obj) {
        C87453bx setState = (C87453bx) obj;
        o.LJIIIZ(setState, "$this$setState");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((List) aqS91S0101000_1.l0);
        return C87453bx.LIZ(setState, null, arrayList, aqS91S0101000_1.i1, false, 9);
    }

    public static final Object invoke$3(AqS91S0101000_1 aqS91S0101000_1, Object it) {
        o.LJIIIZ(it, "it");
        ListProtector.set((List) aqS91S0101000_1.l0, aqS91S0101000_1.i1, it);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS91S0101000_1 aqS91S0101000_1, Object it) {
        o.LJIIIZ(it, "it");
        ListProtector.set((List) aqS91S0101000_1.l0, aqS91S0101000_1.i1, it);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS91S0101000_1 aqS91S0101000_1, Object it) {
        o.LJIIIZ(it, "it");
        ListProtector.set((List) aqS91S0101000_1.l0, aqS91S0101000_1.i1, it);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS91S0101000_1 aqS91S0101000_1, Object obj) {
        int i;
        int intValue = ((Number) obj).intValue();
        int emojiRectWidth = ((C111534Zh) aqS91S0101000_1.l0).getEmojiRectWidth();
        ((C111534Zh) aqS91S0101000_1.l0).getEmojiMinSpace();
        int emojiPanelMarginEdge = ((C111534Zh) aqS91S0101000_1.l0).getEmojiPanelMarginEdge();
        C111534Zh c111534Zh = (C111534Zh) aqS91S0101000_1.l0;
        int i2 = aqS91S0101000_1.i1;
        c111534Zh.getClass();
        if (i2 <= 1) {
            i = 0;
        } else {
            i = ((intValue - (emojiPanelMarginEdge * 2)) - (emojiRectWidth * i2)) / (i2 - 1);
        }
        return Integer.valueOf(i);
    }

    public static final Object invoke$7(AqS91S0101000_1 aqS91S0101000_1, Object it) {
        o.LJIIIZ(it, "it");
        ListProtector.set((List) aqS91S0101000_1.l0, aqS91S0101000_1.i1, it);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS91S0101000_1 aqS91S0101000_1, Object obj) {
        InterfaceC99673vf it = (InterfaceC99673vf) obj;
        o.LJIIIZ(it, "it");
        it.u7(aqS91S0101000_1.i1, (C109544Rq) aqS91S0101000_1.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS91S0101000_1 aqS91S0101000_1, Object obj) {
        InterfaceC99673vf it = (InterfaceC99673vf) obj;
        o.LJIIIZ(it, "it");
        it.y5(aqS91S0101000_1.i1, (C63219OrX) aqS91S0101000_1.l0);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS91S0101000_1(int i, C109544Rq c109544Rq, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c109544Rq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS91S0101000_1(int i, C63219OrX c63219OrX, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c63219OrX;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS91S0101000_1(int i, MessageRequestViewModel messageRequestViewModel, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = messageRequestViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS91S0101000_1(int i, int i2, List<String> list) {
        super(1);
        this.$t = list;
        this.i1 = i;
        this.l0 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS91S0101000_1(C111534Zh c111534Zh, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c111534Zh;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS91S0101000_1(C2068389v c2068389v, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c2068389v;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS91S0101000_1(VideoSelectionContentFragment videoSelectionContentFragment, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = videoSelectionContentFragment;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS91S0101000_1(List list, List<String> list2, int i) {
        super(1);
        this.$t = i;
        this.l0 = list;
        this.i1 = list2;
    }
}
