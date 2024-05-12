package X;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.slot.AbsSlotWidget;
import com.bytedance.android.live.slot.IIconSlot;
import com.ss.android.ugc.aweme.live.slot.SlotsBottomSheetDialog;
import com.ss.android.ugc.aweme.services.BaseUserService;

/* renamed from: X.Ccu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31736Ccu implements InterfaceC31687Cc7 {
    public final /* synthetic */ C31739Ccx LIZ;

    public C31736Ccu(C31739Ccx c31739Ccx) {
        this.LIZ = c31739Ccx;
    }

    @Override // X.InterfaceC31687Cc7
    public final void LIZ(View view, String str) {
        ActivityC45651qj LJJIFFI;
        C31739Ccx c31739Ccx = this.LIZ;
        if (c31739Ccx.LIZ == null) {
            C31735Cct c31735Cct = this.LIZ.LIZIZ;
            c31739Ccx.LIZ = new SlotsBottomSheetDialog(c31735Cct.LJLJLJ, c31735Cct.LJLL);
            C31739Ccx c31739Ccx2 = this.LIZ;
            c31739Ccx2.LIZ.LJLIL = c31739Ccx2.LIZIZ.LJLIL;
        }
        if (!this.LIZ.LIZ.isShowing()) {
            A72 a72 = this.LIZ.LIZIZ.LJLJJI;
            if (a72 != null && (LJJIFFI = C45804HyK.LJJIFFI(a72.getContext())) != null) {
                SlotsBottomSheetDialog slotsBottomSheetDialog = this.LIZ.LIZ;
                FragmentManager supportFragmentManager = LJJIFFI.getSupportFragmentManager();
                this.LIZ.getClass();
                slotsBottomSheetDialog.show(supportFragmentManager, "GroupIconSlot");
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("anchor_id", BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID());
            c188727au.LJIIIZ("room_id", this.LIZ.LIZIZ.LJLL.LIZ());
            c188727au.LJIIIZ("live_status", this.LIZ.LIZIZ.LJLL.LIZLLL);
            c188727au.LJIIIZ("icon_type", "Business");
            c188727au.LJIIIZ("enter_from_merge", this.LIZ.LIZIZ.LJLL.LIZ);
            c188727au.LJIIIZ("enter_method", this.LIZ.LIZIZ.LJLL.LIZIZ);
            FMX.LJIIL("livesdk_business_icon_click", c188727au.LIZ);
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("author_id", BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID());
            c188727au2.LJIIIZ("room_id", this.LIZ.LIZIZ.LJLL.LIZ());
            c188727au2.LJIIIZ("EVENT_ORIGIN_FEATURE", "TEMAI");
            c188727au2.LJIIIZ("live_status", this.LIZ.LIZIZ.LJLL.LIZLLL);
            FMX.LJIIL("livesdk_tiktokec_business_icon_click", c188727au2.LIZ);
            for (InterfaceC31710CcU interfaceC31710CcU : this.LIZ.LIZIZ.LJLLI.keySet()) {
                if (interfaceC31710CcU instanceof AbsSlotWidget) {
                    ((AbsSlotWidget) interfaceC31710CcU).onAggregateClick();
                }
            }
        }
        C31735Cct c31735Cct2 = this.LIZ.LIZIZ;
        if (c31735Cct2.LJLJL) {
            IIconSlot.SlotViewModel slotViewModel = c31735Cct2.LJLJI;
            if (slotViewModel != null) {
                slotViewModel.LJLJJL.postValue(Boolean.FALSE);
            }
            this.LIZ.LIZIZ.LJLJL = false;
        }
    }
}
