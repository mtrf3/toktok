package com.ss.android.ugc.aweme.profile.widgets.advancedfeat.features;

import X.C0DC;
import X.C65352Pkq;
import X.C8VC;
import X.C9GK;
import X.C9JT;
import X.InterfaceC235069Kk;
import X.InterfaceC235089Km;
import X.TBT;
import Y.ACListenerS24S0100000_4;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;
import com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileSingleFeatureAssem;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProfileAdvancedFeatureCollectionsAssem extends ProfileSingleFeatureAssem {
    public String LJLJJLL;

    public ProfileAdvancedFeatureCollectionsAssem() {
        new LinkedHashMap();
        this.LJLJJLL = "";
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileSingleFeatureAssem
    public final Map<String, Boolean> F3() {
        String lowerCase = "HAS_COLLECTIONS".toLowerCase(Locale.ROOT);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return C0DC.LIZIZ(lowerCase, Boolean.valueOf(this.LJLJJL));
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileSingleFeatureAssem
    public final View I3() {
        return v3(R.string.qnq, R.raw.icon_series_dollar, new ACListenerS24S0100000_4(this, 139));
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileSingleFeatureAssem, com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235069Kk.class), new TBT() { // from class: X.9Ag
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C234999Kd) obj).LIZIZ;
            }
        }, new AqS170S0100000_4(this, 638));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC235089Km.class), new TBT() { // from class: X.9Ah
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C9PN) obj).LJIIJJI;
            }
        }, new AqS170S0100000_4(this, 639));
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(C9GK.class), new TBT() { // from class: X.9Ai
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C99Z) obj).LIZ;
            }
        }, new AqS170S0100000_4(this, LiveBroadcastUploadVideoImageHeightSetting.DEFAULT));
    }

    @Override // com.ss.android.ugc.aweme.profile.widgets.advancedfeat.base.ProfileSingleFeatureAssem
    public final C9JT x3() {
        return C9JT.COLLECTIONS;
    }
}
