package X;

import com.bytedance.ies.cutsame.cut_android.NLETemplateSource;
import com.bytedance.ies.cutsame.source.api.AfrApi;
import com.bytedance.ies.cutsame.source.model.ProcessorConfig;
import com.bytedance.ies.nle.editor_jni.DynamicLightWaveUtil;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEMediaPublicJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModelDownloader;
import com.bytedance.ies.nle.editor_jni.NLERenderProxySegment;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.6pZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C172336pZ implements InterfaceC126144xG {
    public final InterfaceC172546pu LIZ;
    public final NLEModelDownloader LIZIZ;
    public final AfrApi LIZJ;
    public XKQ LIZLLL;
    public PthreadTimer LJ;
    public int LJFF;
    public String LJI;
    public NLETemplateSource LJII;
    public final C62822Ol8 LJIIIIZZ;

    @Override // X.InterfaceC126144xG
    public final void LIZIZ() {
        PthreadTimer pthreadTimer = this.LJ;
        if (pthreadTimer != null) {
            pthreadTimer.cancel();
        }
        this.LJ = null;
        C172406pg c172406pg = C172566pw.LIZ;
        if (c172406pg != null) {
            C172466pm.LIZIZ("cancel");
            DynamicLightWaveUtil dynamicLightWaveUtil = (DynamicLightWaveUtil) c172406pg.LJFF.getValue();
            NLEMediaPublicJniJNI.DynamicLightWaveUtil_cancelCompile(dynamicLightWaveUtil.LIZ, dynamicLightWaveUtil);
        }
        C5U6 c5u6 = (C5U6) this.LJIIIIZZ.getValue();
        c5u6.LIZ = true;
        C5KU c5ku = c5u6.LIZIZ;
        if (c5ku != null) {
            c5ku.LIZ();
        }
        XKQ xkq = this.LIZLLL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        File file = new File(this.LJI);
        if (file.exists() && file.isFile()) {
            C16880lQ.LLLZZIL(file);
        }
    }

    @Override // X.InterfaceC126144xG
    public final void clear() {
        C172406pg c172406pg = C172566pw.LIZ;
        if (c172406pg != null) {
            DynamicLightWaveUtil dynamicLightWaveUtil = (DynamicLightWaveUtil) c172406pg.LJFF.getValue();
            NLEMediaPublicJniJNI.DynamicLightWaveUtil_destroy(dynamicLightWaveUtil.LIZ, dynamicLightWaveUtil);
        }
        NLETemplateSource nLETemplateSource = this.LJII;
        if (nLETemplateSource != null) {
            nLETemplateSource.LIZLLL();
        }
        this.LJII = null;
    }

    public C172336pZ(InterfaceC172546pu storageService, NLEModelDownloader downloader, AfrApi afrApiImpl) {
        o.LJIIIZ(storageService, "storageService");
        o.LJIIIZ(downloader, "downloader");
        o.LJIIIZ(afrApiImpl, "afrApiImpl");
        this.LIZ = storageService;
        this.LIZIZ = downloader;
        this.LIZJ = afrApiImpl;
        this.LJI = "";
        this.LJIIIIZZ = C221108m2.LIZIZ(C172306pW.LJLIL);
    }

    public static NLERenderProxySegment LIZLLL(String str, String str2, ProcessorConfig processorConfig) {
        NLERenderProxySegment nLERenderProxySegment = new NLERenderProxySegment();
        NLEResourceNode nLEResourceNode = new NLEResourceNode();
        nLEResourceNode.LJIIIZ(str);
        NLEEditorJniJNI.NLERenderProxySegment_setRenderConfigRes(nLERenderProxySegment.LIZJ, nLERenderProxySegment, NLEResourceNode.LIZ(nLEResourceNode), nLEResourceNode);
        NLEResourceAV nLEResourceAV = new NLEResourceAV();
        nLEResourceAV.LJIIIZ(str2);
        if (processorConfig.getOutputType() == 1) {
            nLEResourceAV.LJIILIIL(EnumC123874tb.IMAGE);
        } else {
            C173856s1 LIZLLL = C172436pj.LIZ().LIZLLL(str2);
            OSZ LIZIZ = C172436pj.LIZIZ(LIZLLL);
            int intValue = ((Number) LIZIZ.getFirst()).intValue();
            int intValue2 = ((Number) LIZIZ.getSecond()).intValue();
            nLEResourceAV.setDuration(C78926UyI.LJJJ(LIZLLL.LJ));
            nLEResourceAV.LJIILJJIL(intValue);
            nLEResourceAV.LJIIIIZZ(intValue2);
            nLEResourceAV.LJIILIIL(EnumC123874tb.VIDEO);
        }
        NLEEditorJniJNI.NLERenderProxySegment_setAVFile(nLERenderProxySegment.LIZJ, nLERenderProxySegment, nLEResourceAV.LIZJ, nLEResourceAV);
        return nLERenderProxySegment;
    }

    @Override // X.InterfaceC126144xG
    public final void LIZ(String str, String str2, InterfaceC172486po interfaceC172486po) {
        this.LIZLLL = XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C172346pa(this, str2, str, interfaceC172486po, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.6po, X.Yns] */
    /* JADX WARN: Type inference failed for: r4v30, types: [X.6pb] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r24, java.lang.String r25, com.bytedance.ies.cutsame.source.model.ProcessorConfig r26, X.InterfaceC172486po r27, X.C172376pd r28, X.InterfaceC67352kd r29) {
        /*
            Method dump skipped, instructions count: 943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172336pZ.LIZJ(java.lang.String, java.lang.String, com.bytedance.ies.cutsame.source.model.ProcessorConfig, X.6po, X.6pd, X.2kd):java.lang.Object");
    }
}
