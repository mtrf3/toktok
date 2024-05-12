package X;

import Y.ACListenerS23S0100000_3;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8nQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221968nQ extends AbstractC221978nR {
    public final ViewGroup LJLJLLL;
    public View LJLL;
    public final HashMap<String, Float> LJLLI;
    public final HashMap<String, EnumC221998nT> LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public Aweme LJLLLL;

    @Override // X.AbstractC221978nR
    public final void LJII() {
        StoryFeedViewModel storyFeedViewModel = this.LJLJI;
        if (storyFeedViewModel != null) {
            storyFeedViewModel.iv0("UPLOADING_USER_STORY_PROGRESS", this, false);
            storyFeedViewModel.iv0("UPLOADING_USER_STORY_SUCCESS", this, false);
            storyFeedViewModel.iv0("UPLOADING_USER_STORY_FAIL", this, false);
            storyFeedViewModel.iv0("UPLOADING_LOCAL_VIDEO_READY", this, false);
            storyFeedViewModel.iv0("UPLOADING_USER_STORY_ALL_SUCCESS", this, false);
            this.LJLJLLL.setVisibility(8);
            View LIZ = C7F6.LIZ(C55723Ltv.LIZIZ.LJIIIIZZ(), "story_uploading_progress_bar", LJFF(), R.layout.cpb, null, this.LJLJLLL, true, 8);
            this.LJLL = LIZ;
            if (LIZ != null) {
                C16880lQ.LJJJJI((TuxTextView) LIZ.findViewById(R.id.izm), new ACListenerS23S0100000_3(this, 242));
                View view = this.LJLL;
                if (view != null) {
                    C16880lQ.LJJJ((TuxIconView) view.findViewById(R.id.nke), new ACListenerS23S0100000_3(this, 243));
                    View view2 = this.LJLL;
                    if (view2 != null) {
                        C16880lQ.LJIJ((RelativeLayout) view2.findViewById(R.id.cnz), new ACListenerS23S0100000_3(this, 244));
                        return;
                    } else {
                        o.LJIJI("uploadingBar");
                        throw null;
                    }
                }
                o.LJIJI("uploadingBar");
                throw null;
            }
            o.LJIJI("uploadingBar");
            throw null;
        }
        o.LJIJI("storyFeedVM");
        throw null;
    }

    public C221968nQ(ViewGroup uploadingBarLayout) {
        o.LJIIIZ(uploadingBarLayout, "uploadingBarLayout");
        this.LJLJLLL = uploadingBarLayout;
        this.LJLLI = new HashMap<>();
        this.LJLLILLLL = new HashMap<>();
        this.LJLLL = -1;
    }

    @Override // X.AbstractC221978nR
    public final void LIZ(int i) {
        Aweme item = LIZLLL().getItem(i);
        String str = null;
        if (item != null) {
            C43921HLp c43921HLp = C43921HLp.LIZ;
            String scheduleId = item.getScheduleId();
            if (scheduleId == null) {
                scheduleId = "";
            }
            C221958nP LJI = c43921HLp.LJI(scheduleId);
            if (LJI != null) {
                int i2 = C221938nN.LIZ[LJI.LIZIZ.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        View view = this.LJLL;
                        if (view != null) {
                            view.setVisibility(8);
                        } else {
                            o.LJIJI("uploadingBar");
                            throw null;
                        }
                    } else {
                        View view2 = this.LJLL;
                        if (view2 != null) {
                            C221988nS.LIZ(view2, EnumC221998nT.UPLOAD_FAIL, 0.0f, LJI.LIZJ);
                            String scheduleId2 = item.getScheduleId();
                            Aweme aweme = this.LJLLLL;
                            if (aweme != null) {
                                str = aweme.getScheduleId();
                            }
                            if (!o.LJ(str, scheduleId2)) {
                                c43921HLp.getClass();
                                C222578oP.LJIIJJI(C43921HLp.LJIILL(scheduleId2));
                            }
                        } else {
                            o.LJIJI("uploadingBar");
                            throw null;
                        }
                    }
                } else if (C54838Lfe.LJIILIIL(item) && L1F.LIZIZ()) {
                    View view3 = this.LJLL;
                    if (view3 != null) {
                        C221988nS.LIZ(view3, LJIIIIZZ(LJI.LIZ, item.getScheduleId()), LJI.LIZ, null);
                    } else {
                        o.LJIJI("uploadingBar");
                        throw null;
                    }
                } else {
                    View view4 = this.LJLL;
                    if (view4 != null) {
                        C221988nS.LIZ(view4, EnumC221998nT.UPLOADING, LJI.LIZ, null);
                    } else {
                        o.LJIJI("uploadingBar");
                        throw null;
                    }
                }
            }
        } else {
            item = null;
        }
        this.LJLLLL = item;
    }

    @Override // X.AbstractC221978nR
    public final void LIZIZ(int i) {
        View view = this.LJLL;
        if (view != null) {
            view.setVisibility(8);
            this.LJLLL = i;
        } else {
            o.LJIJI("uploadingBar");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.ss.android.ugc.aweme.feed.model.Aweme] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25 */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        String str;
        Aweme aweme;
        String str2;
        Aweme aweme2;
        UserStoryCurrentInfo currentInfo;
        UserStoryCurrentInfo currentInfo2;
        String authorUid;
        String str3;
        String str4;
        int i;
        C207668Da c207668Da2 = c207668Da;
        Aweme aweme3 = LJ().LJLJL;
        if (aweme3 != null) {
            String str5 = null;
            if (c207668Da2 == null || (str = c207668Da2.LIZ) == null) {
                return;
            }
            switch (str.hashCode()) {
                case -208800987:
                    if (!str.equals("UPLOADING_USER_STORY_ALL_SUCCESS") || C2304092m.LIZ()) {
                        return;
                    }
                    Object obj = c207668Da2.LIZIZ;
                    if (obj == null) {
                        obj = null;
                    }
                    Integer cnt = (Integer) obj;
                    o.LJIIIIZZ(cnt, "cnt");
                    if (cnt.intValue() > 1) {
                        i = R.string.th_;
                    } else {
                        i = R.string.rr5;
                    }
                    C222588oQ c222588oQ = this.LJLJL;
                    if (c222588oQ != null) {
                        C26045AKb c26045AKb = new C26045AKb(c222588oQ.LIZJ);
                        c26045AKb.LJIIIIZZ(i);
                        c26045AKb.LJIIJ();
                        return;
                    }
                    o.LJIJI("params");
                    throw null;
                case 271694622:
                    if (!str.equals("UPLOADING_USER_STORY_FAIL")) {
                        return;
                    }
                    Object obj2 = c207668Da2.LIZIZ;
                    if (obj2 == null) {
                        obj2 = null;
                    }
                    OSZ osz = (OSZ) obj2;
                    String str6 = (String) osz.getFirst();
                    String str7 = (String) osz.getSecond();
                    HashMap<String, EnumC221998nT> hashMap = this.LJLLILLLL;
                    EnumC221998nT enumC221998nT = EnumC221998nT.UPLOAD_FAIL;
                    hashMap.put(str6, enumC221998nT);
                    Aweme item = LIZLLL().getItem(LJI().getCurrentItem());
                    if (!C54838Lfe.LJIILL(item)) {
                        return;
                    }
                    if (item != null) {
                        str3 = item.getScheduleId();
                    } else {
                        str3 = null;
                    }
                    if (!ujb.o.LJJJJIZL(str6, str3, true)) {
                        return;
                    }
                    View view = this.LJLL;
                    if (view != null) {
                        C221988nS.LIZ(view, enumC221998nT, 0.0f, str7);
                        if (item != null) {
                            str4 = item.getScheduleId();
                        } else {
                            str4 = null;
                        }
                        Aweme aweme4 = this.LJLLLL;
                        if (aweme4 != null) {
                            str5 = aweme4.getScheduleId();
                        }
                        if (o.LJ(str5, str4)) {
                            return;
                        }
                        C43921HLp.LIZ.getClass();
                        C222578oP.LJIIJJI(C43921HLp.LJIILL(str4));
                        return;
                    }
                    o.LJIJI("uploadingBar");
                    throw null;
                case 1555587043:
                    if (!str.equals("UPLOADING_USER_STORY_SUCCESS")) {
                        return;
                    }
                    Object obj3 = c207668Da2.LIZIZ;
                    if (obj3 == null) {
                        obj3 = null;
                    }
                    OSZ osz2 = (OSZ) obj3;
                    Object first = osz2.getFirst();
                    Object second = osz2.getSecond();
                    this.LJLLI.put(first, Float.valueOf(1.0f));
                    this.LJLLILLLL.put(first, EnumC221998nT.UPLOAD_SUCCESS);
                    Aweme item2 = LIZLLL().getItem(LJI().getCurrentItem());
                    if (!C54838Lfe.LJIILL(item2) && (item2 == null || (authorUid = item2.getAuthorUid()) == null || !ujb.o.LJJJJIZL(authorUid, AV1.LIZIZ().getUid(), true))) {
                        return;
                    }
                    List<Aweme> Q8 = LIZLLL().Q8();
                    if (!(Q8 instanceof Collection) || !Q8.isEmpty()) {
                        for (Aweme aweme5 : Q8) {
                            if (C54838Lfe.LJIILL(aweme5) && o.LJ(aweme5.getScheduleId(), first)) {
                                ArrayList arrayList = new ArrayList(C32I.LJJL(Q8, 10));
                                for (Aweme aweme6 : Q8) {
                                    if (C54838Lfe.LJIILL(aweme6) && o.LJ(aweme6.getScheduleId(), first)) {
                                        aweme6 = second;
                                    }
                                    arrayList.add(aweme6);
                                }
                                LIZLLL().setData(arrayList);
                                LJ().LIZLLL(LJI().getCurrentItem(), false);
                                LJ().LJ(EnumC222138nh.ON_PUBLISH_SUCCESS, null);
                                return;
                            }
                        }
                    }
                    LJ().LJI();
                    return;
                case 2005298957:
                    if (!str.equals("UPLOADING_LOCAL_VIDEO_READY")) {
                        return;
                    }
                    Object obj4 = c207668Da2.LIZIZ;
                    if (obj4 == null) {
                        obj4 = null;
                    }
                    String str8 = (String) obj4;
                    int currentItem = LJI().getCurrentItem();
                    Aweme item3 = LIZLLL().getItem(currentItem);
                    if (!C54838Lfe.LJIILL(item3)) {
                        return;
                    }
                    if (item3 != null) {
                        str5 = item3.getScheduleId();
                    }
                    if (!ujb.o.LJJJJIZL(str8, str5, true)) {
                        return;
                    }
                    C2MA c2ma = LJ().LJLILLLLZI;
                    if (c2ma != null) {
                        c2ma.LLLZ(this.LJLLL, item3);
                    }
                    AbstractC222628oU LJ = LJ();
                    EnumC222138nh enumC222138nh = EnumC222138nh.ON_PAGE_SELECTED;
                    o.LJI(item3);
                    LJ.LJ(enumC222138nh, new C70012ov(item3, LJ().LJLJJL, currentItem, LIZLLL().getCount(), false, (Aweme) null, 96));
                    return;
                case 2025168429:
                    if (!str.equals("UPLOADING_USER_STORY_PROGRESS")) {
                        return;
                    }
                    Object obj5 = c207668Da2.LIZIZ;
                    if (obj5 == null) {
                        obj5 = null;
                    }
                    OSZ osz3 = (OSZ) obj5;
                    String str9 = (String) osz3.getFirst();
                    float floatValue = ((Number) osz3.getSecond()).floatValue();
                    this.LJLLI.put(str9, Float.valueOf(floatValue));
                    UserStory userStory = aweme3.getUserStory();
                    if (userStory != null && (currentInfo2 = userStory.getCurrentInfo()) != null) {
                        aweme = currentInfo2.getCurrentStory();
                    } else {
                        aweme = null;
                    }
                    if (C54838Lfe.LJIILIIL(aweme) && L1F.LIZIZ()) {
                        this.LJLLILLLL.put(str9, LJIIIIZZ(floatValue, str9));
                    } else {
                        this.LJLLILLLL.put(str9, EnumC221998nT.UPLOADING);
                    }
                    Aweme item4 = LIZLLL().getItem(LJI().getCurrentItem());
                    if (!C54838Lfe.LJIILL(item4)) {
                        return;
                    }
                    if (item4 != null) {
                        str2 = item4.getScheduleId();
                    } else {
                        str2 = null;
                    }
                    if (!ujb.o.LJJJJIZL(str9, str2, true)) {
                        return;
                    }
                    UserStory userStory2 = aweme3.getUserStory();
                    if (userStory2 != null && (currentInfo = userStory2.getCurrentInfo()) != null) {
                        aweme2 = currentInfo.getCurrentStory();
                    } else {
                        aweme2 = null;
                    }
                    if (C54838Lfe.LJIILIIL(aweme2) && L1F.LIZIZ()) {
                        View view2 = this.LJLL;
                        if (view2 != null) {
                            C221988nS.LIZ(view2, LJIIIIZZ(floatValue, str9), floatValue, null);
                            return;
                        } else {
                            o.LJIJI("uploadingBar");
                            throw null;
                        }
                    }
                    View view3 = this.LJLL;
                    if (view3 != null) {
                        C221988nS.LIZ(view3, EnumC221998nT.UPLOADING, floatValue, null);
                        return;
                    } else {
                        o.LJIJI("uploadingBar");
                        throw null;
                    }
                default:
                    return;
            }
        }
    }

    public static final EnumC221998nT LJIIIIZZ(float f, String str) {
        if (f >= 0.96f || str == null || !(!C41825GbF.LIZLLL.contains(str))) {
            return EnumC221998nT.ADDING_TO_STORY_NO_EDIT;
        }
        return EnumC221998nT.ADDING_TO_STORY;
    }

    @Override // X.AbstractC221978nR
    public final void LIZJ(int i, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        if (this.LJLJI != null) {
            StoryFeedViewModel.pv0(aweme);
            this.LJLLJ = i;
        } else {
            o.LJIJI("storyFeedVM");
            throw null;
        }
    }
}
