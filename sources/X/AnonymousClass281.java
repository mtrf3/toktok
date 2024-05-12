package X;

import com.bytedance.android.livesdk.livesetting.clientai.LiveClientTriggerParamsSettings;

/* renamed from: X.281, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass281 extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, ? extends C2NN>> {
    public static final AnonymousClass281 LJLIL = new AnonymousClass281();

    public AnonymousClass281() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, ? extends C2NN> invoke() {
        return LiveClientTriggerParamsSettings.INSTANCE.getTriggerConfigs();
    }
}
