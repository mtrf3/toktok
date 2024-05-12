package X;

import Y.ACListenerS24S0100000_4;
import Y.IDCListenerS280S0100000_4;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.ATe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class DialogC26282ATe extends OOS {
    public final List<WikipediaInfo> LJLJLLL;
    public final java.util.Map<String, String> LJLL;
    public final InterfaceC88472Yns<WikipediaInfo, C76800UCe> LJLLI;
    public final InterfaceC65784Pro<C76800UCe> LJLLILLLL;

    @Override // X.OOS, X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.bi2);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.j9h);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(new C26283ATf(this.LJLJLLL, this.LJLL, new AqS169S0100000_3(this, 775)));
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (this.LJLJLLL.size() > 7) {
            marginLayoutParams.height = (int) KL2.LIZJ(recyclerView.getContext(), 422.0f);
        } else if (this.LJLJLLL.size() <= 4) {
            marginLayoutParams.height = (int) KL2.LIZJ(recyclerView.getContext(), 250.0f);
            recyclerView.setPadding(0, 0, 0, 0);
        } else {
            marginLayoutParams.height = -2;
        }
        recyclerView.setLayoutParams(marginLayoutParams);
        C16880lQ.LJIILLIIL((ImageView) findViewById(R.id.exr), new ACListenerS24S0100000_4(this, 261));
        int LJIIIZ = KL2.LJIIIZ(getContext());
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        int LJJJJLI = LJIIIZ - C63081OpJ.LJJJJLI(context);
        Window window = getWindow();
        if (window != null) {
            if (LJJJJLI == 0) {
                LJJJJLI = -1;
            }
            window.setLayout(-1, LJJJJLI);
            window.setGravity(80);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            window.setAttributes(attributes);
            setCanceledOnTouchOutside(true);
        }
        setOnCancelListener(new IDCListenerS280S0100000_4(this, 4));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC26282ATe(Context context, List list, java.util.Map map, AqS169S0100000_3 aqS169S0100000_3, AqS153S0100000_3 aqS153S0100000_3) {
        super(context, R.style.a6t);
        o.LJIIIZ(context, "context");
        this.LJLJLLL = list;
        this.LJLL = map;
        this.LJLLI = aqS169S0100000_3;
        this.LJLLILLLL = aqS153S0100000_3;
    }
}
