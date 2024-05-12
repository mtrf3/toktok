package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WGD<V> implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    public WGD(String str, int i) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        MusicWaveBean LIZJ;
        float[] musicWavePointArray;
        TextUtils.isEmpty(this.LJLIL);
        String str = this.LJLIL;
        o.LJI(str);
        int i2 = this.LJLILLLLZI;
        MusicWaveBean musicWaveBean = WGE.LIZ.get(str);
        if (musicWaveBean != null && (musicWavePointArray = musicWaveBean.getMusicWavePointArray()) != null && musicWavePointArray.length == i2) {
            return musicWaveBean.clone();
        }
        int musicDuration = AVExternalServiceImpl.LIZ().abilityService().infoService().getMusicDuration(str);
        if (musicDuration <= -1) {
            return WGE.LIZJ(i2);
        }
        if (i2 <= 0) {
            i = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        } else {
            i = i2;
        }
        if (musicDuration > 90000) {
            LIZJ = WGE.LIZJ(i2);
        } else {
            AVMusicWaveBean musicWaveData = AVExternalServiceImpl.LIZ().vesdkService().getMusicWaveData(str, 0, i);
            if (musicWaveData != null) {
                LIZJ = new MusicWaveBean();
                LIZJ.setMusicLength(musicWaveData.getMusicLength());
                LIZJ.setMusicWavePointArray(musicWaveData.getMusicWavePointArray());
                LIZJ.setVideoLenght(musicWaveData.getVideoLenght());
            } else {
                LIZJ = WGE.LIZJ(i2);
            }
        }
        float[] musicWavePointArray2 = LIZJ.getMusicWavePointArray();
        if (musicWavePointArray2 == null || musicWavePointArray2.length == 0) {
            return LIZJ;
        }
        int length = musicWavePointArray2.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (Float.isNaN(musicWavePointArray2[i3])) {
                musicWavePointArray2[i3] = 0.0f;
            }
        }
        return LIZJ;
    }
}
