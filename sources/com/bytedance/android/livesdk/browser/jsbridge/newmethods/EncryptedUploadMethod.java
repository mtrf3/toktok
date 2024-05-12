package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import X.AbstractC32054Ci2;
import X.ActivityC45651qj;
import X.C025908h;
import X.C03880Dg;
import X.C09650Zl;
import X.C0NB;
import X.C0NE;
import X.C15380j0;
import X.C1B6;
import X.C28467BFf;
import X.C28733BPl;
import X.C29306Beo;
import X.C31767CdP;
import X.C31867Cf1;
import X.C31869Cf3;
import X.C31872Cf6;
import X.C31873Cf7;
import X.C31878CfC;
import X.C31880CfE;
import X.C31947CgJ;
import X.C31950CgM;
import X.C38131Exr;
import X.C38354F3m;
import X.C65123Ph9;
import X.C65124PhA;
import X.C65300Pk0;
import X.C77276UUm;
import X.DialogC31813Ce9;
import X.EnumC31874Cf8;
import X.InterfaceC65349Pkn;
import X.InterfaceC92693kP;
import X.JBR;
import X.KL2;
import X.X1D;
import Y.AObjectS42S0101000_5;
import android.content.ContentUris;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.livesdk.TTLiveFileProvider;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.utils.crop.CropFragment;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.google.gson.Gson;
import com.zhiliaoapp.musically.R;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class EncryptedUploadMethod extends AbstractC32054Ci2<JSONObject, Result> {
    public String LJLJI;
    public InterfaceC92693kP LJLJJI;
    public DialogC31813Ce9 LJLJJL;
    public C38131Exr LJLJJLL;
    public String LJLJL;
    public String LJLJLJ;
    public JSONObject LJLJLLL;

    /* loaded from: classes6.dex */
    public static final class Data {

        @InterfaceC65349Pkn("local_img")
        public String local_img;

        @InterfaceC65349Pkn("local_url")
        public String local_url;

        @InterfaceC65349Pkn("uri")
        public String uri;
    }

    public static void LJJI(DialogC31813Ce9 dialogC31813Ce9) {
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/dialog/LiveLoadingDialog", "show", dialogC31813Ce9, new Object[0], "void", new C65300Pk0(false, "()V", "4347080061590525804")).LIZ) {
            return;
        }
        dialogC31813Ce9.show();
    }

    public final void LJJIIJ() {
        DialogC31813Ce9 dialogC31813Ce9 = this.LJLJJL;
        if (dialogC31813Ce9 != null && dialogC31813Ce9.isShowing()) {
            this.LJLJJL.dismiss();
        }
    }

    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
        InterfaceC92693kP interfaceC92693kP = this.LJLJJI;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
        this.LJLILLLLZI = null;
        this.LJLJJLL = null;
    }

    public final String LJJIFFI() {
        StringBuilder LIZ = X1D.LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("upload_photo_");
        LIZ2.append(this.LJLJL);
        LIZ.append(X1D.LIZIZ(LIZ2));
        LIZ.append(".jpeg");
        return X1D.LIZIZ(LIZ);
    }

    public final Uri LJJII() {
        String LJJIFFI = LJJIFFI();
        StringBuilder LIZ = X1D.LIZ();
        File file = new File(C025908h.LIZIZ(LIZ, this.LJLJI, "/", LJJIFFI, LIZ));
        if (!file.exists()) {
            try {
                File file2 = new File(this.LJLJI);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file.createNewFile();
            } catch (IOException e) {
                C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
                StackTraceElement[] stackTrace = e.getStackTrace();
                LJIILIIL.getClass();
                C0NE.LJIIL(6, stackTrace);
            }
        }
        ActivityC45651qj mo49getActivity = this.LJLILLLLZI.mo49getActivity();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJLILLLLZI.mo49getActivity().getPackageName());
        LIZ2.append(TTLiveFileProvider.NAME);
        return FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(mo49getActivity, X1D.LIZIZ(LIZ2), file);
    }

    public final void LJJIIJZLJL() {
        LJJIIJ();
        finishWithResult(new Result(1, 1, C15380j0.LJIILJJIL(R.string.sq2), new Data()));
    }

    public final void LJJIIZ() {
        LJJIIJ();
        finishWithResult(new Result(1, 1, C15380j0.LJIILJJIL(R.string.sq2), new Data()));
    }

    /* loaded from: classes6.dex */
    public static final class Result {

        @InterfaceC65349Pkn("code")
        public int code;

        @InterfaceC65349Pkn("data")
        public Data data;

        @InterfaceC65349Pkn("status")
        public int status;

        @InterfaceC65349Pkn("status_msg")
        public String status_msg;

        public Result() {
        }

        public Result(int i, int i2, String str, Data data) {
            this.code = i;
            this.status = i2;
            this.status_msg = str;
            this.data = data;
        }
    }

    public EncryptedUploadMethod(BaseFragment baseFragment) {
        super(baseFragment);
        this.LJLJI = EnumC31874Cf8.UPLOAD_ENCRYPT_PHOTO.getFullPathWithoutPostSuffix();
    }

    public EncryptedUploadMethod(SparkContext sparkContext) {
        super(sparkContext);
        this.LJLJI = EnumC31874Cf8.UPLOAD_ENCRYPT_PHOTO.getFullPathWithoutPostSuffix();
    }

    public final void LJJIII(boolean z, Uri uri) {
        if (uri == null) {
            return;
        }
        if (!z) {
            try {
                String lastPathSegment = uri.getLastPathSegment();
                if (!C38354F3m.LJ(lastPathSegment) && lastPathSegment.contains(":")) {
                    lastPathSegment = lastPathSegment.split(":")[1];
                }
                try {
                    uri = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, CastLongProtector.parseLong(lastPathSegment));
                } catch (NumberFormatException unused) {
                }
            } catch (Exception unused2) {
                return;
            }
        }
        o.LJIIIZ(uri, "uri");
        CropFragment LIZ = C31878CfC.LIZ(false, uri);
        LIZ.LJLJJLL = new AObjectS42S0101000_5(2, this, 35);
        LIZ.show(this.LJLILLLLZI.getChildFragmentManager(), "upload_photo");
    }

    @Override // X.AbstractC38123Exj
    public final void invoke(Object obj, C38131Exr c38131Exr) {
        String[] strArr;
        String[] strArr2;
        JSONObject jSONObject = (JSONObject) obj;
        this.LJLJJLL = c38131Exr;
        String optString = jSONObject.optString("type");
        JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "args");
        if (jSONObject2 == null) {
            finishWithResult(new Result(1, 4, C15380j0.LJIILJJIL(R.string.szf), new Data()));
            return;
        }
        int optInt = jSONObject2.optInt("action_type", 0);
        this.LJLJLJ = jSONObject2.optString("url");
        this.LJLJLLL = new JSONObject();
        int i = -1;
        if (JSONObjectProtectorUtils.getJSONObject(jSONObject2, "params") != null) {
            JSONObject jSONObject3 = JSONObjectProtectorUtils.getJSONObject(jSONObject2, "params");
            this.LJLJLLL = jSONObject3;
            i = jSONObject3.optInt("encrypt", -1);
        }
        if (TextUtils.isEmpty(this.LJLJLJ) || (!this.LJLJLJ.startsWith("https") && i == 1)) {
            finishWithResult(new Result(1, 5, C15380j0.LJIILJJIL(R.string.sq3), new Data()));
            return;
        }
        ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(c38131Exr.LIZ);
        if (LIZIZ != null && TextUtils.equals("video", optString)) {
            if (optInt == 0) {
                if (Build.VERSION.SDK_INT >= 33) {
                    strArr2 = new String[]{"android.permission.CAMERA", "android.permission.READ_MEDIA_VIDEO"};
                } else {
                    strArr2 = new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"};
                }
                new C77276UUm(LIZIZ, TokenCert.with("bpea-webcast-hybrid-upload-jsb-invoke-take")).LIZ(new C31872Cf6(this, jSONObject2, c38131Exr), strArr2);
                return;
            }
            if (optInt != 1) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                strArr = new String[]{"android.permission.READ_MEDIA_VIDEO"};
            } else {
                strArr = new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
            }
            new C77276UUm(LIZIZ, TokenCert.with("bpea-webcast-hybrid-upload-jsb-invoke-select")).LIZ(new C31869Cf3(this, jSONObject2, c38131Exr), strArr);
            return;
        }
        if (!TextUtils.equals("picture", optString)) {
            return;
        }
        this.LJLJL = String.valueOf(System.currentTimeMillis());
        jSONObject2.optInt("min_width");
        jSONObject2.optInt("min_height");
        jSONObject2.optInt("aspect_x", 1);
        jSONObject2.optInt("aspect_y", 1);
        ActivityC45651qj mo49getActivity = this.LJLILLLLZI.mo49getActivity();
        if (optInt == 0) {
            C31947CgJ.LJII(mo49getActivity, this.LJLILLLLZI, this.LJLJI, LJJIFFI());
        } else {
            if (optInt != 1) {
                return;
            }
            C31947CgJ.LJIIIIZZ(40003, mo49getActivity, this.LJLILLLLZI);
        }
    }

    public final C28467BFf LJJIIZI(String str, JSONObject jSONObject, byte[] bArr) {
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("upload_photo_");
        multipartTypedOutput.addPart("data", new TypedByteArray("multipart/form-data", bArr, JBR.LJFF(LIZ, this.LJLJL, "crop", LIZ)));
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
        } catch (IOException e) {
            C0NB.LJFF("EncryptedUploadMethod", "uploadFile", e);
        }
        String uri = buildUpon.build().toString();
        C0NB.LIZIZ("EncryptedUploadMethod", uri);
        C65124PhA LIZLLL = C65124PhA.LIZLLL();
        ArrayList arrayList = new ArrayList(1);
        String mimeType = multipartTypedOutput.mimeType();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        long length = multipartTypedOutput.length();
        String md5Stub = multipartTypedOutput.md5Stub();
        LIZLLL.getClass();
        String str2 = new String(((C65123Ph9) C65124PhA.LJI(-1, uri, arrayList, mimeType, byteArray, length, md5Stub)).LIZ().LJ);
        Gson gson = C09650Zl.LIZIZ;
        C28467BFf c28467BFf = (C28467BFf) GsonProtectorUtils.fromJson(gson, str2, new C31873Cf7().getType());
        try {
            if (c28467BFf.statusCode != 0) {
                c28467BFf.LJ = (RequestError) GsonProtectorUtils.fromJson(gson, JSONObjectProtectorUtils.getJSONObject(new JSONObject(str2), "data").toString(), RequestError.class);
            }
        } catch (JSONException e2) {
            C0NB.LJFF("EncryptedUploadMethod", "uploadFile", e2);
        }
        return c28467BFf;
    }

    @Override // X.InterfaceC31231CNn
    public final void onActivityResult(int i, int i2, Intent intent) {
        String[] strArr;
        if (9001 == i || 9002 == i) {
            if (-1 != i2) {
                finishWithResult(new Result(1, 2, C15380j0.LJIILJJIL(R.string.sq1), new Data()));
                return;
            }
            if (intent == null || intent.getData() == null) {
                LJJIIZ();
                return;
            }
            ActivityC45651qj mo49getActivity = this.LJLILLLLZI.mo49getActivity();
            if (mo49getActivity == null) {
                LJJIIZ();
                return;
            }
            byte[] LIZLLL = C31880CfE.LIZLLL(mo49getActivity, intent.getData());
            C31767CdP c31767CdP = new C31767CdP(mo49getActivity);
            c31767CdP.LIZIZ = C15380j0.LJIILJJIL(R.string.swm);
            c31767CdP.LIZJ = false;
            DialogC31813Ce9 LIZ = c31767CdP.LIZ();
            this.LJLJJL = LIZ;
            LJJI(LIZ);
            if (Build.VERSION.SDK_INT >= 33) {
                strArr = new String[]{"android.permission.READ_MEDIA_VIDEO"};
            } else {
                strArr = new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
            }
            new C77276UUm(this.LJLILLLLZI.mo49getActivity(), TokenCert.with("bpea-webcast-hybrid-upload-jsb-real-upload")).LIZ(new C31867Cf1(this, LIZLLL, intent), strArr);
            return;
        }
        if (i == 40003) {
            if (-1 != i2) {
                finishWithResult(new Result(1, 2, C15380j0.LJIILJJIL(R.string.sq1), new Data()));
                return;
            }
            if (intent == null || intent.getData() == null) {
                LJJIIJZLJL();
                return;
            }
            ActivityC45651qj mo49getActivity2 = this.LJLILLLLZI.mo49getActivity();
            if (mo49getActivity2 == null) {
                LJJIIJZLJL();
                return;
            }
            Uri data = intent.getData();
            String LIZJ = C31950CgM.LIZJ(mo49getActivity2, data);
            if (C38354F3m.LJ(LIZJ)) {
                LJJIIJZLJL();
                return;
            } else {
                if (!C1B6.LIZIZ(LIZJ)) {
                    LJJIIJZLJL();
                    return;
                }
                if ("file".equals(data.getScheme())) {
                    data = C31950CgM.LIZIZ(mo49getActivity2, LIZJ);
                }
                LJJIII(false, data);
                return;
            }
        }
        if (i == 40004) {
            if (-1 != i2) {
                finishWithResult(new Result(1, 2, C15380j0.LJIILJJIL(R.string.sq1), new Data()));
                return;
            } else {
                try {
                    LJJIII(true, LJJII());
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
        }
        if (i == 40002) {
            if (-1 != i2) {
                finishWithResult(new Result(1, 2, C15380j0.LJIILJJIL(R.string.sq1), new Data()));
                return;
            }
            ActivityC45651qj mo49getActivity3 = this.LJLILLLLZI.mo49getActivity();
            if (mo49getActivity3 == null) {
                LJJIIJZLJL();
            } else {
                KL2.LJ(mo49getActivity3, R.drawable.cpa, mo49getActivity3.getString(R.string.t00));
                LJJIIJZLJL();
            }
        }
    }
}
