package com.ss.ugc.effectplatform.model.algorithm;

import X.InterfaceC58592Mz6;
import X.XAQ;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ujb.o;

/* loaded from: classes16.dex */
public class ModelInfo {
    public String _name;
    public ExtendedUrlModel file_url;
    public String name;
    public String name_sec;
    public int status;
    public long totalSize;
    public int type;
    public String version;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ModelInfo() {
        /*
            r11 = this;
            r1 = 0
            r5 = 0
            r7 = 0
            r9 = 127(0x7f, float:1.78E-43)
            r0 = r11
            r2 = r1
            r3 = r1
            r4 = r1
            r8 = r7
            r10 = r1
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.model.algorithm.ModelInfo.<init>():void");
    }

    public String getName() {
        String str;
        if (o.LJJJJJL(this._name) && (!o.LJJJJJL(getName_sec()))) {
            InterfaceC58592Mz6 interfaceC58592Mz6 = XAQ.LIZ;
            if (interfaceC58592Mz6 == null || (str = interfaceC58592Mz6.decrypt(getName_sec())) == null) {
                str = "";
            }
            this._name = str;
        }
        if (o.LJJJJJL(this._name)) {
            return this.name;
        }
        return this._name;
    }

    public ExtendedUrlModel getFile_url() {
        return this.file_url;
    }

    public String getName_sec() {
        return this.name_sec;
    }

    public int getStatus() {
        return this.status;
    }

    public long getTotalSize() {
        return this.totalSize;
    }

    public int getType() {
        return this.type;
    }

    public String getVersion() {
        return this.version;
    }

    public void setFile_url(ExtendedUrlModel extendedUrlModel) {
        this.file_url = extendedUrlModel;
    }

    public void setName(String str) {
        kotlin.jvm.internal.o.LJIIJ(str, "<set-?>");
        this.name = str;
    }

    public void setName_sec(String str) {
        kotlin.jvm.internal.o.LJIIJ(str, "<set-?>");
        this.name_sec = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setTotalSize(long j) {
        this.totalSize = j;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setVersion(String str) {
        kotlin.jvm.internal.o.LJIIJ(str, "<set-?>");
        this.version = str;
    }

    public ModelInfo(String _name, String name_sec, String version, ExtendedUrlModel extendedUrlModel, long j, int i, int i2) {
        kotlin.jvm.internal.o.LJIIJ(_name, "_name");
        kotlin.jvm.internal.o.LJIIJ(name_sec, "name_sec");
        kotlin.jvm.internal.o.LJIIJ(version, "version");
        this._name = _name;
        this.name_sec = name_sec;
        this.version = version;
        this.file_url = extendedUrlModel;
        this.totalSize = j;
        this.type = i;
        this.status = i2;
        this.name = "";
    }

    public /* synthetic */ ModelInfo(String str, String str2, String str3, ExtendedUrlModel extendedUrlModel, long j, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) == 0 ? str3 : "", (i3 & 8) != 0 ? null : extendedUrlModel, (i3 & 16) != 0 ? 0L : j, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? 1 : i2);
    }
}
