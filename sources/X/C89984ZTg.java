package X;

import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.Surface;
import java.lang.ref.WeakReference;

/* renamed from: X.ZTg, reason: case insensitive filesystem */
/* loaded from: classes19.dex */
public class C89984ZTg implements Handler.Callback {
    public final WeakReference<AbstractC89987ZTj> LJLIL;

    public C89984ZTg(AbstractC89987ZTj abstractC89987ZTj) {
        this.LJLIL = new WeakReference<>(abstractC89987ZTj);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        Object obj = message.obj;
        AbstractC89987ZTj abstractC89987ZTj = this.LJLIL.get();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return false;
                    }
                    C47261Igj.LJIILJJIL("BXMediaCodecEncoder");
                    abstractC89987ZTj.LJFF();
                    return true;
                }
                C47261Igj.LJIILJJIL("BXMediaCodecEncoder");
                abstractC89987ZTj.LJII();
                return false;
            }
            C47261Igj.LJIILJJIL("BXMediaCodecEncoder");
            abstractC89987ZTj.LJI();
            return false;
        }
        C47261Igj.LJIILJJIL("BXMediaCodecEncoder");
        C89985ZTh c89985ZTh = (C89985ZTh) obj;
        abstractC89987ZTj.LIZ = c89985ZTh.LIZ;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            int LIZIZ = abstractC89987ZTj.LIZIZ();
            if (LIZIZ < 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("create encoder fail : ");
                LIZ.append(LIZIZ);
                X1D.LIZIZ(LIZ);
                C47261Igj.LJIILL("BXMediaCodecEncoder");
            } else {
                MediaCodecInfo.CodecCapabilities capabilitiesForType = abstractC89987ZTj.LIZIZ.getCodecInfo().getCapabilitiesForType(abstractC89987ZTj.LIZ.getMimeType());
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat(abstractC89987ZTj.LIZ.getMimeType(), abstractC89987ZTj.LIZ.getWidth(), abstractC89987ZTj.LIZ.getHeight());
                createVideoFormat.setInteger("color-format", abstractC89987ZTj.LIZ.getInputColorFormat());
                createVideoFormat.setInteger("frame-rate", abstractC89987ZTj.LIZ.getFrameRate());
                createVideoFormat.setInteger("i-frame-interval", abstractC89987ZTj.LIZ.getIFrameInternal());
                createVideoFormat.setInteger("color-range", abstractC89987ZTj.LIZ.getColorRange());
                createVideoFormat.setInteger("color-standard", abstractC89987ZTj.LIZ.getColorStandard());
                createVideoFormat.setInteger("color-transfer", abstractC89987ZTj.LIZ.getColorTransfer());
                if (abstractC89987ZTj.LIZ.isOffBFrame()) {
                    createVideoFormat.setInteger("max-bframes", 0);
                }
                int encodeProfile = abstractC89987ZTj.LIZ.getEncodeProfile();
                if (Build.VERSION.SDK_INT >= 24) {
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("support profile: ");
                        LIZ2.append(codecProfileLevel.profile);
                        X1D.LIZIZ(LIZ2);
                        C47261Igj.LJIILJJIL("BXMediaCodecEncoder");
                        if (codecProfileLevel.profile == encodeProfile) {
                            createVideoFormat.setInteger("profile", codecProfileLevel.profile);
                            createVideoFormat.setInteger("level", codecProfileLevel.level);
                            break;
                        }
                    }
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("unsupport profile: ");
                LIZ3.append(abstractC89987ZTj.LIZ.getEncodeProfile());
                X1D.LIZIZ(LIZ3);
                C47261Igj.LJIILJJIL("BXMediaCodecEncoder");
                createVideoFormat.setInteger("bitrate", abstractC89987ZTj.LIZ.getBitRate());
                if (capabilitiesForType.getEncoderCapabilities().isBitrateModeSupported(abstractC89987ZTj.LIZ.getBitRateMode())) {
                    createVideoFormat.setInteger("bitrate-mode", abstractC89987ZTj.LIZ.getBitRateMode());
                } else {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("codec does not support BitRateMode: ");
                    LIZ4.append(abstractC89987ZTj.LIZ.getBitRateMode());
                    X1D.LIZIZ(LIZ4);
                    C47261Igj.LJJJJZ("BXMediaCodecEncoder");
                }
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("initEncoder: format = ");
                LIZ5.append(createVideoFormat);
                X1D.LIZIZ(LIZ5);
                C47261Igj.LJJIIJ("BXMediaCodecEncoder");
                abstractC89987ZTj.LIZ();
                abstractC89987ZTj.LIZIZ.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                abstractC89987ZTj.LJIIJJI = System.currentTimeMillis() - currentTimeMillis;
                if (abstractC89987ZTj.LIZ.useSurfaceInput()) {
                    abstractC89987ZTj.LIZLLL = abstractC89987ZTj.LIZIZ.createInputSurface();
                }
                abstractC89987ZTj.LJIIZILJ = EnumC89986ZTi.INITED;
            }
        } catch (Exception unused) {
            abstractC89987ZTj.LJIIZILJ = EnumC89986ZTi.UNSET;
        }
        c89985ZTh.LIZIZ.open();
        return false;
    }
}
