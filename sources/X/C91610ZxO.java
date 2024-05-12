package X;

import android.content.Context;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue.MDAudioQueueViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue.MDAudioQueueViewModel$onClickPlayable$1", f = "MDAudioQueueViewModel.kt", l = {195}, m = "invokeSuspend")
/* renamed from: X.ZxO, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91610ZxO extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ MDAudioQueueViewModel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ Context LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91610ZxO(MDAudioQueueViewModel mDAudioQueueViewModel, String str, String str2, Context context, InterfaceC67352kd<? super C91610ZxO> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = mDAudioQueueViewModel;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C91610ZxO(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r7.LJLIL
            r6 = 1
            if (r0 == 0) goto L1d
            if (r0 != r6) goto Lb7
            X.C141335gf.LIZJ(r8)
        Lc:
            com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue.MDAudioQueueViewModel r3 = r7.LJLILLLLZI
            r2 = 0
            r3.LJLIL = r2
            kotlin.jvm.internal.IDqS1S0010000_29 r1 = new kotlin.jvm.internal.IDqS1S0010000_29
            r0 = 0
            r1.<init>(r2, r0)
            r3.setState(r1)
        L1a:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L1d:
            X.C141335gf.LIZJ(r8)
            com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue.MDAudioQueueViewModel r0 = r7.LJLILLLLZI
            X.Ztf r0 = r0.gv0()
            X.Zs5 r0 = r0.LJLIL
            X.Zx4 r2 = r0.getPlayerController()
            X.ZsY r0 = r2.LJIJI()
            X.ZsK r4 = r2.LIZ()
            boolean r0 = r0.isPlayingOrPause()
            r3 = 0
            if (r0 == 0) goto L61
        L3b:
            r0 = r4
        L3c:
            java.lang.String r1 = r7.LJLJI
            if (r0 == 0) goto L5f
            java.lang.String r0 = r0.getId()
        L44:
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L99
            X.ZsY r1 = r2.LJIJI()
            boolean r0 = r1.isPlayingState()
            if (r0 == 0) goto L6f
            X.ZsN r1 = new X.ZsN
            java.lang.String r0 = "PAUSE_FROM_USER_PAUSE"
            r1.<init>(r0)
            r2.LJIL(r1)
            goto L1a
        L5f:
            r0 = r3
            goto L44
        L61:
            com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue.MDAudioQueueViewModel r0 = r7.LJLILLLLZI
            r0.getClass()
            boolean r0 = com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue.MDAudioQueueViewModel.hv0(r4)
            if (r0 == 0) goto L6d
            goto L3b
        L6d:
            r0 = r3
            goto L3c
        L6f:
            boolean r0 = r1.isPauseState()
            if (r0 == 0) goto L80
            X.ZsN r1 = new X.ZsN
            java.lang.String r0 = "RESUME_FROM_USER_RESUME"
            r1.<init>(r0)
            r2.LJJ(r1)
            goto L1a
        L80:
            com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue.MDAudioQueueViewModel r0 = r7.LJLILLLLZI
            r0.getClass()
            boolean r0 = com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue.MDAudioQueueViewModel.hv0(r4)
            if (r0 == 0) goto L1a
            com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager r0 = com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager.INSTANCE
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.getWhitePreviewPlayableSet()
            r0.add(r4)
            r0 = 3
            X.C91287ZsB.LIZ(r2, r3, r0)
            goto L1a
        L99:
            com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue.MDAudioQueueViewModel r2 = r7.LJLILLLLZI
            r2.LJLIL = r6
            kotlin.jvm.internal.IDqS1S0010000_29 r1 = new kotlin.jvm.internal.IDqS1S0010000_29
            r0 = 0
            r1.<init>(r6, r0)
            r2.setState(r1)
            com.ss.android.ugc.aweme.dsp.playpage.pageitem.audioview.queue.MDAudioQueueViewModel r3 = r7.LJLILLLLZI
            java.lang.String r2 = r7.LJLJI
            java.lang.String r1 = r7.LJLJJI
            android.content.Context r0 = r7.LJLJJL
            r7.LJLIL = r6
            java.lang.Object r0 = r3.jv0(r0, r2, r1, r7)
            if (r0 != r5) goto Lc
            return r5
        Lb7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91610ZxO.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
