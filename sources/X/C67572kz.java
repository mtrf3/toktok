package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.common.MobClickConsentHelper$getPendingEvents$2", f = "MobClickConsentHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2kz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67572kz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<C67602l2>>, Object> {
    public C67572kz(InterfaceC67352kd<? super C67572kz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C67572kz(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        String[] array = C67612l3.LIZ.getStringArray("pending_events", new String[0]);
        o.LJIIIIZZ(array, "array");
        ArrayList arrayList = new ArrayList(array.length);
        for (String str : array) {
            arrayList.add(C75792yF.LIZ(str, C67602l2.class));
        }
        return ORZ.LLJILJILJ(arrayList);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<C67602l2>> interfaceC67352kd) {
        return new C67572kz(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
