package X;

import Y.ARunnableS43S0100000_7;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GUI {
    public static final int LIZIZ = C41612GUu.LIZ();
    public final List<GUU> LIZ = FII.LIZ();

    public final synchronized List<PublishModel> LIZLLL() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        List<GUU> mPublishRecordList = this.LIZ;
        o.LJIIIIZZ(mPublishRecordList, "mPublishRecordList");
        Iterator<GUU> it = mPublishRecordList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().LIZ);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getAllPublishModel size=");
        LIZ.append(arrayList.size());
        H7B.LIZ(X1D.LIZIZ(LIZ));
        return arrayList;
    }

    public final synchronized int LJFF() {
        return this.LIZ.size();
    }

    public final synchronized GUU LJII() {
        if (this.LIZ.size() > 0) {
            return (GUU) ListProtector.get(this.LIZ, 0);
        }
        return null;
    }

    public final synchronized boolean LJIIIZ() {
        List<GUU> mPublishRecordList = this.LIZ;
        o.LJIIIIZZ(mPublishRecordList, "mPublishRecordList");
        Iterator<GUU> it = mPublishRecordList.iterator();
        while (it.hasNext()) {
            if (it.next().LIZLLL instanceof C41442GOg) {
                return true;
            }
        }
        return false;
    }

    public final void LJIIJ() {
        List<GUU> mPublishRecordList = this.LIZ;
        o.LJIIIIZZ(mPublishRecordList, "mPublishRecordList");
        for (GUU guu : mPublishRecordList) {
            if (guu.LIZLLL instanceof C41438GOc) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("PublishParallel taskResume id=");
                LIZ.append(guu.LIZIZ);
                H7B.LIZ(X1D.LIZIZ(LIZ));
                GUQ guq = guu.LJI;
                if (guq != null) {
                    guq.LJFF();
                    return;
                }
                return;
            }
        }
    }

    public final synchronized void LIZ(GUU record) {
        o.LJIIIZ(record, "record");
        AbstractC41437GOb abstractC41437GOb = record.LIZLLL;
        if (!o.LJ(abstractC41437GOb, GOT.LIZ) && !(abstractC41437GOb instanceof C41442GOg)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("record state is incorrect, state = ");
            LIZ.append(abstractC41437GOb);
            C77123UOp.LJJJIL(new GUP(X1D.LIZIZ(LIZ)));
        }
        this.LIZ.add(record);
        GUQ guq = record.LJI;
        if (guq != null) {
            guq.LJLJLLL.execute(new ARunnableS43S0100000_7(guq, 109));
        }
        C41620GVc.LIZIZ(record.LIZIZ);
    }

    public final synchronized void LIZIZ(GUU record) {
        o.LJIIIZ(record, "record");
        AbstractC41437GOb abstractC41437GOb = record.LIZLLL;
        if (!o.LJ(abstractC41437GOb, GOT.LIZ) && !(abstractC41437GOb instanceof C41442GOg)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("record state is incorrect, state = ");
            LIZ.append(abstractC41437GOb);
            C77123UOp.LJJJIL(new GUP(X1D.LIZIZ(LIZ)));
        }
        ListProtector.add(this.LIZ, 0, record);
        GUQ guq = record.LJI;
        if (guq != null) {
            guq.LJLJLLL.execute(new ARunnableS43S0100000_7(guq, 109));
        }
        C41620GVc.LIZIZ(record.LIZIZ);
    }

    public final synchronized void LIZJ(InterfaceC88472Yns<? super GUU, C76800UCe> ll) {
        o.LJIIIZ(ll, "ll");
        List<GUU> mPublishRecordList = this.LIZ;
        o.LJIIIIZZ(mPublishRecordList, "mPublishRecordList");
        for (GUU it : mPublishRecordList) {
            o.LJIIIIZZ(it, "it");
            ll.invoke(it);
        }
    }

    public final synchronized PublishModel LJ(String str) {
        List<GUU> mPublishRecordList = this.LIZ;
        o.LJIIIIZZ(mPublishRecordList, "mPublishRecordList");
        for (GUU guu : mPublishRecordList) {
            if (o.LJ(guu.LIZIZ, str)) {
                return guu.LIZ;
            }
        }
        if (this.LIZ.size() > 0) {
            return ((GUU) ListProtector.get(this.LIZ, r1.size() - 1)).LIZ;
        }
        return null;
    }

    public final synchronized GUQ LJI(String publishId) {
        o.LJIIIZ(publishId, "publishId");
        List<GUU> mPublishRecordList = this.LIZ;
        o.LJIIIIZZ(mPublishRecordList, "mPublishRecordList");
        for (GUU guu : mPublishRecordList) {
            if (o.LJ(guu.LIZIZ, publishId)) {
                return guu.LJI;
            }
        }
        return null;
    }

    public final synchronized void LJIIIIZZ(GUU record) {
        o.LJIIIZ(record, "record");
        AbstractC41437GOb abstractC41437GOb = record.LIZLLL;
        if (!(abstractC41437GOb instanceof GOS) && !(abstractC41437GOb instanceof C41442GOg) && !(abstractC41437GOb instanceof C41438GOc)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("record state is incorrect, state = ");
            LIZ.append(abstractC41437GOb);
            C77123UOp.LJJJIL(new GUP(X1D.LIZIZ(LIZ)));
        }
        this.LIZ.remove(record);
    }
}
