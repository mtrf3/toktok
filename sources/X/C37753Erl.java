package X;

import com.bytedance.lynx.hybrid.settings.HybridSettings;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Erl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37753Erl extends AbstractC65781Prl implements InterfaceC65784Pro<List<String>> {
    public static final C37753Erl LJLIL = new C37753Erl();

    public C37753Erl() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List<java.lang.String>] */
    @Override // X.InterfaceC65784Pro
    public final List<String> invoke() {
        C3C4 c3c4;
        ?? r4;
        JSONArray jSONArray;
        try {
            JSONObject config = HybridSettings.INSTANCE.getConfig("disable_popup_follow_activity_ui");
            if (config != null && (jSONArray = JSONObjectProtectorUtils.getJSONArray(config, "list")) != null) {
                r4 = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String string = JSONArrayProtectorUtils.getString(jSONArray, i);
                    o.LJFF(string, "it.getString(i)");
                    r4.add(string);
                }
            } else {
                r4 = 0;
            }
            C3C5.m7constructorimpl(r4);
            c3c4 = r4;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            c3c4 = LIZ;
        }
        if (C3C5.m12isFailureimpl(c3c4)) {
            return null;
        }
        return c3c4;
    }
}
