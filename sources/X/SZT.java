package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SZT extends F9E {
    public static final java.util.Map<SZY, InterfaceC88473Ynt<AbstractC72298SZa, SZP, Object, AbstractC72298SZa>> LJLJI;
    public final AbstractC72298SZa LJLIL;
    public final AbstractC72298SZa LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(SZY.Loading, SZW.LJLIL);
        linkedHashMap.put(SZY.Loaded, SZU.LJLIL);
        linkedHashMap.put(SZY.Error, SZV.LJLIL);
        linkedHashMap.put(SZY.End, SZX.LJLIL);
        LJLJI = linkedHashMap;
    }

    public /* synthetic */ SZT() {
        this(new C72305SZh(SZP.Prev), new C72305SZh(SZP.Next));
    }

    public SZT(AbstractC72298SZa prev, AbstractC72298SZa next) {
        o.LJIIIZ(prev, "prev");
        o.LJIIIZ(next, "next");
        this.LJLIL = prev;
        this.LJLILLLLZI = next;
    }
}
