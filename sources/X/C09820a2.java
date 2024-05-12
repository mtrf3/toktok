package X;

import Y.ARunnableS47S0100000_11;
import Y.IDRunnableS65S0000000;
import android.content.Context;
import com.bytedance.apm.internal.ApmDelegate;

/* renamed from: X.0a2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09820a2 {
    public static void LIZ(Context context) {
        ApmDelegate apmDelegate = OIO.LIZ;
        apmDelegate.getClass();
        PET pet = new PET();
        C64108PEa c64108PEa = apmDelegate.LJLILLLLZI;
        if (c64108PEa != null) {
            pet.LIZ = c64108PEa.LIZIZ;
            pet.LIZIZ = c64108PEa.LIZ;
            pet.LIZJ = c64108PEa.LIZLLL;
            pet.LIZLLL = c64108PEa.LIZJ;
        }
        apmDelegate.LIZLLL(context, new PES(pet));
        if (C09970aH.LIZJ) {
            C64236PIy.LIZ().LIZIZ(new IDRunnableS65S0000000(5));
        }
    }

    public static void LIZIZ(C39034FTq c39034FTq) {
        ApmDelegate apmDelegate = OIO.LIZ;
        apmDelegate.getClass();
        C09970aH.LJII();
        if (apmDelegate.LJLJLJ) {
            if (!apmDelegate.LJLJLLL) {
                PE0 pe0 = F9U.LIZ;
                pe0.LIZIZ = true;
                if (!pe0.LJFF.isEmpty()) {
                    pe0.LJFF(pe0.LIZLLL);
                    pe0.LJ(pe0.LIZLLL);
                }
                if (!pe0.LJI.isEmpty()) {
                    pe0.LJFF(pe0.LJ);
                    pe0.LJ(pe0.LJ);
                }
                apmDelegate.LJLJLLL = true;
                apmDelegate.LJLJI = c39034FTq;
                pe0.LIZJ(new ARunnableS47S0100000_11(apmDelegate, 14));
            }
            if (C09970aH.LIZJ) {
                C64236PIy.LIZ().LIZIZ(new IDRunnableS65S0000000(6));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("You must call Apm.getInstance().init() on Application.onCreate from version 5.x.x, pls call init() before start().");
    }
}
