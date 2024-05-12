package X;

import com.ss.android.ugc.aweme.service.FriendsTabDbService;

/* renamed from: X.Lg1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54861Lg1<T> implements InterfaceC86003Zc {
    public final /* synthetic */ FriendsTabDbService LJLIL;
    public final /* synthetic */ long LJLILLLLZI = 0;
    public final /* synthetic */ long LJLJI;

    public C54861Lg1(FriendsTabDbService friendsTabDbService, long j) {
        this.LJLIL = friendsTabDbService;
        this.LJLJI = j;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<Integer> interfaceC73573Su9) {
        interfaceC73573Su9.onNext(Integer.valueOf(this.LJLIL.LJIIL().LIZIZ(this.LJLILLLLZI, this.LJLJI)));
        interfaceC73573Su9.onComplete();
    }
}
