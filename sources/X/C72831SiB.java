package X;

import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.SiB, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C72831SiB extends C79276V9k {
    public final W5P LJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72831SiB(String url, int i, int i2, V8L v8l) {
        super(null, i, i2, v8l);
        W5P LIZLLL = W5P.LIZLLL(UriProtector.parse(url));
        LIZLLL.LIZJ = new C79238V7y(i, i2);
        o.LJIIIZ(url, "url");
        this.LJ = LIZLLL;
    }
}
