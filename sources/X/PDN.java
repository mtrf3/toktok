package X;

import android.media.MediaCodecInfo;
import android.text.TextUtils;
import java.util.TreeMap;

/* loaded from: classes12.dex */
public final class PDN {
    public static java.util.Map<String, Integer> LIZLLL;
    public MediaCodecInfo LIZ;
    public int LIZIZ;
    public String LIZJ;

    public static PDN LIZ(MediaCodecInfo mediaCodecInfo, String str) {
        int i;
        String name = mediaCodecInfo.getName();
        if (TextUtils.isEmpty(name)) {
            return null;
        }
        java.util.Map<String, Integer> map = LIZLLL;
        if (map == null) {
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            LIZLLL = treeMap;
            treeMap.put("OMX.qcom.video.decoder.avc", 100);
            ((TreeMap) LIZLLL).put("OMX.qcom.video.decoder.hevc", 100);
            ((TreeMap) LIZLLL).put("OMX.qcom.video.decoder.hevcswvdec", 20);
            ((TreeMap) LIZLLL).put("OMX.MTK.VIDEO.DECODER.HEVC", 100);
            ((TreeMap) LIZLLL).put("OMX.MTK.VIDEO.DECODER.AVC", 100);
            ((TreeMap) LIZLLL).put("OMX.Nvidia.h264.decode", 100);
            ((TreeMap) LIZLLL).put("OMX.Intel.hw_vd.h264", 100);
            ((TreeMap) LIZLLL).put("OMX.Intel.VideoDecoder.AVC", 99);
            ((TreeMap) LIZLLL).put("OMX.SEC.avc.dec", 100);
            ((TreeMap) LIZLLL).put("OMX.SEC.AVC.Decoder", 99);
            ((TreeMap) LIZLLL).put("OMX.SEC.avcdec", 98);
            ((TreeMap) LIZLLL).put("OMX.SEC.avc.sw.dec", 20);
            ((TreeMap) LIZLLL).put("OMX.SEC.hevc.sw.dec", 20);
            ((TreeMap) LIZLLL).put("OMX.Exynos.avc.dec", 100);
            ((TreeMap) LIZLLL).put("OMX.Exynos.AVC.Decoder", 99);
            ((TreeMap) LIZLLL).put("OMX.TI.DUCATI1.VIDEO.DECODER", 100);
            ((TreeMap) LIZLLL).put("OMX.rk.video_decoder.avc", 100);
            ((TreeMap) LIZLLL).put("OMX.amlogic.avc.decoder.awesome", 100);
            ((TreeMap) LIZLLL).put("OMX.MARVELL.VIDEO.HW.CODA7542DECODER", 100);
            ((TreeMap) LIZLLL).put("OMX.brcm.video.h264.hw.decoder", 40);
            ((TreeMap) LIZLLL).put("OMX.k3.video.decoder.avc", 40);
            ((TreeMap) LIZLLL).put("OMX.IMG.MSVDX.Decoder.AVC", 100);
            ((TreeMap) LIZLLL).put("OMX.hisi.video.decoder.avc", 100);
            ((TreeMap) LIZLLL).put("OMX.hisi.video.decoder.hevc", 100);
            ((TreeMap) LIZLLL).put("OMX.MARVELL.VIDEO.H264DECODER", 20);
            ((TreeMap) LIZLLL).put("OMX.sprd.soft.h264.decoder", 20);
            map = LIZLLL;
        }
        Integer num = map.get(name);
        if (num != null) {
            i = num.intValue();
        } else {
            try {
                if (mediaCodecInfo.getCapabilitiesForType(str) != null) {
                    i = 70;
                }
            } catch (Exception unused) {
            }
            i = 60;
        }
        PDN pdn = new PDN();
        pdn.LIZ = mediaCodecInfo;
        pdn.LIZJ = str;
        pdn.LIZIZ = i;
        return pdn;
    }
}
