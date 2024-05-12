package X;

import android.content.Context;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.geckox.settings.model.SettingsLocal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.OEq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61576OEq implements C0K7, InterfaceC54848Lfo, InterfaceC54842Lfi, C4N5, AnonymousClass573 {
    public static volatile boolean LJLIL;
    public static final C61576OEq LJLILLLLZI = new C61576OEq();

    @Override // X.InterfaceC54848Lfo
    public void LJ(JSONObject jSONObject) {
    }

    @Override // X.C4N5
    public void isEnabled() {
    }

    public static void LIZLLL(Context context) {
        OC6.LIZ("gecko-debug-tag", "settings cache deleted");
        OAI oai = OAO.LIZ;
        if (oai.LIZ == null) {
            oai.LIZ = F9J.LIZIZ(context, 0, "sp_gecko");
        }
        oai.LIZ.edit().remove("gecko_settings").apply();
    }

    public static SettingsLocal LJI(Context context) {
        OAI oai = OAO.LIZ;
        if (oai.LIZ == null) {
            oai.LIZ = F9J.LIZIZ(context, 0, "sp_gecko");
        }
        String string = oai.LIZ.getString("gecko_settings_local", null);
        if (string == null) {
            return null;
        }
        try {
            return (SettingsLocal) OXZ.LIZIZ.LIZ.LJI(string, SettingsLocal.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // X.C0K7
    public void LJIILLIIL(LiveDialog liveDialog) {
        liveDialog.dismiss();
    }

    public static void LJII(Context context, SettingsLocal settingsLocal) {
        OC6.LIZ("gecko-debug-tag", "settings local cache stored", settingsLocal);
        OAO.LIZ.LIZ(context, "gecko_settings_local", GsonProtectorUtils.toJson(OXZ.LIZIZ.LIZ, settingsLocal));
    }

    public static Object LJFF(List list, InterfaceC66331Q1n env, C66320Q1c c66320Q1c) {
        o.LJIIJ(env, "env");
        Stack<Object> stack = new Stack<>();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Q2L) it.next()).LIZIZ(stack, env, c66320Q1c);
        }
        if (stack.size() == 1) {
            return stack.pop();
        }
        throw new C61596OFk(107, "execute end, but stack has more than one element");
    }

    @Override // X.InterfaceC54842Lfi
    public boolean LIZ(Object obj, File file, File file2) {
        Class<?> cls = obj.getClass();
        try {
            return C1B6.LIZIZ((String) String.class.cast(C40654FxS.LIZJ(null, C40654FxS.LJIIIIZZ(cls, "optimizedPathFor", File.class, File.class), new Object[]{file, file2})));
        } catch (Exception e) {
            throw new C40655FxT(C16880lQ.LLLZ("Failed to invoke static method %s on type %s", new Object[]{"optimizedPathFor", cls}), e);
        }
    }

    @Override // X.AnonymousClass573
    public void LIZIZ(boolean z, long j, Exception exc, Integer num) {
        String str;
        if (exc == null || (str = exc.getMessage()) == null) {
            str = "";
        }
        int i = !z ? 1 : 0;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZ(i, "status");
        c145995oB.LIZIZ(j, "duration");
        if (!z && num != null) {
            c145995oB.LIZ(num.intValue(), "error_code");
            c145995oB.LIZLLL("error_domain", str);
        }
        FMX.LJIIL("load_magic_panel", c145995oB.LIZ);
    }

    @Override // X.AnonymousClass573
    public void LIZJ(boolean z, long j, Exception exc, Integer num, ResourceItem item) {
        String str;
        String str2;
        o.LJIIIZ(item, "item");
        String str3 = item.gameplayType;
        if (o.LJ(str3, EnumC126954yZ.SERVER_GAME_PLAY.getTypeName())) {
            str = "server";
        } else if (o.LJ(str3, EnumC126954yZ.CLIENT_GAME_PLAY.getTypeName())) {
            str = "client";
        } else {
            str = "combine";
        }
        if (exc == null || (str2 = exc.getMessage()) == null) {
            str2 = "";
        }
        String effectId = item.getEffectId();
        o.LJIIIIZZ(effectId, "item.effectId");
        String name = item.getName();
        o.LJIIIIZZ(name, "item.name");
        int i = !z ? 1 : 0;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZ(i, "status");
        c145995oB.LIZIZ(j, "duration");
        c145995oB.LJI("resource_id", effectId);
        c145995oB.LJI("resource_name", name);
        c145995oB.LJI("gameplay_type", str);
        if (!z && num != null) {
            c145995oB.LIZ(num.intValue(), "error_code");
            c145995oB.LIZLLL("error_domain", str2);
        }
        FMX.LJIIL("download_magic_item", c145995oB.LIZ);
    }
}
