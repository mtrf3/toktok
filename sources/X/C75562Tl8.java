package X;

import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* renamed from: X.Tl8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75562Tl8<T> implements InterfaceC64592gB {
    public static final C75562Tl8<T> LJLIL = new C75562Tl8<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        boolean z;
        boolean z2;
        String str;
        BattleInfoResponse battleInfoResponse = (BattleInfoResponse) ((BaseResponse) obj).data;
        Long l = battleInfoResponse.battleId;
        if (l != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j = C75622Tm6.LJIIIIZZ;
            if (l == null || l.longValue() != j) {
                C0NB.LIZIZ("disappear", "battle id not lasted , normal");
                return;
            }
        }
        BattleSetting battleSetting = battleInfoResponse.setting;
        if (battleSetting != null && (battleSetting.status == 1 || battleSetting.status == 3)) {
            JSONObject jSONObject = new JSONObject();
            for (EnumC76429Tz7 enumC76429Tz7 : EnumC76429Tz7.values()) {
                CharSequence charSequence = (CharSequence) ((LinkedHashMap) C75622Tm6.LIZIZ).get(enumC76429Tz7.getScene());
                if (charSequence == null || charSequence.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z3 = !z2;
                String scene = enumC76429Tz7.getScene();
                if (z3) {
                    str = "disappear";
                } else {
                    str = "";
                }
                C05630Jz.LJI(jSONObject, scene, str);
            }
            C05630Jz.LIZ(C75622Tm6.LJIIIZ, "disappear_reason", jSONObject);
            C75622Tm6.LJIIZILJ("component_abnormal_disappear", jSONObject, C75622Tm6.LJ, C75622Tm6.LJFF);
            return;
        }
        C75622Tm6.LJIILL();
    }
}
