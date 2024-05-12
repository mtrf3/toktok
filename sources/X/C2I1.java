package X;

import android.content.Context;
import android.graphics.Point;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFlyMicViewUsePoolSetting;
import kotlin.jvm.internal.IDqS40S0300000;
import kotlin.jvm.internal.o;

/* renamed from: X.2I1, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C2I1 extends TBS implements InterfaceC88472Yns<C33611Tp, C76800UCe> {
    public C2I1(C14520hc c14520hc) {
        super(1, c14520hc, C14520hc.class, "handleSmallFlyMicGiftStartEvent", "handleSmallFlyMicGiftStartEvent(Lcom/bytedance/android/live/linkmic/FlyMicGiftAnimaInfo;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C33611Tp c33611Tp) {
        Integer num;
        C2A4 LIZ;
        C33611Tp p0 = c33611Tp;
        o.LJIIIZ(p0, "p0");
        C14520hc c14520hc = (C14520hc) this.receiver;
        c14520hc.getClass();
        boolean z = true;
        if (!C74838TYs.LJ().LJJIZ.equals("grid_fix") && !C74838TYs.LJ().LJJIZ.equals("float_fix") && ((!C74838TYs.LJ().LJJIZ.equals("grid") && !C74838TYs.LJ().LJJIZ.equals("float")) || C74838TYs.LJ().LJJ < 1)) {
            z = false;
        }
        if (!z) {
            C14480hY.LIZIZ(new C33611Tp(p0.LJLIL, new OSZ(new Point(0, 0), new Point(0, 0)), 2, 0L, 8), 5, 2, 2, false);
            C0NB.LIZIZ("LiveLinkMicGiftFlyAnimationHelper", "layout condition is invalid, so return");
        } else {
            long j = p0.LJLIL.LJ;
            java.util.Map map = (java.util.Map) c14520hc.LIZ.kv0(BDA.class);
            if (map != null && (num = (Integer) map.get(Long.valueOf(j))) != null) {
                int intValue = (int) (num.intValue() * 1.2f);
                int i = intValue / 2;
                float f = p0.LJLILLLLZI.getFirst().x - i;
                float f2 = p0.LJLILLLLZI.getFirst().y - i;
                if (MultiGuestFlyMicViewUsePoolSetting.INSTANCE.isEnable()) {
                    if (c14520hc.LJFF == null) {
                        c14520hc.LJFF = new C42951mN<>();
                    }
                    C42951mN<C2A4> c42951mN = c14520hc.LJFF;
                    if (c42951mN == null || (LIZ = c42951mN.LIZIZ()) == null) {
                        LIZ = c14520hc.LIZ(intValue, p0);
                    }
                } else {
                    LIZ = c14520hc.LIZ(intValue, p0);
                }
                ViewGroup viewGroup = c14520hc.LIZIZ;
                if (viewGroup != null) {
                    viewGroup.addView(LIZ);
                }
                Context context = c14520hc.LIZJ;
                if (context != null) {
                    C14480hY.LIZ(LIZ, context, p0.LJLIL.LJIIJ, new C517221g(c14520hc, LIZ, p0, f, f2), new IDqS40S0300000(c14520hc, LIZ, p0, 2));
                }
            } else {
                C14480hY.LIZIZ(p0, 7, p0.LJLJI, 2, false);
                C0NB.LJ("LiveLinkMicGiftFlyAnimationHelper", "return for originSize is null");
            }
        }
        return C76800UCe.LIZ;
    }
}
