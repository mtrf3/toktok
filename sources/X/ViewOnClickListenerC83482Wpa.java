package X;

import android.view.View;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Wpa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnClickListenerC83482Wpa implements View.OnClickListener {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ C83483Wpb LJLILLLLZI;

    public ViewOnClickListenerC83482Wpa(View view, C83483Wpb c83483Wpb, Effect effect) {
        this.LJLIL = view;
        this.LJLILLLLZI = c83483Wpb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        C83483Wpb c83483Wpb;
        InterfaceC83481WpZ interfaceC83481WpZ;
        if (this.LJLIL.getAlpha() == 1.0f && (interfaceC83481WpZ = (c83483Wpb = this.LJLILLLLZI).LJJII) != null) {
            interfaceC83481WpZ.LJFF(c83483Wpb.LJI.LJLZ());
        }
        List LLJILJILJ = ORZ.LLJILJILJ(((LinkedHashMap) this.LJLILLLLZI.LJI.LJLJJL).keySet());
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) LLJILJILJ).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((C83489Wph) next).LJI == 2) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            str = "photo";
        } else {
            str = "video";
        }
        if (!r4.isEmpty()) {
        }
        C83483Wpb c83483Wpb2 = this.LJLILLLLZI;
        InterfaceC83485Wpd interfaceC83485Wpd = c83483Wpb2.LJJIFFI;
        if (interfaceC83485Wpd != null) {
            ((ArrayList) c83483Wpb2.LJI.LJLZ()).size();
            interfaceC83485Wpd.onComplete(str);
        }
    }
}
