package X;

import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class I4X {
    public final String LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;

    public /* synthetic */ I4X(InterfaceC62173Oaf interfaceC62173Oaf, I4Y i4y) {
        this.LJLIL = C16880lQ.LJLLJ(getClass());
        if (interfaceC62173Oaf != null) {
            if (i4y != null) {
                this.LJLILLLLZI = interfaceC62173Oaf;
                this.LJLJI = i4y;
                return;
            }
            throw new NullPointerException("View can not null");
        }
        throw new NullPointerException("Model can not null");
    }

    public /* synthetic */ I4X(Boolean bool, String photoDir, AqS173S0100000_7 aqS173S0100000_7) {
        o.LJIIIZ(photoDir, "photoDir");
        this.LJLIL = photoDir;
        this.LJLILLLLZI = bool;
        this.LJLJI = aqS173S0100000_7;
    }
}
