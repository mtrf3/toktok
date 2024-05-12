package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.0rt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20890rt {
    public static final /* synthetic */ int LJIIJ = 0;
    public final String LIZ;
    public final EnumC20860rq LIZIZ;
    public EnumC20850rp LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public int LJIIIIZZ;
    public final boolean LJIIIZ;

    public C20890rt(String layoutName, EnumC20860rq bizType) {
        String str;
        o.LJIIIZ(layoutName, "layoutName");
        o.LJIIIZ(bizType, "bizType");
        this.LIZ = layoutName;
        this.LIZIZ = bizType;
        this.LIZJ = EnumC20850rp.SYSTEM_LAYOUT_INFLATER;
        this.LIZLLL = -1L;
        this.LJ = -1L;
        this.LJFF = -1L;
        this.LJI = -999L;
        this.LJII = -1L;
        Context context = C20910rv.LJIIIIZZ;
        if (context != null) {
            str = C16880lQ.LJLLJ(context.getClass());
        } else {
            str = null;
        }
        this.LJIIIZ = o.LJ(str, "LivePlayActivity");
    }
}
