package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.smartmovie.jni.NLEModelRequestCallback;
import com.bytedance.ies.smartmovie.jni.NLEModelRequestParams;
import com.bytedance.ies.smartmovie.jni.SmartMovieJniJNI;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.bytedance.ies.smartmovie.jni.VecMeta;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.autocut.sdk.data.NLEModelResponse;
import com.ss.android.ugc.aweme.autocut.sdk.data.NLEModelResponseExtra;
import kotlin.jvm.internal.o;

/* renamed from: X.HnO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45126HnO extends AbstractC65781Prl implements InterfaceC88471Ynr<NLEModel, Long, C76800UCe> {
    public final /* synthetic */ m LJLIL;
    public final /* synthetic */ UnorderedMapStrStr LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ NLEModelRequestCallback LJLJJI;
    public final /* synthetic */ C45125HnN LJLJJL;
    public final /* synthetic */ NLEModelRequestParams LJLJJLL;
    public final /* synthetic */ NLEModelResponse LJLJL;
    public final /* synthetic */ C68322mC<String> LJLJLJ;
    public final /* synthetic */ NLEModel LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45126HnO(m mVar, UnorderedMapStrStr unorderedMapStrStr, String str, NLEModelRequestCallback nLEModelRequestCallback, C45125HnN c45125HnN, NLEModelRequestParams nLEModelRequestParams, NLEModelResponse nLEModelResponse, C68322mC<String> c68322mC, NLEModel nLEModel) {
        super(2);
        this.LJLIL = mVar;
        this.LJLILLLLZI = unorderedMapStrStr;
        this.LJLJI = str;
        this.LJLJJI = nLEModelRequestCallback;
        this.LJLJJL = c45125HnN;
        this.LJLJJLL = nLEModelRequestParams;
        this.LJLJL = nLEModelResponse;
        this.LJLJLJ = c68322mC;
        this.LJLJLLL = nLEModel;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(NLEModel nLEModel, Long l) {
        boolean z;
        String str;
        String str2;
        String str3;
        VecMeta vecMeta;
        String str4;
        NLEModel model = nLEModel;
        long longValue = l.longValue();
        o.LJIIIZ(model, "model");
        try {
            j LJJIJ = this.LJLIL.LJIIZILJ().LJJIJ("speed_variation_type");
            if (LJJIJ != null) {
                this.LJLJLLL.setExtra("autocut_speed_variation_type", String.valueOf(LJJIJ.LJIILJJIL()));
            }
        } catch (RuntimeException unused) {
        }
        this.LJLILLLLZI.put("text_sticker_duration", String.valueOf(longValue));
        this.LJLILLLLZI.put("comprehension_nle", this.LJLJI);
        NLEModelRequestCallback nLEModelRequestCallback = this.LJLJJI;
        if (nLEModelRequestCallback != null) {
            nLEModelRequestCallback.onSuccess(model, this.LJLILLLLZI);
        }
        String str5 = null;
        try {
            j LJJIJ2 = this.LJLIL.LJIIZILJ().LJJIJ("highlight_result");
            if (LJJIJ2 != null) {
                str4 = LJJIJ2.LJJIFFI();
            } else {
                str4 = null;
            }
            z = o.LJ("success", str4);
        } catch (C45128HnQ unused2) {
            z = false;
        }
        InterfaceC45141Hnd interfaceC45141Hnd = this.LJLJJL.LIZLLL;
        if (interfaceC45141Hnd != null) {
            NLEModelRequestParams nLEModelRequestParams = this.LJLJJLL;
            if (nLEModelRequestParams != null) {
                str = SmartMovieJniJNI.NLEModelRequestParams_getRecConfig(nLEModelRequestParams.LIZ, nLEModelRequestParams);
            } else {
                str = null;
            }
            NLEModelRequestParams nLEModelRequestParams2 = this.LJLJJLL;
            if (nLEModelRequestParams2 != null) {
                str2 = SmartMovieJniJNI.NLEModelRequestParams_getRecKey(nLEModelRequestParams2.LIZ, nLEModelRequestParams2);
            } else {
                str2 = null;
            }
            NLEModelResponseExtra nLEModelResponseExtra = this.LJLJL.extra;
            if (nLEModelResponseExtra != null) {
                str3 = nLEModelResponseExtra.logId;
            } else {
                str3 = null;
            }
            NLEModelRequestParams nLEModelRequestParams3 = this.LJLJJLL;
            if (nLEModelRequestParams3 != null) {
                long NLEModelRequestParams_getInputList = SmartMovieJniJNI.NLEModelRequestParams_getInputList(nLEModelRequestParams3.LIZ, nLEModelRequestParams3);
                if (NLEModelRequestParams_getInputList == 0) {
                    vecMeta = null;
                } else {
                    vecMeta = new VecMeta(NLEModelRequestParams_getInputList);
                }
            } else {
                vecMeta = null;
            }
            Boolean valueOf = Boolean.valueOf(z);
            String str6 = this.LJLJLJ.element;
            if (str6 == null) {
                NLEModelRequestParams nLEModelRequestParams4 = this.LJLJJLL;
                if (nLEModelRequestParams4 != null) {
                    str6 = (String) nLEModelRequestParams4.LIZ().get("autocut_template_type");
                } else {
                    str6 = null;
                }
            }
            NLEModelRequestParams nLEModelRequestParams5 = this.LJLJJLL;
            if (nLEModelRequestParams5 != null) {
                str5 = (String) nLEModelRequestParams5.LIZ().get("source");
            }
            C45142Hne.LIZIZ(interfaceC45141Hnd, true, 0, 0, null, str, str2, str3, null, vecMeta, valueOf, str6, str5, 142);
        }
        return C76800UCe.LIZ;
    }
}
