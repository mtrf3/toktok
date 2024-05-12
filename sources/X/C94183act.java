package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.effectcreatormobile.objectselect.prefab.PrefabPanelFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.act, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94183act implements InterfaceC93628aTw {
    public final /* synthetic */ PrefabPanelFragment LIZ;

    @Override // X.InterfaceC93628aTw
    public final void LIZ(C93633aU1 tab) {
        o.LJIIIZ(tab, "tab");
    }

    public C94183act(PrefabPanelFragment prefabPanelFragment) {
        this.LIZ = prefabPanelFragment;
    }

    @Override // X.InterfaceC93628aTw
    public final void LIZJ(C93633aU1 c93633aU1) {
        TextView textView;
        View view = c93633aU1.LIZLLL;
        if (view != null && (textView = (TextView) view.findViewById(R.id.npj)) != null) {
            textView.setTextColor(this.LIZ.getResources().getColor(R.color.adp));
        }
    }

    @Override // X.InterfaceC93628aTw
    public final void LIZIZ(C93633aU1 tab, boolean z) {
        TextView textView;
        o.LJIIIZ(tab, "tab");
        View view = tab.LIZLLL;
        if (view != null && (textView = (TextView) view.findViewById(R.id.npj)) != null) {
            textView.setTextColor(this.LIZ.getResources().getColor(R.color.adn));
        }
    }
}
