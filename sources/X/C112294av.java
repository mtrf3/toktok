package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.4av, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112294av {
    public final EnumC112364b2 LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Integer LJ;

    public final java.util.Map<String, String> LIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        EnumC112364b2 enumC112364b2 = this.LIZ;
        if (enumC112364b2 != null) {
            linkedHashMap.put("position", enumC112364b2.getValue());
        }
        String str = this.LIZIZ;
        if (str != null) {
            linkedHashMap.put("to_user_id", str);
        }
        String str2 = this.LIZJ;
        if (str2 != null) {
            linkedHashMap.put("enter_from", str2);
        }
        String str3 = this.LIZLLL;
        if (str3 != null) {
            linkedHashMap.put("page_to_enter", str3);
        }
        Integer num = this.LJ;
        if (num != null) {
            num.intValue();
            linkedHashMap.put("rank_index", this.LJ.toString());
        }
        return linkedHashMap;
    }

    public C112294av(C107724Kq builder) {
        o.LJIIIZ(builder, "builder");
        this.LIZ = builder.LIZIZ;
        this.LIZIZ = builder.LIZJ;
        this.LIZJ = builder.LIZLLL;
        this.LIZLLL = builder.LJ;
        this.LJ = builder.LJFF;
    }
}
