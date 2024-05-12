package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.HybridShellActivity;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.fe.method.ShareMethod;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.HybridImageSharePackage;
import com.ss.android.ugc.aweme.web.share.model.WebShareInfo;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OXP implements InterfaceC62474OfW {
    public final /* synthetic */ C68322mC<String> LIZ;
    public final /* synthetic */ JSONObject LIZIZ;
    public final /* synthetic */ InterfaceC36488ETs LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ C68322mC<WebShareInfo.HybridContainerInfo> LJ;
    public final /* synthetic */ JSONObject LJFF;
    public final /* synthetic */ String LJI;
    public final /* synthetic */ String LJII;
    public final /* synthetic */ String LJIIIIZZ;
    public final /* synthetic */ JSONObject LJIIIZ;
    public final /* synthetic */ ShareMethod LJIIJ;
    public final /* synthetic */ int LJIIJJI;

    @Override // X.InterfaceC62474OfW
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(context, "context");
        try {
            JSONObject jSONObject = this.LIZIZ;
            if (jSONObject != null) {
                jSONObject.put("code", 0);
            }
        } catch (JSONException unused) {
        }
    }

    @Override // X.InterfaceC62474OfW
    public final void LJ(Context context, BaseSharePackage sharePackage) {
        boolean z;
        JSONObject jSONObject;
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(context, "context");
        String string = sharePackage.extras.getString("share_platform");
        if (string == null || string.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            JSONObject jSONObject2 = this.LIZIZ;
            if (jSONObject2 != null) {
                jSONObject2.put("share_code", 0);
            }
            JSONObject jSONObject3 = this.LIZIZ;
            if (jSONObject3 != null) {
                jSONObject3.put("button", "cancel");
            }
            String str = this.LIZ.element;
            if (str != null && (jSONObject = this.LIZIZ) != null) {
                jSONObject.put("share_channel", str);
            }
            InterfaceC36488ETs interfaceC36488ETs = this.LIZJ;
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.LIZIZ(this.LIZIZ);
            }
        } else if (o.LJ(sharePackage.extras.getString("share_platform"), "chat_more")) {
            JSONObject jSONObject4 = this.LIZIZ;
            if (jSONObject4 != null) {
                jSONObject4.put("share_code", 1);
            }
            JSONObject jSONObject5 = this.LIZIZ;
            if (jSONObject5 != null) {
                jSONObject5.put("share_channel", sharePackage.extras.getString("share_platform"));
            }
            InterfaceC36488ETs interfaceC36488ETs2 = this.LIZJ;
            if (interfaceC36488ETs2 != null) {
                interfaceC36488ETs2.LIZIZ(this.LIZIZ);
            }
        }
        C62054OXa c62054OXa = HybridImageSharePackage.Companion;
        String type = this.LIZLLL;
        o.LJIIIIZZ(type, "type");
        WebShareInfo.HybridContainerInfo hybridContainerInfo = this.LJ.element;
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

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.String] */
    @Override // X.InterfaceC62474OfW
    public final void LIZIZ(Context context, BaseSharePackage sharePackage, InterfaceC62486Ofi action) {
        o.LJIIIZ(action, "action");
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(context, "context");
        this.LIZ.element = action.key();
    }

    @Override // X.InterfaceC62474OfW
    public final void LJFF(View view, C62387Oe7 sharePanelConfig, C5JV c5jv) {
        o.LJIIIZ(sharePanelConfig, "sharePanelConfig");
        C62054OXa c62054OXa = HybridImageSharePackage.Companion;
        String type = this.LIZLLL;
        o.LJIIIIZZ(type, "type");
        WebShareInfo.HybridContainerInfo hybridContainerInfo = this.LJ.element;
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
        String bizTag = this.LJII;
        o.LJIIIIZZ(bizTag, "bizTag");
        String bizSceneTag = this.LJIIIIZZ;
        o.LJIIIIZZ(bizSceneTag, "bizSceneTag");
        String jSONObject = this.LJIIIZ.toString();
        o.LJIIIIZZ(jSONObject, "params.toString()");
        OXR.LIZIZ(bizTag, bizSceneTag, "webview", jSONObject);
        ShareMethod shareMethod = this.LJIIJ;
        int i = this.LJIIJJI;
        int i2 = c5jv.LJLILLLLZI;
        shareMethod.getClass();
        if (i != 1) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("panel_height", i2);
        jSONObject2.put("panel_frame", jSONObject3);
        shareMethod.LJLILLLLZI.LJIIIIZZ("H5_sharePanelFrame", jSONObject2);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.String] */
    @Override // X.InterfaceC110854Wr
    public final void LIZ(InterfaceC62225ObV channel, boolean z, BaseSharePackage baseSharePackage, Context context) {
        String str;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        if (this.LJFF != null) {
            MobClick obtain = MobClick.obtain();
            obtain.setEventName(this.LJFF.optString("tag"));
            obtain.setLabelName(channel.key());
            obtain.setValue(this.LJFF.optString("value"));
            obtain.setJsonObject(this.LJFF.optJSONObject("extras"));
            FMX.onEvent(obtain);
        }
        if (z) {
            this.LIZ.element = channel.key();
            String finalMobUrl = this.LJI;
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
            String bizTag = this.LJII;
            o.LJIIIIZZ(bizTag, "bizTag");
            String bizSceneTag = this.LJIIIIZZ;
            o.LJIIIIZZ(bizSceneTag, "bizSceneTag");
            String key = channel.key();
            o.LJIIIIZZ(finalMobUrl, "finalMobUrl");
            OXR.LIZ(bizTag, bizSceneTag, "webview", key, str, finalMobUrl);
            JSONObject jSONObject = this.LIZIZ;
            if (jSONObject != null) {
                jSONObject.put("share_code", 1);
            }
        } else {
            JSONObject jSONObject2 = this.LIZIZ;
            if (jSONObject2 != null) {
                jSONObject2.put("share_code", 0);
            }
        }
        JSONObject jSONObject3 = this.LIZIZ;
        if (jSONObject3 != null) {
            jSONObject3.put("button", channel.key());
        }
        InterfaceC36488ETs interfaceC36488ETs = this.LIZJ;
        if (interfaceC36488ETs != null) {
            interfaceC36488ETs.LIZIZ(this.LIZIZ);
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

    public OXP(C68322mC<String> c68322mC, JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs, String str, C68322mC<WebShareInfo.HybridContainerInfo> c68322mC2, JSONObject jSONObject2, String str2, String str3, String str4, JSONObject jSONObject3, ShareMethod shareMethod, int i) {
        this.LIZ = c68322mC;
        this.LIZIZ = jSONObject;
        this.LIZJ = interfaceC36488ETs;
        this.LIZLLL = str;
        this.LJ = c68322mC2;
        this.LJFF = jSONObject2;
        this.LJI = str2;
        this.LJII = str3;
        this.LJIIIIZZ = str4;
        this.LJIIIZ = jSONObject3;
        this.LJIIJ = shareMethod;
        this.LJIIJJI = i;
    }
}
