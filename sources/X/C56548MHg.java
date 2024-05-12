package X;

import X.InterfaceC56551MHj;
import Y.AObjectS42S0101000_5;
import android.os.SystemClock;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.MHg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56548MHg<V extends InterfaceC56551MHj> extends C8BR<C8BS<MusicDetail>, V> {
    public String LJLJJI;
    public String LJLJJL;
    public Long LJLJJLL = 0L;
    public final String LJLJL = "";
    public final Long LJLJLJ = 0L;
    public final Boolean LJLJLLL = C03090Af.LIZIZ("music_cache_optimistic", false);
    public final MJ0 LJLL;
    public WeakHandler LJLLI;

    public final void LJJIII() {
        C56549MHh.LIZ(this.LJLJL, "MusicDetail", this.LJLJLJ.longValue(), this.LJLJJLL.longValue(), SystemClock.elapsedRealtime(), C52941Kq9.LIZ(), new C48339Iy7());
    }

    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        T t;
        K k = this.LJLILLLLZI;
        if (k != 0 && (t = this.LJLIL) != 0) {
            ((InterfaceC56551MHj) k).onLoadMusicDetailSuccess((MusicDetail) t.getData());
        }
        if (!this.LJLJLLL.booleanValue() && this.LJLJJI != null && this.LJLJJL != null) {
            if (!NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false).isStandardUIEnable() || ((Boolean) C53008KrE.LIZ.getValue()).booleanValue()) {
                C56543MHb c56543MHb = C56543MHb.LIZ;
                String musicId = this.LJLJJI;
                String extra = this.LJLJJL;
                MusicDetail musicDetail = (MusicDetail) this.LJLIL.getData();
                c56543MHb.getClass();
                o.LJIIIZ(musicId, "musicId");
                o.LJIIIZ(extra, "extra");
                o.LJIIIZ(musicDetail, "musicDetail");
                C56543MHb.LIZJ.LIZJ(C00F.LIZIZ(musicId, '&', extra), new C56546MHe(musicDetail, System.currentTimeMillis()));
                LJJIII();
            }
        }
    }

    public C56548MHg() {
        LJJ(new C56552MHk(this));
        this.LJLL = new MJ0(new C66579QBb(5, this), new AObjectS42S0101000_5(4, this, 2));
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        K k = this.LJLILLLLZI;
        if (k != 0) {
            ((InterfaceC56551MHj) k).onLoadMusicDetailFail(exc);
        }
        String str = this.LJLJL;
        if (str != null) {
            C44206HWo.LIZ.remove(str);
        }
        C56543MHb.LIZ.getClass();
    }
}
