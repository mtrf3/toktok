package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NVQ implements NV3 {
    public final /* synthetic */ NVO LIZ;

    @Override // X.NV3
    public final void LIZ() {
    }

    @Override // X.NV3
    public final void LIZJ() {
    }

    @Override // X.NV3
    public final ViewGroup LIZIZ() {
        ViewGroup viewGroup;
        View view = this.LIZ.LJLILLLLZI;
        if (view == null || (viewGroup = (ViewGroup) view.findViewById(R.id.l_7)) == null) {
            C39836FkG.LJII.getClass();
            return new C59460NVg(C38262Ezy.LIZ().LIZIZ().getBaseContext());
        }
        return viewGroup;
    }

    public NVQ(NVO nvo) {
        this.LIZ = nvo;
    }

    @Override // X.NV3
    public final View LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ.LJJL(context);
        View view = this.LIZ.LJLILLLLZI;
        o.LJII(view, "null cannot be cast to non-null type android.view.ViewGroup");
        return view;
    }
}
