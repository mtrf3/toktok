package com.ss.android.ugc.aweme.share;

import X.C188727au;
import X.C44423Hc3;
import X.C44498HdG;
import X.C62387Oe7;
import X.C76L;
import X.DialogC109334Qv;
import X.InterfaceC62225ObV;
import X.OW1;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.channel.ImChannel;
import com.ss.android.ugc.aweme.share.improve.channel.SubscribeInviteChannel;
import com.ss.android.ugc.aweme.share.improve.pkg.LiveSubscribeSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes11.dex */
public interface ShareDependService {
    public static final C44498HdG LIZ = C44498HdG.LIZ;

    C76L LIZ(String str, long j, String str2);

    void LIZIZ(Aweme aweme, Activity activity, String str, String str2);

    void LIZJ(String str, String str2, String str3);

    SubscribeInviteChannel LIZLLL(LiveSubscribeSharePackage liveSubscribeSharePackage);

    void LJ(Aweme aweme, String str, Context context, String str2, String str3, String str4, String str5, int i);

    void LJFF(Activity activity);

    DialogC109334Qv LJI(Activity activity, C62387Oe7 c62387Oe7, int i);

    boolean LJII();

    void LJIIIIZZ(Music music, Context context, String str);

    void LJIIIZ(Context context, String str, int i, int i2);

    void LJIIJ(boolean z);

    void LJIIJJI(Context context, Aweme aweme, BaseSharePackage baseSharePackage);

    void LJIIL(C188727au c188727au);

    void LJIILIIL(String str, String str2, String str3);

    boolean LJIILJJIL();

    int LJIILL(Aweme aweme);

    void LJIILLIIL(String str, BaseSharePackage baseSharePackage);

    void LJIIZILJ(String str, String str2, String str3);

    void LJIJ(Aweme aweme, String str);

    void LJIJI(Context context, boolean z);

    void LJIJJ(InterfaceC62225ObV interfaceC62225ObV);

    void LJIJJLI(Context context, String str);

    void LJIL(Context context, Aweme aweme, String str, String str2, String str3, String str4);

    OW1 LJJ();

    boolean LJJI(Aweme aweme);

    void LJJIFFI(Context context, Aweme aweme, BaseSharePackage baseSharePackage);

    void LJJII(Context context, Aweme aweme, BaseSharePackage baseSharePackage);

    void LJJIII(Context context, Aweme aweme, BaseSharePackage baseSharePackage);

    TuxSheet LJJIIJ(Activity activity, C62387Oe7 c62387Oe7, Bundle bundle, boolean z);

    void LJJIIJZLJL(Activity activity, Aweme aweme);

    C44423Hc3 LJJIIZ(User user);

    String LJJIIZI(int i, String str, Aweme aweme);

    void LJJIJ(Context context, Aweme aweme);

    ImChannel LJJIJIIJI(SharePackage sharePackage, String str);

    void LJJIJIIJIL(Context context, Aweme aweme, boolean z, ArrayList arrayList, int i, boolean z2, String str);

    void LJJIJIL(String str, Aweme aweme, Activity activity, String str2, Map<String, String> map, boolean z, boolean z2);

    void LJJIJL(Context context, String str);

    boolean LJJIJLIJ(Aweme aweme);
}
