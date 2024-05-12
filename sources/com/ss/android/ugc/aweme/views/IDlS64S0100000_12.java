package com.ss.android.ugc.aweme.views;

import X.AbstractViewOnClickListenerC55470Lpq;
import X.C32I;
import X.C3W5;
import X.C74499TLr;
import X.C76800UCe;
import X.DialogC73377Sqz;
import X.InterfaceC65784Pro;
import X.InterfaceC88474Ynu;
import X.TEA;
import X.TL1;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS60S1100000_7;

/* loaded from: classes13.dex */
public class IDlS64S0100000_12 extends AbstractViewOnClickListenerC55470Lpq {
    public final int $t;
    public Object l0;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDlS64S0100000_12(TL1 tl1, int i) {
        super(800L);
        this.$t = i;
        this.l0 = tl1;
    }

    public static final void LIZ$0(IDlS64S0100000_12 iDlS64S0100000_12, View view) {
        List<C3W5> value = ((DialogC73377Sqz) iDlS64S0100000_12.l0).LJJI().LIZIZ.getValue();
        if (value == null) {
            return;
        }
        AqS60S1100000_7 aqS60S1100000_7 = ((DialogC73377Sqz) iDlS64S0100000_12.l0).LJLL.LIZIZ;
        if (aqS60S1100000_7 != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(value, 10));
            Iterator<C3W5> it = value.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().LIZ);
            }
            aqS60S1100000_7.invoke(arrayList);
        }
        ((DialogC73377Sqz) iDlS64S0100000_12.l0).dismiss();
    }

    public static final void LIZ$1(IDlS64S0100000_12 iDlS64S0100000_12, View view) {
        TL1 tl1;
        DATA data;
        if (((TL1) iDlS64S0100000_12.l0).getAdapterPosition() != -1 && (data = (tl1 = (TL1) iDlS64S0100000_12.l0).LJLIL) != 0) {
            tl1.LJLJJL.invoke(data, Integer.valueOf(tl1.LJLJI), ((TL1) iDlS64S0100000_12.l0).LJLILLLLZI);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$2(IDlS64S0100000_12 iDlS64S0100000_12, View view) {
        InterfaceC88474Ynu<ProviderEffect, Integer, TEA, MyMediaModel, C76800UCe> interfaceC88474Ynu;
        C74499TLr c74499TLr = (C74499TLr) iDlS64S0100000_12.l0;
        ProviderEffect providerEffect = (ProviderEffect) c74499TLr.LJLIL;
        if (providerEffect != null && c74499TLr.N(providerEffect) && (interfaceC88474Ynu = c74499TLr.LJLJLJ) != null) {
            interfaceC88474Ynu.invoke(providerEffect, Integer.valueOf(c74499TLr.LJLJI), c74499TLr.LJLILLLLZI, c74499TLr.LJLLLL);
        }
    }

    public static final void LIZ$3(IDlS64S0100000_12 iDlS64S0100000_12, View view) {
        ((InterfaceC65784Pro) iDlS64S0100000_12.l0).invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDlS64S0100000_12(Object obj, int i) {
        super(600L);
        this.$t = i;
        this.l0 = obj;
    }

    public IDlS64S0100000_12(AqS159S0200000_12 aqS159S0200000_12, int i) {
        this.$t = i;
        this.l0 = aqS159S0200000_12;
    }
}
