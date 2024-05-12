package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.contact.model.Avatars;
import com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.3Yv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85933Yv {
    public static final /* synthetic */ int LIZ = 0;

    public static C3ZN LIZ(IMUserBaseInfo imUserBaseInfo) {
        String str;
        String str2;
        Avatars avatars;
        o.LJIIIZ(imUserBaseInfo, "imUserBaseInfo");
        String str3 = "";
        try {
            avatars = imUserBaseInfo.getAvatars();
        } catch (Exception unused) {
            str = "";
        }
        if (avatars == null) {
            str2 = "";
            return new C3ZN(imUserBaseInfo.getUserId(), str3, str2, imUserBaseInfo.getContactNickName(), imUserBaseInfo.getUniqueId(), imUserBaseInfo.getFollowStatus(), imUserBaseInfo.getMafStatus(), imUserBaseInfo.getRecType(), imUserBaseInfo.getUpdateTime(), imUserBaseInfo.getSortWeight(), imUserBaseInfo.getInitialLetter(), imUserBaseInfo.getExtra());
        }
        UrlModel urlModel = avatars.avatarThumb;
        if (urlModel == null) {
            str = "";
        } else {
            str = C75792yF.LIZJ(urlModel);
            o.LJIIIIZZ(str, "toJson(it)");
        }
        try {
            UrlModel urlModel2 = avatars.avatarMedium;
            if (urlModel2 != null) {
                String LIZJ = C75792yF.LIZJ(urlModel2);
                o.LJIIIIZZ(LIZJ, "toJson(it)");
                str3 = LIZJ;
            }
        } catch (Exception unused2) {
        }
        str2 = str3;
        str3 = str;
        return new C3ZN(imUserBaseInfo.getUserId(), str3, str2, imUserBaseInfo.getContactNickName(), imUserBaseInfo.getUniqueId(), imUserBaseInfo.getFollowStatus(), imUserBaseInfo.getMafStatus(), imUserBaseInfo.getRecType(), imUserBaseInfo.getUpdateTime(), imUserBaseInfo.getSortWeight(), imUserBaseInfo.getInitialLetter(), imUserBaseInfo.getExtra());
    }

    public static IMUserBaseInfo LIZIZ(C3ZN imUserEntity) {
        o.LJIIIZ(imUserEntity, "imUserEntity");
        IMUserBaseInfo iMUserBaseInfo = new IMUserBaseInfo();
        iMUserBaseInfo.setUserId(imUserEntity.LIZ);
        iMUserBaseInfo.setAvatarThumbStr(imUserEntity.LIZIZ);
        iMUserBaseInfo.setAvatarMediumStr(imUserEntity.LIZJ);
        iMUserBaseInfo.setContactNickName(imUserEntity.LIZLLL);
        iMUserBaseInfo.setUniqueId(imUserEntity.LJ);
        iMUserBaseInfo.setFollowStatus(imUserEntity.LJFF);
        iMUserBaseInfo.setMafStatus(imUserEntity.LJI);
        iMUserBaseInfo.setUpdateTime(imUserEntity.LJIIIIZZ);
        iMUserBaseInfo.setSortWeight(imUserEntity.LJIIIZ);
        iMUserBaseInfo.setInitialLetter(imUserEntity.LJIIJ);
        iMUserBaseInfo.setExtra(imUserEntity.LJIIJJI);
        return iMUserBaseInfo;
    }
}
