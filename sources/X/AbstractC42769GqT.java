package X;

import Y.ACListenerS42S0200000_7;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.GqT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42769GqT<T, VH extends RecyclerView.ViewHolder> extends AbstractC31414CUo<T, VH> {
    public final InterfaceC42726Gpm LIZIZ;
    public C42770GqU LIZJ;

    public AbstractC42769GqT(InterfaceC42726Gpm interfaceC42726Gpm) {
        this.LIZIZ = interfaceC42726Gpm;
    }

    /* renamed from: X.GqT$a */
    /* loaded from: classes8.dex */
    public class a extends RecyclerView.ViewHolder {
        public a(AbstractC42769GqT abstractC42769GqT, View view) {
            super(view);
            C16880lQ.LJIIJ(new ACListenerS42S0200000_7(this, abstractC42769GqT, 45), view);
        }
    }

    /* renamed from: X.GqT$c */
    /* loaded from: classes8.dex */
    public class c extends RecyclerView.ViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view, String fragmentType) {
            super(view);
            o.LJIIIZ(fragmentType, "fragmentType");
        }
    }
}
