package X;

import android.view.View;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.BBr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28375BBr extends AbstractC28377BBt {
    public final long LIZJ;
    public final boolean LIZLLL;
    public final C41051jJ LJ;
    public final C41051jJ LJFF;
    public final C41071jL LJI;
    public final View LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;

    @Override // X.AbstractC28377BBt
    public final HashMap<String, String> LIZ() {
        HashMap<String, String> hashMap = new HashMap<>();
        if (this.LJIIIIZZ.length() > 0) {
            hashMap.put("trigger", this.LJIIIIZZ);
        }
        if (this.LJIIIZ.length() > 0) {
            hashMap.put("entry", this.LJIIIZ);
        }
        return hashMap;
    }

    @Override // X.AbstractC28377BBt
    public final void LIZJ() {
        int i;
        super.LIZJ();
        C41051jJ c41051jJ = this.LJ;
        if (c41051jJ != null) {
            Boolean LIZJ = InterfaceC30442Bx8.X0.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_COMMENT_FILTER_SWITCH_L2_FILTER.value");
            c41051jJ.setChecked(LIZJ.booleanValue());
        }
        Boolean communityFlaggedCheck = InterfaceC30442Bx8.Y0.LIZJ();
        C41051jJ c41051jJ2 = this.LJFF;
        if (c41051jJ2 != null) {
            o.LJIIIIZZ(communityFlaggedCheck, "communityFlaggedCheck");
            c41051jJ2.setChecked(communityFlaggedCheck.booleanValue());
        }
        C41071jL c41071jL = this.LJI;
        if (c41071jL != null) {
            Boolean LIZJ2 = InterfaceC30442Bx8.Z0.LIZJ();
            o.LJIIIIZZ(LIZJ2, "LIVE_COMMENT_FILTER_SWIT…NITY_FLAGGED_REVIEW.value");
            c41071jL.setChecked(LIZJ2.booleanValue());
        }
        View view = this.LJII;
        if (view == null) {
            return;
        }
        o.LJIIIIZZ(communityFlaggedCheck, "communityFlaggedCheck");
        if (communityFlaggedCheck.booleanValue()) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    @Override // X.AbstractC28377BBt
    public final long LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC28377BBt
    public final boolean LIZLLL() {
        return this.LIZLLL;
    }

    public final void LJII(boolean z) {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        hashMap.put(9, Boolean.valueOf(z));
        LJ(hashMap, null);
        C41071jL c41071jL = this.LJI;
        if (c41071jL == null) {
            return;
        }
        c41071jL.setChecked(z);
    }

    public final void LJIIIIZZ(boolean z) {
        C41051jJ c41051jJ = this.LJ;
        if (c41051jJ != null) {
            c41051jJ.setChecked(z);
        }
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        hashMap.put(4, Boolean.valueOf(z));
        Boolean LIZJ = InterfaceC30442Bx8.Y0.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_COMMENT_FILTER_SWITCH_COMMUNITY_FLAGGED.value");
        hashMap.put(8, LIZJ);
        LJ(hashMap, null);
    }

    public final void LJI(InterfaceC116954iR interfaceC116954iR, boolean z) {
        C41051jJ c41051jJ = this.LJFF;
        if (c41051jJ != null) {
            c41051jJ.setChecked(z);
        }
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        hashMap.put(8, Boolean.valueOf(z));
        Boolean LIZJ = InterfaceC30442Bx8.X0.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_COMMENT_FILTER_SWITCH_L2_FILTER.value");
        hashMap.put(4, LIZJ);
        LJ(hashMap, null);
    }

    public C28375BBr(long j, boolean z, C41051jJ c41051jJ, C41051jJ c41051jJ2, C41071jL c41071jL, View view, String trigger, String entry) {
        o.LJIIIZ(trigger, "trigger");
        o.LJIIIZ(entry, "entry");
        this.LIZJ = j;
        this.LIZLLL = z;
        this.LJ = c41051jJ;
        this.LJFF = c41051jJ2;
        this.LJI = c41071jL;
        this.LJII = view;
        this.LJIIIIZZ = trigger;
        this.LJIIIZ = entry;
    }
}
