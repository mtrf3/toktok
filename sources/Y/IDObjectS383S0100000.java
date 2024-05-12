package Y;

import X.C3C5;
import X.C84654XKg;
import X.InterfaceC67352kd;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;

/* loaded from: classes.dex */
public class IDObjectS383S0100000 implements IFetchEffectChannelListener {
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

    public IDObjectS383S0100000(C84654XKg c84654XKg, int i) {
        this.$t = i;
        this.l0 = c84654XKg;
    }

    public static final void onFail$0(IDObjectS383S0100000 iDObjectS383S0100000, ExceptionResult exceptionResult) {
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) iDObjectS383S0100000.l0;
        C3C5.m7constructorimpl(null);
        interfaceC67352kd.resumeWith(null);
    }

    public static final void onFail$1(IDObjectS383S0100000 iDObjectS383S0100000, ExceptionResult exceptionResult) {
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) iDObjectS383S0100000.l0;
        C3C5.m7constructorimpl(null);
        interfaceC67352kd.resumeWith(null);
    }

    public static final void onFail$2(IDObjectS383S0100000 iDObjectS383S0100000, ExceptionResult exceptionResult) {
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) iDObjectS383S0100000.l0;
        C3C5.m7constructorimpl(null);
        interfaceC67352kd.resumeWith(null);
    }

    public static final void onFail$3(IDObjectS383S0100000 iDObjectS383S0100000, ExceptionResult exceptionResult) {
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) iDObjectS383S0100000.l0;
        C3C5.m7constructorimpl(null);
        interfaceC67352kd.resumeWith(null);
    }

    public static final void onSuccess$0(IDObjectS383S0100000 iDObjectS383S0100000, Object obj) {
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) iDObjectS383S0100000.l0;
        C3C5.m7constructorimpl(obj);
        interfaceC67352kd.resumeWith(obj);
    }

    public static final void onSuccess$1(IDObjectS383S0100000 iDObjectS383S0100000, Object obj) {
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) iDObjectS383S0100000.l0;
        C3C5.m7constructorimpl(obj);
        interfaceC67352kd.resumeWith(obj);
    }

    public static final void onSuccess$2(IDObjectS383S0100000 iDObjectS383S0100000, Object obj) {
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) iDObjectS383S0100000.l0;
        C3C5.m7constructorimpl(obj);
        interfaceC67352kd.resumeWith(obj);
    }

    public static final void onSuccess$3(IDObjectS383S0100000 iDObjectS383S0100000, Object obj) {
        InterfaceC67352kd interfaceC67352kd = (InterfaceC67352kd) iDObjectS383S0100000.l0;
        C3C5.m7constructorimpl(obj);
        interfaceC67352kd.resumeWith(obj);
    }
}
