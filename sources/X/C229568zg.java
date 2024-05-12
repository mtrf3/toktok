package X;

import Y.AfS55S0100000_3;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.ss.android.ugc.aweme.mix.videodetail.JediWidget;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8zg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C229568zg implements InterfaceC51679KPz, InterfaceC51771KTn {
    public final MixVideosViewModel LJLIL;
    public ActivityC45651qj LJLILLLLZI;
    public JediWidget LJLJI;

    @Override // X.InterfaceC51679KPz
    public final boolean deleteItem(String aid) {
        o.LJIIIZ(aid, "aid");
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return 19;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean isDataEmpty() {
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean isLoading() {
        return false;
    }

    @Override // X.InterfaceC51771KTn
    public final /* synthetic */ boolean shouldSetRefreshListener() {
        return true;
    }

    @Override // X.InterfaceC51679KPz
    public final void unInit() {
    }

    @Override // X.InterfaceC51679KPz
    public final boolean cannotLoadLatest() {
        MixVideosViewModel mixVideosViewModel = this.LJLIL;
        if (!mixVideosViewModel.LJLJLLL || (mixVideosViewModel.LJZI && C229638zn.LIZ())) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public final boolean cannotLoadMore() {
        MixVideosViewModel mixVideosViewModel = this.LJLIL;
        if (!mixVideosViewModel.LJLL || (mixVideosViewModel.LJZI && C229638zn.LIZ())) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC51679KPz
    public final Object getViewModel() {
        return this.LJLIL;
    }

    public C229568zg(MixVideosViewModel viewModel) {
        o.LJIIIZ(viewModel, "viewModel");
        this.LJLIL = viewModel;
    }

    @Override // X.InterfaceC51679KPz
    public final void bindView(KQA detailFragmentPanel) {
        String str;
        o.LJIIIZ(detailFragmentPanel, "detailFragmentPanel");
        if (this.LJLILLLLZI != null) {
            Aweme aweme = this.LJLIL.LJLJJLL;
            if (aweme == null || (str = aweme.getAid()) == null) {
                str = "";
            }
            Aweme i6 = AwemeService.LIZ().i6(str);
            ArrayList arrayList = new ArrayList();
            if (i6 != null) {
                arrayList.add(i6);
            }
            detailFragmentPanel.J5(arrayList, true);
            FN6.LIZJ(new Runnable() { // from class: X.8zi
                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ;
                    try {
                        FRW.LIZ("playlist_first_render_cost_time");
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
        AssemViewModel.asyncSubscribe$default(this.LJLIL, new TBT() { // from class: X.8zj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((M7C) obj).LJLJLJ;
            }
        }, null, C229608zk.LJLIL, C229648zo.LJLIL, new AqS169S0100000_3(detailFragmentPanel, 641), 2, null);
    }

    @Override // X.InterfaceC51679KPz
    public final boolean init(Fragment owner) {
        o.LJIIIZ(owner, "owner");
        if (this.LJLIL == null) {
            return false;
        }
        ActivityC45651qj mo49getActivity = owner.mo49getActivity();
        o.LJI(mo49getActivity);
        this.LJLILLLLZI = mo49getActivity;
        C229578zh.LIZ(mo49getActivity).LJLIL.setValue(Boolean.valueOf(this.LJLIL.LJLJLLL));
        this.LJLJI = new JediWidget();
        C72714SgI c72714SgI = C72713SgH.LJIIIIZZ;
        View view = owner.getView();
        c72714SgI.getClass();
        C72713SgH LIZ = C72714SgI.LIZ(view, owner);
        JediWidget jediWidget = this.LJLJI;
        if (jediWidget != null) {
            LIZ.LJ(jediWidget);
            return true;
        }
        o.LJIJI("jediView");
        throw null;
    }

    @Override // X.InterfaceC51679KPz
    public final void request(int i, M89 feedParam, int i2, boolean z) {
        MixVideosViewModel mixVideosViewModel;
        o.LJIIIZ(feedParam, "feedParam");
        if (i != 1) {
            if (i != 2) {
                if (i != 4 || (mixVideosViewModel = this.LJLIL) == null) {
                    return;
                }
                mixVideosViewModel.iv0(Long.valueOf(mixVideosViewModel.LJLLILLLL), feedParam.getUid(), feedParam.getSecUid());
                return;
            }
            MixVideosViewModel mixVideosViewModel2 = this.LJLIL;
            Long valueOf = Long.valueOf(mixVideosViewModel2.LJLLI);
            String uid = feedParam.getUid();
            String secUid = feedParam.getSecUid();
            if (valueOf == null) {
                return;
            }
            valueOf.longValue();
            if (uid == null || secUid == null) {
                return;
            }
            int LIZ = C228578y5.LIZ();
            MixFeedApi.LIZ.getClass();
            mixVideosViewModel2.disposeOnClear(C229098yv.LIZ(C229108yw.LIZ(), mixVideosViewModel2.LJLJJI, "", mixVideosViewModel2.LJLLI, 2, mixVideosViewModel2.mv0(), mixVideosViewModel2.kv0(), mixVideosViewModel2.LL, Integer.valueOf(LIZ), 256).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS55S0100000_3(mixVideosViewModel2, 77), new InterfaceC64592gB() { // from class: X.8zm
                @Override // X.InterfaceC64592gB
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                }
            }));
            return;
        }
        MixVideosViewModel mixVideosViewModel3 = this.LJLIL;
        if (mixVideosViewModel3 == null) {
            return;
        }
        mixVideosViewModel3.jv0(feedParam.getUid(), feedParam.getSecUid());
    }
}
