package X;

import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IPopupRecordService;
import kotlin.jvm.internal.o;

/* renamed from: X.LsZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55639LsZ implements InterfaceC56317M8j {
    public final C55652Lsm LIZ = new C55652Lsm("IPopInterceptor");

    @Override // X.InterfaceC56317M8j
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC56317M8j
    public final boolean LIZ(M74 task) {
        ActivityC45651qj LIZJ;
        boolean z;
        String str;
        String str2;
        String value;
        o.LJIIIZ(task, "task");
        if (task instanceof AbstractC56325M8r) {
            C54082LKk popupContext = ((AbstractC56325M8r) task).getPopupContext();
            if (popupContext != null) {
                LIZJ = popupContext.LIZJ();
            }
            LIZJ = null;
        } else if (task instanceof AbstractC55363Lo7) {
            C54082LKk popupContext2 = ((AbstractC55363Lo7) task).getPopupContext();
            if (popupContext2 != null) {
                LIZJ = popupContext2.LIZJ();
            }
            LIZJ = null;
        } else {
            C54082LKk popupContext3 = task.scene.getPopupContext();
            if (popupContext3 != null) {
                LIZJ = popupContext3.LIZJ();
            }
            LIZJ = null;
        }
        FeedCommonService LJJIJLIJ = CommonFeedServiceImpl.LJJIJLIJ();
        IPopupRecordService iPopupRecordService = (IPopupRecordService) ServiceManager.get().getService(IPopupRecordService.class);
        String str3 = "Now active day is not match";
        String str4 = "";
        if (LJJIJLIJ.LJJIJ()) {
            InterfaceC55642Lsc interfaceC55642Lsc = (InterfaceC55642Lsc) task.getClass().getAnnotation(InterfaceC55642Lsc.class);
            if (interfaceC55642Lsc != null && (value = interfaceC55642Lsc.value()) != null) {
                str4 = value;
            }
            boolean LJFF = LJJIJLIJ.LJFF(str4, task.scene.getSceneId());
            C55652Lsm c55652Lsm = this.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("popup:");
            LIZ.append(str4);
            LIZ.append("--->intercept result is ");
            LIZ.append(LJFF);
            c55652Lsm.LJIIIIZZ(X1D.LIZIZ(LIZ));
            if (LJFF) {
                int LJIILLIIL = LJJIJLIJ.LJIILLIIL(str4);
                String sceneId = task.scene.getSceneId();
                System.currentTimeMillis();
                if (LJIILLIIL != -1) {
                    str3 = "Intercept by group rule";
                }
                iPopupRecordService.LIZ(str4, sceneId, str3);
            }
            return LJFF;
        }
        if (LJJIJLIJ.LJJIIZI()) {
            InterfaceC55642Lsc interfaceC55642Lsc2 = (InterfaceC55642Lsc) task.getClass().getAnnotation(InterfaceC55642Lsc.class);
            if (interfaceC55642Lsc2 == null || (str = interfaceC55642Lsc2.value()) == null) {
                str = "";
            }
            if (task.getPopupType() == EnumC40513FvB.CONTAINER) {
                AY1 popupExtraParams = task.getPopupExtraParams();
                if (popupExtraParams != null && (str2 = popupExtraParams.LJLIL) != null) {
                    str4 = str2;
                }
                str = str4;
            }
            boolean LJJIIJZLJL = LJJIJLIJ.LJJIIJZLJL(str, task.scene.getSceneId());
            if (LJJIIJZLJL) {
                int LJIILLIIL2 = LJJIJLIJ.LJIILLIIL(str);
                String sceneId2 = task.scene.getSceneId();
                System.currentTimeMillis();
                if (LJIILLIIL2 != -1) {
                    str3 = "Intercept by group rule";
                }
                iPopupRecordService.LIZ(str, sceneId2, str3);
            }
            return LJJIIJZLJL;
        }
        this.LIZ.LJIIIIZZ("exp in control");
        boolean LJJIJIL = CommonFeedServiceImpl.LJJIJLIJ().LJJIJIL(task.getId());
        if (LIZJ != null) {
            boolean vv0 = com.bytedance.hox.Hox.LJLLI.LIZ(LIZJ).vv0("For You");
            FeedCommonService LJJIJLIJ2 = CommonFeedServiceImpl.LJJIJLIJ();
            String id = task.getId();
            if (vv0 && LJJIJIL) {
                z = true;
            } else {
                z = false;
            }
            LJJIJLIJ2.LJII(id, z);
            if (vv0 && LJJIJIL) {
                return true;
            }
            return false;
        }
        CommonFeedServiceImpl.LJJIJLIJ().LJII(task.getId(), LJJIJIL);
        return LJJIJIL;
    }

    @Override // X.InterfaceC56317M8j
    public final boolean LIZJ(M74 task) {
        o.LJIIIZ(task, "task");
        FeedCommonService LJJIJLIJ = CommonFeedServiceImpl.LJJIJLIJ();
        if (!LJJIJLIJ.LJJIJ() && !LJJIJLIJ.LJJIIZI()) {
            this.LIZ.LJIIIIZZ("exp in control");
            return LJJIJLIJ.LJJII(task.getId());
        }
        return true;
    }
}
