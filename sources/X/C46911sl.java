package X;

import android.widget.TextView;
import com.bytedance.android.live.broadcast.fragment.GameDualDeviceSourceFragment;

/* renamed from: X.1sl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46911sl extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ GameDualDeviceSourceFragment LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ long LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46911sl(GameDualDeviceSourceFragment gameDualDeviceSourceFragment, long j, long j2, long j3) {
        super(0);
        this.LJLIL = gameDualDeviceSourceFragment;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = j3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        TextView textView = this.LJLIL.LJLJL;
        if (textView == null) {
            return;
        }
        C67981Qm9.LIZIZ(new Object[]{Long.valueOf(this.LJLILLLLZI), Long.valueOf(this.LJLJI), Long.valueOf(this.LJLJJI)}, 3, "%d:%02d:%02d", "format(format, *args)", textView);
    }

    @Override // X.InterfaceC65784Pro
    public /* bridge */ /* synthetic */ C76800UCe invoke() {
        invoke2();
        return C76800UCe.LIZ;
    }
}
