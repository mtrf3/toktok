package com.ss.android.ugc.aweme.search.arch.v2.services;

import X.C113554cx;
import X.C48462J0g;
import X.C48463J0h;
import X.C49017JLp;
import X.C49587Jd9;
import X.C50322Jp0;
import X.InterfaceC49025JLx;
import X.InterfaceC49055JNb;
import X.InterfaceC49871Jhj;
import X.InterfaceC88472Yns;
import X.JMS;
import X.JNB;
import Y.IDCListenerS245S0100000_8;
import android.view.View;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.ISearchCardProtocol;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardViewHolder;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchCardMobAbilityImpl implements SearchServiceCenter$MobAbility, InterfaceC49055JNb {
    public final View LJLIL;
    public final ISearchCardProtocol<InterfaceC49871Jhj> LJLILLLLZI;
    public final ISearchContextAbility LJLJI;
    public Map<String, String> LJLJJI;
    public Map<String, String> LJLJJL;
    public Map<String, String> LJLJJLL;
    public Map<String, String> LJLJL;

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$MobAbility
    public final Map<String, String> Ki() {
        Map<String, String> map = this.LJLJL;
        if (map == null) {
            return C113554cx.LJJJLIIL();
        }
        return map;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$MobAbility
    public final Map<String, String> m60() {
        Map<String, String> map = this.LJLJJI;
        if (map == null) {
            return C113554cx.LJJJLIIL();
        }
        return map;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$MobAbility
    public final void hH(JMS jms) {
        C48462J0g LLLF;
        JNB jnb = new JNB(null);
        C50322Jp0 LIZJ = this.LJLJI.If().LIZJ();
        jnb.LJJIFFI(LIZJ.LJLJI);
        jnb.LJIIZILJ("search_keyword", LIZJ.LJLJJI);
        C49587Jd9 LIZJ2 = this.LJLJI.ut0().LIZJ();
        jnb.LJIJI(LIZJ2.LJLJI);
        jnb.LJJI(Integer.valueOf(LIZJ2.LJLJJI));
        Map<String, String> map = this.LJLJJL;
        if (map != null) {
            jnb.LJIILLIIL(map);
        } else {
            Map<String, String> map2 = this.LJLJJI;
            if (map2 != null) {
                jnb.LJIILLIIL(map2);
            }
        }
        if (jms != null && (LLLF = jms.LLLF()) != null) {
            jnb.LJIILLIIL(LLLF.LIZ());
        }
        jnb.LJIILIIL();
    }

    @Override // X.InterfaceC49055JNb
    public final void LIZ(InterfaceC49871Jhj interfaceC49871Jhj, InterfaceC49025JLx searchCardRenderData) {
        o.LJIIIZ(searchCardRenderData, "searchCardRenderData");
        if (searchCardRenderData instanceof JMS) {
            JMS jms = (JMS) searchCardRenderData;
            C48462J0g LLLF = jms.LLLF();
            LLLF.getClass();
            C49017JLp c49017JLp = new C49017JLp();
            ((InterfaceC88472Yns) LLLF.LIZ).invoke(c49017JLp);
            HashMap hashMap = new HashMap();
            hashMap.putAll(c49017JLp.LIZ);
            this.LJLJJI = hashMap;
            this.LJLJJL = jms.LLLF().LIZ();
            this.LJLJJLL = jms.LLLF().LIZJ();
            C48462J0g LLLF2 = jms.LLLF();
            LLLF2.getClass();
            C49017JLp c49017JLp2 = new C49017JLp();
            ((InterfaceC88472Yns) LLLF2.LIZ).invoke(c49017JLp2);
            C48463J0h c48463J0h = new C48463J0h();
            c49017JLp2.LIZLLL.invoke(c48463J0h);
            HashMap hashMap2 = new HashMap();
            hashMap2.putAll(c49017JLp2.LIZ);
            hashMap2.putAll(c48463J0h.LIZ);
            this.LJLJL = hashMap2;
        }
    }

    public SearchCardMobAbilityImpl(View itemView, ISearchCardProtocol protocol, SearchCardViewHolder searchContextAbility) {
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(protocol, "protocol");
        o.LJIIIZ(searchContextAbility, "searchContextAbility");
        this.LJLIL = itemView;
        this.LJLILLLLZI = protocol;
        this.LJLJI = searchContextAbility;
        itemView.addOnAttachStateChangeListener(new IDCListenerS245S0100000_8(this, 4));
    }
}
