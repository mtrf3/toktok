package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.aOg, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93302aOg {
    public static final List<String> LIZ = new ArrayList();
    public static final List<String> LIZIZ = new ArrayList();
    public static final List<String> LIZJ = new ArrayList();
    public static final List<String> LIZLLL = new ArrayList();
    public static final List<String> LJ = new ArrayList();
    public static final ConcurrentHashMap<String, OSZ<Double, Integer>> LJFF = new ConcurrentHashMap<>();
    public static boolean LJI;
    public static boolean LJII;
    public static double LJIIIIZZ;
    public static double LJIIIZ;
    public static boolean LJIIJ;
    public static boolean LJIIJJI;

    public static boolean LIZ(String businessName) {
        OSZ<Double, Integer> osz;
        o.LJIIJ(businessName, "businessName");
        if (((ArrayList) LIZIZ).contains(businessName)) {
            return false;
        }
        if (!((ArrayList) LIZJ).contains(businessName) && (((osz = LJFF.get(businessName)) == null || osz.getSecond().intValue() != 2) && (LJIIIZ <= 0 || Math.random() >= LJIIIZ))) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(String businessName) {
        o.LJIIJ(businessName, "businessName");
        if (((ArrayList) LIZLLL).contains(businessName)) {
            return false;
        }
        if (!((ArrayList) LJ).contains(businessName) && (LJIIIIZZ <= 0 || Math.random() >= LJIIIIZZ)) {
            return false;
        }
        return true;
    }
}
