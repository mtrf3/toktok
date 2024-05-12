package X;

import org.json.JSONObject;

/* renamed from: X.PIx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64235PIx {
    public static boolean LIZ(String str) {
        return OIO.LIZ.LIZJ(str);
    }

    public static void LIZIZ(final String str, final String str2, final float f) {
        F9U.LIZ.LIZJ(new Runnable() { // from class: X.0aB
            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ;
                try {
                    C64089PDh.LJIIJ().LIZLLL(new C64098PDq(str, str2, f));
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        if (C09970aH.LIZJ) {
            C64236PIy.LIZ().LIZIZ(new Runnable() { // from class: X.0aC
                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ;
                    try {
                        JSONObject LIZ2 = new C64098PDq(str, str2, f).LIZ();
                        if (LIZ2 != null) {
                            C09900aA.LJIILLIIL("monitorDirectOnTimer", LIZ2.toString());
                        }
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }
}
