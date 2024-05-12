package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import X.AbstractC38123Exj;
import X.AbstractC73672Svk;
import X.C09650Zl;
import X.C16880lQ;
import X.C1EW;
import X.C28467BFf;
import X.C31880CfE;
import X.C31937Cg9;
import X.C38131Exr;
import X.C65123Ph9;
import X.C65124PhA;
import X.C65126PhC;
import X.C73674Svm;
import X.InterfaceC65349Pkn;
import X.InterfaceC86003Zc;
import X.InterfaceC92693kP;
import X.X1D;
import Y.ARunnableS0S1400000_5;
import Y.IDhS3S1000000_5;
import Y.IDxS129S0200000_5;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.android.live.base.model.user.UploadResult;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.UploadImageMethod;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.google.gson.Gson;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class UploadImageMethod extends AbstractC38123Exj<JSONObject, Result> {
    public InterfaceC92693kP LJLIL;
    public JSONObject LJLILLLLZI;
    public String LJLJI;
    public int LJLJJI;

    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
        InterfaceC92693kP interfaceC92693kP = this.LJLIL;
        if (interfaceC92693kP != null && !interfaceC92693kP.isDisposed()) {
            this.LJLIL.dispose();
        }
    }

    /* loaded from: classes6.dex */
    public static final class Result {

        @InterfaceC65349Pkn("imageList")
        public ImageResult[] imageList;

        /* loaded from: classes6.dex */
        public static final class ImageResult {

            @InterfaceC65349Pkn("path")
            public String path;

            @InterfaceC65349Pkn("status")
            public int status = 1;

            @InterfaceC65349Pkn("url")
            public String url;
        }

        public Result(ImageResult[] imageResultArr) {
            this.imageList = imageResultArr;
        }
    }

    @Override // X.AbstractC38123Exj
    public final void invoke(JSONObject jSONObject, C38131Exr c38131Exr) {
        final byte[] decode;
        final String LIZIZ;
        JSONObject jSONObject2 = jSONObject;
        this.LJLILLLLZI = JSONObjectProtectorUtils.getJSONObject(jSONObject2, "params");
        this.LJLJI = JSONObjectProtectorUtils.getString(jSONObject2, "url");
        JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject2, "imageList");
        String string = JSONObjectProtectorUtils.getString(jSONObject2, "type");
        this.LJLJJI = 0;
        ArrayList arrayList = new ArrayList();
        Result.ImageResult[] imageResultArr = new Result.ImageResult[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                String string2 = JSONArrayProtectorUtils.getString(jSONArray, i);
                final Result.ImageResult imageResult = new Result.ImageResult();
                imageResult.path = string2;
                imageResultArr[i] = imageResult;
                if (string.equals("path")) {
                    JSONObject jSONObject3 = new JSONObject(string2);
                    decode = C31880CfE.LIZIZ(new File(JSONObjectProtectorUtils.getString(jSONObject3, "uri")));
                    LIZIZ = JSONObjectProtectorUtils.getString(jSONObject3, "file_name");
                } else {
                    decode = Base64.decode(string2, 0);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("upload_photo_");
                    LIZ.append(i);
                    LIZ.append("_");
                    LIZ.append(System.currentTimeMillis());
                    LIZIZ = X1D.LIZIZ(LIZ);
                }
                if (decode != null) {
                    arrayList.add(AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.Cg8
                        @Override // X.InterfaceC86003Zc
                        public final void subscribe(InterfaceC73573Su9 interfaceC73573Su9) {
                            UploadImageMethod uploadImageMethod = UploadImageMethod.this;
                            byte[] bArr = decode;
                            String str = LIZIZ;
                            UploadImageMethod.Result.ImageResult imageResult2 = imageResult;
                            uploadImageMethod.getClass();
                            C38995FSd.LIZLLL().submit(new ARunnableS0S1400000_5(uploadImageMethod, (C73433Srt) interfaceC73573Su9, bArr, imageResult2, str, 0));
                        }
                    }).LJJIJL(new IDhS3S1000000_5(string2, 1)));
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        C1EW.LIZ(AbstractC73672Svk.LJJIIZ(arrayList).LJJIII(C73674Svm.LIZ, true)).LIZ(new IDxS129S0200000_5(this, imageResultArr, 0));
    }

    public final C28467BFf<UploadResult> LJJI(String str, byte[] bArr, String str2, Result.ImageResult imageResult) {
        JSONObject jSONObject = this.LJLILLLLZI;
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        multipartTypedOutput.addPart("data", new TypedByteArray("multipart/form-data", bArr, str2));
        Uri.Builder buildUpon = UriProtector.parse(str).buildUpon();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                buildUpon.appendQueryParameter(next, String.valueOf(jSONObject.opt(next)));
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            multipartTypedOutput.writeTo(byteArrayOutputStream);
        } catch (IOException unused) {
        }
        String uri = buildUpon.build().toString();
        C65124PhA LIZLLL = C65124PhA.LIZLLL();
        ArrayList arrayList = new ArrayList(1);
        String mimeType = multipartTypedOutput.mimeType();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        long length = multipartTypedOutput.length();
        String md5Stub = multipartTypedOutput.md5Stub();
        LIZLLL.getClass();
        C65126PhC LIZ = ((C65123Ph9) C65124PhA.LJI(-1, uri, arrayList, mimeType, byteArray, length, md5Stub)).LIZ();
        String str3 = new String(LIZ.LJ);
        if (LIZ.LIZIZ == 200) {
            Gson gson = C09650Zl.LIZIZ;
            C28467BFf<UploadResult> c28467BFf = (C28467BFf) GsonProtectorUtils.fromJson(gson, str3, new C31937Cg9().getType());
            try {
                if (c28467BFf.statusCode != 0) {
                    c28467BFf.LJ = (RequestError) GsonProtectorUtils.fromJson(gson, JSONObjectProtectorUtils.getJSONObject(new JSONObject(str3), "data").toString(), RequestError.class);
                }
            } catch (JSONException unused2) {
            }
            UploadResult uploadResult = c28467BFf.data;
            if (uploadResult != null && !TextUtils.isEmpty(uploadResult.uri)) {
                imageResult.url = c28467BFf.data.uri;
                imageResult.status = 0;
            }
            return c28467BFf;
        }
        throw new Exception();
    }
}
