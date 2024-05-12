package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.live.LiveOuterService;

/* renamed from: X.RxM, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71224RxM extends A73 {
    public final /* synthetic */ C71219RxH LJ;

    public C71224RxM(C71219RxH c71219RxH) {
        this.LJ = c71219RxH;
    }

    @Override // X.A73
    public final void LIZIZ(String str) {
        MutableLiveData<String> mutableLiveData;
        C71219RxH c71219RxH = this.LJ;
        if (c71219RxH.LJLLL) {
            c71219RxH.LJIJ(null, true);
        } else {
            c71219RxH.LJIILL();
            Room room = this.LJ.LJZ;
            if (room != null) {
                LiveOuterService.LJJJLL().LJJJJZ(room.getId());
            }
        }
        IIconSlot.SlotViewModel slotViewModel = this.LJ.LJLJJLL;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LJLLJ) != null) {
            mutableLiveData.setValue("");
        }
        C71202Rx0.LIZJ(this.LJ.LJLJLJ);
    }
}
