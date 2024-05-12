package com.ss.android.ugc.aweme.sticker.data;

import X.C31461Li;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AutocaptionType implements Serializable {

    @InterfaceC65349Pkn("language")
    public String language;

    @InterfaceC65349Pkn("url")
    public UrlModel url;

    /* JADX WARN: Multi-variable type inference failed */
    public AutocaptionType() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AutocaptionType copy$default(AutocaptionType autocaptionType, String str, UrlModel urlModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autocaptionType.language;
        }
        if ((i & 2) != 0) {
            urlModel = autocaptionType.url;
        }
        return autocaptionType.copy(str, urlModel);
    }

    public final AutocaptionType copy(String str, UrlModel urlModel) {
        return new AutocaptionType(str, urlModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutocaptionType)) {
            return false;
        }
        AutocaptionType autocaptionType = (AutocaptionType) obj;
        return o.LJ(this.language, autocaptionType.language) && o.LJ(this.url, autocaptionType.url);
    }

    public int hashCode() {
        String str = this.language;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        UrlModel urlModel = this.url;
        return hashCode + (urlModel != null ? urlModel.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutocaptionType(language=");
        LIZ.append(this.language);
        LIZ.append(", url=");
        return C31461Li.LIZLLL(LIZ, this.url, ')', LIZ);
    }

    public final String getLanguage() {
        return this.language;
    }

    public final UrlModel getUrl() {
        return this.url;
    }

    public final void setLanguage(String str) {
        this.language = str;
    }

    public final void setUrl(UrlModel urlModel) {
        this.url = urlModel;
    }

    public AutocaptionType(String str, UrlModel urlModel) {
        this.language = str;
        this.url = urlModel;
    }

    public /* synthetic */ AutocaptionType(String str, UrlModel urlModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : urlModel);
    }
}
