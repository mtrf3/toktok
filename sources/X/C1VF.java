package X;

import com.bytedance.android.livesdk.livesetting.broadcast.EffectParseOptSetting;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.1VF, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1VF implements InterfaceC14130gz<C1QC> {
    public final EffectManager LJLIL;
    public final CopyOnWriteArrayList<C1QC> LJLILLLLZI;
    public final C07500Re LJLJI;

    public C1VF() {
        EffectManager LJLJJLL = ((IHostCreativeTool) CN1.LIZ(IHostCreativeTool.class)).LJLJJLL();
        o.LJIIIIZZ(LJLJJLL, "getService(IHostCreative…class.java).effectManager");
        this.LJLIL = LJLJJLL;
        this.LJLILLLLZI = new CopyOnWriteArrayList<>();
        this.LJLJI = new C07500Re();
    }

    public final Object LIZ(InterfaceC67352kd<? super List<C1QC>> interfaceC67352kd) {
        if (EffectParseOptSetting.enableOpt()) {
            return LIZIZ(interfaceC67352kd);
        }
        final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        if (!this.LJLILLLLZI.isEmpty()) {
            CopyOnWriteArrayList<C1QC> copyOnWriteArrayList = this.LJLILLLLZI;
            C3C5.m7constructorimpl(copyOnWriteArrayList);
            c84654XKg.resumeWith(copyOnWriteArrayList);
        } else {
            this.LJLILLLLZI.clear();
            this.LJLIL.fetchEffectListFromCache(C0TY.LIZ(), new IFetchEffectChannelListener() { // from class: X.1n1
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
                public final void onFail(ExceptionResult exceptionResult) {
                    InterfaceC67352kd<List<C1QC>> interfaceC67352kd2 = c84654XKg;
                    C61878OQg c61878OQg = C61878OQg.INSTANCE;
                    C3C5.m7constructorimpl(c61878OQg);
                    interfaceC67352kd2.resumeWith(c61878OQg);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                    C1VI c1vi = new C1VI();
                    List LJIIJJI = new C78857UxB().LJIIJJI(effectChannelResponse);
                    c1vi.LJIIZILJ(LJIIJJI);
                    C1VF.this.LJLILLLLZI.clear();
                    C1VF.this.LJLILLLLZI.addAll(LJIIJJI);
                    InterfaceC67352kd<List<C1QC>> interfaceC67352kd2 = c84654XKg;
                    C3C5.m7constructorimpl(LJIIJJI);
                    interfaceC67352kd2.resumeWith(LJIIJJI);
                }
            });
        }
        return c84654XKg.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC67352kd<? super java.util.List<X.C1QC>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C22O
            if (r0 == 0) goto L77
            r4 = r6
            X.22O r4 = (X.C22O) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L77
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r1 = r4.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r2 = 1
            if (r0 == 0) goto L48
            if (r0 != r2) goto L7d
            X.1VF r3 = r4.LJLIL
            X.C141335gf.LIZJ(r1)
        L22:
            com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r1 = (com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse) r1
            X.1VI r2 = new X.1VI
            r2.<init>()
            X.UxB r0 = new X.UxB
            r0.<init>()
            java.util.List r1 = r0.LJIIJJI(r1)
            r2.LJIIZILJ(r1)
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L47
            java.util.concurrent.CopyOnWriteArrayList<X.1QC> r0 = r3.LJLILLLLZI
            r0.clear()
            java.util.concurrent.CopyOnWriteArrayList<X.1QC> r0 = r3.LJLILLLLZI
            r0.addAll(r1)
        L47:
            return r1
        L48:
            X.C141335gf.LIZJ(r1)
            java.util.concurrent.CopyOnWriteArrayList<X.1QC> r0 = r5.LJLILLLLZI
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L58
            java.util.concurrent.CopyOnWriteArrayList<X.1QC> r0 = r5.LJLILLLLZI
            return r0
        L58:
            X.0TX r1 = X.C0TX.LIZ
            java.lang.String r0 = "ComposerFilter"
            r1.LIZJ(r0)
            java.lang.String r0 = "performing fetch local's composer data."
            X.C0TX.LIZLLL(r0)
            X.0Re r1 = r5.LJLJI
            java.lang.String r0 = X.C0TY.LIZ()
            r4.LJLIL = r5
            r4.LJLJJI = r2
            java.lang.Object r1 = r1.LJ(r0, r4)
            if (r1 != r3) goto L75
            return r3
        L75:
            r3 = r5
            goto L22
        L77:
            X.22O r4 = new X.22O
            r4.<init>(r5, r6)
            goto L12
        L7d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1VF.LIZIZ(X.2kd):java.lang.Object");
    }

    public final Object LIZJ(InterfaceC67352kd<? super List<C1QC>> interfaceC67352kd) {
        if (EffectParseOptSetting.enableOpt()) {
            return LIZLLL(interfaceC67352kd);
        }
        final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        EffectManager effectManager = this.LJLIL;
        String LIZ = C0TY.LIZ();
        final CopyOnWriteArrayList<C1QC> copyOnWriteArrayList = this.LJLILLLLZI;
        effectManager.fetchEffectList(LIZ, false, new IFetchEffectChannelListener(copyOnWriteArrayList, c84654XKg) { // from class: X.1n0
            public final InterfaceC67352kd LIZ;
            public final List LIZIZ;

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                Exception exc;
                InterfaceC67352kd interfaceC67352kd2 = this.LIZ;
                if (exceptionResult == null || (exc = exceptionResult.getException()) == null) {
                    exc = new Exception("unknown reason");
                }
                C3C4 LIZ2 = C141335gf.LIZ(exc);
                C3C5.m7constructorimpl(LIZ2);
                interfaceC67352kd2.resumeWith(LIZ2);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                C1VI c1vi = new C1VI();
                List LJIIJJI = new C78857UxB().LJIIJJI(effectChannelResponse);
                c1vi.LJIIZILJ(LJIIJJI);
                if (!LJIIJJI.isEmpty()) {
                    this.LIZIZ.clear();
                    this.LIZIZ.addAll(LJIIJJI);
                    InterfaceC67352kd interfaceC67352kd2 = this.LIZ;
                    C3C5.m7constructorimpl(LJIIJJI);
                    interfaceC67352kd2.resumeWith(LJIIJJI);
                    return;
                }
                InterfaceC67352kd interfaceC67352kd3 = this.LIZ;
                C3C4 LIZ2 = C141335gf.LIZ(new Exception("empty data from remote"));
                C3C5.m7constructorimpl(LIZ2);
                interfaceC67352kd3.resumeWith(LIZ2);
            }

            {
                o.LJIIIZ(copyOnWriteArrayList, "effectPanelList");
                this.LIZ = c84654XKg;
                this.LIZIZ = copyOnWriteArrayList;
            }
        });
        return c84654XKg.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC67352kd<? super java.util.List<X.C1QC>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C22P
            if (r0 == 0) goto L6a
            r4 = r6
            X.22P r4 = (X.C22P) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6a
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r1 = r4.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r2 = 1
            if (r0 == 0) goto L48
            if (r0 != r2) goto L70
            X.1VF r3 = r4.LJLIL
            X.C141335gf.LIZJ(r1)
        L22:
            com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse r1 = (com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse) r1
            X.1VI r2 = new X.1VI
            r2.<init>()
            X.UxB r0 = new X.UxB
            r0.<init>()
            java.util.List r1 = r0.LJIIJJI(r1)
            r2.LJIIZILJ(r1)
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L47
            java.util.concurrent.CopyOnWriteArrayList<X.1QC> r0 = r3.LJLILLLLZI
            r0.clear()
            java.util.concurrent.CopyOnWriteArrayList<X.1QC> r0 = r3.LJLILLLLZI
            r0.addAll(r1)
        L47:
            return r1
        L48:
            X.C141335gf.LIZJ(r1)
            X.0TX r1 = X.C0TX.LIZ
            java.lang.String r0 = "ComposerFilter"
            r1.LIZJ(r0)
            java.lang.String r0 = "performing fetch remote's composer data."
            X.C0TX.LIZLLL(r0)
            X.0Re r1 = r5.LJLJI
            java.lang.String r0 = X.C0TY.LIZ()
            r4.LJLIL = r5
            r4.LJLJJI = r2
            java.lang.Object r1 = r1.LIZLLL(r0, r4)
            if (r1 != r3) goto L68
            return r3
        L68:
            r3 = r5
            goto L22
        L6a:
            X.22P r4 = new X.22P
            r4.<init>(r5, r6)
            goto L12
        L70:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1VF.LIZLLL(X.2kd):java.lang.Object");
    }
}
