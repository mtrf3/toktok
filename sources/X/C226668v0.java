package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.8v0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C226668v0 {
    public User LIZ;
    public boolean LJIIIIZZ;
    public LifecycleOwner LJIIIZ;
    public ViewModelStoreOwner LJIIJ;
    public boolean LJIIL;
    public boolean LJIILJJIL;
    public boolean LIZIZ = true;
    public EnumC112694bZ LIZJ = EnumC112694bZ.MESSAGE_ICE_BREAKING;
    public EnumC57853MnB LIZLLL = EnumC57853MnB.TUX_NORMAL;
    public final java.util.Map<String, String> LJ = new LinkedHashMap();
    public final java.util.Map<EnumC57435MgR, C112704ba> LJFF = new LinkedHashMap();
    public final java.util.Map<EnumC57435MgR, Integer> LJI = new LinkedHashMap();
    public final java.util.Map<EnumC57435MgR, Boolean> LJII = new LinkedHashMap();
    public boolean LJIIJJI = true;
    public EnumC112664bW LJIILIIL = EnumC112664bW.DEFAULT;

    public final C226678v1 LIZ() {
        return new C226678v1(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL);
    }

    public final void LIZIZ(EnumC112694bZ mutualFollowText) {
        o.LJIIIZ(mutualFollowText, "mutualFollowText");
        this.LIZJ = mutualFollowText;
    }

    public final void LIZJ(EnumC57853MnB scene) {
        o.LJIIIZ(scene, "scene");
        this.LIZLLL = scene;
    }
}
