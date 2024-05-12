package com.ss.android.ugc.aweme.relation.feed;

import X.C221018lt;
import X.C221108m2;
import X.C36636EZk;
import X.C47261Igj;
import X.C57626MjW;
import X.C57631Mjb;
import X.C57633Mjd;
import X.C57634Mje;
import X.C57636Mjg;
import X.C57642Mjm;
import X.C57686MkU;
import X.C61878OQg;
import X.C62822Ol8;
import X.InterfaceC57698Mkg;
import X.OJ4;
import X.ORZ;
import X.OSZ;
import X.W5F;
import X.W5U;
import X.X1D;
import X.XKX;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class TTRecUserBigCardViewModel extends ViewModel {
    public long LJLILLLLZI;
    public C57634Mje LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public final List<RecUser> LJLIL = new ArrayList();
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(C57642Mjm.LJLIL);

    public final boolean gv0() {
        if ((!this.LJLIL.isEmpty()) && System.currentTimeMillis() < this.LJLILLLLZI) {
            return true;
        }
        return false;
    }

    public final InterfaceC57698Mkg hv0() {
        return (InterfaceC57698Mkg) this.LJLJJLL.getValue();
    }

    public final RecUser iv0(boolean z) {
        boolean z2;
        RecUser recUser;
        int size = ((ArrayList) this.LJLIL).size();
        int i = this.LJLJJI;
        if (i >= 0 && i < size) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[getNextUser] currentIndex = ");
            LIZ.append(this.LJLJJI);
            C221018lt.LIZ("TTRecUserBigCardViewModel", X1D.LIZIZ(LIZ));
            recUser = (RecUser) ListProtector.get(this.LJLIL, this.LJLJJI);
            this.LJLJJI++;
        } else {
            recUser = null;
        }
        if (z) {
            if (((ArrayList) this.LJLIL).size() - this.LJLJJI <= C57626MjW.LIZ().loadMoreThreshold && this.LJLJI != null) {
                C221018lt.LIZ("TTRecUserBigCardViewModel", "[preloadIfNeeded] load more maf");
                XKX.LIZLLL(ViewModelKt.getViewModelScope(this), C36636EZk.LIZ, null, new C57631Mjb(this, null), 2);
            }
            jv0(1);
        }
        return recUser;
    }

    public final void jv0(int i) {
        List list;
        if (C57626MjW.LIZIZ()) {
            int size = ((ArrayList) this.LJLIL).size();
            int i2 = this.LJLJJL;
            if (i2 >= 0 && i2 < size) {
                ArrayList arrayList = (ArrayList) this.LJLIL;
                list = ORZ.LLILLL(arrayList.subList(i2, arrayList.size()), i);
            } else {
                list = C61878OQg.INSTANCE;
            }
            List<OSZ> imageUrlList = C47261Igj.LJJIJLIJ(OJ4.LJJLIIIJ(OJ4.LJJJJIZL(OJ4.LJJJJLL(ORZ.LJLIIIL(list), C57636Mjg.LJLIL))));
            C57686MkU.LIZ.getClass();
            o.LJIIIZ(imageUrlList, "imageUrlList");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("commit: imageUrlList=");
            LIZ.append(imageUrlList);
            C221018lt.LIZ("TTRecImageUrlToBackgroundManager", X1D.LIZIZ(LIZ));
            for (OSZ osz : imageUrlList) {
                String str = (String) osz.getFirst();
                Object second = osz.getSecond();
                if (C57686MkU.LIZJ.containsKey(str)) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("urlBgColorMap.containsKey( ");
                    LIZ2.append(str);
                    LIZ2.append(" )");
                    C221018lt.LIZ("TTRecImageUrlToBackgroundManager", X1D.LIZIZ(LIZ2));
                } else {
                    W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
                    LJIIIIZZ.LIZIZ("TTRecUserBigCardView");
                    LJIIIIZZ.LJIIIZ(new C57633Mjd(str, second, 0.1f));
                }
            }
            this.LJLJJL = list.size() + this.LJLJJL;
        }
    }
}
