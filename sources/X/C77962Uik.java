package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Uik, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77962Uik extends CZA<C78010UjW, C77986Uj8> {
    public final DataChannel LIZLLL;

    public C77962Uik(DataChannel dataChannel) {
        super(R.layout.d9_, Boolean.FALSE);
        this.LIZLLL = dataChannel;
    }

    @Override // X.CZA, X.AbstractC31414CUo
    public final void LIZ(RecyclerView.ViewHolder viewHolder, Object obj) {
        C77986Uj8 holder = (C77986Uj8) viewHolder;
        C78010UjW data = (C78010UjW) obj;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(data, "data");
        if (data.LIZ.LIZ == EnumC31514CYk.E_COMMERCE) {
            TextView textView = holder.LJLIL;
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.o2y);
            boolean z = C31512CYi.LIZIZ;
            C78934UyQ.LJJIIJZLJL(textView, LJIILJJIL, z);
            C78934UyQ.LJJIIJZLJL(holder.LJLILLLLZI, C15380j0.LJIILJJIL(R.string.o2z), z);
            return;
        }
        TextView textView2 = holder.LJLIL;
        String LJIILJJIL2 = C15380j0.LJIILJJIL(R.string.oow);
        boolean z2 = C31512CYi.LIZIZ;
        C78934UyQ.LJJIIJZLJL(textView2, LJIILJJIL2, z2);
        C78934UyQ.LJJIIJZLJL(holder.LJLILLLLZI, C15380j0.LJIILJJIL(R.string.ooy), z2);
    }

    @Override // X.CZA
    public final C77986Uj8 LJI(View view, ViewGroup viewGroup) {
        Boolean bool;
        DataChannel dataChannel = this.LIZLLL;
        if ((dataChannel == null || (bool = (Boolean) dataChannel.kv0(BCW.class)) == null || bool.booleanValue()) && viewGroup != null) {
            view.getLayoutParams().height = viewGroup.getHeight();
        }
        return new C77986Uj8(view);
    }
}
