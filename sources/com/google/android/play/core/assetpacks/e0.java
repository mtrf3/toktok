package com.google.android.play.core.assetpacks;

import X.AnonymousClass073;
import X.C0MT;
import java.util.Map;

/* loaded from: classes7.dex */
public final class e0 extends c {
    public final long LIZ;
    public final Map<String, AssetPackState> LIZIZ;

    public e0(long j, Map<String, AssetPackState> map) {
        this.LIZ = j;
        this.LIZIZ = map;
    }

    @Override // com.google.android.play.core.assetpacks.c
    public final Map<String, AssetPackState> LIZ() {
        return this.LIZIZ;
    }

    @Override // com.google.android.play.core.assetpacks.c
    public final long LIZIZ() {
        return this.LIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.LIZ == cVar.LIZIZ() && this.LIZIZ.equals(cVar.LIZ())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.LIZ;
        return this.LIZIZ.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.LIZ;
        String valueOf = String.valueOf(this.LIZIZ);
        StringBuilder sb = new StringBuilder(valueOf.length() + 61);
        C0MT.LIZLLL(sb, "AssetPackStates{totalBytes=", j, ", packStates=");
        return AnonymousClass073.LIZIZ(sb, valueOf, "}");
    }
}
