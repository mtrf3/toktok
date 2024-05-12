package X;

import android.os.Bundle;
import com.bytedance.android.live.broadcast.fragment.GameDualDeviceQRCodeFragment;

/* renamed from: X.1sj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46891sj extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ GameDualDeviceQRCodeFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46891sj(GameDualDeviceQRCodeFragment gameDualDeviceQRCodeFragment) {
        super(0);
        this.LJLIL = gameDualDeviceQRCodeFragment;
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
