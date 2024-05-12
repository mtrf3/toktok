package X;

import Y.IDhS3S1000000_5;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Base64;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.livesdk.comp.api.game.data.GameUploadResult;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.google.gson.Gson;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Cha, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32026Cha extends AbstractC32030Che {
    public InterfaceC92693kP LJLJJL;
    public java.util.Map<String, ? extends Object> LJLJJLL;
    public String LJLJL;
    public CompletionBlock<InterfaceC32031Chf> LJLJLJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Object, java.lang.String] */
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Activity LIZLLL;
        InterfaceC32029Chd interfaceC32029Chd = (InterfaceC32029Chd) xBaseParamModel;
        o.LJIIIZ(type, "type");
        this.LJLJJLL = interfaceC32029Chd.getParams();
        this.LJLJL = interfaceC32029Chd.getUrl();
        List<String> imageList = interfaceC32029Chd.getImageList();
        this.LJLJLJ = c37356ElM;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = imageList.size();
        for (int i = 0; i < size; i++) {
            try {
                C68322mC c68322mC = new C68322mC();
                String str = (String) ListProtector.get(imageList, i);
                byte[] bArr = null;
                InterfaceC32032Chg interfaceC32032Chg = (InterfaceC32032Chg) ED5.LIZJ(InterfaceC32032Chg.class, null);
                arrayList2.add(interfaceC32032Chg);
                if (o.LJ(interfaceC32029Chd.getType(), "path")) {
                    JSONObject jSONObject = new JSONObject(str);
                    InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
                    if (interfaceC38263Ezz != null && (LIZLLL = interfaceC38263Ezz.LIZLLL()) != null) {
                        Bitmap decodeStream = BitmapFactory.decodeStream(LIZLLL.getContentResolver().openInputStream(UriProtector.parse(JSONObjectProtectorUtils.getString(jSONObject, "uri"))));
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        decodeStream.compress(Bitmap.CompressFormat.JPEG, 50, byteArrayOutputStream);
                        bArr = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.flush();
                        byteArrayOutputStream.close();
                    }
                    ?? string = JSONObjectProtectorUtils.getString(jSONObject, "file_name");
                    o.LJIIIIZZ(string, "jsonObject.getString(\"file_name\")");
                    c68322mC.element = string;
                } else {
                    bArr = Base64.decode(str, 0);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("upload_photo_");
                    LIZ.append(i);
                    LIZ.append('_');
                    LIZ.append(System.currentTimeMillis());
                    c68322mC.element = X1D.LIZIZ(LIZ);
                }
                interfaceC32032Chg.setPath((String) c68322mC.element);
                if (bArr != null) {
                    interfaceC32032Chg.setSize(String.valueOf(bArr.length));
                    arrayList.add(AbstractC73672Svk.LJIIJ(new C32028Chc(this, bArr, c68322mC, interfaceC32032Chg)).LJJIJL(new IDhS3S1000000_5(str, 0)));
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
        C1EW.LIZ(AbstractC73672Svk.LJJIIZ(arrayList).LJJIII(C73674Svm.LIZ, true)).LIZ(new C32027Chb(this, c37356ElM, arrayList2));
    }

    public final C28467BFf<GameUploadResult> LJII(String str, byte[] bArr, String str2, InterfaceC32032Chg interfaceC32032Chg) {
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("file", new TypedByteArray("multipart/form-data", bArr, str2));
        Uri.Builder buildUpon = UriProtector.parse(str).buildUpon();
        java.util.Map<String, ? extends Object> map = this.LJLJJLL;
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                buildUpon.appendQueryParameter(entry.getKey(), (String) entry.getValue());
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            multipartTypedOutput.writeTo(byteArrayOutputStream);
        } catch (IOException unused) {
        }
        String uri = buildUpon.build().toString();
        o.LJIIIIZZ(uri, "formatUriBuilder.build().toString()");
        C65124PhA LIZLLL = C65124PhA.LIZLLL();
        ArrayList arrayList = new ArrayList(1);
        String mimeType = multipartTypedOutput.mimeType();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        long length = multipartTypedOutput.length();
        String md5Stub = multipartTypedOutput.md5Stub();
        LIZLLL.getClass();
        C65126PhC LIZ = ((C65123Ph9) C65124PhA.LJI(-1, uri, arrayList, mimeType, byteArray, length, md5Stub)).LIZ();
        byte[] bArr2 = LIZ.LJ;
        o.LJIIIIZZ(bArr2, "httpResponse.body");
        String str3 = new String(bArr2, PVC.LIZ);
        if (LIZ.LIZIZ == 200) {
            Gson gson = C09650Zl.LIZIZ;
            C28467BFf<GameUploadResult> c28467BFf = (C28467BFf) GsonProtectorUtils.fromJson(gson, str3, new C32033Chh().getType());
            if (c28467BFf.statusCode != 0) {
                try {
                    c28467BFf.LJ = (RequestError) GsonProtectorUtils.fromJson(gson, JSONObjectProtectorUtils.getJSONObject(new JSONObject(str3), "data").toString(), RequestError.class);
                } catch (JSONException unused2) {
                }
            } else {
                GameUploadResult gameUploadResult = c28467BFf.data;
                if (gameUploadResult != null) {
                    interfaceC32032Chg.setUri(gameUploadResult.uri);
                    interfaceC32032Chg.setUrl(gameUploadResult.url);
                }
            }
            return c28467BFf;
        }
        throw new Exception();
    }
}
