package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Tj5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75435Tj5 extends AbstractC31414CUo<C75437Tj7, C75436Tj6> {
    @Override // X.AbstractC31414CUo
    public final void LIZ(C75436Tj6 c75436Tj6, C75437Tj7 item) {
        C75436Tj6 holder = c75436Tj6;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_DATA_HOLDER");
        String str = null;
        if (multiGuestDataHolder != null) {
            str = multiGuestDataHolder.LJJIL;
        }
        if (str != null) {
            C78720Uuy url = C15650jR.LIZ().setUrl(str);
            url.LJIIIIZZ = R.drawable.cvq;
            Object value = holder.LJLIL.getValue();
            o.LJIIIIZZ(value, "<get-coinImageView>(...)");
            url.LJIIJJI((View) value);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        Object value2 = holder.LJLIL.getValue();
        o.LJIIIIZZ(value2, "<get-coinImageView>(...)");
        ((ImageView) value2).setImageResource(R.drawable.cvq);
    }

    @Override // X.AbstractC31414CUo
    public final C75436Tj6 LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return new C75436Tj6(parent);
    }
}
