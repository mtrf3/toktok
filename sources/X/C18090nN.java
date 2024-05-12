package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* renamed from: X.0nN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18090nN {
    public String LIZ;
    public int LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public final ORV<String> LJI;
    public String LJII;
    public String LJIIIIZZ;
    public C18090nN LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public int LJIILJJIL;
    public EnumC18130nR LJIILL;
    public C18090nN LJIILLIIL;
    public C18090nN LJIIZILJ;
    public C18090nN LJIJ;
    public final HashMap<String, HashSet<C18090nN>> LJIJI;
    public C18090nN LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public WeakReference<Activity> LJJ;
    public boolean LJJI;
    public WeakReference<Fragment> LJJIFFI;
    public boolean LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public String LJJIIJZLJL;
    public boolean LJJIIZ;
    public boolean LJJIIZI;
    public long LJJIJ;
    public long LJJIJIIJI;
    public String LJJIJIIJIL;
    public boolean LJJIJIL;
    public boolean LJJIJL;
    public C17980nC LJJIJLIJ;
    public java.util.Map<String, String> LJJIL;

    public final String LIZ() {
        String str = this.LIZLLL;
        if (str != null) {
            return str;
        }
        o.LJIJI("btm");
        throw null;
    }

    public final String LIZIZ() {
        String str = this.LIZJ;
        if (str != null) {
            return str;
        }
        o.LJIJI("btmPageCode");
        throw null;
    }

    public final C12410eD LIZJ() {
        C12410eD c12410eD;
        C18090nN c18090nN = this.LJIJJ;
        if (c18090nN != null) {
            c12410eD = c18090nN.LIZJ();
        } else {
            c12410eD = null;
        }
        return new C12410eD(this.LIZ, LIZ(), this.LJ, this.LJFF, this.LJI, LJ(), this.LJIILIIL, this.LJIIJ, this.LJIILJJIL, c12410eD);
    }

    public final java.util.Map<String, String> LJ() {
        OSZ[] oszArr = new OSZ[13];
        boolean z = false;
        oszArr[0] = new OSZ("duration", String.valueOf(this.LJJIJIIJI));
        oszArr[1] = new OSZ("is_back", String.valueOf(this.LJIILJJIL));
        String str = this.LJ;
        if (str == null) {
            str = "";
        }
        oszArr[2] = new OSZ("btm_pre", str);
        String str2 = this.LJFF;
        if (str2 == null) {
            str2 = "";
        }
        oszArr[3] = new OSZ("btm_ppre", str2);
        String str3 = this.LJIILIIL;
        if (str3 == null) {
            str3 = "";
        }
        oszArr[4] = new OSZ("btm_last_stay", str3);
        String str4 = this.LJIIJ;
        if (str4 == null) {
            str4 = "";
        }
        oszArr[5] = new OSZ("className", str4);
        String str5 = this.LJIIJJI;
        if (str5 == null) {
            str5 = "";
        }
        oszArr[6] = new OSZ("classNamePre", str5);
        String str6 = this.LJIIL;
        if (str6 == null) {
            str6 = "";
        }
        oszArr[7] = new OSZ("classNamePPre", str6);
        oszArr[8] = new OSZ("btm_chain", new JSONArray((Collection) this.LJI).toString());
        oszArr[9] = new OSZ("enter_time", String.valueOf(this.LJJIJ));
        oszArr[10] = new OSZ(WM7.SCENE_SERVICE, this.LJJIJIIJIL);
        String str7 = this.LJII;
        if (str7 == null) {
            str7 = "";
        }
        oszArr[11] = new OSZ("upath_code", str7);
        String str8 = this.LJIIIIZZ;
        if (str8 == null) {
            str8 = "";
        }
        oszArr[12] = new OSZ("upath_pre", str8);
        java.util.Map<String, String> LJJLIIIIJ = C113554cx.LJJLIIIIJ(oszArr);
        C18080nM.LIZ.getClass();
        String str9 = C18080nM.LIZIZ;
        if (str9 == null || str9.length() == 0) {
            z = true;
        }
        if (z) {
            LJJLIIIIJ.put("btm", "");
        } else {
            LJJLIIIIJ.put("btm", LIZ());
        }
        if (this.LJJIJIL) {
            LJJLIIIIJ.put("fromFE", "1");
        } else {
            LJJLIIIIJ.put("fromFE", CardStruct.IStatusCode.DEFAULT);
        }
        LJJLIIIIJ.put("isRestore", String.valueOf(this.LJJIIZI));
        return LJJLIIIIJ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
    
        if (r4 != null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.C18090nN r4) {
        /*
            r3 = this;
            r3.LJIILLIIL = r4
            r1 = 0
            if (r4 == 0) goto L57
            X.0nC r0 = r4.LJJIJLIJ
            if (r0 == 0) goto L13
            java.lang.String r0 = r0.LIZ
            r3.LJ = r0
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L19
            if (r4 == 0) goto L57
        L13:
            java.lang.String r0 = r4.LIZ()
        L17:
            r3.LJ = r0
        L19:
            if (r4 == 0) goto L55
            java.lang.String r0 = r4.LJIIJ
        L1d:
            r3.LJIIJJI = r0
            if (r4 == 0) goto L53
            java.lang.String r0 = r4.LJ
        L23:
            r3.LJFF = r0
            if (r4 == 0) goto L51
            java.lang.String r0 = r4.LJIIJJI
        L29:
            r3.LJIIL = r0
            if (r4 == 0) goto L31
            java.lang.String r1 = r4.LIZ()
        L31:
            r3.LJIILIIL = r1
            if (r4 == 0) goto L70
            X.ORV<java.lang.String> r0 = r3.LJI
            r0.clear()
            X.ORV<java.lang.String> r1 = r4.LJI
            X.ORV<java.lang.String> r0 = r3.LJI
            r0.addAll(r1)
        L41:
            X.ORV<java.lang.String> r0 = r3.LJI
            int r0 = r0.size()
            r2 = 10
            if (r0 <= r2) goto L59
            X.ORV<java.lang.String> r0 = r3.LJI
            r0.removeFirst()
            goto L41
        L51:
            r0 = r1
            goto L29
        L53:
            r0 = r1
            goto L23
        L55:
            r0 = r1
            goto L1d
        L57:
            r0 = r1
            goto L17
        L59:
            java.lang.String r1 = r3.LJ
            if (r1 == 0) goto L62
            X.ORV<java.lang.String> r0 = r3.LJI
            r0.addLast(r1)
        L62:
            X.ORV<java.lang.String> r0 = r3.LJI
            int r0 = r0.size()
            if (r0 <= r2) goto L70
            X.ORV<java.lang.String> r0 = r3.LJI
            r0.removeFirst()
            goto L62
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18090nN.LIZLLL(X.0nN):void");
    }

    public C18090nN(String id, int i) {
        o.LJIIIZ(id, "id");
        this.LIZ = id;
        this.LIZIZ = i;
        this.LJI = new ORV<>(10);
        this.LJIILL = EnumC18130nR.INVISIBLE;
        this.LJIJ = this;
        this.LJIJI = new HashMap<>();
        this.LJJIII = true;
        this.LJJIIJZLJL = "default";
        this.LJJIJIIJIL = EnumC18120nQ.NORMAL.getValue();
        this.LJJIJL = true;
    }
}
