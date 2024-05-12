package X;

import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEException;
import com.ss.android.vesdk.jni.TEAudioEffectInterface;

/* loaded from: classes16.dex */
public final class YO9 {
    public final VEEditor LIZ;
    public final TEInterface LIZIZ;
    public final TEAudioEffectInterface LIZJ;
    public int LIZLLL = -1;
    public int LJ = -1;
    public int LJFF = -1;
    public int LJI = -1;
    public C84049Wyj LJII;
    public final YOT LJIIIIZZ;

    public final void LIZ() {
        try {
            int i = this.LIZ.LLILL;
            int[] addFilters = this.LIZIZ.addFilters(new int[]{0, 0, 0}, new String[]{"color filter", "effect hdr filter", "lens hdr filter"}, new int[]{0, 0, 0}, new int[]{i, i, i}, new int[]{0, 0, 0}, new int[]{7, 16, 33}, new int[]{1, 0, 0});
            this.LIZLLL = addFilters[0];
            this.LJ = addFilters[1];
            this.LJFF = addFilters[2];
            VEEditor vEEditor = this.LIZ;
            YOO yoo = vEEditor.LJLIL;
            if (yoo != null && yoo.isMVInitialedInternal()) {
                for (int i2 : addFilters) {
                    vEEditor.LJLIL.addMVFilterInternal(i2);
                }
            }
        } catch (NullPointerException unused) {
            throw new VEException(-1, "init failed: VESDK need to be init");
        }
    }

    public YO9(VEEditor vEEditor) {
        this.LIZ = vEEditor;
        TEInterface tEInterface = vEEditor.LLIIII;
        this.LIZIZ = tEInterface;
        this.LIZJ = new TEAudioEffectInterface(tEInterface.getNativeHandler());
        this.LJIIIIZZ = new YOT();
    }
}
