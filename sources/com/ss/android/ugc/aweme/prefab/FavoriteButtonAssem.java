package com.ss.android.ugc.aweme.prefab;

import X.AnonymousClass391;
import X.C16880lQ;
import X.C212428Vi;
import X.C26338AVi;
import X.C32151Nz;
import X.C55096Ljo;
import X.C55230Lly;
import X.O6R;
import X.SY4;
import Y.ACListenerS38S0200000_3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.ss.android.ugc.aweme.prefab.ability.FavoriteAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS13S2100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public class FavoriteButtonAssem extends DynamicAssem {
    public static final /* synthetic */ int LJLL = 0;
    public SY4 LJLJLLL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return 0;
    }

    public FavoriteButtonAssem() {
        new LinkedHashMap();
    }

    public final SY4 L3() {
        SY4 sy4 = this.LJLJLLL;
        if (sy4 != null) {
            return sy4;
        }
        o.LJIJI("button");
        throw null;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onCreateView() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        SY4 sy4 = new SY4(context, null, 6, 0);
        sy4.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        C26338AVi.LJIIIZ(sy4, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), 0, AnonymousClass391.LIZJ(16), 0, 16);
        sy4.setMaxWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(200)));
        sy4.setText(R.string.bg3);
        sy4.LJJJIL(true);
        sy4.setButtonSize(2);
        sy4.setButtonVariant(1);
        sy4.LJJJJJ(Integer.valueOf(R.raw.icon_bookmark));
        E3(sy4);
        super.onCreateView();
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        String string;
        String string2;
        FavoriteAbility favoriteAbility;
        o.LJIIIZ(view, "view");
        assembleChildren();
        SY4 sy4 = (SY4) view;
        this.LJLJLLL = sy4;
        Object obj = getConfig().LJ.get("prop_favorite_string");
        if (!(obj instanceof String) || (string = (String) obj) == null) {
            string = sy4.getContext().getString(R.string.bg3);
            o.LJIIIIZZ(string, "view.context.getString(R.string.add_to_favorite)");
        }
        Object obj2 = getConfig().LJ.get("prop_unfavorite_string");
        if (!(obj2 instanceof String) || (string2 = (String) obj2) == null) {
            string2 = sy4.getContext().getString(R.string.bgf);
            o.LJIIIIZZ(string2, "view.context.getString(R.string.added_to_favorite)");
        }
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null && (favoriteAbility = (FavoriteAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(LIZLLL, null), FavoriteAbility.class, null)) != null) {
            favoriteAbility.ld(new AqS13S2100000_3(this, string2, string, 4));
            C16880lQ.LJJIZ(L3(), new ACListenerS38S0200000_3(this, favoriteAbility, 44));
        }
    }
}
