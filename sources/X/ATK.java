package X;

import android.content.DialogInterface;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.PerfMonitorServiceImpl;
import com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ATK implements DialogInterface.OnShowListener {
    public final /* synthetic */ ATB LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ C34K LJLJI;
    public final /* synthetic */ int LJLJJI;

    public ATK(ATB atb, View view, C34K c34k, int i) {
        this.LJLIL = atb;
        this.LJLILLLLZI = view;
        this.LJLJI = c34k;
        this.LJLJJI = i;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        BottomSheetBehavior<View> bottomSheetBehavior;
        int i;
        ATN atn = this.LJLIL.LLFF;
        if (atn != null) {
            atn.LIZ();
        }
        ATB atb = this.LJLIL;
        View view = this.LJLILLLLZI;
        if (view != null) {
            bottomSheetBehavior = BottomSheetBehavior.from(view);
        } else {
            bottomSheetBehavior = null;
        }
        atb.LJZL = bottomSheetBehavior;
        ATB atb2 = this.LJLIL;
        BottomSheetBehavior<View> bottomSheetBehavior2 = atb2.LJZL;
        if (bottomSheetBehavior2 != null) {
            C34K c34k = this.LJLJI;
            int i2 = this.LJLJJI;
            bottomSheetBehavior2.setFitToContents(true);
            bottomSheetBehavior2.setSkipCollapsed(!c34k.element);
            bottomSheetBehavior2.setHideable(true);
            bottomSheetBehavior2.setPeekHeight(i2);
            if (c34k.element) {
                i = 4;
            } else {
                i = 3;
            }
            bottomSheetBehavior2.setState(i);
            if (c34k.element) {
                bottomSheetBehavior2.setBottomSheetCallback(new ATL(atb2, bottomSheetBehavior2));
            }
        }
        C2U8.LIZ(new C2J7(true));
        PerfMonitorService LIZ = PerfMonitorServiceImpl.LIZ();
        ATB atb3 = this.LJLIL;
        LIZ.LIZLLL("share_panel");
        LIZ.LIZIZ(null, null);
        EnumC55365Lo9 enumC55365Lo9 = EnumC55365Lo9.RECYCLER_VIEW;
        RecyclerView recycle_view = (RecyclerView) atb3.findViewById(R.id.isd);
        o.LJIIIIZZ(recycle_view, "recycle_view");
        LIZ.LJI("share_panel_im", enumC55365Lo9, recycle_view, null, null);
    }
}
