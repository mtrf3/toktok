package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ht4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45478Ht4 extends AbstractViewOnClickListenerC81978WFi {
    public final /* synthetic */ C45475Ht1 LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45478Ht4(C45475Ht1 c45475Ht1) {
        super(1100, 2);
        this.LJLJJLL = c45475Ht1;
    }

    @Override // X.AbstractViewOnClickListenerC81978WFi
    public final void LIZ(View v) {
        o.LJIIIZ(v, "v");
        G8G.LIZ.start("av_video_edit", "click onNext btn");
        C45475Ht1 c45475Ht1 = this.LJLJJLL;
        if (!c45475Ht1.LJIIL) {
            C45632HvY c45632HvY = c45475Ht1.LJ;
            if (c45632HvY != null) {
                C26045AKb c26045AKb = new C26045AKb(c45632HvY);
                c26045AKb.LJIIIIZZ(R.string.fgx);
                c26045AKb.LJIIJ();
                C45475Ht1 c45475Ht12 = this.LJLJJLL;
                c45475Ht12.getClass();
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("creation_id", c45475Ht12.LIZ);
                c188727au.LJIIIZ("shoot_way", c45475Ht12.LIZIZ);
                c188727au.LJIIIZ("enter_from", c45475Ht12.LIZLLL);
                c188727au.LJIIIZ("fail_type", "no_video");
                FMX.LJIIL("upload_sound_from_video_popup_show", c188727au.LIZ);
                C45475Ht1 c45475Ht13 = this.LJLJJLL;
                InterfaceC45535Htz interfaceC45535Htz = c45475Ht13.LJI;
                if (interfaceC45535Htz != null) {
                    interfaceC45535Htz.LIZJ(false, c45475Ht13.LJFF);
                    return;
                }
                return;
            }
            o.LJIJI("extractMusicView");
            throw null;
        }
        InterfaceC45535Htz interfaceC45535Htz2 = c45475Ht1.LJI;
        if (interfaceC45535Htz2 != null) {
            interfaceC45535Htz2.LIZJ(true, c45475Ht1.LJFF);
        }
    }
}
