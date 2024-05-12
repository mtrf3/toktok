package X;

import com.ss.android.ugc.feed.platform.componentmanager.data.GlobalComponentData;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import kotlin.jvm.internal.o;

/* renamed from: X.8Sh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211638Sh<T extends ComponentPriorityProtocol> implements Comparable<C211638Sh<T>> {
    public final T LJLIL;
    public final InterfaceC88471Ynr<T, Boolean, C76800UCe> LJLILLLLZI;
    public final GlobalComponentData LJLJI;
    public final int LJLJJI;
    public final Boolean LJLJJL;
    public String LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public Boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PriorityProtocolData(priorityProtocol=");
        LIZ.append(this.LJLIL);
        LIZ.append(", finish=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", priorityData=");
        LIZ.append(this.LJLJI);
        LIZ.append(", priorityIndex=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", needPending=");
        return C78920UyC.LIZIZ(LIZ, this.LJLJJL, ')', LIZ);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C211638Sh other = (C211638Sh) obj;
        o.LJIIIZ(other, "other");
        if (this.LJLJJI >= other.LJLJJI) {
            return 1;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        C211638Sh c211638Sh;
        T t = this.LJLIL;
        T t2 = null;
        if ((obj instanceof C211638Sh) && (c211638Sh = (C211638Sh) obj) != null) {
            t2 = c211638Sh.LJLIL;
        }
        return o.LJ(t, t2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C211638Sh(T priorityProtocol, InterfaceC88471Ynr<? super T, ? super Boolean, C76800UCe> finish, GlobalComponentData globalComponentData, int i, Boolean bool) {
        o.LJIIIZ(priorityProtocol, "priorityProtocol");
        o.LJIIIZ(finish, "finish");
        this.LJLIL = priorityProtocol;
        this.LJLILLLLZI = finish;
        this.LJLJI = globalComponentData;
        this.LJLJJI = i;
        this.LJLJJL = bool;
        this.LJLJJLL = "";
    }
}
