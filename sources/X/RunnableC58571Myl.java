package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Myl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC58571Myl implements Runnable {
    public final /* synthetic */ InterfaceC58572Mym LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ int LJLJLLL;
    public final /* synthetic */ long LJLL;

    public RunnableC58571Myl(InterfaceC58572Mym interfaceC58572Mym, long j, long j2, String str, String str2, String str3, String str4, String str5, int i, long j3) {
        this.LJLIL = interfaceC58572Mym;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = str;
        this.LJLJJL = str2;
        this.LJLJJLL = str3;
        this.LJLJL = str4;
        this.LJLJLJ = str5;
        this.LJLJLLL = i;
        this.LJLL = j3;
    }

    public final void LIZ() {
        if (this.LJLIL.valid(this.LJLILLLLZI, this.LJLJI)) {
            String tag = this.LJLJJI;
            o.LJIIIIZZ(tag, "tag");
            C58655N0h LJ = C58704N2e.LJ(tag, this.LJLIL.label(true), this.LJLJJL, this.LJLJJLL, this.LJLJL);
            LJ.LIZJ(this.LJLJLJ, "ad_extra_data");
            LJ.LIZIZ(Integer.valueOf(this.LJLJLLL), "trigger_from");
            LJ.LIZIZ(Long.valueOf(this.LJLL), "percent");
            LJ.LIZIZ(Long.valueOf(this.LJLILLLLZI), "duration");
            LJ.LIZIZ(Long.valueOf(this.LJLJI), "video_length");
            LJ.LJI();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
