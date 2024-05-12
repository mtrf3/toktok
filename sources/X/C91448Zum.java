package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.dsp.playpage.s2s.S2SReportViewModel;
import com.ss.android.ugc.aweme.music.model.TTMStoreLink;

/* renamed from: X.Zum, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91448Zum<T> implements InterfaceC64592gB {
    public final /* synthetic */ S2SReportViewModel LJLIL;
    public final /* synthetic */ Fragment LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ TTMStoreLink LJLJJL;

    public C91448Zum(S2SReportViewModel s2SReportViewModel, Fragment fragment, Context context, String str, TTMStoreLink tTMStoreLink) {
        this.LJLIL = s2SReportViewModel;
        this.LJLILLLLZI = fragment;
        this.LJLJI = context;
        this.LJLJJI = str;
        this.LJLJJL = tTMStoreLink;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0039, code lost:
    
        r10 = false;
     */
    @Override // X.InterfaceC64592gB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void accept(java.lang.Object r12) {
        /*
            r11 = this;
            com.ss.android.ugc.aweme.dsp.playpage.s2s.S2SReportViewModel r4 = r11.LJLIL
            androidx.fragment.app.Fragment r9 = r11.LJLILLLLZI
            android.content.Context r6 = r11.LJLJI
            java.lang.String r3 = r11.LJLJJI
            com.ss.android.ugc.aweme.music.model.TTMStoreLink r5 = r11.LJLJJL
            r4.getClass()
            if (r9 == 0) goto L15
            X.1qj r1 = r9.mo49getActivity()
            if (r1 != 0) goto L16
        L15:
            return
        L16:
            r0 = 0
            com.ss.android.ugc.aweme.services.IMainService r0 = com.ss.android.ugc.aweme.services.MainServiceImpl.createIMainServicebyMonsterPlugin(r0)
            boolean r0 = r0.isMainPage(r1)
            r7 = 1
            if (r0 == 0) goto L30
            X.7b0 r0 = com.bytedance.hox.Hox.LJLLI
            com.bytedance.hox.Hox r1 = r0.LIZ(r1)
            java.lang.String r0 = "HOME"
            boolean r0 = r1.vv0(r0)
            if (r0 == 0) goto L44
        L30:
            r8 = 1
        L31:
            r1 = r9
        L32:
            boolean r0 = r1.getUserVisibleHint()
            if (r0 != r7) goto L42
            r10 = 1
        L39:
            androidx.fragment.app.Fragment r1 = r1.getParentFragment()
            if (r1 == 0) goto L46
            if (r10 == 0) goto L42
            goto L32
        L42:
            r10 = 0
            goto L39
        L44:
            r8 = 0
            goto L31
        L46:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "isHomeSelected:"
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ",fragment.lifecycle.currentState:"
            r1.append(r0)
            androidx.lifecycle.Lifecycle r0 = r9.getLifecycle()
            r2 = 0
            if (r0 == 0) goto Lac
            androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
        L62:
            r1.append(r0)
            java.lang.String r0 = ",successIdSet.contains.not: "
            r1.append(r0)
            X.Ppd<java.lang.String> r0 = r4.LJLILLLLZI
            boolean r0 = r0.contains(r3)
            r0 = r0 ^ 1
            r1.append(r0)
            java.lang.String r0 = ",id:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ",this:"
            r1.append(r0)
            int r0 = r4.hashCode()
            r1.append(r0)
            X.X1D.LIZIZ(r1)
            if (r10 == 0) goto L15
            if (r8 == 0) goto L15
            androidx.lifecycle.Lifecycle r0 = r9.getLifecycle()
            androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
            if (r1 == 0) goto L15
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r0 = r1.isAtLeast(r0)
            if (r0 != r7) goto L15
            X.Ppd<java.lang.String> r0 = r4.LJLILLLLZI
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto Lae
            goto L15
        Lac:
            r0 = r2
            goto L62
        Lae:
            X.SVA r1 = X.SVA.RESSO
            X.SVG r0 = X.SVG.SHOW
            X.3kP r1 = X.SVF.LJIIL(r1, r6, r5, r2, r0)
            X.Sq2 r0 = r4.LJLIL
            r0.LIZ(r1)
            X.Ppd<java.lang.String> r0 = r4.LJLILLLLZI
            r0.add(r3)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91448Zum.accept(java.lang.Object):void");
    }
}
