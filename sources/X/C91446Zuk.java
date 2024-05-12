package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.dsp.common.model.DspUpsellRessoStruct;
import com.ss.android.ugc.aweme.dsp.playpage.s2s.S2SReportViewModel;

/* renamed from: X.Zuk, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91446Zuk<T> implements Observer {
    public final /* synthetic */ InterfaceC65784Pro<Boolean> LJLIL;
    public final /* synthetic */ LifecycleOwner LJLILLLLZI;
    public final /* synthetic */ Fragment LJLJI;
    public final /* synthetic */ S2SReportViewModel LJLJJI;
    public final /* synthetic */ Context LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<C91395Ztv> LJLJJLL;
    public final /* synthetic */ boolean LJLJL;

    public C91446Zuk(InterfaceC65784Pro<Boolean> interfaceC65784Pro, LifecycleOwner lifecycleOwner, Fragment fragment, S2SReportViewModel s2SReportViewModel, Context context, InterfaceC65784Pro<C91395Ztv> interfaceC65784Pro2, boolean z) {
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = lifecycleOwner;
        this.LJLJI = fragment;
        this.LJLJJI = s2SReportViewModel;
        this.LJLJJL = context;
        this.LJLJJLL = interfaceC65784Pro2;
        this.LJLJL = z;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Long l;
        DspUpsellRessoStruct dspUpsellRessoStruct;
        if (((C91411ZuB) obj).LJLIL && this.LJLIL.invoke().booleanValue()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("nodeTabChangeLiveData,owner:");
            LIZ.append(this.LJLILLLLZI.getClass().getName());
            LIZ.append('#');
            LIZ.append(this.LJLILLLLZI.hashCode());
            LIZ.append(",fragment:");
            LIZ.append(this.LJLJI.getClass().getName());
            LIZ.append('#');
            LIZ.append(this.LJLJI.hashCode());
            X1D.LIZIZ(LIZ);
            S2SReportViewModel s2SReportViewModel = this.LJLJJI;
            Context context = this.LJLJJL;
            Fragment fragment = this.LJLJI;
            C91395Ztv invoke = this.LJLJJLL.invoke();
            if (invoke != null) {
                l = Long.valueOf(invoke.LJLILLLLZI);
            } else {
                l = null;
            }
            String valueOf = String.valueOf(l);
            C91395Ztv invoke2 = this.LJLJJLL.invoke();
            if (invoke2 == null || (dspUpsellRessoStruct = invoke2.LJLJI) == null) {
                return;
            }
            s2SReportViewModel.hv0(context, fragment, valueOf, dspUpsellRessoStruct, this.LJLJL);
        }
    }
}
