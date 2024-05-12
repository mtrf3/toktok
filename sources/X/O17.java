package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.TTLiveFileProvider;
import com.bytedance.bpea.cert.token.TokenCert;
import java.io.File;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public class O17 extends CO9 {
    public ValueCallback<android.net.Uri[]> LIZ;
    public final WeakReference<Fragment> LIZIZ;
    public final WeakReference<Activity> LIZJ;
    public String LIZLLL;
    public boolean LJ;

    public final Intent LIZ() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C31880CfE.LIZ());
        this.LIZLLL = C72545SdZ.LIZLLL(LIZ, File.separator, ".jpg", LIZ);
        Context LIZLLL = LIZLLL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LIZLLL().getPackageName());
        LIZ2.append(TTLiveFileProvider.NAME);
        intent.putExtra("output", FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(LIZLLL, X1D.LIZIZ(LIZ2), new File(this.LIZLLL)));
        return intent;
    }

    public final Intent LIZJ() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        Intent LIZIZ = LIZIZ(LIZ(), new Intent("android.media.action.VIDEO_CAPTURE"), new Intent("android.provider.MediaStore.RECORD_SOUND"));
        LIZIZ.putExtra("android.intent.extra.INTENT", intent);
        LIZIZ.putExtra("pns.sandbox.dataflow_id", 1207965185);
        return LIZIZ;
    }

    public final Context LIZLLL() {
        WeakReference<Fragment> weakReference = this.LIZIZ;
        if (weakReference != null && weakReference.get() != null) {
            return this.LIZIZ.get().mo49getActivity();
        }
        WeakReference<Activity> weakReference2 = this.LIZJ;
        if (weakReference2 != null && weakReference2.get() != null) {
            return this.LIZJ.get();
        }
        return null;
    }

    @Override // android.webkit.WebChromeClient
    public final View getVideoLoadingProgressView() {
        Context LIZLLL = LIZLLL();
        if (LIZLLL == null) {
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(LIZLLL);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        CVT cvt = new CVT(LIZLLL, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(cvt, layoutParams);
        return frameLayout;
    }

    public O17(Activity activity) {
        this.LIZJ = new WeakReference<>(activity);
    }

    public static Intent LIZIZ(Intent... intentArr) {
        Intent intent = new Intent("android.intent.action.CHOOSER");
        intent.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
        return intent;
    }

    public final void LJFF(Intent intent) {
        WeakReference<Fragment> weakReference = this.LIZIZ;
        if (weakReference != null && weakReference.get() != null) {
            C16880lQ.LJII(this.LIZIZ.get(), intent, 2048);
            return;
        }
        WeakReference<Activity> weakReference2 = this.LIZJ;
        if (weakReference2 == null || weakReference2.get() == null) {
            return;
        }
        C16880lQ.LJFF(this.LIZJ.get(), 2048, intent);
    }

    public O17(Fragment fragment) {
        this.LIZIZ = new WeakReference<>(fragment);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r3 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(int r7, int r8, android.content.Intent r9) {
        /*
            r6 = this;
            android.webkit.ValueCallback<android.net.Uri[]> r0 = r6.LIZ
            if (r0 == 0) goto L46
            r5 = 0
            if (r8 != 0) goto Le
            boolean r0 = r6.LJ
            if (r0 == 0) goto Le
            r6.LJ = r5
            return
        Le:
            r0 = -1
            r4 = 0
            if (r9 == 0) goto L14
            if (r8 == r0) goto L4d
        L14:
            r3 = r4
        L15:
            if (r9 != 0) goto L38
            if (r8 != r0) goto L38
            java.io.File r1 = new java.io.File
            java.lang.String r0 = r6.LIZLLL
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L38
            android.net.Uri r3 = android.net.Uri.fromFile(r1)
            android.content.Context r2 = r6.LIZLLL()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.MEDIA_SCANNER_SCAN_FILE"
            r1.<init>(r0, r3)
            r2.sendBroadcast(r1)
        L38:
            android.webkit.ValueCallback<android.net.Uri[]> r1 = r6.LIZ
            if (r1 == 0) goto L42
            if (r3 != 0) goto L47
            r0 = r4
        L3f:
            r1.onReceiveValue(r0)
        L42:
            r6.LJ = r5
            r6.LIZ = r4
        L46:
            return
        L47:
            r0 = 1
            android.net.Uri[] r0 = new android.net.Uri[r0]
            r0[r5] = r3
            goto L3f
        L4d:
            android.net.Uri r3 = r9.getData()
            if (r3 != 0) goto L38
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O17.LJ(int, int, android.content.Intent):void");
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback<android.net.Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        String str;
        String[] strArr;
        Activity activity;
        Fragment fragment;
        if (fileChooserParams.getAcceptTypes().length > 0) {
            str = fileChooserParams.getAcceptTypes()[0];
        } else {
            str = "";
        }
        if (Build.VERSION.SDK_INT >= 33) {
            strArr = new String[]{"android.permission.CAMERA", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_AUDIO"};
        } else {
            strArr = new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"};
        }
        WeakReference<Activity> weakReference = this.LIZJ;
        if (weakReference == null || (activity = weakReference.get()) == null) {
            WeakReference<Fragment> weakReference2 = this.LIZIZ;
            if (weakReference2 == null || (fragment = weakReference2.get()) == null) {
                activity = null;
            } else {
                activity = fragment.mo49getActivity();
            }
        }
        new C77276UUm(activity, TokenCert.with("bpea-webcast-legacy-hybrid-file-chooser")).LIZ(new O16(this, valueCallback, str), strArr);
        return true;
    }
}
