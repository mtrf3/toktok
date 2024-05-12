package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.gift.GiftSelectedChangeEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.guide.model.GuideInfoResponse;
import com.bytedance.android.livesdk.livesetting.performance.LiveComboLargeClickableAreaSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftLockInfo;
import com.bytedance.android.livesdk.model.message.GiftUpdateMessage;
import com.bytedance.android.livesdk.pack.viewmodel.BagListViewModel;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.common.utility.Logger;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.Cs7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32679Cs7 extends C1C9 {
    public final /* synthetic */ C32676Cs4 LJIILL;
    public final /* synthetic */ AbstractC32698CsQ<? extends C30896CAq> LJIILLIIL;
    public final /* synthetic */ int LJIIZILJ;
    public final /* synthetic */ boolean LJIJ;
    public final /* synthetic */ long LJIJI;

    @Override // X.C1C9, X.C0AB
    public final void LJ() {
        DataChannel dataChannel;
        Boolean bool;
        GiftLockInfo giftLockInfo;
        long j;
        DataChannel dataChannel2;
        String str;
        DataChannel dataChannel3;
        Long l;
        DataChannel dataChannel4;
        long j2;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        Long l6;
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ;
        MutableLiveData<AbstractC32698CsQ<? extends C30896CAq>> mutableLiveData;
        MutableLiveData<AbstractC32698CsQ<? extends C30896CAq>> mutableLiveData2;
        MutableLiveData<AbstractC32698CsQ<? extends C30896CAq>> mutableLiveData3;
        MutableLiveData<AbstractC32698CsQ<? extends C30896CAq>> mutableLiveData4;
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ2;
        MutableLiveData<AbstractC32698CsQ<? extends C30896CAq>> mutableLiveData5;
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ3 = this.LJIILLIIL;
        FragmentManager fragmentManager = null;
        r5 = null;
        AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ4 = null;
        r5 = null;
        IMessageManager iMessageManager = null;
        fragmentManager = null;
        if (abstractC32698CsQ3.LIZ == 12 && (abstractC32698CsQ3 instanceof C32726Css)) {
            BagListViewModel LJJIJ = this.LJIILL.LJJIJ();
            if (LJJIJ != null && (mutableLiveData4 = LJJIJ.LJLJJI) != null) {
                BagListViewModel LJJIJ2 = this.LJIILL.LJJIJ();
                if (LJJIJ2 != null && (mutableLiveData5 = LJJIJ2.LJLJI) != null) {
                    abstractC32698CsQ2 = mutableLiveData5.getValue();
                } else {
                    abstractC32698CsQ2 = null;
                }
                mutableLiveData4.setValue(abstractC32698CsQ2);
            }
            BagListViewModel LJJIJ3 = this.LJIILL.LJJIJ();
            if (LJJIJ3 != null && (mutableLiveData3 = LJJIJ3.LJLJI) != null) {
                mutableLiveData3.setValue(this.LJIILLIIL);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("select new ");
            BagListViewModel LJJIJ4 = this.LJIILL.LJJIJ();
            if (LJJIJ4 != null && (mutableLiveData2 = LJJIJ4.LJLJI) != null) {
                abstractC32698CsQ = mutableLiveData2.getValue();
            } else {
                abstractC32698CsQ = null;
            }
            LIZ.append(abstractC32698CsQ);
            LIZ.append(" old ");
            BagListViewModel LJJIJ5 = this.LJIILL.LJJIJ();
            if (LJJIJ5 != null && (mutableLiveData = LJJIJ5.LJLJJI) != null) {
                abstractC32698CsQ4 = mutableLiveData.getValue();
            }
            LIZ.append(abstractC32698CsQ4);
            Logger.i("BAGS", X1D.LIZIZ(LIZ));
        } else if (this.LJIJ) {
            HashMap<Long, Boolean> hashMap = C32694CsM.LJJIIZI;
            if (hashMap.containsKey(Long.valueOf(this.LJIJI))) {
                bool = hashMap.get(Long.valueOf(this.LJIJI));
                if (bool == null) {
                    bool = Boolean.FALSE;
                }
            } else {
                bool = Boolean.FALSE;
            }
            boolean booleanValue = bool.booleanValue();
            boolean SD = ((IFansClubService) CN1.LIZ(IFansClubService.class)).SD();
            C77557UcD c77557UcD = this.LJIILL.LLFFF;
            if (c77557UcD != null && c77557UcD.getVisibility() == 8) {
                C32785Ctp c32785Ctp = C32785Ctp.LJIILIIL;
                long j3 = this.LJIJI;
                c32785Ctp.getClass();
                C32785Ctp.LJIJJ(j3, booleanValue);
            }
            long j4 = 0;
            if (C32696CsO.LIZ && this.LJIILLIIL.LIZ == 14) {
                Room room = this.LJIILL.LLIL;
                if (room != null) {
                    j2 = room.getId();
                } else {
                    j2 = 0;
                }
                C32689CsH.LIZ(this.LJIILL.LJLIL, GiftManager.inst().getFastGift(j2), "panel_education_entrance", null);
                BZI LIZ2 = C28787BRn.LIZ("gift_panel_education_entrance_click");
                GuideInfoResponse.UserStats userStats = C32696CsO.LJ;
                if (userStats != null) {
                    l2 = Long.valueOf(userStats.giftPanelShowCnt);
                } else {
                    l2 = null;
                }
                LIZ2.LJIJJ(l2, "gift_panel_show_cnt");
                GuideInfoResponse.UserStats userStats2 = C32696CsO.LJ;
                if (userStats2 != null) {
                    l3 = Long.valueOf(userStats2.shortcutGiftClickCnt);
                } else {
                    l3 = null;
                }
                LIZ2.LJIJJ(l3, "convenient_gift_click_cnt");
                GuideInfoResponse.UserStats userStats3 = C32696CsO.LJ;
                if (userStats3 != null) {
                    l4 = Long.valueOf(userStats3.giftGuidePopupShowCnt);
                } else {
                    l4 = null;
                }
                LIZ2.LJIJJ(l4, "gift_guide_popup_show_cnt");
                GuideInfoResponse.UserStats userStats4 = C32696CsO.LJ;
                if (userStats4 != null) {
                    l5 = Long.valueOf(userStats4.likeCnt);
                } else {
                    l5 = null;
                }
                LIZ2.LJIJJ(l5, "like_cnt");
                GuideInfoResponse.UserStats userStats5 = C32696CsO.LJ;
                if (userStats5 != null) {
                    l6 = Long.valueOf(userStats5.watchDuration);
                } else {
                    l6 = null;
                }
                LIZ2.LJIJJ(l6, "watch_duration");
                LIZ2.LJJIIJZLJL();
            }
            C32313CmD c32313CmD = AbstractC32320CmK.LIZ;
            if (c32313CmD.LJIIL() && c32313CmD.LJII() == this.LJIJI) {
                BZI LIZ3 = C28787BRn.LIZ("livesdk_first_recharge_welcome_entrance_click");
                C32456CoW.LIZ(LIZ3);
                LIZ3.LJJIIJZLJL();
                if (this.LJIILLIIL.LIZ == 13) {
                    str = "gift_education";
                } else {
                    str = "";
                }
                AbstractC32320CmK.LIZJ(c32313CmD, this.LJIILL.LJLIL, "first_recharge", str, 44);
                GiftLeafRootViewModel LJJIJLIJ = this.LJIILL.LJJIJLIJ();
                if (LJJIJLIJ != null && (dataChannel4 = LJJIJLIJ.LJLIL) != null) {
                    iMessageManager = (IMessageManager) dataChannel4.kv0(C29927Bop.class);
                }
                GiftUpdateMessage giftUpdateMessage = new GiftUpdateMessage();
                CommonMessageData commonMessageData = new CommonMessageData();
                giftUpdateMessage.baseMessage = commonMessageData;
                commonMessageData.messageId = C30725C4b.LIZ();
                CommonMessageData commonMessageData2 = giftUpdateMessage.baseMessage;
                GiftLeafRootViewModel LJJIJLIJ2 = this.LJIILL.LJJIJLIJ();
                if (LJJIJLIJ2 != null && (dataChannel3 = LJJIJLIJ2.LJLIL) != null && (l = (Long) dataChannel3.kv0(BCN.class)) != null) {
                    j4 = l.longValue();
                }
                commonMessageData2.roomId = j4;
                if (iMessageManager != null) {
                    iMessageManager.insertMessage(giftUpdateMessage);
                }
            } else {
                Gift findGiftById = GiftManager.inst().findGiftById(this.LJIJI);
                if (findGiftById != null && (giftLockInfo = findGiftById.giftSubInfo) != null && giftLockInfo.mLockType == 5 && !SD) {
                    GiftManager inst = GiftManager.inst();
                    long j5 = this.LJIJI;
                    Room room2 = this.LJIILL.LLIL;
                    if (room2 != null) {
                        j = room2.getOwnerUserId();
                    } else {
                        j = 0;
                    }
                    if (!inst.isGiftLimited(j5, j)) {
                        GiftLeafRootViewModel LJJIJLIJ3 = this.LJIILL.LJJIJLIJ();
                        if (LJJIJLIJ3 != null && (dataChannel2 = LJJIJLIJ3.LJLIL) != null) {
                            fragmentManager = (FragmentManager) dataChannel2.kv0(C29494Bhq.class);
                        }
                        LiveDialogFragment fM = ((IFansClubService) CN1.LIZ(IFansClubService.class)).fM();
                        if (fragmentManager != null && fM != null && !fM.isShowing() && !fM.isAdded()) {
                            fM.showNow(fragmentManager, "fans dialog");
                        }
                    }
                }
                C31563Ca7 c31563Ca7 = this.LJIILL.LLJLLIL;
                if (c31563Ca7 != null) {
                    Gift findGiftById2 = GiftManager.inst().findGiftById(this.LJIJI);
                    if (findGiftById2 != null) {
                        j4 = findGiftById2.diamondCount;
                    }
                    if (!c31563Ca7.LLIFFJFJJ) {
                        C29800Bmm gr = ((IUserLevelService) CN1.LIZ(IUserLevelService.class)).gr();
                        if (c31563Ca7.LJLLJ != EnumC232569Au.NEVER_SEND_GIFT && (gr == null || gr.LIZ != ((IUserLevelService) CN1.LIZ(IUserLevelService.class)).Xy())) {
                            c31563Ca7.LJJZ(j4);
                        }
                    }
                }
                this.LJIILL.LJJLIIIJL(this.LJIJI);
            }
        } else {
            GiftLeafRootViewModel LJJIJLIJ4 = this.LJIILL.LJJIJLIJ();
            if (LJJIJLIJ4 != null && (dataChannel = LJJIJLIJ4.LJLIL) != null) {
                dataChannel.rv0(GiftSelectedChangeEvent.class, C32341Cmf.LIZLLL(this.LJIJI));
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("GiftSelectedChangeEvent::class.java ");
            LIZ4.append(this.LJIJI);
            C32444CoK.LIZ("GiftPanelSwipe", X1D.LIZIZ(LIZ4));
            this.LJIILL.LJJIII(this.LJIJI);
        }
        super.LJ();
    }

    @Override // X.C1C9
    public final float LJIIJ(DisplayMetrics displayMetrics) {
        if (displayMetrics == null) {
            return 1.875f;
        }
        return 300.0f / displayMetrics.densityDpi;
    }

    @Override // X.C1C9
    public final int LJIIIZ(int i, View view) {
        int i2;
        int LJIIIZ = super.LJIIIZ(i, view);
        C32681Cs9 c32681Cs9 = this.LJIILL.LJZ;
        if (c32681Cs9 != null) {
            Iterator<AbstractC32698CsQ<? extends C30896CAq>> it = c32681Cs9.LJLILLLLZI.iterator();
            i2 = 0;
            while (it.hasNext()) {
                AbstractC32698CsQ<? extends C30896CAq> next = it.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ = next;
                    if (abstractC32698CsQ != null && abstractC32698CsQ.LIZJ) {
                        break;
                    }
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        i2 = -1;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("dy: ");
        LIZ.append(LJIIIZ);
        LIZ.append(' ');
        LIZ.append(this.LJIILLIIL.LIZLLL);
        LIZ.append(' ');
        LIZ.append(i2);
        LIZ.append(' ');
        LIZ.append(this.LJIIZILJ);
        C32444CoK.LIZ("Scroll Issue", X1D.LIZIZ(LIZ));
        if (Math.abs(LJIIIZ) < this.LJIILL.LLJJL || (LiveComboLargeClickableAreaSetting.INSTANCE.getValue() && (this.LJIILLIIL.LIZLLL || i2 == this.LJIIZILJ))) {
            return 0;
        }
        return LJIIIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32679Cs7(C32676Cs4 c32676Cs4, AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ, int i, boolean z, long j, Context context) {
        super(context);
        this.LJIILL = c32676Cs4;
        this.LJIILLIIL = abstractC32698CsQ;
        this.LJIIZILJ = i;
        this.LJIJ = z;
        this.LJIJI = j;
    }
}
