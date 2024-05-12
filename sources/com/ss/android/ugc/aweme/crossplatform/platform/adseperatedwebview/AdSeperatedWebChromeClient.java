package com.ss.android.ugc.aweme.crossplatform.platform.adseperatedwebview;

import X.AbstractC38279F0p;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C1B3;
import X.C29S;
import X.C35701Dzl;
import X.C59484NWe;
import X.C59591Na7;
import X.C59817Ndl;
import X.C59866NeY;
import X.C65300Pk0;
import X.InterfaceC59561NZd;
import X.InterfaceC59585Na1;
import X.InterfaceC59820Ndo;
import X.NP6;
import X.NTL;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.common.utility.Logger;
import com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.web.utils.UploadFileFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class AdSeperatedWebChromeClient extends C35701Dzl {
    public AbstractC38279F0p LIZJ;
    public InterfaceC59561NZd LIZLLL;
    public List<InterfaceC59820Ndo> LJ;
    public C59866NeY LJFF;
    public final C59817Ndl LJI;
    public final UploadFileFragment LJII;

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        o.LJIIIIZZ(createBitmap, "createBitmap(1, 1, Bitmap.Config.ARGB_8888)");
        return createBitmap;
    }

    @Override // android.webkit.WebChromeClient
    public final View getVideoLoadingProgressView() {
        InterfaceC59561NZd interfaceC59561NZd = this.LIZLLL;
        Context context = null;
        if (interfaceC59561NZd == null || interfaceC59561NZd.getContext() == null) {
            return null;
        }
        InterfaceC59561NZd interfaceC59561NZd2 = this.LIZLLL;
        if (interfaceC59561NZd2 != null) {
            context = interfaceC59561NZd2.getContext();
        }
        o.LJI(context);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ProgressBar progressBar = new ProgressBar(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(progressBar, layoutParams);
        return frameLayout;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        AbstractC38279F0p abstractC38279F0p = this.LIZJ;
        if (abstractC38279F0p != null) {
            abstractC38279F0p.onGeolocationPermissionsHidePrompt();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        super.onHideCustomView();
        this.LJI.LIZ();
    }

    public AdSeperatedWebChromeClient(WebView targetWebView) {
        ActivityC45651qj activityC45651qj;
        FragmentManager supportFragmentManager;
        FragmentManager supportFragmentManager2;
        o.LJIIIZ(targetWebView, "targetWebView");
        this.LJ = new ArrayList();
        this.LJI = new C59817Ndl(this);
        Context context = targetWebView.getContext();
        Fragment fragment = null;
        if (context != null) {
            while (context instanceof ContextWrapper) {
                if (context instanceof C29S) {
                    activityC45651qj = (ActivityC45651qj) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        activityC45651qj = null;
        if (activityC45651qj != null && (supportFragmentManager2 = activityC45651qj.getSupportFragmentManager()) != null) {
            fragment = supportFragmentManager2.LJJJIL("web_view_upload_file");
        }
        if (!(fragment instanceof UploadFileFragment)) {
            UploadFileFragment uploadFileFragment = new UploadFileFragment();
            this.LJII = uploadFileFragment;
            if (activityC45651qj != null && (supportFragmentManager = activityC45651qj.getSupportFragmentManager()) != null) {
                C1B3 c1b3 = new C1B3(supportFragmentManager);
                c1b3.LJIIIIZZ(0, 1, uploadFileFragment, "web_view_upload_file");
                c1b3.LJI();
                return;
            }
            return;
        }
        this.LJII = (UploadFileFragment) fragment;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (new C03880Dg(2).LIZJ(102604, "com/ss/android/ugc/aweme/crossplatform/platform/adseperatedwebview/AdSeperatedWebChromeClient", "onPermissionRequest", this, new Object[]{permissionRequest}, "void", new C65300Pk0(false, "(Landroid/webkit/PermissionRequest;)V", "224851192095219958")).LIZ) {
            return;
        }
        this.LJI.LJ(permissionRequest);
    }

    public final void openFileChooser(ValueCallback<Uri> uploadMsg) {
        o.LJIIIZ(uploadMsg, "uploadMsg");
        UploadFileFragment uploadFileFragment = this.LJII;
        uploadFileFragment.LJLIL = uploadMsg;
        uploadFileFragment.Dl("", "");
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String origin, GeolocationPermissions.Callback callback) {
        if (new C03880Dg(2).LIZJ(100003, "com/ss/android/ugc/aweme/crossplatform/platform/adseperatedwebview/AdSeperatedWebChromeClient", "onGeolocationPermissionsShowPrompt", this, new Object[]{origin, callback}, "void", new C65300Pk0(false, "(Ljava/lang/String;Landroid/webkit/GeolocationPermissions$Callback;)V", "224851192095219958")).LIZ) {
            return;
        }
        o.LJIIIZ(origin, "origin");
        o.LJIIIZ(callback, "callback");
        AbstractC38279F0p abstractC38279F0p = this.LIZJ;
        if (abstractC38279F0p != null) {
            abstractC38279F0p.onGeolocationPermissionsShowPrompt(origin, callback);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        InterfaceC59585Na1 interfaceC59585Na1;
        super.onProgressChanged(webView, i);
        C59866NeY c59866NeY = this.LJFF;
        if (c59866NeY != null && (interfaceC59585Na1 = (InterfaceC59585Na1) c59866NeY.LJJIJIIJI(InterfaceC59585Na1.class)) != null) {
            interfaceC59585Na1.onProgressChanged(i);
        }
        this.LJI.LIZJ(webView, i);
        C59591Na7.LIZ().LIZJ(webView, i);
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        InterfaceC59585Na1 interfaceC59585Na1;
        super.onReceivedTitle(webView, str);
        InterfaceC59561NZd interfaceC59561NZd = this.LIZLLL;
        if (interfaceC59561NZd != null) {
            interfaceC59561NZd.LJIILL(str, false);
        }
        C59866NeY c59866NeY = this.LJFF;
        if (c59866NeY != null && (interfaceC59585Na1 = (InterfaceC59585Na1) c59866NeY.LJJIJIIJI(InterfaceC59585Na1.class)) != null) {
            interfaceC59585Na1.LJIJJ();
        }
        this.LJI.LIZLLL(webView, str);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        super.onShowCustomView(view, customViewCallback);
        this.LJI.LIZIZ(view, customViewCallback);
    }

    public final void openFileChooser(ValueCallback<Uri> uploadMsg, String acceptType) {
        o.LJIIIZ(uploadMsg, "uploadMsg");
        o.LJIIIZ(acceptType, "acceptType");
        UploadFileFragment uploadFileFragment = this.LJII;
        uploadFileFragment.LJLIL = uploadMsg;
        uploadFileFragment.Dl(acceptType, "");
    }

    @Override // android.webkit.WebChromeClient
    public final void onConsoleMessage(String str, int i, String str2) {
        NTL crossPlatformBusiness;
        AdWebStatBusiness adWebStatBusiness;
        Logger.debug();
        try {
            AbstractC38279F0p abstractC38279F0p = this.LIZJ;
            if (abstractC38279F0p != null) {
                abstractC38279F0p.checkLogMsg(str);
            }
            InterfaceC59561NZd interfaceC59561NZd = this.LIZLLL;
            if (interfaceC59561NZd != null && (crossPlatformBusiness = interfaceC59561NZd.getCrossPlatformBusiness()) != null && (adWebStatBusiness = (AdWebStatBusiness) ((C59484NWe) crossPlatformBusiness).LIZ(AdWebStatBusiness.class)) != null) {
                adWebStatBusiness.LIZ(str);
            }
            NP6.LIZ.LIZ(str);
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Context context;
        if (fileChooserParams != null && webView != null && (context = webView.getContext()) != null) {
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof C29S) {
                    if (context != null) {
                        this.LJII.Al(webView, valueCallback, fileChooserParams);
                        return true;
                    }
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
        }
        return false;
    }

    public final void openFileChooser(ValueCallback<Uri> uploadMsg, String acceptType, String capture) {
        o.LJIIIZ(uploadMsg, "uploadMsg");
        o.LJIIIZ(acceptType, "acceptType");
        o.LJIIIZ(capture, "capture");
        UploadFileFragment uploadFileFragment = this.LJII;
        uploadFileFragment.LJLIL = uploadMsg;
        uploadFileFragment.Dl(acceptType, capture);
    }
}
