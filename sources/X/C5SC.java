package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effect.IEditEffectPreferences;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5SC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5SC {
    public static ArrayList<EffectModel> LJ() {
        int i;
        int i2;
        int i3;
        ArrayList<EffectModel> arrayList = new ArrayList<>();
        arrayList.add(LIZIZ(R.drawable.b62, -1, C60903NvH.LJ.getString(R.string.sb5), CardStruct.IStatusCode.DEFAULT));
        String string = C60903NvH.LJ.getString(R.string.saz);
        if (C149015t3.LIZIZ()) {
            i = R.drawable.azo;
        } else {
            i = R.drawable.b7r;
        }
        arrayList.add(LIZIZ(i, 0, string, "1"));
        String string2 = C60903NvH.LJ.getString(R.string.sb0);
        if (C149015t3.LIZIZ()) {
            i2 = R.drawable.azn;
        } else {
            i2 = R.drawable.b7p;
        }
        arrayList.add(LIZIZ(i2, 1, string2, "2"));
        String string3 = C60903NvH.LJ.getString(R.string.sb1);
        if (C149015t3.LIZIZ()) {
            i3 = R.drawable.azp;
        } else {
            i3 = R.drawable.b7q;
        }
        arrayList.add(LIZIZ(i3, 2, string3, "3"));
        return arrayList;
    }

    public static void LJFF() {
        IEditEffectPreferences iEditEffectPreferences = (IEditEffectPreferences) new C44350Has(0).LIZ(C60903NvH.LJ, IEditEffectPreferences.class);
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        int LJFF = (int) EF7.LJFF();
        if (LJFF != iEditEffectPreferences.getResourceVersion(-1)) {
            iEditEffectPreferences.setResourceVersion(LJFF);
            C60903NvH.LJIIJJI().LJIILL().LJFF();
            C10K.LIZJ(new CallableC136765Yi());
        }
    }

    public static String LIZJ(ArrayList<EffectPointModel> arrayList) {
        return TextUtils.join(",", AbstractC65583PoZ.copyOf((Collection) C65552Po4.LIZ(C65661Ppp.LIZLLL(arrayList, new InterfaceC65644PpY() { // from class: X.5SD
            @Override // X.InterfaceC65644PpY
            public final Object apply(Object obj) {
                return ((EffectPointModel) obj).getName();
            }
        }), new InterfaceC65503PnH() { // from class: X.5SF
            @Override // X.InterfaceC65503PnH
            public final boolean apply(Object obj) {
                return obj != null;
            }
        })));
    }

    public static String LIZLLL(ArrayList<EffectPointModel> arrayList) {
        return TextUtils.join(",", AbstractC65583PoZ.copyOf((Collection) C65661Ppp.LIZLLL(arrayList, new InterfaceC65644PpY() { // from class: X.5SE
            @Override // X.InterfaceC65644PpY
            public final Object apply(Object obj) {
                return ((EffectPointModel) obj).getKey();
            }
        })));
    }

    public static EffectModel LIZ(int i, Effect effect, String str) {
        int parseInt;
        EffectModel effectModel = new EffectModel();
        effectModel.name = effect.getName();
        effectModel.hint = effect.getHint();
        effectModel.key = effect.getEffectId();
        effectModel.resId = effect.getResource_id();
        effectModel.type = 1;
        if (!effect.getIconUrl().getUrlList().isEmpty()) {
            effectModel.iconUrl = (String) ListProtector.get(effect.getIconUrl().getUrlList(), 0);
        }
        int[] LIZ = C170236mB.LIZ();
        effectModel.color = LIZ[i % LIZ.length];
        effectModel.resDir = effect.getUnzipPath();
        List<String> tags = effect.getTags();
        if (tags != null) {
            for (String str2 : tags) {
                if (str2.contains("duration:")) {
                    parseInt = CastIntegerProtector.parseInt(str2.substring(9));
                    break;
                }
            }
        }
        parseInt = 3000;
        effectModel.duration = parseInt;
        effectModel.tags = effect.getTags();
        effectModel.category = str;
        effectModel.index = i;
        effectModel.selectFrom = i0.LJFF("effect_panel_", str);
        if (effect.getChallenge() != null && !effect.getChallenge().isEmpty()) {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = effect.getChallenge().iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(",");
            }
            effectModel.challenge = sb.substring(0, sb.length() - 1);
        }
        effectModel.extra = effect.getExtra();
        effectModel.resourceId = effect.getResourceId();
        effectModel.designerId = effect.getDesignerId();
        effectModel.designerEncryptedId = effect.getDesignerEncryptedId();
        effectModel.source = effect.getSource();
        try {
            if (effect.getExtra() != null) {
                JSONObject jSONObject = new JSONObject(effect.getExtra());
                effectModel.isNewEngineEffect = Boolean.valueOf(jSONObject.optBoolean("if_capcut"));
                effectModel.isGoToCapCutEffect = jSONObject.optBoolean("if_goto_capcut");
                effectModel.gameplayAlgorithm = jSONObject.optString("gameplay_algorithm");
            }
        } catch (JSONException unused) {
        }
        if (effectModel.isNewEngineEffect.booleanValue()) {
            effectModel.adjustParams = C36146EGo.LIZ(effect.getSdk_extra());
        }
        return effectModel;
    }

    public static EffectModel LIZIZ(int i, int i2, String str, String str2) {
        EffectModel effectModel = new EffectModel();
        effectModel.name = str;
        effectModel.type = 2;
        effectModel.category = "time";
        effectModel.key = str2;
        effectModel.imagePath = i;
        effectModel.index = i2;
        effectModel.selectFrom = "effect_panel_time";
        return effectModel;
    }
}
