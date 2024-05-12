package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.permission.page.VideoVisibilitySelectFragment;

/* loaded from: classes13.dex */
public final class SPJ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ VideoVisibilitySelectFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SPJ(VideoVisibilitySelectFragment videoVisibilitySelectFragment) {
        super(0);
        this.LJLIL = videoVisibilitySelectFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        Bundle arguments = this.LJLIL.getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("is_now");
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
