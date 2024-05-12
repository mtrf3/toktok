package com.ss.android.ugc.aweme.services.external;

/* loaded from: classes8.dex */
public interface IAnchorService {
    int downloadIntroVideoIfNeed(String str, String str2);

    String getRealTitleString(String str);

    boolean isEditorProCaptionEnabled();

    boolean isEditorProEffectEnabled();

    boolean isEditorProEnabled();

    boolean isFunctionEnabled(Integer num);

    boolean newRoundCornerUXOptimization();
}
