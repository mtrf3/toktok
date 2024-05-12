package X;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.m;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.jvm.internal.o;

/* renamed from: X.CiY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32086CiY implements InterfaceC66332Q1o {
    public boolean LIZ;
    public m LIZIZ;
    public final Context LIZJ;
    public final String LIZLLL;

    @Override // X.InterfaceC66332Q1o
    public final String name() {
        return "LocalStrategy";
    }

    @Override // X.InterfaceC66332Q1o
    public final int priority() {
        return 0;
    }

    @Override // X.InterfaceC66332Q1o
    public final m LIZ() {
        if (!this.LIZ) {
            System.nanoTime();
            this.LIZ = true;
            try {
                InputStream open = this.LIZJ.getAssets().open(this.LIZLLL);
                o.LJIIIIZZ(open, "assetManager.open(fileName)");
                this.LIZIZ = (m) new Gson().LJI(C77321UWf.LJIILJJIL(new BufferedReader(new InputStreamReader(open))), m.class);
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        return this.LIZIZ;
    }

    public C32086CiY(Context context, String str) {
        this.LIZJ = context;
        this.LIZLLL = str;
    }
}
