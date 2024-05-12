package com.ss.android.ugc.aweme.fe.method.feature;

import X.AsyncTaskC86215XsZ;
import X.C04330Ez;
import X.C16880lQ;
import X.C38027EwB;
import X.C38028EwC;
import X.C38281F0r;
import X.C38333F2r;
import X.C38995FSd;
import X.C5S1;
import X.C61115Nyh;
import X.C66619QCp;
import X.C86200XsK;
import X.C86220Xse;
import X.FSY;
import X.HG3;
import X.InterfaceC61118Nyk;
import X.InterfaceC86201XsL;
import X.InterfaceC86221Xsf;
import X.RunnableC86214XsY;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.TcmImage;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public class TakePhotoFeature implements WeakHandler.IHandler, InterfaceC86201XsL {
    public WeakReference<Activity> mActivityRef;
    public String mEncryptUrl;
    public String mNameSpace;
    public InterfaceC86221Xsf mOnFileSelected;
    public Executor mTakePhotoSingleThreadPool;
    public AsyncTaskC86215XsZ mTakePhotoTask;
    public Executor mUploadPhotoSingleThreadPool;
    public C86200XsK mUploadingDialog;
    public String mImageSource = "";
    public String mImageFilePath = "";

    @Override // X.InterfaceC86201XsL
    public void cancelUpload() {
    }

    private void executeTakePhotoTask(Activity activity) {
        AsyncTaskC86215XsZ asyncTaskC86215XsZ = this.mTakePhotoTask;
        if (asyncTaskC86215XsZ != null) {
            asyncTaskC86215XsZ.cancel(false);
        }
        AsyncTaskC86215XsZ asyncTaskC86215XsZ2 = new AsyncTaskC86215XsZ(activity, this);
        this.mTakePhotoTask = asyncTaskC86215XsZ2;
        asyncTaskC86215XsZ2.executeOnExecutor(this.mTakePhotoSingleThreadPool, new Void[0]);
    }

    public static boolean hasCameraFeature(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.camera.any");
    }

    private void requestPermissionAndTakePhoto(final Activity activity) {
        C61115Nyh.LIZIZ(activity, TokenCert.with("bpea-take_photo_camera_permission"), new String[]{"android.permission.CAMERA"}, new InterfaceC61118Nyk() { // from class: X.Xsc
            @Override // X.InterfaceC61118Nyk
            public final void LIZ(int[] iArr, String[] strArr) {
                this.lambda$requestPermissionAndTakePhoto$0(activity, strArr, iArr);
            }
        });
    }

    private void tryToTakePhoto(Activity activity) {
        if (C04330Ez.LIZ(activity, "android.permission.CAMERA") == 0) {
            executeTakePhotoTask(activity);
        } else {
            requestPermissionAndTakePhoto(activity);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        List<String> list;
        Activity activity = this.mActivityRef.get();
        if (activity == null) {
            this.mOnFileSelected.LIZ(0, "uploadFailed");
            return;
        }
        Object obj = message.obj;
        if (obj instanceof C38333F2r) {
            C5S1 c5s1 = new C5S1(activity);
            c5s1.LIZLLL(((C38333F2r) message.obj).getErrorMsg());
            c5s1.LJ();
            this.mOnFileSelected.LIZ(0, "uploadFailed");
            return;
        }
        if (obj instanceof AvatarUri) {
            AvatarUri avatarUri = (AvatarUri) obj;
            if (avatarUri != null && (list = avatarUri.urlList) != null && !list.isEmpty()) {
                this.mUploadPhotoSingleThreadPool.execute(new RunnableC86214XsY(new C86220Xse((String) ListProtector.get(avatarUri.urlList, 0), avatarUri.uri, this.mImageFilePath), this.mOnFileSelected));
                return;
            } else {
                this.mOnFileSelected.LIZ(0, "uploadFailed");
                return;
            }
        }
        if (obj instanceof TcmImage) {
            TcmImage tcmImage = (TcmImage) obj;
            if (!TextUtils.isEmpty(tcmImage.getMid())) {
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("mid", tcmImage.getMid());
                    jSONArray.put(jSONObject);
                    this.mOnFileSelected.LIZJ(jSONArray);
                    return;
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                    return;
                }
            }
            this.mOnFileSelected.LIZ(0, "uploadFailed");
            return;
        }
        this.mOnFileSelected.LIZ(0, "uploadFailed");
    }

    public void setFilePath(String str) {
        this.mImageFilePath = str;
    }

    private void tryToAddPicToGallery(Context context, File file) {
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(file));
        context.sendBroadcast(intent);
        MediaScannerConnection.scanFile(context, new String[]{file.toString()}, null, null);
    }

    @Override // X.InterfaceC86201XsL
    public void handleJsInvoke(JSONObject jSONObject, boolean z) {
        Activity activity = this.mActivityRef.get();
        if (activity == null) {
            this.mOnFileSelected.LIZ(0, "uploadFailed");
            return;
        }
        if (!hasCameraFeature(activity)) {
            this.mOnFileSelected.LIZ(0, "uploadFailed");
            return;
        }
        if (new Intent("android.media.action.IMAGE_CAPTURE").resolveActivity(activity.getPackageManager()) == null) {
            this.mOnFileSelected.LIZ(0, "uploadFailed");
            return;
        }
        this.mImageSource = jSONObject.optString("source");
        this.mEncryptUrl = jSONObject.optString("encryptURL", "");
        this.mNameSpace = jSONObject.optString("nameSpace", "");
        tryToTakePhoto(activity);
    }

    public TakePhotoFeature(WeakReference<Activity> weakReference, C86200XsK c86200XsK, InterfaceC86221Xsf interfaceC86221Xsf) {
        FSY fsy = FSY.SERIAL;
        C38027EwB LIZ = C38028EwC.LIZ(fsy);
        LIZ.LIZIZ = "takephoto";
        this.mTakePhotoSingleThreadPool = C38995FSd.LIZ(LIZ.LIZ());
        C38027EwB LIZ2 = C38028EwC.LIZ(fsy);
        LIZ2.LIZIZ = "uploadphoto";
        this.mUploadPhotoSingleThreadPool = C38995FSd.LIZ(LIZ2.LIZ());
        this.mEncryptUrl = "";
        this.mNameSpace = "";
        this.mUploadingDialog = c86200XsK;
        this.mOnFileSelected = interfaceC86221Xsf;
        this.mActivityRef = weakReference;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestPermissionAndTakePhoto$0(Activity activity, String[] strArr, int[] iArr) {
        if (iArr != null && iArr.length > 0 && iArr[0] == 0) {
            executeTakePhotoTask(activity);
            return;
        }
        C5S1 c5s1 = new C5S1(activity);
        c5s1.LIZJ(R.string.jg9);
        c5s1.LJ();
        this.mOnFileSelected.LIZ(-1, "uploadFailed");
    }

    @Override // X.InterfaceC86201XsL
    public boolean onActivityResult(int i, int i2, Intent intent) {
        if (i2 == 0) {
            this.mOnFileSelected.LIZ(0, "uploadCancel");
            return true;
        }
        if (i2 == -1) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(Api.LIZIZ);
            LIZ.append("?uid=");
            LIZ.append(HG3.LJIILL().getCurUserId());
            String LIZIZ = X1D.LIZIZ(LIZ);
            if (!TextUtils.isEmpty(this.mImageSource)) {
                StringBuilder LIZJ = b1.LIZJ(LIZIZ, "&source=");
                LIZJ.append(this.mImageSource);
                LIZIZ = X1D.LIZIZ(LIZJ);
            }
            if (!TextUtils.isEmpty(this.mEncryptUrl)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(Api.LIZ);
                LIZ2.append("/");
                LIZ2.append(this.mEncryptUrl);
                LIZIZ = new C38281F0r(X1D.LIZIZ(LIZ2)).LJ();
            }
            this.mUploadingDialog.LIZIZ();
            tryToAddPicToGallery(this.mActivityRef.get(), new File(this.mImageFilePath));
            this.mUploadingDialog.LIZJ(this.mActivityRef.get());
            if (!TextUtils.isEmpty(this.mEncryptUrl)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C66619QCp("NS", this.mNameSpace));
                HG3.LJIILL().uploadAvatar(new WeakHandler(this), LIZIZ, 8388608, this.mImageFilePath, arrayList, "image_info");
            } else {
                HG3.LJIILL().uploadAvatar(new WeakHandler(this), LIZIZ, 8388608, this.mImageFilePath, null);
            }
        } else {
            this.mOnFileSelected.LIZ(0, "uploadFailed");
        }
        return true;
    }
}
