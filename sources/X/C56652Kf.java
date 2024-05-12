package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* renamed from: X.2Kf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56652Kf extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public final /* synthetic */ List<Aweme> LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56652Kf(List<Aweme> list, int i) {
        super(0);
        this.LJLIL = list;
        this.LJLILLLLZI = i;
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("insert after ");
        LIZ.append(this.LJLIL.size());
        LIZ.append(' ');
        LIZ.append(this.LJLILLLLZI);
        return X1D.LIZIZ(LIZ);
    }
}
