package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS49S1200000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.2i8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65802i8 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ Object LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Map.Entry<Object, Object> LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<String, String> LJLJJI;
    public final /* synthetic */ Iterator<Map.Entry<Object, Object>> LJLJJL;
    public final /* synthetic */ List<OSZ<Object, Object>> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65802i8(Object obj, Object obj2, Map.Entry entry, AqS49S1200000_7 aqS49S1200000_7, Iterator it, List list) {
        super(0);
        this.LJLIL = obj;
        this.LJLILLLLZI = obj2;
        this.LJLJI = entry;
        this.LJLJJI = aqS49S1200000_7;
        this.LJLJJL = it;
        this.LJLJJLL = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        Object obj;
        Object obj2;
        Object obj3 = this.LJLILLLLZI;
        Object value = this.LJLJI.getValue();
        if (obj3 instanceof String) {
            obj = this.LJLJJI.invoke(obj3);
        } else {
            obj = obj3;
        }
        if (value instanceof String) {
            obj2 = this.LJLJJI.invoke(value);
        } else {
            obj2 = value;
        }
        if (!o.LJ(obj3, obj)) {
            this.LJLJJL.remove();
        }
        if (!o.LJ(obj3, obj) || !o.LJ(value, obj2)) {
            this.LJLJJLL.add(new OSZ<>(obj, obj2));
        }
        return C76800UCe.LIZ;
    }
}
