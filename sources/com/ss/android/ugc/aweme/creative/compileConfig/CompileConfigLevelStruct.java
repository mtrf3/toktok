package com.ss.android.ugc.aweme.creative.compileConfig;

import X.InterfaceC65349Pkn;
import X.U26;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CompileConfigLevelStruct<T> implements Serializable {

    /* renamed from: default, reason: not valid java name */
    @InterfaceC65349Pkn("default")
    public final T f19default;

    @InterfaceC65349Pkn("hd")
    public final T hd;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CompileConfigLevelStruct() {
        /*
            r2 = this;
            r1 = 0
            r0 = 3
            r2.<init>(r1, r1, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.compileConfig.CompileConfigLevelStruct.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CompileConfigLevelStruct copy$default(CompileConfigLevelStruct compileConfigLevelStruct, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = compileConfigLevelStruct.f19default;
        }
        if ((i & 2) != 0) {
            obj2 = compileConfigLevelStruct.hd;
        }
        return compileConfigLevelStruct.copy(obj, obj2);
    }

    public final CompileConfigLevelStruct<T> copy(T t, T t2) {
        return new CompileConfigLevelStruct<>(t, t2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompileConfigLevelStruct)) {
            return false;
        }
        CompileConfigLevelStruct compileConfigLevelStruct = (CompileConfigLevelStruct) obj;
        return o.LJ(this.f19default, compileConfigLevelStruct.f19default) && o.LJ(this.hd, compileConfigLevelStruct.hd);
    }

    public int hashCode() {
        T t = this.f19default;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.hd;
        return hashCode + (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CompileConfigLevelStruct(default=");
        LIZ.append(this.f19default);
        LIZ.append(", hd=");
        return U26.LIZJ(LIZ, this.hd, ')', LIZ);
    }

    public final T getDefault() {
        return this.f19default;
    }

    public final T getHd() {
        return this.hd;
    }

    public CompileConfigLevelStruct(T t, T t2) {
        this.f19default = t;
        this.hd = t2;
    }

    public /* synthetic */ CompileConfigLevelStruct(Object obj, Object obj2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : obj2);
    }
}
