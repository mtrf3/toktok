package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _FansPrivilege_ProtoDecoder implements InterfaceC31105CIr<FansPrivilege> {
    public static FansPrivilege LIZIZ(Q9H q9h) {
        FansPrivilege fansPrivilege = new FansPrivilege();
        fansPrivilege.fansPrivilegeDetails = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    fansPrivilege.avatarThumb = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                fansPrivilege.nextLevelHasPrivilege = _FansScoreRule_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            fansPrivilege.fansPrivilegeDetails.add(_FansPrivilegeDetail_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        fansPrivilege.discordEntrance = _DiscordEntrance_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    fansPrivilege.fansLevelInfo = _FansLevelInfo_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return fansPrivilege;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FansPrivilege LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
