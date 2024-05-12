package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.creativex.camerakit.camera.session.recorder.impl.RecorderImpl;
import com.ss.android.ugc.asve.context.PreviewSize;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VERecorder;
import kotlin.jvm.internal.AqS145S0200000_14;
import kotlin.jvm.internal.AqS18S0010000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WwU, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83910WwU implements InterfaceC83840WvM {
    public RecorderImpl LIZ;
    public C83935Wwt LIZIZ;
    public final InterfaceC65784Pro<InterfaceC83878Wvy> LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C83910WwU(InterfaceC65784Pro<? extends InterfaceC83878Wvy> interfaceC65784Pro) {
        this.LIZJ = interfaceC65784Pro;
    }

    @Override // X.InterfaceC83840WvM
    public final RecorderImpl LIZ(C83935Wwt context, C83911WwV c83911WwV) {
        o.LJIIIZ(context, "context");
        RecorderImpl recorderImpl = this.LIZ;
        if (recorderImpl == null) {
            InterfaceC83927Wwl origin = c83911WwV.LJLJJI;
            o.LJIIIZ(origin, "origin");
            C83925Wwj c83925Wwj = new C83925Wwj(context, origin);
            C5NP LIZLLL = C82891Wg3.LIZLLL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CaptureLog createRecorderActual: ");
            LIZ.append(context);
            LIZLLL.i(X1D.LIZIZ(LIZ));
            Context context2 = c83911WwV.LJLIL;
            LifecycleOwner lifecycleOwner = c83911WwV.LJLILLLLZI;
            C83733Wtd c83733Wtd = c83911WwV.LJLJI;
            InterfaceC83697Wt3 interfaceC83697Wt3 = c83911WwV.LJLJJL;
            InterfaceC65784Pro<Boolean> interceptCallback = c83911WwV.LJLJJLL;
            InterfaceC65784Pro<VERecorder> interfaceC65784Pro = c83911WwV.LJLJL;
            Effect effect = c83911WwV.LJLJLJ;
            o.LJIIIZ(context2, "context");
            o.LJIIIZ(interceptCallback, "interceptCallback");
            RecorderImpl recorderImpl2 = new RecorderImpl(new C83911WwV(context2, lifecycleOwner, c83733Wtd, c83925Wwj, interfaceC83697Wt3, interceptCallback, interfaceC65784Pro, effect));
            recorderImpl2.init();
            this.LIZ = recorderImpl2;
        } else {
            C83935Wwt c83935Wwt = this.LIZIZ;
            if (c83935Wwt != null && c83935Wwt != context) {
                C5NP LIZLLL2 = C82891Wg3.LIZLLL();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("CaptureLog tryUpdateRecorder oldSessionContext: [");
                LIZ2.append(c83935Wwt);
                LIZ2.append("], \n newSessionContext:[");
                LIZ2.append(context);
                LIZ2.append(']');
                LIZLLL2.i(X1D.LIZIZ(LIZ2));
                this.LIZJ.invoke().Q3();
                this.LIZJ.invoke().Q3();
                C83934Wws c83934Wws = new TBT() { // from class: X.Wws
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C83935Wwt) obj).LJLILLLLZI;
                    }
                };
                Object invoke = c83934Wws.invoke(c83935Wwt);
                Object invoke2 = c83934Wws.invoke(context);
                if (!o.LJ(invoke, invoke2)) {
                    PreviewSize previewSize = (PreviewSize) invoke2;
                    recorderImpl.getMediaController().v8(previewSize.getWidth(), previewSize.getHeight());
                }
                OSZ osz = new OSZ(new TBT() { // from class: X.WwY
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C83935Wwt) obj).LJLJL;
                    }
                }, new TBT() { // from class: X.Wwb
                    @Override // X.TBT, X.TBZ, X.TBW
                    public final Object get(Object obj) {
                        return ((C83935Wwt) obj).LJLJLJ;
                    }
                });
                InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) osz.getFirst();
                InterfaceC88472Yns interfaceC88472Yns2 = (InterfaceC88472Yns) osz.getSecond();
                Object invoke3 = interfaceC88472Yns.invoke(c83935Wwt);
                Object invoke4 = interfaceC88472Yns.invoke(context);
                Object invoke5 = interfaceC88472Yns2.invoke(c83935Wwt);
                Object invoke6 = interfaceC88472Yns2.invoke(context);
                if ((!o.LJ(invoke3, invoke4)) && (!o.LJ(invoke5, invoke6))) {
                    Integer num = (Integer) invoke6;
                    Integer num2 = (Integer) invoke4;
                    if (num2 != null && num != null) {
                        recorderImpl.getCameraController().LJJIJIIJI(new AqS145S0200000_14(num2, num, 46));
                    }
                }
                Boolean bool = context.LJLJLLL;
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    if (!o.LJ(Boolean.valueOf(booleanValue), c83935Wwt.LJLJLLL)) {
                        recorderImpl.getCameraController().LJJIJIIJI(new AqS18S0010000_14(booleanValue, 31));
                    }
                }
            }
        }
        this.LIZIZ = context;
        RecorderImpl recorderImpl3 = this.LIZ;
        if (recorderImpl3 != null) {
            return recorderImpl3;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
