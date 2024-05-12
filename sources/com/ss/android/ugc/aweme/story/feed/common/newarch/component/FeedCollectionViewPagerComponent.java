package com.ss.android.ugc.aweme.story.feed.common.newarch.component;

import X.C0C3;
import X.C1CZ;
import X.C207668Da;
import X.C214348b8;
import X.C221108m2;
import X.C221138m5;
import X.C222098nd;
import X.C222108ne;
import X.C222168nk;
import X.C222208no;
import X.C222248ns;
import X.C222578oP;
import X.C222588oQ;
import X.C222928oy;
import X.C2K0;
import X.C2K7;
import X.C2MA;
import X.C40443Fu3;
import X.C50420Jqa;
import X.C54819LfL;
import X.C54838Lfe;
import X.C55096Ljo;
import X.C55723Ltv;
import X.C56122Ie;
import X.C56992Ln;
import X.C57432Nf;
import X.C5H3;
import X.C61878OQg;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C80766Vms;
import X.C80769Vmv;
import X.EnumC215438ct;
import X.EnumC222138nh;
import X.InterfaceC222288nw;
import X.InterfaceC55057LjB;
import X.InterfaceC55102Lju;
import X.KR8;
import X.PRT;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.Observer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.ss.android.ugc.aweme.story.feed.common.StoryFeedViewModel;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.FeedCollectionProgressBarAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.FeedCollectionViewPagerAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryCollectionCellAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.component.FeedCollectionViewPagerComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FeedCollectionViewPagerComponent extends BaseCellContentComponent implements FeedCollectionViewPagerAbility, Observer, InterfaceC55102Lju {
    public final C62822Ol8 LL;
    public final C5H3 LLD;
    public final C221138m5 LLF;
    public final C221138m5 LLFF;
    public final C62822Ol8 LLFFF;
    public final C221138m5 LLFII;
    public final C221138m5 LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public final C62822Ol8 LLIIII;
    public C2MA LLIIIILZ;
    public EnumC215438ct LLIIIJ;
    public int LLIIIL;
    public int LLIIIZ;
    public UserStory LLIIJI;
    public Aweme LLIIJLIL;
    public C222588oQ LLIIL;
    public String LLIILII;
    public final C62822Ol8 LLIILZL;
    public final Set<String> LLIIZ;
    public boolean LLIL;
    public InterfaceC222288nw LLILII;
    public final C222098nd LLILIL;
    public final C62822Ol8 LLILL;
    public C222208no LLILLIZIL;
    public boolean LLILLJJLI;

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.FeedCollectionViewPagerAbility
    public final void Hr0() {
        this.LLI = true;
        List<Aweme> qv0 = m4().qv0(this.LLIILII);
        if (qv0 != null) {
            int ov0 = m4().ov0(this.LLIILII, qv0);
            e4().setData(qv0);
            ArrayList arrayList = (ArrayList) qv0;
            if (arrayList.size() > 0 && ov0 >= 0) {
                int currentItem = k4().getCurrentItem();
                k4().setCurrentItem(ov0);
                if (currentItem == ov0) {
                    n4(ov0, false);
                }
            }
            FeedCollectionProgressBarAbility feedCollectionProgressBarAbility = (FeedCollectionProgressBarAbility) this.LLF.getValue();
            if (feedCollectionProgressBarAbility != null) {
                feedCollectionProgressBarAbility.qG(arrayList.size());
            }
        }
        this.LLI = false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LJJJJ() {
        this.LLIIJLIL = null;
        this.LLIIIILZ = null;
        e4().setData(C61878OQg.INSTANCE);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LLIILZL() {
        int ov0;
        this.LLII = false;
        k4().LJJIIJ(this.LLILLIZIL);
        InterfaceC55057LjB LIZIZ = C40443Fu3.LIZIZ("story_horizontally_viewpager");
        if (LIZIZ != null) {
            LIZIZ.LIZIZ();
        }
        this.LLIFFJFJJ = false;
        q4("story_collection_play_end");
        if (m4().Ev0(this.LLIILII) && (ov0 = m4().ov0(this.LLIILII, e4().Q8())) >= 0) {
            k4().setCurrentItem(ov0, false);
        }
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -2117387148) {
            return null;
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.8nd] */
    public FeedCollectionViewPagerComponent() {
        new LinkedHashMap();
        this.LL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 901));
        this.LLD = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C222168nk.INSTANCE);
        this.LLF = KR8.LJIIJJI(new AqS153S0100000_3(this, 896));
        this.LLFF = KR8.LJIIJJI(new AqS153S0100000_3(this, 900));
        this.LLFFF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 893));
        this.LLFII = KR8.LJIIJJI(new AqS153S0100000_3(this, 897));
        this.LLFZ = KR8.LJIIJJI(new AqS153S0100000_3(this, 899));
        this.LLIIII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 898));
        this.LLIIIJ = EnumC215438ct.LOOP_CURRENT_USER;
        this.LLIIIL = -1;
        this.LLIIIZ = -1;
        this.LLIILII = "";
        this.LLIILZL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 894));
        this.LLIIZ = new LinkedHashSet();
        this.LLILIL = new PRT() { // from class: X.8nd
            @Override // X.PRT
            public final void onStop(String type) {
                o.LJIIIZ(type, "type");
            }

            @Override // X.PRT
            public final void LIZIZ(String type) {
                String eventType;
                o.LJIIIZ(type, "type");
                InterfaceC55057LjB LIZIZ = C40443Fu3.LIZIZ(type);
                if (LIZIZ == null || (eventType = FeedCollectionViewPagerComponent.this.g4().LJ.param.getEventType()) == null) {
                    return;
                }
                LIZIZ.LIZ("enter_from", eventType);
            }
        };
        this.LLILL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 895));
    }

    public final C222928oy e4() {
        return (C222928oy) this.LLILL.getValue();
    }

    public final C222588oQ g4() {
        C222588oQ c222588oQ = this.LLIIL;
        if (c222588oQ != null) {
            return c222588oQ;
        }
        o.LJIJI("params");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.FeedCollectionViewPagerAbility
    public final C2MA getCurViewHolder() {
        Object obj;
        C2MA c2ma;
        if (!this.LJLLLL) {
            return null;
        }
        if (b4(k4().getCurrentItem(), this.LLIIIILZ)) {
            return this.LLIIIILZ;
        }
        for (int childCount = k4().getChildCount() - 1; -1 < childCount; childCount--) {
            View childAt = k4().getChildAt(childCount);
            if (childAt != null) {
                obj = childAt.getTag(R.id.d87);
            } else {
                obj = null;
            }
            if (obj instanceof C2MA) {
                c2ma = (C2MA) obj;
            } else {
                c2ma = null;
            }
            if (b4(k4().getCurrentItem(), c2ma)) {
                UserStory userStory = this.LLIIJI;
                if (userStory != null) {
                    int currentItem = k4().getCurrentItem();
                    C54819LfL.LIZJ(m4().LJLLL, this.LLIILII, userStory, Integer.valueOf(currentItem), e4().getItem(currentItem));
                }
                return c2ma;
            }
        }
        return null;
    }

    public final C222108ne k4() {
        return (C222108ne) this.LLIIII.getValue();
    }

    public final StoryFeedViewModel m4() {
        return (StoryFeedViewModel) this.LL.getValue();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void onDestroyView() {
        C2MA c2ma;
        if (this.LLILLJJLI) {
            return;
        }
        q4("story_collection_play_end");
        for (int childCount = k4().getChildCount() - 1; -1 < childCount; childCount--) {
            View childAt = k4().getChildAt(childCount);
            Object obj = null;
            if (childAt != null) {
                obj = childAt.getTag(R.id.d87);
            }
            if ((obj instanceof C2MA) && (c2ma = (C2MA) obj) != null) {
                c2ma.onDestroyView();
            }
        }
        InterfaceC55057LjB LIZIZ = C40443Fu3.LIZIZ("story_horizontally_viewpager");
        if (LIZIZ != null) {
            LIZIZ.LIZIZ();
        }
        this.LLILLJJLI = true;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.IAdapterAbility
    public final C222928oy LJJLIIIJJIZ() {
        return e4();
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.IViewPagerAbility
    public final int LLILL() {
        C80769Vmv c80769Vmv;
        View view = getView();
        if ((view instanceof C80766Vms) && (c80769Vmv = (C80769Vmv) view) != null) {
            return c80769Vmv.getCurrentItem();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.FeedCollectionViewPagerAbility
    public final List<Aweme> Q8() {
        return e4().Q8();
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.FeedCollectionViewPagerAbility
    public final boolean Tw() {
        int currentItem;
        int count = e4().getCount();
        if (count <= 0 || (currentItem = k4().getCurrentItem() + 1) >= count) {
            return false;
        }
        k4().setCurrentItem(currentItem, false);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.FeedCollectionViewPagerAbility
    public final boolean g50() {
        int currentItem;
        if (e4().getCount() <= 0 || (currentItem = k4().getCurrentItem() - 1) <= -1) {
            return false;
        }
        k4().setCurrentItem(currentItem, false);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.IViewPagerAbility
    public final View getView() {
        return k4();
    }

    public final int l4() {
        return (e4().getCount() - 1) - k4().getCurrentItem();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.FeedCollectionViewPagerAbility
    public final EnumC215438ct R() {
        return this.LLIIIJ;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void W3() {
        onDestroyView();
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.IAdapterAbility
    public final void E00(String aid) {
        o.LJIIIZ(aid, "aid");
        if (m4().mv0(this.LLIILII, aid) < 0) {
            List<Aweme> LJJIL = e4().LJJIL();
            Iterator<Aweme> it = LJJIL.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (o.LJ(it.next().getAid(), aid)) {
                    if (i >= 0) {
                        ListProtector.remove(LJJIL, i);
                    } else {
                        return;
                    }
                } else {
                    i++;
                }
            }
            return;
        }
        UserStory userStory = this.LLIIJI;
        if ((userStory != null && C54838Lfe.LJIIJ(userStory, !m4().uv0())) || m4().Cv0()) {
            p4(EnumC222138nh.ON_DELETE_COLLECTION, new C56122Ie(this.LLIIIL));
            return;
        }
        r4(null);
        n4(k4().getCurrentItem(), true);
        C2MA curViewHolder = getCurViewHolder();
        if (curViewHolder != null) {
            curViewHolder.B7();
        }
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        if (!C54838Lfe.LJJ(item.getAweme())) {
            return;
        }
        this.LLIIIILZ = null;
        this.LLIIZ.clear();
        UserStory userStory = item.getAweme().getUserStory();
        if (userStory == null) {
            return;
        }
        this.LLIIJI = userStory;
        k1(C55723Ltv.LIZIZ.LJIJ().LJII(g4().LJIIIZ, g4().LJ.param.getFrom()));
        StoryFeedViewModel m4 = m4();
        Aweme aweme = item.getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        m4.getClass();
        this.LLIILII = StoryFeedViewModel.pv0(aweme);
        StoryFeedViewModel m42 = m4();
        Aweme aweme2 = item.getAweme();
        o.LJIIIIZZ(aweme2, "item.aweme");
        m42.Fv0(aweme2, this.LLIILII);
        this.LLIIJLIL = item.getAweme();
        this.LLIIIL = item.currentPosition;
        Hr0();
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.IViewPagerAbility
    public final void addOnPageChangeListener(C0C3 c0c3) {
        C80769Vmv c80769Vmv;
        View view = getView();
        if ((view instanceof C80766Vms) && (c80769Vmv = (C80769Vmv) view) != null) {
            c80769Vmv.LJFF(c0c3);
        }
    }

    public final void c4(Aweme aweme) {
        if (this.LLIFFJFJJ && l4() == 0 && !TextUtils.equals("story_archive", m4().LJLJLLL)) {
            C54819LfL c54819LfL = m4().LJLLL;
            String authorUid = aweme.getAuthorUid();
            UserStory userStory = aweme.getUserStory();
            c54819LfL.getClass();
            C54819LfL.LIZ(authorUid, userStory);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.FeedCollectionViewPagerAbility
    public final Aweme getItem(int i) {
        return e4().getItem(i);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.FeedCollectionViewPagerAbility
    public final C2MA getViewHolderByAwemeId(String str) {
        Object obj;
        C2MA c2ma;
        if (str == null) {
            return null;
        }
        int childCount = k4().getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = k4().getChildAt(i);
            if (childAt != null) {
                obj = childAt.getTag(R.id.d87);
            } else {
                obj = null;
            }
            if ((obj instanceof C2MA) && (c2ma = (C2MA) obj) != null && c2ma.O1() != null && TextUtils.equals(c2ma.O1().getAid(), str)) {
                return c2ma;
            }
        }
        return null;
    }

    @Override // X.InterfaceC56392Jf
    public final void k1(EnumC215438ct mode) {
        Story story;
        o.LJIIIZ(mode, "mode");
        Aweme item = e4().getItem(k4().getCurrentItem());
        if (item != null && (story = item.getStory()) != null && story.isPublishing()) {
            this.LLIIIJ = EnumC215438ct.LOOP_CURRENT_VIDEO;
        } else {
            this.LLIIIJ = mode;
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String str;
        int currentItem;
        UserStoryCurrentInfo currentInfo;
        Integer currentIndex;
        StoryCollectionCellAbility storyCollectionCellAbility;
        C207668Da c207668Da = (C207668Da) obj;
        Aweme aweme = this.LLIIJLIL;
        if (aweme != null) {
            Object obj2 = null;
            if (c207668Da != null && (str = c207668Da.LIZ) != null) {
                int hashCode = str.hashCode();
                if (hashCode != 291667849) {
                    if (hashCode != 1211050238 || !str.equals("LOAD_USER_STORY_SUCCESS")) {
                        return;
                    }
                    Object obj3 = c207668Da.LIZIZ;
                    if (obj3 != null) {
                        obj2 = obj3;
                    }
                    UserStory curUserStory = (UserStory) obj2;
                    if (!o.LJ(aweme.getUserStory(), curUserStory)) {
                        return;
                    }
                    this.LLIIJI = curUserStory;
                    o.LJIIIIZZ(curUserStory, "curUserStory");
                    if (C54838Lfe.LJIIJ(curUserStory, !m4().uv0())) {
                        p4(EnumC222138nh.ON_DELETE_COLLECTION, new C56122Ie(this.LLIIIL));
                        return;
                    }
                    r4(curUserStory.getCurrentInfo());
                    if (this.LLIFFJFJJ) {
                        n4(k4().getCurrentItem(), true);
                    } else {
                        n4(k4().getCurrentItem(), false);
                    }
                    c4(aweme);
                    Aweme item = e4().getItem(k4().getCurrentItem());
                    if (item != null && (storyCollectionCellAbility = (StoryCollectionCellAbility) this.LLFII.getValue()) != null) {
                        storyCollectionCellAbility.GH(new C56992Ln(k4().getCurrentItem(), item));
                    }
                    m4().Hv0(k4().getCurrentItem(), this.LLIILII);
                    return;
                }
                if (!str.equals("ON_CURRENT_INFO_CHANGED")) {
                    return;
                }
                Object obj4 = c207668Da.LIZIZ;
                if (obj4 != null) {
                    obj2 = obj4;
                }
                UserStory userStory = (UserStory) obj2;
                if (!o.LJ(aweme.getUserStory(), userStory)) {
                    return;
                }
                this.LLIIJI = userStory;
                C222108ne k4 = k4();
                if (userStory != null && (currentInfo = userStory.getCurrentInfo()) != null && (currentIndex = currentInfo.getCurrentIndex()) != null) {
                    currentItem = currentIndex.intValue();
                } else {
                    currentItem = k4().getCurrentItem();
                }
                k4.setCurrentItem(currentItem);
                m4().Hv0(k4().getCurrentItem(), this.LLIILII);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r12) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.common.newarch.component.FeedCollectionViewPagerComponent.onViewCreated(android.view.View):void");
    }

    public final void q4(String str) {
        Aweme aweme;
        Aweme aweme2;
        Aweme aweme3;
        int hashCode = str.hashCode();
        if (hashCode != -2015881337) {
            if (hashCode != 1431203431) {
                if (hashCode != 1753337067 || !str.equals("story_collection_play") || (aweme3 = this.LLIIJLIL) == null) {
                    return;
                }
                C222578oP.LJIILIIL(e4().getCount(), l4(), aweme3, g4().LJIIIZ, (String) this.LLIILZL.getValue());
                return;
            }
            if (!str.equals("story_collection_play_finish") || (aweme2 = this.LLIIJLIL) == null) {
                return;
            }
            C222578oP.LJIILL(e4().getCount(), l4(), aweme2, g4().LJIIIZ, (String) this.LLIILZL.getValue());
            return;
        }
        if (!str.equals("story_collection_play_end") || (aweme = this.LLIIJLIL) == null) {
            return;
        }
        C222578oP.LJIILJJIL(aweme, e4().getCount(), l4(), g4().LJIIIZ, this.LLIIZ.size(), (String) this.LLIILZL.getValue());
    }

    public final void r4(UserStoryCurrentInfo userStoryCurrentInfo) {
        Integer num;
        List<Aweme> qv0 = m4().qv0(this.LLIILII);
        if (qv0 != null) {
            int currentItem = k4().getCurrentItem();
            e4().setData(qv0);
            FeedCollectionProgressBarAbility feedCollectionProgressBarAbility = (FeedCollectionProgressBarAbility) this.LLF.getValue();
            if (feedCollectionProgressBarAbility != null) {
                feedCollectionProgressBarAbility.qG(((ArrayList) qv0).size());
            }
            ArrayList arrayList = (ArrayList) qv0;
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
                    k4().setCurrentItem(currentItem, false);
                } else {
                    currentItem = arrayList.size() - 1;
                    k4().setCurrentItem(currentItem, false);
                }
            } else {
                Integer currentIndex = userStoryCurrentInfo.getCurrentIndex();
                if (currentIndex != null) {
                    currentItem = currentIndex.intValue();
                } else {
                    currentItem = 0;
                }
                if (currentItem < arrayList.size() && currentItem >= 0) {
                    k4().setCurrentItem(currentItem, false);
                } else {
                    currentItem = arrayList.size() - 1;
                    k4().setCurrentItem(currentItem, false);
                }
            }
            C54819LfL.LIZJ(m4().LJLLL, this.LLIILII, this.LLIIJI, Integer.valueOf(currentItem), (Aweme) ListProtector.get(qv0, currentItem));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.0C3, X.8no] */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void B2(int i, Aweme aweme) {
        this.LLII = true;
        this.LLIIIL = i;
        C222108ne k4 = k4();
        if (k4 != 0) {
            final InterfaceC55057LjB LIZ = C40443Fu3.LIZ("story_horizontally_viewpager");
            LIZ.LJI(this.LLILIL);
            C222248ns.LIZ = "story_horizontally_viewpager";
            ?? r0 = new C1CZ() { // from class: X.8no
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
            this.LLILLIZIL = r0;
            k4.LJFF(r0);
        }
        this.LLIFFJFJJ = true;
        this.LLIIZ.clear();
        FeedCollectionProgressBarAbility feedCollectionProgressBarAbility = (FeedCollectionProgressBarAbility) this.LLF.getValue();
        if (feedCollectionProgressBarAbility != null) {
            feedCollectionProgressBarAbility.qG(e4().getCount());
        }
        n4(k4().getCurrentItem(), false);
        q4("story_collection_play");
    }

    public final boolean b4(int i, C2MA c2ma) {
        Aweme item;
        Aweme O1;
        if (c2ma == null || (item = e4().getItem(i)) == null || (O1 = c2ma.O1()) == null) {
            return false;
        }
        if (C54838Lfe.LJJ(item)) {
            return TextUtils.equals(item.getAid(), O1.getAid());
        }
        return o.LJ(item.getAid(), O1.getAid());
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.ability.IViewPagerChangeListenerAbility
    public final void e(int i, boolean z) {
        n4(i, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x01e8, code lost:
    
        if (r1 != null) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n4(int r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.common.newarch.component.FeedCollectionViewPagerComponent.n4(int, boolean):void");
    }

    public final void p4(EnumC222138nh enumC222138nh, C2K7 c2k7) {
        g4().LIZIZ.onInternalEvent(new C50420Jqa(60, new C57432Nf(enumC222138nh, c2k7)));
    }
}
