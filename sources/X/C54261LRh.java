package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.notice.api.bean.NicknameStoreData;
import com.ss.android.ugc.aweme.notice.api.bean.ProfileTabStoreData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.LRh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54261LRh {
    public static final /* synthetic */ int LIZ = 0;

    public static NicknameStoreData LIZ() {
        try {
            String string = LIZJ().getString((String) C2WJ.LIZIZ.getValue(), "");
            if (string != null && string.length() != 0) {
                NicknameStoreData nicknameStoreData = (NicknameStoreData) JsonParseUtils.LIZJ(NicknameStoreData.class, string);
                if (nicknameStoreData != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("get nickname data, is account panel unfold: ");
                    LIZ2.append(nicknameStoreData.isPanelUnfold);
                    LIZ2.append(", count: ");
                    LIZ2.append(nicknameStoreData.totalCount);
                    C221018lt.LJFF("ProfileNoticeCountInfoDataCache", X1D.LIZIZ(LIZ2));
                } else {
                    C221018lt.LJFF("ProfileNoticeCountInfoDataCache", "get nickname data, is null");
                }
                return nicknameStoreData;
            }
            return null;
        } catch (Throwable th) {
            Throwable LJFF = AnonymousClass028.LJFF(th);
            if (LJFF != null) {
                C221018lt.LIZJ("ProfileNoticeCountInfoDataCache", "getNicknameNoticeCountData error", LJFF);
            }
            return null;
        }
    }

    public static ProfileTabStoreData LIZIZ() {
        try {
            String string = LIZJ().getString((String) C2WJ.LIZ.getValue(), "");
            if (string != null && string.length() != 0) {
                ProfileTabStoreData profileTabStoreData = (ProfileTabStoreData) JsonParseUtils.LIZJ(ProfileTabStoreData.class, string);
                if (profileTabStoreData != null) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("get profile data: is profile tab clicked: ");
                    LIZ2.append(profileTabStoreData.isProfileTabClicked);
                    LIZ2.append(", count: ");
                    LIZ2.append(profileTabStoreData.totalCount);
                    C221018lt.LJFF("ProfileNoticeCountInfoDataCache", X1D.LIZIZ(LIZ2));
                } else {
                    C221018lt.LJFF("ProfileNoticeCountInfoDataCache", "get profile data: is profile tab clicked: null, count: null");
                }
                return profileTabStoreData;
            }
            return null;
        } catch (Throwable th) {
            Throwable LJFF = AnonymousClass028.LJFF(th);
            if (LJFF != null) {
                C221018lt.LIZJ("ProfileNoticeCountInfoDataCache", "getProfileTabNoticeCountData error", LJFF);
            }
            return null;
        }
    }

    public static Keva LIZJ() {
        String str;
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (curUser == null || (str = curUser.getUid()) == null) {
            str = "";
        }
        String LLLZ = C16880lQ.LLLZ("profile_data_%s_repo_v2", Arrays.copyOf(new Object[]{str}, 1));
        o.LJIIIIZZ(LLLZ, "format(this, *args)");
        Keva repo = Keva.getRepo(LLLZ);
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME_FORMAT.format(uid))");
        return repo;
    }

    public static void LIZLLL(NicknameStoreData nicknameStoreData) {
        Object LIZ2;
        try {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("store nickname data, is panel unfold: ");
            LIZ3.append(nicknameStoreData.isPanelUnfold);
            LIZ3.append(", count: ");
            LIZ3.append(nicknameStoreData.totalCount);
            C221018lt.LJFF("ProfileNoticeCountInfoDataCache", X1D.LIZIZ(LIZ3));
            LIZJ().storeString((String) C2WJ.LIZIZ.getValue(), JsonParseUtils.LIZLLL(nicknameStoreData));
            LIZ2 = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ2);
        if (m10exceptionOrNullimpl != null) {
            C221018lt.LIZJ("ProfileNoticeCountInfoDataCache", "storeNicknameNoticeCountData", m10exceptionOrNullimpl);
        }
    }

    public static void LJ(boolean z) {
        NicknameStoreData LIZ2 = LIZ();
        if (LIZ2 == null) {
            LIZLLL(new NicknameStoreData(z, 0));
        } else {
            LIZ2.isPanelUnfold = z;
            LIZLLL(LIZ2);
        }
    }

    public static void LJFF(ProfileTabStoreData profileTabStoreData) {
        Object LIZ2;
        try {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("store profile data, is profile tab clicked: ");
            LIZ3.append(profileTabStoreData.isProfileTabClicked);
            LIZ3.append(", count: ");
            LIZ3.append(profileTabStoreData.totalCount);
            C221018lt.LJFF("ProfileNoticeCountInfoDataCache", X1D.LIZIZ(LIZ3));
            LIZJ().storeString((String) C2WJ.LIZ.getValue(), JsonParseUtils.LIZLLL(profileTabStoreData));
            LIZ2 = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ2);
        if (m10exceptionOrNullimpl != null) {
            C221018lt.LIZJ("ProfileNoticeCountInfoDataCache", "storeProfileTabNoticeCountData", m10exceptionOrNullimpl);
        }
    }

    public static void LJI(boolean z) {
        ProfileTabStoreData LIZIZ = LIZIZ();
        if (LIZIZ == null) {
            LJFF(new ProfileTabStoreData(false, 0));
        } else {
            LIZIZ.isProfileTabClicked = z;
            LJFF(LIZIZ);
        }
    }
}
