package X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.PlayModel;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.VbJ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80049VbJ implements InterfaceC48640J7c {
    public static final String LJIIIIZZ = C16880lQ.LJLLJ(C80049VbJ.class);
    public final C62822Ol8 LIZ;
    public EnumC80054VbO LIZIZ;
    public C73363Sql LIZJ;
    public long LIZLLL;
    public J7O LJ;
    public final Context LJFF;
    public final InterfaceC80047VbH LJI;
    public final C79702VPu LJII;

    @Override // X.InterfaceC48640J7c
    public final void LIZ(EnumC48648J7k errorCode) {
        o.LJIIJ(errorCode, "errorCode");
    }

    @Override // X.InterfaceC48640J7c
    public final void LIZIZ(InterfaceC80053VbN engine) {
        o.LJIIJ(engine, "engine");
    }

    @Override // X.InterfaceC48640J7c
    public final void LIZJ(J7W engine) {
        o.LJIIJ(engine, "engine");
    }

    @Override // X.InterfaceC48640J7c
    public final void LIZLLL(InterfaceC80053VbN engine, long j) {
        o.LJIIJ(engine, "engine");
    }

    @Override // X.InterfaceC48640J7c
    public final void LJ(J7W engine, EnumC48641J7d enumC48641J7d) {
        o.LJIIJ(engine, "engine");
    }

    @Override // X.InterfaceC48640J7c
    public final void LJFF(InterfaceC80053VbN engine, EnumC79954VZm playbackState) {
        o.LJIIJ(engine, "engine");
        o.LJIIJ(playbackState, "playbackState");
    }

    @Override // X.InterfaceC48640J7c
    public final void LJI(InterfaceC80053VbN engine, long j) {
        o.LJIIJ(engine, "engine");
    }

    @Override // X.InterfaceC48640J7c
    public final void LJII(InterfaceC80053VbN engine) {
        o.LJIIJ(engine, "engine");
    }

    @Override // X.InterfaceC48640J7c
    public final void LJIIIIZZ(InterfaceC80053VbN engine) {
        o.LJIIJ(engine, "engine");
    }

    @Override // X.InterfaceC48640J7c
    public final void LJIIIZ(J7W engine) {
        o.LJIIJ(engine, "engine");
    }

    @Override // X.InterfaceC48640J7c
    public final void LJIIJ(J7W engine) {
        o.LJIIJ(engine, "engine");
    }

    public final InterfaceC80053VbN LJIIL() {
        return (InterfaceC80053VbN) this.LIZ.getValue();
    }

    public final boolean LJIIJJI(EnumC80054VbO enumC80054VbO) {
        EnumC80054VbO enumC80054VbO2 = this.LIZIZ;
        if (enumC80054VbO2 == EnumC80054VbO.INIT) {
            this.LIZIZ = enumC80054VbO;
        } else if (enumC80054VbO2.LJLIL > enumC80054VbO.LJLIL) {
            this.LIZIZ = enumC80054VbO;
        } else {
            return false;
        }
        return true;
    }

    public final void LJIILIIL(EnumC48648J7k enumC48648J7k) {
        String str;
        C73363Sql c73363Sql = this.LIZJ;
        if (c73363Sql != null) {
            if (c73363Sql.LIZLLL != null && LJIIJJI(EnumC80054VbO.AFD)) {
                AssetFileDescriptor assetFileDescriptor = c73363Sql.LIZLLL;
                if (assetFileDescriptor != null) {
                    LJIIL().LIZ(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getDeclaredLength());
                    return;
                }
                return;
            }
            String str2 = c73363Sql.LIZIZ;
            if (str2 != null && str2.length() > 0 && LJIIJJI(EnumC80054VbO.LOCAL_FILE)) {
                LJIIL().LIZLLL(c73363Sql.LIZIZ);
                return;
            }
            String str3 = c73363Sql.LIZJ;
            if (str3 == null || str3.length() <= 0 || (str = c73363Sql.LIZ) == null || str.length() == 0 || !LJIIJJI(EnumC80054VbO.PRELOAD_CACHE)) {
                PlayModel playModel = c73363Sql.LJ;
                if (playModel != null && playModel.getVideoModelJsonObj() != null && LJIIJJI(EnumC80054VbO.VIDEO_MODEL)) {
                    PlayModel playModel2 = c73363Sql.LJ;
                    if (playModel2 == null) {
                        return;
                    }
                    InterfaceC80053VbN LJIIL = LJIIL();
                    EnumC47176IfM resolution = playModel2.getResolution();
                    playModel2.getEncryptType();
                    LJIIL.LJIIIZ(resolution, playModel2.getVideoModel());
                    return;
                }
                String str4 = c73363Sql.LIZ;
                if (str4 == null || str4.length() == 0 || !LJIIJJI(EnumC80054VbO.PLAY_URL)) {
                    this.LIZIZ = EnumC80054VbO.INIT;
                    this.LJI.LIZ(enumC48648J7k);
                    return;
                } else {
                    LJIIL().LJ(c73363Sql.LIZ);
                    return;
                }
            }
            LJIIL().LJII(c73363Sql.LIZ, c73363Sql.LIZJ);
        }
    }

    public C80049VbJ(Context mContext, C80060VbU mListener, C79702VPu mAudioErrorMonitor) {
        o.LJIIJ(mContext, "mContext");
        o.LJIIJ(mListener, "mListener");
        o.LJIIJ(mAudioErrorMonitor, "mAudioErrorMonitor");
        this.LJFF = mContext;
        this.LJI = mListener;
        this.LJII = mAudioErrorMonitor;
        this.LIZ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 393));
        this.LIZIZ = EnumC80054VbO.INIT;
        this.LJ = new J7I();
    }
}
