package X;

import com.ss.android.ugc.aweme.shortvideo.model.BehaviorType;
import com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Y6d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86835Y6d extends AbstractC65781Prl implements InterfaceC88472Yns<PublishBehaviorModel, Boolean> {
    public static final C86835Y6d LJLIL = new C86835Y6d();

    public C86835Y6d() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(PublishBehaviorModel publishBehaviorModel) {
        boolean z;
        PublishBehaviorModel behavior = publishBehaviorModel;
        o.LJIIIZ(behavior, "behavior");
        if (o.LJ(behavior.stage, "AK") && behavior.type == BehaviorType.SUCCESS) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
