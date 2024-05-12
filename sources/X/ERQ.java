package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ERQ implements ERO {
    public final WLT LIZ;

    public ERQ(WRQ cameraApiComponent) {
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        this.LIZ = cameraApiComponent;
    }

    @Override // X.ERO
    public final ERB LIZ(Effect effect) {
        return new ER5(this.LIZ);
    }

    @Override // X.ERO
    public final boolean LIZIZ(Effect effect) {
        if (V0N.LJJIIJ(effect) || (DiyPropParser.LJII(effect) && C78685UuP.LJJJZ(DiyPropParser.LIZJ(effect)) && C53560L0i.LIZ())) {
            return true;
        }
        return false;
    }
}
