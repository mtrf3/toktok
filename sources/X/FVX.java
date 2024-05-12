package X;

import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class FVX implements Callable {
    public final String LJLIL;
    public final JSONObject LJLILLLLZI;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        FMX.LJIILJJIL(this.LJLIL, this.LJLILLLLZI);
        FVJ.LIZIZ(this.LJLIL, System.currentTimeMillis(), this.LJLILLLLZI);
        return null;
    }

    public FVX(String str, JSONObject jSONObject) {
        this.LJLIL = str;
        this.LJLILLLLZI = jSONObject;
    }
}
