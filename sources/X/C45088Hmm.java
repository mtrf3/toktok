package X;

import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.music.model.Music;
import kotlin.jvm.internal.o;

/* renamed from: X.Hmm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45088Hmm extends AbstractC65781Prl implements InterfaceC88472Yns<CutsameDataItem, CharSequence> {
    public static final C45088Hmm LJLIL = new C45088Hmm();

    public C45088Hmm() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(CutsameDataItem cutsameDataItem) {
        Long l;
        String str;
        CutsameDataItem it = cutsameDataItem;
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(it.templateType);
        LIZ.append(" - ");
        Music music = it.music;
        if (music != null) {
            l = Long.valueOf(music.getId());
        } else {
            l = null;
        }
        LIZ.append(l);
        LIZ.append(" - ");
        if (it.templateId == null) {
            str = "null";
        } else {
            str = "";
        }
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }
}
