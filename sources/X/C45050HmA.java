package X;

import com.bytedance.ies.smartmovie.jni.VecMeta;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.autocut.mob.AutoCutNetworkRequestMobListener$onRequestMusicFinish$1", f = "AutoCutNetworkRequestListener.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.HmA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45050HmA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C45051HmB LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ CutsameDataItem LJLJJL;
    public final /* synthetic */ VecMeta LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ int LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ long LJLL;
    public final /* synthetic */ String LJLLI;
    public final /* synthetic */ Long LJLLILLLL;
    public final /* synthetic */ String LJLLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45050HmA(String str, String str2, C45051HmB c45051HmB, boolean z, CutsameDataItem cutsameDataItem, VecMeta vecMeta, int i, int i2, String str3, long j, String str4, Long l, String str5, InterfaceC67352kd<? super C45050HmA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = c45051HmB;
        this.LJLJJI = z;
        this.LJLJJL = cutsameDataItem;
        this.LJLJJLL = vecMeta;
        this.LJLJL = i;
        this.LJLJLJ = i2;
        this.LJLJLLL = str3;
        this.LJLL = j;
        this.LJLLI = str4;
        this.LJLLILLLL = l;
        this.LJLLJ = str5;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C45050HmA(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLLILLLL, this.LJLLJ, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r0.length() > 0) goto L16;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45050HmA.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
