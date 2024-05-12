package X;

import Y.ACallableS88S0200000_11;
import Y.AgS128S0100000_11;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Qhq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67714Qhq implements InterfaceC67706Qhi, InterfaceC67707Qhj {
    public C67756QiW LJLIL;
    public final Fragment LJLILLLLZI;
    public EditText LJLJI;
    public int LJLJJI = C78555UsJ.LJIJI(C58725N2z.LIZ);
    public boolean LJLJJL;
    public final String LJLJJLL;
    public Exception LJLJL;
    public final boolean LJLJLJ;

    @Override // X.InterfaceC67784Qiy
    public final void H0(Bundle bundle) {
    }

    @Override // X.InterfaceC67712Qho
    public final void onConnectionFailed(ConnectionResult connectionResult) {
    }

    @Override // X.InterfaceC67784Qiy
    public final void v7(int i) {
    }

    public final void LIZJ() {
        if (!this.LJLJLJ) {
            return;
        }
        try {
            C67713Qhp c67713Qhp = new C67713Qhp(this.LJLILLLLZI.getContext());
            c67713Qhp.LJIILIIL.add(this);
            C67674QhC c67674QhC = new C67674QhC(this.LJLILLLLZI.mo49getActivity());
            c67713Qhp.LJIIIIZZ = 0;
            c67713Qhp.LJIIIZ = this;
            c67713Qhp.LJII = c67674QhC;
            C67718Qhu<C67819QjX> c67718Qhu = C67717Qht.LIZ;
            QH7.LJIIIZ(c67718Qhu, "Api must not be null");
            c67713Qhp.LJI.put(c67718Qhu, null);
            AbstractC67715Qhr<?, C67819QjX> abstractC67715Qhr = c67718Qhu.LIZ;
            QH7.LJIIIZ(abstractC67715Qhr, "Base client builder must not be null");
            List<Scope> LIZ = abstractC67715Qhr.LIZ(null);
            c67713Qhp.LIZIZ.addAll(LIZ);
            c67713Qhp.LIZ.addAll(LIZ);
            this.LJLIL = c67713Qhp.LIZ();
        } catch (Exception e) {
            this.LJLJL = e;
        }
    }

    public final void LIZLLL() {
        C67756QiW c67756QiW;
        if (this.LJLJLJ && (c67756QiW = this.LJLIL) != null && c67756QiW.LJIIJ()) {
            C67756QiW c67756QiW2 = this.LJLIL;
            ActivityC45651qj mo49getActivity = this.LJLILLLLZI.mo49getActivity();
            c67756QiW2.getClass();
            C67674QhC c67674QhC = new C67674QhC(mo49getActivity);
            if (c67756QiW2.LJLJJL >= 0) {
                InterfaceC67296Qb6 LIZJ = LifecycleCallback.LIZJ(c67674QhC);
                C67710Qhm c67710Qhm = (C67710Qhm) LIZJ.U(C67710Qhm.class, "AutoManageHelper");
                if (c67710Qhm == null) {
                    c67710Qhm = new C67710Qhm(LIZJ);
                }
                int i = c67756QiW2.LJLJJL;
                C67711Qhn c67711Qhn = c67710Qhm.LJLJJLL.get(i);
                c67710Qhm.LJLJJLL.remove(i);
                if (c67711Qhn != null) {
                    c67711Qhn.LJLILLLLZI.LJIILIIL(c67711Qhn);
                    c67711Qhn.LJLILLLLZI.LJ();
                }
                this.LJLIL.LJ();
                return;
            }
            throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
        }
    }

    public final void LJ(EditText editText) {
        this.LJLJI = editText;
        if (!this.LJLJLJ) {
            LIZ(this.LJLJJI, "Feature cannot be used", false, this.LJLJJL);
            return;
        }
        if (this.LJLIL == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Failed to create GoogleApiClient, exception: ");
            LIZ.append(C249159qB.LIZ(this.LJLJL));
            LIZ(this.LJLJJI, X1D.LIZIZ(LIZ), false, this.LJLJJL);
            return;
        }
        Fragment fragment = this.LJLILLLLZI;
        if (fragment == null || !fragment.isAdded()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Unexpected error occurred, fragment: ");
            LIZ2.append(this.LJLILLLLZI);
            LIZ(this.LJLJJI, X1D.LIZIZ(LIZ2), false, this.LJLJJL);
            return;
        }
        C67722Qhy c67722Qhy = new C67722Qhy();
        C67729Qi5 c67729Qi5 = new C67729Qi5();
        c67729Qi5.LIZ = true;
        c67722Qhy.LIZJ = c67729Qi5.LIZ();
        c67722Qhy.LIZ = true;
        if (c67722Qhy.LIZIZ == null) {
            c67722Qhy.LIZIZ = new String[0];
        }
        HintRequest hintRequest = new HintRequest(2, c67722Qhy.LIZJ, false, c67722Qhy.LIZ, c67722Qhy.LIZIZ, false, null, null);
        C67735QiB c67735QiB = C67717Qht.LIZJ;
        C67756QiW c67756QiW = this.LJLIL;
        c67735QiB.getClass();
        QH7.LJIIIZ(c67756QiW, "client must not be null");
        C67819QjX c67819QjX = ((C67818QjW) c67756QiW.LJII(C67717Qht.LJ)).LLIIIL;
        Context context = c67756QiW.LJLJJLL;
        String str = c67819QjX.LJLILLLLZI;
        QH7.LJIIIZ(context, "context must not be null");
        if (TextUtils.isEmpty(str)) {
            str = C66574QAw.LIZ();
        } else {
            QH7.LJIIIIZZ(str);
        }
        Intent putExtra = new Intent("com.google.android.gms.auth.api.credentials.PICKER").setPackage("com.google.android.gms").putExtra("claimedCallingPackage", (String) null).putExtra("logSessionId", str);
        Parcel obtain = Parcel.obtain();
        hintRequest.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        putExtra.putExtra("com.google.android.gms.credentials.HintRequest", marshall);
        try {
            this.LJLILLLLZI.startIntentSenderForResult(PendingIntent.getActivity(context, LiveNetAdaptiveHurryTimeSetting.DEFAULT, putExtra, C67734QiA.LIZ | 134217728).getIntentSender(), 1000, null, 0, 0, 0, null);
        } catch (IntentSender.SendIntentException e) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Error when calling startIntentSenderForResult: ");
            LIZ3.append(C249159qB.LIZ(e));
            LIZ(this.LJLJJI, X1D.LIZIZ(LIZ3), false, this.LJLJJL);
        }
    }

    public C67714Qhq(BaseI18nLoginFragment baseI18nLoginFragment, String str) {
        boolean z;
        this.LJLILLLLZI = baseI18nLoginFragment;
        this.LJLJJLL = str;
        boolean LIZ = C48479J0x.LIZ(C58725N2z.LIZ);
        this.LJLJJL = LIZ;
        if (LIZ && this.LJLJJI == 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJLJ = z;
    }

    public final void LIZIZ(int i, int i2, Intent intent) {
        EditText editText;
        if (!this.LJLJLJ || i != 1000 || (editText = this.LJLJI) == null) {
            return;
        }
        if (i2 == -1) {
            C10K.LIZJ(new ACallableS88S0200000_11(this, intent, 5)).LIZLLL(new AgS128S0100000_11(this, 4));
            return;
        }
        editText.requestFocus();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onActivityResult result code: ");
        LIZ.append(i2);
        LIZ(this.LJLJJI, X1D.LIZIZ(LIZ), false, this.LJLJJL);
    }

    public final void LIZ(int i, String str, boolean z, boolean z2) {
        String str2;
        HashMap LIZJ = C03660Ck.LIZJ("event", "Auto fill user's phone number");
        LIZJ.put("success", String.valueOf(z));
        LIZJ.put("hasSimCard", String.valueOf(z2));
        LIZJ.put("googleAvailability", String.valueOf(i));
        String str3 = "";
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            LIZJ.put("errorMsg", str2);
        }
        C40467FuR c40467FuR = C40467FuR.LIZ;
        String abstractMap = LIZJ.toString();
        o.LJIIIIZZ(abstractMap, "map.toString()");
        c40467FuR.LIZIZ(abstractMap);
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("success", Boolean.valueOf(z));
        if (str != null) {
            str3 = str;
        }
        c198517qh.LIZ.put("error_desc", str3);
        c198517qh.LIZ.put("has_sim_card", Boolean.valueOf(z2));
        c198517qh.LIZ.put("google_availability", Integer.valueOf(i));
        JSONObject json = c198517qh.LJ();
        int i2 = !z ? 1 : 0;
        o.LJIIIIZZ(json, "json");
        Q13.LIZIZ("phone_auto_fill", i2, json);
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_method", this.LJLJJLL);
        c35936E8m.LIZ(z ? 1 : 0, "is_successful");
        c35936E8m.LIZLLL("error_desc", str);
        c35936E8m.LIZ(z2 ? 1 : 0, "has_sim_card");
        c35936E8m.LIZ(i, "google_availability");
        FMX.LJIIL("phone_auto_fill", c35936E8m.LIZ);
    }
}
