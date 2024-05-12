package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import kotlin.jvm.internal.o;

/* renamed from: X.TQq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74628TQq {
    public final String LIZ;
    public final String LIZIZ;
    public final MultiLiveAnchorPanelSettings LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final boolean LJI;
    public final String LJII;
    public final ImageModel LJIIIIZZ;
    public final long LJIIIZ;

    public C74628TQq() {
        this(null, null, null, false, false, null, null, 0L, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74628TQq)) {
            return false;
        }
        C74628TQq c74628TQq = (C74628TQq) obj;
        return o.LJ(this.LIZ, c74628TQq.LIZ) && o.LJ(this.LIZIZ, c74628TQq.LIZIZ) && o.LJ(this.LIZJ, c74628TQq.LIZJ) && this.LIZLLL == c74628TQq.LIZLLL && o.LJ(this.LJ, c74628TQq.LJ) && o.LJ(this.LJFF, c74628TQq.LJFF) && this.LJI == c74628TQq.LJI && o.LJ(this.LJII, c74628TQq.LJII) && o.LJ(this.LJIIIIZZ, c74628TQq.LJIIIIZZ) && this.LJIIIZ == c74628TQq.LJIIIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
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
        if (multiLiveAnchorPanelSettings == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = multiLiveAnchorPanelSettings.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        boolean z = this.LIZLLL;
        int i5 = 1;
        int i6 = z;
        if (z != 0) {
            i6 = 1;
        }
        int LJ = C79062V1e.LJ(this.LJFF, C79062V1e.LJ(this.LJ, (i4 + i6) * 31, 31), 31);
        if (!this.LJI) {
            i5 = 0;
        }
        int LJ2 = C79062V1e.LJ(this.LJII, (LJ + i5) * 31, 31);
        ImageModel imageModel = this.LJIIIIZZ;
        if (imageModel != null) {
            i = imageModel.hashCode();
        }
        return C16880lQ.LLJIJIL(this.LJIIIZ) + ((LJ2 + i) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MultiGuestV3BeInvitedDialogShowContent(linkMicId=");
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
        LIZ.append(this.LJFF);
        LIZ.append(", operatorIsModerator=");
        LIZ.append(this.LJI);
        LIZ.append(", operatorDisPlayName=");
        LIZ.append(this.LJII);
        LIZ.append(", operatorAvatarImageModel=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", operatorUid=");
        return C47135Ieh.LIZIZ(LIZ, this.LJIIIZ, ')', LIZ);
    }

    public C74628TQq(String str, String str2, MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings, boolean z, boolean z2, String str3, ImageModel imageModel, long j, int i) {
        String str4;
        String str5;
        String str6 = str2;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2 = multiLiveAnchorPanelSettings;
        boolean z3 = z;
        boolean z4 = z2;
        String str7 = str3;
        long j2 = j;
        String str8 = (i & 1) != 0 ? null : str;
        str6 = (i & 2) != 0 ? null : str6;
        multiLiveAnchorPanelSettings2 = (i & 4) != 0 ? null : multiLiveAnchorPanelSettings2;
        z3 = (i & 8) != 0 ? false : z3;
        if ((i & 16) != 0) {
            str4 = "room";
        } else {
            str4 = null;
        }
        if ((i & 32) != 0) {
            str5 = "others";
        } else {
            str5 = null;
        }
        z4 = (i & 64) != 0 ? false : z4;
        str7 = (i & 128) != 0 ? "" : str7;
        ImageModel imageModel2 = (i & 256) == 0 ? imageModel : null;
        j2 = (i & 512) != 0 ? 0L : j2;
        HH1.LIZ(str4, "receiveInvitationPlatform", str5, "anchorInvitationPosition", str7, "operatorDisPlayName");
        this.LIZ = str8;
        this.LIZIZ = str6;
        this.LIZJ = multiLiveAnchorPanelSettings2;
        this.LIZLLL = z3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = z4;
        this.LJII = str7;
        this.LJIIIIZZ = imageModel2;
        this.LJIIIZ = j2;
    }
}
