package Y;

import X.AbstractC90763hI;
import X.AbstractViewOnClickListenerC105754Db;
import X.AnonymousClass361;
import X.AnonymousClass489;
import X.C107764Ku;
import X.C109544Rq;
import X.C110714Wd;
import X.C111214Yb;
import X.C115394fv;
import X.C117984k6;
import X.C117994k7;
import X.C31F;
import X.C31G;
import X.C32I;
import X.C34B;
import X.C3OG;
import X.C3TZ;
import X.C3UD;
import X.C40C;
import X.C45R;
import X.C47261Igj;
import X.C4WD;
import X.C57082Lw;
import X.C5S1;
import X.C62070OXq;
import X.C63088OpQ;
import X.C63120Opw;
import X.C63164Oqe;
import X.C63309Osz;
import X.C63322OtC;
import X.C63623Oy3;
import X.C72808Sho;
import X.C73516StE;
import X.C73578SuE;
import X.C785536l;
import X.C78857UxB;
import X.C80993Fv;
import X.C81273Gx;
import X.C84283Sm;
import X.C84523Tk;
import X.C85163Vw;
import X.C89233ep;
import X.C90643h6;
import X.C92183ja;
import X.C93793mB;
import X.C95153oN;
import X.C95683pE;
import X.C95693pF;
import X.C95743pK;
import X.C95823pS;
import X.C99033ud;
import X.EF7;
import X.EnumC115774gX;
import X.EnumC96123pw;
import X.EnumC97443s4;
import X.EnumC99903w2;
import X.InterfaceC57784Mm4;
import X.InterfaceC65052gv;
import X.InterfaceC65784Pro;
import X.InterfaceC86963bA;
import X.MG5;
import X.ORZ;
import X.QCU;
import X.V1B;
import X.X1D;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.im.core.proto.ConversationApplyInfo;
import com.bytedance.keva.Keva;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.viewmodel.GroupChatViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.SessionListReadStatusViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.group.GroupChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.group.GroupChatVM;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.group.functions.GroupDetailViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.group.request.GroupDetailRequestListVM;
import com.ss.android.ugc.aweme.im.sdk.group.data.model.GroupCheckMsg;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS26S1000000_1;
import kotlin.jvm.internal.o;
import o3.h0;

/* loaded from: classes2.dex */
public class IDcS364S0100000_1 implements InterfaceC86963bA {
    public final int $t;
    public Object l0;

    public static final void LIZIZ$12(IDcS364S0100000_1 iDcS364S0100000_1, C63623Oy3 c63623Oy3) {
    }

    public static final void LIZIZ$13(IDcS364S0100000_1 iDcS364S0100000_1, C63623Oy3 c63623Oy3) {
    }

    public static final void LIZIZ$16(IDcS364S0100000_1 iDcS364S0100000_1, C63623Oy3 c63623Oy3) {
    }

    public static final void LIZIZ$19(IDcS364S0100000_1 iDcS364S0100000_1, C63623Oy3 c63623Oy3) {
    }

    public static final void LIZIZ$3(IDcS364S0100000_1 iDcS364S0100000_1, C63623Oy3 c63623Oy3) {
    }

    public static final void LIZIZ$5(IDcS364S0100000_1 iDcS364S0100000_1, C63623Oy3 c63623Oy3) {
    }

