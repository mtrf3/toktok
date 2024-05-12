package com.ss.android.ugc.aweme.comment.service;

import X.ActivityC45651qj;
import X.AnonymousClass714;
import X.AnonymousClass755;
import X.AnonymousClass766;
import X.C0JU;
import X.C16880lQ;
import X.C171556oJ;
import X.C176026vW;
import X.C176306vy;
import X.C176556wN;
import X.C176726we;
import X.C176746wg;
import X.C176776wj;
import X.C176826wo;
import X.C176996x5;
import X.C177126xI;
import X.C177156xL;
import X.C178296zB;
import X.C178406zM;
import X.C1794172j;
import X.C1799274i;
import X.C1799874o;
import X.C17N;
import X.C1800074q;
import X.C1800374t;
import X.C1800874y;
import X.C1801775h;
import X.C182427Dy;
import X.C188727au;
import X.C279017q;
import X.C2J3;
import X.C45804HyK;
import X.C53816LAe;
import X.C55688LtM;
import X.C58096Mr6;
import X.C62905OmT;
import X.C71K;
import X.C71Y;
import X.C72972SkS;
import X.C74Z;
import X.C75J;
import X.C75V;
import X.C75W;
import X.C76800UCe;
import X.C76D;
import X.C76F;
import X.C78886Uxe;
import X.C78Z;
import X.C79R;
import X.C79S;
import X.C7GH;
import X.C7GK;
import X.C8F6;
import X.EF7;
import X.EnumC178066yo;
import X.EnumC178426zO;
import X.ExecutorC142245i8;
import X.FMX;
import X.HPW;
import X.InterfaceC177046xA;
import X.InterfaceC178306zC;
import X.InterfaceC1794272k;
import X.InterfaceC1800674w;
import X.InterfaceC209288Jg;
import X.InterfaceC65784Pro;
import X.KL2;
import X.LFH;
import X.LKF;
import X.M89;
import X.ORY;
import X.ORZ;
import X.V16;
import X.V1B;
import X.ViewOnClickListenerC178036yl;
import X.W5F;
import X.W5U;
import X.X1D;
import Y.ARunnableS7S0400000_3;
import Y.IDCSpanS29S0100000_3;
import Y.IDFactoryS61S0000000_3;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.comment.api.CommentViewModel;
import com.ss.android.ugc.aweme.comment.commentlist.CommentListFragment;
import com.ss.android.ugc.aweme.comment.commentlist.api.CommentApi;
import com.ss.android.ugc.aweme.comment.commentlist.viewmodel.CommentViewModelImpl;
import com.ss.android.ugc.aweme.comment.commentpage.ui.CommentListPageFragment;
import com.ss.android.ugc.aweme.comment.commentpage.widget.CommentPreloadInstanceTask;
import com.ss.android.ugc.aweme.comment.experiment.PersonalizedEmojiExperiment;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentRefactorPreloadTask;
import com.ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentRethinkPopup;
import com.ss.android.ugc.aweme.comment.preload.CommentPreloadTask;
import com.ss.android.ugc.aweme.comment.service.assem.CommentHomeViewPagerAssem;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.ss.android.ugc.aweme.experiment.CommentPreloadExperiment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeCommentConfig;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.search.CommentSuggestWordList;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.net.preload.PowerPreloadServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.ss.android.ugc.now.interaction.ui.InteractionFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes4.dex */
public final class CommentServiceImpl implements CommentService {
    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void LJIJ() {
        CommentListFragment.LLLLZ = true;
    }

