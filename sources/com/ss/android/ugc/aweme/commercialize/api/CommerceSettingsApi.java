package com.ss.android.ugc.aweme.commercialize.api;

import X.C221108m2;
import X.C76L;
import X.E4Q;
import X.OVW;
import com.ss.android.ugc.aweme.commercialize.model.CommerceSettings;

/* loaded from: classes11.dex */
public final class CommerceSettingsApi {
    public static final /* synthetic */ int LIZ = 0;

    /* loaded from: classes11.dex */
    public interface IApi {
        @E4Q("/aweme/v1/commerce/settings")
        C76L<CommerceSettings> getSettings();
    }

    static {
        C221108m2.LIZIZ(OVW.LJLIL);
    }
}
