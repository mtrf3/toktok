package X;

import android.os.Bundle;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.4uD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124254uD {
    public Object LIZ;
    public Object LIZIZ;
    public Object LIZJ;
    public Object LIZLLL;
    public Object LJ;
    public Object LJFF;

    public C124254uD(int i) {
        if (i != 1) {
            this.LIZ = new Bundle();
            this.LIZJ = new ArrayList();
            this.LJ = new InterfaceC124274uF() { // from class: X.4uE
                @Override // X.InterfaceC124274uF
                public final void LIZ(android.net.Uri uri) {
                }

                @Override // X.InterfaceC124274uF
                public final void LIZIZ(android.net.Uri uri, android.net.Uri convertedUri) {
                    o.LJIIJ(convertedUri, "convertedUri");
                }
            };
            this.LJFF = new C60446Nnu();
        }
    }
}
