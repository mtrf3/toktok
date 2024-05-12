package X;

import com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager;
import kotlin.jvm.internal.o;

/* renamed from: X.VTj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79795VTj implements InterfaceC79796VTk {
    public final /* synthetic */ BaseLynxViewPager LIZ;

    public C79795VTj(BaseLynxViewPager baseLynxViewPager) {
        this.LIZ = baseLynxViewPager;
    }

    @Override // X.InterfaceC79796VTk
    public final void LIZ(int i, String str) {
        BaseLynxViewPager baseLynxViewPager = this.LIZ;
        baseLynxViewPager.getClass();
        int hashCode = str.hashCode();
        if (hashCode != -1562311453) {
            if (hashCode != 115212373 || !str.equals("tabbarcellappear")) {
                return;
            }
        } else if (!str.equals("tabbarcelldisappear")) {
            return;
        }
        VNU lynxContext = baseLynxViewPager.mContext;
        o.LJFF(lynxContext, "lynxContext");
        VNL vnl = lynxContext.LJLJJL;
        C49615Jdb c49615Jdb = new C49615Jdb(baseLynxViewPager.getSign(), str);
        c49615Jdb.LIZJ(Integer.valueOf(i), "position");
        vnl.LIZIZ(c49615Jdb);
    }
}
