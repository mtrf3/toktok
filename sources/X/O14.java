package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Environment;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O14 extends AbstractC60402NnC {
    public ValueCallback<android.net.Uri[]> LJLIL;
    public String LJLILLLLZI;
    public final /* synthetic */ C60764Nt2 LJLJI;
    public final /* synthetic */ C60763Nt1 LJLJJI;

    @Override // X.AbstractC60536NpM
    public final AbstractC60629Nqr<?> getExtension() {
        return this.LJLJI;
    }

    public static final Intent LIZIZ(Intent... intentArr) {
        Intent intent = new Intent("android.intent.action.CHOOSER");
        intent.putExtra("android.intent.extra.INITIAL_INTENTS", intentArr);
        return intent;
    }

    public final Intent LIZ(Context context) {
        android.net.Uri fromFile;
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        File LLIIJI = C16880lQ.LLIIJI(EF7.LIZIZ(), Environment.DIRECTORY_DCIM);
        if (LLIIJI == null) {
            LLIIJI = new File(C16880lQ.LLIIJLIL(EF7.LIZIZ()), Environment.DIRECTORY_DCIM);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LLIIJI.getAbsolutePath());
        String str = File.separator;
        File file = new File(JBR.LJFF(LIZ, str, "browser-photos", LIZ));
        file.mkdirs();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(file.getAbsolutePath());
        LIZ2.append(str);
        LIZ2.append(System.currentTimeMillis());
        LIZ2.append(".jpg");
        this.LJLILLLLZI = X1D.LIZIZ(LIZ2);
        File file2 = new File(this.LJLILLLLZI);
        if (Build.VERSION.SDK_INT >= 24 && context.getApplicationInfo().targetSdkVersion >= 24) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(context.getPackageName());
            LIZ3.append(".fileprovider");
            fromFile = FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(context, X1D.LIZIZ(LIZ3), file2);
        } else {
            fromFile = android.net.Uri.fromFile(file2);
        }
        intent.putExtra("output", fromFile);
        return intent;
    }

    public final Intent LIZJ(Context context) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        Intent LIZIZ = LIZIZ(LIZ(context), new Intent("android.media.action.VIDEO_CAPTURE"), new Intent("android.provider.MediaStore.RECORD_SOUND"));
        LIZIZ.putExtra("android.intent.extra.INTENT", intent);
        return LIZIZ;
    }

    public O14(C60764Nt2 c60764Nt2, C60763Nt1 c60763Nt1) {
        this.LJLJI = c60764Nt2;
        this.LJLJJI = c60763Nt1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZLLL(WebView webView, Intent intent) {
        String str;
        Activity activity;
        WebKitView webKitView;
        C60737Nsb hybridContext;
        WebKitView webKitView2;
        C60737Nsb hybridContext2;
        C39359FcZ c39359FcZ = SparkContext.Companion;
        boolean z = webView instanceof WebKitView;
        Context context = null;
        r1 = null;
        r1 = null;
        String str2 = null;
        if (z && (webKitView2 = (WebKitView) webView) != null && (hybridContext2 = webKitView2.getHybridContext()) != null) {
            str = hybridContext2.containerId;
        } else {
            str = null;
        }
        c39359FcZ.getClass();
        if (C39359FcZ.LIZ(str) instanceof SparkPopup) {
            if (z && (webKitView = (WebKitView) webView) != null && (hybridContext = webKitView.getHybridContext()) != null) {
                str2 = hybridContext.containerId;
            }
            InterfaceC40159FpT LIZ = C39359FcZ.LIZ(str2);
            o.LJII(LIZ, "null cannot be cast to non-null type com.bytedance.hybrid.spark.page.SparkPopup");
            Fragment fragment = (Fragment) LIZ;
            C78598Ut0.LJIJJ(intent, fragment);
            fragment.startActivityForResult(intent, 666);
            return;
        }
        if (webView != null) {
            context = webView.getContext();
        }
        if (!(context instanceof Activity) || (activity = (Activity) context) == null) {
            return;
        }
        C16880lQ.LJFF(activity, 666, intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x015c A[Catch: ActivityNotFoundException -> 0x01ce, TRY_ENTER, TryCatch #1 {ActivityNotFoundException -> 0x01ce, blocks: (B:69:0x00a2, B:76:0x0124, B:78:0x0197, B:80:0x019d, B:81:0x01a8, B:82:0x01ba, B:83:0x00b8, B:86:0x00bf, B:89:0x00c8, B:90:0x00db, B:91:0x00d6, B:92:0x00ee, B:95:0x00f5, B:98:0x00fe, B:99:0x0111, B:100:0x010c, B:43:0x012a, B:45:0x013d, B:47:0x0142, B:49:0x0148, B:50:0x014a, B:53:0x015c, B:55:0x0160, B:57:0x0165, B:59:0x016b, B:60:0x016d, B:62:0x0183, B:64:0x018b, B:66:0x018f), top: B:68:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0183 A[Catch: ActivityNotFoundException -> 0x01ce, TryCatch #1 {ActivityNotFoundException -> 0x01ce, blocks: (B:69:0x00a2, B:76:0x0124, B:78:0x0197, B:80:0x019d, B:81:0x01a8, B:82:0x01ba, B:83:0x00b8, B:86:0x00bf, B:89:0x00c8, B:90:0x00db, B:91:0x00d6, B:92:0x00ee, B:95:0x00f5, B:98:0x00fe, B:99:0x0111, B:100:0x010c, B:43:0x012a, B:45:0x013d, B:47:0x0142, B:49:0x0148, B:50:0x014a, B:53:0x015c, B:55:0x0160, B:57:0x0165, B:59:0x016b, B:60:0x016d, B:62:0x0183, B:64:0x018b, B:66:0x018f), top: B:68:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.AbstractC60402NnC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onShowFileChooser(android.webkit.WebView r14, android.webkit.ValueCallback<android.net.Uri[]> r15, android.webkit.WebChromeClient.FileChooserParams r16) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.O14.onShowFileChooser(android.webkit.WebView, android.webkit.ValueCallback, android.webkit.WebChromeClient$FileChooserParams):boolean");
    }
}
