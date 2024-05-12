package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components;

import X.C16880lQ;
import X.C221108m2;
import X.C47704Ins;
import X.C48935JIl;
import X.C48936JIm;
import X.C48977JKb;
import X.C48988JKm;
import X.C48998JKw;
import X.C49187JSd;
import X.C49288JWa;
import X.C55096Ljo;
import X.C55749LuL;
import X.C62822Ol8;
import X.C76800UCe;
import X.C78934UyQ;
import X.C78939UyV;
import X.C8XO;
import X.InterfaceC48983JKh;
import X.InterfaceC49000JKy;
import X.InterfaceC65784Pro;
import X.JNL;
import X.JQA;
import X.ORS;
import X.V92;
import X.W5F;
import X.W5U;
import Y.IDCListenerS245S0100000_8;
import android.graphics.PointF;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.scope.SearchPlayerScope;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchCardLivePlayerAssem extends ReusedUISlotAssem<SearchCardLivePlayerAssem> implements SearchComponentCenter$Player$PlayerControlAbility, C8XO<InterfaceC49000JKy> {
    public final C55749LuL LLFF;
    public final C62822Ol8 LLFFF;
    public final C62822Ol8 LLFII;
    public final C62822Ol8 LLFZ;
    public final C62822Ol8 LLI;
    public Aweme LLIFFJFJJ;
    public boolean LLII;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.cf9;
    }

    public SearchCardLivePlayerAssem() {
        new LinkedHashMap();
        this.LLFF = new C55749LuL(C47704Ins.LJ(this, C48998JKw.class, null), checkSupervisorPrepared());
        this.LLFFF = C221108m2.LIZIZ(new AqS158S0100000_8(this, 116));
        this.LLFII = C221108m2.LIZIZ(new AqS158S0100000_8(this, 115));
        this.LLFZ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 114));
        this.LLI = C221108m2.LIZIZ(C48988JKm.LJLIL);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void Z3() {
        C55096Ljo.LJIILLIIL(this, SearchPlayerScope.class, SearchServiceCenter$AutoPlayAbility.class);
        C55096Ljo.LJIILLIIL(this, SearchPlayerScope.class, SearchComponentCenter$Player$PlayerControlAbility.class);
    }

    public final SmartImageView m4() {
        Object value = this.LLFZ.getValue();
        o.LJIIIIZZ(value, "<get-ivCover>(...)");
        return (SmartImageView) value;
    }

    public final ArrayList<InterfaceC48983JKh> n4() {
        return (ArrayList) this.LLI.getValue();
    }

    public final C48936JIm p4() {
        Object value = this.LLFII.getValue();
        o.LJIIIIZZ(value, "<get-searchLiveView>(...)");
        return (C48936JIm) value;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
    public final boolean isMute() {
        return p4().getLiveCore().getMute();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
    public final boolean isPlaying() {
        return p4().getLiveCore().isPlaying();
    }

    @Override // X.C8XO
    public final void unBind() {
        p4().getLiveCore().LJFF();
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(InterfaceC49000JKy interfaceC49000JKy) {
        UrlModel urlModel;
        W5F LJII;
        UrlModel urlModel2;
        InterfaceC49000JKy item = interfaceC49000JKy;
        o.LJIIIZ(item, "item");
        this.LLIFFJFJJ = item.getAweme();
        Aweme aweme = item.getAweme();
        Long l = null;
        if (aweme.isLive()) {
            User author = aweme.getAuthor();
            if (author != null) {
                urlModel2 = author.roomCover;
            } else {
                urlModel2 = null;
            }
            LJII = W5U.LJII(C78939UyV.LJ(urlModel2));
        } else {
            Video video = aweme.getVideo();
            if (video != null) {
                urlModel = video.getCover();
            } else {
                urlModel = null;
            }
            LJII = W5U.LJII(C78939UyV.LJ(urlModel));
        }
        LJII.LJJIIJ = m4();
        C16880lQ.LLJJJ(LJII);
        m4().setVisibility(0);
        Aweme aweme2 = item.getAweme();
        JQA LIZ = JNL.LIZ(C55096Ljo.LJIIZILJ(this));
        if (LIZ == null) {
            LIZ = new JQA();
        }
        JQA jqa = new JQA();
        String enterFrom = LIZ.LJFF;
        o.LJIIIZ(enterFrom, "enterFrom");
        jqa.LJFF = enterFrom;
        String enterMethod = LIZ.LJI;
        o.LJIIIZ(enterMethod, "enterMethod");
        jqa.LJI = enterMethod;
        jqa.LIZIZ(LIZ.LJIIIIZZ);
        jqa.LIZJ(LIZ.LJII);
        jqa.LIZLLL(LIZ.LJ);
        String searchTypeStr = LIZ.LIZJ;
        o.LJIIIZ(searchTypeStr, "searchTypeStr");
        jqa.LIZJ = searchTypeStr;
        User author2 = aweme2.getAuthor();
        if (author2 != null) {
            l = Long.valueOf(C78934UyQ.LJIILJJIL(author2));
        }
        jqa.LJIILJJIL = String.valueOf(l);
        jqa.LJI = "live_cover";
        this.LLII = false;
        p4().LJIIIIZZ(aweme2, jqa);
        p4().getLiveCore().LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
    public final void T70(InterfaceC48983JKh interfaceC48983JKh) {
        n4().add(interfaceC48983JKh);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(InterfaceC49000JKy interfaceC49000JKy) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        InterfaceC65784Pro<? extends Map<String, String>> interfaceC65784Pro;
        o.LJIIIZ(view, "view");
        C55096Ljo.LJIILIIL(this, SearchPlayerScope.class, this, SearchComponentCenter$Player$PlayerControlAbility.class);
        C55096Ljo.LJIILIIL(this, SearchPlayerScope.class, new SearchServiceCenter$AutoPlayAbility() { // from class: com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardLivePlayerAssem$initCommonAbilities$1
            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void i40(int i) {
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final View m8() {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final boolean LLIIII() {
                return !SearchCardLivePlayerAssem.this.LLII;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void Wc() {
                SearchCardLivePlayerAssem.this.p4().getLiveCore().LJFF();
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final View getDetectView() {
                return SearchCardLivePlayerAssem.this.p4();
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final boolean isPlaying() {
                return SearchCardLivePlayerAssem.this.p4().getLiveCore().isPlaying();
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void kV() {
                SearchCardLivePlayerAssem.this.p4().getLiveCore().LLLJIL();
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void x4(C49187JSd listener) {
                o.LJIIIZ(listener, "listener");
                SearchCardLivePlayerAssem.this.n4().add(new C48977JKb(listener));
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void z8(C49187JSd listener) {
                o.LJIIIZ(listener, "listener");
                ORS.LJJLIL(new AqS174S0100000_8(listener, 277), SearchCardLivePlayerAssem.this.n4());
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void tO(C49288JWa childTask, InterfaceC65784Pro<C76800UCe> locateFinishCallback) {
                o.LJIIIZ(childTask, "childTask");
                o.LJIIIZ(locateFinishCallback, "locateFinishCallback");
            }
        }, SearchServiceCenter$AutoPlayAbility.class);
        view.addOnAttachStateChangeListener(new IDCListenerS245S0100000_8(this, 21));
        V92 hierarchy = m4().getHierarchy();
        hierarchy.LJIIL(2).LJIILLIIL(new PointF(0.5f, 0.0f));
        p4().setMCoverView(m4());
        p4().getLiveCore().LIZ(new AqS158S0100000_8(this, 709));
        C48935JIl dataProvider = p4().getDataProvider();
        C48998JKw c48998JKw = (C48998JKw) this.LLFF.getValue();
        if (c48998JKw != null) {
            interfaceC65784Pro = c48998JKw.LJLILLLLZI;
        } else {
            interfaceC65784Pro = null;
        }
        dataProvider.LJIIL = interfaceC65784Pro;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
    public final void setMute(boolean z) {
        p4().getLiveCore().setMute(z);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(InterfaceC49000JKy interfaceC49000JKy) {
    }
}
