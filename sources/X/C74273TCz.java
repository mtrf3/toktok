package X;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewModel;
import com.ss.android.ugc.aweme.sticker.view.internal.search.TTSearchStickerViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import defpackage.j0;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.TCz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74273TCz extends C74249TCb {
    public final /* synthetic */ AqS178S0100000_12 LJLL;
    public final /* synthetic */ TDE LJLLI;
    public final /* synthetic */ FrameLayout LJLLILLLL;

    @Override // X.C74249TCb, X.C73365Sqn
    public final /* bridge */ /* synthetic */ void L(int i, Object obj) {
        L(i, (Effect) obj);
    }

    @Override // X.C74249TCb
    /* renamed from: V */
    public final void L(int i, Effect data) {
        String str;
        String LIZIZ;
        o.LJIIIZ(data, "data");
        super.L(i, data);
        long use_number = data.getUse_number();
        TDE tde = this.LJLLI;
        if (tde instanceof TD2) {
            TD2 td2 = (TD2) tde;
            if (0 > use_number || 1000 <= use_number) {
                if (1000 > use_number || 1000000 <= use_number) {
                    if (1000000 > use_number || 100000000 <= use_number) {
                        str = j0.LIZ(use_number, 1000000000L, "b");
                    } else {
                        str = j0.LIZ(use_number, 1000L, "m");
                    }
                } else {
                    str = j0.LIZ(use_number, 1000L, "k");
                }
            } else {
                str = String.valueOf(use_number);
            }
            td2.getClass();
            o.LJIIIZ(str, "str");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(' ');
            String LIZIZ2 = X1D.LIZIZ(LIZ);
            if (use_number > 1) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LIZIZ2);
                LIZ2.append(td2.getContext().getString(R.string.g13));
                LIZIZ = X1D.LIZIZ(LIZ2);
            } else {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(LIZIZ2);
                LIZ3.append(td2.getContext().getString(R.string.g12));
                LIZIZ = X1D.LIZIZ(LIZ3);
            }
            C8HN c8hn = td2.LLJJIJIIJIL;
            if (c8hn != null) {
                c8hn.setText(LIZIZ);
            } else {
                o.LJIJI("stickerUseNumberText");
                throw null;
            }
        }
        TDE tde2 = this.LJLLI;
        if (tde2 instanceof TD2) {
            Object obj = ((C74272TCy) this.LJLL.l0).LJLJJL;
            if (obj instanceof TTSearchStickerViewModel) {
                ((TD2) tde2).LJJ(((SearchStickerViewModel) obj).mv0().LJLJI);
            }
        }
    }

    @Override // X.C74249TCb
    public final TE8 X(int i, Effect effect) {
        String str;
        int i2 = this.LJLILLLLZI;
        Bundle bundle = new Bundle();
        bundle.putString("search_id", ((C74272TCy) this.LJLL.l0).LJLJLJ);
        if (((C74272TCy) this.LJLL.l0).LJZ == 3) {
            str = "recommend";
        } else {
            str = "search";
        }
        bundle.putString("search_method", str);
        bundle.putString("is_panel_unfold", ((C74272TCy) this.LJLL.l0).LJZI.invoke());
        return new TE8(effect, i, i2, false, true, bundle, this, null, null, 792);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74273TCz(AqS178S0100000_12 aqS178S0100000_12, TDE tde, FrameLayout frameLayout, View view, TDE tde2, TEZ tez, TEF tef, T4I t4i) {
        super(view, tde2, tez, tef, t4i);
        this.LJLL = aqS178S0100000_12;
        this.LJLLI = tde;
        this.LJLLILLLL = frameLayout;
    }
}
