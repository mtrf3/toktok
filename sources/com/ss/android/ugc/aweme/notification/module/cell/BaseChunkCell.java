package com.ss.android.ugc.aweme.notification.module.cell;

import X.C221018lt;
import X.C65352Pkq;
import X.C72513Sd3;
import X.C72515Sd5;
import X.C72523SdD;
import X.InterfaceC74236TBo;
import X.TBT;
import X.X1D;
import Y.AObserverS80S0100000_12;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.notification.module.NotificationChunkVM;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class BaseChunkCell<T extends C72523SdD> extends PowerCell<T> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJI;
    public final C72515Sd5 LJLIL = new C72515Sd5(this);
    public int LJLILLLLZI = -1;
    public final AObserverS80S0100000_12 LJLJI = new AObserverS80S0100000_12(this, 21);

    static {
        TBT tbt = new TBT(BaseChunkCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/notification/module/NotificationChunk$CellControl;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJJI = new InterfaceC74236TBo[]{tbt};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void M() {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPositionChanged:[");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", ");
        C72523SdD c72523SdD = (C72523SdD) getItem();
        if (c72523SdD != null) {
            num = Integer.valueOf(c72523SdD.LJLIL);
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(']');
        C221018lt.LIZ("ChunkCell", X1D.LIZIZ(LIZ));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onViewAttachedToWindow() {
        NotificationChunkVM notificationChunkVM;
        LiveData liveData;
        super.onViewAttachedToWindow();
        C72513Sd3 c72513Sd3 = (C72513Sd3) this.LJLIL.LIZ(this, LJLJJI[0]);
        if (c72513Sd3 != null && (notificationChunkVM = c72513Sd3.LJLILLLLZI) != null && (liveData = (LiveData) notificationChunkVM.LJLLLLLL.getValue()) != null) {
            liveData.observe(this, this.LJLJI);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onViewDetachedFromWindow() {
        NotificationChunkVM notificationChunkVM;
        LiveData liveData;
        super.onViewDetachedFromWindow();
        C72513Sd3 c72513Sd3 = (C72513Sd3) this.LJLIL.LIZ(this, LJLJJI[0]);
        if (c72513Sd3 != null && (notificationChunkVM = c72513Sd3.LJLILLLLZI) != null && (liveData = (LiveData) notificationChunkVM.LJLLLLLL.getValue()) != null) {
            liveData.removeObserver(this.LJLJI);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(T t) {
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        this.LJLILLLLZI = t.LJLIL;
    }
}
