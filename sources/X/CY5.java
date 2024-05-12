package X;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CY5 extends AbstractC31414CUo<CV6, CYB> {
    public final boolean LIZIZ;
    public final DataChannel LIZJ;
    public BQK LIZLLL;

    @Override // X.AbstractC31414CUo
    public final void LJ(CYB holder) {
        o.LJIIIZ(holder, "holder");
        this.LIZLLL = null;
    }

    public CY5(DataChannel dataChannel, boolean z) {
        this.LIZIZ = z;
        this.LIZJ = dataChannel;
    }

    @Override // X.AbstractC31414CUo
    public final void LIZ(CYB cyb, CV6 cv6) {
        int i;
        CYB holder = cyb;
        CV6 item = cv6;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        if (this.LIZLLL == null) {
            this.LIZLLL = new BQK(this.LIZJ);
        }
        BQK bqk = this.LIZLLL;
        if (bqk != null) {
            Object value = holder.LJLIL.getValue();
            o.LJIIIIZZ(value, "<get-audienceProfile>(...)");
            bqk.LIZIZ((ImageView) value, item, holder.getAbsoluteAdapterPosition());
        }
        Object value2 = holder.LJLIL.getValue();
        o.LJIIIIZZ(value2, "<get-audienceProfile>(...)");
        C16880lQ.LJIILLIIL((ImageView) value2, new CYE(this, holder, item));
        BQK bqk2 = this.LIZLLL;
        if (bqk2 != null) {
            C47121t6 L = holder.L();
            boolean z = this.LIZIZ;
            long j = item.LIZIZ;
            if (z && j > 0) {
                i = 0;
            } else {
                i = 8;
            }
            L.setVisibility(i);
            bqk2.LIZJ(holder.L(), this.LIZJ, item, false);
        }
        if (holder.LJLJJL > 0 && item.LIZJ <= 0) {
            UCH.LJII(holder.getAbsoluteAdapterPosition(), item, this.LIZJ);
            holder.LJLJJL = item.LIZJ;
        } else if (holder.LJLJI != item.LIZ.getId() || !TextUtils.equals(holder.LJLJJI, holder.L().getText())) {
            UCH.LJII(holder.getAbsoluteAdapterPosition(), item, this.LIZJ);
            holder.LJLJI = item.LIZ.getId();
            String charSequence = holder.L().getText().toString();
            o.LJIIIZ(charSequence, "<set-?>");
            holder.LJLJJI = charSequence;
            holder.LJLJJL = item.LIZJ;
        }
        long j2 = item.LJ;
        if (j2 == 1 || j2 == 2) {
            UCH.LJIIIIZZ(item.LIZ.getId(), item.LJ);
        }
    }

    @Override // X.AbstractC31414CUo
    public final CYB LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return new CYB(parent);
    }
}
