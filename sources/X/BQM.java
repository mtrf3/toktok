package X;

import Y.ACListenerS25S0100000_5;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BQM extends AbstractC31414CUo<CV6, BQN> {
    public boolean LIZIZ;
    public final DataChannel LIZJ;
    public final CWN LIZLLL;
    public boolean LJ;

    @Override // X.AbstractC31414CUo
    public final void LIZ(BQN bqn, CV6 cv6) {
        List<String> list;
        BQN holder = bqn;
        CV6 item = cv6;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        ImageModel avatarThumb = item.LIZ.getAvatarThumb();
        if (avatarThumb == null || (list = avatarThumb.mUrls) == null || list.size() <= 0) {
            holder.L().setImageDrawable(holder.itemView.getContext().getDrawable(R.drawable.d65));
        } else {
            ImageView L = holder.L();
            ImageModel avatarThumb2 = item.LIZ.getAvatarThumb();
            int width = holder.L().getWidth();
            int height = holder.L().getHeight();
            if (avatarThumb2 != null) {
                C15640jQ.LJIIIZ(L, avatarThumb2, width, height, R.drawable.d65, new B78(this));
            }
        }
        if (item.LIZIZ > 0 && this.LIZIZ) {
            long j = item.LIZJ;
            if (j == 1) {
                holder.L().setBackground(C15380j0.LJI(R.drawable.ckq));
            } else if (j == 2) {
                holder.L().setBackground(C15380j0.LJI(R.drawable.cks));
            } else if (j == 3) {
                holder.L().setBackground(C15380j0.LJI(R.drawable.cku));
            }
        } else {
            holder.L().setBackground(null);
        }
        C16880lQ.LJIILLIIL(holder.L(), new ACListenerS25S0100000_5(this, 453));
    }

    @Override // X.AbstractC31414CUo
    public final BQN LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        BQN bqn = new BQN(parent);
        bqn.L().setImageDrawable(bqn.itemView.getContext().getDrawable(R.drawable.d65));
        return bqn;
    }

    public BQM(boolean z, DataChannel dataChannel, CWN callback) {
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(callback, "callback");
        this.LIZIZ = z;
        this.LIZJ = dataChannel;
        this.LIZLLL = callback;
    }
}
