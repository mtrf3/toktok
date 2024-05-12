package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import fjb.a;
import java.util.Iterator;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.feed.repository.ObservableValue$value$1", f = "NowFeedRepository.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2j2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66362j2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C3KA<Object> LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66362j2(C3KA<Object> c3ka, Object obj, InterfaceC67352kd<? super C66362j2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c3ka;
        this.LJLILLLLZI = obj;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C66362j2(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C3KA<Object> c3ka = this.LJLIL;
        ?? r2 = this.LJLILLLLZI;
        c3ka.LIZJ = r2;
        ConcurrentHashSet<Observer<Object>> concurrentHashSet = c3ka.LIZ;
        c3ka.getClass();
        Iterator<Observer<Object>> it = concurrentHashSet.iterator();
        while (it.hasNext()) {
            it.next().onChanged(r2);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
