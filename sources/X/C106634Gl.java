package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4Gl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106634Gl extends AbstractC105384Bq implements InterfaceC106614Gj, G27 {
    public final RecyclerView LJLJI;
    public final C106604Gi LJLJJI;

    @Override // X.InterfaceC106614Gj
    public final C59678NbW LIZ() {
        return null;
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        RecyclerView recyclerView = this.LJLJI;
        if (recyclerView != null) {
            recyclerView.setAdapter(this.LJLJJI);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C106634Gl(InterfaceC106584Gg interfaceC106584Gg, ViewGroup parentContainer, List list, C4JP c4jp, int i, int i2, int i3) {
        super(parentContainer, R.layout.atr);
        o.LJIIIZ(parentContainer, "parentContainer");
        View view = this.LJLIL;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.cuk);
        this.LJLJI = recyclerView;
        parentContainer.getContext();
        C106604Gi c106604Gi = new C106604Gi(interfaceC106584Gg, i2, i3);
        this.LJLJJI = c106604Gi;
        recyclerView.setAdapter(c106604Gi);
        c106604Gi.LJLJJI.clear();
        if (list != null) {
            c106604Gi.LJLJJI.addAll(list);
        }
        c106604Gi.notifyDataSetChanged();
        if (i <= 0) {
            StringBuilder LJ = C7MY.LJ("return due to 0 span count ", i, " ,size of emojiList: ");
            LJ.append(list.size());
            C34B.LJI("MiniEmojiChoosePanel", X1D.LIZIZ(LJ));
        } else {
            view.getContext();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(i);
            recyclerView.LJII(c4jp, -1);
            recyclerView.setLayoutManager(gridLayoutManager);
            C9XU.LIZ(parentContainer.getContext().hashCode(), this);
        }
    }
}
