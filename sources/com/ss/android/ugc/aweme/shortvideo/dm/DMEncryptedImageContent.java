package com.ss.android.ugc.aweme.shortvideo.dm;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DMEncryptedImageContent implements Serializable {

    @InterfaceC65349Pkn("Extra")
    public final DMEncryptedImageContentExtra extra;

    @InterfaceC65349Pkn("SecretKey")
    public final String secretKey;

    @InterfaceC65349Pkn("SourceMd5")
    public final String sourceMD5;

    @InterfaceC65349Pkn("Uri")
    public final String uri;

    /* JADX WARN: Multi-variable type inference failed */
    public DMEncryptedImageContent() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DMEncryptedImageContent copy$default(DMEncryptedImageContent dMEncryptedImageContent, String str, String str2, String str3, DMEncryptedImageContentExtra dMEncryptedImageContentExtra, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dMEncryptedImageContent.uri;
        }
        if ((i & 2) != 0) {
            str2 = dMEncryptedImageContent.secretKey;
        }
        if ((i & 4) != 0) {
            str3 = dMEncryptedImageContent.sourceMD5;
        }
        if ((i & 8) != 0) {
            dMEncryptedImageContentExtra = dMEncryptedImageContent.extra;
        }
        return dMEncryptedImageContent.copy(str, str2, str3, dMEncryptedImageContentExtra);
    }

    public final DMEncryptedImageContent copy(String str, String str2, String str3, DMEncryptedImageContentExtra dMEncryptedImageContentExtra) {
        return new DMEncryptedImageContent(str, str2, str3, dMEncryptedImageContentExtra);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DMEncryptedImageContent)) {
            return false;
        }
        DMEncryptedImageContent dMEncryptedImageContent = (DMEncryptedImageContent) obj;
        return o.LJ(this.uri, dMEncryptedImageContent.uri) && o.LJ(this.secretKey, dMEncryptedImageContent.secretKey) && o.LJ(this.sourceMD5, dMEncryptedImageContent.sourceMD5) && o.LJ(this.extra, dMEncryptedImageContent.extra);
    }

    public int hashCode() {
        String str = this.uri;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.secretKey;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sourceMD5;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DMEncryptedImageContentExtra dMEncryptedImageContentExtra = this.extra;
        return hashCode3 + (dMEncryptedImageContentExtra != null ? dMEncryptedImageContentExtra.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DMEncryptedImageContent(uri=");
        LIZ.append(this.uri);
        LIZ.append(", secretKey=");
        LIZ.append(this.secretKey);
        LIZ.append(", sourceMD5=");
        LIZ.append(this.sourceMD5);
        LIZ.append(", extra=");
        LIZ.append(this.extra);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final DMEncryptedImageContentExtra getExtra() {
        return this.extra;
    }

    public final String getSecretKey() {
        return this.secretKey;
    }

    public final String getSourceMD5() {
        return this.sourceMD5;
    }

    public final String getUri() {
        return this.uri;
    }

    public DMEncryptedImageContent(String str, String str2, String str3, DMEncryptedImageContentExtra dMEncryptedImageContentExtra) {
        this.uri = str;
        this.secretKey = str2;
        this.sourceMD5 = str3;
        this.extra = dMEncryptedImageContentExtra;
    }

    public /* synthetic */ DMEncryptedImageContent(String str, String str2, String str3, DMEncryptedImageContentExtra dMEncryptedImageContentExtra, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : dMEncryptedImageContentExtra);
    }
}
