package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.sessionrefactor.mediator.InboxSessionMediator$handleSingleVOUpdateOperationCallback$1$1", f = "InboxSessionMediator.kt", l = {507}, m = "invokeSuspend")
/* renamed from: X.3Lx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82573Lx extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C82543Lu LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82573Lx(C82543Lu c82543Lu, InterfaceC67352kd<? super C82573Lx> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c82543Lu;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C82573Lx(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List arrayList;
        boolean z;
        C3MD c3md;
        String str;
        InterfaceC82723Mm interfaceC82723Mm;
        InterfaceC82723Mm interfaceC82723Mm2;
        List<C3ML> list;
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
            this.LJLILLLLZI.getClass();
            long j = C3KQ.LIZ().inboxMediatorDebounceTimeMs;
            this.LJLIL = 1;
            if (C1JD.LIZJ(j, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLILLLLZI.getClass();
        C82543Lu.LJIILJJIL(null).LIZLLL(EnumC81823Ja.INBOX_MEDIATOR, C3JU.SESSION_UPDATE);
        C3MD LJJZZIII = this.LJLILLLLZI.LJIIIZ().LJJZZIII();
        if (LJJZZIII != null && (list = LJJZZIII.LIZ) != null) {
            arrayList = ORZ.LLJILJILJ(list);
        } else {
            arrayList = new ArrayList();
        }
        if (LJJZZIII != null) {
            z = LJJZZIII.LIZIZ;
        } else {
            z = false;
        }
        for (Map.Entry entry : ((LinkedHashMap) this.LJLILLLLZI.LJLLLLLL).entrySet()) {
            Object key = entry.getKey();
            InterfaceC82853Mz interfaceC82853Mz = (InterfaceC82853Mz) entry.getValue();
            Iterator it = arrayList.iterator();
            int i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    Object obj2 = ((C3ML) it.next()).LJLJJL;
                    if ((obj2 instanceof InterfaceC82723Mm) && (interfaceC82723Mm2 = (InterfaceC82723Mm) obj2) != null) {
                        str = interfaceC82723Mm2.getSessionId();
                    } else {
                        str = null;
                    }
                    if (o.LJ(str, key)) {
                        if (i2 >= 0) {
                            Object obj3 = ((C3ML) ListProtector.get(arrayList, i2)).LJLJJL;
                            if ((obj3 instanceof InterfaceC82723Mm) && (interfaceC82723Mm = (InterfaceC82723Mm) obj3) != null) {
                                C3ML c3ml = (C3ML) ListProtector.get(arrayList, i2);
                                InterfaceC82723Mm original = interfaceC82723Mm.copyData();
                                interfaceC82853Mz.LIZJ(original);
                                int i3 = c3ml.LJLIL;
                                long j2 = c3ml.LJLILLLLZI;
                                int i4 = c3ml.LJLJI;
                                boolean z2 = c3ml.LJLJJI;
                                o.LJIIIZ(original, "original");
                                ListProtector.set(arrayList, i2, new C3ML(i3, j2, i4, z2, original));
                            }
                        }
                    } else {
                        i2++;
                    }
                }
            }
        }
        ((LinkedHashMap) this.LJLILLLLZI.LJLLLLLL).clear();
        if (LJJZZIII != null) {
            c3md = C3MD.LIZ(LJJZZIII, arrayList, z, false, 60);
        } else {
            c3md = new C3MD((List) null, false, 0, 0, 0, 63);
        }
        this.LJLILLLLZI.LJIIIZ().onNext(c3md);
        this.LJLILLLLZI.LJLLLL = null;
        this.LJLILLLLZI.getClass();
        C82543Lu.LJIILJJIL(null).LIZIZ(EnumC81823Ja.INBOX_MEDIATOR, C3JU.SESSION_UPDATE);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
