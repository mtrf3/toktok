package com.facebook.internal;

import X.AsyncTaskC66399Q4d;
import X.C03880Dg;
import X.C16880lQ;
import X.C65300Pk0;
import X.C66373Q3d;
import X.C66400Q4e;
import X.C66406Q4k;
import X.C66413Q4r;
import X.InterfaceC66401Q4f;
import X.OK2;
import X.Q4J;
import X.Q4W;
import X.Q4Y;
import X.Q5I;
import X.X1D;
import Y.ACListenerS30S0101000_13;
import Y.IDCListenerS286S0100000_11;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.o;
import m43.u;

/* loaded from: classes12.dex */
public class WebDialog extends Dialog {
    public static volatile int LJLLJ;
    public String LJLIL;
    public String LJLILLLLZI;
    public InterfaceC66401Q4f LJLJI;
    public OK2 LJLJJI;
    public ProgressDialog LJLJJL;
    public ImageView LJLJJLL;
    public FrameLayout LJLJL;
    public final AsyncTaskC66399Q4d LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public WindowManager.LayoutParams LJLLILLLL;

    public static int LIZ(float f, int i, int i2, int i3) {
        int i4 = (int) (i / f);
        return (int) (i * (i4 <= i2 ? 1.0d : i4 >= i3 ? 0.5d : (((i3 - i4) / (i3 - i2)) * 0.5d) + 0.5d));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        AutofillManager autofillManager;
        WindowManager.LayoutParams layoutParams;
        Window window;
        WindowManager.LayoutParams attributes;
        IBinder iBinder;
        this.LJLL = false;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class)) != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled() && (layoutParams = this.LJLLILLLL) != null) {
            IBinder iBinder2 = null;
            if (layoutParams.token == null) {
                Activity ownerActivity = getOwnerActivity();
                if (ownerActivity == null || (window = ownerActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                    iBinder = null;
                } else {
                    iBinder = attributes.token;
                }
                layoutParams.token = iBinder;
                WindowManager.LayoutParams layoutParams2 = this.LJLLILLLL;
                if (layoutParams2 != null) {
                    iBinder2 = layoutParams2.token;
                }
                o.LJIILLIIL(iBinder2, "Set token on onAttachedToWindow(): ");
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.LJLL = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.LJLJI != null && !this.LJLJLLL) {
            LJ(new C66406Q4k());
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ProgressDialog progressDialog;
        OK2 ok2 = this.LJLJJI;
        if (ok2 != null) {
            ok2.stopLoading();
        }
        if (!this.LJLL && (progressDialog = this.LJLJJL) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        AsyncTaskC66399Q4d asyncTaskC66399Q4d = this.LJLJLJ;
        if (asyncTaskC66399Q4d != null) {
            asyncTaskC66399Q4d.cancel(true);
            ProgressDialog progressDialog = this.LJLJJL;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    public final void LIZLLL() {
        int i;
        Object LLILL = C16880lQ.LLILL(getContext(), "window");
        if (LLILL != null) {
            Display defaultDisplay = ((WindowManager) LLILL).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i2 = displayMetrics.widthPixels;
            int i3 = displayMetrics.heightPixels;
            if (i2 < i3) {
                i = i2;
            } else {
                i = i3;
            }
            if (i2 < i3) {
                i2 = i3;
            }
            int min = Math.min(LIZ(displayMetrics.density, i, 480, 800), displayMetrics.widthPixels);
            int min2 = Math.min(LIZ(displayMetrics.density, i2, 800, 1280), displayMetrics.heightPixels);
            Window window = getWindow();
            if (window == null) {
                return;
            }
            window.setLayout(min, min2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        AsyncTaskC66399Q4d asyncTaskC66399Q4d = this.LJLJLJ;
        if (asyncTaskC66399Q4d != null && asyncTaskC66399Q4d.getStatus() == AsyncTask.Status.PENDING) {
            AsyncTaskC66399Q4d asyncTaskC66399Q4d2 = this.LJLJLJ;
            if (asyncTaskC66399Q4d2 != null) {
                asyncTaskC66399Q4d2.execute1(new Void[0]);
            }
            ProgressDialog progressDialog = this.LJLJJL;
            if (progressDialog == null || new C03880Dg(2).LIZJ(300000, "android/app/ProgressDialog", "show", progressDialog, new Object[0], "void", new C65300Pk0(false, "()V", "-2080996000679432411")).LIZ) {
                return;
            }
            progressDialog.show();
            return;
        }
        LIZLLL();
    }

    public static final void LIZIZ(Context context) {
        try {
            ApplicationInfo LLLLLLLLL = C16880lQ.LLLLLLLLL(context.getPackageManager(), context.getPackageName(), 128);
            if (LLLLLLLLL == null || LLLLLLLLL.metaData == null || LJLLJ != 0) {
                return;
            }
            int i = LLLLLLLLL.metaData.getInt("com.facebook.sdk.WebDialogTheme");
            if (i == 0) {
                i = R.style.a5o;
            }
            LJLLJ = i;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public Bundle LIZJ(String str) {
        Uri parse = Uri.parse(str);
        Bundle LJJI = C66373Q3d.LJJI(parse.getQuery());
        LJJI.putAll(C66373Q3d.LJJI(parse.getFragment()));
        return LJJI;
    }

    public final void LJ(Throwable th) {
        Q4W q4w;
        if (this.LJLJI != null && !this.LJLJLLL) {
            this.LJLJLLL = true;
            if (th instanceof Q4W) {
                q4w = (Q4W) th;
            } else {
                q4w = new Q4W(th);
            }
            InterfaceC66401Q4f interfaceC66401Q4f = this.LJLJI;
            if (interfaceC66401Q4f != null) {
                interfaceC66401Q4f.LIZ(null, q4w);
            }
            dismiss();
        }
    }

    public final void LJFF(int i) {
        WebSettings settings;
        WebSettings settings2;
        LinearLayout linearLayout = new LinearLayout(getContext());
        OK2 ok2 = new OK2(getContext());
        this.LJLJJI = ok2;
        ok2.setVerticalScrollBarEnabled(false);
        OK2 ok22 = this.LJLJJI;
        if (ok22 != null) {
            ok22.setHorizontalScrollBarEnabled(false);
        }
        OK2 ok23 = this.LJLJJI;
        if (ok23 != null) {
            C16880lQ.LLZLI(ok23, new C66400Q4e(this));
        }
        OK2 ok24 = this.LJLJJI;
        WebSettings webSettings = null;
        if (ok24 != null) {
            webSettings = ok24.getSettings();
        }
        if (webSettings != null) {
            webSettings.setJavaScriptEnabled(true);
        }
        OK2 ok25 = this.LJLJJI;
        if (ok25 != null) {
            String str = this.LJLIL;
            if (str != null) {
                C16880lQ.LLZZ(ok25, str);
            } else {
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
        }
        OK2 ok26 = this.LJLJJI;
        if (ok26 != null) {
            ok26.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        OK2 ok27 = this.LJLJJI;
        if (ok27 != null) {
            ok27.setVisibility(4);
        }
        OK2 ok28 = this.LJLJJI;
        if (ok28 != null && (settings = ok28.getSettings()) != null) {
            settings.setSavePassword(false);
        }
        OK2 ok29 = this.LJLJJI;
        if (ok29 != null && (settings2 = ok29.getSettings()) != null) {
            settings2.setSaveFormData(false);
        }
        OK2 ok210 = this.LJLJJI;
        if (ok210 != null) {
            ok210.setFocusable(true);
        }
        OK2 ok211 = this.LJLJJI;
        if (ok211 != null) {
            ok211.setFocusableInTouchMode(true);
        }
        OK2 ok212 = this.LJLJJI;
        if (ok212 != null) {
            ok212.setOnTouchListener(new View.OnTouchListener() { // from class: X.Q4m
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!view.hasFocus()) {
                        view.requestFocus();
                        return false;
                    }
                    return false;
                }
            });
        }
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.LJLJJI);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.LJLJL;
        if (frameLayout == null) {
            return;
        }
        frameLayout.addView(linearLayout);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.LJLJJL = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.LJLJJL;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(R.string.dh4));
        }
        ProgressDialog progressDialog3 = this.LJLJJL;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.LJLJJL;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new IDCListenerS286S0100000_11(this, 0));
        }
        requestWindowFeature(1);
        this.LJLJL = new FrameLayout(getContext());
        LIZLLL();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        ImageView imageView = new ImageView(getContext());
        this.LJLJJLL = imageView;
        C16880lQ.LJIILLIIL(imageView, new ACListenerS30S0101000_13(1, this, 2));
        Drawable drawable = getContext().getResources().getDrawable(R.drawable.aa7);
        ImageView imageView2 = this.LJLJJLL;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.LJLJJLL;
        if (imageView3 != null) {
            imageView3.setVisibility(4);
        }
        if (this.LJLIL != null) {
            ImageView imageView4 = this.LJLJJLL;
            if (imageView4 != null) {
                LJFF((imageView4.getDrawable().getIntrinsicWidth() / 2) + 1);
            } else {
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
        }
        FrameLayout frameLayout = this.LJLJL;
        if (frameLayout != null) {
            frameLayout.addView(this.LJLJJLL, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.LJLJL;
        if (frameLayout2 != null) {
            setContentView(frameLayout2);
        } else {
            "Required value was null.".toString();
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams params) {
        o.LJIIIZ(params, "params");
        if (params.token == null) {
            this.LJLLILLLL = params;
        }
        super.onWindowAttributesChanged(params);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public WebDialog(X.ActivityC45651qj r2, java.lang.String r3) {
        /*
            r1 = this;
            X.Q4J.LJI()
            int r0 = com.facebook.internal.WebDialog.LJLLJ
            if (r0 != 0) goto Lc
            X.Q4J.LJI()
            int r0 = com.facebook.internal.WebDialog.LJLLJ
        Lc:
            r1.<init>(r2, r0)
            java.lang.String r0 = "fbconnect://success"
            r1.LJLILLLLZI = r0
            r1.LJLIL = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.WebDialog.<init>(X.1qj, java.lang.String):void");
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent event) {
        o.LJIIIZ(event, "event");
        if (i == 4) {
            OK2 ok2 = this.LJLJJI;
            if (ok2 != null && o.LJ(Boolean.valueOf(ok2.canGoBack()), Boolean.TRUE)) {
                OK2 ok22 = this.LJLJJI;
                if (ok22 == null) {
                    return true;
                }
                ok22.goBack();
                return true;
            }
            cancel();
        }
        return super.onKeyDown(i, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebDialog(Context context, String str, Bundle bundle, Q5I q5i, InterfaceC66401Q4f interfaceC66401Q4f) {
        super(context, LJLLJ);
        Uri LIZ;
        Q4J.LJI();
        this.LJLILLLLZI = "fbconnect://success";
        bundle = bundle == null ? new Bundle() : bundle;
        String str2 = C66373Q3d.LJIJI(context) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.LJLILLLLZI = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString("display", "touch");
        bundle.putString("client_id", u.LIZLLL());
        Locale locale = Locale.ROOT;
        C16880lQ.LLILII();
        String LLLZI = C16880lQ.LLLZI(locale, "android-%s", Arrays.copyOf(new Object[]{"13.1.0"}, 1));
        o.LJIIIIZZ(LLLZI, "java.lang.String.format(locale, format, *args)");
        bundle.putString("sdk", LLLZI);
        this.LJLJI = interfaceC66401Q4f;
        if (o.LJ(str, "share") && bundle.containsKey("media")) {
            this.LJLJLJ = new AsyncTaskC66399Q4d(this, str, bundle);
            return;
        }
        if (C66413Q4r.LIZ[q5i.ordinal()] == 1) {
            LIZ = C66373Q3d.LIZ(Q4Y.LIZIZ(), "oauth/authorize", bundle);
        } else {
            String LIZ2 = Q4Y.LIZ();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(C16880lQ.LLIL());
            LIZ3.append("/dialog/");
            LIZ3.append((Object) str);
            LIZ = C66373Q3d.LIZ(LIZ2, X1D.LIZIZ(LIZ3), bundle);
        }
        this.LJLIL = LIZ.toString();
    }
}
