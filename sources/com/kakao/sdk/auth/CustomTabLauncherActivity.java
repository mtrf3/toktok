package com.kakao.sdk.auth;

import X.C16880lQ;
import X.C29S;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.kakao.sdk.auth.CustomTabLauncherActivity;
import com.kakao.sdk.common.model.ClientError;
import com.kakao.sdk.common.model.ClientErrorCause;
import com.kakao.sdk.common.model.KakaoSdkError;
import com.kakao.sdk.common.util.KakaoCustomTabsClient;
import com.kakao.sdk.common.util.SdkLog;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class CustomTabLauncherActivity extends C29S {
    public ServiceConnection customTabsConnection;
    public boolean customTabsOpened;
    public Uri fullUri;
    public Handler internalHandler;
    public ResultReceiver resultReceiver;

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ServiceConnection serviceConnection = this.customTabsConnection;
        if (serviceConnection == null) {
            return;
        }
        unbindService(serviceConnection);
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public void onResume() {
        Handler handler;
        super.onResume();
        Boolean bool = null;
        if (!this.customTabsOpened) {
            this.customTabsOpened = true;
            Uri uri = this.fullUri;
            if (uri != null) {
                openChromeCustomTab(uri);
                return;
            } else {
                sendError(new ClientError(ClientErrorCause.IllegalState, "url has been not initialized."));
                return;
            }
        }
        SdkLog.Companion.i("trigger delay message");
        Handler handler2 = this.internalHandler;
        if (handler2 != null) {
            bool = Boolean.valueOf(handler2.hasMessages(0));
        }
        if (!o.LJ(bool, Boolean.FALSE) || (handler = this.internalHandler) == null) {
            return;
        }
        handler.sendEmptyMessageDelayed(0, 100L);
    }

    private final void openBrowserWithoutBinding(Uri uri) {
        try {
            KakaoCustomTabsClient.INSTANCE.open(this, uri);
        } catch (ActivityNotFoundException e) {
            SdkLog.Companion.w(e);
            sendError(new ClientError(ClientErrorCause.NotSupported, "No browser has been installed on a device."));
        }
    }

    private final void openChromeCustomTab(Uri uri) {
        SdkLog.Companion companion = SdkLog.Companion;
        companion.i(o.LJIILLIIL(uri, "Authorize Uri: "));
        try {
            ServiceConnection openWithDefault = KakaoCustomTabsClient.INSTANCE.openWithDefault(this, uri);
            this.customTabsConnection = openWithDefault;
            if (openWithDefault == null) {
                companion.i("try to open chrome without service binding");
                openBrowserWithoutBinding(uri);
            }
        } catch (UnsupportedOperationException e) {
            SdkLog.Companion.w(e);
            openBrowserWithoutBinding(uri);
        }
    }

    private final void sendError(KakaoSdkError kakaoSdkError) {
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("key.exception", kakaoSdkError);
            resultReceiver.send(0, bundle);
        }
        finish();
    }

    private final void sendOK(Uri uri) {
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("key.url", uri);
            resultReceiver.send(-1, bundle);
        }
        finish();
    }

    public void loadData(Intent intent) {
        Bundle bundle;
        ResultReceiver resultReceiver;
        Uri uri;
        o.LJIIIZ(intent, "intent");
        try {
            Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
            if (LLJJIJI != null && (bundle = LLJJIJI.getBundle("key.bundle")) != null) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    resultReceiver = (ResultReceiver) bundle.getParcelable("key.result.receiver", ResultReceiver.class);
                } else {
                    Parcelable parcelable = bundle.getParcelable("key.result.receiver");
                    if (parcelable != null) {
                        resultReceiver = (ResultReceiver) parcelable;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.os.ResultReceiver");
                    }
                }
                if (resultReceiver != null) {
                    this.resultReceiver = resultReceiver;
                    if (i >= 33) {
                        uri = (Uri) bundle.getParcelable("key.full_authorize_uri", Uri.class);
                    } else {
                        Parcelable parcelable2 = bundle.getParcelable("key.full_authorize_uri");
                        if (parcelable2 != null) {
                            uri = (Uri) parcelable2;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.net.Uri");
                        }
                    }
                    if (uri != null) {
                        this.fullUri = uri;
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            this.internalHandler = new Handler(C16880lQ.LLJJJJ(), new Handler.Callback() { // from class: X.Ps6
                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    return CustomTabLauncherActivity.m93loadData$lambda1(CustomTabLauncherActivity.this, message);
                }
            });
        } catch (Throwable th) {
            SdkLog.Companion.e(th);
            ClientError clientError = new ClientError(ClientErrorCause.Unknown, null, 2, null);
            clientError.initCause(th);
            sendError(clientError);
        }
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        o.LJIIIIZZ(intent, "intent");
        loadData(intent);
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Boolean valueOf;
        Uri data;
        Handler handler;
        super.onNewIntent(intent);
        SdkLog.Companion.i("onNewIntent");
        setIntent(intent);
        Handler handler2 = this.internalHandler;
        if (handler2 == null) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(handler2.hasMessages(0));
        }
        if (o.LJ(valueOf, Boolean.TRUE) && (handler = this.internalHandler) != null) {
            handler.removeMessages(0);
        }
        this.internalHandler = null;
        if (intent != null && (data = intent.getData()) != null) {
            sendOK(data);
        }
        finish();
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        o.LJIIIZ(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        this.customTabsOpened = savedInstanceState.getBoolean("key.customtabs.opened", this.customTabsOpened);
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean("key.customtabs.opened", this.customTabsOpened);
    }

    /* renamed from: loadData$lambda-1, reason: not valid java name */
    public static final boolean m93loadData$lambda1(CustomTabLauncherActivity this$0, Message it) {
        o.LJIIIZ(this$0, "this$0");
        o.LJIIIZ(it, "it");
        SdkLog.Companion.i("handle delay message");
        this$0.sendError(new ClientError(ClientErrorCause.Cancelled, null, 2, null));
        return true;
    }
}
