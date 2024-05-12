package X;

import Y.ARunnableS24S0200000_5;
import Y.AfS57S0100000_5;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.gift.FastGiftClickChannel;
import com.bytedance.android.live.gift.ResetSilentTimerEvent;
import com.bytedance.android.live.wallet.IWalletCenter;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.WalletCenter;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.livesdk.FastGiftCombEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftSenderRefactorV1Setting;
import com.bytedance.android.livesdk.livesetting.watchlive.LandscapeWatchLiveGestureOpt;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.CmS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32328CmS extends FrameLayout implements InterfaceC32326CmQ {
    public LiveIconView LJLIL;
    public C32327CmR LJLILLLLZI;
    public C77557UcD LJLJI;
    public Gift LJLJJI;
    public boolean LJLJJL;
    public C2A8 LJLJJLL;
    public long LJLJL;
    public final C73318Sq2 LJLJLJ;
    public DataChannel LJLJLLL;
    public final AqS171S0100000_5 LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public final RunnableC32325CmP LJLLJ;
    public final C32328CmS LJLLL;

    @Override // X.InterfaceC32326CmQ
    public final void LIZIZ() {
        this.LJLJLLL = null;
    }

    public final void LJFF() {
        long j;
        boolean z;
        DataChannel dataChannel;
        Room room;
        DataChannel dataChannel2;
        DataChannel dataChannel3;
        DataChannel dataChannel4 = this.LJLJLLL;
        if (dataChannel4 != null && o.LJ(dataChannel4.kv0(BCW.class), Boolean.FALSE) && !LandscapeWatchLiveGestureOpt.INSTANCE.getEnable() && (dataChannel3 = this.LJLJLLL) != null) {
            dataChannel3.pv0(ResetSilentTimerEvent.class);
        }
        DataChannel dataChannel5 = this.LJLJLLL;
        if (dataChannel5 != null) {
            dataChannel5.rv0(FastGiftClickChannel.class, Boolean.TRUE);
        }
        Gift gift = this.LJLJJI;
        long j2 = 0;
        if (gift != null) {
            j = gift.id;
        } else {
            j = 0;
        }
        if (!C76906UGg.LIZIZ(j) && (dataChannel2 = this.LJLJLLL) != null) {
            dataChannel2.qv0(FastGiftCombEvent.class, Boolean.TRUE);
        }
        this.LJLJL = SystemClock.uptimeMillis();
        BZI LIZ = C28787BRn.LIZ("shortcut_gift_click");
        LIZ.LJIIZILJ();
        LIZ.LJIIIZ("live");
        LIZ.LJIIL("click");
        LIZ.LJIIJJI("live_detail");
        LIZ.LJIIJ("bottom_tab");
        LIZ.LJJIIJZLJL();
        C32785Ctp c32785Ctp = C32785Ctp.LJIILIIL;
        Gift gift2 = this.LJLJJI;
        if (gift2 != null) {
            j2 = gift2.id;
        }
        if (gift2 != null && gift2.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        c32785Ctp.LJJI(j2, true, z, "convenient_icon", "", "click", 0, "gift");
        C32327CmR c32327CmR = this.LJLILLLLZI;
        if (c32327CmR != null) {
            AqS171S0100000_5 aqS171S0100000_5 = new AqS171S0100000_5(this, 826);
            Gift gift3 = c32327CmR.LIZJ;
            if (gift3 == null || (dataChannel = c32327CmR.LIZIZ) == null || (room = (Room) dataChannel.kv0(RoomChannel.class)) == null) {
                return;
            }
            if (LiveGiftSenderRefactorV1Setting.INSTANCE.enable()) {
                UVW uvw = UVW.LJI;
                User owner = room.getOwner();
                o.LJIIIIZZ(owner, "room.owner");
                uvw.LIZ(new C32825CuT(gift3, room, U5H.LIZ(owner), "convenient_icon", V16.LJIIJ(room, c32327CmR.LIZIZ), gift3.LIZ(), "click_icon", new C32330CmU(aqS171S0100000_5), false), null, null, null, null, null);
                return;
            }
            C32805Cu9 c32805Cu9 = new C32805Cu9(gift3.id, 1, gift3.LIZ(), room, 0, new C73026SlK(EnumC32737Ct3.FAST_GIFT, EnumC76934UHi.ANCHOR));
            c32805Cu9.LJIIIZ = gift3.diamondCount;
            c32805Cu9.LJIJJLI = gift3.isBroadcastGift;
            c32805Cu9.LJIILJJIL = "convenient_icon";
            User owner2 = room.getOwner();
            o.LJIIIIZZ(owner2, "room.owner");
            c32805Cu9.LJIILIIL = U5H.LIZ(owner2);
            c32805Cu9.LJJJI = true;
            c32805Cu9.LJIL = gift3.isEffectBEFView;
            c32805Cu9.LJJJ = new C32335CmZ(aqS171S0100000_5);
            C32796Cu0.LIZIZ(c32327CmR.LIZIZ, c32805Cu9);
        }
    }

    public final void LJI() {
        C2A8 c2a8;
        C77557UcD c77557UcD = this.LJLJI;
        if (c77557UcD != null) {
            C29306Beo.LJI(c77557UcD);
        }
        if (this.LJLJJL && (c2a8 = this.LJLJJLL) != null) {
            C29306Beo.LJJLJLI(c2a8);
        }
        DataChannel dataChannel = this.LJLJLLL;
        if (dataChannel != null) {
            dataChannel.rv0(FastGiftClickChannel.class, Boolean.FALSE);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        DataChannel dataChannel = this.LJLJLLL;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
        C32327CmR c32327CmR = this.LJLILLLLZI;
        if (c32327CmR != null) {
            c32327CmR.LIZLLL.LIZLLL();
            c32327CmR.LIZ = null;
        }
        removeCallbacks(this.LJLLJ);
        this.LJLJLJ.LIZLLL();
        super.onDetachedFromWindow();
    }

    @Override // X.InterfaceC32326CmQ
    public final ViewGroup LIZLLL() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    @Override // X.InterfaceC32326CmQ
    public View getCurrentView() {
        return this.LJLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32328CmS(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        this.LJLJLJ = new C73318Sq2();
        this.LJLL = new AqS171S0100000_5(this, 824);
        this.LJLLJ = RunnableC32325CmP.LJLIL;
        this.LJLLL = this;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, java.lang.Object, java.lang.String] */
    @Override // X.InterfaceC32326CmQ
    public final void LIZ(Gift gift) {
        DataChannel dataChannel;
        float f;
        if (gift == null) {
            return;
        }
        this.LJLJJI = gift;
        if (this.LJLJJL) {
            C68322mC c68322mC = new C68322mC();
            c68322mC.element = gift.name;
            if (!C76906UGg.LIZIZ(gift.id) && C46104I7o.LJJIJIIJI()) {
                ?? LJIILJJIL = C15380j0.LJIILJJIL(R.string.t0o);
                o.LJIIIIZZ(LJIILJJIL, "getString(R.string.ttlive_send)");
                c68322mC.element = LJIILJJIL;
            }
            if (c68322mC.element == 0) {
                ?? LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.mrk);
                o.LJIIIIZZ(LJIILJJIL2, "getString(R.string.pm_liveicon_rose)");
                c68322mC.element = LJIILJJIL2;
            }
            C2A8 c2a8 = this.LJLJJLL;
            if (c2a8 != null) {
                c2a8.setText((CharSequence) c68322mC.element);
            } else {
                post(new ARunnableS24S0200000_5(this, c68322mC, 85));
            }
        }
        if (this.LJLJJL || ((dataChannel = this.LJLJLLL) != null && o.LJ(dataChannel.kv0(BCW.class), Boolean.TRUE))) {
            f = 24.0f;
        } else {
            f = 26.0f;
        }
        int LIZ = C15380j0.LIZ(f);
        C78720Uuy LJI = C15650jR.LIZ().LJI(LIZ, LIZ);
        LJI.LJIIIZ(gift.image);
        LJI.LJIIL = Boolean.TRUE;
        LJI.LJIIJJI = new C32329CmT(this);
        LJI.LJIIJJI(this.LJLIL);
    }

    @Override // X.InterfaceC32326CmQ
    public void setImageDrawable(int i) {
        LiveIconView liveIconView = this.LJLIL;
        if (liveIconView != null) {
            liveIconView.setIcon(i);
        }
    }

    @Override // X.InterfaceC32326CmQ
    public final void LIZJ(DataChannel dataChannel, boolean z) {
        C2A8 c2a8;
        this.LJLJLLL = dataChannel;
        LJI();
        if (dataChannel != null) {
            dataChannel.mv0(FastGiftCombEvent.class, this, this.LJLL);
            this.LJLJJL = o.LJ(Boolean.TRUE, dataChannel.kv0(BNK.class));
        }
        if (!this.LJLJJL && dataChannel != null && o.LJ(dataChannel.kv0(BCW.class), Boolean.TRUE)) {
            setBackgroundResource(0);
        }
        if (this.LJLJJL && (c2a8 = this.LJLJJLL) != null) {
            C29306Beo.LJI(c2a8);
        }
        removeCallbacks(this.LJLLJ);
        setClipChildren(false);
        LJ(dataChannel, z);
    }

    public final void LJ(DataChannel dataChannel, boolean z) {
        IWalletCenter walletCenter;
        WalletStruct walletStruct;
        Room room = null;
        this.LJLJJI = null;
        this.LJLILLLLZI = new C32327CmR(this, dataChannel);
        if (!z) {
            IWalletService iWalletService = (IWalletService) CN1.LIZ(IWalletService.class);
            if (iWalletService != null && (walletCenter = iWalletService.walletCenter()) != null && (walletStruct = ((WalletCenter) walletCenter).LJLIL) != null && walletStruct.revenue != null && !C32282Cli.LJII) {
                C32282Cli.LIZIZ("show", "gift", false);
            } else {
                postDelayed(this.LJLLJ, 1500L);
            }
        }
        if (dataChannel != null) {
            room = (Room) dataChannel.kv0(RoomChannel.class);
        }
        BJH.LIZ(room);
        this.LJLJLJ.LIZ(C73943T0h.LIZ().LJ(C56942Li.class).LJJJJZI(new AfS57S0100000_5(this, 323)));
    }
}
