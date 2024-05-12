package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EffectTextFontExtra {
    public String LIZ;

    @InterfaceC65349Pkn("font_file_name")
    public final String fileName;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectTextFontExtra() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public EffectTextFontExtra(String fileName, String filePath) {
        o.LJIIIZ(fileName, "fileName");
        o.LJIIIZ(filePath, "filePath");
        this.fileName = fileName;
        this.LIZ = filePath;
    }

    public /* synthetic */ EffectTextFontExtra(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
