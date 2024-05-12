package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C2068389v;
import X.C214348b8;
import X.C240719cZ;
import X.C241229dO;
import X.C241759eF;
import X.C51029K0z;
import X.C65352Pkq;
import X.C65776Prg;
import X.C8YN;
import X.C9BE;
import X.EnumC241749eE;
import X.FMX;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.TBT;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.IDqS429S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MusicCellCoverAssem extends DefaultCoverAssem {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLI;
    public TuxIconView LLFFF;
    public EnumC241749eE LLFII;
    public final InterfaceC115514g7 LLFZ;

    static {
        TBT tbt = new TBT(MusicCellCoverAssem.class, "playViewModel", "getPlayViewModel()Lcom/ss/android/ugc/aweme/music/vm/MusicPlayViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLI = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultCoverAssem, com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.c6h;
    }

    public MusicCellCoverAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 437);
        C65776Prg LIZ = C65352Pkq.LIZ(MusicPlayViewModel.class);
        this.LLFZ = C214348b8.LIZ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 438), aqS154S0100000_4, C241229dO.INSTANCE, null, null);
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultCoverAssem, X.C8XO
    /* renamed from: F0 */
    public final /* bridge */ /* synthetic */ void q4(C240719cZ c240719cZ) {
        F0(c240719cZ);
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultCoverAssem
    /* renamed from: m4 */
    public final void F0(C240719cZ item) {
        String str;
        o.LJIIIZ(item, "item");
        super.F0(item);
        String musicId = item.LJLIL.getMusicId();
        InterfaceC115514g7 interfaceC115514g7 = this.LLFZ;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LLI;
        MusicModel musicModel = ((MusicPlayViewModel) interfaceC115514g7.LIZ(this, interfaceC74236TBoArr[0])).LJLJJI;
        if (musicModel != null) {
            str = musicModel.getMusicId();
        } else {
            str = null;
        }
        if (!o.LJ(musicId, str)) {
            n4(EnumC241749eE.DEFAULT);
        } else {
            n4(((MusicPlayViewModel) this.LLFZ.LIZ(this, interfaceC74236TBoArr[0])).LJLJJL);
        }
    }

    public final void n4(EnumC241749eE enumC241749eE) {
        if (this.LLFII == enumC241749eE) {
            return;
        }
        this.LLFII = enumC241749eE;
        TuxIconView tuxIconView = this.LLFFF;
        if (tuxIconView != null) {
            int i = C241759eF.LIZ[enumC241749eE.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = R.raw.icon_color_play;
                    c2068389v.LJ = Integer.valueOf(R.attr.dj);
                    tuxIconView.setTuxIcon(c2068389v);
                    tuxIconView.clearAnimation();
                    return;
                }
                Animation loadAnimation = AnimationUtils.loadAnimation(getContainerView().getContext(), R.anim.fc);
                loadAnimation.setInterpolator(new LinearInterpolator());
                C2068389v c2068389v2 = new C2068389v();
                c2068389v2.LIZ = R.raw.icon_spinner_normal;
                c2068389v2.LJ = Integer.valueOf(R.attr.dj);
                tuxIconView.setTuxIcon(c2068389v2);
                tuxIconView.startAnimation(loadAnimation);
                return;
            }
            C2068389v c2068389v3 = new C2068389v();
            c2068389v3.LIZ = R.raw.icon_pause_fill1;
            c2068389v3.LJ = Integer.valueOf(R.attr.dj);
            tuxIconView.setTuxIcon(c2068389v3);
            tuxIconView.clearAnimation();
            MobClick obtain = MobClick.obtain();
            obtain.setEventName("music_play");
            obtain.setLabelName("personal_homepage_list");
            obtain.setValue(((C240719cZ) C51029K0z.LJIILLIIL(this)).LJLIL.getMusicId());
            FMX.onEvent(obtain);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultCoverAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LLFFF = (TuxIconView) view.findViewById(R.id.gqu);
        C8YN.LJIIJ(this, (AssemViewModel) this.LLFZ.LIZ(this, LLI[0]), new TBT() { // from class: X.9dM
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C240839cl) obj).LJLIL;
            }
        }, new TBT() { // from class: X.9dN
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C240839cl) obj).LJLILLLLZI;
            }
        }, null, new IDqS429S0100000_4(this, 6), 12);
    }
}
