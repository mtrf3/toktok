package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.feed.popcard.EcLiveProductCard$showCardIfNeeded$1", f = "EcLiveProductCard.kt", l = {99, 162}, m = "invokeSuspend")
/* renamed from: X.S3c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71468S3c extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C71470S3e LJLIL;
    public S21 LJLILLLLZI;
    public int LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C71470S3e LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ LiveRoomStruct LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ java.util.Map<String, String> LJLJLLL;
    public final /* synthetic */ Context LJLL;
    public final /* synthetic */ boolean LJLLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71468S3c(C71470S3e c71470S3e, long j, LiveRoomStruct liveRoomStruct, String str, java.util.Map<String, String> map, Context context, boolean z, InterfaceC67352kd<? super C71468S3c> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = c71470S3e;
        this.LJLJJLL = j;
        this.LJLJL = liveRoomStruct;
        this.LJLJLJ = str;
        this.LJLJLLL = map;
        this.LJLL = context;
        this.LJLLI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C71468S3c c71468S3c = new C71468S3c(this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, interfaceC67352kd);
        c71468S3c.LJLJJI = obj;
        return c71468S3c;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r0v83, types: [T, X.XKn] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71468S3c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
