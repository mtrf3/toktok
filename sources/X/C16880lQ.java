package X;

import Y.ARunnableS1S0001000_6;
import Y.IDHandlerS7S0000000_6;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.Dialog;
import android.app.Notification;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Debug;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Printer;
import android.view.Choreographer;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.media.MediaBrowserServiceCompat;
import com.byted.cast.capture.NotifyServer.ProjectionService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.widgets.LayeredConstraintLayout;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.advertiser.AdvertiserSettingsActivity;
import com.bytedance.librarian.Librarian;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.sysoptimizer.ReceiverRegisterLancet;
import com.bytedance.sysoptimizer.TypeFaceLancet;
import com.bytedance.sysoptimizer.TypeFaceOptimizer;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tooltip.popup.TuxTooltipPopupWindow;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.cast.framework.media.MediaNotificationService;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.socialbase.downloader.notification.DownloadNotificationService;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyPushFor2067Activity;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.ss.android.ugc.aweme.bullet.module.base.UploadFileFragment;
import com.ss.android.ugc.aweme.configcenter.AwemeConfigCenter;
import com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.mediasession.common.MediaSessionService;
import com.ss.android.ugc.aweme.live.livehostimpl.BgBroadcastService;
import com.ss.android.ugc.aweme.notification.creator.widget.SortPopupWindow;
import com.ss.android.ugc.aweme.share.SystemShareActivity;
import com.ss.android.ugc.aweme.storage.StorageIntercepterManager;
import com.ss.android.ugc.aweme.user.UserStore;
import com.ss.android.ugc.aweme.wiki.AddWikiActivity;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import defpackage.e1;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.o;
import m43.u;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.0lQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16880lQ {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003b, code lost:
    
        if (r2.length() == 0) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LLIL() {
        /*
            r2 = 1
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r3 = m43.u.LJIIJ
            r0 = 0
            r1[r0] = r3
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String r0 = "getGraphApiVersion: %s"
            java.lang.String r1 = LLLZ(r0, r1)
            java.lang.String r0 = "java.lang.String.format(format, *args)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.o.LJII(r3, r0)
            X.Ol8 r0 = X.C52389KhF.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r2) goto L3d
            X.Ol8 r0 = X.C52387KhD.LIZ
            java.lang.Object r2 = r0.getValue()
            java.lang.String r0 = "<get-hookVersion>(...)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            java.lang.String r2 = (java.lang.String) r2
            int r0 = r2.length()
            if (r0 != 0) goto L3e
        L3d:
            r2 = r3
        L3e:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Raw graph api version = "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " and hook graph api = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "FacebookSDkVersionLancet"
            X.C221018lt.LIZ(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16880lQ.LLIL():java.lang.String");
    }

    public static void LLILII() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Raw sdk version = ");
        LIZ.append("13.1.0");
        LIZ.append(" and hook version = ");
        LIZ.append("13.1.0");
        C221018lt.LIZ("FacebookSDkVersionLancet", X1D.LIZIZ(LIZ));
    }

    public static int LLJIJIL(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int LLJILJIL(boolean z) {
        return z ? 1231 : 1237;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027 A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:8:0x0010, B:45:0x0015, B:12:0x0027, B:13:0x009b, B:17:0x002d, B:19:0x0037, B:25:0x0096, B:26:0x0048, B:28:0x0058, B:30:0x0062, B:32:0x0066, B:34:0x0072, B:38:0x0082, B:40:0x0087, B:42:0x008d, B:10:0x0021, B:48:0x001f), top: B:7:0x0010, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:8:0x0010, B:45:0x0015, B:12:0x0027, B:13:0x009b, B:17:0x002d, B:19:0x0037, B:25:0x0096, B:26:0x0048, B:28:0x0058, B:30:0x0062, B:32:0x0066, B:34:0x0072, B:38:0x0082, B:40:0x0087, B:42:0x008d, B:10:0x0021, B:48:0x001f), top: B:7:0x0010, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048 A[Catch: all -> 0x00a0, TryCatch #0 {all -> 0x00a0, blocks: (B:8:0x0010, B:45:0x0015, B:12:0x0027, B:13:0x009b, B:17:0x002d, B:19:0x0037, B:25:0x0096, B:26:0x0048, B:28:0x0058, B:30:0x0062, B:32:0x0066, B:34:0x0072, B:38:0x0082, B:40:0x0087, B:42:0x008d, B:10:0x0021, B:48:0x001f), top: B:7:0x0010, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LLIIIILZ() {
        /*
            java.lang.String r0 = X.C79043V0l.LJLIL
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r0 = X.C79043V0l.LJLIL
            return r0
        Lb:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            boolean r0 = X.C36929EeT.LJ     // Catch: java.lang.Throwable -> La0
            r5 = 1
            if (r0 != 0) goto L21
            java.lang.String r0 = "miui.os.Build"
            java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> La0
            X.C36929EeT.LIZLLL = r5     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> La0
            X.C36929EeT.LJ = r5     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> La0
            goto L24
        L1f:
            X.C36929EeT.LJ = r5     // Catch: java.lang.Throwable -> La0
        L21:
            boolean r0 = X.C36929EeT.LIZLLL     // Catch: java.lang.Throwable -> La0
            goto L25
        L24:
            r0 = 1
        L25:
            if (r0 == 0) goto L2d
            java.lang.String r0 = "MIUI-"
            r3.append(r0)     // Catch: java.lang.Throwable -> La0
            goto L9b
        L2d:
            java.lang.String r1 = android.os.Build.DISPLAY     // Catch: java.lang.Throwable -> La0
            java.lang.String r0 = "Flyme"
            int r0 = r1.indexOf(r0)     // Catch: java.lang.Throwable -> La0
            if (r0 >= 0) goto L44
            java.lang.String r1 = android.os.Build.USER     // Catch: java.lang.Throwable -> La0
            java.lang.String r0 = "flyme"
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L42
            goto L44
        L42:
            r0 = 0
            goto L45
        L44:
            r0 = 1
        L45:
            if (r0 == 0) goto L48
            goto L96
        L48:
            X.EXC r1 = X.EXC.LIZ()     // Catch: java.lang.Throwable -> La0
            java.lang.String r0 = "ro.build.version.emui"
            java.lang.String r4 = r1.LIZIZ(r0)     // Catch: java.lang.Throwable -> La0
            boolean r0 = X.C36929EeT.LJ(r4)     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L87
            java.lang.String r1 = "angler"
            java.lang.String r0 = android.os.Build.BOARD     // Catch: java.lang.Throwable -> La0
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L7f
            java.lang.String r2 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> La0
            if (r2 == 0) goto L7f
            java.lang.String r1 = r2.toLowerCase()     // Catch: java.lang.Throwable -> La0
            java.lang.String r0 = "nexus"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L7f
            java.lang.String r1 = r2.toLowerCase()     // Catch: java.lang.Throwable -> La0
            java.lang.String r0 = "6p"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L7f
            goto L80
        L7f:
            r5 = 0
        L80:
            if (r5 != 0) goto L87
            java.lang.String r0 = "EMUI-"
            r3.append(r0)     // Catch: java.lang.Throwable -> La0
        L87:
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> La0
            if (r0 != 0) goto L9b
            r3.append(r4)     // Catch: java.lang.Throwable -> La0
            java.lang.String r0 = "-"
            r3.append(r0)     // Catch: java.lang.Throwable -> La0
            goto L9b
        L96:
            java.lang.String r0 = "FLYME-"
            r3.append(r0)     // Catch: java.lang.Throwable -> La0
        L9b:
            java.lang.String r0 = android.os.Build.VERSION.INCREMENTAL     // Catch: java.lang.Throwable -> La0
            r3.append(r0)     // Catch: java.lang.Throwable -> La0
        La0:
            java.lang.String r0 = r3.toString()
            X.C79043V0l.LJLIL = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16880lQ.LLIIIILZ():java.lang.String");
    }

    public static CookieManager LLIIL() {
        Context context;
        if (!((Boolean) C52369Kgv.LIZ.getValue()).booleanValue()) {
            return CookieManager.getInstance();
        }
        if (C63081OpJ.LJLJJI) {
            try {
                CookieManager cookieManager = CookieManager.getInstance();
                if (!FKR.LIZ() && !((Boolean) C34710Djm.LJI.getValue()).booleanValue()) {
                    C63081OpJ.LIZLLL(EF7.LIZIZ());
                }
                return cookieManager;
            } catch (RuntimeException e) {
                Throwable cause = e.getCause();
                if (cause != null && "android.webkit.WebViewFactory$MissingWebViewPackageException".equals(cause.getClass().getName())) {
                    C63081OpJ.LJLJJI = false;
                    throw e;
                }
                try {
                    context = (Context) Reflect.on("android.webkit.WebViewFactory").call("getWebViewContextAndSetProvider").get();
                } catch (Exception e2) {
                    LLLLIIL(e2);
                    context = null;
                }
                if (context != null) {
                    if (FKR.LIZ()) {
                        synchronized (C40905G3p.LJIIIIZZ) {
                            C63081OpJ.LIZLLL(EF7.LIZIZ());
                        }
                    } else {
                        C63081OpJ.LIZLLL(EF7.LIZIZ());
                    }
                }
                return CookieManager.getInstance();
            }
        }
        throw new UnsupportedOperationException();
    }

    public static String LLIIZ() {
        if (((Number) C52385KhB.LIZ.getValue()).intValue() == 1) {
            return "3cb5bfc87d653387f576c913b24a37d0";
        }
        Q4J.LJI();
        String str = u.LJ;
        if (str != null) {
            return str;
        }
        throw new Q4W("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    public static Looper LLJJJJ() {
        if (!C78983UzD.LJLLL) {
            return Looper.getMainLooper();
        }
        if (!((Boolean) C35255DsZ.LIZ.getValue()).booleanValue()) {
            return Looper.getMainLooper();
        }
        if (C78983UzD.LJLLJ == null) {
            C78983UzD.LJLLJ = Looper.getMainLooper();
        }
        return C78983UzD.LJLLJ;
    }

    public static File LLLLLLLLLL() {
        File file;
        if (!C39248Fam.LJIIIZ || (file = C39248Fam.LJIIZILJ) == null) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            C39248Fam.LJIIZILJ = externalStorageDirectory;
            return externalStorageDirectory;
        }
        return file;
    }

    public static String LLLLLLLZIL() {
        if (!C39248Fam.LJIIIZ || TextUtils.isEmpty(C39248Fam.LJIJ)) {
            String externalStorageState = Environment.getExternalStorageState();
            C39248Fam.LJIJ = externalStorageState;
            return externalStorageState;
        }
        return C39248Fam.LJIJ;
    }

    public static long LLLLLZ() {
        if (C39248Fam.LJIIIZ && !C39248Fam.LIZ()) {
            long j = C39248Fam.LJIIJJI;
            if (j >= 0) {
                return j;
            }
        }
        long totalRxBytes = TrafficStats.getTotalRxBytes();
        C39248Fam.LJIIJJI = totalRxBytes;
        return totalRxBytes;
    }

    public static ExecutorService LLLLZLLIL() {
        C38027EwB LIZ = C38028EwC.LIZ(FSY.FIXED);
        LIZ.LIZJ = 1;
        return C38995FSd.LIZ(LIZ.LIZ());
    }

    public static Choreographer LLIIIJ() {
        Choreographer choreographer;
        if (Thread.currentThread().getName().equals("FakeMainThread") && (choreographer = FGN.LJ) != null) {
            return choreographer;
        }
        return Choreographer.getInstance();
    }

    public static Thread LLLLIIIILLL() {
        if (Thread.currentThread().getName().equals("FakeMainThread")) {
            return Looper.getMainLooper().getThread();
        }
        return Thread.currentThread();
    }

    public static boolean LLLZLL() {
        if (C40010Fn4.LIZJ().LIZLLL() && C00F.LIZ(31744, 0, "power_mode_perfpoor_opt_type", true) == 1) {
            return true;
        }
        if (C43659HBn.LJJ()) {
            return C43659HBn.LJJI();
        }
        if (FTB.LIZIZ != -1 && FTB.LIZIZ != 1) {
            return false;
        }
        return true;
    }

    public static void LIZ(Dialog dialog) {
        dialog.show();
        View decorView = dialog.getWindow().getDecorView();
        if (decorView != null) {
            Boolean bool = (Boolean) decorView.getTag(R.id.ngc);
            if (bool == null || !bool.booleanValue()) {
                int hashCode = dialog.hashCode();
                HashMap hashMap = (HashMap) C19560pk.LIZIZ;
                if (o.LJ(hashMap.get(Integer.valueOf(hashCode)), Boolean.TRUE)) {
                    hashMap.remove(Integer.valueOf(hashCode));
                } else {
                    return;
                }
            }
            ViewGroup viewGroup = (ViewGroup) dialog.findViewById(android.R.id.content);
            View findFocus = viewGroup.findFocus();
            if (viewGroup.getChildCount() > 0 && !(viewGroup.getChildAt(0) instanceof GestureDetectorOnGestureListenerC13970gj)) {
                GestureDetectorOnGestureListenerC13970gj gestureDetectorOnGestureListenerC13970gj = new GestureDetectorOnGestureListenerC13970gj(dialog.getContext());
                while (viewGroup.getChildCount() > 0) {
                    View childAt = viewGroup.getChildAt(0);
                    LLIFFJFJJ(0, viewGroup);
                    gestureDetectorOnGestureListenerC13970gj.addView(childAt, childAt.getLayoutParams());
                }
                viewGroup.addView(gestureDetectorOnGestureListenerC13970gj, new ViewGroup.LayoutParams(-1, -1));
                if (findFocus != null) {
                    findFocus.requestFocus();
                }
            }
            decorView.setTag(R.id.ngd, Integer.valueOf(decorView.hashCode()));
        }
    }

    public static NetworkInfo LJJLI(ConnectivityManager connectivityManager) {
        try {
            if (!C38523F9z.LIZJ || !C38523F9z.LIZLLL) {
                return connectivityManager.getActiveNetworkInfo();
            }
            if (C38523F9z.LIZIZ || !C38523F9z.LJFF) {
                C38523F9z.LIZ = connectivityManager.getActiveNetworkInfo();
                C38523F9z.LIZIZ = false;
            }
            return C38523F9z.LIZ;
        } catch (Exception e) {
            e.printStackTrace();
            try {
                Class<?> cls = Class.forName("android.net.NetworkInfo");
                Class<?> cls2 = Integer.TYPE;
                return (NetworkInfo) cls.getConstructor(cls2, cls2, String.class, String.class).newInstance(1, 0, "CONNECTED", "CONNECTED");
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public static Typeface LJJLIIIJLJLI(File file) {
        String path;
        if (TypeFaceOptimizer.getSwitch() && (path = file.getPath()) != null) {
            if (TypeFaceLancet.cache.contains(path)) {
                return (Typeface) TypeFaceLancet.cache.get(path);
            }
            Typeface createFromFile = Typeface.createFromFile(file);
            if (createFromFile != null) {
                TypeFaceLancet.cache.put(path, createFromFile);
                return createFromFile;
            }
        }
        return Typeface.createFromFile(file);
    }

    public static Typeface LJJLIIIJLLLLLLLZ(String str) {
        if (TypeFaceOptimizer.getSwitch() && str != null) {
            if (TypeFaceLancet.cache.contains(str)) {
                return (Typeface) TypeFaceLancet.cache.get(str);
            }
            Typeface createFromFile = Typeface.createFromFile(str);
            if (createFromFile != null) {
                TypeFaceLancet.cache.put(str, createFromFile);
                return createFromFile;
            }
        }
        return Typeface.createFromFile(str);
    }

    public static void LJJZ(String str) {
        C78983UzD.LJIILLIIL(a1.LJ("SplitCompat", " : ", str), C44384HbQ.LJJJLIIL());
    }

    public static void LJJZZIII(String str) {
        C78983UzD.LJIILLIIL(a1.LJ("SplitCompat", " : ", str), C44384HbQ.LJJJLIIL());
    }

    public static void LJLJJI(Animator animator) {
        if (!DK4.LIZ()) {
            animator.removeAllListeners();
            return;
        }
        PrintStream printStream = System.err;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnimatorLancet:::");
        LIZ.append(android.util.Log.getStackTraceString(new Exception()));
        printStream.println(X1D.LIZIZ(LIZ));
        animator.removeAllListeners();
    }

    public static void LJLJJL(AnimatorSet animatorSet) {
        if (!DK4.LIZ()) {
            animatorSet.removeAllListeners();
            return;
        }
        PrintStream printStream = System.err;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnimatorLancet:::");
        LIZ.append(android.util.Log.getStackTraceString(new Exception()));
        printStream.println(X1D.LIZIZ(LIZ));
        animatorSet.removeAllListeners();
    }

    public static void LJLJJLL(ObjectAnimator objectAnimator) {
        if (!DK4.LIZ()) {
            objectAnimator.removeAllListeners();
            return;
        }
        PrintStream printStream = System.err;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnimatorLancet:::");
        LIZ.append(android.util.Log.getStackTraceString(new Exception()));
        printStream.println(X1D.LIZIZ(LIZ));
        objectAnimator.removeAllListeners();
    }

    public static void LJLJL(ValueAnimator valueAnimator) {
        if (!DK4.LIZ()) {
            valueAnimator.removeAllListeners();
            return;
        }
        PrintStream printStream = System.err;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnimatorLancet:::");
        LIZ.append(android.util.Log.getStackTraceString(new Exception()));
        printStream.println(X1D.LIZIZ(LIZ));
        valueAnimator.removeAllListeners();
    }

    public static String LJLLILLLL(Class cls) {
        if (C78996UzQ.LJLILLLLZI) {
            return cls.getName();
        }
        return cls.getCanonicalName();
    }

    public static String LJLLJ(Class cls) {
        int i;
        int i2;
        char c;
        if (C78996UzQ.LJLIL) {
            String name = cls.getName();
            if (name.isEmpty()) {
                return "null";
            }
            char[] charArray = name.toCharArray();
            int length = charArray.length;
            do {
                length--;
                if (length >= 0) {
                    c = charArray[length];
                    if (c == '$') {
                        break;
                    }
                } else {
                    i2 = 0;
                    break;
                }
            } while (c != '.');
            i2 = length + 1;
            int length2 = charArray.length - i2;
            char[] cArr = new char[length2];
            for (i = 0; i < length2; i++) {
                cArr[i] = charArray[i2 + i];
            }
            return new String(cArr);
        }
        return cls.getSimpleName();
    }

    public static File LLIIIL(Context context) {
        File file = C57964Moy.LJLJI;
        if (file == null || !C57964Moy.LJLJJLL) {
            File cacheDir = context.getCacheDir();
            C57964Moy.LJLJI = cacheDir;
            return cacheDir;
        }
        return file;
    }

    public static File LLIIIZ(Context context) {
        File file = C57964Moy.LJLILLLLZI;
        if (file == null || !C57964Moy.LJLJJLL) {
            File externalCacheDir = context.getExternalCacheDir();
            C57964Moy.LJLILLLLZI = externalCacheDir;
            return externalCacheDir;
        }
        return file;
    }

    public static File LLIIJLIL(Context context) {
        File file = C57964Moy.LJLJJI;
        if (file == null || !C57964Moy.LJLJJLL) {
            File filesDir = context.getFilesDir();
            C57964Moy.LJLJJI = filesDir;
            return filesDir;
        }
        return file;
    }

    public static void LLIILII(Context context) {
        try {
            C66373Q3d.LIZIZ(context, "facebook.com");
            C66373Q3d.LIZIZ(context, ".facebook.com");
            C66373Q3d.LIZIZ(context, "https://facebook.com");
            C66373Q3d.LIZIZ(context, "https://.facebook.com");
        } catch (Exception unused) {
        }
    }

    public static String LLIILZL(String str) {
        return EXC.LIZ().LIZIZ(str);
    }

    public static Object LLILLIZIL(ContextWrapper contextWrapper) {
        return contextWrapper.getSystemService("activity");
    }

    public static Object LLILLL(SparkActivity sparkActivity) {
        Object systemService;
        if (Build.VERSION.SDK_INT <= 27) {
            if (IN7.LIZ) {
                synchronized (ClipboardManager.class) {
                    systemService = sparkActivity.getSystemService("clipboard");
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(systemService, new IN6((Handler) declaredField.get(systemService)));
                        } catch (Exception e) {
                            PJZ.LIZIZ(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    IN7.LIZ = false;
                }
                return systemService;
            }
            return sparkActivity.getSystemService("clipboard");
        }
        return sparkActivity.getSystemService("clipboard");
    }

    public static Object LLILZIL(MediaSessionService mediaSessionService) {
        return mediaSessionService.getSystemService("notification");
    }

    public static int LLJI(double d) {
        long doubleToLongBits = Double.doubleToLongBits(d);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public static String LLJILJILJ(Context context) {
        if (TextUtils.isEmpty(F6A.LIZ) || F6A.LIZ()) {
            String LIZLLL = C48189Ivh.LIZLLL(C48189Ivh.LJ(context));
            F6A.LIZ = LIZLLL;
            return LIZLLL;
        }
        return F6A.LIZ;
    }

    public static String LLJILLL(Context context) {
        if (TextUtils.isEmpty(F6A.LIZLLL) || F6A.LIZ()) {
            String networkAccessType = NetworkUtils.getNetworkAccessType(context);
            F6A.LIZLLL = networkAccessType;
            return networkAccessType;
        }
        return F6A.LIZLLL;
    }

    public static String LLJJ(Context context) {
        NetworkInfo LJJLI;
        Integer num;
        int i;
        if (TextUtils.isEmpty(F6A.LIZIZ) || F6A.LIZ()) {
            String str = "wifi";
            try {
                LJJLI = LJJLI((ConnectivityManager) LLILL(context, "connectivity"));
            } catch (Throwable unused) {
            }
            if (LJJLI == null || !LJJLI.isAvailable()) {
                str = LiveGiftNewGifterBadgeSetting.DEFAULT;
            } else {
                int type = LJJLI.getType();
                boolean z = true;
                if (1 == type) {
                    WifiManager receiver$0 = (WifiManager) LLILL(LLLLL(context), "wifi");
                    o.LJIIJ(receiver$0, "receiver$0");
                    WifiInfo LIZ = C47975IsF.LIZ(receiver$0);
                    if (LIZ != null) {
                        num = Integer.valueOf(LIZ.getFrequency());
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = -1;
                    }
                    if (i <= 4900 || i >= 5900) {
                        z = false;
                    }
                    if (z) {
                        str = "wifi5g";
                    }
                } else {
                    if (type == 0) {
                        TelephonyManager telephonyManager = (TelephonyManager) LLILL(context, "phone");
                        switch (C48189Ivh.LIZ(telephonyManager)) {
                            case 1:
                                str = "gprs";
                                break;
                            case 2:
                                str = "edge";
                                break;
                            case 3:
                                str = "umts";
                                break;
                            case 4:
                                str = "cdma";
                                break;
                            case 5:
                                str = "evdo_0";
                                break;
                            case 6:
                                str = "evdo_a";
                                break;
                            case 7:
                                str = "1xrtt";
                                break;
                            case 8:
                                str = "hsdpa";
                                break;
                            case 9:
                                str = "hsupa";
                                break;
                            case 10:
                                str = "hspa";
                                break;
                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                str = "iden";
                                break;
                            case 12:
                                str = "evdo_b";
                                break;
                            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                                str = "lte";
                                break;
                            case 14:
                                str = "ehrpd";
                                break;
                            case 15:
                                str = "hspap";
                                break;
                            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                                str = "gsm";
                                break;
                            case 17:
                                str = "td_scdma";
                                break;
                            case 18:
                            default:
                                str = String.valueOf(C48189Ivh.LIZ(telephonyManager));
                                break;
                            case 19:
                                str = "lte_ca";
                                break;
                            case 20:
                                str = "nr";
                                break;
                        }
                    }
                    str = "unknown";
                }
            }
            F6A.LIZIZ = str;
            return str;
        }
        return F6A.LIZIZ;
    }

    public static EnumC48190Ivi LLJJI(Context context) {
        if (F6A.LIZJ == EnumC48190Ivi.UNKNOWN || F6A.LIZ()) {
            C48189Ivh.LIZIZ(context);
            if (System.currentTimeMillis() - C48189Ivh.LIZLLL > 2000) {
                C48189Ivh.LIZIZ = C48189Ivh.LJ(context);
                C48189Ivh.LIZLLL = System.currentTimeMillis();
            }
            EnumC48190Ivi enumC48190Ivi = C48189Ivh.LIZIZ;
            F6A.LIZJ = enumC48190Ivi;
            return enumC48190Ivi;
        }
        return F6A.LIZJ;
    }

    public static Bundle LLJJIJI(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public static void LLJJJ(W5F w5f) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread() && ((((Boolean) C34629DiT.LIZ.getValue()).booleanValue() && C35810E3q.LJFF) || ((Boolean) C34629DiT.LIZIZ.getValue()).booleanValue())) {
            w5f.LJ();
        } else {
            w5f.LIZJ();
        }
    }

    public static void LLJJJIL(String str) {
        IDHandlerS7S0000000_6 iDHandlerS7S0000000_6;
        if (C35820E4a.LIZ(FKM.LIZ(), 0, "key_idle_loadso") > 0 && !FJ5.LIZIZ.contains(str)) {
            FJ5.LJI.set(false);
            FJ5.LIZJ.add(str);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJ(str);
        FJ5.LIZ(uptimeMillis, str);
        if (C35820E4a.LIZ(FKM.LIZ(), 0, "key_idle_loadso") <= 0) {
            return;
        }
        CopyOnWriteArrayList<String> copyOnWriteArrayList = FJ5.LIZJ;
        copyOnWriteArrayList.remove(str);
        AtomicBoolean atomicBoolean = FJ5.LJII;
        if (atomicBoolean.get()) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) FJ5.LIZLLL;
        if (copyOnWriteArrayList2.isEmpty()) {
            atomicBoolean.set(true);
            HandlerThread handlerThread = FJ5.LJ;
            if (handlerThread == null || (iDHandlerS7S0000000_6 = FJ5.LJFF) == null) {
                return;
            }
            iDHandlerS7S0000000_6.removeMessages(0);
            iDHandlerS7S0000000_6.removeCallbacks(new ARunnableS1S0001000_6(3, 16));
            handlerThread.quitSafely();
            return;
        }
        if (copyOnWriteArrayList2.contains(str)) {
            copyOnWriteArrayList2.remove(str);
        }
        if (!copyOnWriteArrayList.isEmpty()) {
            return;
        }
        FJ5.LJFF.sendEmptyMessageDelayed(0, 2L);
        FJ5.LJI.set(true);
    }

    public static void LLLIL(SharedPreferences.Editor editor) {
        editor.apply();
    }

    public static void LLLLII(Context context) {
        if (((Number) C35131DqZ.LIZ.getValue()).intValue() > 0) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{android.R.attr.windowIsFloating, android.R.attr.windowAnimationStyle, R.attr.ty, R.attr.tz, R.attr.u0, R.attr.u1, R.attr.u2, R.attr.u3, R.attr.u4, R.attr.u5, R.attr.u6, R.attr.u7, R.attr.u8, R.attr.u9, R.attr.ua, R.attr.uc, R.attr.ud, R.attr.ue, R.attr.uf, R.attr.ug, R.attr.uh, R.attr.ui, R.attr.uj, R.attr.uk, R.attr.ul, R.attr.um, R.attr.un, R.attr.uo, R.attr.up, R.attr.uq, R.attr.ur, R.attr.us, R.attr.ut, R.attr.uu, R.attr.v1, R.attr.vd, R.attr.ve, R.attr.vf, R.attr.vg, R.attr.wf, R.attr.z3, R.attr.a08, R.attr.a09, R.attr.a0_, R.attr.a0a, R.attr.a0b, R.attr.a0k, R.attr.a0l, R.attr.a1v, R.attr.a24, R.attr.a4e, R.attr.a4f, R.attr.a4g, R.attr.a4h, R.attr.a4i, R.attr.a4j, R.attr.a4k, R.attr.a4r, R.attr.a4s, R.attr.a4z, R.attr.a7g, R.attr.a9y, R.attr.a9z, R.attr.a_0, R.attr.a_g, R.attr.a_q, R.attr.aad, R.attr.aae, R.attr.aap, R.attr.aaq, R.attr.aar, R.attr.ag1, R.attr.ahc, R.attr.aor, R.attr.aot, R.attr.aov, R.attr.aow, R.attr.aoz, R.attr.ap0, R.attr.ap1, R.attr.ap2, R.attr.ap3, R.attr.ap4, R.attr.ap5, R.attr.ap6, R.attr.ap7, R.attr.b3v, R.attr.b3w, R.attr.b3x, R.attr.b51, R.attr.b53, R.attr.b6g, R.attr.b6t, R.attr.b6u, R.attr.b6v, R.attr.b_b, R.attr.b_h, R.attr.b_r, R.attr.b_s, R.attr.bc3, R.attr.bc4, R.attr.bfw, R.attr.bhx, R.attr.bhz, R.attr.bi0, R.attr.bi1, R.attr.bi3, R.attr.bi4, R.attr.bi5, R.attr.bi6, R.attr.bib, R.attr.bic, R.attr.bjx, R.attr.bjy, R.attr.bk7, R.attr.bk8, R.attr.bw_, R.attr.bxp, R.attr.bxq, R.attr.bxr, R.attr.bxs, R.attr.bxt, R.attr.bxu, R.attr.bxv, R.attr.bxx, R.attr.bxy, R.attr.bxz});
        try {
            obtainStyledAttributes.hasValue(117);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static void LLLLIIL(Exception exc) {
        if (!E0G.LIZ) {
            exc.printStackTrace();
        }
    }

    public static void LLLLIILLL(Printer printer) {
        PF6.LJIIIIZZ(true);
        if (printer != null && !((ArrayList) FAI.LIZ.LJLJI).contains(printer)) {
            ((ArrayList) FAI.LIZ.LJLJI).add(printer);
            FAI.LIZ.LJLJJL = true;
        }
    }

    public static boolean LLLLIL(Context context) {
        if (!((Boolean) C35015Doh.LIZ.getValue()).booleanValue()) {
            if (context == null) {
                return false;
            }
            try {
                NetworkInfo LJJLI = LJJLI((ConnectivityManager) LLILL(context, "connectivity"));
                if (LJJLI == null) {
                    return false;
                }
                if (!LJJLI.isConnected()) {
                    return false;
                }
                return true;
            } catch (Exception e) {
                LLLLIIL(e);
                return false;
            }
        }
        if (EnumC111394Yt.NOT_AVAILABLE == C2NU.LIZ.LIZJ) {
            return false;
        }
        return true;
    }

    public static boolean LLLLILI(Context context) {
        NetworkInfo LJJLI;
        if (!((Boolean) C35015Doh.LIZ.getValue()).booleanValue()) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) LLILL(context, "connectivity");
                if (connectivityManager == null || (LJJLI = LJJLI(connectivityManager)) == null) {
                    return false;
                }
                if (!LJJLI.isConnected()) {
                    return false;
                }
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
        if (EnumC111394Yt.NOT_AVAILABLE == C2NU.LIZ.LIZJ) {
            return false;
        }
        return true;
    }

    public static Context LLLLJ(Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        if (!C38891fp.LJLJI) {
            return applicationContext;
        }
        if (applicationContext != null) {
            return applicationContext;
        }
        return C38891fp.LJLILLLLZI;
    }

    public static Context LLLLJI(Application application) {
        Context applicationContext = application.getApplicationContext();
        if (!C38891fp.LJLJI) {
            return applicationContext;
        }
        if (applicationContext != null) {
            return applicationContext;
        }
        return C38891fp.LJLILLLLZI;
    }

    public static Context LLLLL(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (!C38891fp.LJLJI) {
            return applicationContext;
        }
        if (applicationContext != null) {
            return applicationContext;
        }
        return C38891fp.LJLILLLLZI;
    }

    public static Context LLLLLIL(C29S c29s) {
        Context applicationContext = c29s.getApplicationContext();
        if (!C38891fp.LJLJI) {
            return applicationContext;
        }
        if (applicationContext != null) {
            return applicationContext;
        }
        return C38891fp.LJLILLLLZI;
    }

    public static Context LLLLLILLIL(ActivityC45651qj activityC45651qj) {
        Context applicationContext = activityC45651qj.getApplicationContext();
        if (!C38891fp.LJLJI) {
            return applicationContext;
        }
        if (applicationContext != null) {
            return applicationContext;
        }
        return C38891fp.LJLILLLLZI;
    }

    public static Context LLLLLJIL(AdvertiserSettingsActivity advertiserSettingsActivity) {
        Context applicationContext = advertiserSettingsActivity.getApplicationContext();
        if (!C38891fp.LJLJI) {
            return applicationContext;
        }
        if (applicationContext != null) {
            return applicationContext;
        }
        return C38891fp.LJLILLLLZI;
    }

    public static Context LLLLLJLJLL(TwoStepVerifyPushFor2067Activity twoStepVerifyPushFor2067Activity) {
        Context applicationContext = twoStepVerifyPushFor2067Activity.getApplicationContext();
        if (!C38891fp.LJLJI) {
            return applicationContext;
        }
        if (applicationContext != null) {
            return applicationContext;
        }
        return C38891fp.LJLILLLLZI;
    }

    public static Context LLLLLL(CreatorToolsActivity creatorToolsActivity) {
        Context applicationContext = creatorToolsActivity.getApplicationContext();
        if (!C38891fp.LJLJI) {
            return applicationContext;
        }
        if (applicationContext != null) {
            return applicationContext;
        }
        return C38891fp.LJLILLLLZI;
    }

    public static Context LLLLLLIL(SystemShareActivity systemShareActivity) {
        Context applicationContext = systemShareActivity.getApplicationContext();
        if (!C38891fp.LJLJI) {
            return applicationContext;
        }
        if (applicationContext != null) {
            return applicationContext;
        }
        return C38891fp.LJLILLLLZI;
    }

    public static Context LLLLLLJ(VNU vnu) {
        Context applicationContext = vnu.getApplicationContext();
        if (!C38891fp.LJLJI) {
            return applicationContext;
        }
        if (applicationContext != null) {
            return applicationContext;
        }
        return C38891fp.LJLILLLLZI;
    }

    public static ExecutorService LLLLLZL(ThreadFactory threadFactory) {
        if ((threadFactory instanceof ThreadFactoryC38888FOa) || (threadFactory instanceof ThreadFactoryC38899FOl)) {
            return C38995FSd.LIZLLL();
        }
        return PThreadExecutorsUtils.newCachedThreadPool(threadFactory);
    }

    public static ExecutorService LLLLZ(int i) {
        C38027EwB LIZ = C38028EwC.LIZ(FSY.FIXED);
        LIZ.LIZJ = i;
        return C38995FSd.LIZ(LIZ.LIZ());
    }

    public static ScheduledExecutorService LLLLZIL(int i) {
        C38027EwB LIZ = C38028EwC.LIZ(FSY.SCHEDULED);
        LIZ.LIZJ = i;
        return (ScheduledExecutorService) C38995FSd.LIZ(LIZ.LIZ());
    }

    public static ExecutorService LLLLZLLLI(ThreadFactory threadFactory) {
        C38027EwB LIZ = C38028EwC.LIZ(FSY.FIXED);
        LIZ.LIZJ = 1;
        LIZ.LJI = threadFactory;
        return C38995FSd.LIZ(LIZ.LIZ());
    }

    public static boolean LLLZZIL(File file) {
        StorageIntercepterManager.StorageIntercepterConfig storageIntercepterConfig;
        try {
            if (AwemeConfigCenter.LIZIZ()) {
                storageIntercepterConfig = (StorageIntercepterManager.StorageIntercepterConfig) SettingsManager.LIZLLL().LJIIIIZZ("storage_intercepter_key", StorageIntercepterManager.StorageIntercepterConfig.class, InterfaceC35607DyF.LIZ);
            } else {
                storageIntercepterConfig = InterfaceC35607DyF.LIZ;
            }
            if (StorageIntercepterManager.LIZLLL(file.getAbsolutePath(), storageIntercepterConfig)) {
                StorageIntercepterManager.LJFF(file, new RuntimeException(), "exception_delete_log", StorageIntercepterManager.LJ(storageIntercepterConfig));
            }
            if (StorageIntercepterManager.LIZJ(file.getAbsolutePath(), storageIntercepterConfig)) {
                StorageIntercepterManager.LJFF(file, new RuntimeException(), "exception_handle", StorageIntercepterManager.LJ(storageIntercepterConfig));
                return false;
            }
        } catch (Throwable unused) {
        }
        return file.delete();
    }

    public static void LLZ(File file) {
        StorageIntercepterManager.StorageIntercepterConfig storageIntercepterConfig;
        try {
            if (AwemeConfigCenter.LIZIZ()) {
                storageIntercepterConfig = (StorageIntercepterManager.StorageIntercepterConfig) SettingsManager.LIZLLL().LJIIIIZZ("storage_intercepter_key", StorageIntercepterManager.StorageIntercepterConfig.class, InterfaceC35607DyF.LIZ);
            } else {
                storageIntercepterConfig = InterfaceC35607DyF.LIZ;
            }
            if (StorageIntercepterManager.LIZLLL(file.getAbsolutePath(), storageIntercepterConfig)) {
                StorageIntercepterManager.LJFF(file, new RuntimeException(), "exception_delete_log", StorageIntercepterManager.LJ(storageIntercepterConfig));
            }
            if (StorageIntercepterManager.LIZJ(file.getAbsolutePath(), storageIntercepterConfig)) {
                StorageIntercepterManager.LJFF(file, new RuntimeException(), "exception_handle", StorageIntercepterManager.LJ(storageIntercepterConfig));
                return;
            }
        } catch (Throwable unused) {
        }
        file.deleteOnExit();
    }

    public static LayoutInflater LLZIL(Context context) {
        o.LJIIIZ(context, "context");
        LayoutInflater from = LayoutInflater.from(context);
        o.LJII(from, "null cannot be cast to non-null type android.view.LayoutInflater");
        if (((Boolean) C52396KhM.LIZ.getValue()).booleanValue() && (context instanceof InterfaceC86148XrU)) {
            return from;
        }
        if (Build.VERSION.SDK_INT == 24) {
            try {
                if (C79045V0n.LJIIJJI(context) == null) {
                    LayoutInflater cloneInContext = from.cloneInContext(new ContextThemeWrapper(context, R.style.ul));
                    o.LJIIIIZZ(cloneInContext, "inflater.cloneInContext(…style.TikTokTheme_Light))");
                    from = cloneInContext;
                    return from;
                }
                return from;
            } catch (IndexOutOfBoundsException unused) {
                return from;
            }
        }
        if (C79045V0n.LJIIJJI(context) == null) {
            LayoutInflater cloneInContext2 = from.cloneInContext(new ContextThemeWrapper(context, R.style.ul));
            o.LJIIIIZZ(cloneInContext2, "inflater.cloneInContext(…style.TikTokTheme_Light))");
            return cloneInContext2;
        }
        return from;
    }

    public static void LLZILL(Toast toast) {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                Object obj = C111634Zr.LIZ.get(toast);
                Field field = C111634Zr.LIZIZ;
                final Handler handler = (Handler) field.get(obj);
                field.set(obj, new Handler(handler) { // from class: X.2XR
                    public final Handler LIZ;

                    {
                        this.LIZ = handler;
                    }

                    @Override // android.os.Handler
                    public final void dispatchMessage(Message message) {
                        try {
                            super.dispatchMessage(message);
                        } catch (WindowManager.BadTokenException e) {
                            C36922EeM.LJFF(e);
                            C16880lQ.LLLLIIL(e);
                        }
                    }

                    @Override // android.os.Handler
                    public final void handleMessage(Message message) {
                        this.LIZ.handleMessage(message);
                    }
                });
            } catch (Exception e) {
                C36922EeM.LJFF(e);
                LLLLIIL(e);
            }
        }
        toast.show();
    }

    public static void LIZIZ(Activity activity, Intent intent) {
        C78598Ut0.LJIJJ(intent, activity);
        activity.startActivity(intent);
    }

    public static void LIZJ(Context context, Intent intent) {
        C78598Ut0.LJIJJ(intent, context);
        context.startActivity(intent);
    }

    public static void LIZLLL(ActivityC45651qj activityC45651qj, Intent intent) {
        C78598Ut0.LJIJJ(intent, activityC45651qj);
        activityC45651qj.startActivity(intent);
    }

    public static void LJIIIIZZ(UploadFileFragment uploadFileFragment, Intent intent) {
        C78598Ut0.LJIJJ(intent, uploadFileFragment);
        uploadFileFragment.startActivityForResult(intent, 2048);
    }

    public static void LJIIIZ(com.ss.android.ugc.aweme.web.utils.UploadFileFragment uploadFileFragment, Intent intent) {
        C78598Ut0.LJIJJ(intent, uploadFileFragment);
        uploadFileFragment.startActivityForResult(intent, 2048);
    }

    public static void LJIIJ(View.OnClickListener onClickListener, View view) {
        view.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJIIJJI(View.OnClickListener onClickListener, C73305Spp c73305Spp) {
        c73305Spp.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJIIL(ViewGroup viewGroup, View.OnClickListener onClickListener) {
        viewGroup.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJIILIIL(Button button, View.OnClickListener onClickListener) {
        button.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJIILJJIL(FrameLayout frameLayout, View.OnClickListener onClickListener) {
        frameLayout.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJIILL(ImageButton imageButton, View.OnClickListener onClickListener) {
        imageButton.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJIILLIIL(ImageView imageView, View.OnClickListener onClickListener) {
        imageView.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJIIZILJ(LinearLayout linearLayout, View.OnClickListener onClickListener) {
        linearLayout.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJIJ(RelativeLayout relativeLayout, View.OnClickListener onClickListener) {
        relativeLayout.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJIJI(TextView textView, View.OnClickListener onClickListener) {
        textView.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJIJJ(C02Y c02y, View.OnClickListener onClickListener) {
        c02y.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJIJJLI(AppCompatImageView appCompatImageView, View.OnClickListener onClickListener) {
        appCompatImageView.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJIL(ConstraintLayout constraintLayout, View.OnClickListener onClickListener) {
        constraintLayout.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJ(THN thn, View.OnClickListener onClickListener) {
        thn.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJI(C47061t0 c47061t0, View.OnClickListener onClickListener) {
        c47061t0.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJIFFI(C47091t3 c47091t3, View.OnClickListener onClickListener) {
        c47091t3.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJII(LiveIconView liveIconView, View.OnClickListener onClickListener) {
        liveIconView.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJIII(C2A7 c2a7, View.OnClickListener onClickListener) {
        c2a7.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJIIJ(LiveEditText liveEditText, View.OnClickListener onClickListener) {
        liveEditText.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJIIJZLJL(C41071jL c41071jL, View.OnClickListener onClickListener) {
        c41071jL.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJIIZ(C47121t6 c47121t6, View.OnClickListener onClickListener) {
        c47121t6.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJIIZI(C41081jM c41081jM, View.OnClickListener onClickListener) {
        c41081jM.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJIJ(C29512Bi8 c29512Bi8, View.OnClickListener onClickListener) {
        c29512Bi8.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJIJIIJI(C31597Caf c31597Caf, View.OnClickListener onClickListener) {
        c31597Caf.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJIJIIJIL(C116474hf c116474hf, View.OnClickListener onClickListener) {
        c116474hf.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJIJIL(C59948Nfs c59948Nfs, View.OnClickListener onClickListener) {
        c59948Nfs.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJIJL(C72434Sbm c72434Sbm, View.OnClickListener onClickListener) {
        c72434Sbm.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJIJLIJ(SmartImageView smartImageView, View.OnClickListener onClickListener) {
        smartImageView.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJIL(C71799SFv c71799SFv, View.OnClickListener onClickListener) {
        c71799SFv.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJIZ(SY4 sy4, View.OnClickListener onClickListener) {
        sy4.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJJ(TuxIconView tuxIconView, View.OnClickListener onClickListener) {
        tuxIconView.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJJI(C71897SJp c71897SJp, View.OnClickListener onClickListener) {
        c71897SJp.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJJIL(C119244m8 c119244m8, View.OnClickListener onClickListener) {
        c119244m8.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJJJ(C63044Ooi c63044Ooi, View.OnClickListener onClickListener) {
        c63044Ooi.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJJJI(TuxTextView tuxTextView, View.OnClickListener onClickListener) {
        tuxTextView.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJJJIZL(C119624mk c119624mk, View.OnClickListener onClickListener) {
        c119624mk.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJJJJ(AP9 ap9, View.OnClickListener onClickListener) {
        ap9.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJJJJL(C62846OlW c62846OlW, View.OnClickListener onClickListener) {
        c62846OlW.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJJJL(SmartAvatarImageView smartAvatarImageView, View.OnClickListener onClickListener) {
        smartAvatarImageView.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJJJLI(C62354Oda c62354Oda, View.OnClickListener onClickListener) {
        c62354Oda.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJJJLL(TagLayout tagLayout, View.OnClickListener onClickListener) {
        tagLayout.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJJJZ(AnonymousClass488 anonymousClass488, View.OnClickListener onClickListener) {
        anonymousClass488.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJJJZI(HTK htk, View.OnClickListener onClickListener) {
        htk.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJJLIIL(T5P t5p, View.OnClickListener onClickListener) {
        t5p.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJJLL(AnonymousClass976 anonymousClass976, View.OnClickListener onClickListener) {
        anonymousClass976.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJJLZIJ(JON jon, View.OnClickListener onClickListener) {
        jon.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJJZ(C170736mz c170736mz, View.OnClickListener onClickListener) {
        c170736mz.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static void LJJL(LBF lbf, View.OnClickListener onClickListener) {
        lbf.setOnClickListener(new ViewOnClickListenerC13880ga(onClickListener));
    }

    public static Bundle LJJLIIIIJ(Intent intent, String str) {
        Bundle bundleExtra = intent.getBundleExtra(str);
        Context context = BadParcelableCrashOptimizer.getContext();
        if (bundleExtra != null && context != null) {
            bundleExtra.setClassLoader(context.getClassLoader());
        }
        return bundleExtra;
    }

    public static void LJJLIIIJL(Context context, BroadcastReceiver broadcastReceiver) {
        ReceiverRegisterLancet.loge(broadcastReceiver, false);
        context.unregisterReceiver(broadcastReceiver);
    }

    public static InputStream LJJLIIJ(Class cls, String str) {
        C35810E3q.LJIIIIZZ();
        SystemClock.uptimeMillis();
        try {
            if (!TextUtils.isEmpty(str) && ((str.equals("/com/appsflyer/internal/a-") || str.equals("/com/appsflyer/internal/b-")) && ((Boolean) C2VS.LIZJ.getValue()).booleanValue())) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("myappsfly");
                LIZ.append(str.substring(str.lastIndexOf(47)));
                try {
                    return EF7.LIZIZ().getAssets().open(X1D.LIZIZ(LIZ));
                } catch (Throwable unused) {
                    return cls.getResourceAsStream(str);
                }
            }
            return cls.getResourceAsStream(str);
        } catch (Throwable unused2) {
            return cls.getResourceAsStream(str);
        }
    }

    public static void LJJLJ(InputStream inputStream, String str) {
        if (C2PL.LIZ() == 2) {
            C31818CeE.LIZ(inputStream, str);
            return;
        }
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    String name = nextEntry.getName();
                    if (name != null && name.length() != 0) {
                        String name2 = nextEntry.getName();
                        o.LJIIIIZZ(name2, "name");
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("..");
                        LIZ.append(File.separator);
                        if (s.LJJJLZIJ(name2, X1D.LIZIZ(LIZ), false)) {
                            continue;
                        } else if (nextEntry.isDirectory()) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(str);
                            LIZ2.append(File.separator);
                            LIZ2.append(nextEntry.getName());
                            new File(X1D.LIZIZ(LIZ2)).mkdirs();
                        } else {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append(str);
                            LIZ3.append(File.separator);
                            LIZ3.append(nextEntry.getName());
                            File file = new File(X1D.LIZIZ(LIZ3));
                            File parentFile = file.getParentFile();
                            if (!parentFile.exists()) {
                                parentFile.mkdirs();
                            } else if (file.exists()) {
                                LLLZZIL(file);
                            } else {
                                file.createNewFile();
                            }
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                            try {
                                byte[] bArr = new byte[2048];
                                while (true) {
                                    int read = zipInputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    } else {
                                        bufferedOutputStream.write(bArr, 0, read);
                                    }
                                }
                                bufferedOutputStream.flush();
                                AnonymousClass636.LJFF(bufferedOutputStream, null);
                            } finally {
                            }
                        }
                    }
                } else {
                    AnonymousClass636.LJFF(zipInputStream, null);
                    return;
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass636.LJFF(zipInputStream, th);
                    throw th2;
                }
            }
        }
    }

    public static long LJJLJLI(InputStream inputStream, OutputStream outputStream) {
        int i;
        if (C2PL.LIZ() == 1 || C2PL.LIZ() == 2) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 32768);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream, 32768);
            byte[] bArr = new byte[32768];
            i = 0;
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                i += read;
                bufferedOutputStream.write(bArr, 0, read);
            }
            bufferedOutputStream.flush();
        } else {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(outputStream);
            byte[] bArr2 = new byte[1024];
            i = 0;
            while (true) {
                int read2 = bufferedInputStream2.read(bArr2);
                if (read2 == -1) {
                    break;
                }
                i += read2;
                bufferedOutputStream2.write(bArr2, 0, read2);
            }
            bufferedOutputStream2.flush();
        }
        return i;
    }

    public static void LJJLL(InputStream inputStream, String destDir) {
        o.LJIIIZ(inputStream, "inputStream");
        o.LJIIIZ(destDir, "destDir");
        if (C2PL.LIZ() == 2) {
            C31818CeE.LIZ(inputStream, destDir);
            return;
        }
        ZipInputStream zipInputStream = new ZipInputStream(inputStream);
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    String name = nextEntry.getName();
                    if (name != null && name.length() != 0) {
                        String name2 = nextEntry.getName();
                        o.LJIIIIZZ(name2, "name");
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("..");
                        LIZ.append(File.separator);
                        if (s.LJJJLZIJ(name2, X1D.LIZIZ(LIZ), false)) {
                            continue;
                        } else if (nextEntry.isDirectory()) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(destDir);
                            LIZ2.append(File.separator);
                            LIZ2.append(nextEntry.getName());
                            new File(X1D.LIZIZ(LIZ2)).mkdirs();
                        } else {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append(destDir);
                            LIZ3.append(File.separator);
                            LIZ3.append(nextEntry.getName());
                            File file = new File(X1D.LIZIZ(LIZ3));
                            File parentFile = file.getParentFile();
                            if (!parentFile.exists()) {
                                parentFile.mkdirs();
                            } else if (file.exists()) {
                                LLLZZIL(file);
                            } else {
                                file.createNewFile();
                            }
                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                            try {
                                byte[] bArr = new byte[2048];
                                while (true) {
                                    int read = zipInputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    } else {
                                        bufferedOutputStream.write(bArr, 0, read);
                                    }
                                }
                                bufferedOutputStream.flush();
                                AnonymousClass636.LJFF(bufferedOutputStream, null);
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    AnonymousClass636.LJFF(bufferedOutputStream, th);
                                    throw th2;
                                }
                            }
                        }
                    }
                } else {
                    AnonymousClass636.LJFF(zipInputStream, null);
                    return;
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AnonymousClass636.LJFF(zipInputStream, th3);
                    throw th4;
                }
            }
        }
    }

    public static void LJJZZI(String str, Throwable th) {
        C78983UzD.LJIJI(th, a1.LJ("SplitCompat", " : ", str), C44384HbQ.LJJJLIIL());
    }

    public static void LJL(String str, Throwable th) {
        C78983UzD.LJIJI(th, a1.LJ("SplitCompat", " : ", str), C44384HbQ.LJJJLIIL());
    }

    public static void LJLI(MessageQueue messageQueue, MessageQueue.IdleHandler idleHandler) {
        if (((Boolean) C34710Djm.LJJLIIIJJIZ.getValue()).booleanValue()) {
            messageQueue.addIdleHandler(new EHT(idleHandler));
        } else {
            messageQueue.addIdleHandler(idleHandler);
        }
    }

    public static void LJLIIIL(RBW rbw, String str) {
        if (!e1.LIZ(31744, "tiktok_iskidnow_opt_settings", true, false)) {
            rbw.LIZ(str);
            return;
        }
        synchronized (ZK3.LIZ) {
            str.equals(RBW.LJLLI.LIZJ());
        }
        rbw.LIZ(str);
    }

    public static void LJLIIL(RBW rbw, String str) {
        if (!e1.LIZ(31744, "tiktok_iskidnow_opt_settings", true, false)) {
            rbw.LJIIIIZZ(str);
            return;
        }
        synchronized (ZK3.LIZ) {
        }
        rbw.LJIIIIZZ(str);
    }

    public static void LJLIL(RBW rbw, UserStore.AccountUser accountUser) {
        if (!e1.LIZ(31744, "tiktok_iskidnow_opt_settings", true, false)) {
            rbw.LJIIJJI(accountUser);
            return;
        }
        synchronized (ZK3.LIZ) {
        }
        rbw.LJIIJJI(accountUser);
    }

    public static void LJLJLJ(Animator.AnimatorListener animatorListener, Animator animator) {
        if (!DK4.LIZ()) {
            animator.removeListener(animatorListener);
            return;
        }
        PrintStream printStream = System.err;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnimatorLancet:::");
        LIZ.append(android.util.Log.getStackTraceString(new Exception()));
        printStream.println(X1D.LIZIZ(LIZ));
        animator.removeListener(animatorListener);
    }

    public static void LJLJLLL(AnimatorSet animatorSet, Animator.AnimatorListener animatorListener) {
        if (!DK4.LIZ()) {
            animatorSet.removeListener(animatorListener);
            return;
        }
        PrintStream printStream = System.err;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnimatorLancet:::");
        LIZ.append(android.util.Log.getStackTraceString(new Exception()));
        printStream.println(X1D.LIZIZ(LIZ));
        animatorSet.removeListener(animatorListener);
    }

    public static void LJLL(ObjectAnimator objectAnimator, Animator.AnimatorListener animatorListener) {
        if (!DK4.LIZ()) {
            objectAnimator.removeListener(animatorListener);
            return;
        }
        PrintStream printStream = System.err;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnimatorLancet:::");
        LIZ.append(android.util.Log.getStackTraceString(new Exception()));
        printStream.println(X1D.LIZIZ(LIZ));
        objectAnimator.removeListener(animatorListener);
    }

    public static void LJLLI(ValueAnimator valueAnimator, Animator.AnimatorListener animatorListener) {
        if (!DK4.LIZ()) {
            valueAnimator.removeListener(animatorListener);
            return;
        }
        PrintStream printStream = System.err;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnimatorLancet:::");
        LIZ.append(android.util.Log.getStackTraceString(new Exception()));
        printStream.println(X1D.LIZIZ(LIZ));
        valueAnimator.removeListener(animatorListener);
    }

    public static void LJLLL(View view, ViewGroup viewGroup) {
        if (C78996UzQ.LJJIIJZLJL(view)) {
            C78996UzQ.LJI();
        }
        viewGroup.removeView(view);
    }

    public static void LJLLLL(View view, FrameLayout frameLayout) {
        if (C78996UzQ.LJJIIJZLJL(view)) {
            C78996UzQ.LJI();
        }
        frameLayout.removeView(view);
    }

    public static void LJLLLLLL(View view, RelativeLayout relativeLayout) {
        if (C78996UzQ.LJJIIJZLJL(view)) {
            C78996UzQ.LJI();
        }
        relativeLayout.removeView(view);
    }

    public static void LJLZ(View view, ConstraintLayout constraintLayout) {
        if (C78996UzQ.LJJIIJZLJL(view)) {
            C78996UzQ.LJI();
        }
        constraintLayout.removeView(view);
    }

    public static void LJZ(View view, SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) {
        if (C78996UzQ.LJJIIJZLJL(view)) {
            C78996UzQ.LJI();
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.removeView(view);
    }

    public static void LJZI(LinearLayout linearLayout, View view) {
        if (C78996UzQ.LJJIIJZLJL(view)) {
            C78996UzQ.LJI();
        }
        linearLayout.removeView(view);
    }

    public static void LJZL(C011902x c011902x, View view) {
        if (C78996UzQ.LJJIIJZLJL(view)) {
            C78996UzQ.LJI();
        }
        c011902x.removeView(view);
    }

    public static void LL(C60193Njp c60193Njp, View view) {
        if (C78996UzQ.LJJIIJZLJL(view)) {
            C78996UzQ.LJI();
        }
        c60193Njp.removeView(view);
    }

    public static void LLD(LayeredConstraintLayout layeredConstraintLayout, View view) {
        if (C78996UzQ.LJJIIJZLJL(view)) {
            C78996UzQ.LJI();
        }
        layeredConstraintLayout.removeView(view);
    }

    public static void LLF(C80133Vcf c80133Vcf, View view) {
        if (C78996UzQ.LJJIIJZLJL(view)) {
            C78996UzQ.LJI();
        }
        c80133Vcf.removeView(view);
    }

    public static void LLFF(TagLayout tagLayout, View view) {
        if (C78996UzQ.LJJIIJZLJL(view)) {
            C78996UzQ.LJI();
        }
        tagLayout.removeView(view);
    }

    public static void LLFFF(C77095UNn c77095UNn, View view) {
        if (C78996UzQ.LJJIIJZLJL(view)) {
            C78996UzQ.LJI();
        }
        c77095UNn.removeView(view);
    }

    public static void LLFII(C1297757l c1297757l, View view) {
        if (C78996UzQ.LJJIIJZLJL(view)) {
            C78996UzQ.LJI();
        }
        c1297757l.removeView(view);
    }

    public static void LLFZ(C1297357h c1297357h, View view) {
        if (C78996UzQ.LJJIIJZLJL(view)) {
            C78996UzQ.LJI();
        }
        c1297357h.removeView(view);
    }

    public static void LLI(AbstractViewOnTouchListenerC82865Wfd abstractViewOnTouchListenerC82865Wfd, View view) {
        if (C78996UzQ.LJJIIJZLJL(view)) {
            C78996UzQ.LJI();
        }
        abstractViewOnTouchListenerC82865Wfd.removeView(view);
    }

    public static void LLIFFJFJJ(int i, ViewGroup viewGroup) {
        try {
            if (C78996UzQ.LJJIIJZLJL(viewGroup.getChildAt(i))) {
                C78996UzQ.LJI();
            }
        } catch (Throwable unused) {
        }
        viewGroup.removeViewAt(i);
    }

    public static void LLII(LinearLayout linearLayout, int i) {
        try {
            if (C78996UzQ.LJJIIJZLJL(linearLayout.getChildAt(i))) {
                C78996UzQ.LJI();
            }
        } catch (Throwable unused) {
        }
        linearLayout.removeViewAt(i);
    }

    public static void LLIIII(View view, ViewGroup viewGroup) {
        if (C78996UzQ.LJJIIJZLJL(view)) {
            C78996UzQ.LJI();
        }
        viewGroup.removeViewInLayout(view);
    }

    public static File LLIIJI(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            return context.getExternalFilesDir(str);
        }
        File file = C57964Moy.LJLJJL;
        if (file == null || !C57964Moy.LJLJJLL) {
            File externalFilesDir = context.getExternalFilesDir(str);
            C57964Moy.LJLJJL = externalFilesDir;
            return externalFilesDir;
        }
        return file;
    }

    public static Object LLILIL(Activity activity, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT <= 27 && "clipboard".equals(str)) {
            if (IN7.LIZ) {
                synchronized (ClipboardManager.class) {
                    systemService = activity.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(systemService, new IN6((Handler) declaredField.get(systemService)));
                        } catch (Exception e) {
                            PJZ.LIZIZ(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    IN7.LIZ = false;
                }
                return systemService;
            }
            return activity.getSystemService(str);
        }
        if (!IN7.LIZIZ && "connectivity".equals(str)) {
            try {
                new C36721Eb7().LJ();
                IN7.LIZIZ = true;
                return activity.getSystemService(str);
            } catch (Throwable unused) {
                return activity.getSystemService(str);
            }
        }
        return activity.getSystemService(str);
    }

    public static Object LLILL(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT <= 27 && "clipboard".equals(str)) {
            if (IN7.LIZ) {
                synchronized (ClipboardManager.class) {
                    systemService = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(systemService, new IN6((Handler) declaredField.get(systemService)));
                        } catch (Exception e) {
                            PJZ.LIZIZ(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    IN7.LIZ = false;
                }
                return systemService;
            }
            return context.getSystemService(str);
        }
        if (!IN7.LIZIZ && "connectivity".equals(str)) {
            try {
                new C36721Eb7().LJ();
                IN7.LIZIZ = true;
                return context.getSystemService(str);
            } catch (Throwable unused) {
                return context.getSystemService(str);
            }
        }
        return context.getSystemService(str);
    }

    public static Object LLILLJJLI(ActivityC45651qj activityC45651qj, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT <= 27 && "clipboard".equals(str)) {
            if (IN7.LIZ) {
                synchronized (ClipboardManager.class) {
                    systemService = activityC45651qj.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(systemService, new IN6((Handler) declaredField.get(systemService)));
                        } catch (Exception e) {
                            PJZ.LIZIZ(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    IN7.LIZ = false;
                }
                return systemService;
            }
            return activityC45651qj.getSystemService(str);
        }
        if (!IN7.LIZIZ && "connectivity".equals(str)) {
            try {
                new C36721Eb7().LJ();
                IN7.LIZIZ = true;
                return activityC45651qj.getSystemService(str);
            } catch (Throwable unused) {
                return activityC45651qj.getSystemService(str);
            }
        }
        return activityC45651qj.getSystemService(str);
    }

    public static Object LLILZ(DownloadNotificationService downloadNotificationService, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT <= 27 && "clipboard".equals(str)) {
            if (IN7.LIZ) {
                synchronized (ClipboardManager.class) {
                    systemService = downloadNotificationService.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(systemService, new IN6((Handler) declaredField.get(systemService)));
                        } catch (Exception e) {
                            PJZ.LIZIZ(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    IN7.LIZ = false;
                }
                return systemService;
            }
            return downloadNotificationService.getSystemService(str);
        }
        if (!IN7.LIZIZ && "connectivity".equals(str)) {
            try {
                new C36721Eb7().LJ();
                IN7.LIZIZ = true;
                return downloadNotificationService.getSystemService(str);
            } catch (Throwable unused) {
                return downloadNotificationService.getSystemService(str);
            }
        }
        return downloadNotificationService.getSystemService(str);
    }

    public static Object LLILZLL(AddWikiActivity addWikiActivity, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT <= 27 && "clipboard".equals(str)) {
            if (IN7.LIZ) {
                synchronized (ClipboardManager.class) {
                    systemService = addWikiActivity.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(systemService, new IN6((Handler) declaredField.get(systemService)));
                        } catch (Exception e) {
                            PJZ.LIZIZ(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    IN7.LIZ = false;
                }
                return systemService;
            }
            return addWikiActivity.getSystemService(str);
        }
        if (!IN7.LIZIZ && "connectivity".equals(str)) {
            try {
                new C36721Eb7().LJ();
                IN7.LIZIZ = true;
                return addWikiActivity.getSystemService(str);
            } catch (Throwable unused) {
                return addWikiActivity.getSystemService(str);
            }
        }
        return addWikiActivity.getSystemService(str);
    }

    public static Object LLIZ(String str, Application application) {
        Object systemService;
        if (Build.VERSION.SDK_INT <= 27 && "clipboard".equals(str)) {
            if (IN7.LIZ) {
                synchronized (ClipboardManager.class) {
                    systemService = application.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(systemService, new IN6((Handler) declaredField.get(systemService)));
                        } catch (Exception e) {
                            PJZ.LIZIZ(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    IN7.LIZ = false;
                }
                return systemService;
            }
            return application.getSystemService(str);
        }
        if (!IN7.LIZIZ && "connectivity".equals(str)) {
            try {
                new C36721Eb7().LJ();
                IN7.LIZIZ = true;
                return application.getSystemService(str);
            } catch (Throwable unused) {
                return application.getSystemService(str);
            }
        }
        return application.getSystemService(str);
    }

    public static Object LLIZLLLIL(VNU vnu, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT <= 27 && "clipboard".equals(str)) {
            if (IN7.LIZ) {
                synchronized (ClipboardManager.class) {
                    systemService = vnu.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(systemService, new IN6((Handler) declaredField.get(systemService)));
                        } catch (Exception e) {
                            PJZ.LIZIZ(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    IN7.LIZ = false;
                }
                return systemService;
            }
            return vnu.getSystemService(str);
        }
        if (!IN7.LIZIZ && "connectivity".equals(str)) {
            try {
                new C36721Eb7().LJ();
                IN7.LIZIZ = true;
                return vnu.getSystemService(str);
            } catch (Throwable unused) {
                return vnu.getSystemService(str);
            }
        }
        return vnu.getSystemService(str);
    }

    public static TypeAdapter LLJ(Gson gson, TypeToken typeToken) {
        TypeAdapter LJIIIZ;
        if (((Number) C34043DXr.LIZ.getValue()).intValue() > 0) {
            synchronized (typeToken.getType()) {
                LJIIIZ = gson.LJIIIZ(typeToken);
            }
            return LJIIIZ;
        }
        return gson.LJIIIZ(typeToken);
    }

    public static Object LLJJIII(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public static String LLJJIJIIJIL(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static int LLJJIJIL(Lifecycle.State state, Enum r2) {
        if (((Boolean) C34841Dlt.LIZ.getValue()).booleanValue()) {
            return state.ordinal() - r2.ordinal();
        }
        return state.compareTo((Lifecycle.State) r2);
    }

    public static int LLJJJJJIL(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        C36832Ecu c36832Ecu = C36833Ecv.LJFF;
        if (c36832Ecu != null) {
            c36832Ecu.LJLILLLLZI = 0;
        }
        return audioManager.requestAudioFocus(audioFocusRequest);
    }

    public static Debug.MemoryInfo[] LLJJL(ActivityManager activityManager, int[] iArr) {
        if (!((Boolean) C52273KfN.LIZ.getValue()).booleanValue()) {
            return activityManager.getProcessMemoryInfo(iArr);
        }
        if (iArr.length != 1) {
            return activityManager.getProcessMemoryInfo(iArr);
        }
        if (IT9.LIZIZ == null) {
            IT9.LIZ = System.currentTimeMillis();
            Debug.MemoryInfo[] processMemoryInfo = activityManager.getProcessMemoryInfo(iArr);
            IT9.LIZIZ = processMemoryInfo;
            return processMemoryInfo;
        }
        if (System.currentTimeMillis() - IT9.LIZ > ((Number) C52371Kgx.LIZ.getValue()).intValue() * 60000) {
            IT9.LIZ = System.currentTimeMillis();
            IT9.LIZIZ = activityManager.getProcessMemoryInfo(iArr);
        }
        return IT9.LIZIZ;
    }

    public static void LLJJLIIIJLLLLLLLZ(PopupWindow popupWindow, View view) {
        if (C4XM.LIZ()) {
            C56308M8a.LIZ();
        }
        C46318IFu.LIZ.getClass();
        if (C46318IFu.LIZ()) {
            try {
                C56308M8a.LIZIZ();
                Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(popupWindow));
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i = attributes.flags;
                boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                attributes.flags &= -16777217;
                popupWindow.showAsDropDown(view);
                C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                attributes.flags = i;
                return;
            } catch (Throwable unused) {
                popupWindow.showAsDropDown(view);
                return;
            }
        }
        popupWindow.showAsDropDown(view);
    }

    public static void LLJLL(C56736MOm c56736MOm, View view) {
        if (C4XM.LIZ()) {
            C56308M8a.LIZ();
        }
        C46318IFu.LIZ.getClass();
        if (C46318IFu.LIZ()) {
            try {
                C56308M8a.LIZIZ();
                Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(c56736MOm));
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i = attributes.flags;
                boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                attributes.flags &= -16777217;
                c56736MOm.showAsDropDown(view);
                C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                attributes.flags = i;
                return;
            } catch (Throwable unused) {
                c56736MOm.showAsDropDown(view);
                return;
            }
        }
        c56736MOm.showAsDropDown(view);
    }

    public static void LLJZ(AKV akv, View view) {
        if (C4XM.LIZ()) {
            C56308M8a.LIZ();
        }
        C46318IFu.LIZ.getClass();
        if (C46318IFu.LIZ()) {
            try {
                C56308M8a.LIZIZ();
                Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(akv));
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i = attributes.flags;
                boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                attributes.flags &= -16777217;
                akv.showAtLocation(view, 80, 0, 0);
                C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                attributes.flags = i;
                return;
            } catch (Throwable unused) {
                akv.showAtLocation(view, 80, 0, 0);
                return;
            }
        }
        akv.showAtLocation(view, 80, 0, 0);
    }

    public static void LLJZIJLIL(AKM akm, View view) {
        if (C4XM.LIZ()) {
            C56308M8a.LIZ();
        }
        C46318IFu.LIZ.getClass();
        if (C46318IFu.LIZ()) {
            try {
                C56308M8a.LIZIZ();
                Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(akm));
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i = attributes.flags;
                boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                attributes.flags &= -16777217;
                akm.showAtLocation(view, 80, 0, 0);
                C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                attributes.flags = i;
                return;
            } catch (Throwable unused) {
                akm.showAtLocation(view, 80, 0, 0);
                return;
            }
        }
        akm.showAtLocation(view, 80, 0, 0);
    }

    public static void LLLFFI(GWG gwg, View view) {
        if (C4XM.LIZ()) {
            C56308M8a.LIZ();
        }
        C46318IFu.LIZ.getClass();
        if (C46318IFu.LIZ()) {
            try {
                C56308M8a.LIZIZ();
                Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(gwg));
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i = attributes.flags;
                boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                attributes.flags &= -16777217;
                gwg.showAtLocation(view, 48, 0, 0);
                C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                attributes.flags = i;
                return;
            } catch (Throwable unused) {
                gwg.showAtLocation(view, 48, 0, 0);
                return;
            }
        }
        gwg.showAtLocation(view, 48, 0, 0);
    }

    public static void LLLIIII(C81262Vus c81262Vus, View view) {
        if (C4XM.LIZ()) {
            C56308M8a.LIZ();
        }
        C46318IFu.LIZ.getClass();
        if (C46318IFu.LIZ()) {
            try {
                C56308M8a.LIZIZ();
                Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(c81262Vus));
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i = attributes.flags;
                boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                attributes.flags &= -16777217;
                c81262Vus.showAtLocation(view, 80, 0, 0);
                C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                attributes.flags = i;
                return;
            } catch (Throwable unused) {
                c81262Vus.showAtLocation(view, 80, 0, 0);
                return;
            }
        }
        c81262Vus.showAtLocation(view, 80, 0, 0);
    }

    public static void LLLIZZ(MediaNotificationService mediaNotificationService, Notification notification) {
        if (C40684Fxw.LIZ() && mediaNotificationService != null) {
            PrintStream printStream = System.err;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("service info---->:");
            LIZ.append(mediaNotificationService.getClass().getCanonicalName());
            printStream.println(X1D.LIZIZ(LIZ));
        }
        mediaNotificationService.startForeground(1, notification);
    }

    public static void LLLJIL(BgBroadcastService bgBroadcastService, Notification notification) {
        if (C40684Fxw.LIZ() && bgBroadcastService != null) {
            PrintStream printStream = System.err;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("service info---->:");
            LIZ.append(bgBroadcastService.getClass().getCanonicalName());
            printStream.println(X1D.LIZIZ(LIZ));
        }
        bgBroadcastService.startForeground(R.id.h4g, notification);
    }

    public static ComponentName LLLL(Context context, Intent intent) {
        boolean z;
        if (context instanceof Context) {
            o.LJIIIZ(context, "context");
            o.LJIIIZ(intent, "intent");
            if (C38672FFs.LIZ != null) {
                FGY fgy = C38672FFs.LIZ;
                o.LJI(fgy);
                z = fgy.LIZIZ(context, intent);
            } else {
                z = false;
            }
            ComponentName componentName = null;
            if (z) {
                return null;
            }
            try {
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("StartServiceLancet_startService", false) && Build.VERSION.SDK_INT >= 26 && C84763XOl.LJIIJJI) {
                    C78983UzD.LJIILL("dangerousStartService warning! make sure you are in forground call startService ".concat(intent.getClass().getName()));
                }
            } catch (Exception unused) {
            }
            try {
                componentName = context.startService(intent);
                return componentName;
            } catch (RuntimeException e) {
                boolean z2 = false;
                for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                    if (stackTraceElement.getClassName().startsWith("com.ss.android.ugc.aweme.scheduler.PublishService") && "show".equals(stackTraceElement.getMethodName())) {
                        z2 = true;
                    }
                }
                if (z2) {
                    return componentName;
                }
                throw e;
            }
        }
        return context.startService(intent);
    }

    public static int LLLLLLZZ(AudioManager audioManager, int i) {
        int i2;
        if (i != 3) {
            return audioManager.getStreamMaxVolume(i);
        }
        if (!C39248Fam.LJIIIZ || (i2 = C39248Fam.LJIIL) < 0) {
            int streamMaxVolume = audioManager.getStreamMaxVolume(i);
            C39248Fam.LJIIL = streamMaxVolume;
            return streamMaxVolume;
        }
        return i2;
    }

    public static int LLLLLZIL(GoogleApiAvailability googleApiAvailability, Context context) {
        if (!C39248Fam.LJIIIZ || C39248Fam.LJI < 0) {
            C39248Fam.LJI = googleApiAvailability.isGooglePlayServicesAvailable(context);
            return C39248Fam.LJI;
        }
        return C39248Fam.LJI;
    }

    public static ExecutorService LLLLZI(int i, ThreadFactory threadFactory) {
        C38027EwB LIZ = C38028EwC.LIZ(FSY.FIXED);
        LIZ.LIZJ = i;
        LIZ.LJI = threadFactory;
        return C38995FSd.LIZ(LIZ.LIZ());
    }

    public static ScheduledExecutorService LLLLZLL(int i, ThreadFactory threadFactory) {
        C38027EwB LIZ = C38028EwC.LIZ(FSY.SCHEDULED);
        LIZ.LIZJ = i;
        LIZ.LJI = threadFactory;
        return (ScheduledExecutorService) C38995FSd.LIZ(LIZ.LIZ());
    }

    public static String LLLZ(String str, Object[] objArr) {
        if (str == null || !str.contains("%d")) {
            return String.format(str, objArr);
        }
        try {
            if (!ZKN.LIZ) {
                try {
                    C85990Xow c85990Xow = C85990Xow.LIZ;
                    Context LIZIZ = EF7.LIZIZ();
                    c85990Xow.getClass();
                    ZKN.LIZIZ = C85990Xow.LJI(LIZIZ);
                    ZKN.LIZ = true;
                } catch (Throwable unused) {
                }
            }
            if (ZKN.LIZIZ) {
                str = String.format(Locale.ENGLISH, str, objArr);
            } else {
                str = String.format(Locale.getDefault(), str, objArr);
            }
        } catch (Exception unused2) {
        }
        return str;
    }

    public static NetworkInfo LLLZIL(ConnectivityManager connectivityManager, int i) {
        try {
            return connectivityManager.getNetworkInfo(i);
        } catch (Exception e) {
            C36922EeM.LJFF(e);
            return C78609UtB.LJJIJLIJ();
        }
    }

    public static NetworkInfo LLLZL(ConnectivityManager connectivityManager, Network network) {
        try {
            return connectivityManager.getNetworkInfo(network);
        } catch (Exception e) {
            C36922EeM.LJFF(e);
            return C78609UtB.LJJIJLIJ();
        }
    }

    public static String LLLZLZ(TypedArray typedArray, int i) {
        int resourceId;
        if (!C40905G3p.LIZIZ || !(typedArray instanceof TypedArray) || typedArray == null || (resourceId = typedArray.getResourceId(i, 1)) == 1) {
            return typedArray.getString(i);
        }
        return typedArray.getResources().getString(resourceId);
    }

    public static CharSequence LLLZZ(TypedArray typedArray, int i) {
        int resourceId;
        if (!C40905G3p.LIZIZ || !(typedArray instanceof TypedArray) || typedArray == null || (resourceId = typedArray.getResourceId(i, 1)) == 1) {
            return typedArray.getText(i);
        }
        return typedArray.getResources().getText(resourceId);
    }

    public static void LLZL(WebSettings webSettings, String str) {
        if (C52300Kfo.LIZ() && (!str.contains(" BytedanceWebview/d8a21c6") || !str.endsWith(" BytedanceWebview/d8a21c6"))) {
            str = str.replace(" BytedanceWebview/d8a21c6", "") + " BytedanceWebview/d8a21c6";
        }
        webSettings.setUserAgentString(str);
    }

    public static void LLZLI(WebView webView, WebViewClient webViewClient) {
        if (C52300Kfo.LIZ() && webViewClient != null) {
            WebSettings settings = webView.getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains(" BytedanceWebview/d8a21c6")) {
                settings.setUserAgentString(userAgentString.concat(" BytedanceWebview/d8a21c6"));
            }
        }
        webView.setWebViewClient(C78688UuS.LJJIZ(webViewClient));
    }

    public static void LLZLL(WebKitView webKitView, WebViewClient webViewClient) {
        if (C52300Kfo.LIZ()) {
            WebSettings settings = webKitView.getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains(" BytedanceWebview/d8a21c6")) {
                settings.setUserAgentString(userAgentString.concat(" BytedanceWebview/d8a21c6"));
            }
        }
        webKitView.setWebViewClient(C78688UuS.LJJIZ(webViewClient));
    }

    public static void LLZLLIL(C59612NaS c59612NaS, C59580NZw c59580NZw) {
        if (C52300Kfo.LIZ()) {
            WebSettings settings = c59612NaS.getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains(" BytedanceWebview/d8a21c6")) {
                settings.setUserAgentString(userAgentString.concat(" BytedanceWebview/d8a21c6"));
            }
        }
        c59612NaS.setWebViewClient(C78688UuS.LJJIZ(c59580NZw));
    }

    public static void LLZLLLL(C59613NaT c59613NaT, C59581NZx c59581NZx) {
        if (C52300Kfo.LIZ()) {
            WebSettings settings = c59613NaT.getSettings();
            String userAgentString = settings.getUserAgentString();
            if (!userAgentString.contains(" BytedanceWebview/d8a21c6")) {
                settings.setUserAgentString(userAgentString.concat(" BytedanceWebview/d8a21c6"));
            }
        }
        c59613NaT.setWebViewClient(C78688UuS.LJJIZ(c59581NZx));
    }

    public static void LLZZ(WebView webView, String str) {
        String LIZLLL = C37037EgD.LIZ.LIZLLL(webView, str);
        if (!TextUtils.isEmpty(LIZLLL)) {
            str = LIZLLL;
        }
        webView.loadUrl(str);
    }

    public static void LJ(Context context, Intent intent, Bundle bundle) {
        C78598Ut0.LJIJJ(intent, context);
        C04250Er.LIZIZ(context, intent, bundle);
    }

    public static void LJFF(Activity activity, int i, Intent intent) {
        C78598Ut0.LJIJJ(intent, activity);
        activity.startActivityForResult(intent, i);
    }

    public static void LJI(ActivityC45651qj activityC45651qj, Intent intent, int i) {
        C78598Ut0.LJIJJ(intent, activityC45651qj);
        activityC45651qj.startActivityForResult(intent, i);
    }

    public static void LJII(Fragment fragment, Intent intent, int i) {
        C78598Ut0.LJIJJ(intent, fragment);
        fragment.startActivityForResult(intent, i);
    }

    public static Intent LJJLIIIJ(Application application, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
            ReceiverRegisterCrashOptimizer.doHWReceiverFix();
        }
        try {
            if (ReceiverRegisterCrashOptimizer.doRegisterHandler()) {
                ReceiverRegisterLancet.initHandler();
                return application.registerReceiver(broadcastReceiver, intentFilter, null, ReceiverRegisterLancet.sReceiverHandler);
            }
            return application.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    public static Intent LJJLIIIJILLIZJL(BroadcastReceiver broadcastReceiver, Context context, IntentFilter intentFilter) {
        if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
            ReceiverRegisterCrashOptimizer.doHWReceiverFix();
        }
        try {
            if (ReceiverRegisterCrashOptimizer.doRegisterHandler()) {
                ReceiverRegisterLancet.initHandler();
                return context.registerReceiver(broadcastReceiver, intentFilter, null, ReceiverRegisterLancet.sReceiverHandler);
            }
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    public static void LJJLIIIJJIZ(ActivityC45651qj activityC45651qj, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
            ReceiverRegisterCrashOptimizer.doHWReceiverFix();
        }
        try {
            if (ReceiverRegisterCrashOptimizer.doRegisterHandler()) {
                ReceiverRegisterLancet.initHandler();
                activityC45651qj.registerReceiver(broadcastReceiver, intentFilter, null, ReceiverRegisterLancet.sReceiverHandler);
            } else {
                activityC45651qj.registerReceiver(broadcastReceiver, intentFilter);
            }
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
                return;
            }
            throw e;
        }
    }

    public static void LJJLIL(C61532OCy c61532OCy, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("key_status", "ak_register");
            jSONObject2.put("accessKey", str);
            jSONObject2.put("path", str2);
            if (C09900aA.LIZJ("disk_gecko_monitor") && !TextUtils.isEmpty(str2) && !str2.contains("offlineX")) {
                jSONObject2.put("stacktrace", android.util.Log.getStackTraceString(new Throwable()));
            }
            C09900aA.LJI("disk_gecko_monitor", jSONObject2, jSONObject, null);
        } catch (Exception e) {
            LLLLIIL(e);
        }
        c61532OCy.getClass();
    }

    public static void LLJLLL(ViewOnClickListenerC250559sR viewOnClickListenerC250559sR, View view, int i) {
        if (C4XM.LIZ()) {
            C56308M8a.LIZ();
        }
        C46318IFu.LIZ.getClass();
        if (C46318IFu.LIZ()) {
            try {
                C56308M8a.LIZIZ();
                Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(viewOnClickListenerC250559sR));
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i2 = attributes.flags;
                boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                attributes.flags &= -16777217;
                viewOnClickListenerC250559sR.showAtLocation(view, 48, 0, i);
                C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                attributes.flags = i2;
                return;
            } catch (Throwable unused) {
                viewOnClickListenerC250559sR.showAtLocation(view, 48, 0, i);
                return;
            }
        }
        viewOnClickListenerC250559sR.showAtLocation(view, 48, 0, i);
    }

    public static void LLLI(C42458GlS c42458GlS, View view, int i) {
        if (C4XM.LIZ()) {
            C56308M8a.LIZ();
        }
        C46318IFu.LIZ.getClass();
        if (C46318IFu.LIZ()) {
            try {
                C56308M8a.LIZIZ();
                Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(c42458GlS));
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i2 = attributes.flags;
                boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                attributes.flags &= -16777217;
                c42458GlS.showAtLocation(view, 48, 0, i);
                C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                attributes.flags = i2;
                return;
            } catch (Throwable unused) {
                c42458GlS.showAtLocation(view, 48, 0, i);
                return;
            }
        }
        c42458GlS.showAtLocation(view, 48, 0, i);
    }

    public static void LLLIILIL(ViewOnClickListenerC62596OhU viewOnClickListenerC62596OhU, View view, int i) {
        if (C4XM.LIZ()) {
            C56308M8a.LIZ();
        }
        C46318IFu.LIZ.getClass();
        if (C46318IFu.LIZ()) {
            try {
                C56308M8a.LIZIZ();
                Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(viewOnClickListenerC62596OhU));
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i2 = attributes.flags;
                boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                attributes.flags &= -16777217;
                viewOnClickListenerC62596OhU.showAtLocation(view, 48, 0, i);
                C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                attributes.flags = i2;
                return;
            } catch (Throwable unused) {
                viewOnClickListenerC62596OhU.showAtLocation(view, 48, 0, i);
                return;
            }
        }
        viewOnClickListenerC62596OhU.showAtLocation(view, 48, 0, i);
    }

    public static void LLLILZ(Service service, int i, Notification notification) {
        if (C40684Fxw.LIZ() && service != null) {
            PrintStream printStream = System.err;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("service info---->:");
            LIZ.append(service.getClass().getCanonicalName());
            printStream.println(X1D.LIZIZ(LIZ));
        }
        service.startForeground(i, notification);
    }

    public static void LLLILZJ(MediaBrowserServiceCompat mediaBrowserServiceCompat, int i, Notification notification) {
        if (C40684Fxw.LIZ() && mediaBrowserServiceCompat != null) {
            PrintStream printStream = System.err;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("service info---->:");
            LIZ.append(mediaBrowserServiceCompat.getClass().getCanonicalName());
            printStream.println(X1D.LIZIZ(LIZ));
        }
        mediaBrowserServiceCompat.startForeground(i, notification);
    }

    public static void LLLILZLLLI(ProjectionService projectionService, int i, Notification notification) {
        if (C40684Fxw.LIZ() && projectionService != null) {
            PrintStream printStream = System.err;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("service info---->:");
            LIZ.append(projectionService.getClass().getCanonicalName());
            printStream.println(X1D.LIZIZ(LIZ));
        }
        projectionService.startForeground(i, notification);
    }

    public static void LLLJ(MediaSessionService mediaSessionService, int i, Notification notification) {
        if (C40684Fxw.LIZ() && mediaSessionService != null) {
            PrintStream printStream = System.err;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("service info---->:");
            LIZ.append(MediaSessionService.class.getCanonicalName());
            printStream.println(X1D.LIZIZ(LIZ));
        }
        mediaSessionService.startForeground(i, notification);
    }

    public static int LLLLLLL(Layout layout, int i, float f) {
        if (Build.VERSION.SDK_INT > 28) {
            return layout.getOffsetForHorizontal(i, f);
        }
        try {
            return layout.getOffsetForHorizontal(i, f);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static ApplicationInfo LLLLLLLLL(PackageManager packageManager, String str, int i) {
        Context LIZIZ = EF7.LIZIZ();
        if (C39248Fam.LJIIIZ && TextUtils.equals(str, LIZIZ.getPackageName()) && i == 128) {
            if (C39248Fam.LIZ == null) {
                C39248Fam.LIZ = packageManager.getApplicationInfo(str, i);
            }
            return C39248Fam.LIZ;
        }
        if (C39248Fam.LJIIIZ && TextUtils.equals(str, LIZIZ.getPackageName()) && i == 0) {
            if (C39248Fam.LIZJ == null) {
                C39248Fam.LIZJ = packageManager.getApplicationInfo(str, i);
            }
            return C39248Fam.LIZJ;
        }
        return packageManager.getApplicationInfo(str, i);
    }

    public static PackageInfo LLLLLLZ(PackageManager packageManager, String str, int i) {
        Context LIZIZ = EF7.LIZIZ();
        if (C39248Fam.LJIIIZ && TextUtils.equals(str, LIZIZ.getPackageName()) && i == 128) {
            if (C39248Fam.LIZIZ == null) {
                C39248Fam.LIZIZ = packageManager.getPackageInfo(str, i);
            }
            return C39248Fam.LIZIZ;
        }
        if (C39248Fam.LJIIIZ && TextUtils.equals(str, LIZIZ.getPackageName()) && i == 0) {
            if (C39248Fam.LIZLLL == null) {
                C39248Fam.LIZLLL = packageManager.getPackageInfo(str, i);
            }
            return C39248Fam.LIZLLL;
        }
        if (C39248Fam.LJIIIZ && TextUtils.equals(str, LIZIZ.getPackageName()) && i == 64) {
            if (C39248Fam.LJ == null) {
                C39248Fam.LJ = packageManager.getPackageInfo(str, i);
            }
            return C39248Fam.LJ;
        }
        if (C39248Fam.LJIIIZ && TextUtils.equals(str, LIZIZ.getPackageName()) && i == 8) {
            if (C39248Fam.LJFF == null) {
                C39248Fam.LJFF = packageManager.getPackageInfo(str, i);
            }
            return C39248Fam.LJFF;
        }
        return packageManager.getPackageInfo(str, i);
    }

    public static String LLLZI(Locale locale, String str, Object[] objArr) {
        try {
            if (!ZKN.LIZ) {
                try {
                    C85990Xow c85990Xow = C85990Xow.LIZ;
                    Context LIZIZ = EF7.LIZIZ();
                    c85990Xow.getClass();
                    ZKN.LIZIZ = C85990Xow.LJI(LIZIZ);
                    ZKN.LIZ = true;
                } catch (Throwable unused) {
                }
            }
            if (ZKN.LIZIZ) {
                locale = Locale.ENGLISH;
            }
            return String.format(locale, str, objArr);
        } catch (Exception unused2) {
            return str;
        }
    }

    public static View LLLZIIL(int i, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (e1.LIZ(31744, "tiktok_tux_text_view_opt", true, false) && layoutInflater != null && layoutInflater.getFactory() == null && layoutInflater.getFactory2() == null) {
            try {
                layoutInflater.setFactory(new LayoutInflaterFactoryC67612QgC());
            } catch (Exception unused) {
                return layoutInflater.inflate(i, viewGroup);
            }
        }
        return layoutInflater.inflate(i, viewGroup);
    }

    public static Intent LJJLIIIJJI(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler) {
        if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
            ReceiverRegisterCrashOptimizer.doHWReceiverFix();
        }
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter, null, handler);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter, null, handler);
            }
            throw e;
        }
    }

    public static void LJLILLLLZI(PopupWindow popupWindow, View view, int i, int i2) {
        if (Q7K.LIZIZ("open_alert_monitor", 1) == 1) {
            o.LJII(popupWindow, "null cannot be cast to non-null type android.widget.PopupWindow");
            C26228ARc.LIZ(popupWindow);
        }
        popupWindow.showAsDropDown(view, i, i2);
    }

    public static int LLJJJJLIIL(AudioManager audioManager, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, int i, int i2) {
        C36832Ecu c36832Ecu = C36833Ecv.LJFF;
        if (c36832Ecu != null) {
            c36832Ecu.LJLILLLLZI = 0;
        }
        return audioManager.requestAudioFocus(onAudioFocusChangeListener, i, i2);
    }

    public static void LLJL(PopupWindow popupWindow, View view, int i, int i2) {
        if (C4XM.LIZ()) {
            C56308M8a.LIZ();
        }
        C46318IFu.LIZ.getClass();
        if (C46318IFu.LIZ()) {
            try {
                C56308M8a.LIZIZ();
                Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(popupWindow));
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i3 = attributes.flags;
                boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                attributes.flags &= -16777217;
                LJLILLLLZI(popupWindow, view, i, i2);
                C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                attributes.flags = i3;
                return;
            } catch (Throwable unused) {
                LJLILLLLZI(popupWindow, view, i, i2);
                return;
            }
        }
        LJLILLLLZI(popupWindow, view, i, i2);
    }

    public static void LLJLILLLLZIIL(C93651aUJ c93651aUJ, View view, int i, int i2) {
        if (C4XM.LIZ()) {
            C56308M8a.LIZ();
        }
        C46318IFu.LIZ.getClass();
        if (C46318IFu.LIZ()) {
            try {
                C56308M8a.LIZIZ();
                Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(c93651aUJ));
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i3 = attributes.flags;
                boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                attributes.flags &= -16777217;
                c93651aUJ.showAsDropDown(view, i, i2);
                C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                attributes.flags = i3;
                return;
            } catch (Throwable unused) {
                c93651aUJ.showAsDropDown(view, i, i2);
                return;
            }
        }
        c93651aUJ.showAsDropDown(view, i, i2);
    }

    public static void LLL(C81266Vuw c81266Vuw, View view, int i, int i2) {
        if (C4XM.LIZ()) {
            C56308M8a.LIZ();
        }
        C46318IFu.LIZ.getClass();
        if (C46318IFu.LIZ()) {
            try {
                C56308M8a.LIZIZ();
                Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(c81266Vuw));
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i3 = attributes.flags;
                boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                attributes.flags &= -16777217;
                c81266Vuw.showAtLocation(view, 0, i, i2);
                C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                attributes.flags = i3;
                return;
            } catch (Throwable unused) {
                c81266Vuw.showAtLocation(view, 0, i, i2);
                return;
            }
        }
        c81266Vuw.showAtLocation(view, 0, i, i2);
    }

    public static void LLLF(TuxTooltipPopupWindow tuxTooltipPopupWindow, View view, int i, int i2) {
        if (C4XM.LIZ()) {
            C56308M8a.LIZ();
        }
        C46318IFu.LIZ.getClass();
        if (C46318IFu.LIZ()) {
            try {
                C56308M8a.LIZIZ();
                Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(tuxTooltipPopupWindow));
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i3 = attributes.flags;
                boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                attributes.flags &= -16777217;
                tuxTooltipPopupWindow.showAtLocation(view, 0, i, i2);
                C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                attributes.flags = i3;
                return;
            } catch (Throwable unused) {
                tuxTooltipPopupWindow.showAtLocation(view, 0, i, i2);
                return;
            }
        }
        tuxTooltipPopupWindow.showAtLocation(view, 0, i, i2);
    }

    public static void LLLII(LRV lrv, View view, int i, int i2) {
        if (C4XM.LIZ()) {
            C56308M8a.LIZ();
        }
        C46318IFu.LIZ.getClass();
        if (C46318IFu.LIZ()) {
            try {
                C56308M8a.LIZIZ();
                Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(lrv));
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i3 = attributes.flags;
                boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                attributes.flags &= -16777217;
                lrv.showAtLocation(view, 8388659, i, i2);
                C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                attributes.flags = i3;
                return;
            } catch (Throwable unused) {
                lrv.showAtLocation(view, 8388659, i, i2);
                return;
            }
        }
        lrv.showAtLocation(view, 8388659, i, i2);
    }

    public static void LLLIIIIL(C81259Vup c81259Vup, View view, int i, int i2) {
        if (C4XM.LIZ()) {
            C56308M8a.LIZ();
        }
        C46318IFu.LIZ.getClass();
        if (C46318IFu.LIZ()) {
            try {
                C56308M8a.LIZIZ();
                Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(c81259Vup));
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i3 = attributes.flags;
                boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                attributes.flags &= -16777217;
                c81259Vup.showAtLocation(view, 0, i, i2);
                C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                attributes.flags = i3;
                return;
            } catch (Throwable unused) {
                c81259Vup.showAtLocation(view, 0, i, i2);
                return;
            }
        }
        c81259Vup.showAtLocation(view, 0, i, i2);
    }

    public static void LLLIIL(LQ1 lq1, View view, int i, int i2) {
        if (C4XM.LIZ()) {
            C56308M8a.LIZ();
        }
        C46318IFu.LIZ.getClass();
        if (C46318IFu.LIZ()) {
            try {
                C56308M8a.LIZIZ();
                Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(lq1));
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i3 = attributes.flags;
                boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                attributes.flags &= -16777217;
                lq1.showAtLocation(view, i, 0, i2);
                C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                attributes.flags = i3;
                return;
            } catch (Throwable unused) {
                lq1.showAtLocation(view, i, 0, i2);
                return;
            }
        }
        lq1.showAtLocation(view, i, 0, i2);
    }

    public static boolean LLLJL(Context context, Intent intent, ServiceConnection connection, int i) {
        if (context != null) {
            o.LJIIIZ(intent, "intent");
            o.LJIIIZ(connection, "connection");
            if (C38672FFs.LIZ != null) {
                FGY fgy = C38672FFs.LIZ;
                o.LJI(fgy);
                if (fgy.LIZ(context, intent, connection, i)) {
                    return true;
                }
            }
            return context.bindService(intent, connection, i);
        }
        throw new NullPointerException("bindService");
    }

    public static View LLLLIILL(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z) {
        Context context;
        if (!C35825E4f.LIZ()) {
            C67613QgD.LIZ(layoutInflater);
            return layoutInflater.inflate(i, viewGroup, z);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C67613QgD.LIZ(layoutInflater);
        View inflate = layoutInflater.inflate(i, viewGroup, z);
        if (inflate != null) {
            context = inflate.getContext();
        } else {
            context = null;
        }
        C35825E4f.LIZIZ(i, SystemClock.elapsedRealtime() - elapsedRealtime, context, "sys");
        return inflate;
    }

    public static void LJLJI(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        if (Q7K.LIZIZ("open_alert_monitor", 1) == 1) {
            o.LJII(popupWindow, "null cannot be cast to non-null type android.widget.PopupWindow");
            C26228ARc.LIZ(popupWindow);
        }
        popupWindow.showAtLocation(view, i, i2, i3);
    }

    public static void LLJLIL(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        if (C4XM.LIZ()) {
            C56308M8a.LIZ();
        }
        C46318IFu.LIZ.getClass();
        if (C46318IFu.LIZ()) {
            try {
                C56308M8a.LIZIZ();
                Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(popupWindow));
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i4 = attributes.flags;
                boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                attributes.flags &= -16777217;
                popupWindow.showAsDropDown(view, i, i2, i3);
                C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                attributes.flags = i4;
                return;
            } catch (Throwable unused) {
                popupWindow.showAsDropDown(view, i, i2, i3);
                return;
            }
        }
        popupWindow.showAsDropDown(view, i, i2, i3);
    }

    public static void LLJLLIL(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        if (C4XM.LIZ()) {
            C56308M8a.LIZ();
        }
        C46318IFu.LIZ.getClass();
        if (C46318IFu.LIZ()) {
            try {
                C56308M8a.LIZIZ();
                Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(popupWindow));
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i4 = attributes.flags;
                boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                attributes.flags &= -16777217;
                LJLJI(popupWindow, view, i, i2, i3);
                C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                attributes.flags = i4;
                return;
            } catch (Throwable unused) {
                LJLJI(popupWindow, view, i, i2, i3);
                return;
            }
        }
        LJLJI(popupWindow, view, i, i2, i3);
    }

    public static void LLLFF(SortPopupWindow sortPopupWindow, View view, int i, int i2, int i3) {
        if (C4XM.LIZ()) {
            C56308M8a.LIZ();
        }
        C46318IFu.LIZ.getClass();
        if (C46318IFu.LIZ()) {
            try {
                C56308M8a.LIZIZ();
                Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(sortPopupWindow));
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i4 = attributes.flags;
                boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                attributes.flags &= -16777217;
                sortPopupWindow.showAtLocation(view, i, i2, i3);
                C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                attributes.flags = i4;
                return;
            } catch (Throwable unused) {
                sortPopupWindow.showAtLocation(view, i, i2, i3);
                return;
            }
        }
        sortPopupWindow.showAtLocation(view, i, i2, i3);
    }

    public static void LLLFZ(LDQ ldq, View view, int i, int i2, int i3) {
        if (C4XM.LIZ()) {
            C56308M8a.LIZ();
        }
        C46318IFu.LIZ.getClass();
        if (C46318IFu.LIZ()) {
            try {
                C56308M8a.LIZIZ();
                Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(ldq));
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i4 = attributes.flags;
                boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                attributes.flags &= -16777217;
                ldq.showAtLocation(view, i, i2, i3);
                C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                attributes.flags = i4;
                return;
            } catch (Throwable unused) {
                ldq.showAtLocation(view, i, i2, i3);
                return;
            }
        }
        ldq.showAtLocation(view, i, i2, i3);
    }

    public static void LLLIIIL(C81484VyS c81484VyS, View view, int i, int i2, int i3) {
        if (C4XM.LIZ()) {
            C56308M8a.LIZ();
        }
        C46318IFu.LIZ.getClass();
        if (C46318IFu.LIZ()) {
            try {
                C56308M8a.LIZIZ();
                Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(c81484VyS));
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i4 = attributes.flags;
                boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                attributes.flags &= -16777217;
                c81484VyS.showAtLocation(view, i, i2, i3);
                C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                attributes.flags = i4;
                return;
            } catch (Throwable unused) {
                c81484VyS.showAtLocation(view, i, i2, i3);
                return;
            }
        }
        c81484VyS.showAtLocation(view, i, i2, i3);
    }
}
