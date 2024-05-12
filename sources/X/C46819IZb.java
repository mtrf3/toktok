package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.IZb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C46819IZb implements InterfaceC47568Ilg {
    @Override // X.InterfaceC47568Ilg
    public final void onEvent() {
        InterfaceC46832IZo interfaceC46832IZo;
        WeakReference<InterfaceC46832IZo> weakReference = C46818IZa.LJLJJI;
        if (weakReference != null && (interfaceC46832IZo = weakReference.get()) != null) {
            interfaceC46832IZo.onEvent(EnumC47567Ilf.instance.popAllEvents());
        } else {
            if (!IXB.LIZ) {
                return;
            }
            IXB.LIZIZ("video_playq", "eventListener null");
        }
    }

    @Override // X.InterfaceC47568Ilg
    public void onEventV2(String str) {
        JSONArray popAllEventsV2;
        InterfaceC46832IZo interfaceC46832IZo;
        if (TextUtils.isEmpty(str) || !IXN.LIZJ.isEnablePlayerLogV2() || (popAllEventsV2 = EnumC47567Ilf.instance.popAllEventsV2()) == null || popAllEventsV2.length() <= 0) {
            return;
        }
        for (int i = 0; i < popAllEventsV2.length(); i++) {
            try {
                JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(popAllEventsV2, i);
                if (jSONObject != null) {
                    jSONObject.put("params_for_special", "videoplayer_monitor");
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
                return;
            }
        }
        WeakReference<InterfaceC46832IZo> weakReference = C46818IZa.LJLJJI;
        if (weakReference == null || (interfaceC46832IZo = weakReference.get()) == null) {
            return;
        }
        interfaceC46832IZo.LIZ(str, popAllEventsV2);
    }
}
