package X;

import Y.ARunnableS41S0100000_5;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.bytedance.android.livesdk.container.config.base.HybridConfig;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class CNX {
    public final Activity LJLIL;
    public final HybridConfig LJLILLLLZI;
    public final String LJLJI;
    public final COW LJLJJI;
    public boolean LJLJJL;
    public C31886CfK LJLJJLL;

    public boolean LIZ() {
        return false;
    }

    public abstract void LIZIZ();

    public abstract C31886CfK LIZJ();

    public void LIZLLL() {
    }

    public abstract void LJFF();

    public void LJI(int i, int i2, Intent intent) {
    }

    public abstract void LJII(C31886CfK c31886CfK);

    public abstract void loadUrl(String str);

    public abstract View re();

    public void LJ() {
        OFH ofh = OFH.LIZLLL;
        String containerId = this.LJLILLLLZI.getContainerId();
        String originUri = this.LJLILLLLZI.getOriginUri();
        if (originUri == null) {
            originUri = "";
        }
        ofh.getClass();
        OFH.LIZJ(containerId, "schema", originUri);
        OFH.LIZJ(this.LJLILLLLZI.getContainerId(), "container_version", "3060");
        LJFF();
        LIZIZ();
        C31886CfK LIZJ = LIZJ();
        this.LJLJJLL = LIZJ;
        if (LIZJ != null) {
            LJII(LIZJ);
        }
    }

    public void release() {
        C15610jN.LIZIZ(new ARunnableS41S0100000_5(this, 257));
        OFH ofh = OFH.LIZLLL;
        String containerId = this.LJLILLLLZI.getContainerId();
        ofh.getClass();
        OFH.LJII(containerId);
    }

    public final void LJIIIIZZ(String str, JSONObject jSONObject) {
        C31886CfK c31886CfK = this.LJLJJLL;
        if (c31886CfK != null) {
            C38113ExZ c38113ExZ = c31886CfK.LJLILLLLZI;
            if (c38113ExZ.LJFF) {
                IllegalStateException illegalStateException = new IllegalStateException("JsBridge2 is already released!!!");
                if (C1A7.LJLIL) {
                    throw illegalStateException;
                }
            }
            c38113ExZ.LIZ.LJIILL(jSONObject, str);
        }
    }

    public CNX(ActivityC45651qj activityC45651qj, HybridConfig config, String containerId, COW cow) {
        o.LJIIIZ(config, "config");
        o.LJIIIZ(containerId, "containerId");
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = config;
        this.LJLJI = containerId;
        this.LJLJJI = cow;
    }
}
