package X;

import Y.ACListenerS22S0100000_2;
import Y.ARunnableS21S0200000_2;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.o;

/* renamed from: X.58i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1300058i {
    public static final int LJIIJ = C5BZ.LJLJI;
    public static final int LJIIJJI = C5BZ.LJLJJI;
    public final Context LIZ;
    public final int LIZIZ;
    public final NLETrackSlot LIZJ;
    public final InterfaceC1300258k LIZLLL;
    public final InterfaceC88472Yns<String, C76800UCe> LJ;
    public C5BZ LJFF;
    public final boolean LJI;
    public final long LJII;
    public final String LJIIIIZZ;
    public int LJIIIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.58j] */
    public final C5BZ LIZ() {
        final int LIZ;
        C5BZ c5bz = this.LJFF;
        if (c5bz == null) {
            c5bz = new C5BZ(this.LIZ);
            this.LJFF = c5bz;
            c5bz.setScaleType(ImageView.ScaleType.CENTER_CROP);
            c5bz.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS22S0100000_2(this, 88)));
            if (this.LJI) {
                LIZ = 0;
            } else {
                LIZ = C5DZ.LIZ((int) this.LJII);
            }
            Bitmap LIZ2 = this.LIZLLL.LIZ(LIZ, this.LJIIIIZZ);
            if (LIZ2 == null) {
                this.LIZLLL.LIZIZ(new C54T() { // from class: X.58j
                    @Override // X.C54T
                    public final boolean LIZ(String path) {
                        C5BZ c5bz2;
                        o.LJIIIZ(path, "path");
                        C1300058i c1300058i = C1300058i.this;
                        Bitmap LIZ3 = c1300058i.LIZLLL.LIZ(LIZ, c1300058i.LJIIIIZZ);
                        if (LIZ3 == null || (c5bz2 = C1300058i.this.LJFF) == null || !c5bz2.isAttachedToWindow()) {
                            return false;
                        }
                        C5BZ c5bz3 = C1300058i.this.LJFF;
                        if (c5bz3 != null) {
                            c5bz3.setImageBitmap(LIZ3);
                        }
                        return true;
                    }
                });
            } else {
                C5BZ c5bz2 = this.LJFF;
                if (c5bz2 != null) {
                    c5bz2.post(new ARunnableS21S0200000_2(LIZ2, this, 33));
                }
            }
        }
        return c5bz;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1300058i(Context context, int i, NLETrackSlot segmentInfo, InterfaceC1300258k frameGet, InterfaceC88472Yns<? super String, C76800UCe> onItemClickCallback) {
        EnumC123874tb enumC123874tb;
        boolean z;
        long j;
        NLEResourceNode LIZIZ;
        o.LJIIIZ(segmentInfo, "segmentInfo");
        o.LJIIIZ(frameGet, "frameGet");
        o.LJIIIZ(onItemClickCallback, "onItemClickCallback");
        this.LIZ = context;
        this.LIZIZ = i;
        this.LIZJ = segmentInfo;
        this.LIZLLL = frameGet;
        this.LJ = onItemClickCallback;
        NLESegmentVideo LJJ = NLESegmentVideo.LJJ(segmentInfo.LJI());
        if (LJJ != null && (LIZIZ = LJJ.LIZIZ()) != null) {
            enumC123874tb = LIZIZ.LJFF();
        } else {
            enumC123874tb = null;
        }
        if (enumC123874tb == EnumC123874tb.IMAGE) {
            z = true;
        } else {
            z = false;
        }
        this.LJI = z;
        NLESegmentAudio nLESegmentAudio = (NLESegmentAudio) NLESegmentVideo.class.getMethod("LJJ", NLENode.class).invoke(null, segmentInfo.LJI());
        if (nLESegmentAudio != null) {
            j = nLESegmentAudio.LJIILIIL();
        } else {
            j = 0;
        }
        this.LJII = j / 1000;
        this.LJIIIIZZ = C5DZ.LIZJ(segmentInfo);
    }
}
