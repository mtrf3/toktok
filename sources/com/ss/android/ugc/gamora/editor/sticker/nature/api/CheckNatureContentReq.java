package com.ss.android.ugc.gamora.editor.sticker.nature.api;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class CheckNatureContentReq {

    @InterfaceC65349Pkn("creation_id")
    public String creationId;

    @InterfaceC65349Pkn("tos_zip_path")
    public String tosZipPath;

    /* JADX WARN: Multi-variable type inference failed */
    public CheckNatureContentReq() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public CheckNatureContentReq(String creationId, String tosZipPath) {
        o.LJIIIZ(creationId, "creationId");
        o.LJIIIZ(tosZipPath, "tosZipPath");
        this.creationId = creationId;
        this.tosZipPath = tosZipPath;
    }

    public /* synthetic */ CheckNatureContentReq(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
