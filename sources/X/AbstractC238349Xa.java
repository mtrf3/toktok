package X;

import Y.ARunnableS40S0100000_4;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.9Xa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC238349Xa {
    public static final ExecutorService LIZ;

    public static String LIZJ(boolean z) {
        return z ? "1" : CardStruct.IStatusCode.DEFAULT;
    }

    public abstract String LIZ();

    public abstract java.util.Map<String, String> LIZIZ();

    static {
        ExecutorService LJFF = C38995FSd.LJFF();
        o.LJIIIIZZ(LJFF, "getSerialExecutor()");
        LIZ = LJFF;
    }

    public final void LIZLLL(String str) {
        LIZ.execute(new ARunnableS40S0100000_4(this, str, 110));
    }
}
