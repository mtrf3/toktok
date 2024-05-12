package com.ss.android.ugc.aweme.story.feed.common.newarch.sub.component;

import X.C221138m5;
import X.C222588oQ;
import X.C2301791p;
import X.C2304092m;
import X.C55096Ljo;
import X.C8OB;
import X.C91M;
import X.C92D;
import X.InterfaceC222528oK;
import X.InterfaceC55235Lm3;
import X.KR8;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAbility;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.story.feed.common.newarch.sub.ability.StoryLongPressAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.sub.ability.StoryLongPressMonitorAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryLongPressComponent extends BaseCellSlotComponent<StoryLongPressComponent> implements StoryLongPressAbility {
    public final C221138m5 LLFII;
    public final C221138m5 LLFZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.cow;
    }

    public StoryLongPressComponent() {
        new LinkedHashMap();
        this.LLFII = KR8.LJIIJJI(new AqS153S0100000_3(this, 932));
        this.LLFZ = KR8.LJIIJJI(new AqS153S0100000_3(this, 933));
    }

    @Override // X.InterfaceC222528oK
    public final boolean U() {
        EdgeSpeedupAbility edgeSpeedupAbility;
        InterfaceC222528oK interfaceC222528oK = (InterfaceC222528oK) this.LLFZ.getValue();
        if (interfaceC222528oK != null) {
            return interfaceC222528oK.U();
        }
        if (C8OB.LIZ() && (edgeSpeedupAbility = (EdgeSpeedupAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), EdgeSpeedupAbility.class, null)) != null && edgeSpeedupAbility.sM()) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void Z3() {
        InterfaceC55235Lm3 interfaceC55235Lm3 = (InterfaceC55235Lm3) this.LLFII.getValue();
        if (interfaceC55235Lm3 != null) {
            C55096Ljo.LJIILL(interfaceC55235Lm3, StoryLongPressAbility.class, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.feed.common.newarch.sub.ability.StoryLongPressAbility
    public final LongPressLayout ju() {
        if (!this.LJLLL) {
            return null;
        }
        View Y3 = Y3();
        if (!(Y3 instanceof LongPressLayout)) {
            return null;
        }
        return (LongPressLayout) Y3;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (X.C53578L1a.LIZ() == false) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.92D] */
    @Override // X.C8XO
    /* renamed from: F0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q4(com.ss.android.ugc.aweme.feed.model.VideoItemParams r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r5 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r5
            java.lang.String r0 = "item"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            android.view.View r2 = r4.Y3()
            boolean r0 = r2 instanceof com.ss.android.ugc.aweme.feed.ui.LongPressLayout
            r3 = 0
            if (r0 == 0) goto L14
            com.ss.android.ugc.aweme.feed.ui.LongPressLayout r2 = (com.ss.android.ugc.aweme.feed.ui.LongPressLayout) r2
            if (r2 != 0) goto L15
        L14:
            return
        L15:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.getAweme()
            boolean r0 = r0.isScheduleVideo()
            if (r0 != 0) goto L5c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.getAweme()
            boolean r0 = X.ONM.LJI(r0)
            if (r0 != 0) goto L5c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.getAweme()
            boolean r0 = r0.isReferralFakeAweme()
            if (r0 != 0) goto L5c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.getAweme()
            boolean r0 = X.C54838Lfe.LJIJ(r0)
            if (r0 == 0) goto L48
            X.L1a r0 = X.C53578L1a.LIZ
            r0.getClass()
            boolean r0 = X.C53578L1a.LIZ()
            if (r0 != 0) goto L5c
        L48:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.getAweme()
            boolean r0 = X.C54838Lfe.LJJI(r0)
            if (r0 == 0) goto L60
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.getAweme()
            boolean r0 = r0.isProhibited()
            if (r0 == 0) goto L60
        L5c:
            r2.setListener(r3)
            goto L14
        L60:
            X.YAp r0 = X.C86951YAp.LIZIZ
            boolean r0 = r0.LJ()
            if (r0 == 0) goto L85
            X.8O4 r0 = r4.a1()
            X.8oQ r0 = r0.LIZLLL
            if (r0 == 0) goto L83
            java.lang.String r1 = r0.LJIIIZ
        L72:
            java.lang.String r0 = "offline_mode_page"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L85
            X.8oM r0 = new X.8oM
            r0.<init>()
            r2.setListener(r0)
            goto L14
        L83:
            r1 = r3
            goto L72
        L85:
            X.8O4 r0 = r4.a1()
            X.8oQ r0 = r0.LIZLLL
            if (r0 == 0) goto L91
            X.92D r0 = r0.LJIIIIZZ
            if (r0 != 0) goto La8
        L91:
            android.content.Context r1 = r4.getContext()
            X.8O4 r0 = r4.a1()
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r0 = r0.LJ
            if (r0 != 0) goto La2
        L9d:
            r2.setListener(r3)
            goto L14
        La2:
            X.91p r3 = new X.91p
            r3.<init>(r1, r0)
            goto L9d
        La8:
            r3 = r0
            goto L9d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.common.newarch.sub.component.StoryLongPressComponent.q4(java.lang.Object):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C92D c2301791p;
        View.OnTouchListener onTouchListener;
        StoryLongPressMonitorComponent storyLongPressMonitorComponent;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (!(view instanceof LongPressLayout)) {
            return;
        }
        LongPressLayout longPressLayout = (LongPressLayout) view;
        C222588oQ c222588oQ = a1().LIZLLL;
        if (c222588oQ == null || (c2301791p = c222588oQ.LJIIIIZZ) == null) {
            Context context = getContext();
            BaseFeedPageParams baseFeedPageParams = a1().LJ;
            if (baseFeedPageParams == null) {
                c2301791p = null;
            } else {
                c2301791p = new C2301791p(context, baseFeedPageParams);
            }
        }
        longPressLayout.setListener(c2301791p);
        C222588oQ c222588oQ2 = a1().LIZLLL;
        if (c222588oQ2 != null) {
            onTouchListener = c222588oQ2.LIZLLL;
        } else {
            onTouchListener = null;
        }
        longPressLayout.setTapListener(onTouchListener);
        if (C91M.LIZ() > 0) {
            longPressLayout.setTimeInterval(C91M.LIZ());
        }
        if (C8OB.LIZ() || C2304092m.LIZ()) {
            longPressLayout.setLongPressInterceptor(this);
        }
        StoryLongPressMonitorAbility storyLongPressMonitorAbility = (StoryLongPressMonitorAbility) this.LLFZ.getValue();
        if (storyLongPressMonitorAbility != null) {
            storyLongPressMonitorComponent = storyLongPressMonitorAbility.pv();
        } else {
            storyLongPressMonitorComponent = null;
        }
        longPressLayout.setLongPressMonitor(storyLongPressMonitorComponent);
        InterfaceC55235Lm3 interfaceC55235Lm3 = (InterfaceC55235Lm3) this.LLFII.getValue();
        if (interfaceC55235Lm3 != null) {
            C55096Ljo.LJIIJJI(interfaceC55235Lm3, this, StoryLongPressAbility.class, null);
        }
    }
}
