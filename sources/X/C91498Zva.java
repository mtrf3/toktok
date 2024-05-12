package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.ss.android.ugc.aweme.dsp.playerservice.plugin.expired.ExpiredPlayableManager;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Zva, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91498Zva implements InterfaceC91459Zux, InterfaceC91288ZsC {
    public final C91176ZqO<InterfaceC91286ZsA> LJLIL = new C91176ZqO<>();
    public C91605ZxJ LJLILLLLZI;

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptPause(C91299ZsN c91299ZsN) {
        return false;
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptSeek(long j) {
        return false;
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptSetStartPlayTime(int i) {
        return false;
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptStop(C91299ZsN c91299ZsN) {
        return false;
    }

    @Override // X.InterfaceC91288ZsC
    public final InterfaceC91296ZsK processPlayable(InterfaceC91296ZsK interfaceC91296ZsK) {
        return interfaceC91296ZsK;
    }

    public final boolean LJIIL() {
        int i;
        int i2;
        ExpiredPlayableManager expiredPlayableManager = ExpiredPlayableManager.INSTANCE;
        if (!expiredPlayableManager.isTodayPlayableLimited()) {
            return false;
        }
        C91605ZxJ c91605ZxJ = this.LJLILLLLZI;
        PendingIntent pendingIntent = null;
        if (c91605ZxJ != null) {
            InterfaceC91296ZsK LIZ = c91605ZxJ.LIZ();
            if (LIZ == null) {
                return false;
            }
            String id = LIZ.getId();
            C91605ZxJ c91605ZxJ2 = this.LJLILLLLZI;
            if (c91605ZxJ2 != null) {
                if (C91218Zr4.LIZJ(id, c91605ZxJ2)) {
                    return false;
                }
                if (ActivityStack.isAppBackGround() && !expiredPlayableManager.isLimitedNotificationPushed()) {
                    Context LIZIZ = EF7.LIZIZ();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 < 33 || new AnonymousClass078(LIZIZ).LIZIZ()) {
                        if (C91218Zr4.LIZLLL(LIZIZ)) {
                            i = R.string.ihh;
                        } else {
                            i = R.string.igw;
                        }
                        String string = LIZIZ.getString(i);
                        o.LJIIIIZZ(string, "context.getString(\n     …e\n            }\n        )");
                        YBK.LIZ.getClass();
                        String string2 = LIZIZ.getString(R.string.ihn, Integer.valueOf(YBK.LIZIZ()));
                        o.LJIIIIZZ(string2, "context.getString(\n     …xMusicsPerDay()\n        )");
                        C022406y c022406y = new C022406y(LIZIZ, "MUSIC_PLAY_SERVICE");
                        c022406y.LJIIJ = 1;
                        c022406y.LIZLLL(true);
                        c022406y.LJIIJJI = false;
                        c022406y.LJJIIJ.icon = R.drawable.b9p;
                        c022406y.LJJ = 1;
                        c022406y.LJFF(string);
                        c022406y.LJ(string2);
                        Context LIZIZ2 = EF7.LIZIZ();
                        Intent launchIntentForPackage = LIZIZ2.getPackageManager().getLaunchIntentForPackage(LIZIZ2.getPackageName());
                        if (launchIntentForPackage != null) {
                            if (i3 >= 23) {
                                i2 = 201326592;
                            } else {
                                i2 = 134217728;
                            }
                            pendingIntent = PendingIntent.getActivity(LIZIZ2, 0, launchIntentForPackage, i2);
                        }
                        c022406y.LJI = pendingIntent;
                        c022406y.LJIIZILJ = "music_player_service";
                        Notification LIZIZ3 = c022406y.LIZIZ();
                        o.LJIIIIZZ(LIZIZ3, "Builder(context, CHANNEL…_GROUP)\n        }.build()");
                        ((AnonymousClass078) C91216Zr2.LIZ.getValue()).LIZLLL(R.id.iy, LIZIZ3);
                    }
                    expiredPlayableManager.setLimitedNotificationPushed();
                }
                return true;
            }
            o.LJIJI("mediaPlayerService");
            throw null;
        }
        o.LJIJI("mediaPlayerService");
        throw null;
    }

    @Override // X.InterfaceC91292ZsG
    public final void onAttach() {
        C91605ZxJ c91605ZxJ = this.LJLILLLLZI;
        if (c91605ZxJ != null) {
            c91605ZxJ.LJLJI.LJLJI.LJII(this);
        } else {
            o.LJIJI("mediaPlayerService");
            throw null;
        }
    }

    @Override // X.InterfaceC91292ZsG
    public final void onDetach() {
        C91605ZxJ c91605ZxJ = this.LJLILLLLZI;
        if (c91605ZxJ != null) {
            c91605ZxJ.LJLJI.LJLJI.LJIIL(this);
            this.LJLIL.LIZ.clear();
        } else {
            o.LJIJI("mediaPlayerService");
            throw null;
        }
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptResume(C91299ZsN c91299ZsN) {
        if (LJIIL()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC91459Zux
    public final void setMediaPlayerService(C91605ZxJ c91605ZxJ) {
        this.LJLILLLLZI = c91605ZxJ;
    }

    public final void LJII(C91299ZsN c91299ZsN, boolean z) {
        this.LJLIL.LIZIZ(new C91595Zx9(c91299ZsN, z));
    }

    @Override // X.InterfaceC91288ZsC
    public final boolean interceptPlay(C91299ZsN c91299ZsN, InterfaceC91296ZsK interfaceC91296ZsK) {
        if (LJIIL()) {
            return true;
        }
        return false;
    }
}
