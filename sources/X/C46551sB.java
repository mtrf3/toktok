package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.1sB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46551sB extends AbstractC65781Prl implements InterfaceC88472Yns<LiveEffect, Boolean> {
    public static final C46551sB LJLIL = new C46551sB();

    public C46551sB() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(LiveEffect liveEffect) {
        boolean z;
        LiveEffect it = liveEffect;
        o.LJIIIZ(it, "it");
        if (it.localViewType == C6NP.NONE || C77412UZs.LJJIII(it)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
