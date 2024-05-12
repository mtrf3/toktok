package X;

import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.8Ph, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210858Ph extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoTagContainer, C43I<? extends C195357lb>, C76800UCe> {
    public static final C210858Ph LJLIL = new C210858Ph();

    public C210858Ph() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoTagContainer videoTagContainer, C43I<? extends C195357lb> c43i) {
        VideoTagContainer selectSubscribe = videoTagContainer;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            C210838Pf C4 = selectSubscribe.C4();
            CopyOnWriteArrayList<PriorityProtocol> value = C4.LJ.getValue();
            if (value != null) {
                value.clear();
            }
            J8V.LJIILJJIL(C4.LJ, new CopyOnWriteArrayList());
        }
        return C76800UCe.LIZ;
    }
}
