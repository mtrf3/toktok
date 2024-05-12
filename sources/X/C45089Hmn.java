package X;

import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.music.model.Music;
import kotlin.jvm.internal.o;

/* renamed from: X.Hmn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45089Hmn extends AbstractC65781Prl implements InterfaceC88472Yns<CutsameDataItem, CharSequence> {
    public static final C45089Hmn LJLIL = new C45089Hmn();

    public C45089Hmn() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(CutsameDataItem cutsameDataItem) {
        Long l;
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
        LIZ.append(it.templateId);
        return X1D.LIZIZ(LIZ);
    }
}
