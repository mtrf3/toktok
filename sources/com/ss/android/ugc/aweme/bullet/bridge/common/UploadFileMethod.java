package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C00S;
import X.C08200Tw;
import X.C10K;
import X.C16880lQ;
import X.C1B6;
import X.C1FJ;
import X.C26045AKb;
import X.C268513p;
import X.C36922EeM;
import X.C37246Eja;
import X.C37247Ejb;
import X.C38048EwW;
import X.C38049EwX;
import X.C38333F2r;
import X.C38354F3m;
import X.C38891fp;
import X.C40680Fxs;
import X.C43115Gw3;
import X.C45804HyK;
import X.C61115Nyh;
import X.C76800UCe;
import X.C79023Uzr;
import X.C81060Vrc;
import X.C86206XsQ;
import X.EF7;
import X.EnumC81057VrZ;
import X.F0S;
import X.F3T;
import X.HG3;
import X.InterfaceC27436Apk;
import X.InterfaceC37146Ehy;
import X.InterfaceC61118Nyk;
import X.InterfaceC65784Pro;
import X.KL2;
import X.OGC;
import X.OX9;
import X.OXE;
import X.OXF;
import X.OXG;
import X.RBX;
import X.UPJ;
import X.X1D;
import X.Z8A;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.UploadFileMethod;
import com.ss.android.ugc.aweme.fe.method.H5UploadFileMethod;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v5.n;

/* loaded from: classes16.dex */
public class UploadFileMethod extends BaseBridgeMethod implements OX9, InterfaceC27436Apk {
    public F3T contextProviderFactory;
    public boolean isCancelUpload;
    public boolean isMultiSelect;
    public SparseArray<AvatarUri> mAvatarUriList;
    public WeakReference<Context> mContextRef;
    public List<String> mFileBase64List;
    public List<String> mFileNameList;
    public String mFrom;
    public List<WeakHandler.IHandler> mIHandlerList;
    public String mImageSource;
    public int mImageWidth;
    public AtomicInteger mMultiUploadFailNum;
    public AtomicInteger mMultiUploadSuccessNum;
    public InterfaceC65784Pro<C76800UCe> mOnUploadFinishedListener;
    public InterfaceC37146Ehy mReturn;
    public boolean mSkipImgBase64;
    public String mUploadFileName;
    public int maxSelectNum;
    public int minImageHeight;
    public int minImageWidth;
    public boolean needBase64Response;
    public boolean needCrop;
    public long originalImageMaxSize;
    public float rectRatio;
    public boolean shouldWithCamera;

