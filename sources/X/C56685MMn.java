package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MMn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56685MMn extends AbstractC56676MMe {
    public final int LJLIL;
    public final List<ImageUrlModel> LJLILLLLZI;
    public final String LJLJI;

    public C56685MMn() {
        this(0, null, null);
    }

    @Override // X.AbstractC56676MMe
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56685MMn)) {
            return false;
        }
        C56685MMn c56685MMn = (C56685MMn) obj;
        return this.LJLIL == c56685MMn.LJLIL && o.LJ(this.LJLILLLLZI, c56685MMn.LJLILLLLZI) && o.LJ(this.LJLJI, c56685MMn.LJLJI);
    }

    @Override // X.AbstractC56676MMe
    public final int hashCode() {
        int i = this.LJLIL * 31;
        List<ImageUrlModel> list = this.LJLILLLLZI;
        int hashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.LJLJI;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // X.AbstractC56676MMe
    public final C3ML convertToInboxEntranceWrapper$awemenotice_release() {
        return new C3ML(LiveMaxRetainAlogMessageSizeSetting.DEFAULT, 0L, this.type, isUnread(), this);
    }

    @Override // X.AbstractC56676MMe
    public final boolean isUnread() {
        if (this.LJLIL > 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FollowRequestPod(followRequestTotal=");
        LIZ.append(this.LJLIL);
        LIZ.append(", followRequestAvatar=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", followRequestName=");
        return q.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public C56685MMn(int i, String str, List list) {
        super(13);
        this.LJLIL = i;
        this.LJLILLLLZI = list;
        this.LJLJI = str;
    }
}
