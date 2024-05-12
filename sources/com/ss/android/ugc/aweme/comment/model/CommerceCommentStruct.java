package com.ss.android.ugc.aweme.comment.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CommerceCommentStruct implements Serializable {

    @InterfaceC65349Pkn("ad_avatar_url")
    public String avartalUrl;

    @InterfaceC65349Pkn("ad_nickname")
    public String nickName;

    /* JADX WARN: Multi-variable type inference failed */
    public CommerceCommentStruct() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CommerceCommentStruct copy$default(CommerceCommentStruct commerceCommentStruct, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commerceCommentStruct.nickName;
        }
        if ((i & 2) != 0) {
            str2 = commerceCommentStruct.avartalUrl;
        }
        return commerceCommentStruct.copy(str, str2);
    }

    public final CommerceCommentStruct copy(String str, String str2) {
        return new CommerceCommentStruct(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommerceCommentStruct)) {
            return false;
        }
        CommerceCommentStruct commerceCommentStruct = (CommerceCommentStruct) obj;
        return o.LJ(this.nickName, commerceCommentStruct.nickName) && o.LJ(this.avartalUrl, commerceCommentStruct.avartalUrl);
    }

    public int hashCode() {
        String str = this.nickName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.avartalUrl;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommerceCommentStruct(nickName=");
        LIZ.append(this.nickName);
        LIZ.append(", avartalUrl=");
        return q.LIZIZ(LIZ, this.avartalUrl, ')', LIZ);
    }

    public final String getAvartalUrl() {
        return this.avartalUrl;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final void setAvartalUrl(String str) {
        this.avartalUrl = str;
    }

    public final void setNickName(String str) {
        this.nickName = str;
    }

    public CommerceCommentStruct(String str, String str2) {
        this.nickName = str;
        this.avartalUrl = str2;
    }

    public /* synthetic */ CommerceCommentStruct(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
