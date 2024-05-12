package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.friends.model.ShortenUrlModel;
import com.ss.android.ugc.aweme.friends.service.FriendsServiceImpl;
import com.ss.android.ugc.aweme.friends.service.IFriendsService;
import com.ss.android.ugc.aweme.friends.service.ISocialFriendsService;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.muflist.MufPageTrackInfo;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.UUc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77266UUc implements IFriendsService {
    public static final C77266UUc LIZIZ = new C77266UUc();
    public final /* synthetic */ IFriendsService LIZ = FriendsServiceImpl.LJJJJ();

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final InterfaceC57445Mgb LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final Intent LIZIZ(Activity activity) {
        o.LJIIIZ(activity, "activity");
        return this.LIZ.LIZIZ(activity);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final UQA LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean LJ(User user) {
        return this.LIZ.LJ(user);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJFF(Context context, String enterFrom, int i, String enterMethod) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(context, "context");
        this.LIZ.LJFF(context, enterFrom, i, enterMethod);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJII(String str, java.util.Map map) {
        this.LIZ.LJII(str, map);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final InterfaceC58008Mpg LJIIIIZZ(LifecycleOwner lifecycleOwner, String str) {
        return this.LIZ.LJIIIIZZ(lifecycleOwner, str);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJIIIZ(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LIZ.LJIIIZ(enterFrom);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final UQ5 LJIIJ() {
        return this.LIZ.LJIIJ();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final Class<? extends UPC> LJIIJJI() {
        return this.LIZ.LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final long LJIIL() {
        return this.LIZ.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJIILIIL() {
        this.LIZ.LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final AbstractC73672Svk LJIILJJIL(String str) {
        return this.LIZ.LJIILJJIL(str);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJIILL() {
        this.LIZ.LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final InterfaceC57395Mfn LJIILLIIL() {
        return this.LIZ.LJIILLIIL();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJIIZILJ() {
        this.LIZ.LJIIZILJ();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final InterfaceC85634XjC LJIJ() {
        return this.LIZ.LJIJ();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJIJI(String str, ActivityC45651qj activityC45651qj) {
        this.LIZ.LJIJI(str, activityC45651qj);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean LJIJJ() {
        return this.LIZ.LJIJJ();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJIJJLI(ActivityC45651qj context, int i) {
        o.LJIIIZ(context, "context");
        this.LIZ.LJIJJLI(context, i);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJIL(int i, Context context, UQF popupConfig, URA ura, String str) {
        o.LJIIIZ(popupConfig, "popupConfig");
        o.LJIIIZ(context, "context");
        this.LIZ.LJIL(i, context, popupConfig, ura, str);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean LJJ(Activity activity) {
        return this.LIZ.LJJ(activity);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final InterfaceC65350Pko<? extends C8W0> LJJI() {
        return this.LIZ.LJJI();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJJIFFI(String str, String str2, String str3) {
        this.LIZ.LJJIFFI(str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJJII(boolean z) {
        this.LIZ.LJJII(z);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final EFM LJJIII() {
        return this.LIZ.LJJIII();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final Intent LJJIIJ(Context context, int i) {
        return this.LIZ.LJJIIJ(context, i);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJJIIJZLJL(boolean z) {
        this.LIZ.LJJIIJZLJL(z);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJJIIZ(String str, java.util.Map map) {
        this.LIZ.LJJIIZ(str, map);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final FWR LJJIIZI(ActivityC45651qj activityC45651qj) {
        return this.LIZ.LJJIIZI(activityC45651qj);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJJIJ(boolean z) {
        this.LIZ.LJJIJ(z);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final Class<? extends UPC> LJJIJIIJI() {
        return this.LIZ.LJJIJIIJI();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final UQF LJJIJIIJIL(int i, boolean z) {
        return this.LIZ.LJJIJIIJIL(i, z);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final LKA LJJIJIL(Fragment fragment, HomePageDataViewModel homePageDataViewModel, AqS159S0100000_9 aqS159S0100000_9) {
        return this.LIZ.LJJIJIL(fragment, homePageDataViewModel, aqS159S0100000_9);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean LJJIJL() {
        return this.LIZ.LJJIJL();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean LJJIJLIJ() {
        return this.LIZ.LJJIJLIJ();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final ISocialFriendsService LJJIL() {
        return this.LIZ.LJJIL();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean LJJIZ() {
        return this.LIZ.LJJIZ();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final Fragment LJJJ(EnumC72483ScZ enumC72483ScZ, MufPageTrackInfo mufPageTrackInfo) {
        return this.LIZ.LJJJ(enumC72483ScZ, mufPageTrackInfo);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void LJJJI() {
        this.LIZ.LJJJI();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final EFM LJJJIL() {
        return this.LIZ.LJJJIL();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final InterfaceC51691KQl getFollowPresenter() {
        return this.LIZ.getFollowPresenter();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final M4C getRelationService() {
        return this.LIZ.getRelationService();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final AbstractC73672Svk<ShortenUrlModel> shortenUrl(String url) {
        o.LJIIIZ(url, "url");
        return this.LIZ.shortenUrl(url);
    }
}
