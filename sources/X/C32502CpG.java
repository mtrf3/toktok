package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftFirstGiftTipsSettings;
import com.bytedance.android.livesdk.livesetting.level.UserLevelEnableSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftGoalBannerEnabledSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.event.LiveCurrentGoalGlobalData;
import com.bytedance.android.livesdkapi.depend.event.LiveGoalDeleteEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.List;
import kotlin.jvm.internal.AqS109S0300000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.CpG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32502CpG {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ() {
        Long l;
        C0NB.LJIIIZ("LiveGoalUtils", "clearCurrentGoalData");
        C32515CpT c32515CpT = LIZIZ().LIZ;
        if (c32515CpT != null) {
            l = Long.valueOf(c32515CpT.LJLIL);
        } else {
            l = null;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.tv0(LiveCurrentGoalGlobalData.class, new C32477Cor(null, null));
        dataChannelGlobal.sv0(LiveGoalDeleteEvent.class, l);
    }

    public static C32477Cor LIZIZ() {
        C32477Cor c32477Cor = (C32477Cor) DataChannelGlobal.LJLJJI.mv0(LiveCurrentGoalGlobalData.class);
        if (c32477Cor == null) {
            return new C32477Cor(null, null);
        }
        return c32477Cor;
    }

    public static void LIZJ(long j, long j2, long j3) {
        Long l;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("setGoalGetInfo ");
        LIZ2.append(j);
        LIZ2.append(' ');
        LIZ2.append(j2);
        LIZ2.append(' ');
        LIZ2.append(j3);
        C0NB.LJIIIZ("LiveGoalUtils", X1D.LIZIZ(LIZ2));
        C32515CpT c32515CpT = LIZIZ().LIZ;
        if (c32515CpT != null) {
            l = Long.valueOf(c32515CpT.LJLIL);
        } else {
            l = null;
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        dataChannelGlobal.tv0(LiveCurrentGoalGlobalData.class, new C32477Cor(new C32515CpT(j, j2, j3), LIZIZ().LIZIZ));
        if (l == null || j != l.longValue()) {
            dataChannelGlobal.sv0(LiveGoalDeleteEvent.class, l);
        }
    }

    public static boolean LIZLLL(AbstractC32698CsQ abstractC32698CsQ, DataChannel dataChannel, boolean z) {
        Long l;
        Long l2;
        Object obj;
        Gift gift;
        Object obj2;
        List<GiftColorInfo> list;
        long j;
        long j2;
        Object obj3;
        EnumC32508CpM enumC32508CpM;
        Long l3;
        C32496CpA bannerBoxInfo;
        C32697CsP c32697CsP;
        C29800Bmm gr;
        boolean z2;
        boolean z3;
        Room room;
        Gift gift2;
        Long l4 = null;
        if (abstractC32698CsQ != null) {
            l = Long.valueOf(abstractC32698CsQ.LIZJ());
        } else {
            l = null;
        }
        C32515CpT c32515CpT = LIZIZ().LIZ;
        if (c32515CpT != null) {
            l2 = Long.valueOf(c32515CpT.LJLIL);
        } else {
            l2 = null;
        }
        boolean LJ = o.LJ(l, l2);
        EnumC32508CpM.Companion.getClass();
        if (abstractC32698CsQ != null) {
            obj = abstractC32698CsQ.LIZIZ;
        } else {
            obj = null;
        }
        if (obj instanceof Gift) {
            gift = (Gift) obj;
        } else {
            gift = null;
        }
        if (abstractC32698CsQ != null) {
            obj2 = abstractC32698CsQ.LIZIZ;
        } else {
            obj2 = null;
        }
        if ((obj2 instanceof Gift) && (gift2 = (Gift) obj2) != null) {
            list = gift2.colorInfos;
        } else {
            list = null;
        }
        if (dataChannel != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        if (list == null || list.isEmpty() || list.size() <= 1) {
            if (C31120CJg.LJIIIZ() && abstractC32698CsQ != null && C31120CJg.LJIIJJI() == abstractC32698CsQ.LIZJ()) {
                enumC32508CpM = EnumC32508CpM.MATCH_ONLY;
            } else {
                C32313CmD c32313CmD = AbstractC32320CmK.LIZ;
                if (abstractC32698CsQ != null) {
                    j2 = abstractC32698CsQ.LIZJ();
                } else {
                    j2 = -1;
                }
                if (c32313CmD.LJIIZILJ(j2)) {
                    enumC32508CpM = EnumC32508CpM.FIRST_RECHARGE;
                } else if (abstractC32698CsQ != null && ((abstractC32698CsQ.LJIIJ() || (abstractC32698CsQ.LJIIJJI() && (gr = ((IUserLevelService) CN1.LIZ(IUserLevelService.class)).gr()) != null && gr.LJFF == 2)) && !C29306Beo.LJIIJ(dataChannel) && UserLevelEnableSetting.INSTANCE.getValue())) {
                    enumC32508CpM = EnumC32508CpM.USER_LEVEL;
                } else {
                    if (gift == null || gift.giftPanelBanner == null) {
                        if (abstractC32698CsQ != null) {
                            obj3 = abstractC32698CsQ.LIZIZ;
                        } else {
                            obj3 = null;
                        }
                        if (!(obj3 instanceof C32697CsP) || (c32697CsP = (C32697CsP) obj3) == null || c32697CsP.LJIIIIZZ == null) {
                            if (gift != null) {
                                if (gift.randomEffectInfo != null) {
                                    enumC32508CpM = EnumC32508CpM.RANDOM_BANNER;
                                } else if (gift != null && gift.canPutInGiftBox && C32483Cox.LIZ(gift, j) && gift.isBoxGift && o.LJ(InterfaceC30442Bx8.P1.LIZ(), Boolean.TRUE) && LiveGiftFirstGiftTipsSettings.INSTANCE.getValue() == 1 && ((bannerBoxInfo = GiftManager.inst().getBannerBoxInfo()) == null || !bannerBoxInfo.LIZ)) {
                                    enumC32508CpM = EnumC32508CpM.FIRST_GIFT;
                                }
                            }
                            if (LiveGiftGoalBannerEnabledSetting.INSTANCE.getValue()) {
                                C32515CpT c32515CpT2 = LIZIZ().LIZ;
                                if (c32515CpT2 != null) {
                                    l3 = Long.valueOf(c32515CpT2.LJLIL);
                                } else {
                                    l3 = null;
                                }
                                if (abstractC32698CsQ != null) {
                                    l4 = Long.valueOf(abstractC32698CsQ.LIZJ());
                                }
                                if (o.LJ(l3, l4)) {
                                    enumC32508CpM = EnumC32508CpM.GOAL_GIFT;
                                }
                            }
                            enumC32508CpM = EnumC32508CpM.DEFAULT;
                        }
                    }
                    enumC32508CpM = EnumC32508CpM.LYNX_BANNER;
                }
            }
        } else {
            enumC32508CpM = EnumC32508CpM.COLOR_BANNER;
        }
        if (enumC32508CpM == EnumC32508CpM.GOAL_GIFT) {
            z2 = true;
        } else {
            z2 = false;
        }
        C32476Coq c32476Coq = LIZIZ().LIZIZ;
        if (c32476Coq != null && c32476Coq.LIZ != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (LiveGiftGoalBannerEnabledSetting.INSTANCE.getValue() && LJ && ((z2 || z) && z3)) {
            return true;
        }
        return false;
    }

    public static void LJ(LifecycleOwner owner, RecyclerView recyclerView, DataChannel dataChannel, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(owner, "owner");
        if (LiveGiftGoalBannerEnabledSetting.INSTANCE.getValue()) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            dataChannelGlobal.nv0(owner, owner, LiveGoalDeleteEvent.class, new AqS109S0300000_5(recyclerView, (RecyclerView) dataChannel, (DataChannel) interfaceC88472Yns, (InterfaceC88472Yns<? super Long, Integer>) 4));
            dataChannelGlobal.nv0(owner, owner, LiveCurrentGoalGlobalData.class, new AqS109S0300000_5(recyclerView, (RecyclerView) dataChannel, (DataChannel) interfaceC88472Yns, (InterfaceC88472Yns<? super Long, Integer>) 5));
        }
    }

    public static void LJFF(RecyclerView recyclerView, DataChannel dataChannel, Long l, InterfaceC88472Yns interfaceC88472Yns) {
        RecyclerView.ViewHolder LJJIZ;
        Integer num = (Integer) interfaceC88472Yns.invoke(l);
        if (num != null && num.intValue() >= 0) {
            int intValue = num.intValue();
            if (recyclerView != null && (LJJIZ = recyclerView.LJJIZ(intValue)) != null) {
                if (LJJIZ instanceof AbstractC32678Cs6) {
                    ((AbstractC32678Cs6) LJJIZ).V(dataChannel);
                } else {
                    if (!(LJJIZ instanceof AbstractC32677Cs5)) {
                        return;
                    }
                    ((AbstractC32677Cs5) LJJIZ).Q();
                }
            }
        }
    }
}
