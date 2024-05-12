package X;

import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchResultFragmentNew;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class K6Z implements InterfaceC16710l9 {
    public final /* synthetic */ SearchResultFragmentNew LIZ;

    public K6Z(SearchResultFragmentNew searchResultFragmentNew) {
        this.LIZ = searchResultFragmentNew;
    }

    @Override // X.InterfaceC16710l9
    public final C16800lI LIZ(View v, C16800lI c16800lI) {
        Window window;
        View decorView;
        WindowInsets rootWindowInsets;
        C51161K6b c51161K6b;
        String str;
        Long l;
        Long l2;
        String str2;
        o.LJIIIZ(v, "v");
        ActivityC45651qj mo49getActivity = this.LIZ.mo49getActivity();
        if (mo49getActivity != null && (window = mo49getActivity.getWindow()) != null && (decorView = window.getDecorView()) != null && (rootWindowInsets = decorView.getRootWindowInsets()) != null && rootWindowInsets.isVisible(8) && (c51161K6b = C51162K6c.LIZ) != null) {
            long j = 0;
            if (c51161K6b.LIZ != 0) {
                long currentTimeMillis = System.currentTimeMillis();
                C51161K6b c51161K6b2 = C51162K6c.LIZ;
                if (c51161K6b2 != null) {
                    j = c51161K6b2.LIZ;
                }
                c51161K6b.LIZJ = currentTimeMillis - j;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("type:");
                C51161K6b c51161K6b3 = C51162K6c.LIZ;
                if (c51161K6b3 != null) {
                    str = c51161K6b3.LIZIZ;
                } else {
                    str = null;
                }
                LIZ.append(str);
                LIZ.append(" cost:");
                C51161K6b c51161K6b4 = C51162K6c.LIZ;
                if (c51161K6b4 != null) {
                    l = Long.valueOf(c51161K6b4.LIZJ);
                } else {
                    l = null;
                }
                LIZ.append(l);
                X1D.LIZIZ(LIZ);
                JSONObject jSONObject = new JSONObject();
                C51161K6b c51161K6b5 = C51162K6c.LIZ;
                if (c51161K6b5 != null) {
                    l2 = Long.valueOf(c51161K6b5.LIZJ);
                } else {
                    l2 = null;
                }
                jSONObject.put("cost", l2);
                C51161K6b c51161K6b6 = C51162K6c.LIZ;
                if (c51161K6b6 != null) {
                    str2 = c51161K6b6.LIZIZ;
                } else {
                    str2 = null;
                }
                jSONObject.put("type", str2);
                jSONObject.put("version", 2);
                AppLogNewUtils.onEventV3("search_trigger_keyboard_monitor", jSONObject);
                C51162K6c.LIZ = null;
            }
        }
        return c16800lI;
    }
}
