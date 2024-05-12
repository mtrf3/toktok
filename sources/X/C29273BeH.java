package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.usercard.profilev3.UserCardPreloadViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.usercard.profilev3.UserCardPreloadViewModel$preloadAuthorInfo$1", f = "UserCardPreloadViewModel.kt", l = {84, 96}, m = "invokeSuspend")
/* renamed from: X.BeH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29273BeH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ User LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ Room LJLJJL;
    public final /* synthetic */ UserCardPreloadViewModel LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29273BeH(long j, User user, long j2, Room room, UserCardPreloadViewModel userCardPreloadViewModel, InterfaceC67352kd<? super C29273BeH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = j;
        this.LJLJI = user;
        this.LJLJJI = j2;
        this.LJLJJL = room;
        this.LJLJJLL = userCardPreloadViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C29273BeH(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a5 A[Catch: all -> 0x00dc, TryCatch #0 {all -> 0x00dc, blocks: (B:9:0x0093, B:10:0x0096, B:12:0x00a5, B:14:0x00af, B:15:0x00b4, B:17:0x00ba, B:19:0x00c2, B:21:0x00cb, B:23:0x00d1, B:24:0x00c6, B:27:0x00d5, B:38:0x0081), top: B:2:0x0007 }] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29273BeH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
