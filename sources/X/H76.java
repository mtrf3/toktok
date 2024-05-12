package X;

import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H76 extends AbstractC65781Prl implements InterfaceC88472Yns<EditVideoSegment, CharSequence> {
    public static final H76 LJLIL = new H76();

    public H76() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(EditVideoSegment editVideoSegment) {
        EditVideoSegment it = editVideoSegment;
        o.LJIIIZ(it, "it");
        return String.valueOf(it.getVideoCutInfo());
    }
}
