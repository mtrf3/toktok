package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.ss.android.ugc.aweme.im.sdk.group.data.model.GroupCheckMsg;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3Vw */
/* loaded from: classes2.dex */
public final class C85163Vw {
    public static final C85163Vw LIZ = new C85163Vw();

    public static final void LIZIZ(Context context, MG5 mg5) {
        if (C4VT.LIZIZ()) {
            Activity LJJLIIIJ = C78609UtB.LJJLIIIJ(context);
            if (LJJLIIIJ == null) {
                return;
            }
            C25678A5y.LIZIZ(LJJLIIIJ, mg5, null, null);
            return;
        }
        C05L.LIZLLL(context, R.string.g5r);
    }

    public static final void LIZJ(Context context, C63623Oy3 c63623Oy3, MG5 scene) {
        String str;
        String statusMsg;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(scene, "scene");
        if (c63623Oy3 == null || (str = c63623Oy3.LJ) == null || str.length() == 0) {
            LIZIZ(context, scene);
            return;
        }
        GroupCheckMsg groupCheckMsg = (GroupCheckMsg) C62070OXq.LIZ(GroupCheckMsg.class, c63623Oy3.LJ);
        if (groupCheckMsg == null || (statusMsg = groupCheckMsg.getStatusMsg()) == null || statusMsg.length() == 0) {
            LIZIZ(context, scene);
            return;
        }
        String statusMsg2 = groupCheckMsg.getStatusMsg();
        if (statusMsg2 == null) {
            return;
        }
        C30869C9p.LIZIZ(context, statusMsg2);
    }

    public static final void LIZ(IMUser iMUser, String str, Integer num, String str2) {
        int i;
        if (iMUser != null) {
            try {
                if (TextUtils.isEmpty(iMUser.getUid())) {
                    ArrayMap arrayMap = new ArrayMap();
                    String iMUser2 = iMUser.toString();
                    o.LJIIIIZZ(iMUser2, "user.toString()");
                    arrayMap.put("user", iMUser2);
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = -1;
                    }
                    arrayMap.put("key_enter_from", Integer.valueOf(i));
                    if (str == null) {
                        str = "empty";
                    }
                    arrayMap.put("conversation_id", str);
                    arrayMap.put("error_msg", str2);
                    C36L.LJ("empty_user", arrayMap);
                }
            } catch (Exception e) {
                C36922EeM.LIZ(e);
            }
        }
    }

    public static /* synthetic */ void LIZLLL(Context context, C63623Oy3 c63623Oy3, MG5 mg5, int i) {
        if ((i & 2) != 0) {
            c63623Oy3 = null;
        }
        if ((i & 4) != 0) {
            mg5 = MG5.CHAT;
        }
        LIZJ(context, c63623Oy3, mg5);
    }
}
