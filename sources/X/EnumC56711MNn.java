package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.utils.FollowSortDataCache;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.MNn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC56711MNn {
    public static final EnumC56711MNn CREATE_TIME;
    public static final EnumC56711MNn FOLLOW_STATE;
    public static final EnumC56711MNn FROM_NOW;
    public static final EnumC56711MNn HAS_READ;
    public static final /* synthetic */ EnumC56711MNn[] LJLIL;

    public EnumC56711MNn() {
        throw null;
    }

    public static EnumC56711MNn valueOf(String str) {
        return (EnumC56711MNn) V0N.LJJJ(EnumC56711MNn.class, str);
    }

    public static EnumC56711MNn[] values() {
        return (EnumC56711MNn[]) LJLIL.clone();
    }

    public abstract int weight(FollowPageData... followPageDataArr);

    static {
        EnumC56711MNn enumC56711MNn = new EnumC56711MNn() { // from class: X.MNm
            @Override // X.EnumC56711MNn
            public final int weight(FollowPageData... f) {
                FollowRequestData followRequest;
                o.LJIIIZ(f, "f");
                MusNotice notice = f[0].getNotice();
                if ((notice == null || !notice.hasRead) && ((followRequest = f[0].getFollowRequest()) == null || !followRequest.getHasRead())) {
                    return 0;
                }
                return 1;
            }
        };
        HAS_READ = enumC56711MNn;
        EnumC56711MNn enumC56711MNn2 = new EnumC56711MNn() { // from class: X.MNp
            @Override // X.EnumC56711MNn
            public final int weight(FollowPageData... f) {
                FollowNotice followNotice;
                int intValue;
                User user;
                User user2;
                o.LJIIIZ(f, "f");
                MusNotice notice = f[0].getNotice();
                if (notice != null) {
                    FollowNotice followNotice2 = notice.followNotice;
                    if ((followNotice2 == null || (user2 = followNotice2.getUser()) == null || user2.getFollowStatus() != 2) && ((followNotice = notice.followNotice) == null || (user = followNotice.getUser()) == null || user.getFollowStatus() != 4)) {
                        String str = notice.nid;
                        o.LJIIIIZZ(str, "notice.nid");
                        FollowSortDataCache.LIZIZ();
                        Integer num = FollowSortDataCache.LIZ.get(str);
                        if (num == null) {
                            intValue = 0;
                        } else {
                            intValue = num.intValue();
                        }
                        if (intValue >= FollowSortDataCache.LIZIZ) {
                        }
                    }
                    return 1;
                }
                return 0;
            }
        };
        FOLLOW_STATE = enumC56711MNn2;
        EnumC56711MNn enumC56711MNn3 = new EnumC56711MNn() { // from class: X.MNo
            @Override // X.EnumC56711MNn
            public final int weight(FollowPageData... f) {
                FollowNotice followNotice;
                o.LJIIIZ(f, "f");
                int i = 0;
                MusNotice notice = f[0].getNotice();
                if (notice != null && (followNotice = notice.followNotice) != null && followNotice.isNowFollow()) {
                    i = 1;
                }
                return i ^ 1;
            }
        };
        FROM_NOW = enumC56711MNn3;
        EnumC56711MNn enumC56711MNn4 = new EnumC56711MNn() { // from class: X.MNq
            @Override // X.EnumC56711MNn
            public final int weight(FollowPageData... f) {
                o.LJIIIZ(f, "f");
                if (f[0].getCreateTime() < f[1].getCreateTime()) {
                    return 1;
                }
                if (f[0].getCreateTime() <= f[1].getCreateTime()) {
                    return 0;
                }
                return -1;
            }
        };
        CREATE_TIME = enumC56711MNn4;
        LJLIL = new EnumC56711MNn[]{enumC56711MNn, enumC56711MNn2, enumC56711MNn3, enumC56711MNn4};
    }

    public EnumC56711MNn(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
