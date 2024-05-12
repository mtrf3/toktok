package Y;

import X.AbstractC73638SvC;
import X.C106674Gp;
import X.C106844Hg;
import X.C106884Hk;
import X.C106934Hp;
import X.C109544Rq;
import X.C110134Tx;
import X.C115724gS;
import X.C34B;
import X.C3AD;
import X.C3AF;
import X.C3MD;
import X.C3ML;
import X.C3MX;
import X.C4I2;
import X.C63120Opw;
import X.C68322mC;
import X.C72912tb;
import X.C81843Jc;
import X.C82543Lu;
import X.EnumC110124Tw;
import X.InterfaceC106914Hn;
import X.InterfaceC48038ItG;
import X.InterfaceC65784Pro;
import X.InterfaceC66992k3;
import X.InterfaceC82723Mm;
import X.InterfaceC88472Yns;
import X.JBQ;
import X.ORZ;
import X.OSZ;
import X.TBW;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.ss.android.ugc.aweme.im.sdk.activitystatus.ActivityStatusViewModelImpl;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentStatus;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentStatusResponse;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.GiphyAnalytics;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.socialpublish.viewmodel.InboxSocPubStatusViewModelImpl;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.model.PaidCollectionDetailResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDhS94S0100000_1 implements InterfaceC48038ItG {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            case 5:
                return apply$5(this, obj);
            case 6:
                return apply$6(this, obj);
            case 7:
                return apply$7(this, obj);
            case 8:
                return apply$8(this, obj);
            case 9:
                return apply$9(this, obj);
            case 10:
                return apply$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return apply$11(this, obj);
            case 12:
                return apply$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return apply$13(this, obj);
            case 14:
                return apply$14(this, obj);
            case 15:
                return apply$15(this, obj);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return apply$16(this, obj);
            case 17:
                return apply$17(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDhS94S0100000_1(Object obj, T t) {
        this.$t = t;
        this.l0 = obj;
    }

    public static final Object apply$0(IDhS94S0100000_1 iDhS94S0100000_1, Object obj) {
        List updateStatusList = (List) obj;
        o.LJIIIZ(updateStatusList, "updateStatusList");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateStatuses list size ");
        LIZ.append(updateStatusList.size());
        C34B.LJI("ActivityStatusLocalSource", X1D.LIZIZ(LIZ));
        long longValue = ((C3AF) iDhS94S0100000_1.l0).LIZ.invoke().longValue();
        C3AF c3af = (C3AF) iDhS94S0100000_1.l0;
        ArrayList arrayList = new ArrayList();
        Iterator it = updateStatusList.iterator();
        while (it.hasNext()) {
            C3AD LIZ2 = c3af.LIZ((C3AD) it.next(), longValue);
            if (LIZ2 != null) {
                arrayList.add(LIZ2);
            }
        }
        return arrayList;
    }

    public static final Object apply$1(IDhS94S0100000_1 iDhS94S0100000_1, Object obj) {
        ActivityStatus[] updateStatusArray = (ActivityStatus[]) obj;
        o.LJIIIZ(updateStatusArray, "updateStatusArray");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateStatuses array size ");
        LIZ.append(updateStatusArray.length);
        C34B.LJI("ActivityStatusLocalSource", X1D.LIZIZ(LIZ));
        long longValue = ((C3AF) iDhS94S0100000_1.l0).LIZ.invoke().longValue();
        C3AF c3af = (C3AF) iDhS94S0100000_1.l0;
        ArrayList arrayList = new ArrayList();
        for (ActivityStatus activityStatus : updateStatusArray) {
            C3AD LIZ2 = c3af.LIZ(new C3AD(activityStatus.userID, longValue, activityStatus), longValue);
            if (LIZ2 != null) {
                arrayList.add(LIZ2);
            }
        }
        return arrayList;
    }

    public static final Object apply$10(IDhS94S0100000_1 iDhS94S0100000_1, Object obj) {
        String p0 = (String) obj;
        o.LJIIIZ(p0, "p0");
        return ((GiphyAnalytics) iDhS94S0100000_1.l0).track(p0);
    }

    public static final Object apply$11(IDhS94S0100000_1 iDhS94S0100000_1, Object obj) {
        List it = (List) obj;
        o.LJIIIZ(it, "it");
        return ((InboxSocPubStatusViewModelImpl) iDhS94S0100000_1.l0).LJLIL.LIZ(it);
    }

    public static final Object apply$12(IDhS94S0100000_1 iDhS94S0100000_1, Object it) {
        o.LJIIIZ(it, "it");
        return (PaidCollectionDetailResponse) iDhS94S0100000_1.l0;
    }

    public static final Object apply$13(IDhS94S0100000_1 iDhS94S0100000_1, Object obj) {
        C63120Opw it = (C63120Opw) obj;
        o.LJIIIZ(it, "it");
        InterfaceC106914Hn interfaceC106914Hn = ((C106884Hk) iDhS94S0100000_1.l0).LIZ;
        String conversationId = it.getConversationId();
        o.LJIIIIZZ(conversationId, "it.conversationId");
        interfaceC106914Hn.LIZJ(conversationId);
        return it;
    }

    public static final Object apply$14(IDhS94S0100000_1 iDhS94S0100000_1, Object it) {
        o.LJIIIZ(it, "it");
        return iDhS94S0100000_1.l0;
    }

    public static final Object apply$15(IDhS94S0100000_1 iDhS94S0100000_1, Object obj) {
        Iterable it = (Iterable) obj;
        o.LJIIIZ(it, "it");
        final C106934Hp c106934Hp = ((ActivityStatusViewModelImpl) iDhS94S0100000_1.l0).LJLIL;
        final List userIDs = ORZ.LJLJJL(it);
        c106934Hp.getClass();
        o.LJIIIZ(userIDs, "userIDs");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("query request size ");
        LIZ.append(userIDs.size());
        C34B.LJI("ActivityStatusLogUtils", X1D.LIZIZ(LIZ));
        for (Object obj2 : ORZ.LJLILLLLZI(userIDs, 40)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("query request ");
            LIZ2.append("remote");
            LIZ2.append(' ');
            LIZ2.append(obj2);
            C34B.LJI("ActivityStatusLogUtils", X1D.LIZIZ(LIZ2));
        }
        if (C4I2.LIZ) {
            return AbstractC73638SvC.LJI(new InterfaceC66992k3() { // from class: X.4Hq
                @Override // X.InterfaceC66992k3
                public final void subscribe(InterfaceC65052gv<List<C3AD>> interfaceC65052gv) {
                    C106934Hp c106934Hp2 = C106934Hp.this;
                    C73578SuE c73578SuE = (C73578SuE) interfaceC65052gv;
                    final C73495Sst LIZLLL = C73542Ste.LIZLLL(c106934Hp2.LIZ.LIZ(c106934Hp2.LIZJ, userIDs), new AqS167S0100000_1(c73578SuE, 2), new AqS167S0100000_1(c73578SuE, 3));
                    c73578SuE.setCancellable(new InterfaceC73436Srw() { // from class: X.4Ht
                        @Override // X.InterfaceC73436Srw
                        public final void cancel() {
                            if (!LIZLLL.isDisposed()) {
                                LIZLLL.dispose();
                            }
                        }
                    });
                }
            }).LJIILL(new IDhS94S0100000_1(c106934Hp, 2));
        }
        return c106934Hp.LIZ.LIZ(c106934Hp.LIZJ, userIDs).LJIILL(new IDhS94S0100000_1(c106934Hp, 3));
    }

    public static final Object apply$16(IDhS94S0100000_1 iDhS94S0100000_1, Object obj) {
        String scene = (String) obj;
        o.LJIIIZ(scene, "scene");
        if (((ActivityStatusViewModelImpl) iDhS94S0100000_1.l0).LLD.LJII()) {
            return ((ActivityStatusViewModelImpl) iDhS94S0100000_1.l0).LJLIL.LIZIZ(scene, true);
        }
        return C115724gS.LJLIL;
    }

    public static final Object apply$17(IDhS94S0100000_1 iDhS94S0100000_1, Object obj) {
        Aweme it = (Aweme) obj;
        o.LJIIIZ(it, "it");
        ((JBQ) iDhS94S0100000_1.l0).getClass();
        UserStory userStory = it.getUserStory();
        if (userStory != null) {
            return UserStoryKt.currentStory(userStory);
        }
        return null;
    }

    public static final Object apply$2(IDhS94S0100000_1 iDhS94S0100000_1, Object it) {
        o.LJIIIZ(it, "it");
        C3AF c3af = ((C106934Hp) iDhS94S0100000_1.l0).LIZIZ;
        c3af.getClass();
        return AbstractC73638SvC.LJIJ(it).LJIJI(new IDhS94S0100000_1(c3af, 0));
    }

    public static final Object apply$3(IDhS94S0100000_1 iDhS94S0100000_1, Object obj) {
        List it = (List) obj;
        o.LJIIIZ(it, "it");
        C106844Hg.LIZIZ("remote", it, null);
        C3AF c3af = ((C106934Hp) iDhS94S0100000_1.l0).LIZIZ;
        c3af.getClass();
        return AbstractC73638SvC.LJIJ(it).LJIJI(new IDhS94S0100000_1(c3af, 0));
    }

    public static final Object apply$4(IDhS94S0100000_1 iDhS94S0100000_1, Object obj) {
        return new C72912tb(((InterfaceC88472Yns) iDhS94S0100000_1.l0).invoke(obj));
    }

    public static final Object apply$5(IDhS94S0100000_1 iDhS94S0100000_1, Object it) {
        o.LJIIJ(it, "it");
        return ((TBW) iDhS94S0100000_1.l0).invoke(it);
    }

    public static final Object apply$6(IDhS94S0100000_1 iDhS94S0100000_1, Object it) {
        o.LJIIIZ(it, "it");
        T t = ((C68322mC) iDhS94S0100000_1.l0).element;
        if (t != 0) {
            return t;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Object apply$7(IDhS94S0100000_1 iDhS94S0100000_1, Object it) {
        o.LJIIIZ(it, "it");
        return ((InterfaceC65784Pro) iDhS94S0100000_1.l0).invoke();
    }

    public static final Object apply$8(IDhS94S0100000_1 iDhS94S0100000_1, Object obj) {
        String str;
        boolean z;
        String str2;
        Long l;
        CommentStatusResponse it = (CommentStatusResponse) obj;
        o.LJIIIZ(it, "it");
        List<C109544Rq> list = (List) ((OSZ) iDhS94S0100000_1.l0).getFirst();
        List<CommentStatus> commentStatus = it.getCommentStatus();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (C109544Rq c109544Rq : list) {
                EnumC110124Tw.Companion.getClass();
                BaseContent LIZJ = C110134Tx.LIZJ(c109544Rq);
                o.LJII(LIZJ, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.data.model.CommentContent");
                CommentContent commentContent = (CommentContent) LIZJ;
                CommentStatus commentStatus2 = null;
                if (commentStatus != null) {
                    Iterator<CommentStatus> it2 = commentStatus.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        CommentStatus next = it2.next();
                        CommentStatus commentStatus3 = next;
                        if (commentStatus3 != null) {
                            l = commentStatus3.getCommentId();
                        } else {
                            l = null;
                        }
                        if (o.LJ(String.valueOf(l), commentContent.getCommentId())) {
                            commentStatus2 = next;
                            break;
                        }
                    }
                    CommentStatus commentStatus4 = commentStatus2;
                    if (commentStatus4 != null) {
                        String valueOf = String.valueOf(commentStatus4.getSharingStatus());
                        String reason = commentStatus4.getReason();
                        o.LJI(reason);
                        if (valueOf.length() == 0 || ((str = c109544Rq.getLocalExt().get("access_status")) != null && str.length() != 0 && o.LJ(valueOf, c109544Rq.getLocalExt().get("access_status")))) {
                            z = false;
                        } else {
                            c109544Rq.addLocalExt("access_status", valueOf);
                            z = true;
                        }
                        if (reason.length() == 0 || ((str2 = c109544Rq.getLocalExt().get("reason_string")) != null && str2.length() != 0 && o.LJ(reason, c109544Rq.getLocalExt().get("reason_string")))) {
                            if (z) {
                            }
                        } else {
                            c109544Rq.addLocalExt("reason_string", reason);
                        }
                        C106674Gp.LJIILJJIL(c109544Rq);
                        arrayList.add(c109544Rq);
                    }
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Comment ");
                LIZ.append(commentContent.getCommentId());
                LIZ.append(" remote status request failed!");
                C34B.LIZJ("CommentStateManager", X1D.LIZIZ(LIZ));
            }
        }
        return arrayList;
    }

    public static final Object apply$9(IDhS94S0100000_1 iDhS94S0100000_1, Object obj) {
        C3MD it = (C3MD) obj;
        o.LJIIIZ(it, "it");
        boolean hasUnreadMessageRequest = IMService.createIIMServicebyMonsterPlugin(false).getInboxDmService().hasUnreadMessageRequest();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("hasUnreadMessageRequest: ");
        LIZ.append(hasUnreadMessageRequest);
        C81843Jc.LIZJ("SessionRefactor-InboxSessionMediator", X1D.LIZIZ(LIZ));
        C81843Jc.LJ().LIZJ("decorateDmDataIndicator");
        C82543Lu c82543Lu = (C82543Lu) iDhS94S0100000_1.l0;
        c82543Lu.getClass();
        List<C3ML> list = it.LIZ;
        ArrayList arrayList = new ArrayList();
        Iterator<C3ML> it2 = list.iterator();
        while (it2.hasNext()) {
            Object obj2 = it2.next().LJLJJL;
            if ((obj2 instanceof InterfaceC82723Mm) && obj2 != null) {
                arrayList.add(obj2);
            }
        }
        List LLJI = ORZ.LLJI(arrayList);
        for (C3MX c3mx : c82543Lu.LJLJL) {
            C81843Jc.LJ().LIZJ(String.valueOf(c3mx));
            Iterator it3 = LLJI.iterator();
            while (it3.hasNext()) {
                c3mx.LJ((InterfaceC82723Mm) it3.next());
            }
            C81843Jc.LJ().LIZ(String.valueOf(c3mx));
        }
        C81843Jc.LJ().LIZ("decorateDmDataIndicator");
        return C3MD.LIZ(it, null, false, IMService.createIIMServicebyMonsterPlugin(false).getInboxDmService().hasUnreadMessageRequest(), 31);
    }
}
