package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.services.audio.StsRequestModel;
import com.ss.android.ugc.aweme.services.audio.StsResponseModel;
import kotlin.jvm.internal.o;

/* renamed from: X.6gq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C166926gq {
    public final StsRequestModel LIZ;
    public final NLEModel LIZIZ;
    public final String LIZJ;
    public StsResponseModel LIZLLL;

    public C166926gq(NLEModel nLEModel, StsRequestModel requestParams) {
        o.LJIIIZ(requestParams, "requestParams");
        this.LIZ = requestParams;
        NLEModel LJFF = C122794rr.LJFF(nLEModel);
        this.LIZIZ = LJFF;
        this.LIZJ = C166726gW.LIZIZ(LJFF);
    }
}
