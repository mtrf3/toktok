package X;

import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.consistency.ConsistencyGroupStruct;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.HashMap;

/* renamed from: X.2Zg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60562Zg {
    public static HashMap<Long, ConsistencyGroupStruct> LIZ(String str, HashMap<Long, ConsistencyGroupStruct> hashMap) {
        if (str == null) {
            return hashMap;
        }
        try {
            return (HashMap) GsonHolder.LIZLLL().LIZ().LJII(str, new TypeToken<HashMap<Long, ConsistencyGroupStruct>>() { // from class: X.2Zh
            }.getType());
        } catch (Throwable unused) {
            return hashMap;
        }
    }
}
