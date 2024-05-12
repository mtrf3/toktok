package Y;

import X.AbstractC43762HFm;
import X.C16880lQ;
import X.C41658GWo;
import X.C42307Gj1;
import X.C42535Gmh;
import X.C43045Guv;
import X.C44018HPi;
import X.C44021HPl;
import X.C44172HVg;
import X.C60903NvH;
import X.C68322mC;
import X.C6QQ;
import X.C76800UCe;
import X.F9J;
import X.HBO;
import X.HGQ;
import X.HWD;
import X.InterfaceC42413Gkj;
import X.InterfaceC88471Ynr;
import X.WX6;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.ss.android.ugc.aweme.challenge.api.ChallengeApi;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS154S0200000_7;
import v5.n;

/* loaded from: classes8.dex */
public class ACallableS25S1300000_7 implements Callable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS25S1300000_7 aCallableS25S1300000_7) {
        String str = aCallableS25S1300000_7.s0;
        Intent intent = (Intent) aCallableS25S1300000_7.l1;
        Context context = (Context) aCallableS25S1300000_7.l2;
        n nVar = (n) aCallableS25S1300000_7.l3;
        try {
            ((HBO) C44172HVg.LIZLLL).getClass();
            new HWD();
            AVChallenge LIZ = HWD.LIZ(ChallengeApi.LIZ(0, str, null, false).challenge);
            C41658GWo.LIZLLL().LIZIZ(LIZ);
            String challenge2str = RecordScene.challenge2str(LIZ);
            SharedPreferences.Editor edit = F9J.LIZIZ(C60903NvH.LJ, 0, "publish").edit();
            edit.putString("challenge", challenge2str);
            WX6.LIZ(edit);
            Bundle bundle = new Bundle();
            bundle.putSerializable("challenge", LIZ);
            if (LIZ.getStickerId() != null) {
                if (!C44018HPi.LJIIL(intent)) {
                    boolean z = false;
                    C6QQ.LIZ(new C44021HPl(R.string.rjz, context, bundle, nVar, LIZ.getStickerId(), z, z));
                } else {
                    C6QQ.LIZ(new C42535Gmh(context, bundle, nVar, LIZ.getStickerId()));
                }
            } else {
                nVar.LJ(bundle);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            nVar.LIZLLL(e);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, android.graphics.Bitmap] */
    public static final Object call$1(ACallableS25S1300000_7 aCallableS25S1300000_7) {
        try {
            C68322mC c68322mC = (C68322mC) aCallableS25S1300000_7.l1;
            String str = aCallableS25S1300000_7.s0;
            int[] iArr = (int[]) aCallableS25S1300000_7.l2;
            c68322mC.element = C42307Gj1.LJFF(iArr[0], iArr[1], 0, 4, str);
            C43045Guv.LIZLLL(new AqS154S0200000_7((InterfaceC88471Ynr) aCallableS25S1300000_7.l3, (C68322mC) aCallableS25S1300000_7.l1, 111), 0L);
        } catch (Exception unused) {
            C43045Guv.LIZLLL(new AqS154S0200000_7((InterfaceC88471Ynr) aCallableS25S1300000_7.l3, (C68322mC) aCallableS25S1300000_7.l1, 112), 0L);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$2(ACallableS25S1300000_7 aCallableS25S1300000_7) {
        final AbstractC43762HFm abstractC43762HFm = (AbstractC43762HFm) aCallableS25S1300000_7.l1;
        final VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aCallableS25S1300000_7.l2;
        final String str = aCallableS25S1300000_7.s0;
        final n nVar = (n) aCallableS25S1300000_7.l3;
        abstractC43762HFm.LJFF(new HGQ() { // from class: X.HGD
            @Override // X.HGQ
            public final void onFinish(boolean z) {
                VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                AbstractC43762HFm abstractC43762HFm2 = abstractC43762HFm;
                String str2 = str;
                n nVar2 = nVar;
                if (z) {
                    if ((videoPublishEditModel2 instanceof VideoPublishEditModel) && abstractC43762HFm2.LIZLLL()) {
                        videoPublishEditModel2.extractFramesModel = abstractC43762HFm2.LIZ;
                    }
                    HG2.LIZ(str2, "extractor_success");
                    nVar2.LIZJ(null);
                    return;
                }
                HG2.LIZ(str2, "extractor_error");
                nVar2.LIZIZ(new IllegalStateException("frame extractor fail"));
            }
        });
        return null;
    }

    public static final Object call$3(ACallableS25S1300000_7 aCallableS25S1300000_7) {
        int i;
        InterfaceC42413Gkj interfaceC42413Gkj = (InterfaceC42413Gkj) aCallableS25S1300000_7.l1;
        Exception exc = (Exception) aCallableS25S1300000_7.l2;
        String str = aCallableS25S1300000_7.s0;
        if (str == null) {
            str = "";
        }
        Integer num = (Integer) aCallableS25S1300000_7.l3;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        interfaceC42413Gkj.LIZ(i, str, exc);
        return C76800UCe.LIZ;
    }

    public ACallableS25S1300000_7(Object obj, Object obj2, String str, Object obj3, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
        this.l3 = obj3;
    }
}
