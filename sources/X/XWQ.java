package X;

import Y.ARunnableS17S0201000_14;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes16.dex */
public final class XWQ extends XWR<C84934XVa> {
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public long LJIJ;
    public String LJIJI;
    public boolean LJIJJ;

    @Override // X.XWR
    public final C8HS<C84934XVa> LIZIZ() {
        XX7 xx7 = new XX7(this.LJIIIIZZ, this.LJIILL, this.LJIILJJIL);
        xx7.LJLJLLL = this.LJIILLIIL;
        xx7.LJLLI = this.LJIIZILJ;
        xx7.LJLLJ = this.LJIIJ;
        return xx7;
    }

    public final void LJII(Fragment fragment) {
        C4II c4ii = this.LJFF;
        if (c4ii instanceof XX7) {
            ((XX7) c4ii).LJLIL = fragment;
        }
    }

    public final void LJIIIIZZ(XY4 xy4) {
        C4II c4ii = this.LJFF;
        if (c4ii instanceof XX7) {
            ((XX7) c4ii).LJLILLLLZI = xy4;
        }
    }

    public final void LJIIIZ(XVG xvg) {
        C4II c4ii = this.LJFF;
        if (c4ii instanceof XX7) {
            ((XX7) c4ii).LJLJLJ = xvg;
        }
    }

    public final void LJIIJ(Pair<Long, Long> pair) {
        C4II c4ii = this.LJFF;
        if (c4ii instanceof XX7) {
            ((XX7) c4ii).LJLJJI = pair;
        }
    }

    @Override // X.XWR, X.InterfaceC84984XWy
    public final void J5(List<C84934XVa> list, boolean z) {
        super.J5(list, z);
        if (list != null && this.LJIJ > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.LJIJ;
            HashMap LIZJ = C03660Ck.LIZJ("tab_name", "your_sounds");
            LIZJ.put("show_duration", String.valueOf(currentTimeMillis));
            FMX.LJIILJJIL("local_music_show_duration", C78963Uyt.LJJJJIZL(LIZJ));
        }
        if (this.LJIJJ) {
            return;
        }
        this.LJIJJ = true;
        if (TextUtils.isEmpty(this.LJIJI) || list == null) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            MusicModel musicModel = ((C84934XVa) ListProtector.get(list, i)).LIZIZ;
            if (musicModel != null && this.LJIJI.equals(musicModel.getMusicId()) && (this.LJFF instanceof XX7)) {
                this.LIZIZ.post(new ARunnableS17S0201000_14(i, this, musicModel, 18));
                return;
            }
        }
    }

    public XWQ(Context context, View view, XYV xyv, int i, InterfaceC191547fS interfaceC191547fS, C72H<XYM> c72h, int i2, int i3) {
        super(context, view, xyv, i, interfaceC191547fS, c72h, i2, i3);
    }

    public XWQ(Context context, View view, XYV xyv, int i, InterfaceC191547fS interfaceC191547fS, C72H<XYM> c72h, int i2, int i3, int i4) {
        super(context, view, xyv, i, interfaceC191547fS, c72h, i2, i3, i4);
    }

    public XWQ(Context context, View view, XYV xyv, int i, InterfaceC191547fS interfaceC191547fS, C72H<XYM> c72h, int i2, EnumC84975XWp enumC84975XWp, int i3) {
        super(context, view, xyv, i, interfaceC191547fS, c72h, i2, enumC84975XWp, i3);
    }
}
