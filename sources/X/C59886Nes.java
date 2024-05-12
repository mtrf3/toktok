package X;

import android.util.LruCache;
import java.lang.ref.SoftReference;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.Nes, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C59886Nes {
    public boolean LIZLLL;
    public boolean LJ;
    public String LIZ = "";
    public int LIZIZ = 8;
    public int LIZJ = 3;
    public InterfaceC88471Ynr<? super String, ? super String, Boolean> LJFF = ALD.LJLIL;
    public final LruCache<String, LinkedList<SoftReference<InterfaceC60831Nu7>>> LJI = new LruCache<>(this.LIZIZ);
    public String LJII = "";

    public int LIZ() {
        return 0;
    }

    public final void LIZIZ(InterfaceC88471Ynr<? super String, ? super String, Boolean> interfaceC88471Ynr) {
        o.LJIIJ(interfaceC88471Ynr, "<set-?>");
        this.LJFF = interfaceC88471Ynr;
    }
}
