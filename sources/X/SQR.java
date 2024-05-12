package X;

import android.content.Context;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("dm_keyword_filter_popup")
/* loaded from: classes13.dex */
public final class SQR extends AbstractC56325M8r<DialogFragment> {
    public final Context LJLIL;
    public final LifecycleOwner LJLILLLLZI;
    public final FragmentManager LJLJI;
    public final int LJLJJI;

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        return C54081LKj.LIZ(this.LJLIL, this.LJLILLLLZI);
    }

    @Override // X.M74
    public final boolean canShow() {
        if (SQM.LIZ().getInt("BottomSheetDisplayCount", 0) >= 4 || SQM.LIZ().getBoolean("KeywordsEditedBefore", false)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJJI;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C54082LKk popupContext) {
        o.LJIIIZ(popupContext, "popupContext");
        return SQK.LIZ(this.LJLJI, C31J.REPORT, null);
    }

    public SQR(Context context, LifecycleOwner lifecycleOwner, FragmentManager fragmentManager) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = context;
        this.LJLILLLLZI = lifecycleOwner;
        this.LJLJI = fragmentManager;
        this.LJLJJI = 551;
    }
}
