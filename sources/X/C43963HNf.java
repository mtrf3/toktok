package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;

/* renamed from: X.HNf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43963HNf extends AbstractC65781Prl implements InterfaceC88472Yns<C43023GuZ, Boolean> {
    public static final C43963HNf LJLIL = new C43963HNf();

    public C43963HNf() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C43023GuZ c43023GuZ) {
        boolean z;
        List<? extends MusicModel> list;
        C43023GuZ c43023GuZ2 = c43023GuZ;
        if (c43023GuZ2 == null || (list = c43023GuZ2.LIZ) == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
