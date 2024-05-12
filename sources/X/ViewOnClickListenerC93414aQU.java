package X;

import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import com.bytedance.effectcreatormobile.objectselect.gif.GifsViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.aQU, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class ViewOnClickListenerC93414aQU implements View.OnClickListener {
    public final /* synthetic */ C94052aam LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    public ViewOnClickListenerC93414aQU(C94052aam c94052aam, int i) {
        this.LJLIL = c94052aam;
        this.LJLILLLLZI = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C94052aam c94052aam = this.LJLIL;
        C93419aQZ c93419aQZ = c94052aam.LJLILLLLZI;
        if (c93419aQZ != null) {
            C94054aao gifItem = (C94054aao) ListProtector.get(c94052aam.LJLIL, this.LJLILLLLZI);
            int i = this.LJLILLLLZI;
            o.LJIIIZ(gifItem, "gifItem");
            EnumC93416aQW enumC93416aQW = gifItem.LJLILLLLZI;
            if (enumC93416aQW == EnumC93416aQW.Normal || enumC93416aQW == EnumC93416aQW.Fail) {
                StatisticReporter LIZ = C93670aUc.LIZ();
                if (LIZ != null) {
                    LIZ.onEvent("gifs_giphy_click", C51029K0z.LJJIIZI(new OSZ("is_ame_data", "1")));
                }
                GifsViewModel vl = c93419aQZ.LIZ.vl();
                ProviderEffect effect = gifItem.LJLIL;
                vl.getClass();
                o.LJIIIZ(effect, "effect");
                XKX.LIZLLL(ViewModelKt.getViewModelScope(vl), null, null, new C94743alv(vl, i, effect, null), 3);
            }
        }
    }
}
