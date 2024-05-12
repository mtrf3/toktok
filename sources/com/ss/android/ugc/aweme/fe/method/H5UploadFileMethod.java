package com.ss.android.ugc.aweme.fe.method;

import X.C00S;
import X.C08200Tw;
import X.C10K;
import X.C16880lQ;
import X.C188727au;
import X.C1B6;
import X.C26045AKb;
import X.C268513p;
import X.C36922EeM;
import X.C38048EwW;
import X.C38049EwX;
import X.C38333F2r;
import X.C38354F3m;
import X.C38891fp;
import X.C40680Fxs;
import X.C43115Gw3;
import X.C45804HyK;
import X.C45876HzU;
import X.C5S1;
import X.C61115Nyh;
import X.C76800UCe;
import X.C79023Uzr;
import X.C81061Vrd;
import X.EF7;
import X.EnumC81057VrZ;
import X.FMX;
import X.HG3;
import X.InterfaceC27436Apk;
import X.InterfaceC38012Evw;
import X.InterfaceC61118Nyk;
import X.InterfaceC65784Pro;
import X.KL2;
import X.OGC;
import X.OX9;
import X.OXE;
import X.RBX;
import X.UPJ;
import X.X1D;
import X.Z8A;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.fe.method.H5UploadFileMethod;
import com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v5.n;

/* loaded from: classes16.dex */
public class H5UploadFileMethod implements InterfaceC38012Evw, OX9, InterfaceC27436Apk {
    public boolean isCancelUpload;
    public boolean isMultiSelect;
    public SparseArray<AvatarUri> mAvatarUriList;
    public WeakReference<Context> mContextRef;
    public String mFrom;
    public List<WeakHandler.IHandler> mIHandlerList;
    public int mImageWidth;
    public C38049EwX mJsBridge;
    public AtomicInteger mMultiUploadFailNum;
    public AtomicInteger mMultiUploadSuccessNum;
    public InterfaceC65784Pro<C76800UCe> mOnUploadFinishedListener;
    public boolean mSkipImgBase64;
    public String mUploadFileName;
    public int maxSelectNum;
    public boolean shouldWithCamera;
    public String mImageSource = "";
    public List<String> mFileNameList = new ArrayList();
    public List<String> mFileBase64List = new ArrayList();
    public boolean needBase64Response = false;
    public long originalImageMaxSize = Long.MAX_VALUE;
    public boolean needCrop = false;
    public float rectRatio = 1.0f;
    public int minImageWidth = 0;
    public int minImageHeight = 0;

    @Override // X.OX9
    public void releaseListener() {
        this.mOnUploadFinishedListener = null;
    }

