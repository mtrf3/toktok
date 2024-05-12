package X;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* renamed from: X.1vW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48621vW extends AbstractC014804a implements InterfaceC41461jy {
    public static final AtomicInteger LJLJI = new AtomicInteger(0);
    public final C1JY LJLILLLLZI;

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ boolean I(InterfaceC88472Yns interfaceC88472Yns) {
        return C48263Iwt.LIZ(this, interfaceC88472Yns);
    }

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh interfaceC07790Sh) {
        return C07780Sg.LIZ(this, interfaceC07790Sh);
    }

    public final int hashCode() {
        return this.LJLILLLLZI.hashCode();
    }

    @Override // X.InterfaceC41461jy
    public final C1JY LJJJJ() {
        return this.LJLILLLLZI;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C48621vW) && o.LJ(this.LJLILLLLZI, ((C48621vW) obj).LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48621vW(boolean z, InterfaceC88472Yns properties, InterfaceC88472Yns inspectorInfo) {
        super(inspectorInfo);
        o.LJIIIZ(properties, "properties");
        o.LJIIIZ(inspectorInfo, "inspectorInfo");
        C1JY c1jy = new C1JY();
        c1jy.LJLILLLLZI = z;
        c1jy.LJLJI = false;
        properties.invoke(c1jy);
        this.LJLILLLLZI = c1jy;
    }
}
