package X;

import X.C91395Ztv;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.dsp.common.model.DspUpsellRessoStruct;
import com.ss.android.ugc.aweme.dsp.playpage.s2s.S2SReportViewModel;

/* renamed from: X.ZxG, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91602ZxG extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ Fragment LJLIL;
    public final /* synthetic */ LiveData<C91411ZuB> LJLILLLLZI;
    public final /* synthetic */ LifecycleOwner LJLJI;
    public final /* synthetic */ LiveData<C2JO> LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<Boolean> LJLJJL;
    public final /* synthetic */ S2SReportViewModel LJLJJLL;
    public final /* synthetic */ Context LJLJL;
    public final /* synthetic */ InterfaceC65784Pro<C91395Ztv> LJLJLJ;
    public final /* synthetic */ boolean LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91602ZxG(Context context, Fragment fragment, ReusedUIAssem reusedUIAssem, LiveData liveData, LiveData liveData2, S2SReportViewModel s2SReportViewModel, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, boolean z) {
        super(0);
        this.LJLIL = fragment;
        this.LJLILLLLZI = liveData;
        this.LJLJI = reusedUIAssem;
        this.LJLJJI = liveData2;
        this.LJLJJL = interfaceC65784Pro;
        this.LJLJJLL = s2SReportViewModel;
        this.LJLJL = context;
        this.LJLJLJ = interfaceC65784Pro2;
        this.LJLJLLL = z;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        Lifecycle lifecycle = this.LJLIL.getLifecycle();
        final InterfaceC65784Pro<Boolean> interfaceC65784Pro = this.LJLJJL;
        final S2SReportViewModel s2SReportViewModel = this.LJLJJLL;
        final Context context = this.LJLJL;
        final Fragment fragment = this.LJLIL;
        final InterfaceC65784Pro<C91395Ztv> interfaceC65784Pro2 = this.LJLJLJ;
        final boolean z = this.LJLJLLL;
        lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.dsp.playpage.s2s.S2SPageChangeHelper$subscribePageChanged$1$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_RESUME) {
                    onResume();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            public final void onResume() {
                Long l;
                DspUpsellRessoStruct dspUpsellRessoStruct;
                if (interfaceC65784Pro.invoke().booleanValue()) {
                    S2SReportViewModel s2SReportViewModel2 = s2SReportViewModel;
                    Context context2 = context;
                    Fragment fragment2 = fragment;
                    C91395Ztv invoke = interfaceC65784Pro2.invoke();
                    if (invoke != null) {
                        l = Long.valueOf(invoke.LJLILLLLZI);
                    } else {
                        l = null;
                    }
                    String valueOf = String.valueOf(l);
                    C91395Ztv invoke2 = interfaceC65784Pro2.invoke();
                    if (invoke2 == null || (dspUpsellRessoStruct = invoke2.LJLJI) == null) {
                        return;
                    }
                    s2SReportViewModel2.hv0(context2, fragment2, valueOf, dspUpsellRessoStruct, z);
                }
            }
        });
        LiveData<C91411ZuB> liveData = this.LJLILLLLZI;
        LifecycleOwner lifecycleOwner = this.LJLJI;
        liveData.observe(lifecycleOwner, new C91446Zuk(this.LJLJJL, lifecycleOwner, this.LJLIL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL));
        this.LJLJJI.observe(this.LJLJI, new C91447Zul(this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLIL, this.LJLJLJ, this.LJLJLLL));
        return C76800UCe.LIZ;
    }
}
