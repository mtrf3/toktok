package com.bytedance.helios.api.config;

import X.EnumC35609DyH;
import X.EnumC89893ft;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class StorageInterceptItem {

    @InterfaceC65349Pkn("mounted")
    public int mounted;

    @InterfaceC65349Pkn("operate")
    public int operate;

    @InterfaceC65349Pkn("pass_reg_exp")
    public String passRegExp;

    @InterfaceC65349Pkn("path")
    public String path;

    @InterfaceC65349Pkn("rule")
    public int rule;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public StorageInterceptItem() {
        /*
            r8 = this;
            r1 = 0
            r2 = 0
            r6 = 31
            r0 = r8
            r3 = r2
            r4 = r2
            r5 = r1
            r7 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.api.config.StorageInterceptItem.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorageInterceptItem)) {
            return false;
        }
        StorageInterceptItem storageInterceptItem = (StorageInterceptItem) obj;
        return o.LJ(this.path, storageInterceptItem.path) && this.mounted == storageInterceptItem.mounted && this.operate == storageInterceptItem.operate && this.rule == storageInterceptItem.rule && o.LJ(this.passRegExp, storageInterceptItem.passRegExp);
    }

    public final int hashCode() {
        String str = this.path;
        int hashCode = (((((((str != null ? str.hashCode() : 0) * 31) + this.mounted) * 31) + this.operate) * 31) + this.rule) * 31;
        String str2 = this.passRegExp;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[path=");
        LIZ.append(this.path);
        LIZ.append(" mounted=");
        LIZ.append(this.mounted);
        LIZ.append(" operate=");
        LIZ.append(this.operate);
        LIZ.append(" rule=");
        LIZ.append(this.rule);
        LIZ.append(" passRegExp=");
        return q.LIZIZ(LIZ, this.passRegExp, ']', LIZ);
    }

    public StorageInterceptItem(String path, int i, int i2, int i3, String passRegExp) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(passRegExp, "passRegExp");
        this.path = path;
        this.mounted = i;
        this.operate = i2;
        this.rule = i3;
        this.passRegExp = passRegExp;
    }

    public /* synthetic */ StorageInterceptItem(String str, int i, int i2, int i3, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "/(sdcard|storage)/.+.(jpg|jpeg|png|webp|gif|bmp|mp4|flv|mpg|mpeg|mov|webm|avi|wmv)" : str, (i4 & 2) != 0 ? EnumC89893ft.ROOT.ordinal() : i, (i4 & 4) != 0 ? 4 : i2, (i4 & 8) != 0 ? EnumC35609DyH.REGEXP.ordinal() : i3, (i4 & 16) != 0 ? "/.*(/aweme|/tt_video|com.ss.android.ugc.aweme|com.bytedance.realx).*" : str2);
    }
}
