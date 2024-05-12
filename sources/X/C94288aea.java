package X;

import X.InterfaceC94376ag0;
import Y.IDTListenerS124S0100000_42;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.toast.ToastService;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ugc.effectcreator.layer.LayerImpl;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aea, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94288aea<T extends InterfaceC94376ag0> extends C94007aa3 {
    public final int LJ;
    public final int LJFF;
    public final C94286aeY LJI;
    public C93867aXn LJII;
    public final AbstractC94715alT<T, C94389agD> LJIIIIZZ;

    @Override // X.C94007aa3
    public final void LIZJ(RecyclerView.ViewHolder source, RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(source, "source");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94288aea(AbstractC94715alT<T, C94389agD> baseQuickAdapter) {
        super(baseQuickAdapter);
        o.LJIIIZ(baseQuickAdapter, "baseQuickAdapter");
        this.LJIIIIZZ = baseQuickAdapter;
        this.LJ = 15;
        this.LJFF = 32;
        C94286aeY c94286aeY = new C94286aeY(this);
        this.LJI = c94286aeY;
        this.LIZJ = false;
        this.LIZIZ = new IDTListenerS124S0100000_42(this, 2);
        this.LIZ = new C1C8(c94286aeY);
    }

    @Override // X.C94007aa3
    public final void LIZIZ(RecyclerView.ViewHolder viewHolder) {
        RecyclerView recyclerView;
        List<AbstractC94471ahX<InterfaceC94376ag0>> LLFFF;
        int i;
        int i2;
        o.LJIIIZ(viewHolder, "viewHolder");
        C93867aXn c93867aXn = this.LJII;
        if (c93867aXn != null) {
            int LIZ = LIZ(viewHolder);
            if (o.LJ(c93867aXn.LIZIZ.LJLLILLLL, Boolean.FALSE)) {
                float abs = Math.abs(c93867aXn.LIZ);
                View view = viewHolder.itemView;
                if (view != null) {
                    i2 = view.getHeight();
                } else {
                    i2 = 0;
                }
                if (abs > i2) {
                    ToastService toastService = ToastService.INSTANCE;
                    Context context = c93867aXn.LIZIZ.getContext();
                    String string = c93867aXn.LIZIZ.getContext().getString(R.string.hr);
                    o.LJIIIIZZ(string, "context.getString(com.ug…yers_splitScreen_warning)");
                    toastService.showToast(context, string);
                }
            }
            C94855anj c94855anj = c93867aXn.LIZIZ;
            c94855anj.LJLLI = false;
            if (LIZ < 0) {
                return;
            }
            if (((AbstractC94471ahX) ListProtector.get(c94855anj.LJLIL, LIZ)).LJ() == 0 && ((AbstractC94471ahX) ListProtector.get(c93867aXn.LIZIZ.LJLIL, LIZ)).LIZLLL()) {
                C94855anj c94855anj2 = c93867aXn.LIZIZ;
                InterfaceC93998aZu interfaceC93998aZu = (InterfaceC93998aZu) ListProtector.get(c94855anj2.LJLIL, LIZ);
                if (interfaceC93998aZu != null && (LLFFF = c94855anj2.LLFFF(LIZ)) != null) {
                    if (!interfaceC93998aZu.LJJJLZIJ()) {
                        c94855anj2.LJLIL.addAll(LIZ + 1, LLFFF);
                        i = LLFFF.size();
                        interfaceC93998aZu.LIZJ(true);
                    } else {
                        i = 0;
                    }
                    c94855anj2.notifyItemChanged(LIZ);
                    c94855anj2.notifyItemRangeInserted(LIZ + 1, i);
                }
                c93867aXn.LIZIZ.LLFII(false, null);
            }
            C94034aaU.LIZ("CKE-editor", "-----onItemDragEnd---");
            RecyclerView recyclerView2 = c93867aXn.LIZIZ.LJZL().get();
            if (recyclerView2 != null && recyclerView2.getScrollState() == 0 && (recyclerView = c93867aXn.LIZIZ.LJZL().get()) != null && !recyclerView.LJJJLL()) {
                c93867aXn.LIZIZ.notifyDataSetChanged();
            }
            InterfaceC93865aXl interfaceC93865aXl = c93867aXn.LIZIZ.LJLJLJ;
            if (interfaceC93865aXl != null) {
                interfaceC93865aXl.o3();
            }
            LayerImpl LIZ2 = C93425aQf.LIZ();
            if (LIZ2 != null && !LIZ2.getLayerDetailStatus()) {
                c93867aXn.LIZIZ.LLIIIJ(false);
                c93867aXn.LIZIZ.LLFZ(false, null);
            }
            InterfaceC93865aXl interfaceC93865aXl2 = c93867aXn.LIZIZ.LJLJLJ;
            if (interfaceC93865aXl2 == null) {
                return;
            }
            interfaceC93865aXl2.s3();
        }
    }

    @Override // X.C94007aa3
    public final void LIZLLL(RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(viewHolder, "viewHolder");
        C93867aXn c93867aXn = this.LJII;
        if (c93867aXn != null) {
            LIZ(viewHolder);
            c93867aXn.LIZIZ.onEventLayerAction("drag");
            C94855anj c94855anj = c93867aXn.LIZIZ;
            c94855anj.LJLLI = true;
            c94855anj.LJLLILLLL = null;
            c93867aXn.LIZ = 0.0f;
        }
    }

    public final void LJFF(int i, int i2, RecyclerView.ViewHolder source, RecyclerView.ViewHolder viewHolder) {
        int i3;
        List<InterfaceC93998aZu> LIZIZ;
        o.LJIIIZ(source, "source");
        int LIZ = LIZ(source);
        int LIZ2 = LIZ(viewHolder);
        if (!this.LJIIIIZZ.LLF(LIZ, LIZ2)) {
            return;
        }
        if (LIZ >= 0 && LIZ < this.LJIIIIZZ.LJLIL.size() && LIZ2 >= 0 && LIZ2 < this.LJIIIIZZ.LJLIL.size()) {
            if (LIZ < LIZ2) {
                if (((InterfaceC93998aZu) ListProtector.get(this.LJIIIIZZ.LJLIL, LIZ2)).LJJJLZIJ() && (LIZIZ = ((InterfaceC93998aZu) ListProtector.get(this.LJIIIIZZ.LJLIL, LIZ2)).LIZIZ()) != null) {
                    i3 = LIZIZ.size();
                } else {
                    i3 = 0;
                }
                int i4 = LIZ;
                while (i4 < LIZ2) {
                    int i5 = i4 + 1;
                    Collections.swap(this.LJIIIIZZ.LJLIL, i4, i5);
                    i4 = i5;
                }
                for (int i6 = 0; i6 < i3; i6++) {
                    int i7 = LIZ2 + i6;
                    Collections.swap(this.LJIIIIZZ.LJLIL, i7, i7 + 1);
                }
                int i8 = LIZ2 + i3;
                this.LJIIIIZZ.notifyItemMoved(source.getAdapterPosition(), i8);
                C93867aXn c93867aXn = this.LJII;
                if (c93867aXn != null) {
                    C94855anj c94855anj = c93867aXn.LIZIZ;
                    InterfaceC93865aXl interfaceC93865aXl = c94855anj.LJLJLJ;
                    if (interfaceC93865aXl != null) {
                        interfaceC93865aXl.p3((InterfaceC94376ag0) ListProtector.get(c94855anj.LJLIL, i8), LIZ, i8);
                    }
                    c93867aXn.LIZIZ.onEventLayerAction("drag_complete");
                    return;
                }
                return;
            }
            int i9 = LIZ2 + 1;
            if (LIZ >= i9) {
                int i10 = LIZ;
                while (true) {
                    int i11 = i10 - 1;
                    Collections.swap(this.LJIIIIZZ.LJLIL, i10, i11);
                    if (i10 == i9) {
                        break;
                    } else {
                        i10 = i11;
                    }
                }
            }
            this.LJIIIIZZ.notifyItemMoved(source.getAdapterPosition(), viewHolder.getAdapterPosition());
            C93867aXn c93867aXn2 = this.LJII;
            if (c93867aXn2 != null) {
                C94855anj c94855anj2 = c93867aXn2.LIZIZ;
                InterfaceC93865aXl interfaceC93865aXl2 = c94855anj2.LJLJLJ;
                if (interfaceC93865aXl2 != null) {
                    interfaceC93865aXl2.p3((InterfaceC94376ag0) ListProtector.get(c94855anj2.LJLIL, LIZ2), LIZ, LIZ2);
                }
                c93867aXn2.LIZIZ.onEventLayerAction("drag_complete");
            }
        }
    }
}
