package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.GiftsBoxInfoForSend;
import kotlin.jvm.internal.o;

/* renamed from: X.0ju, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C15940ju {
    public final long LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final InterfaceC32497CpB LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final String LJI;
    public final boolean LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public User LJIIJ;
    public String LJIIJJI;
    public GiftsBoxInfoForSend LJIIL;
    public String LJIILIIL;
    public boolean LJIILJJIL;
    public Integer LJIILL;
    public String LJIILLIIL;

    public /* synthetic */ C15940ju(long j, int i, InterfaceC32497CpB interfaceC32497CpB, int i2, String str, boolean z, int i3, int i4) {
        this(j, i, interfaceC32497CpB, i2, 0, str, z, i3, i4, null, null, null);
    }

    public C15940ju(long j, int i, InterfaceC32497CpB callback, int i2, int i3, String source, boolean z, int i4, int i5, User user, String str, GiftsBoxInfoForSend giftsBoxInfoForSend) {
        o.LJIIIZ(callback, "callback");
        o.LJIIIZ(source, "source");
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = true;
        this.LIZLLL = callback;
        this.LJ = i2;
        this.LJFF = i3;
        this.LJI = source;
        this.LJII = z;
        this.LJIIIIZZ = i4;
        this.LJIIIZ = i5;
        this.LJIIJ = user;
        this.LJIIJJI = str;
        this.LJIIL = giftsBoxInfoForSend;
        this.LJIILLIIL = "";
    }
}
