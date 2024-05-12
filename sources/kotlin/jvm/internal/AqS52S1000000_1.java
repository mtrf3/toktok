package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.InterfaceC88471Ynr;
import java.io.File;
import java.util.List;
import java.util.Map;
import ujb.s;

/* loaded from: classes2.dex */
public class AqS52S1000000_1 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public String s0;

    public static /* bridge */ /* synthetic */ Object invoke$0(AqS52S1000000_1 aqS52S1000000_1, Object obj, Object obj2) {
        return aqS52S1000000_1.invoke$0((Map) obj, (String) obj2);
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AqS52S1000000_1 aqS52S1000000_1, Object obj, Object obj2) {
        return aqS52S1000000_1.invoke$1((Map) obj, (String) obj2);
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AqS52S1000000_1 aqS52S1000000_1, Object obj, Object obj2) {
        return aqS52S1000000_1.invoke$2((Map) obj, (String) obj2);
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS52S1000000_1(String str, int i) {
        super(2);
        this.$t = i;
        this.s0 = str;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.String] */
    public final String invoke$0(Map<?, ?> map, String str) {
        o.LJIIJ(map, "map");
        o.LJIIJ(str, "<anonymous parameter 1>");
        ?? r2 = map.get(this.s0);
        if (r2 == 0 || !(r2 instanceof String)) {
            return null;
        }
        return r2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.String] */
    public final String invoke$1(Map<?, ?> map, String str) {
        o.LJIIJ(map, "map");
        o.LJIIJ(str, "<anonymous parameter 1>");
        ?? r2 = map.get(this.s0);
        if (r2 == 0 || !(r2 instanceof String)) {
            return null;
        }
        return r2;
    }

    public final List<? extends String> invoke$2(Map<?, ?> map, String str) {
        o.LJIIJ(map, "map");
        o.LJIIJ(str, "<anonymous parameter 1>");
        Object obj = map.get(this.s0);
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str2 = (String) obj;
        if (str2 == null) {
            return null;
        }
        String str3 = File.separator;
        o.LJFF(str3, "File.separator");
        return s.LJLJJL(str2, new String[]{str3}, 0, 6);
    }
}
