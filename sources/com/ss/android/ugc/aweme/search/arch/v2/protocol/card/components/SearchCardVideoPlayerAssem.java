package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components;

import X.C16880lQ;
import X.C1JI;
import X.C221108m2;
import X.C32151Nz;
import X.C48881JGj;
import X.C48887JGp;
import X.C48976JKa;
import X.C48977JKb;
import X.C49045JMr;
import X.C49187JSd;
import X.C49288JWa;
import X.C55096Ljo;
import X.C62822Ol8;
import X.C76800UCe;
import X.C78897Uxp;
import X.C78939UyV;
import X.C8XO;
import X.InterfaceC48983JKh;
import X.InterfaceC49000JKy;
import X.InterfaceC65784Pro;
import X.JGI;
import X.JIB;
import X.JIC;
import X.JNL;
import X.JON;
import X.JQA;
import X.ORS;
import X.W5F;
import X.W5U;
import Y.ACListenerS28S0100000_8;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.scope.SearchPlayerScope;
import com.ss.android.ugc.aweme.search.arch.v2.services.InternalPlayerSyncAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class SearchCardVideoPlayerAssem extends ReusedUISlotAssem<SearchCardVideoPlayerAssem> implements C8XO<InterfaceC49000JKy>, SearchComponentCenter$Player$PlayerControlAbility {
    public final C62822Ol8 LLFF;
    public final C62822Ol8 LLFFF;
    public final C62822Ol8 LLFII;
    public InterfaceC49000JKy LLFZ;
    public JQA LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public final C62822Ol8 LLIIII;
    public final C62822Ol8 LLIIIILZ;
    public final AqS174S0100000_8 LLIIIJ;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.chq;
    }

    public void m4(JQA jqa) {
    }

    public SearchCardVideoPlayerAssem() {
        new LinkedHashMap();
        this.LLFF = C221108m2.LIZIZ(new AqS158S0100000_8(this, 121));
        this.LLFFF = C221108m2.LIZIZ(new AqS158S0100000_8(this, LiveTryModeCountDownThresholdSetting.DEFAULT));
        this.LLFII = C221108m2.LIZIZ(new AqS158S0100000_8(this, 123));
        this.LLIFFJFJJ = C221108m2.LIZIZ(C48976JKa.LJLIL);
        this.LLII = C221108m2.LIZIZ(new AqS158S0100000_8(this, 122));
        this.LLIIII = C221108m2.LIZIZ(new AqS158S0100000_8(this, 119));
        this.LLIIIILZ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 118));
        this.LLIIIJ = new AqS174S0100000_8(this, 65);
    }

    public void n4() {
        String str;
        Aweme aweme;
        Aweme aweme2;
        InterfaceC49000JKy interfaceC49000JKy = this.LLFZ;
        if (interfaceC49000JKy != null && (aweme2 = interfaceC49000JKy.getAweme()) != null) {
            q4().LIZ(aweme2);
        }
        C48881JGj dataProvider = q4().getDataProvider();
        if (dataProvider != null) {
            dataProvider.LJIJJLI = this.LLI;
        }
        C48881JGj dataProvider2 = q4().getDataProvider();
        if (dataProvider2 != null) {
            JQA jqa = this.LLI;
            if (jqa == null || (str = jqa.LJIILJJIL) == null) {
                str = "";
            }
            dataProvider2.LJII(str);
        }
        C49045JMr c49045JMr = (C49045JMr) this.LLII.getValue();
        InterfaceC49000JKy interfaceC49000JKy2 = this.LLFZ;
        if (interfaceC49000JKy2 != null) {
            aweme = interfaceC49000JKy2.getAweme();
        } else {
            aweme = null;
        }
        c49045JMr.LJLJLJ = aweme;
        JIB jib = (JIB) this.LLIIIILZ.getValue();
        if (jib != null) {
            JGI core = q4().getCore();
            if (core != null) {
                core.setContainerStatusProvider(jib);
            }
            InternalPlayerSyncAbility internalPlayerSyncAbility = (InternalPlayerSyncAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), InternalPlayerSyncAbility.class, null);
            if (internalPlayerSyncAbility != null) {
                internalPlayerSyncAbility.Ws0(q4(), this.LLIIIJ);
            }
        }
        C55096Ljo.LJIILIIL(this, SearchPlayerScope.class, this, SearchComponentCenter$Player$PlayerControlAbility.class);
        C55096Ljo.LJIILIIL(this, SearchPlayerScope.class, new SearchServiceCenter$AutoPlayAbility() { // from class: com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchCardVideoPlayerAssem$bindVideoView$3
            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final boolean LLIIII() {
                return true;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void i40(int i) {
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final View m8() {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void Wc() {
                JGI core2 = SearchCardVideoPlayerAssem.this.q4().getCore();
                if (core2 != null) {
                    core2.LJIIZILJ();
                }
                SearchCardVideoPlayerAssem.this.p4().setVisibility(8);
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final View getDetectView() {
                return SearchCardVideoPlayerAssem.this.q4();
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final boolean isPlaying() {
                JGI core2 = SearchCardVideoPlayerAssem.this.q4().getCore();
                if (core2 == null || !core2.isPlaying()) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void kV() {
                JGI core2 = SearchCardVideoPlayerAssem.this.q4().getCore();
                if (core2 != null) {
                    JIC.LIZ(core2);
                }
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void x4(C49187JSd listener) {
                o.LJIIIZ(listener, "listener");
                ((CopyOnWriteArrayList) SearchCardVideoPlayerAssem.this.LLIFFJFJJ.getValue()).add(new C48977JKb(listener));
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void z8(C49187JSd listener) {
                o.LJIIIZ(listener, "listener");
                ORS.LJJLIL(new AqS174S0100000_8(listener, 66), (CopyOnWriteArrayList) SearchCardVideoPlayerAssem.this.LLIFFJFJJ.getValue());
            }

            @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility
            public final void tO(C49288JWa childTask, InterfaceC65784Pro<C76800UCe> locateFinishCallback) {
                o.LJIIIZ(childTask, "childTask");
                o.LJIIIZ(locateFinishCallback, "locateFinishCallback");
            }
        }, SearchServiceCenter$AutoPlayAbility.class);
    }

    public final JON p4() {
        Object value = this.LLFFF.getValue();
        o.LJIIIIZZ(value, "<get-soundIcon>(...)");
        return (JON) value;
    }

    public final C48887JGp q4() {
        Object value = this.LLFII.getValue();
        o.LJIIIIZZ(value, "<get-videoView>(...)");
        return (C48887JGp) value;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
    public final boolean isMute() {
        JGI core = q4().getCore();
        if (core != null) {
            return core.getMute();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
    public final boolean isPlaying() {
        JGI core = q4().getCore();
        if (core == null || !core.isPlaying()) {
            return false;
        }
        return true;
    }

    @Override // X.C8XO
    public final void unBind() {
        InternalPlayerSyncAbility internalPlayerSyncAbility;
        JGI core = q4().getCore();
        if (core != null) {
            core.LJIIZILJ();
        }
        C55096Ljo.LJIILLIIL(this, SearchPlayerScope.class, SearchComponentCenter$Player$PlayerControlAbility.class);
        C55096Ljo.LJIILLIIL(this, SearchPlayerScope.class, SearchServiceCenter$AutoPlayAbility.class);
        if (this.LLIIIILZ.getValue() != null && (internalPlayerSyncAbility = (InternalPlayerSyncAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), InternalPlayerSyncAbility.class, null)) != null) {
            internalPlayerSyncAbility.UD(q4());
        }
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(InterfaceC49000JKy interfaceC49000JKy) {
        Aweme aweme;
        Video video;
        UrlModel cover;
        InterfaceC49000JKy item = interfaceC49000JKy;
        o.LJIIIZ(item, "item");
        this.LLFZ = item;
        JQA LIZ = JNL.LIZ(C55096Ljo.LJIIZILJ(this));
        if (LIZ != null) {
            m4(LIZ);
        } else {
            LIZ = null;
        }
        this.LLI = LIZ;
        p4().setVisibility(8);
        n4();
        InterfaceC49000JKy interfaceC49000JKy2 = this.LLFZ;
        if (interfaceC49000JKy2 != null && (aweme = interfaceC49000JKy2.getAweme()) != null && (video = aweme.getVideo()) != null && (cover = video.getCover()) != null) {
            W5F LJII = W5U.LJII(C78939UyV.LJ(cover));
            Object value = this.LLFF.getValue();
            o.LJIIIIZZ(value, "<get-videoCover>(...)");
            LJII.LJJIIJ = (SmartImageView) value;
            LJII.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
    public final void T70(InterfaceC48983JKh interfaceC48983JKh) {
        ((CopyOnWriteArrayList) this.LLIFFJFJJ.getValue()).add(interfaceC48983JKh);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ boolean c2(InterfaceC49000JKy interfaceC49000JKy) {
        return true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C1JI.LJJIIZ(view, Float.valueOf(C32151Nz.LJIIZILJ(4)), null, null, null, null, 30);
        JON p4 = p4();
        C78897Uxp.LJJJJLI(p4, null);
        C16880lQ.LJJJLZIJ(p4, new ACListenerS28S0100000_8(this, 117));
        C48887JGp q4 = q4();
        q4.setEnableLifecycleObserver(true);
        q4.setEnableHideCoverAnim(true);
        Object value = this.LLFF.getValue();
        o.LJIIIIZZ(value, "<get-videoCover>(...)");
        q4.setMCoverView((ImageView) value);
        q4.setClipToOutline(true);
        JGI core = q4.getCore();
        if (core != null) {
            core.setVideoUiListener((C49045JMr) this.LLII.getValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.search.arch.v2.services.SearchComponentCenter$Player$PlayerControlAbility
    public final void setMute(boolean z) {
        JGI core = q4().getCore();
        if (core == null) {
            return;
        }
        core.setMute(z);
    }

    @Override // X.C8XO
    public final /* bridge */ /* synthetic */ void n3(InterfaceC49000JKy interfaceC49000JKy) {
    }
}
