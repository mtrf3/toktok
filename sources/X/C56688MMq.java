package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMMessage;
import com.ss.android.ugc.aweme.inbox.widget.multi.ActivityPod;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod;
import kotlin.jvm.internal.o;

/* renamed from: X.MMq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56688MMq extends AbstractC03160Am {
    public final /* synthetic */ int LIZ;

    public /* synthetic */ C56688MMq(int i) {
        this.LIZ = i;
    }

    @Override // X.AbstractC03160Am
    public final boolean LIZ(Object obj, Object obj2) {
        switch (this.LIZ) {
            case 0:
                return o.LJ(((IMMessage) obj).getState(), ((IMMessage) obj2).getState());
            default:
                AbstractC56676MMe abstractC56676MMe = (AbstractC56676MMe) obj;
                AbstractC56676MMe abstractC56676MMe2 = (AbstractC56676MMe) obj2;
                if ((abstractC56676MMe instanceof ActivityPod) && (abstractC56676MMe2 instanceof ActivityPod)) {
                    if (o.LJ(abstractC56676MMe, abstractC56676MMe2) && abstractC56676MMe.isUnread() == abstractC56676MMe2.isUnread()) {
                        ActivityPod activityPod = (ActivityPod) abstractC56676MMe;
                        ActivityPod activityPod2 = (ActivityPod) abstractC56676MMe2;
                        if (o.LJ(activityPod.readPoint, activityPod2.readPoint) && o.LJ(activityPod.newNoticeContent, activityPod2.newNoticeContent) && abstractC56676MMe.type == abstractC56676MMe2.type && o.LJ(activityPod.newNoticeTime, activityPod2.newNoticeTime) && activityPod.dataType == activityPod2.dataType && o.LJ(activityPod.title, activityPod2.title)) {
                            return true;
                        }
                    }
                    return false;
                }
                return o.LJ(abstractC56676MMe, abstractC56676MMe2);
        }
    }

    @Override // X.AbstractC03160Am
    public final boolean LIZIZ(Object obj, Object obj2) {
        switch (this.LIZ) {
            case 0:
                IMMessage iMMessage = (IMMessage) obj;
                IMMessage iMMessage2 = (IMMessage) obj2;
                if (iMMessage.getMessage().getMsgId() != 0 && iMMessage2.getMessage().getMsgId() != 0) {
                    if (iMMessage.getMessage().getMsgId() != iMMessage2.getMessage().getMsgId()) {
                        return false;
                    }
                    return true;
                }
                return o.LJ(iMMessage.getMessage().getUuid(), iMMessage2.getMessage().getUuid());
            default:
                AbstractC56676MMe abstractC56676MMe = (AbstractC56676MMe) obj;
                AbstractC56676MMe abstractC56676MMe2 = (AbstractC56676MMe) obj2;
                if ((abstractC56676MMe instanceof InboxEntrancePod) && (abstractC56676MMe2 instanceof InboxEntrancePod)) {
                    return abstractC56676MMe.isSameItem(abstractC56676MMe2);
                }
                if (abstractC56676MMe.type != abstractC56676MMe2.type) {
                    return false;
                }
                return true;
        }
    }
}
