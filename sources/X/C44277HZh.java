package X;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;
import com.bytedance.scene.navigation.NavigationScene;

/* renamed from: X.HZh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44277HZh implements HXO {
    public final Activity LIZ;
    public final NavigationScene LIZIZ;
    public final FragmentC44278HZi LIZJ;
    public final FragmentC44279HZj LIZLLL;
    public final Boolean LJ;
    public boolean LJFF;

    @Override // X.HXO
    public final NavigationScene LIZ() {
        if (this.LJFF) {
            return null;
        }
        return this.LIZIZ;
    }

    @Override // X.HXO
    public final void LIZIZ() {
        if (this.LJFF) {
            return;
        }
        this.LJFF = true;
        View view = this.LIZIZ.mView;
        FragmentManager fragmentManager = this.LIZ.getFragmentManager();
        FragmentTransaction remove = fragmentManager.beginTransaction().remove(this.LIZJ).remove(this.LIZLLL);
        if (this.LJ.booleanValue()) {
            this.LIZJ.LJLIL = new C44280HZk(this, view);
            C78932UyO.LIZ(fragmentManager, remove, true);
        } else {
            C78932UyO.LIZ(fragmentManager, remove, false);
            C44273HZd.LIZIZ(this.LIZ, this.LIZJ.getTag());
            if (view == null) {
                return;
            }
            C78932UyO.LJFF(view);
        }
    }

    @Override // X.HXO
    public final boolean onBackPressed() {
        if (!this.LJFF && this.LIZIZ.onBackPressed()) {
            return true;
        }
        return false;
    }

    public C44277HZh(Activity activity, NavigationScene navigationScene, FragmentC44278HZi fragmentC44278HZi, FragmentC44279HZj fragmentC44279HZj, boolean z) {
        this.LIZ = activity;
        this.LIZIZ = navigationScene;
        this.LIZJ = fragmentC44278HZi;
        this.LIZLLL = fragmentC44279HZj;
        this.LJ = Boolean.valueOf(z);
    }
}
