package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._BadgeStruct_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _RankUser_ProtoDecoder implements InterfaceC31105CIr<RankUser> {
    @Override // X.InterfaceC31105CIr
    public final RankUser LIZ(Q9H q9h) {
        RankUser rankUser = new RankUser();
        rankUser.badgeList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 3) {
                        if (LJI != 9) {
                            if (LJI != 18) {
                                if (LJI != 22) {
                                    if (LJI != 25) {
                                        if (LJI != 38) {
                                            if (LJI != 64) {
                                                if (LJI != 1024) {
                                                    if (LJI != 1028) {
                                                        Q9J.LIZJ(q9h);
                                                    } else {
                                                        rankUser.idStr = Q9J.LIZIZ(q9h);
                                                    }
                                                } else {
                                                    rankUser.followStatus = q9h.LJIIJJI();
                                                }
                                            } else {
                                                rankUser.badgeList.add(_BadgeStruct_ProtoDecoder.LIZIZ(q9h));
                                            }
                                        } else {
                                            rankUser.displayId = Q9J.LIZIZ(q9h);
                                        }
                                    } else {
                                        rankUser.border = _RankUser_Border_ProtoDecoder.LIZIZ(q9h);
                                    }
                                } else {
                                    rankUser.followInfo = _RankUser_FollowInfo_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                rankUser.secret = q9h.LJIIJ();
                            }
                        } else {
                            rankUser.avatarThumb = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        rankUser.nickname = Q9J.LIZIZ(q9h);
                    }
                } else {
                    rankUser.id = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return rankUser;
            }
        }
    }
}
