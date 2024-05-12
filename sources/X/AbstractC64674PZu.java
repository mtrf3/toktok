package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import ee1.m;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.PZu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC64674PZu extends AbstractC64677PZx {
    public boolean LJIILJJIL;

    public abstract EnumC64675PZv LJI(m mVar, String str, List<String> list);

    public abstract int LJII();

    public abstract boolean LJIIIIZZ(List list, JSONObject jSONObject);

    static {
        C16880lQ.LJLLJ(AbstractC64674PZu.class);
    }

    @Override // X.AbstractC64677PZx
    public final boolean LIZIZ(String str, long j, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        ListProtector.add(arrayList, 0, Boolean.FALSE);
        boolean LJIIIIZZ = LJIIIIZZ(arrayList, jSONObject);
        this.LJIILJJIL = ((Boolean) ListProtector.get(arrayList, 0)).booleanValue();
        return LJIIIIZZ;
    }
}
