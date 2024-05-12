package X;

import android.content.Intent;
import com.ss.android.ugc.trill.setting.DoNotTranslateSettingPage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.AAt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25803AAt implements InterfaceC25805AAv {
    public final /* synthetic */ DoNotTranslateSettingPage LIZ;

    @Override // X.InterfaceC25805AAv
    public final void LIZ() {
        ActivityC45651qj mo49getActivity = this.LIZ.mo49getActivity();
        if (mo49getActivity != null) {
            C40328FsC.LIZLLL(mo49getActivity, R.string.im9);
        }
    }

    public C25803AAt(DoNotTranslateSettingPage doNotTranslateSettingPage) {
        this.LIZ = doNotTranslateSettingPage;
    }

    @Override // X.InterfaceC25805AAv
    public final void LIZIZ(String[] changedLanguageCodes, String[] changedLanguageNames) {
        o.LJIIIZ(changedLanguageCodes, "changedLanguageCodes");
        o.LJIIIZ(changedLanguageNames, "changedLanguageNames");
        C25792AAi.LIZ().LIZLLL(changedLanguageCodes);
        C25792AAi.LIZ().LJIIL(changedLanguageNames);
        Intent intent = new Intent();
        ActivityC45651qj mo49getActivity = this.LIZ.mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.setResult(-1, intent);
        }
        DoNotTranslateSettingPage.LJLJLJ.getClass();
        DoNotTranslateSettingPage.LJLJLLL = intent;
        this.LIZ.vl();
    }
}
