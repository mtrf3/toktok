package X;

import android.content.Context;
import android.os.Handler;
import android.util.Pair;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercelive.common.popcard.settings.PinCardStyleConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.popcard.vo.PopupCardVO;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* renamed from: X.RwW, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71172RwW extends AbstractC71187Rwl implements InterfaceC71246Rxi, InterfaceC53800L9o {
    public final boolean LLIIL;
    public boolean LLIILII;
    public boolean LLIILZL;
    public int LLIIZ;
    public final C71184Rwi LLIL;
    public final C71124Rvk LLILII;

    @Override // X.InterfaceC71246Rxi
    public final void LJIIIIZZ() {
        C36746EbW.LIZ(4, "checkToDismiss");
        this.LLIILZL = false;
        LJJIIJZLJL(false);
    }

    @Override // X.AbstractC71187Rwl
    public final void LJIIJJI() {
        LJJIIJZLJL(false);
    }

    @Override // X.AbstractC71187Rwl
    public final boolean LJIJJ() {
        return false;
    }

    @Override // X.AbstractC71187Rwl
    public final boolean LJIJJLI() {
        return true;
    }

    @Override // X.InterfaceC31710CcU
    public final Enum LLJJJJLIIL() {
        if (this.LLIIL) {
            return EnumC31730Cco.SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE;
        }
        return EnumC31730Cco.SLOT_LIVE_WATCHER_L3_POP;
    }

    @Override // X.AbstractC71187Rwl, X.AbstractC32179Ck3, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onDestroy() {
        String idStr;
        EventBus.LIZJ().LJIJ(this);
        Room room = this.LJLLI;
        if (room != null && (idStr = room.getIdStr()) != null) {
            if (LJIIL(this.LLILII.LJLILLLLZI)) {
                C53799L9n.LIZJ(idStr, "SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE");
            }
            C53799L9n.LJ(idStr, "SLOT_BAG_BUBBLE_SHOW", this);
            C53799L9n.LJ(idStr, "SLOT_LIVE_WATCHER_TOOLBAR", this);
        }
        this.LLIIZ = 0;
        super.onDestroy();
    }

    @Override // X.AbstractC71187Rwl
    public final /* bridge */ /* synthetic */ AbstractC71170RwU LJIIZILJ() {
        return this.LLILII;
    }

    @Override // X.AbstractC71187Rwl
    public final AbstractC71186Rwk LJIJI() {
        return this.LLIL;
    }

    @Override // X.InterfaceC71246Rxi
    public final void LJFF(boolean z) {
        String idStr;
        String str;
        boolean z2;
        String str2;
        boolean z3;
        if (C71144Rw4.LIZJ && !this.LLIILII) {
            C36746EbW.LIZ(4, "coupon not shown, waiting");
            this.LLIILZL = true;
            int i = this.LLIIZ + 1;
            this.LLIIZ = i;
            Long l = null;
            if (i == 1) {
                EnumC71173RwX enumC71173RwX = EnumC71173RwX.WAIT_FOR_SHOW;
                String LJIJ = LJIJ();
                Room room = this.LJLLI;
                if (room != null) {
                    str2 = C17280m4.LIZ(room);
                } else {
                    str2 = null;
                }
                PopupCardVO popupCardVO = this.LLILII.LJLIL;
                if (popupCardVO != null) {
                    l = Long.valueOf(popupCardVO.getProductId());
                }
                String valueOf = String.valueOf(l);
                boolean z4 = this.LJLLJ;
                boolean z5 = this.LLIIIZ;
                boolean z6 = this.LLIIIJ;
                PopupCardVO popupCardVO2 = this.LLILII.LJLIL;
                if (popupCardVO2 != null) {
                    z3 = popupCardVO2.isFromMessage();
                } else {
                    z3 = false;
                }
                C71161RwL.LIZ(enumC71173RwX, LJIJ, str2, valueOf, z4, z5, z6, z3);
            } else {
                EnumC71173RwX enumC71173RwX2 = EnumC71173RwX.MORE_WAIT_FOR_SHOW;
                String LJIJ2 = LJIJ();
                Room room2 = this.LJLLI;
                if (room2 != null) {
                    str = C17280m4.LIZ(room2);
                } else {
                    str = null;
                }
                PopupCardVO popupCardVO3 = this.LLILII.LJLIL;
                if (popupCardVO3 != null) {
                    l = Long.valueOf(popupCardVO3.getProductId());
                }
                String valueOf2 = String.valueOf(l);
                boolean z7 = this.LJLLJ;
                boolean z8 = this.LLIIIZ;
                boolean z9 = this.LLIIIJ;
                PopupCardVO popupCardVO4 = this.LLILII.LJLIL;
                if (popupCardVO4 != null) {
                    z2 = popupCardVO4.isFromMessage();
                } else {
                    z2 = false;
                }
                C71161RwL.LIZ(enumC71173RwX2, LJIJ2, str, valueOf2, z7, z8, z9, z2);
            }
            C2U8.LIZ(new C71119Rvf(z));
            return;
        }
        C36746EbW.LIZ(4, "coupon has shown");
        this.LLIILZL = false;
        Room room3 = this.LJLLI;
        if (room3 != null && (idStr = room3.getIdStr()) != null) {
            if (2 == C53799L9n.LIZ(idStr, "SLOT_BAG_BUBBLE_SHOW")) {
                C36746EbW.LIZ(4, "wait for bubble dismiss");
                C53799L9n.LIZIZ(idStr, "SLOT_BAG_BUBBLE_SHOW", this);
                return;
            } else if (5 == C53799L9n.LIZ(idStr, "SLOT_LIVE_WATCHER_TOOLBAR")) {
                C53799L9n.LIZIZ(idStr, "SLOT_LIVE_WATCHER_TOOLBAR", this);
                return;
            }
        }
        LJJIIJ(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001a, code lost:
    
        if ((r1 | r0) == false) goto L16;
     */
    @Override // X.AbstractC71187Rwl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIL(int r4) {
        /*
            r3 = this;
            boolean r0 = r3.LLIIL
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L1c
            X.Rvo r0 = X.InterfaceC71129Rvp.LJFF
            r0.getClass()
            if (r4 != r1) goto Lf
        Ld:
            r2 = 1
        Le:
            return r2
        Lf:
            r0 = 4
            if (r4 != r0) goto L2b
            r0 = 1
        L13:
            r1 = r2 | r0
            r0 = 5
            if (r4 != r0) goto L29
            r0 = 1
        L19:
            r1 = r1 | r0
            if (r1 != 0) goto Ld
        L1c:
            boolean r0 = r3.LLIIL
            if (r0 != 0) goto Le
            X.Rvo r0 = X.InterfaceC71129Rvp.LJFF
            r0.getClass()
            r0 = 2
            if (r4 != r0) goto L2d
            goto Ld
        L29:
            r0 = 0
            goto L19
        L2b:
            r0 = 0
            goto L13
        L2d:
            r0 = 3
            if (r4 != r0) goto L35
            r0 = 1
        L31:
            r0 = r0 | r2
            if (r0 == 0) goto Le
            goto Ld
        L35:
            r0 = 0
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71172RwW.LJIIL(int):boolean");
    }

    public final void LJJIIJ(boolean z) {
        Long l;
        int i;
        int i2;
        int i3;
        PopupCardVO popupCardVO = this.LLILII.LJLIL;
        String str = null;
        if (popupCardVO != null) {
            l = Long.valueOf(popupCardVO.getProductId());
        } else {
            l = null;
        }
        String valueOf = String.valueOf(l);
        Room room = this.LJLLI;
        if (room != null) {
            str = C17280m4.LIZ(room);
        }
        String LJIILLIIL = AbstractC71187Rwl.LJIILLIIL();
        boolean z2 = this.LLIIIJ;
        String role = LJIJ();
        boolean z3 = this.LJLLJ;
        o.LJIIIZ(role, "role");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("product_id", valueOf);
            jSONObject.put("room_id", str);
            jSONObject.put("author_id", LJIILLIIL);
            if (z2) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("has_ec_perm", i);
            jSONObject.put("live_role", role);
            if (z) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            jSONObject.put("is_waiting_coupon", i2);
            if (z3) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            jSONObject.put("is_page_visible", i3);
            C48658J7u.LIZIZ("rd_rd_tiktokec_live_pop_product_show_start", jSONObject);
        } catch (Exception unused) {
        }
        LJJIIJZLJL(true);
        C71184Rwi c71184Rwi = this.LLIL;
        c71184Rwi.LIZ.LLII.removeMessages(0);
        Handler handler = c71184Rwi.LIZ.LLII;
        C71174RwY.LIZ.getClass();
        handler.sendEmptyMessageDelayed(0, ((PinCardStyleConfig) C71174RwY.LIZJ.getValue()).showTime);
    }

    public final void LJJIIJZLJL(boolean z) {
        String str;
        boolean z2;
        int i;
        IFrameSlot.SlotViewModel slotViewModel;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setSlotVisible isVisible = ");
        LIZ.append(z);
        C36746EbW.LIZ(4, X1D.LIZIZ(LIZ));
        this.LLIILZL = false;
        if (this.LJLJI) {
            InterfaceC71145Rw5 interfaceC71145Rw5 = this.LJLJJI;
            if (interfaceC71145Rw5 != null) {
                interfaceC71145Rw5.LIZJ(this, z);
            }
        } else {
            IFrameSlot.SlotViewModel slotViewModel2 = this.LJLJLJ;
            if (slotViewModel2 != null) {
                C78897Uxp.LJJJJZI(slotViewModel2, z);
            }
        }
        Room room = this.LJLLI;
        Long l = null;
        if (room != null) {
            String valueOf = String.valueOf(room.getId());
            ViewModel viewModel = this.LJLIL;
            if ((viewModel instanceof IFrameSlot.SlotViewModel) && (slotViewModel = (IFrameSlot.SlotViewModel) viewModel) != null && (mutableLiveData = slotViewModel.LJLIL) != null && (value = mutableLiveData.getValue()) != null && o.LJ(value.first, Boolean.TRUE)) {
                i = 2;
            } else {
                i = 3;
            }
            C53799L9n.LIZLLL(i, valueOf, "SLOT_LIVE_BOTTOM_POP_L2_AUDIENCE");
        }
        if (z) {
            EnumC71173RwX enumC71173RwX = EnumC71173RwX.NOTIFY_SHOW;
            String LJIJ = LJIJ();
            Room room2 = this.LJLLI;
            if (room2 != null) {
                str = C17280m4.LIZ(room2);
            } else {
                str = null;
            }
            PopupCardVO popupCardVO = this.LLILII.LJLIL;
            if (popupCardVO != null) {
                l = Long.valueOf(popupCardVO.getProductId());
            }
            String valueOf2 = String.valueOf(l);
            boolean z3 = this.LJLLJ;
            boolean z4 = this.LLIIIZ;
            boolean z5 = this.LLIIIJ;
            PopupCardVO popupCardVO2 = this.LLILII.LJLIL;
            if (popupCardVO2 != null) {
                z2 = popupCardVO2.isFromMessage();
            } else {
                z2 = false;
            }
            C71161RwL.LIZ(enumC71173RwX, LJIJ, str, valueOf2, z3, z4, z5, z2);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void subscribeCouponFinishShow(IKA finishShowEvent) {
        o.LJIIIZ(finishShowEvent, "finishShowEvent");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("receive finishShowEvent waitingForShow = ");
        C1DI.LIZJ(LIZ, this.LLIILZL, LIZ, 4);
        this.LLIILII = true;
        if (this.LLIILZL) {
            this.LLIILZL = false;
            LJJIIJ(true);
        }
    }

    @Override // X.AbstractC71187Rwl
    /* renamed from: LJIL */
    public final void LLJJJJ(IFrameSlot.SlotViewModel viewModel, A72 slotGate) {
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(slotGate, "slotGate");
        EventBus.LIZJ().LJIILJJIL(this);
        super.LLJJJJ(viewModel, slotGate);
    }

    @Override // X.AbstractC71187Rwl, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final /* bridge */ /* synthetic */ void LLJJJJ(ViewModel viewModel, A72 a72) {
        LLJJJJ((IFrameSlot.SlotViewModel) viewModel, a72);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71172RwW(Context context, boolean z, boolean z2) {
        super(context, z);
        o.LJIIIZ(context, "context");
        this.LLIIL = z2;
        C71184Rwi c71184Rwi = new C71184Rwi(this, this, this.LJLJL);
        this.LLIL = c71184Rwi;
        C71124Rvk c71124Rvk = new C71124Rvk(c71184Rwi.LJI, this.LJLJL);
        c71124Rvk.LJLJJI = this;
        this.LLILII = c71124Rvk;
    }

    @Override // X.InterfaceC53800L9o
    public final void LJ(int i, String str, String roomId) {
        o.LJIIIZ(roomId, "roomId");
        StringBuilder LIZ = C06830Op.LIZ("wait for bubble show onStateChange = ", i, ", widgetName = ", str, " , roomId = ");
        LIZ.append(roomId);
        C36746EbW.LIZ(4, X1D.LIZIZ(LIZ));
        if (o.LJ(str, "SLOT_LIVE_WATCHER_TOOLBAR")) {
            if (5 != i) {
                C53799L9n.LJ(roomId, str, this);
                LJJIIJ(false);
                return;
            }
            return;
        }
        if (2 == i) {
            return;
        }
        C53799L9n.LJ(roomId, str, this);
        LJJIIJ(false);
    }
}
