package X;

import android.os.SystemClock;
import com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidgetV2;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UOA implements UO9 {
    public final /* synthetic */ CaptionTextWidgetV2 LIZ;
    public final /* synthetic */ C792439c LIZIZ;

    @Override // X.UO9
    public final void LIZ(List captionTextLines, int i, boolean z) {
        o.LJIIIZ(captionTextLines, "captionTextLines");
    }

    @Override // X.UO9
    public final void LIZIZ(List<C77105UNx> captionTextLines) {
        o.LJIIIZ(captionTextLines, "captionTextLines");
        CaptionTextWidgetV2 captionTextWidgetV2 = this.LIZ;
        captionTextWidgetV2.LJZI(true);
        if (captionTextWidgetV2.LJLJLJ) {
            captionTextWidgetV2.LJZ();
        }
    }

    @Override // X.UO9
    public final void LIZJ(List<C77105UNx> captionTextLines) {
        C29295Bed c29295Bed;
        o.LJIIIZ(captionTextLines, "captionTextLines");
        CaptionTextWidgetV2 captionTextWidgetV2 = this.LIZ;
        captionTextWidgetV2.LJZI(true);
        if (captionTextWidgetV2.LJLJLJ) {
            captionTextWidgetV2.LJZ();
        }
        if (((ArrayList) captionTextLines).size() > 2) {
            CaptionTextWidgetV2 captionTextWidgetV22 = this.LIZ;
            if (captionTextWidgetV22.LJLJLJ && (c29295Bed = captionTextWidgetV22.LLFII) != null) {
                C792439c c792439c = this.LIZIZ;
                long j = 0;
                if (c792439c.LIZIZ != 0) {
                    j = c792439c.LIZIZ + (SystemClock.elapsedRealtime() - c792439c.LIZLLL);
                }
                c29295Bed.LIZJ(j - ((C77105UNx) ListProtector.get(captionTextLines, r8.size() - 3)).LIZ);
            }
        }
    }

    @Override // X.UO9
    public final void LIZLLL(List<C77105UNx> list) {
        CaptionTextWidgetV2 captionTextWidgetV2 = this.LIZ;
        captionTextWidgetV2.LJZI(true);
        if (captionTextWidgetV2.LJLJLJ) {
            captionTextWidgetV2.LJZ();
        }
    }

    public UOA(CaptionTextWidgetV2 captionTextWidgetV2, C792439c c792439c) {
        this.LIZ = captionTextWidgetV2;
        this.LIZIZ = c792439c;
    }
}
