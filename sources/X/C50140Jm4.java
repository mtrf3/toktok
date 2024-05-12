package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.BizData;
import com.ss.android.ugc.aweme.search.arch.v2.docker.components.ComponentInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Jm4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50140Jm4 extends AbstractC50141Jm5 {
    @Override // X.AbstractC50141Jm5
    public final boolean LIZLLL(ComponentInfo componentInfo) {
        return false;
    }

    @Override // X.AbstractC50141Jm5
    public final int LJFF() {
        return R.layout.cff;
    }

    @Override // X.AbstractC50141Jm5
    public final void LJI(ComponentInfo componentInfo) {
    }

    public C50140Jm4(RecyclerView recyclerView, ComponentInfo componentInfo) {
        super(recyclerView, componentInfo);
    }

    @Override // X.AbstractC50141Jm5
    public final InterfaceC50155JmJ LJ(ViewGroup containerView, ComponentInfo childComponentInfo) {
        BizData bizData;
        o.LJIIIZ(containerView, "containerView");
        o.LJIIIZ(childComponentInfo, "childComponentInfo");
        if (!o.LJ(childComponentInfo.type, "query_correct_info") || (bizData = childComponentInfo.bizData) == null || bizData.queryCorrectInfo == null) {
            return null;
        }
        C50150JmE c50150JmE = new C50150JmE(containerView, childComponentInfo);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("component:");
        LIZ.append(this);
        LIZ.append(" create child:");
        LIZ.append(c50150JmE);
        C49133JQb.LIZ("HeaderComponent", X1D.LIZIZ(LIZ));
        return c50150JmE;
    }
}
