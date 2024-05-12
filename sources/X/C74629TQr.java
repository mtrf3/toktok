package X;

import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.TQr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74629TQr {
    public final String LIZ;
    public final String LIZIZ;
    public final MultiLiveAnchorPanelSettings LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final String LJFF;

    public C74629TQr() {
        this(null, null, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74629TQr)) {
            return false;
        }
        C74629TQr c74629TQr = (C74629TQr) obj;
        return o.LJ(this.LIZ, c74629TQr.LIZ) && o.LJ(this.LIZIZ, c74629TQr.LIZIZ) && o.LJ(this.LIZJ, c74629TQr.LIZJ) && this.LIZLLL == c74629TQr.LIZLLL && o.LJ(this.LJ, c74629TQr.LJ) && o.LJ(this.LJFF, c74629TQr.LJFF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.LIZ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.LIZIZ;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = this.LIZJ;
        if (multiLiveAnchorPanelSettings != null) {
            i = multiLiveAnchorPanelSettings.hashCode();
        }
        int i4 = (i3 + i) * 31;
        boolean z = this.LIZLLL;
        int i5 = z;
        if (z != 0) {
            i5 = 1;
        }
        return this.LJFF.hashCode() + C79062V1e.LJ(this.LJ, (i4 + i5) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GameLinkBeInvitedDialogShowContent(linkMicId=");
        LIZ.append(this.LIZ);
        LIZ.append(", channelId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", panelSetting=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isJoinDirectInvitedDialog=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", receiveInvitationPlatform=");
        LIZ.append(this.LJ);
        LIZ.append(", anchorInvitationPosition=");
        return q.LIZIZ(LIZ, this.LJFF, ')', LIZ);
    }

    public C74629TQr(String str, String str2, MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, int i) {
        String receiveInvitationPlatform;
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        multiLiveAnchorPanelSettings = (i & 4) != 0 ? null : multiLiveAnchorPanelSettings;
        if ((i & 16) != 0) {
            receiveInvitationPlatform = "room";
        } else {
            receiveInvitationPlatform = null;
        }
        String anchorInvitationPosition = (i & 32) != 0 ? "others" : null;
        o.LJIIIZ(receiveInvitationPlatform, "receiveInvitationPlatform");
        o.LJIIIZ(anchorInvitationPosition, "anchorInvitationPosition");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = multiLiveAnchorPanelSettings;
        this.LIZLLL = false;
        this.LJ = receiveInvitationPlatform;
        this.LJFF = anchorInvitationPosition;
    }
}
