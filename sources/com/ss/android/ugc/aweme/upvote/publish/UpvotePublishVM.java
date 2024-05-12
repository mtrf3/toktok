package com.ss.android.ugc.aweme.upvote.publish;

import X.ActivityC45651qj;
import X.AnonymousClass780;
import X.C176616wT;
import X.C181627Aw;
import X.C183087Gm;
import X.C214188as;
import X.C47261Igj;
import X.C55096Ljo;
import X.C55888Lwa;
import X.C56702Kk;
import X.C73969T1h;
import X.C76082yi;
import X.C78404Ups;
import X.C7H1;
import X.InterfaceC183057Gj;
import X.InterfaceC214228aw;
import X.InterfaceC55058LjC;
import X.InterfaceC64592gB;
import X.ORZ;
import X.QD3;
import X.T16;
import Y.AfS15S1200000_3;
import Y.AfS18S1100000_3;
import Y.AfS1S2200000_3;
import Y.AfS55S0100000_3;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.model.CommentRethinkPopup;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteCacheState;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.notice.api.bean.GuideOutPushParam;
import com.ss.android.ugc.aweme.upvote.IRepostListAbility;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import com.ss.android.ugc.aweme.upvote.model.UpvotePublishResponse;
import com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.AqS12S1101000_3;
import kotlin.jvm.internal.AqS57S1100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public final class UpvotePublishVM extends AssemViewModel<C181627Aw> {
    public final C176616wT LJLIL = new C176616wT();
    public final C214188as LJLILLLLZI = C78404Ups.LIZJ(this, C183087Gm.LJLIL);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C181627Aw defaultState() {
        return new C181627Aw(0);
    }

    public final InterfaceC214228aw<InterfaceC183057Gj> iv0() {
        return (InterfaceC214228aw) this.LJLILLLLZI.getValue();
    }

    public static String hv0() {
        String enterFrom;
        ComponentCallbacks2 topActivity = ActivityStack.getTopActivity();
        if (!(topActivity instanceof InterfaceC55058LjC) || (enterFrom = ((InterfaceC55058LjC) topActivity).getEnterFrom()) == null) {
            return "homepage_hot";
        }
        switch (enterFrom.hashCode()) {
            case -1572049565:
                if (!enterFrom.equals("notification_page")) {
                    return "homepage_hot";
                }
                break;
            case -1271119582:
                if (!enterFrom.equals("homepage_follow")) {
                    return "homepage_hot";
                }
                break;
            case -667094460:
                if (!enterFrom.equals("homepage_friends")) {
                    return "homepage_hot";
                }
                break;
            case -562830579:
                if (!enterFrom.equals("personal_homepage")) {
                    return "homepage_hot";
                }
                break;
            case 1691937916:
                if (!enterFrom.equals("homepage_hot")) {
                    return "homepage_hot";
                }
                break;
            case 1691943685:
                if (!enterFrom.equals("homepage_now")) {
                    return "homepage_hot";
                }
                break;
            default:
                return "homepage_hot";
        }
        return enterFrom;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCommentListPanelShow(C56702Kk event) {
        o.LJIIIZ(event, "event");
        if (event.LJLIL == 0) {
            EventBus.LIZJ().LJIJ(this);
            C55888Lwa c55888Lwa = C55888Lwa.LIZIZ;
            Activity topActivity = ActivityStack.getTopActivity();
            o.LJIIIIZZ(topActivity, "getTopActivity()");
            c55888Lwa.LIZ(topActivity, new GuideOutPushParam(hv0(), "exit_comment", "repost", (String) null, 17));
        }
    }

    public static void lv0(String str, String str2) {
        IRepostListAbility iRepostListAbility = (IRepostListAbility) C55096Ljo.LIZ(GScope.LJLIL, IRepostListAbility.class, AnonymousClass780.LIZ(str));
        if (iRepostListAbility != null) {
            iRepostListAbility.Jf0(str2);
        }
    }

    public final void jv0(String str, Throwable th) {
        ActivityC45651qj activityC45651qj;
        Activity topActivity = ActivityStack.getTopActivity();
        if (!(topActivity instanceof ActivityC45651qj) || (activityC45651qj = (ActivityC45651qj) topActivity) == null) {
            return;
        }
        activityC45651qj.getSupportFragmentManager().LJJJIL("UpvoteCommentDialogFragment");
        C7H1.LJIILJJIL(str, UpvoteCacheState.PUBLISH_FAILED);
        setState(new AqS57S1100000_3(th, str, 12));
    }

    public final void mv0(String str, UpvotePublishMobParam upvotePublishMobParam) {
        pv0(str, null);
        disposeOnClear(iv0().getOperator().LJJLI(str, null, null, null).LJIL(1L).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS15S1200000_3(upvotePublishMobParam, this, str, 0), new AfS18S1100000_3(this, str, 3)));
    }

    public final void pv0(String str, String str2) {
        String str3;
        this.LJLIL.LJ();
        C176616wT c176616wT = this.LJLIL;
        c176616wT.getClass();
        c176616wT.LIZLLL = "ttk_upvote_publish_api_monitor";
        C176616wT c176616wT2 = this.LJLIL;
        if (str2 == null || str2.length() == 0) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c176616wT2.LIZIZ(str3, "is_empty");
        this.LJLIL.LIZJ(str, "gid");
    }

    public final void gv0(int i, UpvoteStruct upvoteStruct, String itemId) {
        o.LJIIIZ(itemId, "itemId");
        setStateImmediate(new AqS12S1101000_3(i, upvoteStruct, itemId, 1));
    }

    public final void nv0(String itemId, String str, UpvotePublishMobParam upvotePublishMobParam, List<? extends TextExtraStruct> list, List<CommentImageModel> list2) {
        o.LJIIIZ(itemId, "itemId");
        kv0(this, itemId, str, list, list2, null, false, 48);
        pv0(itemId, str);
        disposeOnClear(iv0().getOperator().LJLJL(itemId, str, list, list2).LJIL(1L).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS1S2200000_3(upvotePublishMobParam, this, str, itemId, 1), new AfS18S1100000_3(this, itemId, 4)));
    }

    public final void ov0(final String itemId, final String str, final UpvotePublishMobParam upvotePublishMobParam, final List<? extends TextExtraStruct> list, final List<CommentImageModel> list2, final boolean z) {
        o.LJIIIZ(itemId, "itemId");
        kv0(this, itemId, str, list, list2, null, z, 16);
        pv0(itemId, str);
        disposeOnClear(iv0().getOperator().LJJLI(itemId, str, list, list2).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJIIL(new AfS55S0100000_3(this, 38)).LJJII(new InterfaceC64592gB() { // from class: X.7Gh
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                ActivityC45651qj activityC45651qj;
                String str2;
                UpvotePublishResponse upvotePublishResponse = (UpvotePublishResponse) obj;
                CommentRethinkPopup commentRethinkPopup = upvotePublishResponse.rethinkPopup;
                String str3 = null;
                if (commentRethinkPopup == null) {
                    UpvoteStruct upvoteStruct = upvotePublishResponse.upvote;
                    if (upvoteStruct == null || (str2 = upvoteStruct.getCommentId()) == null) {
                        str2 = "";
                    }
                    C183067Gk.LIZ(str2, str, upvotePublishMobParam);
                    C76082yi.LIZ(itemId);
                    UpvoteStruct upvoteStruct2 = upvotePublishResponse.upvote;
                    if (upvoteStruct2 != null) {
                        String str4 = itemId;
                        upvoteStruct2.setMyNewUpvote(true);
                        C7H1.LJII(str4, upvoteStruct2);
                    }
                    this.setState(new AqS57S1100000_3(upvotePublishResponse, itemId, 16));
                    UpvotePublishVM upvotePublishVM = this;
                    UpvotePublishMobParam upvotePublishMobParam2 = upvotePublishMobParam;
                    if (upvotePublishMobParam2 != null) {
                        str3 = upvotePublishMobParam2.enterFrom;
                    }
                    String str5 = itemId;
                    upvotePublishVM.getClass();
                    UpvotePublishVM.lv0(str3, str5);
                } else {
                    UpvotePublishVM upvotePublishVM2 = this;
                    String str6 = itemId;
                    Boolean valueOf = Boolean.valueOf(z);
                    upvotePublishVM2.getClass();
                    Activity topActivity = ActivityStack.getTopActivity();
                    if ((topActivity instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) topActivity) != null) {
                        activityC45651qj.getSupportFragmentManager().LJJJIL("UpvoteCommentDialogFragment");
                        upvotePublishVM2.setState(new AqS107S0300000_3(commentRethinkPopup, C1FP.LJIIIIZZ(C7H2.LIZ(str6)), valueOf, 47));
                    }
                }
                UpvotePublishVM upvotePublishVM3 = this;
                upvotePublishVM3.LJLIL.LIZ();
                upvotePublishVM3.LJLIL.LIZLLL(upvotePublishResponse);
                upvotePublishVM3.LJLIL.LJFF();
            }
        }, new AfS18S1100000_3(this, itemId, 5)));
    }

    public static void kv0(UpvotePublishVM upvotePublishVM, String itemId, String str, List list, List list2, Integer num, boolean z, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        if ((i & 8) != 0) {
            list2 = null;
        }
        if ((i & 16) != 0) {
            num = 0;
        }
        if ((i & 32) != 0) {
            z = false;
        }
        upvotePublishVM.getClass();
        o.LJIIIZ(itemId, "itemId");
        List LLJILJILJ = ORZ.LLJILJILJ(C76082yi.LIZIZ());
        ArrayList arrayList = (ArrayList) LLJILJILJ;
        if (!arrayList.contains(itemId)) {
            arrayList.add(itemId);
            int i2 = 50;
            try {
                SettingsManager.LIZLLL().getClass();
                i2 = SettingsManager.LJ("social_upvote_publish_cache_limit", 50);
            } catch (Throwable unused) {
            }
            int size = arrayList.size() - i2;
            if (1 <= size && size <= C47261Igj.LJJI(LLJILJILJ)) {
                LLJILJILJ = arrayList.subList(size, arrayList.size());
            }
            C76082yi.LIZLLL(LLJILJILJ);
        }
        C7H1.LJI(itemId, str, z, list, list2);
        upvotePublishVM.setStateImmediate(new AqS57S1100000_3(itemId, num, 45));
    }
}
