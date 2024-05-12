package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.als.EditCaptionFontViewModel;
import com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;
import com.ss.android.ugc.aweme.views.IDlS62S0100000_2;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;
import o3.IDaS466S0100000_2;
import o3.h0;

/* renamed from: X.68z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC1556568z extends WM7 implements View.OnClickListener, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIFFJFJJ;
    public final C82622Wbi LJLIL;
    public final InterfaceC139695e1 LJLILLLLZI;
    public View LJLJI;
    public TuxIconView LJLJJI;
    public TuxIconView LJLJJL;
    public C1554968j LJLJJLL;
    public C1556068u LJLJL;
    public C252709vu LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public String LJLLJ;
    public IDlS62S0100000_2 LJLLL;
    public final ArrayList<TextStickerData> LJLLLL;
    public TextStickerData LJLLLLLL;
    public String LJLZ;
    public boolean LJZ;
    public final C62822Ol8 LJZI;
    public final C82632Wbs LJZL;
    public InterfaceC45540Hu4 LL;
    public final AnonymousClass691 LLD;
    public String LLF;
    public String LLFF;
    public String LLFFF;
    public String LLFII;
    public String LLFZ;
    public String LLI;

    static {
        TBT tbt = new TBT(ViewOnClickListenerC1556568z.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        C65352Pkq.LIZ.getClass();
        LLIFFJFJJ = new InterfaceC74236TBo[]{tbt};
    }

    public final EditCaptionFontViewModel LLJILJIL() {
        return (EditCaptionFontViewModel) this.LJZI.getValue();
    }

    public final String LLJILJILJ() {
        int i = this.LJLLI;
        if (i != 1) {
            if (i != 3) {
                return getString(R.string.a_3);
            }
            return getString(R.string.a_7);
        }
        return getString(R.string.a_5);
    }

    public final void LLJJ() {
        int i = this.LJLLI;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                TuxIconView tuxIconView = this.LJLJJL;
                if (tuxIconView != null) {
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZ = R.raw.icon_lines_right_aligned;
                    c2068389v.LJ = Integer.valueOf(R.attr.dj);
                    tuxIconView.setTuxIcon(c2068389v);
                    return;
                }
                o.LJIJI("mAlignIcon");
                throw null;
            }
            TuxIconView tuxIconView2 = this.LJLJJL;
            if (tuxIconView2 != null) {
                C2068389v c2068389v2 = new C2068389v();
                c2068389v2.LIZ = R.raw.icon_lines_center_aligned;
                c2068389v2.LJ = Integer.valueOf(R.attr.dj);
                tuxIconView2.setTuxIcon(c2068389v2);
                return;
            }
            o.LJIJI("mAlignIcon");
            throw null;
        }
        TuxIconView tuxIconView3 = this.LJLJJL;
        if (tuxIconView3 != null) {
            C2068389v c2068389v3 = new C2068389v();
            c2068389v3.LIZ = R.raw.icon_lines_left_aligned;
            c2068389v3.LJ = Integer.valueOf(R.attr.dj);
            tuxIconView3.setTuxIcon(c2068389v3);
            return;
        }
        o.LJIJI("mAlignIcon");
        throw null;
    }

    public final void LLJJIII() {
        int i = this.LJLJLLL;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    TuxIconView tuxIconView = this.LJLJJI;
                    if (tuxIconView != null) {
                        C2068389v c2068389v = new C2068389v();
                        c2068389v.LIZ = R.raw.icon_text_outline;
                        c2068389v.LJ = Integer.valueOf(R.attr.dj);
                        tuxIconView.setTuxIcon(c2068389v);
                        return;
                    }
                    o.LJIJI("mBgModeIcon");
                    throw null;
                }
                TuxIconView tuxIconView2 = this.LJLJJI;
                if (tuxIconView2 != null) {
                    C2068389v c2068389v2 = new C2068389v();
                    c2068389v2.LIZ = R.raw.icon_color_text_transparent;
                    tuxIconView2.setTuxIcon(c2068389v2);
                    return;
                }
                o.LJIJI("mBgModeIcon");
                throw null;
            }
            TuxIconView tuxIconView3 = this.LJLJJI;
            if (tuxIconView3 != null) {
                C2068389v c2068389v3 = new C2068389v();
                c2068389v3.LIZ = R.raw.icon_text_background;
                c2068389v3.LJ = Integer.valueOf(R.attr.dj);
                tuxIconView3.setTuxIcon(c2068389v3);
                return;
            }
            o.LJIJI("mBgModeIcon");
            throw null;
        }
        TuxIconView tuxIconView4 = this.LJLJJI;
        if (tuxIconView4 != null) {
            C2068389v c2068389v4 = new C2068389v();
            c2068389v4.LIZ = R.raw.icon_text_stroke;
            c2068389v4.LJ = Integer.valueOf(R.attr.dj);
            tuxIconView4.setTuxIcon(c2068389v4);
            return;
        }
        o.LJIJI("mBgModeIcon");
        throw null;
    }

    @Override // X.WM7
    public final void onPause() {
        super.onPause();
        InterfaceC45540Hu4 interfaceC45540Hu4 = this.LL;
        if (interfaceC45540Hu4 != null) {
            interfaceC45540Hu4.unRegisterActivityOnKeyDownListener(this.LLD);
        } else {
            o.LJIJI("mListenableActivityRegistry");
            throw null;
        }
    }

    @Override // X.WM7
    public final void onResume() {
        String str;
        super.onResume();
        WM7 wm7 = this.mParentScene;
        if (wm7 instanceof EditCaptionScene) {
            this.LJLLLL.clear();
            Iterator it = C78841Uwv.LJJJJI(((EditCaptionScene) wm7).LLIIIJ).iterator();
            while (it.hasNext()) {
                this.LJLLLL.add(((TextStickerData) it.next()).m110clone());
            }
        }
        this.LJLLLLLL = (TextStickerData) getScope().LIZ("currentCaption");
        this.LJLZ = (String) getScope().LIZ("currentLanguageCode");
        InterfaceC45540Hu4 interfaceC45540Hu4 = this.LL;
        if (interfaceC45540Hu4 != null) {
            interfaceC45540Hu4.registerActivityOnKeyDownListener(this.LLD);
            if (this.LJZ) {
                return;
            }
            C1554968j c1554968j = this.LJLJJLL;
            if (c1554968j != null) {
                c1554968j.LIZIZ(C68M.LJIIJ().LJIIIZ());
                C68M.LJIIJ().LJ = new InterfaceC1549866k() { // from class: X.696
                    @Override // X.InterfaceC1549866k
                    public final void accept(Object obj) {
                        C2VQ.LIZIZ(new AqS149S0200000_2(ViewOnClickListenerC1556568z.this, (ViewOnClickListenerC1556568z) obj, (List<TextFontStyleData>) 89), 0L);
                    }
                };
                TextStickerData textStickerData = this.LJLLLLLL;
                if (textStickerData != null) {
                    int[] iArr = C1556068u.LJLLILLLL;
                    if (!ORY.LJJIJ(textStickerData.getColor(), iArr)) {
                        C1556068u c1556068u = this.LJLJL;
                        if (c1556068u != null) {
                            c1556068u.LIZ(textStickerData.getColor());
                        } else {
                            o.LJIJI("mSelectColorLayout");
                            throw null;
                        }
                    } else {
                        C1556068u c1556068u2 = this.LJLJL;
                        if (c1556068u2 != null) {
                            c1556068u2.LIZJ(ORY.LJJZ(iArr));
                        } else {
                            o.LJIJI("mSelectColorLayout");
                            throw null;
                        }
                    }
                }
                TextStickerData textStickerData2 = this.LJLLLLLL;
                if (textStickerData2 != null) {
                    this.LJLJLLL = textStickerData2.getBgMode();
                    this.LJLLI = textStickerData2.getAlign();
                    this.LJLLILLLL = textStickerData2.getColor();
                    LLJJIII();
                    LLJJ();
                    C1556068u c1556068u3 = this.LJLJL;
                    if (c1556068u3 != null) {
                        c1556068u3.setDefault(this.LJLLILLLL);
                        C68M.LJIIJ().LJIJJLI(1, textStickerData2.getFontType());
                        C1554968j c1554968j2 = this.LJLJJLL;
                        if (c1554968j2 != null) {
                            c1554968j2.LIZJ();
                            LLJJI(C68M.LJIIJ().LJFF(1));
                        } else {
                            o.LJIJI("mSelectFontLayout");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mSelectColorLayout");
                        throw null;
                    }
                }
                this.LJZ = true;
                this.LLF = getString(R.string.a__);
                this.LLFF = getString(R.string.a_4);
                this.LLFFF = getString(R.string.a_6);
                this.LLFII = getString(R.string.a_2);
                this.LLFZ = getString(R.string.a_8);
                this.LLI = getString(R.string.a_9);
                getString(R.string.a_5);
                getString(R.string.a_7);
                getString(R.string.a_3);
                TuxIconView tuxIconView = this.LJLJJI;
                if (tuxIconView != null) {
                    h0.LJIJI(tuxIconView, new IDaS466S0100000_2(this, 0));
                    TuxIconView tuxIconView2 = this.LJLJJL;
                    if (tuxIconView2 != null) {
                        h0.LJIJI(tuxIconView2, new IDaS466S0100000_2(this, 1));
                        TuxIconView tuxIconView3 = this.LJLJJI;
                        if (tuxIconView3 != null) {
                            int i = this.LJLJLLL;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 4) {
                                        str = this.LLFZ;
                                    } else {
                                        str = this.LLFFF;
                                    }
                                } else {
                                    str = this.LLFII;
                                }
                            } else {
                                str = this.LLFF;
                            }
                            h0.LJJII(tuxIconView3, str);
                            TuxIconView tuxIconView4 = this.LJLJJL;
                            if (tuxIconView4 != null) {
                                h0.LJJII(tuxIconView4, LLJILJILJ());
                                return;
                            } else {
                                o.LJIJI("mAlignIcon");
                                throw null;
                            }
                        }
                        o.LJIJI("mBgModeIcon");
                        throw null;
                    }
                    o.LJIJI("mAlignIcon");
                    throw null;
                }
                o.LJIJI("mBgModeIcon");
                throw null;
            }
            o.LJIJI("mSelectFontLayout");
            throw null;
        }
        o.LJIJI("mListenableActivityRegistry");
        throw null;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public final void LLJJI(TextFontStyleData textFontStyleData) {
        if (textFontStyleData == null) {
            return;
        }
        if (!textFontStyleData.LIZ()) {
            if (this.LJLL == -1 || this.LJLJLLL != 1) {
                this.LJLL = this.LJLJLLL;
                this.LJLJLLL = 1;
            }
            TuxIconView tuxIconView = this.LJLJJI;
            if (tuxIconView != null) {
                tuxIconView.setAlpha(0.34f);
                TuxIconView tuxIconView2 = this.LJLJJI;
                if (tuxIconView2 != null) {
                    tuxIconView2.setClickable(false);
                    TuxIconView tuxIconView3 = this.LJLJJI;
                    if (tuxIconView3 != null) {
                        tuxIconView3.setTag(Boolean.FALSE);
                        return;
                    } else {
                        o.LJIJI("mBgModeIcon");
                        throw null;
                    }
                }
                o.LJIJI("mBgModeIcon");
                throw null;
            }
            o.LJIJI("mBgModeIcon");
            throw null;
        }
        int i = this.LJLL;
        if (i != -1) {
            this.LJLJLLL = i;
        }
        TuxIconView tuxIconView4 = this.LJLJJI;
        if (tuxIconView4 != null) {
            tuxIconView4.setAlpha(1.0f);
            TuxIconView tuxIconView5 = this.LJLJJI;
            if (tuxIconView5 != null) {
                tuxIconView5.setClickable(true);
                TuxIconView tuxIconView6 = this.LJLJJI;
                if (tuxIconView6 != null) {
                    tuxIconView6.setTag(Boolean.TRUE);
                    return;
                } else {
                    o.LJIJI("mBgModeIcon");
                    throw null;
                }
            }
            o.LJIJI("mBgModeIcon");
            throw null;
        }
        o.LJIJI("mBgModeIcon");
        throw null;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        View view;
        super.onActivityCreated(bundle);
        this.mView.bringToFront();
        Object parent = this.mView.getParent();
        if ((parent instanceof View) && (view = (View) parent) != null) {
            view.bringToFront();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r0 != 4) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0063, code lost:
    
        if (r0 != 2) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r11) {
        /*
            r10 = this;
            com.bytedance.tux.icon.TuxIconView r0 = r10.LJLJJI
            r9 = 0
            java.lang.String r8 = "mBgModeIcon"
            if (r0 == 0) goto Lb6
            boolean r0 = kotlin.jvm.internal.o.LJ(r11, r0)
            r7 = 2
            r6 = 1
            r5 = 0
            java.lang.String r4 = "caption"
            r1 = 3
            if (r0 == 0) goto L68
            X.634 r0 = X.AnonymousClass699.LIZIZ()
            X.631 r0 = r0.LIZIZ
            boolean r0 = r0.LJLIL
            r3 = 4
            if (r0 == 0) goto L5f
            int r0 = r10.LJLJLLL
            if (r0 == r6) goto L5d
            if (r0 == r7) goto L27
            if (r0 == r3) goto L66
        L26:
            r1 = 1
        L27:
            r10.LJLJLLL = r1
            r10.LLJJIII()
            int r0 = r10.LJLJLLL
            r10.LJLL = r0
            com.ss.android.ugc.aweme.shortvideo.inlinecaption.als.EditCaptionFontViewModel r1 = r10.LLJILJIL()
            int r0 = r10.LJLJLLL
            r1.v2(r0)
            X.5e1 r2 = r10.LJLILLLLZI
            int r1 = r10.LJLJLLL
            java.lang.String r0 = r10.LJLZ
            r2.LJIIIIZZ(r1, r5, r4, r0)
            com.bytedance.tux.icon.TuxIconView r1 = r10.LJLJJI
            if (r1 == 0) goto Laa
            int r0 = r10.LJLJLLL
            if (r0 == r6) goto L5a
            if (r0 == r7) goto L57
            if (r0 == r3) goto L54
            java.lang.String r0 = r10.LLFZ
        L50:
            o3.h0.LJJII(r1, r0)
        L53:
            return
        L54:
            java.lang.String r0 = r10.LLFFF
            goto L50
        L57:
            java.lang.String r0 = r10.LLFII
            goto L50
        L5a:
            java.lang.String r0 = r10.LLFF
            goto L50
        L5d:
            r1 = 4
            goto L27
        L5f:
            int r0 = r10.LJLJLLL
            if (r0 == r6) goto L66
            if (r0 == r7) goto L27
            goto L26
        L66:
            r1 = 2
            goto L27
        L68:
            com.bytedance.tux.icon.TuxIconView r0 = r10.LJLJJL
            java.lang.String r3 = "mAlignIcon"
            if (r0 == 0) goto Lb2
            boolean r0 = kotlin.jvm.internal.o.LJ(r11, r0)
            if (r0 == 0) goto L53
            int r0 = r10.LJLLI
            if (r0 == r6) goto La7
            if (r0 == r7) goto La4
            if (r0 == r1) goto La1
        L7c:
            r10.LLJJ()
            com.ss.android.ugc.aweme.shortvideo.inlinecaption.als.EditCaptionFontViewModel r1 = r10.LLJILJIL()
            int r0 = r10.LJLLI
            r1.u8(r0)
            X.5e1 r2 = r10.LJLILLLLZI
            int r0 = r10.LJLLI
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r10.LJLZ
            r2.LJFF(r5, r1, r4, r0)
            com.bytedance.tux.icon.TuxIconView r1 = r10.LJLJJL
            if (r1 == 0) goto Lae
            java.lang.String r0 = r10.LLJILJILJ()
            o3.h0.LJJII(r1, r0)
            goto L53
        La1:
            r10.LJLLI = r7
            goto L7c
        La4:
            r10.LJLLI = r6
            goto L7c
        La7:
            r10.LJLLI = r1
            goto L7c
        Laa:
            kotlin.jvm.internal.o.LJIJI(r8)
            throw r9
        Lae:
            kotlin.jvm.internal.o.LJIJI(r3)
            throw r9
        Lb2:
            kotlin.jvm.internal.o.LJIJI(r3)
            throw r9
        Lb6:
            kotlin.jvm.internal.o.LJIJI(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC1556568z.onClick(android.view.View):void");
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.691] */
    public ViewOnClickListenerC1556568z(C82622Wbi diContainer, InterfaceC139695e1 mobListener) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(mobListener, "mobListener");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = mobListener;
        this.LJLJLLL = 1;
        this.LJLL = -1;
        this.LJLLI = 2;
        this.LJLLILLLL = -1;
        this.LJLLJ = "default";
        this.LJLLLL = new ArrayList<>();
        this.LJZI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 804));
        this.LJZL = UCI.LJI(diContainer, AbstractC42651GoZ.class, null);
        this.LLD = new C5HC() { // from class: X.691
            @Override // X.C5HC
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                if (i != 4) {
                    return false;
                }
                ViewOnClickListenerC1556568z viewOnClickListenerC1556568z = ViewOnClickListenerC1556568z.this;
                viewOnClickListenerC1556568z.LJLILLLLZI.LIZLLL(0, viewOnClickListenerC1556568z.LJLZ);
                viewOnClickListenerC1556568z.LLJILJIL().HG(viewOnClickListenerC1556568z.LJLLLL);
                viewOnClickListenerC1556568z.LLJILJIL().hide();
                return true;
            }
        };
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        View view2 = this.LJLJI;
        if (view2 != null) {
            View findViewById = view2.findViewById(R.id.faq);
            o.LJIIIIZZ(findViewById, "mRootView.findViewById(R.id.iv_stroke)");
            this.LJLJJI = (TuxIconView) findViewById;
            View view3 = this.LJLJI;
            if (view3 != null) {
                View findViewById2 = view3.findViewById(R.id.exk);
                o.LJIIIIZZ(findViewById2, "mRootView.findViewById(R.id.iv_align_txt)");
                this.LJLJJL = (TuxIconView) findViewById2;
                View view4 = this.LJLJI;
                if (view4 != null) {
                    View findViewById3 = view4.findViewById(R.id.bi_);
                    o.LJIIIIZZ(findViewById3, "mRootView.findViewById(R.id.color_layout)");
                    this.LJLJL = (C1556068u) findViewById3;
                    View view5 = this.LJLJI;
                    if (view5 != null) {
                        View findViewById4 = view5.findViewById(R.id.dln);
                        o.LJIIIIZZ(findViewById4, "mRootView.findViewById(id.font_layout)");
                        ViewGroup viewGroup = (ViewGroup) findViewById4;
                        C1554968j LIZ = C1554968j.LIZ(1, getSceneContext());
                        this.LJLJJLL = LIZ;
                        LIZ.LIZIZ(C68M.LJIIJ().LJIIIZ());
                        C1554968j c1554968j = this.LJLJJLL;
                        if (c1554968j != null) {
                            viewGroup.addView(c1554968j);
                            View view6 = this.LJLJI;
                            if (view6 != null) {
                                View findViewById5 = view6.findViewById(R.id.agl);
                                o.LJIIIIZZ(findViewById5, "mRootView.findViewById(R.id.bar)");
                                C252709vu c252709vu = (C252709vu) findViewById5;
                                this.LJLJLJ = c252709vu;
                                c252709vu.setNavBackground(255);
                                C252709vu c252709vu2 = this.LJLJLJ;
                                if (c252709vu2 != null) {
                                    C235119Kp c235119Kp = new C235119Kp();
                                    AbstractC234519Ih[] abstractC234519IhArr = new AbstractC234519Ih[1];
                                    C234509Ig c234509Ig = new C234509Ig();
                                    Activity activity = this.mActivity;
                                    if (activity == null || (str = activity.getString(R.string.fm7)) == null) {
                                        str = "Cancel";
                                    }
                                    c234509Ig.LIZJ = str;
                                    c234509Ig.LJ = true;
                                    c234509Ig.LIZ(EnumC252729vw.SECONDARY);
                                    c234509Ig.LIZ = new C109824Ss(new AqS152S0100000_2(this, 805));
                                    abstractC234519IhArr[0] = c234509Ig;
                                    c235119Kp.LIZLLL(abstractC234519IhArr);
                                    AbstractC234519Ih[] abstractC234519IhArr2 = new AbstractC234519Ih[1];
                                    C234509Ig c234509Ig2 = new C234509Ig();
                                    Activity activity2 = this.mActivity;
                                    if (activity2 == null || (str2 = activity2.getString(R.string.fnl)) == null) {
                                        str2 = "Save";
                                    }
                                    c234509Ig2.LIZJ = str2;
                                    c234509Ig2.LJ = true;
                                    c234509Ig2.LIZ(EnumC252729vw.PRIMARY);
                                    c234509Ig2.LIZ = new C109824Ss(new AqS152S0100000_2(this, 806));
                                    abstractC234519IhArr2[0] = c234509Ig2;
                                    c235119Kp.LIZIZ(abstractC234519IhArr2);
                                    c252709vu2.setNavActions(c235119Kp);
                                    IDlS62S0100000_2 iDlS62S0100000_2 = new IDlS62S0100000_2(this, (AbstractC156316Bn<Object>) 48);
                                    this.LJLLL = iDlS62S0100000_2;
                                    TuxIconView tuxIconView = this.LJLJJI;
                                    if (tuxIconView != null) {
                                        C16880lQ.LJJJ(tuxIconView, iDlS62S0100000_2);
                                        TuxIconView tuxIconView2 = this.LJLJJL;
                                        if (tuxIconView2 != null) {
                                            IDlS62S0100000_2 iDlS62S0100000_22 = this.LJLLL;
                                            if (iDlS62S0100000_22 != null) {
                                                C16880lQ.LJJJ(tuxIconView2, iDlS62S0100000_22);
                                                C1556068u c1556068u = this.LJLJL;
                                                if (c1556068u != null) {
                                                    c1556068u.setColorChangeListener(new InterfaceC1556368x() { // from class: X.693
                                                        @Override // X.InterfaceC1556368x
                                                        public final void LIZ(int i) {
                                                            ViewOnClickListenerC1556568z viewOnClickListenerC1556568z = ViewOnClickListenerC1556568z.this;
                                                            if (viewOnClickListenerC1556568z.LJLLILLLL == i) {
                                                                return;
                                                            }
                                                            viewOnClickListenerC1556568z.LJLLILLLL = i;
                                                            viewOnClickListenerC1556568z.LLJILJIL().D0(i);
                                                            ViewOnClickListenerC1556568z viewOnClickListenerC1556568z2 = ViewOnClickListenerC1556568z.this;
                                                            viewOnClickListenerC1556568z2.LJLILLLLZI.LJ(i, 0, "caption", viewOnClickListenerC1556568z2.LJLZ, false);
                                                        }
                                                    });
                                                    C1554968j c1554968j2 = this.LJLJJLL;
                                                    if (c1554968j2 != null) {
                                                        c1554968j2.setClickFontStyleListener(new InterfaceC1555668q() { // from class: X.690
                                                            @Override // X.InterfaceC1555668q
                                                            public final void LIZ(TextFontStyleData textFontStyleData) {
                                                                if (textFontStyleData == null) {
                                                                    return;
                                                                }
                                                                ViewOnClickListenerC1556568z.this.LLJJI(textFontStyleData);
                                                                C68M LJIIJ = C68M.LJIIJ();
                                                                String str3 = textFontStyleData.fileName;
                                                                ViewOnClickListenerC1556568z.this.getClass();
                                                                LJIIJ.LJIJJLI(1, str3);
                                                                ViewOnClickListenerC1556568z viewOnClickListenerC1556568z = ViewOnClickListenerC1556568z.this;
                                                                String str4 = textFontStyleData.fileName;
                                                                o.LJIIIIZZ(str4, "type.fileName");
                                                                viewOnClickListenerC1556568z.getClass();
                                                                viewOnClickListenerC1556568z.LJLLJ = str4;
                                                                EditCaptionFontViewModel LLJILJIL = ViewOnClickListenerC1556568z.this.LLJILJIL();
                                                                String str5 = textFontStyleData.fileName;
                                                                o.LJIIIIZZ(str5, "type.fileName");
                                                                LLJILJIL.Gn(str5, ViewOnClickListenerC1556568z.this.LJLJLLL);
                                                                ViewOnClickListenerC1556568z viewOnClickListenerC1556568z2 = ViewOnClickListenerC1556568z.this;
                                                                C139685e0.LIZIZ(viewOnClickListenerC1556568z2.LJLILLLLZI, textFontStyleData, 0, "caption", viewOnClickListenerC1556568z2.LJLZ, false, 16);
                                                            }
                                                        });
                                                        InterfaceC36571c5 interfaceC36571c5 = (AbstractC42651GoZ) this.LJZL.LIZ(this, LLIFFJFJJ[0]);
                                                        o.LJII(interfaceC36571c5, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVListenableActivityRegistry");
                                                        this.LL = (InterfaceC45540Hu4) interfaceC36571c5;
                                                        return;
                                                    }
                                                    o.LJIJI("mSelectFontLayout");
                                                    throw null;
                                                }
                                                o.LJIJI("mSelectColorLayout");
                                                throw null;
                                            }
                                            o.LJIJI("debounceOnClickListener");
                                            throw null;
                                        }
                                        o.LJIJI("mAlignIcon");
                                        throw null;
                                    }
                                    o.LJIJI("mBgModeIcon");
                                    throw null;
                                }
                                o.LJIJI("mBar");
                                throw null;
                            }
                            o.LJIJI("mRootView");
                            throw null;
                        }
                        o.LJIJI("mSelectFontLayout");
                        throw null;
                    }
                    o.LJIJI("mRootView");
                    throw null;
                }
                o.LJIJI("mRootView");
                throw null;
            }
            o.LJIJI("mRootView");
            throw null;
        }
        o.LJIJI("mRootView");
        throw null;
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View LIZ = FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cbk, viewGroup, false, "inflater.inflate(R.layou…t_font, container, false)");
        this.LJLJI = LIZ;
        return LIZ;
    }
}
