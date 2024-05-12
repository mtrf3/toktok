package X;

import Y.IDCListenerS208S0100000_12;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SKd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71911SKd extends AbstractC71915SKh {
    public final SL3 LIZIZ;

    @Override // X.SKZ
    public final Class<? extends SKZ> LJFF() {
        return C71911SKd.class;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71911SKd(SL3 builder) {
        super(builder);
        o.LJIIIZ(builder, "builder");
        this.LIZIZ = builder;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.Yns, X.Prl] */
    @Override // X.AbstractC71915SKh
    public final void LJIIIIZZ(AI8 ai8) {
        boolean z;
        Integer num;
        if (!(ai8.getAccessory() instanceof AI2)) {
            Context context = ai8.getContext();
            o.LJIIIIZZ(context, "tuxTextCell.context");
            ai8.setAccessory(new AI2(context));
        }
        MutableLiveData<Boolean> mutableLiveData = this.LIZIZ.LJIILJJIL;
        boolean z2 = false;
        if (mutableLiveData != null) {
            z = o.LJ(mutableLiveData.getValue(), Boolean.TRUE);
        } else {
            z = false;
        }
        ai8.setLoading(z);
        AI9 accessory = ai8.getAccessory();
        o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
        AI2 ai2 = (AI2) accessory;
        SL3 sl3 = this.LIZIZ;
        ?? r1 = sl3.LJIILL;
        if (r1 != 0) {
            MutableLiveData<Integer> mutableLiveData2 = sl3.LJIILIIL;
            if (mutableLiveData2 != null) {
                num = mutableLiveData2.getValue();
            } else {
                num = null;
            }
            z2 = ((Boolean) r1.invoke(num)).booleanValue();
        } else {
            MutableLiveData<Integer> mutableLiveData3 = sl3.LJIILIIL;
            if (mutableLiveData3 != null) {
                Integer value = mutableLiveData3.getValue();
                int i = this.LIZIZ.LJIILLIIL;
                if (value != null && value.intValue() == i) {
                    z2 = true;
                }
            }
        }
        ai2.LJIILIIL(z2);
        ai2.LJFF(this.LIZIZ.LJIIIZ);
        ai2.LJIILJJIL(new AqS159S0200000_12(ai2, this, 79));
        ai2.LJIILL(new IDCListenerS208S0100000_12(this, 1));
    }
}
