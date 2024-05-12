package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveComposerFilterSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* renamed from: X.1yH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50331yH extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC08070Tj<? extends LiveEffect>> {
    public static final C50331yH LJLIL = new C50331yH();

    public C50331yH() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC08070Tj<? extends LiveEffect> invoke() {
        if (LiveComposerFilterSetting.INSTANCE.isComposerSupported()) {
            return C17250m1.LIZ();
        }
        return C15750jb.LIZ;
    }
}
