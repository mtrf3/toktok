package X;

import android.content.res.AssetManager;
import android.os.Trace;
import com.bytedance.zoin.ZoinNative;
import com.bytedance.zoin.decode.DecodeProcessor;
import com.bytedance.zoin.model.ZoinBlockInfo;
import com.bytedance.zoin.model.ZoinBuildFileInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* renamed from: X.FiY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class CallableC39730FiY implements Callable<Integer> {
    public final /* synthetic */ ZoinBlockInfo LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ ArrayList LJLJJLL;
    public final /* synthetic */ boolean LJLJL;
    public final /* synthetic */ File LJLJLJ;

    @Override // java.util.concurrent.Callable
    public final Integer call() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NativeDecode");
        LIZ.append(this.LJLIL.blockCompressedName);
        Trace.beginSection(X1D.LIZIZ(LIZ));
        AssetManager assets = C78929UyL.LJLIL.getAssets();
        String str = this.LJLILLLLZI;
        String str2 = this.LJLJI;
        ZoinBlockInfo zoinBlockInfo = this.LJLIL;
        long j = zoinBlockInfo.blockBeginOffset;
        long j2 = zoinBlockInfo.blockEndOffset;
        int i = this.LJLJJI;
        int i2 = this.LJLJJL;
        ZoinBuildFileInfo[] zoinBuildFileInfoArr = (ZoinBuildFileInfo[]) this.LJLJJLL.toArray(new ZoinBuildFileInfo[0]);
        boolean z = this.LJLJL;
        C39734Fic.LIZJ().getClass();
        C39734Fic LIZJ = C39734Fic.LIZJ();
        LIZJ.getClass();
        int nDecode = ZoinNative.nDecode(assets, str, str2, j, j2, i, i2, zoinBuildFileInfoArr, z, false, LIZJ instanceof C39733Fib);
        Trace.endSection();
        C39734Fic.LIZJ().getClass();
        if (nDecode == 0) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("VerifyZoin");
            LIZ2.append(this.LJLIL.blockCompressedName);
            Trace.beginSection(X1D.LIZIZ(LIZ2));
            File file = this.LJLJLJ;
            Iterator it = this.LJLJJLL.iterator();
            while (it.hasNext()) {
                ZoinBuildFileInfo zoinBuildFileInfo = (ZoinBuildFileInfo) it.next();
                StringBuilder LIZ3 = X1D.LIZ();
                long LIZIZ = C39731FiZ.LIZIZ(new File(file, JBR.LJFF(LIZ3, zoinBuildFileInfo.name, ".temp", LIZ3)));
                C39734Fic LIZJ2 = C39734Fic.LIZJ();
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("Verify files check number, file info:");
                LIZ4.append(zoinBuildFileInfo);
                LIZ4.append(", generated:");
                LIZ4.append(LIZIZ);
                X1D.LIZIZ(LIZ4);
                LIZJ2.getClass();
                if (LIZIZ != zoinBuildFileInfo.checkNumber) {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("Verify files check number, file info:");
                    LIZ5.append(zoinBuildFileInfo);
                    LIZ5.append(", generated:");
                    LIZ5.append(LIZIZ);
                    throw new C39727FiV(X1D.LIZIZ(LIZ5));
                }
            }
            DecodeProcessor.renameTempFiles(this.LJLJLJ, this.LJLJJLL);
            Trace.endSection();
            return 0;
        }
        throw new C39727FiV(KMP.LJ("native decode failed ", nDecode));
    }

    public CallableC39730FiY(ZoinBlockInfo zoinBlockInfo, String str, String str2, int i, int i2, ArrayList arrayList, boolean z, File file) {
        this.LJLIL = zoinBlockInfo;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = i;
        this.LJLJJL = i2;
        this.LJLJJLL = arrayList;
        this.LJLJL = z;
        this.LJLJLJ = file;
    }
}
