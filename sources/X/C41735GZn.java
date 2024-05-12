package X;

import com.ss.android.ugc.aweme.story.publish.ISocialPublishBridgeService;
import com.ss.android.ugc.aweme.story.publish.SocialPublishBridgeServiceImpl;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.GZn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41735GZn extends AbstractC41873Gc1 {
    @Override // X.AbstractC41873Gc1
    public final void LIZ(Object sourceTag, AbstractC42983Gtv cause, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(cause, "cause");
    }

    @Override // X.AbstractC41873Gc1
    public final void LIZJ(Object sourceTag, C42360Gjs error, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(error, "error");
    }

    @Override // X.AbstractC41873Gc1
    public final void LJFF(Object sourceTag, Object obj, boolean z, int i, int i2) {
        o.LJIIIZ(sourceTag, "sourceTag");
    }

    public C41735GZn() {
        super(H1U.QUICK_FORWARD_PUBLISH_LOCK, 2);
    }

    @Override // X.AbstractC41873Gc1
    public final void LJ(Object sourceTag, ERR args) {
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(args, "args");
        ISocialPublishBridgeService LIZ = SocialPublishBridgeServiceImpl.LIZ();
        Iterator<Object> it = args.LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof C43404H1s) {
                if (next != null) {
                    LIZ.onReadyToCreateAweme(((C43404H1s) next).LIZ);
                    return;
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
    }
}
