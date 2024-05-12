package X;

import Y.AfS15S0210000_3;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;

/* renamed from: X.7gB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191997gB extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ CollectionManageRequest LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C193027hq LJLJI;
    public final /* synthetic */ CollectionDetail LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C191997gB(CollectionManageRequest collectionManageRequest, boolean z, C193027hq c193027hq, CollectionDetail collectionDetail) {
        super(0);
        this.LJLIL = collectionManageRequest;
        this.LJLILLLLZI = z;
        this.LJLJI = c193027hq;
        this.LJLJJI = collectionDetail;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        new C192487gy().LIZJ.LJJJIL(this.LJLIL).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS15S0210000_3(this.LJLJI, this.LJLJJI, this.LJLILLLLZI, 0), new InterfaceC64592gB() { // from class: X.7gC
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
        return C76800UCe.LIZ;
    }
}
