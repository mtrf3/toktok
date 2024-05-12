package com.ss.android.ugc.aweme.bullet.module.p002default;

import X.C113554cx;
import X.C16880lQ;
import X.C51029K0z;
import X.F3T;
import X.InterfaceC37120EhY;
import X.InterfaceC37146Ehy;
import X.InterfaceC38186Eyk;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.X1D;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class BridgeProxy extends BaseBridgeMethod {
    public final InterfaceC88472Yns<F3T, InterfaceC38186Eyk> LJLIL;
    public final String LJLILLLLZI;
    public InterfaceC38186Eyk LJLJI;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.AbstractC37121EhZ, X.InterfaceC37788EsK
    public final void release() {
        String str;
        super.release();
        InterfaceC38186Eyk interfaceC38186Eyk = this.LJLJI;
        if (interfaceC38186Eyk != null) {
            interfaceC38186Eyk.release();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("release ");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(" with real bridge ");
        InterfaceC38186Eyk interfaceC38186Eyk2 = this.LJLJI;
        if (interfaceC38186Eyk2 != null) {
            str = C16880lQ.LJLLJ(interfaceC38186Eyk2.getClass());
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLILLLLZI;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, X.InterfaceC38186Eyk
    public final void handle(JSONObject params, InterfaceC37120EhY callback) {
        String str;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(callback, "callback");
        if (this.LJLJI == null) {
            String name = this.LJLILLLLZI;
            o.LJIIIZ(name, "name");
            o.LJ(this.LJLILLLLZI, name);
            if (this.LJLJI != null) {
                C113554cx.LJJJLIIL();
            } else {
                InterfaceC38186Eyk invoke = this.LJLIL.invoke(this.contextProviderFactory);
                this.LJLJI = invoke;
                C51029K0z.LJJIIZI(new OSZ(name, invoke));
            }
        }
        InterfaceC38186Eyk interfaceC38186Eyk = this.LJLJI;
        if (interfaceC38186Eyk != null) {
            interfaceC38186Eyk.handle(params, callback);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handle ");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(" with real bridge ");
        InterfaceC38186Eyk interfaceC38186Eyk2 = this.LJLJI;
        if (interfaceC38186Eyk2 != null) {
            str = C16880lQ.LJLLJ(interfaceC38186Eyk2.getClass());
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" with param ");
        LIZ.append(params);
        LIZ.append('\"');
        X1D.LIZIZ(LIZ);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        super.handle(params, iReturn);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BridgeProxy(String str, F3T contextProviderFactory, InterfaceC88472Yns<? super F3T, ? extends InterfaceC38186Eyk> bridgeDesc) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        o.LJIIIZ(bridgeDesc, "bridgeDesc");
        this.LJLIL = bridgeDesc;
        this.LJLILLLLZI = str;
    }
}
