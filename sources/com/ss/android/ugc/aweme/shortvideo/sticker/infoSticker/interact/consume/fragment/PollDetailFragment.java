package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C56945MWn;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C73969T1h;
import X.C74199TAd;
import X.C74200TAe;
import X.C74201TAf;
import X.C74202TAg;
import X.C76800UCe;
import X.C90903hW;
import X.InterfaceC191547fS;
import X.InterfaceC223218pR;
import X.InterfaceC74204TAi;
import X.T16;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PollDetailFragment extends AmeBaseFragment implements InterfaceC191547fS, InterfaceC223218pR<User> {
    public static final /* synthetic */ int LJLJLLL = 0;
    public PollStruct LJLIL;
    public int LJLILLLLZI;
    public View LJLJI;
    public RecyclerView LJLJJI;
    public C73305Spp LJLJJL;
    public C56945MWn LJLJJLL;
    public C74199TAd LJLJL;
    public InterfaceC74204TAi LJLJLJ;

    @Override // X.InterfaceC223218pR
    public final void Iw() {
    }

    @Override // X.InterfaceC223218pR
    public final void Qw(Exception exc) {
    }

    @Override // X.InterfaceC223218pR
    public final void jh(List<User> list, boolean z) {
    }

    public PollDetailFragment() {
        new LinkedHashMap();
    }

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
        PollStruct.OptionsBean optionsBean;
        long optionId;
        PollStruct.OptionsBean optionsBean2;
        if (this.LJLIL == null) {
            Ne();
        }
        C74199TAd c74199TAd = this.LJLJL;
        if (c74199TAd != null) {
            PollStruct pollStruct = this.LJLIL;
            o.LJI(pollStruct);
            long pollId = pollStruct.getPollId();
            if (this.LJLILLLLZI == 0) {
                PollStruct pollStruct2 = this.LJLIL;
                o.LJI(pollStruct2);
                List<PollStruct.OptionsBean> options = pollStruct2.getOptions();
                if (options != null && (optionsBean2 = (PollStruct.OptionsBean) ListProtector.get(options, 0)) != null) {
                    optionId = optionsBean2.getOptionId();
                }
                optionId = 0;
            } else {
                PollStruct pollStruct3 = this.LJLIL;
                o.LJI(pollStruct3);
                List<PollStruct.OptionsBean> options2 = pollStruct3.getOptions();
                if (options2 != null && (optionsBean = (PollStruct.OptionsBean) ListProtector.get(options2, 1)) != null) {
                    optionId = optionsBean.getOptionId();
                }
                optionId = 0;
            }
            c74199TAd.LIZLLL.getPollDetail(pollId, optionId, c74199TAd.LJFF.LIZ).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new C74200TAe(c74199TAd));
        }
    }

    public final void vl() {
        PollStruct.OptionsBean optionsBean;
        long optionId;
        PollStruct.OptionsBean optionsBean2;
        C74199TAd c74199TAd = this.LJLJL;
        if (c74199TAd != null) {
            PollStruct pollStruct = this.LJLIL;
            o.LJI(pollStruct);
            long pollId = pollStruct.getPollId();
            if (this.LJLILLLLZI == 0) {
                PollStruct pollStruct2 = this.LJLIL;
                o.LJI(pollStruct2);
                List<PollStruct.OptionsBean> options = pollStruct2.getOptions();
                if (options != null && (optionsBean2 = (PollStruct.OptionsBean) ListProtector.get(options, 0)) != null) {
                    optionId = optionsBean2.getOptionId();
                }
                optionId = 0;
            } else {
                PollStruct pollStruct3 = this.LJLIL;
                o.LJI(pollStruct3);
                List<PollStruct.OptionsBean> options2 = pollStruct3.getOptions();
                if (options2 != null && (optionsBean = (PollStruct.OptionsBean) ListProtector.get(options2, 1)) != null) {
                    optionId = optionsBean.getOptionId();
                }
                optionId = 0;
            }
            c74199TAd.LIZLLL.getPollDetail(pollId, optionId, 0).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new C74201TAf(c74199TAd));
        }
    }

    @Override // X.InterfaceC223218pR
    public final void LJII() {
        if (!isViewValid()) {
            return;
        }
        C73305Spp c73305Spp = this.LJLJJL;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
        }
        C73305Spp c73305Spp2 = this.LJLJJL;
        if (c73305Spp2 != null) {
            c73305Spp2.LJFF();
        }
    }

    @Override // X.InterfaceC223218pR
    public final void Ne() {
        if (!isViewValid()) {
            return;
        }
        C73305Spp c73305Spp = this.LJLJJL;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
        }
        C73305Spp c73305Spp2 = this.LJLJJL;
        if (c73305Spp2 != null) {
            C73306Spq c73306Spq = new C73306Spq();
            String string = getString(R.string.tt1);
            o.LJIIIIZZ(string, "getString(R.string.vote_empty)");
            c73306Spq.LJI = string;
            c73305Spp2.setStatus(c73306Spq);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C74199TAd c74199TAd = this.LJLJL;
        if (c74199TAd != null) {
            c74199TAd.LJ.dispose();
        }
    }

    @Override // X.InterfaceC223218pR
    public final void showLoadMoreLoading() {
        C56945MWn c56945MWn;
        if (isViewValid() && (c56945MWn = this.LJLJJLL) != null) {
            c56945MWn.showLoadMoreLoading();
        }
    }

    @Override // X.InterfaceC223218pR
    public final void cb0(Exception exc) {
        if (!isViewValid()) {
            return;
        }
        C73305Spp c73305Spp = this.LJLJJL;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(0);
        }
        C73305Spp c73305Spp2 = this.LJLJJL;
        if (c73305Spp2 != null) {
            C73306Spq c73306Spq = new C73306Spq();
            C73312Spw.LJIIJJI(c73306Spq, new C74202TAg(this));
            c73305Spp2.setStatus(c73306Spq);
        }
    }

    @Override // X.InterfaceC223218pR
    public final void nc(Exception exc) {
        C56945MWn c56945MWn;
        if (isViewValid() && (c56945MWn = this.LJLJJLL) != null) {
            c56945MWn.showLoadMoreError();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        Serializable serializable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            i = arguments.getInt("key_state");
        } else {
            i = 0;
        }
        this.LJLILLLLZI = i;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable = arguments2.getSerializable("key_poll");
        } else {
            serializable = null;
        }
        this.LJLIL = (PollStruct) serializable;
        this.LJLJL = new C74199TAd(this, this.LJLJLJ, this.LJLILLLLZI);
    }

    @Override // X.InterfaceC223218pR
    public final void J5(List<User> list, boolean z) {
        if (!isViewValid()) {
            return;
        }
        if (!z) {
            C56945MWn c56945MWn = this.LJLJJLL;
            if (c56945MWn != null) {
                c56945MWn.showLoadMoreEmpty();
            }
        } else {
            C56945MWn c56945MWn2 = this.LJLJJLL;
            if (c56945MWn2 != null) {
                c56945MWn2.resetLoadMoreState();
            }
        }
        C73305Spp c73305Spp = this.LJLJJL;
        if (c73305Spp != null) {
            c73305Spp.setVisibility(8);
        }
        C56945MWn c56945MWn3 = this.LJLJJLL;
        if (c56945MWn3 != null) {
            c56945MWn3.setData(list);
        }
    }

    @Override // X.InterfaceC223218pR
    public final void j0(List<User> list, boolean z) {
        List arrayList;
        if (!isViewValid()) {
            return;
        }
        C56945MWn c56945MWn = this.LJLJJLL;
        if (c56945MWn != null) {
            c56945MWn.setShowFooter(false);
        }
        if (!z) {
            C56945MWn c56945MWn2 = this.LJLJJLL;
            if (c56945MWn2 != null) {
                c56945MWn2.showLoadMoreEmpty();
            }
        } else {
            C56945MWn c56945MWn3 = this.LJLJJLL;
            if (c56945MWn3 != null) {
                c56945MWn3.resetLoadMoreState();
            }
        }
        C56945MWn c56945MWn4 = this.LJLJJLL;
        if (c56945MWn4 == null || (arrayList = c56945MWn4.getData()) == null) {
            arrayList = new ArrayList();
        }
        if (list != null && !list.isEmpty()) {
            arrayList.addAll(list);
            C56945MWn c56945MWn5 = this.LJLJJLL;
            if (c56945MWn5 != null) {
                c56945MWn5.setDataAfterLoadMore(arrayList);
            }
        }
        C56945MWn c56945MWn6 = this.LJLJJLL;
        if (c56945MWn6 == null) {
            return;
        }
        c56945MWn6.setShowFooter(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        if (X.C79004UzY.LJJIFFI(r4) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        LJII();
        r2 = r5.LJLJJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (r2 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        r2.post(new Y.ARunnableS23S0300000_12(r5, r3, r4, 7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x006a, code lost:
    
        if (X.C79004UzY.LJJIFFI(r4) != false) goto L20;
     */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            super.onViewCreated(r6, r7)
            int r2 = r5.LJLILLLLZI
            r1 = 0
            r0 = 1
            if (r2 != 0) goto L3e
            X.TAi r0 = r5.LJLJLJ
            if (r0 == 0) goto L1c
            X.TAh r0 = r0.LIZ()
            if (r0 == 0) goto L1c
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r4 = r0.LIZ
            if (r4 != 0) goto L21
        L1c:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L21:
            X.TAi r0 = r5.LJLJLJ
            if (r0 == 0) goto L2f
            X.TAh r0 = r0.LIZ()
            if (r0 == 0) goto L2f
            X.TAk r3 = r0.LIZIZ
            if (r3 != 0) goto L34
        L2f:
            X.TAk r3 = new X.TAk
            r3.<init>(r1, r1)
        L34:
            boolean r0 = X.C79004UzY.LJJIFFI(r4)
            if (r0 == 0) goto L6d
        L3a:
            r5.vl()
        L3d:
            return
        L3e:
            if (r2 != r0) goto L3a
            X.TAi r0 = r5.LJLJLJ
            if (r0 == 0) goto L4e
            X.TAh r0 = r0.LIZ()
            if (r0 == 0) goto L4e
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r4 = r0.LIZJ
            if (r4 != 0) goto L53
        L4e:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L53:
            X.TAi r0 = r5.LJLJLJ
            if (r0 == 0) goto L61
            X.TAh r0 = r0.LIZ()
            if (r0 == 0) goto L61
            X.TAk r3 = r0.LIZLLL
            if (r3 != 0) goto L66
        L61:
            X.TAk r3 = new X.TAk
            r3.<init>(r1, r1)
        L66:
            boolean r0 = X.C79004UzY.LJJIFFI(r4)
            if (r0 == 0) goto L6d
            goto L3a
        L6d:
            r5.LJII()
            androidx.recyclerview.widget.RecyclerView r2 = r5.LJLJJI
            if (r2 == 0) goto L3d
            Y.ARunnableS23S0300000_12 r1 = new Y.ARunnableS23S0300000_12
            r0 = 7
            r1.<init>(r5, r3, r4, r0)
            r2.post(r1)
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.PollDetailFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C73305Spp c73305Spp;
        RecyclerView recyclerView;
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dt8, viewGroup, false);
        this.LJLJI = LLLLIILL;
        C29S c29s = null;
        if (LLLLIILL != null) {
            c73305Spp = (C73305Spp) LLLLIILL.findViewById(R.id.kf_);
        } else {
            c73305Spp = null;
        }
        this.LJLJJL = c73305Spp;
        if (LLLLIILL != null) {
            recyclerView = (RecyclerView) LLLLIILL.findViewById(R.id.ist);
        } else {
            recyclerView = null;
        }
        this.LJLJJI = recyclerView;
        C56945MWn c56945MWn = new C56945MWn();
        this.LJLJJLL = c56945MWn;
        c56945MWn.setLoadMoreListener(this);
        RecyclerView recyclerView2 = this.LJLJJI;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.LJLJJLL);
        }
        RecyclerView recyclerView3 = this.LJLJJI;
        if (recyclerView3 != null) {
            getContext();
            recyclerView3.setLayoutManager(new LinearLayoutManager());
        }
        View view = this.LJLJI;
        if (!(view instanceof View)) {
            view = null;
        }
        if (view != null) {
            try {
                ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view, this);
                C10A.LIZIZ(view, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return view;
    }
}
