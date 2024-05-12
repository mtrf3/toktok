package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.ss.android.ugc.aweme.relation.storage.model.LocalListResponse;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.api.StorageApiService$asFlow$1", f = "StorageApi.kt", l = {LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48, 50}, m = "invokeSuspend")
/* renamed from: X.38D, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C38D extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC64672gJ<? super LocalListResponse>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C38K LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C38K LJLJJI;
    public final /* synthetic */ int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38D(C38K c38k, int i, InterfaceC67352kd<? super C38D> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = c38k;
        this.LJLJJL = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C38D c38d = new C38D(this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c38d.LJLJI = obj;
        return c38d;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006a -> B:6:0x0016). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.NAu r8 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r10.LJLILLLLZI
            r7 = 0
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L6f
            if (r0 == r5) goto L29
            if (r0 != r6) goto L8a
            X.38K r1 = r10.LJLIL
            java.lang.Object r4 = r10.LJLJI
            X.2gJ r4 = (X.InterfaceC64672gJ) r4
            X.C141335gf.LIZJ(r11)
        L16:
            if (r1 == 0) goto L87
            com.ss.android.ugc.aweme.relation.storage.api.StorageApiService r2 = com.ss.android.ugc.aweme.relation.storage.api.StorageApiService.LIZIZ
            int r0 = r10.LJLJJL
            r10.LJLJI = r4
            r10.LJLIL = r1
            r10.LJLILLLLZI = r5
            java.lang.Object r11 = r2.LIZ(r1, r0, r7, r10)
            if (r11 != r8) goto L32
            return r8
        L29:
            X.38K r1 = r10.LJLIL
            java.lang.Object r4 = r10.LJLJI
            X.2gJ r4 = (X.InterfaceC64672gJ) r4
            X.C141335gf.LIZJ(r11)
        L32:
            com.ss.android.ugc.aweme.relation.storage.model.LocalListResponse r11 = (com.ss.android.ugc.aweme.relation.storage.model.LocalListResponse) r11
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            java.lang.String r0 = "response"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            boolean r0 = r11.getHasMore()
            if (r0 == 0) goto L6d
            java.lang.String r0 = r11.getNextPageToken()
            int r0 = r0.length()
            if (r0 <= 0) goto L6d
            java.lang.String r9 = r11.getNextPageToken()
            java.util.List<X.38T> r3 = r1.LJLIL
            int r2 = r1.LJLILLLLZI
            java.lang.String r0 = "types"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            X.38K r1 = new X.38K
            r1.<init>(r3, r2, r9)
        L60:
            r10.LJLJI = r4
            r10.LJLIL = r1
            r10.LJLILLLLZI = r6
            java.lang.Object r0 = r4.emit(r11, r10)
            if (r0 != r8) goto L16
            return r8
        L6d:
            r1 = 0
            goto L60
        L6f:
            X.C141335gf.LIZJ(r11)
            java.lang.Object r4 = r10.LJLJI
            X.2gJ r4 = (X.InterfaceC64672gJ) r4
            X.38K r0 = r10.LJLJJI
            java.util.List<X.38T> r0 = r0.LJLIL
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L9a
            X.38K r1 = r10.LJLJJI
            int r0 = r1.LJLILLLLZI
            if (r0 <= 0) goto L92
            goto L16
        L87:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L8a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L92:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "count can not be less than 0"
            r1.<init>(r0)
            throw r1
        L9a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "types can not be empty"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38D.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC64672gJ<? super LocalListResponse> interfaceC64672gJ, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC64672gJ, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
