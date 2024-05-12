package X;

import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.SMv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71981SMv extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends PrivacySettingsRestrictionItem>> {
    public static final C71981SMv LJLIL = new C71981SMv();

    public C71981SMv() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends PrivacySettingsRestrictionItem> invoke() {
        List<String> LJJIJIIJI = C47261Igj.LJJIJIIJI("mention", "tag");
        ArrayList arrayList = new ArrayList();
        for (String str : LJJIJIIJI) {
            C72041SPd.LIZ.getClass();
            PrivacySettingsRestrictionItem LJFF = C72041SPd.LJFF(0, str);
            if (LJFF != null) {
                arrayList.add(LJFF);
            }
        }
        return arrayList;
    }
}
