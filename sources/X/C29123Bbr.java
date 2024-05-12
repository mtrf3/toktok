package X;

import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.LiveSlardarTagSetting;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Bbr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29123Bbr extends AbstractC65781Prl implements InterfaceC65784Pro<C65816PsK<String>> {
    public static final C29123Bbr LJLIL = new C29123Bbr();

    public C29123Bbr() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C65816PsK<String> invoke() {
        return new C65816PsK<>(Integer.valueOf(LiveSlardarTagSetting.INSTANCE.getCurrentValue().messageCount), new CopyOnWriteArrayList());
    }
}
