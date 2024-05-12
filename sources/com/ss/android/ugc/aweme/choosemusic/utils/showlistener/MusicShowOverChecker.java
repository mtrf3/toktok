package com.ss.android.ugc.aweme.choosemusic.utils.showlistener;

import X.C169696lJ;
import X.C188727au;
import X.FMX;
import X.GFE;
import X.H96;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public abstract class MusicShowOverChecker {
    public static final long LJLJLLL = CommerceMediaServiceImpl.LIZJ().LJIILJJIL().showOverCheckTimerIntervalMS;
    public final long LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final Integer LJLJJI;
    public final boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public long LJLJLJ;

    public abstract boolean LIZ();

    public abstract void LIZIZ();

    public abstract void LIZJ();

    public final void LJ() {
        if (!this.LJLJJLL) {
            LJFF(LIZ());
        }
    }

    public final void LIZLLL(LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        LIZJ();
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.choosemusic.utils.showlistener.MusicShowOverChecker$startListen$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                o.LJIIIZ(source, "source");
                o.LJIIIZ(event, "event");
                if (MusicShowOverChecker.this.LJLJJLL) {
                    return;
                }
                int i = GFE.LIZ[event.ordinal()];
                if (i != 1 && i != 2 && i != 3) {
                    return;
                }
                MusicShowOverChecker.this.LJFF(false);
                MusicShowOverChecker musicShowOverChecker = MusicShowOverChecker.this;
                musicShowOverChecker.LJLJJLL = true;
                musicShowOverChecker.LIZIZ();
            }
        });
    }

    public final void LJFF(boolean z) {
        if (this.LJLJL == z) {
            return;
        }
        if (z) {
            this.LJLJLJ = SystemClock.elapsedRealtime();
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLJLJ;
            long j = this.LJLIL;
            String str = this.LJLILLLLZI;
            Integer num = this.LJLJJI;
            C188727au LJ = C169696lJ.LJ(elapsedRealtime, "display_duration");
            LJ.LJ(j, "music_id");
            LJ.LJIIIZ("music_name", str);
            LJ.LJFF(num, "commercial_music_order");
            LJ.LJIIIZ("ai_recommend_tag", this.LJLJI);
            LJ.LJIIIIZZ(new H96().LJFF("page", "commercial_music_suggestion_id", "is_commercial"));
            FMX.LJIIL("show_music_over", LJ.LIZ);
            if (!this.LJLJJL) {
                this.LJLJJLL = true;
                LIZIZ();
            }
        }
        this.LJLJL = z;
    }

    public /* synthetic */ MusicShowOverChecker(long j, String str, String str2, Integer num) {
        this(j, str, str2, num, false);
    }

    public MusicShowOverChecker(long j, String str, String str2, Integer num, boolean z) {
        this.LJLIL = j;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = num;
        this.LJLJJL = z;
    }
}
