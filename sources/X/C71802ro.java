package X;

import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.stickerstore.resource.StickerStoreResourceManager$loadData$1", f = "StickerStoreResourceManager.kt", l = {79, 98, 104, 121}, m = "invokeSuspend")
/* renamed from: X.2ro, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71802ro extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public AbstractC71812rp LJLJI;
    public Object LJLJJI;
    public Object LJLJJL;
    public int LJLJJLL;
    public /* synthetic */ Object LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ List<KEY> LJLJLLL;
    public final /* synthetic */ AbstractC71812rp<DATA, RESP, KEY, OBSERVER> LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C71802ro(boolean z, List<? extends KEY> list, AbstractC71812rp<DATA, RESP, KEY, OBSERVER> abstractC71812rp, InterfaceC67352kd<? super C71802ro> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJLJ = z;
        this.LJLJLLL = list;
        this.LJLL = abstractC71812rp;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C71802ro c71802ro = new C71802ro(this.LJLJLJ, this.LJLJLLL, this.LJLL, interfaceC67352kd);
        c71802ro.LJLJL = obj;
        return c71802ro;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fc  */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x011e -> B:14:0x0138). Please report as a decompilation issue!!! */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71802ro.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
