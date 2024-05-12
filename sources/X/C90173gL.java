package X;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3gL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C90173gL {
    public static final /* synthetic */ int LIZ = 0;

    public static User LIZ(IMUser imUser) {
        o.LJIIIZ(imUser, "imUser");
        User user = new User();
        user.setUid(imUser.getUid());
        user.setNickname(imUser.getNickName());
        user.setSignature(imUser.getSignature());
        user.setAvatarThumb(imUser.getAvatarThumb());
        user.setUniqueId(imUser.getUniqueId());
        user.setShortId(imUser.getShortId());
        user.setFollowStatus(imUser.getFollowStatus());
        user.setCustomVerify(imUser.getCustomVerify());
        user.setEnterpriseVerifyReason(imUser.getEnterpriseVerifyReason());
        user.setVerificationType(imUser.getVerificationType());
        user.setRemarkName(imUser.getRemarkName());
        user.isBlock = imUser.isBlock();
        user.setSecUid(imUser.getSecUid());
        user.setRegion("");
        return user;
    }

    public static List LIZIZ(List list) {
        ArrayList LJ = AnonymousClass391.LJ(list, "userList");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LJ.add(LIZ((IMUser) it.next()));
        }
        return LJ;
    }

    public static List LIZJ(List list) {
        ArrayList LJ = AnonymousClass391.LJ(list, "userList");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            IMUser LJIIZILJ = C78966Uyw.LJIIZILJ((User) it.next());
            if (LJIIZILJ != null) {
                LJ.add(LJIIZILJ);
            }
        }
        return LJ;
    }

    public static String LIZLLL(IMUser iMUser) {
        boolean z;
        String uniqueId = iMUser.getUniqueId();
        if (uniqueId == null || uniqueId.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str = "";
        if (z) {
            String nickName = iMUser.getNickName();
            if (nickName != null && nickName.length() != 0) {
                str = iMUser.getNickName();
            }
            o.LJIIIIZZ(str, "{\n            if (user.n…e user.nickName\n        }");
        } else {
            String uniqueId2 = iMUser.getUniqueId();
            if (uniqueId2 != null && uniqueId2.length() != 0) {
                str = iMUser.getUniqueId();
            }
            o.LJIIIIZZ(str, "{\n            if (user.u…e user.uniqueId\n        }");
        }
        return str;
    }

    public static String LJ(IMUser iMUser) {
        boolean z;
        String nickName = iMUser.getNickName();
        if (nickName == null || nickName.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str = "";
        if (z) {
            String uniqueId = iMUser.getUniqueId();
            if (uniqueId != null && uniqueId.length() != 0) {
                str = iMUser.getUniqueId();
            }
            o.LJIIIIZZ(str, "{\n            if (user.u…e user.uniqueId\n        }");
        } else {
            String nickName2 = iMUser.getNickName();
            if (nickName2 != null && nickName2.length() != 0) {
                str = iMUser.getNickName();
            }
            o.LJIIIIZZ(str, "{\n            if (user.n…e user.nickName\n        }");
        }
        return str;
    }

    public static int LJFF(Context context) {
        int i;
        o.LJIIIZ(context, "context");
        int LJFF = C60996Nwm.LJFF(context) - C63081OpJ.LJJJJLI(context);
        if (C60996Nwm.LIZLLL(context) != 0) {
            i = C60996Nwm.LIZLLL(context);
        } else {
            i = 0;
        }
        return O6R.LJJIIJZLJL((LJFF - i) * 0.99d);
    }

    public static String LJI(IMUser user) {
        o.LJIIIZ(user, "user");
        if (C85990Xow.LJIIIZ()) {
            return LJ(user);
        }
        return LIZLLL(user);
    }

    public static void LJII(IMUser user, TextView name, TextView desc) {
        String LJ;
        o.LJIIIZ(user, "user");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(desc, "desc");
        name.setText(LJI(user));
        if (C85990Xow.LJIIIZ()) {
            LJ = LIZLLL(user);
        } else {
            LJ = LJ(user);
        }
        desc.setText(LJ);
        if (TextUtils.isEmpty(desc.getText())) {
            desc.setVisibility(8);
        } else {
            desc.setVisibility(0);
        }
    }
}
