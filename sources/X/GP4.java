package X;

import android.database.Cursor;
import com.ss.android.ugc.aweme.tools.draft.entity.DraftViewInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GP4 extends AbstractC65781Prl implements InterfaceC88472Yns<Cursor, DraftViewInfo> {
    public static final GP4 LJLIL = new GP4();

    public GP4() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final DraftViewInfo invoke(Cursor cursor) {
        Cursor it = cursor;
        o.LJIIIZ(it, "it");
        return GPB.LIZJ(it);
    }
}