    @Override // X.InterfaceC86963bA
    public final void LIZIZ(C63623Oy3 c63623Oy3) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, c63623Oy3);
                return;
            case 1:
                LIZIZ$1(this, c63623Oy3);
                return;
            case 2:
                LIZIZ$2(this, c63623Oy3);
                return;
            case 3:
                LIZIZ$3(this, c63623Oy3);
                return;
            case 4:
                QCU.LJFF("bring bot to top fail!!!!!!!!!!!!", null, 6);
                return;
            case 5:
                LIZIZ$5(this, c63623Oy3);
                return;
            case 6:
                LIZIZ$6(this, c63623Oy3);
                return;
            case 7:
                LIZIZ$7(this, c63623Oy3);
                return;
            case 8:
                LIZIZ$8(this, c63623Oy3);
                return;
            case 9:
                LIZIZ$9(this, c63623Oy3);
                return;
            case 10:
                LIZIZ$10(this, c63623Oy3);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LIZIZ$11(this, c63623Oy3);
                return;
            case 12:
                LIZIZ$12(this, c63623Oy3);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                LIZIZ$13(this, c63623Oy3);
                return;
            case 14:
                LIZIZ$14(this, c63623Oy3);
                return;
            case 15:
                LIZIZ$15(this, c63623Oy3);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                LIZIZ$16(this, c63623Oy3);
                return;
            case 17:
                LIZIZ$17(this, c63623Oy3);
                return;
            case 18:
                LIZIZ$18(this, c63623Oy3);
                return;
            case 19:
                LIZIZ$19(this, c63623Oy3);
                return;
            case 20:
                LIZIZ$20(this, c63623Oy3);
                return;
            case 21:
                LIZIZ$21(this, c63623Oy3);
                return;
            case 22:
                LIZIZ$22(this, c63623Oy3);
                return;
            case 23:
                LIZIZ$23(this, c63623Oy3);
                return;
            case 24:
                LIZIZ$24(this, c63623Oy3);
                return;
            case 25:
                o.LJIIIZ(c63623Oy3, "error");
                return;
            case 26:
                LIZIZ$26(this, c63623Oy3);
                return;
            case 27:
                LIZIZ$27(this, c63623Oy3);
                return;
            case 28:
                LIZIZ$28(this, c63623Oy3);
                return;
            case 29:
                LIZIZ$29(this, c63623Oy3);
                return;
            case 30:
                LIZIZ$30(this, c63623Oy3);
                return;
            case 31:
                LIZIZ$31(this, c63623Oy3);
                return;
            case 32:
                LIZIZ$32(this, c63623Oy3);
                return;
            case 33:
                LIZIZ$33(this, c63623Oy3);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC86963bA
    public final void onSuccess(Object obj) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(obj, "result");
                return;
            case 1:
                onSuccess$1(this, obj);
                return;
            case 2:
                onSuccess$2(this, obj);
                return;
            case 3:
                onSuccess$3(this, obj);
                return;
            case 4:
                onSuccess$4(this, obj);
                return;
            case 5:
                onSuccess$5(this, obj);
                return;
            case 6:
                onSuccess$6(this, obj);
                return;
            case 7:
                onSuccess$7(this, obj);
                return;
            case 8:
                o.LJIIIZ(obj, "result");
                return;
            case 9:
                onSuccess$9(this, obj);
                return;
            case 10:
                onSuccess$10(this, obj);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onSuccess$11(this, obj);
                return;
            case 12:
                onSuccess$12(this, obj);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onSuccess$13(this, obj);
                return;
            case 14:
                onSuccess$14(this, obj);
                return;
            case 15:
                onSuccess$15(this, obj);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onSuccess$16(this, obj);
                return;
            case 17:
                onSuccess$17(this, obj);
                return;
            case 18:
                onSuccess$18(this, obj);
                return;
            case 19:
                onSuccess$19(this, obj);
                return;
            case 20:
                onSuccess$20(this, obj);
                return;
            case 21:
                onSuccess$21(this, obj);
                return;
            case 22:
                onSuccess$22(this, obj);
                return;
            case 23:
                onSuccess$23(this, obj);
                return;
            case 24:
                onSuccess$24(this, obj);
                return;
            case 25:
                onSuccess$25(this, obj);
                return;
            case 26:
                onSuccess$26(this, obj);
                return;
            case 27:
                onSuccess$27(this, obj);
                return;
            case 28:
                onSuccess$28(this, obj);
                return;
            case 29:
                onSuccess$29(this, obj);
                return;
            case 30:
                onSuccess$30(this, obj);
                return;
            case 31:
                C34B.LIZIZ("CategoryAction", "undo success");
                return;
            case 32:
                onSuccess$32(this, obj);
                return;
            case 33:
                onSuccess$33(this, obj);
                return;
            default:
                return;
        }
    }

    public IDcS364S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZIZ$0(IDcS364S0100000_1 iDcS364S0100000_1, C63623Oy3 c63623Oy3) {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GroupChatNotMemberView deleteConversation ");
        LIZ.append(((C63120Opw) iDcS364S0100000_1.l0).getConversationId());
        LIZ.append(" fail ,");
        String str = null;
        if (c63623Oy3 != null) {
            num = Integer.valueOf(c63623Oy3.LIZ);
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", ");
        if (c63623Oy3 != null) {
            str = c63623Oy3.LIZJ;
        }
        LIZ.append(str);
        C34B.LIZJ("GroupChatPanel", X1D.LIZIZ(LIZ));
    }

    public static final void LIZIZ$1(IDcS364S0100000_1 iDcS364S0100000_1, C63623Oy3 c63623Oy3) {
        ((GroupDetailViewModel) iDcS364S0100000_1.l0).getClass();
        GroupDetailViewModel.mv0(c63623Oy3);
    }

    public static final void LIZIZ$10(IDcS364S0100000_1 iDcS364S0100000_1, C63623Oy3 c63623Oy3) {
        ((GroupDetailViewModel) iDcS364S0100000_1.l0).getClass();
        GroupDetailViewModel.mv0(c63623Oy3);
    }

    public static final void LIZIZ$11(IDcS364S0100000_1 iDcS364S0100000_1, C63623Oy3 c63623Oy3) {
        ((GroupDetailViewModel) iDcS364S0100000_1.l0).getClass();
        GroupDetailViewModel.mv0(c63623Oy3);
    }

    public static final void LIZIZ$14(IDcS364S0100000_1 iDcS364S0100000_1, C63623Oy3 c63623Oy3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("loadMoreRequest error: ");
        LIZ.append(c63623Oy3);
        C34B.LIZJ("GroupChatRequestListVM", X1D.LIZIZ(LIZ));
    }

    public static final void LIZIZ$15(IDcS364S0100000_1 iDcS364S0100000_1, C63623Oy3 c63623Oy3) {
        AnonymousClass489 anonymousClass489 = AnonymousClass489.LIZ;
        List LJJIJ = C47261Igj.LJJIJ((C109544Rq) iDcS364S0100000_1.l0);
        anonymousClass489.getClass();
        AnonymousClass489.LIZIZ(null, LJJIJ);
    }

    public static final void LIZIZ$17(IDcS364S0100000_1 iDcS364S0100000_1, C63623Oy3 c63623Oy3) {
        C85163Vw.LIZJ((AbstractViewOnClickListenerC105754Db) iDcS364S0100000_1.l0, c63623Oy3, MG5.CHAT_DETAILS);
        ((AbstractViewOnClickListenerC105754Db) iDcS364S0100000_1.l0).LLII().setChecked(((AbstractViewOnClickListenerC105754Db) iDcS364S0100000_1.l0).LLFII());
        ((AbstractViewOnClickListenerC105754Db) iDcS364S0100000_1.l0).LLII().setEnabled(true);
    }

    public static final void LIZIZ$18(IDcS364S0100000_1 iDcS364S0100000_1, C63623Oy3 error) {
        o.LJIIIZ(error, "error");
        C85163Vw.LIZJ((AbstractViewOnClickListenerC105754Db) iDcS364S0100000_1.l0, error, MG5.CHAT_DETAILS);
        ((AbstractViewOnClickListenerC105754Db) iDcS364S0100000_1.l0).LLIIIJ().setChecked(((AbstractViewOnClickListenerC105754Db) iDcS364S0100000_1.l0).LLFZ());
        ((AbstractViewOnClickListenerC105754Db) iDcS364S0100000_1.l0).LLIIIJ().setEnabled(true);
    }

    public static final void LIZIZ$2(IDcS364S0100000_1 iDcS364S0100000_1, C63623Oy3 c63623Oy3) {
        String str;
        Integer statusCode;
        C63088OpQ coreInfo;
        GroupDetailViewModel groupDetailViewModel = (GroupDetailViewModel) iDcS364S0100000_1.l0;
        groupDetailViewModel.setState(new AqS167S0100000_1(groupDetailViewModel, 146));
        GroupDetailViewModel groupDetailViewModel2 = (GroupDetailViewModel) iDcS364S0100000_1.l0;
        C63120Opw LIZLLL = groupDetailViewModel2.LJLIL.LJLILLLLZI.LIZLLL();
        String str2 = null;
        if (LIZLLL == null || (coreInfo = LIZLLL.getCoreInfo()) == null || (str = coreInfo.getName()) == null) {
            str = "";
        }
        groupDetailViewModel2.LJLJJL = str;
        if (c63623Oy3 != null) {
            str2 = c63623Oy3.LJ;
        }
        GroupCheckMsg groupCheckMsg = (GroupCheckMsg) C62070OXq.LIZ(GroupCheckMsg.class, str2);
        if (groupCheckMsg != null && (statusCode = groupCheckMsg.getStatusCode()) != null) {
            if (statusCode.intValue() == 7602) {
                String statusMsg = groupCheckMsg.getStatusMsg();
                if (statusMsg == null) {
                    return;
                }
                ((GroupDetailViewModel) iDcS364S0100000_1.l0).setState(new AqS26S1000000_1(statusMsg, 0));
                return;
            }
            if (statusCode.intValue() == 7601) {
                ((GroupDetailViewModel) iDcS364S0100000_1.l0).setState(C95823pS.LJLIL);
                return;
            }
        }
        ((GroupDetailViewModel) iDcS364S0100000_1.l0).setState(new AqS167S0100000_1(groupCheckMsg, 147));
    }

    public static final void LIZIZ$20(IDcS364S0100000_1 iDcS364S0100000_1, C63623Oy3 c63623Oy3) {
        Throwable runtimeException;
        int i;
        InterfaceC65052gv interfaceC65052gv = (InterfaceC65052gv) iDcS364S0100000_1.l0;
        if (c63623Oy3 == null || (runtimeException = c63623Oy3.LJII) == null) {
            runtimeException = new RuntimeException("createSingleConversation() failed with no errors");
        }
        ((C73578SuE) interfaceC65052gv).tryOnError(runtimeException);
        C90643h6.LIZIZ = "private_chat";
        if (c63623Oy3 != null) {
            i = c63623Oy3.LIZIZ;
        } else {
            i = -1;
        }
        C90643h6.LJFF(i, null, "private", null, "private", null, null, 224);
    }

    public static final void LIZIZ$21(IDcS364S0100000_1 iDcS364S0100000_1, C63623Oy3 c63623Oy3) {
        Throwable runtimeException;
        C45R c45r = (C45R) iDcS364S0100000_1.l0;
        if (c63623Oy3 == null || (runtimeException = c63623Oy3.LJII) == null) {
            runtimeException = new RuntimeException("updateLocalExt() failed with no errors");
        }
        ((C73516StE) c45r).tryOnError(runtimeException);
    }

    public static final void LIZIZ$22(IDcS364S0100000_1 iDcS364S0100000_1, C63623Oy3 error) {
        o.LJIIIZ(error, "error");
        C34B.LIZIZ("MessageStatus-SessionListReadStatusViewModel", "batchGetConversationListReadStatus: failure");
        SessionListReadStatusViewModel sessionListReadStatusViewModel = (SessionListReadStatusViewModel) iDcS364S0100000_1.l0;
        sessionListReadStatusViewModel.LJLJJI = false;
        sessionListReadStatusViewModel.LJLJJL = true;
    }

    public static final void LIZIZ$23(IDcS364S0100000_1 iDcS364S0100000_1, C63623Oy3 c63623Oy3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("add tako card fake message fail, error: ");
        LIZ.append(c63623Oy3);
        V1B.LJIIZILJ(X1D.LIZIZ(LIZ));
        ((InterfaceC65784Pro) iDcS364S0100000_1.l0).invoke();
    }

    public static final void LIZIZ$24(IDcS364S0100000_1 iDcS364S0100000_1, C63623Oy3 c63623Oy3) {
        ((C4WD) ((IDHandlerS14S0100000_1) iDcS364S0100000_1.l0).l0).LIZIZ = SystemClock.elapsedRealtime();
        C4WD c4wd = (C4WD) ((IDHandlerS14S0100000_1) iDcS364S0100000_1.l0).l0;
        C4WD.LIZIZ(c4wd.LIZIZ - c4wd.LIZ);
    }

    public static final void LIZIZ$26(IDcS364S0100000_1 iDcS364S0100000_1, C63623Oy3 c63623Oy3) {
        ((C115394fv) iDcS364S0100000_1.l0).LJIIJ();
    }

    public static final void LIZIZ$27(IDcS364S0100000_1 iDcS364S0100000_1, C63623Oy3 c63623Oy3) {
        ((C115394fv) iDcS364S0100000_1.l0).LJIIJ();
    }

    public static final void LIZIZ$28(IDcS364S0100000_1 iDcS364S0100000_1, C63623Oy3 c63623Oy3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StrangerManager deleteAllConversation for type ");
        LIZ.append(((EnumC97443s4) ((IDcS133S0200000_1) iDcS364S0100000_1.l0).l0).name());
        LIZ.append(" onSuccess");
        C63322OtC.LIZLLL(X1D.LIZIZ(LIZ));
        IDcS133S0200000_1 iDcS133S0200000_1 = (IDcS133S0200000_1) iDcS364S0100000_1.l0;
        ((C115394fv) iDcS133S0200000_1.l1).LJIIJJI((EnumC97443s4) iDcS133S0200000_1.l0);
    }

    public static final void LIZIZ$29(IDcS364S0100000_1 iDcS364S0100000_1, C63623Oy3 c63623Oy3) {
        QCU.LJFF("add msg failed!", null, 6);
        ((C89233ep) iDcS364S0100000_1.l0).LJ.LIZLLL();
    }

    public static final void LIZIZ$30(IDcS364S0100000_1 iDcS364S0100000_1, C63623Oy3 c63623Oy3) {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("recordCardCloseTs: failed, err=");
        if (c63623Oy3 != null) {
            num = Integer.valueOf(c63623Oy3.LIZ);
        } else {
            num = null;
        }
        LIZ.append(num);
        C34B.LJI("UserRecCardViewModel", X1D.LIZIZ(LIZ));
    }

    public static final void LIZIZ$31(IDcS364S0100000_1 iDcS364S0100000_1, C63623Oy3 c63623Oy3) {
        ((C3TZ) iDcS364S0100000_1.l0).LJFF();
    }

    public static final void LIZIZ$32(IDcS364S0100000_1 iDcS364S0100000_1, C63623Oy3 c63623Oy3) {
        String str = "ChatSession delete conversation failed: ";
        if (c63623Oy3 != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ChatSession delete conversation failed: ");
            LIZ.append(c63623Oy3.LIZ);
            LIZ.append(", ");
            LIZ.append(c63623Oy3.LIZJ);
            str = X1D.LIZIZ(LIZ);
        }
        C34B.LIZJ("DeleteAction", str);
        C5S1 c5s1 = new C5S1(EF7.LIZIZ());
        c5s1.LIZJ(R.string.h5q);
        c5s1.LJ();
    }

    public static final void LIZIZ$33(IDcS364S0100000_1 iDcS364S0100000_1, C63623Oy3 c63623Oy3) {
        C85163Vw.LIZJ(((C785536l) iDcS364S0100000_1.l0).LJLIL, c63623Oy3, MG5.CHAT_LIST);
    }

    public static final void LIZIZ$6(IDcS364S0100000_1 iDcS364S0100000_1, C63623Oy3 c63623Oy3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("send error: ");
        LIZ.append(c63623Oy3);
        C111214Yb.LIZJ("PhotoMsgSender", X1D.LIZIZ(LIZ));
        C117984k6.LIZ(false, (C117994k7) iDcS364S0100000_1.l0);
    }

    public static final void LIZIZ$7(IDcS364S0100000_1 iDcS364S0100000_1, C63623Oy3 c63623Oy3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("send error: ");
        LIZ.append(c63623Oy3);
        C111214Yb.LIZJ("VideoMsgSender", X1D.LIZIZ(LIZ));
        C117984k6.LIZ(false, (C117994k7) iDcS364S0100000_1.l0);
    }

    public static final void LIZIZ$8(IDcS364S0100000_1 iDcS364S0100000_1, C63623Oy3 c63623Oy3) {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GroupChatNoticeViewModel deleteConversation ");
        LIZ.append(((C99033ud) ((GroupChatNoticeViewModel) iDcS364S0100000_1.l0).LJLJJI.getValue()).getConversationId());
        LIZ.append(" fail ,");
        String str = null;
        if (c63623Oy3 != null) {
            num = Integer.valueOf(c63623Oy3.LIZ);
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", ");
        if (c63623Oy3 != null) {
            str = c63623Oy3.LIZJ;
        }
        LIZ.append(str);
        C34B.LIZJ("GroupChatNoticeViewModel", X1D.LIZIZ(LIZ));
    }

    public static final void LIZIZ$9(IDcS364S0100000_1 iDcS364S0100000_1, C63623Oy3 c63623Oy3) {
        ((GroupDetailViewModel) iDcS364S0100000_1.l0).getClass();
        GroupDetailViewModel.mv0(c63623Oy3);
    }

    public static final void onSuccess$10(IDcS364S0100000_1 iDcS364S0100000_1, Object obj) {
        ((GroupDetailViewModel) iDcS364S0100000_1.l0).setState(C95153oN.LJLIL);
    }

    public static final void onSuccess$12(IDcS364S0100000_1 iDcS364S0100000_1, Object obj) {
        ((HashMap) C40C.LIZ).put((Long) iDcS364S0100000_1.l0, Boolean.valueOf(o.LJ(obj, Boolean.TRUE)));
    }

    public static final void onSuccess$13(IDcS364S0100000_1 iDcS364S0100000_1, Object obj) {
        ((GroupChatViewModel) iDcS364S0100000_1.l0).LJLJJI.setValue(obj);
    }

    public static final void onSuccess$14(IDcS364S0100000_1 iDcS364S0100000_1, Object obj) {
        Pair pair = (Pair) obj;
        if (pair != null) {
            Object obj2 = pair.second;
            o.LJIIIIZZ(obj2, "result.second");
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : (Iterable) obj2) {
                EnumC115774gX enumC115774gX = ((ConversationApplyInfo) obj3).apply_status;
                if (enumC115774gX == EnumC115774gX.APPLYING || enumC115774gX == EnumC115774gX.INVALID) {
                    arrayList.add(obj3);
                }
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ConversationApplyInfo conversationApplyInfo = (ConversationApplyInfo) it.next();
                C110714Wd c110714Wd = new C110714Wd();
                c110714Wd.LIZ(conversationApplyInfo);
                arrayList2.add(c110714Wd);
            }
            C95683pE c95683pE = ((GroupDetailRequestListVM) iDcS364S0100000_1.l0).LJLILLLLZI;
            List LLJILJILJ = ORZ.LLJILJILJ(c95683pE.LJLIL.LJLIL);
            ((ArrayList) LLJILJILJ).addAll(arrayList2);
            Object obj4 = pair.first;
            o.LJIIIIZZ(obj4, "result.first");
            c95683pE.LJLIL = new C95693pF(LLJILJILJ, ((Boolean) obj4).booleanValue());
            C72808Sho<InterfaceC57784Mm4> c72808Sho = ((GroupDetailRequestListVM) iDcS364S0100000_1.l0).LJLJJI;
            if (c72808Sho != null) {
                ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new C95743pK((C110714Wd) it2.next()));
                }
                c72808Sho.LJ(arrayList3);
            }
            GroupDetailRequestListVM groupDetailRequestListVM = (GroupDetailRequestListVM) iDcS364S0100000_1.l0;
            C72808Sho<InterfaceC57784Mm4> c72808Sho2 = groupDetailRequestListVM.LJLJJI;
            if (c72808Sho2 != null) {
                Object obj5 = pair.first;
                o.LJIIIIZZ(obj5, "result.first");
                groupDetailRequestListVM.gv0(c72808Sho2, ((Boolean) obj5).booleanValue());
            }
        }
    }

    public static final void onSuccess$15(IDcS364S0100000_1 iDcS364S0100000_1, Object obj) {
        List messageList = (List) obj;
        o.LJIIIZ(messageList, "messageList");
        AnonymousClass489 anonymousClass489 = AnonymousClass489.LIZ;
        List LJJIJ = C47261Igj.LJJIJ((C109544Rq) iDcS364S0100000_1.l0);
        C109544Rq c109544Rq = (C109544Rq) ORZ.LJLLLL(messageList);
        anonymousClass489.getClass();
        AnonymousClass489.LIZIZ(c109544Rq, LJJIJ);
    }

    public static final void onSuccess$16(IDcS364S0100000_1 iDcS364S0100000_1, Object obj) {
        List<C109544Rq> messageList = (List) obj;
        o.LJIIIZ(messageList, "messageList");
        Map map = (Map) iDcS364S0100000_1.l0;
        for (C109544Rq c109544Rq : messageList) {
            List list = (List) map.get(Long.valueOf(c109544Rq.getMsgId()));
            if (list != null) {
                AnonymousClass489.LIZ.getClass();
                AnonymousClass489.LIZIZ(c109544Rq, list);
            }
        }
    }

    public static final void onSuccess$17(IDcS364S0100000_1 iDcS364S0100000_1, Object obj) {
        int i;
        AbstractViewOnClickListenerC105754Db abstractViewOnClickListenerC105754Db = (AbstractViewOnClickListenerC105754Db) iDcS364S0100000_1.l0;
        abstractViewOnClickListenerC105754Db.LJLL.LIZIZ(AbstractViewOnClickListenerC105754Db.LJLLJ[0], abstractViewOnClickListenerC105754Db, Boolean.valueOf(!abstractViewOnClickListenerC105754Db.LLFII()));
        ((AbstractViewOnClickListenerC105754Db) iDcS364S0100000_1.l0).LLII().setEnabled(true);
        Object value = ((AbstractViewOnClickListenerC105754Db) iDcS364S0100000_1.l0).LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-muteLayout>(...)");
        View view = (View) value;
        AbstractViewOnClickListenerC105754Db abstractViewOnClickListenerC105754Db2 = (AbstractViewOnClickListenerC105754Db) iDcS364S0100000_1.l0;
        if (abstractViewOnClickListenerC105754Db2.LLFII()) {
            i = R.string.j9u;
        } else {
            i = R.string.j8d;
        }
        h0.LJJII(view, abstractViewOnClickListenerC105754Db2.getString(i));
    }

    public static final void onSuccess$18(IDcS364S0100000_1 iDcS364S0100000_1, Object obj) {
        int i;
        AbstractViewOnClickListenerC105754Db abstractViewOnClickListenerC105754Db = (AbstractViewOnClickListenerC105754Db) iDcS364S0100000_1.l0;
        abstractViewOnClickListenerC105754Db.LJLLI.LIZIZ(AbstractViewOnClickListenerC105754Db.LJLLJ[1], abstractViewOnClickListenerC105754Db, Boolean.valueOf(!abstractViewOnClickListenerC105754Db.LLFZ()));
        ((AbstractViewOnClickListenerC105754Db) iDcS364S0100000_1.l0).LLIIIJ().setEnabled(true);
        Object value = ((AbstractViewOnClickListenerC105754Db) iDcS364S0100000_1.l0).LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-stickTopLayout>(...)");
        View view = (View) value;
        AbstractViewOnClickListenerC105754Db abstractViewOnClickListenerC105754Db2 = (AbstractViewOnClickListenerC105754Db) iDcS364S0100000_1.l0;
        if (abstractViewOnClickListenerC105754Db2.LLFZ()) {
            i = R.string.j9u;
        } else {
            i = R.string.j8d;
        }
        h0.LJJII(view, abstractViewOnClickListenerC105754Db2.getString(i));
    }

    public static final void onSuccess$19(IDcS364S0100000_1 iDcS364S0100000_1, Object obj) {
        ((GroupChatVM) iDcS364S0100000_1.l0).setState(new AqS167S0100000_1((C63120Opw) obj, 383));
    }

    public static final void onSuccess$2(IDcS364S0100000_1 iDcS364S0100000_1, Object obj) {
        String str;
        C63088OpQ coreInfo;
        C63120Opw c63120Opw = (C63120Opw) obj;
        ((GroupDetailViewModel) iDcS364S0100000_1.l0).setState(new AqS167S0100000_1(c63120Opw, 149));
        GroupDetailViewModel groupDetailViewModel = (GroupDetailViewModel) iDcS364S0100000_1.l0;
        if (c63120Opw == null || (coreInfo = c63120Opw.getCoreInfo()) == null || (str = coreInfo.getName()) == null) {
            str = "";
        }
        groupDetailViewModel.LJLJJL = str;
        C84283Sm c84283Sm = C84283Sm.LIZ;
        String conversationId = ((GroupDetailViewModel) iDcS364S0100000_1.l0).kv0();
        c84283Sm.getClass();
        o.LJIIIZ(conversationId, "conversationId");
        C63120Opw LIZLLL = C81273Gx.LIZ(conversationId).LIZLLL();
        if (LIZLLL == null || !LIZLLL.isGroupChat() || LIZLLL.getCoreInfo() == null || LIZLLL.getCoreInfo().getExt() == null) {
            return;
        }
        Map<String, String> ext = LIZLLL.getCoreInfo().getExt();
        o.LJIIIIZZ(ext, "conversation.coreInfo.ext");
        ext.put("a:group_name_modified", "1");
    }

    public static final void onSuccess$20(IDcS364S0100000_1 iDcS364S0100000_1, Object obj) {
        C63120Opw result = (C63120Opw) obj;
        o.LJIIIZ(result, "result");
        ((C73578SuE) ((InterfaceC65052gv) iDcS364S0100000_1.l0)).onSuccess(result);
        C90643h6.LIZIZ = "private_chat";
        C90643h6.LJFF(0, result, "private", null, "private", null, null, 224);
    }

    public static final void onSuccess$21(IDcS364S0100000_1 iDcS364S0100000_1, Object obj) {
        if (obj == null) {
            ((C73516StE) ((C45R) iDcS364S0100000_1.l0)).onComplete();
        } else {
            ((C73516StE) ((C45R) iDcS364S0100000_1.l0)).onSuccess(obj);
        }
    }

    public static final void onSuccess$22(IDcS364S0100000_1 iDcS364S0100000_1, Object obj) {
        List<? extends C3OG> result = (List) obj;
        o.LJIIIZ(result, "result");
        C34B.LIZIZ("MessageStatus-SessionListReadStatusViewModel", "batchGetConversationListReadStatus: success");
        ((SessionListReadStatusViewModel) iDcS364S0100000_1.l0).iv0(result);
        SessionListReadStatusViewModel sessionListReadStatusViewModel = (SessionListReadStatusViewModel) iDcS364S0100000_1.l0;
        sessionListReadStatusViewModel.LJLJJI = false;
        sessionListReadStatusViewModel.LJLJJL = false;
    }

    public static final void onSuccess$23(IDcS364S0100000_1 iDcS364S0100000_1, Object obj) {
        String str;
        Map<String, String> localExt;
        C109544Rq c109544Rq = (C109544Rq) obj;
        if (c109544Rq != null && (localExt = c109544Rq.getLocalExt()) != null) {
            str = localExt.get("tako_card_type");
        } else {
            str = null;
        }
        if (o.LJ(str, String.valueOf(EnumC99903w2.GUIDE.getValue()))) {
            C84523Tk.LJIIJ();
        }
        ((InterfaceC65784Pro) iDcS364S0100000_1.l0).invoke();
    }

    public static final void onSuccess$24(IDcS364S0100000_1 iDcS364S0100000_1, Object obj) {
        List<C3OG> list = (List) obj;
        Iterator it = ((CopyOnWriteArraySet) C63309Osz.LIZLLL().LJIIIIZZ).iterator();
        while (it.hasNext()) {
            ((C3UD) it.next()).Lr0(list);
        }
        ((C4WD) ((IDHandlerS14S0100000_1) iDcS364S0100000_1.l0).l0).LIZIZ = SystemClock.elapsedRealtime();
        C4WD c4wd = (C4WD) ((IDHandlerS14S0100000_1) iDcS364S0100000_1.l0).l0;
        C4WD.LIZIZ(c4wd.LIZIZ - c4wd.LIZ);
    }

    public static final void onSuccess$25(IDcS364S0100000_1 iDcS364S0100000_1, Object obj) {
        C109544Rq result = (C109544Rq) obj;
        o.LJIIIZ(result, "result");
        if (C93793mB.LJI(result)) {
            C78857UxB.LJJJJI(new C107764Ku(result, null));
        }
        ((C92183ja) iDcS364S0100000_1.l0).LJ.invoke();
    }

    public static final void onSuccess$26(IDcS364S0100000_1 iDcS364S0100000_1, Object obj) {
        ((C115394fv) iDcS364S0100000_1.l0).LJIIJ();
    }

    public static final void onSuccess$27(IDcS364S0100000_1 iDcS364S0100000_1, Object obj) {
        ((C115394fv) iDcS364S0100000_1.l0).LJIIJ();
    }

    public static final void onSuccess$28(IDcS364S0100000_1 iDcS364S0100000_1, Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StrangerManager deleteAllConversation for type ");
        LIZ.append(((EnumC97443s4) ((IDcS133S0200000_1) iDcS364S0100000_1.l0).l0).name());
        LIZ.append(" onSuccess");
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        IDcS133S0200000_1 iDcS133S0200000_1 = (IDcS133S0200000_1) iDcS364S0100000_1.l0;
        ((C115394fv) iDcS133S0200000_1.l1).LJIIJJI((EnumC97443s4) iDcS133S0200000_1.l0);
    }

    public static final void onSuccess$29(IDcS364S0100000_1 iDcS364S0100000_1, Object obj) {
        V1B.LJIIZILJ("add msg success");
        C89233ep c89233ep = (C89233ep) iDcS364S0100000_1.l0;
        int i = c89233ep.LIZLLL + 1;
        c89233ep.LIZLLL = i;
        if (i < c89233ep.LIZIZ.size()) {
            C89233ep c89233ep2 = (C89233ep) iDcS364S0100000_1.l0;
            c89233ep2.LIZ(c89233ep2.LIZLLL);
        } else {
            C57082Lw.LIZ.LIZJ("#BOT_RECEIVE_WELCOME_MSG_FINISH").postValue(Boolean.TRUE);
            ((C89233ep) iDcS364S0100000_1.l0).LJ.LIZLLL();
        }
    }

    public static final void onSuccess$3(IDcS364S0100000_1 iDcS364S0100000_1, Object obj) {
        C63120Opw c63120Opw = (C63120Opw) obj;
        if (c63120Opw != null) {
            ((GroupDetailViewModel) iDcS364S0100000_1.l0).setState(new AqS167S0100000_1(c63120Opw, 150));
        }
    }

    public static final void onSuccess$30(IDcS364S0100000_1 iDcS364S0100000_1, Object obj) {
        C34B.LJI("UserRecCardViewModel", "recordCardCloseTs: success");
        ((InterfaceC65784Pro) iDcS364S0100000_1.l0).invoke();
    }

    public static final void onSuccess$32(IDcS364S0100000_1 iDcS364S0100000_1, Object result) {
        o.LJIIIZ(result, "result");
        AnonymousClass361 anonymousClass361 = (AnonymousClass361) iDcS364S0100000_1.l0;
        if (anonymousClass361.LJLJL) {
            return;
        }
        long LIZLLL = C81273Gx.LIZLLL(anonymousClass361.LJLJJL);
        if (LIZLLL <= 0) {
            return;
        }
        C80993Fv LIZ = C80993Fv.LIZ();
        String valueOf = String.valueOf(LIZLLL);
        LIZ.getClass();
        if (TextUtils.isEmpty(valueOf)) {
            return;
        }
        LIZ.LIZ.edit().putBoolean(i0.LJFF("key_friend_rec_", valueOf), true).commit();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.3Tp] */
    public static final void onSuccess$4(IDcS364S0100000_1 iDcS364S0100000_1, Object obj) {
        C109544Rq lastShowMessage;
        V1B.LJIIZILJ("bring to top success");
        Keva kevaRepo = C84523Tk.LJII();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        kevaRepo.storeBoolean(C84523Tk.LIZLLL(), true);
        C63120Opw LIZLLL = ((AbstractC90763hI) iDcS364S0100000_1.l0).LIZLLL();
        if (LIZLLL == null || (lastShowMessage = LIZLLL.getLastShowMessage()) == null) {
            return;
        }
        lastShowMessage.setConvRankUpdateRule(EnumC96123pw.IgnoreAllRankUpdate.getValue());
        C31F.LIZ.getClass();
        C31G.LIZ();
        C63164Oqe.LIZIZ.LJIJJ(new InterfaceC86963bA<C109544Rq>() { // from class: X.3Tp
            @Override // X.InterfaceC86963bA
            public final void LIZIZ(C63623Oy3 c63623Oy3) {
                QCU.LJFF("tryBringBotToTop update msg fail", null, 6);
            }

            @Override // X.InterfaceC86963bA
            public final void onSuccess(C109544Rq c109544Rq) {
                V1B.LJIIZILJ("tryBringBotToTop update msg success");
            }
        }, lastShowMessage);
    }

    public static final void onSuccess$5(IDcS364S0100000_1 iDcS364S0100000_1, Object obj) {
        ((C110714Wd) iDcS364S0100000_1.l0).LIZLLL = (C63120Opw) obj;
    }

    public static final void onSuccess$6(IDcS364S0100000_1 iDcS364S0100000_1, Object obj) {
        C111214Yb.LIZJ("PhotoMsgSender", "send success");
        C117984k6.LIZ(true, (C117994k7) iDcS364S0100000_1.l0);
    }

    public static final void onSuccess$7(IDcS364S0100000_1 iDcS364S0100000_1, Object obj) {
        C111214Yb.LIZJ("VideoMsgSender", "send success");
        C117984k6.LIZ(true, (C117994k7) iDcS364S0100000_1.l0);
    }

    public static final /* bridge */ /* synthetic */ void onSuccess$1(IDcS364S0100000_1 iDcS364S0100000_1, Object obj) {
    }

    public static final /* bridge */ /* synthetic */ void onSuccess$11(IDcS364S0100000_1 iDcS364S0100000_1, Object obj) {
    }

    public static final /* bridge */ /* synthetic */ void onSuccess$33(IDcS364S0100000_1 iDcS364S0100000_1, Object obj) {
    }

    public static final /* bridge */ /* synthetic */ void onSuccess$9(IDcS364S0100000_1 iDcS364S0100000_1, Object obj) {
    }

    public IDcS364S0100000_1(C115394fv c115394fv, EnumC97443s4 enumC97443s4, int i) {
        this.$t = i;
        this.l0 = c115394fv;
    }
}
