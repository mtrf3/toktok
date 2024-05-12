package X;

import android.os.Build;
import com.ss.android.ugc.aweme.comment.quickcomment.QuickEmojiExtension;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.77l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1807377l extends AbstractC65781Prl implements InterfaceC65784Pro<String[]> {
    public static final C1807377l LJLIL = new C1807377l();

    public C1807377l() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object[], java.lang.String[]] */
    @Override // X.InterfaceC65784Pro
    public final String[] invoke() {
        C1807477m.LIZ.getClass();
        QuickEmojiExtension[] quickEmojiExtensionArr = (QuickEmojiExtension[]) C1807477m.LIZJ.getValue();
        ArrayList arrayList = new ArrayList();
        for (QuickEmojiExtension quickEmojiExtension : quickEmojiExtensionArr) {
            if (quickEmojiExtension.androidVersion <= Build.VERSION.SDK_INT) {
                arrayList.add(quickEmojiExtension);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = ((QuickEmojiExtension) it.next()).emoji;
            if (str == null) {
                str = "";
            }
            arrayList2.add(str);
        }
        return arrayList2.toArray(new String[0]);
    }
}
