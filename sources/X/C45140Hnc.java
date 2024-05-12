package X;

import com.bytedance.ies.smartmovie.jni.CommonRequestCallback;
import com.bytedance.ies.smartmovie.jni.MusicRequestParams;
import com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode;
import com.bytedance.ies.smartmovie.jni.SmartMovieJniJNI;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.bytedance.ies.smartmovie.jni.VecMeta;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* renamed from: X.Hnc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45140Hnc extends AbstractC65781Prl implements InterfaceC88474Ynu<Integer, Integer, String, String, C76800UCe> {
    public final /* synthetic */ C45139Hnb LJLIL;
    public final /* synthetic */ MusicRequestParams LJLILLLLZI;
    public final /* synthetic */ C68322mC<Long> LJLJI;
    public final /* synthetic */ C10K<String> LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ CommonRequestCallback LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45140Hnc(C45139Hnb c45139Hnb, MusicRequestParams musicRequestParams, C68322mC<Long> c68322mC, C10K<String> c10k, boolean z, CommonRequestCallback commonRequestCallback) {
        super(4);
        this.LJLIL = c45139Hnb;
        this.LJLILLLLZI = musicRequestParams;
        this.LJLJI = c68322mC;
        this.LJLJJI = c10k;
        this.LJLJJL = z;
        this.LJLJJLL = commonRequestCallback;
    }

    @Override // X.InterfaceC88474Ynu
    public final C76800UCe invoke(Integer num, Integer num2, String str, String str2) {
        VecMeta vecMeta;
        String str3;
        int intValue = num.intValue();
        int intValue2 = num2.intValue();
        String errorMsg = str;
        o.LJIIIZ(errorMsg, "errorMsg");
        InterfaceC45141Hnd interfaceC45141Hnd = this.LJLIL.LIZLLL;
        if (interfaceC45141Hnd != null) {
            MusicRequestParams musicRequestParams = this.LJLILLLLZI;
            String str4 = null;
            if (musicRequestParams != null) {
                vecMeta = musicRequestParams.LIZIZ();
            } else {
                vecMeta = null;
            }
            MusicRequestParams musicRequestParams2 = this.LJLILLLLZI;
            if (musicRequestParams2 != null) {
                str3 = SmartMovieJniJNI.MusicRequestParams_getZipUri(musicRequestParams2.LIZ, musicRequestParams2);
            } else {
                str3 = null;
            }
            Long l = this.LJLJI.element;
            String LJIIJJI = this.LJLJJI.LJIIJJI();
            MusicRequestParams musicRequestParams3 = this.LJLILLLLZI;
            if (musicRequestParams3 != null) {
                str4 = (String) musicRequestParams3.LIZ().get("source");
            }
            interfaceC45141Hnd.LIZJ(vecMeta, false, intValue, intValue2, errorMsg, str3, l, LJIIJJI, str4, this.LJLJJL);
        }
        UnorderedMapStrStr unorderedMapStrStr = new UnorderedMapStrStr();
        if (e1.LIZ(31744, "autocut_success_rate_optimize_enable", true, false) && intValue == 5000 && (intValue2 == -199 || intValue2 == -106)) {
            unorderedMapStrStr.put("weak_net", "weak_net");
        }
        CommonRequestCallback commonRequestCallback = this.LJLJJLL;
        if (commonRequestCallback != null) {
            commonRequestCallback.onFailure(SmartMovieErrorCode.MUSIC_REQUEST_FAILURE.swigValue(), errorMsg, unorderedMapStrStr);
        }
        return C76800UCe.LIZ;
    }
}
