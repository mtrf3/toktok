package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Bzb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30595Bzb implements InterfaceC31687Cc7 {
    public final /* synthetic */ C30610Bzq LIZ;

    public C30595Bzb(C30610Bzq c30610Bzq) {
        this.LIZ = c30610Bzq;
    }

    @Override // X.InterfaceC31687Cc7
    public final void LIZ(View view, String str) {
        boolean z;
        String str2;
        MutableLiveData<Boolean> mutableLiveData;
        String str3;
        Long l;
        Room room = this.LIZ.LJLJJLL;
        if (room != null && C78897Uxp.LJJIJLIJ(room)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((IGamePartnershipService) CN1.LIZ(IGamePartnershipService.class)).Ka0();
            C30610Bzq c30610Bzq = this.LIZ;
            Context context = c30610Bzq.LJLJI;
            OSZ[] oszArr = new OSZ[5];
            if (c30610Bzq.LJLJJL) {
                str3 = "ad";
            } else {
                str3 = "normal";
            }
            oszArr[0] = new OSZ("live_traffic_source", str3);
            oszArr[1] = new OSZ("is_host", "1");
            Room room2 = c30610Bzq.LJLJJLL;
            if (room2 != null) {
                l = Long.valueOf(room2.getId());
            } else {
                l = null;
            }
            oszArr[2] = new OSZ("content_id", String.valueOf(l));
            oszArr[3] = new OSZ("is_landscape", CardStruct.IStatusCode.DEFAULT);
            oszArr[4] = new OSZ("live_type", "video_live");
            C24150x9.LJI(context, C113554cx.LJJL(oszArr));
        } else {
            C30868C9o.LIZJ(R.string.lb3);
        }
        C30610Bzq c30610Bzq2 = this.LIZ;
        c30610Bzq2.getClass();
        BZI LIZ = C28787BRn.LIZ("livesdk_gamepad_btn_click");
        LIZ.LJIJJ("video_live", "live_type");
        IIconSlot.SlotViewModel slotViewModel = (IIconSlot.SlotViewModel) c30610Bzq2.LJLIL;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LJLIL) != null && o.LJ(mutableLiveData.getValue(), Boolean.TRUE)) {
            str2 = "icon";
        } else {
            str2 = "add_partnership";
        }
        LIZ.LJIJJ(str2, "btn_name");
        LIZ.LJIJJ("host", "user_type");
        LIZ.LJIJJ("live_detail", "page_name");
        LIZ.LJIJJ(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()), "user_id");
        LIZ.LJJIIJZLJL();
    }
}
