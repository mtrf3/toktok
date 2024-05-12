package X;

import android.os.SystemClock;
import com.bytedance.pitaya.api.PTYSettingsCallback;
import com.bytedance.pitaya.api.feature.FeatureCoreFactory;
import com.bytedance.pitaya.api.feature.IFeatureCore;
import com.bytedance.pitaya.api.feature.IKVStore;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import ujb.o;

/* renamed from: X.aPC, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93334aPC implements InterfaceC37216Ej6 {
    public final JSONObject LJLIL;
    public final Boolean LJLILLLLZI;
    public final ArrayList<String> LJLJI;
    public final int LJLJJI;
    public final String LJLJJL;

    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt<?> intercept(FBZ fbz) {
        OSZ osz;
        IKVStore iKVStore;
        String tryGetValuesForRequest;
        java.util.Map<String, Long> map;
        F7S f7s = (F7S) fbz;
        C64738Paw c64738Paw = f7s.LJFF;
        long uptimeMillis = SystemClock.uptimeMillis();
        Request request = f7s.LIZJ;
        if (request == null) {
            osz = new OSZ(null, EnumC93322aP0.EmptyRequest);
        } else if (!request.isResponseStreaming()) {
            try {
                if (this.LJLIL == null || this.LJLJI.isEmpty()) {
                    osz = new OSZ(request, EnumC93322aP0.EmptySettings);
                } else {
                    ArrayList arrayList = new ArrayList(request.getHeaders());
                    StringBuilder sb = new StringBuilder();
                    Iterator<String> it = this.LJLJI.iterator();
                    while (true) {
                        boolean z = false;
                        boolean z2 = true;
                        if (it.hasNext()) {
                            String next = it.next();
                            JSONObject jSONObject = this.LJLIL;
                            if (jSONObject != null) {
                                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                                if (optJSONObject != null && optJSONObject.optString("host").equals(request.getHost()) && optJSONObject.optString("path").equals(request.getPath())) {
                                    IFeatureCore featureCore = FeatureCoreFactory.INSTANCE.getFeatureCore(this.LJLJJL);
                                    if (featureCore != null) {
                                        iKVStore = featureCore.createInMemoryKVStore(next);
                                    } else {
                                        iKVStore = null;
                                    }
                                    if (iKVStore != null && (tryGetValuesForRequest = iKVStore.tryGetValuesForRequest(C47261Igj.LJJIJ("pitaya_rs_request"))) != null) {
                                        if (tryGetValuesForRequest.length() != 0) {
                                            z2 = false;
                                        }
                                        if (!z2) {
                                            StringBuilder LIZ = X1D.LIZ();
                                            LIZ.append('\"');
                                            LIZ.append(next);
                                            LIZ.append("\": \"");
                                            LIZ.append(o.LJJJJZ(o.LJJJJZ(tryGetValuesForRequest, "\\", "\\\\", false), "\"", "\\\"", false));
                                            LIZ.append("\",");
                                            sb.append(X1D.LIZIZ(LIZ));
                                        }
                                    }
                                }
                            } else {
                                kotlin.jvm.internal.o.LJIIZILJ();
                                throw null;
                            }
                        } else {
                            if (sb.length() == 0) {
                                z = true;
                            }
                            if (z) {
                                osz = new OSZ(request, EnumC93322aP0.NotMatch);
                            } else if (sb.length() > this.LJLJJI) {
                                osz = new OSZ(request, EnumC93322aP0.HeaderOverSize);
                            } else {
                                sb.deleteCharAt(sb.length() - 1);
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("{ ");
                                LIZ2.append((Object) sb);
                                LIZ2.append(" }");
                                arrayList.add(new EJ6("pitaya-feature", X1D.LIZIZ(LIZ2)));
                                C64908Pdg newBuilder = request.newBuilder();
                                newBuilder.LIZJ = arrayList;
                                osz = new OSZ(newBuilder.LIZ(), EnumC93322aP0.Success);
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
                osz = new OSZ(request, EnumC93322aP0.ExceptionOccur);
            }
        } else {
            osz = new OSZ(request, EnumC93322aP0.IsResponseStreaming);
        }
        Request request2 = (Request) osz.getFirst();
        EnumC93322aP0 enumC93322aP0 = (EnumC93322aP0) osz.getSecond();
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        if (kotlin.jvm.internal.o.LJ(this.LJLILLLLZI, Boolean.TRUE) && (enumC93322aP0 == EnumC93322aP0.Success || enumC93322aP0 == EnumC93322aP0.HeaderOverSize || enumC93322aP0 == EnumC93322aP0.ExceptionOccur)) {
            try {
                AppLogNewUtils.onEventV3("pitaya22_upload_feature", new JSONObject().put("aid", this.LJLJJL).put("dur", uptimeMillis2).put("code", enumC93322aP0.getCode()).put("business", ORZ.LLD(this.LJLJI, ", ", null, null, null, 62)));
            } catch (Throwable unused2) {
            }
        }
        if (c64738Paw != null && (map = c64738Paw.LJJIFFI) != null) {
            ((ConcurrentHashMap) map).put("PitayaFeatureInterceptor", Long.valueOf(uptimeMillis2));
        }
        return f7s.LIZ(request2);
    }

    public C93334aPC(String aid, PTYSettingsCallback pTYSettingsCallback) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Iterator<String> keys;
        JSONObject optJSONObject;
        JSONObject settings;
        kotlin.jvm.internal.o.LJIIJ(aid, "aid");
        this.LJLJJL = aid;
        this.LJLILLLLZI = Boolean.FALSE;
        this.LJLJI = new ArrayList<>();
        this.LJLJJI = 2048;
        Boolean bool = null;
        if (pTYSettingsCallback != null && (settings = pTYSettingsCallback.getSettings("pitaya_general_settings")) != null) {
            jSONObject = settings.optJSONObject("content");
            if (jSONObject != null) {
                jSONObject2 = jSONObject.optJSONObject("rs_map");
                this.LJLIL = jSONObject2;
                if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("pitaya_global")) != null) {
                    bool = Boolean.valueOf(optJSONObject.optBoolean("enable_upload_duration"));
                }
                this.LJLILLLLZI = bool;
                if (jSONObject2 == null && (keys = jSONObject2.keys()) != null) {
                    while (keys.hasNext()) {
                        this.LJLJI.add(keys.next());
                    }
                    return;
                }
            }
        } else {
            jSONObject = null;
        }
        jSONObject2 = null;
        this.LJLIL = jSONObject2;
        if (jSONObject != null) {
            bool = Boolean.valueOf(optJSONObject.optBoolean("enable_upload_duration"));
        }
        this.LJLILLLLZI = bool;
        if (jSONObject2 == null) {
        }
    }
}
