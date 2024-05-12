package X;

import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationTrigger;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import kotlin.jvm.internal.o;

/* renamed from: X.8RZ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8RZ extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoExposeSharerInformationTrigger, C43I<? extends Boolean>, C76800UCe> {
    public static final C8RZ LJLIL = new C8RZ();

    public C8RZ() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoExposeSharerInformationTrigger videoExposeSharerInformationTrigger, C43I<? extends Boolean> c43i) {
        Boolean LIZ;
        VideoExposeSharerInformationTrigger selectSubscribe = videoExposeSharerInformationTrigger;
        C43I<? extends Boolean> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (LIZ = c43i2.LIZ()) != null) {
            if (LIZ.booleanValue()) {
                selectSubscribe.F0((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe));
            }
            PriorityAbility priorityAbility = (PriorityAbility) selectSubscribe.LLF.getValue();
            if (priorityAbility != null) {
                priorityAbility.Od0();
            }
        }
        return C76800UCe.LIZ;
    }
}
