package com.ss.android.ugc.aweme.topicfeed.ui;

import X.C16880lQ;
import X.C214298b3;
import X.C2K0;
import X.C47704Ins;
import X.C54476LZo;
import X.C54477LZp;
import X.C54478LZq;
import X.C55096Ljo;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9BE;
import X.InterfaceC55102Lju;
import X.LZT;
import X.SY4;
import X.TBT;
import Y.ACListenerS29S0100000_9;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.topicfeed.panel.TopicFeedFragmentPanel;
import com.ss.android.ugc.aweme.topicfeed.vm.TopicFeedListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TopicFeedEmptyAssem extends UISlotAssem implements ITopicEmptyAssemAbility, InterfaceC55102Lju {
    public final C214298b3 LJLJLLL;
    public final C55749LuL LJLL;
    public TuxTextView LJLLI;
    public TopicFeedFragmentPanel LJLLILLLL;
    public boolean LJLLJ;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 1771730259) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.csi;
    }

    public TopicFeedEmptyAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(TopicFeedListViewModel.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 654), C54476LZo.INSTANCE, null);
        this.LJLL = new C55749LuL(C47704Ins.LIZJ(this, LZT.class, null), checkSupervisorPrepared());
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.topicfeed.ui.ITopicEmptyAssemAbility
    public final boolean LLF() {
        return this.LJLLJ;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        if (!(getContainerView() instanceof FrameLayout)) {
            return;
        }
        this.LJLLILLLL = ((LZT) this.LJLL.getValue()).LJLIL;
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.LZn
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C54667Lct) obj).getRefreshState();
            }
        }, null, C54477LZp.LJLIL, C54478LZq.LJLIL, new AqS175S0100000_9(this, 295), 2, null);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.c7z);
        this.LJLLI = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.LJJJ(30.0f);
        }
        TuxTextView tuxTextView2 = this.LJLLI;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(((TopicFeedListViewModel) this.LJLJLLL.getValue()).LJLJI);
        }
        SY4 sy4 = (SY4) view.findViewById(R.id.auw);
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS29S0100000_9(this, 125));
        }
        view.findViewById(R.id.bul);
    }
}
