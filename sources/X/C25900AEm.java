package X;

import com.ss.android.ugc.trill.setting.PreferredLanguageSettingPageViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.AEm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25900AEm implements InterfaceC25906AEs {
    public final /* synthetic */ PreferredLanguageSettingPageViewModel LJLIL;

    public C25900AEm(PreferredLanguageSettingPageViewModel preferredLanguageSettingPageViewModel) {
        this.LJLIL = preferredLanguageSettingPageViewModel;
    }

    @Override // X.InterfaceC25906AEs
    public final void pb(Throwable th) {
        this.LJLIL.LJLJJLL.postValue(Boolean.FALSE);
        this.LJLIL.LJLIL.pb(th);
    }

    @Override // X.InterfaceC25906AEs
    public final void Wf(String[] changedLanguageCodes, String[] changedLanguageNames) {
        o.LJIIIZ(changedLanguageCodes, "changedLanguageCodes");
        o.LJIIIZ(changedLanguageNames, "changedLanguageNames");
        this.LJLIL.LJLJJLL.postValue(Boolean.FALSE);
        this.LJLIL.LJLIL.Wf(changedLanguageCodes, changedLanguageNames);
    }
}
