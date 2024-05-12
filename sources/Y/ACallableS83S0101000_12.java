package Y;

import X.C42195GhD;
import X.C44350Has;
import X.C55017LiX;
import X.C60903NvH;
import X.C73669Svh;
import X.C78579Ush;
import X.C78583Usl;
import X.T01;
import X.X1D;
import android.os.Debug;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.api.MusicApi;
import com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.io.Serializable;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class ACallableS83S0101000_12 implements Callable {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS83S0101000_12 aCallableS83S0101000_12) {
        switch (aCallableS83S0101000_12.i1) {
            case 0:
                try {
                    return ((T01) aCallableS83S0101000_12.l0).LIZ();
                } catch (C42195GhD e) {
                    return new C73669Svh(e);
                }
            default:
                return aCallableS83S0101000_12.l0;
        }
    }

    public static final Object call$1(ACallableS83S0101000_12 aCallableS83S0101000_12) {
        switch (aCallableS83S0101000_12.i1) {
            case 0:
                String str = (String) ((Serializable) aCallableS83S0101000_12.l0);
                IVideoRecordPreferences iVideoRecordPreferences = (IVideoRecordPreferences) new C44350Has(0).LIZ(C60903NvH.LJ, IVideoRecordPreferences.class);
                if (str == null) {
                    str = "";
                }
                iVideoRecordPreferences.setCreativeToolRootDir(str);
                return null;
            case 1:
                String stickerIds = (String) ((Serializable) aCallableS83S0101000_12.l0);
                C60903NvH.LJIIJJI().getIStickerPropService().getClass();
                o.LJIIIZ(stickerIds, "stickerIds");
                return PropReuseServiceImpl.LJIIJ().LIZJ(stickerIds);
            default:
                MusicModel musicModel = (MusicModel) ((Serializable) aCallableS83S0101000_12.l0);
                if (!TextUtils.isEmpty(musicModel.getMusicId())) {
                    musicModel.setMusic(MusicApi.LIZIZ(musicModel.getMusicId()).music);
                    musicModel.setMusicDetailFetched(true);
                    musicModel.setStrongBeatUrl(musicModel.getMusic().getStrongBeatUrl());
                }
                return musicModel;
        }
    }

    public static final Object call$2(ACallableS83S0101000_12 aCallableS83S0101000_12) {
        int i;
        Aweme aweme;
        switch (aCallableS83S0101000_12.i1) {
            case 0:
                final C78579Ush c78579Ush = (C78579Ush) aCallableS83S0101000_12.l0;
                c78579Ush.getClass();
                Debug.getMemoryInfo(new Debug.MemoryInfo());
                final float totalPss = r0.getTotalPss() / 1024.0f;
                C78583Usl LJI = C78583Usl.LJI();
                Runnable runnable = new Runnable() { // from class: X.T24
                    @Override // java.lang.Runnable
                    public final void run() {
                        C78579Ush c78579Ush2 = C78579Ush.this;
                        float f = totalPss;
                        if (!c78579Ush2.LIZ || f < 0.0f) {
                            return;
                        }
                        c78579Ush2.getClass();
                    }
                };
                if (LJI.LIZ) {
                    Handler handler = LJI.LIZJ;
                    if (handler != null) {
                        handler.post(runnable);
                        return null;
                    }
                    return null;
                }
                throw new IllegalStateException("LiveTaskManager: Must call init() before use.");
            case 1:
                try {
                    return ((T01) aCallableS83S0101000_12.l0).LIZ();
                } catch (C42195GhD e) {
                    return new C73669Svh(e);
                }
            default:
                C55017LiX c55017LiX = (C55017LiX) aCallableS83S0101000_12.l0;
                c55017LiX.getClass();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("fetchListFromCache before size=");
                int i2 = 0;
                if (c55017LiX.getItems() != null) {
                    i = c55017LiX.getItems().size();
                } else {
                    i = 0;
                }
                LIZ.append(i);
                X1D.LIZIZ(LIZ);
                int i3 = c55017LiX.LJLJLJ.LIZIZ + 1;
                if (c55017LiX.getItems() != null && i3 < c55017LiX.getItems().size() && (aweme = (Aweme) ListProtector.get(c55017LiX.getItems(), c55017LiX.LJLJLJ.LIZIZ)) != null && aweme.getSubAweme() != null) {
                    i3++;
                }
                if (c55017LiX.getItems() != null && i3 < c55017LiX.getItems().size()) {
                    c55017LiX.getItems().subList(0, i3).clear();
                    c55017LiX.LJLJLJ.LIZIZ = 0;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("fetchListFromCache after size=");
                if (c55017LiX.getItems() != null) {
                    i2 = c55017LiX.getItems().size();
                }
                LIZ2.append(i2);
                X1D.LIZIZ(LIZ2);
                Thread.sleep(400L);
                return c55017LiX.mData;
        }
    }

    public ACallableS83S0101000_12(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
