package X;

import com.bytedance.android.live.liveinteract.multihost.core.model.MHMessageInfo;

/* renamed from: X.Tqy, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75924Tqy {
    public static MHMessageInfo LIZ(CR6 cr6) {
        long j;
        MHMessageInfo mHMessageInfo = new MHMessageInfo();
        mHMessageInfo.baseLiveMessage = cr6;
        if (cr6 != null) {
            j = cr6.getMessageId();
        } else {
            j = 0;
        }
        mHMessageInfo.messageId = j;
        return mHMessageInfo;
    }
}
