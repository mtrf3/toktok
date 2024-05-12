package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.api.model.AnchorModule;
import kotlin.jvm.internal.o;

/* renamed from: X.GqE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42754GqE extends AbstractC42769GqT<AnchorModule, RecyclerView.ViewHolder> {
    public C42754GqE(InterfaceC42726Gpm interfaceC42726Gpm) {
        super(interfaceC42726Gpm);
    }

    @Override // X.AbstractC31414CUo
    public final void LIZ(RecyclerView.ViewHolder holder, Object module) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(module, "module");
    }

    @Override // X.AbstractC31414CUo
    public final RecyclerView.ViewHolder LIZJ(LayoutInflater layoutInflater, ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return new C42764GqO(new View(parent.getContext()));
    }
}
