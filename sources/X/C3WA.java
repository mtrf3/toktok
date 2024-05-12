package X;

import fjb.a;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.core.RecentSharedSortManager$storeRecentSend$2", f = "RecentSharedSortManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3WA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3WA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C109544Rq LJLILLLLZI;
    public final /* synthetic */ C3WB LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3WA(C109544Rq c109544Rq, C3WB c3wb, InterfaceC67352kd<? super C3WA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c109544Rq;
        this.LJLJI = c3wb;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C3WA c3wa = new C3WA(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
        c3wa.LJLIL = obj;
        return c3wa;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String contactId;
        C141335gf.LIZJ(obj);
        Object obj2 = this.LJLIL;
        if (this.LJLILLLLZI.getConversationType() == AbstractC63505Ow9.LIZIZ) {
            contactId = this.LJLILLLLZI.getConversationId();
        } else {
            contactId = String.valueOf(C81273Gx.LIZLLL(this.LJLILLLLZI.getConversationId()));
        }
        synchronized (obj2) {
            ArrayList<String> arrayList = C3WB.LIZJ;
            if (arrayList.contains(contactId)) {
                arrayList.remove(contactId);
            }
            arrayList.add(0, contactId);
        }
        C3WD LJIJJLI = C86443aK.LIZIZ(EF7.LIZIZ()).LJIJJLI();
        C3WB c3wb = this.LJLJI;
        C109544Rq c109544Rq = this.LJLILLLLZI;
        c3wb.getClass();
        o.LJIIIZ(LJIJJLI, "<this>");
        if (LJIJJLI.LJ() >= 2000) {
            String LIZ = C3WB.LIZ();
            o.LJIIIIZZ(LIZ, "getCurrUid()");
            LJIJJLI.LJFF(LIZ);
        }
        long createdAt = c109544Rq.getCreatedAt();
        String LIZ2 = C3WB.LIZ();
        o.LJIIIIZZ(LIZ2, "getCurrUid()");
        o.LJIIIIZZ(contactId, "contactId");
        LJIJJLI.LIZIZ(createdAt, LIZ2, contactId);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
