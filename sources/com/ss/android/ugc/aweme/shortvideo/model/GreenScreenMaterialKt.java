package com.ss.android.ugc.aweme.shortvideo.model;

import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GreenScreenMaterialKt {
    public static final String getAuthorName(TimeSpeedModelExtension timeSpeedModelExtension) {
        o.LJIIIZ(timeSpeedModelExtension, "<this>");
        GreenScreenMaterial greenScreenMaterial = (GreenScreenMaterial) timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material");
        if (greenScreenMaterial != null) {
            return greenScreenMaterial.getAuthorName();
        }
        return null;
    }

    public static final String getEffectId(TimeSpeedModelExtension timeSpeedModelExtension) {
        o.LJIIIZ(timeSpeedModelExtension, "<this>");
        GreenScreenMaterial greenScreenMaterial = (GreenScreenMaterial) timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material");
        if (greenScreenMaterial != null) {
            return greenScreenMaterial.getStickerId();
        }
        return null;
    }

    public static final Long getEndTime(TimeSpeedModelExtension timeSpeedModelExtension) {
        o.LJIIIZ(timeSpeedModelExtension, "<this>");
        GreenScreenMaterial greenScreenMaterial = (GreenScreenMaterial) timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material");
        if (greenScreenMaterial != null) {
            return Long.valueOf(greenScreenMaterial.getEndTime());
        }
        return null;
    }

    public static final String getLocalPath(TimeSpeedModelExtension timeSpeedModelExtension) {
        o.LJIIIZ(timeSpeedModelExtension, "<this>");
        GreenScreenMaterial greenScreenMaterial = (GreenScreenMaterial) timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material");
        if (greenScreenMaterial != null) {
            return greenScreenMaterial.getLocalPath();
        }
        return null;
    }

    public static final String getMediasource(TimeSpeedModelExtension timeSpeedModelExtension) {
        o.LJIIIZ(timeSpeedModelExtension, "<this>");
        GreenScreenMaterial greenScreenMaterial = (GreenScreenMaterial) timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material");
        if (greenScreenMaterial != null) {
            return greenScreenMaterial.getMediasource();
        }
        return null;
    }

    public static final String getResId(TimeSpeedModelExtension timeSpeedModelExtension) {
        o.LJIIIZ(timeSpeedModelExtension, "<this>");
        GreenScreenMaterial greenScreenMaterial = (GreenScreenMaterial) timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material");
        if (greenScreenMaterial != null) {
            return greenScreenMaterial.getResId();
        }
        return null;
    }

    public static final Long getStartTime(TimeSpeedModelExtension timeSpeedModelExtension) {
        o.LJIIIZ(timeSpeedModelExtension, "<this>");
        GreenScreenMaterial greenScreenMaterial = (GreenScreenMaterial) timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material");
        if (greenScreenMaterial != null) {
            return Long.valueOf(greenScreenMaterial.getStartTime());
        }
        return null;
    }

    public static final Integer getType(TimeSpeedModelExtension timeSpeedModelExtension) {
        o.LJIIIZ(timeSpeedModelExtension, "<this>");
        GreenScreenMaterial greenScreenMaterial = (GreenScreenMaterial) timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material");
        if (greenScreenMaterial != null) {
            return Integer.valueOf(greenScreenMaterial.getType());
        }
        return null;
    }

    public static final boolean isGreenScreenClip(TimeSpeedModelExtension timeSpeedModelExtension) {
        o.LJIIIZ(timeSpeedModelExtension, "<this>");
        if (!timeSpeedModelExtension.getRecordExtras().isEmpty() && timeSpeedModelExtension.getFromRecordExtras("extra_key_green_screen_material") != null) {
            return true;
        }
        return false;
    }

    public static final Bundle asBundle(GreenScreenMaterial greenScreenMaterial, Bundle bundle) {
        o.LJIIIZ(greenScreenMaterial, "<this>");
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("extra_key_green_screen_material", greenScreenMaterial);
        return bundle;
    }

    public static /* synthetic */ Bundle asBundle$default(GreenScreenMaterial greenScreenMaterial, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            bundle = null;
        }
        return asBundle(greenScreenMaterial, bundle);
    }
}
