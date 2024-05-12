package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.api.model.AnchorModule;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.GqD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42753GqD extends AbstractC42769GqT<AnchorModule, C42753GqD>.a {
    public C42753GqD(C42752GqC c42752GqC, View view) {
        super(c42752GqC, view);
        View findViewById = view.findViewById(R.id.isi);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.recycler_icons)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        Context context = view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.LJII(new C42756GqG((int) KL2.LIZJ(context, 4.0f)), -1);
        recyclerView.setAdapter(c42752GqC.LIZLLL);
    }
}
