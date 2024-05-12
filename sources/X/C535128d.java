package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.28d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C535128d extends AbstractC65781Prl implements InterfaceC88472Yns<LiveEffect, Boolean> {
    public static final C535128d LJLIL = new C535128d();

    public C535128d() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(LiveEffect liveEffect) {
        boolean z;
        LiveEffect target = liveEffect;
        o.LJIIIZ(target, "target");
        C6NP c6np = target.localViewType;
        o.LJIIIZ(c6np, "<this>");
        if (c6np == C6NP.MORE_V1 || c6np == C6NP.MORE_V2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
