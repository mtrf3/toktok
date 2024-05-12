package com.bytedance.bpea.store.policy;

import X.C44882HjS;

/* loaded from: classes8.dex */
public final class PrivacyPolicyStore {
    public static final PrivacyPolicyStore INSTANCE = new PrivacyPolicyStore();

    public static /* synthetic */ void audioPrivacyPolicy$annotations() {
    }

    public static /* synthetic */ void clipboardPrivacyPolicy$annotations() {
    }

    public static /* synthetic */ void latitudeAndLongitudePrivacyPolicy$annotations() {
    }

    public static /* synthetic */ void locationPrivacyPolicy$annotations() {
    }

    public static /* synthetic */ void videoPrivacyPolicy$annotations() {
    }

    public static final C44882HjS getAudioPrivacyPolicy() {
        return new C44882HjS("304", "When there is a reasonable purpose scenario, apply for PIA evaluation.", "audio", "2021-05-06 20:00:55");
    }

    public static final C44882HjS getClipboardPrivacyPolicy() {
        return new C44882HjS("365", "Reading data from the clipboard is not recommended if there is any alternative. Writing or reading data to/from clipboard in the background is prohibited. A clear tip is a must if writing data to the clipboard occurs.", "clipboard", "2021-05-23 15:36:04");
    }

    public static final C44882HjS getLatitudeAndLongitudePrivacyPolicy() {
        return new C44882HjS("27", "When there is a reasonable purpose scenario, apply for PIA evaluation.", "latitudeAndLongitude", "2021-05-06 20:01:06");
    }

    public static final C44882HjS getLocationPrivacyPolicy() {
        return new C44882HjS("10002", "When there is a reasonable purpose scenario, apply for PIA evaluation.", "location", "2021-05-06 20:01:04");
    }

    public static final C44882HjS getVideoPrivacyPolicy() {
        return new C44882HjS("192", "When there is a reasonable purpose scenario, apply for PIA evaluation.", "video", "2021-05-06 20:00:56");
    }
}
