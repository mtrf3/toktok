package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdHybridContainerManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.NFy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59062NFy implements NV4 {
    public final int LJLIL;
    public boolean LJLILLLLZI;
    public View LJLJI;
    public final AbstractC59064NGa LJLJJI;
    public int LJLJJL;

    public final void LIZ() {
        AbstractC59064NGa abstractC59064NGa;
        if (this.LJLJI != null && (abstractC59064NGa = this.LJLJJI) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("activeIndex", this.LJLJJL);
            jSONObject.put("containerKey", this.LJLIL);
            abstractC59064NGa.LJIIIIZZ("onHide", jSONObject);
        }
    }

    @Override // X.NV4
    public final void ze(C58978NCs c58978NCs) {
        this.LJLILLLLZI = true;
        this.LJLJI = c58978NCs.LIZ;
    }

    public final void LIZIZ(int i, FrameLayout frameLayout) {
        View view = this.LJLJI;
        if (view == null) {
            return;
        }
        if (!o.LJ(view.getParent(), frameLayout)) {
            LIZJ(i, frameLayout);
        }
        AbstractC59064NGa abstractC59064NGa = this.LJLJJI;
        if (abstractC59064NGa != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("activeIndex", this.LJLJJL);
            jSONObject.put("containerKey", this.LJLIL);
            abstractC59064NGa.LJIIIIZZ("onShow", jSONObject);
        }
    }

    public final void LIZJ(int i, FrameLayout frameLayout) {
        ViewParent viewParent;
        View view = this.LJLJI;
        if (view != null && !o.LJ(view.getParent(), frameLayout)) {
            frameLayout.removeAllViews();
            View view2 = this.LJLJI;
            if (view2 != null) {
                viewParent = view2.getParent();
            } else {
                viewParent = null;
            }
            ViewGroup viewGroup = (ViewGroup) viewParent;
            if (viewGroup != null) {
                C16880lQ.LJLLL(this.LJLJI, viewGroup);
            }
            frameLayout.addView(this.LJLJI, new ViewGroup.LayoutParams(-1, -1));
        }
        this.LJLJJL = i;
        AbstractC59064NGa abstractC59064NGa = this.LJLJJI;
        if (abstractC59064NGa != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("activeIndex", this.LJLJJL);
            jSONObject.put("containerKey", this.LJLIL);
            abstractC59064NGa.LJIIIIZZ("onUpdate", jSONObject);
        }
    }

    @Override // X.NV4
    public final void Zi(String str, String str2) {
        this.LJLILLLLZI = false;
    }

    public C59062NFy(Context context, Aweme aweme, int i) {
        o.LJIIIZ(aweme, "aweme");
        this.LJLIL = i;
        AbstractC59064NGa LIZJ = AdHybridContainerManager.LIZLLL().LIZJ(NG0.LIZJ(context, aweme), NG0.LIZIZ(context, aweme, i));
        this.LJLJJI = LIZJ;
        if (LIZJ != null) {
            LIZJ.LJIJJ(NG0.LIZIZ(context, aweme, i), this, null);
        }
    }
}
