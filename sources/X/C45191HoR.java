package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEMediaPublicJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.smartmovie.jni.Meta;
import com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.bytedance.ies.smartmovie.jni.VecMeta;
import com.bytedance.ies.smartmovie.jni.VecStr;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HoR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45191HoR extends C45131HnT {
    public final /* synthetic */ boolean LJFF;
    public final /* synthetic */ InterfaceC45222How LJI;
    public final /* synthetic */ C45199HoZ LJII;
    public final /* synthetic */ EnumC45070HmU LJIIIIZZ;
    public final /* synthetic */ String LJIIIZ;
    public final /* synthetic */ String LJIIJ;
    public final /* synthetic */ String LJIIJJI;
    public final /* synthetic */ String LJIIL;
    public final /* synthetic */ int LJIILIIL;

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onCompressDone(VecMeta vecMeta) {
        String str;
        InterfaceC45222How interfaceC45222How;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutComponent requestNLEModel onCompressDone: ");
        if (vecMeta != null) {
            str = ORZ.LLD(vecMeta, null, null, null, C45194HoU.LJLIL, 31);
        } else {
            str = null;
        }
        C45243HpH.LIZIZ(LIZ, str, LIZ);
        InterfaceC45222How interfaceC45222How2 = this.LJI;
        if (interfaceC45222How2 != null) {
            interfaceC45222How2.LJIIJ("compress");
        }
        if (vecMeta != null && (interfaceC45222How = this.LJI) != null) {
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
            interfaceC45222How.LJIIJJI(arrayList);
        }
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onCompressProgress(float f) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutComponent requestNLEModel onCompressProgress progress: ");
        LIZ.append(f);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onFetchProgress(float f) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutComponent requestNLEModel onFetchProgress: progress = ");
        LIZ.append(f);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onNeedFetch(VecStr vecStr) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        Integer num = null;
        if (vecStr != null) {
            Iterator<String> it = vecStr.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                String next = it.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    String str = next;
                    if (i2 != 0) {
                        sb.append(",");
                    }
                    sb.append(str);
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutComponent ASYNC_RENDER: Necessary Count=");
        if (vecStr != null) {
            num = Integer.valueOf(vecStr.size());
        }
        LIZ.append(num);
        LIZ.append(" onNeedFetch effect: ");
        LIZ.append((Object) sb);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        this.LJII.LJZL = 0;
        if (this.LJIIIIZZ != EnumC45070HmU.TEMPLATE_CC) {
            InterfaceC45222How interfaceC45222How = this.LJI;
            if (interfaceC45222How != null) {
                if (vecStr != null) {
                    i = vecStr.size();
                }
                interfaceC45222How.LJIJ(i);
            }
            InterfaceC45222How interfaceC45222How2 = this.LJI;
            if (interfaceC45222How2 != null) {
                interfaceC45222How2.LJFF("download_effect");
            }
        }
    }

    @Override // X.C45131HnT
    public final void LIZ(NLEModel nLEModel, java.util.Map<String, String> map) {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        Integer valueOf;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutComponent requestNLEModel onSuccess: ");
        LIZ.append(nLEModel);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        this.LJII.LJZ = 1.0f;
        InterfaceC45222How interfaceC45222How = this.LJI;
        if (interfaceC45222How != null) {
            String str2 = this.LJIIIZ;
            String str3 = this.LJIIJ;
            String str4 = this.LJIIJJI;
            String LJJI = C45087Hml.LJJI(map);
            if (LJJI == null) {
                LJJI = this.LJIIL;
            }
            Integer LJJIFFI = C45087Hml.LJJIFFI(map);
            if (LJJIFFI != null) {
                i3 = LJJIFFI.intValue();
            } else {
                i3 = this.LJIILIIL;
            }
            if (map != null && (str = map.get("text_sticker_duration")) != null && (valueOf = Integer.valueOf(CastIntegerProtector.parseInt(str))) != null) {
                i4 = valueOf.intValue();
            } else {
                i4 = 0;
            }
            interfaceC45222How.LJ(str2, str3, i3, i4, str4, LJJI);
        }
        if (this.LJIIIIZZ != EnumC45070HmU.TEMPLATE_CC) {
            InterfaceC45222How interfaceC45222How2 = this.LJI;
            if (interfaceC45222How2 != null) {
                int i5 = this.LJII.LJZL;
                String str5 = this.LJIIIZ;
                String str6 = this.LJIIJJI;
                String LJJI2 = C45087Hml.LJJI(map);
                if (LJJI2 == null) {
                    LJJI2 = this.LJIIL;
                }
                Integer LJJIFFI2 = C45087Hml.LJJIFFI(map);
                if (LJJIFFI2 != null) {
                    i2 = LJJIFFI2.intValue();
                } else {
                    i2 = this.LJIILIIL;
                }
                interfaceC45222How2.LJIIL(i5, i2, str5, str6, LJJI2);
            }
            InterfaceC45222How interfaceC45222How3 = this.LJI;
            if (interfaceC45222How3 != null) {
                interfaceC45222How3.LJIIJ("download_effect");
            }
        }
        C45199HoZ c45199HoZ = this.LJII;
        c45199HoZ.LJLLJ = null;
        C44716Hgm c44716Hgm = c45199HoZ.LJLLL;
        if (c44716Hgm != null) {
            c44716Hgm.LJII = nLEModel;
            c44716Hgm.LJI = C45087Hml.LJIILLIIL(nLEModel);
        }
        C44716Hgm c44716Hgm2 = this.LJII.LJLLL;
        if (c44716Hgm2 != null) {
            Integer LJJIFFI3 = C45087Hml.LJJIFFI(map);
            if (LJJIFFI3 != null) {
                i = LJJIFFI3.intValue();
            } else {
                i = this.LJIILIIL;
            }
            c44716Hgm2.LIZJ = i;
        }
        C44716Hgm c44716Hgm3 = this.LJII.LJLLL;
        if (c44716Hgm3 != null) {
            c44716Hgm3.LJIIIZ = this.LJIIJJI;
            String LJJI3 = C45087Hml.LJJI(map);
            if (LJJI3 == null) {
                LJJI3 = this.LJIIL;
            }
            c44716Hgm3.LJIIJJI = LJJI3;
        }
        this.LJII.LLF(this.LJI);
    }

    @Override // X.C45131HnT, com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onResponse(NLEModel nLEModel, UnorderedMapStrStr unorderedMapStrStr) {
        super.onResponse(nLEModel, unorderedMapStrStr);
        if (this.LJFF) {
            NLEMediaPublicJniJNI.NLERenderResourceUtil_setNLEResourceNecessary(NLEModel.getCPtr(nLEModel), nLEModel, 128L, C00F.LIZ(31744, 0, "autocut_progressive_render_necessary_time", true));
        }
        InterfaceC45222How interfaceC45222How = this.LJI;
        if (interfaceC45222How != null) {
            interfaceC45222How.LIZ(nLEModel);
        }
        InterfaceC45222How interfaceC45222How2 = this.LJI;
        if (interfaceC45222How2 != null) {
            interfaceC45222How2.LJIIJ("nlemodel_request_success");
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutComponent requestNLEModel onResponse: ");
        LIZ.append(nLEModel);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
    }

    @Override // X.C45131HnT
    public final void LIZIZ(int i, int i2, String str) {
        C45199HoZ.LJLZ(this.LJII, i, Integer.valueOf(i2), str, null, 8, null);
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onFailure(String str, int i, String str2, UnorderedMapStrStr unorderedMapStrStr) {
        StringBuilder LIZ = C06830Op.LIZ("AutoCutComponent requestNLEModel onFailure: ", i, ", ", str2, ", extraParams=");
        LIZ.append(unorderedMapStrStr);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        if (i != SmartMovieErrorCode.FETCH_NLEMODEL_FAILURE.swigValue()) {
            C45199HoZ.LJLZ(this.LJII, i, null, str2, unorderedMapStrStr, 2, null);
            return;
        }
        this.LJII.LJZL++;
        C45049Hm9.LJIIL("source_auto_cut", str, i, str2, unorderedMapStrStr);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("AutoCutComponent ASYNC_RENDER: Necessary onFailure urs=");
        LIZ2.append(str);
        LIZ2.append(", code=");
        LIZ2.append(i);
        LIZ2.append(", msg=");
        C45243HpH.LIZIZ(LIZ2, str2, LIZ2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45191HoR(boolean z, InterfaceC45222How interfaceC45222How, C45199HoZ c45199HoZ, EnumC45070HmU enumC45070HmU, String str, String str2, String str3, String str4, int i, List<? extends InterfaceC45222How> list) {
        super(list);
        this.LJFF = z;
        this.LJI = interfaceC45222How;
        this.LJII = c45199HoZ;
        this.LJIIIIZZ = enumC45070HmU;
        this.LJIIIZ = str;
        this.LJIIJ = str2;
        this.LJIIJJI = str3;
        this.LJIIL = str4;
        this.LJIILIIL = i;
    }
}
