package com.ss.android.ugc.aweme.story.guide;

import X.C53108Ksq;
import X.C62822Ol8;
import X.N26;
import X.N28;
import com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicLottieConfig;

/* loaded from: classes11.dex */
public final class StoryWidgetGuideLottieConfig implements IDynamicLottieConfig {
    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicLottieConfig, com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final /* bridge */ /* synthetic */ String fallback() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicLottieConfig, com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    /* renamed from: fallback, reason: avoid collision after fix types in other method */
    public final String fallback2() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicLottieConfig, com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final String key() {
        return "story_widget_guide";
    }

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicLottieConfig, com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final boolean enable() {
        C62822Ol8 c62822Ol8 = C53108Ksq.LIZ;
        if (((Number) c62822Ol8.getValue()).intValue() != 1 && ((Number) c62822Ol8.getValue()).intValue() != 2) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicLottieConfig, com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final N28 priority() {
        return N28.HIGH;
    }

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicLottieConfig, com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final N26 type() {
        return N26.LOTTIE;
    }
}
