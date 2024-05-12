package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C16880lQ;
import X.C214348b8;
import X.C240719cZ;
import X.C240999d1;
import X.C241299dV;
import X.C241309dW;
import X.C241319dX;
import X.C241329dY;
import X.C241339dZ;
import X.C61845OOz;
import X.C65351Pkp;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8XO;
import X.C8YN;
import X.C9BE;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.T5P;
import X.T5Q;
import X.TBT;
import Y.ACListenerS24S0100000_4;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.MusicCellCollectIconAssem;
import com.ss.android.ugc.aweme.music.vm.MusicCellCollectIconViewModel;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MusicCellCollectIconAssem extends ReusedUISlotAssem<MusicCellCollectIconAssem> implements C8XO<C240719cZ> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFZ;
    public T5P LLFF;
    public final InterfaceC115514g7 LLFFF;
    public final InterfaceC115514g7 LLFII;

    static {
        TBT tbt = new TBT(MusicCellCollectIconAssem.class, "collectIconViewModel", "getCollectIconViewModel()Lcom/ss/android/ugc/aweme/music/vm/MusicCellCollectIconViewModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLFZ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(MusicCellCollectIconAssem.class, "playViewModel", "getPlayViewModel()Lcom/ss/android/ugc/aweme/music/vm/MusicPlayViewModel;", 0, c65351Pkp)};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedAssem
    public final void F3() {
        C8YN.LJII(this, m4(), new TBT() { // from class: X.9dR
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C99K) obj).LJLIL);
            }
        }, null, C241319dX.LJLIL, 6);
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.c6g;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public MusicCellCollectIconAssem() {
        new LinkedHashMap();
        C240999d1 c240999d1 = C240999d1.LIZ;
        C241299dV c241299dV = C241299dV.LJLIL;
        C241309dW c241309dW = C241309dW.LJLIL;
        C65776Prg LIZ = C65352Pkq.LIZ(MusicCellCollectIconViewModel.class);
        this.LLFFF = C214348b8.LIZ(this, LIZ, c240999d1, new AqS154S0100000_4(LIZ, 435), null, C241329dY.INSTANCE, c241299dV, c241309dW);
        C9BE c9be = C9BE.LIZ;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 434);
        C65776Prg LIZ2 = C65352Pkq.LIZ(MusicPlayViewModel.class);
        this.LLFII = C214348b8.LIZ(this, LIZ2, c9be, new AqS154S0100000_4(LIZ2, 436), aqS154S0100000_4, C241339dZ.INSTANCE, null, null);
    }

    public final MusicCellCollectIconViewModel m4() {
        return (MusicCellCollectIconViewModel) this.LLFFF.LIZ(this, LLFZ[0]);
    }

    @Override // X.C8XO
    public final void F0(C240719cZ c240719cZ) {
        C240719cZ item = c240719cZ;
        o.LJIIIZ(item, "item");
        MusicCellCollectIconViewModel m4 = m4();
        String musicId = item.LJLIL.getMusicId();
        o.LJIIIIZZ(musicId, "item.musicModel.musicId");
        m4.getClass();
        m4.LJLILLLLZI = musicId;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(C240719cZ c240719cZ) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        T5P t5p = (T5P) view.findViewById(R.id.gqr);
        if (t5p != null) {
            t5p.setOnStateChangeListener(new T5Q() { // from class: X.9dU
                @Override // X.T5Q
                public final void LIZ() {
                }

                @Override // X.T5Q
                public final void LIZIZ(int i) {
                    if (i == 1) {
                        MusicCellCollectIconAssem.this.m4().setState(C241279dT.LJLIL);
                    }
                }
            });
            C16880lQ.LJJJLIIL(t5p, new ACListenerS24S0100000_4(this, 78));
        } else {
            t5p = null;
        }
        this.LLFF = t5p;
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(C240719cZ c240719cZ) {
    }
}
