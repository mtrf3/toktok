package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import kotlin.jvm.internal.o;

/* renamed from: X.Bzc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30596Bzc implements InterfaceC31687Cc7 {
    public final /* synthetic */ C30611Bzr LIZ;

    public C30596Bzc(C30611Bzr c30611Bzr) {
        this.LIZ = c30611Bzr;
    }

    @Override // X.InterfaceC31687Cc7
    public final void LIZ(View view, String str) {
        String str2;
        MutableLiveData<Boolean> mutableLiveData;
        this.LIZ.LJIIJ(null);
        C30611Bzr c30611Bzr = this.LIZ;
        if (c30611Bzr.LJLJL) {
            C30868C9o.LJI(c30611Bzr.LJLJLJ);
            return;
        }
        c30611Bzr.LJIILJJIL();
        ((IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class)).Ka0();
        C30611Bzr c30611Bzr2 = this.LIZ;
        Context context = c30611Bzr2.LJLJI;
        OSZ[] oszArr = new OSZ[5];
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) c30611Bzr2.LJLIL;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LJLIL) != null && o.LJ(mutableLiveData.getValue(), Boolean.TRUE)) {
            str2 = "icon";
        } else {
            str2 = "add_partnership";
        }
        oszArr[0] = new OSZ("btn_name", str2);
        oszArr[1] = new OSZ("user_type", "host");
        oszArr[2] = new OSZ("user_id", String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
        oszArr[3] = new OSZ("live_type", "video_live");
        oszArr[4] = new OSZ("page_name", "live_start");
        C24150x9.LIZ(context, C113554cx.LJJL(oszArr));
    }
}
