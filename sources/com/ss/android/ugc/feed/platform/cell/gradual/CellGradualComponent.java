package com.ss.android.ugc.feed.platform.cell.gradual;

import X.AnonymousClass843;
import X.AnonymousClass948;
import X.C210498Nx;
import X.C214348b8;
import X.C222588oQ;
import X.C223508pu;
import X.C2K0;
import X.C55096Ljo;
import X.C5H3;
import X.C65352Pkq;
import X.C79057V0z;
import X.C8MM;
import X.InterfaceC223528pw;
import X.InterfaceC2302191t;
import X.InterfaceC55102Lju;
import Y.ARunnableS22S0200000_3;
import Y.ARunnableS39S0100000_3;
import Y.IDTListenerS113S0100000_3;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.cell.gradual.CellGradualComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS28S0001000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CellGradualComponent extends BaseCellContentComponent implements CellGradualAbility, InterfaceC55102Lju {
    public View LL;
    public View LLD;
    public View LLF;
    public boolean LLFF;
    public final C5H3 LLFFF;
    public final GradientDrawable LLFII;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -2065189638) {
            return null;
        }
        return this;
    }

    public CellGradualComponent() {
        new LinkedHashMap();
        this.LLFFF = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C210498Nx.INSTANCE);
        this.LLFII = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{771751936, 0});
    }

    @Override // com.ss.android.ugc.feed.platform.cell.gradual.CellGradualAbility
    public final void XM() {
        InterfaceC2302191t interfaceC2302191t;
        if (this.LLFF) {
            return;
        }
        this.LLFF = true;
        C222588oQ c222588oQ = a1().LIZLLL;
        if (c222588oQ != null && (interfaceC2302191t = c222588oQ.LJFF) != null) {
            GestureDetector gestureDetector = new GestureDetector(getContext(), new C223508pu(interfaceC2302191t, new InterfaceC223528pw() { // from class: X.8ps
                @Override // X.InterfaceC223528pw
                public final void LIZ(int i) {
                    AssemViewModel assemViewModel = (AssemViewModel) CellGradualComponent.this.LLFFF.getValue();
                    assemViewModel.getClass();
                    assemViewModel.setState(new AqS28S0001000_3(i, 24));
                }
            }, new ARunnableS39S0100000_3(this, 116), new AqS169S0100000_3(this, 552)));
            View view = this.LLF;
            if (view != null) {
                view.setOnTouchListener(new IDTListenerS113S0100000_3(gestureDetector, 15));
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.gradual.CellGradualAbility
    public final boolean zw() {
        View view = this.LLF;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b7, code lost:
    
        if (r1.equals("cell_story_photo") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ce, code lost:
    
        if (r4.getAweme().getStoryType() != 2) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d0, code lost:
    
        r0 = r3.LLD;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d2, code lost:
    
        if (r0 != null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d6, code lost:
    
        r0.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c1, code lost:
    
        if (r1.equals("cell_story_video") == false) goto L4;
     */
    @Override // X.C8XO
    /* renamed from: F0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q4(com.ss.android.ugc.aweme.feed.model.VideoItemParams r4) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r4 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r4
            java.lang.String r0 = "item"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            X.8O4 r0 = r3.a1()
            java.lang.String r1 = r0.LIZ()
            int r0 = r1.hashCode()
            r2 = 8
            switch(r0) {
                case -1490904626: goto L72;
                case -1003629608: goto L94;
                case 1006449419: goto Lb1;
                case 1012009300: goto Lbb;
                default: goto L18;
            }
        L18:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r4.getAweme()
            java.lang.String r0 = "item.aweme"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            boolean r0 = X.C210018Mb.LIZIZ(r1)
            if (r0 == 0) goto L45
            android.view.View r1 = r3.LL
            if (r1 == 0) goto L31
            r0 = 2131231992(0x7f0804f8, float:1.808008E38)
            r1.setBackgroundResource(r0)
        L31:
            android.view.View r0 = r3.LL
            if (r0 == 0) goto L3b
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 != 0) goto L3c
        L3b:
            return
        L3c:
            r0 = 256(0x100, float:3.59E-43)
            int r0 = X.C7MY.LIZIZ(r0)
            r1.height = r0
            goto L3b
        L45:
            boolean r0 = X.C223498pt.LIZ
            if (r0 == 0) goto L5e
            android.view.View r1 = r3.LL
            if (r1 != 0) goto L58
        L4d:
            android.view.View r0 = r3.LL
            if (r0 == 0) goto L3b
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 != 0) goto L69
            goto L3b
        L58:
            android.graphics.drawable.GradientDrawable r0 = r3.LLFII
            r1.setBackground(r0)
            goto L4d
        L5e:
            android.view.View r1 = r3.LL
            if (r1 == 0) goto L4d
            r0 = 2131231991(0x7f0804f7, float:1.8080079E38)
            r1.setBackgroundResource(r0)
            goto L4d
        L69:
            r0 = 1124597760(0x43080000, float:136.0)
            int r0 = X.C278817o.LIZ(r0)
            r1.height = r0
            goto L3b
        L72:
            java.lang.String r0 = "cell_detail"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L18
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r0 = r4.baseFeedPageParams
            if (r0 == 0) goto L18
            X.M89 r0 = r0.param
            if (r0 == 0) goto L18
            boolean r1 = r0.isFromDuetModeOrDuetModeDetail()
            r0 = 1
            if (r1 != r0) goto L18
            android.view.View r1 = r3.LL
            if (r1 == 0) goto L18
            r0 = 2131231948(0x7f0804cc, float:1.8079991E38)
            r1.setBackgroundResource(r0)
            goto L18
        L94:
            java.lang.String r0 = "cell_story"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L9e
            goto L18
        L9e:
            android.view.View r0 = r3.LL
            if (r0 != 0) goto La8
        La2:
            android.view.View r0 = r3.LLD
            if (r0 != 0) goto Lac
            goto L18
        La8:
            r0.setVisibility(r2)
            goto La2
        Lac:
            r0.setVisibility(r2)
            goto L18
        Lb1:
            java.lang.String r0 = "cell_story_photo"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto Lc5
            goto L18
        Lbb:
            java.lang.String r0 = "cell_story_video"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto Lc5
            goto L18
        Lc5:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.getAweme()
            int r1 = r0.getStoryType()
            r0 = 2
            if (r1 != r0) goto L18
            android.view.View r0 = r3.LLD
            if (r0 != 0) goto Ld6
            goto L18
        Ld6:
            r0.setVisibility(r2)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.feed.platform.cell.gradual.CellGradualComponent.q4(java.lang.Object):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.gradual.CellGradualAbility
    public final void da(boolean z) {
        float f;
        View view;
        View view2;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        if (AnonymousClass843.LIZLLL()) {
            View view3 = this.LLF;
            if (view3 == null || view3.getVisibility() != 0 || (view2 = this.LLF) == null) {
                return;
            }
            view2.setAlpha(f);
            return;
        }
        View view4 = this.LLD;
        if (view4 == null || view4.getVisibility() != 0 || (view = this.LLD) == null) {
            return;
        }
        view.setAlpha(f);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.KUK
    public final void eventInit(C8MM c8mm) {
        c8mm.LIZ("event_enter_dislike_mode", new AqS169S0100000_3(this, 549));
        c8mm.LIZ("event_downgrade_view_opt", new AqS169S0100000_3(this, 550));
        c8mm.LIZ("event_enter_clear_mode", new AqS169S0100000_3(this, 551));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LL = view.findViewById(R.id.gradual_top);
        this.LLD = view.findViewById(R.id.gradual_bottom);
        this.LLF = view.findViewById(R.id.dy6);
        View view2 = this.LL;
        if (view2 != null) {
            C79057V0z.LJJJ(view2, new ARunnableS22S0200000_3(view2, this, 25));
        }
        AnonymousClass948.LIZ(this.LLD);
    }
}
