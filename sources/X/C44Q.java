package X;

import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.44Q, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C44Q extends AbstractC91573ib implements C4WU {
    public final AbstractC90763hI LJLILLLLZI;
    public final InterfaceC116954iR<? super C40S> LJLJI;

    @Override // X.InterfaceC120024nO
    public final int JG() {
        return 0;
    }

    @Override // X.AbstractC91573ib
    public final void LIZ() {
        this.LJLILLLLZI.LJIJ();
    }

    @Override // X.InterfaceC120024nO
    public final void BH(final List<C63089OpR> list) {
        InterfaceC116954iR<? super C40S> interfaceC116954iR = this.LJLJI;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        interfaceC116954iR.onNext(new C40S(list) { // from class: X.44W
            public final List<C63089OpR> LIZ;

            public final int hashCode() {
                return Objects.hash(this.LIZ);
            }

            public final String toString() {
                return C78966Uyw.LJJJLL("OnRemoveMembersEvent:%s", this.LIZ);
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                o.LJIIIZ(list, "list");
                this.LIZ = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C44W)) {
                    return false;
                }
                return C78966Uyw.LJIIIZ(new Object[]{((C44W) obj).LIZ}, new Object[]{this.LIZ});
            }
        });
    }

    @Override // X.InterfaceC120024nO
    public final void CN(final C63120Opw c63120Opw) {
        if (c63120Opw != null) {
            this.LJLJI.onNext(new C40S(c63120Opw) { // from class: X.44Z
                public final C63120Opw LIZ;

                public final int hashCode() {
                    return Objects.hash(this.LIZ);
                }

                public final String toString() {
                    return C78966Uyw.LJJJLL("OnLeaveConversationEvent:%s", this.LIZ);
                }

                {
                    o.LJIIIZ(c63120Opw, "conversation");
                    this.LIZ = c63120Opw;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C44Z)) {
                        return false;
                    }
                    return C78966Uyw.LJIIIZ(new Object[]{((C44Z) obj).LIZ}, new Object[]{this.LIZ});
                }
            });
        } else {
            "onLeaveConversation(): conversation is null".toString();
            throw new IllegalStateException("onLeaveConversation(): conversation is null");
        }
    }

    @Override // X.InterfaceC120024nO
    public final void DH(final List<C63089OpR> list) {
        InterfaceC116954iR<? super C40S> interfaceC116954iR = this.LJLJI;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        interfaceC116954iR.onNext(new C40S(list) { // from class: X.44V
            public final List<C63089OpR> LIZ;

            public final int hashCode() {
                return Objects.hash(this.LIZ);
            }

            public final String toString() {
                return C78966Uyw.LJJJLL("OnAddMembersEvent:%s", this.LIZ);
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                o.LJIIIZ(list, "list");
                this.LIZ = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C44V)) {
                    return false;
                }
                return C78966Uyw.LJIIIZ(new Object[]{((C44V) obj).LIZ}, new Object[]{this.LIZ});
            }
        });
    }

    @Override // X.InterfaceC120024nO
    public final void MO(final List<C63089OpR> list) {
        InterfaceC116954iR<? super C40S> interfaceC116954iR = this.LJLJI;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        interfaceC116954iR.onNext(new C40S(list) { // from class: X.44U
            public final List<C63089OpR> LIZ;

            public final int hashCode() {
                return Objects.hash(this.LIZ);
            }

            public final String toString() {
                return C78966Uyw.LJJJLL("OnUpdateMembersEvent:%s", this.LIZ);
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                o.LJIIIZ(list, "list");
                this.LIZ = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C44U)) {
                    return false;
                }
                return C78966Uyw.LJIIIZ(new Object[]{((C44U) obj).LIZ}, new Object[]{this.LIZ});
            }
        });
    }

    @Override // X.InterfaceC120024nO
    public final void Tu(C63120Opw c63120Opw) {
        if (c63120Opw != null) {
            this.LJLJI.onNext(new C40R(c63120Opw));
        } else {
            "onDissolveConversation(): conversation is null".toString();
            throw new IllegalStateException("onDissolveConversation(): conversation is null");
        }
    }

    @Override // X.InterfaceC120024nO
    public final void f3(final C63120Opw c63120Opw) {
        if (c63120Opw != null) {
            this.LJLJI.onNext(new C40S(c63120Opw) { // from class: X.44Y
                public final C63120Opw LIZ;

                public final int hashCode() {
                    return Objects.hash(this.LIZ);
                }

                public final String toString() {
                    return C78966Uyw.LJJJLL("OnDeleteConversationEvent:%s", this.LIZ);
                }

                {
                    o.LJIIIZ(c63120Opw, "conversation");
                    this.LIZ = c63120Opw;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C44Y)) {
                        return false;
                    }
                    return C78966Uyw.LJIIIZ(new Object[]{((C44Y) obj).LIZ}, new Object[]{this.LIZ});
                }
            });
        } else {
            "onDeleteConversation(): conversation is null".toString();
            throw new IllegalStateException("onDeleteConversation(): conversation is null");
        }
    }

    @Override // X.InterfaceC120024nO
    public final void we0(C63120Opw c63120Opw) {
        if (c63120Opw != null) {
            this.LJLJI.onNext(new C44P(c63120Opw));
        } else {
            "onCreateConversation(): conversation is null".toString();
            throw new IllegalStateException("onCreateConversation(): conversation is null");
        }
    }

    public C44Q(AbstractC90763hI source, InterfaceC116954iR<? super C40S> observer) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(observer, "observer");
        this.LJLILLLLZI = source;
        this.LJLJI = observer;
    }

    @Override // X.InterfaceC120024nO
    public final void Mi(final String conversationId, final List<C63089OpR> list) {
        o.LJIIIZ(conversationId, "conversationId");
        InterfaceC116954iR<? super C40S> interfaceC116954iR = this.LJLJI;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        interfaceC116954iR.onNext(new C40S(conversationId, list) { // from class: X.44T
            public final String LIZ;
            public final List<C63089OpR> LIZIZ;

            public final Object[] LIZ() {
                return new Object[]{this.LIZ, this.LIZIZ};
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C44T) {
                    return C78966Uyw.LJIIIZ(((C44T) obj).LIZ(), LIZ());
                }
                return false;
            }

            public final int hashCode() {
                return Objects.hash(LIZ());
            }

            public final String toString() {
                return C78966Uyw.LJJJLL("OnLoadMemberEvent:%s,%s", LIZ());
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                o.LJIIIZ(conversationId, "conversationId");
                o.LJIIIZ(list, "list");
                this.LIZ = conversationId;
                this.LIZIZ = list;
            }
        });
    }

    @Override // X.InterfaceC120024nO
    public final void hW(final int i, final String str) {
        if (str != null) {
            this.LJLJI.onNext(new C40S(str, i) { // from class: X.44X
                public final String LIZ;
                public final int LIZIZ;

                public final Object[] LIZ() {
                    return new Object[]{this.LIZ, Integer.valueOf(this.LIZIZ)};
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof C44X) {
                        return C78966Uyw.LJIIIZ(((C44X) obj).LIZ(), LIZ());
                    }
                    return false;
                }

                public final int hashCode() {
                    return Objects.hash(LIZ());
                }

                public final String toString() {
                    return C78966Uyw.LJJJLL("OnSilentConversationEvent:%s,%s", LIZ());
                }

                {
                    o.LJIIIZ(str, "conversationId");
                    this.LIZ = str;
                    this.LIZIZ = i;
                }
            });
        } else {
            "onSilentConversation(): conversationId is null".toString();
            throw new IllegalStateException("onSilentConversation(): conversationId is null");
        }
    }

    @Override // X.InterfaceC120024nO
    public final void y9(int i, C63120Opw c63120Opw) {
        if (c63120Opw != null) {
            this.LJLJI.onNext(new C1029142d(i, c63120Opw));
        } else {
            "onUpdateConversation(): conversation is null".toString();
            throw new IllegalStateException("onUpdateConversation(): conversation is null");
        }
    }

    @Override // X.InterfaceC120024nO
    public final void tq0(final int i, final String str, final List list) {
        if (str != null) {
            InterfaceC116954iR<? super C40S> interfaceC116954iR = this.LJLJI;
            if (list == null) {
                list = C61878OQg.INSTANCE;
            }
            interfaceC116954iR.onNext(new C40S(str, i, list) { // from class: X.44R
                public final String LIZ;
                public final int LIZIZ;
                public final List<Long> LIZJ;

                public final Object[] LIZ() {
                    return new Object[]{this.LIZ, Integer.valueOf(this.LIZIZ), this.LIZJ};
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof C44R) {
                        return C78966Uyw.LJIIIZ(((C44R) obj).LIZ(), LIZ());
                    }
                    return false;
                }

                public final int hashCode() {
                    return Objects.hash(LIZ());
                }

                public final String toString() {
                    return C78966Uyw.LJJJLL("OnSilentMemberEvent:%s,%s,%s", LIZ());
                }

                {
                    o.LJIIIZ(str, "conversationId");
                    o.LJIIIZ(list, "silentMembers");
                    this.LIZ = str;
                    this.LIZIZ = i;
                    this.LIZJ = list;
                }
            });
            return;
        }
        "onSilentMember(): conversationId is null".toString();
        throw new IllegalStateException("onSilentMember(): conversationId is null");
    }
}
