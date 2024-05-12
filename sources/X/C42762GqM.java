package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import kotlin.jvm.internal.o;

/* renamed from: X.GqM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42762GqM extends AbstractC42769GqT<AnchorCell, RecyclerView.ViewHolder> {
    public C42762GqM(InterfaceC42726Gpm interfaceC42726Gpm) {
        super(interfaceC42726Gpm);
    }

    @Override // X.AbstractC31414CUo
    public final void LIZ(RecyclerView.ViewHolder holder, Object cell) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(cell, "cell");
    }

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return new C42763GqN(new View(parent.getContext()));
    }
}
