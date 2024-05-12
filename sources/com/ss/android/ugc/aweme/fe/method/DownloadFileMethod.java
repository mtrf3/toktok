package com.ss.android.ugc.aweme.fe.method;

import X.C00S;
import X.C04330Ez;
import X.C10K;
import X.C141335gf;
import X.C268613q;
import X.C38049EwX;
import X.C3C5;
import X.C40325Fs9;
import X.C61115Nyh;
import X.C65232Piu;
import X.C68322mC;
import X.C76800UCe;
import X.CallableC40326FsA;
import X.InterfaceC36488ETs;
import Y.ACallableS83S0200000_6;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class DownloadFileMethod extends BaseCommonJavaMethod implements IDownloadListener {
    public String LJLJI;
    public String LJLJJI;
    public Integer LJLJJL;
    public String LJLJJLL;

    public DownloadFileMethod() {
        super(null);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFirstStart(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFirstSuccess(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPrepare(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        Integer num = this.LJLJJL;
        if (num != null) {
            Downloader.getInstance(this.mContextRef.get()).cancel(num.intValue());
        }
    }

    public DownloadFileMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, android.net.Uri] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, android.net.Uri] */
    public final void LIZJ(String str) {
        Context context = this.mContextRef.get();
        if (context == null) {
            return;
        }
        File file = new File(str);
        C68322mC c68322mC = new C68322mC();
        ?? LJIIIIZZ = C268613q.LJIIIIZZ(context, file.getName(), null);
        c68322mC.element = LJIIIIZZ;
        if (LJIIIIZZ == 0) {
            c68322mC.element = C268613q.LIZJ(context, file.getName());
        }
        C10K.LIZJ(new ACallableS83S0200000_6(c68322mC, file, 0));
    }

    public final void LJ(JSONObject jSONObject) {
        C10K.LIZIZ(new CallableC40326FsA(this, jSONObject), C10K.LJIIIIZZ, null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final BaseCommonJavaMethod attach(WeakReference<Context> weakReference) {
        super.attach(weakReference);
        o.LJIIIIZZ(this, "super.attach(contextRef)");
        return this;
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo downloadInfo) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", C65232Piu.LIZJ("type", "cancel"));
        jSONObject.put("id", this.LJLJJLL);
        jSONObject.put("eventName", "download_status_change");
        LJ(jSONObject);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onPause(DownloadInfo downloadInfo) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", C65232Piu.LIZJ("type", "pause"));
        jSONObject.put("id", this.LJLJJLL);
        jSONObject.put("eventName", "download_status_change");
        LJ(jSONObject);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo downloadInfo) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("progress", downloadInfo);
        jSONObject2.put("type", "progress");
        jSONObject.put("data", jSONObject2);
        jSONObject.put("id", this.LJLJJLL);
        jSONObject.put("eventName", "download_status_change");
        LJ(jSONObject);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo downloadInfo) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", C65232Piu.LIZJ("type", "start"));
        jSONObject.put("id", this.LJLJJLL);
        jSONObject.put("eventName", "download_status_change");
        LJ(jSONObject);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        String str = null;
        if (downloadInfo == null || downloadInfo.getSavePath() == null || downloadInfo == null || downloadInfo.getName() == null) {
            return;
        }
        String savePath = downloadInfo.getSavePath();
        o.LJIIIIZZ(savePath, "info.savePath");
        if (ujb.o.LJJJLIIL(savePath, "content://", false)) {
            try {
                str = C00S.LIZIZ(this.mContextRef.get(), UriProtector.parse(downloadInfo.getSavePath()));
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        } else {
            str = new File(downloadInfo.getSavePath(), downloadInfo.getName()).getPath();
            if (TextUtils.equals(this.LJLJJI, "image") && str != null) {
                LIZJ(str);
            }
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject LIZJ = C65232Piu.LIZJ("type", "success");
        if (str != null) {
            LIZJ.put("path", str);
        }
        jSONObject.put("data", LIZJ);
        jSONObject.put("id", this.LJLJJLL);
        jSONObject.put("eventName", "download_status_change");
        LJ(jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Type inference failed for: r0v39, types: [T, java.io.File] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(org.json.JSONObject r18, X.InterfaceC36488ETs r19) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.DownloadFileMethod.LIZLLL(org.json.JSONObject, X.ETs):void");
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        Activity activity;
        Object obj;
        WeakReference<Context> weakReference = this.mContextRef;
        if (weakReference != null && (obj = (Context) weakReference.get()) != null && (obj instanceof LifecycleOwner)) {
            ((LifecycleOwner) obj).getLifecycle().addObserver(this);
        }
        Context actContext = getActContext();
        if (!(actContext instanceof Activity) || (activity = (Activity) actContext) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33 || C04330Ez.LIZ(activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            LIZLLL(jSONObject, interfaceC36488ETs);
        } else {
            C61115Nyh.LIZIZ(activity, TokenCert.Companion.with("bpea-download_file_method_write_storage_permission"), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C40325Fs9(this, jSONObject, interfaceC36488ETs, activity));
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", C65232Piu.LIZJ("type", "error"));
        jSONObject.put("id", this.LJLJJLL);
        jSONObject.put("eventName", "download_status_change");
        LJ(jSONObject);
        if (TextUtils.equals(this.LJLJJI, "image")) {
            this.mContextRef.get();
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onRetry(DownloadInfo downloadInfo, BaseException baseException) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", C65232Piu.LIZJ("type", "restart"));
        jSONObject.put("id", this.LJLJJLL);
        jSONObject.put("eventName", "download_status_change");
        LJ(jSONObject);
    }

    @Override // com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onRetryDelay(DownloadInfo downloadInfo, BaseException baseException) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("data", C65232Piu.LIZJ("type", "restart"));
        jSONObject.put("id", this.LJLJJLL);
        jSONObject.put("eventName", "download_status_change");
        LJ(jSONObject);
    }
}
