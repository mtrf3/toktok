package X;

import com.bytedance.android.livesdk.livesetting.clientai.LiveClientTriggerParamsSettings;

/* renamed from: X.28Y, reason: invalid class name */
/* loaded from: classes.dex */
public final class C28Y extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, ? extends C2NN>> {
    public static final C28Y LJLIL = new C28Y();

    public C28Y() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, ? extends C2NN> invoke() {
        return LiveClientTriggerParamsSettings.INSTANCE.getTriggerConfigs();
    }
}
