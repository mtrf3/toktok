package com.ss.android.ugc.aweme.tools.mvtemplate.cutsame.net;

import X.C16880lQ;
import X.C31461Li;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TemplateAuthor {

    @InterfaceC65349Pkn("avatar_thumb")
    public final UrlModel avatarThumb;

    @InterfaceC65349Pkn("d_name")
    public final String dName;

    @InterfaceC65349Pkn("d_uid")
    public final long dUid;

    @InterfaceC65349Pkn("nick_name")
    public final String nickName;

    /* JADX WARN: Multi-variable type inference failed */
    public TemplateAuthor() {
        this(0L, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateAuthor)) {
            return false;
        }
        TemplateAuthor templateAuthor = (TemplateAuthor) obj;
        return this.dUid == templateAuthor.dUid && o.LJ(this.dName, templateAuthor.dName) && o.LJ(this.nickName, templateAuthor.nickName) && o.LJ(this.avatarThumb, templateAuthor.avatarThumb);
    }

    public final int hashCode() {
        int LLJIJIL = C16880lQ.LLJIJIL(this.dUid) * 31;
        String str = this.dName;
        int hashCode = (LLJIJIL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nickName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        UrlModel urlModel = this.avatarThumb;
        return hashCode2 + (urlModel != null ? urlModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TemplateAuthor(dUid=");
        LIZ.append(this.dUid);
        LIZ.append(", dName=");
        LIZ.append(this.dName);
        LIZ.append(", nickName=");
        LIZ.append(this.nickName);
        LIZ.append(", avatarThumb=");
        return C31461Li.LIZLLL(LIZ, this.avatarThumb, ')', LIZ);
    }

    public TemplateAuthor(long j, String str, String str2, UrlModel urlModel) {
        this.dUid = j;
        this.dName = str;
        this.nickName = str2;
        this.avatarThumb = urlModel;
    }

    public /* synthetic */ TemplateAuthor(long j, String str, String str2, UrlModel urlModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) == 0 ? urlModel : null);
    }
}
