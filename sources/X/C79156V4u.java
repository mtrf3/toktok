package X;

import android.view.MotionEvent;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel.ReadStateViewModel;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.effect.IEffectModelLoggerService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.model.ModelInfo;
import com.ss.android.ugc.feed.platform.cell.RootCellComponent;
import com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import defpackage.i0;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.V4u, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79156V4u implements JTF, InterfaceC54842Lfi, IEffectModelLoggerService, InterfaceC48038ItG, AnonymousClass457, XPT {
    public static WeakReference LJLIL;
    public static WeakReference LJLILLLLZI;
    public static WeakReference LJLJI;
    public static R3S LJLJJI;
    public static final C79156V4u LJLJJL = new C79156V4u();
    public static final C79156V4u LJLJJLL = new C79156V4u();
    public static final C79156V4u LJLJL = new C79156V4u();

    @Override // X.InterfaceC54842Lfi
    public boolean LIZ(Object obj, File file, File file2) {
        return true;
    }

    @Override // X.JTF
    public void LIZJ() {
        MobClick LIZLLL = C1I1.LIZLLL("check_more_result", "general_search");
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("search_type", "user");
        LIZLLL.setJsonObject(c198517qh.LJ());
        FMX.onEvent(LIZLLL);
        C2U8.LIZ(new JYS(C50605JtZ.LJIIL()));
    }

    @Override // X.XPT
    public String getPath() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(AVExternalServiceImpl.LIZ().configService().cacheConfig().musicDir());
        LIZ.append("cache/");
        return X1D.LIZIZ(LIZ);
    }

    public static final InterfaceC55235Lm3 LIZLLL(C2MA c2ma) {
        RootCellComponent LJJIII = C86793Y4n.LJJIII(c2ma);
        if (LJJIII != null) {
            return C55096Ljo.LJIIZILJ(LJJIII);
        }
        return null;
    }

    public static String LJ(ModelInfo modelInfo) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("model name:");
        LIZ.append(modelInfo.getName());
        LIZ.append("; model version:");
        LIZ.append(modelInfo.getVersion());
        LIZ.append("; model url:");
        LIZ.append(modelInfo.getFile_url());
        LIZ.append("; model size:");
        LIZ.append(modelInfo.getTotalSize());
        LIZ.append("k; model md5:");
        ExtendedUrlModel file_url = modelInfo.getFile_url();
        if (file_url != null) {
            str = file_url.getUri();
        } else {
            str = null;
        }
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }

    public static final InterfaceC55235Lm3 LJFF(C2MA c2ma) {
        if (c2ma instanceof InterfaceC55100Ljs) {
            return C55096Ljo.LJIJ((InterfaceC55100Ljs) c2ma);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if (r1 == X.C24500xi.LIZIZ) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1QP LJII(X.InterfaceC24520xk r6) {
        /*
            r0 = 29186956(0x1bd5b8c, float:6.9559E-38)
            r6.LJJIIJ(r0)
            r5 = 0
            java.lang.Object[] r4 = new java.lang.Object[r5]
            X.1HY r3 = X.C1QP.LJIJJ
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r6.LJJIIJ(r0)
            boolean r2 = r6.LJIJJ(r2)
            boolean r0 = r6.LJIJJ(r1)
            r2 = r2 | r0
            java.lang.Object r1 = r6.LJIILL()
            if (r2 != 0) goto L31
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r1 != r0) goto L39
        L31:
            X.20Z r1 = new X.20Z
            r1.<init>(r5, r5)
            r6.LJJIII(r1)
        L39:
            r6.LJJIJIIJIL()
            X.Pro r1 = (X.InterfaceC65784Pro) r1
            r0 = 4
            java.lang.Object r0 = X.C73975T1n.LJIIIIZZ(r4, r3, r1, r6, r0)
            X.1QP r0 = (X.C1QP) r0
            r6.LJJIJIIJIL()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79156V4u.LJII(X.0xk):X.1QP");
    }

    @Override // X.AnonymousClass457
    public InterfaceC99713vj LIZIZ(C99033ud sessionInfo) {
        o.LJIIIZ(sessionInfo, "sessionInfo");
        C115494g5.LIZ();
        if (sessionInfo.isReportPage()) {
            C99623va c99623va = C99783vq.LIZ;
            String conversationId = sessionInfo.getConversationId();
            boolean z = ReadStateViewModel.LJLJL;
            boolean isGroupChat = sessionInfo.isGroupChat();
            boolean isReportPage = sessionInfo.isReportPage();
            c99623va.getClass();
            return C99623va.LIZ(conversationId, z, isGroupChat, isReportPage);
        }
        String sessionId = sessionInfo.getConversationId();
        o.LJIIIZ(sessionId, "sessionId");
        InterfaceC99713vj interfaceC99713vj = (InterfaceC99713vj) ((LinkedHashMap) C99693vh.LIZ).get(sessionId);
        if (interfaceC99713vj == null) {
            C99623va c99623va2 = C99783vq.LIZ;
            String conversationId2 = sessionInfo.getConversationId();
            boolean z2 = ReadStateViewModel.LJLJL;
            boolean isGroupChat2 = sessionInfo.isGroupChat();
            boolean isReportPage2 = sessionInfo.isReportPage();
            c99623va2.getClass();
            return C99623va.LIZ(conversationId2, z2, isGroupChat2, isReportPage2);
        }
        return interfaceC99713vj;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        InterfaceC68901R2j it = (InterfaceC68901R2j) obj;
        o.LJIIJ(it, "it");
        return it.payload();
    }

    public static boolean LJI(MotionEvent motionEvent, int i) {
        if ((motionEvent.getSource() & i) == i) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectModelLoggerService
    public void startDownloadEffectModelAlog(Effect effect, Object modelInfo, String effectSdkVersion) {
        o.LJIIIZ(modelInfo, "modelInfo");
        o.LJIIIZ(effectSdkVersion, "effectSdkVersion");
        if ((modelInfo instanceof ModelInfo) && effect != null) {
            StringBuilder sb = new StringBuilder();
            if (!C77413UZt.LJIILL(effect.getRequirements())) {
                Iterator<String> it = effect.getRequirements().iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append(",");
                }
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LJ((ModelInfo) modelInfo));
            LIZ.append("; effect id:");
            LIZ.append(effect.getEffectId());
            LIZ.append("; requirements");
            LIZ.append((Object) sb);
            String LJFF = JBR.LJFF(LIZ, "; effect_sdk_version:", effectSdkVersion, LIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("effect_platform::report>>>start_download_effect_model: ");
            LIZ2.append(LJFF);
            H7B.LIZ(X1D.LIZIZ(LIZ2));
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("extra_info", LJFF);
            FMX.LJIIL("start_download_effect_model", c145995oB.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectModelLoggerService
    public void reportModelListAlog(boolean z, String str, long j, String effectSdkVersion) {
        o.LJIIIZ(effectSdkVersion, "effectSdkVersion");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("is_success:");
        LIZ.append(z);
        LIZ.append("; error_msg:");
        LIZ.append(str);
        LIZ.append("; duration:");
        C65232Piu.LIZLLL(LIZ, j, "ms; effect_sdk_version:", effectSdkVersion);
        String LIZIZ = X1D.LIZIZ(LIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("effect_platform::report>>>fetch_algorithm_model_list: ");
        LIZ2.append(LIZIZ);
        H7B.LIZ(X1D.LIZIZ(LIZ2));
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("extra_info", LIZIZ);
        FMX.LJIIL("fetch_algorithm_model_list", c145995oB.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectModelLoggerService
    public void endDownloadEffectModelAlog(Effect effect, Object modelInfo, long j, int i, Exception exc, String effectSdkVersion) {
        o.LJIIIZ(modelInfo, "modelInfo");
        o.LJIIIZ(effectSdkVersion, "effectSdkVersion");
        if ((modelInfo instanceof ModelInfo) && effect != null) {
            StringBuilder sb = new StringBuilder();
            if (!C77413UZt.LJIILL(effect.getRequirements())) {
                Iterator<String> it = effect.getRequirements().iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append(",");
                }
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LJ((ModelInfo) modelInfo));
            LIZ.append("; effect id:");
            LIZ.append(effect.getEffectId());
            LIZ.append("; requirements");
            LIZ.append((Object) sb);
            C0MT.LIZLLL(LIZ, "; duration:", j, "ms; effect_sdk_version:");
            LIZ.append(effectSdkVersion);
            String LIZIZ = X1D.LIZIZ(LIZ);
            if (i == 0) {
                LIZIZ = i0.LJFF(LIZIZ, "; errorcode: 0");
            } else if (exc != null) {
                String stackTraceString = android.util.Log.getStackTraceString(exc);
                o.LJIIIIZZ(stackTraceString, "getStackTraceString(e)");
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LIZIZ);
                LIZ2.append("; errorcode:");
                LIZ2.append(i);
                LIZ2.append("; errormsg:");
                LIZ2.append(stackTraceString);
                LIZIZ = X1D.LIZIZ(LIZ2);
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("effect_platform::report>>>end_download_effect_model: ");
            LIZ3.append(LIZIZ);
            H7B.LIZ(X1D.LIZIZ(LIZ3));
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("extra_info", LIZIZ);
            FMX.LJIIL("end_download_effect_model", c145995oB.LIZ);
        }
    }
}
