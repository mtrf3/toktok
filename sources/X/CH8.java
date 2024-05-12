package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveMessageHistoryRefreshFooterConfigSetting;
import java.util.LinkedHashMap;

/* loaded from: classes6.dex */
public final class CH8 extends View implements InterfaceC80914VpG {
    @Override // X.InterfaceC80914VpG
    public final void LIZ(boolean z) {
    }

    @Override // X.InterfaceC80914VpG
    public final void LIZIZ(int i, boolean z) {
    }

    @Override // X.InterfaceC80914VpG
    public final void LJJJJJL(boolean z) {
    }

    @Override // X.InterfaceC80914VpG
    public int getActualHeight() {
        return C7MY.LIZIZ(LiveMessageHistoryRefreshFooterConfigSetting.INSTANCE.getValue().gblMiniHeight);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CH8(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
    }
}
