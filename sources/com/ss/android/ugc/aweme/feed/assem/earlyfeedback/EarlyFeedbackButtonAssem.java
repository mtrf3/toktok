package com.ss.android.ugc.aweme.feed.assem.earlyfeedback;

import X.C214348b8;
import X.C221108m2;
import X.C59922NfS;
import X.C59923NfT;
import X.C59924NfU;
import X.C59925NfV;
import X.C59931Nfb;
import X.C59932Nfc;
import X.C59933Nfd;
import X.C59934Nfe;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C8YN;
import X.SY4;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class EarlyFeedbackButtonAssem extends BaseCellSlotComponent<EarlyFeedbackButtonAssem> {
    public static final C62822Ol8 LLIIIJ = C221108m2.LIZIZ(C59933Nfd.LJLIL);
    public static final C62822Ol8 LLIIIL = C221108m2.LIZIZ(C59934Nfe.LJLIL);
    public View LLFII;
    public SY4 LLFZ;
    public SY4 LLI;
    public final C5H3 LLIFFJFJJ;
    public final C5H3 LLII;
    public int LLIIII;
    public int LLIIIILZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.adb;
    }

    public EarlyFeedbackButtonAssem() {
        new LinkedHashMap();
        this.LLIFFJFJJ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(EarlyFeedbackVM.class), C59931Nfb.INSTANCE);
        this.LLII = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C59932Nfc.INSTANCE);
        this.LLIIII = -1;
        this.LLIIIILZ = -1;
    }

    public final EarlyFeedbackVM q4() {
        return (EarlyFeedbackVM) this.LLIFFJFJJ.getValue();
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LLFII = view.findViewById(R.id.j71);
        this.LLFZ = (SY4) view.findViewById(R.id.awr);
        this.LLI = (SY4) view.findViewById(R.id.axk);
        C8YN.LJII(this, (AssemViewModel) this.LLII.getValue(), new TBT() { // from class: X.NfW
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, null, C59922NfS.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLII.getValue(), new TBT() { // from class: X.NfX
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJJI;
            }
        }, null, C59923NfT.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLII.getValue(), new TBT() { // from class: X.NdO
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJL;
            }
        }, null, C59925NfV.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLII.getValue(), new TBT() { // from class: X.NdP
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJLJ;
            }
        }, null, C59924NfU.LJLIL, 6);
    }
}
