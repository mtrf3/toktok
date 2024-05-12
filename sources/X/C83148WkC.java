package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WkC, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C83148WkC implements InterfaceC83159WkN {
    public static final Keva LIZIZ;
    public final String LIZ;

    static {
        Keva repo = Keva.getRepo("ulike_repo");
        o.LJIIIIZZ(repo, "Keva.getRepo(KEVA_ULIKE_REPO)");
        LIZIZ = repo;
    }

    @Override // X.InterfaceC83159WkN
    public final boolean LIZ() {
        Keva keva = LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append("key_switchkey_switch_all_beauty");
        return keva.getBoolean(X1D.LIZIZ(LIZ), true);
    }

    @Override // X.InterfaceC83159WkN
    public final int LJIIJJI() {
        if (C82516Wa0.LIZLLL) {
            C83175Wkd.LIZJ("getDetectFemaleCount no work by BeautyClearFemaleRecognize is true. return 0");
            return 0;
        }
        Keva keva = LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append("key_detect_female_count");
        return keva.getInt(X1D.LIZIZ(LIZ), 0);
    }

    @Override // X.InterfaceC83159WkN
    public final boolean LJIIL() {
        Keva keva = LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append("key_switchkey_switch_switch_check");
        return keva.getBoolean(X1D.LIZIZ(LIZ), true);
    }

    @Override // X.InterfaceC83159WkN
    public final List<BeautyCategory> LJIILLIIL() {
        Keva keva = LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append("key_beauty_panel_data");
        try {
            return (List) ((Gson) EJM.LIZ.getValue()).LJII(keva.getString(X1D.LIZIZ(LIZ), null), new C83170WkY().getType());
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // X.InterfaceC83159WkN
    public final void LJIJ() {
        Keva keva = LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append("key_switchkey_switch_switch_check");
        keva.storeBoolean(X1D.LIZIZ(LIZ), false);
    }

    @Override // X.InterfaceC83159WkN
    public boolean LLJILJILJ() {
        return LIZIZ.getBoolean("key_disable_all_beauty", false);
    }

    public C83148WkC(String key) {
        o.LJIIIZ(key, "key");
        this.LIZ = key;
    }

    @Override // X.InterfaceC83159WkN
    public final void LIZJ(boolean z) {
        Keva keva = LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append("key_switchkey_switch_all_beauty");
        keva.storeBoolean(X1D.LIZIZ(LIZ), z);
    }

    @Override // X.InterfaceC83159WkN
    public final String LIZLLL(ILU gender) {
        o.LJIIIZ(gender, "gender");
        Keva keva = LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append(gender.getFlag());
        LIZ.append("_key_selected_category");
        return keva.getString(X1D.LIZIZ(LIZ), null);
    }

    @Override // X.InterfaceC83159WkN
    public void LJIIIZ(boolean z) {
        LIZIZ.storeBoolean("key_disable_all_beauty", z);
    }

    @Override // X.InterfaceC83159WkN
    public final void LJIIJ(boolean z) {
        if (z) {
            Keva keva = LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LIZ);
            LIZ.append("key_need_face_detect");
            if (!keva.getBoolean(X1D.LIZIZ(LIZ), false)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(this.LIZ);
                LIZ2.append("key_need_face_detect");
                keva.storeBoolean(X1D.LIZIZ(LIZ2), true);
            }
        }
    }

    @Override // X.InterfaceC83159WkN
    public final void LJIILJJIL(int i) {
        if (C82516Wa0.LIZLLL) {
            C83175Wkd.LIZJ("saveDetectFemaleCount no work by BeautyClearFemaleRecognize is true.");
            return;
        }
        Keva keva = LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append("key_detect_female_count");
        keva.storeInt(X1D.LIZIZ(LIZ), i);
    }

    @Override // X.InterfaceC83159WkN
    public final void LJIJI(List<BeautyCategory> list) {
        if (list == null) {
            Keva keva = LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LIZ);
            LIZ.append("key_beauty_panel_data");
            keva.erase(X1D.LIZIZ(LIZ));
            return;
        }
        Keva keva2 = LIZIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        keva2.storeString(JBR.LJFF(LIZ2, this.LIZ, "key_beauty_panel_data", LIZ2), GsonProtectorUtils.toJson((Gson) EJM.LIZ.getValue(), list));
    }

    @Override // X.InterfaceC83159WkN
    public final void LIZIZ(ILU gender, String str) {
        o.LJIIIZ(gender, "gender");
        Keva keva = LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append(gender.getFlag());
        LIZ.append("_key_selected_category");
        keva.storeString(X1D.LIZIZ(LIZ), str);
    }

    @Override // X.InterfaceC83159WkN
    public final void LJ(String categoryId, boolean z) {
        o.LJIIIZ(categoryId, "categoryId");
        Keva keva = LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        keva.storeBoolean(C025908h.LIZIZ(LIZ, this.LIZ, "key_switch", categoryId, LIZ), z);
    }

    @Override // X.InterfaceC83159WkN
    public final boolean LJFF(String categoryId, boolean z) {
        o.LJIIIZ(categoryId, "categoryId");
        Keva keva = LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        return keva.getBoolean(C025908h.LIZIZ(LIZ, this.LIZ, "key_switch", categoryId, LIZ), z);
    }

    @Override // X.InterfaceC83159WkN
    public final void LJI(ComposerBeauty composerBeauty, ILU gender) {
        o.LJIIIZ(composerBeauty, "composerBeauty");
        o.LJIIIZ(gender, "gender");
        if (composerBeauty.getExtra().getDisableCache()) {
            LIZIZ.storeString(C83161WkP.LIZIZ(this.LIZ, gender.getFlag(), composerBeauty.getParentResId()), "-1");
        } else {
            LIZIZ.storeString(C83161WkP.LIZIZ(this.LIZ, gender.getFlag(), composerBeauty.getParentResId()), composerBeauty.getEffect().getResourceId());
        }
    }

    @Override // X.InterfaceC83159WkN
    public final String LJII(ComposerBeauty parentBeauty, ILU gender) {
        o.LJIIIZ(gender, "gender");
        o.LJIIIZ(parentBeauty, "parentBeauty");
        return LIZIZ.getString(C83161WkP.LIZIZ(this.LIZ, gender.getFlag(), parentBeauty.getEffect().getResourceId()), null);
    }

    @Override // X.InterfaceC83159WkN
    public final String LJIIIIZZ(ILU gender, String str) {
        o.LJIIIZ(gender, "gender");
        Keva keva = LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append(gender.getFlag());
        LIZ.append("_key_selected_beauty_");
        LIZ.append(str);
        return keva.getString(X1D.LIZIZ(LIZ), null);
    }

    @Override // X.InterfaceC83159WkN
    public final void LJIIZILJ(ComposerBeauty composerBeauty, ILU gender) {
        o.LJIIIZ(composerBeauty, "composerBeauty");
        o.LJIIIZ(gender, "gender");
        if (composerBeauty.getExtra().getDisableCache()) {
            Keva keva = LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LIZ);
            LIZ.append(gender.getFlag());
            LIZ.append("_key_selected_beauty_");
            LIZ.append(composerBeauty.getCategoryId());
            keva.storeString(X1D.LIZIZ(LIZ), "-1");
            return;
        }
        Keva keva2 = LIZIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LIZ);
        LIZ2.append(gender.getFlag());
        LIZ2.append("_key_selected_beauty_");
        LIZ2.append(composerBeauty.getCategoryId());
        keva2.storeString(X1D.LIZIZ(LIZ2), composerBeauty.getEffect().getEffectId());
    }

    @Override // X.InterfaceC83159WkN
    public float LJIILIIL(ComposerBeauty composerBeauty, ILU gender, String str, float f) {
        o.LJIIIZ(composerBeauty, "composerBeauty");
        o.LJIIIZ(gender, "gender");
        return LIZIZ.getFloat(C83161WkP.LIZ(this.LIZ, gender.getFlag(), composerBeauty.getEffect().getResourceId(), str), f);
    }

    @Override // X.InterfaceC83159WkN
    public void LJIILL(ComposerBeauty composerBeauty, ILU gender, String str, float f) {
        o.LJIIIZ(composerBeauty, "composerBeauty");
        o.LJIIIZ(gender, "gender");
        String LIZ = C83161WkP.LIZ(this.LIZ, gender.getFlag(), composerBeauty.getEffect().getResourceId(), str);
        LIZIZ.storeFloat(LIZ, f);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("saveBeautyTagValue key: ");
        LIZ2.append(LIZ);
        LIZ2.append(" val: ");
        LIZ2.append(f);
        C83175Wkd.LIZIZ(X1D.LIZIZ(LIZ2));
    }
}
