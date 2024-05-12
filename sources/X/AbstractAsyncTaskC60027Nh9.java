package X;

import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: X.Nh9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractAsyncTaskC60027Nh9 extends AbstractAsyncTaskC60035NhH {
    public final HashSet<String> LIZJ;
    public final JSONObject LIZLLL;
    public final long LJ;

    public AbstractAsyncTaskC60027Nh9(C60038NhK c60038NhK, HashSet hashSet, JSONObject jSONObject, long j) {
        super(c60038NhK);
        this.LIZJ = new HashSet<>(hashSet);
        this.LIZLLL = jSONObject;
        this.LJ = j;
    }
}
