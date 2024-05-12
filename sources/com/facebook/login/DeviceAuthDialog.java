package com.facebook.login;

import X.ActivityC45651qj;
import X.AsyncTaskC66391Q3v;
import X.BMV;
import X.C0H1;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C40700FyC;
import X.C65846Pso;
import X.C66373Q3d;
import X.C66388Q3s;
import X.C66405Q4j;
import X.C66416Q4u;
import X.C76800UCe;
import X.C90903hW;
import X.DialogC66417Q4v;
import X.EnumC66377Q3h;
import X.EnumC66385Q3p;
import X.Q4I;
import X.Q4W;
import X.Q53;
import X.X1D;
import Y.ARunnableS11S0101000_7;
import Y.IDCListenerS10S0101000;
import Y.IDCListenerS163S0100000_11;
import Y.IDCreatorS54S0000000_11;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.facebook.AccessToken;
import com.facebook.FacebookActivity;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.login.DeviceAuthDialog;
import com.facebook.login.LoginClient;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import m43.u;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class DeviceAuthDialog extends DialogFragment {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public View LJLIL;
    public TextView LJLILLLLZI;
    public TextView LJLJI;
    public DeviceAuthMethodHandler LJLJJI;
    public final AtomicBoolean LJLJJL = new AtomicBoolean();
    public volatile AsyncTaskC66391Q3v LJLJJLL;
    public volatile ScheduledFuture<?> LJLJL;
    public volatile RequestState LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public LoginClient.Request LJLLI;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.LJLJLLL = true;
        this.LJLJJL.set(true);
        super.onDestroyView();
        AsyncTaskC66391Q3v asyncTaskC66391Q3v = this.LJLJJLL;
        if (asyncTaskC66391Q3v != null) {
            asyncTaskC66391Q3v.cancel(true);
        }
        ScheduledFuture<?> scheduledFuture = this.LJLJL;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(true);
    }

    public final void Gl() {
        String str;
        RequestState requestState = this.LJLJLJ;
        if (requestState != null) {
            requestState.lastPoll = new Date().getTime();
        }
        Bundle bundle = new Bundle();
        RequestState requestState2 = this.LJLJLJ;
        if (requestState2 == null) {
            str = null;
        } else {
            str = requestState2.requestCode;
        }
        bundle.putString("code", str);
        this.LJLJJLL = new GraphRequest(null, "device/login_status", bundle, EnumC66377Q3h.POST, new BMV() { // from class: X.Q4h
            @Override // X.BMV
            public final void LIZ(C66381Q3l c66381Q3l) {
                DeviceAuthDialog this$0 = DeviceAuthDialog.this;
                o.LJIIIZ(this$0, "this$0");
                if (this$0.LJLJJL.get()) {
                    return;
                }
                FacebookRequestError facebookRequestError = c66381Q3l.LIZLLL;
                if (facebookRequestError != null) {
                    int i = facebookRequestError.subErrorCode;
                    if (i == 1349174 || i == 1349172) {
                        this$0.Hl();
                        return;
                    }
                    if (i == 1349152) {
                        DeviceAuthDialog.RequestState requestState3 = this$0.LJLJLJ;
                        if (requestState3 != null) {
                            C65846Pso.LIZ(requestState3.userCode);
                        }
                        LoginClient.Request request = this$0.LJLLI;
                        if (request != null) {
                            this$0.Jl(request);
                            return;
                        } else {
                            this$0.xl();
                            return;
                        }
                    }
                    if (i == 1349173) {
                        this$0.xl();
                        return;
                    }
                    Q4W q4w = facebookRequestError.exception;
                    if (q4w == null) {
                        q4w = new Q4W();
                    }
                    this$0.Al(q4w);
                    return;
                }
                try {
                    JSONObject jSONObject = c66381Q3l.LIZJ;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    String string = jSONObject.getString("access_token");
                    o.LJIIIIZZ(string, "resultObject.getString(\"access_token\")");
                    this$0.Dl(jSONObject.getLong("expires_in"), string, Long.valueOf(jSONObject.optLong("data_access_expiration_time")));
                } catch (JSONException e) {
                    this$0.Al(new Q4W(e));
                }
            }
        }, 32).LIZLLL();
    }

    public final void Hl() {
        Long valueOf;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        RequestState requestState = this.LJLJLJ;
        if (requestState == null || (valueOf = Long.valueOf(requestState.interval)) == null) {
            return;
        }
        synchronized (DeviceAuthMethodHandler.Companion) {
            if (DeviceAuthMethodHandler.backgroundExecutor == null) {
                DeviceAuthMethodHandler.backgroundExecutor = new PThreadScheduledThreadPoolExecutor(1, new DefaultThreadFactory("DeviceAuthMethodHandler$Companion"));
            }
            scheduledThreadPoolExecutor = DeviceAuthMethodHandler.backgroundExecutor;
            if (scheduledThreadPoolExecutor == null) {
                o.LJIJI("backgroundExecutor");
                throw null;
            }
        }
        this.LJLJL = scheduledThreadPoolExecutor.schedule(new ARunnableS11S0101000_7(3, this, 10), valueOf.longValue(), TimeUnit.SECONDS);
    }

    public final void xl() {
        if (!this.LJLJJL.compareAndSet(false, true)) {
            return;
        }
        RequestState requestState = this.LJLJLJ;
        if (requestState != null) {
            C65846Pso.LIZ(requestState.userCode);
        }
        DeviceAuthMethodHandler deviceAuthMethodHandler = this.LJLJJI;
        if (deviceAuthMethodHandler != null) {
            C66416Q4u c66416Q4u = LoginClient.Result.Companion;
            LoginClient.Request request = deviceAuthMethodHandler.LJ().pendingRequest;
            c66416Q4u.getClass();
            deviceAuthMethodHandler.LJ().LJI(C66416Q4u.LIZ(request, "User canceled log in."));
        }
        Dialog dialog = getDialog();
        if (dialog == null) {
            return;
        }
        dialog.dismiss();
    }

    /* loaded from: classes12.dex */
    public static final class RequestState implements Parcelable {
        public String authorizationUri;
        public long interval;
        public long lastPoll;
        public String requestCode;
        public String userCode;
        public static final C66405Q4j Companion = new C66405Q4j();
        public static final Parcelable.Creator<RequestState> CREATOR = new IDCreatorS54S0000000_11(20);

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public RequestState() {
        }

        public RequestState(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            this.authorizationUri = parcel.readString();
            this.userCode = parcel.readString();
            this.requestCode = parcel.readString();
            this.interval = parcel.readLong();
            this.lastPoll = parcel.readLong();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            o.LJIIIZ(dest, "dest");
            dest.writeString(this.authorizationUri);
            dest.writeString(this.userCode);
            dest.writeString(this.requestCode);
            dest.writeLong(this.interval);
            dest.writeLong(this.lastPoll);
        }
    }

    public final void Al(Q4W q4w) {
        if (!this.LJLJJL.compareAndSet(false, true)) {
            return;
        }
        RequestState requestState = this.LJLJLJ;
        if (requestState != null) {
            C65846Pso.LIZ(requestState.userCode);
        }
        DeviceAuthMethodHandler deviceAuthMethodHandler = this.LJLJJI;
        if (deviceAuthMethodHandler != null) {
            deviceAuthMethodHandler.LJ().LJI(C66416Q4u.LIZLLL(LoginClient.Result.Companion, deviceAuthMethodHandler.LJ().pendingRequest, null, q4w.getMessage()));
        }
        Dialog dialog = getDialog();
        if (dialog == null) {
            return;
        }
        dialog.dismiss();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Il(com.facebook.login.DeviceAuthDialog.RequestState r21) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.DeviceAuthDialog.Il(com.facebook.login.DeviceAuthDialog$RequestState):void");
    }

    public final void Jl(LoginClient.Request request) {
        String jSONObject;
        this.LJLLI = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.permissions));
        C66373Q3d.LJJII("redirect_uri", request.deviceRedirectUriString, bundle);
        C66373Q3d.LJJII("target_user_id", request.deviceAuthTargetUserId, bundle);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(u.LIZLLL());
        LIZ.append('|');
        LIZ.append(C16880lQ.LLIIZ());
        bundle.putString("access_token", X1D.LIZIZ(LIZ));
        if (!C40700FyC.LIZ(C65846Pso.class)) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("device", Build.DEVICE);
                hashMap.put("model", Build.MODEL);
                jSONObject = new JSONObject(hashMap).toString();
            } catch (Throwable unused) {
            }
            bundle.putString("device_info", jSONObject);
            new GraphRequest(null, "device/login", bundle, EnumC66377Q3h.POST, new BMV() { // from class: X.Q4i
                @Override // X.BMV
                public final void LIZ(C66381Q3l c66381Q3l) {
                    DeviceAuthDialog this$0 = DeviceAuthDialog.this;
                    o.LJIIIZ(this$0, "this$0");
                    if (this$0.LJLJLLL) {
                        return;
                    }
                    FacebookRequestError facebookRequestError = c66381Q3l.LIZLLL;
                    if (facebookRequestError != null) {
                        Q4W q4w = facebookRequestError.exception;
                        if (q4w == null) {
                            q4w = new Q4W();
                        }
                        this$0.Al(q4w);
                        return;
                    }
                    JSONObject jSONObject2 = c66381Q3l.LIZJ;
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                    }
                    DeviceAuthDialog.RequestState requestState = new DeviceAuthDialog.RequestState();
                    try {
                        String string = jSONObject2.getString("user_code");
                        requestState.userCode = string;
                        String LLLZI = C16880lQ.LLLZI(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{string}, 1));
                        o.LJIIIIZZ(LLLZI, "java.lang.String.format(locale, format, *args)");
                        requestState.authorizationUri = LLLZI;
                        requestState.requestCode = jSONObject2.getString("code");
                        requestState.interval = jSONObject2.getLong("interval");
                        this$0.Il(requestState);
                    } catch (JSONException e) {
                        this$0.Al(new Q4W(e));
                    }
                }
            }, 32).LIZLLL();
        }
        jSONObject = null;
        bundle.putString("device_info", jSONObject);
        new GraphRequest(null, "device/login", bundle, EnumC66377Q3h.POST, new BMV() { // from class: X.Q4i
            @Override // X.BMV
            public final void LIZ(C66381Q3l c66381Q3l) {
                DeviceAuthDialog this$0 = DeviceAuthDialog.this;
                o.LJIIIZ(this$0, "this$0");
                if (this$0.LJLJLLL) {
                    return;
                }
                FacebookRequestError facebookRequestError = c66381Q3l.LIZLLL;
                if (facebookRequestError != null) {
                    Q4W q4w = facebookRequestError.exception;
                    if (q4w == null) {
                        q4w = new Q4W();
                    }
                    this$0.Al(q4w);
                    return;
                }
                JSONObject jSONObject2 = c66381Q3l.LIZJ;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                DeviceAuthDialog.RequestState requestState = new DeviceAuthDialog.RequestState();
                try {
                    String string = jSONObject2.getString("user_code");
                    requestState.userCode = string;
                    String LLLZI = C16880lQ.LLLZI(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{string}, 1));
                    o.LJIIIIZZ(LLLZI, "java.lang.String.format(locale, format, *args)");
                    requestState.authorizationUri = LLLZI;
                    requestState.requestCode = jSONObject2.getString("code");
                    requestState.interval = jSONObject2.getLong("interval");
                    this$0.Il(requestState);
                } catch (JSONException e) {
                    this$0.Al(new Q4W(e));
                }
            }
        }, 32).LIZLLL();
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        boolean z;
        DialogC66417Q4v dialogC66417Q4v = new DialogC66417Q4v(this, requireActivity());
        if (C65846Pso.LIZJ() && !this.LJLL) {
            z = true;
        } else {
            z = false;
        }
        dialogC66417Q4v.setContentView(wl(z));
        return dialogC66417Q4v;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
        if (!this.LJLJLLL) {
            xl();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        o.LJIIIZ(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.LJLJLJ != null) {
            outState.putParcelable("request_state", this.LJLJLJ);
        }
    }

    public final View wl(boolean z) {
        int i;
        LayoutInflater layoutInflater = requireActivity().getLayoutInflater();
        o.LJIIIIZZ(layoutInflater, "requireActivity().layoutInflater");
        if (z) {
            i = R.layout.w6;
        } else {
            i = R.layout.w4;
        }
        View LLLZIIL = C16880lQ.LLLZIIL(i, layoutInflater, null);
        o.LJIIIIZZ(LLLZIIL, "inflater.inflate(getLayoutResId(isSmartLogin), null)");
        View findViewById = LLLZIIL.findViewById(R.id.iac);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.progress_bar)");
        this.LJLIL = findViewById;
        View findViewById2 = LLLZIIL.findViewById(R.id.br8);
        if (findViewById2 != null) {
            this.LJLILLLLZI = (TextView) findViewById2;
            View findViewById3 = LLLZIIL.findViewById(R.id.b3s);
            if (findViewById3 != null) {
                C16880lQ.LJIILIIL((Button) findViewById3, new IDCListenerS10S0101000(2, this, 4));
                View findViewById4 = LLLZIIL.findViewById(R.id.bio);
                if (findViewById4 != null) {
                    TextView textView = (TextView) findViewById4;
                    this.LJLJI = textView;
                    textView.setText(Html.fromHtml(getString(R.string.dgy)));
                    return LLLZIIL;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.Button");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    public final void Dl(long j, final String str, Long l) {
        final Date date;
        Bundle LIZ = C0H1.LIZ("fields", "id,permissions,name");
        final Date date2 = null;
        if (j != 0) {
            date = new Date((j * 1000) + new Date().getTime());
        } else {
            date = null;
        }
        if (l != null && l.longValue() != 0) {
            date2 = new Date(l.longValue() * 1000);
        }
        GraphRequest LJI = C66388Q3s.LJI(new AccessToken(str, u.LIZLLL(), CardStruct.IStatusCode.DEFAULT, null, null, null, null, date, null, date2), "me", new BMV() { // from class: X.Q4g
            @Override // X.BMV
            public final void LIZ(C66381Q3l c66381Q3l) {
                EnumSet<EnumC65824PsS> enumSet;
                Boolean valueOf;
                final DeviceAuthDialog this$0 = DeviceAuthDialog.this;
                final String accessToken = str;
                final Date date3 = date;
                final Date date4 = date2;
                o.LJIIIZ(this$0, "this$0");
                o.LJIIIZ(accessToken, "$accessToken");
                if (this$0.LJLJJL.get()) {
                    return;
                }
                FacebookRequestError facebookRequestError = c66381Q3l.LIZLLL;
                if (facebookRequestError != null) {
                    Q4W q4w = facebookRequestError.exception;
                    if (q4w == null) {
                        q4w = new Q4W();
                    }
                    this$0.Al(q4w);
                    return;
                }
                try {
                    JSONObject jSONObject = c66381Q3l.LIZJ;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    final String string = jSONObject.getString("id");
                    o.LJIIIIZZ(string, "jsonObject.getString(\"id\")");
                    final Q4I LIZ2 = Q4G.LIZ(jSONObject);
                    String string2 = jSONObject.getString("name");
                    o.LJIIIIZZ(string2, "jsonObject.getString(\"name\")");
                    DeviceAuthDialog.RequestState requestState = this$0.LJLJLJ;
                    if (requestState != null) {
                        C65846Pso.LIZ(requestState.userCode);
                    }
                    C65825PsT LIZIZ = C65819PsN.LIZIZ(u.LIZLLL());
                    if (LIZIZ == null || (enumSet = LIZIZ.LIZJ) == null) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(enumSet.contains(EnumC65824PsS.RequireConfirm));
                    }
                    if (o.LJ(valueOf, Boolean.TRUE) && !this$0.LJLL) {
                        this$0.LJLL = true;
                        String string3 = this$0.getResources().getString(R.string.dhi);
                        o.LJIIIIZZ(string3, "resources.getString(R.string.com_facebook_smart_login_confirmation_title)");
                        String string4 = this$0.getResources().getString(R.string.dhh);
                        o.LJIIIIZZ(string4, "resources.getString(R.string.com_facebook_smart_login_confirmation_continue_as)");
                        String string5 = this$0.getResources().getString(R.string.dhg);
                        o.LJIIIIZZ(string5, "resources.getString(R.string.com_facebook_smart_login_confirmation_cancel)");
                        String LIZIZ2 = Q8U.LIZIZ(new Object[]{string2}, 1, string4, "java.lang.String.format(format, *args)");
                        AlertDialog.Builder builder = new AlertDialog.Builder(this$0.getContext());
                        builder.setMessage(string3).setCancelable(true).setNegativeButton(LIZIZ2, new DialogInterface.OnClickListener() { // from class: X.Q4H
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                DeviceAuthDialog this$02 = DeviceAuthDialog.this;
                                String userId = string;
                                Q4I permissions = LIZ2;
                                String accessToken2 = accessToken;
                                Date date5 = date3;
                                Date date6 = date4;
                                o.LJIIIZ(this$02, "this$0");
                                o.LJIIIZ(userId, "$userId");
                                o.LJIIIZ(permissions, "$permissions");
                                o.LJIIIZ(accessToken2, "$accessToken");
                                this$02.vl(userId, permissions, accessToken2, date5, date6);
                            }
                        }).setPositiveButton(string5, new IDCListenerS163S0100000_11(this$0, 1));
                        AlertDialog create = builder.create();
                        if (new C03880Dg(2).LIZJ(300000, "android/app/AlertDialog", "show", create, new Object[0], "void", new C65300Pk0(false, "()V", "1523470329188247271")).LIZ) {
                            return;
                        }
                        create.show();
                        return;
                    }
                    this$0.vl(string, LIZ2, accessToken, date3, date4);
                } catch (JSONException e) {
                    this$0.Al(new Q4W(e));
                }
            }
        });
        LJI.LJIIIZ(EnumC66377Q3h.GET);
        LJI.LIZJ = LIZ;
        LJI.LIZLLL();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        LoginMethodHandler LJIIIIZZ;
        RequestState requestState;
        o.LJIIIZ(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        LoginFragment loginFragment = (LoginFragment) ((FacebookActivity) requireActivity()).LJLIL;
        C29S c29s = null;
        if (loginFragment == null) {
            LJIIIIZZ = null;
        } else {
            LJIIIIZZ = loginFragment.vl().LJIIIIZZ();
        }
        this.LJLJJI = (DeviceAuthMethodHandler) LJIIIIZZ;
        if (bundle != null && (requestState = (RequestState) bundle.getParcelable("request_state")) != null) {
            Il(requestState);
        }
        if (!(onCreateView instanceof View)) {
            onCreateView = null;
        }
        if (onCreateView != null) {
            try {
                ViewTreeLifecycleOwner.set(onCreateView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(onCreateView, this);
                C10A.LIZIZ(onCreateView, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return onCreateView;
    }

    public final void vl(String str, Q4I q4i, String str2, Date date, Date date2) {
        DeviceAuthMethodHandler deviceAuthMethodHandler = this.LJLJJI;
        if (deviceAuthMethodHandler != null) {
            AccessToken accessToken = new AccessToken(str2, u.LIZLLL(), str, q4i.LIZ, q4i.LIZIZ, q4i.LIZJ, EnumC66385Q3p.DEVICE_AUTH, date, null, date2);
            C66416Q4u c66416Q4u = LoginClient.Result.Companion;
            LoginClient.Request request = deviceAuthMethodHandler.LJ().pendingRequest;
            c66416Q4u.getClass();
            deviceAuthMethodHandler.LJ().LJI(new LoginClient.Result(request, Q53.SUCCESS, accessToken, null, null));
        }
        Dialog dialog = getDialog();
        if (dialog == null) {
            return;
        }
        dialog.dismiss();
    }
}
