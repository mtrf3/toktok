package com.ss.android.ugc.aweme.mention.ui.assem;

import X.C184077Kh;
import X.C213688a4;
import X.C214298b3;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C218368hc;
import X.C218428hi;
import X.C218458hl;
import X.C218468hm;
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
import X.InterfaceC65784Pro;
import X.SYL;
import X.T3D;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.mention.ui.cell.VideoCaptionMentionSearchCell;
import com.ss.android.ugc.aweme.mention.viewmodel.VideoCaptionMentionSearchViewModel;
import com.ss.android.ugc.aweme.mention.viewmodel.VideoCaptionMentionStateViewModel;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoCaptionMentionSearchListAssem extends UIListContentAssem<VideoCaptionMentionSearchViewModel> {
    public final C62822Ol8 LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final C214378bB LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public boolean LJLJLLL;
    public T3D LJLL;

    public VideoCaptionMentionSearchListAssem() {
        InterfaceC65784Pro LJIILJJIL;
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 458));
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoCaptionMentionSearchViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 461), C218458hl.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(VideoCaptionMentionStateViewModel.class);
        C218428hi c218428hi = C218428hi.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS153S0100000_3((C8W0) this, 462);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLJI = new C214378bB(LIZ2, null, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c218428hi, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
        this.LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 463));
        this.LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 460));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 457));
        this.LJLJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 456));
        this.LJLJLJ = C221108m2.LIZIZ(C218468hm.LJLIL);
    }

    public final C73305Spp C3() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-statusView>(...)");
        return (C73305Spp) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: E3, reason: merged with bridge method [inline-methods] */
    public final VideoCaptionMentionSearchViewModel A3() {
        return (VideoCaptionMentionSearchViewModel) this.LJLILLLLZI.getValue();
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
        c57939MoZ.LIZ = 5;
        c57939MoZ.LIZJ = LoadingFooterCell.class;
        c57939MoZ.LIZIZ = false;
        return c57939MoZ;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        SYL v3 = v3();
        v3.LLLF.LJZL(VideoCaptionMentionSearchCell.class);
        v3.setItemAnimator(null);
        AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.8hj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C218018h3 c218018h3 = (C218018h3) obj;
                c218018h3.getClass();
                return C208708Ha.LIZLLL(c218018h3);
            }
        }, null, new AqS169S0100000_3(this, 247), new AqS153S0100000_3(this, 459), new AqS169S0100000_3(this, 248), 2, null);
        AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.8hk
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C218018h3 c218018h3 = (C218018h3) obj;
                c218018h3.getClass();
                return C208708Ha.LIZJ(c218018h3);
            }
        }, null, null, null, new AqS169S0100000_3(this, 249), 14, null);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.8hY
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C218018h3) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), C218368hc.LJLIL, 4);
        C8YN.LJII(this, this.LJLJI.getValue(), new TBT() { // from class: X.8hg
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C218398hf) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 53), 4);
    }
}
