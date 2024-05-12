package X;

import kotlin.jvm.internal.o;

/* renamed from: X.R9d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C69077R9d extends AbstractC67056QTk {
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LIZ;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LIZIZ;
    public final /* synthetic */ InterfaceC88471Ynr<C69076R9c, Integer, C76800UCe> LIZJ;

    @Override // X.AbstractC67055QTj
    public final void onSuccess(QQI qqi) {
        C69076R9c response = (C69076R9c) qqi;
        o.LJIIIZ(response, "response");
        if (response.LJIIJ) {
            InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = this.LIZ;
            String str = response.LJIIIZ;
            o.LJIIIIZZ(str, "response.ticket");
            interfaceC88472Yns.invoke(str);
            return;
        }
        InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns2 = this.LIZIZ;
        String str2 = response.LJIIIZ;
        o.LJIIIIZZ(str2, "response.ticket");
        interfaceC88472Yns2.invoke(str2);
    }

    @Override // X.AbstractC67055QTj
    public final void onError(QQI qqi, int i) {
        this.LIZJ.invoke(qqi, Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C69077R9d(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns2, InterfaceC88471Ynr<? super C69076R9c, ? super Integer, C76800UCe> interfaceC88471Ynr) {
        this.LIZ = interfaceC88472Yns;
        this.LIZIZ = interfaceC88472Yns2;
        this.LIZJ = interfaceC88471Ynr;
    }
}
