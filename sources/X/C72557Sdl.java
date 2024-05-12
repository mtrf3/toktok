package X;

import com.google.gson.j;
import com.google.gson.m;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Sdl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72557Sdl {
    public static final /* synthetic */ int LIZ = 0;

    static {
        C16880lQ.LJLLJ(C72557Sdl.class);
    }

    public static C72556Sdk LIZ(m mVar, C72585SeD c72585SeD) {
        try {
            if (mVar.LJJIJLIJ("hex")) {
                C72556Sdk c72556Sdk = new C72556Sdk(mVar.LJJIJ("key").LJJIFFI());
                c72556Sdk.LIZIZ = mVar.LJJIJ("hex").LJJIFFI();
                return c72556Sdk;
            }
            if (mVar.LJJIJLIJ("thumbnail")) {
                C72556Sdk c72556Sdk2 = new C72556Sdk(mVar.LJJIJ("key").LJJIFFI());
                c72556Sdk2.LIZJ = mVar.LJIIZILJ().LJJIJ("thumbnail").LJJIFFI();
                return c72556Sdk2;
            }
            if (!mVar.LJIIZILJ().LJJIJLIJ("gradient")) {
                return null;
            }
            String LJJIFFI = mVar.LJIIZILJ().LJJIJ("key").LJJIFFI();
            o.LJIIIIZZ(LJJIFFI, "color.asJsonObject[PROPERTY_KEY].asString");
            C72555Sdj c72555Sdj = new C72555Sdj(LJJIFFI);
            c72555Sdj.LIZLLL = mVar.LJJIJ("gradient").LJIIZILJ().LJJIJ("direction").LJIILJJIL();
            Iterator<j> it = mVar.LJJIJ("gradient").LJIIZILJ().LJJIJ("colors").LJIILLIIL().iterator();
            while (it.hasNext()) {
                j next = it.next();
                C72556Sdk c72556Sdk3 = new C72556Sdk(null);
                c72556Sdk3.LIZIZ = next.LJIIZILJ().LJJIJ("hex").LJJIFFI();
                c72555Sdj.LJ.add(c72556Sdk3);
            }
            return c72555Sdj;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }
}
