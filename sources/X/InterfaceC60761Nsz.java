package X;

import android.content.Context;
import android.view.View;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.Nsz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC60761Nsz {
    void LIZ(java.util.Map<String, ? extends Object> map);

    void LIZIZ();

    View LIZJ();

    void LJ(String str, java.util.Map<String, ? extends Object> map);

    boolean LJFF();

    void LJI(boolean z);

    void LJII(Context context);

    void LJIIIZ(String str, JSONObject jSONObject);

    void LJIIJ(String str, List<? extends Object> list);

    void LJIIJJI(SparkSchemaParam sparkSchemaParam);

    java.util.Map<String, Object> getGlobalProps();

    C60737Nsb getHybridContext();

    void load(String str);

    void onHide();

    void onShow();

    void reload();

    void updateData(java.util.Map<String, ? extends Object> map);
}
