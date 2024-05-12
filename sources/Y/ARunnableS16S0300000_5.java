package Y;

import X.AbstractC32397CnZ;
import X.AbstractC32415Cnr;
import X.AbstractC32579CqV;
import X.AbstractC34571Xh;
import X.BZI;
import X.C05170If;
import X.C0NB;
import X.C141335gf;
import X.C15380j0;
import X.C19030ot;
import X.C28467BFf;
import X.C28787BRn;
import X.C28881BVd;
import X.C28882BVe;
import X.C29800Bmm;
import X.C30607Bzn;
import X.C30608Bzo;
import X.C30658C1m;
import X.C30659C1n;
import X.C31319CQx;
import X.C31563Ca7;
import X.C31583CaR;
import X.C31590CaY;
import X.C31592Caa;
import X.C31684Cc4;
import X.C31723Cch;
import X.C32399Cnb;
import X.C32407Cnj;
import X.C32409Cnl;
import X.C32496CpA;
import X.C32500CpE;
import X.C32507CpL;
import X.C32528Cpg;
import X.C32676Cs4;
import X.C32I;
import X.C3C5;
import X.C56K;
import X.C65814PsI;
import X.C76732zl;
import X.C78609UtB;
import X.CJJ;
import X.CRA;
import X.CRD;
import X.InterfaceC31587CaV;
import X.InterfaceC31710CcU;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.T16;
import X.UZK;
import X.X1D;
import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.pin.PinMessageViewModel;
import com.bytedance.android.live.slot.FrameL3SlotWidget;
import com.bytedance.android.live.slot.FrameSlotWidget;
import com.bytedance.android.livesdk.broadcast.interaction.widget.mutemic.MuteMicWidget;
import com.bytedance.android.livesdk.comp.impl.game.GamePartnershipService;
import com.bytedance.android.livesdk.game.api.GameLivePartnershipRetrofitApi;
import com.bytedance.android.livesdk.game.model.BriefGameTask;
import com.bytedance.android.livesdk.livesetting.gift.GiftHighTrafficDropMessageSetting;
import com.bytedance.android.livesdk.livesetting.gift.GiftReceiveMsgThreadSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.EnableGamePartnershipCachedSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.widgets.giftwidget.GiftWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.Logger;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.m;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class ARunnableS16S0300000_5 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            case 15:
                run$15(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        C32676Cs4 c32676Cs4;
        C31563Ca7 LJJIIZ;
        C32500CpE c32500CpE = (C32500CpE) this.l0;
        AbstractC32579CqV abstractC32579CqV = c32500CpE.LJLJLJ;
        if (abstractC32579CqV instanceof C32676Cs4) {
            c32676Cs4 = (C32676Cs4) abstractC32579CqV;
        } else {
            c32676Cs4 = null;
        }
        if ((c32676Cs4 == null || !c32676Cs4.LLJJJJLIIL) && (LJJIIZ = c32500CpE.LJJIIZ()) != null) {
            LJJIIZ.LJL((C29800Bmm) this.l1);
        }
        C31563Ca7 LJJIIZ2 = ((C32500CpE) this.l0).LJJIIZ();
        if (LJJIIZ2 != null) {
            LJJIIZ2.LJJZZI(C32528Cpg.LJLIL);
        }
        C31563Ca7 LJJIIZ3 = ((C32500CpE) this.l0).LJJIIZ();
        if (LJJIIZ3 != null) {
            C32496CpA c32496CpA = ((C32507CpL) this.l2).LJI;
            if (c32496CpA != null && c32496CpA.LIZ) {
                LJJIIZ3.LJLIL.setVisibility(8);
                ViewGroup.LayoutParams layoutParams = LJJIIZ3.LJLILLLLZI.getLayoutParams();
                layoutParams.width = C15380j0.LIZ(190.0f);
                LJJIIZ3.LJLILLLLZI.setLayoutParams(layoutParams);
                ViewGroup.LayoutParams layoutParams2 = LJJIIZ3.LJLLILLLL.getLayoutParams();
                layoutParams2.width = C15380j0.LIZ(190.0f);
                LJJIIZ3.LJLLILLLL.setLayoutParams(layoutParams2);
                return;
            }
            LJJIIZ3.LJLIL.setVisibility(0);
            ViewGroup.LayoutParams layoutParams3 = LJJIIZ3.LJLILLLLZI.getLayoutParams();
            layoutParams3.width = -1;
            LJJIIZ3.LJLILLLLZI.setLayoutParams(layoutParams3);
            ViewGroup.LayoutParams layoutParams4 = LJJIIZ3.LJLLILLLL.getLayoutParams();
            layoutParams4.width = C15380j0.LIZ(230.0f);
            LJJIIZ3.LJLLILLLL.setLayoutParams(layoutParams4);
            C78609UtB.LJJIJIL(0, LJJIIZ3);
            LJJIIZ3.requestLayout();
        }
    }

    public final void LIZ$1() {
        FrameLayout.LayoutParams layoutParams;
        int i;
        int i2;
        int i3;
        FrameLayout.LayoutParams layoutParams2;
        if (((Boolean) ((InterfaceC65784Pro) this.l0).invoke()).booleanValue()) {
            return;
        }
        C30658C1m c30658C1m = (C30658C1m) this.l1;
        int i4 = 0;
        FrameLayout.LayoutParams layoutParams3 = null;
        if (c30658C1m.LJLJJLL) {
            View view = (View) this.l2;
            if (view == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            if ((layoutParams4 instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams4) != null) {
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                layoutParams2.topMargin = 0;
                layoutParams2.leftMargin = 0;
                layoutParams2.gravity = 51;
                layoutParams3 = layoutParams2;
            }
            view.setLayoutParams(layoutParams3);
            return;
        }
        Rect invoke = c30658C1m.LJLJL.invoke();
        View view2 = (View) this.l2;
        if (view2 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams5 = view2.getLayoutParams();
        if ((layoutParams5 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams5) != null) {
            C30658C1m c30658C1m2 = (C30658C1m) this.l1;
            if (c30658C1m2.L()) {
                i = c30658C1m2.LJLIL;
            } else if (invoke != null) {
                i = invoke.width();
            } else {
                i = 0;
            }
            layoutParams.width = i;
            if (c30658C1m2.L()) {
                i2 = c30658C1m2.LJLILLLLZI;
            } else if (invoke != null) {
                i2 = invoke.height();
            } else {
                i2 = 0;
            }
            layoutParams.height = i2;
            if (c30658C1m2.L()) {
                i3 = c30658C1m2.LJLJI;
            } else if (invoke != null) {
                i3 = invoke.left;
            } else {
                i3 = 0;
            }
            layoutParams.leftMargin = i3;
            if (c30658C1m2.L()) {
                i4 = c30658C1m2.LJLJJI;
            } else if (invoke != null) {
                i4 = invoke.top;
            }
            layoutParams.topMargin = i4;
            layoutParams.gravity = 51;
            layoutParams3 = layoutParams;
        }
        view2.setLayoutParams(layoutParams3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0055, code lost:
    
        if (r19 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$2() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS16S0300000_5.LIZ$2():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$4() {
        String str;
        Object LIZ;
        List<BriefGameTask> list = ((GamePartnershipService) this.l0).LIZ().LIZIZ;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<BriefGameTask> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().task.id));
        }
        C30607Bzn c30607Bzn = (C30607Bzn) ((GamePartnershipService) this.l0).LJLJL.getValue();
        Room room = (Room) this.l1;
        ((GamePartnershipService) this.l0).LJLJJL.getValue();
        String LIZ2 = UZK.LIZ((Context) this.l2);
        c30607Bzn.getClass();
        o.LJIIIZ(room, "room");
        if (!EnableGamePartnershipCachedSetting.INSTANCE.getValue()) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            List<C30608Bzo> list2 = c30607Bzn.LIZ;
            if (!(list2 instanceof Collection) || !((ArrayList) list2).isEmpty()) {
                Iterator it3 = ((ArrayList) list2).iterator();
                while (it3.hasNext()) {
                    C30608Bzo c30608Bzo = (C30608Bzo) it3.next();
                    if (c30608Bzo != null) {
                        str = c30608Bzo.LJLIL;
                    } else {
                        str = null;
                    }
                    if (o.LJ(str, String.valueOf(room.getId())) && o.LJ(c30608Bzo.LJLILLLLZI, str2)) {
                        return;
                    }
                }
            }
            try {
                C65814PsI.LIZ().getClass();
                GameLivePartnershipRetrofitApi gameLivePartnershipRetrofitApi = (GameLivePartnershipRetrofitApi) C65814PsI.LIZJ(GameLivePartnershipRetrofitApi.class);
                String idStr = room.getOwner().getIdStr();
                String valueOf = String.valueOf(room.getId());
                o.LJIIIIZZ(idStr, "idStr");
                C28467BFf c28467BFf = (C28467BFf) gameLivePartnershipRetrofitApi.requestTaskDetail(str2, 1, idStr, valueOf, LIZ2).LJJJJJ(3L).LJJL(T16.LIZ()).LIZLLL();
                List<C30608Bzo> list3 = c30607Bzn.LIZ;
                String idStr2 = room.getIdStr();
                o.LJIIIIZZ(idStr2, "room.idStr");
                String jVar = ((m) c28467BFf.data).toString();
                o.LJIIIIZZ(jVar, "objectResponse.data.toString()");
                LIZ = Boolean.valueOf(((ArrayList) list3).add(new C30608Bzo(idStr2, str2, jVar)));
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
            if (m10exceptionOrNullimpl != null) {
                C0NB.LJI("GameRoomCachedHandler", m10exceptionOrNullimpl);
            }
        }
    }

    public final void LIZ$5() {
        float f;
        int LIZ;
        if (((C30658C1m) this.l0).LJLJJLL) {
            ((C30659C1n) this.l1).LIZ(false);
            ((C30659C1n) this.l1).animate().translationX(0.0f).translationY(0.0f).setDuration(300L).start();
            return;
        }
        MuteMicWidget muteMicWidget = (MuteMicWidget) this.l2;
        if (muteMicWidget.LJLIL == 0 && muteMicWidget.LJLILLLLZI == 0) {
            muteMicWidget.LJLIL = ((C30659C1n) this.l1).getLeft();
            ((MuteMicWidget) this.l2).LJLILLLLZI = ((C30659C1n) this.l1).getTop();
        }
        C30658C1m c30658C1m = (C30658C1m) this.l0;
        int width = ((c30658C1m.LJLIL - ((C30659C1n) this.l1).getWidth()) / 2) + c30658C1m.LJLJI;
        if (((C30658C1m) this.l0).LJLIL < C15380j0.LIZ(160.0f) || ((C30658C1m) this.l0).LJLILLLLZI < C15380j0.LIZ(170.0f)) {
            ((C30659C1n) this.l1).LIZ(true);
            C30658C1m c30658C1m2 = (C30658C1m) this.l0;
            int i = c30658C1m2.LJLJJI;
            int i2 = c30658C1m2.LJLILLLLZI;
            int i3 = i + i2;
            if (i2 <= C15380j0.LIZ(76.0f)) {
                f = 38.0f;
            } else {
                f = 42.0f;
            }
            LIZ = i3 - C15380j0.LIZ(f);
        } else {
            ((C30659C1n) this.l1).LIZ(false);
            C30658C1m c30658C1m3 = (C30658C1m) this.l0;
            LIZ = ((c30658C1m3.LJLILLLLZI / 100) * 11) + c30658C1m3.LJLJJI;
        }
        ((C30659C1n) this.l1).animate().translationX(width - ((MuteMicWidget) this.l2).LJLIL).translationY(LIZ - ((MuteMicWidget) this.l2).LJLILLLLZI).setDuration(300L).start();
    }

    public final void LIZ$6() {
        FrameLayout frameLayout;
        int i;
        if (((C76732zl) this.l0).element % 2 == 0) {
            frameLayout = ((CJJ) this.l1).LJLJJL;
            if (frameLayout != null) {
                i = R.drawable.cd5;
                frameLayout.setBackgroundResource(i);
            }
        } else {
            frameLayout = ((CJJ) this.l1).LJLJJL;
            if (frameLayout != null) {
                i = R.drawable.cd6;
                frameLayout.setBackgroundResource(i);
            }
        }
        ((C76732zl) this.l0).element++;
        ((CJJ) this.l1).LJLJL.postDelayed(this, 300L);
        if (((C76732zl) this.l0).element > 3) {
            ((CJJ) this.l1).LJLJL.removeCallbacks(this);
            ((CJJ) this.l1).LJLJJLL = true;
            ((EmoteModel) this.l2).shine = false;
        }
    }

    public final void LIZ$3() {
        User user;
        Long l;
        int LIZ;
        int size;
        Gift gift;
        Gift gift2;
        Gift gift3;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("receive Gift -> ");
        GiftMessage giftMessage = (GiftMessage) this.l1;
        Integer num = null;
        if (giftMessage != null) {
            user = giftMessage.fromUser;
        } else {
            user = null;
        }
        LIZ2.append(C05170If.LIZ(user));
        LIZ2.append(" / ");
        GiftMessage giftMessage2 = (GiftMessage) this.l1;
        if (giftMessage2 != null && (gift3 = giftMessage2.mGift) != null) {
            l = Long.valueOf(gift3.id);
        } else {
            l = null;
        }
        LIZ2.append(l);
        LIZ2.append(" / ");
        GiftMessage giftMessage3 = (GiftMessage) this.l1;
        if (giftMessage3 != null) {
            num = Integer.valueOf(giftMessage3.comboCount);
        }
        LIZ2.append(num);
        Logger.i("Haha", X1D.LIZIZ(LIZ2));
        SystemClock.elapsedRealtimeNanos();
        GiftMessage giftMessage4 = (GiftMessage) this.l1;
        int i = 0;
        if (giftMessage4 != null && (gift2 = giftMessage4.mGift) != null && gift2.type == 1) {
            C31590CaY c31590CaY = ((C31592Caa) this.l0).LIZ;
            c31590CaY.getClass();
            if (giftMessage4 != null && giftMessage4.mGift != null) {
                c31590CaY.LIZ.offer(giftMessage4);
            }
        } else {
            C31590CaY c31590CaY2 = ((C31592Caa) this.l0).LIZIZ;
            c31590CaY2.getClass();
            if (giftMessage4 != null && giftMessage4.mGift != null) {
                c31590CaY2.LIZ.offer(giftMessage4);
            }
        }
        SystemClock.elapsedRealtimeNanos();
        int i2 = GiftHighTrafficDropMessageSetting.INSTANCE.getConfig().maxQueueLength;
        int LIZ3 = ((C31592Caa) this.l0).LIZIZ.LIZ() + ((C31592Caa) this.l0).LIZ.LIZ();
        if (i2 > 0 && LIZ3 > i2) {
            float min = Math.min(r5.getConfig().clearPercentage / 100.0f, 1.0f);
            float f = LIZ3;
            float LIZ4 = ((C31592Caa) this.l0).LIZ.LIZ() / f;
            if (LIZ4 > min) {
                LIZ = (int) (min * f);
                C31590CaY c31590CaY3 = ((C31592Caa) this.l0).LIZ;
                c31590CaY3.getClass();
                HashSet hashSet = new HashSet();
                int i3 = LIZ;
                while (true) {
                    int i4 = i3 - 1;
                    if (i3 <= 0) {
                        break;
                    }
                    hashSet.add(c31590CaY3.LIZ.poll());
                    i3 = i4;
                }
                size = 0;
            } else {
                LIZ = ((C31592Caa) this.l0).LIZ.LIZ();
                ((C31592Caa) this.l0).LIZ.LIZ.clear();
                C31590CaY c31590CaY4 = ((C31592Caa) this.l0).LIZIZ;
                int i5 = (int) ((min - LIZ4) * f);
                c31590CaY4.getClass();
                HashSet hashSet2 = new HashSet();
                while (true) {
                    int i6 = i5 - 1;
                    if (i5 <= 0) {
                        break;
                    }
                    hashSet2.add(c31590CaY4.LIZ.poll());
                    i5 = i6;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    GiftMessage giftMessage5 = (GiftMessage) next;
                    if (giftMessage5 != null && (gift = giftMessage5.mGift) != null && gift.type == 4) {
                        arrayList.add(next);
                    }
                }
                size = arrayList.size();
                i = hashSet2.size() - size;
            }
            C31592Caa c31592Caa = (C31592Caa) this.l0;
            c31592Caa.getClass();
            BZI LIZ5 = C28787BRn.LIZ("gift_drop_msg");
            LIZ5.LJIJJ(Integer.valueOf(LIZ), "small_gift_count");
            LIZ5.LJIJJ(Integer.valueOf(i), "big_gift_count");
            LIZ5.LJIJJ(Integer.valueOf(size), "sticker_gift_count");
            LIZ5.LJIJJ(Integer.valueOf(c31592Caa.LIZ.LIZ()), "small_buffer_size");
            LIZ5.LJIJJ(Integer.valueOf(c31592Caa.LIZIZ.LIZ()), "big_buffer_size");
            LIZ5.LJI();
            LIZ5.LJJIIJZLJL();
        }
        C31592Caa c31592Caa2 = (C31592Caa) this.l0;
        if (!c31592Caa2.LIZJ) {
            InterfaceC88472Yns func = (InterfaceC88472Yns) this.l2;
            o.LJIIIZ(func, "func");
            GiftReceiveMsgThreadSetting.INSTANCE.postToThread(new ARunnableS24S0200000_5(c31592Caa2, func, 49));
        }
    }

    public static final void run$0(ARunnableS16S0300000_5 aRunnableS16S0300000_5) {
        boolean LIZ;
        try {
            aRunnableS16S0300000_5.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS16S0300000_5 aRunnableS16S0300000_5) {
        IDAListenerS232S0100000_5 iDAListenerS232S0100000_5 = (IDAListenerS232S0100000_5) aRunnableS16S0300000_5.l0;
        View view = (View) aRunnableS16S0300000_5.l1;
        InterfaceC31710CcU interfaceC31710CcU = (InterfaceC31710CcU) aRunnableS16S0300000_5.l2;
        iDAListenerS232S0100000_5.getClass();
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).removeAllViews();
            ((FrameL3SlotWidget) ((AObserverS69S0200000_5) iDAListenerS232S0100000_5.l0).l1).hide();
            C31684Cc4.LIZIZ("FrameL3SlotWidget", interfaceC31710CcU, "slot visible change, visible: false");
        }
    }

    public static final void run$10(ARunnableS16S0300000_5 aRunnableS16S0300000_5) {
        boolean LIZ;
        try {
            ((C28881BVd) aRunnableS16S0300000_5.l0).LJIILIIL((C19030ot) aRunnableS16S0300000_5.l1, (AbstractC34571Xh) aRunnableS16S0300000_5.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS16S0300000_5 aRunnableS16S0300000_5) {
        boolean LIZ;
        try {
            ((C28882BVe) aRunnableS16S0300000_5.l0).LJIILIIL((C19030ot) aRunnableS16S0300000_5.l1, (AbstractC34571Xh) aRunnableS16S0300000_5.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS16S0300000_5 aRunnableS16S0300000_5) {
        boolean LIZ;
        try {
            aRunnableS16S0300000_5.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS16S0300000_5 aRunnableS16S0300000_5) {
        boolean LIZ;
        try {
            aRunnableS16S0300000_5.LIZ$5();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(ARunnableS16S0300000_5 aRunnableS16S0300000_5) {
        boolean LIZ;
        try {
            aRunnableS16S0300000_5.LIZ$6();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$15(ARunnableS16S0300000_5 aRunnableS16S0300000_5) {
        boolean LIZ;
        try {
            ((View) aRunnableS16S0300000_5.l0).setRotationX(((C56K) aRunnableS16S0300000_5.l1).element);
            ((View) aRunnableS16S0300000_5.l0).setRotationY(((C56K) aRunnableS16S0300000_5.l2).element);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS16S0300000_5 aRunnableS16S0300000_5) {
        IDAListenerS232S0100000_5 iDAListenerS232S0100000_5 = (IDAListenerS232S0100000_5) aRunnableS16S0300000_5.l0;
        View view = (View) aRunnableS16S0300000_5.l1;
        C31723Cch c31723Cch = (C31723Cch) aRunnableS16S0300000_5.l2;
        iDAListenerS232S0100000_5.getClass();
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).removeAllViews();
            ((FrameSlotWidget) ((AObserverS36S0400000_5) iDAListenerS232S0100000_5.l0).l3).hide();
            C31684Cc4.LIZIZ("FrameSlotWidget", c31723Cch.LIZIZ, "slot visible change, visible: false");
        }
    }

    public static final void run$3(ARunnableS16S0300000_5 aRunnableS16S0300000_5) {
        boolean LIZ;
        try {
            aRunnableS16S0300000_5.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS16S0300000_5 aRunnableS16S0300000_5) {
        boolean LIZ;
        try {
            aRunnableS16S0300000_5.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS16S0300000_5 aRunnableS16S0300000_5) {
        boolean LIZ;
        try {
            AbstractC32397CnZ abstractC32397CnZ = ((C32407Cnj) aRunnableS16S0300000_5.l0).LIZ;
            if (abstractC32397CnZ != null) {
                abstractC32397CnZ.LIZ(new C32409Cnl((AbstractC32415Cnr) aRunnableS16S0300000_5.l1), (C32399Cnb) aRunnableS16S0300000_5.l2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS16S0300000_5 aRunnableS16S0300000_5) {
        boolean LIZ;
        try {
            AbstractC32397CnZ abstractC32397CnZ = ((C32407Cnj) aRunnableS16S0300000_5.l0).LIZ;
            if (abstractC32397CnZ != null) {
                abstractC32397CnZ.LIZ(new C32409Cnl((AbstractC32415Cnr) aRunnableS16S0300000_5.l1), (C32399Cnb) aRunnableS16S0300000_5.l2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS16S0300000_5 aRunnableS16S0300000_5) {
        boolean LIZ;
        try {
            aRunnableS16S0300000_5.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS16S0300000_5 aRunnableS16S0300000_5) {
        boolean LIZ;
        boolean z;
        try {
            InterfaceC31587CaV interfaceC31587CaV = (InterfaceC31587CaV) aRunnableS16S0300000_5.l0;
            GiftMessage giftMessage = (GiftMessage) ((IMessage) aRunnableS16S0300000_5.l1);
            C31583CaR c31583CaR = (C31583CaR) aRunnableS16S0300000_5.l2;
            if (!c31583CaR.LJLJI && c31583CaR.LJLILLLLZI) {
                z = true;
            } else {
                z = false;
            }
            ((GiftWidget) interfaceC31587CaV).LL(giftMessage, z);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS16S0300000_5 aRunnableS16S0300000_5) {
        C31319CQx c31319CQx = (C31319CQx) aRunnableS16S0300000_5.l0;
        CRD crd = (CRD) aRunnableS16S0300000_5.l1;
        Object obj = aRunnableS16S0300000_5.l2;
        PinMessageViewModel pinMessageViewModel = c31319CQx.LJLILLLLZI;
        if (pinMessageViewModel != null && ((pinMessageViewModel.LJLJJI != null || pinMessageViewModel.LJLJJL != null) && pinMessageViewModel.gv0(crd))) {
            c31319CQx.LJLILLLLZI.kv0(crd);
            return;
        }
        if (crd == null || c31319CQx.mView == 0 || c31319CQx.LLIILZL == null) {
            return;
        }
        if (c31319CQx.LJJL() && c31319CQx.LLILLL == crd) {
            ((CRA) c31319CQx.mView).J30(crd);
            return;
        }
        int LJIIIIZZ = c31319CQx.LJZI.LJIIIIZZ(crd);
        if (LJIIIIZZ == -1) {
            return;
        }
        ((CRA) c31319CQx.mView).In0(LJIIIIZZ, obj);
    }

    public ARunnableS16S0300000_5(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
