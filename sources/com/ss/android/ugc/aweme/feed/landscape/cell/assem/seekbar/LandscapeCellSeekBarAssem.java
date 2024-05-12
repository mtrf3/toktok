package com.ss.android.ugc.aweme.feed.landscape.cell.assem.seekbar;

import X.C125314vv;
import X.C16880lQ;
import X.C214348b8;
import X.C241249dQ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C7MY;
import X.C8LC;
import X.C8LD;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.TBT;
import Y.ACListenerS38S0200000_3;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseContentAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class LandscapeCellSeekBarAssem extends FeedBaseContentAssem<LandscapeCellSeekBarAssem> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLF;
    public final float LJZL;
    public final InterfaceC115514g7 LL;
    public TuxTextView LLD;

    static {
        TBT tbt = new TBT(LandscapeCellSeekBarAssem.class, "seekBarVM", "getSeekBarVM()Lcom/ss/android/ugc/aweme/feed/landscape/cell/assem/seekbar/LandscapeCellSeekBarVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLF = new InterfaceC74236TBo[]{tbt};
    }

    public LandscapeCellSeekBarAssem() {
        new LinkedHashMap();
        this.LJZL = 1.0f;
        C241249dQ c241249dQ = C241249dQ.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(LandscapeCellSeekBarVM.class);
        this.LL = C214348b8.LIZ(this, LIZ, c241249dQ, new AqS153S0100000_3(LIZ, 404), null, C8LD.INSTANCE, null, null);
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams videoItemParams) {
        boolean z;
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        float f = this.LJZL;
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            TuxTextView tuxTextView = this.LLD;
            if (tuxTextView != null) {
                tuxTextView.setText(C125314vv.LIZ(f));
            } else {
                o.LJIJI("playSpeedTv");
                throw null;
            }
        } else {
            TuxTextView tuxTextView2 = this.LLD;
            if (tuxTextView2 != null) {
                tuxTextView2.setText("1x");
            } else {
                o.LJIJI("playSpeedTv");
                throw null;
            }
        }
        TuxTextView tuxTextView3 = this.LLD;
        if (tuxTextView3 != null) {
            C16880lQ.LJJJJI(tuxTextView3, new ACListenerS38S0200000_3(this, item, 61));
        } else {
            o.LJIJI("playSpeedTv");
            throw null;
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLD = (TuxTextView) C7MY.LIZLLL(view, "view", R.id.k_f, "view.findViewById(R.id.speed_state)");
        C8YN.LJII(this, (AssemViewModel) this.LL.LIZ(this, LLF[0]), new TBT() { // from class: X.8LB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Float.valueOf(((C8LA) obj).LJLIL);
            }
        }, null, C8LC.LJLIL, 6);
    }
}
