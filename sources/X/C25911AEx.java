package X;

import com.ss.android.ugc.aweme.contentlanguage.viewmodel.ContentPreferenceViewModel;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import kotlin.jvm.internal.o;

/* renamed from: X.AEx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25911AEx implements EUJ {
    public final /* synthetic */ ContentPreferenceViewModel LJLIL;

    @Override // X.EUJ
    public final void onFailed(Exception e) {
        o.LJIIIZ(e, "e");
    }

    public C25911AEx(ContentPreferenceViewModel contentPreferenceViewModel) {
        this.LJLIL = contentPreferenceViewModel;
    }

    @Override // X.EUJ
    public final void A1(PushSettings settings) {
        o.LJIIIZ(settings, "settings");
        this.LJLIL.jv0(settings.selectedContentLanguage, settings.unSelectedContentLanguage);
    }
}
