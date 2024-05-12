package X;

import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SKT extends SKX {
    public final MutableLiveData<Integer> LIZ;
    public UrlModel LIZIZ;

    @Override // X.SKX
    public final int LJII() {
        return R.layout.ahf;
    }

    @Override // X.SKX, X.SKZ
    public final InterfaceC71908SKa LJ() {
        return new SKU();
    }

    public SKT(MutableLiveData<Integer> currentValue) {
        o.LJIIIZ(currentValue, "currentValue");
        this.LIZ = currentValue;
    }

    @Override // X.SKZ
    public final void LIZLLL(SKV holder) {
        int i;
        o.LJIIIZ(holder, "holder");
        View findViewById = holder.itemView.findViewById(R.id.wi);
        Integer value = this.LIZ.getValue();
        if (value == null || value.intValue() != 1) {
            i = 8;
        } else {
            i = 0;
        }
        findViewById.setVisibility(i);
        holder.itemView.findViewById(R.id.ihn).setVisibility(8);
        SmartImageView smartImageView = (SmartImageView) holder.itemView.findViewById(R.id.abh);
        o.LJIIIIZZ(smartImageView, "holder.itemView.avatar");
        User LIZ = C71945SLl.LIZ();
        if (o.LJ(this.LIZIZ, LIZ.getAvatarThumb())) {
            return;
        }
        UrlModel avatarThumb = LIZ.getAvatarThumb();
        this.LIZIZ = avatarThumb;
        W5F LJII = W5U.LJII(C78939UyV.LJ(avatarThumb));
        LJII.LJJIIJ = smartImageView;
        C16880lQ.LLJJJ(LJII);
    }
}