    @Override // X.InterfaceC38217EzF
    public String getName() {
        return "uploadFile";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.OX9
    public void releaseListener() {
        this.mOnUploadFinishedListener = null;
    }

    private C10K<String> compressUploadImageTask() {
        final n nVar = new n();
        try {
            try {
                if (!this.mSkipImgBase64 && C268513p.LIZLLL(EF7.LIZIZ(), Uri.parse(this.mUploadFileName)) != null) {
                    AVExternalServiceImpl.LIZ().abilityService().processService().compressPhoto(this.mUploadFileName, 216, 384, new IAVProcessService.IProcessCallback() { // from class: X.XsU
                        @Override // com.ss.android.ugc.aweme.services.external.ability.IAVProcessService.IProcessCallback
                        public final void finish(Object obj) {
                            n.this.LJ(obj);
                        }
                    });
                } else {
                    nVar.LJ(null);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                nVar.LJ(null);
            }
            this.mSkipImgBase64 = false;
            this.mUploadFileName = "";
            return nVar.LIZ;
        } catch (Throwable th) {
            this.mSkipImgBase64 = false;
            this.mUploadFileName = "";
            throw th;
        }
    }

    @Override // X.OX9
    public void cancelMultiUpload() {
        this.mReturn.LIZ(0, "H5_uploadFileCancel");
        this.isCancelUpload = true;
    }

    public UploadFileMethod(F3T f3t) {
        super(f3t);
        this.mImageSource = "";
        this.mFileNameList = new ArrayList();
        this.mFileBase64List = new ArrayList();
        this.originalImageMaxSize = Long.MAX_VALUE;
        this.needCrop = false;
        this.rectRatio = 1.0f;
        this.minImageWidth = 0;
        this.minImageHeight = 0;
        this.needBase64Response = false;
        this.contextProviderFactory = f3t;
        if (getContext() != null) {
            this.mContextRef = new WeakReference<>(getContext());
        }
    }

    private void prepareIHandler(int i) {
        this.mIHandlerList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            this.mIHandlerList.add(new C86206XsQ(this, i2));
        }
    }

    public JSONArray buildMultiObject(SparseArray<AvatarUri> sparseArray) {
        String str;
        Object obj;
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            JSONObject jSONObject = new JSONObject();
            if (sparseArray.get(i) != null && C38891fp.LJJIFFI(sparseArray.get(i).urlList)) {
                str = sparseArray.get(i).uri;
                obj = ListProtector.get(sparseArray.get(i).urlList, 0);
            } else {
                str = "";
                obj = "";
            }
            try {
                jSONObject.put("url", obj);
                jSONObject.put("uri", str);
                if (i < this.mFileBase64List.size()) {
                    jSONObject.put("img_base64", ListProtector.get(this.mFileBase64List, i));
                }
                jSONArray.put(jSONObject);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return jSONArray;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        Context context = this.mContextRef.get();
        if (context != null) {
            Activity LJIJJ = C45804HyK.LJIJJ(context);
            Object obj = message.obj;
            if ((obj instanceof C38333F2r) && LJIJJ != null) {
                C1FJ.LJI((C38333F2r) message.obj, new C26045AKb(LJIJJ));
                buildObject(0, "", "");
                return;
            }
            if (obj instanceof AvatarUri) {
                AvatarUri avatarUri = (AvatarUri) obj;
                List<String> list = avatarUri.urlList;
                if (list != null && !list.isEmpty()) {
                    try {
                        this.mReturn.LIZJ(1, "H5_uploadFile", buildObject(1, (String) ListProtector.get(avatarUri.urlList, 0), avatarUri.uri));
                        return;
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                        return;
                    }
                }
                buildObject(0, "", "");
                try {
                    this.mReturn.LIZ(0, "H5_uploadFileFailed");
                    return;
                } catch (Exception e2) {
                    C16880lQ.LLLLIIL(e2);
                    return;
                }
            }
            buildObject(0, "", "");
            try {
                this.mReturn.LIZ(0, "H5_uploadFileFailed");
            } catch (Exception e3) {
                C16880lQ.LLLLIIL(e3);
            }
        }
    }

    public void startGalleryActivity(final Activity activity) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 33) {
            arrayList.add("android.permission.READ_MEDIA_IMAGES");
            arrayList.add("android.permission.READ_MEDIA_VIDEO");
        } else {
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        C61115Nyh.LIZIZ(activity, TokenCert.with("bpea-upload_file_bullet_start_gallery_activity_permission"), (String[]) arrayList.toArray(new String[arrayList.size()]), new InterfaceC61118Nyk() { // from class: X.XsR
            @Override // X.InterfaceC61118Nyk
            public final void LIZ(int[] iArr, String[] strArr) {
                UploadFileMethod.this.lambda$startGalleryActivity$0(activity, strArr, iArr);
            }
        });
    }

    public void startMultiUploadActivity(Activity activity) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 33) {
            arrayList.add("android.permission.READ_MEDIA_IMAGES");
            arrayList.add("android.permission.READ_MEDIA_VIDEO");
        } else {
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        C61115Nyh.LIZIZ(activity, TokenCert.with("bpea-upload_file_bullet_start_multi_upload_activity_permission"), (String[]) arrayList.toArray(new String[arrayList.size()]), new OXF(this, activity));
    }

