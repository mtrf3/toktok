package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ttvecamera.TEFrameRateRange;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* renamed from: X.X0g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84134X0g implements Cloneable {
    public Context LJLIL;
    public int LJLILLLLZI;
    public TEFrameRateRange LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public final int LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public long LJLZ;
    public float LJZ;
    public TEFrameSizei LJZI;
    public TEFrameSizei LJZL;
    public int LL;
    public int LLD;
    public int LLF;
    public int LLFF;
    public float LLFFF;
    public boolean LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public int LLIFFJFJJ;
    public int LLII;
    public Bundle LLIIII;
    public String LLIIIILZ;
    public String LLIIIJ;
    public final C63824P3c LLIIIL;
    public boolean LLIIIZ;
    public boolean LLIIJI;
    public int LLIIJLIL;
    public int LLIIL;
    public boolean LLIILII;
    public boolean LLIILZL;
    public boolean LLIIZ;
    public boolean LLIL;
    public boolean LLILII;
    public int LLILIL;
    public boolean LLILL;
    public int LLILLIZIL;
    public int LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public float LLJJIJIIJIL;
    public float LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public float LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public VK8 LLJL;
    public HashMap<VKA, Cert> LLJLIL;

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TECameraSettings: [mCameraType = ");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", mPreviewSize = ");
        LIZ.append(this.LJZI);
        LIZ.append(", mFacing = ");
        LIZ.append(this.LJLJJI);
        LIZ.append(", mHighFPS = ");
        LIZ.append(this.LLIIJLIL);
        LIZ.append(", mEnableStabilization = ");
        LIZ.append(this.LLILL);
        LIZ.append(", mRequiredCameraLevel = ");
        LIZ.append(this.LLII);
        LIZ.append(", mMaxWidth = ");
        LIZ.append(this.LL);
        LIZ.append(", mUseMaxWidthTakePicture = ");
        LIZ.append(this.LLFII);
        LIZ.append(", mMode = ");
        return C08380Uo.LIZ(LIZ, this.LLIFFJFJJ, "]", LIZ);
    }

    public C84134X0g(Context context) {
        this.LJLILLLLZI = 1;
        this.LJLJI = new TEFrameRateRange(7, 30);
        this.LJLJJI = 0;
        this.LJLJJL = 0;
        this.LJLJJLL = -1;
        this.LJLJL = 17;
        this.LJLJLJ = false;
        this.LJLJLLL = false;
        this.LJLL = true;
        this.LJLLI = false;
        this.LJLLILLLL = false;
        this.LJLLJ = false;
        this.LJLLL = false;
        this.LJLLLL = false;
        this.LJLLLLLL = false;
        this.LJLZ = 5000L;
        this.LJZ = -1.0f;
        this.LJZI = new TEFrameSizei(1280, 720);
        this.LJZL = new TEFrameSizei(1920, 1080);
        this.LL = 0;
        this.LLD = 0;
        this.LLF = 0;
        this.LLFF = 1;
        this.LLFFF = 0.0f;
        this.LLFII = false;
        this.LLFZ = false;
        this.LLI = false;
        this.LLIFFJFJJ = 0;
        this.LLII = 1;
        this.LLIIII = new Bundle();
        this.LLIIIILZ = CardStruct.IStatusCode.DEFAULT;
        this.LLIIIJ = "-1";
        this.LLIIIL = new C63824P3c();
        this.LLIIIZ = true;
        this.LLIIJI = false;
        this.LLIIJLIL = 0;
        this.LLIIL = 0;
        this.LLIILII = false;
        this.LLIILZL = false;
        this.LLIIZ = false;
        this.LLIL = false;
        this.LLILII = false;
        this.LLILIL = 50;
        this.LLILL = false;
        this.LLILLIZIL = 0;
        this.LLILLJJLI = 30;
        this.LLILLL = false;
        this.LLILZ = false;
        this.LLILZIL = 3;
        this.LLILZLL = false;
        this.LLIZ = false;
        this.LLIZLLLIL = false;
        this.LLJ = false;
        this.LLJIJIL = false;
        this.LLJILJIL = false;
        this.LLJILJILJ = false;
        this.LLJILLL = false;
        this.LLJJ = false;
        this.LLJJI = false;
        this.LLJJIII = false;
        this.LLJJIJI = false;
        this.LLJJIJIIJIL = -1.0f;
        this.LLJJIJIL = -1.0f;
        this.LLJJJ = false;
        this.LLJJJIL = true;
        this.LLJJJJ = 1.0f;
        this.LLJJJJJIL = true;
        this.LLJJJJLIIL = false;
        this.LLJJL = false;
        this.LLJJLIIIJLLLLLLLZ = false;
        this.LLJL = null;
        this.LLJLIL = null;
        this.LJLIL = context;
    }

    public C84134X0g(Context context, int i) {
        this.LJLILLLLZI = 1;
        this.LJLJI = new TEFrameRateRange(7, 30);
        this.LJLJJI = 0;
        this.LJLJJL = 0;
        this.LJLJJLL = -1;
        this.LJLJL = 17;
        this.LJLJLJ = false;
        this.LJLJLLL = false;
        this.LJLL = true;
        this.LJLLI = false;
        this.LJLLILLLL = false;
        this.LJLLJ = false;
        this.LJLLL = false;
        this.LJLLLL = false;
        this.LJLLLLLL = false;
        this.LJLZ = 5000L;
        this.LJZ = -1.0f;
        this.LJZI = new TEFrameSizei(1280, 720);
        this.LJZL = new TEFrameSizei(1920, 1080);
        this.LL = 0;
        this.LLD = 0;
        this.LLF = 0;
        this.LLFF = 1;
        this.LLFFF = 0.0f;
        this.LLFII = false;
        this.LLFZ = false;
        this.LLI = false;
        this.LLIFFJFJJ = 0;
        this.LLII = 1;
        this.LLIIII = new Bundle();
        this.LLIIIILZ = CardStruct.IStatusCode.DEFAULT;
        this.LLIIIJ = "-1";
        this.LLIIIL = new C63824P3c();
        this.LLIIIZ = true;
        this.LLIIJI = false;
        this.LLIIJLIL = 0;
        this.LLIIL = 0;
        this.LLIILII = false;
        this.LLIILZL = false;
        this.LLIIZ = false;
        this.LLIL = false;
        this.LLILII = false;
        this.LLILIL = 50;
        this.LLILL = false;
        this.LLILLIZIL = 0;
        this.LLILLJJLI = 30;
        this.LLILLL = false;
        this.LLILZ = false;
        this.LLILZIL = 3;
        this.LLILZLL = false;
        this.LLIZ = false;
        this.LLIZLLLIL = false;
        this.LLJ = false;
        this.LLJIJIL = false;
        this.LLJILJIL = false;
        this.LLJILJILJ = false;
        this.LLJILLL = false;
        this.LLJJ = false;
        this.LLJJI = false;
        this.LLJJIII = false;
        this.LLJJIJI = false;
        this.LLJJIJIIJIL = -1.0f;
        this.LLJJIJIL = -1.0f;
        this.LLJJJ = false;
        this.LLJJJIL = true;
        this.LLJJJJ = 1.0f;
        this.LLJJJJJIL = true;
        this.LLJJJJLIIL = false;
        this.LLJJL = false;
        this.LLJJLIIIJLLLLLLLZ = false;
        this.LLJL = null;
        this.LLJLIL = null;
        this.LJLIL = context;
        this.LJLILLLLZI = i;
    }

    public C84134X0g(Context context, int i, int i2, int i3) {
        this.LJLILLLLZI = 1;
        this.LJLJI = new TEFrameRateRange(7, 30);
        this.LJLJJI = 0;
        this.LJLJJL = 0;
        this.LJLJJLL = -1;
        this.LJLJL = 17;
        this.LJLJLJ = false;
        this.LJLJLLL = false;
        this.LJLL = true;
        this.LJLLI = false;
        this.LJLLILLLL = false;
        this.LJLLJ = false;
        this.LJLLL = false;
        this.LJLLLL = false;
        this.LJLLLLLL = false;
        this.LJLZ = 5000L;
        this.LJZ = -1.0f;
        this.LJZI = new TEFrameSizei(1280, 720);
        this.LJZL = new TEFrameSizei(1920, 1080);
        this.LL = 0;
        this.LLD = 0;
        this.LLF = 0;
        this.LLFF = 1;
        this.LLFFF = 0.0f;
        this.LLFII = false;
        this.LLFZ = false;
        this.LLI = false;
        this.LLIFFJFJJ = 0;
        this.LLII = 1;
        this.LLIIII = new Bundle();
        this.LLIIIILZ = CardStruct.IStatusCode.DEFAULT;
        this.LLIIIJ = "-1";
        this.LLIIIL = new C63824P3c();
        this.LLIIIZ = true;
        this.LLIIJI = false;
        this.LLIIJLIL = 0;
        this.LLIIL = 0;
        this.LLIILII = false;
        this.LLIILZL = false;
        this.LLIIZ = false;
        this.LLIL = false;
        this.LLILII = false;
        this.LLILIL = 50;
        this.LLILL = false;
        this.LLILLIZIL = 0;
        this.LLILLJJLI = 30;
        this.LLILLL = false;
        this.LLILZ = false;
        this.LLILZIL = 3;
        this.LLILZLL = false;
        this.LLIZ = false;
        this.LLIZLLLIL = false;
        this.LLJ = false;
        this.LLJIJIL = false;
        this.LLJILJIL = false;
        this.LLJILJILJ = false;
        this.LLJILLL = false;
        this.LLJJ = false;
        this.LLJJI = false;
        this.LLJJIII = false;
        this.LLJJIJI = false;
        this.LLJJIJIIJIL = -1.0f;
        this.LLJJIJIL = -1.0f;
        this.LLJJJ = false;
        this.LLJJJIL = true;
        this.LLJJJJ = 1.0f;
        this.LLJJJJJIL = true;
        this.LLJJJJLIIL = false;
        this.LLJJL = false;
        this.LLJJLIIIJLLLLLLLZ = false;
        this.LLJL = null;
        this.LLJLIL = null;
        this.LJLIL = context;
        this.LJLILLLLZI = i;
        TEFrameSizei tEFrameSizei = this.LJZI;
        tEFrameSizei.width = i2;
        tEFrameSizei.height = i3;
    }
}