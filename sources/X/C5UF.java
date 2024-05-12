package X;

import com.google.gson.Gson;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.metadata.MetadataCheckResponse;
import com.ss.android.ugc.aweme.service.IToolsOfflineService;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* renamed from: X.5UF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5UF {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(InterfaceC153045zY interfaceC153045zY) {
        C133765Mu c133765Mu;
        if (e1.LIZ(31744, "enable_metadata_check", true, false) || e1.LIZ(31744, "enable_metadata_clean", true, false)) {
            String str = "";
            String LIZLLL = C47959Irz.LIZLLL(31744, "metadata_allow_list", "", true);
            if (LIZLLL == null) {
                LIZLLL = "";
            }
            if (LIZLLL.length() != 0 && (interfaceC153045zY instanceof C133765Mu) && (c133765Mu = (C133765Mu) interfaceC153045zY) != null) {
                boolean LIZ2 = e1.LIZ(31744, "enable_metadata_check", true, false);
                boolean LIZ3 = e1.LIZ(31744, "enable_metadata_clean", true, false);
                String LLD = ORZ.LLD(C47261Igj.LJJIJIIJI("com.android.capture.fps,com.android.information:com.bytedance.info|interaction_stickers", "com.android.information:com.bytedance.info|interactive_branded_effect_infos", "com.android.information:com.bytedance.info|is_km_video"), ",", null, null, null, 62);
                String LIZLLL2 = C47959Irz.LIZLLL(31744, "metadata_allow_list", "", true);
                if (LIZLLL2 != null) {
                    str = LIZLLL2;
                }
                C133785Mw c133785Mw = c133765Mu.LIZLLL;
                if (c133785Mw != null) {
                    c133785Mw.P8().LJJII(LLD, str, LIZ2, LIZ3);
                    c133765Mu.LLIIJLIL(new InterfaceC133905Ni() { // from class: X.5VL
                        @Override // X.InterfaceC133905Ni
                        public final void LIZ(int i, int i2, float f, String str2) {
                            OSJ osj;
                            if (i != 4226) {
                                if (i != 4227) {
                                    return;
                                }
                                C145995oB c145995oB = new C145995oB();
                                c145995oB.LJI("duration", str2);
                                FMX.LJIIL("tools_manage_metadata_time_cost", c145995oB.LIZ);
                                return;
                            }
                            try {
                                Gson LIZ4 = GsonHolder.LIZLLL().LIZ();
                                if (str2 == null) {
                                    str2 = "";
                                }
                                MetadataCheckResponse metadataCheckResponse = (MetadataCheckResponse) LIZ4.LJI(str2, MetadataCheckResponse.class);
                                osj = new OSJ(metadataCheckResponse.key, metadataCheckResponse.value, Integer.valueOf(metadataCheckResponse.isInBuiltInList));
                            } catch (Exception unused) {
                                osj = new OSJ(null, null, 0);
                            }
                            String str3 = (String) osj.getFirst();
                            String str4 = (String) osj.getSecond();
                            int intValue = ((Number) osj.getThird()).intValue();
                            StringBuilder LIZ5 = X1D.LIZ();
                            LIZ5.append("MetadataManagement Failed to add metadata: isInBuiltInList = ");
                            LIZ5.append(intValue);
                            LIZ5.append(", metadataKey = ");
                            LIZ5.append(str3);
                            H78.LJI(X1D.LIZIZ(LIZ5));
                            C145995oB c145995oB2 = new C145995oB();
                            c145995oB2.LIZ(intValue, "is_in_built_in_list");
                            c145995oB2.LJI("metadata_key", str3);
                            FMX.LJIIL("tools_add_metadata_error", c145995oB2.LIZ);
                            if (!e1.LIZ(31744, "enable_metadata_hint_dialog", true, true)) {
                                return;
                            }
                            StringBuilder LIZLLL3 = C06540Nm.LIZLLL("Security risk!!\nThis metadata should not be added to video:\nKey = ", str3, ", Value = ", str4, ", isInBuiltInList = ");
                            LIZLLL3.append(intValue);
                            LIZLLL3.append("\nPlease consult @qilan for help.");
                            X1D.LIZIZ(LIZLLL3);
                            ((IToolsOfflineService) ServiceManager.get().getService(IToolsOfflineService.class)).LIZJ();
                        }
                    });
                } else {
                    o.LJIJI("nleSession");
                    throw null;
                }
            }
        }
    }
}
