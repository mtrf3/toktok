package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CVB extends AbstractC31414CUo<CVC, CV9> {
    public final boolean LIZIZ;
    public final DataChannel LIZJ;

    public CVB(DataChannel dataChannel, boolean z) {
        this.LIZIZ = z;
        this.LIZJ = dataChannel;
    }

    @Override // X.AbstractC31414CUo
    public final void LIZ(CV9 cv9, CVC cvc) {
        CV9 holder = cv9;
        CVC model = cvc;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(model, "model");
        if (this.LIZIZ) {
            holder.L(model, this.LIZJ);
        } else {
            holder.M(model, false);
        }
    }

    @Override // X.AbstractC31414CUo
    public final CV9 LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View view = C16880lQ.LLLLIILL(layoutInflater, R.layout.d9k, parent, false);
        o.LJIIIIZZ(view, "view");
        return new CV9(view);
    }

    @Override // X.AbstractC31414CUo
    public final void LIZIZ(CV9 cv9, CVC cvc, List payloads) {
        CV9 holder = cv9;
        CVC model = cvc;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(model, "model");
        o.LJIIIZ(payloads, "payloads");
        if (this.LIZIZ) {
            holder.L(model, this.LIZJ);
        } else {
            holder.M(model, !payloads.isEmpty());
        }
    }
}
