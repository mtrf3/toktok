package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.share.fragment.DownloadAndShareFragment;
import com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.LongPressShareWidget;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS151S0100000_1;

/* renamed from: X.4Qw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC109344Qw {
    void LIZ(Context context, int[] iArr, AwemeSharePackage awemeSharePackage, AqS151S0100000_1 aqS151S0100000_1, AqS151S0100000_1 aqS151S0100000_12, AqS141S0200000_10 aqS141S0200000_10);

    void LIZIZ(IMContact iMContact, SharePackage sharePackage, C4L0 c4l0);

    DownloadAndShareFragment LIZJ(ActivityC45651qj activityC45651qj, SharePackage sharePackage);

    C4SY LIZLLL();

    void LJ(SharePackage sharePackage);

    C78842Uww LJFF(C108634Od c108634Od);

    OOS LJI(Activity activity, C62387Oe7 c62387Oe7, C4NQ c4nq);

    C4L2 LJII();

    List<C66342j0> LJIIIIZZ();

    void LJIIIZ(long j, String str);

    void LJIIJ(SharePackage sharePackage);

    C108834Ox LJIIJJI(String str, String str2);

    void LJIIL(Context context, View view, C107794Kx c107794Kx);

    boolean LJIILIIL();

    void LJIILJJIL(ActivityC45651qj activityC45651qj, C62846OlW c62846OlW);

    void LJIILL(List<String> list);

    boolean LJIILLIIL();

    void LJIIZILJ(String str);

    boolean LJIJ();

    void LJIJI(String str, User user, Aweme aweme, String str2, boolean z, String str3, InterfaceC88472Yns<? super CharSequence, C76800UCe> interfaceC88472Yns);

    C4O4 LJIJJ(C4OO c4oo, C4RD c4rd);

    boolean LJIJJLI();

    LongPressShareWidget LJIL(C108654Of c108654Of, C4R9 c4r9);
}
