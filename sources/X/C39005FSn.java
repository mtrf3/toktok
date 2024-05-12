package X;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.FSn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39005FSn {
    public boolean LIZ;
    public List<FSY> LIZIZ;
    public List<String> LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;

    public C39005FSn() {
        List<FSY> emptyList = Collections.emptyList();
        C39001FSj.LIZ(emptyList);
        this.LIZIZ = emptyList;
        List<String> emptyList2 = Collections.emptyList();
        C39001FSj.LIZ(emptyList2);
        this.LIZJ = emptyList2;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.LIZLLL = timeUnit.toMillis(5L);
        this.LJ = timeUnit.toMillis(5L);
        this.LJFF = timeUnit.toMillis(15L);
    }
}
