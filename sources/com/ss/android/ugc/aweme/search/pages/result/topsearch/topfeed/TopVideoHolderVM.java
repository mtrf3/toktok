package com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed;

import X.C00F;
import X.C174046sK;
import X.C1JD;
import X.C221108m2;
import X.C35719E0d;
import X.C49255JUt;
import X.C49277JVp;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C67792lL;
import X.C76800UCe;
import X.C77275UUl;
import X.InterfaceC88471Ynr;
import X.JOG;
import X.JP8;
import X.JV0;
import X.JVF;
import X.JVH;
import X.JVI;
import X.JVL;
import X.ORS;
import X.ORZ;
import X.QD3;
import X.X1D;
import Y.AObserverS76S0100000_8;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.m0;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes9.dex */
public final class TopVideoHolderVM extends ViewModel {
    public static final Set<Integer> LLFII = C77275UUl.LJIIIIZZ(0, 1);
    public static final long LLFZ = TimeUnit.SECONDS.toMillis(5);
    public final NextLiveData<JV0> LJLIL;
    public final NextLiveData LJLILLLLZI;
    public final NextLiveData<C35719E0d> LJLJI;
    public final NextLiveData LJLJJI;
    public final NextLiveData<JOG> LJLJJL;
    public final NextLiveData LJLJJLL;
    public final NextLiveData<JVF> LJLJL;
    public final NextLiveData LJLJLJ;
    public final NextLiveData<JP8> LJLJLLL;
    public final NextLiveData LJLL;
    public final Set<NextLiveData<? extends Object>> LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public SearchGlobalViewModel LJLLLLLL;
    public Aweme LJLZ;
    public SearchMixFeed LJZ;
    public boolean LJZI;
    public int LJZL;
    public ClickSearchViewModel LL;
    public C67792lL LLD;
    public InterfaceC88471Ynr<? super Context, ? super TextExtraStruct, C76800UCe> LLF;
    public final AObserverS76S0100000_8 LLFF;
    public final AObserverS76S0100000_8 LLFFF;

    public final CommentService iv0() {
        Object value = this.LJLLL.getValue();
        o.LJIIIIZZ(value, "<get-commentService>(...)");
        return (CommentService) value;
    }

