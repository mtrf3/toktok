package com.ss.android.ugc.aweme.ecommercelive.business.player.live;

import X.B4L;
import X.C00F;
import X.C113554cx;
import X.C32186CkA;
import X.C48313Ixh;
import X.C49615Jdb;
import X.C62846OlW;
import X.C71867SIl;
import X.C71873SIr;
import X.C71874SIs;
import X.C71875SIt;
import X.C78685UuP;
import X.C78765Uvh;
import X.C78948Uye;
import X.EWS;
import X.EnumC71876SIu;
import X.EnumC72797Shd;
import X.InterfaceC71877SIv;
import X.InterfaceC86353Xun;
import X.OSZ;
import X.VNL;
import X.VNU;
import X.VPA;
import X.VPD;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.ugc.aweme.ecommerce.mall.ECommerceMallService;
import com.ss.android.ugc.aweme.ecommercelive.framework.serviceimpl.ECommerceLiveServiceImpl;
import com.ss.android.ugc.aweme.ecommercelive.service.IEcommerceLiveService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ECLynxLiveView extends LynxUI<C71874SIs> implements View.OnAttachStateChangeListener {
    public static final /* synthetic */ int LJLLLLLL = 0;
    public C62846OlW LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public volatile boolean LJLL;
    public volatile boolean LJLLI;
    public volatile long LJLLILLLL;
    public volatile boolean LJLLJ;
    public volatile boolean LJLLL;
    public C71875SIt LJLLLL;

    public final void LJIL() {
        C71874SIs c71874SIs = (C71874SIs) this.mView;
        String str = null;
        if (c71874SIs.LJLIL != null && !o.LJ(c71874SIs.LJLJJL, c71874SIs.LJLJJLL)) {
            InterfaceC86353Xun interfaceC86353Xun = c71874SIs.LJLIL;
            if (interfaceC86353Xun != null) {
                interfaceC86353Xun.d();
            } else {
                o.LJIJI("livePlayHelper");
                throw null;
            }
        }
        this.LJLL = false;
        LJIJJLI(false);
        if (this.LJLLILLLL > 0 && this.LJLLI) {
            String valueOf = String.valueOf(SystemClock.elapsedRealtime() - this.LJLLILLLL);
            EnumC71876SIu enumC71876SIu = EnumC71876SIu.LIVE_CARD_PAUSE;
            LJJI(CardStruct.IStatusCode.DEFAULT, valueOf, C113554cx.LJJLIIIIJ(new OSZ("code", Integer.valueOf(enumC71876SIu.getCode())), new OSZ("msg", enumC71876SIu.getMsg())));
        }
        String str2 = this.LJLJJI;
        if (str2 == null) {
            str2 = "";
        }
        if (this.LJLLILLLL > 0) {
            str = String.valueOf(SystemClock.elapsedRealtime() - this.LJLLILLLL);
        }
        C48313Ixh.LIZ(Boolean.valueOf(this.LJLL), "rd_ec_media_card_pause", str2, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (android.text.TextUtils.equals((java.lang.String) r1, "1") != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIFFI() {
        /*
            r6 = this;
            java.lang.String r5 = r6.LJLILLLLZI
            if (r5 == 0) goto La
            boolean r0 = ujb.o.LJJJJJL(r5)
            if (r0 == 0) goto Lb
        La:
            return
        Lb:
            java.lang.String r0 = r6.LJLJJI
            if (r0 != 0) goto L10
            goto La
        L10:
            java.lang.String r1 = r6.LJLJJLL
            java.lang.String r0 = "2"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L2f
            X.Ol8 r0 = X.C52902KpW.LIZ
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "<get-value>(...)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "1"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L39
        L2f:
            T extends android.view.View r2 = r6.mView
            X.SIs r2 = (X.C71874SIs) r2
            if (r2 == 0) goto L39
            X.Xun r0 = r2.LJLIL
            if (r0 != 0) goto L67
        L39:
            T extends android.view.View r0 = r6.mView
            android.content.Context r1 = r0.getContext()
            java.lang.String r0 = "view.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            android.app.Activity r1 = X.C45804HyK.LJIJJ(r1)
            boolean r0 = r1 instanceof androidx.lifecycle.LifecycleOwner
            if (r0 == 0) goto L64
            androidx.lifecycle.LifecycleOwner r1 = (androidx.lifecycle.LifecycleOwner) r1
            androidx.lifecycle.LifecycleCoroutineScope r4 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r1)
        L52:
            X.UtN r0 = X.C36636EZk.LIZ
            X.UtN r3 = r0.LJJIJIL()
            X.SIj r2 = new X.SIj
            r1 = 0
            r2.<init>(r6, r5, r1)
            r0 = 2
            X.XKX.LIZLLL(r4, r3, r1, r2, r0)
            goto La
        L64:
            X.34l r4 = X.C780334l.LJLIL
            goto L52
        L67:
            X.CkC r1 = r2.LJLJI
            if (r1 == 0) goto L39
            X.SIv r0 = r2.LJLILLLLZI
            if (r0 == 0) goto L39
            r0.LIZIZ(r1)
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercelive.business.player.live.ECLynxLiveView.LJJIFFI():void");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        EnumC71876SIu enumC71876SIu;
        C71875SIt c71875SIt = this.LJLLLL;
        if (c71875SIt != null) {
            ((C71874SIs) this.mView).LIZ(c71875SIt);
        }
        C71874SIs c71874SIs = (C71874SIs) this.mView;
        String str = null;
        if (c71874SIs.LJLIL != null) {
            if (!o.LJ(c71874SIs.LJLJJL, c71874SIs.LJLJJLL) && C00F.LIZ(31744, 0, "tt_mall_live_multiplex_opt", true) == 1) {
                InterfaceC86353Xun interfaceC86353Xun = c71874SIs.LJLIL;
                if (interfaceC86353Xun != null) {
                    interfaceC86353Xun.LLZZLLIL();
                } else {
                    o.LJIJI("livePlayHelper");
                    throw null;
                }
            }
            if (!c71874SIs.LJLJJI) {
                InterfaceC86353Xun interfaceC86353Xun2 = c71874SIs.LJLIL;
                if (interfaceC86353Xun2 != null) {
                    interfaceC86353Xun2.destroy();
                } else {
                    o.LJIJI("livePlayHelper");
                    throw null;
                }
            }
        }
        String str2 = this.LJLJJI;
        if (str2 == null) {
            str2 = "";
        }
        if (this.LJLLILLLL > 0) {
            str = String.valueOf(SystemClock.elapsedRealtime() - this.LJLLILLLL);
        }
        C48313Ixh.LIZ(Boolean.valueOf(this.LJLL), "rd_ec_media_card_destroy", str2, str);
        if (this.LJLLILLLL > 0 && this.LJLLI) {
            if (ActivityStack.isAppBackGround()) {
                enumC71876SIu = EnumC71876SIu.LIVE_CARD_DESTROY;
            } else {
                enumC71876SIu = EnumC71876SIu.LIVE_CARD_DETACH;
            }
            LJJI(CardStruct.IStatusCode.DEFAULT, String.valueOf(SystemClock.elapsedRealtime() - this.LJLLILLLL), C113554cx.LJJLIIIIJ(new OSZ("code", Integer.valueOf(enumC71876SIu.getCode())), new OSZ("msg", enumC71876SIu.getMsg())));
        }
        super.destroy();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        super.onPropsUpdated();
        if (this.LJLJLJ && !this.LJLL) {
            LJJIFFI();
        }
        if (this.LJLLJ) {
            this.LJLLJ = false;
            String str = this.LJLJJI;
            if (str == null) {
                str = "";
            }
            C48313Ixh.LIZIZ(this.LJLJLJ ? 1 : 0, str);
        }
    }

    public ECLynxLiveView(VNU vnu) {
        super(vnu);
        this.LJLLILLLL = -1L;
    }

    public final void LJIJJLI(boolean z) {
        if (z) {
            C62846OlW c62846OlW = this.LJLIL;
            if (c62846OlW == null) {
                return;
            }
            c62846OlW.setVisibility(8);
            return;
        }
        C62846OlW c62846OlW2 = this.LJLIL;
        if (c62846OlW2 != null) {
            C78765Uvh.LJIIIZ(c62846OlW2, this.LJLJI, c62846OlW2.getWidth(), c62846OlW2.getHeight());
            String str = this.LJLJI;
            if (str == null || str.length() == 0 || this.LJLL) {
                c62846OlW2.setVisibility(8);
            } else {
                c62846OlW2.setVisibility(0);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void afterPropsUpdated(VPA vpa) {
        super.afterPropsUpdated(vpa);
        if (vpa != null) {
            if (vpa.LJIIIIZZ("qualities")) {
                if (this.mView.isAttachedToWindow()) {
                    ((C71874SIs) this.mView).LIZIZ(this.LJLJL, new C71867SIl(this));
                }
                if (vpa == null) {
                    return;
                }
            }
            if (vpa.LJIIIIZZ("poster")) {
                LJIJJLI(false);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final C71874SIs createView(Context context) {
        C71873SIr c71873SIr;
        InterfaceC71877SIv interfaceC71877SIv;
        InterfaceC86353Xun LIZ;
        o.LJIIIZ(context, "context");
        this.LJLLLL = new C71875SIt(this);
        C62846OlW c62846OlW = new C62846OlW(context);
        c62846OlW.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        c62846OlW.setVisibility(8);
        this.LJLIL = c62846OlW;
        C71874SIs c71874SIs = new C71874SIs(context);
        C71875SIt c71875SIt = this.LJLLLL;
        o.LJI(c71875SIt);
        if (c71874SIs.LJLIL == null) {
            IEcommerceLiveService LJFF = ECommerceLiveServiceImpl.LJFF();
            if (LJFF != null) {
                c71873SIr = LJFF.LIZ();
            } else {
                c71873SIr = null;
            }
            c71874SIs.LJLILLLLZI = c71873SIr;
            c71874SIs.LJLJI = c71875SIt;
            if (!ECommerceMallService.v3().m3() || (interfaceC71877SIv = c71874SIs.LJLILLLLZI) == null || (LIZ = interfaceC71877SIv.LIZ()) == null) {
                C32186CkA LJJJJZI = LiveOuterService.LJJJLL().LJJJJZI(c71875SIt, EnumC72797Shd.NORMAL);
                o.LJIIIIZZ(LJJJJZI, "get().getService(ILiveOu…ayHelper.PageType.NORMAL)");
                c71874SIs.LJLIL = LJJJJZI;
                c71874SIs.LJLJJI = false;
            } else {
                c71874SIs.LJLIL = LIZ;
                c71874SIs.LJLJJI = true;
            }
            if (c71874SIs.LJLJJI) {
                InterfaceC86353Xun interfaceC86353Xun = c71874SIs.LJLIL;
                if (interfaceC86353Xun != null) {
                    interfaceC86353Xun.LLZZLLIL();
                } else {
                    o.LJIJI("livePlayHelper");
                    throw null;
                }
            }
            InterfaceC71877SIv interfaceC71877SIv2 = c71874SIs.LJLILLLLZI;
            if (interfaceC71877SIv2 != null) {
                interfaceC71877SIv2.LIZIZ(c71875SIt);
            }
            InterfaceC86353Xun interfaceC86353Xun2 = c71874SIs.LJLIL;
            if (interfaceC86353Xun2 != null) {
                interfaceC86353Xun2.e(new C78948Uye());
            } else {
                o.LJIJI("livePlayHelper");
                throw null;
            }
        }
        c71874SIs.addView(this.LJLIL);
        C48313Ixh.LIZ(null, "rd_ec_media_card_create", "", null);
        return c71874SIs;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        o.LJIIIZ(v, "v");
        if (this.LJLILLLLZI != null) {
            LJIJJLI(false);
            LJJIFFI();
        }
        String str = this.LJLJJI;
        if (str == null) {
            str = "";
        }
        C48313Ixh.LIZ(null, "rd_ec_media_card_attach", str, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        String str;
        o.LJIIIZ(v, "v");
        C71875SIt c71875SIt = this.LJLLLL;
        if (c71875SIt != null) {
            ((C71874SIs) this.mView).LIZ(c71875SIt);
        }
        String str2 = this.LJLJJI;
        if (str2 == null) {
            str2 = "";
        }
        if (this.LJLLILLLL > 0) {
            str = String.valueOf(SystemClock.elapsedRealtime() - this.LJLLILLLL);
        } else {
            str = null;
        }
        C48313Ixh.LIZ(Boolean.valueOf(this.LJLL), "rd_ec_media_card_detach", str2, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (android.text.TextUtils.equals((java.lang.String) r1, "1") != false) goto L12;
     */
    @X.EWS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void pause(com.lynx.react.bridge.ReadableMap r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L11
            java.lang.String r0 = "uuid"
            java.lang.String r1 = r4.getString(r0)
        L8:
            java.lang.String r0 = r3.LJLJJL
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L13
            return
        L11:
            r1 = 0
            goto L8
        L13:
            java.lang.String r1 = r3.LJLJJLL
            java.lang.String r0 = "2"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L32
            X.Ol8 r0 = X.C52902KpW.LIZ
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "<get-value>(...)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "1"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L49
        L32:
            T extends android.view.View r2 = r3.mView
            X.SIs r2 = (X.C71874SIs) r2
            if (r2 == 0) goto L49
            boolean r0 = r2.LJLJJI
            if (r0 == 0) goto L49
            X.SIv r1 = r2.LJLILLLLZI
            if (r1 == 0) goto L49
            X.CkC r0 = r2.LJLJI
            boolean r0 = r1.LIZJ(r0)
            if (r0 != 0) goto L49
            return
        L49:
            r3.LJIL()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercelive.business.player.live.ECLynxLiveView.pause(com.lynx.react.bridge.ReadableMap):void");
    }

    @EWS
    public final void play(ReadableMap readableMap) {
        LJJIFFI();
        LJIJJLI(false);
        this.LJLLL = false;
        String str = this.LJLJJI;
        if (str == null) {
            str = "";
        }
        C48313Ixh.LIZIZ(this.LJLJLJ ? 1 : 0, str);
    }

    @VPD(name = "autoplay")
    public final void setAutoPlay(Boolean bool) {
        boolean z;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        if (z != this.LJLJLJ) {
            this.LJLJLJ = z;
            this.LJLLJ = true;
            this.LJLLL = false;
        }
    }

    @VPD(name = "mute")
    public final void setMute(Boolean bool) {
        boolean z = false;
        if (o.LJ(bool, Boolean.TRUE)) {
            ((C71874SIs) this.mView).setMute(true);
        } else {
            ((C71874SIs) this.mView).setMute(false);
        }
        if (bool != null) {
            z = bool.booleanValue();
        }
        this.LJLJLLL = z;
    }

    @VPD(name = "objectfit")
    public final void setObjectfit(String str) {
        if (str == null || ujb.o.LJJJJJL(str)) {
            return;
        }
        if (o.LJ(str, "cover")) {
            B4L textureView = ((C71874SIs) this.mView).getTextureView();
            if (textureView != null) {
                textureView.setScaleType(2);
            }
            C62846OlW c62846OlW = this.LJLIL;
            if (c62846OlW != null) {
                c62846OlW.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            LJIJJLI(false);
            return;
        }
        if (!o.LJ(str, "contain")) {
            return;
        }
        B4L textureView2 = ((C71874SIs) this.mView).getTextureView();
        if (textureView2 != null) {
            textureView2.setScaleType(1);
        }
        C62846OlW c62846OlW2 = this.LJLIL;
        if (c62846OlW2 != null) {
            c62846OlW2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        LJIJJLI(false);
    }

    @VPD(name = "optimizetype")
    public final void setOptimizeType(String str) {
        this.LJLJJLL = str;
    }

    @VPD(name = "poster")
    public final void setPoster(String str) {
        if (str == null || ujb.o.LJJJJJL(str)) {
            return;
        }
        this.LJLJI = str;
    }

    @VPD(name = "qualities")
    public final void setQualities(String str) {
        if (str == null || ujb.o.LJJJJJL(str)) {
            return;
        }
        this.LJLJL = str;
    }

    @VPD(name = "roomid")
    public final void setRoomId(String str) {
        this.LJLJJI = str;
    }

    @VPD(name = "streamurl")
    public final void setStreamURL(String str) {
        if (str == null || ujb.o.LJJJJJL(str)) {
            return;
        }
        if (C78685UuP.LJJJZ(this.LJLILLLLZI) && !TextUtils.equals(this.LJLILLLLZI, str)) {
            LJIL();
        }
        this.LJLILLLLZI = str;
    }

    @VPD(name = "uuid")
    public final void setUuId(String str) {
        this.LJLJJL = str;
    }

    @EWS
    public final void stop(ReadableMap readableMap) {
        String str;
        InterfaceC86353Xun interfaceC86353Xun = ((C71874SIs) this.mView).LJLIL;
        if (interfaceC86353Xun != null) {
            interfaceC86353Xun.LLZZLLIL();
        }
        this.LJLL = false;
        LJIJJLI(false);
        if (this.LJLLILLLL > 0 && this.LJLLI) {
            String valueOf = String.valueOf(SystemClock.elapsedRealtime() - this.LJLLILLLL);
            EnumC71876SIu enumC71876SIu = EnumC71876SIu.LIVE_CARD_STOP;
            LJJI(CardStruct.IStatusCode.DEFAULT, valueOf, C113554cx.LJJLIIIIJ(new OSZ("code", Integer.valueOf(enumC71876SIu.getCode())), new OSZ("msg", enumC71876SIu.getMsg())));
        }
        String str2 = this.LJLJJI;
        if (str2 == null) {
            str2 = "";
        }
        if (this.LJLLILLLL > 0) {
            str = String.valueOf(SystemClock.elapsedRealtime() - this.LJLLILLLL);
        } else {
            str = null;
        }
        C48313Ixh.LIZ(Boolean.valueOf(this.LJLL), "rd_ec_media_card_stop", str2, str);
    }

    public final void LJJ(String str, Map<String, ? extends Object> map) {
        VNL vnl;
        if (map == null) {
            map = new LinkedHashMap<>();
        }
        Map LJJLIL = C113554cx.LJJLIL(map);
        String str2 = this.LJLJJL;
        if (str2 == null) {
            str2 = "";
        }
        LJJLIL.put("uuid", str2);
        C49615Jdb c49615Jdb = new C49615Jdb(getSign(), str, LJJLIL);
        VNU vnu = this.mContext;
        if (vnu != null && (vnl = vnu.LJLJJL) != null) {
            vnl.LIZIZ(c49615Jdb);
        }
    }

    public final void LJJI(String str, String loadDuration, Map<String, Object> map) {
        String str2;
        if (!this.LJLLL) {
            this.LJLLL = true;
            Object obj = map.get("code");
            String str3 = "";
            if (obj == null || (str2 = obj.toString()) == null) {
                str2 = "";
            }
            String str4 = this.LJLJJI;
            if (str4 != null) {
                str3 = str4;
            }
            o.LJIIIZ(loadDuration, "loadDuration");
            C48313Ixh.LIZJ("rd_ec_media_load", C113554cx.LJJL(new OSZ("page_name", "mall"), new OSZ("media_type", "live"), new OSZ("load_duration", loadDuration), new OSZ("is_success", str), new OSZ("error_code", str2), new OSZ("rd_page_type", "native"), new OSZ("item_id", str3)));
            if (!o.LJ(map.get("code"), Integer.valueOf(EnumC71876SIu.SUCCESS.getCode()))) {
                LJJ("error", map);
            }
        }
    }
}
