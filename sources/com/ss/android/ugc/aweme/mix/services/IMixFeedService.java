package com.ss.android.ugc.aweme.mix.services;

import X.C229238z9;
import X.C229568zg;
import X.C49398Ja6;
import X.C56306M7y;
import X.GTJ;
import X.InterfaceC229218z7;
import X.InterfaceC56305M7x;
import X.InterfaceC65784Pro;
import X.MG8;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.bottom.MixBottomBarVM;
import com.ss.android.ugc.aweme.services.IAVMixFeedServiceImpl$showAddToMixInPublishPage$1;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.InteractPlayListBottomBarAssem;

/* loaded from: classes10.dex */
public interface IMixFeedService {
    boolean LIZ(Aweme aweme);

    boolean LIZIZ();

    void LIZJ();

    void LIZLLL(Activity activity, Aweme aweme, String str, String str2, String str3, String str4);

    MixBottomBarVM LJ(InteractPlayListBottomBarAssem interactPlayListBottomBarAssem);

    void LJFF(boolean z);

    void LJI(boolean z);

    void LJII(CreatorToolsActivity creatorToolsActivity, String str, String str2);

    void LJIIIIZZ(InterfaceC56305M7x interfaceC56305M7x);

    void LJIIIZ();

    void LJIIJ(int i, int i2, String str, String str2, String str3, String str4, String str5);

    void LJIIJJI(String str, String str2, String str3, String str4, C229238z9 c229238z9, Integer num);

    void LJIIL();

    void LJIILIIL(Context context, String str, Aweme aweme, String str2, String str3, String str4, String str5, String str6, boolean z, C229238z9 c229238z9, String str7, Boolean bool);

    void LJIILJJIL(Context context, Bundle bundle, int i, String str, String str2);

    void LJIILL(Activity activity, IAVMixFeedServiceImpl$showAddToMixInPublishPage$1 iAVMixFeedServiceImpl$showAddToMixInPublishPage$1, String str, String str2, String str3, String str4);

    void LJIILLIIL(String str, String str2, String str3, String str4, String str5, C229238z9 c229238z9, Integer num);

    boolean LJIIZILJ(Aweme aweme);

    GTJ LJIJ();

    Integer LJIJI();

    void LJIJJ(Context context);

    void LJIJJLI();

    void LJIL(String str, String str2, String str3, String str4, float f, String str5, C229238z9 c229238z9, Integer num);

    void LJJ(String str, String str2, C56306M7y c56306M7y);

    void LJJI(int i, String str, String str2, String str3, String str4, long j, String str5, String str6);

    C229568zg LJJIFFI(AssemViewModel assemViewModel);

    MG8 LJJII(ViewGroup viewGroup, boolean z, boolean z2, String str, C49398Ja6 c49398Ja6);

    TuxSheet LJJIII(Context context, String str, String str2, Aweme aweme, String str3, C229238z9 c229238z9, InterfaceC65784Pro interfaceC65784Pro);

    boolean LJJIIJ();

    void LJJIIJZLJL(Context context, Aweme aweme, C229238z9 c229238z9, Float f, String str, String str2, String str3, boolean z, boolean z2);

    void LJJIIZ(Activity activity, Aweme aweme, InterfaceC229218z7 interfaceC229218z7, String str, String str2);

    boolean LJJIIZI(Aweme aweme);

    void LJJIJ(Context context, Bundle bundle, String str, String str2, Long l, String str3);

    void LJJIJIIJI(Context context, Bundle bundle);

    boolean getPushLiveState();

    boolean needCreateFirstMix();

    boolean needShowAddOrRemoveButton();
}
