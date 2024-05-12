package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.E0y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C35740E0y extends LinkedHashMap<String, SimVideoUrlModel> {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry<String, SimVideoUrlModel> entry) {
        if (size() > 30) {
            return true;
        }
        return false;
    }
}
