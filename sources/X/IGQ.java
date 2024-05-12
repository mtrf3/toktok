package X;

import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IGQ implements IGM {
    public final /* synthetic */ C46331IGh LJLIL;

    @Override // X.IGM
    public final boolean LIZ() {
        return true;
    }

    @Override // X.IGM
    public final /* synthetic */ boolean LIZIZ() {
        return false;
    }

    @Override // X.IGM
    public final /* synthetic */ boolean LIZJ() {
        return false;
    }

    @Override // X.IGM
    public final /* synthetic */ boolean LIZLLL() {
        return false;
    }

    @Override // X.IGM
    public final /* synthetic */ HashMap LJFF(String str, boolean z) {
        return null;
    }

    @Override // X.IGM
    public final /* synthetic */ HashMap LJII(String str, JSONObject jSONObject) {
        return null;
    }

    @Override // X.IGM
    public final /* synthetic */ HashMap LJIIIIZZ(String str) {
        return null;
    }

    @Override // X.IGM
    public final /* synthetic */ boolean LJIIIZ() {
        return false;
    }

    @Override // X.IGM
    public final /* synthetic */ HashMap LJIIJ(String str) {
        return null;
    }

    @Override // X.IGM
    public final /* synthetic */ boolean LJIIJJI() {
        return false;
    }

    @Override // X.IGM
    public final /* synthetic */ HashMap LJIIL(String str) {
        return null;
    }

    @Override // X.IGM
    public final /* synthetic */ boolean LJIILIIL() {
        return false;
    }

    @Override // X.IGM
    public final /* synthetic */ boolean LJIILJJIL() {
        return false;
    }

    @Override // X.IGM
    public final /* synthetic */ boolean LJIILL() {
        return false;
    }

    @Override // X.IGM
    public final /* synthetic */ boolean LJIIZILJ() {
        return false;
    }

    @Override // X.IGM
    public final ILN LJ() {
        return ILN.DEFAULT;
    }

    @Override // X.IGM
    public final ILO LJI() {
        return ILO.VIDEO;
    }

    public IGQ(C46331IGh c46331IGh) {
        this.LJLIL = c46331IGh;
    }

    @Override // X.IGM
    public final HashMap<String, Object> LJIJ(String str, boolean z) {
        if (this.LJLIL.LJIIIZ.booleanValue()) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("is_prepare", 1);
            this.LJLIL.LJIIIZ = Boolean.FALSE;
            return hashMap;
        }
        return null;
    }
}
