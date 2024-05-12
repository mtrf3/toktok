package X;

import android.graphics.drawable.Animatable;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.model.ActivityTreasureBoxInfoModel4FE;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.widget.ActivityTreasureBoxWidget;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.BRz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28799BRz implements InterfaceC75158Tec {
    public final /* synthetic */ ActivityTreasureBoxWidget LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Map.Entry<Integer, ActivityTreasureBoxInfoModel4FE> LJLJI;

    @Override // X.InterfaceC75158Tec
    public final void LJ() {
    }

    @Override // X.InterfaceC75158Tec
    public final void LJFF(Animatable animatable) {
        o.LJIIIZ(animatable, "animatable");
    }

    @Override // X.InterfaceC75158Tec
    public final void LJIILL(Exception exc, String str) {
        this.LJLIL.getClass();
        C28794BRu.LIZIZ(-1, this.LJLILLLLZI, this.LJLJI.getValue().envelopList, Boolean.valueOf(this.LJLIL.LJZ().isAnchor()));
    }

    public C28799BRz(ActivityTreasureBoxWidget activityTreasureBoxWidget, String str, Map.Entry<Integer, ActivityTreasureBoxInfoModel4FE> entry) {
        this.LJLIL = activityTreasureBoxWidget;
        this.LJLILLLLZI = str;
        this.LJLJI = entry;
    }

    @Override // X.InterfaceC75158Tec
    public final void LJIILJJIL(int i, int i2, String str) {
        this.LJLIL.getClass();
        C28794BRu.LIZIZ(0, this.LJLILLLLZI, this.LJLJI.getValue().envelopList, Boolean.valueOf(this.LJLIL.LJZ().isAnchor()));
    }
}
