package com.ss.android.ugc.aweme.compliance.api.model;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PrivacyVideoRestrictionModel extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("restriction")
    public final VideoItemRestriction restriction;

    @InterfaceC65349Pkn("settings")
    public final VideoItemSettings settings;

    public static /* synthetic */ PrivacyVideoRestrictionModel copy$default(PrivacyVideoRestrictionModel privacyVideoRestrictionModel, VideoItemRestriction videoItemRestriction, VideoItemSettings videoItemSettings, int i, Object obj) {
        if ((i & 1) != 0) {
            videoItemRestriction = privacyVideoRestrictionModel.restriction;
        }
        if ((i & 2) != 0) {
            videoItemSettings = privacyVideoRestrictionModel.settings;
        }
        return privacyVideoRestrictionModel.copy(videoItemRestriction, videoItemSettings);
    }

    public final PrivacyVideoRestrictionModel copy(VideoItemRestriction restriction, VideoItemSettings settings) {
        o.LJIIIZ(restriction, "restriction");
        o.LJIIIZ(settings, "settings");
        return new PrivacyVideoRestrictionModel(restriction, settings);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PrivacyVideoRestrictionModel) {
            return C78966Uyw.LJIIIZ(((PrivacyVideoRestrictionModel) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final Object[] getObjects() {
        return new Object[]{this.restriction, this.settings};
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        return C78966Uyw.LJJJLL("PrivacyVideoRestrictionModel:%s,%s", getObjects());
    }

    public final VideoItemRestriction getRestriction() {
        return this.restriction;
    }

    public final VideoItemSettings getSettings() {
        return this.settings;
    }

    public PrivacyVideoRestrictionModel(VideoItemRestriction restriction, VideoItemSettings settings) {
        o.LJIIIZ(restriction, "restriction");
        o.LJIIIZ(settings, "settings");
        this.restriction = restriction;
        this.settings = settings;
    }
}
