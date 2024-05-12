package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.music.model.DspAuthParam;
import com.ss.android.ugc.aweme.music.model.DspAuthToken;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.addtodsp.AddToMusicDspAuthUtil$addSongToMusicApp$3", f = "AddToMusicDspAuthUtil.kt", l = {1656, 1667, 1674}, m = "invokeSuspend")
/* renamed from: X.ann, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94859ann extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ DspAuthParam LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ Fragment LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ boolean LJLJL;
    public final /* synthetic */ DspAuthToken LJLJLJ;
    public final /* synthetic */ int LJLJLLL;
    public final /* synthetic */ String LJLL;
    public final /* synthetic */ boolean LJLLI;
    public final /* synthetic */ DspPlatform LJLLILLLL;
    public final /* synthetic */ long LJLLJ;
    public final /* synthetic */ String LJLLL;
    public final /* synthetic */ Activity LJLLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94859ann(int i, long j, Activity activity, Fragment fragment, DspAuthParam dspAuthParam, DspAuthToken dspAuthToken, DspPlatform dspPlatform, String str, String str2, String str3, InterfaceC67352kd interfaceC67352kd, boolean z, boolean z2, boolean z3, boolean z4) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = dspAuthParam;
        this.LJLJI = z;
        this.LJLJJI = str;
        this.LJLJJL = fragment;
        this.LJLJJLL = z2;
        this.LJLJL = z3;
        this.LJLJLJ = dspAuthToken;
        this.LJLJLLL = i;
        this.LJLL = str2;
        this.LJLLI = z4;
        this.LJLLILLLL = dspPlatform;
        this.LJLLJ = j;
        this.LJLLL = str3;
        this.LJLLLL = activity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        DspAuthParam dspAuthParam = this.LJLILLLLZI;
        boolean z = this.LJLJI;
        String str = this.LJLJJI;
        Fragment fragment = this.LJLJJL;
        boolean z2 = this.LJLJJLL;
        boolean z3 = this.LJLJL;
        DspAuthToken dspAuthToken = this.LJLJLJ;
        int i = this.LJLJLLL;
        String str2 = this.LJLL;
        boolean z4 = this.LJLLI;
        DspPlatform dspPlatform = this.LJLLILLLL;
        return new C94859ann(i, this.LJLLJ, this.LJLLLL, fragment, dspAuthParam, dspAuthToken, dspPlatform, str, str2, this.LJLLL, interfaceC67352kd, z, z2, z3, z4);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9 A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            r32 = this;
            X.NAu r5 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            r6 = r32
            int r3 = r6.LJLIL
            r0 = 3
            r1 = 2
            r2 = 1
            if (r3 == 0) goto L17
            if (r3 == r2) goto L46
            if (r3 == r1) goto L54
            if (r3 != r0) goto Lca
            X.C141335gf.LIZJ(r33)
        L14:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L17:
            X.C141335gf.LIZJ(r33)
            com.ss.android.ugc.aweme.music.model.DspAuthParam r0 = r6.LJLILLLLZI
            com.ss.android.ugc.aweme.music.model.DspPlatform r0 = r0.dspPlatform
            boolean r0 = X.C93876aXw.LIZ(r0)
            if (r0 == 0) goto L78
            boolean r0 = r6.LJLJI
            if (r0 != 0) goto L49
        L29:
            X.UtN r0 = X.C36636EZk.LIZ
            X.ank r7 = new X.ank
            androidx.fragment.app.Fragment r8 = r6.LJLJJL
            com.ss.android.ugc.aweme.music.model.DspAuthParam r9 = r6.LJLILLLLZI
            java.lang.String r10 = r6.LJLJJI
            boolean r11 = r6.LJLJJLL
            boolean r12 = r6.LJLJL
            com.ss.android.ugc.aweme.music.model.DspAuthToken r13 = r6.LJLJLJ
            r14 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r6.LJLIL = r2
            java.lang.Object r0 = X.XKX.LJI(r0, r7, r6)
            if (r0 != r5) goto L49
            return r5
        L46:
            X.C141335gf.LIZJ(r33)
        L49:
            r6.LJLIL = r1
            r0 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r6)
            if (r0 != r5) goto L57
            return r5
        L54:
            X.C141335gf.LIZJ(r33)
        L57:
            java.lang.String r0 = r6.LJLJJI
            java.lang.String r3 = "songId"
            kotlin.jvm.internal.o.LJIIIZ(r0, r3)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r2 = X.C94304aeq.LJLIL
            java.lang.Object r1 = r2.get(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L78
            java.lang.String r0 = r6.LJLJJI
            kotlin.jvm.internal.o.LJIIIZ(r0, r3)
            r2.remove(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L78:
            X.XIA r14 = X.C78613UtF.LIZJ
            X.anm r13 = new X.anm
            int r0 = r6.LJLJLLL
            r18 = r0
            java.lang.String r0 = r6.LJLJJI
            r17 = r0
            java.lang.String r0 = r6.LJLL
            r16 = r0
            boolean r15 = r6.LJLJI
            com.ss.android.ugc.aweme.music.model.DspAuthParam r12 = r6.LJLILLLLZI
            androidx.fragment.app.Fragment r11 = r6.LJLJJL
            boolean r10 = r6.LJLJJLL
            boolean r9 = r6.LJLJL
            com.ss.android.ugc.aweme.music.model.DspAuthToken r8 = r6.LJLJLJ
            boolean r7 = r6.LJLLI
            com.ss.android.ugc.aweme.music.model.DspPlatform r4 = r6.LJLLILLLL
            long r2 = r6.LJLLJ
            java.lang.String r1 = r6.LJLLL
            android.app.Activity r0 = r6.LJLLLL
            r27 = 0
            r28 = r15
            r29 = r10
            r30 = r9
            r31 = r7
            r24 = r17
            r25 = r16
            r26 = r1
            r21 = r12
            r22 = r8
            r23 = r4
            r19 = r0
            r20 = r11
            r16 = r18
            r17 = r2
            r15 = r13
            r15.<init>(r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r0 = 3
            r6.LJLIL = r0
            java.lang.Object r0 = X.XKX.LJI(r14, r13, r6)
            if (r0 != r5) goto L14
            return r5
        Lca:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94859ann.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
