package X;

import Y.ARunnableS11S0400000_7;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS7S0002000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HvW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45630HvW implements InterfaceC43977HNt {
    public final /* synthetic */ AbstractC43973HNp LIZ;
    public final /* synthetic */ C45628HvU LIZIZ;

    @Override // X.InterfaceC43977HNt
    public final void LIZ(MyMediaModel myMediaModel) {
        if (myMediaModel != null) {
            this.LIZIZ.LLJLLIL(myMediaModel);
        }
    }

    public C45630HvW(AbstractC43973HNp abstractC43973HNp, C45628HvU c45628HvU) {
        this.LIZ = abstractC43973HNp;
        this.LIZIZ = c45628HvU;
    }

    @Override // X.InterfaceC43977HNt
    public final void LIZIZ(MyMediaModel myMediaModel, View view) {
        Integer LLII;
        if (myMediaModel != null) {
            C45628HvU c45628HvU = this.LIZIZ;
            C45495HtL c45495HtL = myMediaModel.libraryState;
            if (c45495HtL != null && c45495HtL.isFailed()) {
                c45628HvU.LJJJJZ(myMediaModel);
            }
            int i = myMediaModel.mediaIndex;
            C45644Hvk c45644Hvk = c45628HvU.LJLJJL;
            if (c45644Hvk != null) {
                if (i == c45644Hvk.getCurrentItem()) {
                    return;
                }
                C45635Hvb c45635Hvb = c45628HvU.LJLJJLL;
                if (c45635Hvb != null) {
                    MediaModel mediaModel = (MediaModel) ORZ.LJLLLLLL(myMediaModel.mediaIndex, c45635Hvb.LJLJLJ);
                    if (mediaModel != null && o.LJ(mediaModel.fileLocalUriPath, myMediaModel.fileLocalUriPath)) {
                        C45644Hvk c45644Hvk2 = c45628HvU.LJLJJL;
                        if (c45644Hvk2 != null) {
                            c45644Hvk2.setCurrentItem(myMediaModel.mediaIndex);
                            AbstractC43973HNp abstractC43973HNp = c45628HvU.LLIFFJFJJ;
                            if (abstractC43973HNp != null && (LLII = abstractC43973HNp.LLII(myMediaModel)) != null) {
                                c45628HvU.LLJILJIL(LLII.intValue() + 1);
                                if (C76800UCe.LIZ != null) {
                                    return;
                                }
                            }
                        } else {
                            o.LJIJI("viewPager");
                            throw null;
                        }
                    }
                    c45628HvU.LLILZ(R.string.e8r);
                    return;
                }
                o.LJIJI("viewPagerAdapter");
                throw null;
            }
            o.LJIJI("viewPager");
            throw null;
        }
    }

    @Override // X.InterfaceC43977HNt
    public final void LJFF(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i >= 0 && i < this.LIZ.LJLIL.size()) {
            z = true;
        } else {
            z = false;
        }
        if (i2 < 0 || i2 >= this.LIZ.LJLIL.size()) {
            z2 = false;
        }
        if (!z || !z2) {
            return;
        }
        Object obj = ListProtector.get(this.LIZ.LJLIL, i2);
        o.LJIIIIZZ(obj, "adapter.getMediaList()[to]");
        MyMediaModel myMediaModel = (MyMediaModel) obj;
        ChooseMediaViewModel chooseMediaViewModel = this.LIZIZ.LJLLI;
        if (chooseMediaViewModel != null) {
            chooseMediaViewModel.setState(new AqS7S0002000_7(i, i2, 1));
            C76732zl c76732zl = new C76732zl();
            c76732zl.element = myMediaModel.mediaIndex;
            C45628HvU c45628HvU = this.LIZIZ;
            if (c45628HvU.LLIIIZ) {
                C45635Hvb c45635Hvb = c45628HvU.LJLJJLL;
                if (c45635Hvb != null) {
                    if (i < c45635Hvb.LJLJLJ.size() && i >= 0 && i2 < c45635Hvb.LJLJLJ.size() && i2 >= 0) {
                        ((LinkedHashMap) c45635Hvb.LJLJL).clear();
                        ListProtector.add(c45635Hvb.LJLJLJ, i2, ListProtector.remove(c45635Hvb.LJLJLJ, i));
                        c45635Hvb.LJJIIJZLJL();
                        c45635Hvb.notifyDataSetChanged();
                    }
                    c76732zl.element = i2;
                } else {
                    o.LJIJI("viewPagerAdapter");
                    throw null;
                }
            }
            C45628HvU c45628HvU2 = this.LIZIZ;
            C45644Hvk c45644Hvk = c45628HvU2.LJLJJL;
            if (c45644Hvk != null) {
                c45644Hvk.postDelayed(new ARunnableS11S0400000_7(c45628HvU2, c76732zl, this, myMediaModel, this.LIZ, 1), 100L);
                return;
            } else {
                o.LJIJI("viewPager");
                throw null;
            }
        }
        o.LJIJI("chooseMediaViewModel");
        throw null;
    }
}
