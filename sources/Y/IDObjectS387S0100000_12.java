package Y;

import X.C16880lQ;
import X.C73849Syb;
import X.C74413TIj;
import X.C81567Vzn;
import X.C82891Wg3;
import X.InterfaceC74509TMb;
import X.InterfaceC88472Yns;
import X.WQT;
import X.X1D;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class IDObjectS387S0100000_12 implements IFetchEffectChannelListener {
    public final int $t;
    public Object l0;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        switch (this.$t) {
            case 0:
                onFail$0(this, exceptionResult);
                return;
            case 1:
                onFail$1(this, exceptionResult);
                return;
            case 2:
                onFail$2(this, exceptionResult);
                return;
            case 3:
                onFail$3(this, exceptionResult);
                return;
            default:
                return;
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, effectChannelResponse);
                return;
            case 1:
                onSuccess$1(this, effectChannelResponse);
                return;
            case 2:
                onSuccess$2(this, effectChannelResponse);
                return;
            case 3:
                onSuccess$3(this, effectChannelResponse);
                return;
            default:
                return;
        }
    }

    public IDObjectS387S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFail$0(IDObjectS387S0100000_12 iDObjectS387S0100000_12, ExceptionResult exceptionResult) {
        Exception exc;
        MutableLiveData<C74413TIj<EffectChannelResponse>> mutableLiveData = ((C81567Vzn) iDObjectS387S0100000_12.l0).LLIIIL;
        if (mutableLiveData != null) {
            if (exceptionResult != null) {
                exc = exceptionResult.getException();
            } else {
                exc = null;
            }
            mutableLiveData.setValue(C74413TIj.LIZ(exc));
        }
        ((C81567Vzn) iDObjectS387S0100000_12.l0).LLIIIL = null;
    }

    public static final void onFail$1(IDObjectS387S0100000_12 iDObjectS387S0100000_12, ExceptionResult exceptionResult) {
        Exception exception;
        if (exceptionResult != null && (exception = exceptionResult.getException()) != null) {
            C16880lQ.LLLLIIL(exception);
        }
    }

    public static final void onFail$2(IDObjectS387S0100000_12 iDObjectS387S0100000_12, ExceptionResult exceptionResult) {
        Exception runtimeException;
        WQT wqt = (WQT) iDObjectS387S0100000_12.l0;
        if (exceptionResult != null) {
            wqt.getClass();
            Exception exception = exceptionResult.getException();
            if (exception != null) {
                C16880lQ.LLLLIIL(exception);
            }
        }
        C73849Syb c73849Syb = wqt.LIZIZ;
        if (exceptionResult == null || (runtimeException = exceptionResult.getException()) == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("failed on fetch remote filters, msg : ");
            LIZ.append(exceptionResult);
            LIZ.append("?.msg, code : ");
            LIZ.append(exceptionResult);
            LIZ.append("?.errorCode");
            runtimeException = new RuntimeException(X1D.LIZIZ(LIZ));
        }
        c73849Syb.onError(runtimeException);
        C82891Wg3.LIZLLL().d("viki filter, EffectPlatformFilterDataFetcher.requestEffectPlatform -> onFail");
        wqt.LIZIZ.onComplete();
    }

    public static final void onFail$3(IDObjectS387S0100000_12 iDObjectS387S0100000_12, ExceptionResult exceptionResult) {
        ((InterfaceC74509TMb) iDObjectS387S0100000_12.l0).onFail(exceptionResult);
    }

    public static final void onSuccess$0(IDObjectS387S0100000_12 iDObjectS387S0100000_12, Object response) {
        o.LJIIIZ(response, "response");
        MutableLiveData<C74413TIj<EffectChannelResponse>> mutableLiveData = ((C81567Vzn) iDObjectS387S0100000_12.l0).LLIIIL;
        if (mutableLiveData == null) {
            return;
        }
        mutableLiveData.setValue(C74413TIj.LIZJ(response));
    }

    public static final void onSuccess$1(IDObjectS387S0100000_12 iDObjectS387S0100000_12, Object obj) {
        if (obj != null) {
            ((InterfaceC88472Yns) iDObjectS387S0100000_12.l0).invoke(obj);
        }
    }

    public static final void onSuccess$2(IDObjectS387S0100000_12 iDObjectS387S0100000_12, Object obj) {
        ((WQT) iDObjectS387S0100000_12.l0).LIZ((EffectChannelResponse) obj);
    }

    public static final void onSuccess$3(IDObjectS387S0100000_12 iDObjectS387S0100000_12, Object obj) {
        ((InterfaceC74509TMb) iDObjectS387S0100000_12.l0).onSuccess(obj);
    }
}
