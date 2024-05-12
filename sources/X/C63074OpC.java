package X;

import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.Comparator;

/* renamed from: X.OpC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63074OpC implements Comparator<TextExtraStruct> {
    @Override // java.util.Comparator
    public final int compare(TextExtraStruct textExtraStruct, TextExtraStruct textExtraStruct2) {
        TextExtraStruct textExtraStruct3 = textExtraStruct;
        TextExtraStruct textExtraStruct4 = textExtraStruct2;
        if (textExtraStruct3 == null || textExtraStruct4 == null || textExtraStruct3.getStart() == textExtraStruct4.getStart()) {
            return 0;
        }
        if (textExtraStruct3.getStart() < textExtraStruct4.getStart()) {
            return -1;
        }
        return 1;
    }
}
