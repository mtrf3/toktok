package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.feed.platform.panel.RootPanelComponent;
import com.ss.android.ugc.feed.platform.panel.player.PlayerPanelComponent;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KR8 {
    public static final ActivityC45651qj LIZ(PlayerPanelComponent playerPanelComponent) {
        o.LJIIIZ(playerPanelComponent, "<this>");
        try {
            return C212428Vi.LIZ(playerPanelComponent);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        if (r0 == null) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.feed.platform.panel.RootPanelComponent LIZIZ(androidx.fragment.app.Fragment r8) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            X.1qj r0 = r8.mo49getActivity()
            r6 = 0
            if (r0 != 0) goto Ld
        Lc:
            return r6
        Ld:
            com.bytedance.assem.arch.core.AssemSupervisor r7 = X.C212428Vi.LIZIZ(r8)
            r5 = 12
            java.lang.String r4 = "LComponentError"
            if (r7 != 0) goto L7b
            X.1qj r1 = r8.requireActivity()
            java.lang.String r0 = "requireActivity()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            com.bytedance.assem.arch.core.Assembler r2 = X.C7EG.LIZ(r1)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "getRootPanelComponent()>>> fragment:"
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ",state:"
            r1.append(r0)
            androidx.lifecycle.Lifecycle r0 = r8.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
            r1.append(r0)
            java.lang.String r0 = ", container:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C60392Yp.LIZ(r4, r0, r5)
        L4f:
            r0 = r6
        L50:
            boolean r1 = r0 instanceof X.KR7
            if (r1 != 0) goto L78
            r0 = r6
        L55:
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r1 = "getRootPanelComponent()>>> assems:"
            r2.append(r1)
            if (r7 == 0) goto L6c
            java.util.concurrent.CopyOnWriteArrayList<X.8W0> r1 = r7.LJLLI
            if (r1 == 0) goto L6c
            int r1 = r1.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
        L6c:
            r2.append(r6)
            java.lang.String r1 = X.X1D.LIZIZ(r2)
            X.C60392Yp.LIZ(r4, r1, r5)
        L76:
            r6 = r0
            goto Lc
        L78:
            if (r0 != 0) goto L76
            goto L55
        L7b:
            java.util.concurrent.CopyOnWriteArrayList<X.8W0> r0 = r7.LJLLI
            if (r0 == 0) goto L4f
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L88:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof com.ss.android.ugc.feed.platform.panel.RootPanelComponent
            if (r0 == 0) goto L88
            r3.add(r1)
            goto L88
        L9a:
            java.lang.Object r0 = X.ORZ.LJLLLL(r3)
            com.ss.android.ugc.feed.platform.panel.RootPanelComponent r0 = (com.ss.android.ugc.feed.platform.panel.RootPanelComponent) r0
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KR8.LIZIZ(androidx.fragment.app.Fragment):com.ss.android.ugc.feed.platform.panel.RootPanelComponent");
    }

    public static final KRA LIZJ(Fragment fragment) {
        o.LJIIIZ(fragment, "<this>");
        RootPanelComponent LIZLLL = LIZLLL(fragment);
        if (LIZLLL != null) {
            return LIZLLL.getPanelContext();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
    
        if (r0 == null) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.feed.platform.panel.RootPanelComponent LIZLLL(androidx.fragment.app.Fragment r8) {
        /*
            X.1qj r0 = r8.mo49getActivity()
            r6 = 0
            if (r0 != 0) goto L8
        L7:
            return r6
        L8:
            com.bytedance.assem.arch.core.AssemSupervisor r7 = X.C212428Vi.LIZIZ(r8)
            r5 = 12
            java.lang.String r4 = "LComponentError"
            if (r7 != 0) goto L76
            X.1qj r1 = r8.requireActivity()
            java.lang.String r0 = "requireActivity()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            com.bytedance.assem.arch.core.Assembler r2 = X.C7EG.LIZ(r1)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "getRootPanelComponent()>>> fragment:"
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ",state:"
            r1.append(r0)
            androidx.lifecycle.Lifecycle r0 = r8.getLifecycle()
            androidx.lifecycle.Lifecycle$State r0 = r0.getCurrentState()
            r1.append(r0)
            java.lang.String r0 = ", container:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C60392Yp.LIZ(r4, r0, r5)
        L4a:
            r0 = r6
        L4b:
            boolean r1 = r0 instanceof com.ss.android.ugc.feed.platform.panel.RootPanelComponent
            if (r1 != 0) goto L73
            r0 = r6
        L50:
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r1 = "getRootPanelComponent()>>> assems:"
            r2.append(r1)
            if (r7 == 0) goto L67
            java.util.concurrent.CopyOnWriteArrayList<X.8W0> r1 = r7.LJLLI
            if (r1 == 0) goto L67
            int r1 = r1.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
        L67:
            r2.append(r6)
            java.lang.String r1 = X.X1D.LIZIZ(r2)
            X.C60392Yp.LIZ(r4, r1, r5)
        L71:
            r6 = r0
            goto L7
        L73:
            if (r0 != 0) goto L71
            goto L50
        L76:
            java.util.concurrent.CopyOnWriteArrayList<X.8W0> r0 = r7.LJLLI
            if (r0 == 0) goto L4a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L83:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L95
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof com.ss.android.ugc.feed.platform.panel.RootPanelComponent
            if (r0 == 0) goto L83
            r3.add(r1)
            goto L83
        L95:
            java.lang.Object r0 = X.ORZ.LJLLLL(r3)
            com.ss.android.ugc.feed.platform.panel.RootPanelComponent r0 = (com.ss.android.ugc.feed.platform.panel.RootPanelComponent) r0
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KR8.LIZLLL(androidx.fragment.app.Fragment):com.ss.android.ugc.feed.platform.panel.RootPanelComponent");
    }

    public static final C87293bh LJ(Fragment fragment) {
        if (fragment == null) {
            return null;
        }
        ActivityC45651qj requireActivity = fragment.requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        C7C3 jv0 = C7EG.LIZ(requireActivity).jv0(fragment);
        if (jv0 == null) {
            return null;
        }
        return (C87293bh) jv0.LIZIZ(C87293bh.class, null);
    }

    public static final InterfaceC55235Lm3 LJFF(Fragment fragment) {
        RootPanelComponent LIZLLL;
        o.LJIIIZ(fragment, "<this>");
        if (fragment.mo49getActivity() == null) {
            C60392Yp.LIZ("LComponentError", "getRootScope()>>> activity==null", 12);
        }
        if (fragment.mo49getActivity() == null || (LIZLLL = LIZLLL(fragment)) == null) {
            return null;
        }
        return C55096Ljo.LJIIZILJ(LIZLLL);
    }

    public static final void LJIIIIZZ(Fragment fragment) {
        o.LJIIIZ(fragment, "<this>");
        if (fragment.mo49getActivity() == null) {
            return;
        }
        C8VV.LIZ(fragment, true, new AqS174S0100000_8(fragment, 267));
        C55230Lly.LIZ(fragment, null);
        C8VV.LIZ(fragment, true, new AqS174S0100000_8(fragment, 268));
    }

    public static final boolean LJIIIZ(C8W0 c8w0) {
        o.LJIIIZ(c8w0, "<this>");
        if (c8w0.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return true;
        }
        return false;
    }

    public static final <T> C221138m5<T> LJIIJJI(InterfaceC65784Pro<? extends T> initializer) {
        o.LJIIIZ(initializer, "initializer");
        return new C221138m5<>(EnumC221088m0.SYNCHRONIZED, initializer, null);
    }

    public static final void LJI(int i, Fragment fragment) {
        o.LJIIIZ(fragment, "<this>");
        RootPanelComponent LIZLLL = LIZLLL(fragment);
        if (LIZLLL != null) {
            LIZLLL.onPagePause(i);
        }
    }

    public static final void LJII(int i, Fragment fragment) {
        o.LJIIIZ(fragment, "<this>");
        RootPanelComponent LIZLLL = LIZLLL(fragment);
        if (LIZLLL != null) {
            LIZLLL.onPageResume(i);
        }
    }

    public static final void LJIIJ(C8W0 c8w0, InterfaceC88471Ynr<? super InterfaceC70422pa, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88471Ynr) {
        o.LJIIIZ(c8w0, "<this>");
        LifecycleOwnerKt.getLifecycleScope(c8w0).launchWhenStarted(new C68232m3(c8w0, interfaceC88471Ynr, null));
    }
}
