package com.ss.android.ugc.aweme.fe.method.upload;

import X.C04330Ez;
import X.C10K;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C26045AKb;
import X.C268513p;
import X.C32I;
import X.C37246Eja;
import X.C37247Ejb;
import X.C38281F0r;
import X.C38333F2r;
import X.C38354F3m;
import X.C3C5;
import X.C40680Fxs;
import X.C43115Gw3;
import X.C45876HzU;
import X.C5S1;
import X.C61115Nyh;
import X.C66619QCp;
import X.C76800UCe;
import X.C86200XsK;
import X.C86213XsX;
import X.C86216Xsa;
import X.C86217Xsb;
import X.C86219Xsd;
import X.C86223Xsh;
import X.EF7;
import X.FMX;
import X.HG3;
import X.InterfaceC65784Pro;
import X.InterfaceC86201XsL;
import X.InterfaceC86221Xsf;
import X.OX9;
import X.OXE;
import X.OXG;
import X.RBY;
import Y.ACallableS61S0300000_15;
import Y.AgS115S0200000_15;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.TcmImage;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v5.n;

/* loaded from: classes16.dex */
public final class PickPhotoUploadFeature implements WeakHandler.IHandler, OX9, InterfaceC86201XsL {
    public static final C86223Xsh Companion = new C86223Xsh();
    public final WeakReference<Activity> contextRef;
    public boolean isCancelUpload;
    public boolean isMultiSelect;
    public HashMap<Integer, AvatarUri> mAvatarUriList;
    public String mEncryptUrl;
    public List<String> mFileNameList;
    public String mFrom;
    public List<WeakHandler.IHandler> mIHandlerList;
    public String mImageFilePath;
    public String mImageSource;
    public int mImageWidth;
    public AtomicInteger mMultiUploadFailNum;
    public AtomicInteger mMultiUploadSuccessNum;
    public String mNameSpace;
    public boolean mNeedResize;
    public InterfaceC65784Pro<C76800UCe> mOnUploadFinishedListener;
    public int maxSelectNum;
    public final InterfaceC86221Xsf onFileSelected;
    public final C86200XsK upLoadDialog;

    @Override // X.InterfaceC86201XsL
    public void cancelUpload() {
    }

    @Override // X.OX9
    public void releaseListener() {
        this.mOnUploadFinishedListener = null;
    }

    @Override // X.OX9
    public void cancelMultiUpload() {
        this.onFileSelected.LIZ(0, "uploadCancel");
        this.isCancelUpload = true;
    }

    private final C10K<String> compressUploadImageTask(String str) {
        n nVar = new n();
        try {
            AVExternalServiceImpl.LIZ().abilityService().processService().compressPhoto(str, 216, 384, new C86217Xsb(nVar));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            nVar.LJ(null);
        }
        C10K c10k = nVar.LIZ;
        o.LJIIIIZZ(c10k, "taskCompletionSource.task");
        return c10k;
    }

