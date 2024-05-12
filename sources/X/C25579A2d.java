package X;

import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.paidcontent.fragments.PaidContentReviewDetailsFragment;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.A2d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25579A2d implements InterfaceC64672gJ<List<? extends A4Y>> {
    public final /* synthetic */ CollectionDetailModel LJLIL;
    public final /* synthetic */ PaidContentReviewDetailsFragment LJLILLLLZI;
    public final /* synthetic */ InterfaceC35811ar LJLJI;

    @Override // X.InterfaceC64672gJ
    public final Object emit(List<? extends A4Y> list, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        List<? extends A4Y> list2 = list;
        InterfaceC35811ar interfaceC35811ar = this.LJLJI;
        boolean z = false;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<? extends A4Y> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                A4Y next = it.next();
                Long collectionId = next.getCollectionId();
                long collectionId2 = this.LJLIL.getCollectionId();
                if (collectionId != null && collectionId.longValue() == collectionId2 && next.getTempOverrideState() == EnumC25632A4e.CREATION) {
                    z = true;
                    break;
                }
            }
        }
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C25577A2b((C252709vu) this.LJLILLLLZI._$_findCachedViewById(R.id.j0m), this.LJLILLLLZI, this.LJLIL, this.LJLJI, null), 3);
        interfaceC35811ar.setValue(Boolean.valueOf(z));
        return C76800UCe.LIZ;
    }

    public C25579A2d(CollectionDetailModel collectionDetailModel, PaidContentReviewDetailsFragment paidContentReviewDetailsFragment, InterfaceC35811ar interfaceC35811ar) {
        this.LJLIL = collectionDetailModel;
        this.LJLILLLLZI = paidContentReviewDetailsFragment;
        this.LJLJI = interfaceC35811ar;
    }
}
