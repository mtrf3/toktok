package X;

import com.ss.android.ugc.aweme.service.FriendsTabDbService;

/* renamed from: X.Lg0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54860Lg0<T> implements InterfaceC86003Zc {
    public final /* synthetic */ FriendsTabDbService LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    public C54860Lg0(FriendsTabDbService friendsTabDbService, long j) {
        this.LJLIL = friendsTabDbService;
        this.LJLILLLLZI = j;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<Integer> interfaceC73573Su9) {
        interfaceC73573Su9.onNext(Integer.valueOf(this.LJLIL.LJIIL().LJIIIIZZ(this.LJLILLLLZI)));
        interfaceC73573Su9.onComplete();
    }
}
