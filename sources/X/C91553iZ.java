package X;

import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.3iZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91553iZ extends AbstractC91573ib implements InterfaceC99673vf {
    public final InterfaceC99713vj LJLILLLLZI;
    public final InterfaceC116954iR<? super AbstractC89473fD> LJLJI;

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void T1(C109544Rq c109544Rq) {
    }

    @Override // X.AbstractC91573ib
    public final void LIZ() {
        this.LJLILLLLZI.LIZLLL();
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void y(C109544Rq c109544Rq) {
        if (c109544Rq != null) {
            this.LJLJI.onNext(new C91563ia(c109544Rq));
        } else {
            "onDelMessage(): message is null".toString();
            throw new IllegalStateException("onDelMessage(): message is null");
        }
    }

    public C91553iZ(InterfaceC99713vj source, InterfaceC116954iR<? super AbstractC89473fD> observer) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(observer, "observer");
        this.LJLILLLLZI = source;
        this.LJLJI = observer;
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void M1(List<C109544Rq> list, boolean z) {
        InterfaceC116954iR<? super AbstractC89473fD> interfaceC116954iR = this.LJLJI;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        interfaceC116954iR.onNext(new C91583ic(list, z));
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void ea(final C109544Rq c109544Rq, final boolean z) {
        if (c109544Rq != null) {
            this.LJLJI.onNext(new AbstractC89473fD(c109544Rq, z) { // from class: X.3fG
                public final C109544Rq LIZ;
                public final boolean LIZIZ;

                public final Object[] LIZ() {
                    return new Object[]{this.LIZ, Boolean.valueOf(this.LIZIZ)};
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof C89503fG) {
                        return C78966Uyw.LJIIIZ(((C89503fG) obj).LIZ(), LIZ());
                    }
                    return false;
                }

                public final int hashCode() {
                    return Objects.hash(LIZ());
                }

                public final String toString() {
                    return C78966Uyw.LJJJLL("OnSendMessageAsyncRespEvent:%s,%s", LIZ());
                }

                {
                    o.LJIIIZ(c109544Rq, "message");
                    this.LIZ = c109544Rq;
                    this.LIZIZ = z;
                }
            });
        } else {
            "onSendMessageAsyncResp(): message is null".toString();
            throw new IllegalStateException("onSendMessageAsyncResp(): message is null");
        }
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void u7(int i, C109544Rq c109544Rq) {
        if (c109544Rq != null) {
            this.LJLJI.onNext(new C91603ie(i, c109544Rq));
        } else {
            "onAddMessage(): message is null".toString();
            throw new IllegalStateException("onAddMessage(): message is null");
        }
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void v0(final List<C109544Rq> list, final boolean z) {
        InterfaceC116954iR<? super AbstractC89473fD> interfaceC116954iR = this.LJLJI;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        interfaceC116954iR.onNext(new AbstractC89473fD(list, z) { // from class: X.3fF
            public final List<C109544Rq> LIZ;
            public final boolean LIZIZ;

            public final Object[] LIZ() {
                return new Object[]{this.LIZ, Boolean.valueOf(this.LIZIZ)};
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C89493fF) {
                    return C78966Uyw.LJIIIZ(((C89493fF) obj).LIZ(), LIZ());
                }
                return false;
            }

            public final int hashCode() {
                return Objects.hash(LIZ());
            }

            public final String toString() {
                return C78966Uyw.LJJJLL("OnLoadNewerEvent:%s,%s", LIZ());
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                o.LJIIIZ(list, "list");
                this.LIZ = list;
                this.LIZIZ = z;
            }
        });
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void y5(final int i, final C63219OrX c63219OrX) {
        if (c63219OrX != null) {
            this.LJLJI.onNext(new AbstractC89473fD(i, c63219OrX) { // from class: X.3fH
                public final int LIZ;
                public final C63219OrX LIZIZ;

                public final Object[] LIZ() {
                    return new Object[]{Integer.valueOf(this.LIZ), this.LIZIZ};
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof C89513fH) {
                        return C78966Uyw.LJIIIZ(((C89513fH) obj).LIZ(), LIZ());
                    }
                    return false;
                }

                public final int hashCode() {
                    return Objects.hash(LIZ());
                }

                public final String toString() {
                    return C78966Uyw.LJJJLL("OnSendModifyPropertyMsgEvent:%s,%s", LIZ());
                }

                {
                    o.LJIIIZ(c63219OrX, "modifyMsgPropertyMsg");
                    this.LIZ = i;
                    this.LIZIZ = c63219OrX;
                }
            });
        } else {
            "onSendModifyPropertyMsg(): modifyMsgPropertyMsg is null".toString();
            throw new IllegalStateException("onSendModifyPropertyMsg(): modifyMsgPropertyMsg is null");
        }
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void K7(int i, String str, List list) {
        InterfaceC116954iR<? super AbstractC89473fD> interfaceC116954iR = this.LJLJI;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        interfaceC116954iR.onNext(new C91613if(list, i, str));
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void X8(java.util.Map map, int i, List list) {
        InterfaceC116954iR<? super AbstractC89473fD> interfaceC116954iR = this.LJLJI;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        if (map == null) {
            map = C113554cx.LJJJLIIL();
        }
        interfaceC116954iR.onNext(new C91593id(list, map));
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void m4(int i, C109544Rq c109544Rq, C63540Owi c63540Owi) {
        if (c109544Rq != null) {
            this.LJLJI.onNext(new C91233i3(i, c109544Rq, c63540Owi));
        } else {
            "onSendMessage(): message is null".toString();
            throw new IllegalStateException("onSendMessage(): message is null");
        }
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void x6(List<C109544Rq> list, int i, C107074Id extra) {
        o.LJIIIZ(extra, "extra");
        InterfaceC116954iR<? super AbstractC89473fD> interfaceC116954iR = this.LJLJI;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        interfaceC116954iR.onNext(new C89463fC(list, i, extra));
    }

    @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
    public final void v6(final C109544Rq c109544Rq, final java.util.Map<String, List<C32H>> map, final java.util.Map<String, List<C32H>> map2, Long l, Long l2) {
        if (c109544Rq != null) {
            InterfaceC116954iR<? super AbstractC89473fD> interfaceC116954iR = this.LJLJI;
            if (map == null) {
                map = C113554cx.LJJJLIIL();
            }
            if (map2 == null) {
                map2 = C113554cx.LJJJLIIL();
            }
            interfaceC116954iR.onNext(new AbstractC89473fD(c109544Rq, map, map2) { // from class: X.3fE
                public final C109544Rq LIZ;
                public final java.util.Map<String, List<C32H>> LIZIZ;
                public final java.util.Map<String, List<C32H>> LIZJ;

                public final Object[] LIZ() {
                    return new Object[]{this.LIZ, this.LIZIZ, this.LIZJ};
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof C89483fE) {
                        return C78966Uyw.LJIIIZ(((C89483fE) obj).LIZ(), LIZ());
                    }
                    return false;
                }

                public final int hashCode() {
                    return Objects.hash(LIZ());
                }

                public final String toString() {
                    return C78966Uyw.LJJJLL("OnGetModifyPropertyMsgEvent:%s,%s,%s", LIZ());
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    o.LJIIIZ(c109544Rq, "msg");
                    this.LIZ = c109544Rq;
                    this.LIZIZ = map;
                    this.LIZJ = map2;
                }
            });
            return;
        }
        "onGetModifyPropertyMsg(): msg is null".toString();
        throw new IllegalStateException("onGetModifyPropertyMsg(): msg is null");
    }
}
