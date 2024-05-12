package Y;

import X.C74413TIj;
import X.C780334l;
import X.C82514WZy;
import X.C83147WkB;
import X.C83158WkM;
import X.C83175Wkd;
import X.InterfaceC83127Wjr;
import X.InterfaceC83176Wke;
import X.WPY;
import X.XKX;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutListViewModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class IDObjectS388S0100000_14 implements IFetchEffectChannelListener {
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
            default:
                return;
        }
    }

    public IDObjectS388S0100000_14(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFail$0(IDObjectS388S0100000_14 iDObjectS388S0100000_14, ExceptionResult exceptionResult) {
        String str;
        Exception exc;
        C83158WkM c83158WkM = (C83158WkM) iDObjectS388S0100000_14.l0;
        c83158WkM.getClass();
        String str2 = c83158WkM.LIZIZ;
        if (exceptionResult == null || (str = exceptionResult.getMsg()) == null) {
            str = "request fail";
        }
        C82514WZy.LIZIZ(1, str2, str);
        InterfaceC83127Wjr interfaceC83127Wjr = c83158WkM.LIZJ;
        if (interfaceC83127Wjr != null) {
            if (exceptionResult != null) {
                exc = exceptionResult.getException();
            } else {
                exc = null;
            }
            interfaceC83127Wjr.LIZ(new Exception(exc));
        }
        if (exceptionResult != null) {
            Exception exception = exceptionResult.getException();
            InterfaceC83176Wke interfaceC83176Wke = C83175Wkd.LIZ;
            if (interfaceC83176Wke != null) {
                interfaceC83176Wke.LIZIZ(exception);
            } else if (exception != null) {
                exception.getMessage();
            }
        }
        WPY.LIZIZ(false, "beautify", null, 12);
    }

    public static final void onFail$1(IDObjectS388S0100000_14 iDObjectS388S0100000_14, ExceptionResult exceptionResult) {
        Exception exc;
        MutableLiveData<C74413TIj<EffectChannelResponse>> mutableLiveData = ((DuetLayoutListViewModel) iDObjectS388S0100000_14.l0).LJLIL;
        if (mutableLiveData != null) {
            if (exceptionResult != null) {
                exc = exceptionResult.getException();
            } else {
                exc = null;
            }
            mutableLiveData.setValue(C74413TIj.LIZ(exc));
        }
        ((DuetLayoutListViewModel) iDObjectS388S0100000_14.l0).LJLIL = null;
    }

    public static final void onSuccess$0(IDObjectS388S0100000_14 iDObjectS388S0100000_14, Object obj) {
        C83158WkM c83158WkM = (C83158WkM) iDObjectS388S0100000_14.l0;
        c83158WkM.getClass();
        XKX.LIZLLL(C780334l.LJLIL, null, null, new C83147WkB(c83158WkM, (EffectChannelResponse) obj, null), 3);
    }

    public static final void onSuccess$1(IDObjectS388S0100000_14 iDObjectS388S0100000_14, Object response) {
        o.LJIIIZ(response, "response");
        MutableLiveData<C74413TIj<EffectChannelResponse>> mutableLiveData = ((DuetLayoutListViewModel) iDObjectS388S0100000_14.l0).LJLIL;
        if (mutableLiveData == null) {
            return;
        }
        mutableLiveData.setValue(C74413TIj.LIZJ(response));
    }
}
