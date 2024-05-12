package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.RankOptimizeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Uip, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77967Uip extends CZA<C77980Uj2, C77968Uiq> {
    public final DataChannel LIZLLL;
    public final CZ9 LJ;

    @Override // X.CZA, X.AbstractC31414CUo
    public final void LJFF(RecyclerView.ViewHolder viewHolder) {
        C77968Uiq holder = (C77968Uiq) viewHolder;
        o.LJIIIZ(holder, "holder");
        super.LJFF(holder);
        if (RankOptimizeSetting.INSTANCE.getValue()) {
            C29825BnB c29825BnB = holder.LJLIL;
            c29825BnB.setBackground(null);
            c29825BnB.setOnClickListener(new ViewOnClickListenerC13880ga(null));
            C29825BnB c29825BnB2 = holder.LJLILLLLZI;
            c29825BnB2.setBackground(null);
            c29825BnB2.setOnClickListener(new ViewOnClickListenerC13880ga(null));
            C29825BnB c29825BnB3 = holder.LJLJI;
            c29825BnB3.setBackground(null);
            c29825BnB3.setOnClickListener(new ViewOnClickListenerC13880ga(null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77967Uip(DataChannel dataChannel, C77947UiV itemEventListener) {
        super(R.layout.d7p, Boolean.FALSE);
        o.LJIIIZ(itemEventListener, "itemEventListener");
        this.LIZLLL = dataChannel;
        this.LJ = itemEventListener;
    }

    @Override // X.CZA, X.AbstractC31414CUo
    public final void LIZ(RecyclerView.ViewHolder viewHolder, Object obj) {
        C77968Uiq holder = (C77968Uiq) viewHolder;
        C77980Uj2 data = (C77980Uj2) obj;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(data, "data");
        holder.L(data, true, this.LIZLLL, this.LJ);
    }

    @Override // X.CZA
    public final C77968Uiq LJI(View view, ViewGroup viewGroup) {
        return new C77968Uiq(view);
    }

    @Override // X.CZA, X.AbstractC31414CUo
    public final void LIZIZ(RecyclerView.ViewHolder viewHolder, Object obj, List payloads) {
        C77968Uiq holder = (C77968Uiq) viewHolder;
        C77980Uj2 item = (C77980Uj2) obj;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        o.LJIIIZ(payloads, "payloads");
        if ((!payloads.isEmpty()) && o.LJ(ListProtector.get(payloads, 0), "ket_not_change_avatar")) {
            holder.L(item, false, this.LIZLLL, this.LJ);
        } else {
            holder.L(item, true, this.LIZLLL, this.LJ);
        }
    }
}
