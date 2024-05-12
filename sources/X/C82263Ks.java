package X;

import fjb.a;
import java.util.ArrayList;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.SessionListManagerV2$onStrangerBoxUpdate$1", f = "SessionListManagerV2.kt", l = {467}, m = "invokeSuspend")
/* renamed from: X.3Ks, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82263Ks extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C3LB LJLILLLLZI;
    public final /* synthetic */ C82253Kr LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82263Ks(C3LB c3lb, C82253Kr c82253Kr, InterfaceC67352kd<? super C82263Ks> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c3lb;
        this.LJLJI = c82253Kr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C82263Ks(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int i3;
        List<C63120Opw> list;
        List<C63120Opw> list2;
        List<C63120Opw> list3;
        boolean LJI;
        List<C63120Opw> list4;
        boolean LJI2;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i4 = this.LJLIL;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                C3LB c3lb = this.LJLILLLLZI;
                boolean z = false;
                if (c3lb != null && (list4 = c3lb.LIZ) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (C63120Opw c63120Opw : list4) {
                        C63120Opw c63120Opw2 = c63120Opw;
                        LJI2 = C82473Ln.LJI(c63120Opw2, new C43001GuD());
                        if (LJI2 && c63120Opw2.getUnreadCount() > 0) {
                            arrayList.add(c63120Opw);
                        }
                    }
                    i = arrayList.size();
                } else {
                    i = 0;
                }
                C3LB c3lb2 = this.LJLILLLLZI;
                if (c3lb2 != null && (list3 = c3lb2.LIZIZ) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (C63120Opw c63120Opw3 : list3) {
                        C63120Opw c63120Opw4 = c63120Opw3;
                        LJI = C82473Ln.LJI(c63120Opw4, new C43001GuD());
                        if (LJI && c63120Opw4.getUnreadCount() > 0) {
                            arrayList2.add(c63120Opw3);
                        }
                    }
                    i2 = arrayList2.size();
                } else {
                    i2 = 0;
                }
                C3LB c3lb3 = this.LJLILLLLZI;
                if (c3lb3 != null && (list2 = c3lb3.LIZ) != null) {
                    i3 = list2.size();
                } else {
                    i3 = 0;
                }
                C3LB c3lb4 = this.LJLILLLLZI;
                C63120Opw c63120Opw5 = null;
                if (c3lb4 != null) {
                    list = c3lb4.LIZ;
                } else {
                    list = null;
                }
                long LIZ = C37O.LIZ(list);
                C82253Kr c82253Kr = this.LJLJI;
                C3LB c3lb5 = this.LJLILLLLZI;
                if (c3lb5 != null) {
                    c63120Opw5 = c3lb5.LIZJ;
                }
                c82253Kr.LJLLILLLL = new C3LG(i, i2, c63120Opw5, i3, LIZ);
                InterfaceC81953Jn LJ = c82253Kr.LJ();
                if (LJ != null && LJ.LJIIJJI()) {
                    z = true;
                }
                this.LJLIL = 1;
                if (c82253Kr.LJJIIJZLJL(c82253Kr.LLFF, true, z, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        } catch (Exception e) {
            C34B.LIZLLL("SessionListManagerV2", "onStrangerBoxUpdate error: ", e);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
