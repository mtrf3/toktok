package com.ss.android.ugc.musicprovider.provider;

import X.C16880lQ;
import X.C188727au;
import X.C39579Fg7;
import X.C47325Ihl;
import X.C48137Iur;
import X.C48399Iz5;
import X.C48402Iz8;
import X.C48421IzR;
import X.C78496UrM;
import X.C79004UzY;
import X.C84862XSg;
import X.CountDownTimerC48400Iz6;
import X.FMX;
import X.InterfaceC47327Ihn;
import X.InterfaceC47328Iho;
import X.InterfaceC47329Ihp;
import X.InterfaceC47330Ihq;
import X.XPS;
import X.XU4;
import X.XUV;
import Y.ARunnableS44S0100000_8;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class MusicPlayer implements GenericLifecycleObserver, XU4, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnInfoListener {
    public final Context LJLIL;
    public final String LJLILLLLZI;
    public long LJLJI;
    public Long LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public InterfaceC47330Ihq LJLJL;
    public InterfaceC47329Ihp LJLJLJ;
    public InterfaceC47328Iho LJLJLLL;
    public InterfaceC47327Ihn LJLL;
    public MediaPlayer LJLLI;
    public CountDownTimerC48400Iz6 LJLLILLLL;
    public long LJLLJ;
    public C47325Ihl LJLLL;
    public String LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public boolean LJZ;
    public final Handler LJZI;
    public final ARunnableS44S0100000_8 LJZL;
    public final ARunnableS44S0100000_8 LL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_STOP) {
            submitBackground();
        }
    }

    public final void LJIIJ() {
        CountDownTimerC48400Iz6 countDownTimerC48400Iz6 = this.LJLLILLLL;
        if (countDownTimerC48400Iz6 != null) {
            countDownTimerC48400Iz6.cancel();
        }
    }

    public final void LJIIJJI() {
        MediaPlayer mediaPlayer = this.LJLLI;
        if (mediaPlayer != null) {
            this.LJZI.removeCallbacks(this.LJZL);
            this.LJZI.removeCallbacks(this.LL);
            this.LJZI.post(this.LL);
            this.LJZI.post(this.LJZL);
            mediaPlayer.start();
        }
    }

    @Override // X.XU4
    public final boolean isPlaying() {
        MediaPlayer mediaPlayer = this.LJLLI;
        if (mediaPlayer != null) {
            return mediaPlayer.isPlaying();
        }
        return false;
    }

    @Override // X.XU4
    public final void pause() {
        try {
            this.LJZI.removeCallbacks(this.LJZL);
            this.LJZI.removeCallbacks(this.LL);
            LJIIJ();
            this.LJLJJL = true;
            MediaPlayer mediaPlayer = this.LJLLI;
            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                MediaPlayer mediaPlayer2 = this.LJLLI;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.pause();
                }
                LJIIL("pause");
                new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS44S0100000_8(this, 63));
            }
        } catch (IllegalStateException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.XU4
    public final void stop() {
        try {
            this.LJZI.removeCallbacks(this.LJZL);
            this.LJZI.removeCallbacks(this.LL);
            LJIIJ();
            this.LJLJJLL = true;
            MediaPlayer mediaPlayer = this.LJLLI;
            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                MediaPlayer mediaPlayer2 = this.LJLLI;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.stop();
                }
                LJIIL("stop");
                new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS44S0100000_8(this, 64));
            }
        } catch (IllegalStateException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void submitBackground() {
        LJIIL("background");
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS44S0100000_8(this, 65));
    }

    public final void LJIIIZ() {
        String str;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLLJ;
        C47325Ihl c47325Ihl = this.LJLLL;
        if (c47325Ihl != null) {
            List<String> list = c47325Ihl.LIZIZ;
            String str2 = null;
            if (list != null) {
                str = list.toString();
            } else {
                str = null;
            }
            C48421IzR.LIZIZ(elapsedRealtime, str, this.LJLLLL, this.LJLILLLLZI);
            String str3 = c47325Ihl.LJFF;
            List<String> list2 = c47325Ihl.LIZIZ;
            if (list2 != null) {
                str2 = list2.toString();
            }
            C48137Iur.LJFF(str3, str2, Long.valueOf(elapsedRealtime), this.LJLILLLLZI, this.LJLLLL);
        }
        MediaPlayer mediaPlayer = this.LJLLI;
        if (mediaPlayer != null) {
            pause();
            int i = this.LJLLLLLL;
            if (i < 0) {
                i = 0;
            }
            this.LJLLLLLL = i;
            int i2 = this.LJLZ;
            if (i2 <= i || i2 >= mediaPlayer.getDuration()) {
                this.LJLZ = mediaPlayer.getDuration();
            }
            if (this.LJLLLLLL > 0) {
                mediaPlayer.setOnSeekCompleteListener(new C48402Iz8(this));
                mediaPlayer.seekTo(this.LJLLLLLL);
                return;
            }
            LJIIJJI();
            InterfaceC47330Ihq interfaceC47330Ihq = this.LJLJL;
            if (interfaceC47330Ihq == null) {
                return;
            }
            interfaceC47330Ihq.LIZ(4, mediaPlayer.getDuration());
        }
    }

    @Override // X.XU4
    public final void release() {
        try {
            pause();
            this.LJZI.removeCallbacks(this.LJZL);
            this.LJZI.removeCallbacks(this.LL);
            MediaPlayer mediaPlayer = this.LJLLI;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
            MediaPlayer mediaPlayer2 = this.LJLLI;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
            }
            this.LJLLI = null;
        } catch (IllegalStateException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // X.XU4
    public final void resume() {
        try {
            LJIIJJI();
        } catch (IllegalStateException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public MusicPlayer(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLIL = context;
        this.LJLILLLLZI = "";
        this.LJLJI = -1L;
        this.LJLZ = this.LJLLLLLL;
        this.LJZI = new Handler(C16880lQ.LLJJJJ());
        this.LJZL = new ARunnableS44S0100000_8(this, 3);
        this.LL = new ARunnableS44S0100000_8(this, 2);
    }

    @Override // X.XU4
    public final void LIZIZ(InterfaceC47330Ihq interfaceC47330Ihq) {
        this.LJLJL = interfaceC47330Ihq;
    }

    @Override // X.XU4
    public final void LIZJ(InterfaceC47328Iho interfaceC47328Iho) {
        this.LJLJLLL = interfaceC47328Iho;
    }

    @Override // X.XU4
    public final void LIZLLL(C47325Ihl c47325Ihl) {
        String str;
        String str2;
        int i = c47325Ihl.LJII;
        if (i <= 0) {
            i = 0;
        }
        this.LJLLLLLL = i;
        int i2 = c47325Ihl.LJIIIIZZ;
        if (i2 > i) {
            i = i2;
        }
        this.LJLZ = i;
        this.LJZ = c47325Ihl.LJI;
        if (this.LJLLI == null) {
            this.LJLLI = new MediaPlayer();
        }
        LinkedList linkedList = new LinkedList();
        if (c47325Ihl.LIZIZ != null && (!r0.isEmpty())) {
            XPS LIZLLL = XPS.LIZLLL();
            List<String> list = c47325Ihl.LIZIZ;
            if (list != null) {
                str2 = (String) ListProtector.get(list, 0);
            } else {
                str2 = null;
            }
            str = LIZLLL.LIZJ(str2);
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str) && C39579Fg7.LIZIZ(str) && C78496UrM.LIZ(str) > 0) {
            c47325Ihl.LIZ = str;
        }
        if (!TextUtils.isEmpty(c47325Ihl.LIZ)) {
            linkedList.add(c47325Ihl.LIZ);
        } else if (C79004UzY.LJJIFFI(c47325Ihl.LIZIZ)) {
            return;
        } else {
            linkedList.addAll(c47325Ihl.LIZIZ);
        }
        LJIIJ();
        this.LJLJJL = false;
        this.LJLJJLL = false;
        MediaPlayer mediaPlayer = this.LJLLI;
        if (mediaPlayer != null) {
            mediaPlayer.setOnErrorListener(new C48399Iz5(linkedList, this, c47325Ihl));
        }
        LJIIIIZZ(c47325Ihl, linkedList, this.LJZ);
    }

    @Override // X.XU4
    public final void LJ(XUV xuv) {
        this.LJLL = xuv;
    }

    @Override // X.XU4
    public final void LJFF(InterfaceC47329Ihp interfaceC47329Ihp) {
        this.LJLJLJ = interfaceC47329Ihp;
    }

    public final void LJII(Exception exc) {
        String str;
        InterfaceC47329Ihp interfaceC47329Ihp = this.LJLJLJ;
        if (interfaceC47329Ihp != null) {
            interfaceC47329Ihp.LIZ(0, 0);
        }
        release();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLLJ;
        C47325Ihl c47325Ihl = this.LJLLL;
        if (c47325Ihl != null) {
            List<String> list = c47325Ihl.LIZIZ;
            String str2 = null;
            if (list != null) {
                str = list.toString();
            } else {
                str = null;
            }
            C48421IzR.LIZ(-1, str, this.LJLLLL, elapsedRealtime, exc.getMessage(), this.LJLILLLLZI);
            String str3 = c47325Ihl.LJFF;
            List<String> list2 = c47325Ihl.LIZIZ;
            if (list2 != null) {
                str2 = list2.toString();
            }
            C48137Iur.LIZLLL(str3, str2, this.LJLILLLLZI, this.LJLLLL, exc.getMessage());
        }
    }

    public final void LJIIL(String str) {
        String str2;
        if (this.LJLJI != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.LJLJI;
            C47325Ihl c47325Ihl = this.LJLLL;
            Integer num = null;
            if (c47325Ihl != null) {
                str2 = c47325Ihl.LJFF;
            } else {
                str2 = null;
            }
            Long valueOf = Long.valueOf(currentTimeMillis);
            String str3 = this.LJLILLLLZI;
            C47325Ihl c47325Ihl2 = this.LJLLL;
            if (c47325Ihl2 != null) {
                num = Integer.valueOf(c47325Ihl2.LIZLLL);
            }
            String str4 = this.LJLLLL;
            if (num == null || num.intValue() != 0) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("music_id", str2);
                c188727au.LJFF(valueOf, "stall_time");
                c188727au.LJIIIZ("enter_from", str3);
                c188727au.LJFF(num, "time");
                c188727au.LJIIIZ("url", str4);
                c188727au.LJIIIZ("submit_point", str);
                FMX.LJIIL("audio_stall_time", c188727au.LIZ);
            }
            this.LJLJI = -1L;
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        int i;
        MediaPlayer mediaPlayer2;
        InterfaceC47328Iho interfaceC47328Iho = this.LJLJLLL;
        if (interfaceC47328Iho != null) {
            interfaceC47328Iho.LIZIZ();
        }
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS44S0100000_8(this, 61));
        if (this.LJZ && (i = this.LJLLLLLL) > 0 && (mediaPlayer2 = this.LJLLI) != null) {
            mediaPlayer2.seekTo(i);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        String str;
        try {
            try {
            } catch (IllegalStateException e) {
                release();
                LJII(e);
            }
            if (!this.LJLJJL && !this.LJLJJLL) {
                new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS44S0100000_8(this, 62));
                long currentTimeMillis = System.currentTimeMillis();
                Long l = this.LJLJJI;
                o.LJI(l);
                long longValue = currentTimeMillis - l.longValue();
                C47325Ihl c47325Ihl = this.LJLLL;
                Integer num = null;
                if (c47325Ihl != null) {
                    str = c47325Ihl.LJFF;
                } else {
                    str = null;
                }
                Long valueOf = Long.valueOf(longValue);
                String str2 = this.LJLILLLLZI;
                C47325Ihl c47325Ihl2 = this.LJLLL;
                if (c47325Ihl2 != null) {
                    num = Integer.valueOf(c47325Ihl2.LIZLLL);
                }
                C48137Iur.LJI(valueOf, str, str2, num, this.LJLLLL);
                this.LJLJI = -1L;
                LJIIIZ();
            }
        } finally {
            LJIIJ();
        }
    }

    public final void LJI(int i, int i2) {
        String str;
        InterfaceC47329Ihp interfaceC47329Ihp = this.LJLJLJ;
        if (interfaceC47329Ihp != null) {
            interfaceC47329Ihp.LIZ(i, i2);
        }
        release();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLLJ;
        C47325Ihl c47325Ihl = this.LJLLL;
        if (c47325Ihl != null) {
            List<String> list = c47325Ihl.LIZIZ;
            String str2 = null;
            if (list != null) {
                str = list.toString();
            } else {
                str = null;
            }
            C48421IzR.LIZ(i, str, this.LJLLLL, elapsedRealtime, String.valueOf(i2), this.LJLILLLLZI);
            String str3 = c47325Ihl.LJFF;
            List<String> list2 = c47325Ihl.LIZIZ;
            if (list2 != null) {
                str2 = list2.toString();
            }
            C48137Iur.LIZLLL(str3, str2, this.LJLILLLLZI, this.LJLLLL, String.valueOf(i2));
        }
    }

    @Override // X.XU4
    public final void LIZ(String str, String destPath, C84862XSg c84862XSg) {
        o.LJIIIZ(destPath, "destPath");
        c84862XSg.LJIILJJIL(-1);
    }

    public final void LJIIIIZZ(C47325Ihl c47325Ihl, LinkedList linkedList, boolean z) {
        MediaPlayer mediaPlayer;
        String str;
        if (this.LJLJJL || this.LJLJJLL || (mediaPlayer = this.LJLLI) == null) {
            return;
        }
        try {
            this.LJLLL = c47325Ihl;
            CountDownTimerC48400Iz6 countDownTimerC48400Iz6 = new CountDownTimerC48400Iz6(linkedList, this, c47325Ihl, z, XPS.LJFF);
            this.LJLLILLLL = countDownTimerC48400Iz6;
            countDownTimerC48400Iz6.start();
            String str2 = (String) linkedList.poll();
            this.LJLLLL = str2;
            Uri parse = UriProtector.parse(str2);
            mediaPlayer.stop();
            mediaPlayer.reset();
            this.LJLLJ = SystemClock.elapsedRealtime();
            mediaPlayer.setAudioStreamType(3);
            HashMap<String, String> hashMap = c47325Ihl.LJ;
            if (hashMap != null) {
                mediaPlayer.setDataSource(this.LJLIL, parse, hashMap);
            } else {
                mediaPlayer.setDataSource(this.LJLIL, parse);
            }
            mediaPlayer.setLooping(z);
            String str3 = c47325Ihl.LJFF;
            List<String> list = c47325Ihl.LIZIZ;
            if (list != null) {
                str = list.toString();
            } else {
                str = null;
            }
            C48137Iur.LJ(str3, str, Long.valueOf(c47325Ihl.LIZLLL), this.LJLILLLLZI, this.LJLLLL);
            this.LJLJJI = Long.valueOf(System.currentTimeMillis());
            mediaPlayer.prepareAsync();
            mediaPlayer.setOnPreparedListener(this);
            mediaPlayer.setOnCompletionListener(this);
            mediaPlayer.setOnInfoListener(this);
        } catch (Exception e) {
            release();
            LJII(e);
        }
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i == 701) {
            this.LJLJI = System.currentTimeMillis();
            return true;
        }
        if (i != 702) {
            return true;
        }
        LJIIL("buffering_end");
        return true;
    }
}
