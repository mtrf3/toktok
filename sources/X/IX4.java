package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.Surface;
import com.ss.android.ugc.aweme.player.sdk.api.OnPlayerPreparedListener;
import com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class IX4 {
    public static final IXK LLIIIILZ = new IXK();
    public IVM LIZ;
    public OnPreRenderListener LIZIZ;
    public OnPlayerPreparedListener LIZJ;
    public final IXJ<IXY> LIZLLL;
    public List<IXJ<C46775IXj>> LJ;
    public List<IXJ<IQU>> LJFF;
    public final IXJ<Boolean> LJI;
    public IXS LJII;
    public final Context LJIIIIZZ;
    public final String LJIIIZ;
    public final boolean LJIIJ;
    public final ITS LJIIJJI;
    public final boolean LJIIL;
    public int LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public final int LJIIZILJ;
    public final int LJIJ;
    public int LJIJI;
    public IZG LJIJJ;
    public String LJIJJLI;
    public float LJIL;
    public boolean LJJ;
    public Surface LJJI;
    public int LJJIFFI;
    public int LJJII;
    public final IXJ<Integer> LJJIII;
    public final String LJJIIJ;
    public String LJJIIJZLJL;
    public String LJJIIZ;
    public final boolean LJJIIZI;
    public final boolean LJJIJ;
    public IXY LJJIJIIJI;
    public List<C46775IXj> LJJIJIIJIL;
    public List<IQU> LJJIJIL;
    public final boolean LJJIJL;
    public int LJJIJLIJ;
    public int LJJIL;
    public int LJJIZ;
    public boolean LJJJ;
    public boolean LJJJI;
    public boolean LJJJIL;
    public boolean LJJJJ;
    public boolean LJJJJI;
    public boolean LJJJJIZL;
    public boolean LJJJJJ;
    public boolean LJJJJJL;
    public long LJJJJL;
    public boolean LJJJJLI;
    public boolean LJJJJLL;
    public boolean LJJJJZ;
    public IXO LJJJJZI;
    public int LJJJLIIL;
    public int LJJJLL;
    public String LJJJLZIJ;
    public String LJJJZ;
    public int LJJL;
    public final boolean LJJLI;
    public String LJJLIIIIJ;
    public float LJJLIIIJ;
    public int LJJLIIIJILLIZJL;
    public Float LJJLIIIJJI;
    public Float LJJLIIIJJIZ;
    public Float LJJLIIIJL;
    public int LJJLIIIJLJLI;
    public boolean LJJLIIIJLLLLLLLZ;
    public boolean LJJLIIJ;
    public boolean LJJLIL;
    public Long LJJLJ;
    public InterfaceC47143Iep LJJLJLI;
    public InterfaceC47128Iea LJJLL;
    public List<Surface> LJJZ;
    public boolean LJJZZI;
    public boolean LJJZZIII;
    public boolean LJL;
    public boolean LJLI;
    public int LJLIIIL;
    public boolean LJLIIL;
    public boolean LJLIL;
    public int LJLILLLLZI;
    public String LJLJI;
    public JSONObject LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public int LJZI;
    public int LJZL;
    public int LL;
    public boolean LLD;
    public String LLF;
    public Long LLFF;
    public String LLFFF;
    public String LLFII;
    public boolean LLFZ;
    public String LLI;
    public int LLIFFJFJJ;
    public boolean LLII;
    public InterfaceC47125IeX<Long, Long> LLIIII;

    /* JADX WARN: Multi-variable type inference failed */
    public final List<C46775IXj> LIZ() {
        if (this.LJJIJIIJIL == null && this.LJ != null) {
            this.LJJIJIIJIL = new ArrayList();
            Iterator it = ((ArrayList) this.LJ).iterator();
            while (it.hasNext()) {
                this.LJJIJIIJIL.add(((IXJ) it.next()).get());
            }
        }
        return this.LJJIJIIJIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<IQU> LIZIZ() {
        if (this.LJJIJIL == null && this.LJFF != null) {
            this.LJJIJIL = new ArrayList();
            Iterator it = ((ArrayList) this.LJFF).iterator();
            while (it.hasNext()) {
                this.LJJIJIL.add(((IXJ) it.next()).get());
            }
        }
        return this.LJJIJIL;
    }

    public final IXY LIZJ() {
        IXY ixy;
        if (this.LJJIJIIJI == null && this.LIZLLL != null) {
            if (!TextUtils.isEmpty(this.LLI)) {
                this.LJJIJIIJI = this.LIZLLL.LIZ();
            } else {
                this.LJJIJIIJI = this.LIZLLL.get();
            }
        }
        if (IXN.LIZJ.isDynamicBitrateEnable() && (ixy = this.LJJIJIIJI) != null) {
            this.LJIILIIL = ixy.LIZJ;
        }
        IXY ixy2 = this.LJJIJIIJI;
        if (ixy2 != null) {
            this.LJJIIJZLJL = ixy2.LJ;
            this.LJJIIZ = ixy2.LJFF;
        }
        if (C47821Ipl.LIZLLL && C56662Kg.LIZ().LIZLLL) {
            if (!C56662Kg.LIZ().LJIIIIZZ("player_prerender_dataprocesss_duration")) {
                C56662Kg.LIZ().LJFF("player_prerender_dataprocesss_duration", false);
                C56662Kg.LIZ().LIZJ("player_prerender_dataprocesss_to_play", false);
            }
            C47821Ipl.LIZLLL = false;
        }
        return ixy2;
    }

    public final boolean LIZLLL() {
        if (this.LJI == null) {
            return false;
        }
        if (((Boolean) IZ8.LJJL.getValue()).booleanValue()) {
            IXY LIZJ = LIZJ();
            if (LIZJ == null) {
                return false;
            }
            Object obj = LIZJ.LIZ;
            if ((obj instanceof String) && ((String) obj).startsWith("/")) {
                return true;
            }
        }
        return this.LJI.get().booleanValue();
    }

    public IX4() {
        this.LJIIJJI = LLIIIILZ;
        Float valueOf = Float.valueOf(Float.MIN_VALUE);
        this.LJIL = Float.MIN_VALUE;
        this.LJJIFFI = -1;
        this.LJJII = 1;
        this.LJJJJZ = true;
        this.LJJLI = true;
        this.LJJLIIIJ = 1.0f;
        this.LJJLIIIJJI = Float.valueOf(0.0f);
        this.LJJLIIIJJIZ = valueOf;
        this.LJJLIIIJL = valueOf;
        this.LJJLIIIJLJLI = -1;
        this.LJJLIIIJLLLLLLLZ = false;
        this.LJJLIIJ = false;
        this.LJJLJ = 0L;
        this.LJJZ = null;
        this.LJJZZI = false;
        this.LJJZZIII = false;
        this.LJL = false;
        this.LJLI = false;
        this.LJLIIIL = 15;
        this.LJLIIL = false;
        this.LJLIL = false;
        this.LJLILLLLZI = 0;
        this.LJLJI = null;
        this.LJLJJI = null;
        this.LJLJJLL = -1;
        this.LJLJLJ = -1;
        this.LJLJLLL = false;
        this.LJLL = false;
        this.LJLLI = 0;
        this.LJLLILLLL = 0;
        this.LJLLJ = 0;
        this.LJLLL = 0;
        this.LJLLLL = true;
        this.LJLLLLLL = true;
        this.LJLZ = false;
        this.LJZ = false;
        this.LJZI = -1;
        this.LJZL = -1;
        this.LL = -1;
        this.LLD = false;
        this.LLF = "";
        this.LLFF = -1L;
        this.LLFFF = "";
        this.LLI = "";
        this.LLIFFJFJJ = 0;
        this.LLII = false;
        this.LLIIII = new C71313Ryn();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PrepareData{urlSupplier=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", cacheSupplier=");
        LIZ.append(this.LJI);
        LIZ.append(", resolutionSupplier=");
        LIZ.append(this.LJII);
        LIZ.append(", context=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", id='");
        Q89.LIZIZ(LIZ, this.LJIIIZ, '\'', ", isRenderReady=");
        LIZ.append(this.LJIIJ);
        LIZ.append(", config=");
        LIZ.append(this.LJIIJJI);
        LIZ.append(", vr=");
        LIZ.append(this.LJIIL);
        LIZ.append(", codecType=");
        LIZ.append(this.LJIILIIL);
        LIZ.append(", renderType=");
        LIZ.append(this.LJIIZILJ);
        LIZ.append(", decoderType=");
        LIZ.append(this.LJIJ);
        LIZ.append(", enableAlog=");
        LIZ.append(this.LJIJI);
        LIZ.append(", prepareOnly=");
        LIZ.append(this.LJJ);
        LIZ.append(", surface=");
        LIZ.append(this.LJJI);
        LIZ.append(", framesWait=");
        LIZ.append(this.LJJII);
        LIZ.append(", prepareQualitySupplier=");
        LIZ.append(this.LJJIII);
        LIZ.append(", uri='");
        Q89.LIZIZ(LIZ, this.LJJIIJ, '\'', ", cacheKey='");
        Q89.LIZIZ(LIZ, this.LJJIIJZLJL, '\'', ", checksum='");
        Q89.LIZIZ(LIZ, this.LJJIIZ, '\'', ", isCurPlayer=");
        LIZ.append(this.LJJIIZI);
        LIZ.append(", isPrepareCallback=");
        LIZ.append(this.LJJIJ);
        LIZ.append(", processUrlData=");
        LIZ.append(this.LJJIJIIJI);
        LIZ.append(", isAsyncInit=");
        LIZ.append(this.LJJIJL);
        LIZ.append(", initialStartTimeMs=");
        LIZ.append(this.LJJIJLIJ);
        LIZ.append(", isUseTextureRenderer=");
        LIZ.append(this.LJJJ);
        LIZ.append(", needSetCookieToken=");
        LIZ.append(this.LJJJI);
        LIZ.append(", dashHijackRetry=");
        LIZ.append(this.LJJJIL);
        LIZ.append(", forceNotReuseEngine=");
        LIZ.append(this.LJJJJJL);
        LIZ.append(", fixPrepareSeqTmp=");
        LIZ.append(this.LJJJJLI);
        LIZ.append(", preloadSocketReuse=");
        LIZ.append(this.LJJJJLL);
        LIZ.append(", dashPlayInfo=");
        LIZ.append(this.LJJJJZI);
        LIZ.append(", tag='");
        Q89.LIZIZ(LIZ, this.LJJJLZIJ, '\'', ", subTag='");
        Q89.LIZIZ(LIZ, this.LJJJZ, '\'', ", networkSpeed=");
        LIZ.append(this.LJJL);
        LIZ.append(", isLoop=");
        LIZ.append(this.LJJLI);
        LIZ.append(", dk='");
        Q89.LIZIZ(LIZ, this.LJJLIIIIJ, '\'', ", speed=");
        LIZ.append(this.LJJLIIIJ);
        LIZ.append(", isEnableBufferThresholdControl=");
        LIZ.append(false);
        LIZ.append(", bufferThresholdControlDangerThreshold=");
        C15890jp.LIZIZ(LIZ, 0, ", bufferThresholdControlSecureThreshold=", 0, ", duration=");
        LIZ.append(this.LJJLIIIJILLIZJL);
        LIZ.append(", volumeLoudnessTarget=");
        LIZ.append(this.LJJLIIIJJI);
        LIZ.append(", videoVolumeSrcLoudness=");
        LIZ.append(this.LJJLIIIJJIZ);
        LIZ.append(", videoVolumeSrcPeak=");
        LIZ.append(this.LJJLIIIJL);
        LIZ.append(", disableRenderAudio=");
        LIZ.append(this.LJJLIL);
        LIZ.append(", processAudioAddr=");
        LIZ.append(this.LJJLJ);
        LIZ.append(", extraSurface=");
        LIZ.append(this.LJJZ);
        LIZ.append(", subtitlesEnable=");
        LIZ.append(this.LJLIL);
        LIZ.append(", subtitlesLazyLoading=");
        LIZ.append(this.LJLIIL);
        LIZ.append(", languageId=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", subtitleDesInfoModel=");
        LIZ.append(this.LJLJI);
        LIZ.append(", subtitleDesInfoModelJSONObject=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", callCurrentPlaybackTime=");
        return C48339Iy7.LIZJ(LIZ, this.LJLZ, '}', LIZ);
    }

    public IX4(IXJ ixj, IXJ ixj2, Context context, String str, boolean z, ITS its, boolean z2, int i, int i2, IXJ ixj3, String str2, boolean z3, boolean z4, int i3) {
        this.LJIIJJI = LLIIIILZ;
        Float valueOf = Float.valueOf(Float.MIN_VALUE);
        this.LJIL = Float.MIN_VALUE;
        this.LJJIFFI = -1;
        this.LJJII = 1;
        this.LJJJJZ = true;
        this.LJJLI = true;
        this.LJJLIIIJ = 1.0f;
        this.LJJLIIIJJI = Float.valueOf(0.0f);
        this.LJJLIIIJJIZ = valueOf;
        this.LJJLIIIJL = valueOf;
        this.LJJLIIIJLJLI = -1;
        this.LJJLIIIJLLLLLLLZ = false;
        this.LJJLIIJ = false;
        this.LJJLJ = 0L;
        this.LJJZ = null;
        this.LJJZZI = false;
        this.LJJZZIII = false;
        this.LJL = false;
        this.LJLI = false;
        this.LJLIIIL = 15;
        this.LJLIIL = false;
        this.LJLIL = false;
        this.LJLILLLLZI = 0;
        this.LJLJI = null;
        this.LJLJJI = null;
        this.LJLJJLL = -1;
        this.LJLJLJ = -1;
        this.LJLJLLL = false;
        this.LJLL = false;
        this.LJLLI = 0;
        this.LJLLILLLL = 0;
        this.LJLLJ = 0;
        this.LJLLL = 0;
        this.LJLLLL = true;
        this.LJLLLLLL = true;
        this.LJLZ = false;
        this.LJZ = false;
        this.LJZI = -1;
        this.LJZL = -1;
        this.LL = -1;
        this.LLD = false;
        this.LLF = "";
        this.LLFF = -1L;
        this.LLFFF = "";
        this.LLI = "";
        this.LLIFFJFJJ = 0;
        this.LLII = false;
        this.LLIIII = new C65379PlH();
        this.LIZLLL = ixj;
        this.LJI = ixj2;
        this.LJIIIIZZ = context;
        this.LJIIIZ = str;
        this.LJIIJ = z;
        this.LJIIJJI = its;
        this.LJIIL = z2;
        this.LJIILIIL = i;
        this.LJIIZILJ = i2;
        this.LJJIII = ixj3;
        this.LJJIIJ = str2;
        this.LJJIIZI = true;
        this.LJJIJ = z3;
        this.LJJIJL = z4;
        this.LJIJ = i3;
    }
}
