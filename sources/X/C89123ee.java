package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.stickercreation.viewmodel.VideoStickerCreationViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.3ee, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C89123ee {
    public static AbstractC65590Pog LIZ(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String label = (String) it.next();
                o.LJIIIZ(label, "label");
                String label2 = s.LJZI(label).toString();
                o.LJIIIZ(label2, "label");
                String str = "";
                if (!VideoStickerCreationViewModel.LJLJLJ.containsMatchIn(label2)) {
                    String replace = VideoStickerCreationViewModel.LJLJL.replace(label2, "");
                    if (replace.length() <= 45) {
                        str = replace;
                    }
                }
                if (str.length() > 0) {
                    arrayList.add(str);
                }
                if (arrayList.size() >= 10) {
                    break;
                }
            }
        }
        AbstractC65590Pog copyOf = AbstractC65590Pog.copyOf((Collection) arrayList);
        o.LJIIIIZZ(copyOf, "copyOf(builder)");
        return copyOf;
    }
}
