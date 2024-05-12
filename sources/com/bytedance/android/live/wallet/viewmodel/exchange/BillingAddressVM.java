package com.bytedance.android.live.wallet.viewmodel.exchange;

import X.C73318Sq2;
import X.C77453UaX;
import X.C77554UcA;
import X.InterfaceC77468Uam;
import X.InterfaceC77552Uc8;
import android.content.Context;
import com.bytedance.android.live.wallet.viewmodel.exchange.base.ExchangeFirstStageVM;
import com.bytedance.android.livesdk.livesetting.other.LiveExchangeCancelLimit;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public abstract class BillingAddressVM extends ExchangeFirstStageVM {
    public final InterfaceC77552Uc8 LJLJLLL;
    public final Context LJLL;
    public final C77453UaX LJLLI;
    public final InterfaceC77468Uam LJLLILLLL;
    public final C73318Sq2 LJLLJ;
    public C77554UcA LJLLL;
    public boolean LJLLLL;

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public boolean iv0() {
        return false;
    }

    @Override // com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM
    public boolean jv0() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingAddressVM(InterfaceC77552Uc8 view, Context context, C77453UaX liveExchangeParam, InterfaceC77468Uam interfaceC77468Uam) {
        super(context, view);
        o.LJIIIZ(view, "view");
        o.LJIIIZ(liveExchangeParam, "liveExchangeParam");
        this.LJLJLLL = view;
        this.LJLL = context;
        this.LJLLI = liveExchangeParam;
        this.LJLLILLLL = interfaceC77468Uam;
        LiveExchangeCancelLimit.INSTANCE.getValue();
        this.LJLLJ = new C73318Sq2();
    }
}
