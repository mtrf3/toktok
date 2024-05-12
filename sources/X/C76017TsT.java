package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TsT, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76017TsT extends AbstractC31414CUo<C76037Tsn, C76021TsX> {
    public final InterfaceC75774ToY LIZIZ;
    public final boolean LIZJ;

    public C76017TsT(InterfaceC75774ToY container) {
        o.LJIIIZ(container, "container");
        this.LIZIZ = container;
        this.LIZJ = true;
    }

    @Override // X.AbstractC31414CUo
    public final void LIZ(C76021TsX c76021TsX, C76037Tsn c76037Tsn) {
        C76021TsX holder = c76021TsX;
        C76037Tsn item = c76037Tsn;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        LJI(holder, item, false);
    }

    @Override // X.AbstractC31414CUo
    public final C76021TsX LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        View it = C16880lQ.LLLLIILL(layoutInflater, R.layout.d97, parent, false);
        o.LJIIIIZZ(it, "it");
        C76021TsX c76021TsX = new C76021TsX(it);
        c76021TsX.L().setMaxWidth(Integer.MAX_VALUE);
        Object value = c76021TsX.LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-mask>(...)");
        C16880lQ.LJIIJ(B85.LJLIL, (View) value);
        return c76021TsX;
    }

    @Override // X.AbstractC31414CUo
    public final void LIZIZ(C76021TsX c76021TsX, C76037Tsn c76037Tsn, List payloads) {
        C76021TsX holder = c76021TsX;
        C76037Tsn item = c76037Tsn;
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(item, "item");
        o.LJIIIZ(payloads, "payloads");
        if (payloads.size() <= 0) {
            LIZ(holder, item);
        } else {
            LJI(holder, item, true);
        }
    }

    public final void LJI(C76021TsX c76021TsX, C76037Tsn c76037Tsn, boolean z) {
        if (!z) {
            Object value = c76021TsX.LJLJI.getValue();
            o.LJIIIIZZ(value, "<get-title>(...)");
            ((TextView) value).setText(c76037Tsn.LJLIL.title);
            Object value2 = c76021TsX.LJLJJI.getValue();
            o.LJIIIIZZ(value2, "<get-content>(...)");
            ((TextView) value2).setText(c76037Tsn.LJLIL.subTitle);
            Object value3 = c76021TsX.LJLILLLLZI.getValue();
            o.LJIIIIZZ(value3, "<get-profile>(...)");
            C15490jB.LJFF((View) value3, CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_interaction_normal_1"), "ttlive_bg_v3_random_linkmic_entrance.png", ImageView.ScaleType.FIT_START, null);
            Object value4 = c76021TsX.LJLIL.getValue();
            o.LJIIIIZZ(value4, "<get-bg>(...)");
            C15490jB.LJFF((View) value4, CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_interaction_normal_1"), "ttlive_bg_v3_random_linkmic_entrance_background.png", ImageView.ScaleType.FIT_START, null);
            Object value5 = c76021TsX.LJLJJLL.getValue();
            o.LJIIIIZZ(value5, "<get-mask>(...)");
            ((View) value5).setVisibility(8);
            if (!c76037Tsn.LJLILLLLZI) {
                c76037Tsn.LJLILLLLZI = true;
                C75642TmQ.LIZ.LJJLIIIJJI(C44432HcC.LJIIIIZZ().getType(), c76037Tsn.LJLIL.isMatchValid);
            }
        }
        C75770ToU.LIZLLL(c76021TsX.L(), c76037Tsn.LJLIL);
        C75770ToU.LIZJ(c76021TsX.L(), this.LIZIZ, this.LIZJ);
        if (!c76021TsX.L().isEnabled() && C31073CHl.LIZJ()) {
            Object value6 = c76021TsX.LJLJJLL.getValue();
            o.LJIIIIZZ(value6, "<get-mask>(...)");
            ((View) value6).setVisibility(0);
        }
    }
}
