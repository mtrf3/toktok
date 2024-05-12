package X;

import Y.AObjectS52S0101000_7;
import Y.AfS46S0300000_7;
import Y.AfS56S0200000_7;
import android.app.Activity;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G66 extends AbstractC42152GgW<C76800UCe> {
    public final Activity LJLJJI;
    public final VideoPublishEditModel LJLJJL;
    public final InterfaceC65784Pro<C76800UCe> LJLJJLL;
    public final InterfaceC65784Pro<C76800UCe> LJLJL;
    public final /* synthetic */ G7K LJLJLJ;

    @Override // X.AbstractC42152GgW
    public final void LIZIZ() {
    }

    @Override // X.AbstractC42152GgW
    public final String LIZJ() {
        return "Sensitive Title Check";
    }

    @Override // X.AbstractC42152GgW
    public final void LIZLLL() {
    }

    @Override // X.AbstractC42152GgW
    public final void LIZ(C42150GgU nextStep) {
        InterfaceC92693kP interfaceC92693kP;
        o.LJIIIZ(nextStep, "nextStep");
        if (!this.LJLJLJ.LIZ) {
            nextStep.LIZIZ(this);
            return;
        }
        H78.LIZ("TitleSensitivity start synchronize data with 2 different response");
        G7K g7k = this.LJLJLJ;
        if (!g7k.LJ && g7k.LIZJ == null && g7k.LIZIZ == null && g7k.LIZLLL != null) {
            this.LJLJJLL.invoke();
            H78.LIZ("TitleSensitivity showloding when sync data");
            G7K g7k2 = this.LJLJLJ;
            T03 t03 = g7k2.LJFF;
            if (t03 != null) {
                interfaceC92693kP = t03.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS46S0300000_7(this.LJLJLJ, this, nextStep, 1), new AfS56S0200000_7(this, nextStep, 8));
            } else {
                interfaceC92693kP = null;
            }
            g7k2.LJIIIIZZ = (C73411SrX) interfaceC92693kP;
            return;
        }
        LJ(nextStep);
    }

    public final void LJ(G7X g7x) {
        String str;
        String str2;
        if (o.LJ(this.LJLJLJ.LIZIZ, Boolean.TRUE)) {
            C145995oB c145995oB = new C145995oB();
            VideoPublishEditModel videoPublishEditModel = this.LJLJJL;
            if (videoPublishEditModel != null) {
                str = videoPublishEditModel.getCreationId();
            } else {
                str = "mModel is null";
            }
            c145995oB.LJI("creation_id", str);
            C44423Hc3 currentUser = C44172HVg.LJIJ.getCurrentUser();
            if (currentUser == null || (str2 = currentUser.getUid()) == null) {
                str2 = "";
            }
            c145995oB.LJI("user_id", str2);
            FMX.LJIIL("tns_video_push_words_sh", c145995oB.LIZ);
            G7J.LIZ(this.LJLJJI, this.LJLJLJ, new AqS154S0200000_7(g7x, this, 94), new AqS154S0200000_7(g7x, this, 95));
            return;
        }
        g7x.LIZIZ(this);
    }

    public G66(G7K g7k, Activity activity, VideoPublishEditModel videoPublishEditModel, AObjectS52S0101000_7 aObjectS52S0101000_7, AObjectS52S0101000_7 aObjectS52S0101000_72) {
        this.LJLJLJ = g7k;
        this.LJLJJI = activity;
        this.LJLJJL = videoPublishEditModel;
        this.LJLJJLL = aObjectS52S0101000_7;
        this.LJLJL = aObjectS52S0101000_72;
    }
}
