package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.AqS37S0210000_5;

/* renamed from: X.UDh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class ViewOnClickListenerC76829UDh implements View.OnClickListener {
    public final /* synthetic */ InterfaceC88472Yns<EnumC32853Cuv, C76800UCe> LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ Context LJLJJI;
    public final /* synthetic */ GiftGuideMessage LJLJJL;

    public ViewOnClickListenerC76829UDh(AqS136S0200000_5 aqS136S0200000_5, AqS37S0210000_5 aqS37S0210000_5, long j, Context context, GiftGuideMessage giftGuideMessage) {
        this.LJLIL = aqS136S0200000_5;
        this.LJLILLLLZI = aqS37S0210000_5;
        this.LJLJI = j;
        this.LJLJJI = context;
        this.LJLJJL = giftGuideMessage;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.LJLIL.invoke(EnumC32853Cuv.SEND);
        this.LJLILLLLZI.invoke();
        C32689CsH.LIZ(this.LJLJJI, GiftManager.inst().getFastGift(this.LJLJI), "gift_education_popup", this.LJLJJL);
    }
}
