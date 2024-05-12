package X;

import com.bytedance.ies.xelement.viewpager.LynxTabBarView;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VZL implements LHW {
    public final /* synthetic */ LynxTabBarView LJLIL;

    @Override // X.InterfaceC54357LUz
    public final void LIZ(C78856UxA c78856UxA) {
    }

    @Override // X.InterfaceC54357LUz
    public final void LIZJ(C78856UxA c78856UxA) {
    }

    public VZL(LynxTabBarView lynxTabBarView) {
        this.LJLIL = lynxTabBarView;
    }

    @Override // X.InterfaceC54357LUz
    public final void LIZIZ(C78856UxA c78856UxA) {
        String str;
        LynxTabBarView lynxTabBarView = this.LJLIL;
        if (lynxTabBarView.LJLIL) {
            int i = 0;
            if (c78856UxA == null) {
                lynxTabBarView.getClass();
            } else {
                C77798Ug6 c77798Ug6 = lynxTabBarView.LJLILLLLZI;
                if (c77798Ug6 != null) {
                    int tabCount = c77798Ug6.getTabCount();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= tabCount) {
                            break;
                        }
                        C77798Ug6 c77798Ug62 = lynxTabBarView.LJLILLLLZI;
                        if (c77798Ug62 != null) {
                            if (c77798Ug62.getTabAt(i2) == c78856UxA) {
                                i = i2;
                                break;
                            }
                            i2++;
                        } else {
                            o.LJIJI("mTabLayout");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("mTabLayout");
                    throw null;
                }
            }
            VNU lynxContext = this.LJLIL.mContext;
            o.LJFF(lynxContext, "lynxContext");
            VNL vnl = lynxContext.LJLJJL;
            C49615Jdb c49615Jdb = new C49615Jdb(this.LJLIL.getSign(), "change");
            Object obj = ((HashMap) this.LJLIL.LJLJL).get(Integer.valueOf(i));
            if (obj == null) {
                obj = "";
            }
            c49615Jdb.LIZJ(obj, "tag");
            c49615Jdb.LIZJ(Integer.valueOf(i), "index");
            if (this.LJLIL.LJLJJL == c78856UxA) {
                str = "click";
            } else {
                str = "slide";
            }
            c49615Jdb.LIZJ(str, WM7.SCENE_SERVICE);
            vnl.LIZIZ(c49615Jdb);
            this.LJLIL.LJLJJL = null;
        }
    }
}
