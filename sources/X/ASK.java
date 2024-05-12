package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ASK extends C08Z {
    public final /* synthetic */ TuxSheet LIZ;

    public ASK(TuxSheet tuxSheet) {
        this.LIZ = tuxSheet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C08Z
    public final void onFragmentActivityCreated(FragmentManager fm, Fragment f, Bundle bundle) {
        Dialog dialog;
        FrameLayout frameLayout;
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        super.onFragmentActivityCreated(fm, f, bundle);
        Context context = this.LIZ.getContext();
        C235119Kp c235119Kp = null;
        if ((f instanceof InterfaceC219588ja) && context != null) {
            c235119Kp = ((InterfaceC219588ja) f).createNavActions();
        }
        ASI asi = this.LIZ.LLF;
        if (asi != null) {
            asi.setNavActions(c235119Kp);
        }
        this.LIZ.Gl(c235119Kp);
        if ((f instanceof ASN) && (dialog = this.LIZ.getDialog()) != null && (frameLayout = (FrameLayout) dialog.findViewById(R.id.bs8)) != null) {
            TuxSheet tuxSheet = this.LIZ;
            View view = tuxSheet.LLI;
            if (view != null) {
                C16880lQ.LJLLLL(view, frameLayout);
            }
            ASN asn = (ASN) f;
            C9U7 Zb = asn.Zb();
            if (Zb == null) {
                return;
            }
            tuxSheet.LLI = Zb;
            frameLayout.addView(Zb);
            asn.a5();
        }
    }
}
