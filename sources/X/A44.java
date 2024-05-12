package X;

import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.paidcontent.fragments.PaidContentReviewDetailsFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A44 implements V7H {
    public final /* synthetic */ PaidContentReviewDetailsFragment LIZ;
    public final /* synthetic */ CollectionDetailModel LIZIZ;
    public final /* synthetic */ InterfaceC20340r0 LIZJ;
    public final /* synthetic */ ComposeView LIZLLL;

    @Override // X.V7H
    public final void LIZIZ() {
    }

    @Override // X.V7H
    public final void LJFF() {
    }

    @Override // X.V7H
    public final void LJII() {
    }

    @Override // X.V7H
    public final void LIZLLL() {
        FragmentManager fragmentManager;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this.LIZ);
        if (LIZ != null) {
            fragmentManager = LIZ.getSupportFragmentManager();
        } else {
            fragmentManager = null;
        }
        A4S.LJI(fragmentManager, 0, (String) this.LIZ.LJLILLLLZI.getValue(), "list_write_review_button", this.LIZIZ.getCollectionId(), this.LIZIZ, null, null, 450);
    }

    @Override // X.V7H
    public final String LJ() {
        User collectionCreator;
        CollectionDetailModel collectionDetailModel = this.LIZ.LJLIL;
        if (collectionDetailModel != null && (collectionCreator = collectionDetailModel.getCollectionCreator()) != null) {
            return collectionCreator.getUid();
        }
        return null;
    }

    @Override // X.V7H
    public final void LJIIIIZZ(String str) {
        SmartRoute buildRoute = SmartRouter.buildRoute(this.LIZLLL.getContext(), "//user/profile");
        buildRoute.withParam("uid", str);
        buildRoute.open();
    }

    @Override // X.V7H
    public final void LIZJ(A4Y reviewObject, String str) {
        FragmentManager supportFragmentManager;
        o.LJIIIZ(reviewObject, "reviewObject");
        ActivityC45651qj LIZ = C212428Vi.LIZ(this.LIZ);
        if (LIZ != null && (supportFragmentManager = LIZ.getSupportFragmentManager()) != null) {
            CollectionDetailModel collectionDetailModel = this.LIZIZ;
            A48.LIZ(collectionDetailModel, reviewObject, collectionDetailModel.getCollectionId(), str, (String) this.LIZ.LJLILLLLZI.getValue()).show(supportFragmentManager, "reply_fragment");
        }
    }

    @Override // X.V7H
    public final void LJI(String str, String str2) {
        this.LIZJ.LIZ(0);
        ActivityC45651qj mo49getActivity = this.LIZ.mo49getActivity();
        if (mo49getActivity != null) {
            A4S.LJII(mo49getActivity, str, str2);
        }
    }

    @Override // X.V7H
    public final void LIZ(int i, String str, String str2) {
        FragmentManager fragmentManager;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this.LIZ);
        if (LIZ != null) {
            fragmentManager = LIZ.getSupportFragmentManager();
        } else {
            fragmentManager = null;
        }
        A4S.LJI(fragmentManager, i, (String) this.LIZ.LJLILLLLZI.getValue(), "edit", this.LIZIZ.getCollectionId(), this.LIZIZ, str, str2, 128);
    }

    public A44(PaidContentReviewDetailsFragment paidContentReviewDetailsFragment, CollectionDetailModel collectionDetailModel, InterfaceC20340r0 interfaceC20340r0, ComposeView composeView) {
        this.LIZ = paidContentReviewDetailsFragment;
        this.LIZIZ = collectionDetailModel;
        this.LIZJ = interfaceC20340r0;
        this.LIZLLL = composeView;
    }
}
