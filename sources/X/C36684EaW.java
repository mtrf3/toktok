package X;

import android.text.TextUtils;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.io.OutputStream;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.EaW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36684EaW implements TypedOutput {
    public final String LIZ = "params.txt";
    public final java.util.Map<String, String> LIZIZ;
    public final String LIZJ;

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final String md5Stub() {
        return null;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final String mimeType() {
        return "text/plain";
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final String fileName() {
        String str = this.LIZ;
        java.util.Map<String, String> map = this.LIZIZ;
        StringBuilder sb = new StringBuilder(str);
        sb.append("\"");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            YE1.LIZLLL(sb, "; ", entry.getKey(), "=\"", entry.getValue());
            sb.append("\"");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final long length() {
        return this.LIZJ.getBytes().length;
    }

    @Override // com.bytedance.retrofit2.mime.TypedOutput
    public final void writeTo(OutputStream outputStream) {
        outputStream.write(this.LIZJ.getBytes());
    }

    public C36684EaW(String str, java.util.Map map) {
        this.LIZIZ = map;
        if (TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("defaultData", "none commonParams");
            } catch (JSONException unused) {
            }
            this.LIZJ = jSONObject.toString();
            return;
        }
        this.LIZJ = str;
    }
}
