package X;

import Y.ACListenerS22S0100000_2;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.574, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass574 extends FrameLayout implements InterfaceC70422pa {
    public RecyclerView LJLIL;
    public final C57J LJLILLLLZI;
    public AnonymousClass551 LJLJI;
    public AnonymousClass576 LJLJJI;
    public C57U LJLJJL;
    public InterfaceC1296256w LJLJJLL;
    public AnonymousClass573 LJLJL;
    public String LJLJLJ;
    public int LJLJLLL;
    public long LJLL;
    public final AqS168S0100000_2 LJLLI;
    public final MBA LJLLILLLL;
    public final java.util.Map<Integer, View> LJLLJ;

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLJ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void LIZIZ() {
        C57D resourceProvider;
        ArrayList<AnonymousClass572> arrayList;
        ArrayList arrayList2 = new ArrayList();
        AnonymousClass576 anonymousClass576 = this.LJLJJI;
        if (anonymousClass576 != null && (arrayList = anonymousClass576.LJLJJL) != null) {
            Iterator<AnonymousClass572> it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                AnonymousClass572 next = it.next();
                C57D resourceProvider2 = getResourceProvider();
                if (resourceProvider2 != null) {
                    String effectId = next.LJLIL.getEffectId();
                    o.LJIIIIZZ(effectId, "it.resourceItem.effectId");
                    if (resourceProvider2.LIZ(effectId)) {
                        continue;
                    }
                }
                String effectId2 = next.LJLIL.getEffectId();
                o.LJIIIIZZ(effectId2, "it.resourceItem.effectId");
                if (effectId2.length() != 0) {
                    arrayList2.add(next);
                    i++;
                    if (i == 6) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            AnonymousClass572 anonymousClass572 = (AnonymousClass572) it2.next();
            C57D resourceProvider3 = getResourceProvider();
            if (resourceProvider3 != null) {
                String effectId3 = anonymousClass572.LJLIL.getEffectId();
                o.LJIIIIZZ(effectId3, "resourceModel.resourceItem.effectId");
                if (resourceProvider3.LIZ(effectId3)) {
                }
            }
            String effectId4 = anonymousClass572.LJLIL.getEffectId();
            o.LJIIIIZZ(effectId4, "resourceModel.resourceItem.effectId");
            if (effectId4.length() != 0 && (resourceProvider = getResourceProvider()) != null) {
                String effectId5 = anonymousClass572.LJLIL.getEffectId();
                o.LJIIIIZZ(effectId5, "resourceModel.resourceItem.effectId");
                resourceProvider.LIZLLL(new C31309CQn(), effectId5);
            }
        }
    }

    public final void LIZLLL() {
        AnonymousClass551 anonymousClass551 = this.LJLJI;
        if (anonymousClass551 != null && !anonymousClass551.LJIILLIIL) {
            LIZ(R.id.g7w).setVisibility(8);
            ((ImageView) LIZ(R.id.g_u)).setVisibility(8);
            LIZ(R.id.cy4).setVisibility(8);
            LIZ(R.id.iyw).setVisibility(0);
        }
    }

    public final void LJIIIIZZ() {
        AnonymousClass551 anonymousClass551 = this.LJLJI;
        if (anonymousClass551 != null && !anonymousClass551.LJIILLIIL) {
            LIZ(R.id.g7w).setVisibility(8);
            LIZ(R.id.cy4).setVisibility(0);
            C16880lQ.LJIIZILJ((LinearLayout) LIZ(R.id.cy4), new ACListenerS22S0100000_2(this, 76));
            LIZ(R.id.iyw).setVisibility(8);
        }
    }

    public final void LJIIIZ() {
        AnonymousClass551 anonymousClass551 = this.LJLJI;
        if (anonymousClass551 != null && !anonymousClass551.LJIILLIIL) {
            LIZ(R.id.g7w).setVisibility(0);
            LIZ(R.id.cy4).setVisibility(8);
            LIZ(R.id.iyw).setVisibility(8);
            ((ImageView) LIZ(R.id.g_u)).setVisibility(0);
            C04650Gf.LIZJ(getContext(), C1291054w.LIZJ().LIZIZ).LIZIZ(new InterfaceC04760Gq() { // from class: X.57N
                @Override // X.InterfaceC04760Gq
                public final void onResult(Object obj) {
                    C0GY c0gy = (C0GY) obj;
                    C29701Eo c29701Eo = (C29701Eo) AnonymousClass574.this.LIZ(R.id.g_u);
                    if (c29701Eo != null) {
                        c29701Eo.setComposition(c0gy);
                    }
                    C29701Eo c29701Eo2 = (C29701Eo) AnonymousClass574.this.LIZ(R.id.g_u);
                    if (c29701Eo2 != null) {
                        c29701Eo2.playAnimation();
                    }
                }
            });
        }
    }

    private final C57D getResourceProvider() {
        if (C1280450u.LIZ()) {
            return C1280550v.LIZ().LIZ().LIZ;
        }
        return null;
    }

    @Override // X.InterfaceC70422pa
    public MBA getCoroutineContext() {
        return this.LJLLILLLL;
    }

    public final RecyclerView getRecyclerView() {
        return this.LJLIL;
    }

    public final AnonymousClass576 getResourceListAdapter() {
        return this.LJLJJI;
    }

    public final AnonymousClass551 getResourceViewConfig() {
        return this.LJLJI;
    }

    public final void LIZJ(boolean z) {
        AnonymousClass551 anonymousClass551;
        C57D resourceProvider = getResourceProvider();
        if (resourceProvider != null && (anonymousClass551 = this.LJLJI) != null) {
            if (o.LJ(anonymousClass551.LIZJ, "ratio")) {
                ArrayList<ResourceItem> LJ = resourceProvider.LJ(anonymousClass551.LJIILJJIL);
                LIZLLL();
                ArrayList arrayList = new ArrayList(C32I.LJJL(LJ, 10));
                Iterator<ResourceItem> it = LJ.iterator();
                while (it.hasNext()) {
                    arrayList.add(new AnonymousClass572(it.next(), 30));
                }
                setupList(arrayList);
                C57U c57u = this.LJLJJL;
                if (c57u != null) {
                    c57u.LIZ(true, z);
                    return;
                }
                return;
            }
            if (anonymousClass551.LIZJ != null) {
                if (anonymousClass551.LIZLLL) {
                    if (anonymousClass551.LJ != null && (!ujb.o.LJJJJJL(r0))) {
                        resourceProvider.LIZIZ(anonymousClass551.LIZJ, anonymousClass551.LJ, new AnonymousClass575(this, System.currentTimeMillis(), anonymousClass551, z));
                        return;
                    }
                    return;
                }
                resourceProvider.LJI(anonymousClass551.LIZJ, anonymousClass551.LJFF, new C57A(this, System.currentTimeMillis(), anonymousClass551, z));
            }
        }
    }

    public final void LJ(AnonymousClass551 anonymousClass551) {
        AbstractC030309z c150135ur;
        int i;
        OSZ osz;
        this.LJLJI = anonymousClass551;
        Boolean bool = null;
        this.LJLJLJ = null;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.arx, this, true);
        this.LJLL = 0L;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.iyw);
        this.LJLIL = recyclerView;
        if (recyclerView != null) {
            C0A2 c0a2 = anonymousClass551.LIZ;
            if (c0a2 == null) {
                recyclerView.getContext();
                c0a2 = new LinearLayoutManager(0, false);
            }
            recyclerView.setLayoutManager(c0a2);
            AbstractC030109x itemAnimator = recyclerView.getItemAnimator();
            o.LJII(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
            ((AbstractC28931Bp) itemAnimator).LJI = false;
            recyclerView.setItemAnimator(null);
            AnonymousClass551 anonymousClass5512 = this.LJLJI;
            if (anonymousClass5512 != null) {
                C57D resourceProvider = getResourceProvider();
                if (resourceProvider != null) {
                    resourceProvider.LIZJ();
                    bool = Boolean.FALSE;
                }
                this.LJLJJI = new AnonymousClass576(anonymousClass5512, bool);
            }
            if (recyclerView.getLayoutManager() instanceof GridLayoutManager) {
                recyclerView.setClipChildren(false);
                AnonymousClass576 anonymousClass576 = this.LJLJJI;
                if (anonymousClass576 != null && (osz = (OSZ) anonymousClass576.LJLJJLL.getValue()) != null) {
                    i = ((Number) osz.getFirst()).intValue();
                } else {
                    i = 0;
                }
                Context context = recyclerView.getContext();
                o.LJIIIIZZ(context, "context");
                int LIZIZ = C134855Qz.LIZIZ(context);
                C0A2 layoutManager = recyclerView.getLayoutManager();
                o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                final int i2 = ((GridLayoutManager) layoutManager).LLIIIL;
                final int i3 = (int) ((((LIZIZ - (i * i2)) * 1.0f) / (i2 + 1)) / 2);
                c150135ur = new AbstractC030309z(i2, i3) { // from class: X.4Zo
                    public final int LJLIL;
                    public final int LJLILLLLZI;
                    public final boolean LJLJI = true;

                    {
                        this.LJLIL = i2;
                        this.LJLILLLLZI = i3;
                    }

                    @Override // X.AbstractC030309z
                    public final void LJ(Rect rect, View view, RecyclerView recyclerView2, C0AC c0ac) {
                        int LIZJ = C1JX.LIZJ(rect, "outRect", view, "view", recyclerView2, "parent", c0ac, "state", view);
                        int i4 = this.LJLIL;
                        int i5 = LIZJ % i4;
                        if (this.LJLJI) {
                            int i6 = this.LJLILLLLZI;
                            rect.left = i6 - ((i5 * i6) / i4);
                            rect.right = ((i5 + 1) * i6) / i4;
                            if (LIZJ < i4) {
                                rect.top = i6;
                            }
                            rect.bottom = i6;
                            return;
                        }
                        int i7 = this.LJLILLLLZI;
                        rect.left = (i5 * i7) / i4;
                        rect.right = i7 - (((i5 + 1) * i7) / i4);
                        if (LIZJ < i4) {
                            return;
                        }
                        rect.top = i7;
                    }
                };
            } else {
                c150135ur = new C150135ur(10);
            }
            AbstractC030309z abstractC030309z = anonymousClass551.LIZIZ;
            if (abstractC030309z != null) {
                c150135ur = abstractC030309z;
            }
            recyclerView.LJII(c150135ur, -1);
            recyclerView.setAdapter(this.LJLJJI);
            C57J c57j = this.LJLILLLLZI;
            RecyclerView recyclerView2 = c57j.LJLIL;
            if (recyclerView2 != null) {
                recyclerView2.LJJLL(c57j);
            }
            c57j.LJLIL = recyclerView;
            recyclerView.LJIIJJI(c57j);
            RecyclerView recyclerView3 = c57j.LJLIL;
            if (recyclerView3 != null) {
                recyclerView3.removeCallbacks(c57j.LJLJI);
            }
            RecyclerView recyclerView4 = c57j.LJLIL;
            if (recyclerView4 != null) {
                recyclerView4.post(c57j.LJLJI);
            }
            this.LJLILLLLZI.LJLILLLLZI = this.LJLLI;
            LIZJ(false);
            AnonymousClass576 anonymousClass5762 = this.LJLJJI;
            if (anonymousClass5762 != null) {
                anonymousClass5762.LJLJI = new C1296356x(this);
            }
        }
    }

    public final void setOnItemClickListener(InterfaceC1296256w listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJLL = listener;
    }

    public final void setResourceListInitListener(C57U initListener) {
        o.LJIIIZ(initListener, "initListener");
        this.LJLJJL = initListener;
    }

    public final void setResourceListMobListener(AnonymousClass573 mobListener) {
        o.LJIIIZ(mobListener, "mobListener");
        this.LJLJL = mobListener;
    }

    public final void setupList(List<AnonymousClass572> list) {
        AnonymousClass576 anonymousClass576 = this.LJLJJI;
        if (anonymousClass576 != null) {
            o.LJIIIZ(list, "list");
            anonymousClass576.LJLJJL.clear();
            if (anonymousClass576.LJLIL.LJI.LIZ) {
                ResourceItem resourceItem = new ResourceItem();
                resourceItem.setName(C132105Gk.LIZ().getString(R.string.q5l));
                resourceItem.setIcon("");
                resourceItem.setPath("");
                anonymousClass576.LJLJJL.add(new AnonymousClass572(resourceItem, 26));
            }
            anonymousClass576.LJLJJL.addAll(list);
            if (anonymousClass576.LJLIL.LJIIL.LIZIZ) {
                ResourceItem resourceItem2 = new ResourceItem();
                resourceItem2.setName(C132105Gk.LIZ().getString(R.string.q5k));
                resourceItem2.setIcon("custom");
                resourceItem2.setPath("custom");
                AnonymousClass572 anonymousClass572 = new AnonymousClass572(resourceItem2, 26);
                if (anonymousClass576.LJLIL.LJI.LIZ) {
                    ListProtector.add(anonymousClass576.LJLJJL, 1, anonymousClass572);
                } else {
                    ListProtector.add(anonymousClass576.LJLJJL, 0, anonymousClass572);
                }
            }
            anonymousClass576.notifyDataSetChanged();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass574(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLLJ = C62850Ola.LJFF(context, "context");
        this.LJLILLLLZI = new C57J();
        this.LJLJLLL = -1;
        this.LJLLI = new AqS168S0100000_2(this, 518);
        this.LJLLILLLL = C36636EZk.LIZ.plus(C79146V4k.LJIILIIL());
    }

    public static void LJII(AnonymousClass574 anonymousClass574, String currentId) {
        o.LJIIIZ(currentId, "currentId");
        AnonymousClass576 anonymousClass576 = anonymousClass574.LJLJJI;
        if (anonymousClass576 != null) {
            Iterator<AnonymousClass572> it = anonymousClass576.LJLJJL.iterator();
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                AnonymousClass572 next = it.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    AnonymousClass572 anonymousClass572 = next;
                    if (o.LJ(anonymousClass572.LJLIL.getResourceId(), currentId)) {
                        anonymousClass572.LJLJI = true;
                        i = i2;
                    } else {
                        anonymousClass572.LJLJI = false;
                    }
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            anonymousClass576.notifyItemChanged(i, "select_refresh");
            int i4 = anonymousClass574.LJLJLLL;
            if (i != i4) {
                anonymousClass576.notifyItemChanged(i4, "select_refresh");
            }
            anonymousClass574.LJLJLLL = i;
            RecyclerView recyclerView = anonymousClass574.LJLIL;
            if (recyclerView != null) {
                recyclerView.LJLI(i);
            }
        }
    }

    public static void LJI(AnonymousClass574 anonymousClass574, String str, int i) {
        boolean z;
        if ((i & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        anonymousClass574.getClass();
        AnonymousClass576 anonymousClass576 = anonymousClass574.LJLJJI;
        if (anonymousClass576 != null) {
            Iterator<AnonymousClass572> it = anonymousClass576.LJLJJL.iterator();
            int i2 = 0;
            int i3 = 0;
            while (it.hasNext()) {
                AnonymousClass572 next = it.next();
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    AnonymousClass572 anonymousClass572 = next;
                    if (o.LJ(anonymousClass572.LJLIL.getPath(), str)) {
                        anonymousClass572.LJLJI = true;
                        i2 = i3;
                    } else {
                        anonymousClass572.LJLJI = false;
                    }
                    i3 = i4;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            anonymousClass576.notifyItemChanged(i2, "select_refresh");
            int i5 = anonymousClass574.LJLJLLL;
            if (i2 != i5) {
                anonymousClass576.notifyItemChanged(i5, "select_refresh");
            }
            anonymousClass574.LJLJLLL = i2;
            if (z) {
                RecyclerView recyclerView = anonymousClass574.LJLIL;
                if (recyclerView != null) {
                    recyclerView.LJLIL(i2);
                    return;
                }
                return;
            }
            RecyclerView recyclerView2 = anonymousClass574.LJLIL;
            if (recyclerView2 == null) {
                return;
            }
            recyclerView2.LJLI(i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (r1.LIZ(r0) == true) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(final X.AnonymousClass572 r11, final int r12, final X.AnonymousClass572 r13) {
        /*
            r10 = this;
            r9 = r11
            com.ss.ugc.android.editor.base.resource.ResourceItem r0 = r9.LJLIL
            java.lang.String r0 = r0.getEffectId()
            r4 = r10
            r4.LJLJLJ = r0
            X.57D r1 = r4.getResourceProvider()
            java.lang.String r3 = "resourceModel.resourceItem.effectId"
            r2 = 1
            r8 = r12
            if (r1 == 0) goto L2d
            com.ss.ugc.android.editor.base.resource.ResourceItem r0 = r9.LJLIL
            java.lang.String r0 = r0.getEffectId()
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r3)
            boolean r0 = r1.LIZ(r0)
            if (r0 != r2) goto L2d
        L23:
            X.56w r1 = r4.LJLJJLL
            if (r1 == 0) goto L2c
            com.ss.ugc.android.editor.base.resource.ResourceItem r0 = r9.LJLIL
            r1.LIZJ(r0, r8, r2)
        L2c:
            return
        L2d:
            com.ss.ugc.android.editor.base.resource.ResourceItem r0 = r9.LJLIL
            java.lang.String r0 = r0.getEffectId()
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r3)
            int r0 = r0.length()
            if (r0 != 0) goto L3d
            goto L23
        L3d:
            long r5 = java.lang.System.currentTimeMillis()
            X.57D r1 = r4.getResourceProvider()
            if (r1 == 0) goto L2c
            com.ss.ugc.android.editor.base.resource.ResourceItem r0 = r9.LJLIL
            java.lang.String r0 = r0.getEffectId()
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r3)
            X.571 r3 = new X.571
            r7 = r13
            r3.<init>()
            r1.LIZLLL(r3, r0)
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass574.LJFF(X.572, int, X.572):void");
    }
}
