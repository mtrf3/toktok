package com.ss.android.ugc.gamora.editor.audioservice.service.speechtosong.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class StsResult {

    @InterfaceC65349Pkn("template_id")
    public final String templateId;

    @InterfaceC65349Pkn("url")
    public final String url;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StsResult)) {
            return false;
        }
        StsResult stsResult = (StsResult) obj;
        return o.LJ(this.templateId, stsResult.templateId) && o.LJ(this.url, stsResult.url);
    }

    public final int hashCode() {
        String str = this.templateId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.url;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StsResult(templateId=");
        LIZ.append(this.templateId);
        LIZ.append(", url=");
        return q.LIZIZ(LIZ, this.url, ')', LIZ);
    }

    public StsResult(String str, String str2) {
        this.templateId = str;
        this.url = str2;
    }
}
