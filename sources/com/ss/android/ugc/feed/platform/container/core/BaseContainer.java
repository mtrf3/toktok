package com.ss.android.ugc.feed.platform.container.core;

import X.AnonymousClass843;
import X.C210588Og;
import X.C3C8;
import X.C47261Igj;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55247LmF;
import X.C62814Ol0;
import X.C8P7;
import X.C8PA;
import X.C8PC;
import X.EnumC210578Of;
import X.InterfaceC55235Lm3;
import X.InterfaceC80653En;
import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.desc.FeedModeBaseProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.container.core.VContainerProtocol;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class BaseContainer<PROTOCOL extends VContainerProtocol, RECEIVER extends C3C8> extends BaseCellContentComponent<RECEIVER> implements VContainer<PROTOCOL>, C8PC {
    public View LL;
    public BaseFeedPageParams LLD;
    public BaseContainer<?, ?> LLF;
    public final BaseContainer$feedModeBaseProtocol$1 LLFF;

    public abstract EnumC210578Of c4();

    @Override // X.C8XO
    /* renamed from: g4, reason: merged with bridge method [inline-methods] */
    public void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.feed.platform.container.core.BaseContainer$feedModeBaseProtocol$1] */
    public BaseContainer() {
        new LinkedHashMap();
        this.LLFF = new FeedModeBaseProtocol(this) { // from class: com.ss.android.ugc.feed.platform.container.core.BaseContainer$feedModeBaseProtocol$1
            public int LJLIL = 8;
            public final /* synthetic */ BaseContainer<PROTOCOL, RECEIVER> LJLILLLLZI;

            @Override // com.ss.android.ugc.aweme.feed.assem.desc.FeedModeBaseProtocol
            public final void M2() {
                this.LJLIL = this.LJLILLLLZI.getContainerView().getVisibility();
                if (this.LJLILLLLZI.getContainerView().getVisibility() == 0) {
                    this.LJLILLLLZI.getContainerView().setVisibility(8);
                }
            }

            @Override // com.ss.android.ugc.aweme.feed.assem.desc.FeedModeBaseProtocol
            public final void s() {
                if (this.LJLIL == 0) {
                    this.LJLILLLLZI.getContainerView().setVisibility(0);
                }
            }

            {
                this.LJLILLLLZI = this;
            }
        };
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.InteractVideoTagAbility
    public final View getContainerView() {
        View view = this.LL;
        if (view != null) {
            return view;
        }
        o.LJIJI("containerView");
        throw null;
    }

    public final BaseFeedPageParams rp0() {
        BaseFeedPageParams baseFeedPageParams = this.LLD;
        if (baseFeedPageParams != null) {
            return baseFeedPageParams;
        }
        o.LJIJI("pageParams");
        throw null;
    }

    public void e4() {
        View containerView = getContainerView();
        final InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
        C55247LmF.LIZIZ(C55230Lly.LJ(containerView), new InterfaceC80653En(LJIIZILJ) { // from class: X.8PA
            public final InterfaceC55235Lm3 LJLIL;

            {
                o.LJIIIZ(LJIIZILJ, "parentScope");
                this.LJLIL = LJIIZILJ;
            }
        }, C8PA.class, "source_default_key");
    }

    public final void l4() {
        LinkedList<BaseContainer<? extends VContainerProtocol, ? extends C3C8>> linkedList = C8P7.LIZ(this).hv0().get(this);
        if (linkedList != null) {
            Iterator<BaseContainer<? extends VContainerProtocol, ? extends C3C8>> it = linkedList.iterator();
            while (it.hasNext()) {
                it.next().l4();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8W0
    public void onParentSet() {
        super.onParentSet();
        EnumC210578Of type = c4();
        o.LJIIIZ(type, "type");
        if (!AnonymousClass843.LIZIZ() || !C210588Og.LIZ.contains(type) || !AnonymousClass843.LIZIZ()) {
            return;
        }
        C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), FeedModeBaseProtocol.class, C47261Igj.LJJIJIL(this.LLFF));
    }

    public final void k4(int i) {
        LinkedList<BaseContainer<? extends VContainerProtocol, ? extends C3C8>> linkedList = C8P7.LIZ(this).hv0().get(this);
        if (linkedList != null) {
            Iterator<BaseContainer<? extends VContainerProtocol, ? extends C3C8>> it = linkedList.iterator();
            while (it.hasNext()) {
                it.next().k4(i);
            }
        }
    }

    public final void m4(PROTOCOL target) {
        o.LJIIIZ(target, "target");
        ContainerTree LIZ = C8P7.LIZ(this);
        if (!LIZ.iv0().containsKey(this)) {
            LIZ.iv0().put(this, new LinkedHashSet<>());
        }
        LinkedHashSet<VContainerProtocol> linkedHashSet = LIZ.iv0().get(this);
        if (linkedHashSet != null) {
            linkedHashSet.add(target);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void setContainerView(View view) {
        o.LJIIIZ(view, "<set-?>");
        this.LL = view;
    }

    public void b4(int i, Aweme aweme) {
        LinkedList<BaseContainer<? extends VContainerProtocol, ? extends C3C8>> linkedList = C8P7.LIZ(this).hv0().get(this);
        if (linkedList != null) {
            Iterator<BaseContainer<? extends VContainerProtocol, ? extends C3C8>> it = linkedList.iterator();
            while (it.hasNext()) {
                it.next().b4(i, aweme);
            }
        }
    }
}
