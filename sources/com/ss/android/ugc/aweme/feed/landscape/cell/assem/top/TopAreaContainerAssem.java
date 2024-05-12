package com.ss.android.ugc.aweme.feed.landscape.cell.assem.top;

import X.C16880lQ;
import X.C19N;
import X.C209418Jt;
import X.C209678Kt;
import X.C209708Kw;
import X.C214348b8;
import X.C241249dQ;
import X.C51029K0z;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8VR;
import X.C8YN;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.TBT;
import Y.ACListenerS23S0100000_3;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseContentAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TopAreaContainerAssem extends FeedBaseContentAssem<TopAreaContainerAssem> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFF;
    public final InterfaceC115514g7 LJZL;
    public TuxIconView LL;
    public TuxIconView LLD;
    public TuxTextView LLF;

    static {
        TBT tbt = new TBT(TopAreaContainerAssem.class, "topAreaVM", "getTopAreaVM()Lcom/ss/android/ugc/aweme/feed/landscape/cell/assem/top/TopAreaContainerVM;", 0);
        C65352Pkq.LIZ.getClass();
        LLFF = new InterfaceC74236TBo[]{tbt};
    }

    public TopAreaContainerAssem() {
        new LinkedHashMap();
        C241249dQ c241249dQ = C241249dQ.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(TopAreaContainerVM.class);
        this.LJZL = C214348b8.LIZ(this, LIZ, c241249dQ, new AqS153S0100000_3(LIZ, 405), null, C209708Kw.INSTANCE, null, null);
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8VR.LIZ(this, new AqS169S0100000_3(this, 225));
        View findViewById = view.findViewById(R.id.fp_);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.left_return_button)");
        this.LL = (TuxIconView) findViewById;
        View findViewById2 = view.findViewById(R.id.j31);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.right_return_button)");
        this.LLD = (TuxIconView) findViewById2;
        View findViewById3 = view.findViewById(R.id.k_8);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.speed_button)");
        this.LLF = (TuxTextView) findViewById3;
        if (C209418Jt.LIZ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme()).LIZJ()) {
            TuxIconView tuxIconView = this.LL;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(0);
                TuxIconView tuxIconView2 = this.LLD;
                if (tuxIconView2 != null) {
                    tuxIconView2.setVisibility(8);
                    TuxTextView tuxTextView = this.LLF;
                    if (tuxTextView != null) {
                        tuxTextView.setVisibility(8);
                    } else {
                        o.LJIJI("speedButton");
                        throw null;
                    }
                } else {
                    o.LJIJI("rightReturnButton");
                    throw null;
                }
            } else {
                o.LJIJI("leftReturnButton");
                throw null;
            }
        } else {
            C8VR.LIZ(this, new AqS169S0100000_3(this, 697));
            TuxIconView tuxIconView3 = this.LL;
            if (tuxIconView3 != null) {
                tuxIconView3.setVisibility(8);
                TuxIconView tuxIconView4 = this.LLD;
                if (tuxIconView4 != null) {
                    tuxIconView4.setVisibility(0);
                    TuxTextView tuxTextView2 = this.LLF;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setVisibility(0);
                    } else {
                        o.LJIJI("speedButton");
                        throw null;
                    }
                } else {
                    o.LJIJI("rightReturnButton");
                    throw null;
                }
            } else {
                o.LJIJI("leftReturnButton");
                throw null;
            }
        }
        if (((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme().isPaidContent) {
            if (C19N.LJ("paid_content_landscape_enable_speed_change", false)) {
                TuxTextView tuxTextView3 = this.LLF;
                if (tuxTextView3 != null) {
                    tuxTextView3.setVisibility(0);
                } else {
                    o.LJIJI("speedButton");
                    throw null;
                }
            } else {
                TuxTextView tuxTextView4 = this.LLF;
                if (tuxTextView4 != null) {
                    tuxTextView4.setVisibility(8);
                } else {
                    o.LJIJI("speedButton");
                    throw null;
                }
            }
        }
        C8YN.LJII(this, (AssemViewModel) this.LJZL.LIZ(this, LLFF[0]), new TBT() { // from class: X.8Ku
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Float.valueOf(((C209698Kv) obj).LJLIL);
            }
        }, null, C209678Kt.LJLIL, 6);
        TuxIconView tuxIconView5 = this.LL;
        if (tuxIconView5 != null) {
            C16880lQ.LJJJ(tuxIconView5, new ACListenerS23S0100000_3(this, 209));
            TuxIconView tuxIconView6 = this.LLD;
            if (tuxIconView6 != null) {
                C16880lQ.LJJJ(tuxIconView6, new ACListenerS23S0100000_3(this, 210));
                TuxTextView tuxTextView5 = this.LLF;
                if (tuxTextView5 != null) {
                    C16880lQ.LJJJJI(tuxTextView5, new ACListenerS23S0100000_3(this, 211));
                    return;
                } else {
                    o.LJIJI("speedButton");
                    throw null;
                }
            }
            o.LJIJI("rightReturnButton");
            throw null;
        }
        o.LJIJI("leftReturnButton");
        throw null;
    }
}
