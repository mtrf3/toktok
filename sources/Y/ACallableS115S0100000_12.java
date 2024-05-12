package Y;

import X.C38836FMa;
import X.C70759Rpr;
import X.C72076SQm;
import X.C76800UCe;
import X.GAR;
import X.InterfaceC65784Pro;
import X.KL0;
import X.S0L;
import X.W5F;
import X.X1D;
import android.text.TextUtils;
import android.util.Log;
import com.ss.android.ugc.aweme.ecommerce.preloader.ImagePreloader;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.kids.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.music.api.MusicApi;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes13.dex */
public class ACallableS115S0100000_12 implements Callable {
    public final int $t;
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
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS115S0100000_12 aCallableS115S0100000_12) {
        Iterator it = ((ArrayList) aCallableS115S0100000_12.l0).iterator();
        while (it.hasNext()) {
            W5F LIZLLL = C70759Rpr.LIZLLL(it.next());
            LIZLLL.LJJI = KL0.LOW;
            LIZLLL.LJII(ImagePreloader.LIZLLL);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS115S0100000_12 aCallableS115S0100000_12) {
        return MusicApi.LIZIZ(((MusicModel) aCallableS115S0100000_12.l0).getMusicId()).music;
    }

    public static final Object call$2(ACallableS115S0100000_12 aCallableS115S0100000_12) {
        ((ExecutorService) GAR.LIZ.getValue()).execute(new ARunnableS25S0200000_6(IMService.createIIMServicebyMonsterPlugin(false).getImUserService().getAllFriends(), (MufListPageViewModel) aCallableS115S0100000_12.l0, 19));
        return C76800UCe.LIZ;
    }

    public static final Object call$3(ACallableS115S0100000_12 aCallableS115S0100000_12) {
        ((C72076SQm) aCallableS115S0100000_12.l0).LIZ.clear();
        return null;
    }

    public static final Object call$4(ACallableS115S0100000_12 aCallableS115S0100000_12) {
        try {
            S0L s0l = (S0L) aCallableS115S0100000_12.l0;
            C38836FMa.LIZLLL(s0l.LIZ, s0l.LIZIZ);
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("post event failed: ");
            LIZ.append(((S0L) aCallableS115S0100000_12.l0).LIZ);
            return Integer.valueOf(Log.w("MetricsEvent", X1D.LIZIZ(LIZ), th));
        }
    }

    public static final Object call$5(ACallableS115S0100000_12 aCallableS115S0100000_12) {
        MusicModel musicModel = (MusicModel) aCallableS115S0100000_12.l0;
        if (!TextUtils.isEmpty(musicModel.getMusicId())) {
            String musicId = musicModel.getMusicId();
            ChooseMusicApi.API api = ChooseMusicApi.LIZ;
            if (musicId != null) {
                musicId = musicId.trim();
            }
            musicModel.setMusic(api.queryMusic(musicId, 0).get().music);
            musicModel.setStrongBeatUrl(musicModel.getMusic().getStrongBeatUrl());
        }
        return musicModel;
    }

    public static final Object call$6(ACallableS115S0100000_12 aCallableS115S0100000_12) {
        ((InterfaceC65784Pro) aCallableS115S0100000_12.l0).invoke();
        return C76800UCe.LIZ;
    }

    public ACallableS115S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
