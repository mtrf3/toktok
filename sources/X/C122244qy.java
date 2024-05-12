package X;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.4qy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C122244qy extends C122024qc {
    public static final /* synthetic */ InterfaceC74236TBo[] LJIILIIL;
    public final C134635Qd LJIIJJI;
    public String LJIIL;

    static {
        TBV tbv = new TBV(C122244qy.class, "color", "getColor()I", 0);
        C65352Pkq.LIZ.getClass();
        LJIILIIL = new InterfaceC74236TBo[]{tbv};
    }

    public C122244qy() {
        this(null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.5Qd] */
    public C122244qy(String str) {
        super(EnumC121564ps.TEXT);
        this.LJIIL = str;
        final int i = -1;
        this.LJIIJJI = new AbstractC214518bP<Integer>(i) { // from class: X.5Qd
            @Override // X.AbstractC214518bP
            public final void LIZJ(InterfaceC74236TBo<?> property, Integer num, Integer num2) {
                o.LJIIIZ(property, "property");
                int intValue = num2.intValue();
                num.intValue();
                String str2 = this.LJIIL;
                if (str2 == null || str2.length() == 0) {
                    this.LJIIL = "{}";
                }
                C122244qy c122244qy = this;
                JSONObject jSONObject = new JSONObject(this.LJIIL);
                this.getClass();
                List LJJIJIIJI = C47261Igj.LJJIJIIJI(Integer.valueOf(Color.red(intValue)), Integer.valueOf(Color.green(intValue)), Integer.valueOf(Color.blue(intValue)), Integer.valueOf(Color.alpha(intValue)));
                ArrayList arrayList = new ArrayList(C32I.LJJL(LJJIJIIJI, 10));
                Iterator it = LJJIJIIJI.iterator();
                while (it.hasNext()) {
                    arrayList.add(Double.valueOf(((Number) it.next()).intValue() / 255.0d));
                }
                c122244qy.LJIIL = jSONObject.put("textColor", new JSONArray((Collection) arrayList)).toString();
            }
        };
    }
}
