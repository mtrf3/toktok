package X;

import com.mammon.audiosdk.SAMICore;
import com.mammon.audiosdk.enums.SAMICoreDataType;
import com.mammon.audiosdk.structures.SAMICoreAudioBuffer;
import com.mammon.audiosdk.structures.SAMICoreBlock;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONObject;

/* renamed from: X.IlS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47554IlS {
    public static final /* synthetic */ int LJIILJJIL = 0;
    public SAMICore LIZ;
    public int LIZJ;
    public int LIZLLL;
    public String LJFF;
    public volatile byte[] LJI;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public long LJIIJ;
    public Aweme LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public int LIZIZ = 2;
    public float LJ = -1.0f;
    public final LinkedBlockingQueue<C47549IlN> LJII = new LinkedBlockingQueue<>();

    public final synchronized void LIZIZ() {
        boolean z;
        SAMICore sAMICore;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("audioRelease: samiCore?.handle:");
        SAMICore sAMICore2 = this.LIZ;
        if (sAMICore2 != null && sAMICore2.getHandle() == 0) {
            z = false;
        } else {
            z = true;
        }
        LIZ.append(z);
        LIZ.append(' ');
        LIZ.append(C16880lQ.LLLLIIIILLL().getId());
        C46303IFf.LIZ(X1D.LIZIZ(LIZ));
        SAMICore sAMICore3 = this.LIZ;
        if (sAMICore3 != null && sAMICore3.getHandle() != 0 && (sAMICore = this.LIZ) != null) {
            sAMICore.SAMICoreDestroyHandle();
        }
        this.LIZ = null;
        this.LJIIL = false;
        this.LJII.clear();
        try {
            JSONObject LIZ2 = C169646lE.LIZ();
            if (LIZ2 != null) {
                if (LIZ2.optInt("sampling_rate") >= 30) {
                    this.LJI = null;
                }
            }
        } catch (Exception unused) {
        }
        this.LJIIIZ = 0;
        this.LJIILIIL = false;
        this.LJIIIIZZ = false;
        this.LJIIJJI = null;
        this.LJIIJ = 0L;
        this.LJ = -1.0f;
        this.LJFF = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x02e6, code lost:
    
        if (r0 == null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02ff, code lost:
    
        if (r0 == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0113, code lost:
    
        if (r0 == null) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            Method dump skipped, instructions count: 855
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47554IlS.LIZLLL():void");
    }

    public final synchronized void LIZ(C47549IlN c47549IlN) {
        long j = this.LJIIJ;
        long j2 = c47549IlN.LJII;
        if (j > j2) {
            long j3 = this.LJIIIZ - j;
            if (j3 > 0 && j3 < 100) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("play end, audio close ");
                LIZ.append(C16880lQ.LLLLIIIILLL().getId());
                C46303IFf.LIZ(X1D.LIZIZ(LIZ));
                if (this.LJIILIIL) {
                    LIZLLL();
                    this.LJIILIIL = false;
                }
                return;
            }
        }
        this.LJIIJ = j2;
        SAMICore sAMICore = this.LIZ;
        if (sAMICore != null && sAMICore.getHandle() != 0 && this.LJIIIZ != 0) {
            SAMICoreAudioBuffer sAMICoreAudioBuffer = new SAMICoreAudioBuffer();
            int i = this.LIZIZ;
            sAMICoreAudioBuffer.numberChannels = i;
            sAMICoreAudioBuffer.isInterleave = 1;
            int i2 = c47549IlN.LJI;
            sAMICoreAudioBuffer.numberSamples = i2;
            sAMICoreAudioBuffer.data = new float[][]{new float[i2 * i]};
            SAMICoreBlock sAMICoreBlock = new SAMICoreBlock();
            sAMICoreBlock.dataType = SAMICoreDataType.SAMICoreDataType_AudioBuffer;
            sAMICoreBlock.audioData = r0;
            SAMICoreAudioBuffer[] sAMICoreAudioBufferArr = {sAMICoreAudioBuffer};
            int i3 = c47549IlN.LJI;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                ArrayList<float[]> arrayList = c47549IlN.LJIIIIZZ;
                if (arrayList != null) {
                    Iterator<float[]> it = arrayList.iterator();
                    while (it.hasNext()) {
                        sAMICoreAudioBuffer.data[0][i4] = it.next()[i5];
                        i4++;
                    }
                }
            }
            SAMICore sAMICore2 = this.LIZ;
            if (sAMICore2 == null || sAMICore2.SAMICoreProcess(sAMICoreBlock, null) != 0) {
                LIZIZ();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c A[Catch: all -> 0x00e0, TRY_ENTER, TryCatch #0 {, blocks: (B:6:0x0007, B:8:0x000d, B:14:0x001c, B:16:0x0047, B:17:0x004d, B:19:0x0062, B:20:0x006a, B:23:0x008b, B:25:0x0090, B:28:0x009d, B:30:0x00ca, B:32:0x00d3), top: B:5:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C47549IlN r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47554IlS.LIZJ(X.IlN):void");
    }

    public final void LJ(C47549IlN c47549IlN) {
        if (this.LJIILIIL) {
            this.LJII.add(c47549IlN);
        }
    }
}
