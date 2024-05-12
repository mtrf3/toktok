package X;

import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.api.SpotlightItem;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* loaded from: classes6.dex */
public final class CDA implements C0C3 {
    public final /* synthetic */ CDB LJLIL;
    public final /* synthetic */ List<SpotlightItem> LJLILLLLZI;
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LJLJI;

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
    }

    public CDA(CDB cdb, List list, CD9 cd9) {
        this.LJLIL = cdb;
        this.LJLILLLLZI = list;
        this.LJLJI = cd9;
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
        TextView textView = (TextView) this.LJLIL.itemView.findViewById(R.id.kal);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(i + 1);
        LIZ.append('/');
        LIZ.append(this.LJLILLLLZI.size());
        textView.setText(X1D.LIZIZ(LIZ));
        this.LJLJI.invoke(Integer.valueOf(i));
    }
}
