package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._AvatarFrame_ProtoDecoder;
import com.bytedance.android.live.base.model.user._BadgeStruct_ProtoDecoder;
import com.bytedance.android.live.base.model.user._EntranceEffect_ProtoDecoder;
import com.bytedance.android.live.base.model.user._PrivilegeLogExtra_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _UserPrivilege_ProtoDecoder implements InterfaceC31105CIr<UserPrivilege> {
    public static UserPrivilege LIZIZ(Q9H q9h) {
        UserPrivilege userPrivilege = new UserPrivilege();
        userPrivilege.faqInfoList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        userPrivilege.userId = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        userPrivilege.privilegeId = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        userPrivilege.privilegeType = q9h.LJIIJ();
                        break;
                    case 4:
                        userPrivilege.privilegeName = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        userPrivilege.privilegeDesc = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        userPrivilege.startTime = q9h.LJIIJJI();
                        break;
                    case 7:
                        userPrivilege.endTime = q9h.LJIIJJI();
                        break;
                    case 8:
                        userPrivilege.faqInfoList.add(_PrivilegeFAQ_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 9:
                        userPrivilege.userSelected = Q9J.LIZ(q9h);
                        break;
                    case 10:
                        userPrivilege.privilegeLogExtra = _PrivilegeLogExtra_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        userPrivilege.suiteIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 12:
                        userPrivilege.suiteId = q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        userPrivilege.isLock = Q9J.LIZ(q9h);
                        break;
                    default:
                        switch (LJI) {
                            case 20:
                                userPrivilege.badge = _BadgeStruct_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 21:
                                userPrivilege.frame = _AvatarFrame_ProtoDecoder.LIZIZ(q9h);
                                break;
                            case 22:
                                userPrivilege.entranceEffect = _EntranceEffect_ProtoDecoder.LIZIZ(q9h);
                                break;
                            default:
                                Q9J.LIZJ(q9h);
                                break;
                        }
                }
            } else {
                q9h.LJ(LIZJ);
                return userPrivilege;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final UserPrivilege LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
