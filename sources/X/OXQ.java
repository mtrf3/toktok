package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.HybridShellActivity;
import com.ss.android.ugc.aweme.bullet.bridge.framework.ShareMethod;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.HybridImageSharePackage;
import com.ss.android.ugc.aweme.web.share.model.WebShareInfo;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OXQ implements InterfaceC62474OfW {
    public final /* synthetic */ JSONObject LIZ;
    public final /* synthetic */ InterfaceC37146Ehy LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ C68322mC<WebShareInfo.HybridContainerInfo> LIZLLL;
    public final /* synthetic */ JSONObject LJ;
    public final /* synthetic */ String LJFF;
    public final /* synthetic */ String LJI;
    public final /* synthetic */ String LJII;
    public final /* synthetic */ JSONObject LJIIIIZZ;
    public final /* synthetic */ ShareMethod LJIIIZ;
    public final /* synthetic */ int LJIIJ;

    @Override // X.InterfaceC62474OfW
    public final void LIZIZ(Context context, BaseSharePackage sharePackage, InterfaceC62486Ofi action) {
        o.LJIIIZ(action, "action");
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(context, "context");
    }

    @Override // X.InterfaceC62474OfW
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(context, "context");
        try {
            JSONObject jSONObject = this.LIZ;
            if (jSONObject != null) {
                jSONObject.put("code", 0);
            }
        } catch (JSONException unused) {
        }
    }

    @Override // X.InterfaceC62474OfW
    public final void LJ(Context context, BaseSharePackage sharePackage) {
        boolean z;
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(context, "context");
        String string = sharePackage.extras.getString("share_platform");
        if (string == null || string.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            JSONObject jSONObject = this.LIZ;
            if (jSONObject != null) {
                jSONObject.put("share_code", 0);
            }
            JSONObject jSONObject2 = this.LIZ;
            if (jSONObject2 != null) {
                jSONObject2.put("button", "cancel");
            }
            InterfaceC37146Ehy interfaceC37146Ehy = this.LIZIZ;
            if (interfaceC37146Ehy != null) {
                interfaceC37146Ehy.LIZIZ(this.LIZ);
            }
        } else if (o.LJ(sharePackage.extras.getString("share_platform"), "chat_more")) {
            JSONObject jSONObject3 = this.LIZ;
            if (jSONObject3 != null) {
                jSONObject3.put("share_code", 1);
            }
            JSONObject jSONObject4 = this.LIZ;
            if (jSONObject4 != null) {
                jSONObject4.put("share_channel", sharePackage.extras.getString("share_platform"));
            }
            InterfaceC37146Ehy interfaceC37146Ehy2 = this.LIZIZ;
            if (interfaceC37146Ehy2 != null) {
                interfaceC37146Ehy2.LIZIZ(this.LIZ);
            }
        }
        C62054OXa c62054OXa = HybridImageSharePackage.Companion;
        String type = this.LIZJ;
        o.LJIIIIZZ(type, "type");
        WebShareInfo.HybridContainerInfo hybridContainerInfo = this.LIZLLL.element;
        c62054OXa.getClass();
        if (C62054OXa.LIZ(type, hybridContainerInfo)) {
            if (C52288Kfc.LIZ()) {
                AqS160S0100000_10 aqS160S0100000_10 = OXH.LJIIIIZZ;
                if (aqS160S0100000_10 != null) {
                    aqS160S0100000_10.invoke();
                    return;
                }
                return;
            }
            AqS160S0100000_10 aqS160S0100000_102 = HybridShellActivity.LJLJL;
            if (aqS160S0100000_102 == null) {
                return;
            }
            aqS160S0100000_102.invoke();
        }
    }

    @Override // X.InterfaceC62474OfW
    public final void LJFF(View view, C62387Oe7 sharePanelConfig, C5JV c5jv) {
        o.LJIIIZ(sharePanelConfig, "sharePanelConfig");
        C62054OXa c62054OXa = HybridImageSharePackage.Companion;
        String type = this.LIZJ;
        o.LJIIIIZZ(type, "type");
        WebShareInfo.HybridContainerInfo hybridContainerInfo = this.LIZLLL.element;
        c62054OXa.getClass();
        if (C62054OXa.LIZ(type, hybridContainerInfo)) {
            if (C52288Kfc.LIZ()) {
                OXL oxl = OXH.LJII;
                if (oxl != null) {
                    oxl.invoke(view, Integer.valueOf(c5jv.LJLILLLLZI));
                    return;
                }
                return;
            }
            OXK oxk = HybridShellActivity.LJLJJLL;
            if (oxk == null) {
                return;
            }
            oxk.invoke(view, Integer.valueOf(c5jv.LJLILLLLZI));
            return;
        }
        String bizTag = this.LJI;
        o.LJIIIIZZ(bizTag, "bizTag");
        String bizSceneTag = this.LJII;
        o.LJIIIIZZ(bizSceneTag, "bizSceneTag");
        String jSONObject = this.LJIIIIZZ.toString();
        o.LJIIIIZZ(jSONObject, "params.toString()");
        OXR.LIZIZ(bizTag, bizSceneTag, "webview", jSONObject);
        ShareMethod shareMethod = this.LJIIIZ;
        int i = this.LJIIJ;
        int i2 = c5jv.LJLILLLLZI;
        shareMethod.getClass();
        if (i != 1) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("panel_height", i2);
        jSONObject2.put("panel_frame", jSONObject3);
        InterfaceC60761Nsz interfaceC60761Nsz = shareMethod.LJLIL;
        if (interfaceC60761Nsz == null) {
            return;
        }
        interfaceC60761Nsz.LJIIIZ("H5_sharePanelFrame", jSONObject2);
    }

    @Override // X.InterfaceC110854Wr
    public final void LIZ(InterfaceC62225ObV channel, boolean z, BaseSharePackage baseSharePackage, Context context) {
        String str;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        if (this.LJ != null) {
            MobClick obtain = MobClick.obtain();
            obtain.setEventName(this.LJ.optString("tag"));
            obtain.setLabelName(channel.key());
            obtain.setValue(this.LJ.optString("value"));
            obtain.setJsonObject(this.LJ.optJSONObject("extras"));
            FMX.onEvent(obtain);
        }
        if (z) {
            String finalMobUrl = this.LJFF;
            if (baseSharePackage != null && (baseSharePackage instanceof HybridImageSharePackage)) {
                int i = ((HybridImageSharePackage) baseSharePackage).shareMode;
                str = "";
                if (i == 2) {
                    finalMobUrl = "";
                }
                String str2 = OXR.LIZ.get(Integer.valueOf(i));
                if (str2 != null) {
                    str = str2;
                }
            } else {
                str = "url_form";
            }
            String bizTag = this.LJI;
            o.LJIIIIZZ(bizTag, "bizTag");
            String bizSceneTag = this.LJII;
            o.LJIIIIZZ(bizSceneTag, "bizSceneTag");
            String key = channel.key();
            o.LJIIIIZZ(finalMobUrl, "finalMobUrl");
            OXR.LIZ(bizTag, bizSceneTag, "lynx", key, str, finalMobUrl);
            JSONObject jSONObject = this.LIZ;
            if (jSONObject != null) {
                jSONObject.put("share_code", 1);
            }
        } else {
            JSONObject jSONObject2 = this.LIZ;
            if (jSONObject2 != null) {
                jSONObject2.put("share_code", 0);
            }
        }
        JSONObject jSONObject3 = this.LIZ;
        if (jSONObject3 != null) {
            jSONObject3.put("button", channel.key());
        }
        InterfaceC37146Ehy interfaceC37146Ehy = this.LIZIZ;
        if (interfaceC37146Ehy != null) {
            interfaceC37146Ehy.LIZIZ(this.LIZ);
        }
    }

    @Override // X.InterfaceC110854Wr
    public final Object LIZJ(Context context, BaseSharePackage baseSharePackage, InterfaceC62225ObV interfaceC62225ObV, InterfaceC67352kd interfaceC67352kd) {
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC62474OfW
    public final void LJI(InterfaceC62225ObV interfaceC62225ObV, boolean z, BaseSharePackage baseSharePackage, Context context) {
        OQD.LJ(interfaceC62225ObV, context);
    }

    public OXQ(JSONObject jSONObject, InterfaceC37146Ehy interfaceC37146Ehy, String str, C68322mC<WebShareInfo.HybridContainerInfo> c68322mC, JSONObject jSONObject2, String str2, String str3, String str4, JSONObject jSONObject3, ShareMethod shareMethod, int i) {
        this.LIZ = jSONObject;
        this.LIZIZ = interfaceC37146Ehy;
        this.LIZJ = str;
        this.LIZLLL = c68322mC;
        this.LJ = jSONObject2;
        this.LJFF = str2;
        this.LJI = str3;
        this.LJII = str4;
        this.LJIIIIZZ = jSONObject3;
        this.LJIIIZ = shareMethod;
        this.LJIIJ = i;
    }
}
