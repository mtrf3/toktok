package com.ss.android.ugc.aweme.model;

import X.C47959Irz;
import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidContentReview extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("can_edit")
    public final boolean canEdit;

    @InterfaceC65349Pkn("can_reply")
    public final boolean canReply;

    @InterfaceC65349Pkn("create_time")
    public final long createTime;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("is_edited")
    public final boolean isEdited;

    @InterfaceC65349Pkn("rating")
    public final float rating;

    @InterfaceC65349Pkn("reply")
    public final PaidContentReview reply;

    @InterfaceC65349Pkn("reply_ref_id")
    public final String replyRefId;

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("user")
    public final User user;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PaidContentReview() {
        /*
            r14 = this;
            r1 = 0
            r2 = 0
            r4 = 0
            r9 = 0
            r12 = 1023(0x3ff, float:1.434E-42)
            r0 = r14
            r3 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r10 = r9
            r11 = r9
            r13 = r1
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.model.PaidContentReview.<init>():void");
    }

    public static /* synthetic */ PaidContentReview copy$default(PaidContentReview paidContentReview, String str, float f, String str2, long j, User user, PaidContentReview paidContentReview2, String str3, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paidContentReview.id;
        }
        if ((i & 2) != 0) {
            f = paidContentReview.rating;
        }
        if ((i & 4) != 0) {
            str2 = paidContentReview.text;
        }
        if ((i & 8) != 0) {
            j = paidContentReview.createTime;
        }
        if ((i & 16) != 0) {
            user = paidContentReview.user;
        }
        if ((i & 32) != 0) {
            paidContentReview2 = paidContentReview.reply;
        }
        if ((i & 64) != 0) {
            str3 = paidContentReview.replyRefId;
        }
        if ((i & 128) != 0) {
            z = paidContentReview.isEdited;
        }
        if ((i & 256) != 0) {
            z2 = paidContentReview.canEdit;
        }
        if ((i & 512) != 0) {
            z3 = paidContentReview.canReply;
        }
        return paidContentReview.copy(str, f, str2, j, user, paidContentReview2, str3, z, z2, z3);
    }

    public final PaidContentReview copy(String str, float f, String str2, long j, User user, PaidContentReview paidContentReview, String str3, boolean z, boolean z2, boolean z3) {
        return new PaidContentReview(str, f, str2, j, user, paidContentReview, str3, z, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaidContentReview)) {
            return false;
        }
        PaidContentReview paidContentReview = (PaidContentReview) obj;
        return o.LJ(this.id, paidContentReview.id) && Float.compare(this.rating, paidContentReview.rating) == 0 && o.LJ(this.text, paidContentReview.text) && this.createTime == paidContentReview.createTime && o.LJ(this.user, paidContentReview.user) && o.LJ(this.reply, paidContentReview.reply) && o.LJ(this.replyRefId, paidContentReview.replyRefId) && this.isEdited == paidContentReview.isEdited && this.canEdit == paidContentReview.canEdit && this.canReply == paidContentReview.canReply;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.id;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LIZIZ = C47959Irz.LIZIZ(this.rating, hashCode * 31, 31);
        String str2 = this.text;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.createTime, (LIZIZ + hashCode2) * 31, 31);
        User user = this.user;
        if (user == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = user.hashCode();
        }
        int i2 = (LIZJ + hashCode3) * 31;
        PaidContentReview paidContentReview = this.reply;
        if (paidContentReview == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = paidContentReview.hashCode();
        }
        int i3 = (i2 + hashCode4) * 31;
        String str3 = this.replyRefId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i4 = (i3 + i) * 31;
        boolean z = this.isEdited;
        int i5 = 1;
        int i6 = z;
        if (z != 0) {
            i6 = 1;
        }
        int i7 = (i4 + i6) * 31;
        boolean z2 = this.canEdit;
        int i8 = z2;
        if (z2 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        if (!this.canReply) {
            i5 = 0;
        }
        return i9 + i5;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaidContentReview(id=");
        LIZ.append(this.id);
        LIZ.append(", rating=");
        LIZ.append(this.rating);
        LIZ.append(", text=");
        LIZ.append(this.text);
        LIZ.append(", createTime=");
        LIZ.append(this.createTime);
        LIZ.append(", user=");
        LIZ.append(this.user);
        LIZ.append(", reply=");
        LIZ.append(this.reply);
        LIZ.append(", replyRefId=");
        LIZ.append(this.replyRefId);
        LIZ.append(", isEdited=");
        LIZ.append(this.isEdited);
        LIZ.append(", canEdit=");
        LIZ.append(this.canEdit);
        LIZ.append(", canReply=");
        return C48339Iy7.LIZJ(LIZ, this.canReply, ')', LIZ);
    }

    public final boolean getCanEdit() {
        return this.canEdit;
    }

    public final boolean getCanReply() {
        return this.canReply;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final String getId() {
        return this.id;
    }

    public final float getRating() {
        return this.rating;
    }

    public final PaidContentReview getReply() {
        return this.reply;
    }

    public final String getReplyRefId() {
        return this.replyRefId;
    }

    public final String getText() {
        return this.text;
    }

    public final User getUser() {
        return this.user;
    }

    public final boolean isEdited() {
        return this.isEdited;
    }

    public PaidContentReview(String str, float f, String str2, long j, User user, PaidContentReview paidContentReview, String str3, boolean z, boolean z2, boolean z3) {
        this.id = str;
        this.rating = f;
        this.text = str2;
        this.createTime = j;
        this.user = user;
        this.reply = paidContentReview;
        this.replyRefId = str3;
        this.isEdited = z;
        this.canEdit = z2;
        this.canReply = z3;
    }

    public /* synthetic */ PaidContentReview(String str, float f, String str2, long j, User user, PaidContentReview paidContentReview, String str3, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? null : user, (i & 32) != 0 ? null : paidContentReview, (i & 64) == 0 ? str3 : null, (i & 128) != 0 ? false : z, (i & 256) != 0 ? false : z2, (i & 512) == 0 ? z3 : false);
    }
}
