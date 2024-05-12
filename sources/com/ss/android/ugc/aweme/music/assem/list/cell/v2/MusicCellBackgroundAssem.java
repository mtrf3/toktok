package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C214348b8;
import X.C240639cR;
import X.C240719cZ;
import X.C241789eI;
import X.C26338AVi;
import X.C51029K0z;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78983UzD;
import X.C79045V0n;
import X.C7MI;
import X.C8YN;
import X.C9BE;
import X.InterfaceC115514g7;
import X.InterfaceC74236TBo;
import X.T28;
import X.TBT;
import X.W5U;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.music.vm.MusicHighlightBackgroundViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MusicCellBackgroundAssem extends DefaultBackgroundAssem {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFZ;
    public View LLFFF;
    public final InterfaceC115514g7 LLFII;

    static {
        TBT tbt = new TBT(MusicCellBackgroundAssem.class, "highlightBackgroundViewModel", "getHighlightBackgroundViewModel()Lcom/ss/android/ugc/aweme/music/vm/MusicHighlightBackgroundViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLFZ = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultBackgroundAssem, com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.c6f;
    }

    public MusicCellBackgroundAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 430);
        C65776Prg LIZ = C65352Pkq.LIZ(MusicHighlightBackgroundViewModel.class);
        this.LLFII = C214348b8.LIZ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 431), aqS154S0100000_4, C241789eI.INSTANCE, null, null);
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultBackgroundAssem
    public final void m4(C240639cR musicItemModel) {
        Integer LJI;
        o.LJIIIZ(musicItemModel, "musicItemModel");
        int i = 0;
        if (musicItemModel.LJLILLLLZI) {
            MusicModel musicModel = ((C240719cZ) C51029K0z.LJIILLIIL(this)).LJLIL;
            if (!TextUtils.isEmpty(musicModel.getPicPremium())) {
                MusicHighlightBackgroundViewModel musicHighlightBackgroundViewModel = (MusicHighlightBackgroundViewModel) this.LLFII.LIZ(this, LLFZ[0]);
                String picPremium = musicModel.getPicPremium();
                o.LJIIIIZZ(picPremium, "musicModel.picPremium");
                musicHighlightBackgroundViewModel.getClass();
                W5U.LJIIIIZZ(picPremium).LJIIIZ((C7MI) musicHighlightBackgroundViewModel.LJLIL.getValue());
                return;
            }
            if (TextUtils.isEmpty(musicModel.getPicBig())) {
                return;
            }
            MusicHighlightBackgroundViewModel musicHighlightBackgroundViewModel2 = (MusicHighlightBackgroundViewModel) this.LLFII.LIZ(this, LLFZ[0]);
            String picBig = musicModel.getPicBig();
            o.LJIIIIZZ(picBig, "musicModel.picBig");
            musicHighlightBackgroundViewModel2.getClass();
            W5U.LJIIIIZZ(picBig).LJIIIZ((C7MI) musicHighlightBackgroundViewModel2.LJLIL.getValue());
            return;
        }
        if (musicItemModel.LJLJLLL) {
            return;
        }
        if (musicItemModel.LJLJI) {
            C78983UzD.LJJLIIIJL(Y3());
            C26338AVi.LJI(Y3(), 0, 0, 0, 0, false, 16);
            View view = this.LLFFF;
            if (view != null) {
                C78983UzD.LJJIL(view);
            }
            View view2 = this.LLFF;
            if (view2 == null) {
                return;
            }
            GradientDrawable LIZIZ = T28.LIZIZ(0);
            Context context = getContext();
            if (context != null && (LJI = C79045V0n.LJI(R.attr.ck, context)) != null) {
                i = LJI.intValue();
            }
            LIZIZ.setColor(i);
            view2.setBackground(LIZIZ);
            return;
        }
        C78983UzD.LJJIL(Y3());
        View view3 = this.LLFFF;
        if (view3 == null) {
            return;
        }
        C78983UzD.LJJIL(view3);
    }

    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultBackgroundAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LLFFF = view.findViewById(R.id.gr4);
        C8YN.LJII(this, (AssemViewModel) this.LLFII.LIZ(this, LLFZ[0]), new TBT() { // from class: X.9eJ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C1807277k) obj).LJLIL;
            }
        }, null, new AqS186S0100000_4(this, 118), 6);
    }
}
