package com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab;

import X.AbstractC225698tR;
import X.ActivityC45651qj;
import X.C00F;
import X.C188727au;
import X.C224498rV;
import X.C2QU;
import X.C32151Nz;
import X.C35183DrP;
import X.C36093EEn;
import X.C38995FSd;
import X.C45804HyK;
import X.C47261Igj;
import X.C54113LLp;
import X.C54117LLt;
import X.C55096Ljo;
import X.C55230Lly;
import X.C62846OlW;
import X.C7MY;
import X.C81705W4v;
import X.C84763XOl;
import X.C88099Yhr;
import X.C9XU;
import X.DQG;
import X.E6C;
import X.EGE;
import X.EnumC72807Shn;
import X.FMX;
import X.G27;
import X.InterfaceC55058LjC;
import X.InterfaceC81252Vui;
import X.InterfaceC82683Wch;
import X.J7H;
import X.JBR;
import X.LCZ;
import X.LFQ;
import X.LH4;
import X.LLR;
import X.LLY;
import X.LNH;
import X.LU8;
import X.LUA;
import X.LUD;
import X.LUE;
import X.LUF;
import X.LUG;
import X.QD3;
import X.S3I;
import X.S3L;
import X.W4R;
import X.W5F;
import X.W5I;
import X.W5U;
import X.X1D;
import Y.ARunnableS10S1100000_9;
import Y.ARunnableS28S0200000_9;
import Y.ARunnableS45S0100000_9;
import Y.IDCListenerS116S0200000_9;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.ScaleAnimation;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.homepage.ui.inflate.X2CFragmentMainPageIcon;
import com.ss.android.ugc.aweme.main.IMainPageFragment;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.publish.service.PublishConfigExternalService;
import com.ss.android.ugc.aweme.service.protection.TooltipProtectionSetting;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.ss.android.ugc.aweme.services.specialplus.ISpecialPlusService;
import com.ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PublishBottomTabViewFactory extends C54117LLt implements LLY, PublishTabAbility, G27 {
    public C54113LLp LJLILLLLZI;
    public LUF LJLJI;
    public boolean LJLJJI;
    public LUE LJLJJL;
    public LUG LJLJJLL;
    public InterfaceC82683Wch LJLJL;

    @Override // X.LLY
    public final void s0(AbstractC225698tR tabStyle, boolean z) {
        o.LJIIIZ(tabStyle, "tabStyle");
    }

    @Override // X.LLY
    public final void x9(AbstractC225698tR tabStyle, boolean z) {
        o.LJIIIZ(tabStyle, "tabStyle");
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab.PublishTabAbility
    public final boolean MZ() {
        LUF luf = this.LJLJI;
        if (luf == null || luf.LJ != 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab.PublishTabAbility
    public final void OR() {
        InterfaceC82683Wch interfaceC82683Wch = this.LJLJL;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
        }
    }

    @Override // X.LLY
    public final void Vj() {
        LUF luf = this.LJLJI;
        if (luf != null) {
            LLR llr = LLR.LIZJ;
            luf.LJIIIZ = llr.LJIIL();
            if (C00F.LIZ(31744, 0, "plus_button_add_text", true) > 0) {
                luf.LJIIIIZZ = llr.LJIILIIL();
            }
            View view = luf.LJIIIZ;
            if (view != null) {
                view.post(new ARunnableS45S0100000_9(luf, 240));
            }
        }
        LUG lug = this.LJLJJLL;
        if (lug != null) {
            View LJIIL = LLR.LIZJ.LJIIL();
            lug.LIZJ = LJIIL;
            if (LJIIL != null) {
                LJIIL.post(new ARunnableS45S0100000_9(lug, 236));
            }
        }
        this.LJLJJI = true;
        LUE lue = this.LJLJJL;
        if (lue != null) {
            LIZIZ(lue.LIZ, lue.LIZJ, lue.LIZIZ, lue.LIZLLL);
            this.LJLJJL = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab.PublishTabAbility
    public final boolean XE() {
        LUF luf = this.LJLJI;
        if (luf == null || !luf.LIZLLL()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab.PublishTabAbility
    public final void Xt0() {
        if (this.LJLILLLLZI != null) {
            float width = r0.getWidth() / 2.0f;
            if (this.LJLILLLLZI != null) {
                ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.2f, 1.0f, 1.2f, width, r0.getHeight() / 2.0f);
                scaleAnimation.setDuration(100L);
                C54113LLp c54113LLp = this.LJLILLLLZI;
                if (c54113LLp != null) {
                    c54113LLp.startAnimation(scaleAnimation);
                    return;
                } else {
                    o.LJIJI("tabView");
                    throw null;
                }
            }
            o.LJIJI("tabView");
            throw null;
        }
        o.LJIJI("tabView");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab.PublishTabAbility
    public final void ew() {
        LLR.LIZJ.LJJIJIL();
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab.PublishTabAbility
    public final void nM() {
        LLR.LIZJ.LJIL();
    }

    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab.PublishTabAbility
    public final String getResourceType() {
        return AVExternalServiceImpl.LIZ().specialPlusService().getResourceType();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
    
        if (r6 != null) goto L13;
     */
    @Override // com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab.PublishTabAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ey(com.ss.android.ugc.aweme.feed.model.Aweme r6) {
        /*
            r5 = this;
            X.LUG r2 = r5.LJLJJLL
            if (r2 == 0) goto L3a
            r4 = 0
            if (r6 == 0) goto L7d
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = X.LUG.LIZ(r6)
            if (r0 == 0) goto L7d
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getThumbnail()
            if (r0 == 0) goto L7d
            java.util.List r0 = r0.getUrlList()
            if (r0 == 0) goto L7d
            java.lang.Object r3 = X.ORZ.LJLLLL(r0)
            java.lang.String r3 = (java.lang.String) r3
        L1f:
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r0 = X.LUG.LIZ(r6)
            if (r0 == 0) goto L29
            java.lang.String r4 = r0.getId()
        L29:
            java.lang.String r0 = r2.LJFF
            boolean r1 = kotlin.jvm.internal.o.LJ(r0, r4)
            r2.LJFF = r4
            r2.LJI = r6
            if (r6 == 0) goto L37
            if (r3 != 0) goto L3b
        L37:
            r2.LIZLLL()
        L3a:
            return
        L3b:
            boolean r0 = r2.LJ
            if (r0 != 0) goto L60
            com.bytedance.lighten.loader.SmartImageView r1 = r2.LIZIZ
            r0 = 1
            if (r1 != 0) goto L5c
        L44:
            r2.LJ = r0
            X.W5F r1 = X.W5U.LJIIIIZZ(r3)
            com.bytedance.lighten.loader.SmartImageView r0 = r2.LIZIZ
            r1.LJJIIJ = r0
            java.lang.String r0 = "FEPXYH_Transformer"
            r1.LIZIZ(r0)
            X.LUB r0 = new X.LUB
            r0.<init>(r2)
            r1.LIZLLL(r0)
            goto L3a
        L5c:
            r1.setClickable(r0)
            goto L44
        L60:
            if (r1 != 0) goto L3a
            r2.LJ()
            com.bytedance.lighten.loader.SmartImageView r0 = r2.LIZIZ
            android.animation.ObjectAnimator r1 = X.LUG.LIZIZ(r0)
            r2.LIZLLL = r1
            X.LUC r0 = new X.LUC
            r0.<init>(r3, r2)
            r1.addListener(r0)
            android.animation.Animator r0 = r2.LIZLLL
            if (r0 == 0) goto L3a
            r0.start()
            goto L3a
        L7d:
            r3 = r4
            if (r6 == 0) goto L29
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.publishtab.PublishBottomTabViewFactory.ey(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @QD3
    public final void onScrollToProfileEvent(C224498rV c224498rV) {
        if (c224498rV == null) {
            return;
        }
        OR();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @QD3
    public final void onSuperEntranceEvent(SuperEntranceEvent superEntranceEvent) {
        boolean z;
        boolean z2;
        LUF luf;
        boolean z3;
        boolean z4;
        String str;
        if (superEntranceEvent == null) {
            return;
        }
        C54113LLp c54113LLp = this.LJLILLLLZI;
        if (c54113LLp != null) {
            Context context = c54113LLp.getContext();
            if (context == 0) {
                return;
            }
            ISpecialPlusService specialPlusService = AVExternalServiceImpl.LIZ().specialPlusService();
            if (superEntranceEvent.getShow()) {
                if (superEntranceEvent.getType() == 3) {
                    LUF luf2 = this.LJLJI;
                    if (luf2 != null && luf2.LJ != 1) {
                        ISpecialPlusService specialPlusService2 = AVExternalServiceImpl.LIZ().specialPlusService();
                        if (specialPlusService2.isQuickPromoPlusEnabled() && specialPlusService2.getQuickPromoPlusDebutTime() == 0) {
                            specialPlusService2.setQuickPromoPlusDebutTime(System.currentTimeMillis() / 1000);
                        }
                        if (!o.LJ(getResourceType(), "template")) {
                            String specialPlusTips = specialPlusService.getSpecialPlusTips();
                            if (!TextUtils.isEmpty(specialPlusTips) && !luf2.LIZLLL()) {
                                LUF luf3 = this.LJLJI;
                                if (luf3 == null || !luf3.LIZLLL()) {
                                    C54113LLp c54113LLp2 = this.LJLILLLLZI;
                                    if (c54113LLp2 != null) {
                                        c54113LLp2.post(new ARunnableS10S1100000_9(this, specialPlusTips, 5000L, 6));
                                    } else {
                                        o.LJIJI("tabView");
                                        throw null;
                                    }
                                }
                                IMainPageFragment LJI = MainPageFragmentImpl.LJI();
                                if (LJI != null) {
                                    LJI.LIZLLL();
                                }
                            }
                        }
                        if (!luf2.LIZLLL()) {
                            boolean LIZIZ = MSAdaptionService.LJIIL().LIZIZ(context);
                            InterfaceC55058LjC interfaceC55058LjC = (InterfaceC55058LjC) context;
                            String str2 = "homepage_nearby";
                            if (!o.LJ(interfaceC55058LjC.getEnterFrom(), "homepage_nearby")) {
                                if (LIZIZ) {
                                    str2 = "homepage_hot";
                                } else {
                                    str2 = interfaceC55058LjC.getEnterFrom();
                                }
                            }
                            if (specialPlusService.isQuickPromoPlusEnabled() && specialPlusService.getQuickPromoPlusDebutTime() == 0) {
                                specialPlusService.setQuickPromoPlusDebutTime(System.currentTimeMillis() / 1000);
                            }
                            C188727au c188727au = new C188727au();
                            c188727au.LJIIIZ("enter_from", str2);
                            c188727au.LJIIIZ("prop_id", specialPlusService.getEffectId());
                            c188727au.LJIIIZ("template_id", specialPlusService.getEffectId());
                            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                            o.LJII(LJIIIIZZ, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                            if (LNH.LIZIZ((ActivityC45651qj) LJIIIIZZ) != null) {
                                Activity LJIIIIZZ2 = C84763XOl.LJIIIIZZ();
                                o.LJII(LJIIIIZZ2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                                Aweme LIZIZ2 = LNH.LIZIZ((ActivityC45651qj) LJIIIIZZ2);
                                if (LIZIZ2 != null) {
                                    str = LIZIZ2.getGroupId();
                                } else {
                                    str = null;
                                }
                                c188727au.LJI("group_id", str);
                            }
                            FMX.LJIIL("special_icon_show", c188727au.LIZ);
                        }
                        LIZIZ(3, null, false, true);
                        specialPlusService.setSpecialPlusState(true);
                        specialPlusService.setSpecialPlusShowed();
                    }
                } else if (superEntranceEvent.getType() == 4) {
                    if (TooltipProtectionSetting.INSTANCE.isKillSwitchDisabled()) {
                        C54113LLp c54113LLp3 = this.LJLILLLLZI;
                        if (c54113LLp3 != null) {
                            LU8 lu8 = new LU8(new E6C(new WeakReference(c54113LLp3), new WeakReference(this.LJLJI)), new WeakReference(context));
                            if (lu8.shouldShow()) {
                                lu8.LIZ(LUA.LJLIL);
                            }
                        } else {
                            o.LJIJI("tabView");
                            throw null;
                        }
                    } else {
                        if (!PublishConfigExternalService.LIZ().shouldShowParallelGuideTooltip()) {
                            return;
                        }
                        LUF luf4 = this.LJLJI;
                        if (luf4 != null && luf4.LIZLLL()) {
                            return;
                        }
                        LUF luf5 = this.LJLJI;
                        if (luf5 != null && luf5.LJ == 1) {
                            return;
                        }
                        C54113LLp c54113LLp4 = this.LJLILLLLZI;
                        if (c54113LLp4 != null) {
                            c54113LLp4.post(new ARunnableS28S0200000_9(this, context, 77));
                            PublishConfigExternalService.LIZ().updateParallelGuideTooltipShown();
                        } else {
                            o.LJIJI("tabView");
                            throw null;
                        }
                    }
                } else if (superEntranceEvent.getType() == 5) {
                    LUF luf6 = this.LJLJI;
                    if (luf6 != null && luf6.LIZLLL()) {
                        return;
                    }
                    LUF luf7 = this.LJLJI;
                    if (luf7 != null && luf7.LJ == 1) {
                        return;
                    }
                    specialPlusService.setSpecialPlusState(true);
                    LIZIZ(5, superEntranceEvent.getIconUrl(), false, true);
                }
            } else {
                LUF luf8 = this.LJLJI;
                if (luf8 != null && luf8.LJ == 3 && superEntranceEvent.getType() == 0) {
                    LUF luf9 = this.LJLJI;
                    if (luf9 != null) {
                        luf9.LJI();
                    }
                    specialPlusService.setSpecialPlusState(false);
                    LUF luf10 = this.LJLJI;
                    if (luf10 != null) {
                        luf10.LIZ(false);
                    }
                    LUF luf11 = this.LJLJI;
                    if (luf11 != null) {
                        luf11.LJ = 0;
                    }
                } else {
                    LUF luf12 = this.LJLJI;
                    if (luf12 != null && luf12.LIZLLL()) {
                        z = true;
                        if (superEntranceEvent.getType() == 1) {
                            z2 = true;
                            luf = this.LJLJI;
                            if (luf == null && luf.LJ == 1 && superEntranceEvent.getType() == 3) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z && superEntranceEvent.getType() == 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (!z2 || z3 || z4) {
                                return;
                            }
                            LUF luf13 = this.LJLJI;
                            if (luf13 != null) {
                                luf13.LJI();
                            }
                            specialPlusService.setSpecialPlusState(false);
                            LUF luf14 = this.LJLJI;
                            if (luf14 != null) {
                                luf14.LIZ(false);
                            }
                            LUF luf15 = this.LJLJI;
                            if (luf15 != null) {
                                luf15.LJ = 0;
                            }
                        }
                    } else {
                        z = false;
                    }
                    z2 = false;
                    luf = this.LJLJI;
                    if (luf == null) {
                    }
                    z3 = false;
                    if (z) {
                    }
                    z4 = false;
                    if (!z2) {
                        return;
                    } else {
                        return;
                    }
                }
            }
            if (superEntranceEvent.getType() == 5) {
                if (superEntranceEvent.getShow()) {
                    String effectId = superEntranceEvent.getEffectId();
                    if (effectId != null) {
                        specialPlusService.setEffectVideoPlusEffectId(effectId);
                    }
                    specialPlusService.setEffectVideoPlusShowed(true);
                    superEntranceEvent.getEffectId();
                    String tab = superEntranceEvent.getTab();
                    if (tab != null) {
                        specialPlusService.setEffectVideoPlusTab(tab);
                        return;
                    }
                    return;
                }
                return;
            }
            specialPlusService.setEffectVideoPlusShowed(false);
            return;
        }
        o.LJIJI("tabView");
        throw null;
    }

    @Override // X.C54117LLt
    public final View LIZ(LCZ lcz, LH4 iconData) {
        LUF luf;
        boolean z;
        ActivityC45651qj LJJIFFI;
        o.LJIIIZ(iconData, "iconData");
        View LIZ = super.LIZ(lcz, iconData);
        o.LJII(LIZ, "null cannot be cast to non-null type com.ss.android.ugc.aweme.homepage.ui.view.tab.bottom.MaterialIconTab");
        C54113LLp c54113LLp = (C54113LLp) LIZ;
        this.LJLILLLLZI = c54113LLp;
        Context context = iconData.LIZ;
        if (((Boolean) C35183DrP.LJ.getValue()).booleanValue()) {
            C36093EEn c36093EEn = C36093EEn.LIZ;
            X2CFragmentMainPageIcon x2CFragmentMainPageIcon = new X2CFragmentMainPageIcon();
            c36093EEn.getClass();
            X2CFragmentMainPageIcon x2CFragmentMainPageIcon2 = (X2CFragmentMainPageIcon) C36093EEn.LJFF(x2CFragmentMainPageIcon);
            luf = x2CFragmentMainPageIcon2.LJLILLLLZI;
            if (luf == null) {
                C54113LLp c54113LLp2 = this.LJLILLLLZI;
                if (c54113LLp2 != null) {
                    luf = new LUF(context, c54113LLp2);
                } else {
                    o.LJIJI("tabView");
                    throw null;
                }
            } else {
                x2CFragmentMainPageIcon2.LJLILLLLZI = null;
            }
        } else {
            C54113LLp c54113LLp3 = this.LJLILLLLZI;
            if (c54113LLp3 != null) {
                luf = new LUF(context, c54113LLp3);
            } else {
                o.LJIJI("tabView");
                throw null;
            }
        }
        this.LJLJI = luf;
        C54113LLp c54113LLp4 = this.LJLILLLLZI;
        if (c54113LLp4 != null) {
            this.LJLJJLL = new LUG(c54113LLp4);
            ActivityC45651qj LJJIFFI2 = C45804HyK.LJJIFFI(context);
            if (LJJIFFI2 != null) {
                C54113LLp c54113LLp5 = this.LJLILLLLZI;
                if (c54113LLp5 != null) {
                    if (c54113LLp5.isAttachedToWindow()) {
                        C55096Ljo.LJIIJJI(C55230Lly.LIZLLL(LJJIFFI2, null), this, PublishTabAbility.class, null);
                    }
                    C54113LLp c54113LLp6 = this.LJLILLLLZI;
                    if (c54113LLp6 != null) {
                        c54113LLp6.addOnAttachStateChangeListener(new IDCListenerS116S0200000_9(LJJIFFI2, this, 4));
                        IAVSettingsService avsettingsConfig = AVExternalServiceImpl.LIZ().configService().avsettingsConfig();
                        if (System.currentTimeMillis() - EGE.LIZIZ.LIZ() >= 259200000) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if ((avsettingsConfig.enableOpenAlbumForAll() || (avsettingsConfig.enableOpenAlbumExcludeNewUser() && z)) && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
                            C54113LLp c54113LLp7 = this.LJLILLLLZI;
                            if (c54113LLp7 != null) {
                                c54113LLp7.setHapticFeedbackEnabled(false);
                                C54113LLp c54113LLp8 = this.LJLILLLLZI;
                                if (c54113LLp8 != null) {
                                    c54113LLp8.setOnLongClickListener(HomePageUIFrameServiceImpl.LIZ().getPublishLongClickListener(LJJIFFI));
                                } else {
                                    o.LJIJI("tabView");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("tabView");
                                throw null;
                            }
                        }
                        if (((Boolean) C88099Yhr.LJ.getValue()).booleanValue()) {
                            C38995FSd.LIZJ().execute(new ARunnableS45S0100000_9(this, 234));
                        } else if (AVExternalServiceImpl.LIZ().specialPlusService().isNeedShowSpecialPlusDirect()) {
                            C2QU.LIZ(new ARunnableS45S0100000_9(this, 235), DQG.LIZJ());
                        }
                        LFQ.LIZIZ(this);
                        ActivityC45651qj LJJIFFI3 = C45804HyK.LJJIFFI(context);
                        if (LJJIFFI3 != null) {
                            C9XU.LIZ(LJJIFFI3.hashCode(), this);
                        }
                        return c54113LLp;
                    }
                    o.LJIJI("tabView");
                    throw null;
                }
                o.LJIJI("tabView");
                throw null;
            }
            "activity is null".toString();
            throw new IllegalArgumentException("activity is null");
        }
        o.LJIJI("tabView");
        throw null;
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
        InterfaceC82683Wch interfaceC82683Wch = this.LJLJL;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
        }
    }

    public final void LIZIZ(int i, String str, boolean z, boolean z2) {
        InterfaceC81252Vui interfaceC81252Vui;
        if (!this.LJLJJI) {
            this.LJLJJL = new LUE(i, z, str, z2);
            return;
        }
        LUF luf = this.LJLJI;
        int i2 = 2;
        if (luf != null) {
            C45804HyK.LJIIL("showTabSuperEntrance", "showTabSuperEntrance");
            int i3 = luf.LJ;
            if (i3 != 1 && i3 != 2) {
                luf.LJFF = i;
                if (i != 1) {
                    if (i != 3) {
                        if (i == 5) {
                            int LIZIZ = C7MY.LIZIZ(50);
                            EnumC72807Shn enumC72807Shn = EnumC72807Shn.CENTER;
                            W5F LJII = W5U.LJII(new ImageUrlModel("", C47261Igj.LJJIJ(str)));
                            LJII.LJIILIIL(J7H.LIZ(302));
                            LJII.LJJIIJZLJL = luf.LIZLLL;
                            LJII.LJIJJ = enumC72807Shn;
                            S3I s3i = new S3I();
                            s3i.LIZ = true;
                            s3i.LIZLLL = C32151Nz.LJIIZILJ(25);
                            LJII.LJIJJLI = new S3L(s3i);
                            LJII.LJII = LIZIZ;
                            LJII.LJIIIIZZ = LIZIZ;
                            LJII.LIZLLL(new LUD(luf));
                            luf.LJFF(z2);
                        }
                    } else {
                        ISpecialPlusService specialPlusService = AVExternalServiceImpl.LIZ().specialPlusService();
                        String resourceType = specialPlusService.getResourceType();
                        String iconType = specialPlusService.getIconType();
                        if (o.LJ(resourceType, "template")) {
                            if (iconType != null && ujb.o.LJJJJ(iconType, ".webp", false)) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append(luf.LIZIZ);
                                String LJFF = JBR.LJFF(LIZ, File.separator, "special_plus_icon.webp", LIZ);
                                C81705W4v LIZJ = W5I.LIZJ();
                                LIZJ.LJIIJ = true;
                                C62846OlW c62846OlW = luf.LIZLLL;
                                if (c62846OlW != null) {
                                    interfaceC81252Vui = c62846OlW.getController();
                                } else {
                                    interfaceC81252Vui = null;
                                }
                                LIZJ.LJIIL = interfaceC81252Vui;
                                LIZJ.LJI(Uri.fromFile(new File(LJFF)));
                                W4R LIZ2 = LIZJ.LIZ();
                                C62846OlW c62846OlW2 = luf.LIZLLL;
                                if (c62846OlW2 != null) {
                                    c62846OlW2.setController(LIZ2);
                                }
                            } else {
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append(luf.LIZIZ);
                                String LJFF2 = JBR.LJFF(LIZ3, File.separator, "special_plus_icon.png", LIZ3);
                                C62846OlW c62846OlW3 = luf.LIZLLL;
                                if (c62846OlW3 != null) {
                                    c62846OlW3.setImageURI(Uri.fromFile(new File(LJFF2)));
                                }
                            }
                            luf.LJFF(z2);
                        } else {
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append(luf.LIZIZ);
                            String LJFF3 = JBR.LJFF(LIZ4, File.separator, "special_plus_icon.png", LIZ4);
                            C62846OlW c62846OlW4 = luf.LIZLLL;
                            if (c62846OlW4 != null) {
                                c62846OlW4.setImageURI(Uri.fromFile(new File(LJFF3)));
                            }
                            View view = luf.LJIIIIZZ;
                            if (view != null) {
                                view.setVisibility(4);
                            }
                            C62846OlW c62846OlW5 = luf.LIZLLL;
                            if (c62846OlW5 != null) {
                                c62846OlW5.setVisibility(0);
                            }
                            luf.LJ(z, z2);
                        }
                    }
                } else {
                    C62846OlW c62846OlW6 = luf.LIZLLL;
                    if (c62846OlW6 != null) {
                        c62846OlW6.setImageURI(Uri.fromFile(new File(luf.LIZJ)));
                    }
                    C62846OlW c62846OlW7 = luf.LIZLLL;
                    if (c62846OlW7 != null) {
                        c62846OlW7.setVisibility(0);
                    }
                    luf.LJ(z, z2);
                }
            }
        }
        LUF luf2 = this.LJLJI;
        if (luf2 != null) {
            int i4 = luf2.LJFF;
            if (i4 != 1) {
                if (i4 != 3) {
                    if (i4 != 5) {
                        i2 = 0;
                    } else {
                        i2 = 3;
                    }
                }
            } else {
                i2 = 1;
            }
            luf2.LJ = i2;
        }
    }
}
