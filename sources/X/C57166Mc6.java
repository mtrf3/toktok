package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Mc6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57166Mc6 {
    public final EnumC57165Mc5 LIZ;
    public final String LIZIZ;
    public final C62822Ol8 LIZJ;
    public EnumC56648MLc LIZLLL;

    public final Keva LIZIZ() {
        return (Keva) this.LIZJ.getValue();
    }

    public final String LIZ(String str) {
        return this.LIZ.asRepoKey(str);
    }

    public C57166Mc6(EnumC57165Mc5 type, String str) {
        o.LJIIIZ(type, "type");
        this.LIZ = type;
        this.LIZIZ = str;
        this.LIZJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 855));
        this.LIZLLL = EnumC56648MLc.GONE;
    }
}
