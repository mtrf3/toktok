package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.smartmovie.jni.Meta;
import com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.bytedance.ies.smartmovie.jni.VecMeta;
import com.bytedance.ies.smartmovie.jni.VecStr;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HmF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45055HmF extends C45131HnT {
    public final /* synthetic */ C45054HmE LJFF;
    public final /* synthetic */ int LJI;
    public final /* synthetic */ C63A LJII;
    public final /* synthetic */ int LJIIIIZZ;
    public final /* synthetic */ String LJIIIZ;
    public final /* synthetic */ EnumC45070HmU LJIIJ;
    public final /* synthetic */ String LJIIJJI;
    public final /* synthetic */ String LJIIL;

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onCompressDone(VecMeta vecMeta) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCompressDone: ");
        if (vecMeta != null) {
            str = ORZ.LLD(vecMeta, null, null, null, C45066HmQ.LJLIL, 31);
        } else {
            str = null;
        }
        C45243HpH.LIZIZ(LIZ, str, LIZ);
        if (this.LJFF.LLJLIL().creativeModel.autoCutModel.mediaList.isEmpty() && vecMeta != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(vecMeta, 10));
            Iterator<Meta> it = vecMeta.iterator();
            while (it.hasNext()) {
                Meta next = it.next();
                String path = next.LIZLLL();
                int LJ = (int) next.LJ();
                int LIZJ = (int) next.LIZJ();
                long LIZIZ = next.LIZIZ();
                boolean LJFF = next.LJFF();
                o.LJIIIIZZ(path, "path");
                arrayList.add(new AutoCutMediaModel(path, null, LJ, LIZJ, LJFF, LIZIZ, 0L, 0L, 0.0f, null, 962, null));
            }
            this.LJFF.LLJLIL().creativeModel.autoCutModel.mediaList.addAll(arrayList);
        }
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onCompressProgress(float f) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditAutoCutComponent onCompressProgress progress: ");
        LIZ.append(f);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        this.LJFF.LLLL(this.LJI, this.LJII);
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onFetchProgress(float f) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditAutoCutComponent requestNLEModel onFetchProgress: progress = ");
        LIZ.append(f);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        this.LJFF.LLLL(this.LJI, this.LJII);
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onNeedFetch(VecStr vecStr) {
        C45054HmE c45054HmE = this.LJFF;
        int i = 0;
        c45054HmE.LLJJIJI = 0;
        if (vecStr != null) {
            i = vecStr.size();
        }
        c45054HmE.LLJJIII = i;
        this.LJFF.LLJ = System.currentTimeMillis();
    }

    @Override // X.C45131HnT
    public final void LIZ(NLEModel nLEModel, java.util.Map<String, String> map) {
        int i;
        int i2;
        NLEModel nLEModel2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditAutoCutComponent requestNLEModel onSuccess: ");
        LIZ.append(nLEModel);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        if (!this.LJFF.LLLL(this.LJI, this.LJII)) {
            return;
        }
        C45054HmE c45054HmE = this.LJFF;
        String str = null;
        c45054HmE.LLIILZL = null;
        C44716Hgm c44716Hgm = c45054HmE.LLIIJLIL;
        if (c44716Hgm != null) {
            c44716Hgm.LJII = nLEModel;
            Integer LJJIFFI = C45087Hml.LJJIFFI(map);
            if (LJJIFFI != null) {
                i = LJJIFFI.intValue();
            } else {
                i = this.LJIIIIZZ;
            }
            c44716Hgm.LIZJ = i;
        }
        C44716Hgm c44716Hgm2 = this.LJFF.LLIIJLIL;
        if (c44716Hgm2 != null) {
            String LJJI = C45087Hml.LJJI(map);
            if (LJJI == null) {
                LJJI = this.LJIIIZ;
            }
            c44716Hgm2.LJIIJJI = LJJI;
        }
        C44716Hgm c44716Hgm3 = this.LJFF.LLIIJLIL;
        if (c44716Hgm3 != null) {
            c44716Hgm3.LJI = C45087Hml.LJIILLIIL(nLEModel);
        }
        C45054HmE c45054HmE2 = this.LJFF;
        C44716Hgm c44716Hgm4 = c45054HmE2.LLIIJLIL;
        if (c44716Hgm4 != null && (nLEModel2 = c44716Hgm4.LJII) != null) {
            List<TextStickerData> LIZJ = C5V8.LIZJ(nLEModel2);
            C44716Hgm c44716Hgm5 = c45054HmE2.LLIIJLIL;
            if (c44716Hgm5 != null) {
                c44716Hgm5.LJIIJ = LIZJ;
            }
        }
        C45054HmE c45054HmE3 = this.LJFF;
        c45054HmE3.LLIILII = 1.0f;
        C6QQ.LIZ(new AqS157S0100000_7(c45054HmE3, 185));
        if (this.LJIIJ != EnumC45070HmU.TEMPLATE_CC) {
            C45054HmE c45054HmE4 = this.LJFF;
            String str2 = this.LJIIJJI;
            String str3 = this.LJIIL;
            C44716Hgm c44716Hgm6 = c45054HmE4.LLIIJLIL;
            if (c44716Hgm6 != null) {
                i2 = c44716Hgm6.LIZJ;
                str = c44716Hgm6.LJIIJJI;
            } else {
                i2 = -1;
            }
            c45054HmE4.LLLLJ(str2, str3, i2, str);
        }
        this.LJFF.LLLLLJLJLL();
        this.LJFF.LLLLZIL(this.LJI, this.LJII);
    }

    @Override // X.C45131HnT, com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onResponse(NLEModel nLEModel, UnorderedMapStrStr unorderedMapStrStr) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditAutoCutComponent requestNLEModel onResponse: ");
        LIZ.append(nLEModel);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        if (!this.LJFF.LLLL(this.LJI, this.LJII)) {
            return;
        }
        super.onResponse(nLEModel, unorderedMapStrStr);
    }

    @Override // X.C45131HnT
    public final void LIZIZ(int i, int i2, String str) {
        StringBuilder LIZJ = C06460Ne.LIZJ("EditAutoCutComponent requestNLEModel onTemplateFailure: ", i, ", ", i2, ", ");
        C45243HpH.LIZIZ(LIZJ, str, LIZJ);
        if (!this.LJFF.LLLL(this.LJI, this.LJII)) {
            return;
        }
        this.LJFF.LLLILZLLLI(i, str, i2);
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onFailure(String str, int i, String str2, UnorderedMapStrStr unorderedMapStrStr) {
        StringBuilder LJ = AnonymousClass028.LJ("EditAutoCutComponent requestNLEModel onFailure: urs=", str, ", ", i, ", ");
        LJ.append(str2);
        LJ.append(" extraParams=");
        LJ.append(unorderedMapStrStr);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LJ));
        if (!this.LJFF.LLLL(this.LJI, this.LJII)) {
            return;
        }
        if (i != SmartMovieErrorCode.FETCH_NLEMODEL_FAILURE.swigValue()) {
            C45054HmE.LLLJ(this.LJFF, i, str2, 0, 4, null);
            return;
        }
        C45049Hm9.LJIIL("source_switch", str, i, str2, unorderedMapStrStr);
        this.LJFF.LLJJIJI++;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45055HmF(C45054HmE c45054HmE, int i, C63A c63a, int i2, String str, EnumC45070HmU enumC45070HmU, String str2, String str3, C61878OQg c61878OQg) {
        super(c61878OQg);
        this.LJFF = c45054HmE;
        this.LJI = i;
        this.LJII = c63a;
        this.LJIIIIZZ = i2;
        this.LJIIIZ = str;
        this.LJIIJ = enumC45070HmU;
        this.LJIIJJI = str2;
        this.LJIIL = str3;
    }
}
