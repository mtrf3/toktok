package X;

import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.ttvideoengine.DataLoaderHelper;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ieh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C47135Ieh implements InterfaceC47125IeX {
    @Override // X.InterfaceC47125IeX
    public Object apply(Object obj) {
        String str = (String) obj;
        DataLoaderHelper dataLoaderHelper = C47148Ieu.LIZ;
        long j = 0;
        if (dataLoaderHelper.LIZJ == 0) {
            dataLoaderHelper.LJJ.LIZJ(1);
            try {
                AVMDLDataLoader aVMDLDataLoader = dataLoaderHelper.LJIIIZ;
                if (aVMDLDataLoader != null) {
                    long quickQueryCacheSize = aVMDLDataLoader.quickQueryCacheSize(str);
                    if (quickQueryCacheSize > 0) {
                        j = quickQueryCacheSize;
                    }
                }
            } catch (Throwable unused) {
            }
            dataLoaderHelper.LJJ.LJ(1);
        }
        return new C46907Ib1(str, 0L, j);
    }

    public static int LIZ(int i, int i2) {
        return i2 - O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(i)));
    }

    public static Iterator LIZLLL(ConcurrentHashMap concurrentHashMap, String str) {
        Collection values = concurrentHashMap.values();
        o.LJIIIIZZ(values, str);
        return values.iterator();
    }

    public static String LIZJ(AtomicInteger atomicInteger, StringBuilder sb, StringBuilder sb2) {
        sb.append(atomicInteger.getAndIncrement());
        return X1D.LIZIZ(sb2);
    }

    public static String LIZIZ(StringBuilder sb, long j, char c, StringBuilder sb2) {
        sb.append(j);
        sb.append(c);
        return X1D.LIZIZ(sb2);
    }

    public static JSONObject LJ(String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(str, str2);
        jSONObject.put(str3, str4);
        return jSONObject;
    }
}
