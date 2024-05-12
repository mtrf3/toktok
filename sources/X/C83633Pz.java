package X;

import fjb.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AqS148S0200000_1;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.search.data.searchcontent.GroupSearchContentUpdateEngine$_conversationObserverFlow$1", f = "GroupSearchContentUpdateEngine.kt", l = {186}, m = "invokeSuspend")
/* renamed from: X.3Pz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83633Pz extends AbstractC65782Prm implements InterfaceC88471Ynr<C3CK<? super C3Q5>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C83593Pv LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83633Pz(C83593Pv c83593Pv, InterfaceC67352kd<? super C83633Pz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c83593Pv;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C83633Pz c83633Pz = new C83633Pz(this.LJLJI, interfaceC67352kd);
        c83633Pz.LJLILLLLZI = obj;
        return c83633Pz;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.4WV, X.3Px] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            final C3CK c3ck = (C3CK) this.LJLILLLLZI;
            final C83593Pv c83593Pv = this.LJLJI;
            ?? r3 = new C4WV() { // from class: X.3Px
                @Override // X.InterfaceC120024nO
                public final void BH(List<C63089OpR> list) {
                }

                @Override // X.InterfaceC120024nO
                public final void DH(List<C63089OpR> list) {
                }

                @Override // X.InterfaceC120024nO
                public final int JG() {
                    return 0;
                }

                @Override // X.InterfaceC120024nO
                public final void MO(List<C63089OpR> list) {
                }

                @Override // X.InterfaceC120024nO
                public final void Mi(String str, List<C63089OpR> list) {
                }

                @Override // X.InterfaceC120024nO
                public final void hW(int i2, String str) {
                }

                @Override // X.InterfaceC120024nO
                public final void tq0(int i2, String str, List list) {
                }

                @Override // X.InterfaceC120024nO
                public final void CN(C63120Opw c63120Opw) {
                    if (c63120Opw == null || !c63120Opw.isGroupChat()) {
                        return;
                    }
                    Object LJIILLIIL = c3ck.LJIILLIIL(new C3Q5(C3Q6.REMOVE, C47261Igj.LJJIJ(c63120Opw)));
                    C98453th c98453th = C83593Pv.this.LIZIZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onLeaveConversation ");
                    LIZ.append(C83593Pv.this.LJIIIZ.invoke(c63120Opw));
                    LIZ.append(' ');
                    LIZ.append((Object) C79973Bx.LIZIZ(LJIILLIIL));
                    c98453th.LJFF(X1D.LIZIZ(LIZ));
                }

                @Override // X.InterfaceC120024nO
                public final void Tu(C63120Opw c63120Opw) {
                    if (c63120Opw == null || !c63120Opw.isGroupChat()) {
                        return;
                    }
                    Object LJIILLIIL = c3ck.LJIILLIIL(new C3Q5(C3Q6.REMOVE, C47261Igj.LJJIJ(c63120Opw)));
                    C98453th c98453th = C83593Pv.this.LIZIZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onDissolveConversation ");
                    LIZ.append(C83593Pv.this.LJIIIZ.invoke(c63120Opw));
                    LIZ.append(' ');
                    LIZ.append((Object) C79973Bx.LIZIZ(LJIILLIIL));
                    c98453th.LJFF(X1D.LIZIZ(LIZ));
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v0, types: [X.OQg] */
                /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
                @Override // X.C4WP
                public final void dU(java.util.Map<String, C63120Opw> map) {
                    ?? r32;
                    int i2;
                    Collection<C63120Opw> values;
                    if (map != null && (values = map.values()) != null) {
                        r32 = new ArrayList();
                        for (C63120Opw c63120Opw : values) {
                            if (c63120Opw.isGroupChat()) {
                                r32.add(c63120Opw);
                            }
                        }
                    } else {
                        r32 = C61878OQg.INSTANCE;
                    }
                    C83593Pv c83593Pv2 = C83593Pv.this;
                    c83593Pv2.LIZIZ.LJI("", r32, c83593Pv2.LJIIIZ);
                    Object LJIILLIIL = c3ck.LJIILLIIL(new C3Q5(C3Q6.INSERT_OR_UPDATE, r32));
                    C98453th c98453th = C83593Pv.this.LIZIZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onQueryConversation ");
                    if (map != null) {
                        i2 = map.size();
                    } else {
                        i2 = 0;
                    }
                    LIZ.append(i2);
                    LIZ.append(' ');
                    LIZ.append((Object) C79973Bx.LIZIZ(LJIILLIIL));
                    c98453th.LJFF(X1D.LIZIZ(LIZ));
                }

                @Override // X.InterfaceC120024nO
                public final void f3(C63120Opw c63120Opw) {
                    if (c63120Opw == null || !c63120Opw.isGroupChat()) {
                        return;
                    }
                    Object LJIILLIIL = c3ck.LJIILLIIL(new C3Q5(C3Q6.REMOVE, C47261Igj.LJJIJ(c63120Opw)));
                    C98453th c98453th = C83593Pv.this.LIZIZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onDeleteConversation ");
                    LIZ.append(C83593Pv.this.LJIIIZ.invoke(c63120Opw));
                    LIZ.append(' ');
                    LIZ.append((Object) C79973Bx.LIZIZ(LJIILLIIL));
                    c98453th.LJFF(X1D.LIZIZ(LIZ));
                }

                @Override // X.InterfaceC120024nO
                public final void we0(C63120Opw c63120Opw) {
                    if (c63120Opw == null || !c63120Opw.isGroupChat()) {
                        return;
                    }
                    Object LJIILLIIL = c3ck.LJIILLIIL(new C3Q5(C3Q6.INSERT_OR_UPDATE, C47261Igj.LJJIJ(c63120Opw)));
                    C98453th c98453th = C83593Pv.this.LIZIZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onCreateConversation ");
                    LIZ.append(C83593Pv.this.LJIIIZ.invoke(c63120Opw));
                    LIZ.append(' ');
                    LIZ.append((Object) C79973Bx.LIZIZ(LJIILLIIL));
                    c98453th.LJFF(X1D.LIZIZ(LIZ));
                }

                @Override // X.InterfaceC120024nO
                public final void y9(int i2, C63120Opw c63120Opw) {
                    if (c63120Opw == null || !c63120Opw.isGroupChat()) {
                        return;
                    }
                    C98453th c98453th = C83593Pv.this.LIZIZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onUpdateConversation ");
                    LIZ.append(C83593Pv.this.LJIIIZ.invoke(c63120Opw));
                    LIZ.append(" reason ");
                    LIZ.append(i2);
                    c98453th.LJFF(X1D.LIZIZ(LIZ));
                    if (!C83593Pv.LJIILIIL.contains(Integer.valueOf(i2))) {
                        return;
                    }
                    Object LJIILLIIL = c3ck.LJIILLIIL(new C3Q5(C3Q6.INSERT_OR_UPDATE, C47261Igj.LJJIJ(c63120Opw)));
                    C98453th c98453th2 = C83593Pv.this.LIZIZ;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("onUpdateConversation ");
                    LIZ2.append((Object) C79973Bx.LIZIZ(LJIILLIIL));
                    c98453th2.LJFF(X1D.LIZIZ(LIZ2));
                }
            };
            c83593Pv.LJFF.LJFF(r3);
            AqS148S0200000_1 aqS148S0200000_1 = new AqS148S0200000_1(this.LJLJI, (C83613Px) r3, 24);
            this.LJLIL = 1;
            if (C3T0.LIZ(c3ck, aqS148S0200000_1, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C3CK<? super C3Q5> c3ck, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c3ck, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
