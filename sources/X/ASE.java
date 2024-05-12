package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ASE extends FrameLayout implements ASH {
    public List<AS4> LJLIL;
    public final ASC LJLILLLLZI;
    public ASH LJLJI;
    public final C252709vu LJLJJI;

    public final C252709vu getNavBar() {
        return this.LJLJJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ASE(Context context) {
        super(context);
        new LinkedHashMap();
        this.LJLIL = C61878OQg.INSTANCE;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.bm1, this, true);
        View findViewById = findViewById(R.id.jjn);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.secondary_action_list)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        View findViewById2 = findViewById(R.id.cbt);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.dislike_reasons_navbar)");
        C252709vu c252709vu = (C252709vu) findViewById2;
        this.LJLJJI = c252709vu;
        ASC asc = new ASC(this);
        this.LJLILLLLZI = asc;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        List<AS4> actions = this.LJLIL;
        o.LJIIIZ(actions, "actions");
        asc.LJLILLLLZI = actions;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(asc);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        Integer LJI = C79045V0n.LJI(R.attr.c9, context2);
        if (LJI != null) {
            c252709vu.setNavBackground(LJI.intValue());
        }
        C26338AVi.LJI(recyclerView, AnonymousClass391.LIZJ(8), AnonymousClass391.LIZJ(8), AnonymousClass391.LIZJ(8), null, false, 24);
        C26338AVi.LJIIIZ(recyclerView, null, AnonymousClass391.LIZJ(4), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4))), 21);
    }

    @Override // X.ASH
    public final void LIZ(AS4 action) {
        o.LJIIIZ(action, "action");
        ASH ash = this.LJLJI;
        if (ash != null) {
            ash.LIZ(action);
        }
    }
}
