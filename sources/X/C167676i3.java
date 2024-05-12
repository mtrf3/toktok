package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS427S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6i3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C167676i3 implements InterfaceC149955uZ {
    public RecyclerView LIZ;
    public AbstractC167696i5 LIZIZ;
    public InterfaceC167686i4 LIZJ;

    @Override // X.InterfaceC149955uZ
    public final int LIZ() {
        AbstractC167696i5 abstractC167696i5 = this.LIZIZ;
        if (abstractC167696i5 != null) {
            return abstractC167696i5.LJLJJLL;
        }
        return -1;
    }

    @Override // X.InterfaceC149955uZ
    public final void LJIIIIZZ() {
        AbstractC167696i5 abstractC167696i5 = this.LIZIZ;
        if (abstractC167696i5 == null || abstractC167696i5.LJLJJLL == -1) {
            return;
        }
        Iterator<C167736i9> it = abstractC167696i5.LJLJI.iterator();
        while (it.hasNext()) {
            it.next().LJII = false;
        }
        abstractC167696i5.notifyItemChanged(abstractC167696i5.LJLJJLL);
        abstractC167696i5.LJLJJLL = -1;
    }

    @Override // X.InterfaceC149955uZ
    public final void LJIIIZ() {
        int i;
        AbstractC167696i5 abstractC167696i5 = this.LIZIZ;
        if (abstractC167696i5 == null || (i = abstractC167696i5.LJLJJLL) == -1) {
            return;
        }
        ((C167736i9) ListProtector.get(abstractC167696i5.LJLJI, i)).LJII = false;
        abstractC167696i5.notifyItemChanged(i);
        abstractC167696i5.LJLJJLL = -1;
    }

    @Override // X.InterfaceC149955uZ
    public final void LJIIJJI() {
        AbstractC167696i5 abstractC167696i5 = this.LIZIZ;
        if (abstractC167696i5 != null) {
            abstractC167696i5.LJZL();
        }
    }

    @Override // X.InterfaceC149955uZ
    public final void onDestroy() {
        InterfaceC167686i4 interfaceC167686i4 = this.LIZJ;
        if (interfaceC167686i4 != null) {
            interfaceC167686i4.onDestroy();
        }
    }

    @Override // X.InterfaceC149955uZ
    public final void LIZIZ(int i) {
        AbstractC167696i5 abstractC167696i5 = this.LIZIZ;
        if (abstractC167696i5 != null) {
            abstractC167696i5.LL(i);
        }
    }

    @Override // X.InterfaceC149955uZ
    public final void LJ(C150145us enableModel) {
        o.LJIIIZ(enableModel, "enableModel");
        AbstractC167696i5 abstractC167696i5 = this.LIZIZ;
        if (abstractC167696i5 != null && !o.LJ(abstractC167696i5.LJLJJL, enableModel)) {
            int i = !enableModel.LIZ ? 1 : 0;
            Iterator<C167736i9> it = abstractC167696i5.LJLJI.iterator();
            while (it.hasNext()) {
                C167736i9 next = it.next();
                if (!next.LIZJ) {
                    next.LJFF = i;
                }
            }
            abstractC167696i5.LJLJJL = enableModel;
            abstractC167696i5.notifyDataSetChanged();
        }
    }

    @Override // X.InterfaceC149955uZ
    public final void LJFF(AbstractC167696i5 adapter) {
        o.LJIIIZ(adapter, "adapter");
        this.LIZIZ = adapter;
        RecyclerView recyclerView = this.LIZ;
        if (recyclerView == null) {
            return;
        }
        recyclerView.setAdapter(adapter);
    }

    @Override // X.InterfaceC149955uZ
    public final C167736i9 LJI(int i) {
        AbstractC167696i5 abstractC167696i5 = this.LIZIZ;
        if (abstractC167696i5 == null || i < 0 || i >= abstractC167696i5.LJLJI.size()) {
            return null;
        }
        return (C167736i9) ListProtector.get(abstractC167696i5.LJLJI, i);
    }

    @Override // X.InterfaceC149955uZ
    public final void LJIIJ(InterfaceC150015uf interfaceC150015uf) {
        AbstractC167696i5 abstractC167696i5 = this.LIZIZ;
        if (abstractC167696i5 != null) {
            abstractC167696i5.LJLILLLLZI = interfaceC150015uf;
        }
    }

    @Override // X.InterfaceC149955uZ
    public final void LJIILIIL(Effect selectedEffect) {
        o.LJIIIZ(selectedEffect, "selectedEffect");
        AbstractC167696i5 abstractC167696i5 = this.LIZIZ;
        if (abstractC167696i5 != null) {
            Iterator<C167736i9> it = abstractC167696i5.LJLJI.iterator();
            int i = 0;
            while (it.hasNext()) {
                C167736i9 next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    if (AbstractC167696i5.LJLZ(selectedEffect, next.LIZ)) {
                        abstractC167696i5.LL(i);
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    public final void LJIILJJIL(boolean z) {
        boolean z2;
        AbstractC167696i5 abstractC167696i5 = this.LIZIZ;
        if (abstractC167696i5 != null) {
            Iterator<C167736i9> it = abstractC167696i5.LJLJI.iterator();
            int i = 0;
            while (it.hasNext()) {
                C167736i9 next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    C167736i9 c167736i9 = next;
                    if (abstractC167696i5.LJLJJLL == i && z) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c167736i9.LJIIJ = z2;
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            abstractC167696i5.notifyDataSetChanged();
        }
    }

    public final void LJIILL(int i) {
        int i2;
        AbstractC167696i5 abstractC167696i5 = this.LIZIZ;
        if (abstractC167696i5 != null) {
            Iterator<C167736i9> it = abstractC167696i5.LJLJI.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                C167736i9 next = it.next();
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    C167736i9 c167736i9 = next;
                    if (abstractC167696i5.LJLJJLL == i3) {
                        i2 = i;
                    } else {
                        i2 = -1;
                    }
                    c167736i9.LJIIIZ = i2;
                    i3 = i4;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            abstractC167696i5.notifyDataSetChanged();
        }
    }

    public final void LJIILLIIL(int i) {
        int i2;
        AbstractC167696i5 abstractC167696i5 = this.LIZIZ;
        if (abstractC167696i5 != null) {
            Iterator<C167736i9> it = abstractC167696i5.LJLJI.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                C167736i9 next = it.next();
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    C167736i9 c167736i9 = next;
                    if (abstractC167696i5.LJLJJLL == i3) {
                        i2 = i;
                    } else {
                        i2 = -1;
                    }
                    c167736i9.LJIIIIZZ = i2;
                    i3 = i4;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            abstractC167696i5.notifyDataSetChanged();
        }
    }

    public final void LJIIZILJ(int i) {
        AbstractC167696i5 abstractC167696i5 = this.LIZIZ;
        if (abstractC167696i5 != null) {
            Iterator<C167736i9> it = abstractC167696i5.LJLJI.iterator();
            while (it.hasNext()) {
                it.next().LJ = i;
            }
            abstractC167696i5.notifyDataSetChanged();
        }
    }

    @Override // X.InterfaceC149955uZ
    public final void LIZJ(int i, int i2) {
        RecyclerView.ViewHolder viewHolder;
        AbstractC167696i5 abstractC167696i5 = this.LIZIZ;
        if (abstractC167696i5 != null && i >= 0 && i < abstractC167696i5.getItemCount()) {
            RecyclerView recyclerView = abstractC167696i5.LJLIL;
            if (recyclerView != null) {
                viewHolder = recyclerView.LJJIZ(i);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof C168986kA) {
                ((C168986kA) viewHolder).P(i2);
            } else {
                abstractC167696i5.notifyItemChanged(i);
            }
        }
    }

    @Override // X.InterfaceC149955uZ
    public final void LJIIL(boolean z, InterfaceC88474Ynu<? super List<? extends Effect>, ? super Boolean, ? super Integer, ? super String, C76800UCe> interfaceC88474Ynu) {
        if (this.LIZJ == null) {
            this.LIZJ = new InterfaceC167686i4() { // from class: X.6iC
                @Override // X.InterfaceC167686i4
                public final void onDestroy() {
                    C166696gT.LIZ().getClass();
                    ((C43523H6h) C169416kr.LJ.getValue()).LIZ.LJIIIIZZ(1);
                }

                @Override // X.InterfaceC167686i4
                public final void LIZ(InterfaceC88473Ynt<? super List<? extends Effect>, ? super Integer, ? super String, C76800UCe> interfaceC88473Ynt) {
                    final IDqS427S0100000_2 iDqS427S0100000_2 = (IDqS427S0100000_2) interfaceC88473Ynt;
                    C166696gT.LIZ().LIZIZ(new InterfaceC169456kv() { // from class: X.6iD
                        @Override // X.InterfaceC169456kv
                        public final void LIZJ() {
                        }

                        @Override // X.InterfaceC169456kv
                        public final void LIZ(CategoryPageModel categoryPageModel) {
                            List<Effect> list;
                            boolean z2;
                            CategoryEffectModel categoryEffects;
                            List<Effect> effects;
                            CategoryEffectModel categoryEffects2;
                            InterfaceC88473Ynt<List<? extends Effect>, Integer, String, C76800UCe> interfaceC88473Ynt2 = iDqS427S0100000_2;
                            if (categoryPageModel != null && (categoryEffects2 = categoryPageModel.getCategoryEffects()) != null) {
                                list = categoryEffects2.getEffects();
                            } else {
                                list = null;
                            }
                            interfaceC88473Ynt2.invoke(list, null, null);
                            if (categoryPageModel != null && (categoryEffects = categoryPageModel.getCategoryEffects()) != null && (effects = categoryEffects.getEffects()) != null && !effects.isEmpty()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                WPY.LIZIZ(true, "changer_voice", null, 12);
                            } else {
                                WPY.LIZIZ(false, "changer_voice", null, 12);
                            }
                        }

                        @Override // X.InterfaceC169456kv
                        public final void LIZIZ(int i, String str) {
                            WPY.LIZIZ(false, "changer_voice", null, 12);
                            iDqS427S0100000_2.invoke(null, Integer.valueOf(i), str);
                        }
                    });
                }

                @Override // X.InterfaceC167686i4
                public final void LIZIZ(IDqS427S0100000_2 iDqS427S0100000_2) {
                    List<Effect> list;
                    CategoryEffectModel categoryEffects = C149905uU.LIZ().getCategoryEffects();
                    if (categoryEffects != null) {
                        list = categoryEffects.getEffects();
                    } else {
                        list = null;
                    }
                    iDqS427S0100000_2.invoke(list, null, null);
                }
            };
        }
        if (z) {
            InterfaceC167686i4 interfaceC167686i4 = this.LIZJ;
            if (interfaceC167686i4 != null) {
                interfaceC167686i4.LIZIZ(new IDqS427S0100000_2(interfaceC88474Ynu, (InterfaceC88474Ynu<? super List<? extends Effect>, ? super Boolean, ? super Integer, ? super String, C76800UCe>) 8));
            } else {
                o.LJIJI("dataGetter");
                throw null;
            }
        }
        InterfaceC167686i4 interfaceC167686i42 = this.LIZJ;
        if (interfaceC167686i42 != null) {
            interfaceC167686i42.LIZ(new IDqS427S0100000_2(interfaceC88474Ynu, (InterfaceC88474Ynu<? super List<? extends Effect>, ? super Boolean, ? super Integer, ? super String, C76800UCe>) 9));
        } else {
            o.LJIJI("dataGetter");
            throw null;
        }
    }

    @Override // X.InterfaceC149955uZ
    public final RecyclerView LIZLLL(final Context context, C0A2 c0a2, AbstractC030309z abstractC030309z) {
        if (this.LIZ == null) {
            AbstractC28931Bp abstractC28931Bp = null;
            RecyclerView recyclerView = new RecyclerView(context, null);
            this.LIZ = recyclerView;
            AbstractC030109x itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.LIZJ = 0L;
                itemAnimator.LJFF = 0L;
                itemAnimator.LJ = 0L;
                itemAnimator.LIZLLL = 0L;
            }
            AbstractC030109x itemAnimator2 = recyclerView.getItemAnimator();
            if (itemAnimator2 instanceof AbstractC28931Bp) {
                abstractC28931Bp = (AbstractC28931Bp) itemAnimator2;
            }
            if (abstractC28931Bp != null) {
                abstractC28931Bp.LJI = false;
            }
            RecyclerView recyclerView2 = this.LIZ;
            if (recyclerView2 != null) {
                if (abstractC030309z == null) {
                    abstractC030309z = new AbstractC030309z(context) { // from class: X.61r
                        public final int LJLIL;

                        {
                            this.LJLIL = (int) KL2.LIZJ(context, 16.0f);
                        }

                        @Override // X.AbstractC030309z
                        public final void LJ(Rect rect, View view, RecyclerView recyclerView3, C0AC c0ac) {
                            AbstractC029409q adapter;
                            int LIZJ = C1JX.LIZJ(rect, "outRect", view, "view", recyclerView3, "parent", c0ac, "state", view);
                            if (LIZJ != -1 && (adapter = recyclerView3.getAdapter()) != null) {
                                int itemCount = adapter.getItemCount();
                                if (LIZJ == 0) {
                                    if (C173636rf.LIZIZ(recyclerView3.getContext())) {
                                        rect.right = this.LJLIL;
                                    } else {
                                        rect.left = this.LJLIL;
                                    }
                                }
                                if (LIZJ == itemCount - 1) {
                                    if (C173636rf.LIZIZ(recyclerView3.getContext())) {
                                        rect.left = this.LJLIL;
                                        return;
                                    } else {
                                        rect.right = this.LJLIL;
                                        return;
                                    }
                                }
                                if (C173636rf.LIZIZ(recyclerView3.getContext())) {
                                    rect.left = this.LJLIL;
                                } else {
                                    rect.right = this.LJLIL;
                                }
                            }
                        }
                    };
                }
                recyclerView2.LJII(abstractC030309z, -1);
                if (c0a2 == null) {
                    c0a2 = new LinearLayoutManager(0, false);
                }
                recyclerView2.setLayoutManager(c0a2);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return this.LIZ;
    }

    @Override // X.InterfaceC149955uZ
    public final void LJII(List<? extends Effect> list, C150145us enableResult, Effect effect) {
        o.LJIIIZ(enableResult, "enableResult");
        AbstractC167696i5 abstractC167696i5 = this.LIZIZ;
        if (abstractC167696i5 == null || list == null) {
            return;
        }
        if (o.LJ(abstractC167696i5.LJLJJI, list) && o.LJ(abstractC167696i5.LJLJJL, enableResult)) {
            return;
        }
        abstractC167696i5.LJLJJLL = -1;
        abstractC167696i5.LJLJL = -1;
        abstractC167696i5.LJLJJL = enableResult;
        abstractC167696i5.LJLJJI = list;
        int i = !enableResult.LIZ ? 1 : 0;
        abstractC167696i5.LJLJI.clear();
        List<C167736i9> LJLLLLLL = abstractC167696i5.LJLLLLLL(i);
        if (LJLLLLLL != null) {
            abstractC167696i5.LJLJI.addAll(LJLLLLLL);
        }
        for (Effect effect2 : list) {
            abstractC167696i5.LJLJI.add(new C167736i9(effect2, false, false, o.LJ("speech2song", effect2.getEffectId()), i, 0, 2006));
        }
        if (effect == null) {
            abstractC167696i5.notifyDataSetChanged();
        } else {
            Iterator<C167736i9> it = abstractC167696i5.LJLJI.iterator();
            int i2 = 0;
            boolean z = false;
            boolean z2 = false;
            while (it.hasNext()) {
                C167736i9 next = it.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    C167736i9 c167736i9 = next;
                    if (!z && c167736i9.LIZJ) {
                        z = true;
                    }
                    if (!z2 && c167736i9.LIZ != null) {
                        z2 = true;
                    }
                    boolean LJLZ = AbstractC167696i5.LJLZ(effect, c167736i9.LIZ);
                    if (LJLZ) {
                        abstractC167696i5.LJLJL = i2;
                        abstractC167696i5.LJLJJLL = i2;
                    }
                    c167736i9.LJII = LJLZ;
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            abstractC167696i5.notifyDataSetChanged();
        }
        abstractC167696i5.LJZL();
    }
}
