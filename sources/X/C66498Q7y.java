package X;

import android.text.TextUtils;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.internal.LobbyViewModel;

/* renamed from: X.Q7y, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66498Q7y {
    public static void LIZ(LobbyViewModel lobbyViewModel, String str) {
        if (lobbyViewModel == null || TextUtils.isEmpty(str)) {
            return;
        }
        String LIZJ = C0ON.LIZJ("[", str, "] ", "provider currently does not support logging out, please contact Lobby developer for further details.");
        Q8M q8m = new Q8M(str, 2);
        q8m.LIZ = false;
        q8m.LIZIZ = new C66504Q8e(1, LIZJ);
        lobbyViewModel.hv0(new AuthResult(q8m));
    }

    public static void LIZIZ(LobbyViewModel lobbyViewModel, String str, int i) {
        if (lobbyViewModel == null || TextUtils.isEmpty(str)) {
            return;
        }
        String LIZJ = C0ON.LIZJ("[", str, "] ", "provider is not available, make sure you have added it to your dependency.");
        Q8M q8m = new Q8M(str, i);
        q8m.LIZ = false;
        q8m.LIZIZ = new C66504Q8e(2, LIZJ, "before_goto_URL");
        lobbyViewModel.hv0(new AuthResult(q8m));
    }
}
