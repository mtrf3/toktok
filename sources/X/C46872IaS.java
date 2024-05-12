package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.IaS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46872IaS {
    public final List<SimVideoUrlModel> LIZ = new CopyOnWriteArrayList();
    public final java.util.Map<String, SimVideoUrlModel> LIZIZ = new ConcurrentHashMap();
    public final java.util.Map<String, SimVideoUrlModel> LIZJ = new ConcurrentHashMap();

    static {
        new C46872IaS();
    }
}
