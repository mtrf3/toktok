package com.ss.android.ugc.aweme.editSticker.compile;

import X.C67J;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;

/* loaded from: classes3.dex */
public class TextStickerCompileResult extends C67J {
    public TextStickerData textStickerData;

    public TextStickerCompileResult(TextStickerData textStickerData, C67J c67j) {
        super(c67j);
        this.textStickerData = textStickerData;
    }

    public TextStickerCompileResult(String str, int i, int i2) {
        super(str, i, i2);
    }

    public TextStickerCompileResult(String str, int i, int i2, TextStickerData textStickerData) {
        super(str, i, i2);
        this.textStickerData = textStickerData;
    }
}
