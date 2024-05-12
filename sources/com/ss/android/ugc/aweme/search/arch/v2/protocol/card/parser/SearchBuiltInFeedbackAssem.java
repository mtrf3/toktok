package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser;

import X.C221108m2;
import X.C47704Ins;
import X.C49587Jd9;
import X.C50322Jp0;
import X.C55096Ljo;
import X.C55749LuL;
import X.C61878OQg;
import X.C62822Ol8;
import X.InterfaceC49025JLx;
import X.InterfaceC88472Yns;
import X.JLW;
import X.JYG;
import android.content.Context;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$MobAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchBuiltInFeedbackAssem extends SearchCardFeedbackAssem<InterfaceC49025JLx> {
    public final C55749LuL LLD;
    public final int LLF;
    public final C62822Ol8 LLFF;
    public InterfaceC49025JLx LLFFF;

    public SearchBuiltInFeedbackAssem() {
        new LinkedHashMap();
        this.LLD = new C55749LuL(C47704Ins.LJ(this, JLW.class, null), checkSupervisorPrepared());
        this.LLF = R.id.g5s;
        this.LLFF = C221108m2.LIZIZ(new AqS158S0100000_8(this, 124));
    }

    @Override // X.JY1
    public final List<Integer> LLLLLLL() {
        return (List) this.LLFF.getValue();
    }

    @Override // X.JY1
    public final String LLLLZIL() {
        JLW<InterfaceC49025JLx> k4;
        InterfaceC88472Yns<? super InterfaceC49025JLx, String> interfaceC88472Yns;
        InterfaceC49025JLx interfaceC49025JLx = this.LLFFF;
        if (interfaceC49025JLx != null && (k4 = k4()) != null && (interfaceC88472Yns = k4.LJLIL) != null) {
            return interfaceC88472Yns.invoke(interfaceC49025JLx);
        }
        return null;
    }

    public final JLW<InterfaceC49025JLx> k4() {
        return (JLW) this.LLD.getValue();
    }

    @Override // X.JY1
    public final int LLJJJIL() {
        return this.LLF;
    }

    @Override // X.JY1
    public final List<Integer> l2() {
        return C61878OQg.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem, X.C8XO
    /* renamed from: F0 */
    public final /* bridge */ /* synthetic */ void q4(Object obj) {
        F0((InterfaceC49025JLx) obj);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardFeedbackAssem
    /* renamed from: e4 */
    public final void F0(InterfaceC49025JLx item) {
        o.LJIIIZ(item, "item");
        super.F0(item);
        this.LLFFF = item;
    }

    @Override // X.JY1
    public final void n2(JYG jyg) {
        Aweme aweme;
        String str;
        Resources resources;
        UrlModel urlModel;
        String str2;
        InterfaceC88472Yns<? super InterfaceC49025JLx, ? extends Map<String, String>> interfaceC88472Yns;
        Map<String, String> invoke;
        InterfaceC88472Yns<? super InterfaceC49025JLx, ? extends UrlModel> interfaceC88472Yns2;
        InterfaceC88472Yns<? super InterfaceC49025JLx, String> interfaceC88472Yns3;
        InterfaceC88472Yns<? super InterfaceC49025JLx, ? extends Aweme> interfaceC88472Yns4;
        InterfaceC49025JLx interfaceC49025JLx = this.LLFFF;
        if (interfaceC49025JLx == null) {
            return;
        }
        JLW<InterfaceC49025JLx> k4 = k4();
        String str3 = null;
        if (k4 != null && (interfaceC88472Yns4 = k4.LJLJJI) != null) {
            aweme = interfaceC88472Yns4.invoke(interfaceC49025JLx);
        } else {
            aweme = null;
        }
        JLW<InterfaceC49025JLx> k42 = k4();
        if (k42 == null || (interfaceC88472Yns3 = k42.LJLILLLLZI) == null || (str = interfaceC88472Yns3.invoke(interfaceC49025JLx)) == null) {
            Context context = getContext();
            if (context != null && (resources = context.getResources()) != null) {
                str = resources.getString(R.string.tl_);
            } else {
                str = null;
            }
        }
        jyg.setTitle(str);
        JLW<InterfaceC49025JLx> k43 = k4();
        if (k43 != null && (interfaceC88472Yns2 = k43.LJLJI) != null) {
            urlModel = interfaceC88472Yns2.invoke(interfaceC49025JLx);
        } else {
            urlModel = null;
        }
        jyg.setImgCover(urlModel);
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        jyg.setAwemeId(str2);
        if (aweme != null) {
            str3 = aweme.getAuthorUid();
        }
        jyg.setAuthorId(str3);
        HashMap hashMap = new HashMap();
        C50322Jp0 LIZJ = ((ISearchContextAbility) this.LJZL.getValue()).If().LIZJ();
        hashMap.put("search_id", LIZJ.LJLJI);
        hashMap.put("search_keyword", LIZJ.LJLJJI);
        C49587Jd9 LIZJ2 = ((ISearchContextAbility) this.LJZL.getValue()).ut0().LIZJ();
        hashMap.put("enter_from", LIZJ2.LJLJI);
        hashMap.put("rank", String.valueOf(LIZJ2.LJLJJI));
        Map<String, String> m60 = ((SearchServiceCenter$MobAbility) C55096Ljo.LIZIZ(C55096Ljo.LJIIZILJ(this), SearchServiceCenter$MobAbility.class)).m60();
        String str4 = m60.get("search_result_id");
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        hashMap.put("search_result_id", str4);
        String str6 = m60.get("token_type");
        if (str6 == null) {
            str6 = "";
        }
        hashMap.put("token_type", str6);
        String str7 = m60.get("is_aladdin");
        if (str7 != null) {
            str5 = str7;
        }
        hashMap.put("is_aladdin", str5);
        JLW<InterfaceC49025JLx> k44 = k4();
        if (k44 != null && (interfaceC88472Yns = k44.LJLJJLL) != null && (invoke = interfaceC88472Yns.invoke(interfaceC49025JLx)) != null) {
            hashMap.putAll(invoke);
        }
        jyg.setLogParams(hashMap);
    }
}
