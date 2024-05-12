package com.ss.android.ugc.aweme.mention.ui.assem;

import X.C117054ib;
import X.C184077Kh;
import X.C213688a4;
import X.C214298b3;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C218348ha;
import X.C218358hb;
import X.C218378hd;
import X.C221108m2;
import X.C57939MoZ;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C78926UyI;
import X.C8W0;
import X.C8YN;
import X.C9BE;
import X.InterfaceC117064ic;
import X.InterfaceC65784Pro;
import X.SYL;
import X.T3D;
import X.TBT;
import Y.IDrS43S0100000_3;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mention.ui.assem.VideoCaptionMentionRecommendListAssem;
import com.ss.android.ugc.aweme.mention.ui.cell.VideoCaptionMentionRecommendCell;
import com.ss.android.ugc.aweme.mention.viewmodel.VideoCaptionMentionRecommendViewModel;
import com.ss.android.ugc.aweme.mention.viewmodel.VideoCaptionMentionStateViewModel;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoCaptionMentionRecommendListAssem extends UIListContentAssem<VideoCaptionMentionRecommendViewModel> {
    public final C62822Ol8 LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final C214378bB LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public T3D LJLLI;

    public VideoCaptionMentionRecommendListAssem() {
        InterfaceC65784Pro LJIILJJIL;
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 449));
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoCaptionMentionRecommendViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 453), C218348ha.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(VideoCaptionMentionStateViewModel.class);
        C218378hd c218378hd = C218378hd.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS153S0100000_3((C8W0) this, 454);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLJI = new C214378bB(LIZ2, null, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c218378hd, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
        this.LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 455));
        this.LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 452));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 448));
        this.LJLJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 447));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 451));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 446));
        this.LJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 445));
    }

    public final C117054ib C3() {
        Object value = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-indexView>(...)");
        return (C117054ib) value;
    }

    public final C73305Spp E3() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-statusView>(...)");
        return (C73305Spp) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: F3, reason: merged with bridge method [inline-methods] */
    public final VideoCaptionMentionRecommendViewModel A3() {
        return (VideoCaptionMentionRecommendViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final SYL v3() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZJ = LoadingFooterCell.class;
        c57939MoZ.LIZ = 5;
        c57939MoZ.LIZIZ = true;
        return c57939MoZ;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        SYL v3 = v3();
        v3.LLLF.LJZL(VideoCaptionMentionRecommendCell.class);
        v3.setItemAnimator(null);
        v3.LJIIJJI(new IDrS43S0100000_3(this, 2));
        C117054ib C3 = C3();
        Object value = this.LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-indexLabel>(...)");
        C3.setIndexLetterTv$mention_tag_release((TextView) value);
        C3.setOnLetterTouchListener$mention_tag_release(new InterfaceC117064ic() { // from class: X.8hZ
            @Override // X.InterfaceC117064ic
            public final void LIZ(int i) {
                C0A2 layoutManager = VideoCaptionMentionRecommendListAssem.this.v3().getLayoutManager();
                o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                C117054ib C32 = VideoCaptionMentionRecommendListAssem.this.C3();
                int i2 = 0;
                for (int i3 = 0; i3 < ((ArrayList) C32.LJZL).size() && i3 < i; i3++) {
                    i2 += ((Number) ListProtector.get(C32.LJZL, i3)).intValue();
                }
                linearLayoutManager.LJFF(i2, 0);
            }
        });
        AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.8hX
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C217998h1 c217998h1 = (C217998h1) obj;
                c217998h1.getClass();
                return C208708Ha.LIZLLL(c217998h1);
            }
        }, null, new AqS169S0100000_3(this, 245), new AqS153S0100000_3(this, 450), new AqS169S0100000_3(this, 246), 2, null);
        C8YN.LJII(this, this.LJLJI.getValue(), new TBT() { // from class: X.8he
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C218398hf) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 52), 4);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.8hW
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C217998h1) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), C218358hb.LJLIL, 4);
    }
}
