package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.AnonymousClass391;
import X.C16880lQ;
import X.C175276uJ;
import X.C176996x5;
import X.C177336xd;
import X.C177546xy;
import X.C178166yy;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C26338AVi;
import X.C2K0;
import X.C55096Ljo;
import X.C55247LmF;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71Y;
import X.C74Z;
import X.C77321UWf;
import X.C78926UyI;
import X.C88463da;
import X.C8YN;
import X.C9BE;
import X.EnumC1796673i;
import X.InterfaceC55102Lju;
import X.InterfaceC55251LmJ;
import X.TBT;
import X.X1D;
import Y.ACListenerS23S0100000_3;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.ss.android.ugc.aweme.utils.Au2S14S0100000_3;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class KeyboardIconGroupAssem extends UIContentAssem implements IKeyboardIconGroupAssemAbility, InterfaceC55102Lju {
    public final C214298b3 LJLIL;
    public TuxIconView LJLILLLLZI;
    public TuxIconView LJLJI;
    public TuxIconView LJLJJI;
    public TuxIconView LJLJJL;
    public TuxIconView LJLJJLL;
    public final IVideoGiftService LJLJL;
    public final C62822Ol8 LJLJLJ;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != 541901228) {
            return null;
        }
        return this;
    }

    public KeyboardIconGroupAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(KeyboardVMV2.class);
        this.LJLIL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 113), C177546xy.INSTANCE, null);
        this.LJLJL = VideoGiftService.LJI();
        this.LJLJLJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 112));
    }

    public final KeyboardVMV2 A3() {
        return (KeyboardVMV2) this.LJLIL.getValue();
    }

    public final void E3() {
        Aweme aweme;
        C71Y.LIZLLL("KeyboardIconGroupAssem", "setupImageIcon");
        C177336xd x3 = x3();
        if (x3 != null) {
            aweme = x3.LJLLI;
        } else {
            aweme = null;
        }
        boolean LIZLLL = C77321UWf.LIZLLL(aweme, false);
        KeyboardVMV2 A3 = A3();
        A3.getClass();
        A3.setState(new AqS8S0010000_3(LIZLLL, 25));
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardIconGroupAssemAbility
    public final void VB() {
        Aweme aweme;
        String str;
        C71Y.LIZLLL("KeyboardIconGroupAssem", "resetIconGroup");
        C3();
        E3();
        C177336xd x3 = x3();
        if (x3 != null) {
            aweme = x3.LJLLI;
        } else {
            aweme = null;
        }
        if (C77321UWf.LIZLLL(aweme, false)) {
            C177336xd x32 = x3();
            if (x32 == null || (str = x32.LJLJJLL) == null) {
                str = "";
            }
            C74Z.LJJIIJ(str);
        }
    }

    public final void C3() {
        Aweme aweme;
        Aweme aweme2;
        MutableLiveData<GiftStruct> jv0;
        C177336xd x3 = x3();
        KeyboardVMV2 A3 = A3();
        IVideoGiftService iVideoGiftService = this.LJLJL;
        if (x3 != null) {
            aweme = x3.LJLLI;
        } else {
            aweme = null;
        }
        A3.jv0(iVideoGiftService.LIZ(aweme));
        IVideoGiftService iVideoGiftService2 = this.LJLJL;
        if (x3 != null) {
            aweme2 = x3.LJLLI;
        } else {
            aweme2 = null;
        }
        if (iVideoGiftService2.LIZ(aweme2) && v3()) {
            return;
        }
        A3().jv0(false);
        GiftViewModel giftViewModel = (GiftViewModel) this.LJLJLJ.getValue();
        if (giftViewModel == null || (jv0 = giftViewModel.jv0()) == null) {
            return;
        }
        jv0.setValue(null);
    }

    public final C176996x5 L1() {
        IRefactorKeyboardFragment LIZ = C178166yy.LIZ(C55096Ljo.LJIIZILJ(this));
        if (LIZ != null) {
            return LIZ.EJ();
        }
        return null;
    }

    public final boolean v3() {
        Integer valueOf;
        C176996x5 L1 = L1();
        if (L1 != null && (valueOf = Integer.valueOf(L1.LJLJJI.getCommentInputViewType())) != null && (valueOf.intValue() == 1 || valueOf.intValue() == 2)) {
            return true;
        }
        return false;
    }

    public final C177336xd x3() {
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(C55096Ljo.LJIIZILJ(this), C177336xd.class, "source_default_key");
        if (LIZLLL != null) {
            return (C177336xd) LIZLLL.getSource();
        }
        return null;
    }

    public final void F3(boolean z) {
        int i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateEmojiIconView  ");
        LIZ.append(z);
        C71Y.LIZLLL("KeyboardIconGroupAssem", X1D.LIZIZ(LIZ));
        TuxIconView tuxIconView = this.LJLJI;
        if (tuxIconView != null) {
            if (!z) {
                i = R.raw.icon_keyboard_circle;
            } else {
                i = R.raw.icon_emoji;
            }
            tuxIconView.setIconRes(i);
            return;
        }
        o.LJIJI("ivEmoji");
        throw null;
    }

    public final void H3(boolean z) {
        if (z) {
            TuxIconView tuxIconView = this.LJLJJL;
            if (tuxIconView != null) {
                tuxIconView.LIZ();
                TuxIconView tuxIconView2 = this.LJLJJL;
                if (tuxIconView2 != null) {
                    tuxIconView2.setIconRes(R.raw.icon_color_gift);
                    return;
                } else {
                    o.LJIJI("ivGift");
                    throw null;
                }
            }
            o.LJIJI("ivGift");
            throw null;
        }
        if (v3()) {
            TuxIconView tuxIconView3 = this.LJLJJL;
            if (tuxIconView3 != null) {
                tuxIconView3.setIconRes(R.raw.icon_gift);
                TuxIconView tuxIconView4 = this.LJLJJL;
                if (tuxIconView4 != null) {
                    tuxIconView4.setTintColorRes(R.attr.go);
                    TuxIconView tuxIconView5 = this.LJLJJL;
                    if (tuxIconView5 != null) {
                        tuxIconView5.setAlpha(1.0f);
                        return;
                    } else {
                        o.LJIJI("ivGift");
                        throw null;
                    }
                }
                o.LJIJI("ivGift");
                throw null;
            }
            o.LJIJI("ivGift");
            throw null;
        }
        A3().jv0(false);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C55096Ljo.LIZJ(this);
        View findViewById = view.findViewById(R.id.fci);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.iv_video)");
        this.LJLILLLLZI = (TuxIconView) findViewById;
        View findViewById2 = view.findViewById(R.id.f2i);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.iv_emoji)");
        this.LJLJI = (TuxIconView) findViewById2;
        View findViewById3 = view.findViewById(R.id.ey8);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.iv_at)");
        this.LJLJJI = (TuxIconView) findViewById3;
        View findViewById4 = view.findViewById(R.id.f3r);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.iv_gift)");
        this.LJLJJL = (TuxIconView) findViewById4;
        View findViewById5 = view.findViewById(R.id.f59);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.iv_image)");
        this.LJLJJLL = (TuxIconView) findViewById5;
        TuxIconView tuxIconView = this.LJLILLLLZI;
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS23S0100000_3(this, 22));
            TuxIconView tuxIconView2 = this.LJLJI;
            if (tuxIconView2 != null) {
                C16880lQ.LJIIJ(new Au2S14S0100000_3(this, 0), tuxIconView2);
                TuxIconView tuxIconView3 = this.LJLJJL;
                if (tuxIconView3 != null) {
                    C16880lQ.LJIIJ(new Au2S14S0100000_3(this, 1), tuxIconView3);
                    TuxIconView tuxIconView4 = this.LJLJJI;
                    if (tuxIconView4 != null) {
                        C16880lQ.LJIIJ(new Au2S14S0100000_3(this, 2), tuxIconView4);
                        if (C175276uJ.LIZJ()) {
                            TuxIconView tuxIconView5 = this.LJLJJLL;
                            if (tuxIconView5 != null) {
                                C16880lQ.LJJJ(tuxIconView5, new ACListenerS23S0100000_3(this, 23));
                            } else {
                                o.LJIJI("ivImage");
                                throw null;
                            }
                        }
                        TuxIconView tuxIconView6 = this.LJLILLLLZI;
                        if (tuxIconView6 != null) {
                            C26338AVi.LJI(tuxIconView6, AnonymousClass391.LIZJ(6), null, null, null, false, 30);
                            TuxIconView tuxIconView7 = this.LJLJI;
                            if (tuxIconView7 != null) {
                                C26338AVi.LJI(tuxIconView7, AnonymousClass391.LIZJ(6), null, null, null, false, 30);
                                TuxIconView tuxIconView8 = this.LJLJJI;
                                if (tuxIconView8 != null) {
                                    C26338AVi.LJI(tuxIconView8, AnonymousClass391.LIZJ(6), null, null, null, false, 30);
                                    TuxIconView tuxIconView9 = this.LJLJJL;
                                    if (tuxIconView9 != null) {
                                        C26338AVi.LJI(tuxIconView9, AnonymousClass391.LIZJ(6), null, null, null, false, 30);
                                        TuxIconView tuxIconView10 = this.LJLJJLL;
                                        if (tuxIconView10 != null) {
                                            C26338AVi.LJI(tuxIconView10, AnonymousClass391.LIZJ(6), null, null, null, false, 30);
                                            C8YN.LJII(this, A3(), new TBT() { // from class: X.6y1
                                                @Override // X.TBT, X.TBZ, X.TBW
                                                public final Object get(Object obj) {
                                                    return Boolean.valueOf(((C177616y5) obj).LLIFFJFJJ);
                                                }
                                            }, null, new AqS185S0100000_3(this, 147), 6);
                                            C8YN.LJII(this, A3(), new TBT() { // from class: X.6y2
                                                @Override // X.TBT, X.TBZ, X.TBW
                                                public final Object get(Object obj) {
                                                    return Boolean.valueOf(((C177616y5) obj).LLIIIILZ);
                                                }
                                            }, null, new AqS185S0100000_3(this, 148), 6);
                                            C8YN.LJII(this, A3(), new TBT() { // from class: X.6y3
                                                @Override // X.TBT, X.TBZ, X.TBW
                                                public final Object get(Object obj) {
                                                    return Boolean.valueOf(((C177616y5) obj).LLII);
                                                }
                                            }, null, new AqS185S0100000_3(this, 149), 6);
                                            C8YN.LJII(this, A3(), new TBT() { // from class: X.6y4
                                                @Override // X.TBT, X.TBZ, X.TBW
                                                public final Object get(Object obj) {
                                                    return Boolean.valueOf(((C177616y5) obj).LLIIII);
                                                }
                                            }, null, new AqS185S0100000_3(this, 150), 6);
                                            C8YN.LJII(this, A3(), new TBT() { // from class: X.6y6
                                                @Override // X.TBT, X.TBZ, X.TBW
                                                public final Object get(Object obj) {
                                                    return Boolean.valueOf(((C177616y5) obj).LLIIIJ);
                                                }
                                            }, null, new AqS185S0100000_3(this, 142), 6);
                                            C8YN.LJII(this, A3(), new TBT() { // from class: X.6y0
                                                @Override // X.TBT, X.TBZ, X.TBW
                                                public final Object get(Object obj) {
                                                    return Boolean.valueOf(((C177616y5) obj).LLIIIL);
                                                }
                                            }, null, new AqS185S0100000_3(this, 143), 6);
                                            C8YN.LJII(this, A3(), new TBT() { // from class: X.6xt
                                                @Override // X.TBT, X.TBZ, X.TBW
                                                public final Object get(Object obj) {
                                                    return ((C177616y5) obj).LJLJLLL;
                                                }
                                            }, null, new AqS185S0100000_3(this, 144), 6);
                                            C8YN.LJII(this, A3(), new TBT() { // from class: X.6xz
                                                @Override // X.TBT, X.TBZ, X.TBW
                                                public final Object get(Object obj) {
                                                    return ((C177616y5) obj).LJLJJI;
                                                }
                                            }, null, new AqS185S0100000_3(this, 145), 6);
                                            C8YN.LJII(this, A3(), new TBT() { // from class: X.6xx
                                                @Override // X.TBT, X.TBZ, X.TBW
                                                public final Object get(Object obj) {
                                                    return Boolean.valueOf(((C177616y5) obj).LLD);
                                                }
                                            }, C213688a4.LIZLLL(), new AqS185S0100000_3(this, 146), 4);
                                            C88463da c88463da = C88463da.LIZ;
                                            TuxIconView tuxIconView11 = this.LJLILLLLZI;
                                            if (tuxIconView11 != null) {
                                                EnumC1796673i enumC1796673i = EnumC1796673i.BUTTON;
                                                C88463da.LIZJ(c88463da, tuxIconView11, enumC1796673i, 0.0f, 12);
                                                TuxIconView tuxIconView12 = this.LJLJJI;
                                                if (tuxIconView12 != null) {
                                                    C88463da.LIZJ(c88463da, tuxIconView12, EnumC1796673i.ALPHA_BUTTON, 0.0f, 12);
                                                    TuxIconView tuxIconView13 = this.LJLJI;
                                                    if (tuxIconView13 != null) {
                                                        C88463da.LIZIZ(tuxIconView13, enumC1796673i, 0.0f, null);
                                                        TuxIconView tuxIconView14 = this.LJLJJL;
                                                        if (tuxIconView14 != null) {
                                                            C88463da.LIZIZ(tuxIconView14, enumC1796673i, 0.0f, null);
                                                            TuxIconView tuxIconView15 = this.LJLJJLL;
                                                            if (tuxIconView15 != null) {
                                                                C88463da.LIZIZ(tuxIconView15, enumC1796673i, 0.0f, null);
                                                                E3();
                                                                return;
                                                            } else {
                                                                o.LJIJI("ivImage");
                                                                throw null;
                                                            }
                                                        }
                                                        o.LJIJI("ivGift");
                                                        throw null;
                                                    }
                                                    o.LJIJI("ivEmoji");
                                                    throw null;
                                                }
                                                o.LJIJI("ivAt");
                                                throw null;
                                            }
                                            o.LJIJI("ivVideo");
                                            throw null;
                                        }
                                        o.LJIJI("ivImage");
                                        throw null;
                                    }
                                    o.LJIJI("ivGift");
                                    throw null;
                                }
                                o.LJIJI("ivAt");
                                throw null;
                            }
                            o.LJIJI("ivEmoji");
                            throw null;
                        }
                        o.LJIJI("ivVideo");
                        throw null;
                    }
                    o.LJIJI("ivAt");
                    throw null;
                }
                o.LJIJI("ivGift");
                throw null;
            }
            o.LJIJI("ivEmoji");
            throw null;
        }
        o.LJIJI("ivVideo");
        throw null;
    }
}
