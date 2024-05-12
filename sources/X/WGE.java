package X;

import Y.AgS130S0100000_14;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import java.util.HashMap;

/* loaded from: classes15.dex */
public final class WGE {
    public static final HashMap<String, MusicWaveBean> LIZ = new HashMap<>();

    public static final MusicWaveBean LIZJ(int i) {
        float f;
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            switch ((i2 - 2) % 8) {
                case 1:
                case 7:
                    f = 0.15306123f;
                    break;
                case 2:
                case 6:
                    f = 0.26530612f;
                    break;
                case 3:
                case 5:
                    f = 0.37755102f;
                    break;
                case 4:
                    f = 0.48979592f;
                    break;
                default:
                    f = 0.040816326f;
                    break;
            }
            fArr[i2] = f;
        }
        MusicWaveBean musicWaveBean = new MusicWaveBean();
        musicWaveBean.setMusicWavePointArray(fArr);
        return musicWaveBean;
    }

    public static MusicWaveBean LIZIZ(int i, String str) {
        MusicWaveBean musicWaveBean = LIZ.get(str);
        if (musicWaveBean != null && musicWaveBean.getMusicWavePointArray().length == i) {
            return musicWaveBean.clone();
        }
        return null;
    }

    public static final void LIZ(String str, int i, WGG wgg) {
        if (TextUtils.isEmpty(str)) {
            wgg.LIZ(null);
            return;
        }
        MusicWaveBean LIZIZ = LIZIZ(i, str);
        if (LIZIZ != null) {
            H7B.LIZ("Load waveBean from cache");
            wgg.LIZ(LIZIZ);
        } else {
            C10K.LIZJ(new WGD(str, i)).LJ(new AgS130S0100000_14(new WGF(wgg, str), 3), C10K.LJIIIIZZ, null);
        }
    }
}
