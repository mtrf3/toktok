package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.56T, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C56T extends C0A6 {
    public final RecyclerView LJLIL;
    public final InterfaceC88471Ynr<AnonymousClass523, Integer, C76800UCe> LJLJI;
    public final float LJLILLLLZI = 0.5f;
    public final HashSet<String> LJLJJI = new HashSet<>();

    public final void LJIILLIIL() {
        C0A2 layoutManager;
        int i;
        int i2;
        AbstractC1286553d<?> LJIIZILJ;
        ArrayList<AnonymousClass523> arrayList;
        View LJJIJIL;
        double d;
        RecyclerView recyclerView = this.LJLIL;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            i2 = linearLayoutManager.LLILL();
            i = linearLayoutManager.LLILLJJLI();
        } else {
            i = -1;
            i2 = -1;
        }
        OSZ osz = new OSZ(Integer.valueOf(i2), Integer.valueOf(i));
        int intValue = ((Number) osz.getFirst()).intValue();
        int intValue2 = ((Number) osz.getSecond()).intValue();
        if (intValue == -1 || intValue2 == -1 || (LJIIZILJ = LJIIZILJ()) == null || (arrayList = LJIIZILJ.LJLIL) == null || intValue > intValue2) {
            return;
        }
        while (true) {
            AnonymousClass523 anonymousClass523 = (AnonymousClass523) ORZ.LJLLLLLL(intValue, arrayList);
            if (anonymousClass523 != null && !this.LJLJJI.contains(anonymousClass523.LJ) && (LJJIJIL = layoutManager.LJJIJIL(intValue)) != null) {
                Rect rect = new Rect();
                if (LJJIJIL.getLocalVisibleRect(rect)) {
                    double height = LJJIJIL.getHeight();
                    double width = LJJIJIL.getWidth();
                    double d2 = rect.left;
                    double d3 = rect.top;
                    double d4 = rect.right;
                    double d5 = rect.bottom;
                    if (d2 == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                        if (d4 == width) {
                            if (d3 == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                                if (d5 == height) {
                                    d = 1.0d;
                                }
                            } else {
                                d5 = height - d3;
                            }
                            d = d5 / height;
                        } else {
                            d = d4 / width;
                        }
                    } else {
                        d = (width - d2) / width;
                    }
                    if (d >= this.LJLILLLLZI) {
                        this.LJLJJI.add(anonymousClass523.LJ);
                        this.LJLJI.invoke(anonymousClass523, Integer.valueOf(intValue));
                    }
                }
            }
            if (intValue == intValue2) {
                return;
            } else {
                intValue++;
            }
        }
    }

    public final AbstractC1286553d<?> LJIIZILJ() {
        AbstractC029409q abstractC029409q;
        RecyclerView recyclerView = this.LJLIL;
        if (recyclerView != null) {
            abstractC029409q = recyclerView.getAdapter();
        } else {
            abstractC029409q = null;
        }
        if (!(abstractC029409q instanceof AbstractC1286553d)) {
            return null;
        }
        return (AbstractC1286553d) abstractC029409q;
    }

    public C56T(RecyclerView recyclerView, InterfaceC88471Ynr interfaceC88471Ynr) {
        this.LJLIL = recyclerView;
        this.LJLJI = interfaceC88471Ynr;
        if (recyclerView != null) {
            recyclerView.LJIIJJI(this);
        }
        AbstractC1286553d<?> LJIIZILJ = LJIIZILJ();
        if (LJIIZILJ != null) {
            LJIIZILJ.registerAdapterDataObserver(new AbstractC029609s() { // from class: X.56U
                public List<AnonymousClass523> LJLIL;

                @Override // X.AbstractC029609s
                public final void LIZJ() {
                    List<AnonymousClass523> list;
                    ArrayList<AnonymousClass523> arrayList;
                    AbstractC1286553d<?> LJIIZILJ2 = C56T.this.LJIIZILJ();
                    if (LJIIZILJ2 != null && (arrayList = LJIIZILJ2.LJLIL) != null) {
                        list = ORZ.LLJILJILJ(arrayList);
                    } else {
                        list = null;
                    }
                    List<AnonymousClass523> list2 = this.LJLIL;
                    if (list2 != null && !list2.isEmpty() && list != null && !list.isEmpty() && list2.size() == list.size()) {
                        int i = 0;
                        for (AnonymousClass523 anonymousClass523 : list2) {
                            int i2 = i + 1;
                            if (i >= 0) {
                                if (o.LJ(ORZ.LJLLLLLL(i, list), anonymousClass523)) {
                                    i = i2;
                                }
                            } else {
                                C47261Igj.LJJJJJ();
                                throw null;
                            }
                        }
                        C56T.this.LJIILLIIL();
                    }
                    C56T.this.LJLJJI.clear();
                    this.LJLIL = list;
                    C56T.this.LJIILLIIL();
                }

                @Override // X.AbstractC029609s
                public final void LIZLLL(int i, int i2) {
                    C56T.this.LJIILLIIL();
                }

                @Override // X.AbstractC029609s
                public final void LJFF(int i, int i2) {
                    C56T.this.LJIILLIIL();
                }

                @Override // X.AbstractC029609s
                public final void LJI(int i, int i2) {
                    C56T.this.LJIILLIIL();
                }

                @Override // X.AbstractC029609s
                public final void LJII(int i, int i2) {
                    C56T.this.LJIILLIIL();
                }
            });
        }
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            LJIILLIIL();
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        o.LJIIIZ(recyclerView, "recyclerView");
        LJIILLIIL();
    }
}
