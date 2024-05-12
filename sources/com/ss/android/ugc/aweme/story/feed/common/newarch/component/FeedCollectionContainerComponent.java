package com.ss.android.ugc.aweme.story.feed.common.newarch.component;

import X.C1DH;
import X.C210248My;
import X.C212428Vi;
import X.C47261Igj;
import X.C55096Ljo;
import X.C62814Ol0;
import X.C8MQ;
import X.C8VR;
import X.C8W0;
import Y.ARunnableS39S0100000_3;
import android.view.View;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FeedCollectionContainerComponent extends BaseCellSlotComponent<FeedCollectionContainerComponent> {
    public final FeedCollectionContainerComponent$descExpandModeProtocol$1 LLFII;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.cok;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.story.feed.common.newarch.component.FeedCollectionContainerComponent$descExpandModeProtocol$1] */
    public FeedCollectionContainerComponent() {
        new LinkedHashMap();
        this.LLFII = new DescExpandModeProtocol() { // from class: com.ss.android.ugc.aweme.story.feed.common.newarch.component.FeedCollectionContainerComponent$descExpandModeProtocol$1
            @Override // com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol
            public final void I() {
            }

            @Override // com.ss.android.ugc.aweme.feed.assem.desc.DescExpandModeProtocol
            public final void LLILLJJLI() {
                FeedCollectionContainerComponent feedCollectionContainerComponent = FeedCollectionContainerComponent.this;
                if (feedCollectionContainerComponent.LLFFF == 0) {
                    feedCollectionContainerComponent.Y3().setVisibility(0);
                }
            }
        };
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onCreateView() {
        C210248My.LIZ.LIZLLL(this, "story_layout_feed_list_player_view", new AqS153S0100000_3(this, 884));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void E1() {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).E1();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void LJJJJ() {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).LJJJJ();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void LLIILZL() {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).LLIILZL();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void onDestroyView() {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).onDestroyView();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), DescExpandModeProtocol.class, C47261Igj.LJJIJIL(this.LLFII));
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void LJJIII(int i) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).LJJIII(i);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void LJJIJIIJIL(int i) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).LJJIJIIJIL(i);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C8VR.LIZ(this, new AqS134S0200000_3(this, view, 144));
        C1DH.LJJIJIIJI(new ARunnableS39S0100000_3(view, 90));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void B2(int i, Aweme aweme) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).B2(i, aweme);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8MQ
    public final void v0(int i, Aweme aweme) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).v0(i, aweme);
            }
        }
    }
}
