package X;

import Y.IDComparatorS29S0000000_1;
import android.os.SystemClock;
import fjb.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.notification.legacy.IMNotificationManager$tryReshowLatestUnreadConversationsAsInnerPush$1", f = "IMNotificationManager.kt", l = {446}, m = "invokeSuspend")
/* renamed from: X.2yY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75982yY extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C31Q LJLILLLLZI;
    public final /* synthetic */ List<C63120Opw> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C75982yY(C31Q c31q, List<? extends C63120Opw> list, InterfaceC67352kd<? super C75982yY> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c31q;
        this.LJLJI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75982yY(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List<C63120Opw> LLILII;
        int i;
        Integer LJJIL;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLIL;
        if (i2 != 0) {
            if (i2 == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            this.LJLILLLLZI.LJIIL = SystemClock.elapsedRealtime() - FKB.LIZJ;
            long longValue = ((Number) this.LJLILLLLZI.LIZIZ.getValue()).longValue();
            this.LJLIL = 1;
            if (C1JD.LIZJ(longValue, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if ((!C84763XOl.LJIIL && C84763XOl.LJIIJJI) || this.LJLILLLLZI.LJI().LJII) {
            return C76800UCe.LIZ;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        List<C63120Opw> list = this.LJLJI;
        if (list != null && (LLILII = ORZ.LLILII(new IDComparatorS29S0000000_1(26), list)) != null) {
            for (C63120Opw c63120Opw : LLILII) {
                C771931f.LJI.getClass();
                if (C773631w.LIZ(c63120Opw)) {
                    String conversationId = c63120Opw.getConversationId();
                    o.LJIIIIZZ(conversationId, "it.conversationId");
                    String LIZJ = C96413qP.LIZ.LIZJ(conversationId);
                    if (LIZJ != null && (LJJIL = C38350F3i.LJJIL(LIZJ)) != null) {
                        i = LJJIL.intValue();
                        if (i >= 6) {
                            continue;
                        }
                    } else {
                        i = 0;
                    }
                    arrayList.add(c63120Opw);
                    String conversationId2 = c63120Opw.getConversationId();
                    o.LJIIIIZZ(conversationId2, "it.conversationId");
                    linkedHashMap.put(conversationId2, new Integer(i));
                    if (arrayList.size() == 10) {
                        break;
                    }
                }
            }
        }
        if (this.LJLILLLLZI.LIZLLL(10, arrayList)) {
            final C31Q c31q = this.LJLILLLLZI;
            c31q.LJI().LIZ(new InterfaceC76042ye() { // from class: X.2yT
                @Override // X.InterfaceC76042ye
                public final void LIZ(C112454bB notificationContent, boolean z) {
                    o.LJIIIZ(notificationContent, "notificationContent");
                    C31Q.this.getClass();
                    XKX.LIZLLL(C48841JEv.LIZ(C31Q.LJIIIIZZ()), null, null, new C75922yS(notificationContent, linkedHashMap, z, C31Q.this, this, null), 3);
                }
            });
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            C31Q c31q2 = this.LJLILLLLZI;
            C31Q.LJIIL(c31q2, Math.max((c31q2.LJFF() - ((Number) this.LJLILLLLZI.LIZIZ.getValue()).longValue()) - elapsedRealtime2, 0L), 2);
        }
        this.LJLILLLLZI.LJIIIZ(10, elapsedRealtime);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
