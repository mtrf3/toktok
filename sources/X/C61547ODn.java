package X;

import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.UpdatePackage;
import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.ODn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61547ODn extends AbstractC61551ODr<List<UpdatePackage>, UpdatePackage> {
    public static final AtomicInteger LJIIJ = new AtomicInteger(1);
    public static final AtomicInteger LJIIJJI = new AtomicInteger(0);
    public Executor LJI;
    public OptionCheckUpdateParams LJII;
    public C61550ODq LJIIIIZZ;
    public final CopyOnWriteArrayList<OER> LJIIIZ = new CopyOnWriteArrayList<>();

    public final void LIZJ() {
        if (this.LJIIIZ.isEmpty()) {
            return;
        }
        Iterator<OER> it = this.LJIIIZ.iterator();
        while (it.hasNext()) {
            this.LJI.execute(it.next());
        }
    }

    @Override // X.AbstractC61551ODr
    public final void LIZ(Object... objArr) {
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj instanceof Executor) {
                this.LJI = (Executor) obj;
                Object obj2 = objArr[1];
                if (obj2 == null) {
                    this.LJII = null;
                } else {
                    this.LJII = (OptionCheckUpdateParams) obj2;
                }
            } else {
                throw new IllegalArgumentException("ParallelInterceptor args must be instance of Executor");
            }
        } else {
            this.LJI = C16880lQ.LLLLZ(2);
        }
        Object LIZJ = this.LJ.LIZJ("update_operation");
        if (LIZJ instanceof C61550ODq) {
            this.LJIIIIZZ = (C61550ODq) LIZJ;
        }
    }

    @Override // X.AbstractC61551ODr
    public final Object LIZIZ(C61548ODo c61548ODo, Object obj) {
        int i;
        List<UpdatePackage> list = (List) obj;
        OptionCheckUpdateParams optionCheckUpdateParams = this.LJII;
        if (optionCheckUpdateParams != null) {
            i = optionCheckUpdateParams.getChannelUpdatePriority();
        } else {
            i = 1;
        }
        C61550ODq c61550ODq = this.LJIIIIZZ;
        if (c61550ODq != null) {
            c61550ODq.LIZ = new OEQ(this);
        }
        LJIIJJI.addAndGet(list.size());
        for (UpdatePackage updatePackage : list) {
            String accessKey = updatePackage.getAccessKey();
            String groupName = updatePackage.getGroupName();
            String channel = updatePackage.getChannel();
            this.LJI.execute(new C61549ODp(this, ((3 - i) * ImagePreloadExperiment.PRIORITY_DEFAULT) + LJIIJ.getAndIncrement(), new OES(((Integer) c61548ODo.LIZJ("req_type")).intValue(), accessKey, groupName, channel), c61548ODo, i, updatePackage));
        }
        return null;
    }
}
