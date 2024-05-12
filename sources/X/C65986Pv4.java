package X;

import com.bytedance.helios.statichook.config.ApiHookConfig;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Pv4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65986Pv4 {
    public static final HashMap<String, Integer> LIZ = new HashMap<>(ApiHookConfig.LIZIZ.size());
    public static final HashMap<Integer, C65955PuZ> LIZIZ = new HashMap<>(ApiHookConfig.LIZIZ.size());
    public static final java.util.Set<Integer> LIZJ = C77275UUl.LJIIIIZZ(100106, 100205, 100404, 100405, 200000, 200001, 200002, 200004, 100496, 100497, 100498, 100499);
    public static final List<C65955PuZ> LIZLLL = C47261Igj.LJJIJIIJI(new C65955PuZ(200000, null, "Location", "loc", null, 0, C47261Igj.LJJIJ("location"), null, 370), new C65955PuZ(200001, null, "Location", "loc", null, 0, C47261Igj.LJJIJ("location"), null, 370), new C65955PuZ(200002, null, "Location", "loc", null, 0, C47261Igj.LJJIJ("location"), null, 370), new C65955PuZ(200004, null, "Location", "loc", null, 0, C47261Igj.LJJIJ("location"), null, 370), new C65955PuZ(100496, null, "NativeAudioRecord", "nar", null, 0, C47261Igj.LJJIJ("audio"), null, 370), new C65955PuZ(100497, null, "NativeAudioRecord", "nar", null, 0, C47261Igj.LJJIJ("audio"), null, 370), new C65955PuZ(100498, null, "NativeAudioRecord", "nar", null, 0, C47261Igj.LJJIJ("audio"), null, 370), new C65955PuZ(100499, null, "NativeAudioRecord", "nar", null, 0, C47261Igj.LJJIJ("audio"), null, 370));

    static {
        for (C65987Pv5 apiHookDef : ApiHookConfig.LIZIZ.values()) {
            o.LJIIIIZZ(apiHookDef, "apiHookDef");
            int i = apiHookDef.LIZ;
            if (!LIZJ.contains(Integer.valueOf(i))) {
                HashMap<Integer, C65955PuZ> hashMap = LIZIZ;
                Integer valueOf = Integer.valueOf(i);
                String str = apiHookDef.LIZIZ;
                o.LJIIIIZZ(str, "apiHookDef.abstractOfApi");
                String str2 = apiHookDef.LIZLLL;
                o.LJIIIIZZ(str2, "apiHookDef.resourceName");
                String str3 = apiHookDef.LIZJ;
                o.LJIIIIZZ(str3, "apiHookDef.resourceId");
                int i2 = apiHookDef.LJFF;
                String[] strArr = apiHookDef.LJ;
                o.LJIIIIZZ(strArr, "apiHookDef.permissions");
                String[] strArr2 = apiHookDef.LJI;
                o.LJIIIIZZ(strArr2, "apiHookDef.dataTypes");
                List LJJZZIII = ORY.LJJZZIII(strArr2);
                String str4 = apiHookDef.LJIIIZ;
                o.LJIIIIZZ(str4, "apiHookDef.invokeType");
                hashMap.put(valueOf, new C65955PuZ(i, str, str2, str3, strArr, i2, LJJZZIII, str4, 64));
                HashMap<String, Integer> hashMap2 = LIZ;
                String str5 = apiHookDef.LIZIZ;
                o.LJIIIIZZ(str5, "apiHookDef.abstractOfApi");
                hashMap2.put(str5, Integer.valueOf(i));
            } else {
                throw new IllegalArgumentException(C0NY.LIZIZ("Sensitive API Monitor Business use ", i, " as a virtual API ID. Please reconfigure a new ID."));
            }
        }
        for (C65955PuZ c65955PuZ : LIZLLL) {
            LIZIZ.put(Integer.valueOf(c65955PuZ.LIZ), c65955PuZ);
        }
    }

    public static C65955PuZ LIZ(int i) {
        HashMap<Integer, C65955PuZ> hashMap = LIZIZ;
        switch (i) {
            case 100106:
                i = 100101;
                break;
            case 100205:
                i = 100201;
                break;
            case 100404:
                i = 100401;
                break;
            case 100405:
                i = 100403;
                break;
        }
        return hashMap.get(Integer.valueOf(i));
    }
}
