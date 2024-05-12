package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.ss.android.ttve.model.VEMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.vesdk.VEUtils;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WG0 {
    public static volatile WG0 LJI = new WG0();
    public static final HashMap<String, AVMusicWaveBean> LJII = new HashMap<>();
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;

    public static AVMusicWaveBean LIZIZ(AVMusicWaveBean aVMusicWaveBean) {
        if (aVMusicWaveBean == null || !C81995WFz.LJ(aVMusicWaveBean.getMusicWavePointArray())) {
            return aVMusicWaveBean;
        }
        AVMusicWaveBean aVMusicWaveBean2 = new AVMusicWaveBean();
        float[] musicWavePointArray = aVMusicWaveBean.getMusicWavePointArray();
        float[] copyOf = Arrays.copyOf(musicWavePointArray, musicWavePointArray.length);
        o.LJIIIIZZ(copyOf, "copyOf(this, size)");
        aVMusicWaveBean2.setMusicWavePointArray(copyOf);
        aVMusicWaveBean2.setMusicPath(aVMusicWaveBean.getMusicPath());
        aVMusicWaveBean2.setMusicLength(aVMusicWaveBean.getMusicLength());
        aVMusicWaveBean2.setVideoLenght(aVMusicWaveBean.getVideoLenght());
        return aVMusicWaveBean2;
    }

    public static AVMusicWaveBean LIZJ(VEMusicWaveBean vEMusicWaveBean) {
        if (vEMusicWaveBean == null || !C81995WFz.LJ(vEMusicWaveBean.getWaveBean())) {
            return null;
        }
        C81995WFz.LIZ(vEMusicWaveBean);
        AVMusicWaveBean aVMusicWaveBean = new AVMusicWaveBean();
        float[] waveBean = vEMusicWaveBean.getWaveBean();
        o.LJIIIIZZ(waveBean, "veMusicWaveBean.waveBean");
        float[] copyOf = Arrays.copyOf(waveBean, waveBean.length);
        o.LJIIIIZZ(copyOf, "copyOf(this, size)");
        aVMusicWaveBean.setMusicWavePointArray(copyOf);
        return aVMusicWaveBean;
    }

    public static AVMusicWaveBean LIZLLL(AVMusic aVMusic) {
        if (C81995WFz.LJ(aVMusic.getMusicWaveData())) {
            AVMusicWaveBean aVMusicWaveBean = new AVMusicWaveBean();
            float[] musicWaveData = aVMusic.getMusicWaveData();
            o.LJIIIIZZ(musicWaveData, "music.musicWaveData");
            float[] copyOf = Arrays.copyOf(musicWaveData, musicWaveData.length);
            o.LJIIIIZZ(copyOf, "copyOf(this, size)");
            aVMusicWaveBean.setMusicWavePointArray(copyOf);
            return aVMusicWaveBean;
        }
        return null;
    }

    public static void LJ(AVMusicWaveBean aVMusicWaveBean) {
        if (aVMusicWaveBean != null && C81995WFz.LJ(aVMusicWaveBean.getMusicWavePointArray())) {
            int length = aVMusicWaveBean.getMusicWavePointArray().length;
            for (int i = 0; i < length; i++) {
                if (aVMusicWaveBean.getMusicWavePointArray()[i] < 0.1f) {
                    aVMusicWaveBean.getMusicWavePointArray()[i] = 0.1f;
                }
            }
        }
    }

    public final int LJI(Context context) {
        o.LJIIIZ(context, "context");
        int LJIIJJI = KL2.LJIIJJI(context) - ((int) KL2.LIZJ(context, 20.0f));
        int i = this.LIZLLL;
        return (LJIIJJI + i) / (i + this.LIZIZ);
    }

    public final void LJIIIZ(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = (int) KL2.LIZJ(context, 3.0f);
        this.LIZIZ = (int) KL2.LIZJ(context, 2.0f);
        this.LIZJ = (int) KL2.LIZJ(context, 90.0f);
        this.LIZLLL = (int) KL2.LIZJ(context, 2.0f);
        this.LJFF = KL2.LJIIJJI(context);
    }

    public static void LJFF(String str, WG2 wg2) {
        if (TextUtils.isEmpty(str)) {
            wg2.LIZ(null);
        } else {
            C81995WFz.LIZIZ(str, false, new WG1(wg2));
        }
    }

    public final int LJII(int i, boolean z) {
        int i2;
        if (this.LIZ + this.LIZIZ <= 0 || (i2 = this.LJ) <= 0) {
            return LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        }
        int i3 = (int) (((i * 1.0f) / i2) * ((this.LJFF + r1) / (r2 + r1)) * 1.0f);
        if (z && i3 < 2000) {
            return LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        }
        return i3;
    }

    public final void LIZ(AVMusicWaveBean aVMusicWaveBean, long j, long j2) {
        if (j > 0) {
            this.LJ = (int) j;
        }
        int LJII2 = LJII((int) j2, false);
        if (aVMusicWaveBean != null && C81995WFz.LJ(aVMusicWaveBean.getMusicWavePointArray()) && LJII2 > 0) {
            float[] musicWavePointArray = aVMusicWaveBean.getMusicWavePointArray();
            o.LJI(musicWavePointArray);
            if (musicWavePointArray.length > LJII2) {
                VEMusicWaveBean resampleMusicWaveData = VEUtils.getResampleMusicWaveData(aVMusicWaveBean.getMusicWavePointArray(), 0, LJII2);
                C81995WFz.LIZ(resampleMusicWaveData);
                if (resampleMusicWaveData != null && C81995WFz.LJ(resampleMusicWaveData.getWaveBean())) {
                    float[] waveBean = resampleMusicWaveData.getWaveBean();
                    o.LJIIIIZZ(waveBean, "musicWaveBean.waveBean");
                    float[] copyOf = Arrays.copyOf(waveBean, waveBean.length);
                    o.LJIIIIZZ(copyOf, "copyOf(this, size)");
                    aVMusicWaveBean.setMusicWavePointArray(copyOf);
                }
            }
        }
    }

    public static void LJIIIIZZ(AVMusicWaveBean aVMusicWaveBean, int i, int i2, int i3) {
        if (aVMusicWaveBean == null) {
            return;
        }
        o.LJI(aVMusicWaveBean.getMusicWavePointArray());
        float f = i3;
        int length = (int) (((r0.length * 1.0f) * i) / f);
        o.LJI(aVMusicWaveBean.getMusicWavePointArray());
        int length2 = (int) (((r0.length * 1.0f) * i2) / f);
        if (length2 <= 0) {
            return;
        }
        float[] fArr = new float[length2];
        float[] musicWavePointArray = aVMusicWaveBean.getMusicWavePointArray();
        o.LJI(musicWavePointArray);
        int length3 = musicWavePointArray.length;
        int i4 = length2 + length;
        boolean z = false;
        int i5 = length;
        while (i5 < i4 && i5 < length3) {
            fArr[i5 - length] = aVMusicWaveBean.getMusicWavePointArray()[i5];
            i5++;
            z = true;
        }
        if (C81995WFz.LJ(fArr) && z) {
            aVMusicWaveBean.setMusicWavePointArray(fArr);
        }
    }
}
