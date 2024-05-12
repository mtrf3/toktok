package X;

import com.ss.android.ugc.aweme.shortvideo.model.BehaviorType;
import com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Y6f, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86837Y6f extends AbstractC65781Prl implements InterfaceC88472Yns<PublishBehaviorModel, Boolean> {
    public static final C86837Y6f LJLIL = new C86837Y6f();

    public C86837Y6f() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(PublishBehaviorModel publishBehaviorModel) {
        boolean z;
        PublishBehaviorModel behavior = publishBehaviorModel;
        o.LJIIIZ(behavior, "behavior");
        if (o.LJ(behavior.stage, "SN") && behavior.type == BehaviorType.START) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
