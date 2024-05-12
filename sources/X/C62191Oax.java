package X;

import com.ss.android.ugc.aweme.commercialize.ecommerce.pdp.log.PdpLogHelper;
import com.ss.android.ugc.aweme.commercialize.ecommerce.pdp.ui.PdpBulletBottomSheetFragment;
import com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.manager.WishListManager;
import com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.ui.WishListFragment;
import com.ss.android.ugc.aweme.commercialize.preview.manager.AdsPreviewStateManager;
import com.ss.android.ugc.aweme.commercialize.preview.ui.AdsPreviewFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.invite.GroupInviteFragment;
import com.ss.android.ugc.aweme.profile.edit.InstagramPresenter;
import com.ss.android.ugc.aweme.profile.edit.TwitterPresenter;
import com.ss.android.ugc.aweme.profile.edit.YoutubePresenter;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment;
import com.ss.android.ugc.aweme.qrcode.QRCodeFragment;

/* renamed from: X.Oax, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62191Oax extends AbstractC87464YUi {
    public final C253069wU LIZ;
    public C4G1<WishListManager> LIZIZ = C253079wV.LIZ(new C61073Ny1());

    @Override // X.InterfaceC87469YUn
    public final void LIZ() {
    }

    @Override // X.InterfaceC87473YUr
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC87468YUm
    public final void LIZJ() {
    }

    @Override // X.InterfaceC87474YUs
    public final void LJFF() {
    }

    @Override // X.InterfaceC87472YUq
    public final void LJII() {
    }

    @Override // X.InterfaceC87463YUh
    public final void LJIIJJI() {
    }

    @Override // X.InterfaceC87471YUp
    public final void LJIIL() {
    }

    @Override // X.InterfaceC87462YUg
    public final void LJIILIIL() {
    }

    @Override // X.InterfaceC87470YUo
    public final void LJIILJJIL() {
    }

    @Override // X.InterfaceC87443YTn
    public final AbstractC65583PoZ LJ() {
        return AbstractC65583PoZ.of();
    }

    @Override // X.InterfaceC87466YUk
    public final void LIZLLL(GroupInviteFragment groupInviteFragment) {
        groupInviteFragment.LJLJJI = this.LIZ.LJFF.get();
    }

    @Override // X.InterfaceC87461YUf
    public final void LJI(ProfileEditFragment profileEditFragment) {
        InstagramPresenter instagramPresenter = new InstagramPresenter();
        C62192Oay.LIZIZ(instagramPresenter, this.LIZ.LJII.get());
        C62192Oay.LIZ(instagramPresenter, this.LIZ.LJI.get());
        profileEditFragment.getClass();
        profileEditFragment.LLIL = instagramPresenter;
        TwitterPresenter twitterPresenter = new TwitterPresenter();
        C62193Oaz.LIZIZ(twitterPresenter, this.LIZ.LJII.get());
        C62193Oaz.LIZ(twitterPresenter, this.LIZ.LJI.get());
        profileEditFragment.LLILII = twitterPresenter;
        profileEditFragment.LLILIL = new YoutubePresenter(this.LIZ.LJI.get(), this.LIZ.LJII.get());
    }

    @Override // X.InterfaceC87465YUj
    public final void LJIIIIZZ(PdpBulletBottomSheetFragment pdpBulletBottomSheetFragment) {
        pdpBulletBottomSheetFragment.LJLJJI = new PdpLogHelper();
    }

    @Override // X.InterfaceC87460YUe
    public final void LJIIIZ(WishListFragment wishListFragment) {
        wishListFragment.LJLJJI = this.LIZIZ.get();
    }

    @Override // X.InterfaceC87459YUd
    public final void LJIIJ(AdsPreviewFragment adsPreviewFragment) {
        adsPreviewFragment.LJLJJI = new AdsPreviewStateManager();
    }

    @Override // X.InterfaceC87467YUl
    public final void LJIILL(QRCodeFragment qRCodeFragment) {
        C62151OaJ c62151OaJ = new C62151OaJ();
        c62151OaJ.LIZ = this.LIZ.LJJIFFI.get();
        c62151OaJ.LIZIZ = this.LIZ.LJI.get();
        qRCodeFragment.LJLJJL = c62151OaJ;
    }

    public C62191Oax(C106504Fy c106504Fy, C244519ih c244519ih, C253069wU c253069wU) {
        this.LIZ = c253069wU;
    }
}
