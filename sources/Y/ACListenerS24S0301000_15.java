package Y;

import X.C68322mC;
import X.C86904Y8u;
import X.InterfaceC82683Wch;
import X.InterfaceC86908Y8y;
import X.VW9;
import X.XZH;
import X.XZJ;
import X.XZO;
import X.XZQ;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class ACListenerS24S0301000_15 implements View.OnClickListener {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS24S0301000_15 aCListenerS24S0301000_15, View view) {
        if (!((C86904Y8u) aCListenerS24S0301000_15.l2).LJLJL) {
            return;
        }
        InterfaceC86908Y8y interfaceC86908Y8y = (InterfaceC86908Y8y) aCListenerS24S0301000_15.l0;
        if (interfaceC86908Y8y != null) {
            interfaceC86908Y8y.LIZJ(3);
        }
        ((ViewPager) aCListenerS24S0301000_15.l1).setCurrentItem(aCListenerS24S0301000_15.i3);
    }

    public static final void onClick$1(ACListenerS24S0301000_15 aCListenerS24S0301000_15, View view) {
        if (!((C86904Y8u) aCListenerS24S0301000_15.l2).LJLJL) {
            return;
        }
        InterfaceC86908Y8y interfaceC86908Y8y = (InterfaceC86908Y8y) aCListenerS24S0301000_15.l0;
        if (interfaceC86908Y8y != null) {
            interfaceC86908Y8y.LIZJ(17);
        }
        ((ViewPager) aCListenerS24S0301000_15.l1).setCurrentItem(aCListenerS24S0301000_15.i3);
    }

    public static final void onClick$2(ACListenerS24S0301000_15 aCListenerS24S0301000_15, View view) {
        C86904Y8u c86904Y8u = (C86904Y8u) aCListenerS24S0301000_15.l0;
        InterfaceC86908Y8y interfaceC86908Y8y = (InterfaceC86908Y8y) aCListenerS24S0301000_15.l1;
        ViewPager viewPager = (ViewPager) aCListenerS24S0301000_15.l2;
        int i = aCListenerS24S0301000_15.i3;
        if (!c86904Y8u.LJLJL) {
            return;
        }
        if (interfaceC86908Y8y != null) {
            interfaceC86908Y8y.LIZJ(18);
        }
        viewPager.setCurrentItem(i);
    }

    public static final void onClick$3(ACListenerS24S0301000_15 aCListenerS24S0301000_15, View view) {
        C86904Y8u c86904Y8u = (C86904Y8u) aCListenerS24S0301000_15.l0;
        InterfaceC86908Y8y interfaceC86908Y8y = (InterfaceC86908Y8y) aCListenerS24S0301000_15.l1;
        ViewPager viewPager = (ViewPager) aCListenerS24S0301000_15.l2;
        int i = aCListenerS24S0301000_15.i3;
        if (!c86904Y8u.LJLJL) {
            return;
        }
        if (interfaceC86908Y8y != null) {
            interfaceC86908Y8y.LIZJ(19);
        }
        viewPager.setCurrentItem(i);
    }

    public static final void onClick$4(ACListenerS24S0301000_15 aCListenerS24S0301000_15, View view) {
        List<MusicModel> data;
        VerticalMusicView verticalMusicView = (VerticalMusicView) aCListenerS24S0301000_15.l0;
        XZH xzh = verticalMusicView.LJLJL;
        if (xzh != null) {
            XZO xzo = xzh.LJIILL;
            MusicModel musicModel = (MusicModel) aCListenerS24S0301000_15.l1;
            XZQ LJIIL = verticalMusicView.LJIIL();
            if (LJIIL != null) {
                String musicId = ((MusicModel) aCListenerS24S0301000_15.l1).getMusicId();
                o.LJIIIIZZ(musicId, "model.musicId");
                LJIIL.pp(musicId);
            }
            xzo.LJIIIIZZ(musicModel);
            XZQ LJIIL2 = ((VerticalMusicView) aCListenerS24S0301000_15.l0).LJIIL();
            if (LJIIL2 != null) {
                String musicId2 = ((MusicModel) aCListenerS24S0301000_15.l1).getMusicId();
                o.LJIIIIZZ(musicId2, "model.musicId");
                LJIIL2.U20(musicId2);
            }
            XZJ xzj = ((VerticalMusicView) aCListenerS24S0301000_15.l0).LLJJ;
            if (xzj != null && (data = xzj.getData()) != null) {
                ListProtector.remove(data, aCListenerS24S0301000_15.i3);
            }
            XZJ xzj2 = ((VerticalMusicView) aCListenerS24S0301000_15.l0).LLJJ;
            if (xzj2 != null) {
                xzj2.notifyItemRemoved(aCListenerS24S0301000_15.i3);
            }
            VerticalMusicView verticalMusicView2 = (VerticalMusicView) aCListenerS24S0301000_15.l0;
            verticalMusicView2.LJIIIZ(verticalMusicView2.LLJJ, false);
            ((VerticalMusicView) aCListenerS24S0301000_15.l0).LLJJI = null;
            InterfaceC82683Wch interfaceC82683Wch = (InterfaceC82683Wch) ((C68322mC) aCListenerS24S0301000_15.l2).element;
            if (interfaceC82683Wch != null) {
                interfaceC82683Wch.dismiss();
                return;
            }
            return;
        }
        o.LJIJI("params");
        throw null;
    }

    public ACListenerS24S0301000_15(C86904Y8u c86904Y8u, InterfaceC86908Y8y interfaceC86908Y8y, VW9 vw9, int i, int i2) {
        this.$t = i2;
        switch (i2) {
            case 0:
            case 1:
                this.l2 = c86904Y8u;
                this.l0 = interfaceC86908Y8y;
                this.l1 = vw9;
                this.i3 = i;
                return;
            default:
                this.l0 = c86904Y8u;
                this.l1 = interfaceC86908Y8y;
                this.l2 = vw9;
                this.i3 = i;
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS24S0301000_15(VerticalMusicView verticalMusicView, VerticalMusicView verticalMusicView2, MusicModel musicModel, int i, C68322mC<InterfaceC82683Wch> c68322mC) {
        this.$t = c68322mC;
        this.l0 = verticalMusicView;
        this.l1 = verticalMusicView2;
        this.i3 = musicModel;
        this.l2 = i;
    }
}
