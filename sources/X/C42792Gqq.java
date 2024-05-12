package X;

import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Gqq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42792Gqq extends AbstractC65781Prl implements InterfaceC88472Yns<AnchorPublishStruct, CharSequence> {
    public static final C42792Gqq LJLIL = new C42792Gqq();

    public C42792Gqq() {
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
