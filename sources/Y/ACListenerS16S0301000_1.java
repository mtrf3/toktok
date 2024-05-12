package Y;

import X.C1042547h;
import X.C109544Rq;
import X.C113554cx;
import X.C132805Jc;
import X.C1DJ;
import X.C26045AKb;
import X.C36636EZk;
import X.C4MW;
import X.C64262fe;
import X.C6ZT;
import X.C71952s3;
import X.C769730j;
import X.C780334l;
import X.C78613UtF;
import X.C87393br;
import X.C88903eI;
import X.C89853fp;
import X.C89933fx;
import X.C90083gC;
import X.C92183ja;
import X.EnumC73222u6;
import X.EnumC89943fy;
import X.InterfaceC70422pa;
import X.InterfaceC88473Ynt;
import X.InterfaceC92803ka;
import X.ORZ;
import X.OSZ;
import X.XKX;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.InfoCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.infocard.InfoCardButtonComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkType;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class ACListenerS16S0301000_1 implements View.OnClickListener {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS16S0301000_1 aCListenerS16S0301000_1, View view) {
        InterfaceC70422pa interfaceC70422pa;
        ((View) aCListenerS16S0301000_1.l0).setEnabled(false);
        LifecycleOwner lifecycleOwner = (LifecycleOwner) aCListenerS16S0301000_1.l1;
        if (lifecycleOwner == null || (interfaceC70422pa = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
            interfaceC70422pa = C780334l.LJLIL;
        }
        XKX.LIZLLL(interfaceC70422pa, C36636EZk.LIZ.LJJIJIL(), null, new C64262fe(aCListenerS16S0301000_1.i3, (View) aCListenerS16S0301000_1.l0, (InterfaceC88473Ynt) aCListenerS16S0301000_1.l2, view, null), 2);
    }

    public static final void onClick$1(ACListenerS16S0301000_1 aCListenerS16S0301000_1, View view) {
        int i = 0;
        if (!((C89933fx) aCListenerS16S0301000_1.l0).LJLJL.isSelected()) {
            C89853fp c89853fp = ((C90083gC) aCListenerS16S0301000_1.l1).LJLIL;
            if (c89853fp.LJIIJJI.size() + c89853fp.LIZLLL >= c89853fp.LJFF()) {
                C26045AKb c26045AKb = new C26045AKb(((C89933fx) aCListenerS16S0301000_1.l0).LJLIL);
                c26045AKb.LJIIIZ(((C89933fx) aCListenerS16S0301000_1.l0).LJLIL.getContext().getString(R.string.poe, String.valueOf(((C90083gC) aCListenerS16S0301000_1.l1).LJLIL.LJFF())));
                c26045AKb.LIZLLL(3000L);
                c26045AKb.LJIIJ();
                return;
            }
        }
        TuxIconView tuxIconView = ((C89933fx) aCListenerS16S0301000_1.l0).LJLJL;
        tuxIconView.setSelected(true ^ tuxIconView.isSelected());
        if (((C89933fx) aCListenerS16S0301000_1.l0).LJLJL.isSelected()) {
            EnumC89943fy enumC89943fy = EnumC89943fy.Following;
            int i2 = aCListenerS16S0301000_1.i3;
            List<? extends IMUser> list = ((C89933fx) aCListenerS16S0301000_1.l0).LJLILLLLZI.LJLILLLLZI;
            if (list != null) {
                i = list.size();
            }
            if (i2 >= i) {
                enumC89943fy = EnumC89943fy.Search;
            }
            ((C90083gC) aCListenerS16S0301000_1.l1).LJLIL.LIZ((IMUser) aCListenerS16S0301000_1.l2, enumC89943fy);
            return;
        }
        ((C90083gC) aCListenerS16S0301000_1.l1).LJLIL.LJIIIIZZ((IMUser) aCListenerS16S0301000_1.l2);
    }

    public static final void onClick$2(ACListenerS16S0301000_1 aCListenerS16S0301000_1, View view) {
        Object LJLLLL;
        int i;
        boolean z;
        if (C6ZT.LIZ(view)) {
            return;
        }
        C1042547h.LJFF((C109544Rq) aCListenerS16S0301000_1.l0);
        C109544Rq c109544Rq = (C109544Rq) aCListenerS16S0301000_1.l0;
        int i2 = aCListenerS16S0301000_1.i3;
        char[] clickStatusArr = (char[]) aCListenerS16S0301000_1.l1;
        o.LJIIIZ(c109544Rq, "<this>");
        o.LJIIIZ(clickStatusArr, "clickStatusArr");
        clickStatusArr[i2] = '1';
        C769730j.LIZJ(c109544Rq, clickStatusArr);
        InfoCardTemplate template = (InfoCardTemplate) aCListenerS16S0301000_1.l2;
        C109544Rq currentMsg = (C109544Rq) aCListenerS16S0301000_1.l0;
        int i3 = aCListenerS16S0301000_1.i3;
        o.LJIIIZ(template, "template");
        o.LJIIIZ(currentMsg, "currentMsg");
        String str = ((InfoCardButtonComponent) ListProtector.get(template.infoCardButtons, i3)).cardText.text;
        TextContent.Companion companion = TextContent.Companion;
        int length = str.length() - 1;
        int i4 = 0;
        boolean z2 = false;
        while (i4 <= length) {
            if (!z2) {
                i = i4;
            } else {
                i = length;
            }
            if (o.LJIIJJI(str.charAt(i), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z2) {
                if (!z) {
                    z2 = true;
                } else {
                    i4++;
                }
            } else if (!z) {
                break;
            } else {
                length--;
            }
        }
        TextContent obtain$default = TextContent.Companion.obtain$default(companion, C132805Jc.LIZJ(length, 1, str, i4), null, null, 6, null);
        if (o.LJ(currentMsg.getScene(), "ttba_qa")) {
            obtain$default.type = 707;
        }
        C4MW c4mw = (C4MW) C88903eI.LIZ();
        c4mw.LIZ.LIZIZ = currentMsg.getConversationId();
        c4mw.LIZLLL(obtain$default);
        OSZ[] oszArr = new OSZ[5];
        String str2 = currentMsg.getLocalExt().get("enter_from");
        Object obj = "";
        if (str2 == null) {
            str2 = "";
        }
        oszArr[0] = new OSZ("enter_from", str2);
        String str3 = currentMsg.getLocalExt().get("enter_method");
        if (str3 == null) {
            str3 = "";
        }
        oszArr[1] = new OSZ("enter_method", str3);
        ActionLinkComponent actionLinkComponent = ((InfoCardButtonComponent) ListProtector.get(template.infoCardButtons, i3)).linkInfo;
        o.LJIIIZ(actionLinkComponent, "<this>");
        if (actionLinkComponent.linkType == ActionLinkType.CALLBACK && (LJLLLL = ORZ.LJLLLL(actionLinkComponent.data)) != null) {
            obj = LJLLLL;
        }
        oszArr[2] = new OSZ("callback_link", obj);
        oszArr[3] = new OSZ("info_card_msg_id", String.valueOf(currentMsg.getMsgId()));
        oszArr[4] = new OSZ("qns_index", String.valueOf(i3));
        c4mw.LIZ.LJII = C113554cx.LJJLIIIIJ(oszArr);
        String scene = currentMsg.getScene();
        if (scene != null) {
            c4mw.LIZ(scene);
        }
        c4mw.LJII(new InterfaceC92803ka() { // from class: X.30k
            @Override // X.InterfaceC92793kZ
            public final void LIZ(C63120Opw c63120Opw, List<? extends C109544Rq> list) {
            }

            @Override // X.InterfaceC92803ka
            public final void LIZIZ(C63120Opw c63120Opw, C109544Rq c109544Rq2) {
            }

            @Override // X.InterfaceC92793kZ
            public final void LIZJ(C63120Opw c63120Opw, C109544Rq c109544Rq2) {
            }

            @Override // X.InterfaceC92803ka
            public final void LIZLLL(C63120Opw c63120Opw, List<C109544Rq> list, java.util.Map<C109544Rq, C63623Oy3> map) {
            }

            @Override // X.InterfaceC92803ka
            public final void LJ(C63120Opw c63120Opw, C109544Rq c109544Rq2, C63623Oy3 c63623Oy3) {
            }

            @Override // X.InterfaceC92803ka
            public final void LJFF(C63120Opw c63120Opw, C109544Rq c109544Rq2) {
                C769730j.LIZIZ(c109544Rq2);
            }
        });
    }

    public static final void onClick$3(ACListenerS16S0301000_1 aCListenerS16S0301000_1, View view) {
        BaseTemplate LJIILL;
        BaseRequestComponent LLLL;
        QueryDataComponent queryDataComponent;
        Map<String, String> map;
        String str;
        String str2;
        boolean z;
        ChatRoomViewModel chatRoomViewModel = ((C92183ja) aCListenerS16S0301000_1.l0).LJIIIZ;
        if (chatRoomViewModel != null) {
            int i = aCListenerS16S0301000_1.i3;
            C109544Rq msg = (C109544Rq) aCListenerS16S0301000_1.l1;
            View context = (View) aCListenerS16S0301000_1.l2;
            o.LJIIIZ(msg, "msg");
            o.LJIIIZ(context, "context");
            if ((i == 103 || i == 104) && (LJIILL = C1DJ.LJIILL(msg)) != null && (LLLL = LJIILL.LLLL()) != null && (queryDataComponent = LLLL.queryData) != null && (map = queryDataComponent.extras) != null && (str = map.get("a:sticker_id")) != null) {
                long parseLong = CastLongProtector.parseLong(str);
                String str3 = map.get("a:sticker_type");
                if (str3 != null) {
                    int parseInt = CastIntegerProtector.parseInt(str3);
                    String str4 = map.get("a:sticker_creator_user_id");
                    if (parseInt == EnumC73222u6.STATIC.getType() || parseInt == EnumC73222u6.ANIMATED.getType()) {
                        str2 = "set";
                    } else if (parseInt == EnumC73222u6.VIDEO_STICKER_STATIC.getType() || parseInt == EnumC73222u6.VIDEO_STICKER_ANIMATED.getType()) {
                        str2 = "video";
                    } else {
                        str2 = null;
                    }
                    C87393br c87393br = C87393br.LIZ;
                    String valueOf = String.valueOf(parseLong);
                    if (parseInt == EnumC73222u6.ANIMATED.getType() || parseInt == EnumC73222u6.VIDEO_STICKER_ANIMATED.getType()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C87393br.LJJI(c87393br, valueOf, str4, str2, z, "chat", "reaction_view_store_button");
                    XKX.LIZLLL(ViewModelKt.getViewModelScope(chatRoomViewModel), C78613UtF.LIZJ, null, new C71952s3(parseLong, parseInt, context, null), 2);
                }
            }
        }
        ((C92183ja) aCListenerS16S0301000_1.l0).LIZ();
    }

    public ACListenerS16S0301000_1(int i, Object obj, Object obj2, Object obj3, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i3 = i;
        this.l1 = obj3;
        this.l2 = obj2;
    }
}
