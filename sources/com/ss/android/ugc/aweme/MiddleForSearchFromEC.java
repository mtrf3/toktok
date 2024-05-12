package com.ss.android.ugc.aweme;

import X.C51253K9p;
import X.C51307KBr;
import X.C58096Mr6;
import X.EnumC51264KAa;
import X.K4O;
import X.K4W;
import X.KAM;
import X.KAO;
import com.ss.android.ugc.aweme.ecomsearch.utils.EcIntermediatePreload;
import com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class MiddleForSearchFromEC implements IMiddleForSearchFromEC {
    @Override // com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC
    public final void LIZIZ() {
        K4W.LIZJ = false;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC
    public final void LIZJ() {
        C51253K9p.LIZIZ = null;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC
    public final void LJFF() {
        C51307KBr.LIZ(1);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC
    public final void LJIIJJI() {
        K4W.LIZJ = true;
    }

    public static IMiddleForSearchFromEC LJIILIIL() {
        Object LIZ = C58096Mr6.LIZ(IMiddleForSearchFromEC.class, false);
        if (LIZ != null) {
            return (IMiddleForSearchFromEC) LIZ;
        }
        return new MiddleForSearchFromEC();
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC
    public final void LJIIIIZZ() {
        KAO kao = C51253K9p.LIZIZ;
        if (kao == null) {
            return;
        }
        kao.LJIIIIZZ = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC
    public final String LIZ() {
        return C51307KBr.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC
    public final void LJII() {
        K4W.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC
    public final void LIZLLL(EnumC51264KAa enumC51264KAa) {
        C51253K9p.LIZ.LIZLLL(enumC51264KAa);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC
    public final void LJ(SearchResultParam searchResultParam) {
        EcIntermediatePreload.Companion.getClass();
        KAM.LIZ(searchResultParam);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC
    public final void LJI(String str) {
        C51307KBr.LIZ = str;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC
    public final void LJIIJ(String input) {
        o.LJIIIZ(input, "input");
        K4W.LIZ = input;
        K4W.LIZIZ = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC
    public final void LJIIL(int i) {
        K4W.LJ = i;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.IMiddleForSearchFromEC
    public final void LJIIIZ(Boolean bool, String content) {
        o.LJIIIZ(content, "content");
        if (bool == null) {
            K4O.LIZIZ(content);
        } else {
            K4O.LIZIZ(content).LIZIZ = bool.booleanValue();
        }
    }
}
