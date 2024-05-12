package X;

import Y.ARunnableS38S0100000_2;
import Y.IDrS42S0100000_2;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.gamora.editor.audioservice.businessui.soundremixfilter.SoundFilterViewModel;
import com.ss.ugc.effectplatform.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.IDqS427S0100000_2;
import kotlin.jvm.internal.IDqS449S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5ui, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150045ui {
    public final NLEEditor LIZ;
    public String LIZIZ;
    public final InterfaceC88472Yns<String, C76800UCe> LIZJ;
    public final C150055uj LIZLLL;
    public final C62822Ol8 LJ;
    public final C167706i6 LJFF;
    public SoundFilterViewModel LJI;
    public boolean LJII;
    public RecyclerView LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;

    public final C167676i3 LIZIZ() {
        return (C167676i3) this.LJ.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ca, code lost:
    
        "Required value was null.".toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d2, code lost:
    
        throw new java.lang.IllegalArgumentException("Required value was null.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(androidx.recyclerview.widget.RecyclerView r11) {
        /*
            r10 = this;
            X.0A2 r0 = r11.getLayoutManager()
            java.lang.String r4 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
            kotlin.jvm.internal.o.LJII(r0, r4)
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r3 = r0.LLILL()
            X.0A2 r0 = r11.getLayoutManager()
            kotlin.jvm.internal.o.LJII(r0, r4)
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r2 = r0.LLILLJJLI()
            if (r3 > r2) goto Ldc
        L1e:
            X.0A2 r0 = r11.getLayoutManager()
            kotlin.jvm.internal.o.LJII(r0, r4)
            android.view.View r5 = r0.LJJIJIL(r3)
            if (r5 != 0) goto L30
        L2b:
            if (r3 == r2) goto Ldc
            int r3 = r3 + 1
            goto L1e
        L30:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r5.getLocalVisibleRect(r1)
            int r0 = r1.top
            r7 = 0
            if (r0 < 0) goto L2b
            int r1 = r1.bottom
            int r0 = r5.getHeight()
            if (r1 > r0) goto L2b
            X.6i3 r0 = r10.LIZIZ()
            X.6i9 r0 = r0.LJI(r3)
            X.6i6 r5 = r10.LJFF
            X.5uj r9 = r10.LIZLLL
            java.lang.String r1 = "Required value was null."
            if (r9 == 0) goto Ld3
            if (r0 == 0) goto Lca
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r0.LIZ
            if (r0 == 0) goto Lca
            java.lang.String r6 = r0.getEffectId()
            r5.getClass()
            java.lang.String r0 = "soundFilterId"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            X.Ol8 r0 = r5.LJLJLLL
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.add(r6)
            if (r0 == 0) goto L2b
            X.7au r5 = new X.7au
            r5.<init>()
            java.lang.String r1 = r9.LIZ
            java.lang.String r8 = ""
            if (r1 != 0) goto L81
            r1 = r8
        L81:
            java.lang.String r0 = "creation_id"
            r5.LJIIIZ(r0, r1)
            java.lang.String r1 = r9.LIZIZ
            if (r1 != 0) goto L8b
            r1 = r8
        L8b:
            java.lang.String r0 = "content_source"
            r5.LJIIIZ(r0, r1)
            java.lang.String r1 = r9.LIZJ
            if (r1 != 0) goto L95
            r1 = r8
        L95:
            java.lang.String r0 = "content_type"
            r5.LJIIIZ(r0, r1)
            java.lang.String r1 = r9.LIZLLL
            if (r1 != 0) goto L9f
            r1 = r8
        L9f:
            java.lang.String r0 = "music_id"
            r5.LJIIIZ(r0, r1)
            java.lang.String r0 = r9.LJ
            if (r0 != 0) goto Lc8
        La8:
            java.lang.String r0 = "shoot_way"
            r5.LJIIIZ(r0, r8)
            java.lang.Integer r0 = r9.LJFF
            if (r0 == 0) goto Lb5
            int r7 = r0.intValue()
        Lb5:
            java.lang.String r0 = "is_editor_pro"
            r5.LIZLLL(r7, r0)
            java.lang.String r0 = "sound_filter_id"
            r5.LJIIIZ(r0, r6)
            java.util.Map<java.lang.String, java.lang.String> r1 = r5.LIZ
            java.lang.String r0 = "sound_filter_show"
            X.FMX.LJIIL(r0, r1)
            goto L2b
        Lc8:
            r8 = r0
            goto La8
        Lca:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1.toString()
            r0.<init>(r1)
            throw r0
        Ld3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1.toString()
            r0.<init>(r1)
            throw r0
        Ldc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C150045ui.LIZ(androidx.recyclerview.widget.RecyclerView):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.3wG] */
    public final void LIZJ(final C29S c29s, FrameLayout frameLayout) {
        Effect effect;
        Object obj;
        String str;
        com.ss.android.ugc.effectmanager.effect.model.Effect effect2;
        com.ss.android.ugc.effectmanager.effect.model.Effect effect3;
        Object obj2;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3;
        Iterator LIZJ = C141415gn.LIZJ(this.LIZ, "nleEditor.model.tracks");
        while (true) {
            effect = null;
            objArr3 = 0;
            objArr2 = 0;
            objArr = 0;
            if (LIZJ.hasNext()) {
                obj = LIZJ.next();
                if (o.LJ(((NLENode) obj).getExtra("AudioTrackType"), EnumC122254qz.BGM.name())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NLENode nLENode = (NLENode) obj;
        if (nLENode != null) {
            str = nLENode.getUUID();
        } else {
            str = null;
        }
        int i = 1;
        if (str != null) {
            Iterator LIZJ2 = C141415gn.LIZJ(this.LIZ, "nleEditor.model.tracks");
            while (true) {
                if (LIZJ2.hasNext()) {
                    obj2 = LIZJ2.next();
                    if (o.LJ(((NLENode) obj2).getUUID(), str)) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            NLENode nLENode2 = (NLENode) obj2;
            if (nLENode2 != null) {
                String extra = nLENode2.getExtra("sound_filter_id");
                o.LJIIIIZZ(extra, "bgmTrack.getExtra(SoundF…tils.SOUND_FILTER_ID_KEY)");
                if (extra.length() > 0 && C122284r2.LIZLLL(this.LIZ.LJ())) {
                    this.LIZIZ = nLENode2.getExtra("sound_filter_id");
                } else {
                    this.LIZIZ = null;
                    nLENode2.setExtra("sound_filter_id", "");
                }
            }
        }
        if (this.LJII) {
            String str2 = this.LIZIZ;
            SoundFilterViewModel soundFilterViewModel = this.LJI;
            if (soundFilterViewModel != null) {
                if (str2 != null) {
                    effect3 = new com.ss.android.ugc.effectmanager.effect.model.Effect(effect, i, objArr == true ? 1 : 0);
                    effect3.setEffectId(str2);
                } else {
                    effect3 = null;
                }
                InterfaceC150095un interfaceC150095un = soundFilterViewModel.LJLJJL;
                if (interfaceC150095un != null) {
                    interfaceC150095un.LJ(effect3);
                }
                ((java.util.Set) this.LJFF.LJLJLLL.getValue()).clear();
                RecyclerView recyclerView = this.LJIIIIZZ;
                if (recyclerView != null) {
                    LIZ(recyclerView);
                    return;
                } else {
                    o.LJIJI("recyclerView");
                    throw null;
                }
            }
            o.LJIJI("soundFilterViewModel");
            throw null;
        }
        this.LJII = true;
        RecyclerView LIZ = C149975ub.LIZ(LIZIZ(), c29s, new AbstractC030309z(c29s) { // from class: X.3wG
            public final int LJLIL;

            {
                this.LJLIL = (int) KL2.LIZJ(c29s, 12.0f);
            }

            @Override // X.AbstractC030309z
            public final void LJ(Rect rect, View view, RecyclerView recyclerView2, C0AC c0ac) {
                int LIZJ3 = C1JX.LIZJ(rect, "outRect", view, "view", recyclerView2, "parent", c0ac, "state", view);
                if (LIZJ3 == -1) {
                    return;
                }
                if (LIZJ3 == 0) {
                    if (C90193gN.LIZIZ(recyclerView2.getContext())) {
                        rect.right = 0;
                    } else {
                        rect.left = 0;
                    }
                }
                if (recyclerView2.getAdapter() != null) {
                    if (LIZJ3 == r0.getItemCount() - 1) {
                        if (C90193gN.LIZIZ(recyclerView2.getContext())) {
                            rect.left = 0;
                            return;
                        } else {
                            rect.right = 0;
                            return;
                        }
                    }
                    if (C90193gN.LIZIZ(recyclerView2.getContext())) {
                        rect.left = this.LJLIL;
                        return;
                    } else {
                        rect.right = this.LJLIL;
                        return;
                    }
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }, 2);
        if (LIZ != null) {
            this.LJIIIIZZ = LIZ;
            frameLayout.addView(LIZ, -1, -2);
            RecyclerView recyclerView2 = this.LJIIIIZZ;
            if (recyclerView2 != null) {
                recyclerView2.LJIIJJI(new IDrS42S0100000_2(this, 3));
                SoundFilterViewModel soundFilterViewModel2 = new SoundFilterViewModel(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL);
                this.LJI = soundFilterViewModel2;
                soundFilterViewModel2.LJLJJL = new InterfaceC150095un() { // from class: X.5ux
                    @Override // X.InterfaceC150095un
                    public final int LIZ() {
                        return C150045ui.this.LIZIZ().LIZ();
                    }

                    @Override // X.InterfaceC150095un
                    public final void LIZLLL() {
                        C26045AKb c26045AKb = new C26045AKb(c29s);
                        c26045AKb.LJIIIZ("sound filter download failed");
                        c26045AKb.LJIIJ();
                    }

                    @Override // X.InterfaceC150095un
                    public final void LJII() {
                        C29S c29s2 = c29s;
                        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                        creativeToastBuilder.messageRes(R.string.rgu);
                        C78915Uy7.LJJIIZI(c29s2, 1049, creativeToastBuilder);
                    }

                    @Override // X.InterfaceC150095un
                    public final void LIZIZ(int i2) {
                        C150045ui.this.LIZIZ().LIZIZ(i2);
                    }

                    @Override // X.InterfaceC150095un
                    public final void LJ(com.ss.android.ugc.effectmanager.effect.model.Effect effect4) {
                        if (effect4 == null) {
                            C150045ui.this.LIZIZ().LIZIZ(-1);
                        } else {
                            C150045ui.this.LIZIZ().LJIILIIL(effect4);
                        }
                        AbstractC167696i5 abstractC167696i5 = C150045ui.this.LIZIZ().LIZIZ;
                        if (abstractC167696i5 != null) {
                            abstractC167696i5.LJLJL = abstractC167696i5.LJLJJLL;
                        }
                        C150045ui.this.LIZIZ().LJIIJJI();
                    }

                    @Override // X.InterfaceC150095un
                    public final void LJI(int i2) {
                        int i3;
                        AbstractC167696i5 abstractC167696i5 = C150045ui.this.LIZIZ().LIZIZ;
                        if (abstractC167696i5 == null || (i3 = abstractC167696i5.LJLJJLL) == -1 || i3 != i2) {
                            return;
                        }
                        ((C167736i9) ListProtector.get(abstractC167696i5.LJLJI, i3)).LJII = false;
                        abstractC167696i5.notifyItemChanged(i2);
                        abstractC167696i5.LJLJJLL = -1;
                    }

                    @Override // X.InterfaceC150095un
                    public final void LIZJ(int i2, int i3) {
                        C150045ui.this.LIZIZ().LIZJ(i2, i3);
                    }

                    @Override // X.InterfaceC150095un
                    public final void LJFF(C150145us c150145us, com.ss.android.ugc.effectmanager.effect.model.Effect effect4) {
                        C167676i3 LIZIZ = C150045ui.this.LIZIZ();
                        InterfaceC167686i4 interfaceC167686i4 = new InterfaceC167686i4() { // from class: X.5uy
                            @Override // X.InterfaceC167686i4
                            public final void onDestroy() {
                            }

                            @Override // X.InterfaceC167686i4
                            public final void LIZ(InterfaceC88473Ynt<? super List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect>, ? super Integer, ? super String, C76800UCe> interfaceC88473Ynt) {
                                final IDqS427S0100000_2 iDqS427S0100000_2 = (IDqS427S0100000_2) interfaceC88473Ynt;
                                ((C169426ks) C169426ks.LIZIZ.getValue()).LIZ(new InterfaceC169466kw() { // from class: X.5uz
                                    @Override // X.InterfaceC169466kw
                                    public final void LIZIZ() {
                                    }

                                    @Override // X.InterfaceC169466kw
                                    public final void LIZ(CategoryPageModel categoryPageModel) {
                                        List<com.ss.android.ugc.effectmanager.effect.model.Effect> list;
                                        boolean z;
                                        CategoryEffectModel categoryEffects;
                                        List<com.ss.android.ugc.effectmanager.effect.model.Effect> effects;
                                        CategoryEffectModel categoryEffects2;
                                        InterfaceC88473Ynt<List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect>, Integer, String, C76800UCe> interfaceC88473Ynt2 = iDqS427S0100000_2;
                                        if (categoryPageModel != null && (categoryEffects2 = categoryPageModel.getCategoryEffects()) != null) {
                                            list = categoryEffects2.getEffects();
                                        } else {
                                            list = null;
                                        }
                                        interfaceC88473Ynt2.invoke(list, null, null);
                                        if (categoryPageModel != null && (categoryEffects = categoryPageModel.getCategoryEffects()) != null && (effects = categoryEffects.getEffects()) != null && !effects.isEmpty()) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (z) {
                                            WPY.LIZIZ(true, "changer_voice", null, 12);
                                        } else {
                                            WPY.LIZIZ(false, "changer_voice", null, 12);
                                        }
                                    }

                                    @Override // X.InterfaceC169466kw
                                    public final void LIZJ(int i2, String str3) {
                                        WPY.LIZIZ(false, "changer_voice", null, 12);
                                        iDqS427S0100000_2.invoke(null, Integer.valueOf(i2), str3);
                                    }
                                });
                            }

                            @Override // X.InterfaceC167686i4
                            public final void LIZIZ(IDqS427S0100000_2 iDqS427S0100000_2) {
                                List<com.ss.android.ugc.effectmanager.effect.model.Effect> list;
                                CategoryEffectModel categoryEffects = C149905uU.LIZ().getCategoryEffects();
                                if (categoryEffects != null) {
                                    list = categoryEffects.getEffects();
                                } else {
                                    list = null;
                                }
                                iDqS427S0100000_2.invoke(list, null, null);
                            }
                        };
                        LIZIZ.getClass();
                        LIZIZ.LIZJ = interfaceC167686i4;
                        C167676i3 LIZIZ2 = C150045ui.this.LIZIZ();
                        IDqS449S0100000_2 iDqS449S0100000_2 = new IDqS449S0100000_2(C150045ui.this, 5);
                        LIZIZ2.getClass();
                        LIZIZ2.LJIIL(false, new C150185uw(LIZIZ2, c150145us, effect4, iDqS449S0100000_2));
                    }
                };
                LIZIZ().LJFF(this.LJFF);
                LIZIZ().LJIIJ((InterfaceC150015uf) this.LJIIIZ.getValue());
                SoundFilterViewModel soundFilterViewModel3 = this.LJI;
                if (soundFilterViewModel3 != null) {
                    C150145us c150145us = new C150145us(true, false, 14);
                    String str3 = soundFilterViewModel3.LJLILLLLZI;
                    if (str3 != null) {
                        effect2 = new com.ss.android.ugc.effectmanager.effect.model.Effect(objArr2 == true ? 1 : 0, i, objArr3 == true ? 1 : 0);
                        effect2.setEffectId(str3);
                    } else {
                        effect2 = null;
                    }
                    InterfaceC150095un interfaceC150095un2 = soundFilterViewModel3.LJLJJL;
                    if (interfaceC150095un2 != null) {
                        interfaceC150095un2.LJFF(c150145us, effect2);
                    }
                    RecyclerView recyclerView3 = this.LJIIIIZZ;
                    if (recyclerView3 != null) {
                        recyclerView3.postDelayed(new ARunnableS38S0100000_2(this, 154), 1500L);
                        return;
                    } else {
                        o.LJIJI("recyclerView");
                        throw null;
                    }
                }
                o.LJIJI("soundFilterViewModel");
                throw null;
            }
            o.LJIJI("recyclerView");
            throw null;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C150045ui(NLEEditor nleEditor, String str, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, C150055uj c150055uj) {
        o.LJIIIZ(nleEditor, "nleEditor");
        this.LIZ = nleEditor;
        this.LIZIZ = str;
        this.LIZJ = interfaceC88472Yns;
        this.LIZLLL = c150055uj;
        this.LJ = C221108m2.LIZIZ(C150035uh.LJLIL);
        this.LJFF = new C167706i6();
        this.LJIIIZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 844));
    }
}
