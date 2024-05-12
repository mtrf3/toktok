package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.music.model.DspAuthParam;
import com.ss.android.ugc.aweme.music.model.DspAuthToken;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.app.auth.addtodsp.AddToMusicDspAuthUtil$addSongToMusicApp$3$2$1$1", f = "AddToMusicDspAuthUtil.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.anl, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94857anl extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ XGX<C94474aha> LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ DspAuthParam LJLJI;
    public final /* synthetic */ Fragment LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;
    public final /* synthetic */ boolean LJLJL;
    public final /* synthetic */ DspAuthToken LJLJLJ;
    public final /* synthetic */ boolean LJLJLLL;
    public final /* synthetic */ int LJLL;
    public final /* synthetic */ DspPlatform LJLLI;
    public final /* synthetic */ long LJLLILLLL;
    public final /* synthetic */ String LJLLJ;
    public final /* synthetic */ Activity LJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94857anl(XGX<C94474aha> xgx, boolean z, DspAuthParam dspAuthParam, Fragment fragment, String str, boolean z2, boolean z3, DspAuthToken dspAuthToken, boolean z4, int i, DspPlatform dspPlatform, long j, String str2, Activity activity, InterfaceC67352kd<? super C94857anl> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = xgx;
        this.LJLILLLLZI = z;
        this.LJLJI = dspAuthParam;
        this.LJLJJI = fragment;
        this.LJLJJL = str;
        this.LJLJJLL = z2;
        this.LJLJL = z3;
        this.LJLJLJ = dspAuthToken;
        this.LJLJLLL = z4;
        this.LJLL = i;
        this.LJLLI = dspPlatform;
        this.LJLLILLLL = j;
        this.LJLLJ = str2;
        this.LJLLL = activity;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C94857anl(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLLILLLL, this.LJLLJ, this.LJLLL, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0129, code lost:
    
        if (r4.getErrorCode() == 3007045) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x012b, code lost:
    
        r3 = new java.lang.Integer(r4.getErrorCode());
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0134, code lost:
    
        if (r6 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0136, code lost:
    
        r7 = "1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        X.C94302aeo.LJJI(r7, java.lang.String.valueOf(r3), "song", r15.LJLLI, r15.LJLJL, android.os.SystemClock.elapsedRealtime() - r15.LJLLILLLL, r15.LJLLJ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014e, code lost:
    
        if (r6 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0169, code lost:
    
        r7 = com.ss.android.ugc.aweme.feed.model.CardStruct.IStatusCode.DEFAULT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x016e, code lost:
    
        if (r4 != null) goto L50;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94857anl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
