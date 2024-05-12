package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.AqS44S0001000_6;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class FBA {
    public static FB9 LIZ;
    public static volatile Integer LIZIZ;
    public static final FBA LIZJ = new FBA();

    public final synchronized void LIZ(int i) {
        InterfaceC60761Nsz LJI;
        C60737Nsb c60737Nsb;
        Integer num = LIZIZ;
        if (num != null && i == num.intValue()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("networkLevel", i);
            LinkedList linkedList = new LinkedList();
            try {
                SparkContext.Companion.getClass();
                for (C60737Nsb c60737Nsb2 : SparkContext.hybridContextMap.values()) {
                    Integer num2 = LIZIZ;
                    if (num2 != null && i == num2.intValue()) {
                        if (!(c60737Nsb2 instanceof SparkContext)) {
                            c60737Nsb = null;
                        } else {
                            c60737Nsb = c60737Nsb2;
                        }
                        if (((SparkContext) c60737Nsb) != null) {
                            linkedList.add(c60737Nsb2);
                        }
                    }
                    return;
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    SparkContext sparkContext = (SparkContext) it.next();
                    Integer num3 = LIZIZ;
                    if (num3 != null && i == num3.intValue()) {
                        SparkSchemaParam LJIIZILJ = sparkContext.LJIIZILJ(-1);
                        if (LJIIZILJ != null && LJIIZILJ.getSubscribeNetworkLevel() && (LJI = sparkContext.LJI()) != null) {
                            LJI.LJIIIZ("networkLevelChange", jSONObject);
                        }
                    }
                    return;
                }
            } catch (ConcurrentModificationException unused) {
                C61325O4z.LJ(new AqS44S0001000_6(i, 2));
            } catch (Throwable unused2) {
            }
        }
    }
}
