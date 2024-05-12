package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;

/* renamed from: X.3GF, reason: invalid class name */
/* loaded from: classes2.dex */
public interface C3GF {
    Object LIZJ(InterfaceC67352kd<? super Integer> interfaceC67352kd);

    Object LIZLLL(String str, String str2, InterfaceC67352kd<? super Boolean> interfaceC67352kd);

    Object LJ(C85963Yy c85963Yy);

    OSZ LJFF(String str);

    void LJI(String str, InterfaceC80823Fe interfaceC80823Fe);

    void LJII(User user, AqS151S0100000_1 aqS151S0100000_1);

    List LJIIIIZZ(String str, List list);

    void LJIIIZ(String str, boolean z);

    void LJIIJ(InterfaceC80823Fe interfaceC80823Fe);

    String LJIIJJI(String str);

    IMUser LJIIL(String str);

    List<IMUser> LJIILIIL();

    Object LJIILJJIL(C3GI c3gi);

    Boolean LJIILL(String str);

    List<IMUser> LJIILLIIL();

    void LJIIZILJ(IMUser iMUser);

    void LJIJ(Aweme aweme, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns);

    String LJIJI(IMContact iMContact);

    String LJIJJ(IMContact iMContact);

    void LJIJJLI(IMUser iMUser);

    List<IMUser> getAllFriends();
}
