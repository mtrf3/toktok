package X;

import com.bytedance.android.live_settings.LiveSettingModel;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.message.LiveMtPbRequestsSetting;
import com.bytedance.retrofit2.SsHttpCall;
import com.bytedance.retrofit2.client.Request;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.PhI, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65132PhI<R, T> implements InterfaceC65014PfO<R, T> {
    public static final java.util.Map<String, C65134PhK> LIZLLL = new ConcurrentHashMap();
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C31051CGp.LJLIL);
    public final InterfaceC65014PfO<R, T> LIZ;
    public final EnumC29608Bjg LIZIZ;
    public final String LIZJ;

    @Override // X.InterfaceC65014PfO
    public final Type LIZ() {
        Type LIZ = this.LIZ.LIZ();
        o.LJIIIIZZ(LIZ, "originAdapter.responseType()");
        return LIZ;
    }

    public static final boolean LIZJ(Request request) {
        Collection<LiveSettingModel> values;
        LiveSettingModel liveSettingModel;
        o.LJIIIZ(request, "request");
        String path = request.getPath();
        boolean z = false;
        if (!LiveMtPbRequestsSetting.INSTANCE.getValue().isEnable()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("disable pb for path(");
            LIZ.append(path);
            LIZ.append("), because of main switch is disabled.");
            C0NB.LIZIZ("ttlivesdk", X1D.LIZIZ(LIZ));
            return false;
        }
        C65134PhK c65134PhK = (C65134PhK) ((ConcurrentHashMap) LIZLLL).get(path);
        if (c65134PhK == null) {
            return false;
        }
        if (!((JSONObject) LJ.getValue()).optBoolean(c65134PhK.LIZ, false)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("disable pb for path(");
            LIZ2.append(path);
            LIZ2.append("), because of module switch is disabled.");
            C0NB.LIZIZ("ttlivesdk", X1D.LIZIZ(LIZ2));
            return false;
        }
        if (c65134PhK.LIZIZ.length() > 0) {
            if (c65134PhK.LIZJ == null) {
                String settingKey = c65134PhK.LIZIZ;
                o.LJIIIZ(settingKey, "settingKey");
                HashMap<String, LiveSettingModel> modelMap = CK5.LIZ.getModelMap();
                Class<?> cls = null;
                if (modelMap != null && (values = modelMap.values()) != null) {
                    Iterator<LiveSettingModel> it = values.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            liveSettingModel = it.next();
                            if (o.LJ(liveSettingModel.getSettingsKey(), settingKey)) {
                                break;
                            }
                        } else {
                            liveSettingModel = null;
                            break;
                        }
                    }
                    LiveSettingModel liveSettingModel2 = liveSettingModel;
                    if (liveSettingModel2 != null && liveSettingModel2.getClassName() != null) {
                        try {
                            cls = Class.forName(liveSettingModel2.getClassName());
                        } catch (Exception unused) {
                        }
                    }
                }
                c65134PhK.LIZJ = cls;
            }
            Class<?> cls2 = c65134PhK.LIZJ;
            if (cls2 != null && (z = SettingsManager.INSTANCE.getBooleanValue(cls2))) {
                return z;
            }
            StringBuilder LIZIZ = C25620zW.LIZIZ("disable pb for path(", path, "), because of ab setting for(");
            C12400eC.LIZIZ(LIZIZ, c65134PhK.LIZIZ, ") is disabled.", LIZIZ, "ttlivesdk");
            return z;
        }
        return true;
    }

    @Override // X.InterfaceC65014PfO
    public final Object LIZIZ(SsHttpCall ssHttpCall) {
        Request request = ssHttpCall.request();
        o.LJIIIIZZ(request, "request");
        C65133PhJ.LIZ(request, this.LIZIZ, this.LIZJ);
        return this.LIZ.LIZIZ(ssHttpCall);
    }

    public C65132PhI(InterfaceC65014PfO<R, T> interfaceC65014PfO, EnumC29608Bjg switchType, String settingKey) {
        o.LJIIIZ(switchType, "switchType");
        o.LJIIIZ(settingKey, "settingKey");
        this.LIZ = interfaceC65014PfO;
        this.LIZIZ = switchType;
        this.LIZJ = settingKey;
    }
}
