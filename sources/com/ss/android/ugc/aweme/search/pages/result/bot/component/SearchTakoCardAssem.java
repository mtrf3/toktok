package com.ss.android.ugc.aweme.search.pages.result.bot.component;

import X.AbstractC029409q;
import X.AbstractC030309z;
import X.AbstractC50059Jkl;
import X.ActivityC45651qj;
import X.C1AT;
import X.C1JI;
import X.C208218Fd;
import X.C212428Vi;
import X.C214298b3;
import X.C221108m2;
import X.C2U8;
import X.C30591Hz;
import X.C48881JGj;
import X.C48892JGu;
import X.C49002JLa;
import X.C49024JLw;
import X.C49480JbQ;
import X.C49506Jbq;
import X.C49510Jbu;
import X.C49512Jbw;
import X.C49555Jcd;
import X.C49587Jd9;
import X.C49624Jdk;
import X.C49804Jge;
import X.C50322Jp0;
import X.C54840Lfg;
import X.C55096Ljo;
import X.C57862Ow;
import X.C61328O5c;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72808Sho;
import X.C76965UIn;
import X.C78926UyI;
import X.C7MY;
import X.C8YN;
import X.C9BD;
import X.EnumC35471Dw3;
import X.InterfaceC49479JbP;
import X.InterfaceC57784Mm4;
import X.InterfaceC65350Pko;
import X.JBR;
import X.JN1;
import X.JN2;
import X.JXN;
import X.SYL;
import X.TBT;
import X.ViewOnClickListenerC13880ga;
import X.X1D;
import Y.ACListenerS28S0100000_8;
import Y.AObserverS76S0100000_8;
import Y.IDCListenerS245S0100000_8;
import Y.IDrS47S0100000_8;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedCardAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardScope;
import com.ss.android.ugc.aweme.search.pages.result.bot.component.viewmodel.SearchTakoCardUIVM;
import com.ss.android.ugc.aweme.search.pages.result.bot.model.TakoInfo;
import com.ss.android.ugc.aweme.search.pages.result.common.topbarefficiency.core.viewmodel.SearchContainerHeaderVM;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.creationentrance.ability.SearchTopFragmentAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class SearchTakoCardAssem extends SearchAggregatedCardAssem<JXN> implements SearchTakoCardAbility {
    public final C62822Ol8 LLFII;
    public final C62822Ol8 LLFZ;
    public final C62822Ol8 LLI;
    public LinearLayoutCompat LLIFFJFJJ;
    public LinearLayoutCompat LLII;
    public SmartImageView LLIIII;
    public TextView LLIIIILZ;
    public C208218Fd LLIIIJ;
    public TuxTextView LLIIIL;
    public SYL LLIIIZ;
    public SYL LLIIJI;
    public final C62822Ol8 LLIIJLIL;
    public final C49480JbQ LLIIL;
    public final C62822Ol8 LLIILII;
    public final C62822Ol8 LLIILZL;
    public final C214298b3 LLIIZ;
    public final C62822Ol8 LLIL;
    public JXN LLILII;
    public C49002JLa<Aweme> LLILIL;
    public String LLILL;
    public final Map<Integer, Boolean> LLILLIZIL;
    public SearchContainerHeaderVM LLILLJJLI;
    public final IDCListenerS245S0100000_8 LLILLL;
    public final SearchTakoCardAssem$lifeCycleListener$1 LLILZ;
    public final IDrS47S0100000_8 LLILZIL;
    public final AObserverS76S0100000_8 LLILZLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.ci6;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedCardAssem
    public final int r4() {
        return R.id.j9f;
    }

    public SearchTakoCardAssem() {
        new LinkedHashMap();
        this.LLFII = C221108m2.LIZIZ(new AqS158S0100000_8(this, 216));
        this.LLFZ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 213));
        this.LLI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 211));
        this.LLIIJLIL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 217));
        this.LLIIL = new C49480JbQ();
        this.LLIILII = C221108m2.LIZIZ(new AqS158S0100000_8(this, 212));
        this.LLIILZL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 210));
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(SearchTakoCardUIVM.class);
        this.LLIIZ = C78926UyI.LJ(this, LIZ, c9bd, new AqS158S0100000_8((InterfaceC65350Pko) LIZ, 215), C49510Jbu.INSTANCE, null);
        this.LLIL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 214));
        this.LLILLIZIL = new LinkedHashMap();
        this.LLILLL = new IDCListenerS245S0100000_8(this, 5);
        this.LLILZ = new SearchTakoCardAssem$lifeCycleListener$1(this);
        this.LLILZIL = new IDrS47S0100000_8(this, 3);
        this.LLILZLL = new AObserverS76S0100000_8(this, 43);
    }

    public final Map<String, String> A4() {
        String str;
        String str2;
        String str3;
        HashMap hashMap = new HashMap();
        C50322Jp0 z4 = z4();
        String str4 = null;
        if (z4 != null) {
            str = z4.LJLJI;
        } else {
            str = null;
        }
        hashMap.put("search_id", str);
        C49587Jd9 C4 = C4();
        if (C4 != null) {
            str2 = C4.LJLJL;
        } else {
            str2 = null;
        }
        hashMap.put("search_result_id", str2);
        C49587Jd9 C42 = C4();
        if (C42 != null) {
            str3 = C42.LJLJI;
        } else {
            str3 = null;
        }
        hashMap.put("enter_from", str3);
        hashMap.put("token_type", "tikbot");
        C50322Jp0 z42 = z4();
        if (z42 != null) {
            str4 = z42.LJLJJI;
        }
        hashMap.put("search_keyword", str4);
        return hashMap;
    }

    public final SearchTakoCardUIVM B4() {
        return (SearchTakoCardUIVM) this.LLIIZ.getValue();
    }

    public final C49587Jd9 C4() {
        AbstractC50059Jkl<C49587Jd9> ut0;
        ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) this.LLFZ.getValue();
        if (iSearchContextAbility != null && (ut0 = iSearchContextAbility.ut0()) != null) {
            return ut0.LIZJ();
        }
        return null;
    }

    public final RecyclerView F4() {
        SearchTopFragmentAbility searchTopFragmentAbility = (SearchTopFragmentAbility) this.LLFII.getValue();
        if (searchTopFragmentAbility != null) {
            return searchTopFragmentAbility.w6();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedCardAssem
    public final AbstractC030309z p4() {
        return new C49506Jbq();
    }

    public final C50322Jp0 z4() {
        AbstractC50059Jkl<C50322Jp0> If;
        ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) this.LLFZ.getValue();
        if (iSearchContextAbility != null && (If = iSearchContextAbility.If()) != null) {
            return If.LIZJ();
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void Z3() {
        getContainerView().removeOnAttachStateChangeListener(this.LLILLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u4() {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        RecyclerView F4 = F4();
        int i2 = 2;
        if (F4 != null) {
            int computeVerticalScrollOffset = F4.computeVerticalScrollOffset();
            SearchContainerHeaderVM searchContainerHeaderVM = this.LLILLJJLI;
            boolean z5 = false;
            if (searchContainerHeaderVM != null && o.LJ(searchContainerHeaderVM.LJZL.getValue(), Boolean.TRUE)) {
                Integer num = (Integer) searchContainerHeaderVM.LJLLJ.getValue();
                if (num == null) {
                    num = 0;
                }
                i = num.intValue();
            } else {
                i = 0;
            }
            int i3 = computeVerticalScrollOffset - i;
            C208218Fd c208218Fd = this.LLIIIJ;
            if (c208218Fd != null) {
                if (c208218Fd.getMeasuredHeight() - i3 < 113) {
                    z = true;
                } else {
                    z = false;
                }
                if (i3 > C7MY.LIZIZ(44)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                StringBuilder LJI = JBR.LJI("pautoplay textBelow:", z, " height = ");
                C208218Fd c208218Fd2 = this.LLIIIJ;
                if (c208218Fd2 != null) {
                    LJI.append(c208218Fd2.getMeasuredHeight());
                    X1D.LIZIZ(LJI);
                    C49555Jcd gv0 = B4().gv0();
                    if (!z && !z2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    gv0.LIZIZ(Boolean.valueOf(z3));
                    if (1 - (i3 / getContainerView().getMeasuredHeight()) >= 0.6f) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    SearchTakoCardUIVM B4 = B4();
                    if (z4) {
                        i2 = 1;
                    }
                    B4.hv0(i2);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("pautoplay textBelow:");
                    LIZ.append(z);
                    LIZ.append(" titleAbove:");
                    C76965UIn.LIZJ(LIZ, z2, " aboveThreshold:", z4, ", blockplay = ");
                    if (!z && !z2) {
                        z5 = true;
                    }
                    LIZ.append(z5);
                    X1D.LIZIZ(LIZ);
                    return;
                }
                o.LJIJI("tvTakoAnswer");
                throw null;
            }
            o.LJIJI("tvTakoAnswer");
            throw null;
        }
        B4().hv0(2);
        B4().gv0().LIZIZ(Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedCardAssem
    public final InterfaceC49479JbP n4() {
        return this.LLIIL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a3, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01fb, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L111;
     */
    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedCardAssem
    /* renamed from: D4, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q4(X.JXN r12) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoCardAssem.F0(X.JXN):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        if (r0.getVisibility() == 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E4(boolean r5) {
        /*
            r4 = this;
            com.bytedance.lighten.loader.SmartImageView r1 = r4.LLIIII
            r3 = 0
            if (r1 == 0) goto L44
            r2 = 8
            if (r5 == 0) goto L2f
            r0 = 0
        La:
            r1.setVisibility(r0)
            X.SYL r1 = r4.LLIIJI
            if (r1 == 0) goto L3e
            if (r5 == 0) goto L2c
            r0 = 0
        L14:
            r1.setVisibility(r0)
            androidx.appcompat.widget.LinearLayoutCompat r1 = r4.LLIFFJFJJ
            if (r1 == 0) goto L38
            if (r5 != 0) goto L27
            android.widget.TextView r0 = r4.LLIIIILZ
            if (r0 == 0) goto L32
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L28
        L27:
            r2 = 0
        L28:
            r1.setVisibility(r2)
            return
        L2c:
            r0 = 8
            goto L14
        L2f:
            r0 = 8
            goto La
        L32:
            java.lang.String r0 = "tvTakoTitle"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r3
        L38:
            java.lang.String r0 = "llTakoTitle"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r3
        L3e:
            java.lang.String r0 = "rvTakoSug"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r3
        L44:
            java.lang.String r0 = "ivTakoIcon"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoCardAssem.E4(boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoCardAbility
    public final void XB(JN1 jn1) {
        int i = jn1.LJLILLLLZI.LJLIL;
        if (i != 0) {
            Object obj = ((LinkedHashMap) this.LLILLIZIL).get(Integer.valueOf(i));
            Boolean bool = Boolean.TRUE;
            if (!o.LJ(obj, bool)) {
                Map<String, String> A4 = A4();
                JN2 jn2 = jn1.LJLILLLLZI;
                C49512Jbw.LIZIZ(true, jn2.LJLIL, jn2.LJLILLLLZI, A4);
                this.LLILLIZIL.put(Integer.valueOf(jn1.LJLILLLLZI.LJLIL), bool);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoCardAbility
    public final void Xq0(JN1 item) {
        boolean z;
        String str;
        String str2;
        String str3;
        o.LJIIIZ(item, "item");
        if (item.LJLILLLLZI.LJLIL == 0) {
            z = true;
            str = "click_ask_more";
        } else {
            z = false;
            str = "click_recommend_word";
        }
        Map<String, String> A4 = A4();
        JSONObject jSONObject = new JSONObject();
        C49512Jbw.LJFF(A4, jSONObject);
        jSONObject.put("button_type", str);
        AppLogNewUtils.onEventV3("search_result_click", jSONObject);
        if (!z) {
            Map<String, String> A42 = A4();
            JN2 jn2 = item.LJLILLLLZI;
            C49512Jbw.LIZIZ(false, jn2.LJLIL, jn2.LJLILLLLZI, A42);
        }
        Context context = getContext();
        C50322Jp0 z4 = z4();
        String str4 = null;
        if (z4 != null) {
            str2 = z4.LJLJI;
        } else {
            str2 = null;
        }
        C50322Jp0 z42 = z4();
        if (z42 != null) {
            str3 = z42.LJLJJI;
        } else {
            str3 = null;
        }
        JN2 jn22 = item.LJLILLLLZI;
        if (jn22.LJLIL != 0) {
            str4 = jn22.LJLILLLLZI;
        }
        C49624Jdk.LIZ(context, "general_search_tikbot", str, str2, str3, str4, null, null, "search_chat_sug", null);
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchAggregatedCardAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = view.findViewById(R.id.g1c);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.llTakoTitle)");
        this.LLIFFJFJJ = (LinearLayoutCompat) findViewById;
        View findViewById2 = view.findViewById(R.id.g1b);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.llTakoAnswer)");
        this.LLII = (LinearLayoutCompat) findViewById2;
        View findViewById3 = view.findViewById(R.id.ly5);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.tvTakoTitle)");
        this.LLIIIILZ = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.ex4);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.ivTakoIcon)");
        this.LLIIII = (SmartImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.ly3);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.tvTakoAnswer)");
        this.LLIIIJ = (C208218Fd) findViewById5;
        View findViewById6 = view.findViewById(R.id.ly4);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.tvTakoAnswerFolder)");
        this.LLIIIL = (TuxTextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.j9f);
        o.LJIIIIZZ(findViewById7, "view.findViewById(R.id.rvTakoVideo)");
        this.LLIIIZ = (SYL) findViewById7;
        View findViewById8 = view.findViewById(R.id.j9e);
        o.LJIIIIZZ(findViewById8, "view.findViewById(R.id.rvTakoSug)");
        this.LLIIJI = (SYL) findViewById8;
        SYL syl = this.LLIIIZ;
        if (syl != null) {
            C54840Lfg.LJLIIL(0, syl);
            SYL syl2 = this.LLIIIZ;
            if (syl2 != null) {
                AbstractC029409q adapter = syl2.getAdapter();
                if (adapter != null) {
                    this.LLILIL = new C49002JLa<>(adapter);
                }
                LinearLayoutCompat linearLayoutCompat = this.LLII;
                if (linearLayoutCompat != null) {
                    linearLayoutCompat.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS28S0100000_8(this, 27)));
                    LinearLayoutCompat linearLayoutCompat2 = this.LLIFFJFJJ;
                    if (linearLayoutCompat2 != null) {
                        C1JI.LJJIIZ(linearLayoutCompat2, C61328O5c.LIZJ(2), null, null, null, null, 30);
                        C8YN.LJII(this, B4(), new TBT() { // from class: X.Jcj
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return Integer.valueOf(((C49559Jch) obj).LJLIL);
                            }
                        }, null, new AqS190S0100000_8(this, 2), 6);
                        SYL syl3 = this.LLIIJI;
                        if (syl3 != null) {
                            C30591Hz.LJJIII(syl3, C55096Ljo.LJIIZILJ(this));
                            C72808Sho<InterfaceC57784Mm4> state = syl3.getState();
                            EnumC35471Dw3 emitStrategy = EnumC35471Dw3.BUFFER;
                            state.getClass();
                            o.LJIIIZ(emitStrategy, "emitStrategy");
                            state.LIZIZ = emitStrategy;
                            syl3.getContext();
                            syl3.setLayoutManager(new LinearLayoutManager(0, false));
                            syl3.LLLF.LJZL(SearchTakoSugCell.class);
                            syl3.setAnimation(null);
                            syl3.setItemAnimator(null);
                            syl3.LJII(new AbstractC030309z() { // from class: X.3vU
                                @Override // X.AbstractC030309z
                                public final void LJ(Rect rect, View view2, RecyclerView recyclerView, C0AC c0ac) {
                                    int i;
                                    int LIZJ = C1JX.LIZJ(rect, "outRect", view2, "view", recyclerView, "parent", c0ac, "state", view2);
                                    int LIZIZ = C7MY.LIZIZ(8);
                                    if (C90193gN.LIZ()) {
                                        i = LIZIZ;
                                    } else if (LIZJ == 0) {
                                        i = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
                                    } else {
                                        i = 0;
                                    }
                                    rect.left = i;
                                    if (C90193gN.LIZ()) {
                                        if (LIZJ == 0) {
                                            LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
                                        } else {
                                            LIZIZ = 0;
                                        }
                                    }
                                    rect.right = LIZIZ;
                                }
                            }, -1);
                            getContainerView().addOnAttachStateChangeListener(this.LLILLL);
                            C55096Ljo.LJIILIIL(this, SearchCardScope.class, this, SearchTakoCardAbility.class);
                            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
                            if (LIZ != null && C49804Jge.LJJIZ()) {
                                this.LLILLJJLI = (SearchContainerHeaderVM) ViewModelProviders.of(LIZ).get(SearchContainerHeaderVM.class);
                                return;
                            }
                            return;
                        }
                        o.LJIJI("rvTakoSug");
                        throw null;
                    }
                    o.LJIJI("llTakoTitle");
                    throw null;
                }
                o.LJIJI("llTakoAnswer");
                throw null;
            }
            o.LJIJI("rvTakoVideo");
            throw null;
        }
        o.LJIJI("rvTakoVideo");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.bot.component.SearchTakoCardAbility
    public final void Tu0(C49024JLw item, C48881JGj c48881JGj, C1AT c1at) {
        SearchMixFeed searchMixFeed;
        TakoInfo takoInfo;
        List<Aweme> awemeList;
        String str;
        String str2;
        String str3;
        o.LJIIIZ(item, "item");
        JXN jxn = this.LLILII;
        if (jxn != null && (searchMixFeed = jxn.LJLIL) != null && (takoInfo = searchMixFeed.bot) != null && (awemeList = takoInfo.getAwemeList()) != null) {
            Aweme aweme = item.LJLILLLLZI;
            C2U8.LIZ(new C57862Ow(awemeList, aweme.getAid()));
            if (c48881JGj != null) {
                C48892JGu.LIZ(c48881JGj, true);
            }
            Bundle bundle = new Bundle();
            bundle.putString("id", aweme.getAid());
            bundle.putString("enter_from", "general_search");
            C50322Jp0 z4 = z4();
            String str4 = null;
            if (z4 != null) {
                str = z4.LJLJJI;
            } else {
                str = null;
            }
            bundle.putString("search_keyword", str);
            bundle.putInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 35);
            C50322Jp0 z42 = z4();
            if (z42 != null) {
                str2 = z42.LJLJI;
            } else {
                str2 = null;
            }
            bundle.putString("search_id", str2);
            bundle.putString("list_item_id", aweme.getAid());
            C49587Jd9 C4 = C4();
            if (C4 != null) {
                str3 = C4.LJLJL;
            } else {
                str3 = null;
            }
            bundle.putString("search_result_id", str3);
            C50322Jp0 z43 = z4();
            if (z43 != null) {
                str4 = z43.LJLILLLLZI;
            }
            bundle.putString("key_search_type", str4);
            SmartRoute smartRoute = new SmartRoute(getContext());
            smartRoute.withUrl("//aweme/detail");
            smartRoute.withParam(bundle);
            smartRoute.withParam("outer_aweme_id", aweme.getAid());
            smartRoute.withParam("video_from", "from_search_mix");
            smartRoute.withBundleAnimation(c1at.LIZLLL());
            smartRoute.withParam("activity_has_activity_options", true);
            smartRoute.open();
        }
    }
}
