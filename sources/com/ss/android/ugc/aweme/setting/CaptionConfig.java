package com.ss.android.ugc.aweme.setting;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes3.dex */
public final class CaptionConfig extends F9E {

    @InterfaceC65349Pkn("max_lines")
    public final int maxLines;

    @InterfaceC65349Pkn("words_per_line")
    public final int wordsPerLine;

    public static /* synthetic */ CaptionConfig copy$default(CaptionConfig captionConfig, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = captionConfig.maxLines;
        }
        if ((i3 & 2) != 0) {
            i2 = captionConfig.wordsPerLine;
        }
        return captionConfig.copy(i, i2);
    }

    public final CaptionConfig copy(int i, int i2) {
        return new CaptionConfig(i, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.maxLines), Integer.valueOf(this.wordsPerLine)};
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final int getWordsPerLine() {
        return this.wordsPerLine;
    }

    public CaptionConfig(int i, int i2) {
        this.maxLines = i;
        this.wordsPerLine = i2;
    }
}
