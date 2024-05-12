package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS196S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WnF, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83337WnF extends AbstractC83335WnD {
    public final View LJLILLLLZI;
    public final InterfaceC88471Ynr<Integer, String, C76800UCe> LJLJI;
    public final RecyclerView LJLJJI;
    public boolean LJLJJL;
    public final C1804476i LJLJJLL;
    public C83355WnX LJLJL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    @Override // X.AbstractC83335WnD
    public final void L(AbstractC83369Wnl message) {
        C83355WnX c83355WnX;
        List<String> list;
        ?? r3;
        o.LJIIIZ(message, "message");
        if (!(message instanceof C83355WnX) || (list = (c83355WnX = (C83355WnX) message).LJ) == null || list.isEmpty()) {
            this.LJLILLLLZI.setVisibility(8);
            return;
        }
        this.LJLILLLLZI.setVisibility(0);
        List<String> list2 = this.LJLJJLL.LJLIL;
        List<String> list3 = c83355WnX.LJ;
        if (list3 != null) {
            r3 = new ArrayList();
            for (String str : list3) {
                if (str.length() > 0) {
                    r3.add(str);
                }
            }
        } else {
            r3 = C61878OQg.INSTANCE;
        }
        ((ArrayList) list2).addAll(r3);
        this.LJLJL = c83355WnX;
        if (this.LJLJJL) {
            return;
        }
        this.LJLJJI.setAdapter(this.LJLJJLL);
        RecyclerView recyclerView = this.LJLJJI;
        this.LJLILLLLZI.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        this.LJLJJI.LJII(new C72762Sh4(null, C173216qz.LIZJ(8.0d, this.LJLILLLLZI.getContext()), EnumC72764Sh6.DIRECTION_TOP), -1);
        this.LJLJJL = true;
    }

    public C83337WnF(View view, C83350WnS c83350WnS) {
        super(view);
        this.LJLILLLLZI = view;
        this.LJLJI = c83350WnS;
        this.LJLJJI = (RecyclerView) view.findViewById(R.id.e5u);
        this.LJLJJLL = new C1804476i(new AqS196S0100000_14(this, 46));
    }
}
