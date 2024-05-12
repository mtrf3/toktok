package com.facebook.internal;

import X.ActivityC45651qj;
import X.C66373Q3d;
import X.DialogC66412Q4q;
import X.InterfaceC66401Q4f;
import X.Q4W;
import X.Q5A;
import X.Q5H;
import X.Q5I;
import X.Q8U;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.facebook.AccessToken;
import com.facebook.internal.FacebookDialogFragment;
import kotlin.jvm.internal.o;
import m43.u;

/* loaded from: classes12.dex */
public final class FacebookDialogFragment extends DialogFragment {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public WebDialog LJLIL;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        WebDialog webDialog = this.LJLIL;
        if (webDialog instanceof WebDialog) {
            if (webDialog != null) {
                webDialog.LIZLLL();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if ((this.LJLIL instanceof WebDialog) && isResumed()) {
            WebDialog webDialog = this.LJLIL;
            if (webDialog != null) {
                webDialog.LIZLLL();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ActivityC45651qj mo49getActivity;
        boolean z;
        WebDialog dialogC66412Q4q;
        String string;
        Bundle bundle2;
        super.onCreate(bundle);
        if (this.LJLIL != null || (mo49getActivity = mo49getActivity()) == null) {
            return;
        }
        Intent intent = mo49getActivity.getIntent();
        o.LJIIIIZZ(intent, "intent");
        Bundle LJIILIIL = Q5A.LJIILIIL(intent);
        if (LJIILIIL == null) {
            z = false;
        } else {
            z = LJIILIIL.getBoolean("is_fallback", false);
        }
        String str = null;
        if (!z) {
            if (LJIILIIL == null) {
                string = null;
                bundle2 = null;
            } else {
                string = LJIILIIL.getString("action");
                bundle2 = LJIILIIL.getBundle("params");
            }
            if (C66373Q3d.LJIJJ(string)) {
                mo49getActivity.finish();
                return;
            }
            if (string != null) {
                Q5H q5h = new Q5H(mo49getActivity, string, bundle2);
                q5h.LIZLLL = new InterfaceC66401Q4f() { // from class: X.Q5i
                    @Override // X.InterfaceC66401Q4f
                    public final void LIZ(Bundle bundle3, Q4W q4w) {
                        FacebookDialogFragment this$0 = FacebookDialogFragment.this;
                        o.LJIIIZ(this$0, "this$0");
                        this$0.vl(bundle3, q4w);
                    }
                };
                AccessToken accessToken = q5h.LJFF;
                if (accessToken != null) {
                    Bundle bundle3 = q5h.LJ;
                    if (bundle3 != null) {
                        bundle3.putString("app_id", accessToken.applicationId);
                    }
                    Bundle bundle4 = q5h.LJ;
                    if (bundle4 != null) {
                        AccessToken accessToken2 = q5h.LJFF;
                        if (accessToken2 != null) {
                            str = accessToken2.token;
                        }
                        bundle4.putString("access_token", str);
                    }
                } else {
                    Bundle bundle5 = q5h.LJ;
                    if (bundle5 != null) {
                        bundle5.putString("app_id", q5h.LIZIZ);
                    }
                }
                Context context = q5h.LIZ;
                if (context != null) {
                    String str2 = q5h.LIZJ;
                    Bundle bundle6 = q5h.LJ;
                    InterfaceC66401Q4f interfaceC66401Q4f = q5h.LIZLLL;
                    WebDialog.LIZIZ(context);
                    dialogC66412Q4q = new WebDialog(context, str2, bundle6, Q5I.FACEBOOK, interfaceC66401Q4f);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        } else {
            if (LJIILIIL != null) {
                str = LJIILIIL.getString("url");
            }
            if (C66373Q3d.LJIJJ(str)) {
                mo49getActivity.finish();
                return;
            }
            String LIZIZ = Q8U.LIZIZ(new Object[]{u.LIZLLL()}, 1, "fb%s://bridge/", "java.lang.String.format(format, *args)");
            if (str != null) {
                WebDialog.LIZIZ(mo49getActivity);
                dialogC66412Q4q = new DialogC66412Q4q(mo49getActivity, str, LIZIZ);
                dialogC66412Q4q.LJLJI = new InterfaceC66401Q4f() { // from class: X.Q5Q
                    @Override // X.InterfaceC66401Q4f
                    public final void LIZ(Bundle bundle7, Q4W q4w) {
                        FacebookDialogFragment this$0 = FacebookDialogFragment.this;
                        o.LJIIIZ(this$0, "this$0");
                        ActivityC45651qj mo49getActivity2 = this$0.mo49getActivity();
                        if (mo49getActivity2 == null) {
                            return;
                        }
                        Intent intent2 = new Intent();
                        if (bundle7 == null) {
                            bundle7 = new Bundle();
                        }
                        intent2.putExtras(bundle7);
                        mo49getActivity2.setResult(-1, intent2);
                        mo49getActivity2.finish();
                    }
                };
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }
        this.LJLIL = dialogC66412Q4q;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        WebDialog webDialog = this.LJLIL;
        if (webDialog == null) {
            vl(null, null);
            this.mShowsDialog = false;
            Dialog onCreateDialog = super.onCreateDialog(bundle);
            o.LJIIIIZZ(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
            return onCreateDialog;
        }
        return webDialog;
    }

    public final void vl(Bundle bundle, Q4W q4w) {
        int i;
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        Intent intent = mo49getActivity.getIntent();
        o.LJIIIIZZ(intent, "fragmentActivity.intent");
        Intent LJI = Q5A.LJI(intent, bundle, q4w);
        if (q4w == null) {
            i = -1;
        } else {
            i = 0;
        }
        mo49getActivity.setResult(i, LJI);
        mo49getActivity.finish();
    }
}
