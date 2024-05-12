package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.I6h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46071I6h extends AnimatorListenerAdapter {
    public final /* synthetic */ I6Z LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ OSZ<Long, Long> LJLJJL;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        float f;
        InterfaceC153045zY interfaceC153045zY;
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        long LIZJ = this.LJLIL.LJIIJ().LIZJ();
        I6Z i6z = this.LJLIL;
        ((CutMultiVideoViewModel) i6z.LJZI.LIZ(i6z, I6Z.LLIIII[4])).LJLJJLL.setValue(null);
        if (this.LJLIL.LJLJLJ != null) {
            f = C5O6.LIZJ / r0.LLILZ().width;
        } else {
            f = 1.0f;
        }
        if (!C78841Uwv.LJIIIZ(-1.0f, this.LJLIL.LJLJJLL, 1.0E-5f) && !C78841Uwv.LJIIIZ(this.LJLIL.LJLJJLL, f, 1.0E-5f)) {
            I6Z i6z2 = this.LJLIL;
            int i = this.LJLILLLLZI;
            float f2 = (this.LJLJI * f) / i6z2.LJLJJLL;
            List<MultiEditVideoSegmentRecordData> list = i6z2.LIZLLL().segmentDataList;
            o.LJIIIIZZ(list, "curRecordData.segmentDataList");
            MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) ORZ.LJLLLLLL(i, list);
            if (multiEditVideoSegmentRecordData != null) {
                multiEditVideoSegmentRecordData.scale = f2;
            }
            this.LJLIL.LJLJJLL = f;
        }
        int i2 = (this.LJLJJI + 90) % 360;
        InterfaceC153045zY interfaceC153045zY2 = this.LJLIL.LJLJLJ;
        if (interfaceC153045zY2 != null) {
            interfaceC153045zY2.stop();
        }
        C46069I6f c46069I6f = this.LJLIL.LJLJLLL;
        if (c46069I6f != null) {
            c46069I6f.LJI(this.LJLILLLLZI, i2);
        }
        I6Z i6z3 = this.LJLIL;
        i6z3.getClass();
        if (C5O6.LIZLLL > 0 && C5O6.LIZJ > 0 && C5O6.LIZ >= 0 && C5O6.LIZIZ >= 0 && (interfaceC153045zY = i6z3.LJLJLJ) != null) {
            interfaceC153045zY.LIZ(C5O6.LIZ, C5O6.LIZIZ, C5O6.LIZJ, C5O6.LIZLLL);
        }
        C46069I6f c46069I6f2 = this.LJLIL.LJLJLLL;
        if (c46069I6f2 != null) {
            c46069I6f2.LJFF((int) this.LJLJJL.getFirst().longValue(), (int) this.LJLJJL.getSecond().longValue());
        }
        I7S.LIZ(this.LJLIL.LJIIJ(), LIZJ, null, 6);
    }

    public C46071I6h(I6Z i6z, int i, float f, int i2, OSZ<Long, Long> osz) {
        this.LJLIL = i6z;
        this.LJLILLLLZI = i;
        this.LJLJI = f;
        this.LJLJJI = i2;
        this.LJLJJL = osz;
    }
}
