package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagFriendsListViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tag.viewmodel.VideoTagFriendsListViewModel$checkBA$1", f = "VideoTagFriendsListViewModel.kt", l = {347, 348}, m = "invokeSuspend")
/* renamed from: X.9mN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C246799mN extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ VideoTagFriendsListViewModel LJLILLLLZI;
    public final /* synthetic */ Fragment LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C246799mN(VideoTagFriendsListViewModel videoTagFriendsListViewModel, Fragment fragment, InterfaceC67352kd<? super C246799mN> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = videoTagFriendsListViewModel;
        this.LJLJI = fragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C246799mN(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        if (r0 != 2) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00df, code lost:
    
        if (r7.size() <= 0) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f0 A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C246799mN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
