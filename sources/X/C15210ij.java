package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.0ij, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15210ij {
    public final String LIZ;
    public EnumC15220ik LIZIZ;
    public long LIZJ;
    public Integer LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public int LJI;
    public Integer LJII;
    public String LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;

    public C15210ij(String btm) {
        o.LJIIIZ(btm, "btm");
        this.LIZ = btm;
        this.LIZIZ = EnumC15220ik.DEF;
        this.LJI = LiveMaxRetainAlogMessageSizeSetting.DEFAULT;
        this.LJIIIZ = true;
    }

    public final void LIZ(EnumC15220ik enumC15220ik) {
        o.LJIIIZ(enumC15220ik, "<set-?>");
        this.LIZIZ = enumC15220ik;
    }
}
