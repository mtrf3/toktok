package com.bytedance.android.livesdk.gift.base.platform.core.manager;

import X.AbstractC32320CmK;
import X.AbstractC32474Coo;
import X.AbstractC32698CsQ;
import X.AbstractC73672Svk;
import X.BKQ;
import X.C03660Ck;
import X.C0K2;
import X.C0M5;
import X.C0NB;
import X.C15070iV;
import X.C16880lQ;
import X.C276516r;
import X.C29044Baa;
import X.C29060Baq;
import X.C30725C4b;
import X.C30896CAq;
import X.C31120CJg;
import X.C31160CKu;
import X.C31585CaT;
import X.C32129CjF;
import X.C32138CjO;
import X.C32139CjP;
import X.C32145CjV;
import X.C32151Nz;
import X.C32313CmD;
import X.C32341Cmf;
import X.C32454CoU;
import X.C32457CoX;
import X.C32468Coi;
import X.C32470Cok;
import X.C32471Col;
import X.C32472Com;
import X.C32476Coq;
import X.C32477Cor;
import X.C32479Cot;
import X.C32496CpA;
import X.C32502CpG;
import X.C32537Cpp;
import X.C32595Cql;
import X.C32710Csc;
import X.C48459J0d;
import X.C73320Sq4;
import X.C73724Swa;
import X.C73943T0h;
import X.C73969T1h;
import X.C78857UxB;
import X.C78983UzD;
import X.C79012Uzg;
import X.C7MY;
import X.CCK;
import X.CCL;
import X.CN1;
import X.EnumC30551Byt;
import X.EnumC31997Ch7;
import X.EnumC35487DwJ;
import X.EnumC73681Svt;
import X.InterfaceC30442Bx8;
import X.InterfaceC31203CMl;
import X.InterfaceC32478Cos;
import X.InterfaceC64592gB;
import X.JBR;
import X.KMP;
import X.T16;
import X.UW7;
import X.UWI;
import X.X1D;
import android.util.SparseArray;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.comp.api.debug.IDebugService;
import com.bytedance.android.livesdk.gift.model.FreqLimitGiftInfo;
import com.bytedance.android.livesdk.gift.model.FreqLimitGiftOption;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.gift.model.GiftIconInfo;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.GiftPollInfo;
import com.bytedance.android.livesdk.gift.model.GiftPollOption;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.gift.model.LiveLimitedTimeDiscountGiftInfo;
import com.bytedance.android.livesdk.gift.model.RiskCtl;
import com.bytedance.android.livesdk.livesetting.gift.GiftUnlockExperiment;
import com.bytedance.android.livesdk.livesetting.gift.LiveFreeGiftSendSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftSendBecomeGuestBlackList;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftGoalBannerEnabledSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftLockInfo;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.model.GiftRandomEffectInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.event.LiveCurrentGoalGlobalData;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import defpackage.b1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS43S1000000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class GiftManager {
    public static GiftManager sInst;
    public C32496CpA mBannerBoxInfo;
    public ConcurrentHashMap<Long, Long> mRoomFastGiftIdMap = new ConcurrentHashMap<>(20);
    public ConcurrentHashMap<Long, GiftsInfo> mRoomGiftInfoMap = new ConcurrentHashMap<>(20);
    public final ConcurrentHashMap<Long, RiskCtl> mRoomRiskCtl = new ConcurrentHashMap<>(20);
    public LinkedList<AbstractC32698CsQ<? extends C30896CAq>> currentPanelList = new LinkedList<>();
    public GiftPollInfo mGiftPollInfo = null;
    public FreqLimitGiftInfo freqLimitGiftInfo = null;
    public HashMap<Long, C32470Cok> freqLimitInfoList = null;
    public HashMap<Long, FreqLimitGiftOption> freqLimitGiftOptionList = null;
    public ArrayList<Long> currentEffectList = new ArrayList<>();
    public UW7 giftRepository = new UW7();
    public final SparseArray<GiftListResult> mGiftsMap = new SparseArray<>();
    public final SparseArray<C0M5<Gift>> mGiftsMapByFind = new SparseArray<>();
    public final List<InterfaceC32478Cos> mGiftListListeners = new CopyOnWriteArrayList();
    public Map<Integer, Set<Long>> lockedGiftsMap = new HashMap();
    public long lockedGiftsMapRoomId = -1;

    public static synchronized GiftManager inst() {
        GiftManager giftManager;
        synchronized (GiftManager.class) {
            if (sInst == null) {
                sInst = new GiftManager();
            }
            giftManager = sInst;
        }
        return giftManager;
    }

    public boolean canSendGiftFree() {
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLocalTest() && LiveFreeGiftSendSetting.INSTANCE.getValue()) {
            return true;
        }
        return false;
    }

    public void clearGiftIconInfo() {
        this.mRoomFastGiftIdMap.clear();
    }

    public void clearGiftMap() {
        this.mGiftsMap.clear();
    }

    public Gift getFansClubJoinGift() {
        ArrayList arrayList = new ArrayList();
        List<GiftPage> giftPageList = getGiftPageList();
        if (giftPageList != null) {
            Iterator<GiftPage> it = giftPageList.iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().gifts);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Gift gift = (Gift) it2.next();
            GiftLockInfo giftLockInfo = gift.giftSubInfo;
            if (giftLockInfo != null && giftLockInfo.mLockType == 5) {
                return gift;
            }
        }
        return null;
    }

    public long getFirstShowSubscribeGiftId() {
        List<GiftPage> list;
        List<Gift> list2;
        GiftListResult giftListResult = this.mGiftsMap.get(0);
        if (giftListResult != null && (list = giftListResult.giftPages) != null && list.size() != 0) {
            for (GiftPage giftPage : giftListResult.giftPages) {
                if (giftPage.pageType == 15 && (list2 = giftPage.gifts) != null) {
                    for (Gift gift : list2) {
                        if (gift.isDisplayedOnPanel) {
                            return gift.id;
                        }
                    }
                }
            }
        }
        return 0L;
    }

    public GiftListResult getGiftListResult() {
        int i;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            i = room.getOrientation();
        } else {
            i = 0;
        }
        return this.mGiftsMap.get(i);
    }

    public List<GiftPage> getGiftPageList() {
        int i;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            i = room.getOrientation();
        } else {
            i = 0;
        }
        GiftListResult giftListResult = this.mGiftsMap.get(i);
        if (giftListResult != null && !C32151Nz.LJJIIJZLJL(giftListResult.giftPages)) {
            return new ArrayList(giftListResult.giftPages);
        }
        return new ArrayList();
    }

    public CCK getPollGifts() {
        List<GiftPollOption> list;
        Long l;
        GiftPollInfo giftPollInfo = this.mGiftPollInfo;
        if (giftPollInfo == null || (list = giftPollInfo.giftPollOptions) == null || list.size() != 2) {
            return null;
        }
        List<GiftPollOption> list2 = this.mGiftPollInfo.giftPollOptions;
        GiftPollOption giftPollOption = (GiftPollOption) ListProtector.get(list2, 0);
        GiftPollOption giftPollOption2 = (GiftPollOption) ListProtector.get(list2, 1);
        if (giftPollOption == null || giftPollOption2 == null || (l = giftPollOption.giftId) == null || giftPollOption2.giftId == null) {
            return null;
        }
        return new CCK(findGiftById(l.longValue()), findGiftById(giftPollOption2.giftId.longValue()), ((GiftPollOption) ListProtector.get(list2, 0)).resultImage, ((GiftPollOption) ListProtector.get(list2, 1)).resultImage);
    }

    public List<Gift> getStickerGifts() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<GiftPage> giftPageList = getGiftPageList();
        if (giftPageList != null) {
            Iterator<GiftPage> it = giftPageList.iterator();
            while (it.hasNext()) {
                arrayList2.addAll(it.next().gifts);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Gift gift = (Gift) it2.next();
            if (gift.type == 4) {
                arrayList.add(gift);
            }
        }
        return arrayList;
    }

    public boolean hideBottomBar() {
        int i;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            i = room.getOrientation();
        } else {
            i = 0;
        }
        GiftListResult giftListResult = this.mGiftsMap.get(i);
        if (giftListResult == null) {
            return false;
        }
        return giftListResult.giftsInfo.hideRecharge;
    }

    public GiftManager() {
        UW7 uw7 = this.giftRepository;
        uw7.getClass();
        C32468Coi c32468Coi = new C32468Coi(uw7);
        EnumC73681Svt enumC73681Svt = EnumC73681Svt.BUFFER;
        C73320Sq4.LIZ(enumC73681Svt, "mode is null");
        new C73724Swa(c32468Coi, enumC73681Svt).LJIILJJIL(T16.LIZ()).LJII(C73969T1h.LIZIZ()).LJIILJJIL(T16.LIZ()).LJIIJ(C32139CjP.LJLIL, new InterfaceC64592gB() { // from class: X.2nH
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                Throwable error = (Throwable) obj;
                o.LJIIIZ(error, "error");
                C0NB.LJ("GIFT_MANAGER", error.getMessage());
            }
        });
    }

    public C32496CpA getBannerBoxInfo() {
        return this.mBannerBoxInfo;
    }

    public static void filterFirstRechargeGift(Collection<? extends Gift> collection) {
        if (collection == null) {
            return;
        }
        long LJII = AbstractC32320CmK.LIZ.LJII();
        Iterator<? extends Gift> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next().id == LJII) {
                it.remove();
            }
        }
    }

    public static void filterNotDisplayedOnPanel(Collection<? extends Gift> collection) {
        GiftLockInfo giftLockInfo;
        if (collection == null) {
            return;
        }
        Iterator<? extends Gift> it = collection.iterator();
        boolean showLock = GiftUnlockExperiment.showLock();
        while (it.hasNext()) {
            Gift next = it.next();
            if (!next.isDisplayedOnPanel) {
                it.remove();
            }
            if (!showLock && (giftLockInfo = next.giftSubInfo) != null && giftLockInfo.mLockType == 2 && giftLockInfo.mLock) {
                it.remove();
            }
        }
    }

    private ArrayList<Long> getDownloadEffectList(List<GiftPage> list) {
        GiftRandomEffectInfo giftRandomEffectInfo;
        List<Long> list2;
        ArrayList<Long> arrayList = new ArrayList<>();
        for (GiftPage giftPage : list) {
            List<Gift> list3 = giftPage.gifts;
            if (list3 != null && !list3.isEmpty()) {
                for (Gift gift : giftPage.gifts) {
                    List<GiftColorInfo> list4 = gift.colorInfos;
                    if (list4 != null && !list4.isEmpty()) {
                        Iterator<GiftColorInfo> it = gift.colorInfos.iterator();
                        while (it.hasNext()) {
                            arrayList.add(it.next().colorEffectId);
                        }
                    }
                    if (gift.isRandomGift && (giftRandomEffectInfo = gift.randomEffectInfo) != null && (list2 = giftRandomEffectInfo.effectIds) != null && !list2.isEmpty()) {
                        arrayList.addAll(gift.randomEffectInfo.effectIds);
                    }
                    long j = gift.primaryEffectId;
                    if (j > 0) {
                        arrayList.add(Long.valueOf(j));
                    }
                }
            }
        }
        return arrayList;
    }

    private void updateFreqList(FreqLimitGiftInfo freqLimitGiftInfo) {
        if (freqLimitGiftInfo == null || freqLimitGiftInfo.freqLimitGiftOptions == null) {
            return;
        }
        if (this.freqLimitInfoList == null) {
            this.freqLimitInfoList = new HashMap<>();
        }
        if (this.freqLimitGiftOptionList == null) {
            this.freqLimitGiftOptionList = new HashMap<>();
        }
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        for (FreqLimitGiftOption freqLimitGiftOption : freqLimitGiftInfo.freqLimitGiftOptions) {
            this.freqLimitGiftOptionList.put(Long.valueOf(freqLimitGiftOption.giftId), freqLimitGiftOption);
            int i = 1;
            if (this.freqLimitInfoList.get(Long.valueOf(freqLimitGiftOption.giftId)) != null) {
                C32470Cok c32470Cok = this.freqLimitInfoList.get(Long.valueOf(freqLimitGiftOption.giftId));
                boolean z = freqLimitGiftOption.workSingleAnchor;
                c32470Cok.LIZIZ = z;
                if (room != null && z) {
                    try {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(String.valueOf(room.getOwnerUserId()));
                        LIZ.append(freqLimitGiftOption.giftId);
                        String LIZIZ = X1D.LIZIZ(LIZ);
                        HashMap<String, String> LIZJ = InterfaceC30442Bx8.o0.LIZJ();
                        if (LIZJ.get(LIZIZ) != null) {
                            i = CastIntegerProtector.parseInt(LIZJ.get(LIZIZ));
                        }
                        this.freqLimitInfoList.get(Long.valueOf(freqLimitGiftOption.giftId)).LIZJ.put(Long.valueOf(room.getOwnerUserId()), Integer.valueOf(i));
                    } catch (Exception unused) {
                    }
                }
            } else {
                C32470Cok c32470Cok2 = new C32470Cok();
                boolean z2 = freqLimitGiftOption.workSingleAnchor;
                c32470Cok2.LIZIZ = z2;
                c32470Cok2.LIZ = freqLimitGiftOption.frequencyLimit;
                if (room != null && z2) {
                    try {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(String.valueOf(room.getOwnerUserId()));
                        LIZ2.append(freqLimitGiftOption.giftId);
                        String LIZIZ2 = X1D.LIZIZ(LIZ2);
                        HashMap<String, String> LIZJ2 = InterfaceC30442Bx8.o0.LIZJ();
                        if (LIZJ2.get(LIZIZ2) != null) {
                            i = CastIntegerProtector.parseInt(LIZJ2.get(LIZIZ2));
                        }
                        c32470Cok2.LIZJ.put(Long.valueOf(room.getOwnerUserId()), Integer.valueOf(i));
                    } catch (Exception unused2) {
                    }
                }
                this.freqLimitInfoList.put(Long.valueOf(freqLimitGiftOption.giftId), c32470Cok2);
            }
        }
    }

    public int checkTabCanDisplay(int i) {
        List<GiftPage> list;
        GiftListResult giftListResult = this.mGiftsMap.get(0);
        if (giftListResult != null && (list = giftListResult.giftPages) != null) {
            for (GiftPage giftPage : list) {
                if (giftPage.pageType == i && giftPage.display) {
                    return i;
                }
            }
        }
        return 1;
    }

    public void clearFastGift(long j) {
        this.mRoomFastGiftIdMap.remove(Long.valueOf(j));
        this.mRoomFastGiftIdMap.remove(0L);
    }

    public Gift findClosetGift(int i) {
        GiftLockInfo giftLockInfo;
        int i2;
        ArrayList arrayList = new ArrayList();
        List<GiftPage> giftPageList = getGiftPageList();
        if (giftPageList != null) {
            Iterator<GiftPage> it = giftPageList.iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().gifts);
            }
        }
        List<Long> list = LiveGiftSendBecomeGuestBlackList.INSTANCE.getValue().blackList;
        Iterator it2 = arrayList.iterator();
        int i3 = Integer.MAX_VALUE;
        Gift gift = null;
        while (it2.hasNext()) {
            Gift gift2 = (Gift) it2.next();
            if (gift2.isDisplayedOnPanel && gift2.type != 3 && (giftLockInfo = gift2.giftSubInfo) != null && !giftLockInfo.mLock && !list.contains(Long.valueOf(gift2.id)) && (i2 = gift2.diamondCount) >= i && i2 - i <= i3) {
                i3 = i2 - i;
                gift = gift2;
            }
        }
        if (gift != null) {
            StringBuilder LJ = C7MY.LJ("find gift value is ", i, " result value and id is ");
            b1.LJ(LJ, gift.diamondCount, LJ, "GiftManager");
        }
        return gift;
    }

    public Gift findGiftById(long j) {
        int i;
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            i = room.getOrientation();
        } else {
            i = 0;
        }
        C0M5<Gift> c0m5 = this.mGiftsMapByFind.get(i);
        if (c0m5 == null) {
            return null;
        }
        return c0m5.LJ(j, null);
    }

    public Gift getFastGift(long j) {
        Long l;
        if (this.mRoomFastGiftIdMap.containsKey(Long.valueOf(j))) {
            l = this.mRoomFastGiftIdMap.get(Long.valueOf(j));
        } else {
            l = this.mRoomFastGiftIdMap.get(0L);
        }
        if (l != null) {
            return findGiftById(l.longValue());
        }
        return null;
    }

    public FreqLimitGiftOption getFreqLimitOption(Long l) {
        List<FreqLimitGiftOption> list;
        if (C31160CKu.LIZLLL()) {
            HashMap<Long, FreqLimitGiftOption> hashMap = this.freqLimitGiftOptionList;
            if (hashMap == null) {
                return null;
            }
            return hashMap.get(l);
        }
        FreqLimitGiftInfo freqLimitGiftInfo = this.freqLimitGiftInfo;
        if (freqLimitGiftInfo == null || (list = freqLimitGiftInfo.freqLimitGiftOptions) == null) {
            return null;
        }
        for (FreqLimitGiftOption freqLimitGiftOption : list) {
            if (l.longValue() == freqLimitGiftOption.giftId) {
                return freqLimitGiftOption;
            }
        }
        return null;
    }

    public GiftsInfo getGiftIconInfo(long j) {
        if (this.mRoomGiftInfoMap.containsKey(Long.valueOf(j))) {
            return this.mRoomGiftInfoMap.get(Long.valueOf(j));
        }
        return this.mRoomGiftInfoMap.get(0L);
    }

    public int getGiftPosition(long j) {
        LinkedList<AbstractC32698CsQ<? extends C30896CAq>> linkedList = this.currentPanelList;
        if (linkedList != null && !linkedList.isEmpty()) {
            Iterator<AbstractC32698CsQ<? extends C30896CAq>> it = this.currentPanelList.iterator();
            int i = 0;
            while (it.hasNext()) {
                AbstractC32698CsQ<? extends C30896CAq> next = it.next();
                i++;
                if (next != null && (next.LIZJ() == j || next.LIZ == 3)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public EnumC31997Ch7 getGiftType(Gift gift) {
        if (gift == null) {
            return EnumC31997Ch7.UNKNOWN;
        }
        int i = gift.type;
        if (i == 10) {
            return EnumC31997Ch7.GOLDEN_BEAN_CELL;
        }
        if (i == 9) {
            return EnumC31997Ch7.FREE_CELL;
        }
        if (i == 1) {
            return EnumC31997Ch7.NORMAL_GIFT;
        }
        if (i == 5) {
            return EnumC31997Ch7.TASK_GIFT;
        }
        if (i == 4) {
            return EnumC31997Ch7.STICKER_GIFT;
        }
        if (i == 8) {
            return EnumC31997Ch7.MIDDLE_GIFT;
        }
        if (i == 2) {
            return EnumC31997Ch7.SPECIAL_GIFT;
        }
        if (i == 11) {
            return EnumC31997Ch7.GAME;
        }
        return EnumC31997Ch7.UNKNOWN;
    }

    public int getPollGiftIndex(long j) {
        long j2;
        List<GiftPollOption> list = this.mGiftPollInfo.giftPollOptions;
        if (list == null) {
            return 0;
        }
        Long l = ((GiftPollOption) ListProtector.get(list, 0)).giftId;
        if (l != null) {
            j2 = l.longValue();
        } else {
            j2 = 0;
        }
        if (j == j2) {
            return 0;
        }
        return 1;
    }

    public int getTabByGiftId(long j) {
        List<GiftPage> list;
        GiftListResult giftListResult = this.mGiftsMap.get(0);
        if (giftListResult == null || (list = giftListResult.giftPages) == null || list.size() == 0) {
            return -1;
        }
        if (AbstractC32320CmK.LIZ.LJIIIZ()) {
            return ((GiftPage) ListProtector.get(giftListResult.giftPages, 0)).pageType;
        }
        for (GiftPage giftPage : giftListResult.giftPages) {
            if (giftPage.display) {
                Iterator<Gift> it = giftPage.gifts.iterator();
                while (it.hasNext()) {
                    if (it.next().id == j) {
                        return giftPage.pageType;
                    }
                }
            }
        }
        return -1;
    }

    public int getTabByGiftIdWithoutFirstRecharge(long j) {
        List<GiftPage> list;
        GiftListResult giftListResult = this.mGiftsMap.get(0);
        if (giftListResult != null && (list = giftListResult.giftPages) != null && list.size() != 0) {
            for (GiftPage giftPage : giftListResult.giftPages) {
                if (giftPage.display) {
                    Iterator<Gift> it = giftPage.gifts.iterator();
                    while (it.hasNext()) {
                        if (it.next().id == j) {
                            return giftPage.pageType;
                        }
                    }
                }
            }
        }
        return -1;
    }

    public int getTabLocation(int i) {
        List<GiftPage> list;
        int i2 = 0;
        GiftListResult giftListResult = this.mGiftsMap.get(0);
        if (giftListResult != null && (list = giftListResult.giftPages) != null) {
            Iterator<GiftPage> it = list.iterator();
            while (it.hasNext()) {
                i2++;
                if (it.next().pageType == C32129CjF.LIZ.LJIIIIZZ) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public String getTabName(int i) {
        List<GiftPage> list;
        GiftListResult giftListResult = this.mGiftsMap.get(0);
        if (giftListResult != null && (list = giftListResult.giftPages) != null) {
            for (GiftPage giftPage : list) {
                if (giftPage.pageType == i) {
                    return giftPage.pageName;
                }
            }
        }
        return "Gift";
    }

    public String getTabNameByIndex(int i) {
        List<GiftPage> list;
        GiftListResult giftListResult = this.mGiftsMap.get(0);
        if (giftListResult == null || (list = giftListResult.giftPages) == null || i >= list.size()) {
            return "Gift";
        }
        return ((GiftPage) ListProtector.get(giftListResult.giftPages, i)).pageName;
    }

    public int getTargetGiftDiamondCount(long j) {
        GiftListResult giftListResult;
        List<GiftPage> list;
        if (j != 0 && (giftListResult = this.mGiftsMap.get(0)) != null && (list = giftListResult.giftPages) != null && list.size() != 0) {
            Iterator<GiftPage> it = giftListResult.giftPages.iterator();
            while (it.hasNext()) {
                List<Gift> list2 = it.next().gifts;
                if (list2 != null) {
                    for (Gift gift : list2) {
                        if (gift.id == j) {
                            return gift.diamondCount;
                        }
                    }
                }
            }
        }
        return 0;
    }

    public RiskCtl getTargetRoomGiftRiskCtl(long j) {
        return this.mRoomRiskCtl.get(Long.valueOf(j));
    }

    public boolean isDynamicGift(long j) {
        List<GiftPage> list;
        List<String> list2;
        GiftListResult giftListResult = this.mGiftsMap.get(0);
        if (giftListResult == null || (list = giftListResult.giftPages) == null) {
            return false;
        }
        Iterator<GiftPage> it = list.iterator();
        while (it.hasNext()) {
            for (Gift gift : it.next().gifts) {
                if (gift.id == j) {
                    ImageModel imageModel = gift.previewImage;
                    if (imageModel == null || (list2 = imageModel.mUrls) == null || list2.size() <= 0) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isPollGift(long j) {
        List<GiftPollOption> list;
        long j2;
        long j3;
        Long l;
        GiftPollInfo giftPollInfo = this.mGiftPollInfo;
        if (giftPollInfo == null || (list = giftPollInfo.giftPollOptions) == null || ((GiftPollOption) ListProtector.get(list, 0)).giftId == null || ((GiftPollOption) ListProtector.get(this.mGiftPollInfo.giftPollOptions, 1)).giftId == null) {
            return false;
        }
        GiftPollOption giftPollOption = (GiftPollOption) ListProtector.get(this.mGiftPollInfo.giftPollOptions, 0);
        GiftPollOption giftPollOption2 = (GiftPollOption) ListProtector.get(this.mGiftPollInfo.giftPollOptions, 1);
        if (giftPollOption != null && giftPollOption2 != null && (l = giftPollOption.giftId) != null && giftPollOption2.giftId != null) {
            j2 = l.longValue();
            j3 = giftPollOption2.giftId.longValue();
        } else {
            j2 = 0;
            j3 = 0;
        }
        if (j != j2 && j != j3) {
            return false;
        }
        return true;
    }

    public boolean isSubscribeGift(long j) {
        List<GiftPage> list;
        List<Gift> list2;
        GiftListResult giftListResult = this.mGiftsMap.get(0);
        if (giftListResult != null && (list = giftListResult.giftPages) != null && list.size() != 0) {
            for (GiftPage giftPage : giftListResult.giftPages) {
                if (giftPage.pageType == 15 && (list2 = giftPage.gifts) != null) {
                    Iterator<Gift> it = list2.iterator();
                    while (it.hasNext()) {
                        if (it.next().id == j) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public void registerGiftListListener(InterfaceC32478Cos interfaceC32478Cos) {
        this.mGiftListListeners.add(interfaceC32478Cos);
    }

    public void unRegisterGiftListListener(InterfaceC32478Cos interfaceC32478Cos) {
        this.mGiftListListeners.remove(interfaceC32478Cos);
    }

    public void updatePanelList(LinkedList<AbstractC32698CsQ<? extends C30896CAq>> linkedList) {
        this.currentPanelList = linkedList;
    }

    public static void filterInteractNotSupportGift(Collection<? extends Gift> collection, boolean z) {
        if (collection == null) {
            return;
        }
        filterNotSupportGift(collection, z);
        Iterator<? extends Gift> it = collection.iterator();
        while (it.hasNext()) {
            if (!it.next().forLinkMic) {
                it.remove();
            }
        }
    }

    public static void filterNotSupportGift(Collection<? extends Gift> collection, boolean z) {
        if (collection == null) {
            return;
        }
        Iterator<? extends Gift> it = collection.iterator();
        while (it.hasNext()) {
            Gift next = it.next();
            if (next.isEffectBEFView && next.type == 2) {
                IInteractService iInteractService = C31120CJg.LIZ;
                if (iInteractService.Em() > 0 || iInteractService.Vc()) {
                    it.remove();
                } else {
                    Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                    if (room != null && room.getStreamType() != LiveMode.VIDEO) {
                        it.remove();
                    }
                }
            } else {
                int i = next.giftSubType;
                if (i == 3 || i == 4) {
                    IInteractService iInteractService2 = C31120CJg.LIZ;
                    if (!iInteractService2.VY() && (!iInteractService2.Xu0() || iInteractService2.Yu0() < 1)) {
                        it.remove();
                    }
                }
            }
        }
    }

    public static void filterUnSupportGifts(List<GiftPage> list, boolean z) {
        for (GiftPage giftPage : list) {
            if (C32129CjF.LIZ.LIZLLL == EnumC35487DwJ.GUEST) {
                filterInteractNotSupportGift(giftPage.gifts, z);
                filterInteractNotSupportGift(giftPage.frequentlyUsedGifts, z);
            } else {
                filterNotSupportGift(giftPage.gifts, z);
                filterNotSupportGift(giftPage.frequentlyUsedGifts, z);
            }
            filterNotDisplayedOnPanel(giftPage.gifts);
            filterNotDisplayedOnPanel(giftPage.frequentlyUsedGifts);
            filterFirstRechargeGift(giftPage.gifts);
            filterFirstRechargeGift(giftPage.frequentlyUsedGifts);
        }
    }

    private void notifyFastGiftModule(long j, long j2) {
        this.mRoomFastGiftIdMap.put(Long.valueOf(j), Long.valueOf(j2));
        this.mRoomFastGiftIdMap.put(0L, Long.valueOf(j2));
        C73943T0h.LIZ().LIZIZ(new C32145CjV(j, j2));
    }

    private void updateGiftLock(GiftListResult giftListResult, long j) {
        List<GiftPage> list = giftListResult.giftPages;
        if (j != this.lockedGiftsMapRoomId) {
            this.lockedGiftsMap.clear();
        }
        for (GiftPage giftPage : list) {
            for (Gift gift : giftPage.gifts) {
                GiftLockInfo giftLockInfo = gift.giftSubInfo;
                if (giftLockInfo != null && giftLockInfo.mLockType == 2 && giftLockInfo.mLock) {
                    if (!this.lockedGiftsMap.containsKey(Integer.valueOf(giftPage.pageType))) {
                        this.lockedGiftsMap.put(Integer.valueOf(giftPage.pageType), new HashSet());
                    }
                    this.lockedGiftsMap.get(Integer.valueOf(giftPage.pageType)).add(Long.valueOf(gift.id));
                }
            }
        }
        this.lockedGiftsMapRoomId = j;
    }

    private void updateRiskCtlInfo(GiftListResult giftListResult, long j) {
        RiskCtl riskCtl;
        if (giftListResult == null) {
            return;
        }
        GiftsInfo giftsInfo = giftListResult.giftsInfo;
        if (giftsInfo != null) {
            riskCtl = giftsInfo.riskCtl;
            if (riskCtl != null) {
                this.mRoomRiskCtl.put(Long.valueOf(j), riskCtl);
                C73943T0h.LIZ().LIZIZ(new C32138CjO(j, riskCtl));
            }
        } else {
            riskCtl = null;
        }
        this.mRoomRiskCtl.remove(Long.valueOf(j));
        C73943T0h.LIZ().LIZIZ(new C32138CjO(j, riskCtl));
    }

    public void cacheGiftListToMap(GiftListResult giftListResult, int i) {
        List<GiftPage> list;
        if (giftListResult == null) {
            return;
        }
        this.mGiftsMap.put(i, giftListResult);
        C0M5<Gift> c0m5 = this.mGiftsMapByFind.get(i);
        if (c0m5 != null) {
            c0m5.LIZIZ();
        } else {
            c0m5 = new C0M5<>();
            this.mGiftsMapByFind.append(i, c0m5);
        }
        ArrayList arrayList = new ArrayList();
        if (!C32151Nz.LJJIIJZLJL(giftListResult.giftPages) && (list = giftListResult.giftPages) != null) {
            Iterator<GiftPage> it = list.iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().gifts);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Gift gift = (Gift) it2.next();
            c0m5.LIZ(gift.id, gift);
        }
    }

    public boolean isGiftLimited(long j, long j2) {
        Integer num;
        HashMap<Long, C32470Cok> hashMap = this.freqLimitInfoList;
        if (hashMap == null) {
            return false;
        }
        C32470Cok c32470Cok = hashMap.get(Long.valueOf(j));
        FreqLimitGiftOption freqLimitOption = inst().getFreqLimitOption(Long.valueOf(j));
        if (c32470Cok != null && freqLimitOption != null) {
            int i = c32470Cok.LIZ;
            if (!c32470Cok.LIZIZ) {
                num = Integer.valueOf(i);
            } else {
                num = (Integer) ((LinkedHashMap) c32470Cok.LIZJ).get(Long.valueOf(j2));
            }
            if (num != null && num.intValue() <= 0 && freqLimitOption.refreshTimeStamp > System.currentTimeMillis() / 1000) {
                return true;
            }
        }
        return false;
    }

    public void updateGiftsInfo(GiftListResult giftListResult, long j) {
        if (giftListResult == null) {
            return;
        }
        GiftsInfo giftsInfo = giftListResult.giftsInfo;
        if (giftsInfo == null) {
            C73943T0h.LIZ().LIZIZ(new C32595Cql(0L, null));
            return;
        }
        this.mBannerBoxInfo = new C32496CpA(giftsInfo.isDisplayGiftBox, giftsInfo.bannerGiftBoxIcon, giftsInfo.giftBoxSchemeUrl);
        notifyFastGiftModule(j, giftsInfo.mFastGiftId);
        notifyGiftIconModule(j, giftsInfo.giftIconInfo, giftsInfo);
    }

    public void notifyGiftIconModule(long j, GiftIconInfo giftIconInfo, GiftsInfo giftsInfo) {
        this.mRoomGiftInfoMap.put(Long.valueOf(j), giftsInfo);
        this.mRoomGiftInfoMap.put(0L, giftsInfo);
        if (giftIconInfo.mValidStartAt >= System.currentTimeMillis() / 1000 || giftIconInfo.mValidEndAt <= System.currentTimeMillis() / 1000) {
            this.mRoomGiftInfoMap.remove(Long.valueOf(j));
            this.mRoomGiftInfoMap.remove(0L);
        }
        C73943T0h.LIZ().LIZIZ(new C32595Cql(j, giftsInfo));
    }

    public void updateFreqList(long j, int i, long j2) {
        C32470Cok c32470Cok;
        if (this.freqLimitInfoList == null || getFreqLimitOption(Long.valueOf(j)) == null || (c32470Cok = this.freqLimitInfoList.get(Long.valueOf(j))) == null) {
            return;
        }
        if (!c32470Cok.LIZIZ) {
            c32470Cok.LIZ = i;
            return;
        }
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(String.valueOf(j2));
            LIZ.append(String.valueOf(j));
            String LIZIZ = X1D.LIZIZ(LIZ);
            C48459J0d<HashMap<String, String>> c48459J0d = InterfaceC30442Bx8.o0;
            HashMap<String, String> LIZJ = c48459J0d.LIZJ();
            if (LIZJ.size() > 50) {
                LIZJ.clear();
            }
            LIZJ.put(LIZIZ, String.valueOf(i));
            c48459J0d.LIZ(LIZJ);
        } catch (Exception unused) {
        }
        c32470Cok.LIZJ.put(Long.valueOf(j2), Integer.valueOf(i));
    }

    private void onSyncGiftListSuccess(GiftListResult giftListResult, String str, int i, long j, AbstractC32474Coo abstractC32474Coo) {
        int i2;
        if (giftListResult == null) {
            if (abstractC32474Coo != null) {
                new ArrayList();
                abstractC32474Coo.LIZIZ();
                return;
            }
            return;
        }
        C78857UxB.LJJIJL(giftListResult);
        Iterator<InterfaceC32478Cos> it = this.mGiftListListeners.iterator();
        while (it.hasNext()) {
            it.next().LIZ(giftListResult, i);
        }
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            i2 = room.getOrientation();
        } else {
            i2 = 0;
        }
        cacheGiftListToMap(giftListResult, i2);
        List<GiftPage> list = giftListResult.giftPages;
        this.giftRepository.getClass();
        new C48459J0d(KMP.LJ("gift_list_response_", i2), "").LIZ(str);
        C48459J0d<Set<String>> c48459J0d = InterfaceC30442Bx8.LJ;
        Set<String> LIZJ = c48459J0d.LIZJ();
        LIZJ.add(String.valueOf(i2));
        c48459J0d.LIZ(LIZJ);
        updateGiftsInfo(giftListResult, j);
        updateGiftLock(giftListResult, j);
        updateRiskCtlInfo(giftListResult, j);
        if (abstractC32474Coo != null) {
            abstractC32474Coo.LIZJ(list);
        }
    }

    public void onGiftListFail(Throwable th, long j, int i, boolean z, long j2, WeakReference<AbstractC32474Coo> weakReference) {
        boolean z2;
        int i2;
        String message;
        if (j != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Exception exc = new Exception(th);
        C16880lQ.LLLLIIL(exc);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("syncgiftlist error! ");
        LIZ.append(exc.getStackTrace());
        C0NB.LJ("gift", X1D.LIZIZ(LIZ));
        if (z2) {
            HashMap LIZJ = C03660Ck.LIZJ("error_msg", exc.getMessage());
            if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar(C32454CoU.LIZ("ttlive_gift_list_status"))) {
                C0K2.LJIILJJIL(1, 0L, C32454CoU.LIZ("ttlive_gift_list_status"), LIZJ);
            }
            C0K2.LJIILL(1, 0, C32454CoU.LIZIZ("ttlive_gift_list_status"), LIZJ);
            BKQ LIZIZ = BKQ.LIZIZ();
            String str = EnumC30551Byt.Gift.info;
            LIZIZ.getClass();
            BKQ.LJ(LIZJ, str, "ttlive_gift_list_status");
        }
        if (th instanceof C276516r) {
            i2 = ((C276516r) th).getErrorCode();
        } else if (th instanceof UWI) {
            i2 = ((UWI) th).getClientCode();
        } else {
            i2 = -1;
        }
        if (((ArrayList) C31585CaT.LIZ).isEmpty()) {
            C32341Cmf.LJFF(i, j, null, null);
        }
        C32710Csc.LJII(i2, i, TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - j2), exc.getMessage(), null);
        if (weakReference.get() != null) {
            weakReference.get().LIZ(i2, exc.getMessage());
        }
        if (th == null) {
            message = "Throwable is null";
        } else {
            message = th.getMessage();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("fetch gift list fail ");
        LIZ2.append(message);
        C78983UzD.LJIJ(th, X1D.LIZIZ(LIZ2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.String, O] */
    public void onGiftListSuccess(long j, long j2, boolean z, int i, C15070iV<GiftListResult, String> c15070iV, AbstractC32474Coo abstractC32474Coo, String str) {
        boolean z2;
        long j3;
        long j4;
        String str2;
        Text text;
        List<GiftPage> list;
        List<GiftPage> list2;
        LiveLimitedTimeDiscountGiftInfo liveLimitedTimeDiscountGiftInfo;
        if (j != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (((IDebugService) CN1.LIZ(IDebugService.class)).tL() && c15070iV.LIZ != null) {
            ((IDebugService) CN1.LIZ(IDebugService.class)).E3();
        }
        GiftsInfo giftsInfo = c15070iV.LIZ.giftsInfo;
        this.mGiftPollInfo = giftsInfo.giftPollInfo;
        FreqLimitGiftInfo freqLimitGiftInfo = giftsInfo.freqLimitGiftInfo;
        this.freqLimitGiftInfo = freqLimitGiftInfo;
        updateFreqList(freqLimitGiftInfo);
        this.mBannerBoxInfo = new C32496CpA(giftsInfo.isDisplayGiftBox, giftsInfo.bannerGiftBoxIcon, giftsInfo.giftBoxSchemeUrl);
        C73943T0h.LIZ().LIZIZ(new CCL(getPollGifts()));
        C73943T0h.LIZ().LIZIZ(new C32479Cot(this.mBannerBoxInfo));
        C32313CmD c32313CmD = AbstractC32320CmK.LIZ;
        String str3 = c32313CmD.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setGiftInfo:\nnew(");
        LIZ.append(C32313CmD.LJIILLIIL(giftsInfo));
        LIZ.append(")\nold(");
        LIZ.append(C32313CmD.LJIILLIIL(c32313CmD.LJ));
        LIZ.append(')');
        C0NB.LIZIZ(str3, X1D.LIZIZ(LIZ));
        GiftsInfo giftsInfo2 = c32313CmD.LJ;
        c32313CmD.LJ = giftsInfo;
        LiveLimitedTimeDiscountGiftInfo liveLimitedTimeDiscountGiftInfo2 = giftsInfo.firstRechargeGiftInfo;
        if (liveLimitedTimeDiscountGiftInfo2 != null) {
            j3 = liveLimitedTimeDiscountGiftInfo2.expireTime;
        } else {
            j3 = 0;
        }
        if (giftsInfo2 != null && (liveLimitedTimeDiscountGiftInfo = giftsInfo2.firstRechargeGiftInfo) != null) {
            j4 = liveLimitedTimeDiscountGiftInfo.expireTime;
        } else {
            j4 = 0;
        }
        if (j3 > 0 && j3 != j4) {
            long LIZ2 = j3 - (C30725C4b.LIZ() / 1000);
            if (LIZ2 > 0) {
                String str4 = c32313CmD.LIZIZ;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("setGiftInfo new timer countdown(");
                LIZ3.append(LIZ2);
                LIZ3.append(" s)");
                C0NB.LIZIZ(str4, X1D.LIZIZ(LIZ3));
                c32313CmD.LJIIIZ.LIZLLL();
                c32313CmD.LJIIIZ.LIZ(AbstractC73672Svk.LJJLIIIJLJLI(LIZ2, TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(C32471Col.LJLIL));
            }
        }
        String str5 = c32313CmD.LIZIZ;
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("setGiftInfo: getCurUICase(");
        LIZ4.append(C32457CoX.LIZIZ().toString());
        LIZ4.append(')');
        C0NB.LIZIZ(str5, X1D.LIZIZ(LIZ4));
        onSyncGiftListSuccess(c15070iV.LIZ, c15070iV.LIZIZ, i, j, abstractC32474Coo);
        long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - j2);
        if (z2 && LiveMonitorSampleSetting.INSTANCE.isReportSlardar(C32454CoU.LIZ("ttlive_gift_list_status"))) {
            String LIZ5 = C32454CoU.LIZ("ttlive_gift_list_status");
            InterfaceC31203CMl interfaceC31203CMl = C0K2.LIZ;
            if (interfaceC31203CMl != null) {
                interfaceC31203CMl.LIZIZ(millis, LIZ5);
            }
        }
        C32710Csc.LJII(0, i, millis, "", str);
        if (i == 1) {
            GiftListResult globalData = c15070iV.LIZ;
            String responseString = c15070iV.LIZIZ;
            o.LJIIIZ(globalData, "globalData");
            o.LJIIIZ(responseString, "responseString");
            List<GiftPage> list3 = globalData.giftPages;
            o.LJIIIIZZ(list3, "globalData.giftPages");
            C32472Com.LIZIZ = list3;
            C79012Uzg.LJFF(new AqS43S1000000_5(responseString, 1));
        }
        GiftListResult giftListResult = c15070iV.LIZ;
        if (giftListResult != null && (list2 = giftListResult.giftPages) != null && !list2.isEmpty()) {
            Iterator<GiftPage> it = c15070iV.LIZ.giftPages.iterator();
            while (it.hasNext()) {
                ?? r2 = it.next().region;
                if (r2 != 0) {
                    ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C29060Baq.class)).LIZ = r2;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        GiftListResult giftListResult2 = c15070iV.LIZ;
        if (giftListResult2 != null && (list = giftListResult2.giftPages) != null && !list.isEmpty()) {
            arrayList.addAll(getDownloadEffectList(c15070iV.LIZ.giftPages));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (!this.currentEffectList.contains(next)) {
                    this.currentEffectList.add(next);
                }
            }
        }
        C0NB.LIZIZ("gift", "syncgiftlist success! ");
        if (LiveGiftGoalBannerEnabledSetting.INSTANCE.getValue()) {
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("updateGoalInfoAfterGiftListFetched ");
            GiftPanelBanner giftPanelBanner = giftsInfo.liveGoalBanner;
            if (giftPanelBanner != null && (text = giftPanelBanner.displayText) != null) {
                str2 = text.defaultPattern;
            } else {
                str2 = null;
            }
            JBR.LJIIJ(LIZ6, str2, LIZ6, "LiveGoalUtils");
            DataChannelGlobal.LJLJJI.tv0(LiveCurrentGoalGlobalData.class, new C32477Cor(C32502CpG.LIZIZ().LIZ, new C32476Coq(giftsInfo.liveGoalLabelIcon)));
        }
    }
}
