package com.ss.android.ugc.aweme.story.feed.immersive.component;

import X.C212428Vi;
import X.C3C8;
import X.C47261Igj;
import X.C55096Ljo;
import X.C62814Ol0;
import X.C8MQ;
import X.C8W0;
import X.ORZ;
import android.view.View;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.immersive.config.StoryBottomBarProtocol;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class BaseStoryBottomBarTrigger<RECEIVER extends C3C8> extends BaseCellTriggerComponent<RECEIVER> implements StoryBottomBarProtocol {
    public BaseStoryBottomBarTrigger() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void E1() {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        BaseCellSlotComponent<?> l4 = l4();
        if (l4 != null) {
            l4.E1();
            AssemSupervisor LIZJ = C212428Vi.LIZJ(l4);
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
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LJJJJ() {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        BaseCellSlotComponent<?> l4 = l4();
        if (l4 != null) {
            l4.LJJJJ();
            AssemSupervisor LIZJ = C212428Vi.LIZJ(l4);
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
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LLIILZL() {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        BaseCellSlotComponent<?> l4 = l4();
        if (l4 != null) {
            l4.LLIILZL();
            AssemSupervisor LIZJ = C212428Vi.LIZJ(l4);
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
    }

    public final BaseCellSlotComponent<?> l4() {
        C8W0 c8w0;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null) {
            c8w0 = (C8W0) ORZ.LJLLLL(LIZJ.LIZIZ());
        } else {
            c8w0 = null;
        }
        if (!(c8w0 instanceof BaseCellSlotComponent)) {
            return null;
        }
        return (BaseCellSlotComponent) c8w0;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LJJIII(int i) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        BaseCellSlotComponent<?> l4 = l4();
        if (l4 != null) {
            l4.LJJIII(i);
            AssemSupervisor LIZJ = C212428Vi.LIZJ(l4);
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
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LJJIJIIJIL(int i) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        BaseCellSlotComponent<?> l4 = l4();
        if (l4 != null) {
            l4.LJJIJIIJIL(i);
            AssemSupervisor LIZJ = C212428Vi.LIZJ(l4);
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
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.config.StoryBottomBarProtocol
    public final boolean P2(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        return k4(item);
    }

    @Override // com.ss.android.ugc.aweme.story.feed.immersive.config.StoryBottomBarProtocol
    public final void g3(boolean z) {
        int i;
        if (!this.LJLLL) {
            return;
        }
        View containerView = getContainerView();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        containerView.setVisibility(i);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), StoryBottomBarProtocol.class, C47261Igj.LJJIJIL(this));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void B2(int i, Aweme aweme) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        BaseCellSlotComponent<?> l4 = l4();
        if (l4 != null) {
            l4.B2(i, aweme);
            AssemSupervisor LIZJ = C212428Vi.LIZJ(l4);
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
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void v0(int i, Aweme aweme) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        BaseCellSlotComponent<?> l4 = l4();
        if (l4 != null) {
            l4.v0(i, aweme);
            AssemSupervisor LIZJ = C212428Vi.LIZJ(l4);
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
}
