package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.sticker.channel.download.DownloadRequest;
import com.ss.android.ugc.aweme.sticker.channel.download.DownloadResult;
import java.io.File;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.ICl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46231ICl extends AbstractC39622Fgo {
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final C62822Ol8 LJ;

    @Override // X.AbstractC39622Fgo
    public final boolean LIZ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC39622Fgo
    public final String LIZIZ() {
        return this.LIZIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46231ICl(WRQ cameraApiComponent) {
        super(cameraApiComponent);
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        this.LIZIZ = "download";
        this.LIZJ = true;
        this.LIZLLL = ((Boolean) C52398KhO.LIZ.getValue()).booleanValue();
        this.LJ = C221108m2.LIZIZ(C46233ICn.LJLIL);
    }

    @Override // X.AbstractC39622Fgo
    public final void LIZJ(int i, String str) {
        JSONArray optJSONArray;
        if (str == null || (optJSONArray = new JSONObject(str).optJSONArray("data")) == null) {
            return;
        }
        LinkedHashMap<DownloadRequest, DownloadResult> linkedHashMap = new LinkedHashMap<>();
        Type type = new C46234ICo().getType();
        if (!this.LIZLLL) {
            Object fromJson = GsonProtectorUtils.fromJson(C44172HVg.LIZIZ, optJSONArray.toString(), type);
            o.LJIIIIZZ(fromJson, "GSON.fromJson<List<Downl…son.toString(), itemType)");
            for (DownloadRequest downloadRequest : (Iterable) fromJson) {
                linkedHashMap.put(downloadRequest, null);
                LJFF(i, downloadRequest, 0, linkedHashMap);
            }
            return;
        }
        Object fromJson2 = GsonProtectorUtils.fromJson(C44172HVg.LIZIZ, optJSONArray.toString(), type);
        o.LJIIIIZZ(fromJson2, "GSON.fromJson<List<Downl…son.toString(), itemType)");
        for (DownloadRequest downloadRequest2 : (Iterable) fromJson2) {
            linkedHashMap.put(downloadRequest2, null);
            if (!downloadRequest2.url.isEmpty()) {
                String str2 = (String) ListProtector.get(downloadRequest2.url, 0);
                if (((IAVEffectService) this.LJ.getValue()).checkUrlValid(str2) == 1) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("EffectFileDownloadHandler, perform download, url=");
                    LIZ.append(str2);
                    H78.LIZIZ("JEFF", X1D.LIZIZ(LIZ));
                    LJFF(i, downloadRequest2, 0, linkedHashMap);
                } else {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("EffectFileDownloadHandler, download intercepted, url=");
                    LIZ2.append(str2);
                    H78.LIZIZ("JEFF", X1D.LIZIZ(LIZ2));
                    linkedHashMap.put(downloadRequest2, new DownloadResult("", 2));
                    LJ(i, linkedHashMap);
                }
            }
        }
    }

    public final void LJ(int i, LinkedHashMap<DownloadRequest, DownloadResult> linkedHashMap) {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry<DownloadRequest, DownloadResult> entry : linkedHashMap.entrySet()) {
            if (entry.getValue() == null) {
                return;
            }
            DownloadResult value = entry.getValue();
            o.LJI(value);
            DownloadResult downloadResult = value;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", downloadResult.path);
            jSONObject.put("success", downloadResult.success);
            jSONArray.put(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("interface", this.LIZIZ);
        jSONObject2.put("file_paths", jSONArray);
        String jSONObject3 = jSONObject2.toString();
        o.LJIIIIZZ(jSONObject3, "generateResponse(pathsArray).toString()");
        LIZLLL(i, jSONObject3);
    }

    public final void LJFF(int i, DownloadRequest downloadRequest, int i2, LinkedHashMap<DownloadRequest, DownloadResult> linkedHashMap) {
        String str;
        if (i2 >= downloadRequest.url.size() || (str = (String) ListProtector.get(downloadRequest.url, i2)) == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C43075GvP.LJIILL);
        LIZ.append((int) ((short) str.hashCode()));
        LIZ.append(File.separator);
        C60903NvH.LJIIJJI().LIZLLL().downloadFile(str, X1D.LIZIZ(LIZ), (String) ORZ.LLFF(s.LJLJJL(str, new String[]{"/"}, 0, 6)), new C46232ICm(downloadRequest, linkedHashMap, this, i, i2));
    }
}
