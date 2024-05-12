package X;

import Y.AfS61S0200000_12;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestMultiTypeAdapterBackup;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestMultiTypeAdapterFix;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Smz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73129Smz extends C31413CUn {
    public final List<Object> LJLJI = new ArrayList();
    public C73411SrX LJLJJI;

    @Override // X.C31413CUn
    public final void LJZ(List<?> items) {
        C73411SrX c73411SrX;
        o.LJIIIZ(items, "items");
        if (MultiGuestMultiTypeAdapterBackup.INSTANCE.isFix()) {
            this.LJLIL = items;
            notifyDataSetChanged();
        } else {
            if (MultiGuestMultiTypeAdapterFix.INSTANCE.isFix() && (c73411SrX = this.LJLJJI) != null && !c73411SrX.isDisposed()) {
                return;
            }
            this.LJLJJI = (C73411SrX) AbstractC73672Svk.LJJIJIL(C03200Aq.LIZ(new C73130Sn0(this.LJLJI, items), true)).LJII(new C62705OjF()).LJJJLIIL(new AfS61S0200000_12(this, items, 10), C73128Smy.LJLIL);
        }
    }
}
