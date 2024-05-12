package X;

import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.5Wb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class CallableC136175Wb<V> implements Callable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public CallableC136175Wb(int i, String str, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        for (int i = 0; i < this.LJLIL; i++) {
            String str = this.LJLILLLLZI;
            int i2 = this.LJLJI;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (int i3 = 0; i3 < i2; i3++) {
                String LIZ = AnonymousClass629.LIZ("randomUUID().toString()");
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(UUID.randomUUID());
                stringBuffer.append(UUID.randomUUID());
                stringBuffer.append(UUID.randomUUID());
                stringBuffer.append(UUID.randomUUID());
                String stringBuffer2 = stringBuffer.toString();
                o.LJIIIIZZ(stringBuffer2, "sb.toString()");
                linkedHashMap.put(LIZ, stringBuffer2);
                String uuid = UUID.randomUUID().toString();
                o.LJIIIIZZ(uuid, "randomUUID().toString()");
                linkedHashMap.put(uuid, String.valueOf(new Random().nextInt(ImagePreloadExperiment.PRIORITY_DEFAULT)));
            }
            FMX.LJIIL(str, linkedHashMap);
        }
        return C76800UCe.LIZ;
    }
}
