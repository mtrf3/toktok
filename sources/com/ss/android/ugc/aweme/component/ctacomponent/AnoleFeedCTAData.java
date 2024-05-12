package com.ss.android.ugc.aweme.component.ctacomponent;

import X.C141335gf;
import X.C3C5;
import X.InterfaceC65349Pkn;
import android.graphics.Color;
import com.ss.android.ugc.aweme.commercialize.model.AnoleLogInfo;
import java.io.Serializable;

/* loaded from: classes11.dex */
public final class AnoleFeedCTAData implements Serializable {

    @InterfaceC65349Pkn("cta_button")
    public final AnolFeedCtaButtonData ctaButtonData;

    @InterfaceC65349Pkn("log_info")
    public final AnoleLogInfo logInfo;

    public final int getBackgroundColor() {
        Object LIZ;
        String str;
        try {
            AnolFeedCtaButtonData anolFeedCtaButtonData = this.ctaButtonData;
            if (anolFeedCtaButtonData != null) {
                str = anolFeedCtaButtonData.getBackgroundColor();
            } else {
                str = null;
            }
            LIZ = Integer.valueOf(Color.parseColor(str));
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Integer num = (Integer) (C3C5.m12isFailureimpl(LIZ) ? null : LIZ);
        if (num != null) {
            return num.intValue();
        }
        return 6977122;
    }

    public final int getInitialBackgroundColor() {
        Object LIZ;
        String str;
        try {
            AnolFeedCtaButtonData anolFeedCtaButtonData = this.ctaButtonData;
            if (anolFeedCtaButtonData != null) {
                str = anolFeedCtaButtonData.getInitialBackgroundColor();
            } else {
                str = null;
            }
            LIZ = Integer.valueOf(Color.parseColor(str));
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Integer num = (Integer) (C3C5.m12isFailureimpl(LIZ) ? null : LIZ);
        if (num != null) {
            return num.intValue();
        }
        return 318767103;
    }

    public final String getButtonText() {
        AnolFeedCtaButtonData anolFeedCtaButtonData = this.ctaButtonData;
        if (anolFeedCtaButtonData != null) {
            return anolFeedCtaButtonData.getButtonText();
        }
        return null;
    }

    public final Float getColorShowTime() {
        AnolFeedCtaButtonData anolFeedCtaButtonData = this.ctaButtonData;
        if (anolFeedCtaButtonData != null) {
            return Float.valueOf(anolFeedCtaButtonData.getColorShowTime());
        }
        return null;
    }

    public final int getHeight() {
        Integer height;
        AnolFeedCtaButtonData anolFeedCtaButtonData = this.ctaButtonData;
        if (anolFeedCtaButtonData != null && (height = anolFeedCtaButtonData.getHeight()) != null) {
            return height.intValue();
        }
        return 40;
    }

    public final String getIconURL() {
        AnolFeedCtaButtonData anolFeedCtaButtonData = this.ctaButtonData;
        if (anolFeedCtaButtonData != null) {
            return anolFeedCtaButtonData.getIconURL();
        }
        return null;
    }

    public final AnolFeedCtaButtonData getCtaButtonData() {
        return this.ctaButtonData;
    }

    public final AnoleLogInfo getLogInfo() {
        return this.logInfo;
    }

    public AnoleFeedCTAData(AnoleLogInfo anoleLogInfo, AnolFeedCtaButtonData anolFeedCtaButtonData) {
        this.logInfo = anoleLogInfo;
        this.ctaButtonData = anolFeedCtaButtonData;
    }
}
