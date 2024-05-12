package com.ss.android.ugc.aweme.feed.assem.generalmask;

import X.C16880lQ;
import X.C209128Iq;
import X.C209178Iv;
import X.C209188Iw;
import X.C209198Ix;
import X.C213688a4;
import X.C214348b8;
import X.C240999d1;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.SY4;
import X.TBT;
import Y.ACListenerS21S0100000_1;
import Y.ACListenerS28S0100000_8;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS61S0000000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class GeneralVideoMaskAssem extends FeedBaseAssem<GeneralVideoMaskAssem> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLI;
    public final C5H3 LLFFF;
    public final C5H3 LLFII;
    public final InterfaceC115514g7 LLFZ;

    static {
        TBT tbt = new TBT(GeneralVideoMaskAssem.class, "generalVideoMaskVM", "getGeneralVideoMaskVM()Lcom/ss/android/ugc/aweme/feed/assem/generalmask/GeneralVideoMaskVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLI = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void F3() {
        C8YN.LJII(this, p4(), new TBT() { // from class: X.8Iu
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C209138Ir) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), new AqS61S0000000_3(4), 4);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.ab6;
    }

    public GeneralVideoMaskAssem() {
        new LinkedHashMap();
        this.LLFFF = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C209188Iw.INSTANCE);
        this.LLFII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C209198Ix.INSTANCE);
        C240999d1 c240999d1 = C240999d1.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(GeneralVideoMaskVM.class);
        this.LLFZ = C214348b8.LIZ(this, LIZ, c240999d1, new AqS153S0100000_3(LIZ, 335), null, C209178Iv.INSTANCE, null, null);
    }

    public final GeneralVideoMaskVM p4() {
        return (GeneralVideoMaskVM) this.LLFZ.LIZ(this, LLI[0]);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        GeneralVideoMaskVM p4 = p4();
        p4.getClass();
        p4.setState(new AqS169S0100000_3(p4, 706));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        Y3().setVisibility(8);
        SY4 sy4 = (SY4) Y3().findViewById(R.id.b1h);
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS21S0100000_1(this, 35));
        }
        SY4 sy42 = (SY4) Y3().findViewById(R.id.b1j);
        if (sy42 != null) {
            C16880lQ.LJJIZ(sy42, new ACListenerS28S0100000_8(this, 12));
        }
        C8YN.LJII(this, (AssemViewModel) this.LLFFF.getValue(), new TBT() { // from class: X.8Is
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLIL;
            }
        }, null, new AqS61S0000000_3(this, 5), 6);
        C8YN.LJII(this, (AssemViewModel) this.LLFII.getValue(), new TBT() { // from class: X.8It
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C212208Um) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), C209128Iq.LJLIL, 4);
    }
}
