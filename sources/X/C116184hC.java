package X;

import Y.AObserverS62S0300000_1;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.inbox.skylight.plat.processor.SkylightDMModule$bindDMObservers$1", f = "SkylightDMModule.kt", l = {213}, m = "invokeSuspend")
/* renamed from: X.4hC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116184hC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C116194hD LJLILLLLZI;
    public final /* synthetic */ ArrayList<C116144h8> LJLJI;
    public final /* synthetic */ C72808Sho<InterfaceC57784Mm4> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C116184hC(C116194hD c116194hD, ArrayList<C116144h8> arrayList, C72808Sho<InterfaceC57784Mm4> c72808Sho, InterfaceC67352kd<? super C116184hC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c116194hD;
        this.LJLJI = arrayList;
        this.LJLJJI = c72808Sho;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C116184hC(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

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
            long j = this.LJLILLLLZI.LJIILIIL;
            this.LJLIL = 1;
            if (C1JD.LIZJ(j, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLILLLLZI.LJIIIZ();
        this.LJLILLLLZI.LJIIJ.set(0);
        Iterator<C116144h8> it = this.LJLJI.iterator();
        while (it.hasNext()) {
            C116144h8 item = it.next();
            C116194hD c116194hD = this.LJLILLLLZI;
            o.LJIIIIZZ(item, "item");
            ArrayList<C116144h8> arrayList = this.LJLJI;
            C3B2 c3b2 = (C3B2) c116194hD.LJII.getValue();
            String uid = item.LJLIL.getUid();
            o.LJIIIIZZ(uid, "item.contact.uid");
            LiveData<ActivityStatus> LIZ = C3B3.LIZ(c3b2, uid, C3BA.INBOX, EnumC112364b2.INBOX_TOP.getValue(), 2);
            LIZ.observe(c116194hD.LIZLLL, new AObserverS62S0300000_1(c116194hD, item, arrayList, 2));
            CopyOnWriteArrayList<LiveData<ActivityStatus>> copyOnWriteArrayList = c116194hD.LJIILJJIL.get(Integer.valueOf(c116194hD.LJI()));
            if (copyOnWriteArrayList == null) {
                c116194hD.LJIILJJIL.put(Integer.valueOf(c116194hD.LJI()), new CopyOnWriteArrayList<>());
                copyOnWriteArrayList = c116194hD.LJIILJJIL.get(Integer.valueOf(c116194hD.LJI()));
                if (copyOnWriteArrayList == null) {
                    this.LJLILLLLZI.LJIIIIZZ(item);
                }
            }
            copyOnWriteArrayList.add(LIZ);
            this.LJLILLLLZI.LJIIIIZZ(item);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
