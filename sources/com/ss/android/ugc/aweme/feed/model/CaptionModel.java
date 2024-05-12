package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.V0N;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class CaptionModel implements Serializable {

    @InterfaceC65349Pkn("appearance")
    public CaptionAppearance appearance;

    @InterfaceC65349Pkn("caption_infos")
    public List<CaptionItemModel> captionList;

    @InterfaceC65349Pkn("captions_type")
    public Integer captionsType;

    @InterfaceC65349Pkn("creator_edited_caption_id")
    public Long creatorEditedCaptionId;

    @InterfaceC65349Pkn("enable_auto_caption")
    public int enableAutoCaption;

    @InterfaceC65349Pkn("has_original_audio")
    public int hasOriginalAudio;

    @InterfaceC65349Pkn("hide_original_caption")
    public Boolean hideOriginalCaption;

    @InterfaceC65349Pkn("no_caption_reason")
    public Integer noCaptionReason;

    @InterfaceC65349Pkn("original_language_info")
    public CaptionLanguage originalCaptionLanguage;

    @InterfaceC65349Pkn("position")
    public CaptionPosition position;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CaptionModel() {
        /*
            r13 = this;
            r1 = 0
            r3 = 0
            r11 = 1023(0x3ff, float:1.434E-42)
            r0 = r13
            r2 = r1
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            r8 = r3
            r9 = r3
            r10 = r3
            r12 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.CaptionModel.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CaptionModel copy$default(CaptionModel captionModel, int i, int i2, CaptionLanguage captionLanguage, List list, Long l, CaptionAppearance captionAppearance, CaptionPosition captionPosition, Boolean bool, Integer num, Integer num2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = captionModel.hasOriginalAudio;
        }
        if ((i3 & 2) != 0) {
            i2 = captionModel.enableAutoCaption;
        }
        if ((i3 & 4) != 0) {
            captionLanguage = captionModel.originalCaptionLanguage;
        }
        if ((i3 & 8) != 0) {
            list = captionModel.captionList;
        }
        if ((i3 & 16) != 0) {
            l = captionModel.creatorEditedCaptionId;
        }
        if ((i3 & 32) != 0) {
            captionAppearance = captionModel.appearance;
        }
        if ((i3 & 64) != 0) {
            captionPosition = captionModel.position;
        }
        if ((i3 & 128) != 0) {
            bool = captionModel.hideOriginalCaption;
        }
        if ((i3 & 256) != 0) {
            num = captionModel.captionsType;
        }
        if ((i3 & 512) != 0) {
            num2 = captionModel.noCaptionReason;
        }
        return captionModel.copy(i, i2, captionLanguage, list, l, captionAppearance, captionPosition, bool, num, num2);
    }

    public final CaptionModel copy(int i, int i2, CaptionLanguage captionLanguage, List<CaptionItemModel> list, Long l, CaptionAppearance captionAppearance, CaptionPosition captionPosition, Boolean bool, Integer num, Integer num2) {
        return new CaptionModel(i, i2, captionLanguage, list, l, captionAppearance, captionPosition, bool, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CaptionModel)) {
            return false;
        }
        CaptionModel captionModel = (CaptionModel) obj;
        return this.hasOriginalAudio == captionModel.hasOriginalAudio && this.enableAutoCaption == captionModel.enableAutoCaption && o.LJ(this.originalCaptionLanguage, captionModel.originalCaptionLanguage) && o.LJ(this.captionList, captionModel.captionList) && o.LJ(this.creatorEditedCaptionId, captionModel.creatorEditedCaptionId) && o.LJ(this.appearance, captionModel.appearance) && o.LJ(this.position, captionModel.position) && o.LJ(this.hideOriginalCaption, captionModel.hideOriginalCaption) && o.LJ(this.captionsType, captionModel.captionsType) && o.LJ(this.noCaptionReason, captionModel.noCaptionReason);
    }

    public int hashCode() {
        int i = ((this.hasOriginalAudio * 31) + this.enableAutoCaption) * 31;
        CaptionLanguage captionLanguage = this.originalCaptionLanguage;
        int hashCode = (i + (captionLanguage == null ? 0 : captionLanguage.hashCode())) * 31;
        List<CaptionItemModel> list = this.captionList;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.creatorEditedCaptionId;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        CaptionAppearance captionAppearance = this.appearance;
        int hashCode4 = (hashCode3 + (captionAppearance == null ? 0 : captionAppearance.hashCode())) * 31;
        CaptionPosition captionPosition = this.position;
        int hashCode5 = (hashCode4 + (captionPosition == null ? 0 : captionPosition.hashCode())) * 31;
        Boolean bool = this.hideOriginalCaption;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.captionsType;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.noCaptionReason;
        return hashCode7 + (num2 != null ? num2.hashCode() : 0);
    }

    public final CaptionsTypeEnum getCaptionsType() {
        return CaptionsTypeEnum.Companion.fromInt(this.captionsType);
    }

    public final NoCaptionReasonEnum getNoCaptionReason() {
        return NoCaptionReasonEnum.Companion.fromInt(this.noCaptionReason);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CaptionModel(hasOriginalAudio=");
        LIZ.append(this.hasOriginalAudio);
        LIZ.append(", enableAutoCaption=");
        LIZ.append(this.enableAutoCaption);
        LIZ.append(", originalCaptionLanguage=");
        LIZ.append(this.originalCaptionLanguage);
        LIZ.append(", captionList=");
        LIZ.append(this.captionList);
        LIZ.append(", creatorEditedCaptionId=");
        LIZ.append(this.creatorEditedCaptionId);
        LIZ.append(", appearance=");
        LIZ.append(this.appearance);
        LIZ.append(", position=");
        LIZ.append(this.position);
        LIZ.append(", hideOriginalCaption=");
        LIZ.append(this.hideOriginalCaption);
        LIZ.append(", captionsType=");
        LIZ.append(this.captionsType);
        LIZ.append(", noCaptionReason=");
        return s0.LIZJ(LIZ, this.noCaptionReason, ')', LIZ);
    }

    /* loaded from: classes5.dex */
    public enum NoCaptionReasonEnum {
        CLA_NO_CAPTION_REASON_NO_OP(0),
        CLA_NO_CAPTION_REASON_OTHER(1),
        CLA_NO_CAPTION_REASON_NOT_AUTHORIZED(2),
        CLA_NO_CAPTION_REASON_SPEECH_UNRECOGNIZED(3),
        CLA_NO_CAPTION_REASON_LANG_NOT_SUPPORTED(4);

        public static final Companion Companion = new Companion();
        public final int value;

        public static NoCaptionReasonEnum valueOf(String str) {
            return (NoCaptionReasonEnum) V0N.LJJJ(NoCaptionReasonEnum.class, str);
        }

        /* loaded from: classes5.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }

            public final NoCaptionReasonEnum fromInt(Integer num) {
                if (num != null) {
                    num.intValue();
                    for (NoCaptionReasonEnum noCaptionReasonEnum : NoCaptionReasonEnum.values()) {
                        if (noCaptionReasonEnum.getValue() == num.intValue()) {
                            return noCaptionReasonEnum;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
                return NoCaptionReasonEnum.CLA_NO_CAPTION_REASON_NO_OP;
            }
        }

        public final int getValue() {
            return this.value;
        }

        NoCaptionReasonEnum(int i) {
            this.value = i;
        }
    }

    /* loaded from: classes13.dex */
    public enum CaptionsTypeEnum {
        CLA_CAPTIONS_TYPE_UNSPECIFIED(0),
        CLA_CAPTIONS_TYPE_ORIGINAL(1),
        CLA_CAPTIONS_TYPE_ORIGINAL_WITH_TRANSLATION(2);

        public static final Companion Companion = new Companion();
        public final int value;

        public static CaptionsTypeEnum valueOf(String str) {
            return (CaptionsTypeEnum) V0N.LJJJ(CaptionsTypeEnum.class, str);
        }

        /* loaded from: classes13.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }

            public final CaptionsTypeEnum fromInt(Integer num) {
                if (num != null) {
                    num.intValue();
                    for (CaptionsTypeEnum captionsTypeEnum : CaptionsTypeEnum.values()) {
                        if (captionsTypeEnum.getValue() == num.intValue()) {
                            return captionsTypeEnum;
                        }
                    }
                    throw new NoSuchElementException("Array contains no element matching the predicate.");
                }
                return CaptionsTypeEnum.CLA_CAPTIONS_TYPE_UNSPECIFIED;
            }
        }

        public final int getValue() {
            return this.value;
        }

        CaptionsTypeEnum(int i) {
            this.value = i;
        }
    }

    public final CaptionAppearance getAppearance() {
        return this.appearance;
    }

    public final List<CaptionItemModel> getCaptionList() {
        return this.captionList;
    }

    public final Long getCreatorEditedCaptionId() {
        return this.creatorEditedCaptionId;
    }

    public final int getEnableAutoCaption() {
        return this.enableAutoCaption;
    }

    public final int getHasOriginalAudio() {
        return this.hasOriginalAudio;
    }

    public final Boolean getHideOriginalCaption() {
        return this.hideOriginalCaption;
    }

    public final CaptionLanguage getOriginalCaptionLanguage() {
        return this.originalCaptionLanguage;
    }

    public final CaptionPosition getPosition() {
        return this.position;
    }

    /* renamed from: getCaptionsType, reason: collision with other method in class */
    public final Integer m118getCaptionsType() {
        return this.captionsType;
    }

    /* renamed from: getNoCaptionReason, reason: collision with other method in class */
    public final Integer m119getNoCaptionReason() {
        return this.noCaptionReason;
    }

    public CaptionModel(int i, int i2, CaptionLanguage captionLanguage, List<CaptionItemModel> list, Long l, CaptionAppearance captionAppearance, CaptionPosition captionPosition, Boolean bool, Integer num, Integer num2) {
        this.hasOriginalAudio = i;
        this.enableAutoCaption = i2;
        this.originalCaptionLanguage = captionLanguage;
        this.captionList = list;
        this.creatorEditedCaptionId = l;
        this.appearance = captionAppearance;
        this.position = captionPosition;
        this.hideOriginalCaption = bool;
        this.captionsType = num;
        this.noCaptionReason = num2;
    }

    public /* synthetic */ CaptionModel(int i, int i2, CaptionLanguage captionLanguage, List list, Long l, CaptionAppearance captionAppearance, CaptionPosition captionPosition, Boolean bool, Integer num, Integer num2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) == 0 ? i2 : 0, (i3 & 4) != 0 ? null : captionLanguage, (i3 & 8) != 0 ? null : list, (i3 & 16) != 0 ? null : l, (i3 & 32) != 0 ? null : captionAppearance, (i3 & 64) != 0 ? null : captionPosition, (i3 & 128) != 0 ? Boolean.FALSE : bool, (i3 & 256) != 0 ? null : num, (i3 & 512) == 0 ? num2 : null);
    }
}
