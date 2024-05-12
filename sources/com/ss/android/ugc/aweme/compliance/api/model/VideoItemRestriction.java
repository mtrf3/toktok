package com.ss.android.ugc.aweme.compliance.api.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class VideoItemRestriction extends F9E implements Serializable {

    @InterfaceC65349Pkn("comment")
    public final PrivacySettingsRestrictionItem comment;

    @InterfaceC65349Pkn("duet")
    public final PrivacySettingsRestrictionItem duet;

    @InterfaceC65349Pkn("create_sticker")
    public final PrivacySettingsRestrictionItem sticker;

    @InterfaceC65349Pkn("stitch")
    public final PrivacySettingsRestrictionItem stitch;

    public static /* synthetic */ VideoItemRestriction copy$default(VideoItemRestriction videoItemRestriction, PrivacySettingsRestrictionItem privacySettingsRestrictionItem, PrivacySettingsRestrictionItem privacySettingsRestrictionItem2, PrivacySettingsRestrictionItem privacySettingsRestrictionItem3, PrivacySettingsRestrictionItem privacySettingsRestrictionItem4, int i, Object obj) {
        if ((i & 1) != 0) {
            privacySettingsRestrictionItem = videoItemRestriction.duet;
        }
        if ((i & 2) != 0) {
            privacySettingsRestrictionItem2 = videoItemRestriction.stitch;
        }
        if ((i & 4) != 0) {
            privacySettingsRestrictionItem3 = videoItemRestriction.comment;
        }
        if ((i & 8) != 0) {
            privacySettingsRestrictionItem4 = videoItemRestriction.sticker;
        }
        return videoItemRestriction.copy(privacySettingsRestrictionItem, privacySettingsRestrictionItem2, privacySettingsRestrictionItem3, privacySettingsRestrictionItem4);
    }

    public final VideoItemRestriction copy(PrivacySettingsRestrictionItem duet, PrivacySettingsRestrictionItem stitch, PrivacySettingsRestrictionItem comment, PrivacySettingsRestrictionItem sticker) {
        o.LJIIIZ(duet, "duet");
        o.LJIIIZ(stitch, "stitch");
        o.LJIIIZ(comment, "comment");
        o.LJIIIZ(sticker, "sticker");
        return new VideoItemRestriction(duet, stitch, comment, sticker);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.duet, this.stitch, this.comment, this.sticker};
    }

    public final PrivacySettingsRestrictionItem getComment() {
        return this.comment;
    }

    public final PrivacySettingsRestrictionItem getDuet() {
        return this.duet;
    }

    public final PrivacySettingsRestrictionItem getSticker() {
        return this.sticker;
    }

    public final PrivacySettingsRestrictionItem getStitch() {
        return this.stitch;
    }

    public VideoItemRestriction(PrivacySettingsRestrictionItem duet, PrivacySettingsRestrictionItem stitch, PrivacySettingsRestrictionItem comment, PrivacySettingsRestrictionItem sticker) {
        o.LJIIIZ(duet, "duet");
        o.LJIIIZ(stitch, "stitch");
        o.LJIIIZ(comment, "comment");
        o.LJIIIZ(sticker, "sticker");
        this.duet = duet;
        this.stitch = stitch;
        this.comment = comment;
        this.sticker = sticker;
    }
}
