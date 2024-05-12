package com.ss.android.ugc.aweme.nows.feed.ui;

import X.C194237jn;
import X.C213688a4;
import X.C214348b8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C7MY;
import X.C7O4;
import X.C7O6;
import X.C8VR;
import X.C8XO;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC194257jp;
import X.InterfaceC194547kI;
import X.InterfaceC74236TBo;
import X.TBT;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.nows.feed.viewmodel.NowPostCellViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowInteractionAssem extends ReusedUISlotAssem<NowInteractionAssem> implements C8XO<InterfaceC194547kI>, InterfaceC194257jp {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLI;
    public final InterfaceC115514g7 LLFF;
    public FrameLayout LLFFF;
    public FrameLayout LLFII;
    public FrameLayout LLFZ;

    static {
        TBT tbt = new TBT(NowInteractionAssem.class, "nowCellVM", "getNowCellVM()Lcom/ss/android/ugc/aweme/nows/feed/viewmodel/NowPostCellViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLI = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.bxh;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public NowInteractionAssem() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(NowPostCellViewModel.class);
        this.LLFF = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 601), null, C7O6.INSTANCE, null, null);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(InterfaceC194547kI item) {
        o.LJIIIZ(item, "item");
        C194237jn.LIZ(this, (NowPostCellViewModel) this.LLFF.LIZ(this, LLI[0]));
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(InterfaceC194547kI interfaceC194547kI) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLFII = (FrameLayout) C7MY.LIZLLL(view, "view", R.id.h8a, "view.findViewById(R.id.n…_interaction_like_bottom)");
        View findViewById = view.findViewById(R.id.h8_);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.n…teraction_comment_bottom)");
        this.LLFFF = (FrameLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.h8b);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.n…interaction_share_bottom)");
        this.LLFZ = (FrameLayout) findViewById2;
        InterfaceC115514g7 interfaceC115514g7 = this.LLFF;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LLI;
        ((NowPostCellViewModel) interfaceC115514g7.LIZ(this, interfaceC74236TBoArr[0])).hv0(this, C213688a4.LIZLLL());
        C8VR.LIZ(this, new AqS169S0100000_3(this, 313));
        C8YN.LJII(this, (AssemViewModel) this.LLFF.LIZ(this, interfaceC74236TBoArr[0]), new TBT() { // from class: X.7O5
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C194437k7) obj).LJLLI);
            }
        }, C213688a4.LIZLLL(), C7O4.LJLIL, 4);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(InterfaceC194547kI interfaceC194547kI) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if ((r1 instanceof X.C193997jP) == true) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00de  */
    @Override // X.InterfaceC194257jp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLIIJLIL(X.AbstractC193947jK r10, X.C194437k7 r11) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.nows.feed.ui.NowInteractionAssem.LLIIJLIL(X.7jK, X.7k7):void");
    }
}
