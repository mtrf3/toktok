package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.emoji.sysemoji.ImSysEmojiModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.756, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass756 extends AbstractC65781Prl implements InterfaceC65784Pro<String[]> {
    public static final AnonymousClass756 LJLIL = new AnonymousClass756();

    public AnonymousClass756() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    @Override // X.InterfaceC65784Pro
    public final String[] invoke() {
        ?? r7;
        AnonymousClass755 anonymousClass755 = AnonymousClass755.LIZ;
        String[] strArr = (String[]) SettingsManager.LIZLLL().LJIIIIZZ("tt_quick_comment_emojis", String[].class, AnonymousClass755.LIZIZ);
        anonymousClass755.getClass();
        if (strArr == null) {
            return null;
        }
        C4VN.LIZ();
        List LIZIZ = C110154Tz.LIZIZ(7);
        if (LIZIZ != null) {
            r7 = new ArrayList(C32I.LJJL(LIZIZ, 10));
            Iterator it = LIZIZ.iterator();
            while (it.hasNext()) {
                r7.add(((ImSysEmojiModel) it.next()).getPreviewEmoji());
            }
        } else {
            r7 = C61878OQg.INSTANCE;
        }
        C1807477m.LIZ.getClass();
        Object[] objArr = (Object[]) C1807477m.LIZLLL.getValue();
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            if (!r7.contains(str) && !ORY.LJJIJIIJIL(str, objArr)) {
                if (i < 0) {
                    return strArr;
                }
                Object LJJJJI = ORY.LJJJJI(i, strArr);
                if (LJJJJI == null) {
                    LJJJJI = "";
                }
                FMX.LJIILL("show_unrendered_emoji", new OSZ(LJJJJI, "emoji"));
                return AnonymousClass755.LIZLLL;
            }
        }
        return strArr;
    }
}
