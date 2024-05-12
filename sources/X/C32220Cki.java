package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Cki, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32220Cki extends AbstractC65781Prl implements InterfaceC88472Yns<C32218Ckg, Boolean> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ List<C32218Ckg> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32220Cki(long j, List<C32218Ckg> list) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = list;
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C32218Ckg c32218Ckg) {
        C32218Ckg it = c32218Ckg;
        o.LJIIIZ(it, "it");
        it.LJFF.isCurrentRoom(this.LJLIL);
        return Boolean.valueOf(this.LJLILLLLZI.add(it));
    }
}
