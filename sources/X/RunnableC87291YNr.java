package X;

import android.text.TextUtils;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import java.io.File;
import java.util.Locale;

/* renamed from: X.YNr, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class RunnableC87291YNr implements Runnable {
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public InterfaceC133905Ni LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL = -1;

    public final void LIZ() {
        String LLLZ;
        String LLLZI;
        if (TextUtils.isEmpty(this.LJLILLLLZI) || TextUtils.isEmpty(this.LJLJI) || this.LJLJJL) {
            InterfaceC133905Ni interfaceC133905Ni = this.LJLJJI;
            if (interfaceC133905Ni != null) {
                interfaceC133905Ni.LIZ(4103, -205, 0.0f, "File is empty or running");
                return;
            }
            return;
        }
        this.LJLJJL = true;
        if (this.LJLJJLL) {
            LLLZ = C16880lQ.LLLZI(Locale.US, "ffmpeg -f rawvideo -s %dx%d -pix_fmt rgba -y -i %s -vf palettegen=reserve_transparent=on %s", new Object[]{Integer.valueOf(this.LJLJL), Integer.valueOf(this.LJLJLJ), this.LJLILLLLZI, this.LJLIL});
        } else {
            LLLZ = C16880lQ.LLLZ("ffmpeg -y -i %s -vf palettegen %s", new Object[]{this.LJLILLLLZI, this.LJLIL});
        }
        int nativeExecuteFFmpegCommand = TEVideoUtils.nativeExecuteFFmpegCommand(LLLZ, null);
        if (nativeExecuteFFmpegCommand != 0) {
            this.LJLJJL = false;
            InterfaceC133905Ni interfaceC133905Ni2 = this.LJLJJI;
            if (interfaceC133905Ni2 != null) {
                interfaceC133905Ni2.LIZ(4103, nativeExecuteFFmpegCommand, 0.0f, "ffmpeg gen palette");
                return;
            }
            return;
        }
        if (this.LJLJJLL) {
            LLLZI = C16880lQ.LLLZI(Locale.US, "ffmpeg -f rawvideo -s %dx%d -pix_fmt rgba -r %d -y -i %s -i %s -lavfi paletteuse=dither=bayer %s", new Object[]{Integer.valueOf(this.LJLJL), Integer.valueOf(this.LJLJLJ), Integer.valueOf(this.LJLJLLL), this.LJLILLLLZI, this.LJLIL, this.LJLJI});
        } else {
            LLLZI = C16880lQ.LLLZI(Locale.US, "ffmpeg -y -i %s -i %s -lavfi paletteuse -f gif %s", new Object[]{this.LJLILLLLZI, this.LJLIL, this.LJLJI});
        }
        int nativeExecuteFFmpegCommand2 = TEVideoUtils.nativeExecuteFFmpegCommand(LLLZI, null);
        InterfaceC133905Ni interfaceC133905Ni3 = this.LJLJJI;
        if (interfaceC133905Ni3 != null) {
            interfaceC133905Ni3.LIZ(4103, nativeExecuteFFmpegCommand2, 0.0f, "ffmepg convert to gif");
        }
        if (this.LJLJJLL) {
            if (C16880lQ.LLLZZIL(new File(this.LJLILLLLZI))) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("clear raw data:");
                LIZ.append(this.LJLILLLLZI);
                P4Q.LJFF("VEEditor", X1D.LIZIZ(LIZ));
            }
            if (C16880lQ.LLLZZIL(new File(this.LJLIL))) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("clear palette:");
                LIZ2.append(this.LJLIL);
                P4Q.LJFF("VEEditor", X1D.LIZIZ(LIZ2));
            }
        }
        this.LJLJJL = false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public final void LIZIZ(String str) {
        this.LJLJI = str;
        if (TextUtils.isEmpty(str)) {
            this.LJLIL = null;
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        String str2 = this.LJLJI;
        LIZ.append(str2.substring(0, str2.lastIndexOf(".")));
        LIZ.append(".png");
        this.LJLIL = X1D.LIZIZ(LIZ);
    }
}
