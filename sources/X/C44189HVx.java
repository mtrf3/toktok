package X;

import com.ss.android.ttve.nativePort.TEEffectUtils;

/* renamed from: X.HVx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C44189HVx extends TBS implements InterfaceC65784Pro<String> {
    public static final C44189HVx LJLIL = new C44189HVx();

    public C44189HVx() {
        super(0, C63942P7q.class, "getEffectSDKVer", "getEffectSDKVer()Ljava/lang/String;", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        return TEEffectUtils.getEffectVersion();
    }
}