    public TopVideoHolderVM() {
        NextLiveData<JV0> nextLiveData = new NextLiveData<>();
        this.LJLIL = nextLiveData;
        this.LJLILLLLZI = nextLiveData;
        NextLiveData<C35719E0d> nextLiveData2 = new NextLiveData<>();
        this.LJLJI = nextLiveData2;
        this.LJLJJI = nextLiveData2;
        NextLiveData<JOG> nextLiveData3 = new NextLiveData<>();
        this.LJLJJL = nextLiveData3;
        this.LJLJJLL = nextLiveData3;
        NextLiveData<JVF> nextLiveData4 = new NextLiveData<>();
        this.LJLJL = nextLiveData4;
        this.LJLJLJ = nextLiveData4;
        NextLiveData<JP8> nextLiveData5 = new NextLiveData<>();
        this.LJLJLLL = nextLiveData5;
        this.LJLL = nextLiveData5;
        this.LJLLI = C77275UUl.LJIIIIZZ(nextLiveData, nextLiveData2, nextLiveData3, nextLiveData4, nextLiveData5);
        this.LJLLILLLL = C221108m2.LIZIZ(JVI.LJLIL);
        this.LJLLJ = C221108m2.LIZIZ(C49277JVp.LJLIL);
        this.LJLLL = C221108m2.LIZIZ(JVH.LJLIL);
        this.LJLLLL = C221108m2.LIZIZ(JVL.LJLIL);
        this.LJZL = -1;
        C1JD.LJJJIL(EventBus.LIZJ(), this);
        this.LLFF = new AObserverS76S0100000_8(this, 69);
        this.LLFFF = new AObserverS76S0100000_8(this, 68);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        C1JD.LJJJJ(EventBus.LIZJ(), this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a9, code lost:
    
        if (((X.RBX) X.HG3.LJIILL()).isMe(r12.getAuthorUid()) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void jv0(X.ActivityC45651qj r17) {
        /*
            r16 = this;
            r9 = r17
            if (r9 != 0) goto L5
            return
        L5:
            r7 = r16
            com.ss.android.ugc.aweme.feed.model.Aweme r12 = r7.LJLZ
            if (r12 != 0) goto Lc
            return
        Lc:
            android.animation.ArgbEvaluator r5 = new android.animation.ArgbEvaluator
            r5.<init>()
            r0 = 2130968673(0x7f040061, float:1.7546006E38)
            java.lang.Integer r0 = X.C79045V0n.LJI(r0, r9)
            r4 = 0
            if (r0 == 0) goto Lf7
            int r6 = r0.intValue()
        L1f:
            java.lang.String r1 = X.C50238Jne.LIZLLL()
            java.lang.String r0 = "light"
            boolean r8 = kotlin.jvm.internal.o.LJ(r1, r0)
            X.6sq r1 = new X.6sq
            java.lang.String r0 = r12.getAid()
            r1.<init>(r0)
            com.ss.android.ugc.aweme.profile.model.User r0 = r12.getAuthor()
            if (r0 == 0) goto L3e
            java.lang.String r0 = r0.getUid()
            if (r0 != 0) goto L40
        L3e:
            java.lang.String r0 = ""
        L40:
            r1.setAuthorUid(r0)
            java.lang.String r0 = "general_search"
            r1.setEventType(r0)
            boolean r0 = r12.isCmtSwt()
            r3 = 1
            r0 = r0 ^ 1
            r1.setEnableComment(r0)
            com.ss.android.ugc.aweme.commercialize.model.CommentStruct r0 = r12.getAdCommentStruct()
            r1.setAdCommentStruct(r0)
            com.ss.android.ugc.aweme.comment.services.CommentService r0 = r7.iv0()
            boolean r0 = r0.LJIILLIIL(r12)
            r1.setCommentClose(r0)
            com.ss.android.ugc.aweme.comment.services.CommentService r0 = r7.iv0()
            boolean r0 = r0.LJIILLIIL(r12)
            if (r0 == 0) goto Lf5
            com.ss.android.ugc.aweme.comment.services.CommentService r0 = r7.iv0()
            boolean r0 = r0.LJJIJIIJI(r12)
            if (r0 != 0) goto Lf5
            r0 = 1
        L79:
            r1.setCommentLimited(r0)
            r1.forceRefresh(r3)
            java.lang.String r0 = "click_comment_icon"
            r1.setEnterMethod(r0)
            boolean r0 = X.C54838Lfe.LJIIZILJ(r12)
            if (r0 == 0) goto Lc5
            X.L1a r0 = X.C53578L1a.LIZ
            r0.getClass()
            boolean r0 = X.C53578L1a.LIZ()
            if (r0 == 0) goto Lc5
            boolean r0 = r12.isScheduleVideo()
            if (r0 != 0) goto Lc5
            com.ss.android.ugc.aweme.IAccountUserService r2 = X.HG3.LJIILL()
            java.lang.String r0 = r12.getAuthorUid()
            X.RBX r2 = (X.RBX) r2
            boolean r0 = r2.isMe(r0)
            if (r0 == 0) goto Lc5
        Lab:
            r1.setShouldShowVideoDesc(r3)
            X.K5Q r4 = new X.K5Q
            r4.<init>(r5, r6, r7, r8, r9)
            r1.setOnShowHeightChangeListener(r4)
            com.ss.android.ugc.aweme.comment.services.CommentService r3 = r7.iv0()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r7.LJLZ
            java.lang.String r0 = "param"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r3.LJJIJIL(r9, r2, r1)
            return
        Lc5:
            X.M89 r11 = X.C2S6.LIZ(r9)
            java.lang.String r2 = "from_profile_self"
            java.lang.String r0 = r11.getFrom()
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 != 0) goto Ldb
            boolean r0 = r11.isMyProfile()
            if (r0 == 0) goto Ldc
        Ldb:
            r4 = 1
        Ldc:
            com.ss.android.ugc.aweme.comment.services.CommentService r10 = com.ss.android.ugc.aweme.comment.service.CommentServiceImpl.LJJL()
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r4)
            int r0 = r11.getPageType()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            java.lang.String r15 = r11.getEventType()
            boolean r3 = r10.LJJIII(r11, r12, r13, r14, r15)
            goto Lab
        Lf5:
            r0 = 0
            goto L79
        Lf7:
            r6 = 0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopVideoHolderVM.jv0(X.1qj):void");
    }

    public final void kv0(User user) {
        Integer num;
        if (C00F.LIZ(31744, 0, "disable_relationship", true) == 1) {
            return;
        }
        SearchGlobalViewModel searchGlobalViewModel = this.LJLLLLLL;
        Integer num2 = null;
        if (searchGlobalViewModel != null) {
            Integer kv0 = searchGlobalViewModel.kv0(user.getUid());
            if (kv0 != null) {
                user.setFollowStatus(kv0.intValue());
            }
            if (((IAccountUserService) this.LJLLILLLL.getValue()).isLogin() && !o.LJ(user.getUid(), ((IAccountUserService) this.LJLLILLLL.getValue()).getCurUserId())) {
                if (user.getFollowStatus() == 1) {
                    num2 = 2;
                    num = Integer.valueOf(R.string.gkd);
                } else if (user.getFollowStatus() == 2) {
                    num2 = 4;
                    num = Integer.valueOf(R.string.exk);
                } else if (user.getFollowerStatus() == 1) {
                    num2 = 3;
                    num = Integer.valueOf(R.string.gix);
                } else if (user.getFollowStatus() == 0) {
                    num2 = 1;
                    num = Integer.valueOf(R.string.git);
                }
                this.LJLJI.postValue(new C35719E0d(num, num2, !ORZ.LJLJJI(num2, C77275UUl.LJIIIIZZ(2, 4))));
                return;
            }
            num = null;
            this.LJLJI.postValue(new C35719E0d(num, num2, !ORZ.LJLJJI(num2, C77275UUl.LJIIIIZZ(2, 4))));
            return;
        }
        o.LJIJI("searchGlobalVM");
        throw null;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCommentEvent(C174046sK event) {
        Object[] objArr;
        JOG value;
        Aweme aweme;
        AwemeStatistics statistics;
        JVF value2;
        Comment comment;
        String str;
        Comment comment2;
        String str2;
        String str3;
        List<Comment> commentList;
        Comment comment3;
        o.LJIIIZ(event, "event");
        Object obj = event.LJLILLLLZI;
        if (!(obj instanceof Object[]) || (objArr = (Object[]) obj) == null || objArr.length != 2 || (value = this.LJLJJL.getValue()) == null || (aweme = this.LJLZ) == null || (statistics = aweme.getStatistics()) == null || (value2 = this.LJLJL.getValue()) == null || (comment = value2.LIZ) == null) {
            return;
        }
        Object obj2 = objArr[0];
        if (!(obj2 instanceof String) || obj2 == null) {
            return;
        }
        Aweme aweme2 = this.LJLZ;
        if (aweme2 != null) {
            str = aweme2.getAid();
        } else {
            str = null;
        }
        if (o.LJ(obj2, str)) {
            int i = event.LJLIL;
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    statistics.setCommentCount(statistics.getCommentCount() - 1);
                    JOG L = JOG.L(value, null, C49255JUt.LIZ(value.LJLJJI, statistics.getCommentCount()), null, true, false, 87);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("COMMENT_DELETE_SUCCESS ");
                    LIZ.append(L);
                    X1D.LIZIZ(LIZ);
                    this.LJLJJL.postValue(L);
                    Object obj3 = objArr[1];
                    if (!(obj3 instanceof String) || (str2 = (String) obj3) == null || str2.length() <= 0) {
                        return;
                    }
                    JVF value3 = this.LJLJL.getValue();
                    if (value3 != null && (comment3 = value3.LIZ) != null) {
                        str3 = comment3.getCid();
                    } else {
                        str3 = null;
                    }
                    if (!o.LJ(str2, str3)) {
                        return;
                    }
                    SearchMixFeed searchMixFeed = this.LJZ;
                    if (searchMixFeed != null && (commentList = searchMixFeed.getCommentList()) != null) {
                        ORS.LJJLJLI(commentList);
                    }
                    this.LJLJL.postValue(new JVF(null, false));
                    return;
                }
                JOG L2 = JOG.L(value, null, C49255JUt.LIZ(value.LJLJJI, statistics.getCommentCount()), null, true, false, 87);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("COMMENT_PUBLISH_SUCCESS ");
                LIZ2.append(L2);
                X1D.LIZIZ(LIZ2);
                this.LJLJJL.postValue(L2);
                return;
            }
            Object obj4 = objArr[1];
            if (!(obj4 instanceof Comment) || (comment2 = (Comment) obj4) == null) {
                return;
            }
            comment.setUserDigged(comment2.getUserDigged());
            comment.setDiggCount(comment2.getDiggCount());
            this.LJLJL.postValue(new JVF(comment, true));
        }
    }

    public final C49255JUt gv0(int i, Aweme aweme) {
        long diggCount;
        long j;
        boolean z;
        AwemeStatistics statistics;
        C67792lL c67792lL = this.LLD;
        if (c67792lL != null) {
            diggCount = c67792lL.LIZ(i);
        } else {
            diggCount = aweme.getStatistics().getDiggCount();
        }
        if (iv0().LJIILLIIL(aweme) || C63081OpJ.LJLJLLL(aweme) || (statistics = aweme.getStatistics()) == null) {
            j = 0;
        } else {
            j = statistics.getCommentCount();
        }
        long shareCount = aweme.getStatistics().getShareCount();
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        return new C49255JUt(diggCount, j, shareCount, z);
    }

    public static void hv0(Context context, User user, String str) {
        if (user == null) {
            return;
        }
        String uid = user.getUid();
        o.LJIIIIZZ(uid, "user.uid");
        String secUid = user.getSecUid();
        o.LJIIIIZZ(secUid, "user.secUid");
        String requestId = user.getRequestId();
        SmartRoute LIZ = m0.LIZ(context, "aweme://user/profile/", "uid", uid, "sec_user_id", secUid);
        LIZ.withParam("source_aid", str);
        LIZ.withParam("enter_from", "general_search");
        LIZ.withParam("previous_page", "general_search");
        LIZ.withParam("extra_from_pre_page", "general_search");
        LIZ.withParam("extra_from_event_enter_from", "general_search");
        LIZ.withParam("enter_from_request_id", requestId);
        LIZ.withParam("extra_previous_page_position", "main_head");
        LIZ.withParam("enter_method", "");
        LIZ.withParam("general_search_card_type", 0);
        LIZ.withParam("search_request_id", requestId);
        LIZ.open();
    }
}
