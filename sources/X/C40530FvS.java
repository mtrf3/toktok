package X;

import Y.ACallableS83S0200000_6;
import Y.ARunnableS15S0101000_11;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.FvS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40530FvS implements InterfaceC252619vl {
    public static String LIZ(User user) {
        if (user == null || user.getAvatarThumb() == null || C38891fp.LJJI(user.getAvatarThumb().getUrlList())) {
            return "";
        }
        return (String) ListProtector.get(user.getAvatarThumb().getUrlList(), 0);
    }

    @Override // X.InterfaceC252619vl
    public final void t0(int i, User user, User user2) {
        boolean z;
        boolean z2 = false;
        if (i != 4) {
            if (i != 5) {
                if (i != 6) {
                    if (i == 10) {
                        C2U8.LIZIZ(new C40531FvT());
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("code", 1);
                            jSONObject.put("user_id", user2.getUid());
                        } catch (JSONException e) {
                            C16880lQ.LLLLIIL(e);
                        }
                        C2U8.LIZIZ(new C38293F1d("userLogin", jSONObject));
                    }
                } else {
                    IMService.createIIMServicebyMonsterPlugin(false).getImUserService().LJIIZILJ(C78966Uyw.LJIIZILJ(user2));
                }
            } else {
                C2U8.LIZ(new AWX(user2));
            }
        } else {
            C10K.LIZIZ(new ACallableS83S0200000_6(user2, user, 20), C38995FSd.LIZLLL(), null);
        }
        List asList = Arrays.asList(6, 7);
        if (user != null && user2 != null) {
            z2 = !TextUtils.equals(user.getNickname(), user2.getNickname());
            z = !TextUtils.equals(LIZ(user), LIZ(user2));
        } else {
            z = false;
        }
        if (!asList.contains(Integer.valueOf(i)) && !z2 && !z) {
            return;
        }
        C46104I7o c46104I7o = new C46104I7o();
        if (z2) {
            user2.getNickname();
        }
        if (z) {
            LIZ(user2);
        }
        C82544WaS.LIZ(new ARunnableS15S0101000_11(4, c46104I7o, 14));
    }
}
