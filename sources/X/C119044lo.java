package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.qna.settings.QnaCategoriesList;

/* renamed from: X.4lo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119044lo extends AbstractC65781Prl implements InterfaceC65784Pro<QnaCategoriesList> {
    public static final C119044lo LJLIL = new C119044lo();

    public C119044lo() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.qna.settings.QnaCategoriesList, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final QnaCategoriesList invoke() {
        return SettingsManager.LIZLLL().LJIIIIZZ("qna_category_suggestions", QnaCategoriesList.class, C119034ln.LIZIZ);
    }
}
