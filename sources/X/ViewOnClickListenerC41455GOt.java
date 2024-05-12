package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;

/* renamed from: X.GOt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC41455GOt implements View.OnClickListener {
    public final /* synthetic */ Fragment LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ CommerceToolsTcmModel LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    public ViewOnClickListenerC41455GOt(Fragment fragment, boolean z, CommerceToolsTcmModel commerceToolsTcmModel, boolean z2, int i, boolean z3) {
        this.LJLIL = fragment;
        this.LJLILLLLZI = z;
        this.LJLJI = commerceToolsTcmModel;
        this.LJLJJI = z2;
        this.LJLJJL = i;
        this.LJLJJLL = z3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Activity activity;
        String str;
        Context context = this.LJLIL.getContext();
        if (context != null) {
            activity = C45804HyK.LJIJJ(context);
        } else {
            activity = null;
        }
        C41459GOx.LIZ(activity, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, "post", this.LJLJJL);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZ(C41458GOw.LIZIZ() ? 1 : 0, "is_tcm_creator");
        c145995oB.LJI("user_id", C44172HVg.LJIJ.getCurrentUserID());
        if (this.LJLJJLL) {
            str = "photo mode";
        } else {
            str = "video";
        }
        c145995oB.LJI("content_type", str);
        FMX.LJIIL("ttcm_post_page_click_disclosure", c145995oB.LIZ);
    }
}
