package com.ss.android.ugc.aweme.music.model;

import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class MusicCategory {
    public final String categoryId;
    public final String categoryName;

    /* JADX WARN: Multi-variable type inference failed */
    public MusicCategory() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MusicCategory(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MusicCategory copy$default(MusicCategory musicCategory, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = musicCategory.categoryName;
        }
        if ((i & 2) != 0) {
            str2 = musicCategory.categoryId;
        }
        return musicCategory.copy(str, str2);
    }

    public final MusicCategory copy(String str, String str2) {
        return new MusicCategory(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicCategory)) {
            return false;
        }
        MusicCategory musicCategory = (MusicCategory) obj;
        return o.LJ(this.categoryName, musicCategory.categoryName) && o.LJ(this.categoryId, musicCategory.categoryId);
    }

    public int hashCode() {
        String str = this.categoryName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.categoryId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicCategory(categoryName=");
        LIZ.append(this.categoryName);
        LIZ.append(", categoryId=");
        return q.LIZIZ(LIZ, this.categoryId, ')', LIZ);
    }

    public MusicCategory(String str, String str2) {
        this.categoryName = str;
        this.categoryId = str2;
    }

    public /* synthetic */ MusicCategory(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
