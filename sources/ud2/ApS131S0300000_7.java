package ud2;

import X.AbstractC82618Wbe;
import X.C275416g;
import X.C275516h;
import X.C44282HZm;
import X.C45928I0u;
import X.C82622Wbi;
import X.C83591WrL;
import X.I2K;
import X.WMH;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewScene;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class ApS131S0300000_7 extends AbstractC82618Wbe {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.AbstractC82618Wbe
    public final Object LIZIZ(C82622Wbi c82622Wbi) {
        switch (this.$t) {
            case 0:
                return LIZIZ$0(this, c82622Wbi);
            case 1:
                return LIZIZ$1(this, c82622Wbi);
            case 2:
                return LIZIZ$2(this, c82622Wbi);
            default:
                return super.LIZIZ(c82622Wbi);
        }
    }

    public static final Object LIZIZ$0(ApS131S0300000_7 apS131S0300000_7, C82622Wbi container) {
        Effect effect;
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        ShortVideoContext shortVideoContext = ((VideoRecordNewScene) apS131S0300000_7.l1).LJLZ;
        CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
        CreativeInfo creativeInfo = shortVideoContext.creativeInfo;
        I2K i2k = (I2K) apS131S0300000_7.l2;
        if (((Boolean) C44282HZm.LIZ.getValue()).booleanValue()) {
            effect = ((VideoRecordNewScene) apS131S0300000_7.l1).LLFZ;
        } else {
            effect = null;
        }
        C83591WrL c83591WrL = new C83591WrL(container, cameraComponentModel, creativeInfo, i2k, effect);
        ((C275416g) apS131S0300000_7.l0).getClass();
        c83591WrL.afterInit$als_release(uptimeMillis);
        return c83591WrL;
    }

    public static final Object LIZIZ$1(ApS131S0300000_7 apS131S0300000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C45928I0u c45928I0u = new C45928I0u((WMH) apS131S0300000_7.l1, container, R.id.iri, (ShortVideoContext) ((C82622Wbi) apS131S0300000_7.l2).LJ(ShortVideoContext.class, null));
        ((C275416g) apS131S0300000_7.l0).getClass();
        c45928I0u.afterInit$als_release(uptimeMillis);
        return c45928I0u;
    }

    public static final Object LIZIZ$2(ApS131S0300000_7 apS131S0300000_7, C82622Wbi container) {
        o.LJIIIZ(container, "container");
        long uptimeMillis = SystemClock.uptimeMillis();
        C45928I0u c45928I0u = new C45928I0u((WMH) apS131S0300000_7.l1, container, R.id.iri, (ShortVideoContext) ((C82622Wbi) apS131S0300000_7.l2).LJ(ShortVideoContext.class, null));
        ((C275416g) apS131S0300000_7.l0).getClass();
        c45928I0u.afterInit$als_release(uptimeMillis);
        return c45928I0u;
    }

    public ApS131S0300000_7(C275416g c275416g, C275516h c275516h, WMH wmh, C82622Wbi c82622Wbi, int i) {
        this.$t = i;
        this.l0 = c275416g;
        this.l1 = wmh;
        this.l2 = c82622Wbi;
    }

    public ApS131S0300000_7(C275416g c275416g, C275516h c275516h, VideoRecordNewScene videoRecordNewScene, I2K i2k, int i) {
        this.$t = i;
        this.l0 = c275416g;
        this.l1 = videoRecordNewScene;
        this.l2 = i2k;
    }
}
