package X;

import com.ss.android.ugc.aweme.shortvideo.model.BehaviorType;
import com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Y6g, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86838Y6g extends AbstractC65781Prl implements InterfaceC88472Yns<PublishBehaviorModel, Boolean> {
    public static final C86838Y6g LJLIL = new C86838Y6g();

    public C86838Y6g() {
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
