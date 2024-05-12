package com.ss.android.ugc.aweme.story.feed.common.newarch.component;

import X.C187227Wk;
import X.C207668Da;
import X.C221108m2;
import X.C221138m5;
import X.C222588oQ;
import X.C42625Go9;
import X.C50420Jqa;
import X.C56992Ln;
import X.C57432Nf;
import X.C62822Ol8;
import X.C8O4;
import X.EnumC222138nh;
import X.InterfaceC72642tA;
import X.KR8;
import X.QD3;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryCollectionCellAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FeedCollectionDeleteComponent extends BaseCellLogicComponent<FeedCollectionDeleteComponent> implements Observer<C207668Da> {
    public UserStory LJLLL;
    public C222588oQ LJLLLLLL;
    public final C221138m5 LJLLLL = KR8.LJIIJJI(new AqS153S0100000_3(this, 885));
    public final C62822Ol8 LJLZ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 886));
    public final CopyOnWriteArrayList<Aweme> LJZ = new CopyOnWriteArrayList<>();

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void E3() {
    }

    public final void L3() {
        C222588oQ c222588oQ;
        InterfaceC72642tA<C50420Jqa> interfaceC72642tA;
        int i;
        List<Aweme> stories;
        Iterator<Aweme> it = this.LJZ.iterator();
        while (it.hasNext()) {
            Aweme normalPost = it.next();
            C8O4 a1 = a1();
            if (a1 != null && (c222588oQ = a1.LIZLLL) != null && (interfaceC72642tA = c222588oQ.LIZIZ) != null) {
                EnumC222138nh enumC222138nh = EnumC222138nh.DELETE_ITEM;
                o.LJIIIIZZ(normalPost, "normalPost");
                UserStory userStory = this.LJLLL;
                if (userStory != null && (stories = userStory.getStories()) != null) {
                    i = stories.indexOf(normalPost);
                } else {
                    i = -1;
                }
                interfaceC72642tA.onInternalEvent(new C50420Jqa(60, new C57432Nf(enumC222138nh, new C56992Ln(i, normalPost))));
            }
        }
        this.LJZ.clear();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C42625Go9.LIZJ(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onPause() {
        super.onPause();
        L3();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.C8MQ
    public final void LLIILZL() {
        L3();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.C8MQ
    public final void onDestroyView() {
        C42625Go9.LIZJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent, X.C8XO
    public final void unBind() {
        C42625Go9.LIZJ(this);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        Aweme ct0;
        o.LJIIIZ(item, "item");
        C42625Go9.LIZIZ(this);
        DataCenter dataCenter = (DataCenter) this.LJLZ.getValue();
        dataCenter.iv0("LOAD_USER_STORY_SUCCESS", this, false);
        dataCenter.iv0("ON_CURRENT_INFO_CHANGED", this, false);
        StoryCollectionCellAbility storyCollectionCellAbility = (StoryCollectionCellAbility) this.LJLLLL.getValue();
        UserStory userStory = null;
        if (storyCollectionCellAbility != null && (ct0 = storyCollectionCellAbility.ct0()) != null) {
            userStory = ct0.getUserStory();
        }
        this.LJLLL = userStory;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C207668Da c207668Da) {
        Aweme ct0;
        String str;
        C207668Da c207668Da2 = c207668Da;
        StoryCollectionCellAbility storyCollectionCellAbility = (StoryCollectionCellAbility) this.LJLLLL.getValue();
        Object obj = null;
        if (storyCollectionCellAbility == null || (ct0 = storyCollectionCellAbility.ct0()) == null || c207668Da2 == null || (str = c207668Da2.LIZ) == null) {
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 291667849) {
            if (hashCode != 1211050238 || !str.equals("LOAD_USER_STORY_SUCCESS")) {
                return;
            }
            Object obj2 = c207668Da2.LIZIZ;
            if (obj2 != null) {
                obj = obj2;
            }
            UserStory userStory = (UserStory) obj;
            if (!o.LJ(ct0.getUserStory(), userStory)) {
                return;
            }
            this.LJLLL = userStory;
            return;
        }
        if (!str.equals("ON_CURRENT_INFO_CHANGED")) {
            return;
        }
        Object obj3 = c207668Da2.LIZIZ;
        if (obj3 != null) {
            obj = obj3;
        }
        UserStory userStory2 = (UserStory) obj;
        if (!o.LJ(ct0.getUserStory(), userStory2)) {
            return;
        }
        this.LJLLL = userStory2;
    }

    @QD3
    public final void onPrivateModelEvent(C187227Wk privateModelEvent) {
        UserStory userStory;
        List<Aweme> stories;
        o.LJIIIZ(privateModelEvent, "privateModelEvent");
        Aweme aweme = privateModelEvent.LJLILLLLZI;
        if (aweme != null && (userStory = this.LJLLL) != null && (stories = userStory.getStories()) != null) {
            Iterator<Aweme> it = stories.iterator();
            while (it.hasNext()) {
                if (o.LJ(it.next().getAid(), aweme.getAid())) {
                    if (aweme.getIsStoryToNormal()) {
                        this.LJZ.add(aweme);
                        return;
                    }
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }
}
