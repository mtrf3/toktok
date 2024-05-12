package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.GvX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43083GvX extends AbstractC43051Gv1 {
    @Override // X.AbstractC43051Gv1
    public final String LJI() {
        return "av-filter";
    }

    @Override // X.AbstractC43051Gv1
    public final String LJIIIIZZ() {
        return "filter";
    }

    @Override // X.AbstractC43051Gv1, X.InterfaceC37286EkE
    public final boolean LIZ() {
        if (((Boolean) C43111Gvz.LIZ.getValue()).booleanValue()) {
            LJFF();
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC37286EkE
    public final File LIZLLL() {
        InterfaceC43105Gvt fileProvider = C60903NvH.LJIIJJI().LJJIJL().getFileProvider();
        String sFilterDir = C43075GvP.LJIIJJI;
        o.LJIIIIZZ(sFilterDir, "sFilterDir");
        return fileProvider.LIZJ(sFilterDir);
    }

    @Override // X.AbstractC43051Gv1
    public final boolean LJFF() {
        InterfaceC82294WRm hdt;
        String str;
        InterfaceC43105Gvt fileProvider = C60903NvH.LJIIJJI().LJJIJL().getFileProvider();
        File filesDir = C60903NvH.LJ.getFilesDir();
        o.LJIIIIZZ(filesDir, "getApplication().filesDir");
        File LIZIZ = fileProvider.LIZIZ(filesDir, "filter");
        if (LIZIZ.exists()) {
            C43098Gvm c43098Gvm = new C43098Gvm(GXW.LIZIZ(), 2);
            c43098Gvm.LIZJ = true;
            C39532FfM c39532FfM = new C39532FfM(3);
            c39532FfM.LIZ(c43098Gvm);
            c39532FfM.LIZLLL(LIZIZ);
            c43098Gvm.LIZIZ();
        }
        if (LIZLLL().exists()) {
            C43098Gvm c43098Gvm2 = new C43098Gvm(GXW.LIZIZ(), 2);
            c43098Gvm2.LIZJ = true;
            C39532FfM c39532FfM2 = new C39532FfM(3);
            c39532FfM2.LIZ(c43098Gvm2);
            c39532FfM2.LIZLLL(LIZLLL());
            c43098Gvm2.LIZIZ();
        }
        List<AwemeDraft> queryDraftList = C1DG.LJFF().queryDraftList(new GPJ(true, false, null, null, 30));
        ArrayList arrayList = new ArrayList();
        for (AwemeDraft awemeDraft : queryDraftList) {
            AwemeDraft awemeDraft2 = awemeDraft;
            if (awemeDraft2.LJIIL >= 0 && ((str = awemeDraft2.LJJJJI.filterLocalPath) == null || str.length() == 0)) {
                arrayList.add(awemeDraft);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AwemeDraft awemeDraft3 = (AwemeDraft) it.next();
            awemeDraft3.LJJJJI.filterLocalPath = C60903NvH.LJIIJJI().LJIILL().LJ().getFilter(awemeDraft3.LJIIL).getFilterFolder();
            arrayList2.add(C60903NvH.LJIIJJI().LJJJI().LJFF().LIZ(new NDG(awemeDraft3, new GLI("AVFilterStorage", 6))));
        }
        C60903NvH.LJIIJJI().getRegionService();
        if (!C44296Ha0.LIZIZ().booleanValue()) {
            hdt = new C43113Gw1();
        } else {
            hdt = new HDT();
        }
        hdt.setFrontCameraFilter(-1);
        hdt.setBackCameraFilter(-1);
        C60903NvH.LJIIJJI().LJIILL().LJI().LJIIL();
        C60903NvH.LJIIJJI().LJIILL().LIZJ().LIZJ();
        C43731HEh.LIZ.LIZ();
        return true;
    }

    @Override // X.AbstractC43051Gv1
    public final long LJIIJJI() {
        java.util.Set LIZIZ = GXW.LIZIZ();
        InterfaceC43105Gvt fileProvider = C60903NvH.LJIIJJI().LJJIJL().getFileProvider();
        File filesDir = C60903NvH.LJ.getFilesDir();
        o.LJIIIIZZ(filesDir, "getApplication().filesDir");
        File LIZIZ2 = fileProvider.LIZIZ(filesDir, "filter");
        C43099Gvn c43099Gvn = new C43099Gvn(LIZIZ, null, 2);
        if (LIZIZ2.exists()) {
            C39532FfM c39532FfM = new C39532FfM(3);
            c39532FfM.LIZ(c43099Gvn);
            c39532FfM.LIZLLL(LIZIZ2);
        }
        long j = c43099Gvn.LIZJ + 0;
        InterfaceC43105Gvt fileProvider2 = C60903NvH.LJIIJJI().LJJIJL().getFileProvider();
        String sFilterDir = C43075GvP.LJIIJJI;
        o.LJIIIIZZ(sFilterDir, "sFilterDir");
        File LIZJ = fileProvider2.LIZJ(sFilterDir);
        C43099Gvn c43099Gvn2 = new C43099Gvn(LIZIZ, null, 2);
        if (LIZJ.exists()) {
            C39532FfM c39532FfM2 = new C39532FfM(3);
            c39532FfM2.LIZ(c43099Gvn2);
            c39532FfM2.LIZLLL(LIZJ);
        }
        return c43099Gvn2.LIZJ + 0 + j;
    }

    @Override // X.AbstractC43051Gv1
    public final EnumC42718Gpe LJII() {
        return EnumC42718Gpe.RESOURCE;
    }
}
