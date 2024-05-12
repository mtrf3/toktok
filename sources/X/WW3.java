package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WW3 implements WWT {
    public final /* synthetic */ C82410WVy LIZ;

    @Override // X.WWT
    public final void LIZIZ() {
        ShortVideoContext shortVideoContext = this.LIZ.getShortVideoContext();
        Activity LJIJJ = C78688UuS.LJIJJ(this.LIZ);
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        HashMap LJIJJLI = C78880UxY.LJIJJLI(shortVideoContext, new OSZ[0]);
        LJIJJLI.putAll(C113554cx.LJJL(new OSZ("screen_width", String.valueOf(C81184Vtc.LJ(LJIJJ))), new OSZ("screen_height", String.valueOf(C81184Vtc.LIZLLL(LJIJJ)))));
        C78880UxY.LJJLIIIJL("prop_carousel_scroll_end", LJIJJLI);
    }

    public WW3(C82410WVy c82410WVy) {
        this.LIZ = c82410WVy;
    }

    @Override // X.WWT
    public final void LIZ(WWR wwr) {
        String str;
        ShortVideoContext shortVideoContext = this.LIZ.getShortVideoContext();
        Activity LJIJJ = C78688UuS.LJIJJ(this.LIZ);
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        HashMap LJIJJLI = C78880UxY.LJIJJLI(shortVideoContext, new OSZ[0]);
        OSZ[] oszArr = new OSZ[4];
        if (wwr.LJLIL == 1) {
            str = "right";
        } else {
            str = "left";
        }
        oszArr[0] = new OSZ("scroll_direction", str);
        oszArr[1] = new OSZ("scroll_distance", String.valueOf(wwr.LJLILLLLZI));
        oszArr[2] = new OSZ("screen_width", String.valueOf(C81184Vtc.LJ(LJIJJ)));
        oszArr[3] = new OSZ("screen_height", String.valueOf(C81184Vtc.LIZLLL(LJIJJ)));
        LJIJJLI.putAll(C113554cx.LJJL(oszArr));
        C78880UxY.LJJLIIIJL("prop_carousel_scroll", LJIJJLI);
    }
}
