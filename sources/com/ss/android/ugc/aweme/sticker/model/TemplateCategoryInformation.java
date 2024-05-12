package com.ss.android.ugc.aweme.sticker.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TemplateCategoryInformation implements Serializable {

    @InterfaceC65349Pkn("key")
    public final String key;

    public static /* synthetic */ TemplateCategoryInformation copy$default(TemplateCategoryInformation templateCategoryInformation, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = templateCategoryInformation.key;
        }
        return templateCategoryInformation.copy(str);
    }

    public final TemplateCategoryInformation copy(String str) {
        return new TemplateCategoryInformation(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TemplateCategoryInformation) && o.LJ(this.key, ((TemplateCategoryInformation) obj).key);
    }

    public int hashCode() {
        String str = this.key;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TemplateCategoryInformation(key=");
        return q.LIZIZ(LIZ, this.key, ')', LIZ);
    }

    public final String getKey() {
        return this.key;
    }

    public TemplateCategoryInformation(String str) {
        this.key = str;
    }
}
