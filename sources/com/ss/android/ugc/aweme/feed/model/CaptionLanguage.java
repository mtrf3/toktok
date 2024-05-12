package com.ss.android.ugc.aweme.feed.model;

import X.C78920UyC;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.V0N;
import X.X1D;
import java.io.Serializable;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class CaptionLanguage implements Serializable {

    @InterfaceC65349Pkn("can_translate_realtime")
    public boolean canTranslateRealtime;

    @InterfaceC65349Pkn("can_translate_realtime_skip_translation_lang_check")
    public Boolean canTranslateRealtimeSkipTranslationLangCheck;

    @InterfaceC65349Pkn("is_burnin_caption")
    public Boolean isBurninCaption;

    @InterfaceC65349Pkn("language_code")
    public String languageCode;

    @InterfaceC65349Pkn("language_id")
    public long languageId;

    @InterfaceC65349Pkn("lang")
    public String languageName;

    @InterfaceC65349Pkn("original_caption_type")
    public Integer originalCaptionType;

    /* JADX WARN: Multi-variable type inference failed */
    public CaptionLanguage() {
        this(null, 0L, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CaptionLanguage copy$default(CaptionLanguage captionLanguage, String str, long j, String str2, boolean z, Integer num, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = captionLanguage.languageName;
        }
        if ((i & 2) != 0) {
            j = captionLanguage.languageId;
        }
        if ((i & 4) != 0) {
            str2 = captionLanguage.languageCode;
        }
        if ((i & 8) != 0) {
            z = captionLanguage.canTranslateRealtime;
        }
        if ((i & 16) != 0) {
            num = captionLanguage.originalCaptionType;
        }
        if ((i & 32) != 0) {
            bool = captionLanguage.isBurninCaption;
        }
        if ((i & 64) != 0) {
            bool2 = captionLanguage.canTranslateRealtimeSkipTranslationLangCheck;
        }
        return captionLanguage.copy(str, j, str2, z, num, bool, bool2);
    }

    public final CaptionLanguage copy(String languageName, long j, String languageCode, boolean z, Integer num, Boolean bool, Boolean bool2) {
        o.LJIIIZ(languageName, "languageName");
        o.LJIIIZ(languageCode, "languageCode");
        return new CaptionLanguage(languageName, j, languageCode, z, num, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptionLanguage)) {
            return false;
        }
        CaptionLanguage captionLanguage = (CaptionLanguage) obj;
        return o.LJ(this.languageName, captionLanguage.languageName) && this.languageId == captionLanguage.languageId && o.LJ(this.languageCode, captionLanguage.languageCode) && this.canTranslateRealtime == captionLanguage.canTranslateRealtime && o.LJ(this.originalCaptionType, captionLanguage.originalCaptionType) && o.LJ(this.isBurninCaption, captionLanguage.isBurninCaption) && o.LJ(this.canTranslateRealtimeSkipTranslationLangCheck, captionLanguage.canTranslateRealtimeSkipTranslationLangCheck);
    }

    public final ClaOriginalCaptionType getOriginalCaptionType() {
        return ClaOriginalCaptionType.Companion.fromInt(this.originalCaptionType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int LJ = C79062V1e.LJ(this.languageCode, JBR.LIZJ(this.languageId, this.languageName.hashCode() * 31, 31), 31);
        boolean z = this.canTranslateRealtime;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (LJ + i) * 31;
        Integer num = this.originalCaptionType;
        int i3 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        Boolean bool = this.isBurninCaption;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        Boolean bool2 = this.canTranslateRealtimeSkipTranslationLangCheck;
        if (bool2 != null) {
            i3 = bool2.hashCode();
        }
        return i5 + i3;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CaptionLanguage(languageName=");
        LIZ.append(this.languageName);
        LIZ.append(", languageId=");
        LIZ.append(this.languageId);
        LIZ.append(", languageCode=");
        LIZ.append(this.languageCode);
        LIZ.append(", canTranslateRealtime=");
        LIZ.append(this.canTranslateRealtime);
        LIZ.append(", originalCaptionType=");
        LIZ.append(this.originalCaptionType);
        LIZ.append(", isBurninCaption=");
        LIZ.append(this.isBurninCaption);
        LIZ.append(", canTranslateRealtimeSkipTranslationLangCheck=");
        return C78920UyC.LIZIZ(LIZ, this.canTranslateRealtimeSkipTranslationLangCheck, ')', LIZ);
    }

    public final boolean getCanTranslateRealtime() {
        return this.canTranslateRealtime;
    }

    public final Boolean getCanTranslateRealtimeSkipTranslationLangCheck() {
        return this.canTranslateRealtimeSkipTranslationLangCheck;
    }

    public final String getLanguageCode() {
        return this.languageCode;
    }

    public final long getLanguageId() {
        return this.languageId;
    }

    public final String getLanguageName() {
        return this.languageName;
    }

    public final Boolean isBurninCaption() {
        return this.isBurninCaption;
    }

    /* loaded from: classes16.dex */
    public enum ClaOriginalCaptionType {
        CLA_ORIGINAL_CAPTION_TYPE_UNSPECIFIED(0, "unspecified"),
        CLA_ORIGINAL_CAPTION_TYPE_ASR(1, "asr"),
        CLA_ORIGINAL_CAPTION_TYPE_CEC(2, "cec"),
        CLA_ORIGINAL_CAPTION_TYPE_STICKER_CREATOR(3, "sticker_creator"),
        CLA_ORIGINAL_CAPTION_TYPE_CAPCUT_CREATOR(4, "capcut_creator"),
        CLA_ORIGINAL_CAPTION_TYPE_THIRD_PARTY_CREATOR(5, "tp_creator"),
        CLA_ORIGINAL_CAPTION_TYPE_CLOSED_CREATOR(6, "closed_creator");

        public static final Companion Companion = new Companion();
        public String captionName;
        public final int value;

        public static ClaOriginalCaptionType valueOf(String str) {
            return (ClaOriginalCaptionType) V0N.LJJJ(ClaOriginalCaptionType.class, str);
        }

        /* loaded from: classes16.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }

            public final ClaOriginalCaptionType fromInt(Integer num) {
                if (num != null) {
                    num.intValue();
                    for (ClaOriginalCaptionType claOriginalCaptionType : ClaOriginalCaptionType.values()) {
                        if (claOriginalCaptionType.getValue() == num.intValue()) {
                            return claOriginalCaptionType;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
                return ClaOriginalCaptionType.CLA_ORIGINAL_CAPTION_TYPE_UNSPECIFIED;
            }
        }

        public final String getCaptionName() {
            return this.captionName;
        }

        public final int getValue() {
            return this.value;
        }

        public final void setCaptionName(String str) {
            o.LJIIIZ(str, "<set-?>");
            this.captionName = str;
        }

        ClaOriginalCaptionType(int i, String str) {
            this.value = i;
            this.captionName = str;
        }
    }

    /* renamed from: getOriginalCaptionType, reason: collision with other method in class */
    public final Integer m117getOriginalCaptionType() {
        return this.originalCaptionType;
    }

    public CaptionLanguage(String languageName, long j, String languageCode, boolean z, Integer num, Boolean bool, Boolean bool2) {
        o.LJIIIZ(languageName, "languageName");
        o.LJIIIZ(languageCode, "languageCode");
        this.languageName = languageName;
        this.languageId = j;
        this.languageCode = languageCode;
        this.canTranslateRealtime = z;
        this.originalCaptionType = num;
        this.isBurninCaption = bool;
        this.canTranslateRealtimeSkipTranslationLangCheck = bool2;
    }

    public /* synthetic */ CaptionLanguage(String str, long j, String str2, boolean z, Integer num, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) == 0 ? str2 : "", (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : bool, (i & 64) == 0 ? bool2 : null);
    }
}
