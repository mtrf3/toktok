package X;

import Y.ARunnableS42S0100000_6;
import android.os.Looper;
import com.ss.android.ugc.aweme.keva.KevaInfo;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.FFe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38658FFe {
    public boolean LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final java.util.Set<KevaInfo> LIZJ = new LinkedHashSet();
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public final C62822Ol8 LJ = C221108m2.LIZIZ(new AqS156S0100000_6(this, 132));

    public abstract String LIZ();

    public abstract boolean LIZIZ();

    public static void LIZJ(InterfaceC65784Pro interfaceC65784Pro) {
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            if (((Boolean) C34668Dj6.LJI.getValue()).booleanValue()) {
                C38995FSd.LIZLLL().execute(new ARunnableS42S0100000_6(interfaceC65784Pro, 121));
                return;
            } else {
                C38995FSd.LJFF().execute(new ARunnableS42S0100000_6(interfaceC65784Pro, 121));
                return;
            }
        }
        interfaceC65784Pro.invoke();
    }
}
