package com.ss.android.ugc.aweme.story.feed.common;

import X.AV1;
import X.C189837ch;
import X.C1E2;
import X.C42193GhB;
import X.C43921HLp;
import X.C47261Igj;
import X.C53578L1a;
import X.C54769LeX;
import X.C54771LeZ;
import X.C54772Lea;
import X.C54789Ler;
import X.C54808LfA;
import X.C54819LfL;
import X.C54820LfM;
import X.C54822LfO;
import X.C54838Lfe;
import X.C55723Ltv;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72972SkS;
import X.C73318Sq2;
import X.C73849Syb;
import X.C73969T1h;
import X.C77123UOp;
import X.C78999UzT;
import X.EnumC54821LfN;
import X.InterfaceC43927HLv;
import X.InterfaceC54401LWr;
import X.InterfaceC54770LeY;
import X.InterfaceC64592gB;
import X.L1F;
import X.M89;
import X.T16;
import X.TBW;
import X.X1D;
import Y.AfS23S1100000_9;
import Y.IDhS102S0100000_9;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import com.ss.android.ugc.aweme.story.base.distribution.dispatcher.StoryReceiver;
import com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel;
import com.ss.android.ugc.aweme.story.userstory.mine.MineUserStoryFetcher;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class StoryFeedViewModel extends DataCenter implements InterfaceC54770LeY {
    public static final /* synthetic */ int LJLLLLLL = 0;
    public final LifecycleOwner LJLJL;
    public final M89 LJLJLJ;
    public final String LJLJLLL;
    public final String LJLL;
    public final C73318Sq2 LJLLI;
    public final Map<String, Aweme> LJLLILLLL;
    public final Map<String, List<C54822LfO>> LJLLJ;
    public final C54819LfL LJLLL;
    public boolean LJLLLL;

    public final boolean Cv0() {
        return o.LJ(this.LJLJLJ.getFrom(), "STORY_ENTRANCE_DEFAULT");
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle = this.LJLJL.getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycleOwner.lifecycle");
        return lifecycle;
    }

    public final boolean tv0() {
        if (TextUtils.equals("personal_homepage", this.LJLJLLL) && o.LJ(this.LJLJLJ.getFrom(), "STORY_ENTRANCE_MINE")) {
            return true;
        }
        return false;
    }

    public final boolean uv0() {
        if (TextUtils.equals("personal_homepage", this.LJLJLLL) && o.LJ("from_profile_self", this.LJLJLJ.getFrom())) {
            return true;
        }
        return false;
    }

    public final boolean vv0() {
        return C77123UOp.LJJIJIIJIL(this.LJLJLJ.getFrom());
    }

    public final boolean wv0() {
        if (o.LJ(this.LJLJLJ.getFrom(), "STORY_ENTRANCE_AVATAR") || o.LJ(this.LJLJLJ.getFrom(), "STORY_ENTRANCE_MINE") || o.LJ(this.LJLJLJ.getFrom(), "STORY_ENTRANCE_OTHER")) {
            return true;
        }
        return false;
    }

    public final boolean xv0() {
        if (TextUtils.equals("homepage_follow", this.LJLJLLL) && !TextUtils.equals("STORY_ENTRANCE_FOLLOWING_FEED_TOP_LIST", this.LJLJLJ.getFrom())) {
            return true;
        }
        return false;
    }

    public final boolean yv0() {
        if (TextUtils.equals("homepage_friends", this.LJLJLLL) && !vv0()) {
            return true;
        }
        return false;
    }

    public final List<Aweme> nv0() {
        if (uv0() || xv0() || (!L1F.LIZIZ() && yv0())) {
            return C43921HLp.LIZ.LJIIIZ();
        }
        C43921HLp.LIZ.getClass();
        return C43921HLp.LJIJ();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.DataCenter, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LJLLI.LIZLLL();
        C43921HLp.LIZ.LIZLLL(this.LJLL);
    }

    public final boolean zv0() {
        if (xv0() || yv0()) {
            return true;
        }
        return false;
    }

    public static boolean Av0(String uid) {
        String str;
        o.LJIIIZ(uid, "uid");
        User LIZIZ = AV1.LIZIZ();
        if (LIZIZ != null) {
            str = LIZIZ.getUid();
        } else {
            str = null;
        }
        return TextUtils.equals(uid, str);
    }

    public static boolean Bv0(Aweme aweme) {
        if (aweme == null || !C54838Lfe.LJIILIIL(aweme) || !((Boolean) L1F.LIZLLL.getValue()).booleanValue()) {
            return false;
        }
        return true;
    }

    public static String pv0(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        User author = aweme.getAuthor();
        if (author != null) {
            String uid = author.getUid();
            if (uid == null) {
                return "";
            }
            return uid;
        }
        UserStory userStory = aweme.getUserStory();
        if (userStory == null) {
            return "";
        }
        if (userStory.getStories().size() > 0) {
            String authorUid = ((Aweme) ListProtector.get(userStory.getStories(), 0)).getAuthorUid();
            if (authorUid == null) {
                return "";
            }
            return authorUid;
        }
        String aid = aweme.getAid();
        if (aid == null) {
            return "";
        }
        return aid;
    }

    public final boolean Ev0(String uid) {
        o.LJIIIZ(uid, "uid");
        if (!Av0(uid)) {
            return false;
        }
        if (!tv0() && !vv0() && !yv0()) {
            return false;
        }
        return true;
    }

    public final boolean Gv0(String uid) {
        o.LJIIIZ(uid, "uid");
        if (Av0(uid) && nv0().size() > 0) {
            if (!tv0()) {
                C53578L1a.LIZ.getClass();
                if ((!C53578L1a.LIZ() || (!xv0() && !uv0() && !yv0())) && !vv0() && !this.LJLJLJ.isShouldQueryMyStoryFromCache()) {
                }
            }
            return true;
        }
        return false;
    }

    public final Aweme lv0(String str) {
        User author;
        Aweme aweme = new Aweme();
        StringBuilder LJFF = C72972SkS.LJFF(str, '_');
        LJFF.append(UUID.randomUUID());
        aweme.setAid(X1D.LIZIZ(LJFF));
        aweme.setAwemeType(40);
        aweme.setStoryFakeAweme(true);
        aweme.setFakeAid(UUID.randomUUID().toString());
        Story story = new Story(0L, false, 0L, false, false, 0L, false, false, false, 511, null);
        story.setFaked(true);
        aweme.setStory(story);
        Aweme aweme2 = (Aweme) ((LinkedHashMap) this.LJLLILLLL).get(str);
        if (aweme2 != null && (author = aweme2.getAuthor()) != null) {
            aweme.setAuthor(author);
        }
        aweme.setIsTikTokStory(true);
        return aweme;
    }

    public final List<Aweme> qv0(String uid) {
        UserStory userStory;
        List<Aweme> arrayList;
        o.LJIIIZ(uid, "uid");
        Aweme aweme = (Aweme) ((LinkedHashMap) this.LJLLILLLL).get(uid);
        if (aweme == null || (userStory = aweme.getUserStory()) == null) {
            return null;
        }
        if (Gv0(uid)) {
            C43921HLp.LIZ.LJ(userStory);
            arrayList = nv0();
        } else {
            arrayList = new ArrayList<>();
        }
        if (!userStory.getHasMoreAfter() && !userStory.getHasMoreBefore()) {
            userStory.setOriginTotalCount(userStory.getStories().size());
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getWrappedStories: originTotalCount: ");
            LIZ.append(userStory.getOriginTotalCount());
            LIZ.append(", userStory instance: ");
            LIZ.append(System.identityHashCode(userStory));
            C189837ch.LIZ("huangxin.2020", X1D.LIZIZ(LIZ));
            userStory.setTotalCount(userStory.getOriginTotalCount() + arrayList.size());
        }
        if (userStory.getTotalCount() <= userStory.getStories().size()) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(userStory.getStories());
            arrayList2.addAll(arrayList);
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(userStory.getStories());
        if (userStory.getCurrentPosition() + userStory.getStories().size() < userStory.getTotalCount() - arrayList.size()) {
            long totalCount = ((userStory.getTotalCount() - arrayList.size()) - userStory.getCurrentPosition()) - userStory.getStories().size();
            do {
                totalCount--;
                arrayList3.add(lv0(uid));
            } while (totalCount > 0);
        }
        arrayList3.addAll(arrayList);
        if (userStory.getCurrentPosition() > 0) {
            long currentPosition = userStory.getCurrentPosition();
            do {
                currentPosition--;
                ListProtector.add(arrayList3, 0, lv0(uid));
            } while (currentPosition > 0);
        }
        return arrayList3;
    }

    public final List<C54822LfO> sv0(String str) {
        UserStory userStory;
        Aweme aweme = (Aweme) ((LinkedHashMap) this.LJLLILLLL).get(str);
        if (aweme == null || (userStory = aweme.getUserStory()) == null) {
            return new ArrayList();
        }
        int totalCount = (int) userStory.getTotalCount();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < totalCount; i3++) {
            long j = i3;
            String str2 = "";
            if (j >= userStory.getCurrentPosition()) {
                if (j < userStory.getCurrentPosition() + userStory.getStories().size()) {
                    String aid = ((Aweme) ListProtector.get(userStory.getStories(), i)).getAid();
                    if (aid != null) {
                        str2 = aid;
                    }
                    arrayList.add(new C54822LfO(str2, EnumC54821LfN.LOADED));
                    i++;
                }
            }
            if (Gv0(str) && i3 >= totalCount - nv0().size()) {
                String aid2 = ((Aweme) ListProtector.get(nv0(), i2)).getAid();
                if (aid2 != null) {
                    str2 = aid2;
                }
                arrayList.add(new C54822LfO(str2, EnumC54821LfN.PUBLISH));
                i2++;
            } else {
                arrayList.add(new C54822LfO("", EnumC54821LfN.UNLOADING));
            }
        }
        this.LJLLJ.put(str, arrayList);
        return arrayList;
    }

    public StoryFeedViewModel(LifecycleOwner lifecycleOwner, M89 param) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(param, "param");
        this.LJLJL = lifecycleOwner;
        this.LJLJLJ = param;
        String eventType = param.getEventType();
        this.LJLJLLL = eventType;
        String LJFF = i0.LJFF(eventType, ":story_feed_view_model");
        this.LJLL = LJFF;
        this.LJLLI = new C73318Sq2();
        this.LJLLILLLL = new LinkedHashMap();
        this.LJLLJ = new LinkedHashMap();
        this.LJLJI = lifecycleOwner;
        if (tv0() || vv0() || zv0() || o.LJ(param.getEventType(), "story_views_list_panel")) {
            C43921HLp.LIZ.LJIIL(LJFF, new InterfaceC43927HLv() { // from class: X.8nO
                @Override // X.InterfaceC43927HLv
                public final void LIZ(float f) {
                }

                @Override // X.InterfaceC43927HLv
                public final void LIZIZ(EnumC221928nM result) {
                    o.LJIIIZ(result, "result");
                }

                @Override // X.InterfaceC43927HLv
                public final void onStart() {
                }

                @Override // X.InterfaceC43927HLv
                public final void LIZLLL(int i) {
                    StoryFeedViewModel.this.jv0(Integer.valueOf(i), "UPLOADING_USER_STORY_ALL_SUCCESS");
                }

                @Override // X.InterfaceC43927HLv
                public final void LJFF(String scheduleId) {
                    o.LJIIIZ(scheduleId, "scheduleId");
                    String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
                    Aweme aweme = (Aweme) ((LinkedHashMap) StoryFeedViewModel.this.LJLLILLLL).get(curUserId);
                    if (aweme != null) {
                        StoryFeedViewModel storyFeedViewModel = StoryFeedViewModel.this;
                        o.LJIIIIZZ(curUserId, "curUserId");
                        storyFeedViewModel.mv0(curUserId, scheduleId);
                        storyFeedViewModel.jv0(aweme.getUserStory(), "LOAD_USER_STORY_SUCCESS");
                    }
                }

                @Override // X.InterfaceC43927HLv
                public final void LIZJ(String scheduleId, C221958nP data) {
                    o.LJIIIZ(scheduleId, "scheduleId");
                    o.LJIIIZ(data, "data");
                    if (StoryFeedViewModel.this.zv0()) {
                        StoryFeedViewModel storyFeedViewModel = StoryFeedViewModel.this;
                        Aweme aweme = data.LIZLLL;
                        storyFeedViewModel.getClass();
                        if (!StoryFeedViewModel.Bv0(aweme)) {
                            return;
                        }
                    }
                    if (data.LIZLLL != null) {
                        StoryFeedViewModel.this.jv0(new OSZ(scheduleId, Float.valueOf(data.LIZ)), "UPLOADING_USER_STORY_PROGRESS");
                    }
                }

                @Override // X.InterfaceC43927HLv
                public final void LJ(String scheduleId, C221958nP data) {
                    o.LJIIIZ(scheduleId, "scheduleId");
                    o.LJIIIZ(data, "data");
                    if (StoryFeedViewModel.this.zv0()) {
                        StoryFeedViewModel storyFeedViewModel = StoryFeedViewModel.this;
                        Aweme aweme = data.LIZLLL;
                        storyFeedViewModel.getClass();
                        if (!StoryFeedViewModel.Bv0(aweme)) {
                            return;
                        }
                    }
                    StoryFeedViewModel.this.jv0(scheduleId, "UPLOADING_LOCAL_VIDEO_READY");
                }

                @Override // X.InterfaceC43927HLv
                public final void LJI(String scheduleId, C189737cX schedule) {
                    o.LJIIIZ(scheduleId, "scheduleId");
                    o.LJIIIZ(schedule, "schedule");
                    C221958nP c221958nP = schedule.LJLILLLLZI;
                    EnumC221928nM enumC221928nM = c221958nP.LIZIZ;
                    if (enumC221928nM == EnumC221928nM.SUCCESS) {
                        Aweme aweme = c221958nP.LIZLLL;
                        if (aweme != null) {
                            StoryFeedViewModel.this.jv0(new OSZ(scheduleId, aweme), "UPLOADING_USER_STORY_SUCCESS");
                            return;
                        }
                        return;
                    }
                    if (enumC221928nM != EnumC221928nM.FAILED) {
                        return;
                    }
                    if (StoryFeedViewModel.this.zv0()) {
                        StoryFeedViewModel storyFeedViewModel = StoryFeedViewModel.this;
                        Aweme aweme2 = c221958nP.LIZLLL;
                        storyFeedViewModel.getClass();
                        if (!StoryFeedViewModel.Bv0(aweme2)) {
                            return;
                        }
                    }
                    StoryFeedViewModel.this.jv0(new OSZ(scheduleId, c221958nP.LIZJ), "UPLOADING_USER_STORY_FAIL");
                }
            });
        }
        this.LJLLL = new C54819LfL();
    }

    public final void Fv0(Aweme aweme, String uid) {
        Class cls;
        o.LJIIIZ(uid, "uid");
        UserStory userStory = aweme.getUserStory();
        if (userStory == null) {
            return;
        }
        this.LJLLILLLL.put(uid, aweme);
        if (Gv0(uid)) {
            rv0(uid, userStory);
            C1E2.LIZJ(new AqS175S0100000_9(userStory, 287));
        }
        sv0(uid);
        C53578L1a.LIZ.getClass();
        if (C53578L1a.LIZ() && Av0(uid) && !this.LJLLLL && !Cv0() && !TextUtils.equals("story_archive", this.LJLJLLL)) {
            TBW[] tbwArr = new TBW[0];
            C54808LfA c54808LfA = C54808LfA.LIZLLL;
            if (o.LJ(C65352Pkq.LIZ(C54772Lea.class), C65352Pkq.LIZ(C54772Lea.class))) {
                cls = C54772Lea.class;
            } else {
                cls = C54771LeZ.class;
            }
            C65776Prg LIZ = C65352Pkq.LIZ(cls);
            StoryReceiver storyReceiver = new StoryReceiver(uid, this, c54808LfA);
            if (o.LJ(LIZ, C65352Pkq.LIZ(C54772Lea.class))) {
                c54808LfA.LIZIZ(this, storyReceiver);
            }
            C73849Syb<C54789Ler<SUBSCRIBE_DATA, OUTPUT_DATA>> c73849Syb = c54808LfA.LIZIZ;
            storyReceiver.LJLJJI = C42193GhB.LIZJ(c73849Syb, c73849Syb).LJJIFFI(new C54769LeX(c54808LfA, uid)).LJJIJL(new IDhS102S0100000_9(tbwArr, 7)).LJIILJJIL(c54808LfA.LIZJ).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS23S1100000_9(this, uid, 1), new InterfaceC64592gB() { // from class: X.9Fg
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            });
            this.LJLLLL = true;
        }
    }

    public final void Hv0(int i, String uid) {
        UserStory userStory;
        o.LJIIIZ(uid, "uid");
        Aweme aweme = (Aweme) ((LinkedHashMap) this.LJLLILLLL).get(uid);
        if (aweme == null || (userStory = aweme.getUserStory()) == null) {
            return;
        }
        List<C54822LfO> list = (List) ((LinkedHashMap) this.LJLLJ).get(uid);
        if (list == null) {
            list = sv0(uid);
        }
        if (userStory.getCurrentPosition() + userStory.getStories().size() < userStory.getTotalCount() && i + 1 >= userStory.getCurrentPosition() + userStory.getStories().size() && userStory.getHasMoreAfter()) {
            if (userStory.getStories().size() + ((int) userStory.getCurrentPosition()) < list.size()) {
                if (((C54822LfO) ListProtector.get(list, userStory.getStories().size() + ((int) userStory.getCurrentPosition()))).LJLILLLLZI == EnumC54821LfN.UNLOADING) {
                    Dv0(userStory.getMaxCursor(), uid, false);
                }
            }
        }
        if (userStory.getCurrentPosition() == 0 || i - 1 > userStory.getCurrentPosition() || !userStory.getHasMoreBefore() || ((int) userStory.getCurrentPosition()) - 1 >= list.size() || ((C54822LfO) ListProtector.get(list, ((int) userStory.getCurrentPosition()) - 1)).LJLILLLLZI != EnumC54821LfN.UNLOADING) {
            return;
        }
        Dv0(userStory.getMinCursor(), uid, true);
    }

    public final int mv0(String uid, String aid) {
        UserStory userStory;
        Aweme aweme;
        List<Aweme> stories;
        List<Aweme> stories2;
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(aid, "aid");
        Aweme aweme2 = (Aweme) ((LinkedHashMap) this.LJLLILLLL).get(uid);
        if (aweme2 == null || (userStory = aweme2.getUserStory()) == null) {
            return -1;
        }
        List list = (List) ((LinkedHashMap) this.LJLLJ).get(uid);
        if (list == null) {
            list = new ArrayList();
        }
        Iterator<Aweme> it = userStory.getStories().iterator();
        int i = 0;
        while (true) {
            aweme = null;
            if (it.hasNext()) {
                Aweme next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    if (TextUtils.equals(next.getAid(), aid)) {
                        break;
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            int i3 = 0;
            for (Aweme aweme3 : nv0()) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    Aweme aweme4 = aweme3;
                    if (TextUtils.equals(aweme4.getAid(), aid)) {
                        if (C54838Lfe.LJIILL(aweme4)) {
                            C43921HLp c43921HLp = C43921HLp.LIZ;
                            String scheduleId = aweme4.getScheduleId();
                            o.LJIIIIZZ(scheduleId, "it.scheduleId");
                            c43921HLp.getClass();
                            C43921HLp.LJJIFFI(scheduleId);
                        }
                        C43921HLp c43921HLp2 = C43921HLp.LIZ;
                        String scheduleId2 = aweme4.getScheduleId();
                        o.LJIIIIZZ(scheduleId2, "it.scheduleId");
                        c43921HLp2.LJIIJ(scheduleId2, false);
                        userStory.setTotalCount(userStory.getTotalCount() - 1);
                        return i3;
                    }
                    i3 = i4;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            userStory.setTotalCount(userStory.getTotalCount() - 1);
            return i;
        }
        if (i < userStory.getStories().size()) {
            ListProtector.remove(userStory.getStories(), i);
            userStory.setOriginTotalCount(userStory.getOriginTotalCount() - 1);
        }
        userStory.setTotalCount(userStory.getTotalCount() - 1);
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C54822LfO c54822LfO = (C54822LfO) it2.next();
            if (TextUtils.equals(aid, c54822LfO.LJLIL)) {
                list.remove(c54822LfO);
                break;
            }
        }
        if (Cv0()) {
            new MineUserStoryFetcher(0);
            Aweme LIZ = MineUserStoryFetcher.LIZ();
            UserStory userStory2 = LIZ.getUserStory();
            if (userStory2 != null && (stories = userStory2.getStories()) != null) {
                Iterator<Aweme> it3 = stories.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Aweme next2 = it3.next();
                    if (o.LJ(next2.getAid(), aid)) {
                        if (next2 != null) {
                            UserStory userStory3 = LIZ.getUserStory();
                            if (userStory3 != null && (stories2 = userStory3.getStories()) != null) {
                                stories2.remove(next2);
                            }
                            UserStory userStory4 = LIZ.getUserStory();
                            if (userStory4 == null) {
                                return i;
                            }
                            userStory4.getStories().remove(next2);
                            userStory4.setTotalCount(userStory4.getTotalCount() - 1);
                            C1E2.LIZJ(new AqS175S0100000_9(userStory4, 608));
                            return i;
                        }
                    }
                }
            }
            Iterator<Aweme> it4 = C55723Ltv.LIZIZ.LJIILJJIL().LIZJ().iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Aweme next3 = it4.next();
                if (o.LJ(next3.getAid(), aid)) {
                    aweme = next3;
                    break;
                }
            }
            Aweme aweme5 = aweme;
            if (aweme5 == null) {
                return i;
            }
            InterfaceC54401LWr LJIILJJIL = C55723Ltv.LIZIZ.LJIILJJIL();
            String scheduleId3 = aweme5.getScheduleId();
            o.LJIIIIZZ(scheduleId3, "it.scheduleId");
            LJIILJJIL.LJIIJ(scheduleId3, true);
            UserStory userStory5 = LIZ.getUserStory();
            if (userStory5 == null) {
                return i;
            }
            userStory5.setTotalCount(userStory5.getTotalCount() - 1);
            C1E2.LIZJ(new AqS175S0100000_9(userStory5, 609));
            return i;
        }
        C1E2.LIZJ(new AqS175S0100000_9(userStory, 286));
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int ov0(java.lang.String r13, java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> r14) {
        /*
            r12 = this;
            java.lang.String r0 = "uid"
            kotlin.jvm.internal.o.LJIIIZ(r13, r0)
            java.lang.String r0 = "currentList"
            kotlin.jvm.internal.o.LJIIIZ(r14, r0)
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r12.LJLLILLLL
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r13)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            r8 = 0
            if (r0 == 0) goto L1d
            com.ss.android.ugc.aweme.feed.model.story.UserStory r5 = r0.getUserStory()
            if (r5 != 0) goto L1e
        L1d:
            return r8
        L1e:
            java.lang.String r1 = "story_widget_extension_large"
            java.lang.String r0 = r12.LJLJLLL
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            r4 = 1
            if (r0 != 0) goto L33
            java.lang.String r1 = "story_widget_extension_small"
            java.lang.String r0 = r12.LJLJLLL
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L40
        L33:
            long r2 = r5.getCurrentPosition()
        L37:
            int r1 = (int) r2
        L38:
            boolean r0 = r14.isEmpty()
            r7 = -1
            if (r0 == 0) goto L5e
            return r7
        L40:
            boolean r0 = r5.getShouldStartFromUnViewedStoryIdx()
            if (r0 == 0) goto L4e
            r5.setShouldStartFromUnViewedStoryIdx(r8)
            int r1 = r5.getFirstUnViewedStoryIdx()
            goto L38
        L4e:
            java.lang.Integer r0 = com.ss.android.ugc.aweme.feed.model.story.UserStoryKt.currentIndex(r5)
            if (r0 == 0) goto L59
            int r1 = r0.intValue()
            goto L38
        L59:
            long r2 = r5.getCurrentPosition()
            goto L37
        L5e:
            r6 = 0
            if (r1 >= 0) goto Lb7
            java.lang.Object r9 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r14, r8)
            r1 = 0
        L66:
            boolean r0 = r12.Gv0(r13)
            if (r0 == 0) goto L94
            java.util.List r0 = r12.nv0()
            int r0 = r0.size()
            if (r0 <= 0) goto L94
            int r8 = r14.size()
            int r8 = r8 - r4
        L7b:
            if (r7 >= r8) goto L94
            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r14, r8)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.ss.android.ugc.aweme.feed.model.Aweme) r2
            com.ss.android.ugc.aweme.feed.model.story.Story r0 = r2.getStory()
            if (r0 == 0) goto La3
            boolean r0 = r0.isPublishing()
            if (r0 != r4) goto La3
        L8f:
            java.lang.Object r9 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r14, r8)
            r1 = r8
        L94:
            X.LfL r0 = r12.LJLLL
            if (r1 >= 0) goto L9e
        L98:
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = (com.ss.android.ugc.aweme.feed.model.Aweme) r9
            X.C54819LfL.LIZJ(r0, r13, r5, r6, r9)
            return r1
        L9e:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            goto L98
        La3:
            long r10 = r2.getCreateTime()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r0
            long r10 = r10 * r2
            long r2 = r5.getLastStoryCreatedAt()
            int r0 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r0 <= 0) goto Lb4
            goto L8f
        Lb4:
            int r8 = r8 + (-1)
            goto L7b
        Lb7:
            int r0 = r14.size()
            if (r4 > r0) goto Lc9
            if (r0 > r1) goto Lc9
            int r1 = r14.size()
            int r1 = r1 - r4
            java.lang.Object r9 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r14, r1)
            goto L66
        Lc9:
            int r0 = r14.size()
            if (r1 >= r0) goto Ld4
            java.lang.Object r9 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r14, r1)
            goto L66
        Ld4:
            r9 = r6
            r1 = -1
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel.ov0(java.lang.String, java.util.List):int");
    }

    public final void rv0(String str, UserStory userStory) {
        if (Gv0(str)) {
            userStory.setTotalCount((userStory.getOriginTotalCount() + nv0().size()) - C43921HLp.LIZ.LJ(userStory));
            sv0(str);
        }
    }

    public final void Dv0(long j, String str, boolean z) {
        UserStory userStory;
        long currentPosition;
        long currentPosition2;
        Aweme aweme = (Aweme) ((LinkedHashMap) this.LJLLILLLL).get(str);
        if (aweme != null && (userStory = aweme.getUserStory()) != null) {
            List<C54822LfO> list = (List) ((LinkedHashMap) this.LJLLJ).get(str);
            if (list == null) {
                list = sv0(str);
            }
            if (z) {
                if (userStory.getCurrentPosition() < 5) {
                    currentPosition2 = 0;
                } else {
                    currentPosition2 = (userStory.getCurrentPosition() + 1) - 5;
                }
                int currentPosition3 = (int) userStory.getCurrentPosition();
                for (int i = (int) currentPosition2; i < currentPosition3; i++) {
                    if (i < list.size()) {
                        ListProtector.set(list, i, new C54822LfO("", EnumC54821LfN.LOADING));
                    }
                }
            } else {
                long j2 = 5;
                if (userStory.getCurrentPosition() + userStory.getStories().size() + j2 >= userStory.getTotalCount()) {
                    currentPosition = userStory.getTotalCount();
                } else {
                    currentPosition = userStory.getCurrentPosition() + userStory.getStories().size() + j2;
                }
                int i2 = (int) currentPosition;
                for (int size = userStory.getStories().size() + ((int) userStory.getCurrentPosition()); size < i2; size++) {
                    if (size < list.size() && ((C54822LfO) ListProtector.get(list, size)).LJLILLLLZI == EnumC54821LfN.UNLOADING) {
                        C54822LfO c54822LfO = (C54822LfO) ListProtector.get(list, size);
                        EnumC54821LfN enumC54821LfN = EnumC54821LfN.LOADING;
                        c54822LfO.getClass();
                        o.LJIIIZ(enumC54821LfN, "<set-?>");
                        c54822LfO.LJLILLLLZI = enumC54821LfN;
                    }
                }
            }
        }
        C78999UzT.LJFF(StoryApi.LIZIZ.getUserStory(str, j, z, 5).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new C54820LfM(this, str, z), new AfS23S1100000_9(this, str, 0)), this.LJLLI);
    }
}
