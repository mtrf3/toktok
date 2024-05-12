package com.ss.android.ugc.aweme.commercialize.preview.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes11.dex */
public final class PreviewConfiguration extends F9E {

    @InterfaceC65349Pkn("delay_time_in_millisecond")
    public final int delayTimeInMillisecond;

    @InterfaceC65349Pkn("validation_duration_in_minute")
    public final int validationDurationInMinute;

    public static /* synthetic */ PreviewConfiguration copy$default(PreviewConfiguration previewConfiguration, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = previewConfiguration.delayTimeInMillisecond;
        }
        if ((i3 & 2) != 0) {
            i2 = previewConfiguration.validationDurationInMinute;
        }
        return previewConfiguration.copy(i, i2);
    }

    public final PreviewConfiguration copy(int i, int i2) {
        return new PreviewConfiguration(i, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.delayTimeInMillisecond), Integer.valueOf(this.validationDurationInMinute)};
    }

    public final int getDelayTimeInMillisecond() {
        return this.delayTimeInMillisecond;
    }

    public final int getValidationDurationInMinute() {
        return this.validationDurationInMinute;
    }

    public PreviewConfiguration(int i, int i2) {
        this.delayTimeInMillisecond = i;
        this.validationDurationInMinute = i2;
    }
}
