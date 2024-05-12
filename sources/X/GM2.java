package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public final class GM2<V> implements Callable {
    public static final GM2<V> LJLIL = new GM2<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        PublishModel LJFF;
        List<AwemeDraft> queryDraftList = C1DG.LJFF().queryDraftList(new GPJ(true, false, GPH.EXCEPT_TTN, null, 22));
        ArrayList arrayList = new ArrayList();
        for (AwemeDraft awemeDraft : queryDraftList) {
            if (awemeDraft.LJIIJ() && (LJFF = C43001GuD.LJFF(GTM.LIZJ(awemeDraft, null))) != null) {
                arrayList.add(LJFF);
            }
        }
        return arrayList;
    }
}
