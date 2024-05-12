package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GPj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41471GPj extends AbstractC43051Gv1 {
    @Override // X.AbstractC43051Gv1
    public final boolean LJFF() {
        return true;
    }

    @Override // X.AbstractC43051Gv1
    public final String LJI() {
        return "av-draft";
    }

    @Override // X.AbstractC43051Gv1
    public final String LJIIIIZZ() {
        return "draft";
    }

    @Override // X.AbstractC43051Gv1
    public final long LJIIJJI() {
        ArrayList arrayList = new ArrayList();
        List<AwemeDraft> queryDraftList = C1DG.LJFF().queryDraftList(new GPJ(true, false, null, new AqS138S0200000_7(arrayList, C60903NvH.LJIIJJI().getPublishService().LJIIIZ(), 66), 14));
        ArrayList arrayList2 = new ArrayList();
        if (queryDraftList != null && !queryDraftList.isEmpty()) {
            arrayList2.addAll(queryDraftList);
        }
        C68395Qsp c68395Qsp = new C68395Qsp(3);
        Iterator it = arrayList2.iterator();
        long j = 0;
        while (it.hasNext()) {
            Object source = it.next();
            o.LJIIIZ(source, "source");
            c68395Qsp.LJLIL = source;
            j += c68395Qsp.LIZIZ();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C60903NvH.LJIIJJI().LJJJI().LJFF().LJI(new GPP((AwemeDraft) it2.next(), new C41360GLc("AVDraftStorage", "clearUnusedShoutOutDrafts"), null, null, 60));
        }
        return j;
    }

    @Override // X.InterfaceC37286EkE
    public final File LIZLLL() {
        InterfaceC43105Gvt fileProvider = C60903NvH.LJIIJJI().LJJIJL().getFileProvider();
        String sDraftDir = C43075GvP.LIZJ;
        o.LJIIIIZZ(sDraftDir, "sDraftDir");
        return fileProvider.LIZJ(sDraftDir);
    }

    @Override // X.AbstractC43051Gv1
    public final EnumC42718Gpe LJII() {
        return EnumC42718Gpe.DRAFT;
    }
}
