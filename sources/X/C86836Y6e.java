package X;

import com.ss.android.ugc.aweme.shortvideo.model.BehaviorType;
import com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Y6e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86836Y6e extends AbstractC65781Prl implements InterfaceC88472Yns<PublishBehaviorModel, Boolean> {
    public static final C86836Y6e LJLIL = new C86836Y6e();

    public C86836Y6e() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(PublishBehaviorModel publishBehaviorModel) {
        boolean z;
        PublishBehaviorModel behavior = publishBehaviorModel;
        o.LJIIIZ(behavior, "behavior");
        if (o.LJ(behavior.stage, "UP") && behavior.type == BehaviorType.SUCCESS) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
