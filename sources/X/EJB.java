package X;

import com.ss.android.ugc.aweme.settingsrequest.SettingsRequestApiImpl;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestApi;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EJB implements ISettingsRequestApi {
    public static final EJB LIZIZ = new EJB();
    public final /* synthetic */ ISettingsRequestApi LIZ = SettingsRequestApiImpl.LIZJ();

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestApi
    public final void LIZ(EJA type, EJ9 ej9) {
        o.LJIIIZ(type, "type");
        this.LIZ.LIZ(type, ej9);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestApi
    public final EE1 LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestApi
    public final void LJFF(EUJ euj) {
        this.LIZ.LJFF(euj);
    }
}
