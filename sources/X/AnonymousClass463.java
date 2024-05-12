package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.v2.UserProfilePreloadHelper;
import com.ss.android.ugc.aweme.profile.util.IUserProfilePreload;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.463, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass463 {
    public final C99033ud LIZ;
    public final MutableLiveData<C93063l0> LIZIZ;
    public final LifecycleOwner LIZJ;
    public final InterfaceC1042747j LIZLLL;
    public final C1049449y LJ;
    public final AnonymousClass466 LJFF;

    public static void LIZ(Context context, String aid) {
        java.util.Set<String> set;
        if (!C48203Ivv.LJ(context)) {
            return;
        }
        o.LJIIIZ(aid, "aid");
        C92983ks c92983ks = (C92983ks) ((LinkedHashMap) C92993kt.LIZ).get(Long.valueOf(C92993kt.LIZIZ));
        if (c92983ks == null || (set = c92983ks.LIZ) == null) {
            return;
        }
        set.add(aid);
    }

    public static void LIZIZ(String str, String str2) {
        IMUser LJIIJ = C80533Eb.LJIIJ(str, str2);
        if (LJIIJ != null) {
            IUserProfilePreload LJIIIIZZ = UserProfilePreloadHelper.LJIIIIZZ();
            User user = IMUser.toUser(LJIIJ);
            o.LJIIIIZZ(user, "toUser(imUser)");
            LJIIIIZZ.LIZJ(user);
        }
    }

    public AnonymousClass463(C99033ud sessionInfo, MutableLiveData mutableLiveData, LifecycleOwner owner, C46S c46s, C1049449y c1049449y) {
        o.LJIIIZ(sessionInfo, "sessionInfo");
        o.LJIIIZ(owner, "owner");
        this.LIZ = sessionInfo;
        this.LIZIZ = mutableLiveData;
        this.LIZJ = owner;
        this.LIZLLL = c46s;
        this.LJ = c1049449y;
        this.LJFF = new AnonymousClass466();
    }
}
