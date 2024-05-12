package com.bytedance.apm.agent.instrumentation;

import X.C16880lQ;
import X.X1D;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.monitor.MonitorTool;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ClickInstrumentation {
    public static void onClick(View view) {
        CharSequence text;
        if (view == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            Resources resources = view.getContext().getResources();
            if (view.getId() != -1) {
                jSONObject.put("view_id", view.getId());
                jSONObject.put("view_name", resources.getResourceEntryName(view.getId()));
            }
            if ((view instanceof TextView) && (text = ((TextView) view).getText()) != null) {
                String charSequence = text.toString();
                if (charSequence.length() > 100) {
                    charSequence = charSequence.substring(0, 100);
                }
                jSONObject.put("view_text", charSequence);
            }
            if (view.getParent() != null) {
                String LJLLJ = C16880lQ.LJLLJ(view.getParent().getClass());
                if (view.getParent().getParent() != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(C16880lQ.LJLLJ(view.getParent().getParent().getClass()));
                    LIZ.append("#");
                    LIZ.append(LJLLJ);
                    LIZ.append("#");
                    LIZ.append(C16880lQ.LJLLJ(view.getClass()));
                    LJLLJ = X1D.LIZIZ(LIZ);
                }
                jSONObject.put("view_path", LJLLJ);
            }
            if (view.getTag(-16777215) != null && !TextUtils.isEmpty(view.getTag(-16777215).toString())) {
                jSONObject.put("view_tag_1", view.getTag(-16777215).toString());
            }
            if (view.getTag(-16777214) != null && !TextUtils.isEmpty(view.getTag(-16777214).toString())) {
                jSONObject.put("view_tag_2", view.getTag(-16777214).toString());
            }
            if (view.getTag(-16777213) != null && (view.getTag(-16777213) instanceof Map)) {
                for (Map.Entry entry : ((Map) view.getTag(-16777213)).entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("view_tag_map_");
                    LIZ2.append(key.toString());
                    jSONObject.put(X1D.LIZIZ(LIZ2), value.toString());
                }
            }
            jSONObject.put("click_type", "View#OnClick");
            MonitorTool.monitorUIAction("view_click", "", jSONObject);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void onTabChanged(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("view_name", str);
            jSONObject.put("click_type", "TabHost#OnTabChanged");
            MonitorTool.monitorUIAction("view_click", "", jSONObject);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
