package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.story.publish.ISocialPublishBridgeService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import kotlin.jvm.internal.o;

/* renamed from: X.GUl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41603GUl extends GUX {
    public final PublishModel LJLIL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C41607GUp.LJLIL);

    public final ISocialPublishBridgeService LIZIZ() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-socialPublishBridgeService>(...)");
        return (ISocialPublishBridgeService) value;
    }

    public C41603GUl(PublishModel publishModel) {
        this.LJLIL = publishModel;
    }

    public static String LIZ(C41759GaB c41759GaB) {
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity == null) {
            return "";
        }
        String errorMsg = AVExternalServiceImpl.LIZ().publishService().getErrorMsg(topActivity, c41759GaB, topActivity.getString(R.string.rr0));
        o.LJIIIIZZ(errorMsg, "get().getService(IExtern…n1_publish_error_failed))");
        return errorMsg;
    }

    public final void LIZJ(String str) {
        String str2;
        StringBuilder LIZJ = b1.LIZJ(str, " | creationId:");
        PublishModel publishModel = this.LJLIL;
        String str3 = null;
        if (publishModel != null) {
            str2 = publishModel.creationId;
        } else {
            str2 = null;
        }
        LIZJ.append(str2);
        LIZJ.append(",publishId:");
        PublishModel publishModel2 = this.LJLIL;
        if (publishModel2 != null) {
            str3 = publishModel2.publishId;
        }
        LIZJ.append(str3);
        X1D.LIZIZ(LIZJ);
    }

    @Override // X.GUX
    public final void onProgress(int i, Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onProgress,progress:");
        LIZ.append(i);
        LIZJ(X1D.LIZIZ(LIZ));
        LIZIZ().onPublishProgress(i, this.LJLIL);
    }

    public final void LIZLLL(PublishModel publishModel, C41759GaB c41759GaB, String str) {
        LIZJ("onPublishFailed");
        LIZIZ().onPublishFailed(publishModel, c41759GaB, str);
    }

    @Override // X.GUX
    public final void onFinish(AbstractC41479GPr result, Object obj, PublishModel publishModel) {
        o.LJIIIZ(result, "result");
        if (result instanceof C41505GQr) {
            CreateBaseAwemeResponse createBaseAwemeResponse = ((C41505GQr) result).LIZ;
            LIZJ("onPublishSuccess");
            if (createBaseAwemeResponse instanceof CreateAwemeResponse) {
                LIZIZ().onPublishSuccess(publishModel, (CreateAwemeResponse) createBaseAwemeResponse);
                return;
            }
            return;
        }
        if (result instanceof C41478GPq) {
            C41478GPq c41478GPq = (C41478GPq) result;
            C41606GUo c41606GUo = c41478GPq.LIZ;
            if (c41606GUo.LIZLLL == null || !(c41606GUo.LJ instanceof Boolean)) {
                return;
            }
            C41606GUo c41606GUo2 = c41478GPq.LIZ;
            C41759GaB c41759GaB = new C41759GaB(c41606GUo2.LIZLLL, c41606GUo2.LIZJ);
            Object obj2 = c41478GPq.LIZ.LJ;
            o.LJII(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            c41759GaB.setRecover(((Boolean) obj2).booleanValue());
            LIZLLL(publishModel, c41759GaB, LIZ(c41759GaB));
            return;
        }
        if (result instanceof C41477GPp) {
            C41601GUj c41601GUj = ((C41477GPp) result).LIZ;
            LIZLLL(publishModel, c41601GUj, LIZ(c41601GUj));
        } else if (result instanceof C41480GPs) {
            C41759GaB c41759GaB2 = ((C41480GPs) result).LIZ;
            LIZLLL(publishModel, c41759GaB2, LIZ(c41759GaB2));
        } else {
            if (!(result instanceof GUZ)) {
                return;
            }
            C41759GaB c41759GaB3 = ((GUZ) result).LIZ.LIZJ;
            if (c41759GaB3 == null) {
                c41759GaB3 = new C41759GaB(new Throwable(""));
            }
            LIZLLL(publishModel, c41759GaB3, LIZ(c41759GaB3));
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
                    GV7 gv72 = c41757Ga9.LIZ;
                    o.LJII(gv72, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.publish.Result.Success");
                    Object obj2 = ((GV8) gv72).LIZ;
                    o.LJII(obj2, "null cannot be cast to non-null type kotlin.String");
                    String str = (String) obj2;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onSynthetiseSuccess,path:");
                    LIZ.append(str);
                    LIZJ(X1D.LIZIZ(LIZ));
                    LIZIZ().onSynthetiseSuccess(this.LJLIL, str);
                }
            }
        }
    }
}
