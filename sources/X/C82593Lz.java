package X;

import fjb.a;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.sessionrefactor.mediator.InboxSessionMediator$notifyProcessorsTheLatestData$1", f = "InboxSessionMediator.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Lz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82593Lz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C82543Lu LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82593Lz(C82543Lu c82543Lu, InterfaceC67352kd<? super C82593Lz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c82543Lu;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C82593Lz(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : ((ConcurrentHashMap) this.LJLIL.LJLLL).entrySet()) {
            entry.getKey();
            linkedHashSet.addAll(((AbstractC82423Li) entry.getValue()).LIZIZ());
        }
        C82543Lu c82543Lu = this.LJLIL;
        for (C3MX c3mx : c82543Lu.LJLJL) {
            if (c3mx.LIZ() != C39N.INBOX || c82543Lu.LJLJJI) {
                c3mx.LIZIZ(ORZ.LLJI(linkedHashSet));
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
