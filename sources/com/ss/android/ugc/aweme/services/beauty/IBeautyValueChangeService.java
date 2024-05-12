package com.ss.android.ugc.aweme.services.beauty;

/* loaded from: classes2.dex */
public interface IBeautyValueChangeService {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes2.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
    }

    BeautyAbSetting getAbSetting();

    float getComposerValue(String str, String str2, String str3, float f);

    String getSelectedChildResId(String str, String str2, String str3);

    int saveComposerValue(String str, String str2, String str3, float f);

    int saveSelectedChildResId(String str, String str2, String str3);
}
