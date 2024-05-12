package Y;

import X.AI8;
import X.ActivityC45651qj;
import X.C26227ARb;
import X.C41008G7o;
import X.C41009G7p;
import X.C68322mC;
import X.C72062SPy;
import X.C8G2;
import X.G63;
import X.InterfaceC88471Ynr;
import X.UC0;
import X.X1D;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS137S0200000_6;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class AObjectS89S0300000_7 implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS89S0300000_7 aObjectS89S0300000_7, Object obj, Object obj2) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS89S0300000_7.l0;
        C41008G7o c41008G7o = (C41008G7o) aObjectS89S0300000_7.l1;
        G63 g63 = (G63) aObjectS89S0300000_7.l2;
        Boolean bool = (Boolean) obj2;
        if (videoPublishContainerScene.LLILZLL != null) {
            if (!bool.booleanValue()) {
                C41009G7p.LIZ(c41008G7o, "turn_off_mature_themes", null);
            }
            videoPublishContainerScene.LLILZLL.creativeFlowData.getPublishConfig().setMatureTheme(bool.booleanValue() ? 1 : 0);
            g63.LJIIJ = !g63.LJ;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AObjectS89S0300000_7 aObjectS89S0300000_7, Object obj, Object obj2) {
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) aObjectS89S0300000_7.l0;
        C41008G7o c41008G7o = (C41008G7o) aObjectS89S0300000_7.l1;
        videoPublishContainerScene.getClass();
        C41009G7p.LIZ(c41008G7o, "turn_on_mature_themes", null);
        ActivityC45651qj context = videoPublishContainerScene.LLII();
        AObjectS127S0200000_7 aObjectS127S0200000_7 = new AObjectS127S0200000_7((G63) aObjectS89S0300000_7.l2, (AI8) obj2, 0);
        o.LJIIIZ(context, "context");
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = "Cancel";
        C26227ARb c26227ARb = new C26227ARb(context);
        c26227ARb.LJ(R.string.i1l);
        C72062SPy c72062SPy = new C72062SPy();
        c72062SPy.LIZJ(R.string.i1t);
        c72062SPy.LJ(0);
        c72062SPy.LIZ = false;
        c72062SPy.LIZIZ(43);
        c72062SPy.LJFF = new AqS154S0200000_7(c41008G7o, context, 45);
        CharSequence LIZ = c72062SPy.LIZ(context);
        C72062SPy c72062SPy2 = new C72062SPy();
        c72062SPy2.LIZJ(R.string.i1u);
        c72062SPy2.LJ(0);
        c72062SPy2.LIZ = false;
        c72062SPy2.LIZIZ(43);
        c72062SPy2.LJFF = new AqS154S0200000_7(c41008G7o, context, 46);
        CharSequence LIZ2 = c72062SPy2.LIZ(context);
        C72062SPy c72062SPy3 = new C72062SPy();
        c72062SPy3.LIZJ(R.string.i1v);
        c72062SPy3.LJ(0);
        c72062SPy3.LIZ = false;
        c72062SPy3.LIZIZ(43);
        c72062SPy3.LJFF = new AqS154S0200000_7(c41008G7o, context, 47);
        CharSequence LIZ3 = c72062SPy3.LIZ(context);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(context.getString(R.string.i1j));
        LIZ4.append("<br/><br/>");
        LIZ4.append(context.getString(R.string.i1k));
        c26227ARb.LIZIZ(C8G2.LIZ(X1D.LIZIZ(LIZ4), LIZ, LIZ2, LIZ3));
        UC0.LIZJ(c26227ARb, new AqS137S0200000_6(aObjectS127S0200000_7, c68322mC, 21));
        c26227ARb.LIZLLL(new AqS173S0100000_7(c41008G7o, 162));
        c26227ARb.LIZJ(new AqS138S0200000_7(c41008G7o, (C41008G7o) c68322mC, (C68322mC<String>) 34));
        c26227ARb.LJI().LIZLLL();
        return null;
    }

    public AObjectS89S0300000_7(VideoPublishContainerScene videoPublishContainerScene, C41008G7o c41008G7o, G63 g63, int i) {
        this.$t = i;
        this.l0 = videoPublishContainerScene;
        this.l1 = c41008G7o;
        this.l2 = g63;
    }
}
