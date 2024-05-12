package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser;

import X.C05040Hs;
import X.C1JI;
import X.C2K0;
import X.C48991JKp;
import X.C49098JOs;
import X.C55096Ljo;
import X.C61328O5c;
import X.C8VR;
import X.C8XO;
import X.EnumC48990JKo;
import X.InterfaceC49025JLx;
import X.JMH;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS139S0200000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchSingleCardTemplateAssem<T extends InterfaceC49025JLx> extends ReusedUISlotAssem<SearchSingleCardTemplateAssem<T>> implements C8XO<T> {
    public final JMH<T> LLFF;
    public View.OnClickListener LLFFF;
    public T LLFII;

    /* loaded from: classes9.dex */
    public interface SearchCardTemplateAbility extends C2K0 {
        void setOnClickListener(View.OnClickListener onClickListener);
    }

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.ciu;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void Z3() {
        C55096Ljo.LJIILLIIL(this, SearchCardScope.class, SearchCardTemplateAbility.class);
    }

    public SearchSingleCardTemplateAssem(JMH<T> jmh) {
        new LinkedHashMap();
        this.LLFF = jmh;
    }

    @Override // X.C8XO
    public final void F0(Object obj) {
        int i;
        T item = (T) obj;
        o.LJIIIZ(item, "item");
        this.LLFII = item;
        View Y3 = Y3();
        if (((SearchServiceCenter$CardCommonAbility) C55096Ljo.LIZIZ(C55096Ljo.LJIIZILJ(this), SearchServiceCenter$CardCommonAbility.class)).WV(C55096Ljo.LJIIZILJ(this))) {
            i = C05040Hs.LIZ(1, 8);
        } else {
            i = 0;
        }
        Y3.setPadding(Y3.getPaddingLeft(), Y3.getPaddingTop(), Y3.getPaddingRight(), i);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(Object obj) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int i;
        o.LJIIIZ(view, "view");
        C55096Ljo.LJIILIIL(this, SearchCardScope.class, new SearchCardTemplateAbility(this) { // from class: com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchSingleCardTemplateAssem$onViewCreated$1
            public final /* synthetic */ SearchSingleCardTemplateAssem<T> LJLIL;

            {
                this.LJLIL = this;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchSingleCardTemplateAssem.SearchCardTemplateAbility
            public final void setOnClickListener(View.OnClickListener onClickListener) {
                this.LJLIL.LLFFF = onClickListener;
            }
        }, SearchCardTemplateAbility.class);
        C8VR.LIZ(this, new AqS139S0200000_8((SearchSingleCardTemplateAssem) this, view, (View) 7));
        View findViewById = view.findViewById(R.id.g5s);
        o.LJIIIIZZ(findViewById, "view.findViewById<View>(…mon_template_single_root)");
        C48991JKp.LIZ(findViewById, EnumC48990JKo.VIDEO, new AqS174S0100000_8(this, 67));
        C49098JOs.LIZ.getClass();
        Integer valueOf = Integer.valueOf(C49098JOs.LIZLLL());
        if (valueOf.intValue() > 0) {
            i = valueOf.intValue();
        } else {
            i = 4;
        }
        C1JI.LJJIIZ(view.findViewById(R.id.g5s), C61328O5c.LIZJ(i), null, null, null, null, 30);
        C1JI.LJJIIZ(view.findViewById(R.id.dge), C61328O5c.LIZJ(i), null, null, null, null, 30);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(Object obj) {
    }
}
