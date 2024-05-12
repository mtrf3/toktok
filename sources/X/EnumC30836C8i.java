package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.C8i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class EnumC30836C8i {
    public static final EnumC30836C8i Camera;
    public static final EnumC30836C8i LITE_PLAYER_CONTAINER;
    public static final /* synthetic */ EnumC30836C8i[] LJLJJI;
    public static final EnumC30836C8i Live;
    public static final EnumC30836C8i LiveResource;
    public static final EnumC30836C8i LiveSDK;
    public static final EnumC30836C8i Player;
    public static final EnumC30836C8i XGPlayer;
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;

    public boolean isInstalled() {
        return true;
    }

    public void load(Context context, boolean z) {
    }

    public void preload() {
    }

    static {
        EnumC30836C8i enumC30836C8i = new EnumC30836C8i() { // from class: X.C8h
            @Override // X.EnumC30836C8i
            public final void load(Context context, boolean z) {
                try {
                    try {
                        IHostPlugin iHostPlugin = (IHostPlugin) CN1.LIZ(IHostPlugin.class);
                        if (z) {
                            try {
                                IHostPlugin.Companion.getClass();
                                iHostPlugin.loadLibrary(0, context, EnumC30836C8i.LiveResource.getPackageName(), "lens", C30835C8h.class.getClassLoader());
                            } catch (Throwable unused) {
                            }
                            try {
                                IHostPlugin.Companion.getClass();
                                iHostPlugin.loadLibrary(0, context, EnumC30836C8i.LiveResource.getPackageName(), "ttquic", C30835C8h.class.getClassLoader());
                            } catch (Throwable unused2) {
                            }
                            C30834C8g c30834C8g = IHostPlugin.Companion;
                            c30834C8g.getClass();
                            EnumC30836C8i enumC30836C8i2 = EnumC30836C8i.LiveResource;
                            iHostPlugin.loadLibrary(0, context, enumC30836C8i2.getPackageName(), "ttlivestreamercore", C30835C8h.class.getClassLoader());
                            c30834C8g.getClass();
                            iHostPlugin.loadLibrary(0, context, enumC30836C8i2.getPackageName(), "ies_render", C30835C8h.class.getClassLoader());
                            c30834C8g.getClass();
                            iHostPlugin.loadLibrary(0, context, enumC30836C8i2.getPackageName(), "bytertc", C30835C8h.class.getClassLoader());
                        }
                    } catch (Throwable th) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("message", th.getMessage());
                        jSONObject.put("service", "hotsoon_live_soplugin_load_failed");
                        JSONObject generateFinalExtra = EnumC30836C8i.generateFinalExtra(jSONObject);
                        InterfaceC31203CMl interfaceC31203CMl = C0K2.LIZ;
                        if (interfaceC31203CMl != null) {
                            interfaceC31203CMl.monitorStatusRate("ttlive_soplugin_load_error", 1, generateFinalExtra);
                        }
                    }
                } catch (Throwable unused3) {
                }
            }
        };
        LiveResource = enumC30836C8i;
        EnumC30836C8i enumC30836C8i2 = new EnumC30836C8i(1, "Camera", true, "camera", "com.ss.android.ugc.live.liveshortvideo_so");
        Camera = enumC30836C8i2;
        EnumC30836C8i enumC30836C8i3 = new EnumC30836C8i(2, "LiveSDK", true, "live_sdk", "com.ss.android.ies.live.sdk");
        LiveSDK = enumC30836C8i3;
        EnumC30836C8i enumC30836C8i4 = new EnumC30836C8i(3, "Player", false, "player", "com.ss.android.ugc.live.player");
        Player = enumC30836C8i4;
        EnumC30836C8i enumC30836C8i5 = new EnumC30836C8i(4, "XGPlayer", false, "player", "com.ss.ttm");
        XGPlayer = enumC30836C8i5;
        EnumC30836C8i enumC30836C8i6 = new EnumC30836C8i(5, "LITE_PLAYER_CONTAINER", false, "player", "com.bytedance.common.plugin.lite");
        LITE_PLAYER_CONTAINER = enumC30836C8i6;
        EnumC30836C8i enumC30836C8i7 = new EnumC30836C8i(6, "Live", false, "liveplugin", "com.bytedance.android.liveplugin");
        Live = enumC30836C8i7;
        LJLJJI = new EnumC30836C8i[]{enumC30836C8i, enumC30836C8i2, enumC30836C8i3, enumC30836C8i4, enumC30836C8i5, enumC30836C8i6, enumC30836C8i7};
    }

    public static EnumC30836C8i[] values() {
        return (EnumC30836C8i[]) LJLJJI.clone();
    }

    public String getPackageName() {
        return this.LJLILLLLZI;
    }

    public String getType() {
        return this.LJLIL;
    }

    public boolean isNeedPreload() {
        return this.LJLJI;
    }

    public static JSONObject generateFinalExtra(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("tag", "ttlive_sdk");
            jSONObject2.put("ttlive_sdk_version", C30443Bx9.LIZ());
            if (jSONObject != null) {
                jSONObject2.put("extra", jSONObject);
            }
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public static EnumC30836C8i valueOf(String str) {
        return (EnumC30836C8i) V0N.LJJJ(EnumC30836C8i.class, str);
    }

    public void checkInstall(Context context, InterfaceC30837C8j interfaceC30837C8j) {
        checkInstall(context, "", interfaceC30837C8j);
    }

    public void checkInstall(Context context, String str, InterfaceC30837C8j interfaceC30837C8j) {
        if (isInstalled() && interfaceC30837C8j != null) {
            getPackageName();
            interfaceC30837C8j.onSuccess();
        }
    }

    public EnumC30836C8i(int i, String str, boolean z, String str2, String str3) {
        this.LJLIL = str2;
        this.LJLJI = z;
        this.LJLILLLLZI = str3;
    }
}
