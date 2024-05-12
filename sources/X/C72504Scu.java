package X;

import Y.AObserverS80S0100000_12;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.notification.module.NotificationChunkVM;
import com.ss.android.ugc.aweme.notification.module.cell.HeaderCell;
import com.ss.android.ugc.aweme.notification.module.cell.LoadMoreCell;
import com.ss.android.ugc.aweme.notification.module.cell.TemplateCell;
import kotlin.jvm.internal.AqS162S0100000_12;

/* renamed from: X.Scu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72504Scu extends SIT {
    public final SI5 LJLJJLL;
    public final C5H3 LJLJL = V1B.LJZI(new AqS162S0100000_12(this, 1264));
    public final C5H3 LJLJLJ = V1B.LJZI(new AqS162S0100000_12(this, 1265));

    @Override // X.SIT, X.InterfaceC227608wW
    public final void onCreate() {
        LJIIIIZZ(HeaderCell.class, TemplateCell.class, LoadMoreCell.class);
        LJFF().LIZ(new C72513Sd3(this, (NotificationChunkVM) this.LJLJLJ.getValue()), C72513Sd3.class);
        ((NextLiveData) LJIIJ().LJLJI.getValue()).observe(this.LJLJJLL, new AObserverS80S0100000_12(this, 164), true);
        ((LiveData) ((NotificationChunkVM) this.LJLJLJ.getValue()).LJLLLL.getValue()).observe(this.LJLJJLL, new AObserverS80S0100000_12(this, 165));
    }

    public final C71836SHg LJIIJ() {
        return (C71836SHg) this.LJLJL.getValue();
    }

    public C72504Scu(SI5 si5) {
        this.LJLJJLL = si5;
    }
}
