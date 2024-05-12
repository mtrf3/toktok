package X;

import com.ss.ugc.effectplatform.model.algorithm.ExtendedUrlModel;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XAS {
    public C1UD LIZ = new C1UD();
    public final C40601ia<String, ModelInfo> LIZIZ = new C40601ia<>(false);

    public final ExtendedUrlModel LIZ(String str) {
        Iterator it = ((ArrayList) this.LIZ.LIZJ()).iterator();
        while (it.hasNext()) {
            X9E x9e = (X9E) it.next();
            if (o.LJ(x9e.LIZ.getName(), str)) {
                return x9e.LIZ.getFile_url();
            }
        }
        throw new IllegalArgumentException(a1.LJ("modelName ", str, " doesn't exist"));
    }
}
