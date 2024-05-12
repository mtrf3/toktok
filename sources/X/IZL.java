package X;

import Y.IDComparatorS36S0000000_8;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.playerkit.exp.model.SrReverseConfig;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import com.ss.texturerender.VideoSurface;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IZL extends AbstractC46839IZv implements InterfaceC47896Iqy, InterfaceC46804IYm, InterfaceC46820IZc, InterfaceC46855IaB {
    public final Context LJLIL;
    public final SparseIntArray LJLILLLLZI;
    public final SparseArray LJLJI;
    public final C47282Ih4 LJLJJI;
    public C46882Iac LJLJJL;
    public boolean LJLJJLL;
    public volatile String LJLJL;
    public boolean LJLJLJ;
    public String LJLL;
    public boolean LJLLI;
    public Surface LJLLILLLL;
    public Surface LJLLJ;
    public boolean LJLLL;
    public final IZS LJZ;
    public final IZO LJZI;
    public final IZU LJZL;
    public final C46818IZa LL;
    public final C47272Igu LLD;
    public final C46939IbX LLF;
    public final C46740IWa LLFF;
    public final C46797IYf LLFFF;
    public final IYT LLFII;
    public final C46842IZy LLFZ;
    public final IZM LLI;
    public final IZP LLIFFJFJJ;
    public int LJLJLLL = 1;
    public final C46822IZe LJLLLL = new C46822IZe(this);
    public InterfaceC46823IZf LJLLLLLL = new IUD();
    public float LJLZ = 1.0f;

    @Override // X.IX9
    public final boolean LIZLLL() {
        C46882Iac c46882Iac = this.LJLJJL;
        if (c46882Iac != null && c46882Iac.LJJJLL()) {
            return true;
        }
        return false;
    }

    @Override // X.IX9
    public final C38798FKo LJ() {
        String str;
        C38798FKo c38798FKo = new C38798FKo();
        C46882Iac c46882Iac = this.LJLJJL;
        if (c46882Iac != null) {
            str = c46882Iac.LJJIJIL();
        } else {
            str = null;
        }
        c38798FKo.LIZ = str;
        return c38798FKo;
    }

    @Override // X.InterfaceC46820IZc
    public final java.util.Map<String, String> LJIILIIL() {
        return this.LLIFFJFJJ.LJIILIIL();
    }

    @Override // X.InterfaceC46820IZc
    public final java.util.Map<String, String> LJIILJJIL() {
        return this.LLIFFJFJJ.LJIILJJIL();
    }

    @Override // X.InterfaceC46820IZc
    public final java.util.Map<String, String> LJIILL() {
        return this.LLIFFJFJJ.LJIILL();
    }

    @Override // X.InterfaceC46820IZc
    public final java.util.Map<String, String> LJJIIJ() {
        java.util.Map<String, String> LJJIIJ = this.LLIFFJFJJ.LJJIIJ();
        LJJIIJ.putAll(this.LLI.LIZLLL());
        return LJJIIJ;
    }

    public final void LJJIJL() {
        C46882Iac c46882Iac = this.LJLJJL;
        if (c46882Iac != null) {
            c46882Iac.LJJLJLI(0, true);
        }
    }

    public final void LJJIJLIJ() {
        Surface surface = this.LJLLJ;
        if (surface != null && C46936IbU.LIZ(surface) != null && this.LJLJJL != null) {
            if (IXB.LIZ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("clearSurfaceViewSurface, setSurfaceHolder null, surface = ");
                LIZ.append(this.LJLLJ);
                IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
            }
            this.LJLJJL.LLILZLL(null);
            this.LJLLJ = null;
            this.LJLLL = false;
        }
    }

    public final void LJJJIL() {
        Object value = IZ8.LL.getValue();
        o.LJIIIIZZ(value, "<get-SR_TEXTURE_DYNAMIC_CONTROL>(...)");
        if (!((Boolean) value).booleanValue()) {
            this.LJLJJL.LJJJZ(false);
            return;
        }
        int i = this.LLFFF.LJLJLLL;
        if (i == 0 || i == -1) {
            return;
        }
        this.LJLJJL.LJJJZ(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x037f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0358  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJ() {
        /*
            Method dump skipped, instructions count: 904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IZL.LJJJJ():void");
    }

    public final long LJJJJI() {
        int LJIJI;
        C46882Iac c46882Iac = this.LJLJJL;
        if (c46882Iac == null) {
            return 0L;
        }
        try {
            if (this.LJLLI) {
                LJIJI = c46882Iac.LJIJ();
            } else {
                LJIJI = c46882Iac.LJIJI();
            }
            return LJIJI;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public final long LJJJJIZL() {
        try {
            if (this.LJLJJL != null) {
                return r0.LJIL();
            }
            return 1073741823L;
        } catch (Exception unused) {
            return 1073741823L;
        }
    }

    public final Surface LJJJJL() {
        C46882Iac c46882Iac = this.LJLJJL;
        if (c46882Iac != null) {
            return c46882Iac.LJJIJLIJ();
        }
        return null;
    }

    public final float LJJJJLI() {
        C46882Iac c46882Iac = this.LJLJJL;
        if (c46882Iac != null) {
            return c46882Iac.LJJJJ();
        }
        return -1.0f;
    }

    public final int LJJJJLL() {
        int i;
        C46882Iac c46882Iac = this.LJLJJL;
        if (c46882Iac != null) {
            i = c46882Iac.LJJJJI();
        } else {
            i = -1;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getWatchedDuration: ");
        LIZ.append(i);
        IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
        return i;
    }

    public final void LJJJJZ() {
        C46882Iac c46882Iac = this.LJLJJL;
        if (c46882Iac != null) {
            c46882Iac.LJIIIIZZ();
            this.LLIFFJFJJ.LJIIIZ();
        }
        C56662Kg.LIZ().LJFF("player_precreate_duration", false);
        if (!C56662Kg.LIZ().LJII("player_precreate_end_to_prerender_start")) {
            C56662Kg.LIZ().LIZJ("player_precreate_end_to_prerender_start", false);
        }
    }

    public final boolean LJJJJZI() {
        C46882Iac c46882Iac = this.LJLJJL;
        if (c46882Iac == null || c46882Iac.LJJIII() != 2) {
            return false;
        }
        return true;
    }

    public final boolean LJJJLIIL() {
        C46882Iac c46882Iac = this.LJLJJL;
        if (c46882Iac == null || c46882Iac.LJJIJIIJIL() != 2) {
            return false;
        }
        return true;
    }

    public final boolean LJJJLL() {
        C46882Iac c46882Iac = this.LJLJJL;
        if (c46882Iac == null || c46882Iac.LJJIJIIJIL() != 1) {
            return false;
        }
        return true;
    }

    public final boolean LJJJLZIJ() {
        C46882Iac c46882Iac = this.LJLJJL;
        if (c46882Iac == null || c46882Iac.LJJIJIIJIL() != 0) {
            return false;
        }
        return true;
    }

    public final void LJJJZ() {
        if (Build.VERSION.SDK_INT < 26 && this.LLFII.LJLJI) {
            this.LJLJJLL = true;
        }
    }

    public final void LJJL() {
        Surface surface;
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("pause  mPlayer = ");
            LIZ.append(this.LJLJJL);
            LIZ.append(", surface = ");
            if (this.LJLLL) {
                surface = this.LJLLJ;
            } else {
                surface = this.LJLLILLLL;
            }
            LIZ.append(surface);
            IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
        }
        this.LLIFFJFJJ.LJJIIZI();
        try {
            C46882Iac c46882Iac = this.LJLJJL;
            if (c46882Iac != null) {
                c46882Iac.LJJL();
            }
        } catch (Exception e) {
            SimRadar.errorScan("TTPlayer", "pause", new C46691IUd(e), new Object[0]);
        }
        this.LLIFFJFJJ.LJIJJLI();
        this.LJLJJLL = false;
    }

    public final void LJJLIIIJILLIZJL() {
        Surface surface;
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("release  mPlayer = ");
            LIZ.append(this.LJLJJL);
            LIZ.append(", surface = ");
            if (this.LJLLL) {
                surface = this.LJLLJ;
            } else {
                surface = this.LJLLILLLL;
            }
            LIZ.append(surface);
            IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
        }
        this.LLIFFJFJJ.LJIIJ();
        try {
            this.LJLJJL.LJZI(null);
            LJJIJLIJ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("VIDEO@");
            LIZ2.append(this.LJLL);
            SimRadar.traceGroup(X1D.LIZIZ(LIZ2)).LIZIZ("TTRelease-1");
            this.LJLJJL.LJJLIIIJILLIZJL();
        } catch (Exception e) {
            SimRadar.errorScan("TTPlayer", "release", new C46691IUd(e), new Object[0]);
        }
        this.LLIFFJFJJ.LJIILLIIL();
    }

    public final void LJJLIIIJL() {
        IZU izu = this.LJZL;
        C46882Iac player = izu.LJLILLLLZI.getPlayer();
        IXB.LIZIZ("TTPlayer", "Enter setAudioInfoListener");
        if (player != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setAudioInfoListener do:");
            LIZ.append(izu.LJLLJ);
            IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
            player.LLJL(izu.LJLLJ);
        }
    }

    public final void LJLIIIL() {
        IZU izu = this.LJZL;
        C46882Iac player = izu.LJLILLLLZI.getPlayer();
        IXB.LIZIZ("TTPlayer", "Enter setSubInfoListener");
        if (player != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setSubInfoListener do:");
            LIZ.append(izu.LJLLILLLL);
            IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
            player.LLILLL(izu.LJLLILLLL);
        }
    }

    public final void LJLJI() {
        C46882Iac player = this.LJZL.LJLILLLLZI.getPlayer();
        IXB.LIZIZ("TTPlayer", "Enter setSubtitlesEnableLazyLoading");
        if (player != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setSubtitlesEnableLazyLoading:");
            LIZ.append(true);
            IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
            player.LJLLLL(859, 1);
        }
    }

    public final void LJLJJLL() {
        Surface surface;
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sleep  mPlayer = ");
            LIZ.append(this.LJLJJL);
            LIZ.append(", surface = ");
            if (this.LJLLL) {
                surface = this.LJLLJ;
            } else {
                surface = this.LJLLILLLL;
            }
            LIZ.append(surface);
            IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
        }
        C46882Iac c46882Iac = this.LJLJJL;
        if (c46882Iac == null) {
            return;
        }
        c46882Iac.LJLLLL(27, 1);
        LJLJL();
    }

    public final void LJLJL() {
        Surface surface;
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("stop  mPlayer = ");
            LIZ.append(this.LJLJJL);
            LIZ.append(", surface = ");
            if (this.LJLLL) {
                surface = this.LJLLJ;
            } else {
                surface = this.LJLLILLLL;
            }
            LIZ.append(surface);
            IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
        }
        this.LLIFFJFJJ.LJIJI();
        try {
            C46882Iac c46882Iac = this.LJLJJL;
            if (c46882Iac != null) {
                c46882Iac.LJLLI(null, 3);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("VIDEO@");
                LIZ2.append(this.LJLL);
                SimRadar.traceGroup(X1D.LIZIZ(LIZ2)).LIZ("TTPlay-TTStop").end();
                this.LJLJJL.LLJJJJJIL();
            }
        } catch (Exception e) {
            SimRadar.errorScan("TTPlayer", "stop", new C46691IUd(e), new Object[0]);
        }
        this.LLIFFJFJJ.LJIJ();
    }

    public final boolean LJLJLJ() {
        try {
            C46882Iac c46882Iac = this.LJLJJL;
            if (c46882Iac != null) {
                return c46882Iac.LLJJJJLIIL();
            }
            return true;
        } catch (Exception e) {
            SimRadar.errorScan("TTPlayer", "supportHevcPlayback", new C46691IUd(e), new Object[0]);
            return true;
        }
    }

    @Override // X.IX9
    public final ITI getVideoInfo() {
        C47824Ipo c47824Ipo;
        C46797IYf c46797IYf = this.LLFFF;
        C46882Iac player = c46797IYf.LJLILLLLZI.getPlayer();
        if (player != null && ((c47824Ipo = c46797IYf.LJLJJI) != null || (c47824Ipo = player.LJJIIZI()) != null)) {
            C197817pZ c197817pZ = new C197817pZ();
            c197817pZ.LIZ = c46797IYf.LJLJJL;
            c47824Ipo.LIZ("ffr_read_head_duration");
            c197817pZ.LIZIZ = c47824Ipo.LIZ("ffr_read_first_data_duration");
            c47824Ipo.LIZ("ffr_decode_duration");
            c197817pZ.LIZJ = c47824Ipo.LIZ("ffr_render_duration");
            c197817pZ.LIZLLL = c47824Ipo.LIZ("ffr_playback_buffering_duration");
            c47824Ipo.LIZ("ffr_prender_duration");
            c46797IYf.LJLJI.LJI = c197817pZ;
        }
        c46797IYf.LJLJI.LJIIL = c46797IYf.LJLL;
        return c46797IYf.LJLJI;
    }

    @Override // X.IX9
    public final boolean isMute() {
        C46882Iac c46882Iac = this.LJLJJL;
        if (c46882Iac == null) {
            return false;
        }
        return c46882Iac.LJJJJLI();
    }

    @Override // X.InterfaceC46804IYm
    public final List<C46801IYj> t7() {
        IZY izy = this.LLI.LJLJI;
        if (izy != null) {
            return izy.LJIILL();
        }
        return null;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TTPlayer{mPlayer=");
        LIZ.append(this.LJLJJL);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.IX9
    public final float LJJ() {
        return this.LJLZ;
    }

    @Override // X.InterfaceC46804IYm
    public final C46882Iac getPlayer() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC46804IYm
    public final String getSourceId() {
        return this.LJLL;
    }

    @Override // X.InterfaceC46804IYm
    public final C47282Ih4 q7() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC46804IYm
    public final SparseArray r7() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC46804IYm
    public final SparseIntArray s7() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC46804IYm
    public final InterfaceC46823IZf u7() {
        return this.LJLLLLLL;
    }

    @Override // X.IX9
    public final void LIZ(String str) {
        C46882Iac player = this.LLFZ.LJLILLLLZI.getPlayer();
        if (player != null) {
            player.LJLIL(str);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0016. Please report as an issue. */
    @Override // X.IX9
    public final float LIZIZ(int i) {
        long LJJJJI;
        int i2;
        C46882Iac c46882Iac = this.LJLJJL;
        if (c46882Iac == null) {
            return -1.0f;
        }
        int i3 = 0;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 4) {
                            if (i != 5) {
                                switch (i) {
                                    case 8:
                                        LJJJJI = c46882Iac.LJJIIJZLJL(60);
                                        break;
                                    case 9:
                                        i2 = c46882Iac.LJJII(42);
                                        break;
                                    case 10:
                                        return c46882Iac.LJJ(70);
                                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                        i2 = c46882Iac.LJJII(660);
                                        break;
                                    case 12:
                                        int LJ = IZ8.LJ();
                                        int i4 = this.LJLJLLL;
                                        if (i4 != 0) {
                                            if (i4 != 4 && LJ != 1) {
                                                if (LJ != 0) {
                                                    return 1.0f;
                                                }
                                            }
                                            return 1.5f;
                                        }
                                        return 2.0f;
                                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                                        i2 = c46882Iac.LJJII(59);
                                        break;
                                    case 14:
                                        LJJJJI = c46882Iac.LJJIIJZLJL(64);
                                        break;
                                    case 15:
                                        LJJJJI = ((C47619ImV) c46882Iac.LJJIZ()).LIZLLL(15);
                                        break;
                                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                                        i2 = c46882Iac.hashCode();
                                        break;
                                    case 17:
                                        Surface surface = this.LJLLJ;
                                        if (surface != null) {
                                            i3 = surface.hashCode();
                                        } else {
                                            Surface surface2 = this.LJLLILLLL;
                                            if (surface2 != null) {
                                                i3 = surface2.hashCode();
                                            }
                                        }
                                        return i3;
                                    default:
                                        return -1.0f;
                                }
                            } else {
                                LJJJJI = c46882Iac.LJJIIJZLJL(61);
                            }
                        } else {
                            LJJJJI = c46882Iac.LJJIIJZLJL(62);
                        }
                    } else {
                        return c46882Iac.LJJ(71);
                    }
                } else {
                    i2 = c46882Iac.LIZ.LJJJLZIJ;
                }
                return i2;
            }
            LJJJJI = LJJJJI();
            return (float) LJJJJI;
        } catch (Exception e) {
            SimRadar.errorScan("TTPlayer", "getInfo", new C46691IUd(e), Integer.valueOf(i));
            return -1.0f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v28, types: [T] */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v69 */
    /* JADX WARN: Type inference failed for: r3v70 */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r3v72 */
    /* JADX WARN: Type inference failed for: r3v73 */
    /* JADX WARN: Type inference failed for: r3v74 */
    /* JADX WARN: Type inference failed for: r3v75 */
    /* JADX WARN: Type inference failed for: r3v76 */
    /* JADX WARN: Type inference failed for: r3v77 */
    /* JADX WARN: Type inference failed for: r3v78 */
    /* JADX WARN: Type inference failed for: r3v79 */
    /* JADX WARN: Type inference failed for: r3v80 */
    /* JADX WARN: Type inference failed for: r3v81 */
    /* JADX WARN: Type inference failed for: r3v82 */
    /* JADX WARN: Type inference failed for: r3v83 */
    /* JADX WARN: Type inference failed for: r3v84 */
    /* JADX WARN: Type inference failed for: r3v85 */
    /* JADX WARN: Type inference failed for: r3v86 */
    @Override // X.IX9, X.InterfaceC46804IYm
    public final <T> T LIZJ(IU1<T> command) {
        C46882Iac c46882Iac;
        VideoSurface videoSurface;
        VideoSurface videoSurface2;
        VideoSurface videoSurface3;
        VideoSurface videoSurface4;
        VideoSurface videoSurface5;
        VideoSurface videoSurface6;
        int LJIJ;
        ?? r3;
        o.LJIIIZ(command, "command");
        boolean z = false;
        Integer num = (T) null;
        if (command instanceof AbstractC46667ITf) {
            AbstractC46667ITf abstractC46667ITf = (AbstractC46667ITf) command;
            try {
                if (abstractC46667ITf instanceof IP4) {
                    if (o.LJ(this.LJLL, null) && LJJJLL()) {
                        z = true;
                    }
                    r3 = (T) Boolean.valueOf(z);
                } else if (abstractC46667ITf instanceof C46668ITg) {
                    C46882Iac c46882Iac2 = this.LJLJJL;
                    Integer num2 = num;
                    if (c46882Iac2 != null) {
                        num2 = (T) Integer.valueOf(c46882Iac2.LJJII(1403));
                    }
                    r3 = (T) C78685UuP.LJJIJL(num2);
                } else if (abstractC46667ITf instanceof C46573IPp) {
                    C46882Iac c46882Iac3 = this.LJLJJL;
                    r3 = c46882Iac3 == null ? num : (T) Long.valueOf(c46882Iac3.LJJIIJZLJL(64));
                } else if (abstractC46667ITf instanceof C46670ITi) {
                    C46882Iac c46882Iac4 = this.LJLJJL;
                    if (c46882Iac4 == null) {
                        LJIJ = -1;
                    } else {
                        LJIJ = c46882Iac4.LJIJ();
                    }
                    r3 = (T) Integer.valueOf(LJIJ);
                } else if (abstractC46667ITf instanceof C46672ITk) {
                    C46882Iac c46882Iac5 = this.LJLJJL;
                    r3 = c46882Iac5 == null ? num : (T) Long.valueOf(c46882Iac5.LJJIIJZLJL(60));
                } else if (abstractC46667ITf instanceof IP3) {
                    C46882Iac c46882Iac6 = this.LJLJJL;
                    r3 = c46882Iac6 == null ? num : (T) Integer.valueOf(c46882Iac6.LJJII(44));
                } else if (abstractC46667ITf instanceof IT6) {
                    C46882Iac c46882Iac7 = this.LJLJJL;
                    Integer num3 = c46882Iac7 == null ? num : (T) Integer.valueOf(c46882Iac7.LJJII(44));
                    if (num3 != null && num3.intValue() == 4096) {
                        r3 = (T) "AAC";
                    }
                    r3 = (T) ((String) abstractC46667ITf.LIZIZ);
                } else if (abstractC46667ITf instanceof C46669ITh) {
                    C46882Iac c46882Iac8 = this.LJLJJL;
                    r3 = c46882Iac8 == null ? num : (T) Integer.valueOf(c46882Iac8.LJJII(59));
                } else if (abstractC46667ITf instanceof ITC) {
                    C46882Iac c46882Iac9 = this.LJLJJL;
                    Integer num4 = num;
                    if (c46882Iac9 != null) {
                        num4 = (T) Integer.valueOf(c46882Iac9.LJJII(59));
                    }
                    r3 = (T) C78685UuP.LJ(num4);
                } else if (abstractC46667ITf instanceof ITJ) {
                    C46882Iac c46882Iac10 = this.LJLJJL;
                    if (c46882Iac10 == null) {
                        r3 = num;
                    } else {
                        VideoSurface videoSurface7 = c46882Iac10.LIZ.O0;
                        r3 = videoSurface7 == null ? num : (T) Float.valueOf(videoSurface7.LIZIZ(125));
                    }
                } else if (abstractC46667ITf instanceof ITL) {
                    C46882Iac c46882Iac11 = this.LJLJJL;
                    if (c46882Iac11 == null) {
                        r3 = num;
                    } else {
                        VideoSurface videoSurface8 = c46882Iac11.LIZ.O0;
                        r3 = videoSurface8 == null ? num : (T) Integer.valueOf(videoSurface8.LJI(126, 5));
                    }
                } else if (abstractC46667ITf instanceof ITM) {
                    C46882Iac c46882Iac12 = this.LJLJJL;
                    if (c46882Iac12 == null) {
                        r3 = num;
                    } else {
                        VideoSurface videoSurface9 = c46882Iac12.LIZ.O0;
                        r3 = videoSurface9 == null ? num : (T) videoSurface9.LJIIIIZZ(127, 5);
                    }
                } else if (abstractC46667ITf instanceof C46671ITj) {
                    r3 = (T) Float.valueOf(LIZIZ(12));
                } else if (abstractC46667ITf instanceof C46588IQe) {
                    HashMap hashMap = (T) new HashMap();
                    hashMap.putAll(LJJIIJ());
                    r3 = hashMap;
                } else if (abstractC46667ITf instanceof IP1) {
                    HashMap hashMap2 = (T) new HashMap();
                    hashMap2.putAll(LJIILL());
                    r3 = hashMap2;
                } else if (abstractC46667ITf instanceof IP6) {
                    HashMap hashMap3 = (T) new HashMap();
                    hashMap3.putAll(LJIILIIL());
                    r3 = hashMap3;
                } else if (abstractC46667ITf instanceof IP7) {
                    HashMap hashMap4 = (T) new HashMap();
                    hashMap4.putAll(LJIILJJIL());
                    r3 = hashMap4;
                } else if (abstractC46667ITf instanceof IP2) {
                    r3 = (T) C78685UuP.LJJIJIIJI(this);
                } else {
                    r3 = abstractC46667ITf.LIZIZ;
                }
                return r3 == 0 ? abstractC46667ITf.LIZIZ : (T) r3;
            } catch (Throwable th) {
                String.valueOf(th);
                return abstractC46667ITf.LIZIZ;
            }
        }
        if (command instanceof IZW) {
            IZW izw = (IZW) command;
            if (izw instanceof C46834IZq) {
                C46882Iac c46882Iac13 = this.LJLJJL;
                if (c46882Iac13 == null || (videoSurface6 = c46882Iac13.LIZ.O0) == null) {
                    videoSurface6 = null;
                } else {
                    videoSurface6.LJIJ(new Bundle(), new C46825IZh(izw));
                }
                if (videoSurface6 != null) {
                    return null;
                }
                throw null;
            }
            if (izw instanceof C46835IZr) {
                C46882Iac c46882Iac14 = this.LJLJJL;
                if (c46882Iac14 == null || (videoSurface5 = c46882Iac14.LIZ.O0) == null) {
                    return null;
                }
                videoSurface5.LJIILL();
                return null;
            }
            if (izw instanceof C46830IZm) {
                C46882Iac c46882Iac15 = this.LJLJJL;
                if (c46882Iac15 == null || (videoSurface4 = c46882Iac15.LIZ.O0) == null) {
                    return null;
                }
                videoSurface4.LJJ(106, o.LJ(Boolean.FALSE, Boolean.TRUE) ? 1 : 0);
                return null;
            }
            if (izw instanceof C46831IZn) {
                C46882Iac c46882Iac16 = this.LJLJJL;
                if (c46882Iac16 == null || (videoSurface3 = c46882Iac16.LIZ.O0) == null) {
                    return null;
                }
                videoSurface3.LJJ(137, 0);
                return null;
            }
            if (izw instanceof C46833IZp) {
                C47924IrQ.LJIIIIZZ = new C46824IZg(izw);
                return null;
            }
            if (izw instanceof C46827IZj) {
                C46882Iac c46882Iac17 = this.LJLJJL;
                if (c46882Iac17 != null && (videoSurface = c46882Iac17.LIZ.O0) != null) {
                    videoSurface.mHeadposeChangedListener = new XXD(izw);
                }
                if (c46882Iac17 == null || (videoSurface2 = c46882Iac17.LIZ.O0) == null) {
                    return null;
                }
                videoSurface2.LJJ(135, 0);
                return null;
            }
            if (!(izw instanceof C46829IZl) || (c46882Iac = this.LJLJJL) == null) {
                return null;
            }
            c46882Iac.LJLLLL(499, o.LJ(Boolean.FALSE, Boolean.TRUE) ? 1 : 0);
            return null;
        }
        if (command instanceof IU0) {
            return null;
        }
        throw new C162476Zf();
    }

    @Override // X.IX9
    public final void LJFF(float f) {
        C46882Iac c46882Iac = this.LJLJJL;
        if (c46882Iac != null) {
            C46886Iag c46886Iag = new C46886Iag();
            c46886Iag.LIZLLL = f;
            c46882Iac.LLIIIJ(c46886Iag);
        }
    }

    @Override // X.IX9
    public final void LJI(C74152vb c74152vb) {
        String str;
        boolean z;
        C46882Iac player;
        int i;
        VideoSurface videoSurface;
        C46882Iac player2;
        VideoSurface videoSurface2;
        String str2;
        VideoSurface videoSurface3;
        IZO izo = this.LJZI;
        C46882Iac player3 = izo.LJLILLLLZI.getPlayer();
        if (player3 == null) {
            return;
        }
        if (c74152vb == null) {
            izo.LJFF();
            return;
        }
        int i2 = c74152vb.LIZ;
        if (i2 != 5) {
            if (i2 == 1 || (player2 = izo.LJLILLLLZI.getPlayer()) == null || (videoSurface2 = player2.LIZ.O0) == null || videoSurface2.LJI(23, 2) != 1) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("setEffect ttplayer = ");
                LIZ.append(izo);
                LIZ.append(" The lut filter is not initialized!!! Coming soon");
                if (i2 == 1) {
                    str = "Active initialization";
                } else {
                    str = "Passive initialization";
                }
                LIZ.append(str);
                X1D.LIZIZ(LIZ);
                C46882Iac player4 = izo.LJLILLLLZI.getPlayer();
                if (player4 == null) {
                    return;
                }
                if (c74152vb.LIZIZ == null) {
                    izo.LJFF();
                    return;
                }
                if (player4.LJJII(199) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z2 = player4.LIZ.LJJIJIIJIL;
                if (z || ((player = izo.LJLILLLLZI.getPlayer()) != null && (videoSurface = player.LIZ.O0) != null && videoSurface.LJI(23, 2) == 1)) {
                    izo.LJI(c74152vb);
                    return;
                }
                String str3 = "Before calling play";
                if (!z2 || (i = Build.VERSION.SDK_INT) > 23) {
                    player4.LJLLLL(199, 1);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("build version = ");
                    LIZ2.append(Build.VERSION.SDK_INT);
                    if (z2) {
                        str3 = "During playback";
                    }
                    LIZ2.append(str3);
                    LIZ2.append("Set to turn on off-screen rendering!");
                    X1D.LIZIZ(LIZ2);
                    izo.LJI(c74152vb);
                    return;
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Filtered out initialization EffectInfo build version = ");
                LIZ3.append(i);
                LIZ3.append("Before calling play");
                X1D.LIZIZ(LIZ3);
                return;
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("setEffect ttplayer = ");
            LIZ4.append(izo);
            C46882Iac player5 = izo.LJLILLLLZI.getPlayer();
            if (player5 == null || (videoSurface3 = player5.LIZ.O0) == null || videoSurface3.LJI(19, 2) != 1) {
                str2 = "The lut filter is not being used!!!";
            } else {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("Lut filter is in use!!!effectInfo = ");
                LIZ5.append(c74152vb.toString());
                str2 = X1D.LIZIZ(LIZ5);
            }
            LIZ4.append(str2);
            X1D.LIZIZ(LIZ4);
            Bundle bundle = new Bundle();
            if (i2 != 2) {
                if (i2 == 3) {
                    return;
                }
                if (i2 != 4) {
                    if (i2 == 5) {
                        bundle.putInt("action", 32);
                        bundle.putInt("effect_type", 13);
                    }
                } else {
                    List<Bitmap> list = c74152vb.LIZIZ;
                    if (list == null) {
                        throw new NullPointerException("isEmpty");
                    }
                    bundle.putInt("action", 22);
                    bundle.putParcelable("lut_bitmap", (Parcelable) ListProtector.get(list, 0));
                }
            } else {
                bundle.putInt("action", 19);
                bundle.putInt("int_value", 0);
                StringBuilder LIZ6 = X1D.LIZ();
                C0MT.LJ(LIZ6, "close", "Lut filter", LIZ6);
            }
            bundle.putInt("effect_type", 2);
            player3.LJLJLJ(bundle);
            return;
        }
        player3.LJFF();
    }

    @Override // X.InterfaceC47896Iqy
    public final void LJJIIJZLJL(boolean z) {
        this.LJLLLLLL.LJIIJ(z);
    }

    public final void LJJIJIIJIL(int i) {
        C46882Iac player;
        IZS izs = this.LJZ;
        izs.getClass();
        if (1 != IZ8.LJJJI() || (player = izs.LJLILLLLZI.getPlayer()) == null) {
            return;
        }
        player.LJLLLL(562, 1);
        player.LJLLLL(570, i);
        player.LJLLLL(563, i);
    }

    public final void LJJIJIL(EnumC38817FLh enumC38817FLh) {
        C46882Iac player;
        IZS izs = this.LJZ;
        izs.getClass();
        Object value = IZ8.LLLLIILLL.getValue();
        o.LJIIIIZZ(value, "<get-NATIVE_THREAD_SHADOW_MODE>(...)");
        if (!((Boolean) value).booleanValue() || (player = izs.LJLILLLLZI.getPlayer()) == null) {
            return;
        }
        player.LJLLLL(562, 1);
        if (enumC38817FLh.ordinal() == EnumC38817FLh.LOW.ordinal()) {
            player.LJLLLL(570, 286331153);
            player.LJLLLL(563, 286331153);
        } else {
            if (enumC38817FLh.ordinal() != EnumC38817FLh.NORMAL.ordinal()) {
                return;
            }
            player.LJLLLL(570, 572662306);
            player.LJLLLL(563, 572662306);
        }
    }

    public final void LJJJ(Bundle bundle) {
        this.LJZI.LJ(false, bundle);
    }

    public final boolean LJJJJJ(java.util.Map<String, Object> map) {
        boolean z;
        boolean z2;
        boolean z3;
        if (map != null && (map.get("hdr") instanceof Boolean)) {
            z = ((Boolean) map.get("hdr")).booleanValue();
        } else {
            z = false;
        }
        if (map != null && (map.get("header_url") instanceof String)) {
            String str = (String) map.get("header_url");
            if (!TextUtils.isEmpty(str) && !str.startsWith("http") && !str.startsWith("mdl:")) {
                z2 = true;
                if (!z || (z2 && IZ8.LJJI())) {
                    return false;
                }
                if (this.LJLILLLLZI.get(42) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (map == null) {
                    return z3;
                }
                Object value = IZ8.LJIJI.getValue();
                o.LJIIIIZZ(value, "<get-srReverseConfig>(...)");
                SrReverseConfig srReverseConfig = (SrReverseConfig) value;
                if (map.get("header_resolution") == null) {
                    List<Integer> list = srReverseConfig.closeSuperResolutionConfig;
                    if (list != null && !list.isEmpty()) {
                        return false;
                    }
                    return z3;
                }
                int intValue = ((Integer) map.get("header_resolution")).intValue();
                List<Integer> list2 = srReverseConfig.closeSuperResolutionConfig;
                if (list2 != null && !list2.isEmpty()) {
                    if (srReverseConfig.closeSuperResolutionConfig.contains(Integer.valueOf(intValue)) || !z3) {
                        return false;
                    }
                    return true;
                }
                return z3;
            }
        }
        z2 = false;
        if (!z) {
        }
        return false;
    }

    public final String LJJJJJL(int i) {
        C46882Iac player = this.LJZL.LJLILLLLZI.getPlayer();
        IXB.LIZIZ("TTPlayer", "query subtitle");
        if (player != null) {
            return player.LJJIJL(i);
        }
        return "";
    }

    public final void LJJLIIIJJI(boolean z) {
        Surface surface;
        boolean z2 = false;
        SimRadar.keyScan("TTPlayer", "reset", this.LJLJJL, this.LJLL);
        if (IXB.LIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("reset  mPlayer = ");
            LIZ.append(this.LJLJJL);
            LIZ.append(", surface = ");
            if (this.LJLLL) {
                surface = this.LJLLJ;
            } else {
                surface = this.LJLLILLLL;
            }
            LIZ.append(surface);
            IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
        }
        C46882Iac c46882Iac = this.LJLJJL;
        C46886Iag c46886Iag = new C46886Iag();
        c46886Iag.LIZLLL = -1.0f;
        c46882Iac.LLIIIJ(c46886Iag);
        if (!z && (this.LJLILLLLZI.get(34) == 1 || this.LLF.LJLJI)) {
            z2 = true;
        }
        this.LLIFFJFJJ.LJJIII(z2);
        if (!z2) {
            this.LJLJJL.LJZI(null);
            LJJIJLIJ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("VIDEO@");
            LIZ2.append(this.LJLL);
            SimRadar.traceGroup(X1D.LIZIZ(LIZ2)).LIZIZ("TTRelease-2");
            this.LJLJJL.LJJLIIIJILLIZJL();
            this.LJLJJL.LLILZIL(null);
            this.LJLJJL = null;
            LJJJJ();
        } else {
            this.LJLJJL.LJJL();
            LJJIJLIJ();
            this.LJLJJL.LLILZIL(null);
        }
        this.LJLJL = null;
        this.LLIFFJFJJ.LJIL(z2);
    }

    public final void LJJLIIIJJIZ(float f) {
        try {
            if (this.LJLJJL != null) {
                int i = (int) (f * 0.01d * r4.LIZ.LJJJLZIJ);
                this.LJLLLLLL.LJI(f, i);
                this.LLIFFJFJJ.LJJIFFI();
                this.LJLJJL.LJJLIIIJLJLI(i, this);
            }
        } catch (Exception e) {
            SimRadar.errorScan("TTPlayer", "seekTo", new C46691IUd(e), Float.valueOf(f));
        }
    }

    public final void LJJLIIIJLJLI(java.util.Map<String, Object> map) {
        if (map.get("header_audio_processor") instanceof InterfaceC47128Iea) {
            InterfaceC47128Iea interfaceC47128Iea = (InterfaceC47128Iea) map.get("header_audio_processor");
            C46882Iac c46882Iac = this.LJLJJL;
            if (c46882Iac != null && interfaceC47128Iea != null) {
                c46882Iac.LJJLL(new C47126IeY(interfaceC47128Iea));
            }
        }
    }

    public final void LJJLIIIJLLLLLLLZ(InterfaceC47128Iea interfaceC47128Iea) {
        C46882Iac player = this.LJZL.LJLILLLLZI.getPlayer();
        if (player != null && interfaceC47128Iea != null) {
            player.LJJLL(new C47127IeZ(interfaceC47128Iea));
        }
    }

    public final void LJJLIIJ(SurfaceHolder surfaceHolder) {
        try {
            C46882Iac c46882Iac = this.LJLJJL;
            if (c46882Iac != null) {
                c46882Iac.LLILZLL(surfaceHolder);
            }
        } catch (Exception e) {
            SimRadar.errorScan("TTPlayer", "setDisplay", new C46691IUd(e), surfaceHolder);
        }
    }

    public final void LJJLIL(String str) {
        C46882Iac c46882Iac = this.LJLJJL;
        if (c46882Iac != null) {
            c46882Iac.LJLJLLL(str);
        }
    }

    public final void LJJLJ(InterfaceC46832IZo interfaceC46832IZo) {
        C46818IZa c46818IZa = this.LL;
        if (interfaceC46832IZo != c46818IZa.LJLJI && interfaceC46832IZo != null) {
            c46818IZa.LJLJI = interfaceC46832IZo;
            C46818IZa.LJLJJI = new WeakReference<>(c46818IZa.LJLJI);
            EnumC47567Ilf.instance.setListener(C46818IZa.LJLJJL);
        }
    }

    public final void LJJLJLI(List<Surface> list) {
        try {
            if (this.LJLJJL != null && list != null && list.size() > 0) {
                this.LJLJJL.LJLLI(null, 3);
                for (Surface surface : list) {
                    if (surface != null && surface.isValid()) {
                        if (IXB.LIZ) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("setExtraSurfaces extraSurface = ");
                            LIZ.append(surface);
                            LIZ.append(", this = ");
                            LIZ.append(this);
                            IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
                        }
                        this.LJLJJL.LJLLI(surface, 1);
                    }
                }
            }
        } catch (Exception e) {
            SimRadar.errorScan("TTPlayer", "setExtraSurfaces", new C46691IUd(e), new Object[0]);
        }
    }

    public final void LJJLL(String str) {
        C46842IZy c46842IZy = this.LLFZ;
        C46882Iac player = c46842IZy.LJLILLLLZI.getPlayer();
        if (player == null) {
            return;
        }
        try {
            if (c46842IZy.LJLJI == null) {
                c46842IZy.LJLJI = new XXB(c46842IZy);
            }
            player.LJLL(c46842IZy.LJLJI, str);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LJJZZI(C46543IOl c46543IOl) {
        C46740IWa c46740IWa = this.LLFF;
        if (c46543IOl != c46740IWa.LJLJLLL) {
            c46740IWa.LJLJLLL = c46543IOl;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setNorPrepareEventTimeListener listener  = ");
            LIZ.append(c46543IOl);
            IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
        }
    }

    public final void LJJZZIII(InterfaceC46942Iba interfaceC46942Iba) {
        C46939IbX c46939IbX = this.LLF;
        if (interfaceC46942Iba != c46939IbX.LJLJLLL) {
            c46939IbX.LJLJLLL = interfaceC46942Iba;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EnginePrePrepareEventTimeHelper：setPrePrepareEventTimeListener listener  = ");
            LIZ.append(interfaceC46942Iba);
            IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
        }
    }

    public final void LJL(boolean z) {
        boolean z2;
        this.LJLJJL.LJ(z);
        if (this.LJLILLLLZI.get(66) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJLJJL.LJIIJ(z2);
        C46882Iac c46882Iac = this.LJLJJL;
        C47282Ih4 c47282Ih4 = this.LJLJJI;
        c46882Iac.LIZ.LLLLZLLLI(c47282Ih4.LJJIJ, c47282Ih4.LJJIJIIJI);
        this.LJLJJL.LJJJJIZL(this.LJLJJI.LJJIJLIJ);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LLIIJLIL(this.LJLIL).getPath());
        LIZ.append("/player/");
        String LIZIZ = X1D.LIZIZ(LIZ);
        File file = new File(LIZIZ);
        if (!file.exists()) {
            file.mkdirs();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(C16880lQ.LLIIJLIL(this.LJLIL).getPath());
        LIZ2.append("/playerCache/");
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        File file2 = new File(LIZIZ2);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(C16880lQ.LLIIJLIL(this.LJLIL).getPath());
        LIZ3.append("/playerDspSo/");
        String LIZIZ3 = X1D.LIZIZ(LIZ3);
        File file3 = new File(LIZIZ3);
        if (!file3.exists()) {
            file3.mkdirs();
        }
        Object value = IZ8.LJIIJ.getValue();
        o.LJIIIIZZ(value, "<get-configBmfWithBundle>(...)");
        if (((Boolean) value).booleanValue()) {
            Bundle LIZLLL = C1DG.LIZLLL("effect_type", 5, "action", 21);
            LIZLLL.putInt("srAlgType", this.LJLJLLL);
            Object value2 = IZ8.LJJII.getValue();
            o.LJIIIIZZ(value2, "<get-bmfSrBackend>(...)");
            LIZLLL.putInt("sr_backend", ((Number) value2).intValue());
            LIZLLL.putInt("scale_type", IZ8.LJ());
            Object value3 = IZ8.LJJIIJ.getValue();
            o.LJIIIIZZ(value3, "<get-bmfSrPoolSize>(...)");
            LIZLLL.putInt("pool_size", ((Number) value3).intValue());
            LIZLLL.putString("kernelBinPath", LIZIZ);
            LIZLLL.putString("oclModleName", "oclModuleName");
            LIZLLL.putString("dspModleName", "dspModuleName");
            LIZLLL.putString("programCacheDir", LIZIZ2);
            LIZLLL.putString("lib_path", LIZIZ3);
            Object value4 = IZ8.j0.getValue();
            o.LJIIIIZZ(value4, "<get-bmfSrComponent>(...)");
            LIZLLL.putInt("use_bmf_component", ((Number) value4).intValue());
            this.LJLJJL.LJLJLJ(LIZLLL);
        } else {
            C46882Iac c46882Iac2 = this.LJLJJL;
            int i = this.LJLJLLL;
            Object value5 = IZ8.LJJII.getValue();
            o.LJIIIIZZ(value5, "<get-bmfSrBackend>(...)");
            int intValue = ((Number) value5).intValue();
            int LJ = IZ8.LJ();
            Object value6 = IZ8.LJJIIJ.getValue();
            o.LJIIIIZZ(value6, "<get-bmfSrPoolSize>(...)");
            c46882Iac2.LLIIL(i, intValue, LJ, ((Number) value6).intValue(), LIZIZ);
        }
        Object value7 = IZ8.LJIILJJIL.getValue();
        o.LJIIIIZZ(value7, "<get-OPEN_SR_OPT_FOR_MALI>(...)");
        if (!((Boolean) value7).booleanValue()) {
            this.LJLJJI.getClass();
        } else {
            this.LJLJJL.LIZ.j1 = C01R.LIZ("srIsMaliSync", false);
        }
        this.LJLJLJ = true;
    }

    public final void LJLI(boolean z) {
        C46882Iac player = this.LJZL.LJLILLLLZI.getPlayer();
        IXB.LIZIZ("TTPlayer", "Enter setSubCallbackEnable");
        if (player != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setSubCallbackEnable callbackEnable:");
            LIZ.append(z);
            IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
            player.LJLLLL(533, z ? 1 : 0);
        }
    }

    public final void LJLILLLLZI(boolean z) {
        C46882Iac player = this.LJZL.LJLILLLLZI.getPlayer();
        IXB.LIZIZ("TTPlayer", "Enter setSubtitlesEnable");
        if (player != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setSubtitlesEnable:");
            LIZ.append(z);
            IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
            player.LJLLLL(534, z ? 1 : 0);
        }
    }

    public final void LJLJJI(Surface surface) {
        C56662Kg.LIZ().LJFF("player_prerender_onprepared_to_setsurface", false);
        C56662Kg.LIZ().LJFF("player_prerender_to_setsurface", false);
        C56662Kg.LIZ().LIZJ(" player_setsurface_duration", false);
        try {
            if (this.LJLJJL != null) {
                if (IXB.LIZ) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("setSurface surface = ");
                    LIZ.append(surface);
                    LIZ.append(", this = ");
                    LIZ.append(this);
                    IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
                }
                this.LLIFFJFJJ.LJIIJJI(surface);
                if (surface == null) {
                    if (this.LJLLL) {
                        LJJIJLIJ();
                    } else {
                        if (IXB.LIZ) {
                            IXB.LIZIZ("TTPlayer", "setSurface null");
                        }
                        this.LJLJJL.LLILZIL(surface);
                        this.LJLLILLLL = null;
                    }
                } else {
                    SurfaceHolder LIZ2 = C46936IbU.LIZ(surface);
                    if (LIZ2 != null) {
                        Object value = IZ8.L0.getValue();
                        o.LJIIIIZZ(value, "<get-isAlwaysSetSurfaceWhenSurfaceView>(...)");
                        if (!((Boolean) value).booleanValue()) {
                            if (surface != this.LJLLJ) {
                                if (this.LJLLILLLL != null && !this.LJLLL) {
                                    if (IXB.LIZ) {
                                        StringBuilder LIZ3 = X1D.LIZ();
                                        LIZ3.append("setSurface, setSurfaceHolder, clear player original surface, mTextureViewSurface = ");
                                        LIZ3.append(this.LJLLILLLL);
                                        IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ3));
                                    }
                                    this.LJLJJL.LLILZIL(null);
                                }
                                if (IXB.LIZ) {
                                    StringBuilder LIZ4 = X1D.LIZ();
                                    LIZ4.append("setSurface, call setSurfaceHolder, surface = ");
                                    LIZ4.append(surface);
                                    IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ4));
                                }
                                this.LJLJJL.LJLLLL(611, 1);
                                Object value2 = IZ8.K.getValue();
                                o.LJIIIIZZ(value2, "<get-sendMsgTimeoutInTTVideoEngine>(...)");
                                this.LJLJJL.LJLLLL(950, ((Number) value2).intValue());
                                Object value3 = IZ8.b1.getValue();
                                o.LJIIIIZZ(value3, "<get-isEnableSetSurfaceG…tryForTextureRender>(...)");
                                if (((Boolean) value3).booleanValue()) {
                                    this.LJLJJL.LJLLLL(1503, 1);
                                }
                                this.LJLJJL.LLILZLL(LIZ2);
                                this.LJLLILLLL = null;
                                this.LJLLJ = surface;
                                this.LJLLL = true;
                            }
                        } else {
                            if (this.LJLLILLLL != null && !this.LJLLL) {
                                if (IXB.LIZ) {
                                    StringBuilder LIZ5 = X1D.LIZ();
                                    LIZ5.append("setSurface, setSurfaceHolder, clear player original surface, mTextureViewSurface = ");
                                    LIZ5.append(this.LJLLILLLL);
                                    IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ5));
                                }
                                this.LJLJJL.LLILZIL(null);
                            }
                            if (IXB.LIZ) {
                                StringBuilder LIZ6 = X1D.LIZ();
                                LIZ6.append("setSurface, call setSurfaceHolder, surface = ");
                                LIZ6.append(surface);
                                IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ6));
                            }
                            this.LJLJJL.LJLLLL(611, 1);
                            Object value4 = IZ8.K.getValue();
                            o.LJIIIIZZ(value4, "<get-sendMsgTimeoutInTTVideoEngine>(...)");
                            this.LJLJJL.LJLLLL(950, ((Number) value4).intValue());
                            Object value5 = IZ8.b1.getValue();
                            o.LJIIIIZZ(value5, "<get-isEnableSetSurfaceG…tryForTextureRender>(...)");
                            if (((Boolean) value5).booleanValue()) {
                                this.LJLJJL.LJLLLL(1503, 1);
                            }
                            this.LJLJJL.LLILZLL(LIZ2);
                            this.LJLLILLLL = null;
                            this.LJLLJ = surface;
                            this.LJLLL = true;
                        }
                    } else {
                        if (this.LJLLJ != null && this.LJLLL) {
                            LJJIJLIJ();
                        }
                        if (IXB.LIZ) {
                            StringBuilder LIZ7 = X1D.LIZ();
                            LIZ7.append("setSurface, call setSurface, surface = ");
                            LIZ7.append(surface);
                            IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ7));
                        }
                        this.LJLJJL.LLILZIL(surface);
                        this.LJLLILLLL = surface;
                        this.LJLLJ = null;
                        this.LJLLL = false;
                    }
                }
                this.LLIFFJFJJ.LJII(surface);
            }
        } catch (Exception e) {
            SimRadar.errorScan("TTPlayer", "setSurface", new C46691IUd(e), new Object[0]);
        }
    }

    public final void LJLJLLL(int i) {
        IZU izu = this.LJZL;
        C46882Iac player = izu.LJLILLLLZI.getPlayer();
        IXB.LIZIZ("TTPlayer", "Enter switchAudioLanguage");
        if (player != null) {
            izu.LJLJLJ = SystemClock.elapsedRealtime();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("switchAudioLanguage languageId:");
            LIZ.append(i);
            IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
            izu.LJLJJL = System.currentTimeMillis();
            player.LJLLLL(675, i);
        }
    }

    public final void LJLL(int i) {
        IZU izu = this.LJZL;
        C46882Iac player = izu.LJLILLLLZI.getPlayer();
        IXB.LIZIZ("TTPlayer", "Enter switchSubtitlesLaunage");
        if (player != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("switchSubtitlesLaunage languageId:");
            LIZ.append(i);
            IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
            izu.LJLLI = i;
            player.LJLLLL(530, i);
        }
    }

    public final void LJLLI(InterfaceC46803IYl interfaceC46803IYl) {
        IZU izu = this.LJZL;
        izu.getClass();
        IXB.LIZIZ("TTPlayer", "Enter updateAudioInfoListener");
        if (interfaceC46803IYl != izu.LJLJJI) {
            izu.LJLJJI = interfaceC46803IYl;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updateAudioInfoListener listener  = ");
            LIZ.append(interfaceC46803IYl);
            IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
        }
    }

    public final void LJLLILLLL(InterfaceC46826IZi interfaceC46826IZi) {
        IZU izu = this.LJZL;
        izu.getClass();
        IXB.LIZIZ("TTPlayer", "Enter updateSubInfoListener");
        if (interfaceC46826IZi != izu.LJLJI) {
            izu.LJLJI = interfaceC46826IZi;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updateSubInfoListener listener  = ");
            LIZ.append(interfaceC46826IZi);
            IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.IX9
    public final void setLooping(boolean z) {
        C46882Iac c46882Iac = this.LJLJJL;
        if (c46882Iac != null) {
            c46882Iac.LLFII(true);
        }
    }

    public final void LJJIJIIJI(int i, JSONObject jSONObject) {
        IZU izu = this.LJZL;
        C46882Iac player = izu.LJLILLLLZI.getPlayer();
        IXB.LIZIZ("TTPlayer", "Enter addSubtitleLanguage");
        if (player != null) {
            izu.LJLLI = i;
            player.LJJLIIJ(new C46929IbN(jSONObject));
        }
    }

    public final void LJJIZ(boolean z, Bundle bundle) {
        this.LJZI.LIZLLL(z, bundle);
    }

    public final void LJJJI(int i, Bundle bundle) {
        C46882Iac player;
        IZO izo = this.LJZI;
        izo.getClass();
        Object value = IZ8.LIZ.getValue();
        o.LJIIIIZZ(value, "<get-OPEN_CROP_SR>(...)");
        if (!((Boolean) value).booleanValue() || (player = izo.LJLILLLLZI.getPlayer()) == null) {
            return;
        }
        player.LJLLLL(4, i);
        if (!bundle.containsKey("float_value")) {
            return;
        }
        if (i != 0 && i != 2) {
            return;
        }
        Bundle LIZLLL = C1DG.LIZLLL("action", 27, "effect_type", 11);
        LIZLLL.putFloat("float_value", bundle.getFloat("float_value"));
        player.LJLJLJ(LIZLLL);
    }

    public final void LJJLI(String str, java.util.Map<String, Object> map) {
        LJJLIIIIJ(null, str, map);
    }

    public final void LJJLIIIJ(IXO ixo, java.util.Map<String, Object> map) {
        LJJLIIIIJ(ixo, null, map);
    }

    public final void LJJZ(int i, int i2) {
        C46882Iac c46882Iac = this.LJLJJL;
        if (c46882Iac != null) {
            c46882Iac.LJLLLL(24, Integer.valueOf(i).intValue());
            this.LJLJJL.LJLLLL(25, Integer.valueOf(i2).intValue());
        }
    }

    public final void LJLIIL(int i, String str) {
        IZU izu = this.LJZL;
        C46882Iac player = izu.LJLILLLLZI.getPlayer();
        IXB.LIZIZ("TTPlayer", "Enter setSubtitlesDefaultLanguage");
        if (player != null) {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("setSubtitlesDefaultLanguage languageId:");
                LIZ.append(i);
                IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
                izu.LJLLI = i;
                player.LJLLLL(530, i);
                if (str != null) {
                    izu.LJLJJLL = true;
                    JSONObject jSONObject = new JSONObject(str);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Ryan setSubtitlesDefaultLanguage subtitleDesInfoModel:");
                    LIZ2.append(str);
                    IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ2));
                    player.LLILLJJLI(new C47631Imh(jSONObject));
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public final void LJLIL(int i, JSONObject jSONObject) {
        IZU izu = this.LJZL;
        C46882Iac player = izu.LJLILLLLZI.getPlayer();
        IXB.LIZIZ("TTPlayer", "Enter setSubtitlesDefaultLanguageWithJSONObject");
        if (player != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setSubtitlesDefaultLanguageWithJSONObject languageId:");
            LIZ.append(i);
            IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ));
            izu.LJLLI = i;
            player.LJLLLL(530, i);
            if (jSONObject != null) {
                izu.LJLJJLL = true;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("setSubtitlesDefaultLanguageWithJSONObject subtitleDesInfoModelJSONObject:");
                LIZ2.append(jSONObject);
                IXB.LIZIZ("TTPlayer", X1D.LIZIZ(LIZ2));
                player.LLILLJJLI(new C47631Imh(jSONObject));
            }
        }
    }

    public final void LJLJJL(float f, float f2) {
        try {
            C46882Iac c46882Iac = this.LJLJJL;
            if (c46882Iac != null) {
                c46882Iac.LLJJIJIL(f, f2);
                this.LJLZ = f;
            }
        } catch (Exception e) {
            SimRadar.errorScan("TTPlayer", "setVolume", new C46691IUd(e), Float.valueOf(f), Float.valueOf(f2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x06ab  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x07c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0825 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0877  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x091c  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0938  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0954  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.ss.ttvideoengine.TTVideoEngine, X.Iac] */
    /* JADX WARN: Type inference failed for: r1v138 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v24, types: [X.IjA, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v29, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIL(X.IXO r19, java.lang.String r20, java.util.Map<java.lang.String, java.lang.Object> r21) {
        /*
            Method dump skipped, instructions count: 2694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IZL.LJJIL(X.IXO, java.lang.String, java.util.Map):void");
    }

    public final void LJJLIIIIJ(IXO ixo, String str, java.util.Map map) {
        LJJIL(ixo, str, map);
        if (C47821Ipl.LIZ) {
            if (C39082FVm.LIZ()) {
                HashMap hashMap = new HashMap();
                hashMap.put("vv_code", 8500);
                hashMap.put("video_has_render_ready", 1);
                C39082FVm.LIZJ(hashMap);
            }
            C56662Kg.LIZ().LJFF("player_prerender_duration", false);
            C56662Kg.LIZ().LJFF("cold_boot_start_to_prerender_end", false);
            C56662Kg.LIZ().LIZJ("player_prerender_to_setsurface", false);
            C56662Kg.LIZ().LJFF("player_prerender_duration_after_tryplay", false);
            C56662Kg.LIZ().LJFF("player_prerender_play_duration", false);
            C56662Kg.LIZ().LIZJ("player_prerender_to_onprepared", false);
            C56662Kg.LIZ().LJFF("player_prepare_duration", false);
            C56662Kg.LIZ().LIZJ("player_prerender_end_to_onprepared", false);
            C47821Ipl.LIZ = false;
            C47821Ipl.LJIIIIZZ = true;
            return;
        }
        if (!C47821Ipl.LJIIIIZZ || !C36152EGu.LJFF()) {
            return;
        }
        C56662Kg.LIZ().LJFF("cold_boot_start_to_prerender_end_nuj_scene", false);
        C56662Kg.LIZ().LJFF("player_prerender_duration_after_tryplay_nuj_scene", false);
        C47821Ipl.LJIIIIZZ = false;
    }

    public IZL(Context context, boolean z, SparseIntArray sparseIntArray, SparseArray sparseArray, C47282Ih4 c47282Ih4) {
        SparseIntArray sparseIntArray2 = sparseIntArray;
        SparseArray sparseArray2 = sparseArray;
        IZS izs = new IZS(this);
        this.LJZ = izs;
        this.LJZI = new IZO(this);
        IZU izu = new IZU(this);
        this.LJZL = izu;
        C46889Iaj c46889Iaj = new C46889Iaj(this);
        this.LL = new C46818IZa(this);
        C47272Igu c47272Igu = new C47272Igu(this);
        this.LLD = c47272Igu;
        C46938IbW c46938IbW = new C46938IbW(this);
        C46897Iar c46897Iar = new C46897Iar(this);
        C46805IYn c46805IYn = new C46805IYn(this);
        C46939IbX c46939IbX = new C46939IbX(this);
        this.LLF = c46939IbX;
        C46740IWa c46740IWa = new C46740IWa(this);
        this.LLFF = c46740IWa;
        C46934IbS c46934IbS = new C46934IbS(this);
        C46924IbI c46924IbI = new C46924IbI(this);
        C47278Ih0 c47278Ih0 = new C47278Ih0(this);
        C46797IYf c46797IYf = new C46797IYf(this);
        this.LLFFF = c46797IYf;
        C46932IbQ c46932IbQ = new C46932IbQ(this);
        IZ9 iz9 = new IZ9(this);
        C46842IZy c46842IZy = new C46842IZy(this);
        this.LLFZ = c46842IZy;
        C46808IYq c46808IYq = new C46808IYq(this);
        IZM izm = new IZM(this);
        this.LLI = izm;
        IZI izi = new IZI(this);
        C46837IZt c46837IZt = new C46837IZt(this);
        IWY iwy = new IWY(this);
        C46792IYa c46792IYa = new C46792IYa(this);
        C46888Iai c46888Iai = new C46888Iai(this);
        IZP izp = new IZP();
        this.LLIFFJFJJ = izp;
        this.LJLIL = context;
        this.LJLILLLLZI = sparseIntArray2 == null ? new SparseIntArray() : sparseIntArray2;
        this.LJLJI = sparseArray2 == null ? new SparseArray() : sparseArray2;
        this.LJLJJI = c47282Ih4;
        IYT iyt = new IYT(this, z);
        this.LLFII = iyt;
        izp.LIZ(izs);
        izp.LIZ(izu);
        izp.LIZ(c46889Iaj);
        izp.LIZ(c47272Igu);
        izp.LIZ(c46938IbW);
        izp.LIZ(c46897Iar);
        izp.LIZ(c46939IbX);
        izp.LIZ(c46805IYn);
        izp.LIZ(c46740IWa);
        izp.LIZ(c46934IbS);
        izp.LIZ(c46924IbI);
        izp.LIZ(c47278Ih0);
        izp.LIZ(c46797IYf);
        izp.LIZ(iyt);
        izp.LIZ(c46932IbQ);
        izp.LIZ(iz9);
        izp.LIZ(c46842IZy);
        izp.LIZ(c46808IYq);
        izp.LIZ(izm);
        izp.LIZ(izi);
        izp.LIZ(c46837IZt);
        izp.LIZ(iwy);
        izp.LIZ(c46792IYa);
        izp.LIZ(c46888Iai);
        try {
            ArrayList arrayList = new ArrayList(izp.LJLIL);
            Collections.sort(arrayList, new IDComparatorS36S0000000_8(6));
            ((CopyOnWriteArrayList) izp.LJLIL).clear();
            ((CopyOnWriteArrayList) izp.LJLIL).addAll(arrayList);
        } catch (Exception unused) {
            SimRadar.keyScan("TTPlayer", "PlayerObservers.sort Error", new Object[0]);
        }
        LJJJJ();
    }
}
