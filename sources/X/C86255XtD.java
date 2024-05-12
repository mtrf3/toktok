package X;

import android.app.Activity;
import android.net.ConnectivityManager;
import com.ss.bduploader.BDVideoInfo;
import com.ss.bduploader.BDVideoUploaderListener;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.XtD, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C86255XtD implements BDVideoUploaderListener {
    public final /* synthetic */ C86251Xt9 LIZ;

    @Override // com.ss.bduploader.BDVideoUploaderListener
    public final String getStringFromExtern(int i) {
        return "";
    }

    @Override // com.ss.bduploader.BDVideoUploaderListener
    public final void onLog(int i, int i2, String str) {
    }

    @Override // com.ss.bduploader.BDVideoUploaderListener
    public final void onUploadVideoStage(int i, long j) {
    }

    public C86255XtD(C86251Xt9 c86251Xt9) {
        this.LIZ = c86251Xt9;
    }

    @Override // com.ss.bduploader.BDVideoUploaderListener
    public final int videoUploadCheckNetState(int i, int i2) {
        if (this.LIZ.LJLIL.get() != null) {
            Activity activity = this.LIZ.LJLIL.get();
            o.LJII(activity, "null cannot be cast to non-null type android.app.Activity");
            Object LLILIL = C16880lQ.LLILIL(activity, "connectivity");
            o.LJII(LLILIL, "null cannot be cast to non-null type android.net.ConnectivityManager");
            if (C16880lQ.LJJLI((ConnectivityManager) LLILIL) != null) {
                return 1;
            }
            return 0;
        }
        return 0;
    }

    @Override // com.ss.bduploader.BDVideoUploaderListener
    public final void onNotify(int i, long j, BDVideoInfo bDVideoInfo) {
        String str;
        if (i != 0) {
            if (i != 2) {
                return;
            }
            this.LIZ.LIZJ(0, "uploadFailed");
            try {
                this.LIZ.LIZIZ().close();
                return;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return;
            }
        }
        try {
            C86251Xt9 c86251Xt9 = this.LIZ;
            if (!c86251Xt9.LJLJJL) {
                if (bDVideoInfo != null) {
                    String str2 = bDVideoInfo.mVideoId;
                    o.LJIIIIZZ(str2, "requireNotNull(info).mVideoId");
                    c86251Xt9.LIZLLL(3, str2);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                JSONObject jSONObject = new JSONObject();
                String str3 = null;
                if (bDVideoInfo != null) {
                    str = bDVideoInfo.mCoverUri;
                } else {
                    str = null;
                }
                jSONObject.put("posterUri", str);
                if (bDVideoInfo != null) {
                    str3 = bDVideoInfo.mVideoId;
                }
                jSONObject.put("vid", str3);
                if (bDVideoInfo != null) {
                    jSONObject.put("videoMeta", new JSONObject(bDVideoInfo.mVideoMediaInfo));
                    this.LIZ.LJLILLLLZI.LIZIZ(new JSONObject().put("videoInfo", jSONObject));
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            this.LIZ.LIZIZ().close();
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }
}
