package com.ss.android.ugc.aweme.views;

import X.AbstractViewOnClickListenerC55470Lpq;
import X.C141585h4;
import X.C1536261e;
import X.C1536461g;
import X.C60903NvH;
import X.C62N;
import X.C78915Uy7;
import X.InterfaceC141575h3;
import X.OQN;
import android.view.View;
import com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverFragment;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class IDlS17S0200000_2 extends AbstractViewOnClickListenerC55470Lpq {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC55470Lpq
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            case 2:
                LIZ$2(this, view);
                return;
            case 3:
                LIZ$3(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    public static final void LIZ$0(IDlS17S0200000_2 iDlS17S0200000_2, View view) {
        C60903NvH.LJIIJJI().LJFF().LJFF(new AqS168S0100000_2((FTCChooseCoverFragment) iDlS17S0200000_2.l1, 68), !OQN.LJIIIIZZ(((VideoPublishEditModel) iDlS17S0200000_2.l0).mVideoCoverStartTm, ((FTCChooseCoverFragment) iDlS17S0200000_2.l1).LJLILLLLZI / 1000.0f));
    }

    public static final void LIZ$1(IDlS17S0200000_2 iDlS17S0200000_2, View view) {
        ((C62N) iDlS17S0200000_2.l0).LLJILJIL().A7(((C1536461g) iDlS17S0200000_2.l1).LIZ);
    }

    public static final void LIZ$2(IDlS17S0200000_2 iDlS17S0200000_2, View view) {
        C1536261e c1536261e = (C1536261e) iDlS17S0200000_2.l0;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(((CharSequence) iDlS17S0200000_2.l1).toString());
        creativeToastBuilder.duration(3000L);
        C78915Uy7.LJJIJ(c1536261e, 1037, creativeToastBuilder);
    }

    public static final void LIZ$3(IDlS17S0200000_2 iDlS17S0200000_2, View v) {
        boolean z;
        o.LJIIIZ(v, "v");
        C141585h4 c141585h4 = (C141585h4) iDlS17S0200000_2.l0;
        if (c141585h4.LJLJL == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c141585h4.LIZJ(2, false);
            ((InterfaceC141575h3) iDlS17S0200000_2.l1).Jc();
            ((C141585h4) iDlS17S0200000_2.l0).setSelectedView(true);
        }
        C141585h4 c141585h42 = (C141585h4) iDlS17S0200000_2.l0;
        if (c141585h42.LJLIL == 2) {
            ((InterfaceC141575h3) iDlS17S0200000_2.l1).Pc(c141585h42.LJLJL);
        }
        C141585h4 c141585h43 = (C141585h4) iDlS17S0200000_2.l0;
        if (c141585h43.LJLIL == 0) {
            c141585h43.LIZJ(2, false);
            ((InterfaceC141575h3) iDlS17S0200000_2.l1).c2(((C141585h4) iDlS17S0200000_2.l0).LJLJL);
        }
        C141585h4 c141585h44 = (C141585h4) iDlS17S0200000_2.l0;
        if (c141585h44.LJLIL == 1) {
            ((InterfaceC141575h3) iDlS17S0200000_2.l1).c2(c141585h44.LJLJL);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDlS17S0200000_2(C1536261e c1536261e, CharSequence charSequence, int i) {
        super(600L);
        this.$t = i;
        this.l0 = c1536261e;
        this.l1 = charSequence;
    }

    public IDlS17S0200000_2(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
