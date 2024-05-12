package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.cache.NowCacheDelegate$cacheOnPublishSuccess$1", f = "NowCacheDelegate.kt", l = {24, 29, 31, 37}, m = "invokeSuspend")
/* renamed from: X.7pG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197627pG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ PublishModel LJLILLLLZI;
    public final /* synthetic */ Aweme LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C197627pG(PublishModel publishModel, Aweme aweme, InterfaceC67352kd<? super C197627pG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = publishModel;
        this.LJLJI = aweme;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C197627pG(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0043, code lost:
    
        if (r0 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0090, code lost:
    
        if (r8 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0092, code lost:
    
        r8 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        if (r0 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0099, code lost:
    
        r10.LJLIL = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009f, code lost:
    
        if (r5.LIZ(r6, r7, r8, r9, r10) != r3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a1, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0095, code lost:
    
        r0 = r0.syntheticVideoPath;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0097, code lost:
    
        if (r0 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a2, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x008c, code lost:
    
        if (r0 != null) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r10.LJLIL
            r4 = 0
            r1 = 4
            r2 = 3
            r6 = 2
            r7 = 1
            if (r0 == 0) goto L19
            if (r0 == r7) goto L56
            if (r0 == r6) goto L13
            if (r0 == r2) goto La4
            if (r0 != r1) goto Lbe
        L13:
            X.C141335gf.LIZJ(r11)
        L16:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L19:
            X.C141335gf.LIZJ(r11)
            com.ss.android.ugc.aweme.shortvideo.publish.PublishModel r0 = r10.LJLILLLLZI
            com.ss.android.ugc.aweme.creative.model.NowsShootModel r5 = r0.nowsShootData
            if (r5 == 0) goto L54
            int r0 = r5.type
            if (r0 != 0) goto L54
            r0 = 1
        L27:
            java.lang.String r8 = "aweme.aid"
            java.lang.String r9 = ""
            if (r0 == 0) goto L70
            X.W3q r5 = X.C81674W3q.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.LJLJI
            java.lang.String r2 = r0.getAid()
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r8)
            com.ss.android.ugc.aweme.shortvideo.publish.PublishModel r0 = r10.LJLILLLLZI
            com.ss.android.ugc.aweme.creative.model.NowsShootModel r0 = r0.nowsShootData
            if (r0 == 0) goto L42
            java.lang.String r1 = r0.frontImagePath
            if (r1 != 0) goto L45
        L42:
            r1 = r9
            if (r0 == 0) goto L49
        L45:
            java.lang.String r0 = r0.backImagePath
            if (r0 != 0) goto L52
        L49:
            r10.LJLIL = r7
            java.lang.Object r0 = r5.LIZIZ(r2, r1, r9, r10)
            if (r0 != r3) goto L59
            return r3
        L52:
            r9 = r0
            goto L49
        L54:
            r0 = 0
            goto L27
        L56:
            X.C141335gf.LIZJ(r11)
        L59:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r10.LJLJI
            r10.LJLIL = r6
            X.XI8 r1 = X.VFJ.LIZIZ
            X.7l1 r0 = new X.7l1
            r0.<init>(r2, r4)
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r10)
            if (r0 != r3) goto L6d
        L6a:
            if (r0 != r3) goto L16
            return r3
        L6d:
            X.UCe r0 = X.C76800UCe.LIZ
            goto L6a
        L70:
            if (r5 == 0) goto L16
            int r0 = r5.type
            if (r0 != r7) goto L16
            X.W3q r5 = X.C81674W3q.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.LJLJI
            java.lang.String r6 = r0.getAid()
            kotlin.jvm.internal.o.LJIIIIZZ(r6, r8)
            com.ss.android.ugc.aweme.shortvideo.publish.PublishModel r0 = r10.LJLILLLLZI
            com.ss.android.ugc.aweme.creative.model.NowsShootModel r0 = r0.nowsShootData
            if (r0 == 0) goto L8b
            java.lang.String r7 = r0.frontImagePath
            if (r7 != 0) goto L8e
        L8b:
            r7 = r9
            if (r0 == 0) goto L92
        L8e:
            java.lang.String r8 = r0.backImagePath
            if (r8 != 0) goto L95
        L92:
            r8 = r9
            if (r0 == 0) goto L99
        L95:
            java.lang.String r0 = r0.syntheticVideoPath
            if (r0 != 0) goto La2
        L99:
            r10.LJLIL = r2
            java.lang.Object r0 = r5.LIZ(r6, r7, r8, r9, r10)
            if (r0 != r3) goto La7
            return r3
        La2:
            r9 = r0
            goto L99
        La4:
            X.C141335gf.LIZJ(r11)
        La7:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r10.LJLJI
            r10.LJLIL = r1
            X.XI8 r1 = X.VFJ.LIZIZ
            X.7l1 r0 = new X.7l1
            r0.<init>(r2, r4)
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r10)
            if (r0 != r3) goto Lbb
        Lb8:
            if (r0 != r3) goto L16
            return r3
        Lbb:
            X.UCe r0 = X.C76800UCe.LIZ
            goto Lb8
        Lbe:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C197627pG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
