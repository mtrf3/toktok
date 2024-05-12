package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ug.settings.SparkPreloadModel;
import com.ss.android.ugc.aweme.ug.settings.SparkReUseModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.9rH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C249839rH extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends String>> {
    public static final C249839rH LJLIL = new C249839rH();

    public C249839rH() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends String> invoke() {
        Collection collection;
        Iterable iterable;
        C249879rL c249879rL = C249879rL.LIZ;
        c249879rL.getClass();
        SparkReUseModel LIZIZ = C249879rL.LIZIZ();
        if (LIZIZ == null || (collection = LIZIZ.allowSchemaList) == null) {
            collection = C61878OQg.INSTANCE;
        }
        c249879rL.getClass();
        SparkPreloadModel LIZ = C249879rL.LIZ();
        if (LIZ == null || (iterable = LIZ.allowSchemaList) == null) {
            iterable = C61878OQg.INSTANCE;
        }
        List LLIIIZ = ORZ.LLIIIZ(iterable, collection);
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        String[] strArr = C250089rg.LIZ;
        String[] strArr2 = (String[]) LIZLLL.LJIIIIZZ("incentive_reuse_urls", String[].class, strArr);
        if (strArr2 != null) {
            strArr = strArr2;
        }
        ArrayList arrayList = new ArrayList(((ArrayList) LLIIIZ).size() + strArr.length);
        arrayList.addAll(LLIIIZ);
        ORS.LJJLIIIJJIZ(arrayList, strArr);
        return arrayList;
    }
}
