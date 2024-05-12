package com.ss.android.ugc.aweme.music.model;

import X.V0N;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public enum DspPlatform {
    UNKNOWN(0, "", "null", false),
    APPLE_MUSIC(1, "Apple Music", "apple", true),
    AMAZON_MUSIC(2, "Amazon Music", "amazon", true),
    SPOTIFY(3, "Spotify", "spotify", true),
    TTM(4, "Tiktok Music", "tiktok music", false),
    RESSO(5, "Resso", "resso", false);

    public static final Companion Companion = new Companion();
    public final String eventName;
    public final boolean support;
    public final String title;
    public final int value;

    public static DspPlatform valueOf(String str) {
        return (DspPlatform) V0N.LJJJ(DspPlatform.class, str);
    }

    /* loaded from: classes13.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final DspPlatform from(Integer num) {
            for (DspPlatform dspPlatform : DspPlatform.values()) {
                int value = dspPlatform.getValue();
                if (num != null && value == num.intValue()) {
                    return dspPlatform;
                }
            }
            return DspPlatform.UNKNOWN;
        }
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final boolean getSupport() {
        return this.support;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getValue() {
        return this.value;
    }

    DspPlatform(int i, String str, String str2, boolean z) {
        this.value = i;
        this.title = str;
        this.eventName = str2;
        this.support = z;
    }
}
