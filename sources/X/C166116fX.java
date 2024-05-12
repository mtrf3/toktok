package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.6fX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166116fX {
    public final NLETrackSlot LIZ;
    public final NLEModel LIZIZ;
    public Effect LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public float LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public String LJIIL;
    public int LJIILIIL;

    public final String LIZ() {
        VecNLETrackSPtr tracks;
        NLETrack nLETrack;
        NLETrackSlot nLETrackSlot;
        NLESegment LJI;
        NLEResourceNode LIZIZ;
        NLEResourceNode LIZIZ2;
        NLETrackSlot nLETrackSlot2 = this.LIZ;
        if (nLETrackSlot2 != null) {
            NLESegment LJI2 = nLETrackSlot2.LJI();
            if (LJI2 == null || (LIZIZ2 = LJI2.LIZIZ()) == null) {
                return null;
            }
            return LIZIZ2.LIZJ();
        }
        NLEModel nLEModel = this.LIZIZ;
        if (nLEModel == null || (tracks = nLEModel.getTracks()) == null || (nLETrack = (NLETrack) ORZ.LJLLLL(tracks)) == null || (nLETrackSlot = (NLETrackSlot) ORZ.LJLLLL(nLETrack.LJIILL())) == null || (LJI = nLETrackSlot.LJI()) == null || (LIZIZ = LJI.LIZIZ()) == null) {
            return null;
        }
        return LIZIZ.LIZJ();
    }

    public C166116fX(NLETrackSlot nLETrackSlot, NLEModel nLEModel, Effect effect) {
        o.LJIIIZ(effect, "effect");
        this.LIZ = nLETrackSlot;
        this.LIZIZ = nLEModel;
        this.LIZJ = effect;
        this.LJI = 1.0f;
        this.LJIIL = "";
    }
}
