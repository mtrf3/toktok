package com.ss.android.ugc.aweme.favorites.business.collection.assem;

import X.ActivityC45651qj;
import X.C0A6;
import X.C16880lQ;
import X.C192047gG;
import X.C192247ga;
import X.C192287ge;
import X.C192307gg;
import X.C212428Vi;
import X.C214298b3;
import X.C221108m2;
import X.C32151Nz;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C76732zl;
import X.C78926UyI;
import X.C7MY;
import X.C99W;
import X.C9BE;
import X.Q8U;
import X.SY4;
import X.TBT;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS49S0400000_3;
import kotlin.jvm.internal.AqS7S0600000_3;
import kotlin.jvm.internal.o;
import q03.IDaS199S0200000_3;
import q03.IDaS483S0100000_3;

/* loaded from: classes4.dex */
public final class CollectionContentManageAssem extends UIContentAssem {
    public final C55749LuL LJLIL;
    public final C55749LuL LJLILLLLZI;
    public final C214298b3 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;

    public CollectionContentManageAssem() {
        new LinkedHashMap();
        this.LJLIL = new C55749LuL(C47704Ins.LIZJ(this, CollectionDetail.class, null), checkSupervisorPrepared());
        this.LJLILLLLZI = new C55749LuL(C47704Ins.LJ(this, C192047gG.class, null), checkSupervisorPrepared());
        C9BE c9be = C9BE.LIZ;
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 248);
        C65776Prg LIZ = C65352Pkq.LIZ(VideoCollectionContentViewModel.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 252), C192287ge.INSTANCE, aqS153S0100000_3);
        this.LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 249));
        this.LJLJJL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 251));
    }

    public final VideoCollectionContentViewModel v3() {
        return (VideoCollectionContentViewModel) this.LJLJI.getValue();
    }

    public final CollectionDetail x3() {
        return (CollectionDetail) this.LJLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        String str2;
        String string;
        TextView textView = (TextView) C7MY.LIZLLL(view, "view", R.id.jmq, "view.findViewById(R.id.selected_video_view)");
        View findViewById = view.findViewById(R.id.bh0);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.collect_detail)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(R.id.gd1);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.manage_operate_view)");
        View findViewById3 = view.findViewById(R.id.hbp);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.operate_move_view)");
        SY4 sy4 = (SY4) findViewById3;
        View findViewById4 = view.findViewById(R.id.hbq);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.operate_remove_view)");
        SY4 sy42 = (SY4) findViewById4;
        View findViewById5 = view.findViewById(R.id.aeg);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.back)");
        View findViewById6 = view.findViewById(R.id.gvs);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.name)");
        final TextView textView2 = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.b3n);
        o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.cancel)");
        TextView textView3 = (TextView) findViewById7;
        final View findViewById8 = view.findViewById(R.id.ebz);
        o.LJIIIIZZ(findViewById8, "view.findViewById(R.id.icon_manage)");
        View findViewById9 = view.findViewById(R.id.ec0);
        o.LJIIIIZZ(findViewById9, "view.findViewById(R.id.icon_more)");
        View findViewById10 = view.findViewById(R.id.kf_);
        o.LJIIIIZZ(findViewById10, "view.findViewById(R.id.status_view)");
        C73305Spp c73305Spp = (C73305Spp) findViewById10;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ == null) {
            return;
        }
        final float LJIIZILJ = C32151Nz.LJIIZILJ(Integer.valueOf(LiveTryModeCountDownThresholdSetting.DEFAULT));
        final C76732zl c76732zl = new C76732zl();
        recyclerView.LJIIJJI(new C0A6() { // from class: X.7gc
            @Override // X.C0A6
            public final void LJIILL(RecyclerView recyclerView2, int i, int i2) {
                float f;
                boolean z;
                o.LJIIIZ(recyclerView2, "recyclerView");
                C76732zl c76732zl2 = C76732zl.this;
                int i3 = c76732zl2.element + i2;
                c76732zl2.element = i3;
                float f2 = i3;
                float f3 = LJIIZILJ;
                if (f2 > f3) {
                    f = 1.0f;
                } else {
                    f = f2 / f3;
                }
                findViewById8.setAlpha(f);
                View view2 = findViewById8;
                if (f > 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                view2.setEnabled(z);
                textView2.setAlpha(f);
            }
        });
        C16880lQ.LJIIJ(new IDaS483S0100000_3(LIZ, 4, 42, 42), findViewById5);
        C16880lQ.LJIIJ(new IDaS483S0100000_3(this, 5, 42, 42), findViewById8);
        C16880lQ.LJIIJ(new IDaS483S0100000_3(this, 6, 42, 42), textView3);
        Context context = getContext();
        if (context != null && (string = context.getString(R.string.gc0)) != null) {
            str = Q8U.LIZIZ(new Object[]{CardStruct.IStatusCode.DEFAULT}, 1, string, "format(this, *args)");
        } else {
            str = null;
        }
        textView.setText(str);
        C16880lQ.LJIIJ(new IDaS199S0200000_3(LIZ, this, 0), sy4);
        if (C99W.LIZ) {
            sy42.setButtonVariant(5);
            sy4.setButtonVariant(5);
        }
        C16880lQ.LJIIJ(new IDaS483S0100000_3(this, 7, 42, 42), sy42);
        C16880lQ.LJIIJ(new IDaS483S0100000_3(this, 8, 42, 42), findViewById9);
        C192047gG c192047gG = (C192047gG) this.LJLILLLLZI.getValue();
        if (c192047gG == null || (str2 = c192047gG.LJLJI) == null || str2.length() == 0 || C192307gg.LIZ()) {
            ((TuxIconView) findViewById9).setIconRes(R.raw.icon_arrow_turn_up_right);
        } else {
            ((TuxIconView) findViewById9).setIconRes(R.raw.icon_ellipsis_vertical);
        }
        Context context2 = c73305Spp.getContext();
        AssemViewModel.asyncSubscribe$default(v3(), new TBT() { // from class: X.7gb
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C192027gE) obj).LJLIL;
            }
        }, null, new AqS49S0400000_3(findViewById9, c73305Spp, context2, this, 7), new AqS153S0100000_3(c73305Spp, LiveCoverMinSizeSetting.DEFAULT), new AqS134S0200000_3(this, textView2, 67), 2, null);
        AssemViewModel.asyncSubscribe$default(v3(), new TBT() { // from class: X.7gd
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C192027gE) obj).LJLILLLLZI;
            }
        }, null, new AqS134S0200000_3(c73305Spp, context2, this, 68), new AqS7S0600000_3(c73305Spp, findViewById8, findViewById5, findViewById9, textView3, findViewById2, 2), new C192247ga(this, c73305Spp, context2, findViewById8, textView2, textView, findViewById5, findViewById9, textView3, findViewById2, sy4, sy42, recyclerView, LIZ), 2, null);
    }
}
