package com.ss.android.ugc.aweme.views;

import X.AbstractC43973HNp;
import X.AbstractViewOnClickListenerC55470Lpq;
import X.GT8;
import X.GT9;
import X.InterfaceC43977HNt;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;

/* loaded from: classes8.dex */
public class IDlS18S0200000_7 extends AbstractViewOnClickListenerC55470Lpq {
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
            default:
                super.LIZ(view);
                return;
        }
    }

    public static final void LIZ$0(IDlS18S0200000_7 iDlS18S0200000_7, View view) {
        InterfaceC43977HNt interfaceC43977HNt = ((AbstractC43973HNp) iDlS18S0200000_7.l0).LJLJJLL;
        if (interfaceC43977HNt != null) {
            interfaceC43977HNt.LIZ((MyMediaModel) iDlS18S0200000_7.l1);
        }
    }

    public static final void LIZ$1(IDlS18S0200000_7 iDlS18S0200000_7, View view) {
        GT9 gt9 = (GT9) iDlS18S0200000_7.l0;
        GT8 gt8 = gt9.LJLIL;
        if (gt8 != null) {
            gt8.LIZ(gt9.getAdapterPosition(), (View) iDlS18S0200000_7.l1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDlS18S0200000_7(AbstractC43973HNp abstractC43973HNp, MyMediaModel myMediaModel, int i) {
        super(600L);
        this.$t = i;
        this.l0 = abstractC43973HNp;
        this.l1 = myMediaModel;
    }

    public IDlS18S0200000_7(GT9 gt9, View view, int i) {
        this.$t = i;
        this.l0 = gt9;
        this.l1 = view;
    }
}
