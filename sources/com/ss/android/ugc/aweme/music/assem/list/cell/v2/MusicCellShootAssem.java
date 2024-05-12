package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C16880lQ;
import X.C214298b3;
import X.C240719cZ;
import X.C241689e8;
import X.C241699e9;
import X.C241709eA;
import X.C32151Nz;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C78983UzD;
import X.C8XO;
import X.C8YN;
import X.C99W;
import X.C9BE;
import X.EnumC241749eE;
import X.OUP;
import X.SY4;
import X.TBT;
import Y.ACListenerS24S0100000_4;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MusicCellShootAssem extends ReusedUISlotAssem<MusicCellShootAssem> implements C8XO<C240719cZ> {
    public SY4 LLFF;
    public EnumC241749eE LLFFF;
    public final C214298b3 LLFII;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.c6m;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public MusicCellShootAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 448);
        C65776Prg LIZ = C65352Pkq.LIZ(MusicPlayViewModel.class);
        this.LLFII = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 449), C241699e9.INSTANCE, aqS154S0100000_4);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(C240719cZ c240719cZ) {
        String str;
        C240719cZ item = c240719cZ;
        o.LJIIIZ(item, "item");
        String musicId = item.LJLIL.getMusicId();
        MusicModel musicModel = ((MusicPlayViewModel) this.LLFII.getValue()).LJLJJI;
        if (musicModel != null) {
            str = musicModel.getMusicId();
        } else {
            str = null;
        }
        if (!o.LJ(musicId, str)) {
            m4(EnumC241749eE.DEFAULT);
        } else {
            m4(((MusicPlayViewModel) this.LLFII.getValue()).LJLJJL);
        }
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C240719cZ c240719cZ) {
        return true;
    }

    public final void m4(EnumC241749eE enumC241749eE) {
        if (this.LLFFF == enumC241749eE) {
            return;
        }
        this.LLFFF = enumC241749eE;
        SY4 sy4 = this.LLFF;
        if (sy4 != null) {
            if (C99W.LIZ) {
                OUP.LJJJJLI(sy4, Float.valueOf(C32151Nz.LJIIZILJ(8)), null, null, 30);
            }
            int i = C241709eA.LIZ[enumC241749eE.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                C78983UzD.LJJIL(sy4);
                return;
            }
            C78983UzD.LJJLIIIJL(sy4);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        SY4 sy4 = (SY4) view.findViewById(R.id.gr_);
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS24S0100000_4(this, 84));
        } else {
            sy4 = null;
        }
        this.LLFF = sy4;
        C8YN.LJIIJ(this, (AssemViewModel) this.LLFII.getValue(), new TBT() { // from class: X.9e2
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C240839cl) obj).LJLIL;
            }
        }, new TBT() { // from class: X.9e3
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C240839cl) obj).LJLILLLLZI;
            }
        }, null, C241689e8.LJLIL, 12);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C240719cZ c240719cZ) {
    }
}
