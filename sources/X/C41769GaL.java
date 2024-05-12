package X;

import com.ss.android.ugc.aweme.services.dm.DMPublishService;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS31S0001000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GaL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41769GaL extends GUX {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public C41769GaL(String str, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }

    @Override // X.GUX
    public final void onProgress(int i, Object obj) {
        super.onProgress(i, obj);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("publish progress, ");
        LIZ.append(i);
        C111214Yb.LIZJ("DMPublishManager", X1D.LIZIZ(LIZ));
        C117874jv.LIZJ.put(this.LJLIL, Integer.valueOf(i));
        C117874jv.LJ(this.LJLIL, new AqS31S0001000_7(i, 0));
    }

    @Override // X.GUX
    public final void onFinish(AbstractC41479GPr result, Object obj, PublishModel publishModel) {
        o.LJIIIZ(result, "result");
        super.onFinish(result, obj, publishModel);
        if (result instanceof C41614GUw) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("publish success, ");
            LIZ.append(((C41614GUw) result).LIZ);
            C111214Yb.LIZJ("DMPublishManager", X1D.LIZIZ(LIZ));
            C117874jv.LJ(this.LJLIL, new AqS173S0100000_7(result, 11));
        } else if (result instanceof C41478GPq) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("publish failed, ");
            LIZ2.append(((C41478GPq) result).LIZ);
            C111214Yb.LIZJ("DMPublishManager", X1D.LIZIZ(LIZ2));
            C117874jv.LJ(this.LJLIL, new AqS173S0100000_7(result, 12));
        }
        C117874jv.LIZJ.remove(this.LJLIL);
        DMPublishService.INSTANCE.removePublishCallback(this.LJLILLLLZI, this);
    }

    @Override // X.GUX
    public final void onStageUpdate(String stage, AbstractC41758GaA state, Object obj) {
        o.LJIIIZ(stage, "stage");
        o.LJIIIZ(state, "state");
        super.onStageUpdate(stage, state, obj);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("publish state update, ");
        LIZ.append(stage);
        C111214Yb.LIZJ("DMPublishManager", X1D.LIZIZ(LIZ));
        if (!(state instanceof C41757Ga9) || !(((C41757Ga9) state).LIZ instanceof GV8)) {
            return;
        }
        if (o.LJ(stage, "STAGE_COVER_SYNTHETIC")) {
            C117874jv.LJ(this.LJLIL, new AqS173S0100000_7(state, 13));
        } else {
            if (!o.LJ(stage, "STAGE_SYNTHETIC")) {
                return;
            }
            C117874jv.LJ(this.LJLIL, new AqS173S0100000_7(state, 14));
        }
    }
}
