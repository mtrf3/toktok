package X;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.zhihu.matisse.ui.MatisseActivity;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Tw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08200Tw {
    public final Object LIZ;
    public final Object LIZIZ;

    public final void LIZIZ() {
        ((C81052VrU) this.LIZIZ).LJFF = false;
    }

    public final void LJ() {
        ((C81052VrU) this.LIZIZ).LJ = -1;
    }

    public final void LJFF() {
        ((C81052VrU) this.LIZIZ).LIZJ = true;
    }

    public final void LJI() {
        ((C81052VrU) this.LIZIZ).LIZLLL = R.style.iz;
    }

    public final void LJII() {
        ((C81052VrU) this.LIZIZ).LJIIIZ = 0.85f;
    }

    public C08200Tw(List list) {
        this.LIZ = list;
        this.LIZIZ = new ViewModelProvider(C30686C2o.LJLIL, new C38991fz(new C39011g1("livebackground"), new C44821pO())).get(StickerEffectViewModel.class);
    }

    public final void LIZ(AbstractC81054VrW abstractC81054VrW) {
        C81052VrU c81052VrU = (C81052VrU) this.LIZIZ;
        if (c81052VrU.LJII == null) {
            c81052VrU.LJII = new ArrayList();
        }
        ((ArrayList) ((C81052VrU) this.LIZIZ).LJII).add(abstractC81054VrW);
    }

    public final void LIZJ(int i) {
        Fragment fragment;
        Activity activity = (Activity) ((Reference) ((C79023Uzr) this.LIZ).LIZ).get();
        if (activity == null) {
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) MatisseActivity.class);
        Reference reference = (Reference) ((C79023Uzr) this.LIZ).LIZIZ;
        if (reference != null && (fragment = (Fragment) reference.get()) != null) {
            C16880lQ.LJII(fragment, intent, i);
        } else {
            C16880lQ.LJFF(activity, i, intent);
        }
    }

    public final void LIZLLL(int i) {
        if (i >= 1) {
            this.LIZIZ.getClass();
            this.LIZIZ.getClass();
            ((C81052VrU) this.LIZIZ).LJI = i;
            return;
        }
        throw new IllegalArgumentException("maxSelectable must be greater than or equal to one");
    }

    public /* synthetic */ C08200Tw(String str) {
        this.LIZ = str;
    }

    public C08200Tw(C79023Uzr c79023Uzr, java.util.Set set) {
        this.LIZ = c79023Uzr;
        C81052VrU c81052VrU = C81055VrX.LIZ;
        c81052VrU.LIZJ = false;
        c81052VrU.LIZLLL = R.style.j0;
        c81052VrU.LJFF = false;
        c81052VrU.LJI = 1;
        c81052VrU.LJII = null;
        c81052VrU.LJIIIIZZ = 3;
        c81052VrU.LJIIIZ = 0.5f;
        c81052VrU.LJIIJ = true;
        c81052VrU.LJIIJJI = Integer.MAX_VALUE;
        this.LIZIZ = c81052VrU;
        c81052VrU.LIZ = set;
        c81052VrU.LIZIZ = true;
        c81052VrU.LJ = -1;
    }

    public /* synthetic */ C08200Tw(String str, Object obj) {
        this.LIZ = str;
        this.LIZIZ = obj;
    }
}
