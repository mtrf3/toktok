package X;

import Y.ACListenerS35S0100000_15;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XZY extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public final InterfaceC82734WdW LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XZY(View view, InterfaceC82734WdW callBackListener) {
        super(view);
        o.LJIIIZ(callBackListener, "callBackListener");
        this.LJLIL = callBackListener;
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.luu);
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS35S0100000_15(this, 240));
        }
    }
}
