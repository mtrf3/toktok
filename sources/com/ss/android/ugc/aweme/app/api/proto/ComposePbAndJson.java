package com.ss.android.ugc.aweme.app.api.proto;

import X.F1W;
import X.InterfaceC48038ItG;
import X.InterfaceC65316PkG;
import X.InterfaceC65349Pkn;
import com.squareup.wire.Message;

/* loaded from: classes12.dex */
public class ComposePbAndJson<P extends Message, J> implements InterfaceC65316PkG, F1W {
    public final J LJLIL;
    public final P LJLILLLLZI;
    public transient Long LJLJI;

    @InterfaceC65349Pkn("rid")
    public String requestId;

    @Override // X.InterfaceC65316PkG
    public final String getRequestId() {
        return this.requestId;
    }

    public static ComposePbAndJson LIZ(Object obj) {
        return new ComposePbAndJson(obj, null);
    }

    public static <T extends Message> ComposePbAndJson LIZIZ(T t) {
        return new ComposePbAndJson(null, t);
    }

    public final J LIZJ(InterfaceC48038ItG<P, J> interfaceC48038ItG) {
        J j = this.LJLIL;
        if (j == null) {
            j = interfaceC48038ItG.apply(this.LJLILLLLZI);
        }
        if (j instanceof InterfaceC65316PkG) {
            ((InterfaceC65316PkG) j).setRequestId(this.requestId);
        }
        if (j instanceof F1W) {
            ((F1W) j).setNetworkInfoKey(this.LJLJI);
        }
        return j;
    }

    @Override // X.F1W
    public final void setNetworkInfoKey(Long l) {
        this.LJLJI = l;
    }

    @Override // X.InterfaceC65316PkG
    public final void setRequestId(String str) {
        this.requestId = str;
    }

    public ComposePbAndJson(J j, P p) {
        if (j != null || p != null) {
            this.LJLIL = j;
            this.LJLILLLLZI = p;
            return;
        }
        throw new IllegalArgumentException("wrong args");
    }
}
