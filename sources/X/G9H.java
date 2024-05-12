package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.ui.PublishDefaultPermissionFragment;

/* loaded from: classes8.dex */
public final class G9H extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ PublishDefaultPermissionFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G9H(PublishDefaultPermissionFragment publishDefaultPermissionFragment) {
        super(0);
        this.LJLIL = publishDefaultPermissionFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Bundle arguments = this.LJLIL.getArguments();
        boolean z = false;
        if (arguments != null) {
            z = arguments.getBoolean("is_auto_pop", false);
        }
        return Boolean.valueOf(z);
    }
}
