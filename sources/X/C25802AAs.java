package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.trill.setting.DoNotTranslateSettingPage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AAs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25802AAs implements InterfaceC85901XnV {
    public final /* synthetic */ DoNotTranslateSettingPage LJLIL;
    public final /* synthetic */ InterfaceC35811ar<List<ContentLanguage>> LJLILLLLZI;
    public final /* synthetic */ InterfaceC35811ar<List<String>> LJLJI;
    public final /* synthetic */ InterfaceC35811ar<List<String>> LJLJJI;
    public final /* synthetic */ InterfaceC35811ar<List<String>> LJLJJL;

    @Override // X.InterfaceC85901XnV
    public final void onFailed(Exception exc) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    @Override // X.InterfaceC85901XnV
    public final void A1(PushSettings pushSettings) {
        ?? r8;
        DoNotTranslateSettingPage doNotTranslateSettingPage = this.LJLIL;
        InterfaceC35811ar<List<ContentLanguage>> interfaceC35811ar = this.LJLILLLLZI;
        InterfaceC35811ar<List<String>> interfaceC35811ar2 = this.LJLJI;
        InterfaceC35811ar<List<String>> interfaceC35811ar3 = this.LJLJJI;
        InterfaceC35811ar<List<String>> interfaceC35811ar4 = this.LJLJJL;
        List list = pushSettings.allDoNotTranslate;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        List<ContentLanguage> list2 = pushSettings.selectedDoNotTranslate;
        if (list2 != null) {
            r8 = new ArrayList(C32I.LJJL(list2, 10));
            Iterator<ContentLanguage> it = list2.iterator();
            while (it.hasNext()) {
                r8.add(it.next().getLanguageCode());
            }
        } else {
            r8 = C61878OQg.INSTANCE;
        }
        C25801AAr.LJ(doNotTranslateSettingPage, interfaceC35811ar, interfaceC35811ar2, interfaceC35811ar3, interfaceC35811ar4, list, r8);
    }

    public C25802AAs(DoNotTranslateSettingPage doNotTranslateSettingPage, InterfaceC35811ar<List<ContentLanguage>> interfaceC35811ar, InterfaceC35811ar<List<String>> interfaceC35811ar2, InterfaceC35811ar<List<String>> interfaceC35811ar3, InterfaceC35811ar<List<String>> interfaceC35811ar4) {
        this.LJLIL = doNotTranslateSettingPage;
        this.LJLILLLLZI = interfaceC35811ar;
        this.LJLJI = interfaceC35811ar2;
        this.LJLJJI = interfaceC35811ar3;
        this.LJLJJL = interfaceC35811ar4;
    }
}
