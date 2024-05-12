package X;

import android.widget.TextView;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.zhiliaoapp.musically.R;

/* loaded from: classes10.dex */
public final class MJS implements InterfaceC51512KJo {
    public final /* synthetic */ MJT LIZ;

    @Override // X.InterfaceC51512KJo
    public final void onFailed() {
        String LJJIII = SearchServiceImpl.LLLZI().LJJIII(0);
        TextView textView = (TextView) this.LIZ.LIZ.LIZ.findViewById(R.id.ml6);
        if (textView == null) {
            return;
        }
        textView.setText(LJJIII);
    }

    public MJS(MJT mjt) {
        this.LIZ = mjt;
    }
}
