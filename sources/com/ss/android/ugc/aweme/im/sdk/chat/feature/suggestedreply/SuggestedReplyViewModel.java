package com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply;

import X.C1039346b;
import X.C1039546d;
import X.C1039646e;
import X.C1039946h;
import X.C109544Rq;
import X.C110134Tx;
import X.C220858ld;
import X.C221108m2;
import X.C38350F3i;
import X.C3Q9;
import X.C46T;
import X.C46U;
import X.C46W;
import X.C46X;
import X.C46Y;
import X.C46Z;
import X.C49J;
import X.C4GA;
import X.C4WC;
import X.C62822Ol8;
import X.C63120Opw;
import X.C75782yE;
import X.C78613UtF;
import X.C78897Uxp;
import X.C80763Ey;
import X.C81273Gx;
import X.C93793mB;
import X.C98583tu;
import X.C99033ud;
import X.EnumC110124Tw;
import X.InterfaceC1039246a;
import X.ORZ;
import X.V8H;
import X.XKQ;
import X.XKX;
import X.XLM;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;
import com.ss.android.ugc.aweme.im.sdk.chat.experiment.SuggestedReplyExperiment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.data.SuggestedReply;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SuggestedReplyViewModel extends ViewModel {
    public static final /* synthetic */ int LJLL = 0;
    public final InterfaceC1039246a LJLIL;
    public final XLM LJLILLLLZI;
    public final XLM LJLJI;
    public C99033ud LJLJJI;
    public C109544Rq LJLJJL;
    public C109544Rq LJLJJLL;
    public XKQ LJLJL;
    public final ConcurrentHashMap<Long, C46T> LJLJLJ;
    public final C62822Ol8 LJLJLLL;

    public SuggestedReplyViewModel() {
        C4GA repo = (C4GA) C4GA.LIZJ.getValue();
        o.LJIIIZ(repo, "repo");
        this.LJLIL = repo;
        XLM LIZ = V8H.LIZ(C1039946h.LIZ);
        this.LJLILLLLZI = LIZ;
        this.LJLJI = LIZ;
        this.LJLJLJ = new ConcurrentHashMap<>();
        this.LJLJLLL = C221108m2.LIZIZ(C1039646e.LJLIL);
    }

    public final void kv0() {
        C99033ud c99033ud;
        String conversationId;
        C109544Rq LJ;
        if (!SuggestedReplyExperiment.LIZIZ() || (c99033ud = this.LJLJJI) == null || (conversationId = c99033ud.getConversationId()) == null || (LJ = this.LJLIL.LJ(conversationId)) == null) {
            return;
        }
        rv0(LJ);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        String str;
        String str2;
        super.onCleared();
        if (SuggestedReplyExperiment.LIZLLL()) {
            if (SuggestedReplyExperiment.LIZIZ()) {
                str = "action_bar";
            } else if (SuggestedReplyExperiment.LIZJ()) {
                str = "under_video";
            } else {
                return;
            }
            C99033ud c99033ud = this.LJLJJI;
            if (c99033ud != null && c99033ud.isSingleChat()) {
                str2 = "private";
            } else {
                C99033ud c99033ud2 = this.LJLJJI;
                if (c99033ud2 != null && c99033ud2.isGroupChat()) {
                    str2 = "group";
                } else {
                    return;
                }
            }
            for (Map.Entry<Long, C46T> entry : this.LJLJLJ.entrySet()) {
                C46W.LIZJ(str2, entry.getValue().getMsg(), str, "leave_chat", C46U.LJIIJJI(entry.getValue().getReplies()), entry.getValue().getDisplayStyle());
            }
        }
    }

    public final void ov0() {
        if (SuggestedReplyExperiment.LIZIZ()) {
            C109544Rq c109544Rq = this.LJLJJLL;
            if (c109544Rq != null) {
                C46U.LJII(c109544Rq);
            }
            lv0(null);
            return;
        }
        if (!SuggestedReplyExperiment.LIZJ()) {
            return;
        }
        C109544Rq c109544Rq2 = this.LJLJJLL;
        if (c109544Rq2 != null) {
            C46U.LJII(c109544Rq2);
        }
        this.LJLJJLL = null;
    }

    public final void sv0() {
        String uid;
        User LIZJ = C80763Ey.LIZJ();
        if (LIZJ == null || (uid = LIZJ.getUid()) == null) {
            return;
        }
        this.LJLIL.LJFF(uid);
    }

    public final String iv0(C109544Rq msg) {
        o.LJIIIZ(msg, "msg");
        List<SuggestedReply> jv0 = jv0(msg);
        if (jv0 != null) {
            return ORZ.LLD(jv0, ",", null, null, C1039346b.LJLIL, 30);
        }
        return "";
    }

    public final List<SuggestedReply> jv0(C109544Rq c109544Rq) {
        Long l;
        List<SuggestedReply> replies;
        ConcurrentHashMap<Long, C46T> concurrentHashMap = this.LJLJLJ;
        if (c109544Rq != null) {
            l = Long.valueOf(c109544Rq.getMsgId());
        } else {
            l = null;
        }
        C46T c46t = concurrentHashMap.get(l);
        if (c46t == null || (replies = c46t.getReplies()) == null || replies.isEmpty()) {
            if (c109544Rq == null) {
                return null;
            }
            return C46U.LJIIJ(c109544Rq);
        }
        return replies;
    }

    public final void lv0(C109544Rq c109544Rq) {
        if (c109544Rq == null && (c109544Rq = this.LJLJJLL) == null) {
            return;
        }
        if (this.LJLJL == null) {
            qv0(c109544Rq);
        }
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), C78613UtF.LIZJ, null, new C46X(this, c109544Rq, null), 2);
    }

    public final void pv0(List<? extends C109544Rq> list) {
        C109544Rq c109544Rq;
        C109544Rq c109544Rq2;
        C46T c46t;
        C109544Rq c109544Rq3;
        o.LJIIIZ(list, "list");
        if (SuggestedReplyExperiment.LIZJ()) {
            if (((Boolean) SuggestedReplyExperiment.LJ.getValue()).booleanValue() && (c109544Rq3 = this.LJLJJLL) != null) {
                C46U.LJII(c109544Rq3);
            }
            for (C109544Rq c109544Rq4 : list) {
                if (C46U.LJI(c109544Rq4) && (c46t = this.LJLJLJ.get(Long.valueOf(c109544Rq4.getMsgId()))) != null) {
                    if (o.LJ(c109544Rq4.getLocalExt().get("IS_REPLIED_OR_REACTED"), "react")) {
                        C46W.LIZJ(C98583tu.LIZJ(this.LJLJJI), c46t.getMsg(), "under_video", "react_to_video", iv0(c46t.getMsg()), c46t.getDisplayStyle());
                    }
                    this.LJLJLJ.remove(Long.valueOf(c109544Rq4.getMsgId()));
                    sv0();
                }
            }
            return;
        }
        if (SuggestedReplyExperiment.LIZIZ()) {
            Iterator<? extends C109544Rq> it = list.iterator();
            while (true) {
                c109544Rq = null;
                if (it.hasNext()) {
                    c109544Rq2 = it.next();
                    C109544Rq c109544Rq5 = c109544Rq2;
                    C109544Rq c109544Rq6 = this.LJLJJLL;
                    if (c109544Rq6 != null && c109544Rq5.getMsgId() == c109544Rq6.getMsgId()) {
                        break;
                    }
                } else {
                    c109544Rq2 = null;
                    break;
                }
            }
            C109544Rq c109544Rq7 = c109544Rq2;
            if (c109544Rq7 != null) {
                this.LJLJJLL = c109544Rq7;
            }
            Iterator<? extends C109544Rq> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C109544Rq next = it2.next();
                C109544Rq c109544Rq8 = next;
                C109544Rq c109544Rq9 = this.LJLJJL;
                if (c109544Rq9 != null && c109544Rq8.getMsgId() == c109544Rq9.getMsgId()) {
                    c109544Rq = next;
                    break;
                }
            }
            C109544Rq c109544Rq10 = c109544Rq;
            if (c109544Rq10 == null) {
                return;
            }
            String LIZJ = C98583tu.LIZJ(this.LJLJJI);
            if (o.LJ(c109544Rq10.getLocalExt().get("IS_REPLIED_OR_REACTED"), "react")) {
                C46W.LIZLLL(C46W.LIZ, LIZJ, c109544Rq10, "action_bar", "react_to_video", C46U.LJIIJJI(jv0(c109544Rq10)), 32);
            }
            rv0(c109544Rq10);
        }
    }

    public final void qv0(C109544Rq c109544Rq) {
        C109544Rq c109544Rq2;
        if (SuggestedReplyExperiment.LIZIZ()) {
            if (c109544Rq == null) {
                c109544Rq2 = this.LJLJJL;
                if (c109544Rq2 == null) {
                    return;
                }
            } else {
                c109544Rq2 = c109544Rq;
            }
            XKQ xkq = this.LJLJL;
            if (xkq != null && xkq.isActive()) {
                XKQ xkq2 = this.LJLJL;
                if (xkq2 != null) {
                    xkq2.LIZIZ(null);
                }
                this.LJLJL = null;
            }
            this.LJLJJLL = c109544Rq;
            this.LJLJL = XKX.LIZLLL(ViewModelKt.getViewModelScope(this), C78613UtF.LIZJ, null, new C46Y(this, c109544Rq2, null), 2);
            return;
        }
        if (!SuggestedReplyExperiment.LIZJ() || c109544Rq == null) {
            return;
        }
        this.LJLJJLL = c109544Rq;
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), C78613UtF.LIZJ, null, new C46Z(this, c109544Rq, null), 2);
    }

    public final void rv0(C109544Rq c109544Rq) {
        List<SuggestedReply> jv0;
        C109544Rq c109544Rq2;
        if (c109544Rq == null) {
            return;
        }
        if (!gv0(this, c109544Rq)) {
            this.LJLJLJ.remove(Long.valueOf(c109544Rq.getMsgId()));
            jv0 = null;
        } else {
            jv0 = jv0(c109544Rq);
        }
        if (jv0 == null) {
            C109544Rq c109544Rq3 = this.LJLJJL;
            if (c109544Rq3 != null && c109544Rq.getMsgId() == c109544Rq3.getMsgId()) {
                this.LJLILLLLZI.setValue(C1039946h.LIZ);
                this.LJLJJL = null;
            } else {
                return;
            }
        } else {
            C109544Rq c109544Rq4 = this.LJLJJL;
            if ((c109544Rq4 == null || c109544Rq.getMsgId() != c109544Rq4.getMsgId()) && (c109544Rq2 = this.LJLJJL) != null) {
                this.LJLJLJ.remove(Long.valueOf(c109544Rq2.getMsgId()));
                this.LJLIL.LIZ(c109544Rq2);
            }
            mv0(c109544Rq, null);
            this.LJLILLLLZI.setValue(new C1039546d(jv0));
        }
        this.LJLJJL = c109544Rq;
    }

    public static boolean gv0(SuggestedReplyViewModel suggestedReplyViewModel, C109544Rq msg) {
        long j;
        Long l;
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        C4WC c4wc = C4WC.LIZIZ;
        suggestedReplyViewModel.getClass();
        o.LJIIIZ(msg, "msg");
        if (!SuggestedReplyExperiment.LIZJ()) {
            return false;
        }
        C99033ud c99033ud = suggestedReplyViewModel.LJLJJI;
        if ((c99033ud != null && c99033ud.isReportPage()) || !hv0(suggestedReplyViewModel, msg) || C46U.LJI(msg)) {
            return false;
        }
        String conversationId = msg.getConversationId();
        o.LJIIIIZZ(conversationId, "msg.conversationId");
        Long LIZLLL = C46U.LIZLLL(c4wc, conversationId);
        if (LIZLLL != null) {
            j = LIZLLL.longValue();
        } else {
            j = 0;
        }
        String str = msg.getLocalExt().get("SUG_REPLY_SHOW_TIME");
        if (str != null) {
            l = C38350F3i.LJJIZ(str);
        } else {
            l = null;
        }
        if (((Boolean) SuggestedReplyExperiment.LJ.getValue()).booleanValue()) {
            if (!C46U.LJIIIIZZ(msg)) {
                return false;
            }
            if (l != null && j >= l.longValue()) {
                return false;
            }
        } else {
            if (!SuggestedReplyExperiment.LIZJ()) {
                return false;
            }
            if (l != null && j >= l.longValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean hv0(SuggestedReplyViewModel suggestedReplyViewModel, C109544Rq msg) {
        ShareAwemeContent shareAwemeContent;
        String str;
        IAwemeService LIZ = AwemeService.LIZ();
        o.LJIIIIZZ(LIZ, "get().getService(IAwemeService::class.java)");
        suggestedReplyViewModel.getClass();
        o.LJIIIZ(msg, "msg");
        if (suggestedReplyViewModel.LJLJJI == null || msg.isSelf()) {
            return false;
        }
        if (msg.getMsgType() == 1809) {
            if (o.LJ(msg.getScene(), C49J.PHOTO_MODE.getScene()) || o.LJ(msg.getScene(), C49J.STORY.getScene())) {
                return false;
            }
        } else {
            EnumC110124Tw.Companion.getClass();
            BaseContent LIZJ = C110134Tx.LIZJ(msg);
            if (!(LIZJ instanceof ShareAwemeContent) || (shareAwemeContent = (ShareAwemeContent) LIZJ) == null || shareAwemeContent.type != 800 || shareAwemeContent.getAwemeType() != 0) {
                return false;
            }
        }
        if (C220858ld.LJIIIIZZ(LIZ.i6(C93793mB.LIZ(msg)))) {
            return false;
        }
        C99033ud c99033ud = suggestedReplyViewModel.LJLJJI;
        if (c99033ud != null && c99033ud.isHighRiskConversation()) {
            return false;
        }
        C99033ud c99033ud2 = suggestedReplyViewModel.LJLJJI;
        if ((c99033ud2 != null && c99033ud2.isMediaMsgMasking()) || C78897Uxp.LJJIIJZLJL(msg)) {
            return false;
        }
        if (msg.getMsgType() == 1809 || (str = msg.getLocalExt().get("feed_video_status_flag")) == null) {
            return true;
        }
        return o.LJ(str, CardStruct.IStatusCode.DEFAULT);
    }

    public final void mv0(C109544Rq msg, String str) {
        List<SuggestedReply> LJIIJ;
        o.LJIIIZ(msg, "msg");
        if (!this.LJLJLJ.containsKey(Long.valueOf(msg.getMsgId()))) {
            this.LJLJLJ.put(Long.valueOf(msg.getMsgId()), new C46T(msg, C46U.LJIIJ(msg), str));
        }
        if (SuggestedReplyExperiment.LIZJ() || (LJIIJ = C46U.LJIIJ(msg)) == null || ((ArrayList) LJIIJ).isEmpty()) {
            return;
        }
        C46U.LJIIL(msg, "");
    }

    public final void nv0(C109544Rq msg, List<? extends C109544Rq> currentMsgList) {
        C109544Rq c109544Rq;
        o.LJIIIZ(msg, "msg");
        o.LJIIIZ(currentMsgList, "currentMsgList");
        if (msg.isSelf()) {
            String conversationId = msg.getConversationId();
            o.LJIIIIZZ(conversationId, "msg.conversationId");
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            C63120Opw LIZ = C4WC.LIZIZ.LIZ(conversationId);
            if (LIZ != null) {
                Map<String, String> localExt = LIZ.getLocalExt();
                o.LJIIIIZZ(localExt, "localExt");
                localExt.put("LAST_SELF_MSG_SNEND_TIME", String.valueOf(System.currentTimeMillis()));
                C81273Gx.LIZ(conversationId).LJIJJ(localExt, null);
            }
            if (SuggestedReplyExperiment.LIZJ()) {
                if (this.LJLJLJ.isEmpty()) {
                    return;
                }
                for (Map.Entry<Long, C46T> entry : this.LJLJLJ.entrySet()) {
                    Iterator<? extends C109544Rq> it = currentMsgList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            c109544Rq = it.next();
                            if (c109544Rq.getMsgId() == entry.getKey().longValue()) {
                                break;
                            }
                        } else {
                            c109544Rq = null;
                            break;
                        }
                    }
                    C109544Rq c109544Rq2 = c109544Rq;
                    if (c109544Rq2 != null) {
                        C46U.LJIIL(c109544Rq2, "");
                    }
                    C46W.LIZJ(C98583tu.LIZJ(this.LJLJJI), entry.getValue().getMsg(), "under_video", "send_message", iv0(entry.getValue().getMsg()), entry.getValue().getDisplayStyle());
                }
                this.LJLJLJ.clear();
                sv0();
                return;
            }
            if (SuggestedReplyExperiment.LIZIZ()) {
                String LIZJ = C98583tu.LIZJ(this.LJLJJI);
                C46W c46w = C46W.LIZ;
                C109544Rq c109544Rq3 = this.LJLJJL;
                if (c109544Rq3 == null) {
                    return;
                }
                C46W.LIZLLL(c46w, LIZJ, c109544Rq3, "action_bar", "send_message", C46U.LJIIJJI(jv0(c109544Rq3)), 32);
                this.LJLJLJ.clear();
                C109544Rq c109544Rq4 = this.LJLJJL;
                if (c109544Rq4 != null) {
                    this.LJLJLJ.remove(Long.valueOf(c109544Rq4.getMsgId()));
                    this.LJLIL.LIZ(c109544Rq4);
                    this.LJLILLLLZI.setValue(C1039946h.LIZ);
                    this.LJLJJL = null;
                }
            }
        }
    }
}
