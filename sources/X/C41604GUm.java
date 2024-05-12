package X;

import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.jvm.internal.o;

/* renamed from: X.GUm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41604GUm extends GUX {
    public final InterfaceC41605GUn<CreateBaseAwemeResponse> LJLIL;
    public final C07950Sx LJLILLLLZI;

    public C41604GUm(InterfaceC41605GUn<CreateBaseAwemeResponse> callBack) {
        o.LJIIIZ(callBack, "callBack");
        this.LJLIL = callBack;
        this.LJLILLLLZI = new C07950Sx("PublishScheduler-PublishCallbackWrapper");
    }

    @Override // X.GUX
    public final void onProgress(int i, Object obj) {
        if (!(obj instanceof Boolean)) {
            this.LJLILLLLZI.LIZ("onProgress extra not boolean");
        } else {
            this.LJLIL.U9(i, ((Boolean) obj).booleanValue());
        }
    }

    @Override // X.GUX
    public final void onFinish(AbstractC41479GPr result, Object obj, PublishModel publishModel) {
        o.LJIIIZ(result, "result");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PublishParallel PublishCallbackWrapper onFinish ");
        LIZ.append(this);
        H78.LJI(X1D.LIZIZ(LIZ));
        if (result instanceof C41505GQr) {
            if (!(obj instanceof Boolean)) {
                this.LJLILLLLZI.LIZ("onFinish extra not boolean");
                return;
            } else {
                this.LJLIL.K6(((C41505GQr) result).LIZ, ((Boolean) obj).booleanValue(), publishModel);
                return;
            }
        }
        if (result instanceof C41478GPq) {
            C41478GPq c41478GPq = (C41478GPq) result;
            C41606GUo c41606GUo = c41478GPq.LIZ;
            if (c41606GUo.LIZLLL != null && (c41606GUo.LJ instanceof Boolean)) {
                InterfaceC41605GUn<CreateBaseAwemeResponse> interfaceC41605GUn = this.LJLIL;
                C41606GUo c41606GUo2 = c41478GPq.LIZ;
                C41759GaB c41759GaB = new C41759GaB(c41606GUo2.LIZLLL, c41606GUo2.LIZJ);
                Object obj2 = c41478GPq.LIZ.LJ;
                o.LJII(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                c41759GaB.setRecover(((Boolean) obj2).booleanValue());
                interfaceC41605GUn.Z3(c41759GaB, publishModel);
                return;
            }
            this.LJLILLLLZI.LIZ("onFinish  null error / extra not boolean");
            return;
        }
        if (result instanceof C41477GPp) {
            C41601GUj c41601GUj = ((C41477GPp) result).LIZ;
            if (c41601GUj != null) {
                this.LJLIL.Z3(c41601GUj, publishModel);
                return;
            } else {
                this.LJLILLLLZI.LIZ("onFinish  null error / extra not boolean");
                return;
            }
        }
        if (result instanceof C41480GPs) {
            this.LJLIL.Z3(((C41480GPs) result).LIZ, publishModel);
        } else if (result instanceof GAI) {
            this.LJLIL.w8();
        }
    }

    @Override // X.GUX
    public final void onStageUpdate(String stage, AbstractC41758GaA state, Object obj) {
        o.LJIIIZ(stage, "stage");
        o.LJIIIZ(state, "state");
        if (o.LJ(stage, "STAGE_SYNTHETIC") && (state instanceof C41757Ga9)) {
            C41757Ga9 c41757Ga9 = (C41757Ga9) state;
            GV7 gv7 = c41757Ga9.LIZ;
            if (gv7 instanceof GV8) {
                o.LJII(gv7, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.publish.Result.Success");
                if (((GV8) gv7).LIZ instanceof String) {
                    InterfaceC41605GUn<CreateBaseAwemeResponse> interfaceC41605GUn = this.LJLIL;
                    GV7 gv72 = c41757Ga9.LIZ;
                    o.LJII(gv72, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.publish.Result.Success");
                    Object obj2 = ((GV8) gv72).LIZ;
                    o.LJII(obj2, "null cannot be cast to non-null type kotlin.String");
                    interfaceC41605GUn.J6((String) obj2);
                }
            }
        }
    }
}
