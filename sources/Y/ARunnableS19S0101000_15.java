package Y;

import X.C16880lQ;
import X.C2068389v;
import X.C65210PiY;
import X.C68876R1k;
import X.C74088T5w;
import X.C85809Xm1;
import X.SGH;
import X.X1D;
import X.X38;
import X.X3D;
import X.X4A;
import X.X4J;
import X.YAB;
import X.YQ4;
import X.YQ7;
import android.content.Context;
import android.database.sqlite.SQLiteStatement;
import android.media.MediaPlayer;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.aweme.choosemusic.cutmusic.CutMusicRepeartPlayer;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class ARunnableS19S0101000_15 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            case 12:
                run$12(this);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                run$13(this);
                return;
            case 14:
                run$14(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        X3D x3d = ((X38) this.l0).LIZ;
        int i = this.i1;
        synchronized (x3d) {
            if (C65210PiY.LIZ()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Trace:");
                LIZ.append(Log.getStackTraceString(new Throwable()));
                C65210PiY.LIZLLL(i, "AbsDownloadEngine", "resume", X1D.LIZIZ(LIZ));
            }
            DownloadTask downloadTask = x3d.LIZ.get(i);
            if (downloadTask != null) {
                DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
                if (downloadInfo != null) {
                    downloadInfo.setDownloadFromReserveWifi(false);
                }
                x3d.LJIL(downloadTask);
            } else {
                x3d.LJIJI(i);
            }
        }
    }

    public final void LIZ$1() {
        SGH sgh;
        List<SGH> list = ((YAB) this.l0).LJLJL;
        if (list != null && (sgh = (SGH) ListProtector.get(list, this.i1)) != null) {
            sgh.LIZIZ = true;
        }
        ((YAB) this.l0).LJLJI.notifyItemChanged(this.i1);
        YAB yab = (YAB) this.l0;
        yab.LJLILLLLZI.post(new ARunnableS19S0101000_15(yab, this.i1, 8));
    }

    public final void LIZ$2() {
        C74088T5w c74088T5w = ((C85809Xm1) this.l0).LJLJJLL;
        if (c74088T5w != null) {
            c74088T5w.setEnabled(true);
            ImageView imageView = ((C85809Xm1) this.l0).LJLJL;
            if (imageView != null) {
                int i = this.i1;
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = i;
                ImageView imageView2 = ((C85809Xm1) this.l0).LJLJL;
                if (imageView2 != null) {
                    Context context = imageView2.getContext();
                    o.LJIIIIZZ(context, "providerImage.context");
                    imageView.setImageDrawable(c2068389v.LIZ(context));
                    return;
                }
                o.LJIJI("providerImage");
                throw null;
            }
            o.LJIJI("providerImage");
            throw null;
        }
        o.LJIJI("verifyButton");
        throw null;
    }

    public static final void run$0(ARunnableS19S0101000_15 aRunnableS19S0101000_15) {
        boolean LIZ;
        try {
            try {
                X4J x4j = (X4J) aRunnableS19S0101000_15.l0;
                x4j.LIZIZ(aRunnableS19S0101000_15.i1, x4j.LIZLLL(), true);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS19S0101000_15 aRunnableS19S0101000_15) {
        boolean LIZ;
        DownloadInfo downloadInfo;
        try {
            X3D x3d = ((X38) aRunnableS19S0101000_15.l0).LIZ;
            int i = aRunnableS19S0101000_15.i1;
            synchronized (x3d) {
                DownloadTask downloadTask = x3d.LIZ.get(i);
                if (downloadTask != null && (downloadInfo = downloadTask.getDownloadInfo()) != null) {
                    downloadInfo.setForceIgnoreRecommendSize(true);
                    x3d.LJIL(downloadTask);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS19S0101000_15 aRunnableS19S0101000_15) {
        boolean LIZ;
        SGH sgh;
        try {
            if (((YAB) aRunnableS19S0101000_15.l0).LJLIL.getParent() != null) {
                List<SGH> list = ((YAB) aRunnableS19S0101000_15.l0).LJLJL;
                if (list != null && (sgh = (SGH) ListProtector.get(list, aRunnableS19S0101000_15.i1)) != null) {
                    sgh.LIZIZ = false;
                }
                ((YAB) aRunnableS19S0101000_15.l0).LJLJI.notifyItemChanged(aRunnableS19S0101000_15.i1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS19S0101000_15 aRunnableS19S0101000_15) {
        boolean LIZ;
        try {
            YQ7 yq7 = (YQ7) aRunnableS19S0101000_15.l0;
            yq7.LJFF.LJ(yq7.LJIIIZ, yq7.LJII.LJLILLLLZI, aRunnableS19S0101000_15.i1, "updateCapture : something wrong.");
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$12(ARunnableS19S0101000_15 aRunnableS19S0101000_15) {
        boolean LIZ;
        try {
            aRunnableS19S0101000_15.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$13(ARunnableS19S0101000_15 aRunnableS19S0101000_15) {
        boolean LIZ;
        try {
            ((X4A) aRunnableS19S0101000_15.l0).B0();
            if (X4A.LJLJJLL != null) {
                C68876R1k c68876R1k = ((X4A) aRunnableS19S0101000_15.l0).LJLILLLLZI;
                if (c68876R1k != null) {
                    try {
                        int i = aRunnableS19S0101000_15.i1;
                        SQLiteStatement LIZ2 = c68876R1k.LIZ();
                        if (LIZ2 != null) {
                            synchronized (LIZ2) {
                                LIZ2.bindLong(1, i);
                                LIZ2.execute();
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$14(ARunnableS19S0101000_15 aRunnableS19S0101000_15) {
        boolean LIZ;
        try {
            ((X4A) aRunnableS19S0101000_15.l0).LJIILJJIL(aRunnableS19S0101000_15.i1);
            ((X4A) aRunnableS19S0101000_15.l0).LJLJI(aRunnableS19S0101000_15.i1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS19S0101000_15 aRunnableS19S0101000_15) {
        boolean LIZ;
        try {
            ((X38) aRunnableS19S0101000_15.l0).LIZ.LJIILL(aRunnableS19S0101000_15.i1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS19S0101000_15 aRunnableS19S0101000_15) {
        boolean LIZ;
        try {
            aRunnableS19S0101000_15.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS19S0101000_15 aRunnableS19S0101000_15) {
        boolean LIZ;
        try {
            ((X38) aRunnableS19S0101000_15.l0).LIZ.LJIJI(aRunnableS19S0101000_15.i1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS19S0101000_15 aRunnableS19S0101000_15) {
        boolean LIZ;
        try {
            ((YQ4) aRunnableS19S0101000_15.l0).LJJJJJ(aRunnableS19S0101000_15.i1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS19S0101000_15 aRunnableS19S0101000_15) {
        boolean LIZ;
        try {
            MediaPlayer mediaPlayer = ((CutMusicRepeartPlayer) aRunnableS19S0101000_15.l0).LJLIL;
            if (mediaPlayer != null) {
                if (mediaPlayer.isPlaying()) {
                    ((CutMusicRepeartPlayer) aRunnableS19S0101000_15.l0).LJLIL.pause();
                }
                ((CutMusicRepeartPlayer) aRunnableS19S0101000_15.l0).LIZ(aRunnableS19S0101000_15.i1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS19S0101000_15 aRunnableS19S0101000_15) {
        boolean LIZ;
        try {
            if (((YAB) aRunnableS19S0101000_15.l0).LJLIL.getParent() != null) {
                ((YAB) aRunnableS19S0101000_15.l0).LJLIL.LJLIL(aRunnableS19S0101000_15.i1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS19S0101000_15 aRunnableS19S0101000_15) {
        boolean LIZ;
        String str;
        SGH sgh;
        Effect effect;
        try {
            YAB yab = (YAB) aRunnableS19S0101000_15.l0;
            TextView textView = yab.LJLILLLLZI;
            List<SGH> list = yab.LJLJL;
            if (list != null && (sgh = (SGH) ListProtector.get(list, aRunnableS19S0101000_15.i1)) != null && (effect = sgh.LIZ) != null) {
                str = effect.getName();
            } else {
                str = null;
            }
            textView.setText(str);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS19S0101000_15 aRunnableS19S0101000_15) {
        boolean LIZ;
        try {
            aRunnableS19S0101000_15.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS19S0101000_15(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
