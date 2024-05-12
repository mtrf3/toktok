package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Les, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54790Les implements InterfaceC55036Liq {
    public static final C54790Les LIZ = new C54790Les();
    public static final java.util.Map<String, java.util.Set<L7M>> LIZIZ = new LinkedHashMap();
    public static final java.util.Map<L7M, String> LIZJ = new LinkedHashMap();
    public static final java.util.Map<LifecycleOwner, java.util.Set<L7M>> LIZLLL = new LinkedHashMap();

    @Override // X.InterfaceC55036Liq
    public final boolean LIZ(User user) {
        String str;
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        if (str == null || C6D8.LIZLLL()) {
            return false;
        }
        boolean LJ = o.LJ(user.getUid(), AccountService.LJIJ().LJFF().getCurUserId());
        if (user.getStoryStatus() < 1) {
            if (!LJ) {
                return false;
            }
            C43921HLp.LIZ.getClass();
            if (C43921HLp.LJIJ().isEmpty()) {
                return false;
            }
        }
        C53578L1a.LIZ.getClass();
        if (!C53578L1a.LIZ() || user.isAdFake() || user.isBlock || user.isBlocked()) {
            return false;
        }
        if (AV1.LJIIZILJ(user, LJ) && user.getFollowStatus() != 1 && user.getFollowStatus() != 2) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC55036Liq
    public final void LIZIZ(String str, String str2, User user, String str3) {
        int i;
        String uid = user.getUid();
        if (user.getFollowStatus() == 2) {
            i = 2;
        } else if (user.getFollowStatus() == 1) {
            i = 1;
        } else if (user.getFollowerStatus() == 1) {
            i = 3;
        } else {
            i = 0;
        }
        OSZ[] oszArr = new OSZ[5];
        oszArr[0] = new OSZ(str2, "enter_from");
        oszArr[1] = new OSZ(uid, "author_id");
        oszArr[2] = new OSZ(Integer.valueOf(i), "follow_status");
        if (str3 == null) {
            str3 = "";
        }
        oszArr[3] = new OSZ(str3, "req_id");
        oszArr[4] = new OSZ("video_cover", "enter_method");
        FMX.LJIILL(str, oszArr);
    }
}
