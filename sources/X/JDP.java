package X;

import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import com.ss.android.ugc.feed.platform.panel.earphone.EarphonePlayerControl;

/* loaded from: classes9.dex */
public final class JDP extends AbstractC65781Prl implements InterfaceC65784Pro<IEarphonePlayerControlService> {
    public static final JDP LJLIL = new JDP();

    public JDP() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IEarphonePlayerControlService invoke() {
        return EarphonePlayerControl.LJII();
    }
}