    private final void prepareIHandler(int i) {
        this.mIHandlerList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            C86213XsX c86213XsX = new C86213XsX(this, i2);
            List<WeakHandler.IHandler> list = this.mIHandlerList;
            if (list != null) {
                list.add(c86213XsX);
            } else {
                o.LJIJI("mIHandlerList");
                throw null;
            }
        }
    }

    private final void startGalleryActivity(Activity activity) {
        if (Build.VERSION.SDK_INT >= 33) {
            if (C04330Ez.LIZ(activity, "android.permission.READ_MEDIA_IMAGES") == 0) {
                C40680Fxs.LIZJ(activity);
                return;
            } else {
                requestPermissions(activity, new AqS165S0100000_15(activity, 259));
                return;
            }
        }
        if (C04330Ez.LIZ(activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            C40680Fxs.LIZJ(activity);
        } else {
            requestPermissions(activity, new AqS165S0100000_15(activity, 260));
        }
    }

    private final void startMultiUploadActivity(Activity activity) {
        if (Build.VERSION.SDK_INT >= 33) {
            if (C04330Ez.LIZ(activity, "android.permission.READ_MEDIA_IMAGES") == 0) {
                openImageChooseUpload(activity);
                return;
            } else {
                requestPermissions(activity, new AqS162S0200000_15(this, activity, 16));
                return;
            }
        }
        if (C04330Ez.LIZ(activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            openImageChooseUpload(activity);
        } else {
            requestPermissions(activity, new AqS162S0200000_15(this, activity, 17));
        }
    }

    public final JSONArray buildObject(List<C86219Xsd> list) {
        String str;
        try {
            JSONArray jSONArray = new JSONArray();
            for (C86219Xsd c86219Xsd : list) {
                JSONObject jSONObject = new JSONObject();
                if (!TextUtils.isEmpty(c86219Xsd.LIZ)) {
                    jSONObject.put("url", c86219Xsd.LIZ);
                }
                if (!TextUtils.isEmpty(c86219Xsd.LIZIZ)) {
                    jSONObject.put("uri", c86219Xsd.LIZIZ);
                }
                C10K<String> compressUploadImageTask = compressUploadImageTask(c86219Xsd.LIZJ);
                try {
                    compressUploadImageTask.LJIJI();
                } catch (InterruptedException e) {
                    C16880lQ.LLLLIIL(e);
                }
                try {
                    C37246Eja c37246Eja = C37247Ejb.LIZIZ;
                    String LJIIJJI = compressUploadImageTask.LJIIJJI();
                    if (LJIIJJI == null) {
                        LJIIJJI = "";
                    }
                    c37246Eja.getClass();
                    str = OXG.LIZ(C37246Eja.LJ(LJIIJJI));
                } catch (IOException unused) {
                }
                if (str != null) {
                    jSONObject.put("base64", str);
                    jSONArray.put(jSONObject);
                }
                str = "";
                jSONObject.put("base64", str);
                jSONArray.put(jSONObject);
            }
            return jSONArray;
        } catch (JSONException unused2) {
            return null;
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        this.upLoadDialog.LIZIZ();
        Activity activity = this.contextRef.get();
        if (activity == null || message == null) {
            this.onFileSelected.LIZ(0, "uploadFailed");
            return;
        }
        Object obj = message.obj;
        if (obj instanceof C38333F2r) {
            C5S1 c5s1 = new C5S1(activity);
            Object obj2 = message.obj;
            o.LJII(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
            c5s1.LIZLLL(((C38333F2r) obj2).getErrorMsg());
            c5s1.LJ();
            this.onFileSelected.LIZ(0, "uploadFailed");
            return;
        }
        if (obj instanceof AvatarUri) {
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.AvatarUri");
            AvatarUri avatarUri = (AvatarUri) obj;
            if (avatarUri.urlList != null && (!r0.isEmpty())) {
                String url = (String) ListProtector.get(avatarUri.urlList, 0);
                o.LJIIIIZZ(url, "url");
                String str = avatarUri.uri;
                o.LJIIIIZZ(str, "uri.uri");
                uploadData$default(this, new C86219Xsd(url, str, this.mImageFilePath), null, 2, null);
                return;
            }
            this.onFileSelected.LIZ(0, "uploadFailed");
            return;
        }
        if (obj instanceof TcmImage) {
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.TcmImage");
            TcmImage tcmImage = (TcmImage) obj;
            String mid = tcmImage.getMid();
            if (mid == null || mid.length() == 0) {
                this.onFileSelected.LIZ(0, "uploadFailed");
                return;
            }
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mid", tcmImage.getMid());
            jSONArray.put(jSONObject);
            this.onFileSelected.LIZJ(jSONArray);
            return;
        }
        this.onFileSelected.LIZ(0, "uploadFailed");
    }

    public final void openImageChooseUpload(Activity activity) {
        Intent intent = new Intent(activity, (Class<?>) ImageChooseUploadActivity.class);
        intent.putExtra("maxSelectNum", this.maxSelectNum);
        intent.putExtra("enter_from", this.mFrom);
        C16880lQ.LIZIZ(activity, intent);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.mFrom);
        FMX.LJIIL("enter_image_choose", c188727au.LIZ);
        ImageChooseUploadActivity.LJLLLL = this;
    }

    private final void requestPermissions(Activity activity, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        String[] strArr;
        if (Build.VERSION.SDK_INT >= 33) {
            strArr = new String[]{"android.permission.READ_MEDIA_IMAGES"};
        } else {
            strArr = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
        }
        C61115Nyh.LIZIZ(activity, TokenCert.Companion.with("bpea-pick_photo_upload_write_storage_permission"), strArr, new C86216Xsa(interfaceC65784Pro, activity, this));
    }

    @Override // X.InterfaceC86201XsL
    public void handleJsInvoke(JSONObject params, boolean z) {
        o.LJIIIZ(params, "params");
        this.maxSelectNum = params.optInt("maxSelectNum", 1);
        String optString = params.optString("source", "");
        o.LJIIIIZZ(optString, "params.optString(\"source\", \"\")");
        this.mImageSource = optString;
        this.isMultiSelect = params.optBoolean("isMultiSelect", false);
        String optString2 = params.optString("from", "");
        o.LJIIIIZZ(optString2, "params.optString(\"from\", \"\")");
        this.mFrom = optString2;
        this.mImageWidth = params.optInt("image_width", 216);
        this.mNeedResize = params.optBoolean("need_resize", true);
        String optString3 = params.optString("encryptURL", "");
        o.LJIIIIZZ(optString3, "params.optString(\"encryptURL\", \"\")");
        this.mEncryptUrl = optString3;
        String optString4 = params.optString("nameSpace", "");
        o.LJIIIIZZ(optString4, "params.optString(\"nameSpace\", \"\")");
        this.mNameSpace = optString4;
        if (this.contextRef.get() == null) {
            return;
        }
        if (this.isMultiSelect) {
            Activity activity = this.contextRef.get();
            o.LJII(activity, "null cannot be cast to non-null type android.app.Activity");
            startMultiUploadActivity(activity);
        } else {
            Activity activity2 = this.contextRef.get();
            o.LJII(activity2, "null cannot be cast to non-null type android.app.Activity");
            startGalleryActivity(activity2);
        }
    }

    @Override // X.OX9
    public void multiUploadImages(List<OXE> list, InterfaceC65784Pro<C76800UCe> onUploadFinishedListener) {
        Object LIZ;
        o.LJIIIZ(onUploadFinishedListener, "onUploadFinishedListener");
        if (list == null) {
            return;
        }
        this.mOnUploadFinishedListener = onUploadFinishedListener;
        this.mMultiUploadSuccessNum = new AtomicInteger(0);
        this.mMultiUploadFailNum = new AtomicInteger(0);
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<OXE> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().LIZ);
        }
        this.mFileNameList = arrayList;
        this.mAvatarUriList = new HashMap<>();
        List<String> list2 = this.mFileNameList;
        if (list2 != null) {
            prepareIHandler(list2.size());
            List<String> list3 = this.mFileNameList;
            if (list3 != null) {
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    List<String> list4 = this.mFileNameList;
                    if (list4 != null) {
                        String str = (String) ListProtector.get(list4, i);
                        if (C38354F3m.LJ(str)) {
                            AtomicInteger atomicInteger = this.mMultiUploadFailNum;
                            if (atomicInteger != null) {
                                atomicInteger.incrementAndGet();
                            } else {
                                o.LJIJI("mMultiUploadFailNum");
                                throw null;
                            }
                        } else {
                            try {
                                LIZ = C268513p.LIZLLL(EF7.LIZIZ(), UriProtector.parse(str));
                                C3C5.m7constructorimpl(LIZ);
                            } catch (Throwable th) {
                                LIZ = C141335gf.LIZ(th);
                                C3C5.m7constructorimpl(LIZ);
                            }
                            if (C3C5.m12isFailureimpl(LIZ) || LIZ == null) {
                                AtomicInteger atomicInteger2 = this.mMultiUploadFailNum;
                                if (atomicInteger2 != null) {
                                    atomicInteger2.incrementAndGet();
                                } else {
                                    o.LJIJI("mMultiUploadFailNum");
                                    throw null;
                                }
                            } else {
                                C38281F0r c38281F0r = new C38281F0r(Api.LIZIZ);
                                HG3.LJIIL();
                                c38281F0r.LIZLLL("uid", HG3.LJLJL.LJFF().getCurUserId());
                                c38281F0r.LIZLLL("source", this.mImageSource);
                                String LJ = c38281F0r.LJ();
                                String LIZIZ = C45876HzU.LIZIZ(str);
                                if (LIZIZ != null && LIZIZ.length() != 0) {
                                    HG3.LJIIL();
                                    RBY LJFF = HG3.LJLJL.LJFF();
                                    List<WeakHandler.IHandler> list5 = this.mIHandlerList;
                                    if (list5 != null) {
                                        WeakHandler weakHandler = new WeakHandler((WeakHandler.IHandler) ListProtector.get(list5, i));
                                        if (this.mNeedResize) {
                                            str = C43115Gw3.LIZIZ(LIZIZ, new File(LIZIZ), this.mImageWidth);
                                        }
                                        LJFF.uploadAvatar(weakHandler, LJ, 8388608, str, null);
                                    } else {
                                        o.LJIJI("mIHandlerList");
                                        throw null;
                                    }
                                }
                            }
                        }
                    } else {
                        o.LJIJI("mFileNameList");
                        throw null;
                    }
                }
                return;
            }
            o.LJIJI("mFileNameList");
            throw null;
        }
        o.LJIJI("mFileNameList");
        throw null;
    }

    public final void uploadData(C86219Xsd c86219Xsd, ArrayList<C86219Xsd> arrayList) {
        C10K.LIZJ(new ACallableS61S0300000_15(c86219Xsd, arrayList, this, 0)).LJ(new AgS115S0200000_15(this, c86219Xsd, 0), C10K.LJIIIIZZ, null);
    }

    public PickPhotoUploadFeature(WeakReference<Activity> contextRef, C86200XsK upLoadDialog, InterfaceC86221Xsf onFileSelected) {
        o.LJIIIZ(contextRef, "contextRef");
        o.LJIIIZ(upLoadDialog, "upLoadDialog");
        o.LJIIIZ(onFileSelected, "onFileSelected");
        this.contextRef = contextRef;
        this.upLoadDialog = upLoadDialog;
        this.onFileSelected = onFileSelected;
        this.maxSelectNum = 1;
        this.mImageSource = "";
        this.mFrom = "";
        this.mNeedResize = true;
        this.mImageFilePath = "";
        this.mEncryptUrl = "";
        this.mNameSpace = "";
    }

    @Override // X.InterfaceC86201XsL
    public boolean onActivityResult(int i, int i2, Intent intent) {
        Object LIZ;
        String LJ;
        if (i2 == 0 || intent == null) {
            this.onFileSelected.LIZ(0, "uploadCancel");
            return true;
        }
        Activity activity = this.contextRef.get();
        if (activity == null) {
            this.onFileSelected.LIZ(0, "uploadFailed");
            return true;
        }
        Uri data = intent.getData();
        if (data == null || C38354F3m.LJ(data.toString())) {
            C26045AKb c26045AKb = new C26045AKb(activity);
            c26045AKb.LJFF(R.drawable.a_v);
            c26045AKb.LJIIIIZZ(R.string.jkv);
            c26045AKb.LJIIJ();
            this.onFileSelected.LIZ(0, "uploadFailed");
            return true;
        }
        String uri = data.toString();
        o.LJIIIIZZ(uri, "uri.toString()");
        this.mImageFilePath = uri;
        try {
            LIZ = C268513p.LIZLLL(EF7.LIZIZ(), data);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ) || LIZ == null) {
            C26045AKb c26045AKb2 = new C26045AKb(activity);
            c26045AKb2.LJFF(R.drawable.a_v);
            c26045AKb2.LJIIIIZZ(R.string.jkv);
            c26045AKb2.LJIIJ();
            this.onFileSelected.LIZ(0, "uploadFailed");
            return true;
        }
        if (this.mEncryptUrl.length() > 0) {
            LJ = new C38281F0r(Api.LIZ + '/' + this.mEncryptUrl).LJ();
        } else {
            C38281F0r c38281F0r = new C38281F0r(Api.LIZIZ);
            HG3.LJIIL();
            c38281F0r.LIZLLL("uid", HG3.LJLJL.LJFF().getCurUserId());
            c38281F0r.LIZLLL("source", this.mImageSource);
            LJ = c38281F0r.LJ();
        }
        this.upLoadDialog.LIZJ(activity);
        if (this.mEncryptUrl.length() > 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C66619QCp("NS", this.mNameSpace));
            HG3.LJIIL();
            HG3.LJLJL.LJFF().uploadAvatar(new WeakHandler(this), LJ, 8388608, this.mImageFilePath, arrayList, "image_info");
        } else {
            HG3.LJIIL();
            HG3.LJLJL.LJFF().uploadAvatar(new WeakHandler(this), LJ, 8388608, this.mImageFilePath, null);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void uploadData$default(PickPhotoUploadFeature pickPhotoUploadFeature, C86219Xsd c86219Xsd, ArrayList arrayList, int i, Object obj) {
        if ((i & 2) != 0) {
            arrayList = new ArrayList();
        }
        pickPhotoUploadFeature.uploadData(c86219Xsd, arrayList);
    }
}
