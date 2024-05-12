package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.HNo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43972HNo extends C43976HNs {
    public final /* synthetic */ C43967HNj LJZI;

    @Override // X.C43976HNs
    public final void N(ViewGroup parent) {
        int i;
        o.LJIIIZ(parent, "parent");
        super.N(parent);
        C72559Sdn c72559Sdn = this.LJLJI;
        if (c72559Sdn != null) {
            c72559Sdn.setRadius(SFS.LJI(6.0d));
        }
        this.LJLJJLL.setGravity(17);
        FrameLayout frameLayout = this.LJLLILLLL;
        if (frameLayout != null) {
            frameLayout.setBackgroundResource(R.drawable.ddb);
        }
        TuxTextView tuxTextView = this.LJLJJLL;
        Integer LIZJ = C72972SkS.LIZJ(tuxTextView, "timeDuration.context", R.attr.dj);
        int i2 = -1;
        if (LIZJ != null) {
            i = LIZJ.intValue();
        } else {
            i = -1;
        }
        tuxTextView.setTextColor(i);
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        Integer LJI = C79045V0n.LJI(R.attr.dj, context);
        if (LJI != null) {
            i2 = LJI.intValue();
        }
        Context context2 = parent.getContext();
        o.LJIIIIZZ(context2, "parent.context");
        int LIZIZ = (int) C74275TDb.LIZIZ(context2, 2.0f);
        Context context3 = parent.getContext();
        o.LJIIIIZZ(context3, "parent.context");
        this.LJLL.setBackground(C78127UlP.LIZJ(i2, 0, LIZIZ, (int) C74275TDb.LIZIZ(context3, 6.0f)));
        this.LJLLJ.setVisibility(8);
        this.LJLLI.setVisibility(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43972HNo(C43967HNj c43967HNj, ViewGroup parent) {
        super(c43967HNj, parent, null);
        o.LJIIIZ(parent, "parent");
        this.LJZI = c43967HNj;
    }
}