    public static CommentService LJJL() {
        Object LIZ = C58096Mr6.LIZ(CommentService.class, false);
        if (LIZ != null) {
            return (CommentService) LIZ;
        }
        if (C58096Mr6.LLJLLL == null) {
            synchronized (CommentService.class) {
                if (C58096Mr6.LLJLLL == null) {
                    C58096Mr6.LLJLLL = new CommentServiceImpl();
                }
            }
        }
        return C58096Mr6.LLJLLL;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final boolean LJIIIIZZ() {
        if ((((Number) C7GK.LIZ.getValue()).intValue() & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final CommentPreloadInstanceTask LJJIL() {
        return new CommentPreloadInstanceTask();
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final CommentHomeViewPagerAssem LJJJI() {
        return new CommentHomeViewPagerAssem();
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final boolean LJIIJJI() {
        if ((C176826wo.LIZ() & 64) == 64) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void LJJJJLL() {
        CommentListFragment.LLLLZI = SystemClock.uptimeMillis();
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final CommentRefactorPreloadTask LJJJLL() {
        if (!C71K.LIZIZ()) {
            return null;
        }
        return new CommentRefactorPreloadTask();
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void removeAllCache() {
        PowerPreloadServiceImpl.LIZIZ().LIZ("/aweme/v2/comment/list/", null);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void LJJI() {
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void LJJJJL() {
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void LIZ(Context context) {
        CommentListPageFragment LIZLLL = C176776wj.LIZLLL(context);
        if (LIZLLL != null) {
            LIZLLL.E8(LIZLLL.isShowing());
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final String LJI(Aweme aweme) {
        AwemeCommentConfig commentConfig;
        String zeroIconText;
        if (!C178406zM.LIZ(aweme) || aweme == null || (commentConfig = aweme.getCommentConfig()) == null || (zeroIconText = commentConfig.getZeroIconText()) == null || zeroIconText.length() == 0) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        FMX.onEventV3("show_comment_guide_icon");
        return zeroIconText;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void LJII(Context context) {
        CommentListPageFragment LIZLLL = C176776wj.LIZLLL(context);
        if (LIZLLL != null) {
            LIZLLL.Hj("");
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final List<String> LJIIIZ(boolean z) {
        String[] strArr;
        if (o.LJ(a.LJFF().LJFF().getValue(), Boolean.FALSE)) {
            C71Y.LIZ("QuickCommentEmojisSetting", "personalized emoji");
            AnonymousClass755.LIZ.getClass();
            strArr = (String[]) AnonymousClass755.LJ.getValue();
        } else {
            C71Y.LIZ("QuickCommentEmojisSetting", "default emoji");
            strArr = AnonymousClass755.LIZIZ;
        }
        if (strArr == null || strArr.length == 0) {
            if (z) {
                AnonymousClass755.LIZ.getClass();
                return ORY.LJJZZIII(AnonymousClass755.LIZJ);
            }
            AnonymousClass755.LIZ.getClass();
            return ORY.LJJZZIII(AnonymousClass755.LIZIZ);
        }
        if (z) {
            return ORZ.LLJI(ORY.LJJLIIIJLJLI(2, strArr));
        }
        return ORY.LJJZZIII(strArr);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void LJIILIIL(String str) {
        if (CommentPreloadExperiment.LIZ().isEnable()) {
            return;
        }
        PowerPreloadServiceImpl.LIZIZ().LIZ("/aweme/v2/comment/list/", C0JU.LIZ("aweme_id", str));
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final String LJIILJJIL(String str) {
        String LIZ = AnonymousClass714.LIZ(str);
        o.LJIIIIZZ(LIZ, "decodeEmojiContent(content)");
        return LIZ;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final boolean LJIILLIIL(Aweme aweme) {
        return C45804HyK.LJJJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final CommentViewModel LJIIZILJ(ActivityC45651qj activityC45651qj) {
        return (CommentViewModel) ViewModelProviders.of(activityC45651qj, new IDFactoryS61S0000000_3(0)).get(CommentViewModelImpl.class);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final EnumC178426zO LJJ(Aweme aweme) {
        return C178406zM.LIZJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final CommentPreloadTask LJJIIJ(Context context) {
        return new CommentPreloadTask(context);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final boolean LJJIIZ(Context context) {
        CommentListPageFragment LIZLLL = C176776wj.LIZLLL(context);
        if (LIZLLL != null && LIZLLL.isShowing()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final boolean LJJIJIIJI(Aweme aweme) {
        return C45804HyK.LJIIIIZZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final boolean LJJIJIIJIL(int i) {
        if (((Number) C1800074q.LIZIZ.getValue()).intValue() != 1 || i <= C1800074q.LIZ) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final List<C75J> LJJJIL(ActivityC45651qj activityC45651qj) {
        Fragment fragment;
        Fragment fragment2;
        C2J3 LJII;
        ArrayList arrayList = new ArrayList();
        if (activityC45651qj != null) {
            FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
            if (supportFragmentManager != null) {
                fragment = supportFragmentManager.LJJJIL("comment_page");
            } else {
                fragment = null;
            }
            if ((fragment instanceof CommentListPageFragment) && fragment != null) {
                arrayList.add(fragment);
            }
            LFH.LIZIZ.LIZLLL().LJIILIIL();
            LKF LIZJ = C53816LAe.LIZJ(activityC45651qj);
            if (LIZJ != null && (LJII = LIZJ.LJII("comment_page_tablet")) != null) {
                fragment2 = LJII.getFragment();
            } else {
                fragment2 = null;
            }
            if ((fragment2 instanceof CommentListPageFragment) && fragment2 != null) {
                arrayList.add(fragment2);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void LJJJJJ(String emoji) {
        o.LJIIIZ(emoji, "emoji");
        if (PersonalizedEmojiExperiment.LIZIZ()) {
            C75W.LIZ(emoji);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.79R] */
    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final C79R LJJJJLI(final C79S c79s) {
        return new InterfaceC209288Jg(c79s) { // from class: X.79R
            public final C79S LIZ;
            public C79Q LIZIZ;
            public final C79V LIZJ;
            public final View LIZLLL;
            public Aweme LJ;

            @Override // X.InterfaceC209288Jg
            public final void LIZIZ() {
                C79Q c79q = this.LIZIZ;
                if (c79q != null) {
                    c79q.LIZIZ();
                }
                this.LIZIZ = null;
            }

            @Override // X.InterfaceC209288Jg
            public final void LJIIZILJ() {
                C79Q c79q = this.LIZIZ;
                if (c79q != null) {
                    c79q.LIZIZ();
                }
            }

            @Override // X.InterfaceC209288Jg
            public final void LJJII() {
                C79Q c1809178d;
                C79Q c79q = this.LIZIZ;
                if (c79q != null) {
                    c79q.LIZIZ();
                }
                if (this.LIZ.LJFF == 1) {
                    c1809178d = new C79Y(this.LIZJ, this.LIZ);
                } else {
                    Aweme aweme = this.LJ;
                    if (aweme != null) {
                        aweme.getAid();
                    }
                    c1809178d = new C1809178d(this.LIZ, this.LIZJ);
                }
                this.LIZJ.LJZI(c1809178d.LJI());
                this.LIZIZ = c1809178d;
                this.LIZJ.setBubbleListManager(c1809178d);
            }

            @Override // X.InterfaceC209288Jg
            public final void LJJIIZ() {
                C79Q c79q = this.LIZIZ;
                if (c79q != null) {
                    c79q.LIZIZ();
                }
            }

            @Override // X.InterfaceC209288Jg
            public final void onDestroy() {
                C79Q c79q = this.LIZIZ;
                if (c79q != null) {
                    c79q.LIZIZ();
                }
            }

            @Override // X.InterfaceC209288Jg
            public final void onPause() {
                this.LIZJ.LJZ();
            }

            @Override // X.InterfaceC209288Jg
            public final void onResume() {
                C79Q c79q;
                if (this.LIZJ.LJLLJ() && (c79q = this.LIZIZ) != null && c79q.LJLJJI) {
                    this.LIZJ.LJLZ();
                }
            }

            {
                this.LIZ = c79s;
                ViewGroup viewGroup = c79s.LIZ;
                if (viewGroup != null) {
                    Context context = viewGroup.getContext();
                    o.LJIIIIZZ(context, "params.barrageContainer.context");
                    LayoutInflater LLZIL = C16880lQ.LLZIL(context);
                    ViewGroup viewGroup2 = c79s.LIZ;
                    if (viewGroup2 != null) {
                        View LLLLIILL = C16880lQ.LLLLIILL(LLZIL, R.layout.qz, viewGroup2, true);
                        o.LJIIIIZZ(LLLLIILL, "from(context).inflate(R.…s.barrageContainer, true)");
                        this.LIZLLL = LLLLIILL;
                        C79V c79v = (C79V) LLLLIILL.findViewById(R.id.bjv);
                        o.LJIIIIZZ(c79v, "root.comment_bubble_list");
                        this.LIZJ = c79v;
                        return;
                    }
                    o.LJIJI("barrageContainer");
                    throw null;
                }
                o.LJIJI("barrageContainer");
                throw null;
            }

            @Override // X.InterfaceC209288Jg
            public final void LIZ(int i) {
                C79V c79v = this.LIZJ;
                int LIZIZ = C7MY.LIZIZ(LiveTryModeCountDownThresholdSetting.DEFAULT);
                if (i < LIZIZ) {
                    i = LIZIZ;
                }
                if (c79v.LLLIIIL == i) {
                    return;
                }
                c79v.LLLIIIL = i;
                c79v.getLayoutParams().height = i;
                c79v.LJZI(c79v.LLLILZ);
                c79v.requestLayout();
            }

            @Override // X.InterfaceC209288Jg
            public final void LIZLLL(Aweme aweme) {
                String str;
                this.LJ = aweme;
                ViewGroup viewGroup = this.LIZ.LIZ;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                    this.LIZJ.setVisibility(0);
                    if (!TextUtils.isEmpty(aweme.getAid())) {
                        C79Q c79q = this.LIZIZ;
                        if (c79q != null) {
                            c79q.LIZIZ();
                        }
                        C79V c79v = this.LIZJ;
                        String str2 = this.LIZ.LIZJ;
                        String groupId = aweme.getGroupId();
                        int LJFF = C222578oP.LJFF(aweme.getAuthor());
                        if (C54838Lfe.LJIIZILJ(aweme)) {
                            str = "story";
                        } else {
                            str = "post";
                        }
                        c79v.setMMobEventParam(new C1811278y(aweme, str2, groupId, LJFF, str, this.LIZ.LIZLLL, new LinkedHashSet()));
                        C79Q c79q2 = this.LIZIZ;
                        if (c79q2 != null) {
                            c79q2.LIZ(aweme);
                            return;
                        }
                        return;
                    }
                    C79Q c79q3 = this.LIZIZ;
                    if (c79q3 == null) {
                        return;
                    }
                    c79q3.LIZIZ();
                    return;
                }
                o.LJIJI("barrageContainer");
                throw null;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void LJJJJZ(InterfaceC1800674w interfaceC1800674w) {
        C75V.LIZ.put(Integer.valueOf(interfaceC1800674w.LIZ()), interfaceC1800674w);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final CommentStruct LJJJLIIL(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return V1B.LJJI(aweme);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final String LJJJZ(CommentStruct commentStruct) {
        String str = commentStruct.getCommentInfo() + " [label] " + C1799274i.LJI(commentStruct);
        o.LJIIIIZZ(str, "builder.toString()");
        return str;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final boolean LIZJ(Aweme aweme, M89 m89) {
        return AnonymousClass766.LIZJ(aweme, m89);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final boolean LJ(String str, Aweme aweme) {
        int i;
        if (aweme == null) {
            return false;
        }
        if (V16.LJJJJL("notification_page", aweme, str)) {
            i = V16.LJJIII(aweme.getAid(), "notification_page", str);
        } else {
            i = 0;
        }
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        if (C1800874y.LIZ(new C176556wN(i, aid, str, 0L)) == null) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void LJIIL(Comment comment, String str) {
        C176726we.LIZ(comment, str);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void LJIL(String str, Aweme aweme) {
        int i;
        if (str.equals("opus")) {
            str = "others_homepage";
        }
        EF7.LIZIZ();
        FMX.LJII("comment", 0L, str, aweme.getAid());
        User author = aweme.getAuthor();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("group_id", aweme.getAid());
        if (author != null) {
            i = author.getFollowStatus();
        } else {
            i = 0;
        }
        c188727au.LIZLLL(i, "follow_status");
        FMX.LJIIL("comment", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final boolean LJJIFFI(Context context, Exception exc) {
        return C178296zB.LIZLLL(context, exc, R.string.djs, false, false);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final List<TextExtraStruct> LJJIIJZLJL(Context context, CommentStruct commentStruct) {
        ArrayList arrayList = new ArrayList();
        int length = commentStruct.getCommentInfo().length() + 1;
        int i = length + 7;
        TextExtraStruct textExtraStruct = new TextExtraStruct();
        textExtraStruct.setType(65281);
        textExtraStruct.setCustomSpan(new C171556oJ(EF7.LIZIZ(), context.getString(R.string.eh0), "#FFFFFFFF", R.drawable.boh, "#80FFFFFF", "#58161823", 10, 17));
        textExtraStruct.setStart(length);
        textExtraStruct.setEnd(i);
        arrayList.add(textExtraStruct);
        int i2 = i + 1;
        int length2 = C1799274i.LJI(commentStruct).length() + i;
        TextExtraStruct textExtraStruct2 = new TextExtraStruct();
        textExtraStruct2.setType(65281);
        textExtraStruct2.setCustomSpan(new C8F6(C17N.LJIILL(13.0d), C78886Uxe.LJJIFFI(R.attr.gs, R.color.cq, context)));
        textExtraStruct2.setStart(i2);
        textExtraStruct2.setEnd(length2);
        arrayList.add(textExtraStruct2);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void LJJJJIZL(String str, boolean z) {
        C188727au LIZ = C78Z.LIZ("danmaku", str, z);
        LIZ.LIZLLL(0, "no_show");
        FMX.LJIIL("comment_rethink_hit", LIZ.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final List LIZIZ(Context context, CommentStruct commentStruct, Aweme aweme) {
        ArrayList arrayList = new ArrayList();
        int length = commentStruct.getCommentInfo().length() + 1;
        int i = length + 7;
        TextExtraStruct textExtraStruct = new TextExtraStruct();
        textExtraStruct.setType(65281);
        textExtraStruct.setCustomSpan(null);
        textExtraStruct.setStart(length);
        textExtraStruct.setEnd(i);
        arrayList.add(textExtraStruct);
        int i2 = i + 1;
        int length2 = C1799274i.LJI(commentStruct).length() + i;
        TextExtraStruct textExtraStruct2 = new TextExtraStruct();
        textExtraStruct2.setType(65281);
        textExtraStruct2.setCustomSpan(new C8F6(C17N.LJIILL(13.0d), C78886Uxe.LJJIFFI(R.attr.gs, R.color.cq, context)));
        textExtraStruct2.setStart(i2);
        textExtraStruct2.setEnd(length2);
        arrayList.add(textExtraStruct2);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final BaseCommentResponse LJIILL(String str, String str2, String str3) {
        BaseCommentResponse LIZJ = CommentApi.LIZJ(23, str, str2, str3);
        o.LJIIIIZZ(LIZJ, "diggComment(commentId, aid, diggType, channelId)");
        return LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final boolean LJIJJLI(ViewGroup viewGroup, Aweme aweme, M89 m89) {
        if (viewGroup == null || aweme == null) {
            return false;
        }
        C182427Dy c182427Dy = (C182427Dy) viewGroup.findViewById(R.id.n9j);
        if (C7GH.LJIIIIZZ(aweme)) {
            if (c182427Dy == null) {
                Context context = viewGroup.getContext();
                o.LJIIIIZZ(context, "parent.context");
                c182427Dy = new C182427Dy(context);
                c182427Dy.setId(R.id.n9j);
                viewGroup.addView(c182427Dy, -1, -1);
            }
            C78886Uxe.LJJLIIIJJI(viewGroup);
            c182427Dy.setVisibility(0);
            c182427Dy.LIZIZ(aweme, m89);
            return true;
        }
        if (c182427Dy != null) {
            c182427Dy.setVisibility(8);
        }
        C78886Uxe.LJJLIIIJILLIZJL(viewGroup);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void LJJII(int i, String str, List pairList) {
        String str2;
        C76F c76f;
        User author;
        Aweme aweme;
        CommentSuggestWordList commentSuggestWordList;
        o.LJIIIZ(pairList, "pairList");
        if (!CommentPreloadExperiment.LIZ().isEnable() || CommentPreloadExperiment.LIZIZ() == 0 || !ORY.LJJIJIIJIL(str, CommentPreloadExperiment.LIZ().getEnableScene())) {
            return;
        }
        if (!o.LJ(str, "inner_push") && CommentPreloadExperiment.LIZIZ() != i) {
            return;
        }
        int LIZ = C177126xI.LIZ();
        int LIZ2 = C176306vy.LIZ();
        int LIZ3 = C176746wg.LIZ();
        int ttl = CommentPreloadExperiment.LIZ().getTtl();
        boolean LIZ4 = C176026vW.LIZ();
        Iterator it = pairList.iterator();
        while (it.hasNext()) {
            C1800374t c1800374t = (C1800374t) it.next();
            if (!LIZ4 || (aweme = c1800374t.LJLIL) == null || (commentSuggestWordList = aweme.getCommentSuggestWordList()) == null || (str2 = commentSuggestWordList.jsonStringToServer()) == null) {
                str2 = "";
            }
            Aweme aweme2 = c1800374t.LJLIL;
            String str3 = c1800374t.LJLILLLLZI;
            if (aweme2 == null || (author = aweme2.getAuthor()) == null || (c76f = C76D.LIZ(author, str)) == null) {
                c76f = C76F.NO_RELATION;
            }
            CommentApi.LJ(LIZ3, ttl, 1002, LIZ, LIZ2, c76f, aweme2, str3, str, str, str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void LJJIJ(Aweme aweme, Integer num, int i) {
        String str;
        int i2;
        C76F c76f;
        User author;
        CommentSuggestWordList commentSuggestWordList;
        int LIZ = C177126xI.LIZ();
        int LIZ2 = C176306vy.LIZ();
        if (!C176026vW.LIZ() || aweme == null || (commentSuggestWordList = aweme.getCommentSuggestWordList()) == null || (str = commentSuggestWordList.jsonStringToServer()) == null) {
            str = "";
        }
        int LIZ3 = C176746wg.LIZ();
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = -1;
        }
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            c76f = C76D.LIZ(author, "homepage_hot");
        } else {
            c76f = null;
        }
        CommentApi.LJ(LIZ3, i2, i, LIZ, LIZ2, c76f, aweme, null, "homepage_hot", "homepage_hot", str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
    
        if (r1 != null) goto L20;
     */
    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.comment.commentpage.ui.CommentListPageFragment LJJIJIL(android.app.Activity r9, com.ss.android.ugc.aweme.feed.model.Aweme r10, X.C174366sq r11) {
        /*
            r8 = this;
            r3 = 0
            if (r9 == 0) goto Lc
            if (r10 == 0) goto Lc
            boolean r0 = r9.isFinishing()
            if (r0 == 0) goto Ld
        Lc:
            return r3
        Ld:
            X.LFH r0 = X.LFH.LIZIZ
            X.LEp r0 = r0.LIZLLL()
            r0.LJIILIIL()
            java.lang.String r0 = r11.getSplitContainerTag()
            X.LKF r5 = X.C53816LAe.LJ(r0)
            if (r5 != 0) goto L37
        L20:
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r0 = com.ss.android.ugc.aweme.comment.commentpage.ui.CommentListPageFragment.LLILLL
            long r4 = r6 - r0
            r1 = 300(0x12c, double:1.48E-321)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L99
            java.lang.String r2 = "CommentLog"
            r1 = 6
            java.lang.String r0 = "CommentListPageFragment: showCommentList(): cancel because open again too fast"
            X.C36922EeM.LIZLLL(r1, r2, r0)
            goto Lc
        L37:
            java.lang.String r6 = "comment_page_tablet"
            boolean r0 = r5.LIZLLL(r6)
            r1 = 0
            if (r0 == 0) goto L95
            r4 = 1
            r11.setSplitMode(r4)
            r11.setForceHidePoi(r4)
            r11.setForceHideDonation(r4)
            X.2J3 r2 = r5.LJII(r6)
            if (r2 != 0) goto L70
            kotlin.jvm.internal.AqS153S0100000_3 r2 = new kotlin.jvm.internal.AqS153S0100000_3
            r0 = 86
            r2.<init>(r5, r0)
            com.ss.android.ugc.aweme.comment.commentpage.ui.CommentListPageFragment r1 = X.C176776wj.LJ(r11, r10, r9)
            r1.LLIFFJFJJ(r10)
            r1.LLILIL = r2
            r5.LIZJ(r1)
            int r0 = X.C176826wo.LIZ()
            r0 = r0 & 1
            if (r0 != r4) goto L6e
            X.C176776wj.LJFF(r11, r10)
        L6e:
            r3 = r1
            goto Lc
        L70:
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r11
            r0[r4] = r10
            r2.LIZ(r0)
            java.lang.String r1 = "click_comment_icon"
            java.lang.String r0 = r11.getEnterMethod()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            r5.LJFF(r6, r0)
            androidx.fragment.app.Fragment r1 = r2.getFragment()
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.comment.commentpage.ui.CommentListPageFragment"
            kotlin.jvm.internal.o.LJII(r1, r0)
            com.ss.android.ugc.aweme.comment.commentpage.ui.CommentListPageFragment r1 = (com.ss.android.ugc.aweme.comment.commentpage.ui.CommentListPageFragment) r1
            if (r1 == 0) goto L20
            goto L6e
        L95:
            r11.setSplitMode(r1)
            goto L20
        L99:
            com.ss.android.ugc.aweme.comment.commentpage.ui.CommentListPageFragment.LLILLL = r6
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "CommentListPageFragment: showCommentList() aid = "
            r1.append(r0)
            java.lang.String r0 = r10.getAid()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C176186vm.LIZ(r0)
            com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService r0 = com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService.LJIIL()     // Catch: java.lang.Exception -> Ld4
            boolean r1 = r0.LIZIZ(r9)     // Catch: java.lang.Exception -> Ld4
            com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService r0 = com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService.LJIIL()     // Catch: java.lang.Exception -> Ld4
            androidx.fragment.app.Fragment r0 = r0.LJII()     // Catch: java.lang.Exception -> Ld4
            if (r1 == 0) goto Lcc
            if (r0 == 0) goto Lcc
            com.ss.android.ugc.aweme.comment.commentpage.ui.CommentListPageFragment r3 = X.C176776wj.LIZIZ(r0, r10, r11)     // Catch: java.lang.Exception -> Ld4
            goto Lc
        Lcc:
            X.1qj r9 = (X.ActivityC45651qj) r9     // Catch: java.lang.Exception -> Ld4
            com.ss.android.ugc.aweme.comment.commentpage.ui.CommentListPageFragment r3 = X.C176776wj.LIZ(r9, r11, r10)     // Catch: java.lang.Exception -> Ld4
            goto Lc
        Ld4:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "CommentListFragment.showCommentList() error in try/catch. ErrorMessage: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C1JD.LJIILIIL(r0)
            X.C36922EeM.LIZ(r2)
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.service.CommentServiceImpl.LJJIJIL(android.app.Activity, com.ss.android.ugc.aweme.feed.model.Aweme, X.6sq):com.ss.android.ugc.aweme.comment.commentpage.ui.CommentListPageFragment");
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void LJJIZ(Context context, int i, String str) {
        if (context == null) {
            return;
        }
        C62905OmT c62905OmT = new C62905OmT(context);
        c62905OmT.LJ(i);
        c62905OmT.LIZJ = str;
        c62905OmT.LJIIJJI(R.string.cen, null, false);
        c62905OmT.LJII = false;
        C279017q.LIZLLL(c62905OmT);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void LJJJ(Fragment fragment, Aweme aweme, InterfaceC1794272k callback) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(callback, "callback");
        C1794172j c1794172j = C1794172j.LJLIL;
        C1794172j.LJLILLLLZI = aweme;
        C1794172j.LJLJJI = callback;
        fragment.hashCode();
        new C176996x5(fragment, c1794172j).LIZ();
        C1794172j.LJLJI = C17N.LJJJJLL().If().LIZJ().LJLJI;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void LJJJJ(ViewGroup viewGroup, Aweme aweme, M89 m89) {
        if (viewGroup == null || aweme == null) {
            return;
        }
        C182427Dy c182427Dy = (C182427Dy) viewGroup.findViewById(R.id.n9j);
        if (c182427Dy == null) {
            Context context = viewGroup.getContext();
            o.LJIIIIZZ(context, "parent.context");
            c182427Dy = new C182427Dy(context);
            c182427Dy.setId(R.id.n9j);
            viewGroup.addView(c182427Dy, -1, -1);
        }
        viewGroup.setVisibility(0);
        c182427Dy.setVisibility(0);
        c182427Dy.LIZIZ(aweme, m89);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final boolean LJJJJJL(ViewStub viewStub, M89 param, Aweme aweme) {
        SmartAvatarImageView smartAvatarImageView;
        int i;
        ViewTreeObserver viewTreeObserver;
        o.LJIIIZ(param, "param");
        if (viewStub == null || aweme == null || !AnonymousClass766.LIZJ(aweme, param)) {
            return false;
        }
        final C1799874o c1799874o = new C1799874o(viewStub, param);
        c1799874o.LIZ.setLayoutResource(R.layout.pf);
        View inflate = c1799874o.LIZ.inflate();
        o.LJII(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        c1799874o.LIZJ = inflate;
        c1799874o.LIZLLL = (TuxTextView) inflate.findViewById(R.id.d27);
        View view = c1799874o.LIZJ;
        if (view != null) {
            smartAvatarImageView = (SmartAvatarImageView) view.findViewById(R.id.d26);
        } else {
            smartAvatarImageView = null;
        }
        c1799874o.LJ = smartAvatarImageView;
        final View view2 = c1799874o.LIZJ;
        final M89 m89 = c1799874o.LIZIZ;
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: X.74p
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    String exposeCommentType;
                    ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
                    if (viewTreeObserver2 != null) {
                        viewTreeObserver2.removeOnPreDrawListener(this);
                    }
                    int width = (int) ((view2.getWidth() - C32151Nz.LJIIZILJ(Integer.valueOf(c1799874o.LJFF))) - C32151Nz.LJIIZILJ(Integer.valueOf(c1799874o.LJI)));
                    C1799874o c1799874o2 = c1799874o;
                    M89 m892 = m89;
                    TuxTextView tuxTextView = c1799874o2.LIZLLL;
                    if (tuxTextView != null && (exposeCommentType = m892.getExposeCommentType()) != null) {
                        int hashCode = exposeCommentType.hashCode();
                        if (hashCode != 77863626) {
                            if (hashCode != 1668327882) {
                                if (hashCode == 1668381247 && exposeCommentType.equals("COMMENT")) {
                                    String string = tuxTextView.getContext().getString(R.string.rai, "");
                                    o.LJIIIIZZ(string, "context.getString(R.stri…ment_commented_title, \"\")");
                                    String exposeUserName = m892.getExposeUserName();
                                    o.LJI(exposeUserName);
                                    tuxTextView.setText(tuxTextView.getContext().getString(R.string.rai, C1799874o.LIZ(tuxTextView, string, exposeUserName, width)));
                                }
                            } else if (exposeCommentType.equals("MENTION")) {
                                String string2 = tuxTextView.getContext().getString(R.string.raj, "");
                                o.LJIIIIZZ(string2, "context.getString(R.stri…ment_mentioned_title, \"\")");
                                String exposeUserName2 = m892.getExposeUserName();
                                o.LJI(exposeUserName2);
                                tuxTextView.setText(tuxTextView.getContext().getString(R.string.raj, C1799874o.LIZ(tuxTextView, string2, exposeUserName2, width)));
                            }
                        } else if (exposeCommentType.equals("REPLY")) {
                            String string3 = tuxTextView.getContext().getString(R.string.rak, "");
                            o.LJIIIIZZ(string3, "context.getString(R.stri…omment_replied_title, \"\")");
                            String exposeUserName3 = m892.getExposeUserName();
                            o.LJI(exposeUserName3);
                            tuxTextView.setText(tuxTextView.getContext().getString(R.string.rak, C1799874o.LIZ(tuxTextView, string3, exposeUserName3, width)));
                        }
                    }
                    return false;
                }
            });
        }
        TuxTextView tuxTextView = c1799874o.LIZLLL;
        if (tuxTextView != null) {
            Integer LIZJ = C72972SkS.LIZJ(tuxTextView, "context", R.attr.dk);
            if (LIZJ != null) {
                i = LIZJ.intValue();
            } else {
                i = 0;
            }
            tuxTextView.setTextColor(i);
            tuxTextView.setTuxFont(32);
        }
        SmartAvatarImageView smartAvatarImageView2 = c1799874o.LJ;
        if (smartAvatarImageView2 != null && m89.getExposeAvatarUrl() != null) {
            W5F LJII = W5U.LJII(m89.getExposeAvatarUrl());
            LJII.LJJIIJ = smartAvatarImageView2;
            C16880lQ.LLJJJ(LJII);
        }
        View view3 = c1799874o.LIZJ;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        FMX.LJIIL("show_cmt_notice_headline", new C188727au().LIZ);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final C176996x5 LJJJLZIJ(Fragment fragment, int i, InterfaceC177046xA service) {
        o.LJIIIZ(service, "service");
        return new C176996x5(fragment, service);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void LJJIJL(C76F authorRelationType, String str, String str2, String commentSuggestWordList) {
        o.LJIIIZ(authorRelationType, "authorRelationType");
        o.LJIIIZ(commentSuggestWordList, "commentSuggestWordList");
        CommentApi.LIZLLL(str, 0L, 20, null, null, C55688LtM.LIZ(str2), 0, C177126xI.LIZ(), C176306vy.LIZ(), authorRelationType, 0, str2, null, commentSuggestWordList);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void LJJIJLIJ(Context context, Aweme aweme, M89 param, InterfaceC65784Pro<C76800UCe> emailUploadPopupTask) {
        o.LJIIIZ(param, "param");
        o.LJIIIZ(emailUploadPopupTask, "emailUploadPopupTask");
        if (aweme == null || context == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(param.getEventType());
        LIZ.append("   ");
        LIZ.append(param.getPageType());
        C71Y.LIZLLL("VideoViewAutoPop", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("current aid: ");
        LIZ2.append(param.getAid());
        LIZ2.append("  current aweme view aid ");
        LIZ2.append(aweme.getAid());
        C71Y.LIZLLL("VideoViewAutoPop", X1D.LIZIZ(LIZ2));
        if ((((Number) C7GK.LIZ.getValue()).intValue() & 1) == 1) {
            ExecutorC142245i8.LJLILLLLZI.LIZ(200L, new ARunnableS7S0400000_3(context, aweme, param, emailUploadPopupTask, 0));
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final List LJJJJI(Context context, CommentStruct commentStruct, AwemeRawAd awemeRawAd, AqS153S0100000_3 aqS153S0100000_3) {
        ArrayList arrayList = new ArrayList();
        int length = commentStruct.getCommentInfo().length() + 1;
        int i = length + 7;
        IDCSpanS29S0100000_3 iDCSpanS29S0100000_3 = new IDCSpanS29S0100000_3(aqS153S0100000_3, 2);
        TextExtraStruct textExtraStruct = new TextExtraStruct();
        textExtraStruct.setType(65281);
        textExtraStruct.setCustomSpan(iDCSpanS29S0100000_3);
        textExtraStruct.setStart(length);
        textExtraStruct.setEnd(i);
        if (awemeRawAd != null && awemeRawAd.getButtonText() != null) {
            TextExtraStruct textExtraStruct2 = new TextExtraStruct();
            textExtraStruct2.setType(65281);
            int LJJJJI = C17N.LJJJJI(C17N.LJJJLL(12.0d));
            String charSequence = C78886Uxe.LJJII(R.attr.gx, R.color.cu, context).toString();
            C171556oJ c171556oJ = new C171556oJ(context, awemeRawAd.getButtonText(), charSequence, R.drawable.y1, charSequence, C78886Uxe.LJJII(R.attr.cf, R.color.al, context).toString(), LJJJJI, 15);
            c171556oJ.LJLLLLLL = KL2.LIZJ(context, -2.38f);
            textExtraStruct2.setCustomSpan(c171556oJ);
            textExtraStruct2.setStart(length);
            textExtraStruct2.setEnd(i);
            arrayList.add(textExtraStruct2);
        }
        arrayList.add(textExtraStruct);
        int length2 = C1799274i.LJI(commentStruct).length() + i;
        TextExtraStruct textExtraStruct3 = new TextExtraStruct();
        textExtraStruct3.setType(65281);
        textExtraStruct3.setCustomSpan(new C8F6(C17N.LJIILL(13.0d), C78886Uxe.LJJIFFI(R.attr.gx, R.color.cu, context)));
        textExtraStruct3.setStart(i + 1);
        textExtraStruct3.setEnd(length2);
        arrayList.add(textExtraStruct3);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final boolean LJJIII(M89 m89, Aweme aweme, Boolean bool, Integer num, String str) {
        boolean z;
        String str2;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        if (m89 == null || (str2 = m89.getPhotoMode()) == null) {
            str2 = "";
        }
        return AnonymousClass766.LIZ(aweme, str, str2, z);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void LJJJJZI(int i, String str, String str2, String str3, String str4) {
        String str5;
        if (i == 1) {
            str5 = "favorite_comment";
        } else {
            str5 = "cancel_favorite_comment";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("enter_method", "sticker");
        c188727au.LJIIIZ("comment_id", str2);
        c188727au.LJIIIZ("to_user_id", str3);
        c188727au.LJIIIZ("group_id", str4);
        FMX.LJIIL(str5, c188727au.LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:
    
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x005a, code lost:
    
        if (r0 == null) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b0  */
    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC55317LnN LIZLLL(android.view.View r8, androidx.fragment.app.FragmentManager r9, java.lang.String r10, X.InterfaceC178496zV r11, X.InterfaceC178126yu r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.service.CommentServiceImpl.LIZLLL(android.view.View, androidx.fragment.app.FragmentManager, java.lang.String, X.6zV, X.6yu, java.lang.String):X.LnN");
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final ViewOnClickListenerC178036yl LJJIIZI(Context context, Fragment fragment, Comment comment, Aweme aweme, EnumC178066yo type, RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(type, "type");
        ViewOnClickListenerC178036yl viewOnClickListenerC178036yl = new ViewOnClickListenerC178036yl(context, fragment);
        viewOnClickListenerC178036yl.LIZ(comment, aweme, type, viewHolder);
        return viewOnClickListenerC178036yl;
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void LJIJI(Context activity, QaStruct qaStruct, String str, String str2, String str3, String str4, String str5, String str6) {
        o.LJIIIZ(activity, "activity");
        HPW.LIZIZ(activity, qaStruct, str, str2, str3, str4, str5, null, str6, 128);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void LJIJJ(Aweme aweme, CharSequence charSequence, String str, String str2, String str3, String str4, int i, C177156xL c177156xL) {
        String str5 = str2;
        CharSequence charSequence2 = charSequence;
        String str6 = str4;
        if (aweme == null) {
            return;
        }
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        if (str5 == null) {
            str5 = "";
        }
        if (str6 == null) {
            str6 = "";
        }
        C74Z.LJJI(aweme, charSequence2, str, "", "", null, null, str5, str3, i, str6, c177156xL, -402655232);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void LJFF(Activity activity, Aweme aweme, String str, NowFeedMobHierarchyData nowFeedMobHierarchyData, boolean z, Comment comment, Integer num, String str2, boolean z2) {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        if (activity == null || activity.isFinishing() || LFH.LIZIZ.LIZLLL().block().LIZIZ() || aweme == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - InteractionFragment.LLF <= 300) {
            return;
        }
        InteractionFragment.LLF = elapsedRealtime;
        try {
            C1801775h.LIZ((ActivityC45651qj) activity, aweme, str, nowFeedMobHierarchyData, z, comment, num, str2, z2, valueOf);
        } catch (Exception unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void LJIIJ(Context context, FragmentManager fragmentManager, CommentRethinkPopup rethinkPopup, boolean z, String str, String str2, final InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, final InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, final InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3, String str3) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(rethinkPopup, "rethinkPopup");
        C78Z.LIZIZ(context, rethinkPopup, new InterfaceC178306zC() { // from class: X.74r
            @Override // X.InterfaceC178306zC
            public final void LIZ() {
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro4 = interfaceC65784Pro2;
                if (interfaceC65784Pro4 != null) {
                    interfaceC65784Pro4.invoke();
                }
            }

            @Override // X.InterfaceC178306zC
            public final void LIZIZ() {
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro4 = interfaceC65784Pro;
                if (interfaceC65784Pro4 != null) {
                    interfaceC65784Pro4.invoke();
                }
            }

            @Override // X.InterfaceC178306zC
            public final void LIZJ() {
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro4 = interfaceC65784Pro3;
                if (interfaceC65784Pro4 != null) {
                    interfaceC65784Pro4.invoke();
                }
            }
        }, z, str, str2).show(fragmentManager, str3);
    }
}
