package com.ss.android.ugc.aweme.story.feed.immersive.digg;

import X.C16880lQ;
import X.C202547xC;
import X.C202557xD;
import X.C202567xE;
import X.C202577xF;
import X.C214348b8;
import X.C241249dQ;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ImmersiveStoryDiggAssem extends BaseCellSlotComponent<ImmersiveStoryDiggAssem> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIFFJFJJ;
    public final InterfaceC115514g7 LLFII;
    public final C5H3 LLFZ;
    public final ACListenerS23S0100000_3 LLI;

    static {
        TBT tbt = new TBT(ImmersiveStoryDiggAssem.class, "diggVM", "getDiggVM()Lcom/ss/android/ugc/aweme/feed/assem/digg/VideoDiggVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLIFFJFJJ = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.cpc;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C8YN.LJIILJJIL(this, (AssemViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.7wl
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJLLL;
            }
        }, null, C202557xD.LJLIL, 6);
        C8YN.LJII(this, q4(), new TBT() { // from class: X.7wg
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C200617u5) obj).LJLILLLLZI;
            }
        }, null, C202547xC.LJLIL, 6);
    }

    public ImmersiveStoryDiggAssem() {
        new LinkedHashMap();
        C241249dQ c241249dQ = C241249dQ.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoDiggVM.class);
        this.LLFII = C214348b8.LIZ(this, LIZ, c241249dQ, new AqS153S0100000_3(LIZ, 975), null, C202567xE.INSTANCE, null, null);
        this.LLFZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C202577xF.INSTANCE);
        this.LLI = new ACListenerS23S0100000_3(this, 152);
    }

    public final VideoDiggVM q4() {
        return (VideoDiggVM) this.LLFII.LIZ(this, LLIFFJFJJ[0]);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8XO
    public final void LLLZIIL() {
        q4().LJZI.LIZIZ(VideoDiggVM.LLFFF[0], null);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8XO
    public final /* bridge */ /* synthetic */ void n3(Object obj) {
        n3((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 153), getContainerView());
        C16880lQ.LJIILJJIL((FrameLayout) Y3().findViewById(R.id.c_t), this.LLI);
        C16880lQ.LJIIZILJ((LinearLayout) Y3().findViewById(R.id.c_x), this.LLI);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* renamed from: p4 */
    public final void n3(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        VideoDiggVM q4 = q4();
        q4.LJZI.LIZIZ(VideoDiggVM.LLFFF[0], getContext());
    }
}
