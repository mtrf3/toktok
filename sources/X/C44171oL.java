package X;

import com.bytedance.android.livesdk.livesetting.broadcast.EffectParseOptSetting;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.1oL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44171oL extends C1TT {
    public final String LJLJI;
    public final boolean LJLJJI;
    public final EffectManager LJLJJL;
    public final C07500Re LJLJJLL;
    public final CopyOnWriteArrayList<C1QC> LJLJL;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C44171oL(int r3) {
        /*
            r2 = this;
            java.lang.String r1 = X.C0TY.LIZLLL
            java.lang.String r0 = "SMALL_ITEM_BEAUTY_PANEL"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r0 = 1
            r2.<init>(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44171oL.<init>(int):void");
    }

    public final Object LJ(InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        boolean z;
        final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        C15380j0.LIZLLL();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            C0TX.LIZ.LIZJ("SmallItemBeauty");
            C0NB.LIZIZ("effect_log", C0TX.LIZ("try to check need update small beauty."));
            C0TX.LIZLLL = "";
            this.LJLJJL.checkedEffectListUpdate(this.LJLJI, new ICheckChannelListener() { // from class: X.1dF
                @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                public final void checkChannelFailed(ExceptionResult exceptionResult) {
                    C0TX.LIZ.LIZJ("SmallItemBeauty");
                    C0TX.LIZIZ("small beauty check need update effect fail");
                    InterfaceC67352kd<Boolean> interfaceC67352kd2 = c84654XKg;
                    Boolean bool = Boolean.FALSE;
                    C3C5.m7constructorimpl(bool);
                    interfaceC67352kd2.resumeWith(bool);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
                public final void checkChannelSuccess(boolean z2) {
                    C0TX.LIZ.LIZJ("SmallItemBeauty");
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("small beauty check need update effect, result: ");
                    LIZ.append(z2);
                    C0TX.LIZIZ(X1D.LIZIZ(LIZ));
                    Boolean valueOf = Boolean.valueOf(z2);
                    InterfaceC67352kd<Boolean> interfaceC67352kd2 = c84654XKg;
                    C3C5.m7constructorimpl(valueOf);
                    interfaceC67352kd2.resumeWith(valueOf);
                }
            });
        } else {
            Boolean bool = Boolean.FALSE;
            C3C5.m7constructorimpl(bool);
            c84654XKg.resumeWith(bool);
        }
        return c84654XKg.LIZ();
    }

    public final Object LJFF(InterfaceC67352kd<? super List<C1QC>> interfaceC67352kd) {
        if (EffectParseOptSetting.enableOpt()) {
            return LJI(interfaceC67352kd);
        }
        final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        EffectManager effectManager = this.LJLJJL;
        String str = this.LJLJI;
        final CopyOnWriteArrayList<C1QC> copyOnWriteArrayList = this.LJLJL;
        final boolean z = this.LJLJJI;
        effectManager.fetchEffectListFromCache(str, new IFetchEffectChannelListener(copyOnWriteArrayList, c84654XKg, z) { // from class: X.1oK
            public final InterfaceC67352kd<List<C1QC>> LIZ;
            public final List<C1QC> LIZIZ;
            public final boolean LIZJ;

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                InterfaceC67352kd<List<C1QC>> interfaceC67352kd2 = this.LIZ;
                C61878OQg c61878OQg = C61878OQg.INSTANCE;
                C3C5.m7constructorimpl(c61878OQg);
                interfaceC67352kd2.resumeWith(c61878OQg);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                C37251dB c37251dB = new C37251dB(this.LIZJ);
                List<C1QC> LJIIJJI = new C37211d7(this.LIZJ).LJIIJJI(effectChannelResponse);
                c37251dB.LJIIZILJ(LJIIJJI);
                if (!((ArrayList) LJIIJJI).isEmpty()) {
                    List<C1QC> list = this.LIZIZ;
                    list.clear();
                    list.addAll(LJIIJJI);
                }
                InterfaceC67352kd<List<C1QC>> interfaceC67352kd2 = this.LIZ;
                C3C5.m7constructorimpl(LJIIJJI);
                interfaceC67352kd2.resumeWith(LJIIJJI);
            }

            {
                o.LJIIIZ(copyOnWriteArrayList, "effectPanelList");
                this.LIZ = c84654XKg;
                this.LIZIZ = copyOnWriteArrayList;
                this.LIZJ = z;
            }
        });
        return c84654XKg.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.InterfaceC67352kd<? super java.util.List<X.C1QC>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C532727f
            if (r0 == 0) goto L6f
            r5 = r7
            X.27f r5 = (X.C532727f) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6f
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r4 = r5.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r2 = 1
            if (r0 == 0) goto L4f
            if (r0 != r2) goto L75
            X.1oL r3 = r5.LJLIL
            X.C141335gf.LIZJ(r4)
        L22:
            com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r4 = (com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse) r4
            X.1dB r2 = new X.1dB
            boolean r0 = r3.LJLJJI
            r2.<init>(r0)
            X.1d7 r1 = new X.1d7
            boolean r0 = r3.LJLJJI
            r1.<init>(r0)
            java.util.List r1 = r1.LJIIJJI(r4)
            r2.LJIIZILJ(r1)
            r0 = r1
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L4e
            java.util.concurrent.CopyOnWriteArrayList<X.1QC> r0 = r3.LJLJL
            r0.clear()
            java.util.concurrent.CopyOnWriteArrayList<X.1QC> r0 = r3.LJLJL
            r0.addAll(r1)
        L4e:
            return r1
        L4f:
            X.C141335gf.LIZJ(r4)
            X.0TX r1 = X.C0TX.LIZ
            java.lang.String r0 = "SmallItemBeauty"
            r1.LIZJ(r0)
            java.lang.String r0 = "performing fetch local's small beauty data."
            X.C0TX.LIZLLL(r0)
            X.0Re r1 = r6.LJLJJLL
            java.lang.String r0 = r6.LJLJI
            r5.LJLIL = r6
            r5.LJLJJI = r2
            java.lang.Object r4 = r1.LJ(r0, r5)
            if (r4 != r3) goto L6d
            return r3
        L6d:
            r3 = r6
            goto L22
        L6f:
            X.27f r5 = new X.27f
            r5.<init>(r6, r7)
            goto L12
        L75:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44171oL.LJI(X.2kd):java.lang.Object");
    }

    public final Object LJII(InterfaceC67352kd<? super List<C1QC>> interfaceC67352kd) {
        if (EffectParseOptSetting.enableOpt()) {
            return LJIIIIZZ(interfaceC67352kd);
        }
        final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        final long currentTimeMillis = System.currentTimeMillis();
        this.LJLJJL.fetchEffectList(this.LJLJI, false, new IFetchEffectChannelListener() { // from class: X.1oM
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                C44171oL c44171oL = C44171oL.this;
                long j = currentTimeMillis;
                InterfaceC67352kd<List<C1QC>> interfaceC67352kd2 = c84654XKg;
                c44171oL.getClass();
                List<C1QC> LJIIIZ = c44171oL.LJIIIZ(j, null);
                C3C5.m7constructorimpl(LJIIIZ);
                interfaceC67352kd2.resumeWith(LJIIIZ);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                C44171oL c44171oL = C44171oL.this;
                long j = currentTimeMillis;
                InterfaceC67352kd<List<C1QC>> interfaceC67352kd2 = c84654XKg;
                c44171oL.getClass();
                List<C1QC> LJIIIZ = c44171oL.LJIIIZ(j, effectChannelResponse);
                C3C5.m7constructorimpl(LJIIIZ);
                interfaceC67352kd2.resumeWith(LJIIIZ);
            }
        });
        return c84654XKg.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.InterfaceC67352kd<? super java.util.List<X.C1QC>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C532827g
            if (r0 == 0) goto L51
            r6 = r8
            X.27g r6 = (X.C532827g) r6
            int r2 = r6.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r6.LJLJJL = r2
        L12:
            java.lang.Object r1 = r6.LJLJI
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJL
            r4 = 1
            if (r0 == 0) goto L2b
            if (r0 != r4) goto L57
            long r2 = r6.LJLILLLLZI
            X.1oL r0 = r6.LJLIL
            X.C141335gf.LIZJ(r1)
        L24:
            com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r1 = (com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse) r1
            java.util.List r0 = r0.LJIIIZ(r2, r1)
            return r0
        L2b:
            X.C141335gf.LIZJ(r1)
            long r2 = java.lang.System.currentTimeMillis()
            X.0TX r1 = X.C0TX.LIZ
            java.lang.String r0 = "SmallItemBeauty"
            r1.LIZJ(r0)
            java.lang.String r0 = "performing fetch remote's small beauty data."
            X.C0TX.LIZLLL(r0)
            X.0Re r1 = r7.LJLJJLL
            java.lang.String r0 = r7.LJLJI
            r6.LJLIL = r7
            r6.LJLILLLLZI = r2
            r6.LJLJJL = r4
            java.lang.Object r1 = r1.LIZLLL(r0, r6)
            if (r1 != r5) goto L4f
            return r5
        L4f:
            r0 = r7
            goto L24
        L51:
            X.27g r6 = new X.27g
            r6.<init>(r7, r8)
            goto L12
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44171oL.LJIIIIZZ(X.2kd):java.lang.Object");
    }

    @Override // X.C0WM
    public final List<C1QC> LJIIJJI(EffectChannelResponse effectChannelResponse) {
        return new C37211d7(this.LJLJJI).LJIIJJI(effectChannelResponse);
    }

    public C44171oL(String panelName, boolean z) {
        o.LJIIIZ(panelName, "panelName");
        this.LJLJI = panelName;
        this.LJLJJI = z;
        EffectManager LJLJJLL = ((IHostCreativeTool) CN1.LIZ(IHostCreativeTool.class)).LJLJJLL();
        o.LJIIIIZZ(LJLJJLL, "getService(IHostCreative…class.java).effectManager");
        this.LJLJJL = LJLJJLL;
        this.LJLJJLL = new C07500Re();
        this.LJLJL = new CopyOnWriteArrayList<>();
    }

    public final List<C1QC> LJIIIZ(long j, EffectChannelResponse effectChannelResponse) {
        C37251dB c37251dB = new C37251dB(this.LJLJJI);
        List<C1QC> LJIIJJI = new C37211d7(this.LJLJJI).LJIIJJI(effectChannelResponse);
        c37251dB.LJIIZILJ(LJIIJJI);
        if (!LJIIJJI.isEmpty()) {
            this.LJLJL.clear();
            this.LJLJL.addAll(LJIIJJI);
            LJIIJ(j, true);
        } else {
            LJIIJ(j, false);
        }
        return LJIIJJI;
    }

    public final void LJIIJ(long j, boolean z) {
        String str = "done";
        if (this.LJLJJI) {
            BZI LIZ = C28787BRn.LIZ("livesdk_live_beauty_panel_download");
            LIZ.LJIIZILJ();
            LIZ.LJIJJ(Long.valueOf(System.currentTimeMillis() - j), "duration");
            if (!z) {
                str = "failed";
            }
            LIZ.LJIJJ(str, "status");
            LIZ.LJJIIJZLJL();
            return;
        }
        BZI LIZ2 = C28787BRn.LIZ("livesdk_guest_connection_beauty_panel_download");
        LIZ2.LJIIZILJ();
        LIZ2.LJIJJ(Long.valueOf(System.currentTimeMillis() - j), "duration");
        if (!z) {
            str = "failed";
        }
        LIZ2.LJIJJ(str, "status");
        LIZ2.LJJIFFI(C42151l5.LJIIL);
        LIZ2.LJJIIJZLJL();
    }
}
