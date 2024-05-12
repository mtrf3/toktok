package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M1V implements InterfaceC61267O2t {
    public final InterfaceC88472Yns<O26, Boolean> LIZ;
    public final InterfaceC88471Ynr<O26, O1M, C76800UCe> LIZIZ;
    public final InterfaceC88471Ynr<O26, O1M, C76800UCe> LIZJ;
    public final InterfaceC88473Ynt<O26, O1M, Throwable, C76800UCe> LIZLLL;

    @Override // X.InterfaceC61267O2t
    public final void LIZ(O26 resInfo, O1M taskConfig) {
        InterfaceC88471Ynr<O26, O1M, C76800UCe> interfaceC88471Ynr;
        o.LJIIIZ(resInfo, "resInfo");
        o.LJIIIZ(taskConfig, "taskConfig");
        if (this.LIZ.invoke(resInfo).booleanValue() && (interfaceC88471Ynr = this.LIZJ) != null) {
            interfaceC88471Ynr.invoke(resInfo, taskConfig);
        }
    }

    @Override // X.InterfaceC61267O2t
    public final void LIZIZ(O26 resInfo, O1M taskConfig) {
        o.LJIIIZ(resInfo, "resInfo");
        o.LJIIIZ(taskConfig, "taskConfig");
        if (this.LIZ.invoke(resInfo).booleanValue()) {
            this.LIZIZ.invoke(resInfo, taskConfig);
        }
    }

    @Override // X.InterfaceC61267O2t
    public final void LIZJ(O26 resInfo, O1M taskConfig, Throwable e) {
        InterfaceC88473Ynt<O26, O1M, Throwable, C76800UCe> interfaceC88473Ynt;
        o.LJIIIZ(resInfo, "resInfo");
        o.LJIIIZ(taskConfig, "taskConfig");
        o.LJIIIZ(e, "e");
        if (this.LIZ.invoke(resInfo).booleanValue() && (interfaceC88473Ynt = this.LIZLLL) != null) {
            interfaceC88473Ynt.invoke(resInfo, taskConfig, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public M1V(InterfaceC88472Yns<? super O26, Boolean> predicate, InterfaceC88471Ynr<? super O26, ? super O1M, C76800UCe> loadSuccessBlock, InterfaceC88471Ynr<? super O26, ? super O1M, C76800UCe> interfaceC88471Ynr, InterfaceC88473Ynt<? super O26, ? super O1M, ? super Throwable, C76800UCe> interfaceC88473Ynt) {
        o.LJIIIZ(predicate, "predicate");
        o.LJIIIZ(loadSuccessBlock, "loadSuccessBlock");
        this.LIZ = predicate;
        this.LIZIZ = loadSuccessBlock;
        this.LIZJ = interfaceC88471Ynr;
        this.LIZLLL = interfaceC88473Ynt;
    }
}
