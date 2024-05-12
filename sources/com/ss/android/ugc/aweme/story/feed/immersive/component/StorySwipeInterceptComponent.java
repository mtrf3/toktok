package com.ss.android.ugc.aweme.story.feed.immersive.component;

import X.ActivityC45651qj;
import X.C201037ul;
import X.C211998Tr;
import X.C215178cT;
import X.C222588oQ;
import X.C2304092m;
import X.InterfaceC213868aM;
import X.KRA;
import X.M89;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.immersive.ImmersiveGestureMonitor;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StorySwipeInterceptComponent extends BaseCellContentComponent<StorySwipeInterceptComponent> implements InterfaceC213868aM {
    public ImmersiveGestureMonitor LL;

    @Override // X.InterfaceC213868aM
    public final void L0() {
    }

    @Override // X.InterfaceC213868aM
    public final void LLLLIL() {
    }

    public StorySwipeInterceptComponent() {
        new LinkedHashMap();
    }

    @Override // X.InterfaceC213868aM
    public final boolean LLL() {
        String str;
        BaseFeedPageParams baseFeedPageParams;
        M89 m89;
        C215178cT c215178cT = C215178cT.LIZ;
        C222588oQ c222588oQ = a1().LIZLLL;
        String str2 = null;
        if (c222588oQ != null && (baseFeedPageParams = c222588oQ.LJ) != null && (m89 = baseFeedPageParams.param) != null) {
            str = m89.getFrom();
        } else {
            str = null;
        }
        if (!c215178cT.LJIILJJIL(str) && C211998Tr.LIZ()) {
            C222588oQ c222588oQ2 = a1().LIZLLL;
            if (c222588oQ2 != null) {
                str2 = c222588oQ2.LJIIIZ;
            }
            if (!o.LJ(str2, "story_archive")) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC213868aM
    public final void Q() {
        ActivityC45651qj LIZ;
        KRA LIZIZ = a1().LIZIZ();
        if (LIZIZ != null && (LIZ = LIZIZ.LIZ()) != null) {
            LIZ.finish();
            C201037ul.LIZ(10, LIZ, false);
        }
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        String str;
        ImmersiveGestureMonitor immersiveGestureMonitor;
        BaseFeedPageParams baseFeedPageParams;
        M89 m89;
        o.LJIIIZ(item, "item");
        C215178cT c215178cT = C215178cT.LIZ;
        C222588oQ c222588oQ = a1().LIZLLL;
        String str2 = null;
        if (c222588oQ != null && (baseFeedPageParams = c222588oQ.LJ) != null && (m89 = baseFeedPageParams.param) != null) {
            str = m89.getFrom();
        } else {
            str = null;
        }
        if (c215178cT.LJIILJJIL(str)) {
            return;
        }
        if (((Number) C211998Tr.LIZ.getValue()).intValue() == 1 && C2304092m.LIZ()) {
            return;
        }
        C222588oQ c222588oQ2 = a1().LIZLLL;
        if (c222588oQ2 != null) {
            str2 = c222588oQ2.LJIIIZ;
        }
        if (o.LJ(str2, "story_archive") || (immersiveGestureMonitor = this.LL) == null) {
            return;
        }
        immersiveGestureMonitor.setEventListener$story_release(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ImmersiveGestureMonitor immersiveGestureMonitor;
        o.LJIIIZ(view, "view");
        if (view instanceof ImmersiveGestureMonitor) {
            immersiveGestureMonitor = (ImmersiveGestureMonitor) view;
        } else {
            immersiveGestureMonitor = null;
        }
        this.LL = immersiveGestureMonitor;
    }
}
