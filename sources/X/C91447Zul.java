package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.dsp.common.model.DspUpsellRessoStruct;
import com.ss.android.ugc.aweme.dsp.playpage.s2s.S2SReportViewModel;

/* renamed from: X.Zul, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91447Zul<T> implements Observer {
    public final /* synthetic */ InterfaceC65784Pro<Boolean> LJLIL;
    public final /* synthetic */ S2SReportViewModel LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ Fragment LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C91395Ztv> LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    public C91447Zul(InterfaceC65784Pro<Boolean> interfaceC65784Pro, S2SReportViewModel s2SReportViewModel, Context context, Fragment fragment, InterfaceC65784Pro<C91395Ztv> interfaceC65784Pro2, boolean z) {
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = s2SReportViewModel;
        this.LJLJI = context;
        this.LJLJJI = fragment;
        this.LJLJJL = interfaceC65784Pro2;
        this.LJLJJLL = z;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Long l;
        DspUpsellRessoStruct dspUpsellRessoStruct;
        if (this.LJLIL.invoke().booleanValue()) {
            S2SReportViewModel s2SReportViewModel = this.LJLILLLLZI;
            Context context = this.LJLJI;
            Fragment fragment = this.LJLJJI;
            C91395Ztv invoke = this.LJLJJL.invoke();
            if (invoke != null) {
                l = Long.valueOf(invoke.LJLILLLLZI);
            } else {
                l = null;
            }
            String valueOf = String.valueOf(l);
            C91395Ztv invoke2 = this.LJLJJL.invoke();
            if (invoke2 == null || (dspUpsellRessoStruct = invoke2.LJLJI) == null) {
                return;
            }
            s2SReportViewModel.hv0(context, fragment, valueOf, dspUpsellRessoStruct, this.LJLJJLL);
        }
    }
}
