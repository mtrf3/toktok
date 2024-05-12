package X;

import Y.IDComparatorS33S0000000_5;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.gift.GiftPanelBannerUpdate;
import com.bytedance.android.livesdk.gift.model.GiftHintInfo;
import com.bytedance.android.livesdk.gift.model.GiftHintRequest;
import com.bytedance.android.livesdk.hints.GiftHintsManager;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftFirstGiftTipsSettings;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterEducationSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import fjb.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.hints.GiftHintsManager$tryFetchHints$1", f = "GiftHintsManager.kt", l = {63}, m = "invokeSuspend")
/* renamed from: X.Cr0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32610Cr0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ LifecycleOwner LJLJI;
    public final /* synthetic */ GiftHintsManager LJLJJI;
    public final /* synthetic */ DataChannel LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32610Cr0(LifecycleOwner lifecycleOwner, GiftHintsManager giftHintsManager, DataChannel dataChannel, InterfaceC67352kd<? super C32610Cr0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = giftHintsManager;
        this.LJLJJL = dataChannel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C32610Cr0 c32610Cr0 = new C32610Cr0(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c32610Cr0.LJLILLLLZI = obj;
        return c32610Cr0;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Integer valueOf;
        List<GiftHintInfo> list;
        boolean z;
        LifecycleCoroutineScope lifecycleScope;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            GiftHintsManager.LJLIL.getClass();
            CHF[] values = CHF.values();
            ArrayList arrayList = new ArrayList();
            for (CHF chf : values) {
                if (chf.shouldShow() && (valueOf = Integer.valueOf(chf.getHintId())) != null) {
                    arrayList.add(valueOf);
                }
            }
            if (!arrayList.isEmpty()) {
                T2R.LJIIL(this.LJLJI, this.LJLJJI);
                GiftHintRequest giftHintRequest = new GiftHintRequest();
                giftHintRequest.hintIds = arrayList;
                GiftHintsManager.LJLILLLLZI = true;
                GiftHintsManager giftHintsManager = GiftHintsManager.LJLIL;
                this.LJLIL = 1;
                obj = giftHintsManager.LIZ(giftHintRequest, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                return C76800UCe.LIZ;
            }
        }
        Iterable iterable = (Iterable) obj;
        if (iterable != null) {
            list = ORZ.LLILII(new IDComparatorS33S0000000_5(10), iterable);
        } else {
            list = null;
        }
        GiftHintsManager.LJLILLLLZI = false;
        if (list != null) {
            z = true;
        } else {
            z = false;
        }
        GiftHintsManager.LJLJI = z;
        if (list != null) {
            DataChannel dataChannel = this.LJLJJL;
            LifecycleOwner lifecycleOwner = this.LJLJI;
            for (GiftHintInfo giftHintInfo : list) {
                if (giftHintInfo.hintId == CHF.RANDOM_FIREWORKS.getHintId() || giftHintInfo.hintId == CHF.FANS_CLUB_JOIN_GIFT.getHintId()) {
                    GiftHintsManager.LJLIL.getClass();
                    String str = giftHintInfo.hintText;
                    if (str != null && str.length() != 0) {
                        long j = giftHintInfo.hintShowDelayMs;
                        if (j < 0) {
                            j = 0;
                        }
                        AqS155S0100000_5 aqS155S0100000_5 = new AqS155S0100000_5(giftHintInfo, 378);
                        AbstractC78621UtN dispatcher = C36636EZk.LIZ;
                        o.LJIIIZ(dispatcher, "dispatcher");
                        if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
                            XKX.LIZLLL(lifecycleScope, dispatcher, null, new C62882dQ(j, aqS155S0100000_5, null), 2);
                        }
                    }
                }
                if (giftHintInfo.hintId == CHF.FIRST_GIFT_TIPS.getHintId()) {
                    if (LiveGiftFirstGiftTipsSettings.INSTANCE.getValue() == 1) {
                        InterfaceC30442Bx8.P1.LIZJ(Boolean.valueOf(!giftHintInfo.hasGiftHistory));
                        dataChannel.pv0(GiftPanelBannerUpdate.class);
                    }
                    EnumC32660Cro.Companion.getClass();
                    LiveGiftNewGifterEducationSetting.NewGifterConfig value = LiveGiftNewGifterEducationSetting.INSTANCE.getValue();
                    if ((value != null && value.speedGiftPopupLogicOptEnable) || C32659Crn.LIZJ()) {
                        InterfaceC30442Bx8.P1.LIZJ(Boolean.valueOf(!giftHintInfo.hasGiftHistory));
                    }
                    C32569CqL.LIZ = giftHintInfo.hasGiftHistory;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
