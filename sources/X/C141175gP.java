package X;

import Y.ACListenerS22S0100000_2;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.gamora.editorpro.soundeffect.model.SoundEffectTabModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5gP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141175gP extends PagerAdapter {
    public final ActivityC45651qj LJLILLLLZI;
    public final InterfaceC141035gB LJLJI;
    public final ArrayList<SoundEffectTabModel> LJLJJI;
    public final SparseArray<C141185gQ> LJLJJL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LJLJJI.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup container) {
        View view;
        o.LJIIIZ(container, "container");
        if (this.LJLJJL.get(i) == null) {
            view = C28289B8j.LIZ(container, R.layout.asw, container, false);
            ActivityC45651qj activityC45651qj = this.LJLILLLLZI;
            InterfaceC141035gB interfaceC141035gB = this.LJLJI;
            Object obj = ListProtector.get(this.LJLJJI, i);
            o.LJIIIIZZ(obj, "list[position]");
            o.LJIIIIZZ(view, "view");
            C141185gQ c141185gQ = new C141185gQ(activityC45651qj, interfaceC141035gB, (SoundEffectTabModel) obj, view, i);
            if (c141185gQ.LIZIZ.id != null) {
                c141185gQ.LJIILIIL = (RecyclerView) c141185gQ.LIZJ.findViewById(R.id.j9u);
                c141185gQ.LJIIJ = c141185gQ.LIZJ.findViewById(R.id.izz);
                c141185gQ.LJIIJJI = c141185gQ.LIZJ.findViewById(R.id.izt);
                c141185gQ.LJIIL = (TextView) c141185gQ.LIZJ.findViewById(R.id.izy);
                c141185gQ.LJIILJJIL = (C73305Spp) c141185gQ.LIZJ.findViewById(R.id.k7i);
                View view2 = c141185gQ.LJIIJ;
                if (view2 != null) {
                    C16880lQ.LJIIJ(new ACListenerS22S0100000_2(c141185gQ, 85), view2);
                }
                c141185gQ.LIZ(c141185gQ.LJII);
            }
            this.LJLJJL.put(i, c141185gQ);
            container.addView(view);
        } else {
            view = this.LJLJJL.get(i).LIZJ;
            container.addView(view);
        }
        o.LJIIIIZZ(view, "if (itemList[position] =…)\n            }\n        }");
        return view;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object obj) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(obj, "obj");
        return o.LJ(view, obj);
    }

    public C141175gP(ActivityC45651qj activityC45651qj, C141015g9 soundEffectItemEventListener, ArrayList arrayList) {
        o.LJIIIZ(soundEffectItemEventListener, "soundEffectItemEventListener");
        this.LJLILLLLZI = activityC45651qj;
        this.LJLJI = soundEffectItemEventListener;
        this.LJLJJI = arrayList;
        this.LJLJJL = new SparseArray<>();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object obj) {
        View view;
        o.LJIIIZ(container, "container");
        o.LJIIIZ(obj, "obj");
        if ((obj instanceof View) && (view = (View) obj) != null) {
            C16880lQ.LJLLL(view, container);
        }
    }

    public final void LJJIII(OSZ<Integer, Integer> position, EnumC141135gL type, int i) {
        List<C141225gU> data;
        C141225gU c141225gU;
        o.LJIIIZ(position, "position");
        o.LJIIIZ(type, "type");
        C141185gQ c141185gQ = this.LJLJJL.get(position.getFirst().intValue());
        int intValue = position.getSecond().intValue();
        c141185gQ.getClass();
        C141455gr c141455gr = c141185gQ.LJ;
        if (c141455gr == null || (data = c141455gr.getData()) == null || (c141225gU = (C141225gU) ORZ.LJLLLLLL(intValue, data)) == null) {
            return;
        }
        int i2 = C141125gK.LIZ[type.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        c141225gU.LJLJJI = i;
                    }
                } else {
                    c141225gU.LJLJJL = i;
                }
            } else {
                c141225gU.LJLJI = i;
            }
        } else {
            c141225gU.LJLILLLLZI = i;
        }
        c141455gr.notifyItemChanged(intValue);
    }
}
