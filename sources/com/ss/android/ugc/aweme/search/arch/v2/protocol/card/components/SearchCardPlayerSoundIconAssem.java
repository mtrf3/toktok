package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components;

import X.C16880lQ;
import X.C188727au;
import X.C212428Vi;
import X.C221108m2;
import X.C34X;
import X.C46314IFq;
import X.C50322Jp0;
import X.C55096Ljo;
import X.C62822Ol8;
import X.C76800UCe;
import X.C8XO;
import X.EnumC48916JHs;
import X.FMX;
import X.GHC;
import X.InterfaceC36571c5;
import X.InterfaceC49000JKy;
import X.InterfaceC88472Yns;
import X.J1C;
import X.J1M;
import X.J1O;
import X.JHK;
import X.JL1;
import X.JON;
import X.JYH;
import Y.ACListenerS28S0100000_8;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.scope.SearchPlayerScope;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$MobAbility;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchCardPlayerSoundIconAssem extends ReusedUISlotAssem<SearchCardPlayerSoundIconAssem> implements View.OnAttachStateChangeListener, GHC, C8XO<InterfaceC49000JKy> {
    public final ArrayList<InterfaceC88472Yns<Boolean, C76800UCe>> LLFF;
    public final C62822Ol8 LLFFF;
    public SearchComponentCenter$Player$PlayerControlAbility LLFII;
    public Aweme LLFZ;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.cf_;
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public SearchCardPlayerSoundIconAssem() {
        new LinkedHashMap();
        this.LLFF = new ArrayList<>();
        this.LLFFF = C221108m2.LIZIZ(new AqS158S0100000_8(this, 117));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void Z3() {
        C55096Ljo.LJIILLIIL(this, SearchPlayerScope.class, SearchComponentCenter.SoundIcon.SoundIconAbility.class);
    }

    public final JON m4() {
        Object value = this.LLFFF.getValue();
        o.LJIIIIZZ(value, "<get-soundIcon>(...)");
        return (JON) value;
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(InterfaceC49000JKy interfaceC49000JKy) {
        InterfaceC49000JKy item = interfaceC49000JKy;
        o.LJIIIZ(item, "item");
        this.LLFZ = item.getAweme();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void N3(View view) {
        C34X c34x;
        o.LJIIIZ(view, "view");
        InterfaceC36571c5 LIZ = C212428Vi.LIZ(this);
        if ((LIZ instanceof C34X) && (c34x = (C34X) LIZ) != null) {
            c34x.registerActivityOnKeyDownListener(this);
        }
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(InterfaceC49000JKy interfaceC49000JKy) {
        return true;
    }

    public final void n4(J1M j1m) {
        String str;
        JYH jyh = JYH.LIZIZ;
        if (jyh.LJIIJ()) {
            J1C.LIZ = false;
            jyh.LIZLLL("general_search", j1m, J1O.STYLE_NO_BUTTON);
        }
        J1C.LIZJ(!J1C.LIZIZ() ? 1 : 0);
        boolean LIZ = J1C.LIZ(C46314IFq.LIZIZ() ? 1 : 0, 0, this.LLFZ);
        SearchComponentCenter$Player$PlayerControlAbility searchComponentCenter$Player$PlayerControlAbility = this.LLFII;
        if (searchComponentCenter$Player$PlayerControlAbility != null) {
            searchComponentCenter$Player$PlayerControlAbility.setMute(LIZ);
        }
        JHK jhk = EnumC48916JHs.Companion;
        J1C.LJ();
        int i = J1C.LIZIZ;
        jhk.getClass();
        EnumC48916JHs LIZ2 = JHK.LIZ(i);
        if (LIZ2 != null) {
            m4().LIZ(LIZ2, false);
        }
        C188727au c188727au = new C188727au();
        ISearchContextAbility iSearchContextAbility = (ISearchContextAbility) C55096Ljo.LIZIZ(C55096Ljo.LJIIZILJ(this), ISearchContextAbility.class);
        C50322Jp0 LIZJ = iSearchContextAbility.If().LIZJ();
        c188727au.LJI("search_id", LIZJ.LJLJI);
        c188727au.LJI("search_keyword", LIZJ.LJLJJI);
        c188727au.LJI("enter_from", iSearchContextAbility.ut0().LIZJ().LJLJI);
        c188727au.LJI("search_type", "general");
        c188727au.LIZLLL(0, "is_fullscreen");
        if (J1C.LIZIZ()) {
            str = "off";
        } else {
            str = "on";
        }
        c188727au.LJI("switch_status", str);
        Map<String, String> m60 = ((SearchServiceCenter$MobAbility) C55096Ljo.LIZIZ(C55096Ljo.LJIIZILJ(this), SearchServiceCenter$MobAbility.class)).m60();
        c188727au.LJI("search_result_id", m60.get("search_result_id"));
        c188727au.LJI("token_type", m60.get("token_type"));
        FMX.LJIIL("sounds_switch_click", c188727au.LIZ);
        Iterator<InterfaceC88472Yns<Boolean, C76800UCe>> it = this.LLFF.iterator();
        while (it.hasNext()) {
            it.next().invoke(Boolean.valueOf(!LIZ));
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        C34X c34x;
        o.LJIIIZ(v, "v");
        InterfaceC36571c5 LIZ = C212428Vi.LIZ(this);
        if ((LIZ instanceof C34X) && (c34x = (C34X) LIZ) != null) {
            c34x.registerActivityOnKeyDownListener(this);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        view.addOnAttachStateChangeListener(this);
        C55096Ljo.LJIILIIL(this, SearchPlayerScope.class, new SearchComponentCenter.SoundIcon.SoundIconAbility() { // from class: com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardPlayerSoundIconAssem$initAbility$1
            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter.SoundIcon.SoundIconAbility
            public final void Sq(AqS174S0100000_8 aqS174S0100000_8) {
                SearchCardPlayerSoundIconAssem.this.LLFF.add(aqS174S0100000_8);
            }
        }, SearchComponentCenter.SoundIcon.SoundIconAbility.class);
        m4().setVisibility(8);
        C16880lQ.LJJJLZIJ(m4(), new ACListenerS28S0100000_8(this, 116));
        SearchComponentCenter$Player$PlayerControlAbility searchComponentCenter$Player$PlayerControlAbility = (SearchComponentCenter$Player$PlayerControlAbility) C55096Ljo.LIZIZ(C55096Ljo.LJIIZILJ(this), SearchComponentCenter$Player$PlayerControlAbility.class);
        this.LLFII = searchComponentCenter$Player$PlayerControlAbility;
        searchComponentCenter$Player$PlayerControlAbility.T70(new JL1(this));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        C34X c34x;
        o.LJIIIZ(v, "v");
        InterfaceC36571c5 LIZ = C212428Vi.LIZ(this);
        if ((LIZ instanceof C34X) && (c34x = (C34X) LIZ) != null) {
            c34x.unRegisterActivityOnKeyDownListener(this);
        }
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(InterfaceC49000JKy interfaceC49000JKy) {
    }

    @Override // X.GHC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        J1M j1m;
        SearchComponentCenter$Player$PlayerControlAbility searchComponentCenter$Player$PlayerControlAbility = this.LLFII;
        if (searchComponentCenter$Player$PlayerControlAbility != null && searchComponentCenter$Player$PlayerControlAbility.isPlaying() && JYH.LIZIZ.LJIIJ()) {
            if (i != 24) {
                if (i == 25) {
                    j1m = J1M.TURN_DOWN_VOLUME;
                }
            } else {
                j1m = J1M.TURN_UP_VOLUME;
            }
            n4(j1m);
        }
        return false;
    }
}
