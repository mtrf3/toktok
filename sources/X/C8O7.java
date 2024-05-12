package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoSocialTagCategoryProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8O7, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8O7 extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoTagContainer, C43I<? extends Aweme>, C76800UCe> {
    public static final C8O7 LJLIL = new C8O7();

    public C8O7() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoTagContainer videoTagContainer, C43I<? extends Aweme> c43i) {
        Aweme LIZ;
        VideoTagContainer selectSubscribe = videoTagContainer;
        C43I<? extends Aweme> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (LIZ = c43i2.LIZ()) != null && !LIZ.getReplaceRecTagByRepost()) {
            List list = (List) selectSubscribe.LLIIJLIL.getValue();
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof VideoSocialTagCategoryProtocol) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((VideoSocialTagCategoryProtocol) it.next()).LLLIIII(LIZ);
                }
            }
            Iterator LIZLLL = C47135Ieh.LIZLLL(selectSubscribe.C4().LIZJ, "priorityMakers.values");
            while (LIZLLL.hasNext()) {
                ((C8PV) LIZLLL.next()).LJIIJJI();
            }
        }
        return C76800UCe.LIZ;
    }
}
