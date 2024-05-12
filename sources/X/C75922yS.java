package X;

import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.notification.legacy.IMNotificationManager$updateReshowTimeWhenReshow$1$onIMNotificationShow$1", f = "IMNotificationManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2yS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75922yS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C112454bB LJLIL;
    public final /* synthetic */ java.util.Map<String, Integer> LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ C31Q LJLJJI;
    public final /* synthetic */ C75932yT LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75922yS(C112454bB c112454bB, java.util.Map<String, Integer> map, boolean z, C31Q c31q, C75932yT c75932yT, InterfaceC67352kd<? super C75922yS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c112454bB;
        this.LJLILLLLZI = map;
        this.LJLJI = z;
        this.LJLJJI = c31q;
        this.LJLJJL = c75932yT;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75922yS(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C63120Opw c63120Opw;
        String conversationId;
        C141335gf.LIZJ(obj);
        List<C771931f> list = this.LJLIL.LJIJJ;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (C771931f c771931f : list) {
                if (c771931f.LIZIZ == 10 && (c63120Opw = c771931f.LIZLLL) != null && (conversationId = c63120Opw.getConversationId()) != null) {
                    arrayList.add(conversationId);
                }
            }
            java.util.Map<String, Integer> map = this.LJLILLLLZI;
            boolean z = this.LJLJI;
            C31Q c31q = this.LJLJJI;
            C75932yT listener = this.LJLJJL;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String conversationId2 = (String) it.next();
                Integer num = map.get(conversationId2);
                if (num != null) {
                    int intValue = num.intValue();
                    if (!z) {
                        String value = String.valueOf(intValue + 1);
                        o.LJIIIZ(conversationId2, "conversationId");
                        o.LJIIIZ(value, "value");
                        C96413qP.LIZ.LIZLLL(conversationId2, value);
                    }
                    map.remove(conversationId2);
                    if (map.isEmpty()) {
                        C112444bA LJI = c31q.LJI();
                        synchronized (LJI) {
                            o.LJIIIZ(listener, "listener");
                            if (((ArrayList) LJI.LJ).contains(listener)) {
                                ((ArrayList) LJI.LJ).remove(listener);
                            }
                        }
                        return C76800UCe.LIZ;
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
