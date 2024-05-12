package com.ss.android.ugc.aweme.question;

import X.C05040Hs;
import X.InterfaceC65349Pkn;
import X.RSW;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class QuestionInfo implements Parcelable {
    public static final Parcelable.Creator<QuestionInfo> CREATOR = new RSW();

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("id")
    public Long id;

    @InterfaceC65349Pkn("item_id")
    public Long item_id;

    @InterfaceC65349Pkn("sec_uid")
    public String secId;

    @InterfaceC65349Pkn("user_avatar")
    public UrlModel userAvatar;

    @InterfaceC65349Pkn("username")
    public String userName;

    @InterfaceC65349Pkn("user_id")
    public Long user_id;

    public QuestionInfo() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionInfo)) {
            return false;
        }
        QuestionInfo questionInfo = (QuestionInfo) obj;
        return o.LJ(this.id, questionInfo.id) && o.LJ(this.item_id, questionInfo.item_id) && o.LJ(this.user_id, questionInfo.user_id) && o.LJ(this.userName, questionInfo.userName) && o.LJ(this.content, questionInfo.content) && o.LJ(this.userAvatar, questionInfo.userAvatar) && o.LJ(this.secId, questionInfo.secId);
    }

    public final int hashCode() {
        Long l = this.id;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.item_id;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.user_id;
        int hashCode3 = (hashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.userName;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.content;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UrlModel urlModel = this.userAvatar;
        int hashCode6 = (hashCode5 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str3 = this.secId;
        return hashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QuestionInfo(id=");
        LIZ.append(this.id);
        LIZ.append(", item_id=");
        LIZ.append(this.item_id);
        LIZ.append(", user_id=");
        LIZ.append(this.user_id);
        LIZ.append(", userName=");
        LIZ.append(this.userName);
        LIZ.append(", content=");
        LIZ.append(this.content);
        LIZ.append(", userAvatar=");
        LIZ.append(this.userAvatar);
        LIZ.append(", secId=");
        return q.LIZIZ(LIZ, this.secId, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Long l = this.id;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        Long l2 = this.item_id;
        if (l2 == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l2);
        }
        Long l3 = this.user_id;
        if (l3 == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l3);
        }
        out.writeString(this.userName);
        out.writeString(this.content);
        out.writeSerializable(this.userAvatar);
        out.writeString(this.secId);
    }

    public QuestionInfo(Long l, Long l2, Long l3, String str, String str2, UrlModel urlModel, String str3) {
        this.id = l;
        this.item_id = l2;
        this.user_id = l3;
        this.userName = str;
        this.content = str2;
        this.userAvatar = urlModel;
        this.secId = str3;
    }

    public /* synthetic */ QuestionInfo(Long l, Long l2, Long l3, String str, String str2, UrlModel urlModel, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : l3, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) == 0 ? urlModel : null, str3);
    }
}
