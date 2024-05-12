package X;

import android.media.MediaCodecInfo;
import android.text.TextUtils;
import java.util.TreeMap;

/* loaded from: classes12.dex */
public final class PDO {
    public static java.util.Map<String, Integer> LIZJ;
    public MediaCodecInfo LIZ;
    public int LIZIZ;

    public static PDO LIZ(MediaCodecInfo mediaCodecInfo, String str) {
        int i;
        String name = mediaCodecInfo.getName();
        if (TextUtils.isEmpty(name)) {
            return null;
        }
        java.util.Map<String, Integer> map = LIZJ;
        if (map == null) {
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            LIZJ = treeMap;
            treeMap.put("OMX.qcom.video.decoder.avc", 100);
            ((TreeMap) LIZJ).put("OMX.qcom.video.decoder.hevc", 100);
            ((TreeMap) LIZJ).put("OMX.qcom.video.decoder.hevcswvdec", 20);
            ((TreeMap) LIZJ).put("OMX.qcom.video.decoder.mpeg4", 100);
            ((TreeMap) LIZJ).put("OMX.qcom.video.decoder.mpeg2", 100);
            ((TreeMap) LIZJ).put("OMX.qcom.video.decoder.vp8", 100);
            ((TreeMap) LIZJ).put("OMX.qcom.video.decoder.vp9", 100);
            ((TreeMap) LIZJ).put("OMX.MTK.VIDEO.DECODER.HEVC", 100);
            ((TreeMap) LIZJ).put("OMX.MTK.VIDEO.DECODER.AVC", 100);
            ((TreeMap) LIZJ).put("OMX.MTK.VIDEO.DECODER.MPEG2", 100);
            ((TreeMap) LIZJ).put("OMX.MTK.VIDEO.DECODER.MPEG4", 100);
            ((TreeMap) LIZJ).put("OMX.MTK.VIDEO.DECODER.VP9", 100);
            ((TreeMap) LIZJ).put("OMX.MTK.VIDEO.DECODER.VPX", 100);
            ((TreeMap) LIZJ).put("OMX.Nvidia.h264.decode", 100);
            ((TreeMap) LIZJ).put("OMX.Intel.hw_vd.h264", 100);
            ((TreeMap) LIZJ).put("OMX.Intel.VideoDecoder.AVC", 99);
            ((TreeMap) LIZJ).put("OMX.SEC.avc.dec", 100);
            ((TreeMap) LIZJ).put("OMX.SEC.AVC.Decoder", 99);
            ((TreeMap) LIZJ).put("OMX.SEC.avcdec", 98);
            ((TreeMap) LIZJ).put("OMX.SEC.avc.sw.dec", 20);
            ((TreeMap) LIZJ).put("OMX.SEC.hevc.sw.dec", 20);
            ((TreeMap) LIZJ).put("OMX.SEC.mpeg4.dec", 100);
            ((TreeMap) LIZJ).put("OMX.SEC.mpeg2.dec", 100);
            ((TreeMap) LIZJ).put("OMX.SEC.vp8.dec", 100);
            ((TreeMap) LIZJ).put("OMX.SEC.vp9.dec", 100);
            ((TreeMap) LIZJ).put("OMX.Exynos.avc.dec", 100);
            ((TreeMap) LIZJ).put("OMX.Exynos.AVC.Decoder", 99);
            ((TreeMap) LIZJ).put("OMX.Exynos.MPEG4.Decoder", 100);
            ((TreeMap) LIZJ).put("OMX.Exynos.MPEG2.Decoder", 100);
            ((TreeMap) LIZJ).put("OMX.Exynos.VP8.Decoder", 100);
            ((TreeMap) LIZJ).put("OMX.Exynos.VP9.Decoder", 100);
            ((TreeMap) LIZJ).put("OMX.TI.DUCATI1.VIDEO.DECODER", 100);
            ((TreeMap) LIZJ).put("OMX.rk.video_decoder.avc", 100);
            ((TreeMap) LIZJ).put("OMX.amlogic.avc.decoder.awesome", 100);
            ((TreeMap) LIZJ).put("OMX.MARVELL.VIDEO.HW.CODA7542DECODER", 100);
            ((TreeMap) LIZJ).put("OMX.brcm.video.h264.hw.decoder", 40);
            ((TreeMap) LIZJ).put("OMX.k3.video.decoder.avc", 40);
            ((TreeMap) LIZJ).put("OMX.IMG.MSVDX.Decoder.AVC", 100);
            ((TreeMap) LIZJ).put("OMX.hisi.video.decoder.avc", 100);
            ((TreeMap) LIZJ).put("OMX.hisi.video.decoder.hevc", 100);
            ((TreeMap) LIZJ).put("OMX.hisi.video.decoder.mpeg4", 100);
            ((TreeMap) LIZJ).put("OMX.hisi.video.decoder.mpeg2", 100);
            ((TreeMap) LIZJ).put("OMX.hisi.video.decoder.vp8", 100);
            ((TreeMap) LIZJ).put("OMX.hisi.video.decoder.vp9", 100);
            ((TreeMap) LIZJ).put("OMX.MARVELL.VIDEO.H264DECODER", 20);
            ((TreeMap) LIZJ).put("OMX.sprd.soft.h264.decoder", 20);
            map = LIZJ;
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
        PDO pdo = new PDO();
        pdo.LIZ = mediaCodecInfo;
        pdo.LIZIZ = i;
        return pdo;
    }
}
