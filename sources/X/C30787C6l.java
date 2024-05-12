package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSdkLoggerBlacklistSetting;
import java.util.List;

/* renamed from: X.C6l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30787C6l extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends String>> {
    public static final C30787C6l LJLIL = new C30787C6l();

    public C30787C6l() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends String> invoke() {
        return ORY.LJJZZIII(LinkMicSdkLoggerBlacklistSetting.INSTANCE.getValue());
    }
}
