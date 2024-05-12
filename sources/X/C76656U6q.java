package X;

import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.U6q, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76656U6q<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ ConcurrentHashSet<String> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public C76656U6q(ConcurrentHashSet<String> concurrentHashSet, String str) {
        this.LJLIL = concurrentHashSet;
        this.LJLILLLLZI = str;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        R2P it = (R2P) obj;
        o.LJIIIZ(it, "it");
        return AbstractC73635Sv9.LJ(new C76655U6p(this.LJLIL, this.LJLILLLLZI, it));
    }
}
