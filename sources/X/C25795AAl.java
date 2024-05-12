package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.trill.setting.PreferredLanguageSettingFragment;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.AAl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25795AAl implements InterfaceC85901XnV {
    public final /* synthetic */ List<String> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ InterfaceC25796AAm LJLJJI;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC85901XnV
    public final void A1(PushSettings pushSettings) {
        Serializable serializable;
        List<String> list = this.LJLIL;
        String str = this.LJLILLLLZI;
        int i = this.LJLJI;
        InterfaceC25796AAm interfaceC25796AAm = this.LJLJJI;
        PreferredLanguageSettingFragment preferredLanguageSettingFragment = new PreferredLanguageSettingFragment();
        Bundle arguments = preferredLanguageSettingFragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBoolean("IS_HALF_SHEET", true);
        List<ContentLanguage> list2 = pushSettings.contentLanguage;
        Serializable serializable2 = null;
        if (list2 != null) {
            serializable = (ContentLanguage[]) list2.toArray(new ContentLanguage[0]);
        } else {
            serializable = null;
        }
        if (serializable instanceof Serializable) {
            serializable2 = serializable;
        }
        arguments.putSerializable("all_content_languages", serializable2);
        arguments.putStringArray("selected_language_codes", (String[]) list.toArray(new String[0]));
        ContentLanguage[] LIZ = C2299390r.LIZ();
        ArrayList arrayList = new ArrayList(LIZ.length);
        for (ContentLanguage contentLanguage : LIZ) {
            arrayList.add(contentLanguage.getLanguageCode());
        }
        arguments.putStringArray("predicted_content_languages", (String[]) arrayList.toArray(new String[0]));
        arguments.putString("enter_from", str);
        arguments.putInt("previous_popup_shown_count", i);
        preferredLanguageSettingFragment.setArguments(arguments);
        interfaceC25796AAm.LIZIZ(preferredLanguageSettingFragment);
    }

    @Override // X.InterfaceC85901XnV
    public final void onFailed(Exception exc) {
        this.LJLJJI.LIZ();
    }

    public C25795AAl(int i, C237309Ta c237309Ta, String str, List list) {
        this.LJLIL = list;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = c237309Ta;
    }
}
