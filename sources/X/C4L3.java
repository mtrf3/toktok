package X;

import com.ss.android.ugc.aweme.im.service.model.IMContact;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.share.controller.manager.QuickShareManager$onLoadComplete$1$1", f = "QuickShareManager.kt", l = {81}, m = "invokeSuspend")
/* renamed from: X.4L3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4L3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ List<IMContact> LJLILLLLZI;
    public final /* synthetic */ C4S6 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4L3(C4S6 c4s6, List list, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = list;
        this.LJLJI = c4s6;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C4L3(this.LJLJI, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List list;
        InterfaceC62225ObV invoke;
        List list2;
        InterfaceC62225ObV invoke2;
        List list3;
        InterfaceC62225ObV invoke3;
        List list4;
        InterfaceC62225ObV invoke4;
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
            C4L2.LJLIL.getClass();
            C4L5 c4l5 = (C4L5) C4L2.LJLJLLL.getValue();
            List<IMContact> imContacts = this.LJLILLLLZI;
            InterfaceC65784Pro<? extends InterfaceC62225ObV> interfaceC65784Pro = C4L2.LJLJJL;
            InterfaceC65784Pro<? extends InterfaceC62225ObV> interfaceC65784Pro2 = C4L2.LJLJJLL;
            c4l5.getClass();
            o.LJIIIZ(imContacts, "imContacts");
            C61899ORb c61899ORb = new C61899ORb();
            switch (C183317Hj.LIZ()) {
                case 1:
                    c61899ORb.addAll(C4L5.LIZ(c4l5, imContacts, 0, 6));
                    break;
                case 2:
                    c61899ORb.addAll(C4L5.LIZ(c4l5, imContacts, 0, 4));
                    break;
                case 3:
                    c61899ORb.addAll(C4L5.LIZ(c4l5, imContacts, 0, 6));
                    if (c61899ORb.size() < 4) {
                        if (interfaceC65784Pro != null && (invoke = interfaceC65784Pro.invoke()) != null) {
                            list = C47261Igj.LJJIJ(new C4SA(invoke));
                        } else {
                            list = C61878OQg.INSTANCE;
                        }
                        c61899ORb.addAll(0, list);
                        break;
                    }
                    break;
                case 4:
                    if (interfaceC65784Pro != null && (invoke2 = interfaceC65784Pro.invoke()) != null) {
                        list2 = C47261Igj.LJJIJ(new C4SA(invoke2));
                    } else {
                        list2 = C61878OQg.INSTANCE;
                    }
                    c61899ORb.addAll(list2);
                    c61899ORb.addAll(C4L5.LIZ(c4l5, imContacts, 4 - c61899ORb.size(), 2));
                    break;
                case 5:
                    c61899ORb.addAll(C4L5.LIZ(c4l5, imContacts, 0, 6));
                    if (c61899ORb.size() < 4) {
                        if (interfaceC65784Pro2 != null && (invoke3 = interfaceC65784Pro2.invoke()) != null) {
                            list3 = C47261Igj.LJJIJ(new C4SA(invoke3));
                        } else {
                            list3 = C61878OQg.INSTANCE;
                        }
                        c61899ORb.addAll(0, list3);
                        break;
                    }
                    break;
                case 6:
                    if (interfaceC65784Pro2 != null && (invoke4 = interfaceC65784Pro2.invoke()) != null) {
                        list4 = C47261Igj.LJJIJ(new C4SA(invoke4));
                    } else {
                        list4 = C61878OQg.INSTANCE;
                    }
                    c61899ORb.addAll(list4);
                    c61899ORb.addAll(C4L5.LIZ(c4l5, imContacts, 4 - c61899ORb.size(), 2));
                    break;
            }
            c61899ORb.build();
            if (c61899ORb.isEmpty()) {
                C4L2.LIZ();
                return C76800UCe.LIZ;
            }
            XIF xif = EXV.LIZ;
            C4S5 c4s5 = new C4S5(this.LJLJI, c61899ORb, null);
            this.LJLIL = 1;
            if (XKX.LJI(xif, c4s5, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
