package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Uih, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77959Uih extends AbstractC03120Ai {
    public final List<AbstractC78035Ujv> LIZ;
    public final List<AbstractC78035Ujv> LIZIZ;

    @Override // X.AbstractC03120Ai
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC03120Ai
    public final int LJ() {
        return this.LIZ.size();
    }

    public C77959Uih(List<AbstractC78035Ujv> oldViewDataList, List<AbstractC78035Ujv> newViewDataList) {
        o.LJIIIZ(oldViewDataList, "oldViewDataList");
        o.LJIIIZ(newViewDataList, "newViewDataList");
        this.LIZ = oldViewDataList;
        this.LIZIZ = newViewDataList;
    }

    public static boolean LJFF(RankListV2Response.RankInfo rankInfo, RankListV2Response.RankInfo rankInfo2) {
        if (rankInfo.rank == rankInfo2.rank && o.LJ(C05170If.LIZ(rankInfo.user), C05170If.LIZ(rankInfo2.user)) && o.LJ(rankInfo.scoreDescription, rankInfo2.scoreDescription) && LJI(rankInfo, rankInfo2)) {
            return true;
        }
        return false;
    }

    public static boolean LJI(RankListV2Response.RankInfo rankInfo, RankListV2Response.RankInfo rankInfo2) {
        String str;
        ImageModel avatarThumb;
        ImageModel avatarThumb2;
        User user = rankInfo.user;
        String str2 = null;
        if (user != null && (avatarThumb2 = user.getAvatarThumb()) != null) {
            str = avatarThumb2.getUri();
        } else {
            str = null;
        }
        User user2 = rankInfo2.user;
        if (user2 != null && (avatarThumb = user2.getAvatarThumb()) != null) {
            str2 = avatarThumb.getUri();
        }
        if (o.LJ(str, str2) && rankInfo.roomId == rankInfo2.roomId) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZ(int i, int i2) {
        Object LIZ = ((AbstractC78035Ujv) ListProtector.get(this.LIZ, i)).LIZ();
        Object LIZ2 = ((AbstractC78035Ujv) ListProtector.get(this.LIZIZ, i2)).LIZ();
        if ((LIZ instanceof RankListV2Response.RankInfo) && (LIZ2 instanceof RankListV2Response.RankInfo)) {
            return LJFF((RankListV2Response.RankInfo) LIZ, (RankListV2Response.RankInfo) LIZ2);
        }
        if ((LIZ instanceof List) && (LIZ2 instanceof List)) {
            List list = (List) LIZ;
            List list2 = (List) LIZ2;
            if (list.size() == list2.size() && list.size() > 0) {
                int size = list.size();
                boolean z = true;
                for (int i3 = 0; i3 < size; i3++) {
                    if (z && (ListProtector.get(list, i3) instanceof RankListV2Response.RankInfo) && (ListProtector.get(list2, i3) instanceof RankListV2Response.RankInfo)) {
                        Object obj = ListProtector.get(list, i3);
                        o.LJII(obj, "null cannot be cast to non-null type com.bytedance.android.livesdk.rank.list.model.RankListV2Response.RankInfo");
                        Object obj2 = ListProtector.get(list2, i3);
                        o.LJII(obj2, "null cannot be cast to non-null type com.bytedance.android.livesdk.rank.list.model.RankListV2Response.RankInfo");
                        if (LJFF((RankListV2Response.RankInfo) obj, (RankListV2Response.RankInfo) obj2)) {
                            z = true;
                        }
                    }
                    z = false;
                }
                return z;
            }
            if (list.size() != list2.size() || list.size() != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZIZ(int i, int i2) {
        if (i == i2 && o.LJ(ListProtector.get(this.LIZ, i).getClass(), ListProtector.get(this.LIZIZ, i2).getClass())) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC03120Ai
    public final Object LIZJ(int i, int i2) {
        Object LIZ = ((AbstractC78035Ujv) ListProtector.get(this.LIZ, i)).LIZ();
        Object LIZ2 = ((AbstractC78035Ujv) ListProtector.get(this.LIZIZ, i2)).LIZ();
        if ((LIZ instanceof RankListV2Response.RankInfo) && (LIZ2 instanceof RankListV2Response.RankInfo) && LJI((RankListV2Response.RankInfo) LIZ, (RankListV2Response.RankInfo) LIZ2)) {
            return "ket_not_change_avatar";
        }
        if ((LIZ instanceof List) && (LIZ2 instanceof List)) {
            List list = (List) LIZ;
            List list2 = (List) LIZ2;
            if (list.size() == list2.size() && list.size() > 0) {
                int size = list.size();
                boolean z = true;
                for (int i3 = 0; i3 < size; i3++) {
                    if (z && (ListProtector.get(list, i3) instanceof RankListV2Response.RankInfo) && (ListProtector.get(list2, i3) instanceof RankListV2Response.RankInfo)) {
                        Object obj = ListProtector.get(list, i3);
                        o.LJII(obj, "null cannot be cast to non-null type com.bytedance.android.livesdk.rank.list.model.RankListV2Response.RankInfo");
                        Object obj2 = ListProtector.get(list2, i3);
                        o.LJII(obj2, "null cannot be cast to non-null type com.bytedance.android.livesdk.rank.list.model.RankListV2Response.RankInfo");
                        if (LJI((RankListV2Response.RankInfo) obj, (RankListV2Response.RankInfo) obj2)) {
                            z = true;
                        }
                    }
                    z = false;
                }
                if (z) {
                    return "ket_not_change_avatar";
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
