package X;

import android.app.Activity;
import android.app.Fragment;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* loaded from: classes12.dex */
public final class R18 extends Fragment {
    public static final /* synthetic */ int LJLJJI = 0;
    public int LJLIL;
    public R1A LJLILLLLZI;
    public boolean LJLJI;

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        R1A r1a = this.LJLILLLLZI;
        if (r1a != null && r1a.LJLILLLLZI == this) {
            r1a.LJLILLLLZI = null;
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        R1A r1a = this.LJLILLLLZI;
        if (r1a != null) {
            r1a.LJLILLLLZI = this;
            r1a.LIZ();
        } else {
            LIZ(null);
        }
    }

    public final void LIZ(AbstractC67638Qgc abstractC67638Qgc) {
        if (!this.LJLJI) {
            int i = 1;
            this.LJLJI = true;
            Activity activity = getActivity();
            activity.getFragmentManager().beginTransaction().remove(this).commit();
            if (abstractC67638Qgc != null) {
                int i2 = this.LJLIL;
                if (activity.isFinishing()) {
                    return;
                }
                Exception LJIIIIZZ = abstractC67638Qgc.LJIIIIZZ();
                if (LJIIIIZZ instanceof FXZ) {
                    try {
                        ((FXZ) LJIIIIZZ).startResolutionForResult(activity, i2);
                        return;
                    } catch (PendingIntent.CanceledException | IntentSender.SendIntentException unused) {
                        return;
                    }
                }
                Intent intent = new Intent();
                if (abstractC67638Qgc.LJIILIIL()) {
                    ((InterfaceC68184QpQ) abstractC67638Qgc.LJIIIZ()).LJIIJ(intent);
                    i = -1;
                } else if (LJIIIIZZ instanceof ETK) {
                    ETK etk = (ETK) LJIIIIZZ;
                    intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", new Status(etk.getStatusCode(), null, etk.getMessage()));
                } else {
                    intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", new Status(8, null, "Unexpected non API exception when trying to deliver the task result to an activity!"));
                }
                PendingIntent createPendingResult = activity.createPendingResult(i2, intent, 1073741824);
                if (createPendingResult == null) {
                    return;
                }
                createPendingResult.send(i);
                return;
            }
            PendingIntent createPendingResult2 = activity.createPendingResult(this.LJLIL, new Intent(), 1073741824);
            if (createPendingResult2 == null) {
                return;
            }
            try {
                createPendingResult2.send(0);
            } catch (PendingIntent.CanceledException unused2) {
            }
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LJLIL = getArguments().getInt("requestCode");
        if (R19.LIZIZ != getArguments().getLong("initializationElapsedRealtime")) {
            this.LJLILLLLZI = null;
        } else {
            this.LJLILLLLZI = (R1A) R1A.LJLJJL.get(getArguments().getInt("resolveCallId"));
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("delivered")) {
            z = true;
        }
        this.LJLJI = z;
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("delivered", this.LJLJI);
        R1A r1a = this.LJLILLLLZI;
        if (r1a != null && r1a.LJLILLLLZI == this) {
            r1a.LJLILLLLZI = null;
        }
    }
}
