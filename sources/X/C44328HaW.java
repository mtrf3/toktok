package X;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import java.io.File;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.HaW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44328HaW extends AbstractC44341Haj {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLI;
    public final C82632Wbs LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C62822Ol8 LJLJL;
    public int LJLJLJ;
    public OSJ<String, String, String> LJLJLLL;
    public final C62822Ol8 LJLL;

    static {
        TBT tbt = new TBT(C44328HaW.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLI = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C44328HaW.class, "manager", "getManager()Lcom/ss/android/ugc/aweme/sharedar/SharedAREffectManager;", 0, c65351Pkp), C61845OOz.LIZJ(C44328HaW.class, "coroutineScope", "getCoroutineScope()Lkotlinx/coroutines/CoroutineScope;", 0, c65351Pkp)};
    }

    @Override // X.AbstractC44341Haj
    public final long LIZ() {
        return 12L;
    }

    public final ActivityC45651qj LIZLLL() {
        return (ActivityC45651qj) this.LJLJJI.LIZ(this, LJLLI[0]);
    }

    public final C44343Hal LJ() {
        return (C44343Hal) this.LJLJJL.LIZ(this, LJLLI[1]);
    }

    public final ShortVideoContext LJFF() {
        ViewModelProvider of;
        WM7 wm7 = (WM7) this.LJLIL.LJIIIIZZ(null, AbstractC42651GoZ.class);
        if (wm7 != null) {
            of = C165706es.LJIIIIZZ(wm7, null, null, 6);
        } else {
            of = ViewModelProviders.of(LIZLLL());
            o.LJIIIIZZ(of, "{\n            ViewModelP…rs.of(activity)\n        }");
        }
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) of.get(ShortVideoContextViewModel.class)).LJLIL;
        o.LJIIIIZZ(shortVideoContext, "provider.get(ShortVideoC…s.java).shortVideoContext");
        return shortVideoContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44328HaW(C82622Wbi context) {
        super(context);
        o.LJIIIZ(context, "context");
        this.LJLJJI = UCI.LJI(this.LJLIL, ActivityC45651qj.class, null);
        this.LJLJJL = UCI.LJI(this.LJLIL, C44343Hal.class, null);
        this.LJLJJLL = UCI.LJI(this.LJLIL, InterfaceC70422pa.class, null);
        this.LJLJL = C221108m2.LIZIZ(C44325HaT.LJLIL);
        this.LJLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 617));
    }

    public final void LJI(File file, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("filepath", file.getPath());
        jSONObject.put("username", str);
        C44343Hal LJ = LJ();
        LJ.LJ().LIZ(16385, 11L, 0L, jSONObject.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0180 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f6  */
    @Override // X.AbstractC44341Haj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r16, long r17, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44328HaW.LIZIZ(int, long, java.lang.String):void");
    }
}
