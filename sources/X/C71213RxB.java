package X;

import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IFrameSlot;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.o;

/* renamed from: X.RxB, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71213RxB implements Handler.Callback {
    public final /* synthetic */ AbstractC71187Rwl LJLIL;

    public C71213RxB(AbstractC71187Rwl abstractC71187Rwl) {
        this.LJLIL = abstractC71187Rwl;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message it) {
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        o.LJIIIZ(it, "it");
        IFrameSlot.SlotViewModel slotViewModel = this.LJLIL.LJLJLJ;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LJLIL) != null && (value = mutableLiveData.getValue()) != null && o.LJ(value.first, Boolean.TRUE)) {
            this.LJLIL.LJIIJJI();
            if (!ActivityStack.isAppBackGround()) {
                this.LJLIL.LJJII("time_out");
                C71195Rwt c71195Rwt = this.LJLIL.LJLJL;
                c71195Rwt.getClass();
                c71195Rwt.LJIIIIZZ = "time_out";
            }
            this.LJLIL.LJIJI().LJII();
            return true;
        }
        return true;
    }
}