    private void startGalleryActivityReal(Activity activity, int i) {
        try {
            C08200Tw c08200Tw = new C08200Tw(new C79023Uzr(activity, null), EnumC81057VrZ.ofImage());
            c08200Tw.LJFF();
            c08200Tw.LIZIZ();
            c08200Tw.LIZLLL(1);
            c08200Tw.LJ();
            c08200Tw.LJI();
            c08200Tw.LIZ(new C81060Vrc(this));
            c08200Tw.LIZJ(i);
        } catch (Exception e) {
            C36922EeM.LIZ(e);
            C40680Fxs.LIZJ(activity);
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC37146Ehy interfaceC37146Ehy) {
        Context context;
        if (getHybridType() == F0S.WEB) {
            C38048EwW webJsMsg = getWebJsMsg(jSONObject);
            JSONObject optJSONObject = jSONObject.optJSONObject("res");
            C38049EwX c38049EwX = (C38049EwX) this.contextProviderFactory.LIZJ(C38049EwX.class);
            WeakReference<Context> weakReference = this.mContextRef;
            if (weakReference != null && c38049EwX != null) {
                try {
                    new H5UploadFileMethod(weakReference, c38049EwX).call(webJsMsg, optJSONObject);
                    return;
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    return;
                }
            }
            return;
        }
        this.mReturn = interfaceC37146Ehy;
        String optString = jSONObject.optString("type");
        this.mImageSource = jSONObject.optString("source");
        this.mSkipImgBase64 = jSONObject.optBoolean("skip_img_base64", false);
        this.maxSelectNum = jSONObject.optInt("maxSelectNum", 1);
        this.isMultiSelect = jSONObject.optBoolean("isMultiSelect", false);
        this.shouldWithCamera = jSONObject.optBoolean("shouldWithCamera", false);
        this.mImageWidth = jSONObject.optInt("image_width", -1);
        this.mFrom = jSONObject.optString("from", "");
        long optLong = jSONObject.optLong("maxFileSize", Long.MAX_VALUE);
        this.originalImageMaxSize = optLong;
        if (optLong == 0) {
            this.originalImageMaxSize = Long.MAX_VALUE;
        }
        this.needBase64Response = jSONObject.optBoolean("needBase64Response", false);
        this.needCrop = jSONObject.optBoolean("isNeedCut", false);
        this.minImageWidth = jSONObject.optInt("minImageWidth");
        this.minImageHeight = jSONObject.optInt("minImageHeight");
        int optInt = jSONObject.optInt("cropRatioWidth", 0);
        int optInt2 = jSONObject.optInt("cropRatioHeight", 0);
        if (optInt * optInt2 != 0) {
            this.rectRatio = (optInt2 * 1.0f) / optInt;
        }
        if ("image".equals(optString)) {
            WeakReference<Context> weakReference2 = this.mContextRef;
            if (weakReference2 != null) {
                context = weakReference2.get();
            } else {
                context = null;
            }
            if (OGC.LIZ(context, this)) {
                this.isCancelUpload = false;
                if (this.isMultiSelect) {
                    startMultiUploadActivity(C45804HyK.LJIJJ(context));
                } else {
                    startGalleryActivity(C45804HyK.LJIJJ(context));
                }
            }
        }
    }

    @Override // X.OX9
    public void multiUploadImages(List<OXE> list, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (C38891fp.LJJI(list)) {
            return;
        }
        this.mOnUploadFinishedListener = interfaceC65784Pro;
        this.mMultiUploadSuccessNum = new AtomicInteger(0);
        this.mMultiUploadFailNum = new AtomicInteger(0);
        this.mFileNameList.clear();
        this.mFileBase64List.clear();
        for (int i = 0; i < list.size(); i++) {
            this.mFileNameList.add(((OXE) ListProtector.get(list, i)).LIZ);
            this.mFileBase64List.add(((OXE) ListProtector.get(list, i)).LIZIZ);
        }
        this.mAvatarUriList = new SparseArray<>();
        prepareIHandler(this.mFileNameList.size());
        for (int i2 = 0; i2 < this.mFileNameList.size(); i2++) {
            String str = (String) ListProtector.get(this.mFileNameList, i2);
            if (C38354F3m.LJ(str)) {
                this.mAvatarUriList.put(i2, new AvatarUri());
                this.mMultiUploadFailNum.incrementAndGet();
            } else {
                try {
                    if (C268513p.LIZLLL(EF7.LIZIZ(), UriProtector.parse(str)) == null) {
                        this.mAvatarUriList.put(i2, new AvatarUri());
                        this.mMultiUploadFailNum.incrementAndGet();
                    }
                } catch (FileNotFoundException e) {
                    C16880lQ.LLLLIIL(e);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(Api.LIZIZ);
                LIZ.append("?uid=");
                String LJ = UPJ.LJ((RBX) HG3.LJIILL(), LIZ, LIZ);
                if (!TextUtils.isEmpty(this.mImageSource)) {
                    StringBuilder LIZJ = b1.LIZJ(LJ, "&source=");
                    LIZJ.append(this.mImageSource);
                    LJ = X1D.LIZIZ(LIZJ);
                }
                String LIZIZ = C00S.LIZIZ(getContext(), UriProtector.parse(str));
                if (LIZIZ != null && !LIZIZ.isEmpty()) {
                    HG3.LJIIL();
                    HG3.LJLJL.LJFF().uploadAvatar(new WeakHandler((WeakHandler.IHandler) ListProtector.get(this.mIHandlerList, i2)), LJ, 4194304, C43115Gw3.LIZIZ(LIZIZ, new File(LIZIZ), this.mImageWidth), null);
                }
            }
        }
    }

    private JSONObject buildObject(int i, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        C10K<String> compressUploadImageTask = compressUploadImageTask();
        try {
            compressUploadImageTask.LJIJI();
        } catch (InterruptedException e) {
            C16880lQ.LLLLIIL(e);
        }
        String LJIIJJI = compressUploadImageTask.LJIIJJI();
        if (LJIIJJI != null) {
            try {
                C37247Ejb.LIZIZ.getClass();
                LJIIJJI = OXG.LIZ(C37246Eja.LJ(LJIIJJI));
            } catch (IOException e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
        try {
            jSONObject.put("code", i);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("url", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("uri", str2);
            }
            if (!TextUtils.isEmpty(LJIIJJI)) {
                jSONObject.put("img_base64", LJIIJJI);
            }
        } catch (JSONException e3) {
            C16880lQ.LLLLIIL(e3);
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startGalleryActivity$0(Activity activity, String[] strArr, int[] iArr) {
        if (iArr != null && iArr.length > 0) {
            if (iArr[0] == 0) {
                startGalleryActivityReal(activity, 10003);
                return;
            }
            C26045AKb c26045AKb = new C26045AKb(activity);
            c26045AKb.LJIIIZ(activity.getString(R.string.jga));
            c26045AKb.LJIIJ();
            cancelMultiUpload();
        }
    }

    @Override // X.InterfaceC27436Apk
    public boolean onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        int parseInt;
        if (i == 10003) {
            if (i2 == 0 || intent == null) {
                cancelMultiUpload();
                return true;
            }
            Context context = this.mContextRef.get();
            if (context == null) {
                return true;
            }
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_result_selection");
            if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
                data = intent.getData();
            } else {
                data = (Uri) ListProtector.get(parcelableArrayListExtra, 0);
            }
            if (data == null || C38354F3m.LJ(data.toString())) {
                KL2.LJ(context, R.drawable.a_v, context.getString(R.string.jkv));
                return true;
            }
            try {
                if (C268513p.LIZLLL(EF7.LIZIZ(), data) == null) {
                    KL2.LJ(context, R.drawable.a_v, context.getString(R.string.jkv));
                    return true;
                }
            } catch (FileNotFoundException e) {
                C16880lQ.LLLLIIL(e);
            }
            if (this.needCrop) {
                Activity LJIJJ = C45804HyK.LJIJJ(context);
                if (LJIJJ != null) {
                    if (!TextUtils.isEmpty(this.mImageSource)) {
                        try {
                            parseInt = CastIntegerProtector.parseInt(this.mImageSource);
                        } catch (NumberFormatException e2) {
                            C16880lQ.LLLLIIL(e2);
                        }
                        Z8A.LIZIZ.gotoCropActivity(LJIJJ, data.toString(), false, this.rectRatio, (int) KL2.LIZJ(LJIJJ, 16.0f), 10004, this.minImageWidth, this.minImageHeight, parseInt, false);
                    }
                    parseInt = -1;
                    Z8A.LIZIZ.gotoCropActivity(LJIJJ, data.toString(), false, this.rectRatio, (int) KL2.LIZJ(LJIJJ, 16.0f), 10004, this.minImageWidth, this.minImageHeight, parseInt, false);
                }
                return true;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(Api.LIZIZ);
            LIZ.append("?uid=");
            String LJ = UPJ.LJ((RBX) HG3.LJIILL(), LIZ, LIZ);
            if (!TextUtils.isEmpty(this.mImageSource)) {
                StringBuilder LIZJ = b1.LIZJ(LJ, "&source=");
                LIZJ.append(this.mImageSource);
                LJ = X1D.LIZIZ(LIZJ);
            }
            this.mUploadFileName = data.toString();
            HG3.LJIIL();
            HG3.LJLJL.LJFF().uploadAvatar(new WeakHandler(this), LJ, 4194304, this.mUploadFileName, null);
            return true;
        }
        if (i == 10004) {
            if (i2 == 0 || intent == null) {
                cancelMultiUpload();
            } else {
                Context context2 = this.mContextRef.get();
                if (context2 == null) {
                    return true;
                }
                String LIZIZ = C00S.LIZIZ(context2, intent.getData());
                if (C38354F3m.LJ(LIZIZ)) {
                    KL2.LJ(context2, R.drawable.a_v, context2.getString(R.string.jkv));
                    return true;
                }
                if (!C1B6.LIZIZ(LIZIZ)) {
                    KL2.LJ(context2, R.drawable.a_v, context2.getString(R.string.jkv));
                    return true;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(Api.LIZIZ);
                LIZ2.append("?uid=");
                String LJ2 = UPJ.LJ((RBX) HG3.LJIILL(), LIZ2, LIZ2);
                if (!TextUtils.isEmpty(this.mImageSource)) {
                    StringBuilder LIZJ2 = b1.LIZJ(LJ2, "&source=");
                    LIZJ2.append(this.mImageSource);
                    LJ2 = X1D.LIZIZ(LIZJ2);
                }
                this.mUploadFileName = LIZIZ;
                String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "uri");
                String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "url");
                if (!TextUtils.isEmpty(LLJJIJIIJIL) && !TextUtils.isEmpty(LLJJIJIIJIL2)) {
                    this.mReturn.LIZJ(1, "uploadFile", buildObject(1, LLJJIJIIJIL2, LLJJIJIIJIL));
                    return true;
                }
                HG3.LJIIL();
                HG3.LJLJL.LJFF().uploadAvatar(new WeakHandler(this), LJ2, 4194304, this.mUploadFileName, null);
                return true;
            }
        }
        return true;
    }
}
