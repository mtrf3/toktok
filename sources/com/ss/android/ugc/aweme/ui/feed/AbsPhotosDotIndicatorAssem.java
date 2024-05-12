package com.ss.android.ugc.aweme.ui.feed;

import X.ActivityC45651qj;
import X.AnonymousClass838;
import X.C212428Vi;
import X.C221108m2;
import X.C51029K0z;
import X.C62822Ol8;
import X.C78963Uyt;
import X.C84B;
import X.C8T7;
import Y.ARunnableS22S0200000_3;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class AbsPhotosDotIndicatorAssem extends PhotoSlideIndicatorAssem<AbsPhotosDotIndicatorAssem> implements ComponentPriorityProtocol {
    public C84B LLFZ;
    public final C62822Ol8 LLI;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.c1r;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C8T7 e2() {
        return null;
    }

    public AbsPhotosDotIndicatorAssem() {
        new LinkedHashMap();
        this.LLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1134));
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final View l0() {
        return getContainerView();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final String o0() {
        BaseFeedPageParams baseFeedPageParams = a1().LJ;
        if (baseFeedPageParams != null && AnonymousClass838.LIZ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme(), baseFeedPageParams)) {
            return "bottom_container_photomode_dot_page_control";
        }
        return "top_bottom_container_photomode_indicator";
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.PhotoSlideIndicatorAssem, X.C8XO
    /* renamed from: F0 */
    public /* bridge */ /* synthetic */ void q4(Object obj) {
        q4((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.PhotoSlideIndicatorAssem, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C84B c84b = (C84B) view.findViewById(R.id.hos);
        if (c84b != null) {
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            if (LIZ != null) {
                c84b.post(new ARunnableS22S0200000_3(c84b, LIZ, 24));
            }
        } else {
            c84b = null;
        }
        this.LLFZ = c84b;
        super.onViewCreated(view);
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.PhotoSlideIndicatorAssem
    public void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        if (!C78963Uyt.LJJIII(item)) {
            C84B c84b = this.LLFZ;
            if (c84b != null) {
                c84b.LJLJLJ = true;
            }
        } else {
            C84B c84b2 = this.LLFZ;
            if (c84b2 != null) {
                c84b2.LJLJLJ = false;
            }
        }
        super.q4(item);
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.PhotoSlideIndicatorAssem
    public final void r4(int i) {
        C84B c84b = this.LLFZ;
        if (c84b != null) {
            c84b.setSelectedIndex(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.PhotoSlideIndicatorAssem
    public final void u4(int i) {
        int i2;
        InteractAreaCommonAbility interactAreaCommonAbility;
        C84B c84b = this.LLFZ;
        if (!(c84b instanceof View)) {
            c84b = null;
        }
        if (c84b != null) {
            if (i > 1) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            c84b.setVisibility(i2);
        }
        if (i > 1 && (interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLI.getValue()) != null) {
            interactAreaCommonAbility.U00(this, null, null);
        }
        C84B c84b2 = this.LLFZ;
        if (c84b2 != null) {
            c84b2.setCount(i);
        }
    }
}
