package com.ss.android.ugc.aweme.autocaption;

import X.C214348b8;
import X.C240999d1;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71518S5a;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.S5Z;
import X.TBT;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class VideoCLACaptionDebugAssem extends BaseCellSlotComponent<VideoCLACaptionDebugAssem> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLI;
    public final InterfaceC115514g7 LLFII;
    public View LLFZ;

    static {
        TBT tbt = new TBT(VideoCLACaptionDebugAssem.class, "claCaptionVM", "getClaCaptionVM()Lcom/ss/android/ugc/aweme/autocaption/VideoCLACaptionViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLI = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void F3() {
        C8YN.LJII(this, q4(), new TBT() { // from class: X.Rb7
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((RVC) obj).LJLJI;
            }
        }, null, C71518S5a.INSTANCE, 6);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.v8;
    }

    public VideoCLACaptionDebugAssem() {
        new LinkedHashMap();
        C240999d1 c240999d1 = C240999d1.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoCLACaptionViewModel.class);
        this.LLFII = C214348b8.LIZ(this, LIZ, c240999d1, new AqS162S0100000_12(LIZ, 100), null, S5Z.INSTANCE, null, null);
    }

    public final VideoCLACaptionViewModel q4() {
        return (VideoCLACaptionViewModel) this.LLFII.LIZ(this, LLI[0]);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }
}
