package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.gift.model.MatchInfo;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftComboInterruptStrategySettings;
import com.bytedance.android.livesdk.livesetting.gift.MsgStair;
import com.bytedance.android.livesdk.livesetting.gift.TrayComboConfig;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftInfoInBox;
import com.bytedance.android.livesdk.model.GiftTrayInfo;
import com.bytedance.android.livesdk.model.GiftsBoxInfo;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.GiftMonitorInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS171S0100000_5;
import ujb.o;

/* renamed from: X.UkW, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78072UkW {
    public final GiftMessage LIZ;
    public boolean LIZIZ;
    public String LIZJ;
    public int LIZLLL;
    public int LJ;
    public final int LJFF;
    public final int LJI;
    public EnumC78063UkN LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public final HashSet<C78072UkW> LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public final String LJIILLIIL;
    public EnumC32467Coh LJIIZILJ;
    public final boolean LJIJ;
    public final Boolean LJIJI;
    public int LJIJJ;
    public final HashSet<C78087Ukl> LJIJJLI;
    public long LJIL;
    public long LJJ;
    public long LJJI;
    public long LJJIFFI;
    public long LJJII;
    public long LJJIII;
    public long LJJIIJ;
    public long LJJIIJZLJL;
    public int LJJIIZ;
    public boolean LJJIIZI;
    public long LJJIJ;
    public long LJJIJIIJI;
    public int LJJIJIIJIL;
    public long LJJIJIL;
    public int LJJIJL;
    public final ArrayList<C32665Crt> LJJIJLIJ;
    public boolean LJJIL;
    public final C77419UZz LJJIZ;
    public int LJJJ;
    public String LJJJI;
    public CharSequence LJJJIL;
    public ImageModel LJJJJ;
    public CharSequence LJJJJI;
    public long LJJJJIZL;
    public User LJJJJJ;
    public boolean LJJJJJL;
    public boolean LJJJJL;
    public final int LJJJJLI;
    public final GiftMonitorInfo LJJJJLL;
    public final User LJJJJZ;
    public long LJJJJZI;
    public int LJJJLIIL;
    public int LJJJLL;
    public boolean LJJJLZIJ;
    public int LJJJZ;
    public int LJJL;
    public boolean LJJLI;
    public boolean LJJLIIIIJ;
    public boolean LJJLIIIJ;

    public C78072UkW() {
        this(null);
    }

    public final int LIZJ() {
        int i;
        int i2;
        int i3;
        if (this.LJJJJJL) {
            int selfSideStrategy = LiveGiftComboInterruptStrategySettings.INSTANCE.getSelfSideStrategy();
            if (selfSideStrategy != 0) {
                if (selfSideStrategy != 1) {
                    i = this.LJIIIZ;
                } else {
                    i2 = this.LJIIIZ;
                    i3 = this.LJIIJ;
                    i = i2 - i3;
                }
            } else {
                i = this.LJIIIZ;
            }
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getCurProcessShouldShow::other-seeing mCurrentProcess == ");
            LIZ.append(this.LJIIIZ);
            LIZ.append(", interruptedProcess == ");
            C1DD.LJFF(LIZ, this.LJIIJ, LIZ, "LiveGiftGeneralTrayMessage");
            int otherSideStrategy = LiveGiftComboInterruptStrategySettings.INSTANCE.getOtherSideStrategy();
            if (otherSideStrategy != 0) {
                if (otherSideStrategy != 1) {
                    if (otherSideStrategy != 2) {
                        i = this.LJIIIZ;
                    }
                } else {
                    i2 = this.LJIIIZ;
                    i3 = this.LJIIJ;
                    i = i2 - i3;
                }
            }
            i = this.LJIIIZ;
        }
        if (C32257ClJ.LJI()) {
            i = this.LJIIIZ;
        }
        if (i == 0) {
            this.LJIIIZ++;
            return 1;
        }
        return i;
    }

    public final long LIZLLL() {
        User user = this.LJJJJZ;
        if (user != null) {
            Long valueOf = Long.valueOf(user.getId());
            if (valueOf.longValue() > 0) {
                return valueOf.longValue();
            }
        }
        GiftMonitorInfo giftMonitorInfo = this.LJJJJLL;
        if (giftMonitorInfo != null) {
            return giftMonitorInfo.to_user_id;
        }
        return -1L;
    }

    public final void LIZIZ() {
        int i;
        Object c78115UlD;
        List<MsgStair> list;
        Object obj;
        int i2;
        if (C78084Uki.LJFF()) {
            boolean z = this.LJJJJJL;
            if (z) {
                i = this.LJIILIIL;
            } else {
                i = this.LJIIL;
            }
            boolean z2 = this.LJJJJL;
            if (!C78084Uki.LJFF()) {
                c78115UlD = new C78115UlD(1);
            } else {
                TrayComboConfig trayComboConfig = C78084Uki.LIZJ(z, z2)._trayComboConfig;
                String str = trayComboConfig._comboType;
                if (o.LJJJJIZL(str, "jump", true)) {
                    c78115UlD = C78117UlF.LIZ;
                } else if (o.LJJJJIZL(str, "dynamic", true)) {
                    if (z) {
                        list = C78084Uki.LIZLLL()._selfQueueStairs;
                    } else {
                        list = C78084Uki.LIZLLL()._otherQueueStairs;
                    }
                    int LIZ = C78084Uki.LIZ(i, list);
                    List<Integer> list2 = trayComboConfig._jumpInterval;
                    if (LIZ >= 0 && LIZ <= C47261Igj.LJJI(list2)) {
                        obj = ListProtector.get(list2, LIZ);
                    } else {
                        obj = -2;
                    }
                    int intValue = ((Number) obj).intValue();
                    if (intValue > 0) {
                        c78115UlD = new C78115UlD(intValue);
                    } else if (intValue == -1) {
                        c78115UlD = C78117UlF.LIZ;
                    } else {
                        c78115UlD = new C78115UlD(1);
                    }
                } else {
                    c78115UlD = new C78115UlD(1);
                }
            }
            if (c78115UlD instanceof C78115UlD) {
                i2 = this.LJIIIZ + ((C78115UlD) c78115UlD).LIZ;
                int i3 = this.LJIIIIZZ;
                if (i2 >= i3) {
                    i2 = i3;
                }
            } else if (kotlin.jvm.internal.o.LJ(c78115UlD, C78117UlF.LIZ)) {
                i2 = this.LJIIIIZZ;
            } else {
                throw new C162476Zf();
            }
            this.LJIIIZ = i2;
            return;
        }
        this.LJIIIZ++;
    }

    public final String toString() {
        String str;
        Gift gift;
        Gift gift2;
        StringBuilder LIZ = X1D.LIZ();
        GiftMessage giftMessage = this.LIZ;
        Integer num = null;
        if (giftMessage != null && (gift2 = giftMessage.mGift) != null) {
            str = gift2.name;
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(',');
        GiftMessage giftMessage2 = this.LIZ;
        if (giftMessage2 != null && (gift = giftMessage2.mGift) != null) {
            num = Integer.valueOf(gift.diamondCount);
        }
        LIZ.append(num);
        LIZ.append(',');
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(',');
        LIZ.append(this.LJIIIZ);
        return X1D.LIZIZ(LIZ);
    }

    public C78072UkW(GiftMessage giftMessage) {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        boolean z;
        Boolean bool;
        long j;
        ImageModel imageModel;
        User user;
        GiftMonitorInfo giftMonitorInfo;
        List<GiftInfoInBox> list;
        Gift gift;
        MatchInfo matchInfo;
        GiftTrayInfo giftTrayInfo;
        Gift gift2;
        Gift gift3;
        Gift gift4;
        this.LIZ = giftMessage;
        this.LIZJ = "";
        int i5 = 0;
        if (giftMessage != null && (gift4 = giftMessage.mGift) != null) {
            i = gift4.diamondCount;
        } else {
            i = 0;
        }
        this.LJ = i;
        int i6 = -1;
        if (giftMessage != null && (gift3 = giftMessage.mGift) != null) {
            i2 = gift3.type;
        } else {
            i2 = -1;
        }
        this.LJFF = i2;
        if (giftMessage != null && (gift2 = giftMessage.mGift) != null) {
            i6 = gift2.giftSubType;
        }
        this.LJI = i6;
        this.LJII = EnumC78063UkN.NONE;
        if (giftMessage != null) {
            i3 = giftMessage.comboCount;
        } else {
            i3 = 0;
        }
        this.LJIIIIZZ = i3;
        if (giftMessage != null) {
            i4 = giftMessage.comboCount;
        } else {
            i4 = 0;
        }
        this.LJIIIZ = i4;
        this.LJIIJJI = new HashSet<>();
        if (giftMessage != null) {
            str = giftMessage.mLogId;
        } else {
            str = null;
        }
        this.LJIILLIIL = str;
        this.LJIIZILJ = EnumC32467Coh.NONE;
        if (giftMessage != null) {
            z = giftMessage.isFirstSendGift;
        } else {
            z = false;
        }
        this.LJIJ = z;
        if (giftMessage != null && (giftTrayInfo = giftMessage.mTrayInfo) != null) {
            bool = Boolean.valueOf(giftTrayInfo.canMirror);
        } else {
            bool = null;
        }
        this.LJIJI = bool;
        this.LJIJJ = 1;
        if (giftMessage != null && (matchInfo = giftMessage.matchInfo) != null) {
            j = matchInfo.critical;
        } else {
            j = 0;
        }
        HashSet<C78087Ukl> hashSet = new HashSet<>();
        if (j > 1) {
            hashSet.add(new C78087Ukl(j, 3));
        }
        this.LJIJJLI = hashSet;
        this.LJJIJIIJIL = -2;
        this.LJJIJL = -2;
        ArrayList<C32665Crt> arrayList = new ArrayList<>();
        if (giftMessage != null) {
            arrayList.add(new C32665Crt(giftMessage.comboCount, giftMessage.giftId, false));
        }
        this.LJJIJLIJ = arrayList;
        this.LJJIZ = new C77419UZz(0);
        this.LJJJI = "";
        this.LJJJIL = "";
        if (giftMessage != null && (gift = giftMessage.mGift) != null) {
            imageModel = gift.image;
        } else {
            imageModel = null;
        }
        this.LJJJJ = imageModel;
        this.LJJJJI = "";
        this.LJJJJIZL = giftMessage != null ? giftMessage.giftId : 0L;
        if (giftMessage != null) {
            user = giftMessage.fromUser;
        } else {
            user = null;
        }
        this.LJJJJJ = user;
        if (giftMessage != null) {
            Gift gift5 = giftMessage.mGift;
            if (gift5 != null && gift5.isBoxGift) {
                GiftsBoxInfo giftsBoxInfo = giftMessage.giftsInBox;
                if (giftsBoxInfo != null && (list = giftsBoxInfo.gifts) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<GiftInfoInBox> it = list.iterator();
                    while (it.hasNext()) {
                        Gift findGiftById = GiftManager.inst().findGiftById(it.next().giftId);
                        if (findGiftById != null) {
                            arrayList2.add(findGiftById);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        i5 += ((Gift) it2.next()).diamondCount;
                    }
                }
                i5 += this.LIZ.mGift.diamondCount;
            } else {
                Gift gift6 = giftMessage.mGift;
                if (gift6 != null) {
                    i5 = gift6.diamondCount;
                }
            }
        }
        this.LJJJJLI = i5;
        GiftMessage giftMessage2 = this.LIZ;
        if (giftMessage2 != null) {
            giftMonitorInfo = giftMessage2.giftMonitorInfo;
        } else {
            giftMonitorInfo = null;
        }
        this.LJJJJLL = giftMonitorInfo;
        this.LJJJJZ = giftMessage2 != null ? giftMessage2.toUser : null;
        this.LJJL = 1001;
    }

    public final void LIZ(ArrayList<C32665Crt> otherSet) {
        kotlin.jvm.internal.o.LJIIIZ(otherSet, "otherSet");
        Iterator<C32665Crt> it = otherSet.iterator();
        while (it.hasNext()) {
            C32665Crt next = it.next();
            ORS.LJJLIL(new AqS171S0100000_5(next, 866), this.LJJIJLIJ);
            this.LJJIJLIJ.add(new C32665Crt(next.LJLILLLLZI, next.LJLIL, next.LJLJI));
        }
    }

    public final void LJ(C78072UkW c78072UkW) {
        C78087Ukl c78087Ukl;
        Iterator<C78087Ukl> it = c78072UkW.LJIJJLI.iterator();
        while (true) {
            if (it.hasNext()) {
                c78087Ukl = it.next();
                if (c78087Ukl.LIZ == 0) {
                    break;
                }
            } else {
                c78087Ukl = null;
                break;
            }
        }
        C78087Ukl c78087Ukl2 = c78087Ukl;
        if (c78087Ukl2 != null) {
            c78072UkW.LJIJJLI.remove(c78087Ukl2);
            c78072UkW.LJIJJLI.add(C78087Ukl.LIZ(c78087Ukl2, this.LJIIIIZZ + 1));
        }
        this.LJIJJLI.addAll(c78072UkW.LJIJJLI);
    }

    public final boolean LJFF(C78072UkW c78072UkW) {
        int i;
        int i2;
        if (c78072UkW == null || (i = this.LJ) > (i2 = c78072UkW.LJ)) {
            return true;
        }
        if (i == i2 && this.LIZLLL > c78072UkW.LIZLLL) {
            return true;
        }
        return false;
    }
}
