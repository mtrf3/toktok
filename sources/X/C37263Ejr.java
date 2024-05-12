package X;

import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.creative.model.HDRModel;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Ejr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37263Ejr extends AbstractC43455H3r {
    public final VideoPublishEditModel LJFF;
    public final Context LJI;

    @Override // X.AbstractC43455H3r
    public final H1T LJIIIZ() {
        return H1T.VE_BYTEVC1_PLUGIN_LOAD;
    }

    public C37263Ejr(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        this.LJFF = model;
        this.LJI = C16880lQ.LLLLJI(C60903NvH.LJ);
    }

    @Override // X.AbstractC43455H3r
    public final void LJI(ERR args, C67996QmO c67996QmO) {
        Object LIZ;
        o.LJIIIZ(args, "args");
        C37267Ejv c37267Ejv = InterfaceC37265Ejt.LJIIJJI;
        if (c37267Ejv.isEnableBytevc1enc8Plugin()) {
            UploadSpeedInfo uploadSpeedInfo = this.LJFF.uploadSpeedInfo;
            int minSpeedForUsingBytevc1 = c37267Ejv.getMinSpeedForUsingBytevc1();
            if (minSpeedForUsingBytevc1 < 0) {
                H78.LIZ("Bytevc1enc8Plugin -> use bytevc1: false, not hit experiment");
            } else if (uploadSpeedInfo == null || uploadSpeedInfo.getSpeed() < 0) {
                H78.LIZ("Bytevc1enc8Plugin -> use bytevc1: false, test speed failed");
            } else if (uploadSpeedInfo.getSpeed() >= minSpeedForUsingBytevc1) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Bytevc1enc8Plugin -> use bytevc1: false, cur speed(");
                LIZ2.append(uploadSpeedInfo.getSpeed());
                LIZ2.append(") more than threshold(");
                LIZ2.append(minSpeedForUsingBytevc1);
                LIZ2.append(')');
                H78.LIZ(X1D.LIZIZ(LIZ2));
            } else {
                H78.LIZ("Bytevc1enc8Plugin -> use bytevc1: true");
                HDRModel hDRModel = this.LJFF.creativeModel.hdrModel;
                if (hDRModel.veCodecIsReady && H7R.LJJJJJ(hDRModel)) {
                    H78.LIZ("Bytevc1enc8Plugin -> not load library, reason: hdr video");
                    this.LJFF.creativeModel.bytevcVC1Model.needUseBytevc1Encode = false;
                    c67996QmO.LJ(null, true);
                    return;
                }
                H78.LIZ("Bytevc1enc8Plugin -> start load library");
                IPluginService pluginService = AabPluginServiceImpl.LIZLLL();
                try {
                    o.LJIIIIZZ(pluginService, "pluginService");
                } catch (Throwable th) {
                    LIZ = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ);
                }
                if (pluginService.checkPluginInstalled("com.ss.android.ugc.i18n.quic") && pluginService.checkPluginInstalled("com.ss.android.ugc.aweme.df_ve_enc8")) {
                    if (pluginService.LIZJ() == null) {
                        H78.LIZ("Bytevc1enc8Plugin -> loadLibrary: lib vebytevc1enc8bwrapper.so failed, aabService null");
                        c67996QmO.LJ(null, true);
                        return;
                    }
                    C39647FhD.LIZLLL(this.LJI);
                    C16880lQ.LLJJJIL("vebytevc1enc8bwrapper");
                    this.LJFF.creativeModel.bytevcVC1Model.needUseBytevc1Encode = true;
                    c67996QmO.LJ(null, true);
                    H78.LIZ("Bytevc1enc8Plugin -> loadLibrary: lib vebytevc1enc8bwrapper.so Success");
                    LIZ = C76800UCe.LIZ;
                    C3C5.m7constructorimpl(LIZ);
                    Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
                    if (m10exceptionOrNullimpl != null) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("Bytevc1enc8Plugin -> loadLibrary: lib vebytevc1enc8bwrapper.so failed, ");
                        LIZ3.append(m10exceptionOrNullimpl.getMessage());
                        H78.LIZ(X1D.LIZIZ(LIZ3));
                        this.LJFF.creativeModel.bytevcVC1Model.needUseBytevc1Encode = false;
                        c67996QmO.LJ(null, true);
                        return;
                    }
                    return;
                }
                H78.LIZ("Bytevc1enc8Plugin -> plugin not all installed");
                this.LJFF.creativeModel.bytevcVC1Model.needUseBytevc1Encode = false;
                c67996QmO.LJ(null, true);
                return;
            }
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("Bytevc1enc8Plugin -> not load library, enable: ");
        LIZ4.append(c37267Ejv.isEnableBytevc1enc8Plugin());
        H78.LIZ(X1D.LIZIZ(LIZ4));
        this.LJFF.creativeModel.bytevcVC1Model.needUseBytevc1Encode = false;
        c67996QmO.LJ(null, true);
    }
}
