package X;

import android.view.View;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.Jd8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49586Jd8 implements InterfaceC80653En, Serializable {
    public static final C49588JdA Companion = new C49588JdA();
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final Integer LJLJI;
    public final Boolean LJLJJI;
    public final String LJLJJL;

    /* JADX WARN: Multi-variable type inference failed */
    public C49586Jd8() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ C49586Jd8 copy$default(C49586Jd8 c49586Jd8, String str, String str2, Integer num, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c49586Jd8.LJLIL;
        }
        if ((i & 2) != 0) {
            str2 = c49586Jd8.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            num = c49586Jd8.LJLJI;
        }
        if ((i & 8) != 0) {
            bool = c49586Jd8.LJLJJI;
        }
        return c49586Jd8.copy(str, str2, num, bool);
    }

    public final C49586Jd8 copy(String str, String str2, Integer num, Boolean bool) {
        return new C49586Jd8(str, str2, num, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49586Jd8)) {
            return false;
        }
        C49586Jd8 c49586Jd8 = (C49586Jd8) obj;
        return o.LJ(this.LJLIL, c49586Jd8.LJLIL) && o.LJ(this.LJLILLLLZI, c49586Jd8.LJLILLLLZI) && o.LJ(this.LJLJI, c49586Jd8.LJLJI) && o.LJ(this.LJLJJI, c49586Jd8.LJLJJI);
    }

    public int hashCode() {
        String str = this.LJLIL;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.LJLJI;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.LJLJJI;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchItemSource(implId=");
        LIZ.append(this.LJLIL);
        LIZ.append(", enterFrom=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", rankInList=");
        LIZ.append(this.LJLJI);
        LIZ.append(", isInMixSearch=");
        return C78920UyC.LIZIZ(LIZ, this.LJLJJI, ')', LIZ);
    }

    public final String getEnterFrom() {
        return this.LJLILLLLZI;
    }

    public final String getImplId() {
        return this.LJLIL;
    }

    public final Integer getRankInList() {
        return this.LJLJI;
    }

    public String getSourceId() {
        return this.LJLJJL;
    }

    public final Boolean isInMixSearch() {
        return this.LJLJJI;
    }

    public static final C49586Jd8 fetchOwnSource(View view) {
        InterfaceC55251LmJ LIZLLL;
        Companion.getClass();
        if (view != null && (LIZLLL = C55247LmF.LIZLLL(C55230Lly.LJ(view), C49586Jd8.class, "source_default_key")) != null) {
            return (C49586Jd8) LIZLLL.getSource();
        }
        return null;
    }

    public static final void bindSource(View view, C49586Jd8 source) {
        Companion.getClass();
        o.LJIIIZ(source, "source");
        if (view == null) {
            return;
        }
        C55247LmF.LIZIZ(C55230Lly.LJ(view), source, C49586Jd8.class, "source_default_key");
    }

    public C49586Jd8(String str, String str2, Integer num, Boolean bool) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = num;
        this.LJLJJI = bool;
        this.LJLJJL = AnonymousClass629.LIZ("randomUUID().toString()");
    }

    public /* synthetic */ C49586Jd8(String str, String str2, Integer num, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? -1 : num, (i & 8) != 0 ? Boolean.FALSE : bool);
    }
}
