package com.ss.android.ugc.aweme.share;

import X.AbstractC37594EpC;
import X.AbstractC73635Sv9;
import X.ActivityC45651qj;
import X.C111584Zm;
import X.C118334kf;
import X.C43659HBn;
import X.C43694HCw;
import X.C44913Hjx;
import X.C44928HkC;
import X.C45382HrW;
import X.C50420Jqa;
import X.C61730OKo;
import X.C62177Oaj;
import X.C62178Oak;
import X.C62355Odb;
import X.C62394OeE;
import X.C62442Of0;
import X.C62462OfK;
import X.C62686Oiw;
import X.C76800UCe;
import X.C8BR;
import X.DialogC25756A8y;
import X.EnumC62617Ohp;
import X.InterfaceC57312Mt;
import X.InterfaceC62225ObV;
import X.InterfaceC72642tA;
import X.InterfaceC88472Yns;
import X.OSZ;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS189S0100000_7;

/* loaded from: classes11.dex */
public interface ShareExtService {
    void LIZ();

    boolean LIZIZ(Aweme aweme, InterfaceC57312Mt interfaceC57312Mt);

    boolean LIZJ();

    C62462OfK LIZLLL();

    void LJ(String str, Integer num, C8BR<?, ?> c8br, OSZ<Integer, String> osz);

    OSZ<Boolean, String> LJFF(Aweme aweme);

    String LJI();

    FrameLayout.LayoutParams LJII(Context context, int i, int i2, int i3, int i4, int i5, int i6);

    EnumC62617Ohp LJIIIIZZ(String str, String str2);

    void LJIIIZ(String str);

    void LJIIJ(Aweme aweme);

    void LJIIJJI(Aweme aweme, Activity activity, String str, String str2, int i, View view, Fragment fragment, InterfaceC72642tA<C50420Jqa> interfaceC72642tA);

    void LJIIL(Context context, String str);

    boolean LJIILIIL();

    Drawable LJIILJJIL(Activity activity, String str);

    boolean LJIILL(Aweme aweme, String str);

    boolean LJIILLIIL(Aweme aweme);

    boolean LJIIZILJ(Context context, Aweme aweme);

    String LJIJ();

    boolean LJIJI(Comment comment);

    boolean LJIJJ();

    void LJIJJLI(TuxIconView tuxIconView, DialogC25756A8y dialogC25756A8y, ActivityC45651qj activityC45651qj);

    boolean LJIL(Context context, Aweme aweme, String str);

    void LJJ(Activity activity, AqS134S0200000_3 aqS134S0200000_3);

    C44928HkC LJJI(Activity activity, Aweme aweme, String str, String str2, String str3);

    boolean LJJIFFI();

    void LJJII(Fragment fragment, C50420Jqa c50420Jqa);

    Map<String, InterfaceC62225ObV> LJJIII();

    C61730OKo LJJIIJ(Challenge challenge);

    Drawable LJJIIJZLJL(Activity activity);

    void LJJIIZ(SharePackage sharePackage);

    C62442Of0 LJJIIZI();

    boolean LJJIJ(Context context, Activity activity, C44913Hjx c44913Hjx, AqS189S0100000_7 aqS189S0100000_7);

    void LJJIJIIJI(Aweme aweme, String str, Bundle bundle);

    void LJJIJIIJIL(Aweme aweme, String str, int i, int i2);

    void LJJIJIL(Aweme aweme);

    boolean LJJIJL();

    void LJJIJLIJ(Uri uri);

    void LJJIL(int i, String str);

    C62178Oak LJJIZ(Challenge challenge, boolean z, String str, String str2, String str3);

    C118334kf LJJJ(Music music);

    void LJJJI(boolean z);

    boolean LJJJIL(C43694HCw c43694HCw, ActivityC45651qj activityC45651qj);

    boolean LJJJJ(Aweme aweme);

    void LJJJJI(Activity activity, C45382HrW c45382HrW);

    List<InterfaceC62225ObV> LJJJJIZL(ShareContentType[] shareContentTypeArr);

    boolean LJJJJJ(String str);

    String[] LJJJJJL();

    void LJJJJL(Aweme aweme);

    boolean LJJJJLI();

    boolean LJJJJLL();

    C43659HBn LJJJJZ();

    void LJJJJZI(Activity activity);

    boolean LJJJLIIL();

    C111584Zm LJJJLL(Music music);

    C62177Oaj LJJJLZIJ(Music music);

    void LJJJZ();

    boolean LJJL();

    List<String> LJJLI();

    C62686Oiw LJJLIIIIJ(String str, Aweme aweme);

    void LJJLIIIJ(String str);

    void LJJLIIIJILLIZJL(Aweme aweme);

    C62355Odb LJJLIIIJJI(BaseSharePackage baseSharePackage);

    void LJJLIIIJJIZ(Activity activity, InterfaceC88472Yns<? super OSZ<String, ? extends Drawable>, C76800UCe> interfaceC88472Yns);

    String LJJLIIIJL();

    void LJJLIIIJLJLI(InterfaceC62225ObV interfaceC62225ObV, C62394OeE c62394OeE);

    AbstractC73635Sv9<String> LJJLIIIJLLLLLLLZ(String str, String str2, String str3);

    List<Class<? extends AbstractC37594EpC<?, ?>>> provideXBridgetIDLMethodList();
}
