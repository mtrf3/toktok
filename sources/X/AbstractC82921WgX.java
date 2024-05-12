package X;

import Y.ARunnableS13S0210000_14;
import android.os.Handler;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.dependence.beauty.data.BeautyComposerInfo;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.WgX, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC82921WgX {
    public final InterfaceC83115Wjf LIZ;
    public final InterfaceC83112Wjc LIZIZ;
    public final I37 LIZJ;
    public boolean LIZLLL;
    public final C5NP LJ;
    public final WRP LJFF;
    public final boolean LJI;
    public List<BeautyComposerInfo> LJII;
    public LifecycleOwner LJIIIIZZ;

    public abstract BeautyMetadata LIZ();

    public abstract void LIZIZ(LifecycleOwner lifecycleOwner);

    public final void LIZJ(boolean z) {
        WPD value;
        try {
            if (!this.LIZJ.k9().equals("record")) {
                return;
            }
            int i = 0;
            this.LIZ.N2(false);
            if (this.LJII == null) {
                this.LJII = new ArrayList();
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (BeautyComposerInfo beautyComposerInfo : this.LJII) {
                arrayList.add(beautyComposerInfo.nodePath);
                arrayList2.add(beautyComposerInfo.extra);
                C5NP c5np = this.LJ;
                if (c5np != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("update beauty:");
                    LIZ.append(beautyComposerInfo.nodePath);
                    LIZ.append(" ");
                    LIZ.append(beautyComposerInfo.extra);
                    c5np.i(X1D.LIZIZ(LIZ));
                }
            }
            int indexOf = arrayList.indexOf("EFFECT_ID_TYPE_FILTER");
            WRP wrp = this.LJFF;
            if (wrp != null) {
                value = wrp.getCurrentFilterSource().getValue();
            } else {
                value = null;
            }
            String str = "";
            if (indexOf >= 0 && indexOf < this.LJII.size() && (value == null || !this.LJFF.isFilterDisable(value.LJLIL))) {
                ArrayList arrayList3 = new ArrayList();
                BeautyCategory LIZIZ = this.LIZIZ.LIZIZ();
                if (LIZIZ != null) {
                    str = LIZIZ.getCategoryResponse().getId();
                }
                while (i < indexOf) {
                    if (this.LIZIZ.g7() || !((BeautyComposerInfo) ListProtector.get(this.LJII, i)).categoryId.equals(str)) {
                        arrayList3.add((BeautyComposerInfo) ListProtector.get(this.LJII, i));
                    }
                    i++;
                }
                ArrayList arrayList4 = new ArrayList();
                while (true) {
                    indexOf++;
                    if (indexOf >= this.LJII.size()) {
                        break;
                    } else if (this.LIZIZ.g7() || !((BeautyComposerInfo) ListProtector.get(this.LJII, indexOf)).categoryId.equals(str)) {
                        arrayList4.add((BeautyComposerInfo) ListProtector.get(this.LJII, indexOf));
                    }
                }
                if (this.LIZIZ.LLJILJILJ()) {
                    if (this.LJI) {
                        this.LIZ.LLILLL(arrayList3, 10000);
                    } else {
                        this.LIZ.a(arrayList3, 10000);
                    }
                } else if (this.LJI) {
                    this.LIZ.LLILLL(Collections.emptyList(), 10000);
                } else {
                    this.LIZ.a(Collections.emptyList(), 10000);
                }
                new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS13S0210000_14(arrayList4, this, z, 1), 250L);
                return;
            }
            if (this.LIZIZ.LLJILJILJ()) {
                List<BeautyComposerInfo> LIZ2 = C82922WgY.LIZ(this.LJII);
                BeautyCategory LIZIZ2 = this.LIZIZ.LIZIZ();
                if (LIZIZ2 != null) {
                    str = LIZIZ2.getCategoryResponse().getId();
                }
                ArrayList arrayList5 = new ArrayList();
                while (i < ((ArrayList) LIZ2).size()) {
                    if (this.LIZIZ.g7() || !((BeautyComposerInfo) ListProtector.get(LIZ2, i)).categoryId.equals(str)) {
                        arrayList5.add((BeautyComposerInfo) ListProtector.get(LIZ2, i));
                    }
                    i++;
                }
                if (this.LJI && !z) {
                    this.LIZ.LLILLL(arrayList5, 10000);
                    return;
                } else {
                    this.LIZ.a(arrayList5, 10000);
                    return;
                }
            }
            if (this.LJI && !z) {
                this.LIZ.LLILLL(Collections.emptyList(), 10000);
            } else {
                this.LIZ.a(Collections.emptyList(), 10000);
            }
        } catch (Exception e) {
            if (!C82891Wg3.LIZIZ()) {
                C5NP c5np2 = this.LJ;
                if (c5np2 != null) {
                    c5np2.LIZIZ(e);
                    return;
                }
                return;
            }
            throw new RuntimeException("thx to contact dengchong.999 ...", e);
        }
    }

    public AbstractC82921WgX(C83185Wkn c83185Wkn, C83117Wjh c83117Wjh, I37 i37, WRP wrp, C5NP c5np, boolean z) {
        this.LIZ = c83185Wkn;
        this.LIZIZ = c83117Wjh;
        this.LIZJ = i37;
        this.LJ = c5np;
        this.LJFF = wrp;
        this.LJI = z;
    }
}
