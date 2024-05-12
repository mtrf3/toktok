package X;

import android.text.TextUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OWY extends OWZ {
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00ff: INVOKE 
      (r5 I:com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock)
      (r3 I:int)
      (r0 I:java.lang.String)
      (r4 I:int)
     STATIC call: X.Cb8.LIZ(com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, int, java.lang.String, int):void A[MD:(com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, int, java.lang.String, int):void (m)] (LINE:50331903), block:B:46:0x00eb */
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        CompletionBlock LIZ;
        boolean z;
        InterfaceC62030OWc interfaceC62030OWc;
        String url;
        InterfaceC62030OWc interfaceC62030OWc2;
        InterfaceC62028OWa interfaceC62028OWa = (InterfaceC62028OWa) xBaseParamModel;
        o.LJIIIZ(type, "type");
        try {
            List<InterfaceC62030OWc> videoUrls = interfaceC62028OWa.getVideoUrls();
            if (videoUrls.isEmpty()) {
                C31626Cb8.LIZ(c37356ElM, 0, "videoUrls is empty", 4);
                return;
            }
            String preloadId = interfaceC62028OWa.getPreloadId();
            if (preloadId != null && preloadId.length() == 0) {
                C31626Cb8.LIZ(c37356ElM, 0, "preloadId is empty", 4);
                return;
            }
            C62031OWd LIZ2 = C62034OWg.LIZ(videoUrls);
            if (LIZ2.LIZ != 1 || (interfaceC62030OWc2 = LIZ2.LIZIZ) == null || TextUtils.isEmpty(interfaceC62030OWc2.getUrl())) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                InterfaceC62030OWc interfaceC62030OWc3 = LIZ2.LIZIZ;
                if (interfaceC62030OWc3 != null) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(interfaceC62028OWa.getPreloadId());
                    LIZ3.append(interfaceC62030OWc3.getResolution());
                    String preloadKey = C38352F3k.LIZJ(X1D.LIZIZ(LIZ3));
                    o.LJIIIIZZ(preloadKey, "preloadKey");
                    String videoUrl = interfaceC62030OWc3.getUrl();
                    long j = LIZ2.LIZJ;
                    o.LJIIIZ(videoUrl, "videoUrl");
                    C47396Iiu c47396Iiu = new C47396Iiu(j, preloadKey, null, new String[]{videoUrl});
                    c47396Iiu.LJIIIIZZ = new C47397Iiv(preloadKey);
                    C47148Ieu.LIZ.LJIILLIIL(c47396Iiu);
                    XBaseModel LIZJ = ED5.LIZJ(InterfaceC62029OWb.class, null);
                    InterfaceC62029OWb interfaceC62029OWb = (InterfaceC62029OWb) LIZJ;
                    interfaceC62029OWb.setPreloadKey(preloadKey);
                    interfaceC62029OWb.setPreloadUrl(interfaceC62030OWc3.getUrl());
                    c37356ElM.onSuccess((XBaseResultModel) LIZJ, "");
                    return;
                }
                return;
            }
            if (LIZ2.LIZ == -2 && (interfaceC62030OWc = LIZ2.LIZIZ) != null && !TextUtils.isEmpty(interfaceC62030OWc.getUrl())) {
                XBaseModel LIZJ2 = ED5.LIZJ(InterfaceC62029OWb.class, null);
                InterfaceC62029OWb interfaceC62029OWb2 = (InterfaceC62029OWb) LIZJ2;
                InterfaceC62030OWc interfaceC62030OWc4 = LIZ2.LIZIZ;
                if (interfaceC62030OWc4 != null && (url = interfaceC62030OWc4.getUrl()) != null) {
                    interfaceC62029OWb2.setPreloadKey(url);
                    interfaceC62029OWb2.setPreloadKey(C38352F3k.LIZJ(url));
                }
                c37356ElM.onSuccess((XBaseResultModel) LIZJ2, "");
                return;
            }
            C31626Cb8.LIZ(c37356ElM, 0, "no selected video url", 4);
        } catch (Exception e) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("unknown error = ");
            LIZ4.append(e.getLocalizedMessage());
            C31626Cb8.LIZ(LIZ, 0, X1D.LIZIZ(LIZ4), 4);
        }
    }
}
