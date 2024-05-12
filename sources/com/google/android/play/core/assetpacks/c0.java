package com.google.android.play.core.assetpacks;

import X.FP1;

/* loaded from: classes7.dex */
public final class c0 extends b {
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public c0(int i, String str, String str2) {
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = str2;
    }

    @Override // com.google.android.play.core.assetpacks.b
    public final String LIZ() {
        return this.LIZLLL;
    }

    @Override // com.google.android.play.core.assetpacks.b
    public final int LIZIZ() {
        return this.LIZIZ;
    }

    @Override // com.google.android.play.core.assetpacks.b
    public final String LIZJ() {
        return this.LIZJ;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.LIZIZ == bVar.LIZIZ() && ((str = this.LIZJ) != null ? str.equals(bVar.LIZJ()) : bVar.LIZJ() == null)) {
                String str2 = this.LIZLLL;
                String LIZ = bVar.LIZ();
                if (str2 != null ? str2.equals(LIZ) : LIZ == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.LIZIZ ^ 1000003) * 1000003;
        String str = this.LIZJ;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.LIZLLL;
        return hashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.LIZIZ;
        String str = this.LIZJ;
        String str2 = this.LIZLLL;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 68 + String.valueOf(str2).length());
        sb.append("AssetPackLocation{packStorageMethod=");
        sb.append(i);
        sb.append(", path=");
        sb.append(str);
        return FP1.LIZLLL(sb, ", assetsPath=", str2, "}");
    }
}
