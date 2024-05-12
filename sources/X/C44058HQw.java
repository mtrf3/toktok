package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.model.UgcTemplateSlot;
import com.zhiliaoapp.musically.R;

/* renamed from: X.HQw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44058HQw {
    public final /* synthetic */ C44060HQy LIZ;

    public C44058HQw(C44060HQy c44060HQy) {
        this.LIZ = c44060HQy;
    }

    public final void LIZ(RecyclerView.ViewHolder viewHolder, int i) {
        Integer LJIIIIZZ = C1JD.LJIIIIZZ(this.LIZ.LIZIZ, i);
        if (LJIIIIZZ != null) {
            int intValue = LJIIIIZZ.intValue();
            if (i != intValue) {
                ((RecyclerView) this.LIZ.LIZ.findViewById(R.id.k4z)).LJLIL(intValue);
            }
            Integer value = this.LIZ.LIZIZ.LJIIIIZZ.getValue();
            if (value == null || value.intValue() != intValue) {
                this.LIZ.LIZIZ.LJI(intValue);
                InterfaceC44059HQx interfaceC44059HQx = (InterfaceC44059HQx) this.LIZ.LIZIZ.LJ(InterfaceC44059HQx.class);
                if (interfaceC44059HQx != null) {
                    interfaceC44059HQx.h30(((UgcTemplateSlot) ListProtector.get(this.LIZ.LIZIZ.LJ, intValue)).getSlotStartTime());
                }
            }
        }
    }
}
