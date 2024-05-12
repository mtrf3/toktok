package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class JTS {
    public final C50107JlX LIZ;
    public final ActivityC45651qj LIZIZ;
    public String LIZJ;
    public VNS LIZLLL;
    public boolean LJ;
    public String LJFF;
    public Integer LJI;
    public DynamicPatch LJII;
    public java.util.Map<String, ? extends Object> LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public final C62822Ol8 LJIIJJI;
    public final C62822Ol8 LJIIL;
    public JTX LJIILIIL;
    public Object LJIILJJIL;
    public int LJIILL;
    public C50340JpI LJIILLIIL;
    public JTC LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;

    public JTS(C50107JlX c50107JlX) {
        Context context;
        ContextWrapper contextWrapper;
        this.LIZ = c50107JlX;
        Context context2 = c50107JlX.getContext();
        o.LJIIIIZZ(context2, "itemView.context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context2);
        if (LJJIFFI == null) {
            Context context3 = c50107JlX.getContext();
            if ((context3 instanceof MutableContextWrapper) && (contextWrapper = (ContextWrapper) context3) != null) {
                context = contextWrapper.getBaseContext();
            } else {
                context = null;
            }
            if (context instanceof ActivityC45651qj) {
                LJJIFFI = (ActivityC45651qj) context;
            } else {
                LJJIFFI = null;
            }
        }
        this.LIZIZ = LJJIFFI;
        this.LJ = true;
        this.LJFF = "";
        this.LJIIJJI = C221108m2.LIZIZ(JTT.LJLIL);
        this.LJIIL = C221108m2.LIZIZ(JTU.LJLIL);
        this.LJIILL = 1;
    }

    public final void LIZ(String str, JSONObject jSONObject) {
        C50340JpI c50340JpI = this.LJIILLIIL;
        if (c50340JpI != null) {
            c50340JpI.LIZ(str, jSONObject);
        }
    }
}
