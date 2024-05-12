package com.ss.android.ugc.feed.platform.cell;

import X.AnonymousClass843;
import X.C16880lQ;
import X.C207668Da;
import X.C221108m2;
import X.C37179EiV;
import X.C3C8;
import X.C47261Igj;
import X.C55096Ljo;
import X.C62814Ol0;
import X.C62822Ol8;
import X.C73098SmU;
import X.C79057V0z;
import X.C8MM;
import X.C8MQ;
import X.C8O4;
import X.C8QI;
import X.C8XO;
import X.TCM;
import Y.ARunnableS39S0100000_3;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.assem.desc.FeedModeBaseProtocol;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.panel.base.EventCenter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class BaseCellSlotComponent<RECEIVER extends C3C8> extends ReusedUISlotAssem<RECEIVER> implements C8XO<VideoItemParams>, C8MQ, FeedModeBaseProtocol {
    public final C62822Ol8 LLFF;
    public int LLFFF;

    public void B2(int i, Aweme aweme) {
    }

    public void E1() {
    }

    public void LJJIII(int i) {
    }

    public void LJJIJIIJIL(int i) {
    }

    public void LJJJJ() {
    }

    public void LLIILZL() {
    }

    public void LLLZIIL() {
    }

    public void eventInit(C8MM c8mm) {
    }

    public void onDestroyView() {
    }

    @Override // X.C8XO
    /* renamed from: p4, reason: merged with bridge method [inline-methods] */
    public void n3(VideoItemParams videoItemParams) {
    }

    public void unBind() {
    }

    public void v0(int i, Aweme aweme) {
    }

    public BaseCellSlotComponent() {
        new LinkedHashMap();
        this.LLFF = C221108m2.LIZIZ(new AqS153S0100000_3((BaseCellSlotComponent) this, 1235));
        this.LLFFF = 8;
    }

    public C8O4 a1() {
        return (C8O4) this.LLFF.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.FeedModeBaseProtocol
    public final void s() {
        if (this.LLFFF == 0) {
            Y3().setVisibility(0);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public void E3() {
        if (TCM.LJIILIIL(getParent())) {
            return;
        }
        super.E3();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.FeedModeBaseProtocol
    public final void M2() {
        int visibility = Y3().getVisibility();
        this.LLFFF = visibility;
        if (visibility == 0) {
            Y3().setVisibility(8);
        }
    }

    @Override // X.C8O3
    public final EventCenter getEventCenter() {
        return a1().LJFF;
    }

    @Override // X.C8W0
    public void onParentSet() {
        super.onParentSet();
        if (C73098SmU.LJFF(C16880lQ.LLLLIIIILLL())) {
            C8MM c8mm = new C8MM();
            eventInit(c8mm);
            if (!c8mm.LIZIZ().isEmpty()) {
                Set<Map.Entry<String, Observer<C207668Da>>> entrySet = c8mm.LIZIZ().entrySet();
                o.LJIIIIZZ(entrySet, "observers.entries");
                for (Map.Entry<String, Observer<C207668Da>> entry : entrySet) {
                    EventCenter eventCenter = a1().LJFF;
                    if (eventCenter != null) {
                        eventCenter.iv0(entry.getKey(), entry.getValue(), true);
                    }
                }
            }
        } else {
            C37179EiV.LIZ().post(new ARunnableS39S0100000_3(this, 114));
        }
        if (AnonymousClass843.LIZIZ()) {
            C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), FeedModeBaseProtocol.class, C47261Igj.LJJIJIL(this));
        }
    }

    public final void n4() {
        super.E3();
    }

    @Override // X.C8XO
    /* renamed from: m4, reason: merged with bridge method [inline-methods] */
    public boolean c2(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        if (TCM.LJIILIIL(getParent())) {
            LifecycleOwner parent = getParent();
            o.LJII(parent, "null cannot be cast to non-null type com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent<out com.bytedance.tiktok.proxy.IVMReceiver>");
            return ((ReusedAssem) parent).LJLIL;
        }
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        View containerView = getContainerView();
        if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread()) {
            containerView.setVisibility(0);
        } else {
            C79057V0z.LJJJ(containerView, new ARunnableS39S0100000_3(containerView, 171));
        }
        getContainerView().setTag(C8QI.LJIIIIZZ, C16880lQ.LJLLJ(getClass()));
    }
}
