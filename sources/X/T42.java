package X;

import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class T42 implements T44 {
    public boolean LJLIL = true;
    public final java.util.Map<Class<? extends T43>, T43> LJLILLLLZI = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(T43 matcher) {
        o.LJIIIZ(matcher, "matcher");
        this.LJLILLLLZI.put(matcher.getClass(), matcher);
    }

    @Override // X.T43
    public final boolean LJJIJIIJIL(Effect effect, int i, int i2) {
        o.LJIIIZ(effect, "effect");
        if (this.LJLIL && !ID0.LJIJJ(effect) && !V3N.LJIILLIIL(effect)) {
            String str = null;
            if (!TextUtils.isEmpty(effect.getSdkExtra())) {
                try {
                    str = new JSONObject(effect.getSdkExtra()).optString("guide_video_path");
                } catch (JSONException unused) {
                }
            }
            if (TextUtils.isEmpty(str)) {
                java.util.Map<Class<? extends T43>, T43> map = this.LJLILLLLZI;
                if (!map.isEmpty()) {
                    Iterator it = ((LinkedHashMap) map).entrySet().iterator();
                    while (it.hasNext()) {
                        if (((T43) ((Map.Entry) it.next()).getValue()).LJJIJIIJIL(effect, i, i2)) {
                            this.LJLIL = false;
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
