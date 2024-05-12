package X;

import Y.ACListenerS33S0300000_7;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEMVExternalAlgorithmResult;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLETrackMV;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostThreadPoolExecutorDepend;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.CommonSettingItemStatus;
import com.ss.android.ugc.tiktok.security.ClientSecurityServiceImpl;
import com.ss.android.ugc.tiktok.security.IClientSecurityService;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import yq4.a;

/* renamed from: X.Uww, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78842Uww implements InterfaceC162316Yp, IHostThreadPoolExecutorDepend, InterfaceC56171M2t, C4RF, InterfaceC06380Mw {
    public static int LJLIL;

    public void LJ() {
    }

    public List LJFF() {
        return null;
    }

    public View LJII() {
        return null;
    }

    public void LJIIIIZZ() {
    }

    public void LJIIIZ() {
    }

    @Override // X.InterfaceC162316Yp
    public void LLILZIL(Bitmap bitmap) {
    }

    @Override // X.InterfaceC06380Mw
    public void onEventV3(String str, JSONObject jSONObject) {
    }

    public void p6(boolean z) {
    }

    @Override // com.bytedance.ies.xbridge.base.runtime.depend.IHostThreadPoolExecutorDepend
    public ExecutorService getNormalThreadExecutor() {
        ExecutorService executor = C38016Ew0.LIZ;
        IClientSecurityService LJIILIIL = ClientSecurityServiceImpl.LJIILIIL();
        if (LJIILIIL != null) {
            o.LJIIIIZZ(executor, "executor");
            ExecutorService LJIIIIZZ = LJIILIIL.LJIIIIZZ(executor);
            if (LJIIIIZZ != null) {
                return LJIIIIZZ;
            }
        }
        o.LJIIIIZZ(executor, "executor");
        return executor;
    }

    public /* synthetic */ C78842Uww() {
    }

    public /* synthetic */ C78842Uww(C108634Od c108634Od) {
    }

    public static final C40511Fv9 LJIJJ(C40517FvF c40517FvF) {
        o.LJIIIZ(c40517FvF, "<this>");
        return new C40511Fv9(c40517FvF.LJLILLLLZI, c40517FvF.LJLIL, -c40517FvF.LJLJI);
    }

    @Override // X.InterfaceC56171M2t
    public void LIZ(C56175M2x context) {
        C8DV LJJIIZI;
        o.LJIIIZ(context, "context");
        C8DU c8du = context.LIZIZ;
        if (c8du != null) {
            c8du.LJJJJJL(false);
        }
        C8DU c8du2 = context.LIZIZ;
        if (c8du2 != null && (LJJIIZI = c8du2.LJJIIZI()) != null) {
            LJJIIZI.LJJLIIIJ();
        }
    }

    @Override // X.InterfaceC56171M2t
    public void LIZIZ(C56175M2x context) {
        o.LJIIIZ(context, "context");
        InterfaceC56168M2q interfaceC56168M2q = context.LIZ;
        if (interfaceC56168M2q != null) {
            interfaceC56168M2q.LJI(EnumC56169M2r.ARROW_FILL);
        }
    }

    @Override // X.InterfaceC56171M2t
    public void LIZJ(C56175M2x context) {
        o.LJIIIZ(context, "context");
        C8DU c8du = context.LIZIZ;
        if (c8du != null) {
            c8du.LJJJJJL(true);
            C8DV LJJIIZI = c8du.LJJIIZI();
            if (LJJIIZI != null) {
                LJJIIZI.LJJLIIIJ();
            }
        }
    }

    @Override // X.InterfaceC56171M2t
    public void LIZLLL(C56175M2x context) {
        o.LJIIIZ(context, "context");
        LIZ(context);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Comparable] */
    public static final Comparable LJIILJJIL(Comparable comparable, InterfaceC78843Uwx range) {
        o.LJIIIZ(comparable, "<this>");
        o.LJIIIZ(range, "range");
        if (!range.isEmpty()) {
            if (range.LIZJ(comparable, range.getStart()) && !range.LIZJ(range.getStart(), comparable)) {
                return range.getStart();
            }
            if (!range.LIZJ(range.LJIIIIZZ(), comparable) || range.LIZJ(comparable, range.LJIIIIZZ())) {
                return comparable;
            }
            return range.LJIIIIZZ();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Cannot coerce value to an empty range: ");
        LIZ.append(range);
        LIZ.append('.');
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static final boolean LJIILL(InterfaceC78843Uwx interfaceC78843Uwx, float f) {
        o.LJIIIZ(interfaceC78843Uwx, "<this>");
        return interfaceC78843Uwx.LJII(Double.valueOf(f));
    }

    public static final C40511Fv9 LJIILLIIL(int i, int i2) {
        return new C40511Fv9(i, i2, -1);
    }

    public static final int LJIJ(V0R random, C40517FvF c40517FvF) {
        o.LJIIIZ(c40517FvF, "<this>");
        o.LJIIIZ(random, "random");
        try {
            return C78841Uwv.LJJIFFI(random, c40517FvF);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public static final long LJIJI(V0R random, UIW uiw) {
        o.LJIIIZ(random, "random");
        try {
            return C78841Uwv.LJJII(random, uiw);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public static final C40511Fv9 LJIL(C40517FvF c40517FvF, int i) {
        boolean z;
        o.LJIIIZ(c40517FvF, "<this>");
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Integer step = Integer.valueOf(i);
        o.LJIIIZ(step, "step");
        if (z) {
            int i2 = c40517FvF.LJLIL;
            int i3 = c40517FvF.LJLILLLLZI;
            if (c40517FvF.LJLJI <= 0) {
                i = -i;
            }
            return new C40511Fv9(i2, i3, i);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Step must be positive, was: ");
        LIZ.append(step);
        LIZ.append('.');
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static final C40517FvF LJJ(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return C40517FvF.LJLJJL;
        }
        return new C40517FvF(i, i2 - 1);
    }

    @Override // X.InterfaceC56171M2t
    public void LJI(C56175M2x c56175M2x, ActivityC45651qj activityC45651qj) {
        c56175M2x.LJFF();
    }

    public static final double LJIIJ(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            if (d > d3) {
                return d3;
            }
            return d;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Cannot coerce value to an empty range: maximum ");
        LIZ.append(d3);
        LIZ.append(" is less than minimum ");
        throw new IllegalArgumentException(C07670Rv.LIZ(LIZ, d2, '.', LIZ));
    }

    public static final float LJIIJJI(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            if (f > f3) {
                return f3;
            }
            return f;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Cannot coerce value to an empty range: maximum ");
        LIZ.append(f3);
        LIZ.append(" is less than minimum ");
        LIZ.append(f2);
        LIZ.append('.');
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static final int LJIIL(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            if (i > i3) {
                return i3;
            }
            return i;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Cannot coerce value to an empty range: maximum ");
        LIZ.append(i3);
        LIZ.append(" is less than minimum ");
        LIZ.append(i2);
        LIZ.append('.');
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public static final long LJIILIIL(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            if (j > j3) {
                return j3;
            }
            return j;
        }
        StringBuilder LIZJ = V10.LIZJ("Cannot coerce value to an empty range: maximum ", j3, " is less than minimum ");
        throw new IllegalArgumentException(C47135Ieh.LIZIZ(LIZJ, j2, '.', LIZJ));
    }

    public static final void LJIIZILJ(G5Q g5q, VideoPublishEditModel videoPublishEditModel, HashMap hashMap) {
        boolean z;
        int i;
        Integer M;
        CommonSettingItemStatus commonSettingItemStatus = g5q.LIZ;
        G5P g5p = new G5P("comment");
        boolean z2 = true;
        g5p.LIZIZ = true;
        if (videoPublishEditModel.commentSetting == 0) {
            z = true;
        } else {
            z = false;
        }
        g5p.LIZJ = z;
        g5p.LJ = 0;
        if (C62623Ohv.LIZIZ.LJIILJJIL()) {
            i = R.string.cae;
        } else {
            i = R.string.tnf;
        }
        g5p.LJFF = i;
        g5p.LJIIJ = new ACListenerS33S0300000_7(commonSettingItemStatus, videoPublishEditModel, hashMap, 1);
        PrivacyUserSettingsV2 privacyUserSettings = a.LJIILIIL().getPrivacyUserSettings();
        if (privacyUserSettings == null || (M = privacyUserSettings.M("comment")) == null || M.intValue() != 3) {
            z2 = false;
        }
        g5p.LJIIJJI = z2;
        g5q.LIZ(g5p);
    }

    public static final void LJIJJLI(NLETrackMV nLETrackMV, String str, String str2, String str3, int i) {
        NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult = new NLEMVExternalAlgorithmResult();
        NLEResourceNode nLEResourceNode = new NLEResourceNode();
        nLEResourceNode.LJIIIZ(str);
        NLEEditorJniJNI.NLEMVExternalAlgorithmResult_setPhoto(nLEMVExternalAlgorithmResult.LIZ, nLEMVExternalAlgorithmResult, NLEResourceNode.LIZ(nLEResourceNode), nLEResourceNode);
        NLEEditorJniJNI.NLEMVExternalAlgorithmResult_setAlgorithmName(nLEMVExternalAlgorithmResult.LIZ, nLEMVExternalAlgorithmResult, str2);
        NLEResourceNode nLEResourceNode2 = new NLEResourceNode();
        nLEResourceNode2.LJIIIZ(str3);
        NLEEditorJniJNI.NLEMVExternalAlgorithmResult_setMask(nLEMVExternalAlgorithmResult.LIZ, nLEMVExternalAlgorithmResult, NLEResourceNode.LIZ(nLEResourceNode2), nLEResourceNode2);
        NLEEditorJniJNI.NLEMVExternalAlgorithmResult_setResultInType(nLEMVExternalAlgorithmResult.LIZ, nLEMVExternalAlgorithmResult, i);
        NLEEditorJniJNI.NLETrackMV_addMask(nLETrackMV.LIZJ, nLETrackMV, NLEMVExternalAlgorithmResult.LIZ(nLEMVExternalAlgorithmResult), nLEMVExternalAlgorithmResult);
    }
}
