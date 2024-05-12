package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveClearConstraintSetSetting;

/* renamed from: X.Mxq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58514Mxq extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58514Mxq LJLIL = new C58514Mxq();

    public C58514Mxq() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(LiveClearConstraintSetSetting.INSTANCE.getValue());
    }
}
