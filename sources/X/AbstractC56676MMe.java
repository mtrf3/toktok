package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: X.MMe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC56676MMe {
    public boolean isLoading;
    public boolean isSkeleton;
    public final int type;

    public final AbstractC56676MMe asSkeleton$awemenotice_release() {
        this.isSkeleton = true;
        return this;
    }

    public abstract C3ML convertToInboxEntranceWrapper$awemenotice_release();

    public long getLastNoticeTime$awemenotice_release() {
        return 0L;
    }

    public abstract boolean isUnread();

    public int getPriority$awemenotice_release() {
        int i = this.type;
        if (i != 0) {
            if (i != 1) {
                if (i != 13) {
                    if (i != 200) {
                        if (i != 20) {
                            if (i != 21) {
                                switch (i) {
                                    case 9:
                                        return 600;
                                    case 10:
                                        return 540;
                                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                        return 539;
                                    default:
                                        return 0;
                                }
                            }
                            return 399;
                        }
                        return LiveChatShowDelayForHotLiveSetting.DEFAULT;
                    }
                    return 550;
                }
                return LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
            }
            return 300;
        }
        return 100;
    }

    public int hashCode() {
        return C16880lQ.LLJILJIL(this.isSkeleton) + C16880lQ.LLJILJIL(isUnread()) + this.type;
    }

    public AbstractC56676MMe(int i) {
        this.type = i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC56676MMe)) {
            return false;
        }
        AbstractC56676MMe abstractC56676MMe = (AbstractC56676MMe) obj;
        if (abstractC56676MMe.type == this.type && abstractC56676MMe.isUnread() == isUnread() && abstractC56676MMe.isSkeleton == this.isSkeleton && abstractC56676MMe.isLoading == this.isLoading) {
            return true;
        }
        return false;
    }

    public boolean isSameItem(Object obj) {
        if ((obj instanceof AbstractC56676MMe) && this.type == ((AbstractC56676MMe) obj).type) {
            return true;
        }
        return false;
    }
}
