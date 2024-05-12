package X;

import com.bytedance.keva.Keva;

/* renamed from: X.DQh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33851DQh extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C33851DQh LJLIL = new C33851DQh();

    public C33851DQh() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Boolean valueOf = Boolean.valueOf(((Keva) C33850DQg.LJI.getValue()).getBoolean("cold_launch_request_handled", false));
        valueOf.booleanValue();
        return valueOf;
    }
}
