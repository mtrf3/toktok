package com.ss.android.ugc.aweme.feed.assem.friendstab;

import X.C16880lQ;
import X.C17N;
import X.C199897sv;
import X.C213688a4;
import X.C214348b8;
import X.C225728tU;
import X.C225748tW;
import X.C225758tX;
import X.C225838tf;
import X.C225848tg;
import X.C5H3;
import X.C65352Pkq;
import X.C79057V0z;
import X.C8YN;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import Y.ARunnableS39S0100000_3;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.translation.service.TranslationServiceImpl;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FriendsTabEducateButtonAssem extends BaseCellSlotComponent<FriendsTabEducateButtonAssem> {
    public C199897sv LLFII;
    public TuxTextView LLFZ;
    public final C5H3 LLI;
    public final C5H3 LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public String LLIIIILZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.ach;
    }

    public FriendsTabEducateButtonAssem() {
        new LinkedHashMap();
        this.LLI = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C225838tf.INSTANCE);
        this.LLIFFJFJJ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C225848tg.INSTANCE);
        this.LLIIIILZ = "";
    }

    public final void q4() {
        C79057V0z.LJJJ(getContainerView(), new ARunnableS39S0100000_3(this, 65));
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        if (!this.LLII) {
            C17N.LJJIIJZLJL(Y3());
            q4();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        TuxTextView tuxTextView;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        q4();
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.g36);
        if (linearLayout != null) {
            C16880lQ.LJIIZILJ(linearLayout, new ACListenerS23S0100000_3(this, 69));
        }
        this.LLFII = (C199897sv) view.findViewById(R.id.do8);
        this.LLFZ = (TuxTextView) view.findViewById(R.id.awi);
        if (o.LJ("my", TranslationServiceImpl.LJJIJ().LJJIIZI()) && (tuxTextView = this.LLFZ) != null) {
            tuxTextView.setTuxFont(92);
        }
        C8YN.LJII(this, (AssemViewModel) this.LLI.getValue(), new TBT() { // from class: X.8tY
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), C225728tU.LJLIL, 4);
        C8YN.LJII(this, (AssemViewModel) this.LLI.getValue(), new TBT() { // from class: X.8tZ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJJI;
            }
        }, C213688a4.LIZLLL(), C225758tX.LJLIL, 4);
        C8YN.LJIIJJI(this, (AssemViewModel) this.LLIFFJFJJ.getValue(), new TBT() { // from class: X.8ta
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLJLLL;
            }
        }, new TBT() { // from class: X.8th
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLL;
            }
        }, new TBT() { // from class: X.8tj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLLI;
            }
        }, C213688a4.LIZLLL(), C225748tW.LJLIL, 16);
    }
}
