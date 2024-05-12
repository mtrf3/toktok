package X;

import android.os.Build;
import com.ss.android.ugc.feed.platform.panel.earphone.EarphonePlayerControl;

/* loaded from: classes16.dex */
public final class YTX extends AbstractC65781Prl implements InterfaceC65784Pro<Object> {
    public final /* synthetic */ EarphonePlayerControl LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YTX(EarphonePlayerControl earphonePlayerControl) {
        super(0);
        this.LJLIL = earphonePlayerControl;
    }

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        if (Build.VERSION.SDK_INT >= 23) {
            L9S.LIZ.getClass();
            if (L9S.LIZ()) {
                return new YTV(this.LJLIL.LJIIIZ());
            }
            return new YTU(this.LJLIL.LJIIIZ());
        }
        return new YTU(this.LJLIL.LJIIIZ());
    }
}
