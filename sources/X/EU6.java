package X;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.m;
import com.ss.android.ugc.aweme.SettingsMainApiImpl;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EU6 implements ISettingsMainApi {
    public static final EU6 LIZIZ = new EU6();
    public final /* synthetic */ ISettingsMainApi LIZ;

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi
    public final void LIZ(Context context) {
        this.LIZ.LIZ(context);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi
    public final void LIZIZ(m jsonObject) {
        o.LJIIIZ(jsonObject, "jsonObject");
        this.LIZ.LIZIZ(jsonObject);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi
    public final void LIZJ(Activity activity) {
        this.LIZ.LIZJ(activity);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi
    public final void LIZLLL(EU4 eu4) {
        this.LIZ.LIZLLL(eu4);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi
    public final C100023wE LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi
    public final C100023wE LJI(SharedPreferences.Editor editor, IESSettingsProxy awemeSettings) {
        o.LJIIIZ(editor, "editor");
        o.LJIIIZ(awemeSettings, "awemeSettings");
        return this.LIZ.LJI(editor, awemeSettings);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi
    public final List<EUJ> LJII() {
        return this.LIZ.LJII();
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsMainApi
    public final boolean shouldUseRecyclerPartialUpdate() {
        return this.LIZ.shouldUseRecyclerPartialUpdate();
    }

    public EU6() {
        ISettingsMainApi iSettingsMainApi;
        Object LIZ = C58096Mr6.LIZ(ISettingsMainApi.class, false);
        if (LIZ != null) {
            iSettingsMainApi = (ISettingsMainApi) LIZ;
        } else {
            if (C58096Mr6.LJJLIL == null) {
                synchronized (ISettingsMainApi.class) {
                    if (C58096Mr6.LJJLIL == null) {
                        C58096Mr6.LJJLIL = new SettingsMainApiImpl();
                    }
                }
            }
            iSettingsMainApi = C58096Mr6.LJJLIL;
        }
        this.LIZ = iSettingsMainApi;
    }
}
