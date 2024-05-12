package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3RtcParamsSetting;
import com.google.gson.m;
import com.google.gson.o;

/* loaded from: classes11.dex */
public final class N4J extends AbstractC65781Prl implements InterfaceC65784Pro<m> {
    public static final N4J LJLIL = new N4J();

    public N4J() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final m invoke() {
        try {
            new o();
            return o.LIZ(MultiGuestV3RtcParamsSetting.INSTANCE.getValue()).LJIIZILJ();
        } catch (Throwable th) {
            InterfaceC88471Ynr<? super String, ? super Throwable, C76800UCe> interfaceC88471Ynr = MultiGuestV3RtcParamsSetting.loader;
            if (interfaceC88471Ynr != null) {
                interfaceC88471Ynr.invoke("parse whole json error", th);
            }
            return null;
        }
    }
}
