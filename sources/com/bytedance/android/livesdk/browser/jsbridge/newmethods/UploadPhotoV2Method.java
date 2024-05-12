package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import X.AbstractC32054Ci2;
import X.ActivityC45651qj;
import X.C025908h;
import X.C0NE;
import X.C16880lQ;
import X.C268613q;
import X.C28733BPl;
import X.C31947CgJ;
import X.C38131Exr;
import X.C38354F3m;
import X.DialogC31813Ce9;
import X.EnumC31874Cf8;
import X.InterfaceC65349Pkn;
import X.InterfaceC92693kP;
import X.KL2;
import X.X1D;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.TTLiveFileProvider;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class UploadPhotoV2Method extends AbstractC32054Ci2<Params, Result> {
    public String LJLJI;
    public String LJLJJI;
    public InterfaceC92693kP LJLJJL;
    public DialogC31813Ce9 LJLJJLL;
    public Params LJLJL;
    public Uri LJLJLJ;

    /* loaded from: classes6.dex */
    public static final class Params {

        @InterfaceC65349Pkn("action_type")
        public int actionType;

        @InterfaceC65349Pkn("aspect_x")
        public int aspect_x;

        @InterfaceC65349Pkn("aspect_y")
        public int aspect_y;

        @InterfaceC65349Pkn("max_size")
        public int max_size;

        @InterfaceC65349Pkn("min_height")
        public int min_height;

        @InterfaceC65349Pkn("min_width")
        public int min_width;
    }

    public final void LJJII() {
        DialogC31813Ce9 dialogC31813Ce9 = this.LJLJJLL;
        if (dialogC31813Ce9 != null && dialogC31813Ce9.isShowing()) {
            this.LJLJJLL.dismiss();
        }
        finishWithFailure();
    }

    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
        InterfaceC92693kP interfaceC92693kP = this.LJLJJL;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
        this.LJLILLLLZI = null;
        DialogC31813Ce9 dialogC31813Ce9 = this.LJLJJLL;
        if (dialogC31813Ce9 != null && dialogC31813Ce9.isShowing()) {
            this.LJLJJLL.dismiss();
        }
    }

    public final String LJJI() {
        StringBuilder LIZ = X1D.LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("upload_photo_");
        LIZ2.append(this.LJLJJI);
        LIZ.append(X1D.LIZIZ(LIZ2));
        LIZ.append(".temp");
        return X1D.LIZIZ(LIZ);
    }

    public final Uri LJJIFFI() {
        String LJJI = LJJI();
        StringBuilder LIZ = X1D.LIZ();
        File file = new File(C025908h.LIZIZ(LIZ, this.LJLJI, "/", LJJI, LIZ));
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

    public UploadPhotoV2Method(BaseFragment baseFragment) {
        super(baseFragment);
        this.LJLJI = EnumC31874Cf8.UPLOAD_PHOTO.getFullPathWithoutPostSuffix();
    }

    public UploadPhotoV2Method(SparkContext sparkContext) {
        super(sparkContext);
        this.LJLJI = EnumC31874Cf8.UPLOAD_PHOTO.getFullPathWithoutPostSuffix();
    }

    /* loaded from: classes6.dex */
    public static final class Result {

        @InterfaceC65349Pkn("image_data")
        public String imageData;

        @InterfaceC65349Pkn("uri")
        public String uri;

        @InterfaceC65349Pkn("url")
        public String url;

        public Result(String str, String str2) {
            this.uri = str;
            this.url = str2;
        }
    }

    public final void LJJIII(boolean z, Uri uri) {
        if (uri == null) {
            return;
        }
        Intent intent = new Intent("com.android.camera.action.CROP");
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
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        intent.addFlags(1);
        intent.addFlags(2);
        intent.setDataAndType(uri, "image/*");
        intent.putExtra("crop", "true");
        intent.putExtra("scale", true);
        intent.putExtra("aspectX", this.LJLJL.aspect_x);
        intent.putExtra("aspectY", this.LJLJL.aspect_y);
        intent.putExtra("return-data", false);
        intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
        intent.putExtra("noFaceDetection", true);
        intent.putExtra("scaleUpIfNeeded", true);
        Context context = this.callContext.LIZ;
        if (context != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("upload_photo_");
            LIZ.append(this.LJLJJI);
            LIZ.append("crop");
            this.LJLJLJ = C268613q.LIZJ(context, X1D.LIZIZ(LIZ));
        }
        Uri uri2 = this.LJLJLJ;
        if (uri2 != null) {
            intent.putExtra("output", uri2);
        }
        try {
            Fragment fragment = this.LJLILLLLZI;
            if (fragment != null) {
                C16880lQ.LJII(fragment, intent, 40002);
            }
        } catch (Exception unused2) {
            KL2.LIZLLL(R.string.t02, this.LJLILLLLZI.getContext());
        }
    }

    @Override // X.AbstractC38123Exj
    public final void invoke(Object obj, C38131Exr c38131Exr) {
        Params params = (Params) obj;
        this.LJLJL = params;
        this.LJLJJI = String.valueOf(System.currentTimeMillis());
        ActivityC45651qj mo49getActivity = this.LJLILLLLZI.mo49getActivity();
        int i = params.actionType;
        if (i == 0) {
            C31947CgJ.LJII(mo49getActivity, this.LJLILLLLZI, this.LJLJI, LJJI());
        } else {
            if (i != 1) {
                return;
            }
            C31947CgJ.LJIIIIZZ(40003, mo49getActivity, this.LJLILLLLZI);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b8, code lost:
    
        if (r4 != 0) goto L111;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010d  */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // X.InterfaceC31231CNn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityResult(int r15, int r16, android.content.Intent r17) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.UploadPhotoV2Method.onActivityResult(int, int, android.content.Intent):void");
    }
}
