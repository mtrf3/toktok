package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.GqZ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42775GqZ {
    public final String LIZ;
    public final Keva LIZIZ;

    public C42775GqZ(String name) {
        o.LJIIIZ(name, "name");
        this.LIZ = name;
        this.LIZIZ = Keva.getRepo(name);
    }
}
