package X;

import android.os.Bundle;
import com.bytedance.android.live.broadcast.fragment.GameDualDevicePositionSelectFragment;

/* renamed from: X.1si, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46881si extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ GameDualDevicePositionSelectFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46881si(GameDualDevicePositionSelectFragment gameDualDevicePositionSelectFragment) {
        super(0);
        this.LJLIL = gameDualDevicePositionSelectFragment;
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Bundle arguments = this.LJLIL.getArguments();
        boolean z = true;
        if (arguments != null) {
            z = arguments.getBoolean("is_landscape", true);
        }
        return Boolean.valueOf(z);
    }
}
