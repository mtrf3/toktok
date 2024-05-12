package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.RnP, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70607RnP extends ConstraintLayout {
    public InterfaceC70614RnW LJLIL;
    public boolean LJLILLLLZI;
    public final boolean LJLJI;
    public int LJLJJI;
    public C35696Dzg LJLJJL;
    public final java.util.Map<Integer, View> LJLJJLL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this.LJLJJLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final View getFavoriteBtn() {
        View favorite_icon = _$_findCachedViewById(R.id.d5c);
        o.LJIIIIZZ(favorite_icon, "favorite_icon");
        return favorite_icon;
    }

    public final int getMaxLine() {
        return ((TextView) _$_findCachedViewById(R.id.i6m)).getMaxLines();
    }

    private final void setFavorite(boolean z) {
        int i;
        this.LJLILLLLZI = z;
        TuxIconView tuxIconView = (TuxIconView) _$_findCachedViewById(R.id.d5c);
        if (z) {
            i = R.raw.icon_bookmark_fill;
        } else {
            i = R.raw.icon_bookmark;
        }
        tuxIconView.setIconRes(i);
    }

    public final void LJJLJLI(C35696Dzg c35696Dzg) {
        if (!o.LJ(c35696Dzg, this.LJLJJL)) {
            SG5 product_title_tv = (SG5) _$_findCachedViewById(R.id.i6m);
            o.LJIIIIZZ(product_title_tv, "product_title_tv");
            product_title_tv.LJJJIL(c35696Dzg.LIZ, c35696Dzg.LIZIZ, null);
            if (c35696Dzg.LIZJ == null) {
                getFavoriteBtn().setVisibility(8);
            } else {
                getFavoriteBtn().setVisibility(0);
                setFavorite(c35696Dzg.LIZJ.booleanValue());
            }
        }
        this.LJLJJL = c35696Dzg;
    }

    public final void setListener(InterfaceC70614RnW listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLIL = listener;
    }

    public final void setTitleMaxLine(int i) {
        ((TextView) _$_findCachedViewById(R.id.i6m)).setMaxLines(i);
    }

    public C70607RnP(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLJI = true;
        this.LJLJJI = -1;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a62, this, true);
        View share_icon = _$_findCachedViewById(R.id.jtc);
        o.LJIIIIZZ(share_icon, "share_icon");
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 91, 42), share_icon);
        View favorite_icon = _$_findCachedViewById(R.id.d5c);
        o.LJIIIIZZ(favorite_icon, "favorite_icon");
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 92, 42), favorite_icon);
        View product_title_tv = _$_findCachedViewById(R.id.i6m);
        o.LJIIIIZZ(product_title_tv, "product_title_tv");
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 93, 42), product_title_tv);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.jtc);
        if (_$_findCachedViewById != null) {
            C78946Uyc.LJJIIJZLJL(_$_findCachedViewById, new C70918RsQ(0), new AqS162S0100000_12(this, 1147), C70612RnU.LJLIL);
        }
    }
}
