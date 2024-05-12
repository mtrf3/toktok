package Y;

import X.C3C5;
import X.XJL;
import X.XKS;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public class IDObjectS390S0100000_42 implements IFetchEffectChannelListener {
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

    public IDObjectS390S0100000_42(XKS xks, int i) {
        this.$t = i;
        this.l0 = xks;
    }

    public static final void onFail$0(IDObjectS390S0100000_42 iDObjectS390S0100000_42, ExceptionResult exceptionResult) {
        XJL xjl = (XJL) iDObjectS390S0100000_42.l0;
        C3C5.m7constructorimpl(null);
        xjl.resumeWith(null);
    }

    public static final void onFail$1(IDObjectS390S0100000_42 iDObjectS390S0100000_42, ExceptionResult exceptionResult) {
        XJL xjl = (XJL) iDObjectS390S0100000_42.l0;
        C3C5.m7constructorimpl(null);
        xjl.resumeWith(null);
    }

    public static final void onSuccess$0(IDObjectS390S0100000_42 iDObjectS390S0100000_42, Object obj) {
        XJL xjl = (XJL) iDObjectS390S0100000_42.l0;
        C3C5.m7constructorimpl(obj);
        xjl.resumeWith(obj);
    }

    public static final void onSuccess$1(IDObjectS390S0100000_42 iDObjectS390S0100000_42, Object response) {
        o.LJIIIZ(response, "response");
        XJL xjl = (XJL) iDObjectS390S0100000_42.l0;
        C3C5.m7constructorimpl(response);
        xjl.resumeWith(response);
    }
}
