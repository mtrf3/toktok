package com.ss.android.ugc.aweme.friends.service;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C8W0;
import X.EFM;
import X.EnumC72483ScZ;
import X.FWR;
import X.InterfaceC51691KQl;
import X.InterfaceC57395Mfn;
import X.InterfaceC57445Mgb;
import X.InterfaceC58008Mpg;
import X.InterfaceC65350Pko;
import X.InterfaceC85634XjC;
import X.LKA;
import X.M4C;
import X.UPC;
import X.UQ5;
import X.UQA;
import X.UQF;
import X.URA;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.friends.model.ShortenUrlModel;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.muflist.MufPageTrackInfo;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;

/* loaded from: classes14.dex */
public interface IFriendsService {
    InterfaceC57445Mgb LIZ();

    Intent LIZIZ(Activity activity);

    boolean LIZJ();

    UQA LIZLLL();

    boolean LJ(User user);

    void LJFF(Context context, String str, int i, String str2);

    boolean LJI();

    void LJII(String str, Map map);

    InterfaceC58008Mpg LJIIIIZZ(LifecycleOwner lifecycleOwner, String str);

    void LJIIIZ(String str);

    UQ5 LJIIJ();

    Class<? extends UPC> LJIIJJI();

    long LJIIL();

    void LJIILIIL();

    AbstractC73672Svk LJIILJJIL(String str);

    void LJIILL();

    InterfaceC57395Mfn LJIILLIIL();

    void LJIIZILJ();

    InterfaceC85634XjC LJIJ();

    void LJIJI(String str, ActivityC45651qj activityC45651qj);

    boolean LJIJJ();

    void LJIJJLI(ActivityC45651qj activityC45651qj, int i);

    void LJIL(int i, Context context, UQF uqf, URA ura, String str);

    boolean LJJ(Activity activity);

    InterfaceC65350Pko<? extends C8W0> LJJI();

    void LJJIFFI(String str, String str2, String str3);

    void LJJII(boolean z);

    EFM LJJIII();

    Intent LJJIIJ(Context context, int i);

    void LJJIIJZLJL(boolean z);

    void LJJIIZ(String str, Map map);

    FWR LJJIIZI(ActivityC45651qj activityC45651qj);

    void LJJIJ(boolean z);

    Class<? extends UPC> LJJIJIIJI();

    UQF LJJIJIIJIL(int i, boolean z);

    LKA LJJIJIL(Fragment fragment, HomePageDataViewModel homePageDataViewModel, AqS159S0100000_9 aqS159S0100000_9);

    boolean LJJIJL();

    boolean LJJIJLIJ();

    ISocialFriendsService LJJIL();

    boolean LJJIZ();

    Fragment LJJJ(EnumC72483ScZ enumC72483ScZ, MufPageTrackInfo mufPageTrackInfo);

    void LJJJI();

    EFM LJJJIL();

    InterfaceC51691KQl getFollowPresenter();

    M4C getRelationService();

    AbstractC73672Svk<ShortenUrlModel> shortenUrl(String str);
}
