package X;

import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Gqr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42793Gqr extends AbstractC65781Prl implements InterfaceC88472Yns<AnchorPublishStruct, CharSequence> {
    public static final C42793Gqr LJLIL = new C42793Gqr();

    public C42793Gqr() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(AnchorPublishStruct anchorPublishStruct) {
        AnchorPublishStruct it = anchorPublishStruct;
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(it.type);
        LIZ.append('(');
        String str = it.subtype;
        if (str == null) {
            str = "";
        }
        return q.LIZIZ(LIZ, str, ')', LIZ);
    }
}
