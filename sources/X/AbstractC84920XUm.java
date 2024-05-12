package X;

import Y.IDhS108S0100000_15;
import Y.IDhS94S0100000_1;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.XUm */
/* loaded from: classes16.dex */
public abstract class AbstractC84920XUm {
    public final Context LIZ;
    public String LIZIZ;
    public final MusicModel LIZJ;
    public final C84868XSm LIZLLL;
    public Effect LJ;
    public C73411SrX LJFF;
    public C73411SrX LJI;
    public C84919XUl LJII;

    public void LIZ(C84868XSm musicFetcher, MusicModel musicModel) {
        o.LJIIIZ(musicFetcher, "musicFetcher");
    }

    public abstract void LIZIZ(InterfaceC84926XUs interfaceC84926XUs);

    public abstract boolean LIZLLL();

    public abstract InterfaceC64592gB<C84768XOq> LJ();

    public abstract InterfaceC64592gB<C84767XOp> LJFF();

    public boolean LJI() {
        return false;
    }

    public final void LIZJ() {
        C73411SrX c73411SrX = this.LJFF;
        if (c73411SrX != null && (!c73411SrX.isDisposed())) {
            c73411SrX.dispose();
        }
        C73411SrX c73411SrX2 = this.LJI;
        if (c73411SrX2 != null && (!c73411SrX2.isDisposed())) {
            c73411SrX2.dispose();
        }
        C84919XUl c84919XUl = this.LJII;
        if (c84919XUl != null) {
            c84919XUl.LJFF(null);
        }
    }

    public AbstractC84920XUm(Context context, String str, MusicModel musicModel, C84868XSm musicFetcher) {
        o.LJIIIZ(musicFetcher, "musicFetcher");
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = musicModel;
        this.LIZLLL = musicFetcher;
    }

    public final void LJII(java.util.Map<String, String> map, InterfaceC84926XUs interfaceC84926XUs, boolean z, String str, boolean z2) {
        String str2;
        InterfaceC92693kP LJJJJZI;
        FMX.LJIILL("music_detail_trace", new OSZ("start_music_with_effect_download", "stage"));
        if (this.LJII != null && interfaceC84926XUs == null && !z2) {
            this.LIZIZ = str;
            return;
        }
        if (this.LJFF == null || this.LJI == null || !o.LJ(this.LIZIZ, str) || z2) {
            Effect effect = this.LJ;
            if (effect != null) {
                str2 = effect.getId();
            } else {
                str2 = null;
            }
            if (!TextUtils.equals(str2, str)) {
                this.LJ = null;
            }
            this.LIZIZ = str;
            this.LJII = new C84919XUl(interfaceC84926XUs);
            if (z) {
                C73893SzJ c73893SzJ = new C73893SzJ();
                this.LJFF = (C73411SrX) c73893SzJ.LJJJJZI(LJ());
                Context context = this.LIZ;
                String str3 = this.LIZIZ;
                Effect effect2 = this.LJ;
                o.LJIIIZ(context, "context");
                this.LJI = (C73411SrX) AbstractC73672Svk.LJIIJ(new C84953XVt(context, effect2, c73893SzJ, str3, map)).LJJIJL(new IDhS108S0100000_15(this, 4)).LJJJJZI(LJFF());
                return;
            }
            C73893SzJ c73893SzJ2 = new C73893SzJ();
            this.LJFF = (C73411SrX) c73893SzJ2.LJJJJZI(LJ());
            if (C52265KfF.LIZ && LIZLLL()) {
                C68322mC c68322mC = new C68322mC();
                C84868XSm musicFetcher = this.LIZLLL;
                MusicModel musicModel = this.LIZJ;
                o.LJIIIZ(musicFetcher, "musicFetcher");
                C73390SrC LJIIJ = AbstractC73672Svk.LJIIJ(new C84954XVu(musicFetcher, musicModel, c73893SzJ2));
                Context context2 = this.LIZ;
                String str4 = this.LIZIZ;
                Effect effect3 = this.LJ;
                o.LJIIIZ(context2, "context");
                LJJJJZI = AbstractC73672Svk.LJJIZ(LJIIJ, AbstractC73672Svk.LJIIJ(new C84952XVs(context2, effect3, c73893SzJ2, str4, map)).LJJIJL(new IDhS108S0100000_15(this, 2))).LJJIFFI(new C84766XOo(c68322mC)).LJJIJL(new IDhS94S0100000_1(c68322mC, 6)).LJJJJZI(LJFF());
            } else {
                C84868XSm musicFetcher2 = this.LIZLLL;
                MusicModel musicModel2 = this.LIZJ;
                o.LJIIIZ(musicFetcher2, "musicFetcher");
                C73390SrC LJIIJ2 = AbstractC73672Svk.LJIIJ(new C84954XVu(musicFetcher2, musicModel2, c73893SzJ2));
                Context context3 = this.LIZ;
                String str5 = this.LIZIZ;
                Effect effect4 = this.LJ;
                o.LJIIIZ(context3, "context");
                LJJJJZI = AbstractC73672Svk.LJJLL(LJIIJ2, AbstractC73672Svk.LJIIJ(new C84952XVs(context3, effect4, c73893SzJ2, str5, map)).LJJIJL(new IDhS108S0100000_15(this, 3)), C1E4.LJLIL).LJJJJZI(LJFF());
            }
            this.LJI = (C73411SrX) LJJJJZI;
            return;
        }
        if (interfaceC84926XUs != null && LJI()) {
            LIZ(this.LIZLLL, this.LIZJ);
        }
        this.LIZIZ = str;
        C73411SrX c73411SrX = this.LJI;
        o.LJI(c73411SrX);
        if (c73411SrX.isDisposed()) {
            C84919XUl c84919XUl = this.LJII;
            if (c84919XUl != null) {
                c84919XUl.LJFF(interfaceC84926XUs);
            }
            this.LJFF = null;
            this.LJI = null;
            return;
        }
        if (interfaceC84926XUs != null && z) {
            C84919XUl c84919XUl2 = this.LJII;
            if (c84919XUl2 != null) {
                c84919XUl2.LJFF(interfaceC84926XUs);
            }
            C73411SrX c73411SrX2 = this.LJFF;
            if (c73411SrX2 != null) {
                c73411SrX2.dispose();
            }
            C73411SrX c73411SrX3 = this.LJI;
            if (c73411SrX3 != null) {
                c73411SrX3.dispose();
            }
            this.LJFF = null;
            this.LJI = null;
            interfaceC84926XUs.LIZ(null, this.LIZIZ);
            return;
        }
        LIZIZ(interfaceC84926XUs);
    }
}
