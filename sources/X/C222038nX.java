package X;

import Y.ARunnableS39S0100000_3;
import Y.IDaS214S0100000_3;
import Y.IDiS267S0100000_3;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel;
import com.ss.android.ugc.aweme.story.feed.common.StoryVideoViewHolder;
import com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility;
import com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS93S0101000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8nX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C222038nX extends AbstractC222628oU implements Observer<C207668Da> {
    public final ViewGroup LJLLL;
    public final InterfaceC55100Ljs LJLLLL;
    public final Context LJLLLLLL;
    public final View LJLZ;
    public final C210118Ml LJZ;
    public final M89 LJZI;
    public InterfaceC209288Jg LJZL;
    public boolean LL;
    public int LLD;
    public final C1UE LLF;
    public final C62822Ol8 LLFF;
    public final C62822Ol8 LLFFF;
    public boolean LLFII;
    public final C222118nf LLFZ;
    public final C222928oy LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public boolean LLII;
    public final boolean LLIIII;
    public final CopyOnWriteArrayList<Aweme> LLIIIILZ;
    public C222218np LLIIIJ;

    @Override // X.AbstractC222628oU
    public final int LIZ() {
        return this.LLI.getCount();
    }

    @Override // X.AbstractC222628oU
    public final int LIZIZ() {
        return (this.LLI.getCount() - 1) - LJIIJJI().getCurrentItem();
    }

    @Override // X.AbstractC222628oU
    public final void LJI() {
        LJIIIIZZ(this.LJLJJL, this.LJLJL);
    }

    public final void LJIIIZ() {
        int i;
        List<Aweme> stories;
        Iterator<Aweme> it = this.LLIIIILZ.iterator();
        while (it.hasNext()) {
            Aweme normalPost = it.next();
            EnumC222138nh enumC222138nh = EnumC222138nh.DELETE_ITEM;
            o.LJIIIIZZ(normalPost, "normalPost");
            UserStory userStory = this.LJLJLJ;
            if (userStory != null && (stories = userStory.getStories()) != null) {
                i = stories.indexOf(normalPost);
            } else {
                i = -1;
            }
            LJ(enumC222138nh, new C56992Ln(i, normalPost));
        }
        this.LLIIIILZ.clear();
    }

    public final C222108ne LJIIJJI() {
        return (C222108ne) this.LLIFFJFJJ.getValue();
    }

    public final StoryFeedViewModel LJIIL() {
        return (StoryFeedViewModel) this.LLFFF.getValue();
    }

    @Override // X.InterfaceC222698ob
    public final C2MA Y6() {
        if (LJII(LJIIJJI().getCurrentItem(), this.LJLILLLLZI)) {
            return this.LJLILLLLZI;
        }
        for (int childCount = LJIIJJI().getChildCount() - 1; -1 < childCount; childCount--) {
            Object tag = LJIIJJI().getChildAt(childCount).getTag(R.id.d87);
            o.LJII(tag, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder");
            C2MA c2ma = (C2MA) tag;
            if (LJII(LJIIJJI().getCurrentItem(), c2ma)) {
                UserStory userStory = this.LJLJLJ;
                if (userStory != null) {
                    int currentItem = LJIIJJI().getCurrentItem();
                    C54819LfL.LIZJ(LJIIL().LJLLL, this.LJLL, userStory, Integer.valueOf(currentItem), this.LLI.getItem(currentItem));
                }
                return c2ma;
            }
        }
        return null;
    }

    @Override // X.InterfaceC222698ob
    public final void onDestroyView() {
        C42625Go9.LIZJ(this);
        LJIIIZ();
        LJFF("story_collection_play_end");
        for (int childCount = LJIIJJI().getChildCount() - 1; -1 < childCount; childCount--) {
            Object tag = LJIIJJI().getChildAt(childCount).getTag(R.id.d87);
            o.LJII(tag, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder");
            ((C2MA) tag).onDestroyView();
        }
        ((C73318Sq2) this.LLFF.getValue()).LIZLLL();
        InterfaceC55057LjB LIZIZ = C40443Fu3.LIZIZ("story_horizontally_viewpager");
        if (LIZIZ != null) {
            LIZIZ.LIZIZ();
        }
    }

    @Override // X.InterfaceC222698ob
    public final void unBind() {
        C42625Go9.LIZJ(this);
        this.LJLJL = null;
        InterfaceC209288Jg interfaceC209288Jg = this.LJZL;
        if (interfaceC209288Jg != null) {
            interfaceC209288Jg.LIZIZ();
        }
        this.LJLILLLLZI = null;
        this.LLI.setData(C61878OQg.INSTANCE);
    }

    @Override // X.InterfaceC222698ob
    public final void onPagePause() {
        LJIIIZ();
    }

    @Override // X.InterfaceC222698ob
    public final void HM(EnumC215438ct mode) {
        Story story;
        o.LJIIIZ(mode, "mode");
        Aweme item = this.LLI.getItem(LJIIJJI().getCurrentItem());
        if (item != null && (story = item.getStory()) != null && story.isPublishing()) {
            EnumC215438ct enumC215438ct = EnumC215438ct.LOOP_CURRENT_VIDEO;
            o.LJIIIZ(enumC215438ct, "<set-?>");
            this.LJLJI = enumC215438ct;
            return;
        }
        this.LJLJI = mode;
    }

    public final void LJIIJ(Aweme aweme) {
        if (this.LLFII && LIZIZ() == 0 && !TextUtils.equals("story_archive", LJIIL().LJLJLLL)) {
            C54819LfL c54819LfL = LJIIL().LJLLL;
            String authorUid = aweme.getAuthorUid();
            UserStory userStory = aweme.getUserStory();
            c54819LfL.getClass();
            C54819LfL.LIZ(authorUid, userStory);
        }
    }

    public final void LJIILIIL(UserStoryCurrentInfo userStoryCurrentInfo) {
        Integer num;
        List<Aweme> qv0 = LJIIL().qv0(this.LJLL);
        if (qv0 != null) {
            int currentItem = LJIIJJI().getCurrentItem();
            this.LLI.setData(qv0);
            ArrayList arrayList = (ArrayList) qv0;
            this.LJZ.LJ(arrayList.size());
            if (arrayList.size() == 0) {
                return;
            }
            if (userStoryCurrentInfo != null) {
                num = userStoryCurrentInfo.getCurrentIndex();
            } else {
                num = null;
            }
            if (num == null) {
                if (currentItem < arrayList.size() && currentItem >= 0) {
                    LJIIJJI().setCurrentItem(currentItem, false);
                } else {
                    currentItem = arrayList.size() - 1;
                    LJIIJJI().setCurrentItem(currentItem, false);
                }
            } else {
                Integer currentIndex = userStoryCurrentInfo.getCurrentIndex();
                if (currentIndex != null) {
                    currentItem = currentIndex.intValue();
                } else {
                    currentItem = 0;
                }
                if (currentItem < arrayList.size() && currentItem >= 0) {
                    LJIIJJI().setCurrentItem(currentItem, false);
                } else {
                    currentItem = arrayList.size() - 1;
                    LJIIJJI().setCurrentItem(currentItem, false);
                }
            }
            C54819LfL.LIZJ(LJIIL().LJLLL, this.LJLL, this.LJLJLJ, Integer.valueOf(currentItem), (Aweme) ListProtector.get(qv0, currentItem));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [X.0C3, X.8np] */
    @Override // X.AbstractC222628oU, X.InterfaceC222698ob
    public final void Qg0(int i) {
        C222588oQ c222588oQ;
        this.LL = true;
        C222108ne LJIIJJI = LJIIJJI();
        if (LJIIJJI != 0) {
            final InterfaceC55057LjB LIZ = C40443Fu3.LIZ("story_horizontally_viewpager");
            LIZ.LJI(this.LLFZ);
            C222248ns.LIZ = "story_horizontally_viewpager";
            ?? r0 = new C1CZ() { // from class: X.8np
                @Override // X.C1CZ, X.C0C3
                public final void onPageScrollStateChanged(int i2) {
                    if (i2 != 0) {
                        if (i2 != 1) {
                            InterfaceC55057LjB.this.start();
                            return;
                        } else {
                            InterfaceC55057LjB.this.start();
                            return;
                        }
                    }
                    InterfaceC55057LjB.this.stop();
                }
            };
            this.LLIIIJ = r0;
            LJIIJJI.LJFF(r0);
        }
        this.LLFII = true;
        this.LJLLILLLL.clear();
        if (this.LLIIII && (c222588oQ = this.LJLIL) != null && c222588oQ.LJIILJJIL == 13 && (C215178cT.LJIL(this.LJZI) || C215178cT.LJIJJLI(this.LJZI))) {
            if (this.LJZL == null) {
                CommentService LJJL = CommentServiceImpl.LJJL();
                C79T c79t = new C79T(this.LJLLL, this.LJLIL.LIZJ);
                C222588oQ c222588oQ2 = this.LJLIL;
                c79t.LIZJ = c222588oQ2.LJIIIZ;
                c79t.LIZLLL = Integer.valueOf(c222588oQ2.LJIIJ);
                this.LJZL = LJJL.LJJJJLI(c79t.LIZ());
            }
            InterfaceC209288Jg interfaceC209288Jg = this.LJZL;
            if (interfaceC209288Jg != null) {
                interfaceC209288Jg.LJJII();
            }
        }
        this.LJZ.LJ(this.LLI.getCount());
        LIZLLL(LJIIJJI().getCurrentItem(), false);
        LJFF("story_collection_play");
        C1UE c1ue = this.LLF;
        Aweme aweme = this.LJLJL;
        c1ue.getClass();
        if (C1UE.LIZIZ(aweme)) {
            C78999UzT.LJFF(AbstractC73547Stj.LJIILJJIL(1000L, TimeUnit.MILLISECONDS).LJIILIIL(T16.LIZ()).LJII(C73969T1h.LIZIZ()).LJIIIZ(new IDaS214S0100000_3(this, 5)), (C73318Sq2) this.LLFF.getValue());
        }
        super.Qg0(i);
    }

    @Override // X.AbstractC222628oU, X.InterfaceC222698ob
    public final void Zo(boolean z) {
        int ov0;
        this.LL = false;
        LJIIJJI().LJJIIJ(this.LLIIIJ);
        InterfaceC55057LjB LIZIZ = C40443Fu3.LIZIZ("story_horizontally_viewpager");
        if (LIZIZ != null) {
            LIZIZ.LIZIZ();
        }
        this.LLFII = false;
        LJFF("story_collection_play_end");
        if (LJIIL().Ev0(this.LJLL) && (ov0 = LJIIL().ov0(this.LJLL, this.LLI.Q8())) >= 0) {
            LJIIJJI().setCurrentItem(ov0, false);
        }
        InterfaceC209288Jg interfaceC209288Jg = this.LJZL;
        if (interfaceC209288Jg != null) {
            interfaceC209288Jg.LJJIIZ();
        }
        LJIIIZ();
        super.Zo(z);
    }

    @Override // X.InterfaceC222698ob
    public final C2MA getViewHolderByAwemeId(String str) {
        if (str == null) {
            return null;
        }
        int childCount = LJIIJJI().getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object tag = LJIIJJI().getChildAt(i).getTag(R.id.d87);
            o.LJII(tag, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder");
            C2MA c2ma = (C2MA) tag;
            if (c2ma.O1() != null && TextUtils.equals(c2ma.O1().getAid(), str)) {
                return c2ma;
            }
        }
        return null;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        String str;
        int currentItem;
        UserStoryCurrentInfo currentInfo;
        Integer currentIndex;
        DataCenter dataCenter;
        C207668Da c207668Da2 = c207668Da;
        Aweme aweme = this.LJLJL;
        if (aweme != null) {
            Object obj = null;
            if (c207668Da2 != null && (str = c207668Da2.LIZ) != null) {
                int hashCode = str.hashCode();
                if (hashCode != 291667849) {
                    if (hashCode != 1211050238 || !str.equals("LOAD_USER_STORY_SUCCESS")) {
                        return;
                    }
                    Object obj2 = c207668Da2.LIZIZ;
                    if (obj2 != null) {
                        obj = obj2;
                    }
                    UserStory curUserStory = (UserStory) obj;
                    if (!o.LJ(aweme.getUserStory(), curUserStory)) {
                        return;
                    }
                    this.LJLJLJ = curUserStory;
                    o.LJIIIIZZ(curUserStory, "curUserStory");
                    if (C54838Lfe.LJIIJ(curUserStory, !LJIIL().uv0())) {
                        LJ(EnumC222138nh.ON_DELETE_COLLECTION, new C56122Ie(this.LJLJJL));
                        return;
                    }
                    LJIILIIL(curUserStory.getCurrentInfo());
                    if (this.LLFII) {
                        LIZLLL(LJIIJJI().getCurrentItem(), true);
                    } else {
                        LIZLLL(LJIIJJI().getCurrentItem(), false);
                    }
                    LJIIJ(aweme);
                    Aweme item = this.LLI.getItem(LJIIJJI().getCurrentItem());
                    if (item != null && (dataCenter = this.LJLLJ) != null) {
                        dataCenter.jv0(new C56992Ln(LJIIJJI().getCurrentItem(), item), "ON_STORY_DATA_CHANGED");
                    }
                    LJIIL().Hv0(LJIIJJI().getCurrentItem(), this.LJLL);
                    return;
                }
                if (!str.equals("ON_CURRENT_INFO_CHANGED")) {
                    return;
                }
                Object obj3 = c207668Da2.LIZIZ;
                if (obj3 != null) {
                    obj = obj3;
                }
                UserStory userStory = (UserStory) obj;
                if (!o.LJ(aweme.getUserStory(), userStory)) {
                    return;
                }
                this.LJLJLJ = userStory;
                C222108ne LJIIJJI = LJIIJJI();
                if (userStory != null && (currentInfo = userStory.getCurrentInfo()) != null && (currentIndex = currentInfo.getCurrentIndex()) != null) {
                    currentItem = currentIndex.intValue();
                } else {
                    currentItem = LJIIJJI().getCurrentItem();
                }
                LJIIJJI.setCurrentItem(currentItem);
                LJIIL().Hv0(LJIIJJI().getCurrentItem(), this.LJLL);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
        StoryVideoViewHolder storyVideoViewHolder;
        IDetailBaseAbility LIZ;
        String aid;
        StoryVideoViewHolder storyVideoViewHolder2;
        String aid2;
        this.LJZ.LIZLLL(1.0f, LJIIJJI().getCurrentItem(), 300L);
        if (LJIIJJI().getCurrentItem() == this.LLI.getCount() - 1) {
            LJFF("story_collection_play_finish");
        }
        IAutoAScrollAbility LIZ2 = C224888s8.LIZ(null);
        if (LIZ2 != null) {
            LIZ2.yh(LJIIJJI().getCurrentItem(), this.LLI.getCount());
        }
        int count = this.LLI.getCount();
        if (count <= 0) {
            return;
        }
        int i = C215458cv.LIZ[this.LJLJI.ordinal()];
        if (i != 1) {
            String str2 = CardStruct.IStatusCode.DEFAULT;
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    if (LJIIJJI().getCurrentItem() + 1 >= count) {
                        if (LJIIL().wv0()) {
                            String str3 = this.LJLJLLL;
                            o.LJI(str3);
                            Aweme aweme = (Aweme) ORZ.LLFII(this.LLI.LJJIL());
                            if (aweme != null && (aid2 = aweme.getAid()) != null) {
                                str2 = aid2;
                            }
                            C222578oP.LJIILLIIL(str3, "auto", str2);
                        }
                        ActivityC45651qj mo49getActivity = this.LJLIL.LIZJ.mo49getActivity();
                        if (mo49getActivity == null) {
                            return;
                        }
                        mo49getActivity.finish();
                        return;
                    }
                    LJIIJJI().setCurrentItem(LJIIJJI().getCurrentItem() + 1, false);
                    return;
                }
                C222578oP.LIZ = "auto";
                if (LJIIJJI().getCurrentItem() + 1 < count) {
                    LJIIJJI().setCurrentItem(LJIIJJI().getCurrentItem() + 1, false);
                } else {
                    LJIIJJI().setCurrentItem(0, false);
                }
                if (count != 1) {
                    return;
                }
                C2MA Y6 = Y6();
                if (!(Y6 instanceof StoryVideoViewHolder) || (storyVideoViewHolder2 = (StoryVideoViewHolder) Y6) == null) {
                    return;
                }
                C222188nm.LIZ(storyVideoViewHolder2.LJLLL, new AqS169S0100000_3(storyVideoViewHolder2, 653));
                return;
            }
            C222578oP.LIZ = "auto";
            if (LJIIJJI().getCurrentItem() + 1 < count) {
                LJIIJJI().setCurrentItem(LJIIJJI().getCurrentItem() + 1, false);
                return;
            }
            if (LJIIL().vv0() && ((LIZ = KQ3.LIZ(this.LJLIL.LIZJ)) == null || !LIZ.hasNextItem(this.LJLJJL))) {
                String eventType = LJIIL().LJLJLJ.getEventType();
                o.LJI(eventType);
                Aweme aweme2 = (Aweme) ORZ.LLFII(this.LLI.LJJIL());
                if (aweme2 != null && (aid = aweme2.getAid()) != null) {
                    str2 = aid;
                }
                C222578oP.LJIILLIIL(eventType, "auto", str2);
                ActivityC45651qj mo49getActivity2 = this.LJLIL.LIZJ.mo49getActivity();
                if (mo49getActivity2 == null) {
                    return;
                }
                mo49getActivity2.finish();
                return;
            }
            LJIIJJI().setCurrentItem(0);
            LJ(EnumC222138nh.ON_SHOULD_SCROLL_TO_NEXT_USER, null);
            DataCenter dataCenter = this.LJLLJ;
            if (dataCenter == null) {
                return;
            }
            dataCenter.jv0(null, "on_should_scroll_to_next_user");
            return;
        }
        C2MA Y62 = Y6();
        if (!(Y62 instanceof StoryVideoViewHolder) || (storyVideoViewHolder = (StoryVideoViewHolder) Y62) == null) {
            return;
        }
        C222188nm.LIZ(storyVideoViewHolder.LJLLL, new AqS169S0100000_3(storyVideoViewHolder, 653));
    }

    @QD3
    public final void onPrivateModelEvent(C187227Wk privateModelEvent) {
        UserStory userStory;
        List<Aweme> stories;
        o.LJIIIZ(privateModelEvent, "privateModelEvent");
        Aweme aweme = privateModelEvent.LJLILLLLZI;
        if (aweme != null && (userStory = this.LJLJLJ) != null && (stories = userStory.getStories()) != null) {
            Iterator<Aweme> it = stories.iterator();
            while (it.hasNext()) {
                if (o.LJ(it.next().getAid(), aweme.getAid())) {
                    if (aweme.getIsStoryToNormal()) {
                        this.LLIIIILZ.add(aweme);
                        return;
                    }
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    @Override // X.AbstractC222628oU, X.InterfaceC222698ob
    public final void KJ(int i, String aid) {
        o.LJIIIZ(aid, "aid");
        if (LJIIL().mv0(this.LJLL, aid) < 0) {
            List<Aweme> LJJIL = this.LLI.LJJIL();
            Iterator<Aweme> it = LJJIL.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (o.LJ(it.next().getAid(), aid)) {
                    if (i2 >= 0) {
                        ListProtector.remove(LJJIL, i2);
                    } else {
                        return;
                    }
                } else {
                    i2++;
                }
            }
            return;
        }
        UserStory userStory = this.LJLJLJ;
        if ((userStory != null && C54838Lfe.LJIIJ(userStory, !LJIIL().uv0())) || LJIIL().Cv0()) {
            LJ(EnumC222138nh.ON_DELETE_COLLECTION, new C56122Ie(i));
            return;
        }
        LJIILIIL(null);
        LIZLLL(LJIIJJI().getCurrentItem(), true);
        C2MA Y6 = Y6();
        if (Y6 != null) {
            Y6.B7();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0201, code lost:
    
        if (r1 != null) goto L47;
     */
    @Override // X.AbstractC222628oU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(int r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C222038nX.LIZLLL(int, boolean):void");
    }

    public final boolean LJII(int i, C2MA c2ma) {
        Aweme item;
        Aweme O1;
        if (c2ma == null || (item = this.LLI.getItem(i)) == null || (O1 = c2ma.O1()) == null) {
            return false;
        }
        if (C54838Lfe.LJJ(item)) {
            return TextUtils.equals(item.getAid(), O1.getAid());
        }
        return o.LJ(item.getAid(), O1.getAid());
    }

    public final void LJIIIIZZ(int i, Aweme aweme) {
        if (aweme == null) {
            return;
        }
        this.LLII = true;
        List<Aweme> qv0 = LJIIL().qv0(this.LJLL);
        if (qv0 != null) {
            int ov0 = LJIIL().ov0(this.LJLL, qv0);
            this.LLI.setData(qv0);
            ArrayList arrayList = (ArrayList) qv0;
            if (arrayList.size() > 0 && ov0 >= 0) {
                int currentItem = LJIIJJI().getCurrentItem();
                LJIIJJI().setCurrentItem(ov0);
                if (currentItem == ov0) {
                    LIZLLL(ov0, false);
                }
            }
            this.LJZ.LJ(arrayList.size());
        }
        this.LLII = false;
        LIZJ(new AqS93S0101000_3(i, aweme, 12));
    }

    @Override // X.InterfaceC222698ob
    public final void LLLZ(int i, Aweme aweme) {
        this.LJLILLLLZI = null;
        this.LJLLILLLL.clear();
        UserStory userStory = aweme.getUserStory();
        if (userStory == null) {
            return;
        }
        InterfaceC222068na LJIJ = C55723Ltv.LIZIZ.LJIJ();
        C222588oQ c222588oQ = this.LJLIL;
        HM(LJIJ.LJII(c222588oQ.LJIIIZ, c222588oQ.LJ.param.getFrom()));
        this.LJLJLJ = userStory;
        LJIIL().getClass();
        this.LJLL = StoryFeedViewModel.pv0(aweme);
        LJIIL().Fv0(aweme, this.LJLL);
        this.LJLJL = aweme;
        this.LJLJJL = i;
        LJIIIIZZ(i, aweme);
        C42625Go9.LIZIZ(this);
    }

    @Override // X.InterfaceC222698ob
    public final void r5(int i, int i2) {
        this.LLD = i2;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayProgressChange(String str, long j, long j2) {
        String str2;
        if (j2 == 0) {
            return;
        }
        Aweme item = this.LLI.getItem(LJIIJJI().getCurrentItem());
        if (item != null) {
            str2 = item.getAid();
        } else {
            str2 = null;
        }
        if (!TextUtils.equals(str, str2)) {
            return;
        }
        long j3 = j2 - j;
        if (j3 <= 300) {
            j = j2;
        } else {
            j3 = 300;
        }
        this.LJZ.LIZLLL((float) (j / j2), LJIIJJI().getCurrentItem(), j3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v7, types: [X.8nf] */
    public C222038nX(ViewGroup viewGroup, InterfaceC47667InH listener, final C222588oQ params, ViewGroup viewGroup2, ViewGroup viewGroup3, ViewGroup viewGroup4, InterfaceC55100Ljs interfaceC55100Ljs, AqS169S0100000_3 aqS169S0100000_3) {
        super(viewGroup, listener, params);
        o.LJIIIZ(listener, "listener");
        o.LJIIIZ(params, "params");
        this.LJLLL = viewGroup4;
        this.LJLLLL = interfaceC55100Ljs;
        Context context = viewGroup.getContext();
        this.LJLLLLLL = context;
        C55723Ltv c55723Ltv = C55723Ltv.LIZIZ;
        View LIZJ = c55723Ltv.LJIIIIZZ().LIZJ("story_layout_feed_list_player_view", context, R.layout.cok, null, viewGroup, true);
        this.LJLZ = LIZJ;
        M89 m89 = params.LJ.param;
        this.LJZI = m89;
        this.LLF = new C1UE(3);
        this.LLFF = C221108m2.LIZIZ(C222238nr.LJLIL);
        this.LLFFF = C221108m2.LIZIZ(new AqS153S0100000_3(params, 1474));
        this.LLFZ = new PRT() { // from class: X.8nf
            @Override // X.PRT
            public final void onStop(String type) {
                o.LJIIIZ(type, "type");
            }

            @Override // X.PRT
            public final void LIZIZ(String type) {
                o.LJIIIZ(type, "type");
                InterfaceC55057LjB LIZIZ = C40443Fu3.LIZIZ(type);
                if (LIZIZ == null) {
                    return;
                }
                String str = C222038nX.this.LJLJLLL;
                o.LJI(str);
                LIZIZ.LIZ("enter_from", str);
            }
        };
        InterfaceC72642tA interfaceC72642tA = new InterfaceC72642tA() { // from class: X.8nZ
            @Override // X.InterfaceC72642tA
            public final void onInternalEvent(Object obj) {
                C57432Nf c57432Nf;
                C2TO c2to;
                C210108Mk c210108Mk;
                C222228nq c222228nq;
                DataCenter dataCenter;
                DataCenter dataCenter2;
                int i;
                DataCenter dataCenter3;
                DataCenter dataCenter4;
                C50420Jqa c50420Jqa = (C50420Jqa) obj;
                if (c50420Jqa.LJLIL == 60) {
                    Object obj2 = c50420Jqa.LJLILLLLZI;
                    String str = null;
                    if (!(obj2 instanceof C57432Nf) || (c57432Nf = (C57432Nf) obj2) == null) {
                        return;
                    }
                    int i2 = C222148ni.LIZ[c57432Nf.LIZ.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 != 5) {
                                        return;
                                    }
                                    int currentItem = C222038nX.this.LJIIJJI().getCurrentItem() + 1;
                                    UserStory userStory = C222038nX.this.LJLJLJ;
                                    if (userStory != null) {
                                        i = (int) userStory.getTotalCount();
                                    } else {
                                        i = 0;
                                    }
                                    if (currentItem >= i && (dataCenter4 = C222038nX.this.LJLLJ) != null) {
                                        dataCenter4.jv0(null, "on_story_play_complete_first_time");
                                    }
                                    if (!C61052aT.LIZ() || (dataCenter3 = C222038nX.this.LJLLJ) == null) {
                                        return;
                                    }
                                    dataCenter3.jv0(null, "on_story_slide_play_complete_first_time");
                                    return;
                                }
                                if (C222038nX.this.LJIIJJI().getCurrentItem() != 0 || (dataCenter2 = C222038nX.this.LJLLJ) == null) {
                                    return;
                                }
                                dataCenter2.jv0(null, "on_story_render_first_frame");
                                return;
                            }
                            C2K7 c2k7 = c57432Nf.LIZIZ;
                            if (!(c2k7 instanceof C222228nq) || (c222228nq = (C222228nq) c2k7) == null || (dataCenter = C222038nX.this.LJLLJ) == null) {
                                return;
                            }
                            dataCenter.jv0(null, c222228nq.LJLIL);
                            return;
                        }
                        C2K7 c2k72 = c57432Nf.LIZIZ;
                        if (!(c2k72 instanceof C210108Mk) || (c210108Mk = (C210108Mk) c2k72) == null) {
                            return;
                        }
                        C222038nX.this.onPlayProgressChange(c210108Mk.LJLIL, c210108Mk.LJLILLLLZI, c210108Mk.LJLJI);
                        DataCenter dataCenter5 = C222038nX.this.LJLLJ;
                        if (dataCenter5 == null) {
                            return;
                        }
                        dataCenter5.jv0(c210108Mk, "on_story_play_progress_changed");
                        return;
                    }
                    C2K7 c2k73 = c57432Nf.LIZIZ;
                    if (c2k73 instanceof C2TO) {
                        c2to = (C2TO) c2k73;
                    } else {
                        c2to = null;
                    }
                    C222038nX c222038nX = C222038nX.this;
                    if (c2to != null) {
                        str = c2to.LJLIL;
                    }
                    c222038nX.onPlayCompleted(str);
                    return;
                }
                params.LIZIZ.onInternalEvent(c50420Jqa);
            }
        };
        o.LJIIIIZZ(context, "context");
        C222928oy c222928oy = new C222928oy(context, C16880lQ.LLZIL(context), interfaceC72642tA, params.LIZJ, params.LIZLLL, params.LJ, params.LJFF);
        c222928oy.LJLLLLLL = aqS169S0100000_3;
        this.LLI = c222928oy;
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1473));
        StoryFeedViewModel LJIIL = LJIIL();
        LJIIL.iv0("LOAD_USER_STORY_SUCCESS", this, false);
        LJIIL.iv0("LOAD_USER_STORY_FAIL", this, false);
        LJIIL.iv0("SUBSCRIBE_MINE_STORY_CHANGED", this, false);
        LJIIL.iv0("ON_CURRENT_INFO_CHANGED", this, false);
        viewGroup2.setVisibility(0);
        C210118Ml c210118Ml = (C210118Ml) C7F6.LIZ(c55723Ltv.LJIIIIZZ(), "story_layout_progress_bar", context, R.layout.coz, null, viewGroup2, true, 8).findViewById(R.id.iac);
        o.LJII(c210118Ml, "null cannot be cast to non-null type com.ss.android.ugc.aweme.story.feed.ui.progress.StoryListProgressBar");
        this.LJZ = c210118Ml;
        int LIZJ2 = C8ON.LIZJ();
        C26338AVi.LJI(c210118Ml, Integer.valueOf(LIZJ2), null, Integer.valueOf(LIZJ2), null, false, 26);
        C53578L1a.LIZ.getClass();
        if (!C53578L1a.LIZ()) {
            c210118Ml.setVisibility(8);
            viewGroup4.setVisibility(8);
        } else if (C215178cT.LIZ.LIZJ(m89, params)) {
            viewGroup4.setVisibility(0);
            this.LLIIII = true;
        } else {
            viewGroup4.setVisibility(8);
        }
        if (m89.getStoryType() == 1) {
            c210118Ml.setVisibility(8);
        }
        if (C61447O9r.LJIILIIL == 0) {
            LIZJ.findViewById(R.id.kej).getLayoutParams().height = C63081OpJ.LJJJJLI(context);
        } else {
            LIZJ.findViewById(R.id.kej).getLayoutParams().height = 0;
        }
        c222928oy.LJLLJ = interfaceC55100Ljs;
        LJIIJJI().setAdapter(c222928oy);
        LJIIJJI().LJFF(new IDiS267S0100000_3(this, 3));
        if (C222978p3.LIZ().preCreateCellEnabled) {
            String str = this.LJLIL.LJ.param.getExtra().get("story_extra_cell_preload_type");
            if (C78685UuP.LJJJZ(str) && !o.LJ(str, CardStruct.IStatusCode.DEFAULT)) {
                LJIIJJI().post(new ARunnableS39S0100000_3(this, 142));
            }
        }
        new AqS107S0300000_3(params, this, viewGroup3, 23).invoke(this.LJLJJI);
        LIZJ(new AqS134S0200000_3(this, params, 188));
        this.LLIIIILZ = new CopyOnWriteArrayList<>();
    }
}
