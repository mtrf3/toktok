package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8Bm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207268Bm implements JHD, C0C3 {
    public final String LJLIL;
    public final C2049882s LJLILLLLZI;
    public final C207278Bn LJLJI;
    public Aweme LJLJJI;
    public java.util.Map<String, String> LJLJJL;

    @Override // X.C0C3
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // X.C0C3
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.JHD
    public final int LIZIZ() {
        C207278Bn c207278Bn = this.LJLJI;
        c207278Bn.LLJL = true;
        C81C c81c = c207278Bn.LLJJJJ;
        c81c.LIZIZ = false;
        C216848fA c216848fA = c81c.LIZ;
        c216848fA.LIZLLL = false;
        c216848fA.LIZ = 0;
        c207278Bn.removeCallbacks(c207278Bn.LLJLIL);
        c207278Bn.LLJJLIIIJLLLLLLLZ = 0;
        return this.LJLJI.getCurrentPosition();
    }

    @Override // X.JHD
    public final int LIZLLL() {
        return this.LJLILLLLZI.getCount();
    }

    @Override // X.JHD
    public final int getCurrentPosition() {
        return this.LJLJI.getCurrentPosition();
    }

    @Override // X.JHD
    public final void onCleared() {
        C207278Bn c207278Bn = this.LJLJI;
        c207278Bn.LLJJJJJIL = 0;
        c207278Bn.LLJJJJLIIL.clear();
        c207278Bn.LLJJLIIIJLLLLLLLZ = 0;
        c207278Bn.LLJJL = false;
        this.LJLJI.LJJIIJ(this);
    }

    @Override // X.JHD
    public final C207278Bn LJI() {
        return this.LJLJI;
    }

    public C207268Bm(JHC parentView) {
        o.LJIIIZ(parentView, "parentView");
        this.LJLIL = "general_search";
        Context context = parentView.getContext();
        o.LJIIIIZZ(context, "parentView.context");
        this.LJLILLLLZI = new C2049882s(context);
        View findViewById = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parentView.getContext()), R.layout.c2b, parentView, false).findViewById(R.id.hon);
        o.LJIIIIZZ(findViewById, "viewLayout.findViewById(R.id.photo_slides_widget)");
        C207278Bn c207278Bn = (C207278Bn) findViewById;
        this.LJLJI = c207278Bn;
        c207278Bn.LJFF(this);
    }

    @Override // X.JHD
    public final void LIZ(java.util.Map<String, String> map) {
        this.LJLJJL = map;
    }

    @Override // X.JHD
    public final void LIZJ(InterfaceC207288Bo listener) {
        o.LJIIIZ(listener, "listener");
        C207278Bn c207278Bn = this.LJLJI;
        c207278Bn.getClass();
        c207278Bn.LLJJJJLIIL.addIfAbsent(listener);
    }

    @Override // X.JHD
    public final void LJ(int i) {
        this.LJLJI.setCurrentPhotoItem(i);
    }

    @Override // X.JHD
    public final void LJFF(Integer num) {
        C207278Bn c207278Bn = this.LJLJI;
        c207278Bn.LLJL = false;
        c207278Bn.removeCallbacks(c207278Bn.LLJLIL);
        if (num != null) {
            int intValue = num.intValue();
            c207278Bn.LLJJJJJIL = intValue;
            c207278Bn.setCurrentItem(intValue, false);
        }
        C81C c81c = c207278Bn.LLJJJJ;
        c81c.LIZIZ = true;
        C216848fA c216848fA = c81c.LIZ;
        c216848fA.LIZLLL = true;
        c216848fA.LIZ = 0;
        c207278Bn.postDelayed(c207278Bn.LLJLIL, 1700L);
    }

    @Override // X.JHD
    public final void LJII(InterfaceC207288Bo listener) {
        o.LJIIIZ(listener, "listener");
        C207278Bn c207278Bn = this.LJLJI;
        c207278Bn.getClass();
        c207278Bn.LLJJJJLIIL.remove(listener);
    }

    @Override // X.C0C3
    public final void onPageSelected(int i) {
        Aweme aweme = this.LJLJJI;
        if (aweme != null) {
            C2045481a.LIZIZ(this.LJLIL, "auto", aweme, i, "right", false, LIZLLL(), this.LJLJJL, null, 512);
        }
    }

    @Override // X.JHD
    public final void setData(Aweme aweme) {
        List<PhotoModeImageUrlModel> list;
        this.LJLJJI = aweme;
        if (aweme != null) {
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo != null) {
                list = photoModeImageInfo.getImageList();
            } else {
                list = null;
            }
            this.LJLJI.setSupportSlide(false);
            this.LJLJI.setAdapter(this.LJLILLLLZI);
            if (list != null) {
                C2049882s c2049882s = this.LJLILLLLZI;
                c2049882s.getClass();
                if (!o.LJ(c2049882s.LJLJJLL, list)) {
                    c2049882s.LJLJJLL = list;
                    c2049882s.notifyDataSetChanged();
                }
            }
        }
    }
}
