package Y;

import X.C00S;
import X.C268513p;
import X.C268613q;
import X.C34415Df1;
import X.C42348Gjg;
import X.C44928HkC;
import X.C45049Hm9;
import X.C45125HnN;
import X.C76800UCe;
import X.C78983UzD;
import X.C84386X9y;
import X.EnumC123864ta;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.smartmovie.jni.NLEModelRequestCallback;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2;
import defpackage.t1;
import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS170S0200000_7;

/* loaded from: classes8.dex */
public class ACallableS36S1200000_7 implements Callable {
    public final int $t;
    public Object l1;
    public Object l2;
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
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS36S1200000_7 aCallableS36S1200000_7) {
        try {
            ((C44928HkC) aCallableS36S1200000_7.l1).LJLJLJ = C268613q.LJIIJ((Context) aCallableS36S1200000_7.l2, new File(aCallableS36S1200000_7.s0).getName());
            C44928HkC c44928HkC = (C44928HkC) aCallableS36S1200000_7.l1;
            if (c44928HkC.LJLJLJ == null) {
                c44928HkC.LJLJLJ = C268613q.LJFF((Context) aCallableS36S1200000_7.l2, new File(aCallableS36S1200000_7.s0).getName());
                Uri uri = ((C44928HkC) aCallableS36S1200000_7.l1).LJLJLJ;
                if (uri != null) {
                    Context context = (Context) aCallableS36S1200000_7.l2;
                    String str = aCallableS36S1200000_7.s0;
                    C268513p.LIZIZ(new FileInputStream(str), context.getContentResolver().openOutputStream(uri, "w"));
                }
                String LIZIZ = C00S.LIZIZ((Context) aCallableS36S1200000_7.l2, ((C44928HkC) aCallableS36S1200000_7.l1).LJLJLJ);
                if (LIZIZ != null) {
                    C268613q.LJIIL((Context) aCallableS36S1200000_7.l2, LIZIZ);
                }
            }
        } catch (Exception e) {
            ((C44928HkC) aCallableS36S1200000_7.l1).LJLJL = false;
            C78983UzD.LJIJ(e, "open share video failed");
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS36S1200000_7 aCallableS36S1200000_7) {
        Object obj;
        C45125HnN c45125HnN = (C45125HnN) aCallableS36S1200000_7.l1;
        String str = aCallableS36S1200000_7.s0;
        c45125HnN.getClass();
        NLEEditor nLEEditor = new NLEEditor();
        nLEEditor.LJI(str);
        nLEEditor.LIZIZ();
        nLEEditor.LIZJ();
        NLEModel LJ = nLEEditor.LJ();
        Iterator LIZJ = t1.LIZJ(LJ, "nleModel.tracks");
        while (true) {
            if (LIZJ.hasNext()) {
                obj = LIZJ.next();
                if (((NLETrack) obj).LJIIZILJ() == EnumC123864ta.AUDIO) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NLETrack nLETrack = (NLETrack) obj;
        if (nLETrack != null) {
            LJ.removeTrack(nLETrack);
        }
        if (LJ.getMainTrack() == null) {
            C45049Hm9.LIZ(LogLevel.LEVEL_INFO, "AutoCutNLEModelDelegate checkAutoCutNLE: ");
        }
        ((C45125HnN) aCallableS36S1200000_7.l1).LIZ(LJ, new AqS170S0200000_7(new UnorderedMapStrStr(), (NLEModelRequestCallback) aCallableS36S1200000_7.l2, 2));
        return C76800UCe.LIZ;
    }

    public static final Object call$2(ACallableS36S1200000_7 aCallableS36S1200000_7) {
        ((C84386X9y) ((VEMediaParserProviderV2) aCallableS36S1200000_7.l1).LJLJL.getValue()).LIZJ(aCallableS36S1200000_7.s0, new C42348Gjg(((Bitmap) aCallableS36S1200000_7.l2).getWidth(), ((Bitmap) aCallableS36S1200000_7.l2).getHeight(), (Bitmap) aCallableS36S1200000_7.l2), C34415Df1.LJLIL);
        return C76800UCe.LIZ;
    }

    public ACallableS36S1200000_7(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}
