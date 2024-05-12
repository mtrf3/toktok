package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.paidcontent.assem.PaidContentCollectionDetailReviewListAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A43 implements V7H {
    public final /* synthetic */ InterfaceC35811ar<CollectionDetailModel> LIZ;
    public final /* synthetic */ PaidContentCollectionDetailReviewListAssem LIZIZ;
    public final /* synthetic */ InterfaceC20340r0 LIZJ;
    public final /* synthetic */ Context LIZLLL;

    @Override // X.V7H
    public final void LIZIZ() {
        CollectionDetailModel value;
        PaidContentCollectionDetailReviewListAssem paidContentCollectionDetailReviewListAssem;
        ActivityC45651qj LIZ;
        value = this.LIZ.getValue();
        if (value != null && (LIZ = C212428Vi.LIZ((paidContentCollectionDetailReviewListAssem = this.LIZIZ))) != null) {
            C254779zF.LIZ(LIZ, value, paidContentCollectionDetailReviewListAssem.v3().LJLILLLLZI, true);
        }
    }

    @Override // X.V7H
    public final void LIZLLL() {
        FragmentManager fragmentManager;
        CollectionDetailModel value;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this.LIZIZ);
        if (LIZ != null) {
            fragmentManager = LIZ.getSupportFragmentManager();
        } else {
            fragmentManager = null;
        }
        String str = this.LIZIZ.v3().LJLILLLLZI;
        long j = this.LIZIZ.v3().LJLIL;
        value = this.LIZ.getValue();
        A4S.LJI(fragmentManager, 0, str, "list_write_review_button", j, value, null, null, 450);
    }

    @Override // X.V7H
    public final String LJ() {
        CollectionDetailModel value;
        User collectionCreator;
        value = this.LIZ.getValue();
        if (value != null && (collectionCreator = value.getCollectionCreator()) != null) {
            return collectionCreator.getUid();
        }
        return null;
    }

    @Override // X.V7H
    public final void LJFF() {
        CollectionDetailModel value;
        PaidContentCollectionDetailReviewListAssem paidContentCollectionDetailReviewListAssem;
        ActivityC45651qj LIZ;
        value = this.LIZ.getValue();
        if (value != null && (LIZ = C212428Vi.LIZ((paidContentCollectionDetailReviewListAssem = this.LIZIZ))) != null) {
            C254779zF.LIZ(LIZ, value, paidContentCollectionDetailReviewListAssem.v3().LJLILLLLZI, true);
            String str = paidContentCollectionDetailReviewListAssem.v3().LJLILLLLZI;
            C188727au c188727au = new C188727au();
            C25589A2n.LJFF(c188727au, str);
            C25589A2n.LJ(c188727au, value);
            FMX.LJIIL("click_see_all_series_review", c188727au.LIZ);
        }
    }

    @Override // X.V7H
    public final void LJII() {
        CollectionDetailModel value;
        PaidContentCollectionDetailReviewListAssem paidContentCollectionDetailReviewListAssem;
        ActivityC45651qj LIZ;
        value = this.LIZ.getValue();
        if (value != null && (LIZ = C212428Vi.LIZ((paidContentCollectionDetailReviewListAssem = this.LIZIZ))) != null) {
            C254779zF.LIZ(LIZ, value, paidContentCollectionDetailReviewListAssem.v3().LJLILLLLZI, true);
        }
    }

    @Override // X.V7H
    public final void LJIIIIZZ(String str) {
        C59895Nf1.LIZLLL(this.LIZLLL, "//user/profile", "uid", str);
    }

    @Override // X.V7H
    public final void LIZJ(A4Y reviewObject, String str) {
        FragmentManager supportFragmentManager;
        CollectionDetailModel value;
        o.LJIIIZ(reviewObject, "reviewObject");
        ActivityC45651qj LIZ = C212428Vi.LIZ(this.LIZIZ);
        if (LIZ != null && (supportFragmentManager = LIZ.getSupportFragmentManager()) != null) {
            InterfaceC35811ar<CollectionDetailModel> interfaceC35811ar = this.LIZ;
            PaidContentCollectionDetailReviewListAssem paidContentCollectionDetailReviewListAssem = this.LIZIZ;
            value = interfaceC35811ar.getValue();
            if (value != null) {
                A48.LIZ(value, reviewObject, value.getCollectionId(), str, paidContentCollectionDetailReviewListAssem.v3().LJLILLLLZI).show(supportFragmentManager, "reply_fragment");
            }
        }
    }

    @Override // X.V7H
    public final void LJI(String str, String str2) {
        this.LIZJ.LIZ(0);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this.LIZIZ);
        if (LIZ != null) {
            A4S.LJII(LIZ, str, str2);
        }
    }

    @Override // X.V7H
    public final void LIZ(int i, String str, String str2) {
        FragmentManager fragmentManager;
        CollectionDetailModel value;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this.LIZIZ);
        if (LIZ != null) {
            fragmentManager = LIZ.getSupportFragmentManager();
        } else {
            fragmentManager = null;
        }
        String str3 = this.LIZIZ.v3().LJLILLLLZI;
        long j = this.LIZIZ.v3().LJLIL;
        value = this.LIZ.getValue();
        A4S.LJI(fragmentManager, i, str3, "edit", j, value, str, str2, 128);
    }

    public A43(InterfaceC35811ar<CollectionDetailModel> interfaceC35811ar, PaidContentCollectionDetailReviewListAssem paidContentCollectionDetailReviewListAssem, InterfaceC20340r0 interfaceC20340r0, Context context) {
        this.LIZ = interfaceC35811ar;
        this.LIZIZ = paidContentCollectionDetailReviewListAssem;
        this.LIZJ = interfaceC20340r0;
        this.LIZLLL = context;
    }
}
