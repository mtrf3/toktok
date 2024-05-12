package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;

/* loaded from: classes16.dex */
public abstract class XWZ extends XWS<MusicModel> {
    @Override // X.XWS
    public final C8HS<MusicModel> LIZIZ() {
        XX9 xx9 = new XX9(this.LJIIIIZZ);
        xx9.LJLJLLL = this.LJIIJ;
        return xx9;
    }

    @Override // X.XWS
    public void LIZLLL() {
        super.LIZLLL();
    }

    public XWZ(Context context, View view, InterfaceC157206Ey interfaceC157206Ey, InterfaceC191547fS interfaceC191547fS, InterfaceC85019XYh<XYN> interfaceC85019XYh, int i) {
        super(context, view, interfaceC157206Ey, R.string.iqj, interfaceC191547fS, interfaceC85019XYh, i);
        this.LIZ.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) this.LIZIZ.getLayoutParams()).topMargin = (int) KL2.LIZJ(this.LIZIZ.getContext(), 10.0f);
        this.LIZIZ.setOverScrollMode(2);
    }
}