    private C10K<String> compressUploadImageTask() {
        final n nVar = new n();
        try {
            try {
                if (!this.mSkipImgBase64 && C268513p.LIZLLL(EF7.LIZIZ(), Uri.parse(this.mUploadFileName)) != null) {
                    AVExternalServiceImpl.LIZ().abilityService().processService().compressPhoto(this.mUploadFileName, 216, 384, new IAVProcessService.IProcessCallback() { // from class: X.XsW
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
        sendCancelEventToJsBridge("image", "1");
        this.isCancelUpload = true;
    }

    private JSONArray buildMultiObject(SparseArray<AvatarUri> sparseArray) {
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

    private void openChooseUploadActivity(Activity activity) {
        Intent intent = new Intent(activity, (Class<?>) ImageChooseUploadActivity.class);
        intent.putExtra("shouldWithCamera", this.shouldWithCamera);
        intent.putExtra("maxSelectNum", this.maxSelectNum);
        intent.putExtra("maxFileSize", this.originalImageMaxSize);
        intent.putExtra("needBase64Response", this.needBase64Response);
        intent.putExtra("enter_from", this.mFrom);
        C16880lQ.LIZIZ(activity, intent);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.mFrom);
        FMX.LJIIL("enter_image_choose", c188727au.LIZ);
        ImageChooseUploadActivity.LJLLLL = this;
    }

    private void prepareIHandler(int i) {
        this.mIHandlerList = new ArrayList();
        for (final int i2 = 0; i2 < i; i2++) {
            this.mIHandlerList.add(new WeakHandler.IHandler() { // from class: X.XsV
                @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
                public final void handleMsg(Message message) {
                    H5UploadFileMethod.this.lambda$prepareIHandler$2(i2, message);
                }
            });
        }
    }

    public Context getContext(Context context) {
        while (context != null) {
            Activity LJIJJ = C45804HyK.LJIJJ(context);
            if (LJIJJ != null) {
                return LJIJJ;
            }
            if (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return context;
            }
        }
        return null;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        JSONObject buildObject;
        Context context = getContext(this.mContextRef.get());
        if (context != null) {
            Object obj = message.obj;
            if (obj instanceof C38333F2r) {
                C5S1 c5s1 = new C5S1(context);
                c5s1.LIZLLL(((C38333F2r) message.obj).getErrorMsg());
                c5s1.LJ();
                buildObject = buildObject(0, "", "");
            } else if (obj instanceof AvatarUri) {
                AvatarUri avatarUri = (AvatarUri) obj;
                List<String> list = avatarUri.urlList;
                if (list != null && !list.isEmpty()) {
                    buildObject = buildObject(1, (String) ListProtector.get(avatarUri.urlList, 0), avatarUri.uri);
                } else {
                    buildObject = buildObject(0, "", "");
                }
            } else {
                buildObject = buildObject(0, "", "");
            }
            sendEventToJsBridge("image", buildObject);
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
        C61115Nyh.LIZIZ(activity, TokenCert.with("bpea-h5_upload_file_write_storage_permission"), (String[]) arrayList.toArray(new String[arrayList.size()]), new InterfaceC61118Nyk() { // from class: X.XsS
            @Override // X.InterfaceC61118Nyk
            public final void LIZ(int[] iArr, String[] strArr) {
                H5UploadFileMethod.this.lambda$startGalleryActivity$0(activity, strArr, iArr);
            }
        });
    }

    public void startMultiUploadActivity(final Activity activity) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 33) {
            arrayList.add("android.permission.READ_MEDIA_IMAGES");
            arrayList.add("android.permission.READ_MEDIA_VIDEO");
        } else {
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        C61115Nyh.LIZIZ(activity, TokenCert.with("bpea-h5_upload_file_write_storage_2_permission"), (String[]) arrayList.toArray(new String[arrayList.size()]), new InterfaceC61118Nyk() { // from class: X.XsT
            @Override // X.InterfaceC61118Nyk
            public final void LIZ(int[] iArr, String[] strArr) {
                H5UploadFileMethod.this.lambda$startMultiUploadActivity$1(activity, strArr, iArr);
            }
        });
    }

    public H5UploadFileMethod(WeakReference<Context> weakReference, C38049EwX c38049EwX) {
        this.mContextRef = weakReference;
        this.mJsBridge = c38049EwX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepareIHandler$2(int i, Message message) {
        WeakReference<Context> weakReference;
        SparseArray<AvatarUri> sparseArray = this.mAvatarUriList;
        if (sparseArray == null || this.mMultiUploadFailNum == null || this.mMultiUploadSuccessNum == null || this.mFileNameList == null || (weakReference = this.mContextRef) == null || this.isCancelUpload) {
            return;
        }
        Object obj = message.obj;
        if (obj instanceof C38333F2r) {
            Context context = getContext(weakReference.get());
            if (context != null) {
                C5S1 c5s1 = new C5S1(context);
                c5s1.LIZLLL(((C38333F2r) message.obj).getErrorMsg());
                c5s1.LJ();
            }
            this.mAvatarUriList.put(i, new AvatarUri());
            this.mMultiUploadFailNum.incrementAndGet();
        } else if (obj instanceof AvatarUri) {
            AvatarUri avatarUri = (AvatarUri) obj;
            if (C38891fp.LJJIFFI(avatarUri.urlList)) {
                this.mAvatarUriList.put(i, avatarUri);
                this.mMultiUploadSuccessNum.incrementAndGet();
            } else {
                this.mAvatarUriList.put(i, new AvatarUri());
                this.mMultiUploadFailNum.incrementAndGet();
            }
        } else {
            sparseArray.put(i, new AvatarUri());
            this.mMultiUploadFailNum.incrementAndGet();
        }
        if (this.mMultiUploadSuccessNum.get() + this.mMultiUploadFailNum.get() != this.mFileNameList.size()) {
            return;
        }
        if (this.mMultiUploadFailNum.get() == this.mFileNameList.size()) {
            sendEventToJsBridge("image", buildObject(0, "", ""));
        } else {
            sendEventToJsBridge("image", buildMultiObject(this.mAvatarUriList));
        }
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.mOnUploadFinishedListener;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        C43115Gw3.LIZJ(this.mImageWidth);
    }

    private void sendCancelEventToJsBridge(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("reason", str2);
            jSONObject.put("code", 1);
            jSONObject2.put("type", str);
            jSONObject2.put("args", jSONObject);
            jSONObject2.put("msg", "H5_uploadFileCancel");
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        C38049EwX c38049EwX = this.mJsBridge;
        if (c38049EwX != null) {
            c38049EwX.LJIIIIZZ("H5_uploadFileCancel", jSONObject2);
        }
    }

    private void sendEventToJsBridge(String str, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", str);
            jSONObject.put("args", jSONArray);
            jSONObject.put("msg", "H5_uploadFile");
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        C38049EwX c38049EwX = this.mJsBridge;
        if (c38049EwX != null) {
            c38049EwX.LJIIIIZZ("H5_uploadFile", jSONObject);
        }
    }

    private void startGalleryActivityReal(Activity activity, int i) {
        try {
            C08200Tw c08200Tw = new C08200Tw(new C79023Uzr(activity, null), EnumC81057VrZ.ofImage());
            c08200Tw.LJFF();
            c08200Tw.LIZIZ();
            c08200Tw.LIZLLL(1);
            c08200Tw.LJ();
            c08200Tw.LJI();
            c08200Tw.LIZ(new C81061Vrd(this));
            c08200Tw.LIZJ(i);
        } catch (Exception e) {
            C36922EeM.LIZ(e);
            C40680Fxs.LIZJ(activity);
        }
    }

    @Override // X.InterfaceC38012Evw
    public void call(C38048EwW c38048EwW, JSONObject jSONObject) {
        Context context;
        String string = JSONObjectProtectorUtils.getString(c38048EwW.LIZLLL, "type");
        this.mImageSource = "";
        if (TextUtils.equals("image", string)) {
            this.mImageSource = c38048EwW.LIZLLL.optString("source");
            this.mSkipImgBase64 = c38048EwW.LIZLLL.optBoolean("skip_img_base64", false);
            this.maxSelectNum = c38048EwW.LIZLLL.optInt("maxSelectNum", 1);
            this.isMultiSelect = c38048EwW.LIZLLL.optBoolean("isMultiSelect", false);
            this.shouldWithCamera = c38048EwW.LIZLLL.optBoolean("shouldWithCamera", false);
            this.mImageWidth = c38048EwW.LIZLLL.optInt("image_width", -1);
            this.mFrom = c38048EwW.LIZLLL.optString("from", "");
            long optLong = c38048EwW.LIZLLL.optLong("maxFileSize", Long.MAX_VALUE);
            this.originalImageMaxSize = optLong;
            if (optLong == 0) {
                this.originalImageMaxSize = Long.MAX_VALUE;
            }
            this.needBase64Response = c38048EwW.LIZLLL.optBoolean("needBase64Response", false);
            this.needCrop = c38048EwW.LIZLLL.optBoolean("isNeedCut", false);
            this.minImageWidth = c38048EwW.LIZLLL.optInt("minImageWidth");
            this.minImageHeight = c38048EwW.LIZLLL.optInt("minImageHeight");
            int optInt = c38048EwW.LIZLLL.optInt("cropRatioWidth", 0);
            int optInt2 = c38048EwW.LIZLLL.optInt("cropRatioHeight", 0);
            if (optInt * optInt2 != 0) {
                this.rectRatio = (optInt2 * 1.0f) / optInt;
            }
            WeakReference<Context> weakReference = this.mContextRef;
            if (weakReference != null) {
                context = getContext(weakReference.get());
            } else {
                context = null;
            }
            if (OGC.LIZ(context, this)) {
                jSONObject.put("code", 1);
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
                String LIZIZ = C45876HzU.LIZIZ(str);
                if (LIZIZ != null && !LIZIZ.isEmpty()) {
                    HG3.LJIIL();
                    HG3.LJLJL.LJFF().uploadAvatar(new WeakHandler((WeakHandler.IHandler) ListProtector.get(this.mIHandlerList, i2)), LJ, 4194304, C43115Gw3.LIZIZ(LIZIZ, new File(LIZIZ), this.mImageWidth), null);
                }
            }
        }
    }

    private void sendEventToJsBridge(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("type", str);
            jSONObject2.put("args", jSONObject);
            jSONObject2.put("msg", "H5_uploadFile");
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        C38049EwX c38049EwX = this.mJsBridge;
        if (c38049EwX != null) {
            c38049EwX.LJIIIIZZ("H5_uploadFile", jSONObject2);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:2|3)|4|(10:22|23|7|8|(1:10)|11|(1:13)|14|(1:16)|18)|6|7|8|(0)|11|(0)|14|(0)|18) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003c A[Catch: JSONException -> 0x0058, TryCatch #0 {JSONException -> 0x0058, blocks: (B:8:0x0031, B:10:0x003c, B:11:0x0041, B:13:0x0047, B:14:0x004c, B:16:0x0052), top: B:7:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047 A[Catch: JSONException -> 0x0058, TryCatch #0 {JSONException -> 0x0058, blocks: (B:8:0x0031, B:10:0x003c, B:11:0x0041, B:13:0x0047, B:14:0x004c, B:16:0x0052), top: B:7:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052 A[Catch: JSONException -> 0x0058, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0058, blocks: (B:8:0x0031, B:10:0x003c, B:11:0x0041, B:13:0x0047, B:14:0x004c, B:16:0x0052), top: B:7:0x0031 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private org.json.JSONObject buildObject(int r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            X.10K r3 = r4.compressUploadImageTask()
            r3.LJIJI()     // Catch: java.lang.InterruptedException -> Ld
            goto L11
        Ld:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L11:
            java.lang.Object r0 = r3.LJIIJJI()
            if (r0 == 0) goto L2f
            X.Eja r1 = X.C37247Ejb.LIZIZ     // Catch: java.io.IOException -> L2b
            java.lang.Object r0 = r3.LJIIJJI()     // Catch: java.io.IOException -> L2b
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.io.IOException -> L2b
            r1.getClass()     // Catch: java.io.IOException -> L2b
            byte[] r0 = X.C37246Eja.LJ(r0)     // Catch: java.io.IOException -> L2b
            java.lang.String r1 = X.OXG.LIZ(r0)     // Catch: java.io.IOException -> L2b
            goto L31
        L2b:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L2f:
            java.lang.String r1 = ""
        L31:
            java.lang.String r0 = "code"
            r2.put(r0, r5)     // Catch: org.json.JSONException -> L58
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch: org.json.JSONException -> L58
            if (r0 != 0) goto L41
            java.lang.String r0 = "url"
            r2.put(r0, r6)     // Catch: org.json.JSONException -> L58
        L41:
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch: org.json.JSONException -> L58
            if (r0 != 0) goto L4c
            java.lang.String r0 = "uri"
            r2.put(r0, r7)     // Catch: org.json.JSONException -> L58
        L4c:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L58
            if (r0 != 0) goto L5c
            java.lang.String r0 = "img_base64"
            r2.put(r0, r1)     // Catch: org.json.JSONException -> L58
            goto L5c
        L58:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L5c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.H5UploadFileMethod.buildObject(int, java.lang.String, java.lang.String):org.json.JSONObject");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startGalleryActivity$0(Activity activity, String[] strArr, int[] iArr) {
        if (iArr != null && iArr.length > 0) {
            if (iArr[0] == 0) {
                startGalleryActivityReal(activity, 10003);
                return;
            }
            C5S1 c5s1 = new C5S1(activity);
            c5s1.LIZLLL(activity.getString(R.string.jga));
            c5s1.LJ();
            cancelMultiUpload();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startMultiUploadActivity$1(Activity activity, String[] strArr, int[] iArr) {
        if (iArr != null && iArr.length > 0) {
            if (iArr[0] == 0) {
                openChooseUploadActivity(activity);
                return;
            }
            C5S1 c5s1 = new C5S1(activity);
            c5s1.LIZLLL(activity.getString(R.string.jga));
            c5s1.LJ();
            sendCancelEventToJsBridge("image", CardStruct.IStatusCode.DEFAULT);
        }
    }

    @Override // X.InterfaceC27436Apk
    public boolean onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        int parseInt;
        if (i == 10003) {
            if (i2 == 0 || intent == null) {
                sendCancelEventToJsBridge("image", "1");
                return true;
            }
            Context context = getContext(this.mContextRef.get());
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
                C26045AKb c26045AKb = new C26045AKb(this.mJsBridge.LIZ);
                c26045AKb.LJFF(R.drawable.a_v);
                c26045AKb.LJIIIIZZ(R.string.jkv);
                c26045AKb.LJIIJ();
                return true;
            }
            try {
                if (C268513p.LIZLLL(EF7.LIZIZ(), data) == null) {
                    C26045AKb c26045AKb2 = new C26045AKb(this.mJsBridge.LIZ);
                    c26045AKb2.LJFF(R.drawable.a_v);
                    c26045AKb2.LJIIIIZZ(R.string.jkv);
                    c26045AKb2.LJIIJ();
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
            this.mUploadFileName = data.toString();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(Api.LIZIZ);
            LIZ.append("?uid=");
            String LJ = UPJ.LJ((RBX) HG3.LJIILL(), LIZ, LIZ);
            if (!TextUtils.isEmpty(this.mImageSource)) {
                StringBuilder LIZJ = b1.LIZJ(LJ, "&source=");
                LIZJ.append(this.mImageSource);
                LJ = X1D.LIZIZ(LIZJ);
            }
            HG3.LJIIL();
            HG3.LJLJL.LJFF().uploadAvatar(new WeakHandler(this), LJ, 4194304, this.mUploadFileName, null);
            return true;
        }
        if (i == 10004) {
            if (i2 == 0 || intent == null) {
                sendCancelEventToJsBridge("image", "1");
            } else {
                Context context2 = getContext(this.mContextRef.get());
                if (context2 == null) {
                    return true;
                }
                String LIZIZ = C00S.LIZIZ(context2, intent.getData());
                if (C38354F3m.LJ(LIZIZ)) {
                    C26045AKb c26045AKb3 = new C26045AKb(this.mJsBridge.LIZ);
                    c26045AKb3.LJFF(R.drawable.a_v);
                    c26045AKb3.LJIIIIZZ(R.string.jkv);
                    c26045AKb3.LJIIJ();
                    return true;
                }
                if (!C1B6.LIZIZ(LIZIZ)) {
                    C26045AKb c26045AKb4 = new C26045AKb(this.mJsBridge.LIZ);
                    c26045AKb4.LJFF(R.drawable.a_v);
                    c26045AKb4.LJIIIIZZ(R.string.jkv);
                    c26045AKb4.LJIIJ();
                    return true;
                }
                this.mUploadFileName = LIZIZ;
                String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "uri");
                String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "url");
                if (!TextUtils.isEmpty(LLJJIJIIJIL) && !TextUtils.isEmpty(LLJJIJIIJIL2)) {
                    sendEventToJsBridge("image", buildObject(1, LLJJIJIIJIL2, LLJJIJIIJIL));
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
                HG3.LJIIL();
                HG3.LJLJL.LJFF().uploadAvatar(new WeakHandler(this), LJ2, 4194304, this.mUploadFileName, null);
                return true;
            }
        }
        return true;
    }
}
