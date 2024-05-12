package X;

import Y.AObserverS80S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.model.message.AtmosphereTagInfo;
import com.bytedance.android.livesdk.model.message.ProductAtmosphereTag;
import com.bytedance.android.livesdk.model.message.ProductSnapShot;
import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.android.livesdk.model.message.ext.PopProduct;
import com.bytedance.android.livesdk.model.message.ext.TraceInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.ecommercelive.business.common.data.AtmosphereTag;
import com.ss.android.ugc.aweme.ecommercelive.common.data.PopProductResp;
import com.ss.android.ugc.aweme.ecommercelive.common.data.Product;
import com.ss.android.ugc.aweme.ecommercelive.common.popcard.settings.PinCardStyleConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.popcard.vo.PopupCardVO;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS20S0200100_12;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Rwl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC71187Rwl extends AbstractC32179Ck3 implements InterfaceC27538ArO, InterfaceC63764P0u {
    public final Context LJLJJLL;
    public final C71195Rwt LJLJL;
    public IFrameSlot.SlotViewModel LJLJLJ;
    public A72 LJLJLLL;
    public final C48502J1u LJLL;
    public Room LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public Boolean LJLLL;
    public java.util.Map<String, String> LJLLLL;
    public java.util.Map<String, String> LJLLLLLL;
    public String LJLZ;
    public String LJZ;
    public String LJZI;
    public String LJZL;
    public String LL;
    public String LLD;
    public String LLF;
    public long LLFF;
    public long LLFFF;
    public long LLFII;
    public long LLFZ;
    public java.util.Map<String, String> LLI;
    public final C71200Rwy LLIFFJFJJ;
    public final Handler LLII;
    public final C71215RxD LLIIII;
    public String LLIIIILZ;
    public boolean LLIIIJ;
    public boolean LLIIIL;
    public boolean LLIIIZ;
    public Boolean LLIIJI;
    public final AObserverS80S0100000_12 LLIIJLIL;

    public static final String LJIILLIIL() {
        String currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
        if (currentUserID == null) {
            return "";
        }
        return currentUserID;
    }

    @Override // X.InterfaceC31710CcU
    public final String LIZ() {
        return "ec_shop";
    }

    public abstract void LJIIJJI();

    public abstract boolean LJIIL(int i);

    public abstract AbstractC71170RwU<?> LJIIZILJ();

    public abstract AbstractC71186Rwk LJIJI();

    public abstract boolean LJIJJ();

    public abstract boolean LJIJJLI();

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final boolean LLJJJJJIL() {
        return true;
    }

    @Override // X.InterfaceC71003Rtn, X.InterfaceC70849RrJ
    public final void fillNodeParams(C70858RrS c70858RrS) {
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final List<Integer> getMessageType() {
        return C47261Igj.LJJIJIL(10000);
    }

    @Override // X.InterfaceC37828Esy
    public final String getPageName() {
        return "pop_card";
    }

    @Override // X.InterfaceC37828Esy
    public final String getPageNameKey() {
        return "page_name";
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onPause() {
        this.LJLLJ = false;
        this.LJLL.LJIIIZ("is_page_visible", false);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onResume() {
        IFrameSlot.SlotViewModel slotViewModel;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        Long l;
        int i;
        this.LJLLJ = true;
        this.LJLL.LJIIIZ("is_page_visible", true);
        InterfaceC71145Rw5 interfaceC71145Rw5 = this.LJLJJI;
        if ((interfaceC71145Rw5 != null && !interfaceC71145Rw5.LJI(this)) || (slotViewModel = this.LJLJLJ) == null || (mutableLiveData = slotViewModel.LJLIL) == null || (value = mutableLiveData.getValue()) == null || !o.LJ(value.first, Boolean.TRUE)) {
            return;
        }
        if (LJIIZILJ().LJLJI != 0) {
            if (!(LJIIZILJ().LJLJI instanceof AbstractC71212RxA)) {
                return;
            }
            T t = LJIIZILJ().LJLJI;
            o.LJII(t, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommercelive.common.popcard.view.PopCardBaseView");
            if (((AbstractC71212RxA) t).LJLIL) {
                return;
            }
        }
        PopupCardVO popupCardVO = LJIIZILJ().LJLIL;
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
        String LJIILLIIL = LJIILLIIL();
        boolean z = this.LLIIIJ;
        boolean z2 = this.LLIIIL;
        String role = LJIJ();
        o.LJIIIZ(role, "role");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("product_id", valueOf);
            jSONObject.put("room_id", str);
            jSONObject.put("author_id", LJIILLIIL);
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("has_ec_perm", i);
            jSONObject.put("is_anchor", z2 ? 1 : 0);
            jSONObject.put("live_role", role);
            C48658J7u.LIZIZ("rd_tiktokec_live_pop_product_resume", jSONObject);
        } catch (Exception unused) {
        }
    }

    public final boolean LJIILL() {
        String str;
        if (o.LJ(this.LJLLL, Boolean.TRUE)) {
            return true;
        }
        java.util.Map<String, String> map = this.LJLLLL;
        if (map != null) {
            str = map.get("is_pseudo_ad");
        } else {
            str = null;
        }
        if (o.LJ(str, "1")) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC63764P0u
    public final void onAppBackground() {
        IFrameSlot.SlotViewModel slotViewModel;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        InterfaceC71145Rw5 interfaceC71145Rw5 = this.LJLJJI;
        if ((interfaceC71145Rw5 != null && !interfaceC71145Rw5.LJI(this)) || (slotViewModel = this.LJLJLJ) == null || (mutableLiveData = slotViewModel.LJLIL) == null || (value = mutableLiveData.getValue()) == null || !o.LJ(value.first, Boolean.TRUE)) {
            return;
        }
        C71195Rwt c71195Rwt = this.LJLJL;
        c71195Rwt.getClass();
        c71195Rwt.LJIIIIZZ = "close";
        C71195Rwt c71195Rwt2 = this.LJLJL;
        if (c71195Rwt2.LJ || !c71195Rwt2.LIZJ || !c71195Rwt2.LIZLLL) {
            return;
        }
        c71195Rwt2.LIZLLL = false;
        c71195Rwt2.LIZ();
    }

    @Override // X.InterfaceC63764P0u
    public final void onAppForeground() {
        IFrameSlot.SlotViewModel slotViewModel;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        InterfaceC71145Rw5 interfaceC71145Rw5 = this.LJLJJI;
        if ((interfaceC71145Rw5 != null && !interfaceC71145Rw5.LJI(this)) || (slotViewModel = this.LJLJLJ) == null || (mutableLiveData = slotViewModel.LJLIL) == null || (value = mutableLiveData.getValue()) == null || !o.LJ(value.first, Boolean.TRUE)) {
            return;
        }
        C71195Rwt c71195Rwt = this.LJLJL;
        if (c71195Rwt.LJ || !c71195Rwt.LIZJ || c71195Rwt.LIZLLL) {
            return;
        }
        c71195Rwt.LIZLLL = true;
        c71195Rwt.LIZIZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b1, code lost:
    
        if (((X.AbstractC71212RxA) r1).LJLIL == false) goto L34;
     */
    @Override // X.AbstractC32179Ck3, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDestroy() {
        /*
            r12 = this;
            boolean r0 = r12.LJLLILLLL
            r3 = 1
            r2 = 0
            if (r0 != 0) goto L10
            X.Rw5 r0 = r12.LJLJJI
            if (r0 == 0) goto L76
            boolean r0 = r0.LJI(r12)
            if (r0 != 0) goto L76
        L10:
            com.bytedance.android.live.slot.IFrameSlot$SlotViewModel r0 = r12.LJLJLJ
            if (r0 == 0) goto L1d
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r1 = r0.LJLJJI
            if (r1 == 0) goto L1d
            Y.AObserverS80S0100000_12 r0 = r12.LLIIJLIL
            r1.removeObserver(r0)
        L1d:
            r12.LJLLILLLL = r3
            r12.LJLJJI = r2
            android.os.Handler r0 = r12.LLII
            r0.removeCallbacksAndMessages(r2)
            X.RwU r0 = r12.LJIIZILJ()
            r0.LJIIIIZZ()
            X.Rwk r0 = r12.LJIJI()
            r0.LIZIZ()
            X.RwU r0 = r12.LJIIZILJ()
            r0.getClass()
            com.ss.android.ugc.aweme.utils.ActivityStack.removeAppBackGroundListener(r12)
            X.Rwt r0 = r12.LJLJL
            r0.LIZ = r2
            android.content.Context r1 = r12.LJLJJLL
            boolean r0 = r1 instanceof X.ActivityC45651qj
            if (r0 == 0) goto L53
            X.1qj r1 = (X.ActivityC45651qj) r1
            androidx.fragment.app.FragmentManager r1 = r1.getSupportFragmentManager()
            X.RxD r0 = r12.LLIIII
            r1.LJLJJLL(r0)
        L53:
            org.greenrobot.eventbus.EventBus r1 = org.greenrobot.eventbus.EventBus.LIZJ()
            java.lang.Class<X.2lp> r0 = X.C68092lp.class
            r1.LJIILL(r0)
            X.Rwy r3 = r12.LLIFFJFJJ
            java.util.concurrent.ConcurrentLinkedDeque<X.RxG> r0 = r3.LIZ
            java.util.Iterator r1 = r0.iterator()
        L64:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Le8
            java.lang.Object r0 = r1.next()
            X.RxG r0 = (X.C71218RxG) r0
            X.V4o r0 = r0.LJLILLLLZI
            r0.LIZIZ(r2)
            goto L64
        L76:
            com.bytedance.android.live.slot.IFrameSlot$SlotViewModel r0 = r12.LJLJLJ
            if (r0 == 0) goto L10
            androidx.lifecycle.MutableLiveData<android.util.Pair<java.lang.Boolean, java.lang.String>> r0 = r0.LJLIL
            if (r0 == 0) goto L10
            java.lang.Object r0 = r0.getValue()
            android.util.Pair r0 = (android.util.Pair) r0
            if (r0 == 0) goto L10
            java.lang.Object r1 = r0.first
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L10
            X.RwU r0 = r12.LJIIZILJ()
            T extends android.view.View r0 = r0.LJLJI
            if (r0 == 0) goto Lb3
            X.RwU r0 = r12.LJIIZILJ()
            T extends android.view.View r0 = r0.LJLJI
            boolean r0 = r0 instanceof X.AbstractC71212RxA
            if (r0 == 0) goto L10
            X.RwU r0 = r12.LJIIZILJ()
            T extends android.view.View r1 = r0.LJLJI
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommercelive.common.popcard.view.PopCardBaseView"
            kotlin.jvm.internal.o.LJII(r1, r0)
            X.RxA r1 = (X.AbstractC71212RxA) r1
            boolean r0 = r1.LJLIL
            if (r0 != 0) goto L10
        Lb3:
            X.RwU r0 = r12.LJIIZILJ()
            com.ss.android.ugc.aweme.ecommercelive.common.popcard.vo.PopupCardVO r0 = r0.LJLIL
            if (r0 == 0) goto Le6
            long r0 = r0.getProductId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        Lc3:
            java.lang.String r4 = java.lang.String.valueOf(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r12.LJLLI
            if (r0 == 0) goto Le4
            java.lang.String r5 = X.C17280m4.LIZ(r0)
        Lcf:
            java.lang.String r6 = LJIILLIIL()
            java.lang.String r7 = "destroy"
            boolean r8 = r12.LLIIIJ
            boolean r9 = r12.LLIIIL
            java.lang.String r10 = r12.LJIJ()
            boolean r11 = r12.LJLLJ
            X.C71162RwM.LJ(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L10
        Le4:
            r5 = r2
            goto Lcf
        Le6:
            r0 = r2
            goto Lc3
        Le8:
            java.util.concurrent.ConcurrentLinkedDeque<X.RxG> r0 = r3.LIZ
            r0.clear()
            java.util.concurrent.ConcurrentLinkedDeque<X.RxT> r0 = r3.LIZIZ
            r0.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC71187Rwl.onDestroy():void");
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onStart() {
        IFrameSlot.SlotViewModel slotViewModel;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        InterfaceC71145Rw5 interfaceC71145Rw5 = this.LJLJJI;
        if ((interfaceC71145Rw5 != null && !interfaceC71145Rw5.LJI(this)) || (slotViewModel = this.LJLJLJ) == null || (mutableLiveData = slotViewModel.LJLIL) == null || (value = mutableLiveData.getValue()) == null || !o.LJ(value.first, Boolean.TRUE)) {
            return;
        }
        this.LJLL.LJI(System.currentTimeMillis(), "start_time");
        LJIIZILJ().getClass();
        C71195Rwt c71195Rwt = this.LJLJL;
        if (c71195Rwt.LJ || !c71195Rwt.LIZLLL || c71195Rwt.LIZJ) {
            return;
        }
        c71195Rwt.LIZJ = true;
        c71195Rwt.LIZIZ();
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onStop() {
        IFrameSlot.SlotViewModel slotViewModel;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        InterfaceC71145Rw5 interfaceC71145Rw5 = this.LJLJJI;
        if ((interfaceC71145Rw5 != null && !interfaceC71145Rw5.LJI(this)) || (slotViewModel = this.LJLJLJ) == null || (mutableLiveData = slotViewModel.LJLIL) == null || (value = mutableLiveData.getValue()) == null || !o.LJ(value.first, Boolean.TRUE)) {
            return;
        }
        LJJII("other");
        LJIIZILJ().getClass();
        C71195Rwt c71195Rwt = this.LJLJL;
        if (c71195Rwt.LJ || !c71195Rwt.LIZLLL || !c71195Rwt.LIZJ) {
            return;
        }
        c71195Rwt.LIZJ = false;
        c71195Rwt.LIZ();
    }

    public final void LJIILIIL() {
        String str;
        C71218RxG pollLast;
        AbstractC71186Rwk LJIJI = LJIJI();
        Room room = this.LJLLI;
        if (room != null) {
            str = C17280m4.LIZ(room);
        } else {
            str = null;
        }
        LJIJI.LJIIIIZZ(str, null);
        LJIIZILJ().getClass();
        LJIJI().LIZ("unpin");
        C71195Rwt c71195Rwt = this.LJLJL;
        c71195Rwt.getClass();
        c71195Rwt.LJIIIIZZ = "unpin";
        C71200Rwy c71200Rwy = this.LLIFFJFJJ;
        if (c71200Rwy.LIZIZ.size() > 0) {
            C71231RxT peekLast = c71200Rwy.LIZIZ.peekLast();
            if (peekLast != null) {
                peekLast.LJLILLLLZI = true;
                return;
            }
            return;
        }
        if (c71200Rwy.LIZ.size() <= 0 || (pollLast = c71200Rwy.LIZ.pollLast()) == null) {
            return;
        }
        pollLast.LJLILLLLZI.LIZIZ(null);
        c71200Rwy.LIZ.remove(pollLast);
    }

    public final String LJIJ() {
        EnumC71217RxF enumC71217RxF;
        if (LJIJJ()) {
            enumC71217RxF = EnumC71217RxF.ROOM_OWNER;
        } else if (this.LLIIIL) {
            enumC71217RxF = EnumC71217RxF.ANCHOR_AS_AUDIENCE;
        } else {
            enumC71217RxF = EnumC71217RxF.AUDIENCE;
        }
        return enumC71217RxF.getRoleStr();
    }

    @Override // X.InterfaceC31710CcU
    public final Object LLJJJIL() {
        return LJIIZILJ();
    }

    @Override // X.InterfaceC37828Esy
    public final java.util.Map<String, String> getMapRule() {
        return C70567Rml.LIZIZ;
    }

    @Override // X.InterfaceC71003Rtn
    public final List<String> getRegisteredLane() {
        return C70567Rml.LIZ;
    }

    @Override // X.InterfaceC71003Rtn
    public final InterfaceC71003Rtn preTrackNode() {
        return this.LJLJJL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0167, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0191 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d7  */
    @Override // X.AbstractC32179Ck3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean LJIIIZ(java.util.Map<java.lang.String, java.lang.Object> r23) {
        /*
            Method dump skipped, instructions count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC71187Rwl.LJIIIZ(java.util.Map):boolean");
    }

    public final void LJIILJJIL(boolean z) {
        Long l = null;
        if (!this.LLIIIJ) {
            Room room = this.LJLLI;
            if (room != null) {
                l = Long.valueOf(room.getId());
            }
            C71150RwA.LIZ(String.valueOf(l), LJIJ(), "no_ec_perm", z);
            return;
        }
        if (LJIJJ() || C71150RwA.LIZ != 0) {
            return;
        }
        Room room2 = this.LJLLI;
        if (room2 != null) {
            l = Long.valueOf(room2.getId());
        }
        C71150RwA.LIZ(String.valueOf(l), LJIJ(), "no_product", z);
    }

    public final void LJJIFFI(boolean z) {
        String str;
        int i;
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.LLFF;
        long j2 = currentTimeMillis - j;
        long j3 = this.LLFFF;
        long j4 = j3 - j;
        long j5 = this.LLFII;
        long j6 = j5 - j3;
        long j7 = this.LLFZ - j5;
        long currentTimeMillis2 = System.currentTimeMillis() - this.LLFZ;
        Room room = this.LJLLI;
        if (room != null) {
            str = room.getIdStr();
        } else {
            str = null;
        }
        String LJIJ = LJIJ();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("room_id", str);
            jSONObject.put("total_duration", j2);
            jSONObject.put("before_enter_room_interface_duration", j4);
            jSONObject.put("enter_room_interface_duration", j6);
            jSONObject.put("live_process_data_duration", j7);
            jSONObject.put("ec_process_data_duration", currentTimeMillis2);
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_prefetch", i);
            jSONObject.put("live_role", LJIJ);
            C48658J7u.LIZIZ("rd_tiktokec_live_pop_product_show", jSONObject);
        } catch (Exception unused) {
        }
    }

    public final void LJJII(String str) {
        this.LJLL.LJII("quit_type", str, false);
        this.LJLL.LJI(System.currentTimeMillis() - this.LJLL.LIZ("start_time"), "stay_time");
        LJIJI().LJFF(str);
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onCreate(Bundle bundle) {
        ActivityStack.addAppBackGroundListener(this);
        this.LJLJL.LIZ = new WeakReference<>(this);
        Context context = this.LJLJJLL;
        if (context instanceof ActivityC45651qj) {
            ((ActivityC45651qj) context).getSupportFragmentManager().LJJLIL(this.LLIIII, true);
        }
    }

    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    public final void onMessage(IMessage iMessage) {
        String str;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        PopupCardVO popupCardVO;
        ProductSnapShot productSnapShot;
        PopupCardVO popupCardVO2;
        ProductSnapShot productSnapShot2;
        com.bytedance.android.livesdk.model.message.Img img;
        List<ProductAtmosphereTag> list;
        AtmosphereTag atmosphereTag;
        PopupCardVO popupCardVO3;
        List<AtmosphereTag> atmosphereTags;
        List<AtmosphereTag> atmosphereTags2;
        List<AtmosphereTag> atmosphereTags3;
        long j;
        String str2;
        Long l;
        Long l2;
        String str3;
        String idStr;
        if (iMessage instanceof ECommerceMessage) {
            Room room = this.LJLLI;
            com.bytedance.android.livesdk.model.message.Img img2 = null;
            if (room != null) {
                str = C17280m4.LIZ(room);
            } else {
                str = null;
            }
            ECommerceMessage message = (ECommerceMessage) iMessage;
            String LJIJ = LJIJ();
            o.LJIIIZ(message, "message");
            try {
                JSONObject jSONObject = new JSONObject();
                if (str != null) {
                    jSONObject.put("room_id", str);
                }
                TraceInfo traceInfo = message.traceInfo;
                if (traceInfo != null) {
                    jSONObject.put("total_duration", System.currentTimeMillis() - traceInfo.sendTime);
                }
                jSONObject.put("message_type", message.actionType);
                jSONObject.put("live_role", LJIJ);
                C48658J7u.LIZIZ("rd_ec_pin_card_message_receive", jSONObject);
            } catch (Exception unused) {
            }
            int i = message.actionType;
            boolean z = false;
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        String str4 = "";
                        if (i != 5) {
                            if (i != 7) {
                                if (i != 8) {
                                    if (i != 9) {
                                        return;
                                    }
                                    C52258Kf8.LIZ.getClass();
                                    if (!C52258Kf8.LIZ()) {
                                        return;
                                    }
                                    this.LLIIIJ = true;
                                    XKX.LIZLLL(C48841JEv.LIZ(C36576EXc.LIZJ), null, null, new C71211Rx9(this, null), 3);
                                    return;
                                }
                                C52258Kf8.LIZ.getClass();
                                if (!C52258Kf8.LIZ()) {
                                    return;
                                }
                                this.LLIIIJ = false;
                                LJIILIIL();
                                return;
                            }
                            AtmosphereTagInfo atmosphereTagInfo = message.atmosphereTagInfo;
                            if (atmosphereTagInfo == null) {
                                return;
                            }
                            Room room2 = this.LJLLI;
                            if ((room2 != null && (idStr = room2.getIdStr()) != null && !LJIIJ(atmosphereTagInfo.tagType, idStr)) || (list = atmosphereTagInfo.atmosphereTags) == null || list.isEmpty()) {
                                return;
                            }
                            List<ProductAtmosphereTag> list2 = atmosphereTagInfo.atmosphereTags;
                            ArrayList arrayList = new ArrayList();
                            for (ProductAtmosphereTag productAtmosphereTag : list2) {
                                ProductAtmosphereTag productAtmosphereTag2 = productAtmosphereTag;
                                if (productAtmosphereTag2 != null && (str3 = productAtmosphereTag2.productId) != null) {
                                    l = Long.valueOf(CastLongProtector.parseLong(str3));
                                } else {
                                    l = null;
                                }
                                PopupCardVO popupCardVO4 = LJIIZILJ().LJLIL;
                                if (popupCardVO4 != null) {
                                    l2 = Long.valueOf(popupCardVO4.getProductId());
                                } else {
                                    l2 = null;
                                }
                                if (o.LJ(l, l2)) {
                                    arrayList.add(productAtmosphereTag);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                atmosphereTag = new AtmosphereTag();
                                atmosphereTag.tagType = atmosphereTagInfo.tagType;
                                ProductAtmosphereTag productAtmosphereTag3 = (ProductAtmosphereTag) ORZ.LJLLLLLL(0, arrayList);
                                if (productAtmosphereTag3 != null && (str2 = productAtmosphereTag3.tagDesc) != null) {
                                    str4 = str2;
                                }
                                atmosphereTag.tagDesc = str4;
                                ProductAtmosphereTag productAtmosphereTag4 = (ProductAtmosphereTag) ORZ.LJLLLLLL(0, arrayList);
                                if (productAtmosphereTag4 != null) {
                                    j = productAtmosphereTag4.count;
                                } else {
                                    j = 0;
                                }
                                atmosphereTag.count = j;
                                PopupCardVO popupCardVO5 = LJIIZILJ().LJLIL;
                                if (popupCardVO5 != null) {
                                    popupCardVO5.getProductId();
                                }
                            } else {
                                atmosphereTag = null;
                            }
                            int i2 = atmosphereTagInfo.tagType;
                            if (i2 != 1 && i2 != 2 && i2 != 3) {
                                return;
                            }
                            PopupCardVO popupCardVO6 = LJIIZILJ().LJLIL;
                            if (popupCardVO6 != null && (atmosphereTags2 = popupCardVO6.getAtmosphereTags()) != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (AtmosphereTag atmosphereTag2 : atmosphereTags2) {
                                    if (atmosphereTag2.tagType == i2) {
                                        arrayList2.add(atmosphereTag2);
                                    }
                                }
                                Iterator it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    PopupCardVO popupCardVO7 = LJIIZILJ().LJLIL;
                                    if (popupCardVO7 != null && (atmosphereTags3 = popupCardVO7.getAtmosphereTags()) != null) {
                                        atmosphereTags3.remove(next);
                                    }
                                }
                            }
                            if (atmosphereTag != null && (popupCardVO3 = LJIIZILJ().LJLIL) != null && (atmosphereTags = popupCardVO3.getAtmosphereTags()) != null) {
                                atmosphereTags.add(atmosphereTag);
                            }
                            XKX.LIZLLL(C48841JEv.LIZ(C36576EXc.LIZJ), null, null, new C71206Rx4(this, atmosphereTagInfo, atmosphereTag, null), 3);
                            return;
                        }
                        C71174RwY.LIZ.getClass();
                        if (!((PinCardStyleConfig) C71174RwY.LIZJ.getValue()).realTimeRefresh || (popupCardVO2 = LJIIZILJ().LJLIL) == null || (productSnapShot2 = message.productSnapShot) == null) {
                            return;
                        }
                        if (!o.LJ(productSnapShot2.productId, String.valueOf(popupCardVO2.getProductId()))) {
                            C36746EbW.LIZ(5, "not current product , no need refresh");
                            return;
                        }
                        if (C78857UxB.LJJJIL(productSnapShot2.title)) {
                            String str5 = productSnapShot2.title;
                            o.LJIIIIZZ(str5, "it.title");
                            popupCardVO2.setTitle(str5);
                        }
                        if (!popupCardVO2.getHasElasticImg() && (img = productSnapShot2.cover) != null && C78857UxB.LJJJIL(img.url)) {
                            String str6 = img.url;
                            o.LJIIIIZZ(str6, "cover.url");
                            popupCardVO2.setImageUrl(str6);
                            String str7 = img.key;
                            if (str7 != null) {
                                str4 = str7;
                            }
                            popupCardVO2.setImageUrlKey(str4);
                            img2 = img;
                        }
                        ((AbstractC71189Rwn) LJIIZILJ()).LJJJJZ(productSnapShot2.title, img2);
                        return;
                    }
                    C71174RwY.LIZ.getClass();
                    if (!((PinCardStyleConfig) C71174RwY.LIZJ.getValue()).realTimeRefresh || (popupCardVO = LJIIZILJ().LJLIL) == null || (productSnapShot = message.productSnapShot) == null) {
                        return;
                    }
                    if (!o.LJ(productSnapShot.productId, String.valueOf(popupCardVO.getProductId()))) {
                        C36746EbW.LIZ(5, "not current product , no need refresh");
                        return;
                    }
                    int i3 = productSnapShot.stockType;
                    if (i3 != 1) {
                        if (i3 != 2) {
                            return;
                        } else {
                            popupCardVO.setProductStatus(90);
                        }
                    } else {
                        popupCardVO.setProductStatus(80);
                    }
                    AbstractC71170RwU<?> LJIIZILJ = LJIIZILJ();
                    if (1 == productSnapShot.stockType) {
                        z = true;
                    }
                    ((AbstractC71189Rwn) LJIIZILJ).LJJLIIIIJ(z);
                    return;
                }
                LJIILIIL();
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.LJLL.LJI(System.currentTimeMillis(), "client_received_time");
            C34K c34k = new C34K();
            IFrameSlot.SlotViewModel slotViewModel = this.LJLJLJ;
            if (slotViewModel != null && (mutableLiveData = slotViewModel.LJLIL) != null && (value = mutableLiveData.getValue()) != null && o.LJ(value.first, Boolean.TRUE)) {
                c34k.element = true;
            }
            LJIIZILJ().getClass();
            LJIJI().LIZ("repin");
            C71195Rwt c71195Rwt = this.LJLJL;
            c71195Rwt.getClass();
            c71195Rwt.LJIIIIZZ = "repin";
            if (((Boolean) C52664Klg.LIZ.getValue()).booleanValue()) {
                C71200Rwy c71200Rwy = this.LLIFFJFJJ;
                ViewModel slotViewModel2 = this.LJLIL;
                o.LJIIIIZZ(slotViewModel2, "slotViewModel");
                c71200Rwy.LIZ(ViewModelKt.getViewModelScope(slotViewModel2), message, new AqS20S0200100_12(iMessage, currentTimeMillis, this, 0));
                return;
            }
            XKX.LIZLLL(C48841JEv.LIZ(C36576EXc.LIZJ), null, null, new C71198Rww(c34k, this, iMessage, currentTimeMillis, null), 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC71187Rwl(Context context, boolean z) {
        super(z);
        o.LJIIIZ(context, "context");
        this.LJLJJLL = context;
        this.LJLJL = new C71195Rwt();
        this.LJLL = new C48502J1u(AbstractC71187Rwl.class.getName());
        this.LJLLL = Boolean.FALSE;
        this.LJLLLL = new HashMap();
        this.LLI = new HashMap();
        this.LLIFFJFJJ = new C71200Rwy();
        this.LLII = new Handler(new C71213RxB(this));
        this.LLIIII = new C71215RxD(this);
        this.LLIIIILZ = "";
        this.LLIIJLIL = new AObserverS80S0100000_12(this, 152);
    }

    public final boolean LJIIJ(int i, String str) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return true;
                }
                return C71023Ru7.LIZJ(str, true);
            }
            return C71023Ru7.LIZIZ(str, true);
        }
        return C71023Ru7.LIZ(str, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x020c, code lost:
    
        if (r2 == null) goto L91;
     */
    @Override // com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC31710CcU
    /* renamed from: LJIL, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LLJJJJ(com.bytedance.android.live.slot.IFrameSlot.SlotViewModel r19, X.A72 r20) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC71187Rwl.LLJJJJ(com.bytedance.android.live.slot.IFrameSlot$SlotViewModel, X.A72):void");
    }

    @Override // X.InterfaceC27538ArO
    public final void setupTrack(View view, LifecycleOwner lifecycleOwner) {
        C70853RrN.LIZ(this, view, lifecycleOwner);
    }

    public static /* synthetic */ void LJJI(AbstractC71187Rwl abstractC71187Rwl, PopProductResp popProductResp, boolean z, boolean z2, int i) {
        boolean z3 = z2;
        if ((i & 16) != 0) {
            z3 = false;
        }
        abstractC71187Rwl.LJJ(popProductResp, z, true, null, z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.Rx3] */
    public static void LJJIII(AbstractC71187Rwl abstractC71187Rwl, boolean z, ECommerceMessage eCommerceMessage, boolean z2, int i) {
        String str;
        PopProduct popProduct;
        ECommerceMessage eCommerceMessage2 = eCommerceMessage;
        boolean z3 = z2;
        if ((i & 2) != 0) {
            eCommerceMessage2 = null;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        abstractC71187Rwl.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (C00F.LIZ(31744, 0, "pin_card_use_product_id", true) == 1 && eCommerceMessage2 != null && (popProduct = eCommerceMessage2.popProduct) != null) {
            str = Long.valueOf(popProduct.productId).toString();
        } else {
            str = null;
        }
        C71200Rwy c71200Rwy = abstractC71187Rwl.LLIFFJFJJ;
        C71193Rwr c71193Rwr = new C71193Rwr(currentTimeMillis, abstractC71187Rwl, eCommerceMessage2, z, z3);
        c71200Rwy.getClass();
        if (eCommerceMessage2 != null) {
            c71193Rwr = new C71205Rx3(c71200Rwy, c71193Rwr, eCommerceMessage2);
        }
        XKX.LIZLLL(C48841JEv.LIZ(C36576EXc.LIZIZ), null, null, new C71192Rwq(abstractC71187Rwl, str, c71193Rwr, z3, eCommerceMessage2, null), 3);
    }

    public final void LJJ(PopProductResp popProductResp, boolean z, boolean z2, ECommerceMessage eCommerceMessage, boolean z3) {
        String str;
        boolean z4;
        Room room;
        String idStr;
        String str2;
        String str3;
        boolean z5;
        Product product = popProductResp.product;
        String str4 = null;
        if (product != null) {
            String str5 = product.productId;
            Room room2 = this.LJLLI;
            if (room2 != null) {
                str2 = C17280m4.LIZ(room2);
            } else {
                str2 = null;
            }
            C71162RwM.LJFF(str5, str2, LJIILLIIL(), CardStruct.IStatusCode.DEFAULT, LJIJ(), ActivityStack.isAppBackGround(), this.LJLLJ, this.LLIIIJ, this.LLIIIL);
            EnumC71173RwX enumC71173RwX = EnumC71173RwX.ON_DATA_READY;
            String LJIJ = LJIJ();
            Room room3 = this.LJLLI;
            if (room3 != null) {
                str3 = C17280m4.LIZ(room3);
            } else {
                str3 = null;
            }
            String str6 = product.productId;
            boolean z6 = this.LJLLJ;
            boolean z7 = this.LLIIIZ;
            boolean z8 = this.LLIIIJ;
            if (eCommerceMessage != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            C71161RwL.LIZ(enumC71173RwX, LJIJ, str3, str6, z6, z7, z8, z5);
        }
        EnumC71173RwX enumC71173RwX2 = EnumC71173RwX.ON_SLOT_CREATED_FROM_RESPONSE;
        String LJIJ2 = LJIJ();
        Room room4 = this.LJLLI;
        if (room4 != null) {
            str = C17280m4.LIZ(room4);
        } else {
            str = null;
        }
        Product product2 = popProductResp.product;
        if (product2 != null) {
            str4 = product2.productId;
        }
        boolean z9 = this.LJLLJ;
        boolean z10 = this.LLIIIZ;
        boolean z11 = this.LLIIIJ;
        if (eCommerceMessage != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        C71161RwL.LIZ(enumC71173RwX2, LJIJ2, str, str4, z9, z10, z11, z4);
        Product product3 = popProductResp.product;
        if (product3 != null) {
            C71196Rwu c71196Rwu = PopupCardVO.Companion;
            long j = popProductResp.LIZ;
            long j2 = popProductResp.serverTime;
            Boolean bool = popProductResp.assistantSwitch;
            c71196Rwu.getClass();
            PopupCardVO LIZ = C71196Rwu.LIZ(product3, j, j2, bool);
            if (eCommerceMessage != null) {
                LIZ.fromMessage(eCommerceMessage);
            }
            LIZ.setBagIndex(popProductResp.bagIndex);
            LIZ.setLiveBagAndPinCardType(popProductResp.liveBagAndPinCardType);
            List<AtmosphereTag> list = popProductResp.atmosphereTags;
            if (list != null) {
                for (AtmosphereTag atmosphereTag : list) {
                    if (atmosphereTag != null && ((room = this.LJLLI) == null || (idStr = room.getIdStr()) == null || LJIIJ(atmosphereTag.tagType, idStr))) {
                        o.LJIIIZ(popProductResp.product.productId, "<set-?>");
                        LIZ.getAtmosphereTags().add(atmosphereTag);
                    }
                }
            }
            int LJIIL = C43001GuD.LJIIL(LJIIZILJ().LJLILLLLZI);
            C70870Rre.LIZ(Integer.valueOf(LJIIL), Integer.valueOf(LJIIL), product3.LIZ());
            LJIIZILJ().LJIIZILJ(LIZ);
            LJIJI().LIZLLL(popProductResp, z, z2, z3);
            C71195Rwt c71195Rwt = this.LJLJL;
            c71195Rwt.LJI = true;
            c71195Rwt.LJII = System.currentTimeMillis();
            c71195Rwt.LJFF = false;
        }
    }
}
